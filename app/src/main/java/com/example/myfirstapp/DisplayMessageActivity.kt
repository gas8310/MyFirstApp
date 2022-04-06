package com.example.myfirstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this activity and extract the string
        val messageDef = "hi"
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = messageDef + message

        }
    }

    /*2022-04-05 김대식 목록보기 버튼 클릭 함수*/
    fun moveMenuList(view: View) {
        val intent = Intent(this, activity_menuList::class.java).apply{}

        startActivity(intent)
    }
}