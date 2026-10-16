package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gl extends com.waze.car_lib.o.ae {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.b.r f19618a;

    public gl(com.waze.reports_v2.b.r rVar) {
        super(null);
        this.f19618a = rVar;
    }

    public final com.waze.reports_v2.b.r a() {
        return this.f19618a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gl) && h.g.b.x.n(this.f19618a, ((gl) obj).f19618a);
    }

    public final int hashCode() {
        com.waze.reports_v2.b.r rVar = this.f19618a;
        if (rVar == null) {
            return 0;
        }
        return rVar.hashCode();
    }

    public final String toString() {
        return "ClosureClicked(closureReportData=" + this.f19618a + ")";
    }
}
