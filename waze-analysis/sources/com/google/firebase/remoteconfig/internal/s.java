package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.credentials.provider.CredentialEntry;
import com.google.android.gms.o.ag;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    static final int[] f10724a = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f10725c = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: b, reason: collision with root package name */
    final f f10726b;

    /* renamed from: d, reason: collision with root package name */
    private final Set f10727d;

    /* renamed from: f, reason: collision with root package name */
    private int f10729f;

    /* renamed from: i, reason: collision with root package name */
    private HttpURLConnection f10732i;

    /* renamed from: j, reason: collision with root package name */
    private c f10733j;

    /* renamed from: k, reason: collision with root package name */
    private final ScheduledExecutorService f10734k;

    /* renamed from: l, reason: collision with root package name */
    private final m f10735l;
    private final com.google.firebase.e m;
    private final com.google.firebase.installations.d n;
    private final Context o;
    private final String p;
    private final v r;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10728e = false;
    private final Random q = new Random();

    /* renamed from: g, reason: collision with root package name */
    private boolean f10730g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10731h = false;
    private final Object s = new Object();

    public s(com.google.firebase.e eVar, com.google.firebase.installations.d dVar, m mVar, f fVar, Context context, String str, Set set, v vVar, ScheduledExecutorService scheduledExecutorService) {
        this.f10727d = set;
        this.f10734k = scheduledExecutorService;
        this.f10729f = Math.max(8 - vVar.e().a(), 1);
        this.m = eVar;
        this.f10735l = mVar;
        this.n = dVar;
        this.f10726b = fVar;
        this.o = context;
        this.p = str;
        this.r = vVar;
    }

    public static /* synthetic */ com.google.android.gms.o.t i(s sVar, com.google.android.gms.o.t tVar, com.google.android.gms.o.t tVar2) throws IOException {
        if (!tVar.k()) {
            return ag.b(new com.google.firebase.remoteconfig.c("Firebase Installations failed to get installation auth token for config update listener connection.", tVar.f()));
        }
        if (!tVar2.k()) {
            return ag.b(new com.google.firebase.remoteconfig.c("Firebase Installations failed to get installation ID for config update listener connection.", tVar2.f()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) sVar.l().openConnection();
            String strA = ((com.google.firebase.installations.j) tVar.g()).a();
            String str = (String) tVar2.g();
            httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
            httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", strA);
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", sVar.m.d().b());
            Context context = sVar.o;
            httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
            String strB = null;
            try {
                byte[] bArrB = com.google.android.gms.common.util.a.b(context, context.getPackageName());
                if (bArrB == null) {
                    Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
                } else {
                    strB = com.google.android.gms.common.util.d.b(bArrB);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.i("FirebaseRemoteConfig", "No such package: ".concat(String.valueOf(sVar.o.getPackageName())));
            }
            httpURLConnection.setRequestProperty("X-Android-Cert", strB);
            httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
            httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", CredentialEntry.TRUE_STRING);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            HashMap map = new HashMap();
            com.google.firebase.e eVar = sVar.m;
            map.put("project", k(eVar.d().c()));
            map.put("namespace", sVar.p);
            map.put("lastKnownVersionNumber", Long.toString(sVar.f10735l.a()));
            map.put("appId", eVar.d().c());
            map.put("sdkVersion", "23.0.2_1p");
            map.put("appInstanceId", str);
            byte[] bytes = new JSONObject(map).toString().getBytes("utf-8");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            bufferedOutputStream.write(bytes);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            return ag.c(httpURLConnection);
        } catch (IOException e2) {
            return ag.b(new com.google.firebase.remoteconfig.c("Failed to open HTTP stream connection", e2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7 A[Catch: all -> 0x0089, TryCatch #3 {all -> 0x0089, blocks: (B:8:0x002b, B:10:0x0030, B:42:0x00b3, B:44:0x00b7, B:45:0x00bb), top: B:78:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #3 {all -> 0x0089, blocks: (B:8:0x002b, B:10:0x0030, B:42:0x00b3, B:44:0x00b7, B:45:0x00bb), top: B:78:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0146  */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.firebase.remoteconfig.internal.s] */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.google.android.gms.o.t] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r12v37, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Integer, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.google.android.gms.o.t j(com.google.firebase.remoteconfig.internal.s r11, com.google.android.gms.o.t r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.s.j(com.google.firebase.remoteconfig.internal.s, com.google.android.gms.o.t):com.google.android.gms.o.t");
    }

    private static String k(String str) {
        Matcher matcher = f10725c.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private final URL l() {
        try {
            return new URL(String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", k(this.m.d().c()), this.p));
        } catch (MalformedURLException unused) {
            Log.e("FirebaseRemoteConfig", "URL is malformed");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void m() {
        this.f10730g = true;
    }

    private final synchronized void n(long j2) {
        if (s()) {
            int i2 = this.f10729f;
            if (i2 > 0) {
                this.f10729f = i2 - 1;
                this.f10734k.schedule(new q(this), j2, TimeUnit.MILLISECONDS);
            } else if (!this.f10731h) {
                o(new com.google.firebase.remoteconfig.c());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void o(com.google.firebase.remoteconfig.d dVar) {
        Iterator it = this.f10727d.iterator();
        while (it.hasNext()) {
            ((com.google.firebase.remoteconfig.a) it.next()).a(dVar);
        }
    }

    private final synchronized void p() {
        this.f10729f = 8;
    }

    private final synchronized void q(boolean z) {
        this.f10728e = z;
    }

    private final void r(Date date) {
        v vVar = this.r;
        int iA = vVar.e().a() + 1;
        vVar.m(iA, new Date(date.getTime() + (TimeUnit.MINUTES.toMillis(f10724a[(iA < 8 ? iA : 8) - 1]) / 2) + this.q.nextInt((int) r2)));
    }

    private final synchronized boolean s() {
        if (!this.f10727d.isEmpty() && !this.f10728e && !this.f10730g) {
            if (!this.f10731h) {
                return true;
            }
        }
        return false;
    }

    private final synchronized boolean t() {
        boolean zS;
        zS = s();
        if (zS) {
            q(true);
        }
        return zS;
    }

    private static final void u(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e2);
            }
        }
    }

    private static final boolean v(int i2) {
        return i2 == 408 || i2 == 429 || i2 == 502 || i2 == 503 || i2 == 504;
    }

    private static final String w(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    public final synchronized c a(HttpURLConnection httpURLConnection) {
        return new c(httpURLConnection, this.f10735l, this.f10726b, this.f10727d, new r(this), this.f10734k, this.r);
    }

    public final void d() {
        if (t()) {
            if (new Date(System.currentTimeMillis()).before(this.r.e().b())) {
                f();
                return;
            }
            com.google.firebase.installations.d dVar = this.n;
            com.google.android.gms.o.t tVarH = dVar.h();
            com.google.android.gms.o.t tVarA = dVar.a();
            com.google.android.gms.o.t tVarE = ag.e(tVarH, tVarA);
            ScheduledExecutorService scheduledExecutorService = this.f10734k;
            com.google.android.gms.o.t tVarC = tVarE.c(scheduledExecutorService, new p(this, tVarH, tVarA, 0));
            ag.e(tVarC).b(scheduledExecutorService, new com.google.android.gms.l.q(this, tVarC, 5, null));
        }
    }

    public final void e(InputStream inputStream, InputStream inputStream2) throws IOException {
        HttpURLConnection httpURLConnection = this.f10732i;
        if (httpURLConnection != null && !this.f10731h) {
            httpURLConnection.disconnect();
        }
        u(inputStream);
        u(inputStream2);
    }

    public final synchronized void f() {
        n(Math.max(0L, this.r.e().b().getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    public final void g(boolean z) {
        HttpURLConnection httpURLConnection;
        synchronized (this.s) {
            this.f10731h = z;
            c cVar = this.f10733j;
            if (cVar != null) {
                cVar.b(z);
            }
            if (z && (httpURLConnection = this.f10732i) != null) {
                httpURLConnection.disconnect();
            }
        }
    }

    public final void h() {
        n(0L);
    }
}
