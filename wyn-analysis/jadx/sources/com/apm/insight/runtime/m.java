package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private static volatile p f20674a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Handler f20675b;

    public static p a() {
        if (f20674a == null) {
            b();
        }
        return f20674a;
    }

    private static HandlerThread b() {
        if (f20674a == null) {
            synchronized (m.class) {
                try {
                    if (f20674a == null) {
                        p pVar = new p("default_npth_thread");
                        f20674a = pVar;
                        pVar.b();
                    }
                } finally {
                }
            }
        }
        return f20674a.c();
    }
}
