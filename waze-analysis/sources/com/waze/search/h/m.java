package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f35939a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f35940b;

    public m(kotlinx.coroutines.b.k kVar, o oVar) {
        this.f35939a = kVar;
        this.f35940b = oVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f35939a.collect(new l(lVar, this.f35940b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
