package com.waze.reports;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f33961a;

    public q(kotlinx.coroutines.b.k kVar) {
        this.f33961a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f33961a.collect(new p(lVar), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
