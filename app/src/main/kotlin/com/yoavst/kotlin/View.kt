package com.yoavst.kotlin

import android.view.View
import android.app.Activity
import android.app.Fragment
import android.support.v4.app.Fragment as SupportFragment

public fun View.findView<T : View>(id: Int): T? = findViewById(id) as? T
public fun View.show(): Unit = setVisibility(View.VISIBLE)
public fun View.hide(): Unit = setVisibility(View.GONE)
public fun View.toggleVisibility(): Unit = if (getVisibility() == View.VISIBLE) hide() else show()

fun Activity.viewById<k : View>(id: Int): k {
    val view = findViewById(id)
    if (view == null)
        throw IllegalArgumentException("Given ID could not be found in current layout!")
    return view as k
}

fun Fragment.viewById<k : View>(id: Int): k {
    val view = getView().findViewById(id)
    if (view == null)
        throw IllegalArgumentException("Given ID could not be found in current layout!")
    return view as k
}

fun SupportFragment.viewById<k : View>(id: Int): k {
    val view = getView().findViewById(id)
    if (view == null)
        throw IllegalArgumentException("Given ID could not be found in current layout!")
    return view as k
}

fun Activity.optionalViewById<k : View>(id: Int): k? {
    val view = findViewById(id)
    if (view == null)
        return null
    return view as? k
}

fun Fragment.optionalViewById<k : View>(id: Int): k? {
    val view = getView()?.findViewById(id)
    if (view == null)
        return null
    return view as? k
}

fun SupportFragment.optionalViewById<k : View>(id: Int): k? {
    val view = getView()?.findViewById(id)
    if (view == null)
        return null
    return view as? k
}