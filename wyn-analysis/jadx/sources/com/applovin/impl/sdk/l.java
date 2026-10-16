package com.applovin.impl.sdk;

import A7.N0;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.app.ApplicationStartInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.applovin.impl.AbstractC1654o0;
import com.applovin.impl.AbstractC1656p0;
import com.applovin.impl.AbstractC1659r0;
import com.applovin.impl.AbstractC1668v;
import com.applovin.impl.C1643j;
import com.applovin.impl.C1658q0;
import com.applovin.impl.a5;
import com.applovin.impl.c4;
import com.applovin.impl.d2;
import com.applovin.impl.e6;
import com.applovin.impl.j5;
import com.applovin.impl.l7;
import com.applovin.impl.n7;
import com.applovin.impl.o7;
import com.applovin.impl.o8;
import com.applovin.impl.p5;
import com.applovin.impl.r4;
import com.applovin.impl.s6;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.v4;
import com.applovin.impl.y4;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.device.MimeTypes;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.tika.metadata.Font;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class l {

    /* renamed from: j, reason: collision with root package name */
    private static String f23075j;
    private static String k;

    /* renamed from: l, reason: collision with root package name */
    private static final AtomicReference f23076l = new AtomicReference();

    /* renamed from: m, reason: collision with root package name */
    private static final AtomicReference f23077m = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    private final k f23078a;

    /* renamed from: b, reason: collision with root package name */
    private final o f23079b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f23080c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f23081d;

    /* renamed from: f, reason: collision with root package name */
    private final Map f23083f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f23085h;

    /* renamed from: e, reason: collision with root package name */
    private final Object f23082e = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final Object f23084g = new Object();

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference f23086i = new AtomicReference();

    public class a implements p5.a {
        public a() {
        }

        @Override // com.applovin.impl.p5.a
        public void a(AbstractC1668v.a aVar) {
            l.f23076l.set(aVar);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f23088a;

        /* renamed from: b, reason: collision with root package name */
        public final int f23089b;

        public b(String str, int i5) {
            this.f23088a = str;
            this.f23089b = i5;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f23090a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f23091b = -1;

        /* renamed from: c, reason: collision with root package name */
        public Boolean f23092c = null;
    }

    public l(k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f23078a = kVar;
        this.f23079b = kVar.O();
        this.f23080c = k.o();
        this.f23081d = C();
        this.f23083f = B();
    }

    private String A() {
        AudioManager audioManager = (AudioManager) this.f23080c.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (AbstractC1654o0.f()) {
            for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                sb2.append(audioDeviceInfo.getType());
                sb2.append(",");
            }
        } else {
            if (audioManager.isWiredHeadsetOn()) {
                sb2.append("3,");
            }
            if (audioManager.isBluetoothScoOn()) {
                sb2.append("7,");
            }
            if (audioManager.isBluetoothA2dpOn()) {
                sb2.append(8);
            }
        }
        if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        String string = sb2.toString();
        if (TextUtils.isEmpty(string) && o.a()) {
            this.f23079b.a("DataCollector", "No sound outputs detected");
        }
        return string;
    }

    private Map B() {
        PackageInfo packageInfo;
        HashMap map = new HashMap();
        PackageManager packageManager = this.f23080c.getPackageManager();
        ApplicationInfo applicationInfo = this.f23080c.getApplicationInfo();
        long jLastModified = new File(applicationInfo.sourceDir).lastModified();
        try {
            packageInfo = packageManager.getPackageInfo(this.f23080c.getPackageName(), 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        String strA = a(applicationInfo.packageName, packageManager, this.f23078a);
        String strA2 = a(applicationInfo.packageName, packageManager);
        map.put("app_name", packageManager.getApplicationLabel(applicationInfo));
        map.put("app_version", packageInfo != null ? packageInfo.versionName : "");
        map.put("app_version_code", Integer.valueOf(packageInfo != null ? packageInfo.versionCode : -1));
        map.put("installer_name", StringUtils.emptyIfNull(strA));
        map.put("originating_name", StringUtils.emptyIfNull(strA2));
        map.put("tg", n7.a(this.f23078a));
        map.put("debug", Boolean.valueOf(o7.c(this.f23078a)));
        map.put("ia", Long.valueOf(jLastModified));
        map.put("alts_ms", Long.valueOf(k.n()));
        map.put("session_id", this.f23078a.n0().getSessionId());
        map.put("j8", Boolean.valueOf(k.G0()));
        map.put("ps_tpg", Boolean.valueOf(r4.d(this.f23080c)));
        map.put("ps_apg", Boolean.valueOf(r4.b(this.f23080c)));
        map.put("ps_capg", Boolean.valueOf(r4.c(this.f23080c)));
        map.put("ps_aipg", Boolean.valueOf(r4.a(this.f23080c)));
        k kVar = this.f23078a;
        a5 a5Var = a5.f20955h;
        Long l10 = (Long) kVar.a(a5Var);
        if (l10 != null) {
            map.put("ia_v2", l10);
        } else {
            this.f23078a.b(a5Var, Long.valueOf(jLastModified));
        }
        map.put("sdk_version", AppLovinSdk.VERSION);
        map.put("omid_sdk_version", this.f23078a.e0().c());
        CollectionUtils.putStringIfValid("ad_review_sdk_version", C1643j.b(), map);
        map.put("api_did", this.f23078a.a(y4.f23788f));
        map.put("first_install_v3_ms", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : "");
        CollectionUtils.putLongIfValid("last_launch_ms", this.f23078a.L(), map);
        CollectionUtils.putLongIfValid("app_launch_count", Long.valueOf(this.f23078a.M()), map);
        map.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        if (AbstractC1654o0.g()) {
            map.put("min_sdk", Integer.valueOf(applicationInfo.minSdkVersion));
        }
        if (this.f23078a.I0()) {
            map.put("unity_version", o7.a(this.f23078a.o0()));
        }
        List listI = i();
        if (!CollectionUtils.isEmpty(listI)) {
            map.put("application_start_info", listI);
        }
        List listG = g();
        if (!CollectionUtils.isEmpty(listG)) {
            map.put("application_exit_info", listG);
        }
        if (AbstractC1654o0.h()) {
            map.put("instant_app", Boolean.valueOf(packageManager.isInstantApp()));
        }
        return map;
    }

    private Map C() {
        HashMap map = new HashMap(35);
        map.put("api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        map.put("brand", Build.MANUFACTURER);
        map.put("brand_name", Build.BRAND);
        map.put("hardware", Build.HARDWARE);
        map.put("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()));
        map.put("aida", Boolean.valueOf(AbstractC1668v.a()));
        map.put("locale", Locale.getDefault().toString());
        map.put("model", Build.MODEL);
        map.put("os", Build.VERSION.RELEASE);
        map.put("platform", z());
        map.put("revision", Build.DEVICE);
        map.put("tz_offset", Double.valueOf(D()));
        map.put("gy", Boolean.valueOf(t()));
        map.put("country_code", n());
        map.put("mcc", x());
        map.put("mnc", y());
        map.put("carrier", l());
        map.put("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.f23080c)));
        map.put("pc", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
        map.put("hdr", S());
        map.put("supported_abis", N());
        map.put("type", Build.TYPE);
        map.put(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT);
        DisplayMetrics displayMetrics = this.f23080c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            map.put("adns", Float.valueOf(displayMetrics.density));
            map.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            map.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            map.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            AbstractC1654o0.b bVarA = AbstractC1654o0.a(this.f23080c, this.f23078a);
            if (bVarA != null) {
                map.put("tl_cr", Integer.valueOf(bVarA.c()));
                map.put("tr_cr", Integer.valueOf(bVarA.d()));
                map.put("bl_cr", Integer.valueOf(bVarA.a()));
                map.put("br_cr", Integer.valueOf(bVarA.b()));
            }
        }
        map.put("bt_ms", Long.valueOf(k()));
        map.put("tbalsi_ms", Long.valueOf(this.f23078a.K() - k.n()));
        CollectionUtils.putBooleanIfValid("psase", Boolean.valueOf(r4.e(this.f23080c)), map);
        CollectionUtils.putStringIfValid("process_name", o7.c(this.f23080c), map);
        CollectionUtils.putBooleanIfValid("is_main_process", o7.i(this.f23080c), map);
        try {
            PackageInfo packageInfo = this.f23080c.getPackageManager().getPackageInfo("com.android.vending", 0);
            map.put("ps_version", packageInfo.versionName);
            map.put("ps_version_code", Integer.valueOf(packageInfo.versionCode));
        } catch (Throwable unused) {
            map.put("ps_version", "");
            map.put("ps_version_code", -1);
        }
        CollectionUtils.putBooleanIfValid("play_store_disabled", l7.a(this.f23080c), map);
        a(map);
        return map;
    }

    private double D() {
        return Math.round((TimeZone.getDefault().getOffset(new Date().getTime()) * 10.0d) / 3600000.0d) / 10.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x020b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x020b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019c A[Catch: all -> 0x0189, LOOP:2: B:56:0x019a->B:57:0x019c, LOOP_END, TryCatch #5 {all -> 0x0189, blocks: (B:34:0x00e6, B:46:0x0162, B:48:0x0168, B:51:0x018b, B:53:0x0194, B:55:0x0197, B:57:0x019c, B:58:0x01c9, B:59:0x01ce, B:61:0x01d4), top: B:100:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d4 A[Catch: all -> 0x0189, TRY_LEAVE, TryCatch #5 {all -> 0x0189, blocks: (B:34:0x00e6, B:46:0x0162, B:48:0x0168, B:51:0x018b, B:53:0x0194, B:55:0x0197, B:57:0x019c, B:58:0x01c9, B:59:0x01ce, B:61:0x01d4), top: B:100:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.json.JSONArray E() {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.l.E():org.json.JSONArray");
    }

    public static String I() {
        return k;
    }

    private Map K() {
        return o7.a(a((Map) null, true, false));
    }

    private JSONArray N() {
        if (AbstractC1654o0.e()) {
            return CollectionUtils.toJSONArray(Build.SUPPORTED_ABIS);
        }
        JSONArray jSONArray = new JSONArray();
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI);
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI2);
        return jSONArray;
    }

    private boolean O() {
        try {
            if (!b()) {
                if (!c()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private Boolean P() {
        if (AbstractC1654o0.j()) {
            return null;
        }
        return Boolean.valueOf(!CollectionUtils.isEmpty(o7.a("/proc/net/tcp", Collections.singletonList(":69A2"), this.f23078a)));
    }

    private boolean Q() {
        ConnectivityManager connectivityManager;
        if (!AbstractC1654o0.g() || (connectivityManager = (ConnectivityManager) this.f23080c.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            return connectivityManager.getRestrictBackgroundStatus() == 3;
        } catch (Throwable th) {
            this.f23078a.O();
            if (!o.a()) {
                return false;
            }
            this.f23078a.O().a("DataCollector", "Unable to collect constrained network info.", th);
            return false;
        }
    }

    private boolean R() {
        boolean z2 = this.f23080c.getResources().getConfiguration().keyboard == 2;
        PackageManager packageManager = this.f23080c.getPackageManager();
        return z2 && (packageManager.hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE") || packageManager.hasSystemFeature("android.hardware.type.pc"));
    }

    private Boolean S() {
        if (AbstractC1654o0.h()) {
            return Boolean.valueOf(this.f23080c.getResources().getConfiguration().isScreenHdr());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U() {
        this.f23086i.set(r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V() {
        Map mapX = X();
        List listW = W();
        synchronized (this.f23084g) {
            if (mapX != null) {
                try {
                    this.f23083f.putAll(mapX);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (listW != null) {
                this.f23083f.put("dl", listW);
            }
        }
    }

    private List W() {
        List listC = this.f23078a.c(y4.M4);
        if (CollectionUtils.isEmpty(listC)) {
            return null;
        }
        return o7.a("/proc/self/maps", listC, this.f23078a);
    }

    private Map X() {
        boolean z2;
        int i5;
        Throwable th;
        if (!((Boolean) this.f23078a.a(y4.f23639L4)).booleanValue()) {
            return null;
        }
        HashMap map = new HashMap();
        try {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            z2 = false;
            i5 = 0;
            while (it.hasNext()) {
                try {
                    for (StackTraceElement stackTraceElement : it.next().getValue()) {
                        String string = stackTraceElement.toString();
                        if (!z2 && string.contains("de.robv.android.xposed")) {
                            z2 = true;
                        }
                        if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit")) {
                            i5++;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.f23078a.D().b("DataCollector", "collectHookingSignals", th);
                    map.put("xpd", Boolean.valueOf(z2));
                    map.put("zi_count", Integer.valueOf(i5));
                    CollectionUtils.putBooleanIfValid("fpd", P(), map);
                    return map;
                }
            }
        } catch (Throwable th3) {
            z2 = false;
            i5 = 0;
            th = th3;
        }
        map.put("xpd", Boolean.valueOf(z2));
        map.put("zi_count", Integer.valueOf(i5));
        CollectionUtils.putBooleanIfValid("fpd", P(), map);
        return map;
    }

    private void Z() {
        this.f23078a.r0().a((j5) new s6(this.f23078a, "collectPostInitAppInfo", new A(this, 0)), e6.b.OTHER);
    }

    private List g() {
        ActivityManager activityManager;
        if (AbstractC1654o0.b()) {
            Integer num = (Integer) this.f23078a.a(y4.f23593F4);
            if (num.intValue() >= 0 && (activityManager = (ActivityManager) this.f23080c.getSystemService("activity")) != null) {
                List historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(((Boolean) this.f23078a.a(y4.f23601G4)).booleanValue() ? this.f23080c.getPackageName() : null, 0, num.intValue());
                if (CollectionUtils.isEmpty(historicalProcessExitReasons)) {
                    return Collections.EMPTY_LIST;
                }
                ArrayList arrayList = new ArrayList(historicalProcessExitReasons.size());
                Iterator it = historicalProcessExitReasons.iterator();
                while (it.hasNext()) {
                    ApplicationExitInfo applicationExitInfoE = N0.e(it.next());
                    HashMap map = new HashMap(13);
                    int reason = applicationExitInfoE.getReason();
                    map.put("reason", Integer.valueOf(reason));
                    String description = applicationExitInfoE.getDescription();
                    CollectionUtils.putStringIfValid("description", description, map);
                    map.put("timestamp", Long.valueOf(applicationExitInfoE.getTimestamp()));
                    map.put("status", Integer.valueOf(applicationExitInfoE.getStatus()));
                    map.put("importance", Integer.valueOf(applicationExitInfoE.getImportance()));
                    map.put("pss", Long.valueOf(applicationExitInfoE.getPss()));
                    map.put("rss", Long.valueOf(applicationExitInfoE.getRss()));
                    CollectionUtils.putStringIfValid("process_name", applicationExitInfoE.getProcessName(), map);
                    map.put("pid", Integer.valueOf(applicationExitInfoE.getPid()));
                    map.put("ruid", Integer.valueOf(applicationExitInfoE.getRealUid()));
                    map.put("puid", Integer.valueOf(applicationExitInfoE.getPackageUid()));
                    map.put("duid", Integer.valueOf(applicationExitInfoE.getDefiningUid()));
                    String strA = a(applicationExitInfoE, reason);
                    if (StringUtils.isValidString(strA)) {
                        map.put("stack_trace", strA);
                        b(strA, reason, description);
                    }
                    arrayList.add(map);
                }
                return arrayList;
            }
        }
        return null;
    }

    private String h() {
        int orientation = AppLovinSdkUtils.getOrientation(this.f23080c);
        return orientation == 1 ? "portrait" : orientation == 2 ? "landscape" : "none";
    }

    private List i() {
        ActivityManager activityManager;
        if (!AbstractC1654o0.c()) {
            return null;
        }
        Integer num = (Integer) this.f23078a.a(y4.f23585E4);
        if (num.intValue() < 0 || (activityManager = (ActivityManager) this.f23080c.getSystemService("activity")) == null) {
            return null;
        }
        List historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(num.intValue());
        if (CollectionUtils.isEmpty(historicalProcessStartReasons)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(historicalProcessStartReasons.size());
        Iterator it = historicalProcessStartReasons.iterator();
        while (it.hasNext()) {
            ApplicationStartInfo applicationStartInfoB = y.b(it.next());
            HashMap map = new HashMap(11);
            map.put("reason", Integer.valueOf(applicationStartInfoB.getReason()));
            map.put("startup_state", Integer.valueOf(applicationStartInfoB.getStartupState()));
            map.put("start_type", Integer.valueOf(applicationStartInfoB.getStartType()));
            map.put("was_force_stopped", Boolean.valueOf(applicationStartInfoB.wasForceStopped()));
            map.put("startup_timestamps", applicationStartInfoB.getStartupTimestamps());
            CollectionUtils.putStringIfValid("process_name", applicationStartInfoB.getProcessName(), map);
            map.put("pid", Integer.valueOf(applicationStartInfoB.getPid()));
            map.put("ruid", Integer.valueOf(applicationStartInfoB.getRealUid()));
            map.put("puid", Integer.valueOf(applicationStartInfoB.getPackageUid()));
            map.put("duid", Integer.valueOf(applicationStartInfoB.getDefiningUid()));
            map.put("launch_mode", Integer.valueOf(applicationStartInfoB.getLaunchMode()));
            map.put("intent", a(applicationStartInfoB.getIntent()));
            arrayList.add(map);
        }
        return arrayList;
    }

    private c j() {
        c cVar = new c();
        Intent intentRegisterReceiver = this.f23080c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : -1;
        int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra <= 0 || intExtra2 <= 0) {
            cVar.f23091b = -1;
        } else {
            cVar.f23091b = (int) ((intExtra / intExtra2) * 100.0f);
        }
        cVar.f23090a = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1;
        cVar.f23092c = Boolean.valueOf(Settings.Global.getInt(this.f23080c.getContentResolver(), "stay_on_while_plugged_in", -1) > 0);
        return cVar;
    }

    private long k() {
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        Long l10 = (Long) this.f23078a.a(y4.f23632K4);
        return l10.longValue() * (jCurrentTimeMillis / l10.longValue());
    }

    private String l() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f23080c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            return telephonyManager.getNetworkOperatorName();
        } catch (Throwable th) {
            if (!o.a()) {
                return "";
            }
            this.f23079b.a("DataCollector", "Unable to collect carrier", th);
            return "";
        }
    }

    private String n() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f23080c.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH) : "";
    }

    private String o() {
        ActivityInfo activityInfo;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://"));
        ResolveInfo resolveInfoResolveActivity = this.f23080c.getPackageManager().resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity != null && (activityInfo = resolveInfoResolveActivity.activityInfo) != null) {
            k = activityInfo.packageName;
        }
        return k;
    }

    private String q() {
        if (!AbstractC1654o0.g()) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            LocaleList locales = this.f23080c.getResources().getConfiguration().getLocales();
            for (int i5 = 0; i5 < locales.size(); i5++) {
                sb2.append(locales.get(i5));
                sb2.append(",");
            }
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    private Float r() {
        Float f10 = (Float) this.f23078a.a(y4.f23792f4);
        Float fB = this.f23078a.p().b();
        if (fB == null) {
            return null;
        }
        return Float.valueOf(f10.floatValue() * fB.floatValue());
    }

    private float s() {
        try {
            return Settings.System.getFloat(this.f23080c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e7) {
            if (!o.a()) {
                return -1.0f;
            }
            this.f23079b.a("DataCollector", "Error collecting font scale", e7);
            return -1.0f;
        }
    }

    private boolean t() {
        SensorManager sensorManager = (SensorManager) this.f23080c.getSystemService("sensor");
        return (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
    }

    private Map u() {
        HashMap map = new HashMap();
        CollectionUtils.putIntegerIfValid("IABTCF_gdprApplies", this.f23078a.s0().g(), map);
        CollectionUtils.putStringIfValid(AndroidTcfDataSource.TCF_TCSTRING_KEY, this.f23078a.s0().j(), map);
        CollectionUtils.putStringIfValid("IABTCF_AddtlConsent", this.f23078a.s0().c(), map);
        return map;
    }

    private Boolean v() {
        AudioManager audioManager = (AudioManager) this.f23080c.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isMusicActive());
    }

    private Boolean w() {
        AudioManager audioManager = (AudioManager) this.f23080c.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isSpeakerphoneOn());
    }

    private String x() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f23080c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(0, Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!o.a()) {
                return "";
            }
            this.f23079b.a("DataCollector", "Unable to collect mobile country code", th);
            return "";
        }
    }

    private String y() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f23080c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!o.a()) {
                return "";
            }
            this.f23079b.a("DataCollector", "Unable to collect mobile network code", th);
            return "";
        }
    }

    public Map F() {
        Map map;
        synchronized (this.f23084g) {
            map = CollectionUtils.map(this.f23083f);
        }
        String str = StringUtils.isValidString(f23075j) ? f23075j : this.f23080c.getApplicationInfo().packageName;
        map.put("package_name", str);
        map.put("vz", StringUtils.toShortSHA1Hash(str));
        map.put("first_install", Boolean.valueOf(this.f23078a.D0()));
        map.put("first_install_v2", Boolean.valueOf(!this.f23078a.A0()));
        map.put("test_ads", Boolean.valueOf(this.f23085h));
        map.put("test_mode", Integer.valueOf(this.f23078a.t0().c() ? 1 : 0));
        map.put("muted", Boolean.valueOf(this.f23078a.o0().isMuted()));
        if (((Boolean) this.f23078a.a(y4.f23592F3)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.f23078a.x0().e(), map);
        }
        if (((Boolean) this.f23078a.a(y4.I3)).booleanValue()) {
            map.put("compass_random_token", this.f23078a.u());
        }
        if (((Boolean) this.f23078a.a(y4.f23631K3)).booleanValue()) {
            map.put("applovin_random_token", this.f23078a.i0());
        }
        if (((Boolean) this.f23078a.a(y4.f23661O3)).booleanValue()) {
            map.put("art", this.f23078a.r());
        }
        map.putAll(u());
        if (this.f23078a.h0() != null) {
            CollectionUtils.putJsonArrayIfValid("ps_topics", this.f23078a.h0().a(), map);
        }
        CollectionUtils.putStringIfValid("template_browser_package_name", (String) this.f23078a.q0().a(a5.f20949T, null), map);
        return map;
    }

    public b G() {
        return (b) f23077m.get();
    }

    public String H() {
        String strEncodeToString = Base64.encodeToString(new JSONObject(K()).toString().getBytes(Charset.defaultCharset()), 2);
        return ((Boolean) this.f23078a.a(y4.f23862n5)).booleanValue() ? v4.b(strEncodeToString, o7.a(this.f23078a), v4.a.a(((Integer) this.f23078a.a(y4.f23871o5)).intValue()), this.f23078a.j0(), this.f23078a) : strEncodeToString;
    }

    public String J() {
        ActivityManager activityManager = (ActivityManager) this.f23080c.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        return activityManager.getDeviceConfigurationInfo().getGlEsVersion();
    }

    public Map L() {
        Map map;
        synchronized (this.f23084g) {
            map = CollectionUtils.map(this.f23083f);
        }
        return map;
    }

    public Map M() {
        Map map;
        synchronized (this.f23082e) {
            map = CollectionUtils.map(this.f23081d);
        }
        return map;
    }

    public boolean T() {
        return this.f23085h;
    }

    public void Y() {
        e6 e6VarR0 = this.f23078a.r0();
        p5 p5Var = new p5(this.f23078a, new a());
        e6.b bVar = e6.b.OTHER;
        e6VarR0.a((j5) p5Var, bVar);
        this.f23078a.r0().a((j5) new s6(this.f23078a, true, "setDeviceVolume", new A(this, 1)), bVar);
    }

    public void a0() {
        synchronized (this.f23082e) {
            a(this.f23081d);
        }
        Z();
    }

    public Map e() {
        HashMap map = new HashMap();
        map.put("sc", this.f23078a.a(y4.f23838l));
        map.put("sc2", this.f23078a.a(y4.f23847m));
        map.put("sc3", this.f23078a.a(y4.f23856n));
        map.put("server_installed_at", this.f23078a.a(y4.f23865o));
        CollectionUtils.putStringIfValid("persisted_data", (String) this.f23078a.a(a5.f20938H), map);
        return map;
    }

    public AbstractC1668v.a f() {
        AbstractC1668v.a aVarB = AbstractC1668v.b(this.f23080c);
        if (aVarB == null) {
            return new AbstractC1668v.a();
        }
        if (((Boolean) this.f23078a.a(y4.f23576D3)).booleanValue()) {
            if (aVarB.c() && !((Boolean) this.f23078a.a(y4.C3)).booleanValue()) {
                aVarB.a("");
            }
            f23076l.set(aVarB);
        } else {
            aVarB = new AbstractC1668v.a();
        }
        List<String> testDeviceAdvertisingIds = this.f23078a.J() != null ? this.f23078a.J().getTestDeviceAdvertisingIds() : null;
        if (testDeviceAdvertisingIds == null) {
            this.f23085h = false;
            return aVarB;
        }
        String strA = aVarB.a();
        if (StringUtils.isValidString(strA)) {
            this.f23085h = testDeviceAdvertisingIds.contains(strA);
        }
        b bVarG = G();
        String str = bVarG != null ? bVarG.f23088a : null;
        if (StringUtils.isValidString(str)) {
            this.f23085h = testDeviceAdvertisingIds.contains(str) | this.f23085h;
        }
        return aVarB;
    }

    public Map m() {
        HashMap map = new HashMap();
        c4 c4VarD0 = this.f23078a.d0();
        Deque dequeB = c4VarD0.b();
        if (!CollectionUtils.isEmpty(dequeB)) {
            map.put("network_throughput_info", dequeB);
        }
        CollectionUtils.putLongIfValid("network_throughput_kbps", c4VarD0.a(), map);
        C1658q0.d dVarA = this.f23078a.w().a();
        if (dVarA != null) {
            map.put("lrm_ts_ms", String.valueOf(dVarA.c()));
            map.put("lrm_url", dVarA.d());
            map.put("lrm_ct_ms", String.valueOf(dVarA.a()));
            map.put("lrm_rs", String.valueOf(dVarA.b()));
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    public Map p() throws Settings.SettingNotFoundException {
        return a(false);
    }

    public String z() {
        return AppLovinSdkUtils.isFireOS(this.f23080c) ? "fireos" : "android";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        try {
            String strH = H();
            if (StringUtils.isValidString(strH)) {
                this.f23078a.O();
                if (o.a()) {
                    this.f23078a.O().a("DataCollector", "Successfully retrieved bid token");
                }
                t2.a(appLovinBidTokenCollectionListener, strH);
                return;
            }
            this.f23078a.O();
            if (o.a()) {
                this.f23078a.O().b("DataCollector", "Empty bid token");
            }
            t2.b(appLovinBidTokenCollectionListener, "Empty bid token");
        } catch (Throwable th) {
            if (o.a()) {
                this.f23079b.a("DataCollector", "Failed to collect bid token", th);
            }
            this.f23078a.D().a("DataCollector", "collectBidToken", th);
            t2.b(appLovinBidTokenCollectionListener, "Failed to collect bid token");
        }
    }

    private boolean c() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i5 = 0; i5 < 9; i5++) {
            if (new File(c(strArr[i5])).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long d() {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.l.d():long");
    }

    public void a(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        this.f23078a.r0().a((j5) new s6(this.f23078a, ((Boolean) this.f23078a.a(y4.f23692S3)).booleanValue(), "DataCollector", new u(4, this, appLovinBidTokenCollectionListener)), e6.b.CORE);
    }

    public Map a(Map map, boolean z2, boolean z10) throws Settings.SettingNotFoundException {
        HashMap map2 = new HashMap(64);
        Map mapA = a(z2);
        Map mapF = F();
        Map mapM = m();
        Map mapL0 = this.f23078a.l0();
        if (z10) {
            map2.put("device_info", mapA);
            map2.put("app_info", mapF);
            if (mapM != null) {
                map2.put("connection_info", mapM);
            }
            if (map != null) {
                map2.put("ad_info", map);
            }
            if (!CollectionUtils.isEmpty(mapL0)) {
                map2.put("segments", mapL0);
            }
        } else {
            map2.putAll(mapA);
            map2.putAll(mapF);
            if (mapM != null) {
                map2.putAll(mapM);
            }
            if (map != null) {
                map2.putAll(map);
            }
            if (!CollectionUtils.isEmpty(mapL0)) {
                map2.putAll(mapL0);
            }
        }
        map2.put("accept", "custom_size,launch_app,video");
        map2.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.f23078a.V(), map2);
        CollectionUtils.putStringIfValid("mediation_provider_v2", this.f23078a.C(), map2);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.f23078a.a(y4.f23676Q3), map2);
        CollectionUtils.putLongIfValid("tssf_ms", Long.valueOf(this.f23078a.u0()), map2);
        if (!((Boolean) this.f23078a.a(y4.f23844l5)).booleanValue()) {
            map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f23078a.j0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.f23078a.q(), map2);
        map2.putAll(e());
        map2.put("rid", UUID.randomUUID().toString());
        return map2;
    }

    private String c(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i5 = 0; i5 < length; i5++) {
            cArr[i5] = str.charAt(i5);
            for (int i10 = 9; i10 >= 0; i10--) {
                cArr[i5] = (char) (cArr[i5] ^ iArr[i10]);
            }
        }
        return new String(cArr);
    }

    private void b(String str, int i5, String str2) {
        this.f23078a.r0().a((j5) new s6(this.f23078a, "reportAppExitInfoStackTrace", new Uc.e(i5, 1, this, str, str2)), e6.b.OTHER);
    }

    private int b(String str) {
        try {
            return Settings.Secure.getInt(this.f23080c.getContentResolver(), str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private boolean b() {
        String str = Build.TAGS;
        return str != null && str.contains(c("lz}$blpz"));
    }

    private Map a(boolean z2) throws Settings.SettingNotFoundException {
        Map map;
        synchronized (this.f23082e) {
            map = CollectionUtils.map(this.f23081d);
        }
        return a(map, z2);
    }

    private void a(Map map) {
        JSONArray jSONArrayE;
        if (((Boolean) this.f23078a.a(y4.f23746Z3)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(d()));
        }
        if (((Boolean) this.f23078a.a(y4.f23754a4)).booleanValue() && !map.containsKey(Font.PREFIX_FONT_META)) {
            map.put(Font.PREFIX_FONT_META, Float.valueOf(s()));
        }
        if (((Boolean) this.f23078a.a(y4.f23810h4)).booleanValue() && o7.d(this.f23078a)) {
            o8.a(this.f23078a);
        }
        if (((Boolean) this.f23078a.a(y4.f23903s4)).booleanValue()) {
            o8.b(this.f23078a);
        }
        if (((Boolean) this.f23078a.a(y4.f23801g4)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (((Boolean) this.f23078a.a(y4.f23769c4)).booleanValue() && !map.containsKey("network_restricted")) {
            map.put("network_restricted", Boolean.valueOf(Q()));
        }
        map.put("is_pc", Boolean.valueOf(R()));
        if (((Boolean) this.f23078a.a(y4.f23919u4)).booleanValue()) {
            CollectionUtils.putStringIfValid("oglv", J(), map);
        }
        if (((Boolean) this.f23078a.a(y4.f23641L6)).booleanValue()) {
            CollectionUtils.putStringIfValid("dbpn", o(), map);
        }
        if (!((Boolean) this.f23078a.a(y4.f23648M6)).booleanValue() || map.containsKey("video_decoders") || (jSONArrayE = E()) == null || jSONArrayE.length() <= 0) {
            return;
        }
        map.put("video_decoders", jSONArrayE);
    }

    private Map a(Map map, boolean z2) throws Settings.SettingNotFoundException {
        AbstractC1668v.a aVarF;
        PowerManager powerManager;
        Map map2 = CollectionUtils.map(map);
        Point pointB = AbstractC1654o0.b(this.f23080c);
        map2.put("dx", Integer.valueOf(pointB.x));
        map2.put("dy", Integer.valueOf(pointB.y));
        if (this.f23080c.getResources().getDisplayMetrics() != null) {
            map2.put("screen_size_in", Double.valueOf(Math.sqrt(Math.pow(pointB.y, 2.0d) + Math.pow(pointB.x, 2.0d)) / r4.xdpi));
        }
        map2.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f23080c)));
        if (((Boolean) this.f23078a.a(y4.f23624J4)).booleanValue()) {
            String strB = o7.b(this.f23080c);
            Map mapA = AbstractC1654o0.a(strB);
            if (mapA != null) {
                map2.put("display_cutout_insets", mapA);
            }
            Map mapC = AbstractC1654o0.c(strB);
            if (mapC != null) {
                map2.put("status_bar_insets", mapC);
            }
            Map mapB = AbstractC1654o0.b(strB);
            if (mapB != null) {
                map2.put("nav_bar_insets", mapB);
            }
        }
        if (z2) {
            aVarF = (AbstractC1668v.a) f23076l.get();
            if (aVarF != null) {
                Y();
            } else if (o7.h()) {
                aVarF = new AbstractC1668v.a();
                map2.put("inc", Boolean.TRUE);
            } else {
                aVarF = f();
            }
        } else {
            aVarF = f();
        }
        String strA = aVarF.a();
        if (StringUtils.isValidString(strA)) {
            map2.put("idfa", strA);
        }
        map2.put("dnt", Boolean.valueOf(aVarF.c()));
        map2.put("dnt_code", aVarF.b().b());
        b bVar = (b) f23077m.get();
        if (((Boolean) this.f23078a.a(y4.f23584E3)).booleanValue() && bVar != null) {
            map2.put("idfv", bVar.f23088a);
            map2.put("idfv_scope", Integer.valueOf(bVar.f23089b));
        }
        Boolean boolB = AbstractC1656p0.b().b(this.f23080c);
        if (boolB != null) {
            map2.put("huc", boolB);
        }
        Boolean boolB2 = AbstractC1656p0.c().b(this.f23080c);
        if (boolB2 != null) {
            map2.put("aru", boolB2);
        }
        Boolean boolB3 = AbstractC1656p0.a().b(this.f23080c);
        if (boolB3 != null) {
            map2.put("dns", boolB3);
        }
        if (((Boolean) this.f23078a.a(y4.f23699T3)).booleanValue()) {
            c cVarJ = j();
            CollectionUtils.putIntegerIfValid("act", Integer.valueOf(cVarJ.f23090a), map2);
            CollectionUtils.putIntegerIfValid("acm", Integer.valueOf(cVarJ.f23091b), map2);
            CollectionUtils.putBooleanIfValid("sowpie", cVarJ.f23092c, map2);
        }
        if (((Boolean) this.f23078a.a(y4.f23761b4)).booleanValue()) {
            map2.put("mtl", Integer.valueOf(this.f23078a.n0().getLastTrimMemoryLevel()));
        }
        if (((Boolean) this.f23078a.a(y4.f23785e4)).booleanValue()) {
            map2.put("adr", Boolean.valueOf(O()));
        }
        Float fR = z2 ? (Float) this.f23086i.get() : r();
        if (fR != null) {
            map2.put("volume", fR);
        }
        CollectionUtils.putBooleanIfValid("ma", v(), map2);
        CollectionUtils.putBooleanIfValid("spo", w(), map2);
        CollectionUtils.putBooleanIfValid("aif", Boolean.valueOf(!this.f23078a.n0().isApplicationPaused()), map2);
        CollectionUtils.putLongIfValid("af_ts_ms", Long.valueOf(this.f23078a.n0().getAppEnteredForegroundTimeMillis()), map2);
        CollectionUtils.putLongIfValid("ab_ts_ms", Long.valueOf(this.f23078a.n0().getAppEnteredBackgroundTimeMillis()), map2);
        try {
            map2.put("sb", Integer.valueOf((int) ((Settings.System.getInt(this.f23080c.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)));
        } catch (Settings.SettingNotFoundException e7) {
            if (o.a()) {
                this.f23079b.a("DataCollector", "Unable to collect screen brightness", e7);
            }
        }
        if (((Boolean) this.f23078a.a(y4.f23810h4)).booleanValue() && o7.d(this.f23078a)) {
            o8.a(this.f23078a);
            String strA2 = o8.a();
            if (StringUtils.isValidString(strA2)) {
                map2.put("ua", strA2);
            }
        }
        if (((Boolean) this.f23078a.a(y4.f23903s4)).booleanValue()) {
            o8.b(this.f23078a);
            CollectionUtils.putIntegerIfValid("wvvc", Integer.valueOf(o8.d()), map2);
            CollectionUtils.putStringIfValid("wvv", o8.c(), map2);
            CollectionUtils.putStringIfValid("wvpn", o8.b(), map2);
        }
        if (((Boolean) this.f23078a.a(y4.f23715V3)).booleanValue()) {
            try {
                map2.put("fs", Long.valueOf(Environment.getDataDirectory().getFreeSpace()));
                map2.put("tds", Long.valueOf(Environment.getDataDirectory().getTotalSpace()));
            } catch (Throwable th) {
                map2.put("fs", -1);
                map2.put("tds", -1);
                if (o.a()) {
                    this.f23079b.a("DataCollector", "Unable to collect total & free space.", th);
                }
            }
        }
        if (((Boolean) this.f23078a.a(y4.f23723W3)).booleanValue()) {
            ActivityManager.MemoryInfo memoryInfoA = o7.a((ActivityManager) this.f23080c.getSystemService("activity"));
            if (memoryInfoA != null) {
                map2.put("fm", Long.valueOf(memoryInfoA.availMem));
                map2.put("tm", Long.valueOf(memoryInfoA.totalMem));
                map2.put("lmt", Long.valueOf(memoryInfoA.threshold));
                map2.put("lm", Boolean.valueOf(memoryInfoA.lowMemory));
            } else {
                map2.put("fm", -1);
                map2.put("tm", -1);
                map2.put("lmt", -1);
            }
        }
        if (((Boolean) this.f23078a.a(y4.f23731X3)).booleanValue() && AbstractC1654o0.a("android.permission.READ_PHONE_STATE", this.f23080c) && AbstractC1654o0.g()) {
            map2.put("rat", Integer.valueOf(((TelephonyManager) this.f23080c.getSystemService("phone")).getDataNetworkType()));
        }
        if (((Boolean) this.f23078a.a(y4.f23707U3)).booleanValue()) {
            String strA3 = A();
            if (!TextUtils.isEmpty(strA3)) {
                map2.put("so", strA3);
            }
        }
        map2.put("device_orientation", o7.b(this.f23080c));
        map2.put("orientation_lock", h());
        if (((Boolean) this.f23078a.a(y4.f23739Y3)).booleanValue()) {
            map2.put("vs", Boolean.valueOf(o7.j()));
        }
        if (AbstractC1654o0.e() && (powerManager = (PowerManager) this.f23080c.getSystemService("power")) != null) {
            map2.put("lpm", Integer.valueOf(powerManager.isPowerSaveMode() ? 1 : 0));
        }
        if (((Boolean) this.f23078a.a(y4.f23827j4)).booleanValue() && this.f23078a.m0() != null) {
            map2.put("da", Float.valueOf(this.f23078a.m0().a()));
        }
        if (((Boolean) this.f23078a.a(y4.f23835k4)).booleanValue() && this.f23078a.m0() != null) {
            map2.put("dm", Float.valueOf(this.f23078a.m0().b()));
        }
        map2.put("mute_switch", Integer.valueOf(this.f23078a.p().c()));
        map2.put("network", AbstractC1659r0.g(this.f23078a));
        String strQ = q();
        if (StringUtils.isValidString(strQ)) {
            map2.put("kb", strQ);
        }
        return map2;
    }

    private Map a(Intent intent) {
        if (intent == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(5);
        map.put(HandleInvocationsFromAdViewer.KEY_ACTION, StringUtils.emptyIfNull(intent.getAction()));
        map.put(JsonStorageKeyNames.DATA_KEY, StringUtils.emptyIfNull(intent.getDataString()));
        map.put("flags", Integer.valueOf(intent.getFlags()));
        ComponentName component = intent.getComponent();
        map.put("component", component != null ? component.flattenToString() : "");
        Set<String> categories = intent.getCategories();
        map.put("categories", categories != null ? new ArrayList(categories) : Collections.EMPTY_LIST);
        return map;
    }

    private String a(ApplicationExitInfo applicationExitInfo, int i5) {
        InputStream traceInputStream;
        String line;
        if (!this.f23078a.c(y4.f23616I4).contains(Integer.toString(i5))) {
            Integer num = (Integer) this.f23078a.a(y4.f23609H4);
            if (num.intValue() > 0) {
                try {
                    traceInputStream = applicationExitInfo.getTraceInputStream();
                } catch (Throwable th) {
                    this.f23078a.O();
                    if (o.a()) {
                        this.f23078a.O().a("DataCollector", "Failed to obtain trace input stream from application exit info", th);
                    }
                    this.f23078a.D().b("DataCollector", "getTraceInputStream", th);
                    traceInputStream = null;
                }
                if (traceInputStream != null) {
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(traceInputStream));
                        for (int i10 = 0; i10 < num.intValue() && (line = bufferedReader.readLine()) != null; i10++) {
                            try {
                                sb2.append(line);
                                sb2.append('\n');
                            } finally {
                            }
                        }
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        this.f23078a.O();
                        if (o.a()) {
                            this.f23078a.O().a("DataCollector", "Failed to read stack trace from input stream", th2);
                        }
                        this.f23078a.D().b("DataCollector", "readStackTraceFromInputStream", th2);
                    }
                    return sb2.toString();
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, int i5, String str2) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", str);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(i5), mapHashMap);
        CollectionUtils.putStringIfValid("error_message", str2, mapHashMap);
        this.f23078a.D().d(d2.f21266F0, mapHashMap);
    }

    public static void a(AbstractC1668v.a aVar) {
        f23076l.set(aVar);
    }

    public static void a(b bVar) {
        f23077m.set(bVar);
    }

    public static void a(String str, k kVar) {
        String strA = a(k.o().getApplicationInfo().packageName, k.o().getPackageManager(), kVar);
        List listC = kVar.c(y4.f23734X6);
        if (!StringUtils.isValidString(strA) || listC.contains(strA)) {
            f23075j = str;
        }
    }

    private boolean a(String str) {
        return b(str) == 1;
    }

    private String a(String str, PackageManager packageManager) {
        if (!AbstractC1654o0.b()) {
            return null;
        }
        try {
            return packageManager.getInstallSourceInfo(str).getOriginatingPackageName();
        } catch (Throwable th) {
            this.f23078a.D().b("DataCollector", "getOriginatingName", th);
            return null;
        }
    }

    private static String a(String str, PackageManager packageManager, k kVar) {
        try {
            if (((Boolean) kVar.a(y4.f23569C4)).booleanValue() && AbstractC1654o0.b()) {
                return packageManager.getInstallSourceInfo(str).getInstallingPackageName();
            }
            return packageManager.getInstallerPackageName(str);
        } catch (Throwable th) {
            kVar.D().b("DataCollector", "getInstallerName", th);
            return null;
        }
    }
}
