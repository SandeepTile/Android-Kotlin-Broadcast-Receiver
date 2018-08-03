package com.example.sandy.kotlin_broadcast_receiver

import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var textview:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textview=tview

        var iFilter=IntentFilter()
        iFilter.addAction(Intent.ACTION_POWER_CONNECTED)
        iFilter.addAction(Intent.ACTION_POWER_DISCONNECTED)
        iFilter.addAction(Intent.ACTION_HEADSET_PLUG)
        iFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        iFilter.addAction(Intent.ACTION_SCREEN_ON)
        iFilter.addAction(Intent.ACTION_SCREEN_OFF)
        registerReceiver(MyReceiver(textview!!),iFilter)


    }

}
