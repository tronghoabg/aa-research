package com.waze.an.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f14582a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f14583b;

    /* renamed from: c, reason: collision with root package name */
    private final c f14584c;

    /* renamed from: d, reason: collision with root package name */
    private final j f14585d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.design_components.b.d f14586e;

    public i(String str, h.g.a.a aVar, c cVar, j jVar, com.waze.design_components.b.d dVar) {
        h.g.b.x.f(str, "text");
        h.g.b.x.f(aVar, "onPerform");
        h.g.b.x.f(cVar, "buttonType");
        this.f14582a = str;
        this.f14583b = aVar;
        this.f14584c = cVar;
        this.f14585d = jVar;
        this.f14586e = dVar;
    }

    public static /* synthetic */ i j(i iVar, h.g.a.a aVar, j jVar) {
        String str = iVar.f14582a;
        c cVar = iVar.f14584c;
        com.waze.design_components.b.d dVar = iVar.f14586e;
        h.g.b.x.f(str, "text");
        h.g.b.x.f(aVar, "onPerform");
        h.g.b.x.f(cVar, "buttonType");
        return new i(str, aVar, cVar, jVar, dVar);
    }

    public final com.waze.design_components.b.d a() {
        return this.f14586e;
    }

    public final com.waze.design_components.b.d b() {
        return this.f14586e;
    }

    public final c c() {
        return this.f14584c;
    }

    public final c d() {
        return this.f14584c;
    }

    public final j e() {
        return this.f14585d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return h.g.b.x.n(this.f14582a, iVar.f14582a) && h.g.b.x.n(this.f14583b, iVar.f14583b) && h.g.b.x.n(this.f14584c, iVar.f14584c) && h.g.b.x.n(this.f14585d, iVar.f14585d) && this.f14586e == iVar.f14586e;
    }

    public final j f() {
        return this.f14585d;
    }

    public final String g() {
        return this.f14582a;
    }

    public final String h() {
        return this.f14582a;
    }

    public final int hashCode() {
        int iHashCode = (((this.f14582a.hashCode() * 31) + this.f14583b.hashCode()) * 31) + this.f14584c.hashCode();
        j jVar = this.f14585d;
        int iHashCode2 = ((iHashCode * 31) + (jVar == null ? 0 : jVar.hashCode())) * 31;
        com.waze.design_components.b.d dVar = this.f14586e;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final h.g.a.a i() {
        return this.f14583b;
    }

    public final String toString() {
        return "Action(text=" + this.f14582a + ", onPerform=" + this.f14583b + ", buttonType=" + this.f14584c + ", timeout=" + this.f14585d + ", icon=" + this.f14586e + ")";
    }
}
