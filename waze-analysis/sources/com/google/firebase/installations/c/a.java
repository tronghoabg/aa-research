package com.google.firebase.installations.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import androidx.autofill.HintConstants;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.o.ag;
import com.google.firebase.f.g;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f10006a = Pattern.compile("[0-9]+s");

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f10007b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    private final Context f10008c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.g.c f10009d;

    /* renamed from: e, reason: collision with root package name */
    private final d f10010e = new d();

    public a(Context context, com.google.firebase.g.c cVar) {
        this.f10008c = context;
        this.f10009d = cVar;
    }

    static long a(String str) {
        av.d(f10006a.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private final HttpURLConnection d(URL url, String str) throws com.google.firebase.installations.e {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f10008c.getPackageName());
            g gVar = (g) this.f10009d.a();
            if (gVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) ag.f(gVar.a()));
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e2);
                } catch (ExecutionException e3) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e3);
                }
            }
            String strB = null;
            try {
                Context context = this.f10008c;
                byte[] bArrB = com.google.android.gms.common.util.a.b(context, context.getPackageName());
                if (bArrB == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                } else {
                    strB = com.google.android.gms.common.util.d.b(bArrB);
                }
            } catch (PackageManager.NameNotFoundException e4) {
                Log.e("ContentValues", "No such package: ".concat(String.valueOf(this.f10008c.getPackageName())), e4);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", strB);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new com.google.firebase.installations.e("Firebase Installations Service is unavailable. Please try again later.");
        }
    }

    private static void e() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void f(HttpURLConnection httpURLConnection, String str, String str2, String str3) throws IOException {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f10007b));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Log.w("Firebase-Installations", String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, TextUtils.isEmpty(str) ? "" : ", ".concat(String.valueOf(str))));
    }

    private static void g(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    private static boolean h(int i2) {
        return i2 >= 200 && i2 < 300;
    }

    private static byte[] i(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static final URL j(String str) throws com.google.firebase.installations.e {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e2) {
            throw new com.google.firebase.installations.e(e2.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.firebase.installations.c.a] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final c b(String str, String str2, String str3, String str4, String str5) {
        int responseCode;
        c cVarA;
        a aVar = this;
        if (!aVar.f10010e.b()) {
            throw new com.google.firebase.installations.e("Firebase Installations Service is unavailable. Please try again later.");
        }
        ?? r8 = 1;
        int i2 = 0;
        URL urlJ = j(String.format("projects/%s/installations", str3));
        ?? r1 = aVar;
        while (i2 <= r8) {
            TrafficStats.setThreadStatsTag(32769);
            ?? D = r1.d(urlJ, str);
            try {
                try {
                    D.setRequestMethod(ShareTarget.METHOD_POST);
                    D.setDoOutput(r8);
                    if (str5 != null) {
                        D.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            try {
                                jSONObject.put("fid", str2);
                                jSONObject.put("appId", str4);
                                jSONObject.put("authVersion", "FIS_v2");
                                jSONObject.put("sdkVersion", "a:19.1.1_1p");
                                g(D, i(jSONObject));
                                responseCode = D.getResponseCode();
                                r1.f10010e.a(responseCode);
                            } catch (JSONException e2) {
                                e = e2;
                                boolean z = r8 == true ? 1 : 0;
                                throw new IllegalStateException(e);
                            }
                        } catch (IOException | AssertionError unused) {
                            r1 = r8;
                            D.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i2++;
                            r8 = r1;
                            r1 = this;
                        }
                    } catch (JSONException e3) {
                        e = e3;
                    }
                } catch (IOException | AssertionError unused2) {
                }
                if (h(responseCode)) {
                    InputStream inputStream = D.getInputStream();
                    JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f10007b));
                    e eVarA = f.a();
                    b bVar = new b();
                    jsonReader.beginObject();
                    r8 = r8;
                    while (jsonReader.hasNext()) {
                        try {
                            String strNextName = jsonReader.nextName();
                            InputStream inputStream2 = inputStream;
                            if (strNextName.equals(HintConstants.AUTOFILL_HINT_NAME)) {
                                bVar.f(jsonReader.nextString());
                            } else if (strNextName.equals("fid")) {
                                bVar.c(jsonReader.nextString());
                            } else if (strNextName.equals("refreshToken")) {
                                bVar.d(jsonReader.nextString());
                            } else if (strNextName.equals("authToken")) {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName2 = jsonReader.nextName();
                                    if (strNextName2.equals("token")) {
                                        eVarA.c(jsonReader.nextString());
                                    } else if (strNextName2.equals("expiresIn")) {
                                        eVarA.d(a(jsonReader.nextString()));
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                bVar.b(eVarA.a());
                                jsonReader.endObject();
                            } else {
                                jsonReader.skipValue();
                            }
                            inputStream = inputStream2;
                            r8 = 1;
                        } catch (IOException | AssertionError unused3) {
                            r1 = 1;
                        }
                    }
                    jsonReader.endObject();
                    jsonReader.close();
                    inputStream.close();
                    bVar.e(1);
                    cVarA = bVar.a();
                    return cVarA;
                }
                try {
                    r1 = r8 == true ? 1 : 0;
                    f(D, str4, str, str3);
                } catch (IOException | AssertionError unused4) {
                    continue;
                }
                if (responseCode == 429) {
                    throw new com.google.firebase.installations.e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                }
                if (responseCode < 500 || responseCode >= 600) {
                    e();
                    b bVar2 = new b();
                    bVar2.e(2);
                    cVarA = bVar2.a();
                    return cVarA;
                }
                D.disconnect();
                TrafficStats.clearThreadStatsTag();
                i2++;
                r8 = r1;
                r1 = this;
            } finally {
                D.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new com.google.firebase.installations.e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final f c(String str, String str2, String str3, String str4) {
        int responseCode;
        f fVarA;
        if (!this.f10010e.b()) {
            throw new com.google.firebase.installations.e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlJ = j(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i2 = 0; i2 <= 1; i2++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionD = d(urlJ, str);
            try {
                try {
                    httpURLConnectionD.setRequestMethod(ShareTarget.METHOD_POST);
                    httpURLConnectionD.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionD.setDoOutput(true);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("sdkVersion", "a:19.1.1_1p");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("installation", jSONObject);
                        g(httpURLConnectionD, i(jSONObject2));
                        responseCode = httpURLConnectionD.getResponseCode();
                        this.f10010e.a(responseCode);
                    } catch (JSONException e2) {
                        throw new IllegalStateException(e2);
                    }
                } finally {
                    httpURLConnectionD.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (h(responseCode)) {
                InputStream inputStream = httpURLConnectionD.getInputStream();
                JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f10007b));
                e eVarA = f.a();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    if (strNextName.equals("token")) {
                        eVarA.c(jsonReader.nextString());
                    } else if (strNextName.equals("expiresIn")) {
                        eVarA.d(a(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.close();
                inputStream.close();
                eVarA.b(1);
                fVarA = eVarA.a();
            } else {
                f(httpURLConnectionD, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    e eVarA2 = f.a();
                    eVarA2.b(3);
                    fVarA = eVarA2.a();
                } else {
                    if (responseCode == 429) {
                        throw new com.google.firebase.installations.e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        e();
                        e eVarA3 = f.a();
                        eVarA3.b(2);
                        fVarA = eVarA3.a();
                    } else {
                        httpURLConnectionD.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            }
            return fVarA;
        }
        throw new com.google.firebase.installations.e("Firebase Installations Service is unavailable. Please try again later.");
    }
}
