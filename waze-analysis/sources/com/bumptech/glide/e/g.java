package com.bumptech.glide.e;

import com.bumptech.glide.g.r;
import com.bumptech.glide.load.a.aq;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g<R> implements Future, h, com.bumptech.glide.e.a.g {

    /* renamed from: a, reason: collision with root package name */
    private final int f2849a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2850b;

    /* renamed from: c, reason: collision with root package name */
    private Object f2851c;

    /* renamed from: d, reason: collision with root package name */
    private d f2852d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2853e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2854f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f2855g;

    /* renamed from: h, reason: collision with root package name */
    private aq f2856h;

    public g(int i2, int i3) {
        this.f2849a = i2;
        this.f2850b = i3;
    }

    private final synchronized Object n(Long l2) {
        if (!isDone() && !r.l()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
        if (this.f2853e) {
            throw new CancellationException();
        }
        if (this.f2855g) {
            throw new ExecutionException(this.f2856h);
        }
        if (!this.f2854f) {
            if (l2 == null) {
                wait(0L);
            } else if (l2.longValue() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = l2.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    wait(jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.f2855g) {
                throw new ExecutionException(this.f2856h);
            }
            if (this.f2853e) {
                throw new CancellationException();
            }
            if (!this.f2854f) {
                throw new TimeoutException();
            }
        }
        return this.f2851c;
    }

    @Override // com.bumptech.glide.e.a.g
    public final synchronized void b(Object obj) {
    }

    @Override // com.bumptech.glide.e.a.g
    public final synchronized d bm() {
        return this.f2852d;
    }

    @Override // com.bumptech.glide.e.a.g
    public final void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.f2853e = true;
            notifyAll();
            d dVar = null;
            if (z) {
                d dVar2 = this.f2852d;
                this.f2852d = null;
                dVar = dVar2;
            }
            if (dVar != null) {
                dVar.c();
            }
            return true;
        }
    }

    @Override // com.bumptech.glide.e.a.g
    public final void d(com.bumptech.glide.e.a.f fVar) {
        fVar.g(this.f2849a, this.f2850b);
    }

    @Override // com.bumptech.glide.e.a.g
    public final void e(com.bumptech.glide.e.a.f fVar) {
    }

    @Override // com.bumptech.glide.e.a.g
    public final synchronized void f(d dVar) {
        this.f2852d = dVar;
    }

    @Override // com.bumptech.glide.manager.g
    public final void g() {
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        try {
            return (R) n(null);
        } catch (TimeoutException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.bumptech.glide.manager.g
    public final void h() {
    }

    @Override // com.bumptech.glide.manager.g
    public final void i() {
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.f2853e;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        if (!this.f2853e && !this.f2854f) {
            if (!this.f2855g) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bumptech.glide.e.h
    public final synchronized void j(aq aqVar) {
        this.f2855g = true;
        this.f2856h = aqVar;
        notifyAll();
    }

    @Override // com.bumptech.glide.e.h
    public final synchronized void k(Object obj) {
        this.f2854f = true;
        this.f2851c = obj;
        notifyAll();
    }

    @Override // com.bumptech.glide.e.a.g
    public final synchronized void l() {
    }

    @Override // com.bumptech.glide.e.a.g
    public final void m() {
    }

    public final String toString() {
        d dVar;
        String str;
        String strValueOf = String.valueOf(super.toString());
        synchronized (this) {
            dVar = null;
            if (this.f2853e) {
                str = "CANCELLED";
            } else if (this.f2855g) {
                str = "FAILURE";
            } else if (this.f2854f) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                dVar = this.f2852d;
            }
        }
        String strConcat = strValueOf.concat("[status=");
        if (dVar == null) {
            return strConcat + str + "]";
        }
        return strConcat + str + ", request=[" + dVar.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final R get(long j2, TimeUnit timeUnit) {
        return (R) n(Long.valueOf(timeUnit.toMillis(j2)));
    }
}
