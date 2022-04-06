package com.example.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class activity_menuList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menulist)

        val LIST_MENU = arrayOf("우리집", "3번집", "4번집")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, LIST_MENU)

        val listview = findViewById(R.id.listview1) as ListView
        listview.setAdapter(adapter)

        /*listView 클릭 이벤트 함수*/
        listview.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>, v: View, position: Int, id: Long) {

                // get TextView's Text.
                val strText = parent.getItemAtPosition(position) as String
            }
        }
    }
}