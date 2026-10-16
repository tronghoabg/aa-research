package com.waze.reports_v2.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.e.c f34002a;

    /* renamed from: b, reason: collision with root package name */
    private final at f34003b;

    /* renamed from: c, reason: collision with root package name */
    private final long f34004c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.rtalerts.y f34005d;

    /* renamed from: e, reason: collision with root package name */
    private final i f34006e;

    public a(com.waze.sharedui.e.c cVar, at atVar, long j2, com.waze.rtalerts.y yVar, i iVar) {
        h.g.b.x.f(cVar, "reportLocation");
        h.g.b.x.f(atVar, "reportType");
        h.g.b.x.f(yVar, "reportUseCaseType");
        this.f34002a = cVar;
        this.f34003b = atVar;
        this.f34004c = j2;
        this.f34005d = yVar;
        this.f34006e = iVar;
    }

    public final long a() {
        return this.f34004c;
    }

    public final i b() {
        return this.f34006e;
    }

    public final at c() {
        return this.f34003b;
    }

    public final com.waze.rtalerts.y d() {
        return this.f34005d;
    }

    public final com.waze.sharedui.e.c e() {
        return this.f34002a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.g.b.x.n(this.f34002a, aVar.f34002a) && this.f34003b == aVar.f34003b && this.f34004c == aVar.f34004c && this.f34005d == aVar.f34005d && h.g.b.x.n(this.f34006e, aVar.f34006e);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f34002a.hashCode() * 31) + this.f34003b.hashCode()) * 31) + a.a.b(this.f34004c)) * 31) + this.f34005d.hashCode();
        i iVar = this.f34006e;
        return (iHashCode * 31) + (iVar == null ? 0 : iVar.hashCode());
    }

    public final String toString() {
        return "Request(reportLocation=" + this.f34002a + ", reportType=" + this.f34003b + ", reportTimestampEpochSeconds=" + this.f34004c + ", reportUseCaseType=" + this.f34005d + ", additionalData=" + this.f34006e + ")";
    }
}
