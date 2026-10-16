package com.google.firebase.perf.c;

import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private static b f10299a;

    static final void a(String str) {
        Log.d("FirebasePerformance", str);
    }

    static final void b(String str) {
        Log.e("FirebasePerformance", str);
    }

    static final void c(String str) {
        Log.i("FirebasePerformance", str);
    }

    static final void d(String str) {
        Log.w("FirebasePerformance", str);
    }

    public static synchronized void e() {
        if (f10299a == null) {
            f10299a = new b();
        }
    }
}
