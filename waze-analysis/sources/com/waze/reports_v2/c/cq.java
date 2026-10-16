package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cq {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f34353a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f34354b;

    public cq(h.g.a.a aVar, h.g.a.a aVar2) {
        h.g.b.x.f(aVar, "onShown");
        h.g.b.x.f(aVar2, "onDismissedByUI");
        this.f34353a = aVar;
        this.f34354b = aVar2;
    }

    public final h.g.a.a a() {
        return this.f34354b;
    }

    public final h.g.a.a b() {
        return this.f34353a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq)) {
            return false;
        }
        cq cqVar = (cq) obj;
        return h.g.b.x.n(this.f34353a, cqVar.f34353a) && h.g.b.x.n(this.f34354b, cqVar.f34354b);
    }

    public final int hashCode() {
        return (this.f34353a.hashCode() * 31) + this.f34354b.hashCode();
    }

    public final String toString() {
        return "ReportButtonTapReportingEducationState(onShown=" + this.f34353a + ", onDismissedByUI=" + this.f34354b + ")";
    }
}
