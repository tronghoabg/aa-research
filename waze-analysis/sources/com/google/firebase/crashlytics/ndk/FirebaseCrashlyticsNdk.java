package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.crashlytics.a.e.cy;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class FirebaseCrashlyticsNdk implements com.google.firebase.crashlytics.a.a {

    /* renamed from: a, reason: collision with root package name */
    private static FirebaseCrashlyticsNdk f9785a;

    /* renamed from: b, reason: collision with root package name */
    private final b f9786b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9787c;

    /* renamed from: d, reason: collision with root package name */
    private String f9788d;

    /* renamed from: e, reason: collision with root package name */
    private c f9789e;

    public static /* synthetic */ void $r8$lambda$fqAtnnSbS_XsxcFj2Q4TXhmT77s(FirebaseCrashlyticsNdk firebaseCrashlyticsNdk, String str, String str2, long j2, cy cyVar) {
        com.google.firebase.crashlytics.a.i.a().b("Initializing native session: ".concat(String.valueOf(str)));
        if (firebaseCrashlyticsNdk.f9786b.b(str, str2, j2, cyVar)) {
            return;
        }
        com.google.firebase.crashlytics.a.i.a().h("Failed to initialize Crashlytics NDK for session ".concat(String.valueOf(str)));
    }

    FirebaseCrashlyticsNdk(b bVar, boolean z) {
        this.f9786b = bVar;
        this.f9787c = z;
    }

    static FirebaseCrashlyticsNdk a(Context context, boolean z) {
        FirebaseCrashlyticsNdk firebaseCrashlyticsNdk = new FirebaseCrashlyticsNdk(new b(context, new JniNativeApi(context), new com.google.firebase.crashlytics.a.f.c(context)), z);
        f9785a = firebaseCrashlyticsNdk;
        return firebaseCrashlyticsNdk;
    }

    public static FirebaseCrashlyticsNdk getInstance() {
        FirebaseCrashlyticsNdk firebaseCrashlyticsNdk = f9785a;
        if (firebaseCrashlyticsNdk != null) {
            return firebaseCrashlyticsNdk;
        }
        throw new NullPointerException("FirebaseCrashlyticsNdk component is not present.");
    }

    @Override // com.google.firebase.crashlytics.a.a
    public com.google.firebase.crashlytics.a.j getSessionFileProvider(String str) {
        return new i(this.f9786b.a(str));
    }

    @Override // com.google.firebase.crashlytics.a.a
    public boolean hasCrashDataForCurrentSession() {
        String str = this.f9788d;
        return str != null && hasCrashDataForSession(str);
    }

    @Override // com.google.firebase.crashlytics.a.a
    public boolean hasCrashDataForSession(String str) {
        File file;
        g gVar = this.f9786b.a(str).f9811a;
        return gVar != null && (((file = gVar.f9809a) != null && file.exists()) || gVar.f9810b != null);
    }

    public synchronized void installSignalHandler() {
        c cVar = this.f9789e;
        if (cVar != null) {
            cVar.a();
        } else if (this.f9787c) {
            com.google.firebase.crashlytics.a.i.a().h("Native signal handler already installed; skipping re-install.");
        } else {
            com.google.firebase.crashlytics.a.i.a().b("Deferring signal handler installation until the FirebaseCrashlyticsNdk session has been prepared");
            this.f9787c = true;
        }
    }

    @Override // com.google.firebase.crashlytics.a.a
    public synchronized void prepareNativeSession(String str, String str2, long j2, cy cyVar) throws Throwable {
        try {
            try {
                this.f9788d = str;
                c cVar = new c(this, str, str2, j2, cyVar);
                this.f9789e = cVar;
                if (this.f9787c) {
                    cVar.a();
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
