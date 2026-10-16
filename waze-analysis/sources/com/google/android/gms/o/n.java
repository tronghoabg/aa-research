package com.google.android.gms.o;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f5769a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f5770b;

    n(j jVar, t tVar) {
        this.f5769a = tVar;
        Objects.requireNonNull(jVar);
        this.f5770b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = this.f5770b;
        synchronized (jVar.f5764b) {
            jVar.f5766d.onSuccess(this.f5769a.g());
        }
    }
}
