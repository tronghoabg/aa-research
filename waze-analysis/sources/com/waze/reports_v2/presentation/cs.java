package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cs implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f34977a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f34978b;

    public cs(kotlinx.coroutines.b.k kVar, int i2) {
        this.f34978b = i2;
        this.f34977a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        int i2 = this.f34978b;
        if (i2 == 0) {
            Object objCollect = this.f34977a.collect(new cr(lVar, 0), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
        }
        if (i2 == 1) {
            Object objCollect2 = this.f34977a.collect(new cr(lVar, 1), eVar);
            return objCollect2 == h.c.a.a.f48038a ? objCollect2 : h.ab.f48028a;
        }
        if (i2 != 2) {
            Object objCollect3 = this.f34977a.collect(new cr(lVar, 3), eVar);
            return objCollect3 == h.c.a.a.f48038a ? objCollect3 : h.ab.f48028a;
        }
        Object objCollect4 = this.f34977a.collect(new cr(lVar, 2), eVar);
        return objCollect4 == h.c.a.a.f48038a ? objCollect4 : h.ab.f48028a;
    }
}
