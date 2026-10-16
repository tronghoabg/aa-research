package com.waze.car_lib.i.c;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class s implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f20126a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f20127b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f20128c;

    public s(kotlinx.coroutines.b.k kVar, t tVar, int i2) {
        this.f20128c = i2;
        this.f20126a = kVar;
        this.f20127b = tVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        int i2 = this.f20128c;
        t tVar = this.f20127b;
        if (i2 != 0) {
            Object objCollect = this.f20126a.collect(new r(lVar, tVar, 1), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
        }
        Object objCollect2 = this.f20126a.collect(new r(lVar, tVar, 0), eVar);
        return objCollect2 == h.c.a.a.f48038a ? objCollect2 : h.ab.f48028a;
    }
}
