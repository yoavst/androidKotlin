package com.yoavst.kotlin

/**
 * Created by Yoav.
 */
import android.content.Context
import android.content.res.Resources
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.app.Fragment
import android.support.v4.app.Fragment as SupportFragment


public fun Context.colorRes(colorResId: Int): Int {
    return resources().getColor(colorResId)
}

public fun Context.intRes(intResId: Int): Int {
    return resources().getInteger(intResId)
}

public fun Context.dimenRes(dimenResId: Int): Int {
    return resources().getDimensionPixelSize(dimenResId)
}

public fun Context.stringArrayRes(arrayResId: Int): Array<String> {
    return resources().getStringArray(arrayResId)
}

public fun Context.intArrayRes(arrayResId: Int): IntArray {
    return resources().getIntArray(arrayResId)
}

public fun Context.drawableRes(drawableResId: Int): Drawable {
    return resources().getDrawable(drawableResId)
}

public fun Context.typefaceFromAssets(assetPathResId: Int): Typeface {
    return typefaceFromAssets(getString(assetPathResId))
}

public fun Context.typefaceFromAssets(assetPath: String): Typeface {
    return Typeface.createFromAsset(getAssets(), assetPath)
}

public fun Fragment.colorRes(colorResId: Int): Int {
    return resources().getColor(colorResId)
}

public fun Fragment.intRes(intResId: Int): Int {
    return resources().getInteger(intResId)
}

public fun Fragment.dimenRes(dimenResId: Int): Int {
    return resources().getDimensionPixelSize(dimenResId)
}

public fun Fragment.stringArrayRes(arrayResId: Int): Array<String> {
    return resources().getStringArray(arrayResId)
}

public fun Fragment.intArrayRes(arrayResId: Int): IntArray {
    return resources().getIntArray(arrayResId)
}

public fun Fragment.drawableRes(drawableResId: Int): Drawable {
    return resources().getDrawable(drawableResId)
}

public fun Fragment.typefaceFromAssets(assetPathResId: Int): Typeface {
    return typefaceFromAssets(getString(assetPathResId))
}

public fun Fragment.typefaceFromAssets(assetPath: String): Typeface {
    return Typeface.createFromAsset(getActivity().getAssets(), assetPath)
}

public fun SupportFragment.colorRes(colorResId: Int): Int {
    return resources().getColor(colorResId)
}

public fun SupportFragment.intRes(intResId: Int): Int {
    return resources().getInteger(intResId)
}

public fun SupportFragment.dimenRes(dimenResId: Int): Int {
    return resources().getDimensionPixelSize(dimenResId)
}

public fun SupportFragment.stringArrayRes(arrayResId: Int): Array<String> {
    return resources().getStringArray(arrayResId)
}

public fun SupportFragment.intArrayRes(arrayResId: Int): IntArray {
    return resources().getIntArray(arrayResId)
}

public fun SupportFragment.drawableRes(drawableResId: Int): Drawable {
    return resources().getDrawable(drawableResId)
}

public fun SupportFragment.typefaceFromAssets(assetPathResId: Int): Typeface {
    return typefaceFromAssets(getString(assetPathResId))
}

public fun SupportFragment.typefaceFromAssets(assetPath: String): Typeface {
    return Typeface.createFromAsset(getActivity().getAssets(), assetPath)
}

/*
 * -----------------------------------------------------------------------------
 *  Private methods
 * -----------------------------------------------------------------------------
 */
private fun Context.resources(): Resources {
    return this.getResources()
}

private fun Fragment.resources(): Resources {
    return this.getResources()
}

private fun SupportFragment.resources(): Resources {
    return this.getResources()
}