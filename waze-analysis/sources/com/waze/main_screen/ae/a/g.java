package com.waze.main_screen.ae.a;

import h.ab;
import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f25726a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aq f25727b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h f25728c;

    public g(kotlinx.coroutines.b.k kVar, aq aqVar, h hVar) {
        this.f25726a = kVar;
        this.f25727b = aqVar;
        this.f25728c = hVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f25726a.collect(new f(lVar, this.f25727b, this.f25728c), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
