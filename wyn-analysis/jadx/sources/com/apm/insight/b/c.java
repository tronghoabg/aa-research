package com.apm.insight.b;

import android.os.SystemClock;
import com.apm.insight.runtime.m;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    private static long f20207b;

    /* renamed from: a, reason: collision with root package name */
    private final b f20208a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20209c = false;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f20210d;

    public c(b bVar) {
        Runnable runnable = new Runnable() { // from class: com.apm.insight.b.c.1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                if (c.this.f20209c) {
                    return;
                }
                c.this.f20208a.d();
                long unused = c.f20207b = SystemClock.uptimeMillis();
                if (com.apm.insight.runtime.i.a().b()) {
                    m.a().a(c.this.f20210d, 500L);
                } else {
                    m.a().a(c.this.f20210d, 500L);
                }
                com.apm.insight.runtime.b.a(c.f20207b);
            }
        };
        this.f20210d = runnable;
        this.f20208a = bVar;
        m.a().a(runnable, 5000L);
    }

    public static boolean c() {
        return SystemClock.uptimeMillis() - f20207b <= 15000;
    }

    public final void b() {
        this.f20209c = true;
    }

    public final void a() {
        if (this.f20209c) {
            return;
        }
        m.a().a(this.f20210d, 5000L);
    }
}
