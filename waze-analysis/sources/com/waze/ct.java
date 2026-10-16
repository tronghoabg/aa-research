package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ct {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.b.bm f23239a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.bq f23240b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.bm f23241c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.b.bq f23242d;

    public ct() {
        kotlinx.coroutines.b.bm bmVarE = kotlinx.coroutines.b.bu.e(0, 1, null, 5);
        this.f23239a = bmVarE;
        this.f23240b = kotlinx.coroutines.b.ai.S(bmVarE);
        kotlinx.coroutines.b.bm bmVarE2 = kotlinx.coroutines.b.bu.e(0, 1, null, 5);
        this.f23241c = bmVarE2;
        this.f23242d = kotlinx.coroutines.b.ai.S(bmVarE2);
    }

    public final kotlinx.coroutines.b.bq a() {
        return this.f23242d;
    }

    public final kotlinx.coroutines.b.bq b() {
        return this.f23240b;
    }

    public final void c(com.waze.av.b.n nVar, com.waze.av.d.k kVar) {
        h.g.b.x.f(nVar, "place");
        h.g.b.x.f(kVar, "venue");
        this.f23241c.c(new cu(nVar, kVar));
    }

    public final void d(com.google.firebase.messaging.l lVar) {
        h.g.b.x.f(lVar, "callable");
        this.f23239a.c(lVar);
    }
}
