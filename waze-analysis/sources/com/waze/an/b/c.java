package com.waze.an.b;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f14623a;

    public c(kotlinx.coroutines.b.k kVar) {
        this.f14623a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f14623a.collect(new b(lVar), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
