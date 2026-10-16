package com.waze.main_screen.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ai implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f27023a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f27024b;

    public ai(kotlinx.coroutines.b.k kVar, int i2) {
        this.f27024b = i2;
        this.f27023a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        int i2 = this.f27024b;
        if (i2 == 0) {
            Object objCollect = this.f27023a.collect(new ah(lVar, 0), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
        }
        if (i2 != 1) {
            Object objCollect2 = this.f27023a.collect(new ah(lVar, 2), eVar);
            return objCollect2 == h.c.a.a.f48038a ? objCollect2 : h.ab.f48028a;
        }
        Object objCollect3 = this.f27023a.collect(new ah(lVar, 1), eVar);
        return objCollect3 == h.c.a.a.f48038a ? objCollect3 : h.ab.f48028a;
    }
}
