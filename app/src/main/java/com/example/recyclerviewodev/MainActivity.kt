package com.example.recyclerviewodev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recyclerviewodev.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  animalList: ArrayList<Animals>
    private lateinit var adapter: AnimalAdapter
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.HORIZONTAL)

        val a1 = Animals("kitten","KEDİ")
        val a2 = Animals("puppy","KÖPEK")
        val a3 = Animals("goat","KEÇİ")
        val a4 = Animals("panda","PANDA")
        val a5 = Animals("elephant","FİL")
        val a6 = Animals("cow","İNEK")

        animalList = ArrayList<Animals>()
        animalList.add(a1)
        animalList.add(a2)
        animalList.add(a3)
        animalList.add(a4)
        animalList.add(a5)
        animalList.add(a6)
        adapter = AnimalAdapter(this,animalList)
        binding.rv.adapter = adapter


    }
}