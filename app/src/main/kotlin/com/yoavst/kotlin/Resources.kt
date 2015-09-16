package com.yoavst.kotlin

/**
 * Created by Yoav.
 */
import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.util.DisplayMetrics
import android.util.TypedValue
import android.support.v4.app.Fragment as SupportFragment


public fun Context.colorRes(colorResId: Int): Int {
    if (beforeLollipop())
        return resources.getColor(colorResId)
    else return resources.getColor(colorResId, theme)
}

public fun Context.intRes(intResId: Int): Int {
    return resources.getInteger(intResId)
}

public fun Context.dimenRes(dimenResId: Int): Int {
    return resources.getDimensionPixelSize(dimenResId)
}

public fun Context.stringArrayRes(arrayResId: Int): Array<String> {
    return resources.getStringArray(arrayResId)
}

public fun Context.intArrayRes(arrayResId: Int): IntArray {
    return resources.getIntArray(arrayResId)
}

public fun Context.drawableRes(drawableResId: Int): Drawable {
    if (beforeLollipop())
        return resources.getDrawable(drawableResId)
    else return resources.getDrawable(drawableResId, theme)
}

public fun Context.typefaceFromAssets(assetPathResId: Int): Typeface {
    return typefaceFromAssets(getString(assetPathResId))
}

public fun Context.typefaceFromAssets(assetPath: String): Typeface {
    return Typeface.createFromAsset(assets, assetPath)
}

public fun Fragment.colorRes(colorResId: Int): Int {
    if (beforeLollipop())
        return resources.getColor(colorResId)
    else return resources.getColor(colorResId, activity.theme)
}

public fun Fragment.intRes(intResId: Int): Int {
    return resources.getInteger(intResId)
}

public fun Fragment.dimenRes(dimenResId: Int): Int {
    return resources.getDimensionPixelSize(dimenResId)
}

public fun Fragment.stringArrayRes(arrayResId: Int): Array<String> {
    return resources.getStringArray(arrayResId)
}

public fun Fragment.intArrayRes(arrayResId: Int): IntArray {
    return resources.getIntArray(arrayResId)
}

public fun Fragment.drawableRes(drawableResId: Int): Drawable {
    if (beforeLollipop())
        return resources.getDrawable(drawableResId)
    else return resources.getDrawable(drawableResId, activity.theme)
}

public fun Fragment.typefaceFromAssets(assetPathResId: Int): Typeface {
    return typefaceFromAssets(getString(assetPathResId))
}

public fun Fragment.typefaceFromAssets(assetPath: String): Typeface {
    return Typeface.createFromAsset(activity.assets, assetPath)
}

public fun SupportFragment.colorRes(colorResId: Int): Int {
    if (beforeLollipop())
        return resources.getColor(colorResId)
    else return resources.getColor(colorResId, activity.theme)
}

public fun SupportFragment.intRes(intResId: Int): Int {
    return resources.getInteger(intResId)
}

public fun SupportFragment.dimenRes(dimenResId: Int): Int {
    return resources.getDimensionPixelSize(dimenResId)
}

public fun SupportFragment.stringArrayRes(arrayResId: Int): Array<String> {
    return resources.getStringArray(arrayResId)
}

public fun SupportFragment.intArrayRes(arrayResId: Int): IntArray {
    return resources.getIntArray(arrayResId)
}

public fun SupportFragment.drawableRes(drawableResId: Int): Drawable {
    if (beforeLollipop())
        return resources.getDrawable(drawableResId)
    else return resources.getDrawable(drawableResId, activity.theme)
}

public fun SupportFragment.typefaceFromAssets(assetPathResId: Int): Typeface {
    return typefaceFromAssets(getString(assetPathResId))
}

public fun SupportFragment.typefaceFromAssets(assetPath: String): Typeface {
    return Typeface.createFromAsset(activity.assets, assetPath)
}

public fun Int.toPx(context: Context): Int = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, this.toFloat(), context.resources.displayMetrics).toInt()
public fun Float.toPx(context: Context): Float = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, this, context.resources.displayMetrics)

public fun Int.toDp(activity: Activity): Int {
    val metrics = DisplayMetrics()
    activity.windowManager.defaultDisplay.getMetrics(metrics)
    return Math.ceil((this / metrics.density).toDouble()).toInt()
}

public fun Float.toDp(activity: Activity): Float {
    val metrics = DisplayMetrics()
    activity.windowManager.defaultDisplay.getMetrics(metrics)
    return Math.ceil((this / metrics.density).toDouble()).toFloat()
}

