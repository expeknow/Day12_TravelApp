package com.example.day12_travelapp


import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.day12_travelapp.adapter.ListAdapter
import com.example.day12_travelapp.databinding.ActivityMainBinding

//https://elements.envato.com/travel-booking-app-ios-android-ui-kit-template-BHQR2MT/preview
class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolBar = binding.topAppBar
        setSupportActionBar(toolBar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.back)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val adapter = ListAdapter(placesList, this@MainActivity)
        binding.placesList.adapter = adapter

        adapter.setOnClickListener(object : ListAdapter.OnClickListener {
            override fun onClick(place: SamplePlaceData, position: Int) {
                val intent = Intent(this@MainActivity, DetailsActivity::class.java)
                intent.putExtra("index", position)
                startActivity(intent)
            }

        })



    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate : MenuInflater = menuInflater
        inflate.inflate(R.menu.top_bar_menu, menu)
        return true
    }
}