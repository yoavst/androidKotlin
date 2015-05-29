package com.yoavst.kotlin

/**
 * Created by Yoav.
 */
import android.content.Context
import android.content.Intent
import android.app.Activity
import android.app.Service
import android.os.Bundle


public fun Any?.flags(flag: Int, vararg flags: Int): Int {
    var orFlags = flag;
    for (i in flags) {
        orFlags = orFlags or i
    }
    return orFlags
}

inline public fun <reified T : Activity> Activity.startActivity() {
    this.startActivity(intent<T>())
}

inline public fun <reified T : Activity> Activity.startActivity(flags: Int) {
    this.startActivity(intent<T>(flags))
}

inline public fun <reified T: Activity> Activity.startActivity(extras: Bundle) {
    this.startActivity(intent<T>(extras))
}

inline public fun <reified T: Activity> Activity.startActivity(extras: Bundle, flags: Int) {
    this.startActivity(intent<T>(extras, flags))
}

inline public fun <reified T : Activity> Activity.startActivityForResult(requestCode: Int) {
    this.startActivityForResult(intent<T>(), requestCode)
}

inline public fun <reified T : Activity> Activity.startActivityForResult(
        requestCode: Int, flags: Int) {
    this.startActivityForResult(intent<T>(flags), requestCode)
}

inline public fun <reified T : Activity> Activity.startActivityForResult(
        extras: Bundle, requestCode: Int) {
    this.startActivityForResult(intent<T>(extras), requestCode)
}

inline public fun <reified T : Activity> Activity.startActivityForResult(
        extras: Bundle, requestCode: Int, flags: Int) {
    this.startActivityForResult(intent<T>(extras, flags), requestCode)
}

inline public fun <reified T : Activity> Service.startActivity() {
    this.startActivity(intent<T>(Intent.FLAG_ACTIVITY_NEW_TASK))
}

inline public fun <reified T : Activity> Service.startActivity(flags: Int) {
    this.startActivity(intent<T>(flags))
}

inline public fun <reified T: Activity> Service.startActivity(extras: Bundle) {
    this.startActivity(intent<T>(extras, Intent.FLAG_ACTIVITY_NEW_TASK))
}

inline public fun <reified T: Activity> Service.startActivity(extras: Bundle, flags: Int) {
    this.startActivity(intent<T>(extras, flags))
}

inline public fun <reified T: Service> Context.startService() {
    this.startService(intent<T>())
}

inline public fun <reified T: Service> Context.startService(flags: Int) {
    this.startService(intent<T>(flags))
}

inline public fun <reified T: Service> Context.startService(extras: Bundle) {
    this.startService(intent<T>(extras))
}

inline public fun <reified T: Service> Context.startService(extras: Bundle, flags: Int) {
    this.startService(intent<T>(extras, flags))
}

inline public fun <reified T: Context> Context.intent(): Intent {
    return Intent(this, javaClass<T>())
}

inline public fun <reified T: Context> Context.intent(flags: Int): Intent {
    val intent = intent<T>()
    intent.setFlags(flags)
    return intent
}

inline public fun <reified T: Context> Context.intent(extras: Bundle): Intent {
    return intent<T>(extras, 0)
}

inline public fun <reified T: Context> Context.intent(extras: Bundle, flags: Int): Intent {
    val intent = intent<T>(flags)
    intent.putExtras(extras)
    return intent
}