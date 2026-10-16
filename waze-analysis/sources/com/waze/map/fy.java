package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class fy implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f29033a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f29034b;

    public fy(kotlinx.coroutines.b.k kVar, int i2) {
        this.f29034b = i2;
        this.f29033a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        int i2 = this.f29034b;
        if (i2 == 0) {
            Object objCollect = this.f29033a.collect(new fx(lVar, 0), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
        }
        if (i2 != 1) {
            Object objCollect2 = this.f29033a.collect(new fx(lVar, 2), eVar);
            return objCollect2 == h.c.a.a.f48038a ? objCollect2 : h.ab.f48028a;
        }
        Object objCollect3 = this.f29033a.collect(new fx(lVar, 1), eVar);
        return objCollect3 == h.c.a.a.f48038a ? objCollect3 : h.ab.f48028a;
    }
}
