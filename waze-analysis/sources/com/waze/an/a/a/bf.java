package com.waze.an.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bf implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f14434a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f14435b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f14436c;

    public bf(kotlinx.coroutines.b.k kVar, Object obj, int i2) {
        this.f14436c = i2;
        this.f14434a = kVar;
        this.f14435b = obj;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        int i2 = this.f14436c;
        if (i2 == 0) {
            Object objCollect = this.f14434a.collect(new ax(lVar, this.f14435b, 2), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
        }
        Object obj = this.f14435b;
        if (i2 != 1) {
            Object objCollect2 = this.f14434a.collect(new ax(lVar, obj, 3), eVar);
            return objCollect2 == h.c.a.a.f48038a ? objCollect2 : h.ab.f48028a;
        }
        Object objCollect3 = this.f14434a.collect(new ax(lVar, obj, 1), eVar);
        return objCollect3 == h.c.a.a.f48038a ? objCollect3 : h.ab.f48028a;
    }
}
