package com.google.d.m.a;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class be<V> extends k<V> {
    be() {
    }

    public static be z(bm bmVar) {
        return bmVar instanceof be ? (be) bmVar : new au(bmVar);
    }

    public final be A(com.google.d.b.t tVar, Executor executor) {
        return (be) w.h(this, tVar, executor);
    }

    public final be B(ag agVar, Executor executor) {
        return (be) w.x(this, agVar, executor);
    }

    public final be C(TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (!isDone()) {
            this = (be<V>) ca.x(this, timeUnit, scheduledExecutorService);
        }
        return this;
    }

    public final be y(Class cls, com.google.d.b.t tVar, Executor executor) {
        return (be) c.h(this, cls, tVar, executor);
    }
}
