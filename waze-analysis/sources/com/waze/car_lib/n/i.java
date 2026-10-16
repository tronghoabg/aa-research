package com.waze.car_lib.n;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f20406a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f20407b;

    public i(kotlinx.coroutines.b.k kVar, j jVar) {
        this.f20406a = kVar;
        this.f20407b = jVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f20406a.collect(new h(lVar, this.f20407b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
