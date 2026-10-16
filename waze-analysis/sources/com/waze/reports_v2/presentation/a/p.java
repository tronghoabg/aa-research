package com.waze.reports_v2.presentation.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f34737a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f34738b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f34739c;

    public p(kotlinx.coroutines.b.k kVar, q qVar, h.g.a.a aVar) {
        this.f34737a = kVar;
        this.f34738b = qVar;
        this.f34739c = aVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f34737a.collect(new o(lVar, this.f34738b, this.f34739c), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
