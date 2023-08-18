package com.example.recyclerviewodev

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewodev.databinding.ItemAnimalsBinding

class AnimalAdapter(private val mContext: Context,private val animalsList: List<Animals>): RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {
    inner class AnimalViewHolder(val binding: ItemAnimalsBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalAdapter.AnimalViewHolder {
        val binding = ItemAnimalsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return AnimalViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AnimalAdapter.AnimalViewHolder, position: Int) {
        val animal = animalsList[position]
        val binding = holder.binding

        binding.textView2.text = animal.AnimalName

        val ImageId = mContext.resources.getIdentifier(animal.ImageId,"drawable",mContext.packageName)
        binding.imageView.setImageResource(ImageId)

    }

    override fun getItemCount(): Int {
       return animalsList.size
    }
}