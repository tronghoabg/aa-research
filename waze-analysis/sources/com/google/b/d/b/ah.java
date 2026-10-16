package com.google.b.d.b;

import com.google.d.m.a.ay;
import h.g.b.aq;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Callable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ah {
    static {
        Math.abs(new Random().nextInt());
        new HashMap();
    }

    public static final com.google.d.m.a.af a(com.google.d.m.a.af afVar) {
        h.g.b.x.f(afVar, "asyncCallable");
        return new ac(j.b(), afVar);
    }

    public static final com.google.d.m.a.ag b(com.google.d.m.a.ag agVar) {
        h.g.b.x.f(agVar, "asyncFunction");
        return new ad(j.b(), agVar);
    }

    public static final ay c(ay ayVar) {
        h.g.b.x.f(ayVar, "callback");
        return new af(j.b(), ayVar);
    }

    public static final Runnable d(Runnable runnable) {
        h.g.b.x.f(runnable, "runnable");
        return new ag(new aq(), j.b(), runnable);
    }

    public static final Callable e(Callable callable) {
        h.g.b.x.f(callable, "callable");
        return new ae(j.b(), callable);
    }
}
