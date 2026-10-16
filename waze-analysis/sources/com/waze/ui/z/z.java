package com.waze.ui.z;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class z implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f44029a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f44030b;

    public z(kotlinx.coroutines.b.k kVar, int i2) {
        this.f44030b = i2;
        this.f44029a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        if (this.f44030b != 0) {
            Object objCollect = this.f44029a.collect(new y(lVar, 1), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
        }
        Object objCollect2 = this.f44029a.collect(new y(lVar, 0), eVar);
        return objCollect2 == h.c.a.a.f48038a ? objCollect2 : h.ab.f48028a;
    }
}
