package com.yoavst.kotlin

import android.accounts.AccountManager
import android.app.*
import android.app.admin.DevicePolicyManager
import android.app.job.JobScheduler
import android.appwidget.AppWidgetManager
import android.bluetooth.BluetoothAdapter
import android.content.ClipboardManager
import android.content.Context
import android.content.RestrictionsManager
import android.content.pm.LauncherApps
import android.hardware.ConsumerIrManager
import android.hardware.SensorManager
import android.hardware.camera2.CameraManager
import android.hardware.display.DisplayManager
import android.hardware.input.InputManager
import android.hardware.usb.UsbManager
import android.location.LocationManager
import android.media.AudioManager
import android.media.MediaRouter
import android.media.projection.MediaProjectionManager
import android.media.session.MediaSessionManager
import android.media.tv.TvInputManager
import android.net.ConnectivityManager
import android.net.nsd.NsdManager
import android.net.wifi.WifiManager
import android.net.wifi.p2p.WifiP2pManager
import android.nfc.NfcManager
import android.os.*
import android.os.storage.StorageManager
import android.print.PrintManager
import android.service.wallpaper.WallpaperService
import android.telecom.TelecomManager
import android.telephony.TelephonyManager
import android.view.LayoutInflater
import android.view.WindowManager
import android.view.accessibility.AccessibilityManager
import android.view.accessibility.CaptioningManager
import android.view.inputmethod.InputMethodManager
import android.view.textservice.TextServicesManager
import kotlin.properties.ReadOnlyProperty
import android.support.v4.app.Fragment as SupportFragment


public fun Context.accessibilityManager(): AccessibilityManager {
    return getSystemService(Context.ACCESSIBILITY_SERVICE) as AccessibilityManager
}

public fun Context.accountManager(): AccountManager {
    return getSystemService(Context.ACCOUNT_SERVICE) as AccountManager
}

public fun Context.activityManager(): ActivityManager {
    return getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
}

public fun Context.alarmManager(): AlarmManager {
    return getSystemService(Context.ALARM_SERVICE) as AlarmManager
}

public fun Context.appWidgetManager(): AppWidgetManager {
    return getSystemService(Context.APPWIDGET_SERVICE) as AppWidgetManager
}

public fun Context.appOpsManager(): AppOpsManager? {
    return getSystemService(Context.APP_OPS_SERVICE) as AppOpsManager
}

public fun Context.audioManager(): AudioManager {
    return getSystemService(Context.AUDIO_SERVICE) as AudioManager
}

public fun Context.batteryManager(): BatteryManager {
    return getSystemService(Context.BATTERY_SERVICE) as BatteryManager
}

public fun Context.bluetoothAdapter(): BluetoothAdapter? {
    return getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothAdapter
}

public fun Context.cameraManager(): CameraManager? {
    return getSystemService(Context.CAMERA_SERVICE) as CameraManager
}

public fun Context.captioningManager(): CaptioningManager? {
    return getSystemService(Context.CAPTIONING_SERVICE) as CaptioningManager
}

public fun Context.clipboardManager(): ClipboardManager {
    return getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
}

public fun Context.connectivityManager(): ConnectivityManager {
    return getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
}

public fun Context.consumerIrManager(): ConsumerIrManager? {
    return getSystemService(Context.CONSUMER_IR_SERVICE) as ConsumerIrManager
}

public fun Context.devicePolicyManager(): DevicePolicyManager? {
    return getSystemService(Context.DEVICE_POLICY_SERVICE) as DevicePolicyManager
}

public fun Context.displayManager(): DisplayManager? {
    return getSystemService(Context.DISPLAY_SERVICE) as DisplayManager
}

public fun Context.downloadManager(): DownloadManager? {
    return getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
}

public fun Context.dropBoxManager(): DropBoxManager? {
    return getSystemService(Context.DROPBOX_SERVICE) as DropBoxManager
}

public fun Context.inputMethodManager(): InputMethodManager? {
    return getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
}

public fun Context.inputManager(): InputManager? {
    return getSystemService(Context.INPUT_SERVICE) as InputManager
}

public fun Context.jobScheduler(): JobScheduler? {
    return getSystemService(Context.JOB_SCHEDULER_SERVICE) as JobScheduler
}

public fun Context.keyguardManager(): KeyguardManager {
    return getSystemService(Context.KEYGUARD_SERVICE) as KeyguardManager
}

public fun Context.launcherApps(): LauncherApps? {
    return getSystemService(Context.LAUNCHER_APPS_SERVICE) as LauncherApps
}

public fun Context.layoutInflater(): LayoutInflater {
    return getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
}

public fun Context.locationManager(): LocationManager {
    return getSystemService(Context.LOCATION_SERVICE) as LocationManager
}

