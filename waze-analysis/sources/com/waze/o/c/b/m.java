package com.waze.o.c.b;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final long f32809a;

    /* renamed from: b, reason: collision with root package name */
    private final long f32810b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32811c;

    /* renamed from: d, reason: collision with root package name */
    private final List f32812d;

    /* renamed from: e, reason: collision with root package name */
    private final List f32813e;

    /* renamed from: f, reason: collision with root package name */
    private final o f32814f;

    /* renamed from: g, reason: collision with root package name */
    private final List f32815g;

    public /* synthetic */ m(long j2, long j3, String str, List list, List list2, o oVar, List list3) {
        h.g.b.x.f(str, "altDescription");
        h.g.b.x.f(list, "routeAttributes");
        h.g.b.x.f(list2, "routeTypes");
        h.g.b.x.f(list3, "events");
        this.f32809a = j2;
        this.f32810b = j3;
        this.f32811c = str;
        this.f32812d = list;
        this.f32813e = list2;
        this.f32814f = oVar;
        this.f32815g = list3;
    }

    public final o a() {
        return this.f32814f;
    }

    public final String b() {
        return this.f32811c;
    }

    public final List c() {
        return this.f32815g;
    }

    public final List d() {
        return this.f32812d;
    }

    public final List e() {
        return this.f32813e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f32809a == mVar.f32809a && h.o.a.A(this.f32810b, mVar.f32810b) && h.g.b.x.n(this.f32811c, mVar.f32811c) && h.g.b.x.n(this.f32812d, mVar.f32812d) && h.g.b.x.n(this.f32813e, mVar.f32813e) && h.g.b.x.n(this.f32814f, mVar.f32814f) && h.g.b.x.n(this.f32815g, mVar.f32815g);
    }

    public final int hashCode() {
        h.o.c cVar = h.o.a.f48264a;
        int iB = (((((((a.a.b(this.f32809a) * 31) + a.a.b(this.f32810b)) * 31) + this.f32811c.hashCode()) * 31) + this.f32812d.hashCode()) * 31) + this.f32813e.hashCode();
        o oVar = this.f32814f;
        return (((iB * 31) + (oVar == null ? 0 : oVar.hashCode())) * 31) + this.f32815g.hashCode();
    }

    public final String toString() {
        return "RouteDescription(totalLengthMeters=" + this.f32809a + ", totalDuration=" + h.o.a.y(this.f32810b) + ", altDescription=" + this.f32811c + ", routeAttributes=" + this.f32812d + ", routeTypes=" + this.f32813e + ", tollPriceInfo=" + this.f32814f + ", events=" + this.f32815g + ")";
    }
}
