package com.bumptech.glide.load.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ag implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ak f3001a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.e.j f3002b;

    ag(ak akVar, com.bumptech.glide.e.j jVar) {
        Objects.requireNonNull(akVar);
        this.f3001a = akVar;
        this.f3002b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.e.j jVar = this.f3002b;
        synchronized (jVar.a()) {
            ak akVar = this.f3001a;
            synchronized (akVar) {
                if (akVar.f3008a.f(jVar)) {
                    try {
                        jVar.d(akVar.f3009b);
                    } catch (Throwable th) {
                        throw new g(th);
                    }
                }
                this.f3001a.c();
            }
        }
    }
}
