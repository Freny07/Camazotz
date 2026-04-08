package com.cplover.team_krantikari_camazotz

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnLog = findViewById<Button>(R.id.btnLog)
        val btnCont = findViewById<Button>(R.id.btnCont);
        val username = findViewById<TextInputEditText>(R.id.pass)
        btnLog.setOnClickListener {
            finish()
        }
        btnCont.setOnClickListener() {
            val u = username.text.toString()
            val dur = Toast.LENGTH_LONG
            intent.putExtra("Username",u)

            val toast = Toast.makeText(this , "Welcome User : Password=${u}" , dur).show()
            val intent = Intent(this , MainActivity2::class.java)
            val user = username.text.toString()
            intent.putExtra("Username",user)
            startActivity(intent)
        }
        val txt = "Welcome"
        val dur = Toast.LENGTH_LONG

        val toast = Toast.makeText(this , txt , dur)
        toast.show()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) {
                view, windowInsets ->
            val insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(insets.left, insets.top, insets.right, insets.bottom)
            windowInsets
        }
    }
}