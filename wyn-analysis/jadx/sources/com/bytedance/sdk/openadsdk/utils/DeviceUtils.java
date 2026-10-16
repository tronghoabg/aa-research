package com.bytedance.sdk.openadsdk.utils;

import N0.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.bytedance.sdk.openadsdk.core.settings.zjm;
import com.bytedance.sdk.openadsdk.utils.xs;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSupport;
import com.unity3d.services.core.device.MimeTypes;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class DeviceUtils {

    /* renamed from: ab, reason: collision with root package name */
    private static int f26124ab = 0;
    private static int bcc = 0;
    private static int cq = 0;
    private static int cz = 0;
    private static int dz = 0;
    public static String uef = "";
    private static int wk;

    /* renamed from: oa, reason: collision with root package name */
    private static volatile long f26125oa = System.currentTimeMillis();
    private static volatile boolean yo = false;
    private static volatile boolean moa = false;
    private static volatile boolean lw = false;
    private static volatile boolean ivm = true;
    private static long xs = 0;
    private static String zjm = "";
    private static int dj = 0;
    private static final AtomicBoolean wrv = new AtomicBoolean(false);
    private static AtomicBoolean bs = new AtomicBoolean(false);
    private static final Object sy = new Object();
    private static volatile String oib = null;
    private static volatile String dhk = null;

    public static class AudioInfoReceiver extends BroadcastReceiver {
        static final CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.cq.cz> uef = new CopyOnWriteArrayList<>();

        /* JADX INFO: Access modifiers changed from: private */
        public static void oa(Context context) {
            if (DeviceUtils.moa || context == null) {
                return;
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                context.registerReceiver(new AudioInfoReceiver(), intentFilter, null, com.bytedance.sdk.component.utils.cz.uef());
                boolean unused = DeviceUtils.moa = true;
            } catch (Throwable unused2) {
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            try {
                if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                    if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                        int unused = DeviceUtils.wk = intent.getIntExtra("state", 0);
                    }
                } else if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                    int unused2 = DeviceUtils.cq = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                    if (!uef.isEmpty()) {
                        km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Iterator<com.bytedance.sdk.openadsdk.cq.cz> it = AudioInfoReceiver.uef.iterator();
                                while (it.hasNext()) {
                                    it.next().yo(DeviceUtils.cq);
                                }
                            }
                        });
                    }
                    if (DeviceUtils.cz != 0) {
                        int unused3 = DeviceUtils.dz = (int) ((DeviceUtils.cq / DeviceUtils.cz) * 100.0d);
                    }
                }
            } catch (Exception unused4) {
            }
        }

        public static void uef(com.bytedance.sdk.openadsdk.cq.cz czVar) {
            if (czVar != null) {
                CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.cq.cz> copyOnWriteArrayList = uef;
                if (copyOnWriteArrayList.contains(czVar)) {
                    return;
                }
                copyOnWriteArrayList.add(czVar);
            }
        }

        public static void oa(com.bytedance.sdk.openadsdk.cq.cz czVar) {
            if (czVar == null) {
                return;
            }
            uef.remove(czVar);
        }
    }

    public static class oa extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = DeviceUtils.ivm = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = DeviceUtils.ivm = false;
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                long unused3 = DeviceUtils.f26125oa = System.currentTimeMillis();
            }
        }
    }

    public static class uef extends BroadcastReceiver {
        private uef() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void oa(Context context) {
            int i5 = Build.VERSION.SDK_INT;
            if (context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
                if (i5 >= 33) {
                    context.registerReceiver(new uef(), intentFilter, 2);
                } else {
                    context.registerReceiver(new uef(), intentFilter);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || context == null) {
                return;
            }
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                DeviceUtils.tpx(context);
            } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                int unused = DeviceUtils.f26124ab = intent.getIntExtra("state", 0) == 1 ? 1 : 0;
            }
        }
    }

    public static int bcc(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", -1);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("TTAD.DeviceUtils", th.getMessage());
            return -1;
        }
    }

    private static int bs(Context context) {
        return wk;
    }

    public static int cz(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static void dhk(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            cz = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            cq = streamVolume;
            dz = (int) ((streamVolume / cz) * 100.0d);
        } catch (Throwable unused) {
        }
    }

    public static void dj() throws IOException, ClassNotFoundException {
        com.bytedance.sdk.openadsdk.core.settings.dj.uef(new zjm.uef() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.zjm.uef
            public void oa() {
                com.bytedance.sdk.openadsdk.tpx.uef.oa.uef.uef().uef(true);
                DeviceUtils.bs();
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.zjm.uef
            public void uef() {
                com.bytedance.sdk.openadsdk.tpx.uef.oa.uef.uef().uef(true);
            }
        });
        Context contextUef = com.bytedance.sdk.openadsdk.core.sy.uef();
        if (contextUef != null) {
            com.bytedance.sdk.openadsdk.core.yo.uef().uef("cpu_count", zjm.uef());
            com.bytedance.sdk.openadsdk.core.yo.uef().uef("cpu_max_frequency", zjm.uef(zjm.uef()));
            com.bytedance.sdk.openadsdk.core.yo.uef().uef("cpu_min_frequency", zjm.oa(zjm.uef()));
            String strDj = gb.dj();
            if (strDj != null) {
                com.bytedance.sdk.openadsdk.core.yo.uef().uef("total_memory", strDj);
            }
            com.bytedance.sdk.openadsdk.core.yo.uef().uef("total_internal_storage", gb.wrv());
            com.bytedance.sdk.openadsdk.core.yo.uef().uef("free_internal_storage", com.bytedance.sdk.component.utils.bs.uef());
            com.bytedance.sdk.openadsdk.core.yo.uef().uef("total_sdcard_storage", gb.wk());
            com.bytedance.sdk.openadsdk.core.yo.uef().uef("is_root", gb.bs() ? 1 : 0);
            if (TextUtils.isEmpty(zjm())) {
                try {
                    Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
                    uef = "unity";
                } catch (ClassNotFoundException unused) {
                    uef = "native";
                }
                com.bytedance.sdk.openadsdk.core.yo.uef().uef("framework_name", uef);
            }
            wrv();
            dhk(contextUef);
            f26124ab = orq(contextUef);
            bcc.uef(contextUef);
            bs();
        }
    }

    private static void gsd(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new ContentObserver(null) { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.3
            @Override // android.database.ContentObserver
            public void onChange(boolean z2) {
                super.onChange(z2);
                DeviceUtils.tpx(applicationContext);
            }
        });
    }

    private static int gzw(Context context) {
        try {
            String str = Build.MANUFACTURER;
            return str.equalsIgnoreCase("XIAOMI") ? Settings.System.getInt(context.getContentResolver(), "POWER_SAVE_MODE_OPEN") == 1 ? 1 : 0 : (str.equalsIgnoreCase("HUAWEI") && Settings.System.getInt(context.getContentResolver(), "SmartModeStatus") == 4) ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int ivm(Context context) {
        if (!wrv.get()) {
            wk(context);
        }
        return dj;
    }

    public static String lw(Context context) {
        if (!wrv.get()) {
            wk(context);
        }
        return zjm;
    }

    private static int oib(Context context) {
        return f26124ab;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int orq(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            String str = Build.MANUFACTURER;
            if (!str.equalsIgnoreCase("XIAOMI") && !str.equalsIgnoreCase("HUAWEI")) {
                return ((PowerManager) context.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
            }
            return gzw(context);
        } catch (Throwable unused) {
            return 0;
        }
    }

    private static float sy(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void tpx(Context context) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        km.yo((Runnable) new com.bytedance.sdk.component.bcc.oa.yo("DeviceUtils_get_low_power_mode") { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.2
            @Override // java.lang.Runnable
            public void run() {
                int unused = DeviceUtils.f26124ab = DeviceUtils.orq(applicationContext);
            }
        });
    }

    public static void wrv() {
        try {
            int ringerMode = ((AudioManager) com.bytedance.sdk.openadsdk.core.sy.uef().getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getRingerMode();
            if (ringerMode == 2) {
                bcc = 1;
            } else if (ringerMode == 1) {
                bcc = 2;
            } else {
                bcc = 0;
            }
        } catch (Throwable unused) {
        }
    }

    public static JSONObject xs(Context context) {
        return uef(context, false);
    }

    public static int zjm(Context context) {
        return bcc;
    }

    private static int ab(Context context) {
        int i5;
        try {
            i5 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } catch (Throwable unused) {
        }
        if (i5 == 32) {
            return 1;
        }
        return i5 == 16 ? 0 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void bs() {
        if (com.bytedance.sdk.openadsdk.core.sy.moa().pz("bt_id")) {
            try {
                if (dhk == null) {
                    synchronized (sy) {
                        try {
                            if (dhk == null) {
                                dhk = uef(PglSupport.getBootid(), com.bytedance.sdk.openadsdk.core.yo.uef().oa("bt_id", ""), "bt_id");
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable unused) {
                dhk = "";
            }
        }
    }

    public static int cz() {
        return cz;
    }

    public static int moa(Context context) {
        if (yo(context)) {
            return 3;
        }
        return oa(context) ? 2 : 1;
    }

    private static String oib() {
        try {
            if (oib == null) {
                synchronized (sy) {
                    try {
                        if (oib == null) {
                            oib = uef(String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()), com.bytedance.sdk.openadsdk.core.yo.uef().oa("bt_time", ""), "bt_time");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Throwable unused) {
            oib = "";
        }
        return oib;
    }

    private static String sy() {
        try {
            return dhk == null ? com.bytedance.sdk.openadsdk.core.yo.uef().oa("bt_id", "") : dhk;
        } catch (Throwable unused) {
            return "";
        }
    }

    private static void wk(Context context) {
        if (context == null || !wrv.compareAndSet(false, true)) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.gzw.lw.uef("gp_v_enable", 0) == 1) {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 0);
                zjm = packageInfo.versionName;
                dj = packageInfo.versionCode;
            }
        } catch (Throwable unused) {
        }
    }

    public static int xs() {
        return cq;
    }

    public static boolean yo(Context context) {
        return (context.getResources().getConfiguration().uiMode & 15) == 4;
    }

    public static String zjm() {
        if (TextUtils.isEmpty(uef)) {
            uef = com.bytedance.sdk.openadsdk.core.yo.uef().oa("framework_name", "");
        }
        return uef;
    }

    public static int bcc() {
        return dz;
    }

    public static boolean oa() {
        if (SystemClock.elapsedRealtime() - xs >= 20000) {
            xs = SystemClock.elapsedRealtime();
            try {
                PowerManager powerManager = (PowerManager) com.bytedance.sdk.openadsdk.core.sy.uef().getSystemService("power");
                if (powerManager != null) {
                    ivm = powerManager.isInteractive();
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.dhk.yo("TTAD.DeviceUtils", th.getMessage());
            }
        }
        return ivm;
    }

    private static void yo(JSONObject jSONObject) throws JSONException {
        jSONObject.put("model", Build.MODEL);
        com.bytedance.sdk.openadsdk.tpx.uef.oa.uef.uef().uef(jSONObject);
    }

    public static int ivm() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) com.bytedance.sdk.openadsdk.core.sy.uef().getSystemService("accessibility");
        if (accessibilityManager == null) {
            return -1;
        }
        return accessibilityManager.isEnabled() ? 1 : 0;
    }

    public static float lw() {
        int i5 = -1;
        try {
            Context contextUef = com.bytedance.sdk.openadsdk.core.sy.uef();
            if (contextUef != null) {
                i5 = Settings.System.getInt(contextUef.getContentResolver(), "screen_brightness", -1);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("TTAD.DeviceUtils", th.getMessage());
        }
        if (i5 < 0) {
            return -1.0f;
        }
        return Math.round((i5 / 255.0f) * 10.0f) / 10.0f;
    }

    public static String moa() {
        String languageTag = Locale.getDefault().toLanguageTag();
        return !TextUtils.isEmpty(languageTag) ? languageTag : "";
    }

    public static void uef(Context context) {
        if (yo) {
            return;
        }
        try {
            oa oaVar = new oa();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            context.getApplicationContext().registerReceiver(oaVar, intentFilter);
            yo = true;
        } catch (Throwable unused) {
        }
    }

    public static int yo() {
        return com.bytedance.sdk.openadsdk.core.yo.uef().oa("limit_ad_track", -1);
    }

    public static void wrv(Context context) {
        Context applicationContext;
        if (lw || context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        try {
            if (!Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                uef.oa(applicationContext);
            } else {
                gsd(applicationContext);
            }
            lw = true;
        } catch (Throwable unused) {
        }
    }

    public static boolean oa(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    private static void oa(JSONObject jSONObject) throws JSONException {
        yo(jSONObject);
    }

    public static long uef() {
        return f26125oa;
    }

    public static JSONObject uef(Context context, boolean z2) throws JSONException {
        String strZjm;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_adb_status", bcc(context));
            oa(jSONObject);
            jSONObject.put("type", moa(context));
            jSONObject.put("os", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("conn_type", gb.bcc(context));
            jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.moa.yo());
            jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.moa.oa());
            jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.moa.moa());
            jSONObject.put("screen_scale", af.ivm(context));
            jSONObject.put("density", af.bcc(context));
            jSONObject.put("screen_width", af.yo(context));
            jSONObject.put("screen_height", af.lw(context));
            jSONObject.put("sec_did", com.bytedance.sdk.openadsdk.core.wrv.yo.ivm());
            com.bytedance.sdk.openadsdk.core.settings.dj djVarMoa = com.bytedance.sdk.openadsdk.core.sy.moa();
            if (djVarMoa.pz("boot")) {
                jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                jSONObject.put("power_on_time", String.valueOf(SystemClock.elapsedRealtime()));
            }
            jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.cq.yo(context));
            jSONObject.put("rom_version", pz.uef());
            jSONObject.put("sys_compiling_time", com.bytedance.sdk.openadsdk.core.cq.oa(context));
            jSONObject.put("timezone", gb.ue());
            jSONObject.put("language", com.bytedance.sdk.openadsdk.core.cq.oa());
            jSONObject.put("carrier_name", ku.uef());
            if (z2) {
                strZjm = gb.uef(context);
                jSONObject.put("board", Build.BOARD);
                jSONObject.put("device_city", gb.gsd());
                uef(jSONObject);
            } else {
                strZjm = gb.zjm();
            }
            jSONObject.put("total_mem", String.valueOf(Long.parseLong(strZjm) * RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE));
            jSONObject.put("locale_language", moa());
            jSONObject.put("screen_bright", Math.ceil(lw() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", !oa() ? 1 : 0);
            jSONObject.put("cpu_num", zjm.oa());
            jSONObject.put("cpu_max_freq", zjm.yo());
            jSONObject.put("cpu_min_freq", zjm.moa());
            xs.uef uefVarUef = xs.uef();
            jSONObject.put("battery_remaining_pct", (int) uefVarUef.f26171oa);
            jSONObject.put("is_charging", uefVarUef.uef);
            jSONObject.put("total_space", String.valueOf(gb.oa(context)));
            jSONObject.put("free_space_in", String.valueOf(gb.cq()));
            jSONObject.put("sdcard_size", String.valueOf(gb.dz()));
            jSONObject.put("rooted", gb.ab());
            jSONObject.put("enable_assisted_clicking", ivm());
            jSONObject.put("force_language", com.bytedance.sdk.component.utils.orq.uef(context, "tt_choose_language"));
            jSONObject.put("airplane", cz(context));
            jSONObject.put("darkmode", ab(context));
            jSONObject.put("headset", bs(context));
            jSONObject.put("ringmute", zjm(context));
            jSONObject.put("screenscale", sy(context));
            jSONObject.put("volume", bcc());
            jSONObject.put("low_power_mode", oib(context));
            jSONObject.put("enable_draw_feed", gb.fz());
            if (z2) {
                bcc.uef(jSONObject, context);
                jSONObject.put("gp_v_name", lw(context));
                jSONObject.put("gp_v_code", ivm(context));
            }
            if (djVarMoa.pz("mnc")) {
                jSONObject.put("mnc", ku.yo());
            }
            if (djVarMoa.pz("mcc")) {
                jSONObject.put("mcc", ku.oa());
            }
            jSONObject.put("act", com.bytedance.sdk.openadsdk.core.uef.uef.oa(context));
            jSONObject.put("act_event", com.bytedance.sdk.openadsdk.core.uef.uef.uef());
            String strYo = com.bytedance.sdk.openadsdk.core.wrv.yo.yo();
            com.bytedance.sdk.openadsdk.core.wrv.yo.moa();
            if (!TextUtils.isEmpty(strYo)) {
                jSONObject.put("sof_chara", strYo);
            }
            String strOa = com.bytedance.sdk.openadsdk.oib.moa.uef.oa("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            if (!strOa.isEmpty()) {
                jSONObject.put("ipv6", strOa);
            }
            jSONObject.put("is_multi", !com.bytedance.sdk.component.utils.tpx.uef(com.bytedance.sdk.openadsdk.core.sy.uef()));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static void dj(Context context) {
        AudioInfoReceiver.oa(context);
    }

    public static void uef(JSONObject jSONObject) {
        try {
            com.bytedance.sdk.openadsdk.core.settings.dj djVarMoa = com.bytedance.sdk.openadsdk.core.sy.moa();
            if (djVarMoa.pz("boot")) {
                jSONObject.put("bt_time", oib());
            } else {
                jSONObject.put("bt_time", "not_allowed");
                com.bytedance.sdk.openadsdk.core.yo.uef().uef("bt_time");
            }
            if (djVarMoa.pz("bt_id")) {
                jSONObject.put("bt_id", sy());
            } else {
                jSONObject.put("bt_id", "not_allowed");
                com.bytedance.sdk.openadsdk.core.yo.uef().uef("bt_id");
            }
        } catch (Throwable unused) {
        }
    }

    private static String uef(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (!TextUtils.isEmpty(str2)) {
            String[] strArrSplit = str2.split(",");
            int iUe = com.bytedance.sdk.openadsdk.core.settings.dj.oa().ue();
            if (iUe != 1) {
                if (str.equals(strArrSplit[0]) || ("bt_time".equals(str3) && Math.abs(Long.parseLong(str) - Long.parseLong(strArrSplit[0])) < 1000)) {
                    return str2;
                }
                if (strArrSplit.length < iUe) {
                    str = a.g(str, ",", str2);
                } else {
                    int iLastIndexOf = str2.lastIndexOf(",");
                    if (iLastIndexOf != -1) {
                        str = a.g(str, ",", str2.substring(0, iLastIndexOf));
                    }
                }
            }
        }
        com.bytedance.sdk.openadsdk.core.yo.uef().uef(str3, str);
        return str;
    }
}
