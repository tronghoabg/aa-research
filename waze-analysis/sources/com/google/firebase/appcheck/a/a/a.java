package com.google.firebase.appcheck.a.a;

import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    static final a f8838a = new a("FirebaseAppCheck");

    /* renamed from: b, reason: collision with root package name */
    private final String f8839b;

    public a(String str) {
        this.f8839b = str;
    }

    private final boolean c(int i2) {
        return i2 >= 4 || Log.isLoggable(this.f8839b, 3);
    }

    public final void a(String str) {
        if (c(3)) {
            Log.d(this.f8839b, str, null);
        }
    }

    public final void b(String str) {
        if (c(6)) {
            Log.e(this.f8839b, str, null);
        }
    }
}
