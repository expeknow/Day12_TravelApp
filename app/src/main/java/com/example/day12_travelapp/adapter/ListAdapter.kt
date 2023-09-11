package com.example.day12_travelapp.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.day12_travelapp.SamplePlaceData
import com.example.day12_travelapp.databinding.PlacesListItemviewBinding

class ListAdapter(private val placesList : List<SamplePlaceData>, private val context: Context)
    : RecyclerView.Adapter<ListAdapter.ViewHolder>(){

    private var onClickListener: OnClickListener? = null

    class ViewHolder(binding: PlacesListItemviewBinding) : RecyclerView.ViewHolder(binding.root){
        val placeName = binding.listPlaceName
        val countryName = binding.listCountryName
        val image = binding.listFeaturedImage
        val textContainer = binding.llPlaceNameContainer
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(PlacesListItemviewBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ))
    }

    override fun getItemCount(): Int {
        return placesList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val place = placesList[position]
        holder.image.setImageResource(place.imageId)
        holder.countryName.text = place.country
        holder.placeName.text = place.placeName+","

        holder.image.setOnClickListener {
            if(onClickListener != null) {
                onClickListener?.onClick(place, position)
            }
        }
        holder.textContainer.setOnClickListener {
            if(onClickListener != null) {
                onClickListener?.onClick(place, position)
            }
        }



    }

    fun setOnClickListener(onClickListener: OnClickListener){
        this.onClickListener = onClickListener
    }

    interface OnClickListener{
        fun onClick(place : SamplePlaceData, position: Int)
    }

}