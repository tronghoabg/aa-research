package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f38541a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f38542b;

    public m(kotlinx.coroutines.b.k kVar, int i2) {
        this.f38542b = i2;
        this.f38541a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        int i2 = this.f38542b;
        if (i2 == 0) {
            Object objCollect = this.f38541a.collect(new l(lVar, 0), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
        }
        if (i2 == 1) {
            Object objCollect2 = this.f38541a.collect(new l(lVar, 1), eVar);
            return objCollect2 == h.c.a.a.f48038a ? objCollect2 : h.ab.f48028a;
        }
        if (i2 == 2) {
            Object objCollect3 = this.f38541a.collect(new l(lVar, 2), eVar);
            return objCollect3 == h.c.a.a.f48038a ? objCollect3 : h.ab.f48028a;
        }
        if (i2 == 3) {
            Object objCollect4 = this.f38541a.collect(new l(lVar, 3), eVar);
            return objCollect4 == h.c.a.a.f48038a ? objCollect4 : h.ab.f48028a;
        }
        if (i2 == 4) {
            Object objCollect5 = this.f38541a.collect(new l(lVar, 4), eVar);
            return objCollect5 == h.c.a.a.f48038a ? objCollect5 : h.ab.f48028a;
        }
        if (i2 != 5) {
            Object objCollect6 = this.f38541a.collect(new l(lVar, 6), eVar);
            return objCollect6 == h.c.a.a.f48038a ? objCollect6 : h.ab.f48028a;
        }
        Object objCollect7 = this.f38541a.collect(new l(lVar, 5), eVar);
        return objCollect7 == h.c.a.a.f48038a ? objCollect7 : h.ab.f48028a;
    }
}
