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

[suppress("IMPLICIT_CAST_TO_UNIT_OR_ANY")]
public class SystemService<K>(private val clazz: Class<K>, private val context: () -> Context) : ReadOnlyProperty<Any?, K> {
    private var value: K = null
    public override fun get(thisRef: Any?, desc: PropertyMetadata): K {
        if (value == null) {
            value = when {
                clazz.isAssignableFrom(javaClass<AccessibilityManager>()) -> context().accessibilityManager()
                clazz.isAssignableFrom(javaClass<AccountManager>()) -> context().accountManager()
                clazz.isAssignableFrom(javaClass<ActivityManager>()) -> context().activityManager()
                clazz.isAssignableFrom(javaClass<AlarmManager>()) -> context().alarmManager()
                clazz.isAssignableFrom(javaClass<AudioManager>()) -> context().audioManager()
                clazz.isAssignableFrom(javaClass<ClipboardManager>()) -> context().clipboardManager()
                clazz.isAssignableFrom(javaClass<ConnectivityManager>()) -> context().connectivityManager()
                clazz.isAssignableFrom(javaClass<DevicePolicyManager>()) -> context().devicePolicyManager()
                clazz.isAssignableFrom(javaClass<DropBoxManager>()) -> context().dropBoxManager()
                clazz.isAssignableFrom(javaClass<InputMethodManager>()) -> context().inputMethodManager()
                clazz.isAssignableFrom(javaClass<KeyguardManager>()) -> context().keyguardManager()
                clazz.isAssignableFrom(javaClass<LocationManager>()) -> context().locationManager()
                clazz.isAssignableFrom(javaClass<LayoutInflater>()) -> context().layoutInflater()
                clazz.isAssignableFrom(javaClass<NotificationManager>()) -> context().notificationManager()
                clazz.isAssignableFrom(javaClass<NfcManager>()) -> context().nfcManager()
                clazz.isAssignableFrom(javaClass<PowerManager>()) -> context().powerManager()
                clazz.isAssignableFrom(javaClass<SearchManager>()) -> context().searchManager()
                clazz.isAssignableFrom(javaClass<SensorManager>()) -> context().sensorManager()
                clazz.isAssignableFrom(javaClass<StorageManager>()) -> context().storageManager()
                clazz.isAssignableFrom(javaClass<TelephonyManager>()) -> context().telephonyManager()
                clazz.isAssignableFrom(javaClass<UiModeManager>()) -> context().uiModeManager()
                clazz.isAssignableFrom(javaClass<Vibrator>()) -> context().vibrator()
                clazz.isAssignableFrom(javaClass<WallpaperService>()) -> context().wallpaperService()
                clazz.isAssignableFrom(javaClass<WifiManager>()) -> context().wifiManager()
                clazz.isAssignableFrom(javaClass<WindowManager>()) -> context().windowService()
                else -> null
            } as K
            if (value == null) {
                if (isOnVersionOrNewer(12)) {
                    value = when {
                        clazz.isAssignableFrom(javaClass<UsbManager>()) -> context().usbManager()
                        else -> null
                    } as K
                    if (value == null) {
                        if (isOnVersionOrNewer(14)) {
                            value = when {
                                clazz.isAssignableFrom(javaClass<TextServicesManager>()) -> context().textServicesManager()
                                clazz.isAssignableFrom(javaClass<WifiP2pManager>()) -> context().wifiP2pManager()
                                else -> null
                            } as K
                            if (value == null) {
                                if (isOnVersionOrNewer(16)) {
                                    value = when {
                                        clazz.isAssignableFrom(javaClass<InputManager>()) -> context().inputManager()
                                        clazz.isAssignableFrom(javaClass<MediaRouter>()) -> context().mediaRouter()
                                        clazz.isAssignableFrom(javaClass<NsdManager>()) -> context().nsdManager()
                                        else -> null
                                    } as K
                                    if (value == null) {
                                        if (isOnVersionOrNewer(17)) {
                                            value = when {
                                                clazz.isAssignableFrom(javaClass<UserManager>()) -> context().userManager()
                                                clazz.isAssignableFrom(javaClass<DisplayManager>()) -> context().displayManager()
                                                else -> null
                                            } as K
                                            if (value == null) {
                                                if (isOnVersionOrNewer(18)) {
                                                    if (clazz.isAssignableFrom(javaClass<BluetoothAdapter>())) return context().bluetoothAdapter() as K
                                                }
                                                if (kitkatOrNewer()) {
                                                    value = when {
                                                        clazz.isAssignableFrom(javaClass<AppOpsManager>()) -> context().appOpsManager()
                                                        clazz.isAssignableFrom(javaClass<CaptioningManager>()) -> context().captioningManager()
                                                        clazz.isAssignableFrom(javaClass<ConsumerIrManager>()) -> context().consumerIrManager()
                                                        clazz.isAssignableFrom(javaClass<PrintManager>()) -> context().printManager()

                                                        else -> null
                                                    } as K
                                                    if (value == null) {
                                                        if (lollipopOrNewer()) {
                                                            value = when {
                                                                clazz.isAssignableFrom(javaClass<AppWidgetManager>()) -> context().appWidgetManager()
                                                                clazz.isAssignableFrom(javaClass<BatteryManager>()) -> context().batteryManager()
                                                                clazz.isAssignableFrom(javaClass<CameraManager>()) -> context().cameraManager()
                                                                clazz.isAssignableFrom(javaClass<JobScheduler>()) -> context().jobScheduler()
                                                                clazz.isAssignableFrom(javaClass<MediaProjectionManager>()) -> context().mediaProjectionManager()
                                                                clazz.isAssignableFrom(javaClass<MediaSessionManager>()) -> context().mediaSessionManager()
                                                                clazz.isAssignableFrom(javaClass<RestrictionsManager>()) -> context().restrictionsManager()
                                                                clazz.isAssignableFrom(javaClass<TelecomManager>()) -> context().telecomManager()
                                                                clazz.isAssignableFrom(javaClass<TvInputManager>()) -> context().tvInputManager()
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
        return value
    }
}

public inline fun Context.systemService<reified k>(): SystemService<k> = SystemService(javaClass<k>()) { this }
public inline fun Fragment.systemService<reified k>(): SystemService<k> = SystemService(javaClass<k>()) { getActivity() }
public inline fun SupportFragment.systemService<reified k>(): SystemService<k> = SystemService(javaClass<k>()) { getActivity() }
/*
 * -----------------------------------------------------------------------------
 *  Private methods
 * -----------------------------------------------------------------------------
 */
private fun Context.getSystemService(serviceName: String): Any? {
    return this.getSystemService(serviceName)
}