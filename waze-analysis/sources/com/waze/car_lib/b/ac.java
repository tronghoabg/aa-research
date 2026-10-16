package com.waze.car_lib.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ac implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f18944a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ap f18945b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.an.a.l f18946c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.b.am f18947d;

    public ac(kotlinx.coroutines.b.k kVar, ap apVar, com.waze.an.a.l lVar, h.g.b.am amVar) {
        this.f18944a = kVar;
        this.f18945b = apVar;
        this.f18946c = lVar;
        this.f18947d = amVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f18944a.collect(new ab(lVar, this.f18945b, this.f18946c, this.f18947d), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
