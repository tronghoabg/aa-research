package com.waze.car_lib.e;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f19298a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f19299b;

    public n(kotlinx.coroutines.b.k kVar, p pVar) {
        this.f19298a = kVar;
        this.f19299b = pVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f19298a.collect(new m(lVar, this.f19299b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
