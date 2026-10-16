package com.waze.reports_v2.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.e.c f34055a;

    /* renamed from: b, reason: collision with root package name */
    private final af f34056b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34057c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f34058d;

    /* renamed from: e, reason: collision with root package name */
    private final ai f34059e;

    public aj(com.waze.sharedui.e.c cVar, af afVar, String str, boolean z, ai aiVar) {
        h.g.b.x.f(cVar, "reportLocation");
        h.g.b.x.f(afVar, "issue");
        h.g.b.x.f(aiVar, "manner");
        this.f34055a = cVar;
        this.f34056b = afVar;
        this.f34057c = str;
        this.f34058d = z;
        this.f34059e = aiVar;
    }

    public final af a() {
        return this.f34056b;
    }

    public final ai b() {
        return this.f34059e;
    }

    public final com.waze.sharedui.e.c c() {
        return this.f34055a;
    }

    public final String d() {
        return this.f34057c;
    }

    public final boolean e() {
        return this.f34058d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj)) {
            return false;
        }
        aj ajVar = (aj) obj;
        return h.g.b.x.n(this.f34055a, ajVar.f34055a) && this.f34056b == ajVar.f34056b && h.g.b.x.n(this.f34057c, ajVar.f34057c) && this.f34058d == ajVar.f34058d && this.f34059e == ajVar.f34059e;
    }

    public final int hashCode() {
        int iHashCode = (this.f34055a.hashCode() * 31) + this.f34056b.hashCode();
        String str = this.f34057c;
        return (((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + a.a.a(this.f34058d)) * 31) + this.f34059e.hashCode();
    }

    public final String toString() {
        return "Request(reportLocation=" + this.f34055a + ", issue=" + this.f34056b + ", description=" + this.f34057c + ", didUserSeeDisclaimer=" + this.f34058d + ", manner=" + this.f34059e + ")";
    }
}
