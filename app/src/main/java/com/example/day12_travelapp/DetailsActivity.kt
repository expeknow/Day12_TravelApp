package com.example.day12_travelapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.day12_travelapp.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val index = intent.getIntExtra("index", 0)
        setUpScreen(index, binding)

        binding.llDetailsImageCard.clipToOutline = true
        binding.placeImageView.clipToOutline = true
        binding.backBtn.setOnClickListener {
            finish()
        }
    }

    @SuppressLint("SetTextI18n")
    fun setUpScreen(index: Int, binding: ActivityDetailsBinding) {

        val placeData = placesList[index]

        binding.placeDescription.text = placeData.placeDescription
        binding.placeImageView.setImageResource(placeData.imageId)
        val attractionName = "${placeData.attraction} in ${placeData.country}"
        binding.attractionName.text = attractionName
        binding.bookingPrice.text = "$${placeData.tripCost}"
        val totalFeaturedPerson = "Sofia, Barny + 13 more"
        binding.totalFeaturedPersonText.text = totalFeaturedPerson
        binding.featuredPersonProfile1.setImageResource(R.drawable.p1)
        binding.featuredPersonProfile2.setImageResource(R.drawable.p2)


    }
}