public fun Context.mediaProjectionManager(): MediaProjectionManager? {
    return getSystemService(Context.MEDIA_PROJECTION_SERVICE) as MediaProjectionManager
}

public fun Context.mediaRouter(): MediaRouter? {
    return getSystemService(Context.MEDIA_ROUTER_SERVICE) as MediaRouter
}

public fun Context.mediaSessionManager(): MediaSessionManager? {
    return getSystemService(Context.MEDIA_SESSION_SERVICE) as MediaSessionManager
}

public fun Context.nfcManager(): NfcManager? {
    return getSystemService(Context.NFC_SERVICE) as NfcManager
}

public fun Context.notificationManager(): NotificationManager {
    return getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
}

public fun Context.nsdManager(): NsdManager? {
    return getSystemService(Context.NSD_SERVICE) as NsdManager
}

public fun Context.powerManager(): PowerManager {
    return getSystemService(Context.POWER_SERVICE) as PowerManager
}

public fun Context.printManager(): PrintManager? {
    return getSystemService(Context.PRINT_SERVICE) as PrintManager
}

public fun Context.restrictionsManager(): RestrictionsManager? {
    return getSystemService(Context.RESTRICTIONS_SERVICE) as RestrictionsManager
}

public fun Context.searchManager(): SearchManager {
    return getSystemService(Context.SEARCH_SERVICE) as SearchManager
}

public fun Context.sensorManager(): SensorManager {
    return getSystemService(Context.SENSOR_SERVICE) as SensorManager
}

public fun Context.storageManager(): StorageManager? {
    return getSystemService(Context.STORAGE_SERVICE) as StorageManager
}

public fun Context.telecomManager(): TelecomManager? {
    return getSystemService(Context.TELECOM_SERVICE) as TelecomManager
}

public fun Context.telephonyManager(): TelephonyManager {
    return getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
}

public fun Context.textServicesManager(): TextServicesManager? {
    return getSystemService(Context.TEXT_SERVICES_MANAGER_SERVICE) as TextServicesManager
}

public fun Context.tvInputManager(): TvInputManager? {
    return getSystemService(Context.TV_INPUT_SERVICE) as TvInputManager
}

public fun Context.uiModeManager(): UiModeManager? {
    return getSystemService(Context.UI_MODE_SERVICE) as UiModeManager
}

public fun Context.usbManager(): UsbManager? {
    return getSystemService(Context.USB_SERVICE) as UsbManager
}

public fun Context.userManager(): UserManager? {
    return getSystemService(Context.USER_SERVICE) as UserManager
}

public fun Context.vibrator(): Vibrator {
    return getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
}

public fun Context.wallpaperService(): WallpaperService {
    return getSystemService(Context.WALLPAPER_SERVICE) as WallpaperService
}

public fun Context.wifiP2pManager(): WifiP2pManager? {
    return getSystemService(Context.WIFI_P2P_SERVICE) as WifiP2pManager
}

public fun Context.wifiManager(): WifiManager {
    return getSystemService(Context.WIFI_SERVICE) as WifiManager
}

public fun Context.windowService(): WindowManager {
    return getSystemService(Context.WINDOW_SERVICE) as WindowManager
}

