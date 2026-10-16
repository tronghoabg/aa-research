package com.waze.reports_v2.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.l.a f34123a;

    /* renamed from: b, reason: collision with root package name */
    private final s f34124b;

    /* renamed from: c, reason: collision with root package name */
    private final Float f34125c;

    public r(com.waze.shared_infra.l.a aVar, s sVar, Float f2) {
        h.g.b.x.f(aVar, "segment");
        h.g.b.x.f(sVar, "useCase");
        this.f34123a = aVar;
        this.f34124b = sVar;
        this.f34125c = f2;
    }

    public final s a() {
        return this.f34124b;
    }

    public final com.waze.shared_infra.l.a b() {
        return this.f34123a;
    }

    public final Float c() {
        return this.f34125c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return h.g.b.x.n(this.f34123a, rVar.f34123a) && this.f34124b == rVar.f34124b && h.g.b.x.n(this.f34125c, rVar.f34125c);
    }

    public final int hashCode() {
        return (((this.f34123a.hashCode() * 31) + this.f34124b.hashCode()) * 31) + this.f34125c.hashCode();
    }

    public final String toString() {
        return "ClosureReportData(segment=" + this.f34123a + ", useCase=" + this.f34124b + ", closureAzimuth=" + this.f34125c + ")";
    }
}
