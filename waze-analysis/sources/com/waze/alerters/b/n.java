package com.waze.alerters.b;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f14256a;

    public n(kotlinx.coroutines.b.k kVar) {
        this.f14256a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f14256a.collect(new m(lVar), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
