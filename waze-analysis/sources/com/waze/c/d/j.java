package com.waze.c.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j extends l {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.modules.c.ar f18369a;

    /* renamed from: b, reason: collision with root package name */
    private final long f18370b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f18371c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f18372d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.waze.modules.c.ar arVar, long j2, boolean z, boolean z2) {
        super(null);
        h.g.b.x.f(arVar, "route");
        this.f18369a = arVar;
        this.f18370b = j2;
        this.f18371c = z;
        this.f18372d = z2;
    }

    public static /* synthetic */ j e(j jVar, boolean z) {
        com.waze.modules.c.ar arVar = jVar.f18369a;
        long j2 = jVar.f18370b;
        boolean z2 = jVar.f18371c;
        h.g.b.x.f(arVar, "route");
        return new j(arVar, j2, z2, z);
    }

    @Override // com.waze.c.d.l
    public final long a() {
        return this.f18370b;
    }

    @Override // com.waze.c.d.l
    public final boolean b() {
        return this.f18372d;
    }

    @Override // com.waze.c.d.m
    public final com.waze.modules.c.ar c() {
        return this.f18369a;
    }

    public final boolean d() {
        return (com.waze.a.af.m(this).E() && this.f18371c == this.f18372d) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return h.g.b.x.n(this.f18369a, jVar.f18369a) && this.f18370b == jVar.f18370b && this.f18371c == jVar.f18371c && this.f18372d == jVar.f18372d;
    }

    public final int hashCode() {
        int iHashCode = this.f18369a.hashCode() * 31;
        boolean z = this.f18372d;
        return ((((iHashCode + a.a.b(this.f18370b)) * 31) + a.a.a(this.f18371c)) * 31) + a.a.a(z);
    }

    public final String toString() {
        return "Current(route=" + this.f18369a + ", routingId=" + this.f18370b + ", initiallyHovRoute=" + this.f18371c + ", hovRouteEnabled=" + this.f18372d + ")";
    }
}
