package com.yoavst.kotlin

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

public fun broadcastReceiver(init: (Context, Intent?) -> Unit): BroadcastReceiver {
    return object : BroadcastReceiver() {
        public override fun onReceive(context: Context, intent: Intent?) {
            init(context, intent)
        }
    }
}