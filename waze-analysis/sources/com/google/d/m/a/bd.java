package com.google.d.m.a;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bd extends cf {
    private bd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void C(bm bmVar, Future future) {
        if (bmVar instanceof k) {
            ((k) bmVar).m(future);
        } else {
            if (bmVar == null || !bmVar.isCancelled() || future == null) {
                return;
            }
            future.cancel(false);
        }
    }

    public static bb a(Iterable iterable) {
        return new bb(false, com.google.d.d.bn.m(iterable));
    }

    @SafeVarargs
    public static bb b(bm... bmVarArr) {
        return new bb(false, com.google.d.d.bn.o(bmVarArr));
    }

    public static bb c(Iterable iterable) {
        return new bb(true, com.google.d.d.bn.m(iterable));
    }

    public static bm d(bm bmVar, Class cls, com.google.d.b.t tVar, Executor executor) {
        return c.h(bmVar, cls, tVar, executor);
    }

    public static bm e(bm bmVar, Class cls, ag agVar, Executor executor) {
        int i2 = c.f8051d;
        a aVar = new a(bmVar, cls, agVar);
        bmVar.addListener(aVar, cf.A(executor, aVar));
        return aVar;
    }

    public static bm f() {
        bf bfVar = bf.f8021a;
        return bfVar != null ? bfVar : new bf();
    }

    public static bm g(Throwable th) {
        return new bg(th);
    }

    public static bm h(Object obj) {
        return obj == null ? bh.f8022a : new bh(obj);
    }

    public static bm i() {
        return bh.f8022a;
    }

    public static bm j(bm bmVar) {
        if (bmVar.isDone()) {
            return bmVar;
        }
        bc bcVar = new bc(bmVar);
        bmVar.addListener(bcVar, al.f7989a);
        return bcVar;
    }

    public static bm k(Callable callable, Executor executor) {
        cd cdVar = new cd(callable);
        executor.execute(cdVar);
        return cdVar;
    }

    public static bm l(af afVar, Executor executor) {
        cd cdVar = new cd(afVar);
        executor.execute(cdVar);
        return cdVar;
    }

    public static bm m(bm bmVar, com.google.d.b.t tVar, Executor executor) {
        return w.h(bmVar, tVar, executor);
    }

    public static bm n(bm bmVar, ag agVar, Executor executor) {
        return w.x(bmVar, agVar, executor);
    }

    public static Object o(Future future) {
        com.google.d.b.an.y(future.isDone(), "Future was expected to be done: %s", future);
        return cf.s(future);
    }

    public static void q(bm bmVar, ay ayVar, Executor executor) {
        com.google.d.b.an.B(ayVar);
        bmVar.addListener(new az(bmVar, ayVar), executor);
    }

    public static void r(bm bmVar, Future future) {
        com.google.d.b.an.B(bmVar);
        if (future.isDone()) {
            return;
        }
        if (bmVar.isDone()) {
            C(bmVar, future);
            return;
        }
        ba baVar = new ba(bmVar, future);
        al alVar = al.f7989a;
        bmVar.addListener(baVar, alVar);
        ((bm) future).addListener(baVar, alVar);
    }
}
