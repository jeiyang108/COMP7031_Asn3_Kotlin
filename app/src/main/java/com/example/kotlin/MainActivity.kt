package com.example.kotlin
import androidx.appcompat.app.AppCompatActivity import android.os.Bundle
import android.view.View import android.widget.ImageView
class MainActivity : AppCompatActivity() {
    val images = listOf(R.drawable.i2, R.drawable.i1, R.drawable.i3, R.drawable.i4)
    var currentImage = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun updateImage() {
        val iv = findViewById<ImageView>(R.id.imageView)
        iv.setImageResource(images[currentImage])
    }
    public fun goLeft(v: View){
        if(currentImage > 0){
            currentImage -= 1
        } else {
            currentImage = images.size - 1
        }
        updateImage()
    }
    public fun goRight(v : View){
        if(currentImage < images.size - 1){
            currentImage += 1
        }
        else {
            currentImage = 0
        }
        updateImage ()
    }
}