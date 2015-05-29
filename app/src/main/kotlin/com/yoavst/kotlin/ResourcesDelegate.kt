package com.yoavst.kotlin

import android.content.res.Resources
import kotlin.properties.ReadOnlyProperty
import android.graphics.drawable.Drawable
import android.app.Fragment
import android.support.v4.app.Fragment as SupportFragment
import android.content.Context

public class StringResourceDelegate(private val resources: () -> Resources, private val id: Int) : ReadOnlyProperty<Any?, String> {
    private var value: String? = null
    public override fun get(thisRef: Any?, desc: PropertyMetadata): String {
        if (value == null) {
            value = resources().getString(id)
        }
        return value!!
    }
}

public class IntResourceDelegate(private val resources: () -> Resources, private val id: Int) : ReadOnlyProperty<Any?, Int> {
    private var value: Int? = null
    public override fun get(thisRef: Any?, desc: PropertyMetadata): Int {
        if (value == null) {
            value = resources().getInteger(id)
        }
        return value!!
    }
}

public class ColorResourceDelegate(private val resources: () -> Resources, private val id: Int) : ReadOnlyProperty<Any?, Int> {
    private var value: Int? = null
    public override fun get(thisRef: Any?, desc: PropertyMetadata): Int {
        if (value == null) {
            value = resources().getColor(id)
        }
        return value!!
    }
}

public class DimenResourceDelegate(private val resources: () -> Resources, private val id: Int) : ReadOnlyProperty<Any?, Int> {
    private var value: Int? = null
    public override fun get(thisRef: Any?, desc: PropertyMetadata): Int {
        if (value == null) {
            value = resources().getDimensionPixelSize(id)
        }
        return value!!
    }
}

public class StringArrayResourceDelegate(private val resources: () -> Resources, private val id: Int) : ReadOnlyProperty<Any?, Array<String>> {
    private var value: Array<String>? = null
    public override fun get(thisRef: Any?, desc: PropertyMetadata): Array<String> {
        if (value == null) {
            value = resources().getStringArray(id)
        }
        return value!!
    }
}

public class IntArrayResourceDelegate(private val resources: () -> Resources, private val id: Int) : ReadOnlyProperty<Any?,IntArray> {
    private var value: IntArray? = null
    public override fun get(thisRef: Any?, desc: PropertyMetadata): IntArray {
        if (value == null) {
            value = resources().getIntArray(id)
        }
        return value!!
    }
}

public class DrawableResourceDelegate(private val resources: () -> Resources, private val id: Int) : ReadOnlyProperty<Any?,Drawable> {
    private var value: Drawable? = null
    public override fun get(thisRef: Any?, desc: PropertyMetadata): Drawable {
        if (value == null) {
            value = resources().getDrawable(id)
        }
        return value!!
    }
}

public fun Context.stringResource(id: Int): StringResourceDelegate = StringResourceDelegate(futrueResources(), id)
public fun Fragment.stringResource(id: Int): StringResourceDelegate = StringResourceDelegate(futrueResources(), id)
public fun SupportFragment.stringResource(id: Int): StringResourceDelegate = StringResourceDelegate(futrueResources(), id)

public fun Context.intResource(id: Int): IntResourceDelegate = IntResourceDelegate(futrueResources(), id)
public fun Fragment.intResource(id: Int): IntResourceDelegate = IntResourceDelegate(futrueResources(), id)
public fun SupportFragment.intResource(id: Int): IntResourceDelegate = IntResourceDelegate(futrueResources(), id)

public fun Context.colorResource(id: Int): ColorResourceDelegate = ColorResourceDelegate(futrueResources(), id)
public fun Fragment.colorResource(id: Int): ColorResourceDelegate = ColorResourceDelegate(futrueResources(), id)
public fun SupportFragment.colorResource(id: Int): ColorResourceDelegate = ColorResourceDelegate(futrueResources(), id)

public fun Context.dimenResource(id: Int): DimenResourceDelegate = DimenResourceDelegate(futrueResources(), id)
public fun Fragment.dimenResource(id: Int): DimenResourceDelegate = DimenResourceDelegate(futrueResources(), id)
public fun SupportFragment.dimenResource(id: Int): DimenResourceDelegate = DimenResourceDelegate(futrueResources(), id)

public fun Context.stringArrayResource(id: Int): StringArrayResourceDelegate = StringArrayResourceDelegate(futrueResources(), id)
public fun Fragment.stringArrayResource(id: Int): StringArrayResourceDelegate = StringArrayResourceDelegate(futrueResources(), id)
public fun SupportFragment.stringArrayResource(id: Int): StringArrayResourceDelegate = StringArrayResourceDelegate(futrueResources(), id)

public fun Context.intArrayResource(id: Int): IntArrayResourceDelegate = IntArrayResourceDelegate(futrueResources(), id)
public fun Fragment.intArrayResource(id: Int): IntArrayResourceDelegate = IntArrayResourceDelegate(futrueResources(), id)
public fun SupportFragment.intArrayResource(id: Int): IntArrayResourceDelegate = IntArrayResourceDelegate(futrueResources(), id)

public fun Context.drawableResource(id: Int): DrawableResourceDelegate = DrawableResourceDelegate(futrueResources(), id)
public fun Fragment.drawableResource(id: Int): DrawableResourceDelegate = DrawableResourceDelegate(futrueResources(), id)
public fun SupportFragment.drawableResource(id: Int): DrawableResourceDelegate = DrawableResourceDelegate(futrueResources(), id)

/*
 * -----------------------------------------------------------------------------
 *  Private methods
 * -----------------------------------------------------------------------------
 */
private fun Context.futrueResources(): () -> Resources = { getResources() }

private fun Fragment.futrueResources(): () -> Resources = { getResources() }

private fun SupportFragment.futrueResources(): () -> Resources = { getResources() }