package com.yoavst.kotlin

import android.os.Looper
import android.os.Handler
import java.util.concurrent.ExecutorService
import java.util.concurrent.Future

private val uiHandler = Handler(Looper.getMainLooper())

/**
 * Executes the provided code immediately on the UI Thread
 *
 */
public fun Any?.mainThread(runnable: () -> Unit) {
    uiHandler.post(runnable)
}

/**
 * Executes the provided code immediately on a background thread
 *
 */
public fun Any?.async(runnable: () -> Unit) {
    Thread(runnable).start()
}

/**
 * Executes the provided code immediately on a background thread that will be submitted to the
 * provided ExecutorService
 *
 * @param onBackgroundJob Interface that wraps the code to execute
 * @param executor        Will queue the provided code
 */
public fun Any?.async(runnable: () -> Unit, executor: ExecutorService): Future<out Any?> {
    return executor.submit(runnable)
}
