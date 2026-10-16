package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dm {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.b.r f21411a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.car_lib.p.ak f21412b;

    public dm(com.waze.reports_v2.b.r rVar, com.waze.car_lib.p.ak akVar) {
        h.g.b.x.f(rVar, "closureReportData");
        h.g.b.x.f(akVar, "mapMessageTemplateUiState");
        this.f21411a = rVar;
        this.f21412b = akVar;
    }

    public final com.waze.car_lib.p.ak a() {
        return this.f21412b;
    }

    public final com.waze.reports_v2.b.r b() {
        return this.f21411a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm)) {
            return false;
        }
        dm dmVar = (dm) obj;
        return h.g.b.x.n(this.f21411a, dmVar.f21411a) && h.g.b.x.n(this.f21412b, dmVar.f21412b);
    }

    public final int hashCode() {
        return (this.f21411a.hashCode() * 31) + this.f21412b.hashCode();
    }

    public final String toString() {
        return "UIState(closureReportData=" + this.f21411a + ", mapMessageTemplateUiState=" + this.f21412b + ")";
    }
}
