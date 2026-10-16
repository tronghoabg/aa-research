package com.waze.app_nav.hub.b;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class p implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f15285a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f15286b;

    public p(kotlinx.coroutines.b.k kVar, q qVar) {
        this.f15285a = kVar;
        this.f15286b = qVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f15285a.collect(new o(lVar, this.f15286b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
