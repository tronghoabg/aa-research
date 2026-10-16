package com.waze.nav_connect.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class r implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f30823a;

    public r(kotlinx.coroutines.b.k kVar) {
        this.f30823a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f30823a.collect(new q(lVar), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
