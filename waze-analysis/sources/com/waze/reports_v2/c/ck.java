package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ck {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.b.q f34344a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.reports_v2.b.ad f34345b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ck(com.waze.reports_v2.b.ad adVar) {
        this(null, adVar);
        h.g.b.x.f(adVar, "legacy");
    }

    public final com.waze.reports_v2.b.q a() {
        return this.f34344a;
    }

    public final com.waze.reports_v2.b.ad b() {
        return this.f34345b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck)) {
            return false;
        }
        ck ckVar = (ck) obj;
        return this.f34344a == ckVar.f34344a && this.f34345b == ckVar.f34345b;
    }

    public final int hashCode() {
        com.waze.reports_v2.b.q qVar = this.f34344a;
        int iHashCode = qVar == null ? 0 : qVar.hashCode();
        com.waze.reports_v2.b.ad adVar = this.f34345b;
        return (iHashCode * 31) + (adVar != null ? adVar.hashCode() : 0);
    }

    public final String toString() {
        return "LegacyOrCategory(category=" + this.f34344a + ", legacy=" + this.f34345b + ")";
    }

    public ck(com.waze.reports_v2.b.q qVar, com.waze.reports_v2.b.ad adVar) {
        this.f34344a = qVar;
        this.f34345b = adVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ck(com.waze.reports_v2.b.q qVar) {
        this(qVar, null);
        h.g.b.x.f(qVar, "category");
    }
}
