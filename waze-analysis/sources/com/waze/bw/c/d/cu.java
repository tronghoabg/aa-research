package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cu {

    /* renamed from: a, reason: collision with root package name */
    private final int f18064a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18065b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18066c;

    /* renamed from: d, reason: collision with root package name */
    private final String f18067d;

    /* renamed from: e, reason: collision with root package name */
    private final String f18068e;

    /* renamed from: f, reason: collision with root package name */
    private final String f18069f;

    /* renamed from: g, reason: collision with root package name */
    private final String f18070g;

    /* renamed from: h, reason: collision with root package name */
    private final dj f18071h;

    public cu(int i2, String str, String str2, String str3, String str4, String str5, String str6, dj djVar) {
        this.f18064a = i2;
        this.f18065b = str;
        this.f18066c = str2;
        this.f18067d = str3;
        this.f18068e = str4;
        this.f18069f = str5;
        this.f18070g = str6;
        this.f18071h = djVar;
    }

    public final int a() {
        return this.f18064a;
    }

    public final dj b() {
        return this.f18071h;
    }

    public final String c() {
        return this.f18066c;
    }

    public final String d() {
        return this.f18068e;
    }

    public final String e() {
        return this.f18069f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu)) {
            return false;
        }
        cu cuVar = (cu) obj;
        return this.f18064a == cuVar.f18064a && h.g.b.x.n(this.f18065b, cuVar.f18065b) && h.g.b.x.n(this.f18066c, cuVar.f18066c) && h.g.b.x.n(this.f18067d, cuVar.f18067d) && h.g.b.x.n(this.f18068e, cuVar.f18068e) && h.g.b.x.n(this.f18069f, cuVar.f18069f) && h.g.b.x.n(this.f18070g, cuVar.f18070g) && h.g.b.x.n(this.f18071h, cuVar.f18071h);
    }

    public final String f() {
        return this.f18067d;
    }

    public final String g() {
        return this.f18070g;
    }

    public final int hashCode() {
        String str = this.f18065b;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i2 = this.f18064a;
        String str2 = this.f18066c;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i3 = (i2 * 31) + iHashCode;
        String str3 = this.f18067d;
        int iHashCode3 = ((((i3 * 31) + iHashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18068e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f18069f;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f18070g;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        dj djVar = this.f18071h;
        return iHashCode6 + (djVar != null ? djVar.hashCode() : 0);
    }

    public final String toString() {
        return "WazeUIAddress(id=" + this.f18064a + ", country=" + this.f18065b + ", city=" + this.f18066c + ", streetName=" + this.f18067d + ", houseNumber=" + this.f18068e + ", state=" + this.f18069f + ", zip=" + this.f18070g + ", venueData=" + this.f18071h + ")";
    }
}
