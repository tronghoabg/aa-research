package com.waze.map.g;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class o implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f29080a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f29081b;

    public o(kotlinx.coroutines.b.k kVar, int i2) {
        this.f29081b = i2;
        this.f29080a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        int i2 = this.f29081b;
        if (i2 == 0) {
            Object objCollect = this.f29080a.collect(new n(lVar, 0), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
        }
        if (i2 == 1) {
            Object objCollect2 = this.f29080a.collect(new n(lVar, 1), eVar);
            return objCollect2 == h.c.a.a.f48038a ? objCollect2 : ab.f48028a;
        }
        if (i2 != 2) {
            Object objCollect3 = this.f29080a.collect(new n(lVar, 3), eVar);
            return objCollect3 == h.c.a.a.f48038a ? objCollect3 : ab.f48028a;
        }
        Object objCollect4 = this.f29080a.collect(new n(lVar, 2), eVar);
        return objCollect4 == h.c.a.a.f48038a ? objCollect4 : ab.f48028a;
    }
}
