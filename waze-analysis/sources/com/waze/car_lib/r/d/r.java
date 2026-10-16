package com.waze.car_lib.r.d;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class r implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f21320a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f21321b;

    public r(kotlinx.coroutines.b.k kVar, int i2) {
        this.f21321b = i2;
        this.f21320a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        if (this.f21321b != 0) {
            Object objCollect = this.f21320a.collect(new q(lVar, 1), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
        }
        Object objCollect2 = this.f21320a.collect(new q(lVar, 0), eVar);
        return objCollect2 == h.c.a.a.f48038a ? objCollect2 : ab.f48028a;
    }
}
