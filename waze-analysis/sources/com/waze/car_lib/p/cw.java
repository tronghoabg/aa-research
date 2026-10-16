package com.waze.car_lib.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cw {

    /* renamed from: a, reason: collision with root package name */
    private final String f20751a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20752b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20753c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f20754d;

    /* renamed from: e, reason: collision with root package name */
    private final cv f20755e;

    public cw(String str, String str2, String str3, boolean z, cv cvVar) {
        h.g.b.x.f(str, "searchHint");
        h.g.b.x.f(str3, "infoButton");
        h.g.b.x.f(cvVar, "placesState");
        this.f20751a = str;
        this.f20752b = str2;
        this.f20753c = str3;
        this.f20754d = z;
        this.f20755e = cvVar;
    }

    public static /* synthetic */ cw f(cw cwVar, String str, boolean z, cv cvVar, int i2) {
        String str2 = (i2 & 1) != 0 ? cwVar.f20751a : null;
        if ((i2 & 2) != 0) {
            str = cwVar.f20752b;
        }
        String str3 = str;
        String str4 = (i2 & 4) != 0 ? cwVar.f20753c : null;
        if ((i2 & 8) != 0) {
            z = cwVar.f20754d;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            cvVar = cwVar.f20755e;
        }
        cv cvVar2 = cvVar;
        h.g.b.x.f(str2, "searchHint");
        h.g.b.x.f(str4, "infoButton");
        h.g.b.x.f(cvVar2, "placesState");
        return new cw(str2, str3, str4, z2, cvVar2);
    }

    public final cv a() {
        return this.f20755e;
    }

    public final String b() {
        return this.f20753c;
    }

    public final String c() {
        return this.f20751a;
    }

    public final String d() {
        return this.f20752b;
    }

    public final boolean e() {
        return this.f20754d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw)) {
            return false;
        }
        cw cwVar = (cw) obj;
        return h.g.b.x.n(this.f20751a, cwVar.f20751a) && h.g.b.x.n(this.f20752b, cwVar.f20752b) && h.g.b.x.n(this.f20753c, cwVar.f20753c) && this.f20754d == cwVar.f20754d && h.g.b.x.n(this.f20755e, cwVar.f20755e);
    }

    public final int hashCode() {
        int iHashCode = this.f20751a.hashCode() * 31;
        String str = this.f20752b;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f20753c.hashCode()) * 31) + a.a.a(this.f20754d)) * 31) + this.f20755e.hashCode();
    }

    public final String toString() {
        return "UiState(searchHint=" + this.f20751a + ", searchTerm=" + this.f20752b + ", infoButton=" + this.f20753c + ", showInfoButton=" + this.f20754d + ", placesState=" + this.f20755e + ")";
    }
}
