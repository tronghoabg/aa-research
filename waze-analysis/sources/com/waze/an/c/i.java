package com.waze.an.c;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f14777a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f14778b;

    public i(kotlinx.coroutines.b.k kVar, j jVar) {
        this.f14777a = kVar;
        this.f14778b = jVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f14777a.collect(new h(lVar, this.f14778b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
