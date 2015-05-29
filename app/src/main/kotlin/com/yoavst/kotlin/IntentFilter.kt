package com.yoavst.kotlin

import android.content.IntentFilter

public inline fun intentFilter(body: IntentFilter.() -> Unit): IntentFilter {
    val intentFilter = IntentFilter()
    intentFilter.body()
    return intentFilter
}
