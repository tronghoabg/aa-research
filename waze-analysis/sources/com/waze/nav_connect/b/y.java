package com.waze.nav_connect.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f30844a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30845b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30846c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.nav_connect.a.d f30847d;

    /* renamed from: e, reason: collision with root package name */
    private final String f30848e;

    /* renamed from: f, reason: collision with root package name */
    private final String f30849f;

    /* renamed from: g, reason: collision with root package name */
    private final z f30850g;

    public y(boolean z, String str, String str2, com.waze.nav_connect.a.d dVar, String str3, String str4, z zVar) {
        h.g.b.x.f(str, "thirdPartyAppName");
        h.g.b.x.f(str2, "privacyPolicyUrl");
        h.g.b.x.f(str3, "learnMoreUrl");
        h.g.b.x.f(str4, "consentVersion");
        h.g.b.x.f(zVar, "statsExtras");
        this.f30844a = z;
        this.f30845b = str;
        this.f30846c = str2;
        this.f30847d = dVar;
        this.f30848e = str3;
        this.f30849f = str4;
        this.f30850g = zVar;
    }

    public final com.waze.nav_connect.a.d a() {
        return this.f30847d;
    }

    public final z b() {
        return this.f30850g;
    }

    public final String c() {
        return this.f30849f;
    }

    public final String d() {
        return this.f30848e;
    }

    public final String e() {
        return this.f30846c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f30844a == yVar.f30844a && h.g.b.x.n(this.f30845b, yVar.f30845b) && h.g.b.x.n(this.f30846c, yVar.f30846c) && h.g.b.x.n(this.f30847d, yVar.f30847d) && h.g.b.x.n(this.f30848e, yVar.f30848e) && h.g.b.x.n(this.f30849f, yVar.f30849f) && h.g.b.x.n(this.f30850g, yVar.f30850g);
    }

    public final String f() {
        return this.f30845b;
    }

    public final boolean g() {
        return this.f30844a;
    }

    public final int hashCode() {
        int iA = (((a.a.a(this.f30844a) * 31) + this.f30845b.hashCode()) * 31) + this.f30846c.hashCode();
        com.waze.nav_connect.a.d dVar = this.f30847d;
        return (((((((iA * 31) + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.f30848e.hashCode()) * 31) + this.f30849f.hashCode()) * 31) + this.f30850g.hashCode();
    }

    public final String toString() {
        return "State(isInitial=" + this.f30844a + ", thirdPartyAppName=" + this.f30845b + ", privacyPolicyUrl=" + this.f30846c + ", isv=" + this.f30847d + ", learnMoreUrl=" + this.f30848e + ", consentVersion=" + this.f30849f + ", statsExtras=" + this.f30850g + ")";
    }
}
