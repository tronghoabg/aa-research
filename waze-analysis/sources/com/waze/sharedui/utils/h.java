package com.waze.sharedui.utils;

import android.os.Parcel;
import android.os.Parcelable;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends m {
    public static final Parcelable.Creator<h> CREATOR = new com.google.android.gms.common.api.n(10);

    /* renamed from: b, reason: collision with root package name */
    private String f39098b;

    /* renamed from: c, reason: collision with root package name */
    private String f39099c;

    /* renamed from: d, reason: collision with root package name */
    private String f39100d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f39101e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f39102f;

    /* renamed from: g, reason: collision with root package name */
    private String f39103g;

    /* renamed from: h, reason: collision with root package name */
    private String f39104h;

    public h(String str, String str2, String str3, Integer num, Integer num2, String str4, String str5) {
        this.f39098b = str;
        this.f39099c = str2;
        this.f39100d = str3;
        this.f39101e = num;
        this.f39102f = num2;
        this.f39103g = str4;
        this.f39104h = str5;
    }

    public final Integer a() {
        return this.f39101e;
    }

    public final Integer b() {
        return this.f39102f;
    }

    public final String c() {
        return this.f39100d;
    }

    public final String d() {
        return this.f39098b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f39104h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return x.n(this.f39098b, hVar.f39098b) && x.n(this.f39099c, hVar.f39099c) && x.n(this.f39100d, hVar.f39100d) && x.n(this.f39101e, hVar.f39101e) && x.n(this.f39102f, hVar.f39102f) && x.n(this.f39103g, hVar.f39103g) && x.n(this.f39104h, hVar.f39104h);
    }

    public final String f() {
        return this.f39099c;
    }

    public final String g() {
        return this.f39103g;
    }

    public final void h(String str) {
        this.f39100d = str;
    }

    public final int hashCode() {
        String str = this.f39098b;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f39099c;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i2 = iHashCode * 31;
        String str3 = this.f39100d;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f39101e;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f39102f;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.f39103g;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f39104h;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void i(String str) {
        this.f39098b = str;
    }

    public final void j(String str) {
        this.f39104h = str;
    }

    public final void k(String str) {
        this.f39099c = str;
    }

    public final void l(String str) {
        this.f39103g = str;
    }

    public final void m(Integer num) {
        this.f39101e = num;
    }

    public final void n(Integer num) {
        this.f39102f = num;
    }

    public final String toString() {
        return "AddPlaceFlowActivityAction(name=" + this.f39098b + ", street=" + this.f39099c + ", city=" + this.f39100d + ", x=" + this.f39101e + ", y=" + this.f39102f + ", venueId=" + this.f39103g + ", questionId=" + this.f39104h + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x.f(parcel, "dest");
        parcel.writeString(this.f39098b);
        parcel.writeString(this.f39099c);
        parcel.writeString(this.f39100d);
        Integer num = this.f39101e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.f39102f;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.f39103g);
        parcel.writeString(this.f39104h);
    }

    public h() {
        this(null, null, null, null, null, null, null);
    }
}
