package com.waze.sdk.b;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.b.b.d.i f35283a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f35284b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j f35285c;

    i(j jVar, com.b.b.d.i iVar, int i2) {
        this.f35283a = iVar;
        this.f35284b = i2;
        Objects.requireNonNull(jVar);
        this.f35285c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35285c.f35288c.ai(this.f35283a, this.f35284b + 1);
    }
}
