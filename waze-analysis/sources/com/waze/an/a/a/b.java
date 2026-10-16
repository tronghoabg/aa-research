package com.waze.an.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements com.waze.an.a.ad {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f14420a;

    public b(com.waze.alerters.b.a aVar) {
        h.g.b.x.f(aVar, "alertsPolicyProvider");
        this.f14420a = new e(aVar.a().a(), 1);
    }

    @Override // com.waze.an.a.ad
    public final kotlinx.coroutines.b.k a() {
        return this.f14420a;
    }

    @Override // com.waze.an.a.ad
    public final /* synthetic */ void close() {
    }
}
