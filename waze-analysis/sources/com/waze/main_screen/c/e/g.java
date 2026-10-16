package com.waze.main_screen.c.e;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f26208a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f26209b;

    public g(kotlinx.coroutines.b.k kVar, h hVar) {
        this.f26208a = kVar;
        this.f26209b = hVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f26208a.collect(new f(lVar, this.f26209b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
