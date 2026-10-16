package com.google.firebase.remoteconfig.internal;

import Y0.c;
import Z9.e;
import Z9.f;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import j$.util.DesugarTimeZone;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f27374h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final Context f27375a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27376b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27377c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27378d;

    /* renamed from: e, reason: collision with root package name */
    public final String f27379e;

    /* renamed from: f, reason: collision with root package name */
    public final long f27380f;

    /* renamed from: g, reason: collision with root package name */
    public final long f27381g;

    public ConfigFetchHttpClient(Context context, String str, String str2, long j8, long j10) {
        this.f27375a = context;
        this.f27376b = str;
        this.f27377c = str2;
        Matcher matcher = f27374h.matcher(str);
        this.f27378d = matcher.matches() ? matcher.group(1) : null;
        this.f27379e = "firebase";
        this.f27380f = j8;
        this.f27381g = j10;
    }

    public static JSONObject c(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i5 = bufferedReader.read();
            if (i5 == -1) {
                return new JSONObject(sb2.toString());
            }
            sb2.append((char) i5);
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map map, Long l10) throws PackageManager.NameNotFoundException, e {
        HashMap map2 = new HashMap();
        if (str == null) {
            throw new e("Fetch failed: Firebase installation id is null.");
        }
        map2.put("appInstanceId", str);
        map2.put("appInstanceIdToken", str2);
        map2.put("appId", this.f27376b);
        Context context = this.f27375a;
        Locale locale = context.getResources().getConfiguration().locale;
        map2.put("countryCode", locale.getCountry());
        int i5 = Build.VERSION.SDK_INT;
        map2.put("languageCode", locale.toLanguageTag());
        map2.put("platformVersion", Integer.toString(i5));
        map2.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                map2.put("appVersion", packageInfo.versionName);
                map2.put("appBuild", Long.toString(i5 >= 28 ? c.d(packageInfo) : packageInfo.versionCode));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map2.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, context.getPackageName());
        map2.put("sdkVersion", "22.0.1");
        map2.put("analyticsUserProperties", new JSONObject(map));
        if (l10 != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            map2.put("firstOpenTime", simpleDateFormat.format(l10));
        }
        return new JSONObject(map2);
    }

    public final HttpURLConnection b() {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.f27378d + "/namespaces/" + this.f27379e + ":fetch").openConnection();
        } catch (IOException e7) {
            throw new f(e7.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009d A[LOOP:0: B:13:0x0097->B:15:0x009d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cf A[Catch: all -> 0x017f, IOException | JSONException -> 0x0181, IOException -> 0x0183, TRY_LEAVE, TryCatch #15 {all -> 0x017f, blocks: (B:16:0x00b3, B:18:0x00cf, B:68:0x0185, B:69:0x018e, B:70:0x018f, B:71:0x0196), top: B:106:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0185 A[Catch: all -> 0x017f, IOException | JSONException -> 0x0181, IOException -> 0x0183, TRY_ENTER, TryCatch #15 {all -> 0x017f, blocks: (B:16:0x00b3, B:18:0x00cf, B:68:0x0185, B:69:0x018e, B:70:0x018f, B:71:0x0196), top: B:106:0x009b }] */
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aa.g fetch(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10, java.lang.String r11, java.util.Map<java.lang.String, java.lang.String> r12, java.lang.Long r13, java.util.Date r14) throws Z9.f {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.lang.Long, java.util.Date):aa.g");
    }
}
