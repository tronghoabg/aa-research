package com.waze.ui.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r implements ad, y, m {

    /* renamed from: a, reason: collision with root package name */
    private final w f42717a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f42718b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f42719c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.a f42720d;

    /* renamed from: e, reason: collision with root package name */
    private final h.g.a.a f42721e;

    public /* synthetic */ r(w wVar, boolean z, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, int i2) {
        aVar2 = (i2 & 8) != 0 ? new com.waze.ui.a.b(6) : aVar2;
        aVar3 = (i2 & 16) != 0 ? new com.waze.ui.a.b(7) : aVar3;
        int i3 = i2 & 2;
        int i4 = i2 & 4;
        boolean z2 = !(i3 == 0);
        aVar = i4 != 0 ? null : aVar;
        h.g.b.x.f(wVar, "icon");
        h.g.b.x.f(aVar2, "onMapTap");
        h.g.b.x.f(aVar3, "onBackPressed");
        this.f42717a = wVar;
        this.f42718b = z | z2;
        this.f42719c = aVar;
        this.f42720d = aVar2;
        this.f42721e = aVar3;
    }

    @Override // com.waze.ui.l.m
    public final h.g.a.a a() {
        return this.f42721e;
    }

    public final w b() {
        return this.f42717a;
    }

    public final h.g.a.a c() {
        return this.f42719c;
    }

    @Override // com.waze.ui.l.y
    public final h.g.a.a d() {
        return this.f42720d;
    }

    @Override // com.waze.ui.l.ad
    public final boolean e() {
        return this.f42718b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return h.g.b.x.n(this.f42717a, rVar.f42717a) && this.f42718b == rVar.f42718b && h.g.b.x.n(this.f42719c, rVar.f42719c) && h.g.b.x.n(this.f42720d, rVar.f42720d) && h.g.b.x.n(this.f42721e, rVar.f42721e);
    }

    public final int hashCode() {
        int iHashCode = this.f42717a.hashCode() * 31;
        h.g.a.a aVar = this.f42719c;
        return ((((((iHashCode + a.a.a(this.f42718b)) * 31) + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f42720d.hashCode()) * 31) + this.f42721e.hashCode();
    }

    public final String toString() {
        return "Compact(icon=" + this.f42717a + ", visible=" + this.f42718b + ", onClick=" + this.f42719c + ", onMapTap=" + this.f42720d + ", onBackPressed=" + this.f42721e + ")";
    }
}
