package com.waze.car_lib.i.c;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ae implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f20068a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f20069b;

    public ae(kotlinx.coroutines.b.k kVar, int i2) {
        this.f20069b = i2;
        this.f20068a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        if (this.f20069b != 0) {
            Object objCollect = this.f20068a.collect(new ad(lVar, 1), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
        }
        Object objCollect2 = this.f20068a.collect(new ad(lVar, 0), eVar);
        return objCollect2 == h.c.a.a.f48038a ? objCollect2 : h.ab.f48028a;
    }
}
