package com.example.jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.jetpack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Activity 中使用Data Binding 两种方式:

        // 第一中方式
        // val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        // 第二种方式
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.user = User("si", "li")

        // Fragment ListView RecyclerView 中使用Data Binding的方式
        // val listItemBinding = ListItemBinding.inflate(layoutInflater, viewGroup, false)
        // 或者
        // val listItemBinding = DataBindingUtil.inflate(layoutInflater, R.layout.list_item, viewGroup, false)
    }
}
