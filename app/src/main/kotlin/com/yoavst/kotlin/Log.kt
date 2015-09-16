package com.yoavst.kotlin

import android.util.Log


public fun v(tag: String, message: String) {
    Log.v(tag, message)
}

public fun d(tag: String, message: String) {
    Log.d(tag, message)
}

public fun i(tag: String, message: String) {
    Log.i(tag, message)
}

public fun w(tag: String, message: String) {
    Log.w(tag, message)
}

public fun e(tag: String, message: String) {
    Log.e(tag, message)
}

public fun wtf(tag: String, message: String) {
    Log.wtf(tag, message)
}

public fun Any.v(message: String) {
    Log.v(this.javaClass.name, message)
}

public fun Any.d(message: String) {
    Log.d(this.javaClass.name, message)
}

public fun Any.i(message: String) {
    Log.i(this.javaClass.name, message)
}

public fun Any.w(message: String) {
    Log.w(this.javaClass.name, message)
}

public fun Any.e(message: String) {
    Log.e(this.javaClass.name, message)
}

public fun Any.wtf(message: String) {
    Log.wtf(this.javaClass.name, message)
}