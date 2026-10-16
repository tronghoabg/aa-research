package com.waze.an.d;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f14851a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f14852b;

    public m(kotlinx.coroutines.b.k kVar, n nVar) {
        this.f14851a = kVar;
        this.f14852b = nVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f14851a.collect(new l(lVar, this.f14852b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
