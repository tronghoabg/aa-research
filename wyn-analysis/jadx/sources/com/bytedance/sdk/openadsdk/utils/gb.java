package com.bytedance.sdk.openadsdk.utils;

import A7.AbstractC0279p0;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.recyclerview.widget.m0;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.bytedance.sdk.component.cz.ivm;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class gb {
    private static final byte[] cq;
    private static final HashSet<String> dj;
    private static String dz;
    public static Integer uef;
    private static String wk;
    private static final byte[] wrv;

    /* renamed from: oa, reason: collision with root package name */
    private static final ExecutorService f26147oa = Executors.newSingleThreadExecutor();
    private static volatile boolean yo = false;
    private static final AtomicInteger moa = new AtomicInteger(0);
    private static volatile String lw = "";
    private static final ReentrantLock ivm = new ReentrantLock();
    private static String xs = null;
    private static String bcc = null;
    private static String cz = null;
    private static final HashSet<String> zjm = new HashSet<>(Arrays.asList("Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"));

    /* renamed from: com.bytedance.sdk.openadsdk.utils.gb$2, reason: invalid class name */
    public static class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (TextUtils.isEmpty(gb.lw)) {
                    com.bytedance.sdk.component.cz.ivm ivmVar = new com.bytedance.sdk.component.cz.ivm(com.bytedance.sdk.openadsdk.core.sy.uef(), ivm.yo.USER_AGENT);
                    ivmVar.setWebViewClient(new ivm.uef());
                    String unused = gb.lw = ivmVar.getUserAgentString();
                    com.bytedance.sdk.component.utils.pz.uef(ivmVar);
                }
            } catch (Exception e7) {
                com.bytedance.sdk.component.utils.dhk.uef("TTAD.ToolUtils", "", e7);
            } catch (NoClassDefFoundError e10) {
                com.bytedance.sdk.component.utils.dhk.uef("TTAD.ToolUtils", "", e10);
            }
        }
    }

    public static class oa {

        /* renamed from: oa, reason: collision with root package name */
        public final int f26148oa;
        public final ComponentName uef;

        public oa(ComponentName componentName, int i5) {
            this.uef = componentName;
            this.f26148oa = i5;
        }
    }

    public static class uef implements Callable<String> {
        private final int uef;

        public uef(int i5) {
            this.uef = i5;
        }

        private String oa() {
            String property;
            Throwable th;
            try {
                property = System.getProperty("http.agent");
                if (property != null) {
                    try {
                        if (!"unKnow".equals(property)) {
                            com.bytedance.sdk.openadsdk.core.yo.uef().uef("android_system_ua", property);
                            return property;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        com.bytedance.sdk.component.utils.dhk.yo("getUA", "e:" + th.getMessage());
                        return property;
                    }
                }
                return property;
            } catch (Throwable th3) {
                property = "unKnow";
                th = th3;
            }
        }

        private synchronized String yo() {
            final String[] strArr;
            strArr = new String[]{"unKnow"};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.gb.uef.1
                @Override // java.lang.Runnable
                public void run() {
                    strArr[0] = gb.oyt();
                    String str = strArr[0];
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(2L, TimeUnit.SECONDS);
            } catch (InterruptedException e7) {
                com.bytedance.sdk.component.utils.dhk.yo("TTAD.ToolUtils", e7.getMessage());
            }
            return strArr[0];
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public synchronized String call() throws Exception {
            String strOa;
            try {
                strOa = "unKnow";
                int i5 = this.uef;
                if (i5 == 1) {
                    strOa = yo();
                } else if (i5 == 2) {
                    strOa = oa();
                }
            } catch (Throwable th) {
                throw th;
            }
            return strOa;
        }
    }

    public static class yo {
        private static final int uef;

        static {
            com.bytedance.sdk.component.utils.dhk.uef("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod start status = 0");
            int i5 = 2;
            try {
                int i10 = m0.f18921b;
                if (m0.class.getDeclaredMethod("getBindingAdapterPosition", new Class[0]) != null) {
                    i5 = 0;
                }
            } catch (ClassNotFoundException unused) {
                i5 = 1;
            } catch (NoSuchMethodException unused2) {
            }
            uef = i5;
            com.bytedance.sdk.component.utils.dhk.uef("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod end status = ".concat(String.valueOf(i5)));
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        dj = hashSet;
        hashSet.addAll(Arrays.asList("America/Eirunepe", "America/Rio_Branco", "America/Boa_Vista", "America/Campo_Grande", "America/Cuiaba", "America/Manaus", "America/Porto_Velho", "America/Araguaina", "America/Bahia", "America/Belem", "America/Fortaleza", "America/Maceio", "America/Recife", "America/Santarem", "America/Sao_Paulo", "America/Noronha"));
        uef = null;
        wrv = new byte[]{108, 111, 97, 100, 105, 110, 103};
        cq = new byte[]{97, 114, 98, 105, 116, 114, 97, 103, 101};
    }

    public static int ab() {
        return com.bytedance.sdk.openadsdk.core.yo.uef().oa("is_root", -1);
    }

    public static synchronized String bcc() {
        try {
            if (TextUtils.isEmpty(cz) && com.bytedance.sdk.openadsdk.core.sy.uef() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.sy.uef().getPackageManager().getPackageInfo(ivm(), 0);
                    bcc = String.valueOf(packageInfo.versionCode);
                    cz = packageInfo.versionName;
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.dhk.uef("TTAD.ToolUtils", "ToolUtils getVersionName throws exception :", th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return cz;
    }

    public static boolean bs() {
        try {
            if (!new File("/system/bin/su").exists()) {
                if (!new File("/system/xbin/su").exists()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String cp() {
        String str = dz;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(wrv);
        dz = str2;
        return str2;
    }

    public static String cz() {
        try {
            ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.sy.uef().getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j8 = memoryInfo.totalMem;
            if (j8 > 0) {
                return String.valueOf(j8 / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<String> dhk() {
        ArrayList arrayList = new ArrayList();
        Set<String> setHdd = com.bytedance.sdk.openadsdk.core.sy.moa().hdd();
        if (setHdd != null && !setHdd.isEmpty()) {
            for (String str : setHdd) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    public static String dj() {
        return yo("MemTotal");
    }

    public static long dz() {
        return com.bytedance.sdk.openadsdk.core.yo.uef().oa("total_sdcard_storage", 0L).longValue();
    }

    public static int fz() {
        return yo.uef;
    }

    public static int gr() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static String gsd() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception e7) {
            com.bytedance.sdk.component.utils.dhk.yo("TTAD.ToolUtils", e7.toString());
            return "";
        }
    }

    public static String gzw() {
        return "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/renderer/package_tx.json";
    }

    public static boolean ivm(int i5) {
        return i5 == 6;
    }

    private static boolean km() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String ku() {
        String str = wk;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(cq);
        wk = str2;
        return str2;
    }

    public static boolean lw(int i5) {
        return i5 == 5;
    }

    public static boolean moa(int i5) {
        return i5 == 4;
    }

    public static boolean oa(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                com.bytedance.sdk.component.utils.oa.uef(context, intent, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String oib() {
        String strCl = com.bytedance.sdk.openadsdk.core.sy.moa().cl();
        if (!TextUtils.isEmpty(strCl)) {
            return strCl;
        }
        String strUef = gzw.uef();
        return !TextUtils.isEmpty(strUef) ? AbstractC0279p0.l("https://", strUef, "/service/2/dual_events/") : strCl;
    }

    public static String orq() {
        return "https://log.byteoversea.com/service/2/app_log_test/";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String oyt() {
        try {
            WebView webView = new WebView(com.bytedance.sdk.openadsdk.core.sy.uef());
            webView.setWebViewClient(new ivm.uef());
            String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString == null || "unKnow".equals(userAgentString)) {
                return userAgentString;
            }
            com.bytedance.sdk.openadsdk.core.yo.uef().uef("webview_ua", userAgentString);
            return userAgentString;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("getUA", "e:" + th.getMessage());
            return "unKnow";
        }
    }

    public static boolean pz() {
        return moa.get() == 1;
    }

    public static int rt() {
        try {
            String id2 = TimeZone.getDefault().getID();
            if (zjm.contains(id2)) {
                return 2;
            }
            if (id2 != null && id2.startsWith("Asia/")) {
                return 2;
            }
            if (id2 != null && id2.startsWith("Europe/")) {
                return 4;
            }
            if (id2 == null || !id2.startsWith("America/")) {
                return 3;
            }
            return !dj.contains(id2) ? 5 : 3;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("TTAD.ToolUtils", th.toString());
            return 0;
        }
    }

    public static String sy() {
        String strAf = com.bytedance.sdk.openadsdk.core.sy.moa().af();
        return TextUtils.isEmpty(strAf) ? gzw.uef() : strAf;
    }

    public static String tpx() {
        String strWf = com.bytedance.sdk.openadsdk.core.settings.dj.wf();
        if (!TextUtils.isEmpty(strWf)) {
            return strWf;
        }
        String strSk = com.bytedance.sdk.openadsdk.core.sy.moa().sk();
        return TextUtils.isEmpty(strSk) ? gzw.uef() : strSk;
    }

    public static String ue() {
        int i5 = -gr();
        return i5 >= 0 ? "Etc/GMT+".concat(String.valueOf(i5)) : "Etc/GMT".concat(String.valueOf(i5));
    }

    public static void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, View view) {
    }

    public static long wk() {
        try {
            if (!km()) {
                return 0L;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("TTAD.ToolUtils", th.getMessage());
            return 0L;
        }
    }

    public static long wrv() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static int xs(int i5) {
        if (i5 == 1) {
            return 0;
        }
        if (i5 == 4) {
            return 1;
        }
        if (i5 == 5) {
            return 4;
        }
        if (i5 != 6) {
            return i5;
        }
        return 5;
    }

    public static String yo(int i5) {
        return i5 != 1 ? i5 != 2 ? (i5 == 3 || i5 == 4) ? "open_ad" : i5 != 7 ? i5 != 8 ? "embeded_ad" : "fullscreen_interstitial_ad" : "rewarded_video" : "interaction" : "banner_ad";
    }

    public static String zjm() {
        return com.bytedance.sdk.openadsdk.core.yo.uef().oa("total_memory", "0");
    }

    public static long cq() {
        return com.bytedance.sdk.openadsdk.core.yo.uef().oa("free_internal_storage", 0L).longValue();
    }

    public static boolean dj(String str) {
        if (com.bytedance.sdk.openadsdk.core.wk.lw()) {
            return true;
        }
        com.bytedance.sdk.component.utils.dhk.yo(AbstractC0279p0.l("You must use method '", str, "' after initialization, please check."), new Object[0]);
        return false;
    }

    private static String dz(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("aid", "1371").appendQueryParameter("device_platform", "android").appendQueryParameter("version_code", xs()).toString();
        } catch (Exception e7) {
            com.bytedance.sdk.component.utils.dhk.yo("TTAD.ToolUtils", e7.getMessage());
            return str;
        }
    }

    public static synchronized String ivm() {
        Context contextUef;
        try {
            if (TextUtils.isEmpty(xs) && (contextUef = com.bytedance.sdk.openadsdk.core.sy.uef()) != null) {
                try {
                    xs = contextUef.getPackageName();
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.dhk.uef("TTAD.ToolUtils", "ToolUtils getPackageName throws exception :", th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return xs;
    }

    public static String lw() {
        return ue.uef();
    }

    public static boolean moa(Context context) {
        return false;
    }

    public static Intent uef(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static synchronized String xs() {
        try {
            if (TextUtils.isEmpty(bcc) && com.bytedance.sdk.openadsdk.core.sy.uef() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.sy.uef().getPackageManager().getPackageInfo(ivm(), 0);
                    bcc = String.valueOf(packageInfo.versionCode);
                    cz = packageInfo.versionName;
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.dhk.uef("TTAD.ToolUtils", "ToolUtils getVersionCode throws exception :", th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return bcc;
    }

    public static long zjm(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length == 0) {
                return 0L;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArrSplit[0]);
            for (int i5 = 1; i5 < strArrSplit.length; i5++) {
                String str2 = strArrSplit[i5];
                if (!bcc(str2)) {
                    return 0L;
                }
                if (str2.length() == 1) {
                    sb2.append("0");
                    sb2.append(str2);
                } else {
                    sb2.append(str2);
                }
                if (sb2.length() > 18) {
                    return 0L;
                }
            }
            String string = sb2.toString();
            if (TextUtils.isEmpty(string)) {
                return 0L;
            }
            return Long.parseLong(string);
        } catch (Exception e7) {
            com.bytedance.sdk.component.utils.dhk.yo("TTAD.ToolUtils", e7.getMessage());
            return 0L;
        }
    }

    public static String lw(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.bytedance.sdk.openadsdk.core.sy.moa().rl();
        }
        if (TextUtils.isEmpty(str)) {
            return "https://api16-access-ttp.tiktokpangle.us/service/2/app_log/";
        }
        return !str.startsWith("http") ? "https://".concat(str) : str;
    }

    public static String moa() {
        if (!TextUtils.isEmpty(lw)) {
            return lw;
        }
        com.bytedance.sdk.openadsdk.oib.uef.uef(com.bytedance.sdk.openadsdk.core.sy.uef());
        String strUef = com.bytedance.sdk.openadsdk.core.zjm.uef("sdk_local_web_ua", 86400000L);
        lw = strUef;
        if (TextUtils.isEmpty(strUef)) {
            ReentrantLock reentrantLock = ivm;
            try {
                if (reentrantLock.tryLock()) {
                    try {
                        if (TextUtils.isEmpty(lw)) {
                            lw = WebSettings.getDefaultUserAgent(com.bytedance.sdk.openadsdk.core.sy.uef());
                        }
                        com.bytedance.sdk.openadsdk.core.zjm.uef("sdk_local_web_ua", lw);
                        reentrantLock.unlock();
                    } catch (Exception e7) {
                        com.bytedance.sdk.component.utils.dhk.uef("TTAD.ToolUtils", "", e7);
                        return lw;
                    } catch (NoClassDefFoundError e10) {
                        com.bytedance.sdk.component.utils.dhk.uef("TTAD.ToolUtils", "", e10);
                        return lw;
                    }
                }
            } finally {
                ivm.unlock();
            }
        }
        return lw;
    }

    public static void wrv(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        com.bytedance.sdk.component.utils.dhk.yo(AbstractC0279p0.l("You should use method '", str, "' on the asynchronous thread,it may cause anr, please check."), new Object[0]);
    }

    public static String cz(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        return str.contains("kllk") ? str.replace("kllk", "oppo") : "";
    }

    public static String ivm(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return !str.startsWith("http") ? "https://".concat(str) : str;
    }

    public static String oa(int i5) {
        if (i5 == 1) {
            return "embeded_ad_landingpage";
        }
        if (i5 == 2) {
            return "banner_ad_landingpage";
        }
        if (i5 == 3) {
            return "interaction_landingpage";
        }
        if (i5 == 4) {
            return "splash_ad_landingpage";
        }
        if (i5 == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i5 != 7) {
            return "unknow";
        }
        return "rewarded_video_landingpage";
    }

    public static void yo() {
        com.bytedance.sdk.openadsdk.ab.moa.uef("recycle_version_not_valid", false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.utils.gb.1
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("method_exist", gb.fz());
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("recycle_version_not_valid").oa(jSONObject.toString());
            }
        });
    }

    public static boolean lw(Context context) {
        if (context == null) {
            return false;
        }
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static oa uef(Context context, Intent intent) {
        return new oa(null, 0);
    }

    public static String yo(String str) throws IOException {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String line;
        try {
            fileReader = new FileReader(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO);
            try {
                bufferedReader = new BufferedReader(fileReader, 4096);
                do {
                    try {
                        line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            com.bytedance.sdk.component.utils.dhk.yo("TTAD.ToolUtils", th.getMessage());
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused) {
                                }
                            }
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (Exception unused2) {
                                }
                            }
                            return null;
                        } finally {
                        }
                    }
                } while (!line.contains(str));
                if (line == null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                    try {
                        fileReader.close();
                    } catch (Exception unused4) {
                    }
                    return null;
                }
                String str2 = line.split("\\s+")[1];
                try {
                    bufferedReader.close();
                } catch (Exception unused5) {
                }
                try {
                    fileReader.close();
                } catch (Exception unused6) {
                }
                return str2;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileReader = null;
            bufferedReader = null;
        }
    }

    public static boolean uef() {
        return (com.bytedance.sdk.openadsdk.core.ab.uef() == null || com.bytedance.sdk.openadsdk.core.ab.uef().moa()) ? false : true;
    }

    public static boolean bcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("^[+-]?([0-9]|([1-9][0-9]*))(\\.[0-9]+)?").matcher(str).matches();
    }

    public static String uef(int i5) {
        if (i5 == 1) {
            return "embeded_ad";
        }
        if (i5 == 2) {
            return "banner_ad";
        }
        if (i5 == 3) {
            return "interaction";
        }
        if (i5 == 4) {
            return "open_ad";
        }
        if (i5 == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i5 != 7) {
            return null;
        }
        return "rewarded_video";
    }

    public static int ivm(Context context) {
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("TTAD.ToolUtils", th.getMessage());
            return -1;
        }
    }

    public static boolean xs(String str) {
        try {
            return Pattern.compile("[一-龥]").matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void cz(Context context) {
        try {
            AtomicInteger atomicInteger = moa;
            if (atomicInteger.get() != 0) {
                return;
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            boolean zIsEnabled = accessibilityManager.isEnabled();
            boolean zIsTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (zIsEnabled && zIsTouchExplorationEnabled) {
                atomicInteger.set(1);
                com.bytedance.sdk.openadsdk.ab.moa.uef().yo();
            } else {
                atomicInteger.set(2);
            }
        } catch (Exception unused) {
            moa.set(2);
        }
    }

    public static int bcc(Context context) {
        return xs(com.bytedance.sdk.component.utils.gr.uef(context, 0L));
    }

    public static int oa(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        if (gzwVar == null) {
            return -1;
        }
        int iDqw = gzwVar.dqw();
        int i5 = 1;
        if (iDqw == 1) {
            return 2;
        }
        if (iDqw == 3) {
            return 4;
        }
        if (iDqw != 5) {
            i5 = 7;
            if (iDqw != 7) {
                return iDqw != 8 ? -1 : 5;
            }
        }
        return i5;
    }

    public static long xs(Context context) {
        int i5 = -1;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                i5 = context.getApplicationInfo().minSdkVersion;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("TTAD.ToolUtils", th.getMessage());
        }
        return i5;
    }

    public static boolean bcc(int i5) {
        if (i5 <= 0) {
            return false;
        }
        return i5 >= 100 || new Random(System.currentTimeMillis()).nextInt(100) + 1 <= i5;
    }

    public static String oa() {
        String strOa;
        String str = "unKnow";
        com.bytedance.sdk.openadsdk.oib.uef.uef(com.bytedance.sdk.openadsdk.core.sy.uef());
        try {
            strOa = com.bytedance.sdk.openadsdk.core.yo.uef().oa("android_system_ua", "unKnow");
        } catch (Exception unused) {
        }
        if (strOa != null && !"unKnow".equals(strOa)) {
            return strOa;
        }
        FutureTask futureTask = new FutureTask(new uef(2));
        f26147oa.execute(futureTask);
        str = (String) futureTask.get(500L, TimeUnit.MILLISECONDS);
        com.bytedance.sdk.component.utils.dhk.yo("getUA", " getAndroidSystemUA userAgent".concat(String.valueOf(str)));
        return str;
    }

    public static String uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        if (gzwVar == null) {
            return null;
        }
        try {
            return yo(gzwVar.dqw());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String moa(String str) {
        return uef(str, false, false);
    }

    public static int uef(String str) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        str.getClass();
        switch (str) {
        }
        return 1;
    }

    public static int zjm(Context context) {
        List<ResolveInfo> listQueryIntentActivities;
        Integer num = uef;
        if (num != null) {
            return num.intValue();
        }
        if (context == null || (listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 0)) == null) {
            return 0;
        }
        int size = listQueryIntentActivities.size();
        uef = Integer.valueOf(size);
        return size;
    }

    public static boolean moa(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        return gzwVar != null && gzwVar.ykf() == 3 && gzwVar.dy() && (gzwVar.wd() == 4 || gzwVar.wd() == 5);
    }

    public static String uef(Context context) throws IOException {
        String strOa = com.bytedance.sdk.openadsdk.core.yo.uef().oa("total_memory", (String) null);
        if (strOa != null && oa(strOa) > 0) {
            return strOa;
        }
        String strYo = yo("MemTotal");
        if (oa(strYo) <= 0) {
            strYo = cz();
        }
        com.bytedance.sdk.openadsdk.core.yo.uef().uef("total_memory", strYo);
        return strYo;
    }

    public static long oa(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static long oa(Context context) {
        return com.bytedance.sdk.openadsdk.core.yo.uef().oa("total_internal_storage", 0L).longValue();
    }

    public static String yo(Context context) {
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = context.getResources().getConfiguration().getLocales().get(0);
            } else {
                locale = Locale.getDefault();
            }
            return locale.getLanguage();
        } catch (Exception e7) {
            com.bytedance.sdk.component.utils.dhk.yo("TTAD.ToolUtils", e7.toString());
            return "";
        }
    }

    public static String uef(String str, boolean z2, boolean z10) {
        String strSy;
        if (str != null && !str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (z10) {
            strSy = tpx();
        } else {
            strSy = sy();
        }
        if (TextUtils.isEmpty(strSy)) {
            strSy = "api16-access-ttp.tiktokpangle.us";
        }
        String strL = AbstractC0279p0.l("https://", strSy, str);
        if (!TextUtils.isEmpty(str) && (str.equals("/api/ad/union/sdk/compliance_status/") || str.equals("/api/ad/union/sdk/register_status/"))) {
            return strL;
        }
        if (oyt.uef() && !z2) {
            strL = oyt.uef(strL);
        }
        return z2 ? dz(strL) : strL;
    }

    public static boolean yo(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        if (gzwVar == null) {
            return true;
        }
        int iOa = com.bytedance.sdk.openadsdk.core.sy.moa().oa(gzwVar.jnk());
        int iYo = com.bytedance.sdk.component.utils.sy.yo(com.bytedance.sdk.openadsdk.core.sy.uef());
        if (iOa == 1) {
            return moa(iYo);
        }
        if (iOa == 2) {
            return lw(iYo) || moa(iYo) || ivm(iYo);
        }
        if (iOa != 3) {
            return iOa != 5 || moa(iYo) || ivm(iYo);
        }
        return false;
    }

    public static List<String> uef(String str, boolean z2) {
        if (!TextUtils.isEmpty(str) && !str.startsWith("/")) {
            str = "/".concat(str);
        }
        ArrayList arrayList = new ArrayList();
        Set<String> setNj = com.bytedance.sdk.openadsdk.core.sy.moa().nj();
        if (setNj != null && !setNj.isEmpty()) {
            for (String str2 : setNj) {
                if (!TextUtils.isEmpty(str2)) {
                    String strL = AbstractC0279p0.l("https://", str2, str);
                    if (oyt.uef() && !z2) {
                        strL = oyt.uef(strL);
                    }
                    if (z2) {
                        strL = dz(strL);
                    }
                    arrayList.add(strL);
                }
            }
        }
        return arrayList;
    }

    public static JSONObject uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, long j8, com.bykv.vk.openvk.uef.uef.uef.uef uefVar) throws JSONException {
        if (gzwVar == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("creative_id", gzwVar.iou());
            jSONObject.put("buffers_time", j8);
            com.bykv.vk.openvk.uef.uef.uef.yo.oa oaVarNj = gzwVar.nj();
            if (oaVarNj != null) {
                jSONObject.put("video_size", oaVarNj.lw());
                jSONObject.put("video_resolution", oaVarNj.cz());
            }
            uef(jSONObject, uefVar);
            return jSONObject;
        } catch (JSONException e7) {
            com.bytedance.sdk.component.utils.dhk.uef("TTAD.ToolUtils", "getVideoAction json error", e7);
            return jSONObject;
        }
    }

    private static void uef(JSONObject jSONObject, com.bykv.vk.openvk.uef.uef.uef.uef uefVar) {
        if (jSONObject.has("video_resolution") || uefVar == null) {
            return;
        }
        try {
            jSONObject.put("video_resolution", String.format(Locale.getDefault(), "%d×%d", Integer.valueOf(uefVar.moa()), Integer.valueOf(uefVar.lw())));
        } catch (Throwable unused) {
        }
    }

    public static void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, String str) {
        if (gzwVar != null) {
            try {
                String strCc = gzwVar.cc();
                if (TextUtils.isEmpty(strCc) && gzwVar.agr() != null && gzwVar.agr().yo() == 1 && !TextUtils.isEmpty(gzwVar.agr().oa())) {
                    strCc = gzwVar.agr().oa();
                }
                String str2 = strCc;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.pu.uef(com.bytedance.sdk.openadsdk.core.sy.uef(), str2, gzwVar, uef(str), str, false);
            } catch (Throwable unused) {
            }
        }
    }

    public static void uef(String str, String str2, Context context) {
        int i5;
        if (TextUtils.isEmpty(str2) || !lw(context)) {
            return;
        }
        int length = str2.length();
        int i10 = 1;
        if (length % 3572 == 0) {
            i5 = length / 3572;
        } else {
            i5 = (length / 3572) + 1;
        }
        int i11 = 3572;
        int i12 = 0;
        while (i10 <= i5) {
            if (i11 < length) {
                Log.d(str, i5 + "-" + i10 + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + str2.substring(i12, i11));
                i10++;
                i12 = i11;
                i11 += 3572;
            } else {
                Log.d(str, i5 + "-" + i10 + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + str2.substring(i12));
                return;
            }
        }
    }

    public static void uef(StringBuilder sb2, String str, String str2) {
        int iIndexOf;
        if (sb2 == null || TextUtils.isEmpty(str) || (iIndexOf = sb2.indexOf(str)) <= 0) {
            return;
        }
        sb2.replace(iIndexOf, str.length() + iIndexOf, str2);
    }

    public static com.bytedance.sdk.openadsdk.common.lw uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, com.bytedance.sdk.component.cz.ivm ivmVar, Context context, String str) {
        int iWd = gzwVar.wd();
        if (!gzwVar.dy()) {
            return null;
        }
        if (iWd != 1 && iWd != 3) {
            return null;
        }
        ivmVar.uef(true, (View) new com.bytedance.sdk.openadsdk.common.moa(context));
        return new com.bytedance.sdk.openadsdk.common.lw(gzwVar, ivmVar, str, false);
    }

    public static void uef(JSONObject jSONObject) {
        int iIntValue;
        try {
            Pair<String, Long> pairMoa = com.bytedance.sdk.openadsdk.core.zjm.moa("oem_store");
            int i5 = -1;
            if (pairMoa != null && ((iIntValue = Integer.valueOf((String) pairMoa.first).intValue()) != -2 || System.currentTimeMillis() - ((Long) pairMoa.second).longValue() < com.bytedance.sdk.openadsdk.gzw.lw.uef("oem_store_state_time", 259200000))) {
                i5 = iIntValue;
            }
            jSONObject.put("oem_store", i5);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("TTAD.ToolUtils", th.getMessage());
        }
    }

    public static void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, com.bytedance.sdk.component.cz.ivm ivmVar) {
        uef(gzwVar, ivmVar, false);
    }

    public static void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, com.bytedance.sdk.component.cz.ivm ivmVar, boolean z2) {
        com.bytedance.sdk.component.cz.ivm ivmVar2;
        com.bytedance.sdk.openadsdk.core.model.bcc bccVarRt;
        List<Integer> list;
        if (gzwVar == null || ivmVar == null) {
            return;
        }
        int iWd = gzwVar.wd();
        if (!gzwVar.dy() || (!(iWd == 2 || iWd == 3 || iWd == 5) || (bccVarRt = gzwVar.rt()) == null)) {
            ivmVar2 = ivmVar;
        } else {
            List<Integer> listIvm = bccVarRt.ivm();
            ArrayList arrayList = new ArrayList();
            if (z2) {
                for (int i5 = 0; i5 < listIvm.size(); i5++) {
                    arrayList.add(Integer.valueOf(listIvm.get(i5).intValue() - 1));
                }
                list = arrayList;
            } else {
                list = listIvm;
            }
            ivmVar2 = ivmVar;
            ivmVar2.uef(true, bccVarRt.moa(), bccVarRt.lw(), list, bccVarRt.xs(), bccVarRt.yo());
        }
        int iLt = gzwVar.lt();
        long jGyd = gzwVar.gyd();
        if ((iLt == 1 || iLt == 2) && jGyd > 0) {
            ivmVar2.uef(iLt, jGyd);
        }
    }

    public static int uef(WebView webView) {
        if (webView == null) {
            return -1;
        }
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            int size = webBackForwardListCopyBackForwardList.getSize();
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < size; i5++) {
                WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(i5);
                if (itemAtIndex != null) {
                    String url = itemAtIndex.getUrl();
                    if (!arrayList.contains(url)) {
                        arrayList.add(url);
                    }
                }
            }
            return arrayList.indexOf(webView.getUrl()) + 1;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("TTAD.ToolUtils", th.toString());
            return -1;
        }
    }

    public static JSONObject uef(AdSlot adSlot) {
        JSONObject jSONObject = new JSONObject();
        if (adSlot != null) {
            try {
                jSONObject.put("is_sb", !TextUtils.isEmpty(adSlot.getBidAdm()));
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }
}
