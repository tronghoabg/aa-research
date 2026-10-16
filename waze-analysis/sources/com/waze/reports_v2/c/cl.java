package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cl {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.b.at f34346a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.reports_v2.b.ae f34347b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cl(com.waze.reports_v2.b.ae aeVar) {
        this(null, aeVar);
        h.g.b.x.f(aeVar, "legacy");
    }

    public final com.waze.reports_v2.b.ae a() {
        return this.f34347b;
    }

    public final com.waze.reports_v2.b.at b() {
        return this.f34346a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl)) {
            return false;
        }
        cl clVar = (cl) obj;
        return this.f34346a == clVar.f34346a && this.f34347b == clVar.f34347b;
    }

    public final int hashCode() {
        com.waze.reports_v2.b.at atVar = this.f34346a;
        int iHashCode = atVar == null ? 0 : atVar.hashCode();
        com.waze.reports_v2.b.ae aeVar = this.f34347b;
        return (iHashCode * 31) + (aeVar != null ? aeVar.hashCode() : 0);
    }

    public final String toString() {
        return "LegacyOrSubtype(subType=" + this.f34346a + ", legacy=" + this.f34347b + ")";
    }

    public cl(com.waze.reports_v2.b.at atVar, com.waze.reports_v2.b.ae aeVar) {
        this.f34346a = atVar;
        this.f34347b = aeVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cl(com.waze.reports_v2.b.at atVar) {
        this(atVar, null);
        h.g.b.x.f(atVar, "subType");
    }
}
