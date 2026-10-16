package com.waze.reports;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f33969a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f33970b;

    public u(kotlinx.coroutines.b.k kVar, z zVar) {
        this.f33969a = kVar;
        this.f33970b = zVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f33969a.collect(new t(lVar, this.f33970b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
