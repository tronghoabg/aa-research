package com.waze.car_lib.screens.core;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f21964a;

    /* renamed from: b, reason: collision with root package name */
    private long f21965b;

    public /* synthetic */ l(byte[] bArr) {
        k kVar = k.f21963a;
        x.f(kVar, "currentTimeSupplier");
        this.f21964a = kVar;
    }

    public final void a(h.g.a.a aVar) {
        x.f(aVar, "callback");
        if (((Number) this.f21964a.invoke()).longValue() - this.f21965b < 500) {
            return;
        }
        this.f21965b = System.currentTimeMillis();
        aVar.invoke();
    }

    public l() {
        this(null);
    }
}
