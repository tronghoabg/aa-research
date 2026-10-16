package com.bumptech.glide.load.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ah implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ak f3003a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.e.j f3004b;

    ah(ak akVar, com.bumptech.glide.e.j jVar) {
        Objects.requireNonNull(akVar);
        this.f3003a = akVar;
        this.f3004b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.e.j jVar = this.f3004b;
        synchronized (jVar.a()) {
            ak akVar = this.f3003a;
            synchronized (akVar) {
                if (akVar.f3008a.f(jVar)) {
                    akVar.f3010c.d();
                    try {
                        jVar.e(akVar.f3010c, akVar.f3011d);
                        akVar.f(jVar);
                    } catch (Throwable th) {
                        throw new g(th);
                    }
                }
                akVar.c();
            }
        }
    }
}
