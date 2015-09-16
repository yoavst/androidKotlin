package com.yoavst.kotlin

import android.os.Bundle
import android.os.Parcelable
import java.io.Serializable

public fun bundleOf(vararg params: Pair<String, Any>): Bundle {
    val b = Bundle()
    for (p in params) {
        val (k, v) = p
        when (v) {
            is Boolean -> b.putBoolean(k, v)
            is Byte -> b.putByte(k, v)
            is Char -> b.putChar(k, v)
            is Short -> b.putShort(k, v)
            is Int -> b.putInt(k, v)
            is Long -> b.putLong(k, v)
            is Float -> b.putFloat(k, v)
            is Double -> b.putDouble(k, v)
            is String -> b.putString(k, v)
            is CharSequence -> b.putCharSequence(k, v)
            is Parcelable -> b.putParcelable(k, v)
            is Serializable -> b.putSerializable(k, v)
            is BooleanArray -> b.putBooleanArray(k, v)
            is ByteArray -> b.putByteArray(k, v)
            is CharArray -> b.putCharArray(k, v)
            is DoubleArray -> b.putDoubleArray(k, v)
            is FloatArray -> b.putFloatArray(k, v)
            is IntArray -> b.putIntArray(k, v)
            is LongArray -> b.putLongArray(k, v)
            is Array<Parcelable> -> b.putParcelableArray(k, v)
            is ShortArray -> b.putShortArray(k, v)
            is Array<CharSequence> -> b.putCharSequenceArray(k, v)
            is Array<String> -> b.putStringArray(k, v)
            is Bundle -> b.putBundle(k, v)
            else -> throw IllegalArgumentException("Unsupported bundle component (${v.javaClass})")
        }
    }
    return b
}

