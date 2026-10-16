package com.waze.nav_connect.b;

import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class m implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f30809a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aq f30810b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ n f30811c;

    public m(kotlinx.coroutines.b.k kVar, aq aqVar, n nVar) {
        this.f30809a = kVar;
        this.f30810b = aqVar;
        this.f30811c = nVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f30809a.collect(new l(lVar, this.f30810b, this.f30811c), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
