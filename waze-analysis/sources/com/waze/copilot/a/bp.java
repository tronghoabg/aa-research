package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bp implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f22810a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bq f22811b;

    public bp(kotlinx.coroutines.b.k kVar, bq bqVar) {
        this.f22810a = kVar;
        this.f22811b = bqVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f22810a.collect(new bo(lVar, this.f22811b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
