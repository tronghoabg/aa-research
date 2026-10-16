package com.applovin.impl;

import cb.AbstractC1593a;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class h7 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21658a;

    /* renamed from: b, reason: collision with root package name */
    private Timer f21659b;

    /* renamed from: c, reason: collision with root package name */
    private long f21660c;

    /* renamed from: d, reason: collision with root package name */
    private long f21661d;

    /* renamed from: e, reason: collision with root package name */
    private long f21662e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f21663f;

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f21664g;

    /* renamed from: h, reason: collision with root package name */
    private long f21665h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f21666i = new Object();

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                h7.this.f21664g.run();
                synchronized (h7.this.f21666i) {
                    try {
                        if (h7.this.f21663f) {
                            h7.this.f21660c = System.currentTimeMillis();
                            h7 h7Var = h7.this;
                            h7Var.f21661d = h7Var.f21662e;
                        } else {
                            h7.this.f21659b = null;
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (h7.this.f21658a != null) {
                        h7.this.f21658a.O();
                        if (com.applovin.impl.sdk.o.a()) {
                            h7.this.f21658a.O().a("Timer", "Encountered error while executing timed task", th);
                        }
                        h7.this.f21658a.D().a("Timer", "executingTimedTask", th);
                    }
                    synchronized (h7.this.f21666i) {
                        try {
                            if (h7.this.f21663f) {
                                h7.this.f21660c = System.currentTimeMillis();
                                h7 h7Var2 = h7.this;
                                h7Var2.f21661d = h7Var2.f21662e;
                            } else {
                                h7.this.f21659b = null;
                            }
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    synchronized (h7.this.f21666i) {
                        try {
                            if (h7.this.f21663f) {
                                h7.this.f21660c = System.currentTimeMillis();
                                h7 h7Var3 = h7.this;
                                h7Var3.f21661d = h7Var3.f21662e;
                            } else {
                                h7.this.f21659b = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            }
        }
    }

    private h7(com.applovin.impl.sdk.k kVar, Runnable runnable) {
        this.f21658a = kVar;
        this.f21664g = runnable;
    }

    public long c() {
        if (this.f21659b == null) {
            return this.f21661d - this.f21665h;
        }
        return this.f21661d - (System.currentTimeMillis() - this.f21660c);
    }

    public void d() {
        synchronized (this.f21666i) {
            Timer timer = this.f21659b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f21665h = Math.max(1L, System.currentTimeMillis() - this.f21660c);
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.f21658a;
                        if (kVar != null) {
                            kVar.O();
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f21658a.O();
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f21658a.O().a("Timer", "Encountered error while pausing timer", th);
                                }
                            }
                        }
                        this.f21659b = null;
                    } finally {
                        this.f21659b = null;
                    }
                }
            }
        }
    }

    public void e() {
        h7 h7Var;
        synchronized (this.f21666i) {
            try {
                try {
                    long j8 = this.f21665h;
                    if (j8 > 0) {
                        try {
                            long j10 = this.f21661d - j8;
                            this.f21661d = j10;
                            if (j10 < 0) {
                                this.f21661d = 0L;
                            }
                            this.f21659b = new Timer();
                            h7Var = this;
                        } catch (Throwable th) {
                            th = th;
                            h7Var = this;
                        }
                        try {
                            h7Var.a(b(), this.f21661d, this.f21663f, this.f21662e);
                            h7Var.f21660c = System.currentTimeMillis();
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                com.applovin.impl.sdk.k kVar = h7Var.f21658a;
                                if (kVar != null) {
                                    kVar.O();
                                    if (com.applovin.impl.sdk.o.a()) {
                                        h7Var.f21658a.O();
                                        if (com.applovin.impl.sdk.o.a()) {
                                            h7Var.f21658a.O().a("Timer", "Encountered error while resuming timer", th);
                                        }
                                    }
                                }
                                h7Var.f21665h = 0L;
                            } finally {
                                h7Var.f21665h = 0L;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    private TimerTask b() {
        return new a();
    }

    public static h7 a(long j8, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return a(j8, false, kVar, runnable);
    }

    public static h7 a(long j8, boolean z2, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC1593a.h(j8, "Cannot create a scheduled timer. Invalid fire time passed in: ", "."));
        }
        if (runnable != null) {
            h7 h7Var = new h7(kVar, runnable);
            h7Var.f21660c = System.currentTimeMillis();
            h7Var.f21661d = j8;
            h7Var.f21663f = z2;
            h7Var.f21662e = j8;
            try {
                h7Var.f21659b = new Timer();
                h7Var.a(h7Var.b(), j8, z2, h7Var.f21662e);
                return h7Var;
            } catch (OutOfMemoryError e7) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("Timer", "Failed to create timer due to OOM error", e7);
                }
                return h7Var;
            }
        }
        throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
    }

    public void a() {
        synchronized (this.f21666i) {
            Timer timer = this.f21659b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f21659b = null;
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.f21658a;
                        if (kVar != null) {
                            kVar.O();
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f21658a.O();
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f21658a.O().a("Timer", "Encountered error while cancelling timer", th);
                                }
                            }
                        }
                        this.f21659b = null;
                    } catch (Throwable th2) {
                        this.f21659b = null;
                        this.f21665h = 0L;
                        throw th2;
                    }
                }
                this.f21665h = 0L;
            }
        }
    }

    private void a(TimerTask timerTask, long j8, boolean z2, long j10) {
        if (z2) {
            this.f21659b.schedule(timerTask, j8, j10);
        } else {
            this.f21659b.schedule(timerTask, j8);
        }
    }
}
