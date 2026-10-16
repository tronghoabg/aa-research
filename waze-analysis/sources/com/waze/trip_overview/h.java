package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final g f41466a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.q.a f41467b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f41468c;

    /* renamed from: d, reason: collision with root package name */
    private final Long f41469d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f41470e;

    public h(g gVar, com.waze.shared_infra.q.a aVar) {
        h.g.b.x.f(gVar, "state");
        this.f41466a = gVar;
        this.f41467b = aVar;
        this.f41468c = gVar == g.f41464b;
        this.f41469d = aVar != null ? Long.valueOf(aVar.b()) : null;
        this.f41470e = aVar != null ? Long.valueOf(com.waze.settings.h.c.f(aVar.a() - aVar.b())) : null;
    }

    public static final h f(g gVar, com.waze.shared_infra.q.a aVar) {
        h.g.b.x.f(gVar, "state");
        return new h(gVar, aVar);
    }

    public final com.waze.shared_infra.q.a a() {
        return this.f41467b;
    }

    public final g b() {
        return this.f41466a;
    }

    public final Long c() {
        return this.f41470e;
    }

    public final Long d() {
        return this.f41469d;
    }

    public final boolean e() {
        return this.f41468c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f41466a == hVar.f41466a && h.g.b.x.n(this.f41467b, hVar.f41467b);
    }

    public final int hashCode() {
        int iHashCode = this.f41466a.hashCode() * 31;
        com.waze.shared_infra.q.a aVar = this.f41467b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "RouteScreenTimerData(state=" + this.f41466a + ", timeout=" + this.f41467b + ")";
    }

    public h() {
        this(null);
    }

    public /* synthetic */ h(byte[] bArr) {
        this(g.f41463a, null);
    }
}
