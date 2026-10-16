package com.waze.trip_overview.c.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aj implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f41190a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.p f41191b;

    public aj(kotlinx.coroutines.b.k kVar, h.g.a.p pVar) {
        this.f41190a = kVar;
        this.f41191b = pVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f41190a.collect(new ai(lVar, this.f41191b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
