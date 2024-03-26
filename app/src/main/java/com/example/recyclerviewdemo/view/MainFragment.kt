package com.example.recyclerviewdemo.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewdemo.adapters.RecyclerViewAdapter
import com.example.recyclerviewdemo.databinding.FragmentMainBinding
import com.example.recyclerviewdemo.model.Demo

class MainFragment : Fragment() {
    private lateinit var binding : FragmentMainBinding
    private lateinit var adapter : RecyclerViewAdapter
    private val demoList = mutableListOf<Demo>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
      demoList.add(Demo("Title", "Description", ""))
      demoList.add(Demo("Title", "Description", ""))
      demoList.add(Demo("Title", "Description", ""))
      demoList.add(Demo("Title", "Description", ""))
      demoList.add(Demo("Title", "Description", ""))
      demoList.add(Demo("Title", "Description", ""))

        adapter = RecyclerViewAdapter(demoList)
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = adapter
    }
}
