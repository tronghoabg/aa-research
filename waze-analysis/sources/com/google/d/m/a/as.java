package com.google.d.m.a;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f8009a = new AtomicReference(bh.f8022a);

    /* renamed from: b, reason: collision with root package name */
    private ar f8010b = new ar();

    private as() {
    }

    public static as b() {
        return new as();
    }

    public final bm c(af afVar, Executor executor) {
        com.google.d.b.an.B(executor);
        final aq aqVar = new aq(executor, this);
        ao aoVar = new ao(this, aqVar, afVar);
        AtomicReference atomicReference = this.f8009a;
        final bv bvVarF = bv.f();
        final bm bmVar = (bm) atomicReference.getAndSet(bvVarF);
        final cd cdVar = new cd(aoVar);
        bmVar.addListener(cdVar, aqVar);
        final bm bmVarJ = bd.j(cdVar);
        Runnable runnable = new Runnable() { // from class: com.google.d.m.a.an
            @Override // java.lang.Runnable
            public final void run() {
                cd cdVar2 = cdVar;
                if (cdVar2.isDone()) {
                    bvVarF.e(bmVar);
                } else if (bmVarJ.isCancelled() && aqVar.compareAndSet(ap.f7998a, ap.f7999b)) {
                    cdVar2.cancel(false);
                }
            }
        };
        al alVar = al.f7989a;
        bmVarJ.addListener(runnable, alVar);
        cdVar.addListener(runnable, alVar);
        return bmVarJ;
    }
}
