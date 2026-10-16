package com.google.d.m.a;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ca extends at {

    /* renamed from: a, reason: collision with root package name */
    private bm f8055a;

    /* renamed from: b, reason: collision with root package name */
    private ScheduledFuture f8056b;

    private ca(bm bmVar) {
        this.f8055a = bmVar;
    }

    static bm x(bm bmVar, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        ca caVar = new ca(bmVar);
        by byVar = new by(caVar);
        caVar.f8056b = scheduledExecutorService.schedule(byVar, 25L, timeUnit);
        bmVar.addListener(byVar, al.f7989a);
        return caVar;
    }

    @Override // com.google.d.m.a.k
    protected final String a() {
        bm bmVar = this.f8055a;
        ScheduledFuture scheduledFuture = this.f8056b;
        if (bmVar == null) {
            return null;
        }
        String str = "inputFuture=[" + bmVar.toString() + "]";
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return str + ", remaining delay=[" + delay + " ms]";
            }
        }
        return str;
    }

    @Override // com.google.d.m.a.k
    protected final void b() {
        m(this.f8055a);
        ScheduledFuture scheduledFuture = this.f8056b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f8055a = null;
        this.f8056b = null;
    }
}
