package com.google.firebase.concurrent;

import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class v {
    public static Executor a() {
        return u.f9037a;
    }

    public static Executor b(Executor executor) {
        return new y(executor);
    }

    public static void c(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static void d(Object obj) {
        obj.getClass();
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
