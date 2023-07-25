package com.example.mainprojecttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.subprojecttest1.SubModuleMainActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initLogic()
    }

    private fun initLogic() {
        var tv1 = findViewById<View>(R.id.tv1)
        tv1.setOnClickListener {
            var intent = Intent(this, SubModuleMainActivity::class.java)
            startActivity(intent)
        }
    }
}