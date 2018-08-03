package com.example.sandy.kotlin_broadcast_receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.TextView

class MyReceiver(var tview:TextView): BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        tview.text=intent!!.action
    }
}