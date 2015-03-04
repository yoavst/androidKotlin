package com.yoavst.kotlin

import android.content.Context
import android.app.AlarmManager
import android.view.accessibility.AccessibilityManager
import android.accounts.AccountManager
import android.app.ActivityManager
import android.appwidget.AppWidgetManager
import android.app.AppOpsManager
import android.media.AudioManager
import android.os.BatteryManager
import android.bluetooth.BluetoothAdapter
import android.hardware.camera2.CameraManager
import android.view.accessibility.CaptioningManager
import android.content.ClipboardManager
import android.net.ConnectivityManager
import android.hardware.ConsumerIrManager
import android.app.admin.DevicePolicyManager
import android.hardware.display.DisplayManager
import android.app.DownloadManager
import android.os.DropBoxManager
import android.view.inputmethod.InputMethodManager
import android.hardware.input.InputManager
import android.app.job.JobScheduler
import android.app.KeyguardManager
import android.content.pm.LauncherApps
import android.view.LayoutInflater
import android.location.LocationManager
import android.media.projection.MediaProjectionManager
import android.media.MediaRouter
import android.media.session.MediaSessionManager
import android.nfc.NfcManager
import android.app.NotificationManager
import android.net.nsd.NsdManager
import android.os.PowerManager
import android.print.PrintManager
import android.content.RestrictionsManager
import android.app.SearchManager
import android.hardware.SensorManager
import android.os.storage.StorageManager
import android.telecom.TelecomManager
import android.telephony.TelephonyManager
import android.view.textservice.TextServicesManager
import android.media.tv.TvInputManager
import android.app.UiModeManager
import android.hardware.usb.UsbManager
import android.os.UserManager
import android.os.Vibrator
import android.service.wallpaper.WallpaperService
import android.net.wifi.p2p.WifiP2pManager
import android.net.wifi.WifiManager
import android.view.WindowManager
import kotlin.properties.ReadOnlyProperty
import android.app.Fragment
import android.support.v4.app.Fragment as SupportFragment


public fun Context.accessibilityManager(): AccessibilityManager? {
    return getSystemService(Context.ACCESSIBILITY_SERVICE) as AccessibilityManager
}

public fun Context.accountManager(): AccountManager? {
    return getSystemService(Context.ACCOUNT_SERVICE) as AccountManager
}

public fun Context.activityManager(): ActivityManager {
    return getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
}

public fun Context.alarmManager(): AlarmManager {
    return getSystemService(Context.ALARM_SERVICE) as AlarmManager
}

public fun Context.appWidgetManager(): AppWidgetManager? {
    return getSystemService(Context.APPWIDGET_SERVICE) as AppWidgetManager
}

public fun Context.appOpsManager(): AppOpsManager? {
    return getSystemService(Context.APP_OPS_SERVICE) as AppOpsManager
}

public fun Context.audioManager(): AudioManager {
    return getSystemService(Context.AUDIO_SERVICE) as AudioManager
}

public fun Context.batteryManager(): BatteryManager? {
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

public class SystemService<K>(private val context: Context) : ReadOnlyProperty<Any?, K> {
    private var value: K = null
    public override fun get(thisRef: Any?, desc: PropertyMetadata): K {
        if (value == null) {
            when(value) {
                is AccessibilityManager -> context.accessibilityManager()
                is AccountManager -> context.accountManager()
                is ActivityManager -> context.activityManager()
                is AlarmManager -> context.alarmManager()
                is AppWidgetManager -> context.appWidgetManager()
                is AudioManager -> context.audioManager()
                is BatteryManager -> context.batteryManager()
                is BluetoothAdapter -> context.bluetoothAdapter()
                is CameraManager -> context.cameraManager()
                is CaptioningManager -> context.captioningManager()
                is ClipboardManager -> context.clipboardManager()
                is ConsumerIrManager -> context.consumerIrManager()
                is ConnectivityManager -> context.connectivityManager()
                is DevicePolicyManager -> context.devicePolicyManager()
                is DisplayManager -> context.displayManager()
                is DropBoxManager -> context.dropBoxManager()
                is InputMethodManager -> context.inputMethodManager()
                is InputManager -> context.inputManager()
                is JobScheduler -> context.jobScheduler()
                is KeyguardManager -> context.keyguardManager()
                is LocationManager -> context.locationManager()
                is MediaProjectionManager -> context.mediaProjectionManager()
                is MediaRouter -> context.mediaRouter()
                is MediaSessionManager -> context.mediaSessionManager()
                is NfcManager -> context.nfcManager()
                is NsdManager -> context.nsdManager()
                is PowerManager -> context.powerManager()
                is PrintManager -> context.printManager()
                is RestrictionsManager -> context.restrictionsManager()
                is SearchManager -> context.searchManager()
                is SensorManager -> context.sensorManager()
                is StorageManager -> context.storageManager()
                is TelecomManager -> context.telephonyManager()
                is TelephonyManager -> context.telephonyManager()
                is TextServicesManager -> context.textServicesManager()
                is TvInputManager -> context.tvInputManager()
                is UiModeManager -> context.uiModeManager()
                is UsbManager -> context.usbManager()
                is UserManager -> context.userManager()
                is Vibrator -> context.vibrator()
                is WallpaperService -> context.wallpaperService()
                is WifiP2pManager -> context.wifiP2pManager()
                is WifiManager -> context.wifiManager()
                is WindowManager -> context.windowService()
            }
        }
        return value
    }
}

public fun Context.systemService<k>(): SystemService<k> = SystemService(this)
public fun Fragment.systemService<k>(): SystemService<k> = SystemService(getActivity())
public fun SupportFragment.systemService<k>(): SystemService<k> = SystemService(getActivity())

/*
 * -----------------------------------------------------------------------------
 *  Private methods
 * -----------------------------------------------------------------------------
 */
private fun Context.getSystemService(serviceName: String): Any? {
    return this.getSystemService(serviceName)
}