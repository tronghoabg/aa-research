package aa;

import A7.V;
import D6.C0388o;
import R8.v;
import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n7.C3597b;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f17461p = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f17462q = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f17463a;

    /* renamed from: c, reason: collision with root package name */
    public int f17465c;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f17468f;

    /* renamed from: g, reason: collision with root package name */
    public final h f17469g;

    /* renamed from: h, reason: collision with root package name */
    public final s8.g f17470h;

    /* renamed from: i, reason: collision with root package name */
    public final P9.d f17471i;

    /* renamed from: j, reason: collision with root package name */
    public final c f17472j;
    public final Context k;

    /* renamed from: o, reason: collision with root package name */
    public final k f17476o;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17464b = false;

    /* renamed from: m, reason: collision with root package name */
    public final Random f17474m = new Random();

    /* renamed from: n, reason: collision with root package name */
    public final C3597b f17475n = C3597b.f40921a;

    /* renamed from: l, reason: collision with root package name */
    public final String f17473l = "firebase";

    /* renamed from: d, reason: collision with root package name */
    public boolean f17466d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17467e = false;

    public n(s8.g gVar, P9.d dVar, h hVar, c cVar, Context context, LinkedHashSet linkedHashSet, k kVar, ScheduledExecutorService scheduledExecutorService) {
        this.f17463a = linkedHashSet;
        this.f17468f = scheduledExecutorService;
        this.f17465c = Math.max(8 - kVar.b().f17450a, 1);
        this.f17470h = gVar;
        this.f17469g = hVar;
        this.f17471i = dVar;
        this.f17472j = cVar;
        this.k = context;
        this.f17476o = kVar;
    }

    public static void b(HttpURLConnection httpURLConnection) throws IOException {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    public static boolean d(int i5) {
        return i5 == 408 || i5 == 429 || i5 == 502 || i5 == 503 || i5 == 504;
    }

    public static String f(InputStream inputStream) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean a() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedHashSet r0 = r1.f17463a     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f17464b     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f17466d     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f17467e     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L17:
            r0 = move-exception
            goto L1c
        L19:
            r0 = 0
        L1a:
            monitor-exit(r1)
            return r0
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.n.a():boolean");
    }

    public final String c(String str) {
        s8.g gVar = this.f17470h;
        gVar.a();
        Matcher matcher = f17462q.matcher(gVar.f45330c.f45344b);
        return v.g("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public final synchronized void e(long j8) {
        try {
            if (a()) {
                int i5 = this.f17465c;
                if (i5 > 0) {
                    this.f17465c = i5 - 1;
                    this.f17468f.schedule(new V(this, 22), j8, TimeUnit.MILLISECONDS);
                } else if (!this.f17467e) {
                    g(new Z9.e("Unable to connect to the server. Check your connection and try again."));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g(Z9.f fVar) {
        Iterator it = this.f17463a.iterator();
        while (it.hasNext()) {
            ((Z9.b) it.next()).b(fVar);
        }
    }

    public final synchronized void h() {
        this.f17475n.getClass();
        e(Math.max(0L, this.f17476o.b().f17451b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    public final synchronized void i(boolean z2) {
        this.f17464b = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = "POST"
            r7.setRequestMethod(r0)
            java.lang.String r0 = "X-Goog-Firebase-Installations-Auth"
            r7.setRequestProperty(r0, r9)
            s8.g r9 = r6.f17470h
            r9.a()
            s8.l r0 = r9.f45330c
            java.lang.String r1 = r0.f45343a
            java.lang.String r2 = "X-Goog-Api-Key"
            r7.setRequestProperty(r2, r1)
            android.content.Context r1 = r6.k
            java.lang.String r2 = r1.getPackageName()
            java.lang.String r3 = "X-Android-Package"
            r7.setRequestProperty(r3, r2)
            java.lang.String r2 = "FirebaseRemoteConfig"
            java.lang.String r3 = "Could not get fingerprint hash for package: "
            r4 = 0
            java.lang.String r5 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            byte[] r5 = n7.AbstractC3598c.g(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            if (r5 != 0) goto L47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            r5.<init>(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            java.lang.String r3 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            r5.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            java.lang.String r3 = r5.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            android.util.Log.e(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
        L45:
            r1 = r4
            goto L62
        L47:
            java.lang.String r1 = n7.AbstractC3598c.c(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            goto L62
        L4c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "No such package: "
            r3.<init>(r5)
            java.lang.String r1 = r1.getPackageName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.i(r2, r1)
            goto L45
        L62:
            java.lang.String r2 = "X-Android-Cert"
            r7.setRequestProperty(r2, r1)
            java.lang.String r1 = "X-Google-GFE-Can-Retry"
            java.lang.String r2 = "yes"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "X-Accept-Response-Streaming"
            java.lang.String r2 = "true"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "Accept"
            r7.setRequestProperty(r1, r2)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r9.a()
            java.lang.String r2 = r0.f45344b
            java.util.regex.Pattern r3 = aa.n.f17462q
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L9c
            r3 = 1
            java.lang.String r4 = r2.group(r3)
        L9c:
            java.lang.String r2 = "project"
            r1.put(r2, r4)
            java.lang.String r2 = "namespace"
            java.lang.String r3 = r6.f17473l
            r1.put(r2, r3)
            aa.h r2 = r6.f17469g
            aa.k r2 = r2.f17443g
            android.content.SharedPreferences r2 = r2.f17454a
            java.lang.String r3 = "last_template_version"
            r4 = 0
            long r2 = r2.getLong(r3, r4)
            java.lang.String r2 = java.lang.Long.toString(r2)
            java.lang.String r3 = "lastKnownVersionNumber"
            r1.put(r3, r2)
            r9.a()
            java.lang.String r9 = "appId"
            java.lang.String r0 = r0.f45344b
            r1.put(r9, r0)
            java.lang.String r9 = "sdkVersion"
            java.lang.String r0 = "22.0.1"
            r1.put(r9, r0)
            java.lang.String r9 = "appInstanceId"
            r1.put(r9, r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>(r1)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "utf-8"
            byte[] r8 = r8.getBytes(r9)
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream
            java.io.OutputStream r7 = r7.getOutputStream()
            r9.<init>(r7)
            r9.write(r8)
            r9.flush()
            r9.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.n.j(java.net.HttpURLConnection, java.lang.String, java.lang.String):void");
    }

    public final synchronized C0388o k(HttpURLConnection httpURLConnection) {
        return new C0388o(httpURLConnection, this.f17469g, this.f17472j, this.f17463a, new m(this), this.f17468f);
    }

    public final void l(Date date) {
        k kVar = this.f17476o;
        int i5 = kVar.b().f17450a + 1;
        kVar.e(i5, new Date(date.getTime() + (TimeUnit.MINUTES.toMillis(f17461p[(i5 < 8 ? i5 : 8) - 1]) / 2) + this.f17474m.nextInt((int) r2)));
    }
}
