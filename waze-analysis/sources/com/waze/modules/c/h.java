package com.waze.modules.c;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Long f30147a;

    /* renamed from: b, reason: collision with root package name */
    private final j f30148b;

    /* renamed from: c, reason: collision with root package name */
    private final i f30149c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f30150d;

    /* renamed from: e, reason: collision with root package name */
    private final Double f30151e;

    /* renamed from: f, reason: collision with root package name */
    private final Double f30152f;

    /* renamed from: g, reason: collision with root package name */
    private final Boolean f30153g;

    /* renamed from: h, reason: collision with root package name */
    private final Integer f30154h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f30155i;

    /* renamed from: j, reason: collision with root package name */
    private final List f30156j;

    /* renamed from: k, reason: collision with root package name */
    private final Long f30157k;

    /* renamed from: l, reason: collision with root package name */
    private final Boolean f30158l;

    public h(Long l2, j jVar, i iVar, Integer num, Double d2, Double d3, Boolean bool, Integer num2, com.waze.shared_infra.h.c cVar, List list, Long l3, Boolean bool2) {
        h.g.b.x.f(list, "geometryPoints");
        this.f30147a = l2;
        this.f30148b = jVar;
        this.f30149c = iVar;
        this.f30150d = num;
        this.f30151e = d2;
        this.f30152f = d3;
        this.f30153g = bool;
        this.f30154h = num2;
        this.f30155i = cVar;
        this.f30156j = list;
        this.f30157k = l3;
        this.f30158l = bool2;
    }

    public final i a() {
        return this.f30149c;
    }

    public final j b() {
        return this.f30148b;
    }

    public final com.waze.shared_infra.h.c c() {
        return this.f30155i;
    }

    public final Boolean d() {
        return this.f30153g;
    }

    public final Boolean e() {
        return this.f30158l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return h.g.b.x.n(this.f30147a, hVar.f30147a) && this.f30148b == hVar.f30148b && this.f30149c == hVar.f30149c && h.g.b.x.n(this.f30150d, hVar.f30150d) && h.g.b.x.n(this.f30151e, hVar.f30151e) && h.g.b.x.n(this.f30152f, hVar.f30152f) && h.g.b.x.n(this.f30153g, hVar.f30153g) && h.g.b.x.n(this.f30154h, hVar.f30154h) && h.g.b.x.n(this.f30155i, hVar.f30155i) && h.g.b.x.n(this.f30156j, hVar.f30156j) && h.g.b.x.n(this.f30157k, hVar.f30157k) && h.g.b.x.n(this.f30158l, hVar.f30158l);
    }

    public final Double f() {
        return this.f30152f;
    }

    public final Double g() {
        return this.f30151e;
    }

    public final Integer h() {
        return this.f30154h;
    }

    public final int hashCode() {
        Long l2 = this.f30147a;
        int iHashCode = l2 == null ? 0 : l2.hashCode();
        j jVar = this.f30148b;
        int iHashCode2 = jVar == null ? 0 : jVar.hashCode();
        int i2 = iHashCode * 31;
        i iVar = this.f30149c;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Integer num = this.f30150d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Double d2 = this.f30151e;
        int iHashCode5 = (iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f30152f;
        int iHashCode6 = (iHashCode5 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Boolean bool = this.f30153g;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.f30154h;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        com.waze.shared_infra.h.c cVar = this.f30155i;
        int iHashCode9 = (((iHashCode8 + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f30156j.hashCode()) * 31;
        Long l3 = this.f30157k;
        int iHashCode10 = (iHashCode9 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool2 = this.f30158l;
        return iHashCode10 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final Integer i() {
        return this.f30150d;
    }

    public final Long j() {
        return this.f30147a;
    }

    public final Long k() {
        return this.f30157k;
    }

    public final List l() {
        return this.f30156j;
    }

    public final String toString() {
        return "EventOnRoute(id=" + this.f30147a + ", alertType=" + this.f30148b + ", alertSubType=" + this.f30149c + ", roadInfoSeverity=" + this.f30150d + ", ratioOnRoadStart=" + this.f30151e + ", ratioOnRoadEnd=" + this.f30152f + ", isMajorEvent=" + this.f30153g + ", duration=" + this.f30154h + ", location=" + this.f30155i + ", geometryPoints=" + this.f30156j + ", jamId=" + this.f30157k + ", isPartialLaneClosure=" + this.f30158l + ")";
    }
}
