package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aw implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f40700a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f40701b;

    public aw(kotlinx.coroutines.b.k kVar, int i2) {
        this.f40701b = i2;
        this.f40700a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        int i2 = this.f40701b;
        if (i2 == 0) {
            Object objCollect = this.f40700a.collect(new av(lVar, 0), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
        }
        if (i2 == 1) {
            Object objCollect2 = this.f40700a.collect(new av(lVar, 1), eVar);
            return objCollect2 == h.c.a.a.f48038a ? objCollect2 : h.ab.f48028a;
        }
        if (i2 != 2) {
            Object objCollect3 = this.f40700a.collect(new av(lVar, 4), eVar);
            return objCollect3 == h.c.a.a.f48038a ? objCollect3 : h.ab.f48028a;
        }
        Object objCollect4 = this.f40700a.collect(new av(lVar, 2), eVar);
        return objCollect4 == h.c.a.a.f48038a ? objCollect4 : h.ab.f48028a;
    }
}
