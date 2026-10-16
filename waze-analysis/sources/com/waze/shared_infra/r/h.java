package com.waze.shared_infra.r;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f37967a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f37968b;

    public h(kotlinx.coroutines.b.k kVar, int i2) {
        this.f37968b = i2;
        this.f37967a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        int i2 = this.f37968b;
        if (i2 == 0) {
            Object objCollect = this.f37967a.collect(new g(lVar, 0), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
        }
        if (i2 == 1) {
            Object objCollect2 = this.f37967a.collect(new g(lVar, 1), eVar);
            return objCollect2 == h.c.a.a.f48038a ? objCollect2 : ab.f48028a;
        }
        if (i2 == 2) {
            Object objCollect3 = this.f37967a.collect(new g(lVar, 2), eVar);
            return objCollect3 == h.c.a.a.f48038a ? objCollect3 : ab.f48028a;
        }
        if (i2 != 3) {
            Object objCollect4 = this.f37967a.collect(new g(lVar, 4), eVar);
            return objCollect4 == h.c.a.a.f48038a ? objCollect4 : ab.f48028a;
        }
        Object objCollect5 = this.f37967a.collect(new g(lVar, 3), eVar);
        return objCollect5 == h.c.a.a.f48038a ? objCollect5 : ab.f48028a;
    }
}
