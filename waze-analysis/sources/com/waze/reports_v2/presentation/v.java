package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v extends aa {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.b.at f35076a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.w.b.bj f35077b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35078c;

    public v(com.waze.reports_v2.b.at atVar, com.waze.ui.w.b.bj bjVar, int i2) {
        super(null);
        this.f35076a = atVar;
        this.f35077b = bjVar;
        this.f35078c = i2;
    }

    public final int a() {
        return this.f35078c;
    }

    public final com.waze.reports_v2.b.at b() {
        return this.f35076a;
    }

    public final com.waze.ui.w.b.bj c() {
        return this.f35077b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f35076a == vVar.f35076a && this.f35077b == vVar.f35077b && this.f35078c == vVar.f35078c;
    }

    public final int hashCode() {
        com.waze.reports_v2.b.at atVar = this.f35076a;
        int iHashCode = atVar == null ? 0 : atVar.hashCode();
        com.waze.ui.w.b.bj bjVar = this.f35077b;
        return (((iHashCode * 31) + (bjVar != null ? bjVar.hashCode() : 0)) * 31) + this.f35078c;
    }

    public final String toString() {
        return "NotifyAlertReported(reportedType=" + this.f35076a + ", reportedUiType=" + this.f35077b + ", pointsAwarded=" + this.f35078c + ")";
    }
}
