package com.example.camazotz

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.camazotz.ThirdScreen

class SecondScreen : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_page)
        val image = findViewById<ImageView>(R.id.imageView)
        val image2 = findViewById<ImageView>(R.id.imageView2)
        val image3 = findViewById<ImageView>(R.id.imageView4)
        val image4 = findViewById<ImageView>(R.id.imageView5)
        val image5 = findViewById<ImageView>(R.id.imageView6)
        val image6 = findViewById<ImageView>(R.id.imageView7)
        val image7 = findViewById<ImageView>(R.id.imageView8)
        val image8 = findViewById<ImageView>(R.id.imageView9)
        val image9 = findViewById<ImageView>(R.id.imageView10)

        image.setOnClickListener {
            openBook(
                1,
                "Food",
                100,
                R.drawable.img
            )
        }

        image2.setOnClickListener {
            openBook(
                2,
                "Food",
                100,
                R.drawable.img
            )
        }

        image3.setOnClickListener {
            openBook(
                3,
                "Food", 100,
                R.drawable.img
            )
        }
        image4.setOnClickListener {
            openBook(
                4,
                "Food",
                100,
                R.drawable.img
            )
        }

        image5.setOnClickListener {
            openBook(
                5,
                "Food",
                100,
                R.drawable.img
            )
        }

        image6.setOnClickListener {
            openBook(
                6,
                "food",
                100,
                R.drawable.img
            )
        }

        image7.setOnClickListener {
            openBook(
                7,
                "food",
                100,
                R.drawable.img
            )
        }

        image8.setOnClickListener {
            openBook(
                8,
                "food",
                100,
                R.drawable.img
            )
        }
        image9.setOnClickListener {
            openBook(
                9,
                "food",
                100,
                R.drawable.img
            )
        }
    }




    fun openBook(id: Int, name: String, price: Int, image: Int) {
        val intent = Intent(this, ThirdScreen ::class.java)
        intent.putExtra("ID", id)
        intent.putExtra("NAME", name)
        intent.putExtra("Price", price)
        intent.putExtra("IMAGE", image)
        startActivity(intent)
    }


}






