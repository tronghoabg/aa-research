package com.waze.car_lib.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class at {

    /* renamed from: a, reason: collision with root package name */
    private final String f20589a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20590b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20591c;

    /* renamed from: d, reason: collision with root package name */
    private final String f20592d;

    /* renamed from: e, reason: collision with root package name */
    private final String f20593e;

    /* renamed from: f, reason: collision with root package name */
    private final String f20594f;

    /* renamed from: g, reason: collision with root package name */
    private final bd f20595g;

    public at(String str, String str2, String str3, String str4, String str5, String str6, bd bdVar) {
        this.f20589a = str;
        this.f20590b = str2;
        this.f20591c = str3;
        this.f20592d = str4;
        this.f20593e = str5;
        this.f20594f = str6;
        this.f20595g = bdVar;
    }

    public final bd a() {
        return this.f20595g;
    }

    public final String b() {
        return this.f20590b;
    }

    public final String c() {
        return this.f20592d;
    }

    public final String d() {
        return this.f20591c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at)) {
            return false;
        }
        at atVar = (at) obj;
        return h.g.b.x.n(this.f20589a, atVar.f20589a) && h.g.b.x.n(this.f20590b, atVar.f20590b) && h.g.b.x.n(this.f20591c, atVar.f20591c) && h.g.b.x.n(this.f20592d, atVar.f20592d) && h.g.b.x.n(this.f20593e, atVar.f20593e) && h.g.b.x.n(this.f20594f, atVar.f20594f) && h.g.b.x.n(this.f20595g, atVar.f20595g);
    }

    public final int hashCode() {
        String str = this.f20589a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f20590b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i2 = iHashCode * 31;
        String str3 = this.f20591c;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20592d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f20593e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f20594f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        bd bdVar = this.f20595g;
        return iHashCode6 + (bdVar != null ? bdVar.hashCode() : 0);
    }

    public final String toString() {
        return "Address(country=" + this.f20589a + ", city=" + this.f20590b + ", streetName=" + this.f20591c + ", houseNumber=" + this.f20592d + ", state=" + this.f20593e + ", zip=" + this.f20594f + ", venueData=" + this.f20595g + ")";
    }
}
