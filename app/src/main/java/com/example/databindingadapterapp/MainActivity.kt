package com.example.databindingadapterapp

// https://www.youtube.com/watch?v=XfdaOpQ4UbI&list=PLRKyZvuMYSIO0jLgj8g6sADnD0IBaWaw2&index=9
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import androidx.databinding.DataBindingUtil
import com.example.databindingadapterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val postObject = Post("Pavan Sai.K","The Creator", "https://npr.brightspotcdn.com/dims4/default/0f6c110/2147483647/strip/true/crop/1885x1414+0+0/resize/880x660!/quality/90/?url=https%3A%2F%2Fmedia.npr.org%2Fassets%2Fimg%2F2022%2F05%2F31%2Fscreen-shot-2022-05-31-at-8.32.41-am-90976307d1d0c1408fd60a67e511f8e832db778c.png")
        binding.post = postObject
    }
}