package com.pranavkumar.customadapterlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pranavkumar.customadapterlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapterClass: BaseAdapterClass
    var studentInfo: ArrayList<StudentInfo> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        studentInfo.add(StudentInfo(1,"Pranav","0123456987"))
        studentInfo.add(StudentInfo(2,"Subal","01234655587"))
        studentInfo.add(StudentInfo(3,"Ayush","012345852987"))
        adapterClass = BaseAdapterClass(studentInfo)
        binding.Listview.adapter =adapterClass
    }
}