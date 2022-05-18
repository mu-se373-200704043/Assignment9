package com.example.scanner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
/*import com.google.zxing.BarcodeFormat
import com.journeyapps.barcodescanner.BarcodeEncoder
import kotlinx.android.synthetic.main.activity_main.*
*/
class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button2 = findViewById<Button>(R.id.btn2)
        val text = "www.maltepe.edu.tr"

        button2.setOnClickListener {
            val intent= Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

       //val encoder = BarcodeEncoder()
       //val bitmap = encoder.encodeBitmap(text, BarcodeFormat.QR_CODE, 800, 800)
        val myImageView = findViewById<ImageView>(R.id.mImageView)
       //myImageView.setImageBitmap(bitmap)
    }
}
