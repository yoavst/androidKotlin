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

public fun Context.IntRes(intResId: Int): Int {
    return resources().getInteger(intResId)
}

public fun Context.DimenRes(dimenResId: Int): Int {
    return resources().getDimensionPixelSize(dimenResId)
}

public fun Context.StringArrayRes(arrayResId: Int): Array<String> {
    return resources().getStringArray(arrayResId)
}

public fun Context.IntArrayRes(arrayResId: Int): IntArray {
    return resources().getIntArray(arrayResId)
}

public fun Context.DrawableRes(drawableResId: Int): Drawable {
    return resources().getDrawable(drawableResId)
}

public fun Context.typefaceFromAssets(assetPathResId: Int): Typeface {
    return typefaceFromAssets(getString(assetPathResId))
}

public fun Context.typefaceFromAssets(assetPath: String): Typeface {
    return Typeface.createFromAsset(getAssets(), assetPath)
}

public fun Fragment.ColorRes(colorResId: Int): Int {
    return resources().getColor(colorResId)
}

public fun Fragment.IntRes(intResId: Int): Int {
    return resources().getInteger(intResId)
}

public fun Fragment.DimenRes(dimenResId: Int): Int {
    return resources().getDimensionPixelSize(dimenResId)
}

public fun Fragment.StringArrayRes(arrayResId: Int): Array<String> {
    return resources().getStringArray(arrayResId)
}

public fun Fragment.IntArrayRes(arrayResId: Int): IntArray {
    return resources().getIntArray(arrayResId)
}

public fun Fragment.DrawableRes(drawableResId: Int): Drawable {
    return resources().getDrawable(drawableResId)
}

public fun Fragment.typefaceFromAssets(assetPathResId: Int): Typeface {
    return typefaceFromAssets(getString(assetPathResId))
}

public fun Fragment.typefaceFromAssets(assetPath: String): Typeface {
    return Typeface.createFromAsset(getActivity().getAssets(), assetPath)
}

public fun SupportFragment.ColorRes(colorResId: Int): Int {
    return resources().getColor(colorResId)
}

public fun SupportFragment.IntRes(intResId: Int): Int {
    return resources().getInteger(intResId)
}

public fun SupportFragment.DimenRes(dimenResId: Int): Int {
    return resources().getDimensionPixelSize(dimenResId)
}

public fun SupportFragment.StringArrayRes(arrayResId: Int): Array<String> {
    return resources().getStringArray(arrayResId)
}

public fun SupportFragment.IntArrayRes(arrayResId: Int): IntArray {
    return resources().getIntArray(arrayResId)
}

public fun SupportFragment.DrawableRes(drawableResId: Int): Drawable {
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