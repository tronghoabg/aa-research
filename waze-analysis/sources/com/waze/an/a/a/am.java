package com.waze.an.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class am implements com.waze.an.a.ad {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f14378a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f14379b;

    public am(com.waze.alerters.a.d dVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(dVar, "collection");
        h.g.b.x.f(eVar, "logger");
        this.f14378a = eVar;
        this.f14379b = new bf(dVar.a(), this, 1);
    }

    @Override // com.waze.an.a.ad
    public final kotlinx.coroutines.b.k a() {
        return this.f14379b;
    }

    @Override // com.waze.an.a.ad
    public final /* synthetic */ void close() {
    }
}
