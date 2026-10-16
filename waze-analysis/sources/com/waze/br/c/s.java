package com.waze.br.c;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f17407a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f17408b;

    public s(kotlinx.coroutines.b.k kVar, t tVar) {
        this.f17407a = kVar;
        this.f17408b = tVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f17407a.collect(new r(lVar), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
