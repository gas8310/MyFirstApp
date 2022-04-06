package com.example.myfirstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

var pos = 0

class activity_menuList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_list)

        val LIST_MENU = arrayOf("우리집", "3번집", "4번집")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, LIST_MENU)

        val listview = findViewById(R.id.listview1) as ListView
        listview.setAdapter(adapter)

        /*listView 클릭 이벤트 함수*/
        listview.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>, v: View, position: Int, id: Long) {

                // get TextView's Text.
                pos = position
                val strText = parent.getItemAtPosition(pos) as String
                val toast = Toast.makeText(v.context, strText, Toast.LENGTH_SHORT)
                toast.show()
                //moveIceBoxList(v)
            }
        }
    }

    /*2022-04-06 김대식 냉장고 목록보기 버튼 클릭 함수*/
    fun moveIceBoxList(view: View) {
        //val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        //현재 activity에서 listview의 선택된포지션의 값을 가져와야함.
        val listview = findViewById(R.id.listview1) as ListView
        listview.getItemAtPosition(pos)

        val intent = Intent(this, activity_iceboxList::class.java).apply{}
        startActivity(intent)
    }
}