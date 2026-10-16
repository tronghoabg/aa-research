package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bq implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f28101a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Class f28102b;

    public bq(kotlinx.coroutines.b.k kVar, Class cls) {
        this.f28101a = kVar;
        this.f28102b = cls;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f28101a.collect(new bp(lVar, this.f28102b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
