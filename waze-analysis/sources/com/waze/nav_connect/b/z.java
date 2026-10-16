package com.waze.nav_connect.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private final String f30851a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30852b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30853c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.nav_connect.a.a f30854d;

    public z(String str, String str2, boolean z, com.waze.nav_connect.a.a aVar) {
        h.g.b.x.f(str, "thirdPartyAppId");
        h.g.b.x.f(str2, "externalTripToken");
        this.f30851a = str;
        this.f30852b = str2;
        this.f30853c = z;
        this.f30854d = aVar;
    }

    public final com.waze.nav_connect.a.a a() {
        return this.f30854d;
    }

    public final String b() {
        return this.f30852b;
    }

    public final String c() {
        return this.f30851a;
    }

    public final boolean d() {
        return this.f30853c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return h.g.b.x.n(this.f30851a, zVar.f30851a) && h.g.b.x.n(this.f30852b, zVar.f30852b) && this.f30853c == zVar.f30853c && this.f30854d == zVar.f30854d;
    }

    public final int hashCode() {
        int iHashCode = (this.f30851a.hashCode() * 31) + this.f30852b.hashCode();
        com.waze.nav_connect.a.a aVar = this.f30854d;
        return (((iHashCode * 31) + a.a.a(this.f30853c)) * 31) + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "StatsExtras(thirdPartyAppId=" + this.f30851a + ", externalTripToken=" + this.f30852b + ", existingConsent=" + this.f30853c + ", consentInvalidationReason=" + this.f30854d + ")";
    }

    public /* synthetic */ z(String str, String str2, boolean z) {
        this(str, str2, z, null);
    }
}
