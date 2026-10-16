package com.applovin.impl;

import Va.M6;
import android.os.Build;
import android.text.TextUtils;
import com.applovin.impl.d2;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import j$.util.DesugarCollections;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.apache.tika.metadata.OfficeOpenXMLExtended;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class e2 {

    /* renamed from: g, reason: collision with root package name */
    private static volatile ExecutorService f21415g;

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f21417a;

    /* renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f21418b;

    /* renamed from: c, reason: collision with root package name */
    private final d2.b f21419c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f21420d = M6.v();

    /* renamed from: e, reason: collision with root package name */
    private final Set f21421e = DesugarCollections.synchronizedSet(new HashSet());

    /* renamed from: f, reason: collision with root package name */
    private static final int f21414f = (int) TimeUnit.SECONDS.toMillis(30);

    /* renamed from: h, reason: collision with root package name */
    private static final Object f21416h = new Object();

    public class a implements ThreadFactory {

        /* renamed from: com.applovin.impl.e2$a$a, reason: collision with other inner class name */
        public class C0009a implements Thread.UncaughtExceptionHandler {
            public C0009a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                e2.this.f21417a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    e2.this.f21417a.O().a("HealthEventsReporter", "Caught unhandled exception", th);
                }
            }
        }

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:health_events_reporter");
            thread.setDaemon(true);
            thread.setPriority(((Integer) e2.this.f21417a.a(y4.f23688S)).intValue());
            thread.setUncaughtExceptionHandler(new C0009a());
            return thread;
        }
    }

    public e2(com.applovin.impl.sdk.k kVar, d2.b bVar) {
        this.f21417a = kVar;
        this.f21418b = kVar.O();
        this.f21419c = bVar;
        a();
    }

    private void c(d2 d2Var, List list) {
        HttpURLConnection httpURLConnection;
        Throwable th;
        if (d2Var.a() == d2.b.AD || d2Var.a() == d2.b.MEDIATED_AD || d2Var.a() == d2.b.USER_SESSION || !o7.a(((Integer) this.f21417a.a(y4.f23558B)).intValue())) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            try {
                httpURLConnection = (HttpURLConnection) a(d2Var, map).openConnection();
                try {
                    int i5 = f21414f;
                    httpURLConnection.setConnectTimeout(i5);
                    httpURLConnection.setReadTimeout(i5);
                    httpURLConnection.setDefaultUseCaches(false);
                    httpURLConnection.setAllowUserInteraction(false);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("AppLovin-Event-Type", d2Var.b());
                    int responseCode = httpURLConnection.getResponseCode();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f21418b.a("HealthEventsReporter", d2Var.b() + " reported with code " + responseCode + " and extra parameters " + map);
                    }
                    this.f21420d.put(d2Var, Long.valueOf(System.currentTimeMillis()));
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f21418b.d("HealthEventsReporter", "Failed to report " + d2Var.b() + " with extra parameters " + map, th);
                        }
                        o7.a(httpURLConnection, this.f21417a);
                    } finally {
                        o7.a(httpURLConnection, this.f21417a);
                    }
                }
            } catch (Throwable th3) {
                httpURLConnection = null;
                th = th3;
            }
        }
    }

    public void d(d2 d2Var, Map map) {
        a(d2Var, map, 0L);
    }

    private void a() {
        if (f21415g != null) {
            return;
        }
        synchronized (f21416h) {
            try {
                if (f21415g != null) {
                    return;
                }
                f21415g = Executors.newFixedThreadPool(1, new a());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void d(d2 d2Var, List list) throws JSONException {
        String str = (String) this.f21417a.a(y4.f23565C);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        double dA = d2Var.a(this.f21417a);
        if (o7.a(dA)) {
            if (((Boolean) this.f21417a.a(y4.f23612I)).booleanValue()) {
                a(str, d2Var, a(d2Var, dA, list));
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f21415g.execute(new Cb.a(this, str, d2Var, a(d2Var, dA, Collections.singletonList((Map) it.next())), 9));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(String str, d2 d2Var, JSONObject jSONObject) {
        byte[] bytes;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            URL url = new URL(str);
            bytes = jSONObject.toString().getBytes("UTF-8");
            httpURLConnection = (HttpURLConnection) url.openConnection();
        } catch (Throwable th) {
            th = th;
        }
        try {
            int i5 = f21414f;
            httpURLConnection.setConnectTimeout(i5);
            httpURLConnection.setReadTimeout(i5);
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("AppLovin-Event-Type", d2Var.b());
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bytes);
            outputStream.close();
            int responseCode = httpURLConnection.getResponseCode();
            if (com.applovin.impl.sdk.o.a()) {
                this.f21418b.a("HealthEventsReporter", d2Var.b() + " reported with code " + responseCode);
            }
            this.f21420d.put(d2Var, Long.valueOf(System.currentTimeMillis()));
            o7.a(httpURLConnection, this.f21417a);
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = httpURLConnection;
            try {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21418b.d("HealthEventsReporter", "Failed to report " + d2Var.b(), th);
                }
            } finally {
                o7.a(httpURLConnection2, this.f21417a);
            }
        }
    }

    public void a(d2 d2Var, String str) {
        a(d2Var, str, new HashMap());
    }

    public void a(d2 d2Var, String str, Map map) {
        map.put("source", str);
        d(d2Var, map);
    }

    public void a(d2 d2Var, String str, Map map, String str2) {
        if (!StringUtils.isValidString(str2) || this.f21421e.add(str2)) {
            map.put("source", str);
            a(d2Var, str, map);
        }
    }

    public void a(d2 d2Var, Map map, long j8) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        a(d2Var, arrayList, j8);
    }

    public void a(d2 d2Var, List list, long j8) {
        if (a(d2Var, j8)) {
            return;
        }
        try {
            if (o7.h()) {
                f21415g.execute(new Ab.a(this, d2Var, list, 21));
            } else {
                b(d2Var, list);
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21418b.d("HealthEventsReporter", "Failed to report " + d2Var.b() + " with extra parameters collection " + list, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(d2 d2Var, List list) throws JSONException {
        if (AppLovinSdkUtils.isEmulator()) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21418b.a("HealthEventsReporter", "Reporting " + d2Var.b() + " with extra parameters collection " + list);
        }
        if (this.f21419c != d2Var.a()) {
            l1.a("Health event " + d2Var.b() + " category: " + d2Var.a() + " does not match the reporter category: " + this.f21419c, new Object[0]);
        }
        c(d2Var, list);
        d(d2Var, list);
    }

    private Map c(d2 d2Var, Map map) {
        HashMap map2 = new HashMap(map);
        if (d2Var == d2.f21285P0) {
            map2.remove("details");
        }
        return map2;
    }

    private Map b(d2 d2Var, Map map) {
        HashMap map2 = new HashMap();
        map2.put("type", d2Var.b());
        if (d2Var == d2.f21277L0 || d2Var == d2.f21276K0 || d2Var == d2.f21308b1 || d2Var == d2.Z0) {
            if (((Boolean) this.f21417a.a(y4.f23903s4)).booleanValue()) {
                CollectionUtils.putStringIfValid("wvvc", String.valueOf(o8.d()), map2);
                CollectionUtils.putStringIfValid("wvv", o8.c(), map2);
                CollectionUtils.putStringIfValid("wvpn", o8.b(), map2);
            }
            CollectionUtils.putStringIfValid("oglv", this.f21417a.A().J(), map2);
        }
        Map mapM = this.f21417a.A().M();
        map2.put("platform", String.valueOf(mapM.get("platform")));
        map2.put("country_code", String.valueOf(mapM.get("country_code")));
        map2.put("cc", this.f21417a.v().getCountryCode());
        map2.put("applovin_random_token", this.f21417a.i0());
        map2.put("compass_random_token", this.f21417a.u());
        map2.put("model", Build.MODEL);
        map2.put("brand", Build.MANUFACTURER);
        map2.put("brand_name", Build.BRAND);
        map2.put("hardware", Build.HARDWARE);
        map2.put("revision", Build.DEVICE);
        map2.put("os", Build.VERSION.RELEASE);
        map2.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
        map2.put("sdk_version", String.valueOf(AppLovinSdk.VERSION));
        CollectionUtils.putStringIfValid("ad_review_sdk_version", C1643j.b(), map2);
        map2.put("md", (String) this.f21417a.a(y4.f23906t));
        b(map2);
        a(map2);
        if (map != null) {
            map2.putAll(c(d2Var, map));
        }
        return map2;
    }

    private URL a(d2 d2Var, Map map) throws UnsupportedEncodingException {
        StringBuilder sb2 = new StringBuilder("https://ms.applovin.com/1.0/sdk/error?");
        Iterator it = b(d2Var, map).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strEncode = URLEncoder.encode((String) entry.getKey(), "UTF-8");
            String strEncode2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
            sb2.append(strEncode);
            sb2.append("=");
            sb2.append(strEncode2);
            if (it.hasNext()) {
                sb2.append("&");
            }
        }
        return new URL(sb2.toString());
    }

    private JSONObject a(d2 d2Var, double d3, List list) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "ts_ms", System.currentTimeMillis());
        if (d2Var == d2.f21277L0 || d2Var == d2.f21276K0 || d2Var == d2.f21308b1 || d2Var == d2.Z0) {
            if (((Boolean) this.f21417a.a(y4.f23903s4)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "wvvc", String.valueOf(o8.d()));
                JsonUtils.putStringIfValid(jSONObject, "wvv", o8.c());
                JsonUtils.putStringIfValid(jSONObject, "wvpn", o8.b());
            }
            JsonUtils.putStringIfValid(jSONObject, "oglv", this.f21417a.A().J());
        }
        JSONObject jSONObject2 = new JSONObject();
        Map mapM = this.f21417a.A().M();
        JsonUtils.putObject(jSONObject2, "platform", mapM.get("platform"));
        JsonUtils.putObject(jSONObject2, "os", mapM.get("os"));
        JsonUtils.putObject(jSONObject2, "api_level", String.valueOf(mapM.get("api_level")));
        JsonUtils.putObject(jSONObject2, "brand", mapM.get("brand"));
        JsonUtils.putObject(jSONObject2, "model", mapM.get("model"));
        JsonUtils.putObject(jSONObject2, "revision", mapM.get("revision"));
        JsonUtils.putObject(jSONObject2, "country_code", mapM.get("country_code"));
        JsonUtils.putObject(jSONObject2, "cc", this.f21417a.v().getCountryCode());
        JsonUtils.putObject(jSONObject2, "applovin_random_token", this.f21417a.i0());
        JsonUtils.putObject(jSONObject2, "ad_review_sdk_version", StringUtils.emptyIfNull(C1643j.b()));
        Map mapF = this.f21417a.A().F();
        JsonUtils.putObject(jSONObject2, "sdk_version", mapF.get("sdk_version"));
        JsonUtils.putObject(jSONObject2, "plugin_version", this.f21417a.a(y4.f23676Q3));
        JsonUtils.putObject(jSONObject2, "app_version", mapF.get("app_version"));
        JsonUtils.putObject(jSONObject2, "package_name", mapF.get("package_name"));
        JsonUtils.putObject(jSONObject2, "first_install", Boolean.toString(Boolean.TRUE.equals((Boolean) mapF.get("first_install_v2"))));
        JsonUtils.putObject(jSONObject2, "md", this.f21417a.a(y4.f23906t));
        JsonUtils.putObject(jSONObject2, "mediation_provider", this.f21417a.V());
        SessionTracker sessionTrackerN0 = this.f21417a.n0();
        JsonUtils.putObject(jSONObject2, "app_state", sessionTrackerN0.getCurrentApplicationState().b());
        JsonUtils.putObject(jSONObject2, "app_state_duration_ms", Long.valueOf(sessionTrackerN0.getCurrentApplicationStateDurationMillis()));
        JsonUtils.putObject(jSONObject2, "session_id", sessionTrackerN0.getSessionId());
        JsonUtils.putObject(jSONObject2, "session_duration_ms", Long.valueOf(System.currentTimeMillis() - com.applovin.impl.sdk.k.n()));
        JsonUtils.putObject(jSONObject, "shared_fields", jSONObject2);
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            JSONObject jSONObject3 = new JSONObject();
            JsonUtils.putDouble(jSONObject3, "ts_ms", System.currentTimeMillis());
            JsonUtils.putString(jSONObject3, "type", d2Var.b());
            JsonUtils.putDouble(jSONObject3, "weight", d3);
            JsonUtils.putString(jSONObject3, AppLovinEventTypes.USER_COMPLETED_LEVEL, "DEBUG");
            a(map);
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) map);
            jSONArray.put(jSONObject3);
        }
        JsonUtils.putObject(jSONObject, "events", jSONArray);
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(java.util.Map r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r1 = 0
            android.content.Context r2 = com.applovin.impl.sdk.k.o()     // Catch: java.lang.Throwable -> L18
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L18
            android.content.Context r3 = com.applovin.impl.sdk.k.o()     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L18
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r1)     // Catch: java.lang.Throwable -> L19
            goto L1a
        L18:
            r3 = r0
        L19:
            r2 = 0
        L1a:
            java.lang.String r4 = "package_name"
            r6.put(r4, r3)
            if (r2 == 0) goto L23
            java.lang.String r0 = r2.versionName
        L23:
            java.lang.String r3 = "app_version"
            r6.put(r3, r0)
            if (r2 == 0) goto L2c
            int r1 = r2.versionCode
        L2c:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "app_version_code"
            r6.put(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.e2.b(java.util.Map):void");
    }

    private void a(Map map) {
        if (map == null) {
            return;
        }
        Object objA = this.f21417a.H().a();
        if (objA instanceof com.applovin.impl.sdk.ad.b) {
            map.put("fs_ad_network", "AppLovin");
            map.put("fs_ad_creative_id", Long.toString(((com.applovin.impl.sdk.ad.b) objA).getAdIdNumber()));
        } else if (objA instanceof y2) {
            y2 y2Var = (y2) objA;
            map.put("fs_ad_network", y2Var.getNetworkName());
            map.put("fs_ad_creative_id", y2Var.getCreativeId());
        } else {
            map.put("fs_ad_network", OfficeOpenXMLExtended.SECURITY_NONE);
            map.put("fs_ad_creative_id", OfficeOpenXMLExtended.SECURITY_NONE);
        }
    }

    private boolean a(d2 d2Var, long j8) {
        Long l10 = (Long) this.f21420d.get(d2Var);
        return System.currentTimeMillis() - (l10 != null ? l10.longValue() : -1L) < j8;
    }
}
