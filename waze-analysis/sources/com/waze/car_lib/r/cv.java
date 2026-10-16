package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cv {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.b.a.b f21235a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f21236b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f21237c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f21238d;

    public /* synthetic */ cv(com.waze.car_lib.b.a.b bVar, boolean z, boolean z2, boolean z3, int i2) {
        h.g.b.x.f(bVar, "reportItem");
        this.f21235a = bVar;
        this.f21236b = ((i2 & 2) == 0) & z;
        this.f21237c = ((i2 & 4) == 0) & z2;
        this.f21238d = ((i2 & 8) == 0) & z3;
    }

    public final com.waze.car_lib.b.a.b a() {
        return this.f21235a;
    }

    public final boolean b() {
        return this.f21237c;
    }

    public final boolean c() {
        return this.f21238d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv)) {
            return false;
        }
        cv cvVar = (cv) obj;
        return h.g.b.x.n(this.f21235a, cvVar.f21235a) && this.f21236b == cvVar.f21236b && this.f21237c == cvVar.f21237c && this.f21238d == cvVar.f21238d;
    }

    public final int hashCode() {
        int iHashCode = this.f21235a.hashCode() * 31;
        boolean z = this.f21238d;
        return ((((iHashCode + a.a.a(this.f21236b)) * 31) + a.a.a(this.f21237c)) * 31) + a.a.a(z);
    }

    public final String toString() {
        return "UIState(reportItem=" + this.f21235a + ", didEncounterError=" + this.f21236b + ", didAgentClosedConversation=" + this.f21237c + ", didAgentReportAnything=" + this.f21238d + ")";
    }
}
