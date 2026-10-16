package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class eq extends fh {

    /* renamed from: a, reason: collision with root package name */
    private final long f41440a;

    /* renamed from: b, reason: collision with root package name */
    private final i f41441b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq(long j2, i iVar) {
        super(null);
        h.g.b.x.f(iVar, "source");
        this.f41440a = j2;
        this.f41441b = iVar;
    }

    public final long a() {
        return this.f41440a;
    }

    public final i b() {
        return this.f41441b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq)) {
            return false;
        }
        eq eqVar = (eq) obj;
        return this.f41440a == eqVar.f41440a && this.f41441b == eqVar.f41441b;
    }

    public final int hashCode() {
        return (a.a.b(this.f41440a) * 31) + this.f41441b.hashCode();
    }

    public final String toString() {
        return "RouteSelected(routeAtId=" + this.f41440a + ", source=" + this.f41441b + ")";
    }
}
