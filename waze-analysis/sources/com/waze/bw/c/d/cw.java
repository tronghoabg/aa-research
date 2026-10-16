package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cw {

    /* renamed from: a, reason: collision with root package name */
    private final cv f18074a;

    /* renamed from: b, reason: collision with root package name */
    private final dd f18075b;

    /* renamed from: c, reason: collision with root package name */
    private final di f18076c;

    public cw(cv cvVar, dd ddVar, di diVar) {
        h.g.b.x.f(cvVar, "destination");
        h.g.b.x.f(ddVar, "driveType");
        this.f18074a = cvVar;
        this.f18075b = ddVar;
        this.f18076c = diVar;
    }

    public final cv a() {
        return this.f18074a;
    }

    public final dd b() {
        return this.f18075b;
    }

    public final di c() {
        return this.f18076c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw)) {
            return false;
        }
        cw cwVar = (cw) obj;
        return h.g.b.x.n(this.f18074a, cwVar.f18074a) && h.g.b.x.n(this.f18075b, cwVar.f18075b) && this.f18076c == cwVar.f18076c;
    }

    public final int hashCode() {
        int iHashCode = (this.f18074a.hashCode() * 31) + this.f18075b.hashCode();
        di diVar = this.f18076c;
        return (iHashCode * 31) + (diVar == null ? 0 : diVar.hashCode());
    }

    public final String toString() {
        return "WazeUIDrive(destination=" + this.f18074a + ", driveType=" + this.f18075b + ", trafficInfo=" + this.f18076c + ")";
    }
}
