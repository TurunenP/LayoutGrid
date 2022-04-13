package com.example.layoutgrid

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.layoutgrid.ui.Modeldata
import com.example.layoutgrid.ui.PhotoAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var  photoAdapter: PhotoAdapter
    private lateinit var recyclerView: RecyclerView
    private var dataList = mutableListOf<Modeldata>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = GridLayoutManager(applicationContext,2)
        photoAdapter = PhotoAdapter(applicationContext)
        recyclerView.adapter = photoAdapter

        dataList.add(Modeldata("Title","Desc",R.drawable.lunch))
        dataList.add(Modeldata("Title","Desc",R.drawable.lunch))
        dataList.add(Modeldata("Title","Desc",R.drawable.lunch))
        dataList.add(Modeldata("Title","Desc",R.drawable.lunch))
        dataList.add(Modeldata("Title","Desc",R.drawable.lunch))
        dataList.add(Modeldata("Title","Desc",R.drawable.lunch))

        photoAdapter.setDataList(dataList)
    }
}