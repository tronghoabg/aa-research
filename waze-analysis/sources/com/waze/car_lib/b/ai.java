package com.waze.car_lib.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ai implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f18961a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f18962b;

    public ai(kotlinx.coroutines.b.k kVar, int i2) {
        this.f18962b = i2;
        this.f18961a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        int i2 = this.f18962b;
        if (i2 == 0) {
            Object objCollect = this.f18961a.collect(new ah(lVar, 0), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
        }
        if (i2 == 1) {
            Object objCollect2 = this.f18961a.collect(new ah(lVar, 1), eVar);
            return objCollect2 == h.c.a.a.f48038a ? objCollect2 : h.ab.f48028a;
        }
        if (i2 != 2) {
            Object objCollect3 = this.f18961a.collect(new ah(lVar, 3), eVar);
            return objCollect3 == h.c.a.a.f48038a ? objCollect3 : h.ab.f48028a;
        }
        Object objCollect4 = this.f18961a.collect(new ah(lVar, 2), eVar);
        return objCollect4 == h.c.a.a.f48038a ? objCollect4 : h.ab.f48028a;
    }
}
