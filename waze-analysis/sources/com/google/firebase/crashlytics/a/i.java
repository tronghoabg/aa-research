package com.google.firebase.crashlytics.a;

import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    static final i f9765a = new i();

    /* renamed from: b, reason: collision with root package name */
    private final String f9766b = "FirebaseCrashlytics";

    public static i a() {
        return f9765a;
    }

    private final boolean j(int i2) {
        return i2 >= 4 || Log.isLoggable(this.f9766b, i2);
    }

    public final void b(String str) {
        c(str, null);
    }

    public final void c(String str, Throwable th) {
        if (j(3)) {
            Log.d(this.f9766b, str, th);
        }
    }

    public final void d(String str) {
        e(str, null);
    }

    public final void e(String str, Throwable th) {
        if (j(6)) {
            Log.e(this.f9766b, str, th);
        }
    }

    public final void f(String str) {
        if (j(4)) {
            Log.i(this.f9766b, str, null);
        }
    }

    public final void g(String str) {
        if (j(2)) {
            Log.v(this.f9766b, str, null);
        }
    }

    public final void h(String str) {
        i(str, null);
    }

    public final void i(String str, Throwable th) {
        if (j(5)) {
            Log.w(this.f9766b, str, th);
        }
    }
}
