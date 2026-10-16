package com.waze.w;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class w implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f45467a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f45468b;

    public w(kotlinx.coroutines.b.k kVar, y yVar) {
        this.f45467a = kVar;
        this.f45468b = yVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f45467a.collect(new v(lVar, this.f45468b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
