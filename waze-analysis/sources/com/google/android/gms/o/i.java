package com.google.android.gms.o;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f5761a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f5762b;

    i(j jVar, t tVar) {
        this.f5761a = tVar;
        Objects.requireNonNull(jVar);
        this.f5762b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = this.f5762b;
        synchronized (jVar.f5764b) {
            jVar.f5766d.a(this.f5761a);
        }
    }
}
