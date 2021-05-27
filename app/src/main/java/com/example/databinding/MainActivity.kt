package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private val listAdapter : RecyclerViewAdapter by lazy {
        RecyclerViewAdapter(layoutInflater, list)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.adapter = listAdapter

    }

    private val list : ArrayList<String> = ArrayList<String>().apply {
        for (i in 1..20)
            add("Number  : $i")
    }
}