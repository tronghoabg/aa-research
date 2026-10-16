package com.waze.nav_connect.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class u implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f30829a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ w f30830b;

    public u(kotlinx.coroutines.b.k kVar, w wVar) {
        this.f30829a = kVar;
        this.f30830b = wVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f30829a.collect(new t(lVar, this.f30830b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
