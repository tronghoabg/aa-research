package com.google.firebase.remoteconfig.internal;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f10648a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f10649b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f10650c;

    b(c cVar, int i2, long j2) {
        this.f10648a = i2;
        this.f10649b = j2;
        Objects.requireNonNull(cVar);
        this.f10650c = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10650c.d(this.f10648a, this.f10649b);
    }
}
