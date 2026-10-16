package com.waze.car_lib.i.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f19997a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f19998b;

    public j(kotlinx.coroutines.b.k kVar, int i2) {
        this.f19998b = i2;
        this.f19997a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        int i2 = this.f19998b;
        if (i2 == 0) {
            Object objCollect = this.f19997a.collect(new i(lVar, 0), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
        }
        if (i2 == 1) {
            Object objCollect2 = this.f19997a.collect(new i(lVar, 1), eVar);
            return objCollect2 == h.c.a.a.f48038a ? objCollect2 : h.ab.f48028a;
        }
        if (i2 == 2) {
            Object objCollect3 = this.f19997a.collect(new i(lVar, 2), eVar);
            return objCollect3 == h.c.a.a.f48038a ? objCollect3 : h.ab.f48028a;
        }
        if (i2 != 3) {
            Object objCollect4 = this.f19997a.collect(new i(lVar, 4), eVar);
            return objCollect4 == h.c.a.a.f48038a ? objCollect4 : h.ab.f48028a;
        }
        Object objCollect5 = this.f19997a.collect(new i(lVar, 3), eVar);
        return objCollect5 == h.c.a.a.f48038a ? objCollect5 : h.ab.f48028a;
    }
}
