package com.google.android.material.datepicker;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f6484a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f6485b;

    p(z zVar, int i2) {
        this.f6484a = i2;
        Objects.requireNonNull(zVar);
        this.f6485b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6485b.f6503h.ao(this.f6484a);
    }
}
