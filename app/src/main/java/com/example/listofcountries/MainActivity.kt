package com.example.listofcountries

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ListView=findViewById<ListView>(R.id.List_view)
      //  val listView:ListView=findViewById(R.id.List_view)
        val majina= arrayOf("Kenya","Tanzania","Uganda","Ethopia","Rwanda","Burundi")
        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,majina)
        ListView.adapter=arrayAdapter

        ListView.setOnItemClickListener { adapterView, view, position,  l ->

            Toast.makeText(this,"You have clicked on " +majina[position],Toast.LENGTH_LONG).show()
        }
    }
}