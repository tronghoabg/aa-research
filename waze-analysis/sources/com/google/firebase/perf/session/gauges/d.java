package com.google.firebase.perf.session.gauges;

import android.support.v4.app.ac;
import com.google.firebase.perf.e.k;
import com.google.firebase.perf.e.m;
import com.google.firebase.perf.e.n;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.perf.c.a f10574b = com.google.firebase.perf.c.a.a();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f10575a;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f10576c;

    /* renamed from: d, reason: collision with root package name */
    private final Runtime f10577d;

    /* renamed from: e, reason: collision with root package name */
    private ScheduledFuture f10578e;

    /* renamed from: f, reason: collision with root package name */
    private long f10579f;

    d() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.f10578e = null;
        this.f10579f = -1L;
        this.f10576c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f10575a = new ConcurrentLinkedQueue();
        this.f10577d = runtime;
    }

    public static /* synthetic */ void a(d dVar, m mVar) {
        com.google.firebase.perf.f.d dVarG = dVar.g(mVar);
        if (dVarG != null) {
            dVar.f10575a.add(dVarG);
        }
    }

    public static /* synthetic */ void b(d dVar, m mVar) {
        com.google.firebase.perf.f.d dVarG = dVar.g(mVar);
        if (dVarG != null) {
            dVar.f10575a.add(dVarG);
        }
    }

    public static boolean f(long j2) {
        return j2 <= 0;
    }

    private final com.google.firebase.perf.f.d g(m mVar) {
        if (mVar == null) {
            return null;
        }
        long jA = mVar.a();
        com.google.firebase.perf.f.c cVarNewBuilder = com.google.firebase.perf.f.d.newBuilder();
        cVarNewBuilder.a(jA);
        Runtime runtime = this.f10577d;
        cVarNewBuilder.b(n.a(k.BYTES.a(runtime.totalMemory() - runtime.freeMemory())));
        return cVarNewBuilder.build();
    }

    private final synchronized void h(m mVar) {
        try {
            this.f10576c.schedule(new ac(this, mVar, 18, null), 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            f10574b.i("Unable to collect Memory Metric: ".concat(String.valueOf(e2.getMessage())));
        }
    }

    private final synchronized void i(long j2, m mVar) {
        this.f10579f = j2;
        try {
            this.f10578e = this.f10576c.scheduleAtFixedRate(new ac(this, mVar, 17, null), 0L, j2, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            f10574b.i("Unable to start collecting Memory Metrics: ".concat(String.valueOf(e2.getMessage())));
        }
    }

    public final void c(m mVar) {
        h(mVar);
    }

    public final void d(long j2, m mVar) {
        if (f(j2)) {
            return;
        }
        if (this.f10578e == null) {
            i(j2, mVar);
        } else if (this.f10579f != j2) {
            e();
            i(j2, mVar);
        }
    }

    public final void e() {
        ScheduledFuture scheduledFuture = this.f10578e;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f10578e = null;
        this.f10579f = -1L;
    }
}
