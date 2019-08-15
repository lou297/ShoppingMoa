package com.pingpong.moamoa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView() {
        tabLayout_main.addTab(tabLayout_main.newTab().setText("전체"))
        tabLayout_main.addTab(tabLayout_main.newTab().setText("고민 중"))
        tabLayout_main.addTab(tabLayout_main.newTab().setText("구매 완료"))
    }
}
