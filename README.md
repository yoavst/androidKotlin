[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-androidKotlin-brightgreen.svg?style=flat)](http://android-arsenal.com/details/1/1634)

Android Kotlin Extensions
=========================
A collection of Kotlin extensions for Android,
based on [KotlinAndroidLib](https://github.com/vladlichonos/kotlinAndroidLib) and [Android Kotlin Extensions](https://github.com/ragunathjawahar/android-kotlin-extensions).


## Include this library in your project
**Step 1. Add the JitPack repository to your build file**
```groovy
repositories {
	    maven {
	        url "https://jitpack.io"
	    }
	}
```
**Step 2. Add the dependency in the form**
```groovy
dependencies {
	        compile 'com.github.yoavst:androidKotlin:1.0.8'
	}
```



Activities & Services
-------------------------
#### Example: Start an Activity
**Java**
```java
Intent intent = new Intent(this, SuperPowersActivity.class);
intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);  
intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
startActivity(intent);
```

**Kotlin**
```kotlin
val flags = flags(Intent.FLAG_ACTIVITY_NEW_TASK, Intent.FLAG_ACTIVITY_CLEAR_TOP)
startActivity<SuperPowersActivity>(flags)
```

#### Example: Create an Intent
**Java**
```java
Intent intent = new Intent(this, SuperPowersActivity.class);
```

**Kotlin**
```kotlin
val intent = intent<SuperPowersActivity>()
```

Api
-------------------------
**Java**
```java
int sdk = Build.VERSION.SDK_INT;
if (sdk >= Build.VERSION_CODES.LOLLIPOP) {}
if (sdk < Build.VERSION_CODES.LOLLIPOP) {}
if (sdk >= Build.VERSION_CODES.KITKAT) {}
if (sdk < Build.VERSION_CODES.KITKAT) {}
if (sdk >= Build.VERSION_CODES.ICE_CREAM_SANDWICH) {}
if (sdk < Build.VERSION_CODES.ICE_CREAM_SANDWICH) {}
if (sdk >= X) {}
if (sdk < X) {}
```

**Kotlin**
```kotlin
val sdk = currentVersion()
if (lollipopOrNewer()) {}
if (beforeLollipop()) {}
if (kitkatOrNewer()) {}
if (beforeKitkat()) {}
if (icsOrNewer()) {}
if (beforeIcs()) {}
if (versionOrNewer(x)) {}
if (beforeVersion(x)) {}
```

Async and main thread
-------------------------
**Kotlin**
```kotlin
async {

}

mainThread {

}
```

Broadcast Receiver
-------------------------
**Java**
```java
new BroadcastReceiver() {
			@Override
			public void onReceive(Context context,Intent intent) {
			}
		};
```
**Kotlin**
```kotlin
broadcastReceiver { context,intent -> }
```

Layout Inflation
-------------------------
**Java**
````java
LayoutInflater layoutInflater = LayoutInflater.from(this);
View awesomeView = layoutInflater.inflate(R.layout.my_awesome_layout, null);
````

**Kotlin**
````kotlin
val awesomeView = inflateLayout(R.layout.my_awesome_layout)
````

Logs
-------------------------
#### Example: Logging
**Java**
```java
String tag = this.getClass().getName();
Log.i(tag, "Howdy! Info");
Log.d(tag, "Knock knock! Debug");
Log.e(tag, "Grim, Error");
Log.wtf(tag, "Damn! WTF"); // Nope, not what you think. Refer the docs :P
```

**Kotlin**

```kotlin
i("Howdy! Info")
d("Knock knock! Debug")
e("Grim, Error")
wtf("Damn! WTF")
```

Preferences
-------------------------
#### Example: Single Preference
**Java**
```java
SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
Editor editor = preferences.edit();
editor.putBoolean("KEY_WALKTHROUGH_COMPLETE", complete);
if (Build.VERSION.SDK_INT < Build.VERSION_CODES.GINGERBREAD) {
  editor.commit();
} else {
  editor.apply();
}
```

**Kotlin**
```kotlin
getDefaultSharedPreferences().putBoolean("KEY_WALKTHROUGH_COMPLETE", complete)
```

#### Example: Bulk Preferences
**Kotlin**
```kotlin
getDefaultSharedPreferences()
  .bulk()
  .putBoolean("KEY_WALKTHROUGH_COMPLETE", complete)
  .putString("KEY_LAST_USED", lastUsedIso8601Date)
  .applyBulk()
```

Toasts
-------------------------
#### Example: Short Message
**Java**
```java
Toast.makeText(this, R.string.welcome, Toast.LENGTH_SHORT).show();
```

**Kotlin**
```kotlin
toast(R.string.welcome)
```

#### Example: Long Message
**Java**
```java
Toast.makeText(this, R.string.welcome, Toast.LENGTH_LONG).show();
```

**Kotlin**
```kotlin
longToast(R.string.welcome)
```

System Services
-------------------------
#### Example: System service on code

**Java**
```java
AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
```

**Kotlin**
```kotlin
val alarmManager = context.alarmManager()
val notificationManager = context.notificationManager()
```

#### Example: System service field (lazy)
**Java**
```java
AlarmManager alarmManager;
NotificationManager notificationManager;
public void onCreate(Bundle savedInstanceState)
{
        super.onCreate(savedInstanceState);
        alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
}
```

**Kotlin**
```kotlin
val alarmManager: AlarmManager by systemService()
val notificationManager: NotificationManager by systemService()
```

Resources
-------------------------
#### Example: Typeface from Assets
**Java**
```java
AssetManager assetManager = getAssets();
Typeface sourceSansPro = Typeface.createFromAsset(assetManager, "fonts/source-sans-pro.ttf");
```

**Kotlin**
```kotlin
val sourceSansPro = typefaceFromAssets("fonts/source-sans-pro.ttf")
```

#### Example: Get resources
**Java**
```java
int number = getResources().getInteger(R.integer.number);
int dimenPixelSize = getResources().getDimensionPixelSize(R.dimen.size);
int color = getResources().getColor(R.color.red);
int[] intArray = getResources().getIntArray(R.array.ids);
String[] stringArray = getResources().getColor(R.array.options);
Drawable drawable = getResources().getDrawable(R.drawable.background);
```

**Kotlin**
```kotlin
val number = intRes(R.integer.number)
val dimenPixelSize = dimenRes(R.dimen.size)
val color = colorRes(R.color.red)
val intArray = intArrayRes(R.array.ids)
val stringArray = stringArrayRes(R.array.options)
val drawable = drawableRes(R.drawable.background)
```

#### Example: Get resources as field (lazy)
**Kotlin**
```kotlin
val text by stringResource(R.string.text)
val number by intResource(R.integer.number)
val dimenPixelSize by dimenResource(R.dimen.size)
val color by colorResource(R.color.red)
val intArray by intArrayResource(R.array.ids)
val stringArray by stringArrayResource(R.array.options)
val drawable by drawableResource(R.drawable.background)
```

### Example: DP and PX converter
**Kotlin**
```kotlin
val px = 40.toPx(context)
val dp = 180.toDp(activity)
```

More...
-------------------------
More extensions under development.

License
-------------------------
    Copyright 2015 Yoav sternberg

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
