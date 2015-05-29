package com.yoavst.kotlin

import android.os.Handler
import android.os.Message

public fun Handler.post(action: () -> Unit): Boolean = post(Runnable(action))
public fun Handler.postAtFrontOfQueue(action: () -> Unit): Boolean = postAtFrontOfQueue(Runnable(action))
public fun Handler.postAtTime(uptimeMillis: Long, action: () -> Unit): Boolean = postAtTime(Runnable(action), uptimeMillis)
public fun Handler.postDelayed(delayMillis: Long, action: () -> Unit): Boolean = postDelayed(Runnable(action), delayMillis)
public fun handler(handleMessage: (Message) -> Boolean): Handler {
    return android.os.Handler { p0 -> if (p0 == null) false else handleMessage(p0) }
}