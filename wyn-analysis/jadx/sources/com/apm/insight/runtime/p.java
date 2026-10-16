package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final HandlerThread f20692a;

    /* renamed from: d, reason: collision with root package name */
    private volatile Handler f20695d;

    /* renamed from: b, reason: collision with root package name */
    private final Queue<c> f20693b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    private final Queue<Message> f20694c = new ConcurrentLinkedQueue();

    /* renamed from: e, reason: collision with root package name */
    private final Object f20696e = new Object();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!p.this.f20694c.isEmpty()) {
                if (p.this.f20695d != null) {
                    try {
                        p.this.f20695d.sendMessageAtFrontOfQueue((Message) p.this.f20694c.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
            while (!p.this.f20693b.isEmpty()) {
                c cVar = (c) p.this.f20693b.poll();
                if (p.this.f20695d != null) {
                    try {
                        p.this.f20695d.sendMessageAtTime(cVar.f20701a, cVar.f20702b);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    public class b extends HandlerThread {

        /* renamed from: a, reason: collision with root package name */
        private volatile int f20698a;

        /* renamed from: b, reason: collision with root package name */
        private volatile boolean f20699b;

        public b(String str) {
            super(str);
            this.f20698a = 0;
            this.f20699b = false;
        }

        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (p.this.f20696e) {
                p.this.f20695d = new Handler();
            }
            p.this.f20695d.post(p.this.new a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th) {
                    try {
                        com.apm.insight.b.f.a(com.apm.insight.e.g()).a().c();
                        if (this.f20698a < 5) {
                            com.apm.insight.c.a();
                            j.a(th, "NPTH_CATCH");
                        } else if (!this.f20699b) {
                            this.f20699b = true;
                            com.apm.insight.c.a();
                            j.a(new RuntimeException(), "NPTH_ERR_MAX");
                        }
                        this.f20698a++;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        Message f20701a;

        /* renamed from: b, reason: collision with root package name */
        long f20702b;

        public c(Message message, long j8) {
            this.f20701a = message;
            this.f20702b = j8;
        }
    }

    static {
        new Object() { // from class: com.apm.insight.runtime.p.1
        };
        new Object() { // from class: com.apm.insight.runtime.p.2
        };
    }

    public p(String str) {
        this.f20692a = new b(str);
    }

    public final void b() {
        this.f20692a.start();
    }

    public final HandlerThread c() {
        return this.f20692a;
    }

    private Message b(Runnable runnable) {
        return Message.obtain(this.f20695d, runnable);
    }

    public final Handler a() {
        return this.f20695d;
    }

    private boolean b(Message message, long j8) {
        if (this.f20695d == null) {
            synchronized (this.f20696e) {
                try {
                    if (this.f20695d == null) {
                        this.f20693b.add(new c(message, j8));
                        return true;
                    }
                } finally {
                }
            }
        }
        try {
            return this.f20695d.sendMessageAtTime(message, j8);
        } catch (Throwable unused) {
            return true;
        }
    }

    public final boolean a(Runnable runnable) {
        return a(b(runnable), 0L);
    }

    public final boolean a(Runnable runnable, long j8) {
        return a(b(runnable), j8);
    }

    private boolean a(Message message, long j8) {
        if (j8 < 0) {
            j8 = 0;
        }
        return b(message, SystemClock.uptimeMillis() + j8);
    }
}
