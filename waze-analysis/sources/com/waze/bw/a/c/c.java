package com.waze.bw.a.c;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f17631a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17632b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17633c;

    /* renamed from: d, reason: collision with root package name */
    private final String f17634d;

    /* renamed from: e, reason: collision with root package name */
    private final String f17635e;

    /* renamed from: f, reason: collision with root package name */
    private final String f17636f;

    /* renamed from: g, reason: collision with root package name */
    private final String f17637g;

    /* renamed from: h, reason: collision with root package name */
    private final o f17638h;

    public c(int i2, String str, String str2, String str3, String str4, String str5, String str6, o oVar) {
        this.f17631a = i2;
        this.f17632b = str;
        this.f17633c = str2;
        this.f17634d = str3;
        this.f17635e = str4;
        this.f17636f = str5;
        this.f17637g = str6;
        this.f17638h = oVar;
    }

    public final int a() {
        return this.f17631a;
    }

    public final o b() {
        return this.f17638h;
    }

    public final String c() {
        return this.f17633c;
    }

    public final String d() {
        return this.f17635e;
    }

    public final String e() {
        return this.f17636f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f17631a == cVar.f17631a && x.n(this.f17632b, cVar.f17632b) && x.n(this.f17633c, cVar.f17633c) && x.n(this.f17634d, cVar.f17634d) && x.n(this.f17635e, cVar.f17635e) && x.n(this.f17636f, cVar.f17636f) && x.n(this.f17637g, cVar.f17637g) && x.n(this.f17638h, cVar.f17638h);
    }

    public final String f() {
        return this.f17634d;
    }

    public final String g() {
        return this.f17637g;
    }

    public final int hashCode() {
        String str = this.f17632b;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i2 = this.f17631a;
        String str2 = this.f17633c;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i3 = (i2 * 31) + iHashCode;
        String str3 = this.f17634d;
        int iHashCode3 = ((((i3 * 31) + iHashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f17635e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f17636f;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f17637g;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        o oVar = this.f17638h;
        return iHashCode6 + (oVar != null ? oVar.hashCode() : 0);
    }

    public final String toString() {
        return "StartStateCarUIAddress(id=" + this.f17631a + ", country=" + this.f17632b + ", city=" + this.f17633c + ", streetName=" + this.f17634d + ", houseNumber=" + this.f17635e + ", state=" + this.f17636f + ", zip=" + this.f17637g + ", venueData=" + this.f17638h + ")";
    }
}
