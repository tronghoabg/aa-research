package com.google.android.gms.common.api.internal;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aa implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f4709a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ad f4710b;

    aa(ad adVar, int i2) {
        this.f4709a = i2;
        Objects.requireNonNull(adVar);
        this.f4710b = adVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4710b.H(this.f4709a);
    }
}
