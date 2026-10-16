package com.google.android.libraries.d.a;

import android.os.Handler;
import android.os.Looper;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f5805a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static Thread f5806b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile Handler f5807c;

    public static void a(Runnable runnable) {
        if (f5807c == null) {
            synchronized (f5805a) {
                if (f5807c == null) {
                    f5807c = new Handler(Looper.getMainLooper());
                }
            }
        }
        f5807c.post(runnable);
    }

    public static boolean b(Thread thread) {
        Thread thread2 = f5806b;
        if (thread2 == null) {
            thread2 = Looper.getMainLooper().getThread();
            f5806b = thread2;
        }
        return thread == thread2;
    }

    public static void c() {
        b(Thread.currentThread());
    }
}
