package com.google.android.gms.o;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f5760a;

    g(j jVar) {
        Objects.requireNonNull(jVar);
        this.f5760a = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = this.f5760a;
        synchronized (jVar.f5764b) {
            jVar.f5766d.d();
        }
    }
}
