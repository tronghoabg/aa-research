package com.waze.main_screen.ae.a;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class k implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f25738a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f25739b;

    public k(kotlinx.coroutines.b.k kVar, n nVar) {
        this.f25738a = kVar;
        this.f25739b = nVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f25738a.collect(new j(lVar, this.f25739b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
