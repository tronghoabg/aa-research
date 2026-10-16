package com.waze.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final f f18662a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.b.bd f18663b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.c.e.a.c f18664c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.ui.aa.c f18665d;

    public g(f fVar, com.waze.ui.b.bd bdVar, com.waze.c.e.a.c cVar, com.waze.ui.aa.c cVar2) {
        h.g.b.x.f(fVar, "routesState");
        h.g.b.x.f(bdVar, "routeCardsState");
        h.g.b.x.f(cVar, "mapState");
        this.f18662a = fVar;
        this.f18663b = bdVar;
        this.f18664c = cVar;
        this.f18665d = cVar2;
    }

    public final f a() {
        return this.f18662a;
    }

    public final com.waze.c.e.a.c b() {
        return this.f18664c;
    }

    public final com.waze.ui.b.bd c() {
        return this.f18663b;
    }

    public final com.waze.ui.aa.c d() {
        return this.f18665d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return h.g.b.x.n(this.f18662a, gVar.f18662a) && h.g.b.x.n(this.f18663b, gVar.f18663b) && h.g.b.x.n(this.f18664c, gVar.f18664c) && h.g.b.x.n(this.f18665d, gVar.f18665d);
    }

    public final int hashCode() {
        int iHashCode = (((this.f18662a.hashCode() * 31) + this.f18663b.hashCode()) * 31) + this.f18664c.hashCode();
        com.waze.ui.aa.c cVar = this.f18665d;
        return (iHashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "AltRoutesState(routesState=" + this.f18662a + ", routeCardsState=" + this.f18663b + ", mapState=" + this.f18664c + ", tollInfoDialog=" + this.f18665d + ")";
    }

    public /* synthetic */ g(f fVar, com.waze.ui.b.bd bdVar, com.waze.c.e.a.c cVar) {
        this(fVar, bdVar, cVar, null);
    }
}
