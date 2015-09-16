package com.yoavst.kotlin

import android.os.Build

public fun beforeMarshmallow(): Boolean = isOlderVersionThen(21)
public fun beforeLollipop(): Boolean = isOlderVersionThen(21)
public fun lollipopOrNewer(): Boolean = isOnVersionOrNewer(21)
public fun beforeKitkat(): Boolean = isOlderVersionThen(19)
public fun kitkatOrNewer(): Boolean = isOnVersionOrNewer(19)
public fun beforeIcs(): Boolean = isOlderVersionThen(14)
public fun icsOrNewer(): Boolean = isOnVersionOrNewer(14)
public fun beforeVersion(version: Int): Boolean = isOlderVersionThen(version)
public fun versionOrNewer(version: Int): Boolean = isOnVersionOrNewer(version)
public fun currentVersion(): Int = Build.VERSION.SDK_INT

/*
 * -----------------------------------------------------------------------------
 *  Private methods
 * -----------------------------------------------------------------------------
 */
fun isOlderVersionThen(version: Int) = Build.VERSION.SDK_INT < version

fun isOnVersionOrNewer(version: Int) = Build.VERSION.SDK_INT >= version
