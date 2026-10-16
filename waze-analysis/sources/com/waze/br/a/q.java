package com.waze.br.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f17305a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f17306b;

    public q(kotlinx.coroutines.b.k kVar, int i2) {
        this.f17306b = i2;
        this.f17305a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        if (this.f17306b != 0) {
            Object objCollect = this.f17305a.collect(new p(lVar, 1), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
        }
        Object objCollect2 = this.f17305a.collect(new p(lVar, 0), eVar);
        return objCollect2 == h.c.a.a.f48038a ? objCollect2 : h.ab.f48028a;
    }
}
