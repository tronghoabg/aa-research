package com.waze.bv;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f17558a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ w f17559b;

    public v(kotlinx.coroutines.b.k kVar, w wVar) {
        this.f17558a = kVar;
        this.f17559b = wVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f17558a.collect(new u(lVar, this.f17559b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
