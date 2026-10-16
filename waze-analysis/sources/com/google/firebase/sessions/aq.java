package com.google.firebase.sessions;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aq {

    /* renamed from: a, reason: collision with root package name */
    private final String f10831a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10832b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10833c;

    /* renamed from: d, reason: collision with root package name */
    private final long f10834d;

    /* renamed from: e, reason: collision with root package name */
    private final k f10835e;

    /* renamed from: f, reason: collision with root package name */
    private final String f10836f;

    /* renamed from: g, reason: collision with root package name */
    private final String f10837g;

    public aq(String str, String str2, int i2, long j2, k kVar, String str3, String str4) {
        h.g.b.x.f(str, "sessionId");
        h.g.b.x.f(str2, "firstSessionId");
        h.g.b.x.f(kVar, "dataCollectionStatus");
        h.g.b.x.f(str3, "firebaseInstallationId");
        h.g.b.x.f(str4, "firebaseAuthenticationToken");
        this.f10831a = str;
        this.f10832b = str2;
        this.f10833c = i2;
        this.f10834d = j2;
        this.f10835e = kVar;
        this.f10836f = str3;
        this.f10837g = str4;
    }

    public final int a() {
        return this.f10833c;
    }

    public final long b() {
        return this.f10834d;
    }

    public final k c() {
        return this.f10835e;
    }

    public final String d() {
        return this.f10837g;
    }

    public final String e() {
        return this.f10836f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq)) {
            return false;
        }
        aq aqVar = (aq) obj;
        return h.g.b.x.n(this.f10831a, aqVar.f10831a) && h.g.b.x.n(this.f10832b, aqVar.f10832b) && this.f10833c == aqVar.f10833c && this.f10834d == aqVar.f10834d && h.g.b.x.n(this.f10835e, aqVar.f10835e) && h.g.b.x.n(this.f10836f, aqVar.f10836f) && h.g.b.x.n(this.f10837g, aqVar.f10837g);
    }

    public final String f() {
        return this.f10832b;
    }

    public final String g() {
        return this.f10831a;
    }

    public final int hashCode() {
        int iHashCode = (this.f10831a.hashCode() * 31) + this.f10832b.hashCode();
        k kVar = this.f10835e;
        return (((((((((iHashCode * 31) + this.f10833c) * 31) + a.a.b(this.f10834d)) * 31) + kVar.hashCode()) * 31) + this.f10836f.hashCode()) * 31) + this.f10837g.hashCode();
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f10831a + ", firstSessionId=" + this.f10832b + ", sessionIndex=" + this.f10833c + ", eventTimestampUs=" + this.f10834d + ", dataCollectionStatus=" + this.f10835e + ", firebaseInstallationId=" + this.f10836f + ", firebaseAuthenticationToken=" + this.f10837g + ")";
    }
}
