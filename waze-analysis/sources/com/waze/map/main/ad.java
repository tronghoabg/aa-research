package com.waze.map.main;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ad implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f29307a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ af f29308b;

    public ad(kotlinx.coroutines.b.k kVar, af afVar) {
        this.f29307a = kVar;
        this.f29308b = afVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f29307a.collect(new t(lVar, 4), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
