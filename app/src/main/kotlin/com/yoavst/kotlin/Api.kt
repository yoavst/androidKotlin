package com.yoavst.kotlin

import android.os.Build

public fun Any?.beforeLollipop(): Boolean = isOlderVersionThen(21)
public fun Any?.lollipopOrNewer(): Boolean = isOnVersionOrNewer(21)
public fun Any?.beforeKitkat(): Boolean = isOlderVersionThen(19)
public fun Any?.KitkatOrNewer(): Boolean = isOnVersionOrNewer(19)
public fun Any?.beforeIcs(): Boolean = isOlderVersionThen(14)
public fun Any?.icsOrNewer(): Boolean = isOnVersionOrNewer(14)
public fun Any?.beforeVersion(version: Int): Boolean = isOlderVersionThen(version)
public fun Any?.versionOrNewer(version: Int): Boolean = isOnVersionOrNewer(version)
public fun Any?.currentVersion(): Int = Build.VERSION.SDK_INT

/*
 * -----------------------------------------------------------------------------
 *  Private methods
 * -----------------------------------------------------------------------------
 */
private fun isOlderVersionThen(version: Int) = Build.VERSION.SDK_INT < version

private fun isOnVersionOrNewer(version: Int) = Build.VERSION.SDK_INT >= version
