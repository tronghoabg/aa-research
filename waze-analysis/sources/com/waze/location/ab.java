package com.waze.location;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f25237a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25238b;

    /* renamed from: c, reason: collision with root package name */
    private final int f25239c;

    /* renamed from: d, reason: collision with root package name */
    private final int f25240d;

    /* renamed from: e, reason: collision with root package name */
    private final int f25241e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.sharedui.e.d f25242f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.sharedui.e.a f25243g;

    /* renamed from: h, reason: collision with root package name */
    private final Long f25244h;

    public ab(com.waze.shared_infra.h.c cVar, int i2, int i3, int i4, int i5, com.waze.sharedui.e.d dVar, com.waze.sharedui.e.a aVar, Long l2) {
        h.g.b.x.f(cVar, "coordinate");
        h.g.b.x.f(dVar, "provider");
        this.f25237a = cVar;
        this.f25238b = i2;
        this.f25239c = i3;
        this.f25240d = i4;
        this.f25241e = i5;
        this.f25242f = dVar;
        this.f25243g = aVar;
        this.f25244h = l2;
    }

    public final int a() {
        return this.f25241e;
    }

    public final int b() {
        return this.f25238b;
    }

    public final int c() {
        return this.f25239c;
    }

    public final int d() {
        return this.f25240d;
    }

    public final com.waze.shared_infra.h.c e() {
        return this.f25237a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return h.g.b.x.n(this.f25237a, abVar.f25237a) && this.f25238b == abVar.f25238b && this.f25239c == abVar.f25239c && this.f25240d == abVar.f25240d && this.f25241e == abVar.f25241e && this.f25242f == abVar.f25242f && h.g.b.x.n(this.f25243g, abVar.f25243g) && h.g.b.x.n(this.f25244h, abVar.f25244h);
    }

    public final com.waze.sharedui.e.a f() {
        return this.f25243g;
    }

    public final com.waze.sharedui.e.d g() {
        return this.f25242f;
    }

    public final Long h() {
        return this.f25244h;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.f25237a.hashCode() * 31) + this.f25238b) * 31) + this.f25239c) * 31) + this.f25240d) * 31) + this.f25241e) * 31) + this.f25242f.hashCode();
        com.waze.sharedui.e.a aVar = this.f25243g;
        int iHashCode2 = ((iHashCode * 31) + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Long l2 = this.f25244h;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "WazeProviderLocation(coordinate=" + this.f25237a + ", altitude=" + this.f25238b + ", speed=" + this.f25239c + ", steering=" + this.f25240d + ", accuracy=" + this.f25241e + ", provider=" + this.f25242f + ", matcherInfo=" + this.f25243g + ", lastUpdateTimeEpochSeconds=" + this.f25244h + ")";
    }
}
