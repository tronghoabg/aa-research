package io.flutter.plugins;

import Pc.C0788d;
import Uc.f;
import Vb.a;
import Wb.b;
import ad.X;
import ag.C1381a;
import android.util.Log;
import androidx.annotation.Keep;
import bc.C1523a;
import cc.C1594a;
import com.applovin.applovin_max.AppLovinMAX;
import com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin;
import com.qonversion.flutter.sdk.qonversion_flutter_sdk.QonversionPlugin;
import db.e;
import dd.C2427f;
import e5.C2472a;
import ec.c;
import ed.d;
import f5.C2570h;
import fd.C2628H;
import g5.C2708e;
import gd.C2751f;
import hd.q;
import jb.l;
import l5.C3394a;
import lb.C3456f;
import lc.C3458b;
import yc.C4586i;

@Keep
/* loaded from: classes5.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(C3458b c3458b) {
        try {
            c3458b.f40254d.e(new AppLovinMAX());
        } catch (Exception e7) {
            Log.e(TAG, "Error registering plugin applovin_max, com.applovin.applovin_max.AppLovinMAX", e7);
        }
        try {
            c3458b.f40254d.e(new e());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin audio_session, com.ryanheise.audio_session.AudioSessionPlugin", e10);
        }
        try {
            c3458b.f40254d.e(new a());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin battery_plus, dev.fluttercommunity.plus.battery.BatteryPlusPlugin", e11);
        }
        try {
            c3458b.f40254d.e(new C4586i());
        } catch (Exception e12) {
            Log.e(TAG, "Error registering plugin camera_android, io.flutter.plugins.camera.CameraPlugin", e12);
        }
        try {
            c3458b.f40254d.e(new f());
        } catch (Exception e13) {
            Log.e(TAG, "Error registering plugin cloud_firestore, io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin", e13);
        }
        try {
            c3458b.f40254d.e(new b());
        } catch (Exception e14) {
            Log.e(TAG, "Error registering plugin connectivity_plus, dev.fluttercommunity.plus.connectivity.ConnectivityPlugin", e14);
        }
        try {
            c3458b.f40254d.e(new C3394a());
        } catch (Exception e15) {
            Log.e(TAG, "Error registering plugin desktop_webview_auth, com.example.desktop_webview_auth.DesktopWebviewAuthPlugin", e15);
        }
        try {
            c3458b.f40254d.e(new Xb.a());
        } catch (Exception e16) {
            Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e16);
        }
        try {
            c3458b.f40254d.e(new c());
        } catch (Exception e17) {
            Log.e(TAG, "Error registering plugin disable_battery_optimization, in.jvapps.disable_battery_optimization.DisableBatteryOptimizationPlugin", e17);
        }
        try {
            c3458b.f40254d.e(new m5.c());
        } catch (Exception e18) {
            Log.e(TAG, "Error registering plugin disk_space_2, com.example.disk_space_2.DiskSpace_2Plugin", e18);
        }
        try {
            c3458b.f40254d.e(new s4.b());
        } catch (Exception e19) {
            Log.e(TAG, "Error registering plugin ffmpeg_kit_flutter, com.arthenica.ffmpegkit.flutter.FFmpegKitFlutterPlugin", e19);
        }
        try {
            c3458b.f40254d.e(new Wa.e());
        } catch (Exception e20) {
            Log.e(TAG, "Error registering plugin file_picker, com.mr.flutter.plugin.filepicker.FilePickerPlugin", e20);
        }
        try {
            c3458b.f40254d.e(new Nc.e());
        } catch (Exception e21) {
            Log.e(TAG, "Error registering plugin firebase_analytics, io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin", e21);
        }
        try {
            c3458b.f40254d.e(new Oc.b());
        } catch (Exception e22) {
            Log.e(TAG, "Error registering plugin firebase_app_check, io.flutter.plugins.firebase.appcheck.FlutterFirebaseAppCheckPlugin", e22);
        }
        try {
            c3458b.f40254d.e(new C0788d());
        } catch (Exception e23) {
            Log.e(TAG, "Error registering plugin firebase_auth, io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin", e23);
        }
        try {
            c3458b.f40254d.e(new Qc.c());
        } catch (Exception e24) {
            Log.e(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e24);
        }
        try {
            c3458b.f40254d.e(new Rc.e());
        } catch (Exception e25) {
            Log.e(TAG, "Error registering plugin firebase_crashlytics, io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin", e25);
        }
        try {
            c3458b.f40254d.e(new Sc.b());
        } catch (Exception e26) {
            Log.e(TAG, "Error registering plugin firebase_dynamic_links, io.flutter.plugins.firebase.dynamiclinks.FlutterFirebaseDynamicLinksPlugin", e26);
        }
        try {
            c3458b.f40254d.e(new Xc.a());
        } catch (Exception e27) {
            Log.e(TAG, "Error registering plugin firebase_in_app_messaging, io.flutter.plugins.firebase.inappmessaging.FirebaseInAppMessagingPlugin", e27);
        }
        try {
            c3458b.f40254d.e(new Yc.f());
        } catch (Exception e28) {
            Log.e(TAG, "Error registering plugin firebase_messaging, io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin", e28);
        }
        try {
            c3458b.f40254d.e(new Tc.b());
        } catch (Exception e29) {
            Log.e(TAG, "Error registering plugin firebase_remote_config, io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigPlugin", e29);
        }
        try {
            c3458b.f40254d.e(new Xa.a());
        } catch (Exception e30) {
            Log.e(TAG, "Error registering plugin flutter_foreground_task, com.pravera.flutter_foreground_task.FlutterForegroundTaskPlugin", e30);
        }
        try {
            c3458b.f40254d.e(new FlutterLocalNotificationsPlugin());
        } catch (Exception e31) {
            Log.e(TAG, "Error registering plugin flutter_local_notifications, com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin", e31);
        }
        try {
            c3458b.f40254d.e(new C1381a());
        } catch (Exception e32) {
            Log.e(TAG, "Error registering plugin flutter_native_splash, net.jonhanson.flutter_native_splash.FlutterNativeSplashPlugin", e32);
        }
        try {
            c3458b.f40254d.e(new C1594a());
        } catch (Exception e33) {
            Log.e(TAG, "Error registering plugin flutter_overlay_window, flutter.overlay.window.flutter_overlay_window.FlutterOverlayWindowPlugin", e33);
        }
        try {
            c3458b.f40254d.e(new Zc.a());
        } catch (Exception e34) {
            Log.e(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e34);
        }
        try {
            c3458b.f40254d.e(new C3456f());
        } catch (Exception e35) {
            Log.e(TAG, "Error registering plugin flutter_tts, com.tundralabs.fluttertts.FlutterTtsPlugin", e35);
        }
        try {
            c3458b.f40254d.e(new Ub.a());
        } catch (Exception e36) {
            Log.e(TAG, "Error registering plugin flutter_udid, de.gigadroid.flutter_udid.FlutterUdidPlugin", e36);
        }
        try {
            c3458b.f40254d.e(new Cg.c());
        } catch (Exception e37) {
            Log.e(TAG, "Error registering plugin gal, studio.midoridesign.gal.GalPlugin", e37);
        }
        try {
            c3458b.f40254d.e(new v4.b());
        } catch (Exception e38) {
            Log.e(TAG, "Error registering plugin geolocator_android, com.baseflow.geolocator.GeolocatorPlugin", e38);
        }
        try {
            c3458b.f40254d.e(new Ja.a());
        } catch (Exception e39) {
            Log.e(TAG, "Error registering plugin google_mlkit_commons, com.google_mlkit_commons.GoogleMlKitCommonsPlugin", e39);
        }
        try {
            c3458b.f40254d.e(new Ka.a());
        } catch (Exception e40) {
            Log.e(TAG, "Error registering plugin google_mlkit_text_recognition, com.google_mlkit_text_recognition.GoogleMlKitTextRecognitionPlugin", e40);
        }
        try {
            c3458b.f40254d.e(new X());
        } catch (Exception e41) {
            Log.e(TAG, "Error registering plugin google_mobile_ads, io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin", e41);
        }
        try {
            c3458b.f40254d.e(new C2427f());
        } catch (Exception e42) {
            Log.e(TAG, "Error registering plugin google_sign_in_android, io.flutter.plugins.googlesignin.GoogleSignInPlugin", e42);
        }
        try {
            c3458b.f40254d.e(new eb.f());
        } catch (Exception e43) {
            Log.e(TAG, "Error registering plugin just_audio, com.ryanheise.just_audio.JustAudioPlugin", e43);
        }
        try {
            c3458b.f40254d.e(new C1523a());
        } catch (Exception e44) {
            Log.e(TAG, "Error registering plugin motion_sensors, finaldev.motion_sensors.MotionSensorsPlugin", e44);
        }
        try {
            c3458b.f40254d.e(new C2472a());
        } catch (Exception e45) {
            Log.e(TAG, "Error registering plugin native_exif, com.cloudacy.native_exif.NativeExifPlugin", e45);
        }
        try {
            c3458b.f40254d.e(new Yb.a());
        } catch (Exception e46) {
            Log.e(TAG, "Error registering plugin network_info_plus, dev.fluttercommunity.plus.network_info.NetworkInfoPlusPlugin", e46);
        }
        try {
            c3458b.f40254d.e(new Zb.a());
        } catch (Exception e47) {
            Log.e(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e47);
        }
        try {
            c3458b.f40254d.e(new d());
        } catch (Exception e48) {
            Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e48);
        }
        try {
            c3458b.f40254d.e(new QonversionPlugin());
        } catch (Exception e49) {
            Log.e(TAG, "Error registering plugin qonversion_flutter, com.qonversion.flutter.sdk.qonversion_flutter_sdk.QonversionPlugin", e49);
        }
        try {
            c3458b.f40254d.e(new Ob.a());
        } catch (Exception e50) {
            Log.e(TAG, "Error registering plugin safe_device, com.xamdesign.safe_device.SafeDevicePlugin", e50);
        }
        try {
            c3458b.f40254d.e(new C2628H());
        } catch (Exception e51) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e51);
        }
        try {
            c3458b.f40254d.e(new C2570h());
        } catch (Exception e52) {
            Log.e(TAG, "Error registering plugin speech_to_text, com.csdcorp.speech_to_text.SpeechToTextPlugin", e52);
        }
        try {
            c3458b.f40254d.e(new l());
        } catch (Exception e53) {
            Log.e(TAG, "Error registering plugin sqflite_android, com.tekartik.sqflite.SqflitePlugin", e53);
        }
        try {
            c3458b.f40254d.e(new C2708e());
        } catch (Exception e54) {
            Log.e(TAG, "Error registering plugin sqflite_sqlcipher, com.davidmartos96.sqflite_sqlcipher.SqfliteSqlCipherPlugin", e54);
        }
        try {
            c3458b.f40254d.e(new C2751f());
        } catch (Exception e55) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e55);
        }
        try {
            c3458b.f40254d.e(new q());
        } catch (Exception e56) {
            Log.e(TAG, "Error registering plugin video_player_android, io.flutter.plugins.videoplayer.VideoPlayerPlugin", e56);
        }
        try {
            c3458b.f40254d.e(new ac.b());
        } catch (Exception e57) {
            Log.e(TAG, "Error registering plugin wakelock_plus, dev.fluttercommunity.plus.wakelock.WakelockPlusPlugin", e57);
        }
        try {
            c3458b.f40254d.e(new kd.X());
        } catch (Exception e58) {
            Log.e(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e58);
        }
    }
}
