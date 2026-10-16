package com.waze.sharedrive.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements r {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedrive.c.a.l f38242a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedrive.c.a.h f38243b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.sharedrive.c.a.b f38244c;

    /* renamed from: d, reason: collision with root package name */
    private final f f38245d;

    public g(com.waze.sharedrive.c.a.l lVar, com.waze.sharedrive.c.a.h hVar, com.waze.sharedrive.c.a.b bVar, f fVar) {
        h.g.b.x.f(lVar, "user");
        h.g.b.x.f(hVar, "driverRole");
        h.g.b.x.f(bVar, "destination");
        this.f38242a = lVar;
        this.f38243b = hVar;
        this.f38244c = bVar;
        this.f38245d = fVar;
    }

    public static /* synthetic */ g e(g gVar, f fVar) {
        com.waze.sharedrive.c.a.l lVar = gVar.f38242a;
        com.waze.sharedrive.c.a.h hVar = gVar.f38243b;
        com.waze.sharedrive.c.a.b bVar = gVar.f38244c;
        h.g.b.x.f(lVar, "user");
        h.g.b.x.f(hVar, "driverRole");
        h.g.b.x.f(bVar, "destination");
        return new g(lVar, hVar, bVar, fVar);
    }

    public final com.waze.sharedrive.c.a.b a() {
        return this.f38244c;
    }

    public final com.waze.sharedrive.c.a.h b() {
        return this.f38243b;
    }

    public final com.waze.sharedrive.c.a.l c() {
        return this.f38242a;
    }

    public final f d() {
        return this.f38245d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return h.g.b.x.n(this.f38242a, gVar.f38242a) && h.g.b.x.n(this.f38243b, gVar.f38243b) && h.g.b.x.n(this.f38244c, gVar.f38244c) && h.g.b.x.n(this.f38245d, gVar.f38245d);
    }

    public final int hashCode() {
        int iHashCode = (((this.f38242a.hashCode() * 31) + this.f38243b.hashCode()) * 31) + this.f38244c.hashCode();
        f fVar = this.f38245d;
        return (iHashCode * 31) + (fVar == null ? 0 : fVar.hashCode());
    }

    public final String toString() {
        return "Creating(user=" + this.f38242a + ", driverRole=" + this.f38243b + ", destination=" + this.f38244c + ", status=" + this.f38245d + ")";
    }
}
