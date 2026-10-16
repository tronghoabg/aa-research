package com.waze.bl.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v implements com.waze.bl.c.c.g {

    /* renamed from: a, reason: collision with root package name */
    private final g f16982a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.bl.c.c.c f16983b;

    public v(g gVar, com.waze.bl.c.c.c cVar) {
        h.g.b.x.f(gVar, "closureCandidatesStore");
        h.g.b.x.f(cVar, "config");
        this.f16982a = gVar;
        this.f16983b = cVar;
    }

    @Override // com.waze.bl.c.c.g
    public final Object a(h.c.e eVar) {
        Object objA = this.f16982a.a(this.f16983b.a(), eVar);
        return objA == h.c.a.a.f48038a ? objA : h.ab.f48028a;
    }
}
