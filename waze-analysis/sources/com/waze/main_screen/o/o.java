package com.waze.main_screen.o;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class o implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f26712a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f26713b;

    public o(kotlinx.coroutines.b.k kVar, r rVar) {
        this.f26712a = kVar;
        this.f26713b = rVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f26712a.collect(new n(lVar, this.f26713b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
