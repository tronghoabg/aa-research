package com.waze.reports_v2.presentation;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ca extends cg {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.b.q f34939a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.reports_v2.b.at f34940b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.reports_v2.b.i f34941c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(com.waze.reports_v2.b.q qVar, com.waze.reports_v2.b.at atVar, com.waze.reports_v2.b.i iVar) {
        super(null);
        h.g.b.x.f(qVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(atVar, "subtype");
        this.f34939a = qVar;
        this.f34940b = atVar;
        this.f34941c = iVar;
    }

    public final com.waze.reports_v2.b.i a() {
        return this.f34941c;
    }

    public final com.waze.reports_v2.b.q b() {
        return this.f34939a;
    }

    public final com.waze.reports_v2.b.at c() {
        return this.f34940b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca)) {
            return false;
        }
        ca caVar = (ca) obj;
        return this.f34939a == caVar.f34939a && this.f34940b == caVar.f34940b && h.g.b.x.n(this.f34941c, caVar.f34941c);
    }

    public final int hashCode() {
        int iHashCode = (this.f34939a.hashCode() * 31) + this.f34940b.hashCode();
        com.waze.reports_v2.b.i iVar = this.f34941c;
        return (iHashCode * 31) + (iVar == null ? 0 : iVar.hashCode());
    }

    public final String toString() {
        return "CloseFlowWithReportType(type=" + this.f34939a + ", subtype=" + this.f34940b + ", additionalReportData=" + this.f34941c + ")";
    }
}
