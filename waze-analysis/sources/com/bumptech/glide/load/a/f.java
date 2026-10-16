package com.bumptech.glide.load.a;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    final Map f3122a;

    /* renamed from: b, reason: collision with root package name */
    private final ReferenceQueue f3123b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f3124c;

    /* renamed from: d, reason: collision with root package name */
    private volatile d f3125d;

    f() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new b());
        this.f3122a = new HashMap();
        this.f3123b = new ReferenceQueue();
        executorServiceNewSingleThreadExecutor.execute(new c(this));
    }

    final synchronized ao a(com.bumptech.glide.load.o oVar) {
        e eVar = (e) this.f3122a.get(oVar);
        if (eVar == null) {
            return null;
        }
        ao aoVar = (ao) eVar.get();
        if (aoVar == null) {
            d(eVar);
        }
        return aoVar;
    }

    final synchronized void b(com.bumptech.glide.load.o oVar, ao aoVar) {
        e eVar = (e) this.f3122a.put(oVar, new e(oVar, aoVar, this.f3123b));
        if (eVar != null) {
            eVar.a();
        }
    }

    final void c() {
        while (true) {
            try {
                d((e) this.f3123b.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    final void d(e eVar) {
        synchronized (this) {
            this.f3122a.remove(eVar.f3119a);
            if (eVar.f3120b) {
                aw awVar = eVar.f3121c;
            }
        }
    }

    final synchronized void e(com.bumptech.glide.load.o oVar) {
        e eVar = (e) this.f3122a.remove(oVar);
        if (eVar != null) {
            eVar.a();
        }
    }
}
