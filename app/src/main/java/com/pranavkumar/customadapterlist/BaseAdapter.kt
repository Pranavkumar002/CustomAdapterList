package com.pranavkumar.customadapterlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

        class BaseAdapterClass(var studentInfo: ArrayList<StudentInfo>, var clickInterface: ClickInterface) : BaseAdapter() {
    override fun getCount(): Int {
        return studentInfo.size
    }

    override fun getItem(p0: Int): Any {
        return studentInfo[p0]
    }

    override fun getItemId(p0: Int): Long {
        return (studentInfo[p0].id?:0).toLong()
    }


    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
        var initView = LayoutInflater.from(p2?.context).inflate(R.layout.layout, p2, false)
        var tvEnterid = initView.findViewById<TextView>(R.id.tvEnterid)
        var tvEntername = initView.findViewById<TextView>(R.id.tvEntername)
        var tvEnterphone = initView.findViewById<TextView>(R.id.tvEnterphone)
        tvEnterid.setText(studentInfo[position].id.toString())
        tvEntername.setText(studentInfo[position].name)
        tvEnterphone .setText(studentInfo[position].phone)

        initView.setOnClickListener { clickInterface.onClick(studentInfo[position]) }
        return initView
    }
}