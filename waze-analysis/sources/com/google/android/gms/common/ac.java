package com.google.android.gms.common;

import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class ac {

    /* renamed from: d, reason: collision with root package name */
    private static final ac f4667d = new ac(true, null, null);

    /* renamed from: a, reason: collision with root package name */
    final boolean f4668a;

    /* renamed from: b, reason: collision with root package name */
    final String f4669b;

    /* renamed from: c, reason: collision with root package name */
    final Throwable f4670c;

    private ac(boolean z, String str, Throwable th) {
        this.f4668a = z;
        this.f4669b = str;
        this.f4670c = th;
    }

    @Deprecated
    static ac b() {
        return f4667d;
    }

    static ac c(String str) {
        return new ac(false, str, null);
    }

    static ac d(String str, Throwable th) {
        return new ac(false, str, th);
    }

    public static ac f() {
        return new ac(true, null, null);
    }

    static ac g(String str, Throwable th) {
        return new ac(false, str, th);
    }

    String a() {
        return this.f4669b;
    }

    final void e() {
        if (this.f4668a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th = this.f4670c;
        if (th != null) {
            Log.d("GoogleCertificatesRslt", a(), th);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }

    /* synthetic */ ac() {
        this(false, null, null);
    }
}
