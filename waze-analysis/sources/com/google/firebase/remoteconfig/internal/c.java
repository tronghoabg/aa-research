package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.o.ag;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Set f10651a;

    /* renamed from: b, reason: collision with root package name */
    private final HttpURLConnection f10652b;

    /* renamed from: c, reason: collision with root package name */
    private final m f10653c;

    /* renamed from: d, reason: collision with root package name */
    private final f f10654d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.a f10655e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f10656f;

    /* renamed from: h, reason: collision with root package name */
    private final v f10658h;

    /* renamed from: g, reason: collision with root package name */
    private final Random f10657g = new Random();

    /* renamed from: i, reason: collision with root package name */
    private boolean f10659i = false;

    public c(HttpURLConnection httpURLConnection, m mVar, f fVar, Set set, com.google.firebase.remoteconfig.a aVar, ScheduledExecutorService scheduledExecutorService, v vVar) {
        this.f10652b = httpURLConnection;
        this.f10653c = mVar;
        this.f10654d = fVar;
        this.f10651a = set;
        this.f10655e = aVar;
        this.f10656f = scheduledExecutorService;
        this.f10658h = vVar;
    }

    public static /* synthetic */ com.google.android.gms.o.t c(c cVar, com.google.android.gms.o.t tVar, com.google.android.gms.o.t tVar2, long j2, int i2) {
        Boolean boolValueOf;
        if (!tVar.k()) {
            return ag.b(new com.google.firebase.remoteconfig.c("Failed to auto-fetch config update.", tVar.f()));
        }
        if (!tVar2.k()) {
            return ag.b(new com.google.firebase.remoteconfig.c("Failed to get activated config for auto-fetch", tVar2.f()));
        }
        k kVar = (k) tVar.g();
        h hVarA = (h) tVar2.g();
        if (kVar.b() != null) {
            boolValueOf = Boolean.valueOf(kVar.b().a() >= j2);
        } else {
            boolValueOf = Boolean.valueOf(kVar.a() == 1);
        }
        if (!boolValueOf.booleanValue()) {
            Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
            cVar.e(i2, j2);
            return ag.c(null);
        }
        if (kVar.b() == null) {
            Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
            return ag.c(null);
        }
        if (hVarA == null) {
            int i3 = h.f10675a;
            hVarA = new g().a();
        }
        if (hVarA.e(kVar.b()).isEmpty()) {
            Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
            return ag.c(null);
        }
        cVar.i();
        return ag.c(null);
    }

    private final void e(int i2, long j2) {
        if (i2 == 0) {
            f(new com.google.firebase.remoteconfig.f("Unable to fetch the latest version of the template."));
            return;
        }
        Random random = this.f10657g;
        this.f10656f.schedule(new b(this, i2, j2), random.nextInt(4), TimeUnit.SECONDS);
    }

    private final synchronized void f(com.google.firebase.remoteconfig.d dVar) {
        Iterator it = this.f10651a.iterator();
        while (it.hasNext()) {
            ((com.google.firebase.remoteconfig.a) it.next()).a(dVar);
        }
    }

    private final synchronized void g(int i2) {
        this.f10658h.l(new Date(new Date(System.currentTimeMillis()).getTime() + (i2 * 1000)));
    }

    private final synchronized boolean h() {
        return this.f10651a.isEmpty();
    }

    private final synchronized void i() {
        Iterator it = this.f10651a.iterator();
        while (it.hasNext()) {
            ((com.google.firebase.remoteconfig.a) it.next()).b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        r9 = new org.json.JSONObject(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r9.has("featureDisabled") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (r9.getBoolean("featureDisabled") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r14.f10655e.a(new com.google.firebase.remoteconfig.f("The server is temporarily unavailable. Try again in a few minutes."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (h() != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r9.has("latestTemplateVersionNumber") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        r10 = r14.f10653c.a();
        r12 = r9.getLong("latestTemplateVersionNumber");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        if (r12 <= r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        e(3, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
    
        if (r9.has("retryIntervalSeconds") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
    
        g(r9.getInt("retryIntervalSeconds"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() throws java.io.IOException {
        /*
            r14 = this;
            java.lang.String r0 = "retryIntervalSeconds"
            java.lang.String r1 = "latestTemplateVersionNumber"
            java.lang.String r2 = "featureDisabled"
            java.lang.String r3 = "Exception thrown when closing connection stream. Retrying connection..."
            java.lang.String r4 = "FirebaseRemoteConfig"
            java.net.HttpURLConnection r5 = r14.f10652b
            if (r5 != 0) goto L10
            goto Ld5
        L10:
            r6 = 0
            java.io.InputStream r6 = r5.getInputStream()     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            java.lang.String r8 = "utf-8"
            r7.<init>(r6, r8)     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            r5.<init>(r7)     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            java.lang.String r7 = ""
        L23:
            r8 = r7
        L24:
            java.lang.String r9 = r5.readLine()     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            if (r9 == 0) goto Lbb
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            java.lang.String r8 = r8.concat(r9)     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            java.lang.String r10 = "}"
            boolean r9 = r9.contains(r10)     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            if (r9 == 0) goto L24
            r9 = 123(0x7b, float:1.72E-43)
            int r9 = r8.indexOf(r9)     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            r10 = 125(0x7d, float:1.75E-43)
            int r10 = r8.lastIndexOf(r10)     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            if (r9 < 0) goto L55
            if (r10 >= 0) goto L4b
            goto L55
        L4b:
            if (r9 < r10) goto L4e
            goto L55
        L4e:
            int r10 = r10 + 1
            java.lang.String r8 = r8.substring(r9, r10)     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            goto L56
        L55:
            r8 = r7
        L56:
            boolean r9 = r8.isEmpty()     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            if (r9 != 0) goto L24
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: org.json.JSONException -> La7 java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            r9.<init>(r8)     // Catch: org.json.JSONException -> La7 java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            boolean r8 = r9.has(r2)     // Catch: org.json.JSONException -> La7 java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            if (r8 == 0) goto L7a
            boolean r8 = r9.getBoolean(r2)     // Catch: org.json.JSONException -> La7 java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            if (r8 == 0) goto L7a
            com.google.firebase.remoteconfig.a r8 = r14.f10655e     // Catch: org.json.JSONException -> La7 java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            com.google.firebase.remoteconfig.f r9 = new com.google.firebase.remoteconfig.f     // Catch: org.json.JSONException -> La7 java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            java.lang.String r10 = "The server is temporarily unavailable. Try again in a few minutes."
            r9.<init>(r10)     // Catch: org.json.JSONException -> La7 java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            r8.a(r9)     // Catch: org.json.JSONException -> La7 java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            goto Lbb
        L7a:
            boolean r8 = r14.h()     // Catch: org.json.JSONException -> La7 java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            if (r8 != 0) goto Lbb
            boolean r8 = r9.has(r1)     // Catch: org.json.JSONException -> La7 java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            if (r8 == 0) goto L98
            com.google.firebase.remoteconfig.internal.m r8 = r14.f10653c     // Catch: org.json.JSONException -> La7 java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            long r10 = r8.a()     // Catch: org.json.JSONException -> La7 java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            long r12 = r9.getLong(r1)     // Catch: org.json.JSONException -> La7 java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            int r8 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r8 <= 0) goto L98
            r8 = 3
            r14.e(r8, r12)     // Catch: org.json.JSONException -> La7 java.lang.Throwable -> Lbf java.io.IOException -> Lc1
        L98:
            boolean r8 = r9.has(r0)     // Catch: org.json.JSONException -> La7 java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            if (r8 == 0) goto L23
            int r8 = r9.getInt(r0)     // Catch: org.json.JSONException -> La7 java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            r14.g(r8)     // Catch: org.json.JSONException -> La7 java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            goto L23
        La7:
            r8 = move-exception
            com.google.firebase.remoteconfig.c r9 = new com.google.firebase.remoteconfig.c     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            java.lang.Throwable r10 = r8.getCause()     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            r9.<init>(r10)     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            r14.f(r9)     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            java.lang.String r9 = "Unable to parse latest config update message."
            android.util.Log.e(r4, r9, r8)     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            goto L23
        Lbb:
            r5.close()     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            goto Lcb
        Lbf:
            r14 = move-exception
            goto Ld6
        Lc1:
            r0 = move-exception
            boolean r14 = r14.f10659i     // Catch: java.lang.Throwable -> Lbf
            if (r14 != 0) goto Lcb
            java.lang.String r14 = "Real-time connection was closed due to an exception."
            android.util.Log.d(r4, r14, r0)     // Catch: java.lang.Throwable -> Lbf
        Lcb:
            if (r6 == 0) goto Ld5
            r6.close()     // Catch: java.io.IOException -> Ld1
            goto Ld5
        Ld1:
            r14 = move-exception
            android.util.Log.d(r4, r3, r14)
        Ld5:
            return
        Ld6:
            if (r6 == 0) goto Le0
            r6.close()     // Catch: java.io.IOException -> Ldc
            goto Le0
        Ldc:
            r0 = move-exception
            android.util.Log.d(r4, r3, r0)
        Le0:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.c.a():void");
    }

    public final void b(boolean z) {
        this.f10659i = z;
    }

    public final synchronized void d(int i2, final long j2) {
        try {
            try {
                final int i3 = i2 - 1;
                final com.google.android.gms.o.t tVarE = this.f10653c.e(l.REALTIME, 3 - i3);
                final com.google.android.gms.o.t tVarA = this.f10654d.a();
                ag.e(tVarE, tVarA).c(this.f10656f, new com.google.android.gms.o.a() { // from class: com.google.firebase.remoteconfig.internal.a
                    @Override // com.google.android.gms.o.a
                    public final Object a(com.google.android.gms.o.t tVar) {
                        return c.c(this.f10634a, tVarE, tVarA, j2, i3);
                    }
                });
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
