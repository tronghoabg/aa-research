package com.bumptech.glide.manager;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f3542a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f3543b;

    s(t tVar, boolean z) {
        this.f3542a = z;
        Objects.requireNonNull(tVar);
        this.f3543b = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.g.r.h();
        u uVar = this.f3543b.f3544a;
        boolean z = uVar.f3545a;
        boolean z2 = this.f3542a;
        uVar.f3545a = z2;
        if (z != z2) {
            uVar.f3546b.a(z2);
        }
    }
}