@Suppress("IMPLICIT_CAST_TO_UNIT_OR_ANY")
public class SystemService<K : Any>(private val clazz: Class<K>, private val context: () -> Context) : ReadOnlyProperty<Any?, K> {
    private var value: K? = null
    public override fun get(thisRef: Any?, property: PropertyMetadata): K {
        if (value == null) {
            value = when {
                clazz.isAssignableFrom(AccessibilityManager::class.java) -> context().accessibilityManager()
                clazz.isAssignableFrom(AccountManager::class.java) -> context().accountManager()
                clazz.isAssignableFrom(ActivityManager::class.java) -> context().activityManager()
                clazz.isAssignableFrom(AlarmManager::class.java) -> context().alarmManager()
                clazz.isAssignableFrom(AudioManager::class.java) -> context().audioManager()
                clazz.isAssignableFrom(ClipboardManager::class.java) -> context().clipboardManager()
                clazz.isAssignableFrom(ConnectivityManager::class.java) -> context().connectivityManager()
                clazz.isAssignableFrom(DevicePolicyManager::class.java) -> context().devicePolicyManager()
                clazz.isAssignableFrom(DropBoxManager::class.java) -> context().dropBoxManager()
                clazz.isAssignableFrom(InputMethodManager::class.java) -> context().inputMethodManager()
                clazz.isAssignableFrom(KeyguardManager::class.java) -> context().keyguardManager()
                clazz.isAssignableFrom(LocationManager::class.java) -> context().locationManager()
                clazz.isAssignableFrom(LayoutInflater::class.java) -> context().layoutInflater()
                clazz.isAssignableFrom(NotificationManager::class.java) -> context().notificationManager()
                clazz.isAssignableFrom(NfcManager::class.java) -> context().nfcManager()
                clazz.isAssignableFrom(PowerManager::class.java) -> context().powerManager()
                clazz.isAssignableFrom(SearchManager::class.java) -> context().searchManager()
                clazz.isAssignableFrom(SensorManager::class.java) -> context().sensorManager()
                clazz.isAssignableFrom(StorageManager::class.java) -> context().storageManager()
                clazz.isAssignableFrom(TelephonyManager::class.java) -> context().telephonyManager()
                clazz.isAssignableFrom(UiModeManager::class.java) -> context().uiModeManager()
                clazz.isAssignableFrom(Vibrator::class.java) -> context().vibrator()
                clazz.isAssignableFrom(WallpaperService::class.java) -> context().wallpaperService()
                clazz.isAssignableFrom(WifiManager::class.java) -> context().wifiManager()
                clazz.isAssignableFrom(WindowManager::class.java) -> context().windowService()
                else -> null
            } as K
            if (value == null) {
                if (isOnVersionOrNewer(12)) {
                    value = when {
                        clazz.isAssignableFrom(UsbManager::class.java) -> context().usbManager()
                        else -> null
                    } as K
                    if (value == null) {
                        if (isOnVersionOrNewer(14)) {
                            value = when {
                                clazz.isAssignableFrom(TextServicesManager::class.java) -> context().textServicesManager()
                                clazz.isAssignableFrom(WifiP2pManager::class.java) -> context().wifiP2pManager()
                                else -> null
                            } as K
                            if (value == null) {
                                if (isOnVersionOrNewer(16)) {
                                    value = when {
                                        clazz.isAssignableFrom(InputManager::class.java) -> context().inputManager()
                                        clazz.isAssignableFrom(MediaRouter::class.java) -> context().mediaRouter()
                                        clazz.isAssignableFrom(NsdManager::class.java) -> context().nsdManager()
                                        else -> null
                                    } as K
                                    if (value == null) {
                                        if (isOnVersionOrNewer(17)) {
                                            value = when {
                                                clazz.isAssignableFrom(UserManager::class.java) -> context().userManager()
                                                clazz.isAssignableFrom(DisplayManager::class.java) -> context().displayManager()
                                                else -> null
                                            } as K
                                            if (value == null) {
                                                if (isOnVersionOrNewer(18)) {
                                                    if (clazz.isAssignableFrom(BluetoothAdapter::class.java)) return context().bluetoothAdapter() as K
                                                }
                                                if (kitkatOrNewer()) {
                                                    value = when {
                                                        clazz.isAssignableFrom(AppOpsManager::class.java) -> context().appOpsManager()
                                                        clazz.isAssignableFrom(CaptioningManager::class.java) -> context().captioningManager()
                                                        clazz.isAssignableFrom(ConsumerIrManager::class.java) -> context().consumerIrManager()
                                                        clazz.isAssignableFrom(PrintManager::class.java) -> context().printManager()

                                                        else -> null
                                                    } as K
                                                    if (value == null) {
                                                        if (lollipopOrNewer()) {
                                                            value = when {
                                                                clazz.isAssignableFrom(AppWidgetManager::class.java) -> context().appWidgetManager()
                                                                clazz.isAssignableFrom(BatteryManager::class.java) -> context().batteryManager()
                                                                clazz.isAssignableFrom(CameraManager::class.java) -> context().cameraManager()
                                                                clazz.isAssignableFrom(JobScheduler::class.java) -> context().jobScheduler()
                                                                clazz.isAssignableFrom(MediaProjectionManager::class.java) -> context().mediaProjectionManager()
                                                                clazz.isAssignableFrom(MediaSessionManager::class.java) -> context().mediaSessionManager()
                                                                clazz.isAssignableFrom(RestrictionsManager::class.java) -> context().restrictionsManager()
                                                                clazz.isAssignableFrom(TelecomManager::class.java) -> context().telecomManager()
                                                                clazz.isAssignableFrom(TvInputManager::class.java) -> context().tvInputManager()
                                                                else -> null
                                                            } as K
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return value!!
    }
}

public inline fun Context.systemService<reified k : Any>(): SystemService<k> = SystemService(k::class.java) { this }
public inline fun Fragment.systemService<reified k : Any>(): SystemService<k> = SystemService(k::class.java) { activity }
public inline fun SupportFragment.systemService<reified k : Any>(): SystemService<k> = SystemService(k::class.java) { activity }
/*
 * -----------------------------------------------------------------------------
 *  Private methods
 * -----------------------------------------------------------------------------
 */
private fun Context.getSystemService(serviceName: String): Any? {
    return this.getSystemService(serviceName)
}