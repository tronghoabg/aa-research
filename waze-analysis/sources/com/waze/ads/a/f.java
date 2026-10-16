package com.waze.ads.a;

import android.os.Parcel;
import android.os.Parcelable;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new com.google.android.gms.auth.a.b(13);

    /* renamed from: a, reason: collision with root package name */
    private final String f13921a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f13922b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13923c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f13924d;

    /* renamed from: e, reason: collision with root package name */
    private final String f13925e;

    /* renamed from: f, reason: collision with root package name */
    private final String f13926f;

    /* renamed from: g, reason: collision with root package name */
    private final String f13927g;

    /* renamed from: h, reason: collision with root package name */
    private final String f13928h;

    /* renamed from: i, reason: collision with root package name */
    private final String f13929i;

    /* renamed from: j, reason: collision with root package name */
    private final String f13930j;

    /* renamed from: k, reason: collision with root package name */
    private final String f13931k;

    /* renamed from: l, reason: collision with root package name */
    private final String f13932l;
    private final String m;
    private final Float n;
    private final e o;
    private final String p;

    public f(String str, com.waze.shared_infra.h.c cVar, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Float f2, e eVar, String str12) {
        x.f(str, "adId");
        x.f(cVar, "coordinate");
        x.f(str2, "placeId");
        this.f13921a = str;
        this.f13922b = cVar;
        this.f13923c = str2;
        this.f13924d = z;
        this.f13925e = str3;
        this.f13926f = str4;
        this.f13927g = str5;
        this.f13928h = str6;
        this.f13929i = str7;
        this.f13930j = str8;
        this.f13931k = str9;
        this.f13932l = str10;
        this.m = str11;
        this.n = f2;
        this.o = eVar;
        this.p = str12;
    }

    public final e a() {
        return this.o;
    }

    public final com.waze.shared_infra.h.c b() {
        return this.f13922b;
    }

    public final Float c() {
        return this.n;
    }

    public final String d() {
        return this.m;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f13921a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return x.n(this.f13921a, fVar.f13921a) && x.n(this.f13922b, fVar.f13922b) && x.n(this.f13923c, fVar.f13923c) && this.f13924d == fVar.f13924d && x.n(this.f13925e, fVar.f13925e) && x.n(this.f13926f, fVar.f13926f) && x.n(this.f13927g, fVar.f13927g) && x.n(this.f13928h, fVar.f13928h) && x.n(this.f13929i, fVar.f13929i) && x.n(this.f13930j, fVar.f13930j) && x.n(this.f13931k, fVar.f13931k) && x.n(this.f13932l, fVar.f13932l) && x.n(this.m, fVar.m) && x.n(this.n, fVar.n) && this.o == fVar.o && x.n(this.p, fVar.p);
    }

    public final String f() {
        return this.f13927g;
    }

    public final String g() {
        return this.f13926f;
    }

    public final String h() {
        return this.f13928h;
    }

    public final int hashCode() {
        int iHashCode = (((this.f13921a.hashCode() * 31) + this.f13922b.hashCode()) * 31) + this.f13923c.hashCode();
        String str = this.f13925e;
        int iA = ((((iHashCode * 31) + a.a.a(this.f13924d)) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f13926f;
        int iHashCode2 = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f13927g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f13928h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f13929i;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f13930j;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f13931k;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f13932l;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.m;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Float f2 = this.n;
        int iHashCode10 = (iHashCode9 + (f2 == null ? 0 : f2.hashCode())) * 31;
        e eVar = this.o;
        int iHashCode11 = (iHashCode10 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str10 = this.p;
        return iHashCode11 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String i() {
        return this.f13931k;
    }

    public final String j() {
        return this.f13932l;
    }

    public final String k() {
        return this.f13923c;
    }

    public final String l() {
        return this.f13925e;
    }

    public final String m() {
        return this.p;
    }

    public final String n() {
        return this.f13929i;
    }

    public final String o() {
        return this.f13930j;
    }

    public final boolean p() {
        return this.f13924d;
    }

    public final String toString() {
        return "MapAdData(adId=" + this.f13921a + ", coordinate=" + this.f13922b + ", placeId=" + this.f13923c + ", isTest=" + this.f13924d + ", placeName=" + this.f13925e + ", bannerHeadline=" + this.f13926f + ", bannerBody=" + this.f13927g + ", ctaMessage=" + this.f13928h + ", url=" + this.f13929i + ", visibleUrl=" + this.f13930j + ", imageUrl=" + this.f13931k + ", pinIconUrl=" + this.f13932l + ", aboutThisAdUrl=" + this.m + ", rating=" + this.n + ", openStatus=" + this.o + ", trackAddStopUrl=" + this.p + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x.f(parcel, "dest");
        parcel.writeString(this.f13921a);
        parcel.writeSerializable(this.f13922b);
        parcel.writeString(this.f13923c);
        parcel.writeInt(this.f13924d ? 1 : 0);
        parcel.writeString(this.f13925e);
        parcel.writeString(this.f13926f);
        parcel.writeString(this.f13927g);
        parcel.writeString(this.f13928h);
        parcel.writeString(this.f13929i);
        parcel.writeString(this.f13930j);
        parcel.writeString(this.f13931k);
        parcel.writeString(this.f13932l);
        parcel.writeString(this.m);
        Float f2 = this.n;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        e eVar = this.o;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(eVar.name());
        }
        parcel.writeString(this.p);
    }
}
