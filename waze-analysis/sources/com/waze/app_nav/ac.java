package com.waze.app_nav;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ac implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f15171a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ag f15172b;

    public ac(kotlinx.coroutines.b.k kVar, ag agVar) {
        this.f15171a = kVar;
        this.f15172b = agVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f15171a.collect(new ae(lVar, 1), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
