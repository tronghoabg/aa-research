package com.waze.install;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class al implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f24752a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.l.c f24753b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f24754c;

    public al(kotlinx.coroutines.b.k kVar, h.l.c cVar, int i2) {
        this.f24754c = i2;
        this.f24752a = kVar;
        this.f24753b = cVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        int i2 = this.f24754c;
        if (i2 == 0) {
            Object objCollect = this.f24752a.collect(new ak(lVar, this.f24753b, 0), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
        }
        h.l.c cVar = this.f24753b;
        if (i2 != 1) {
            Object objCollect2 = this.f24752a.collect(new ak(lVar, cVar, 2), eVar);
            return objCollect2 == h.c.a.a.f48038a ? objCollect2 : h.ab.f48028a;
        }
        Object objCollect3 = this.f24752a.collect(new ak(lVar, cVar, 1), eVar);
        return objCollect3 == h.c.a.a.f48038a ? objCollect3 : h.ab.f48028a;
    }
}
