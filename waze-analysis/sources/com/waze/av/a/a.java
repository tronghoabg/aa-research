package com.waze.av.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.w;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new w(5);

    /* renamed from: a, reason: collision with root package name */
    private final String f15782a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15783b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15784c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15785d;

    /* renamed from: e, reason: collision with root package name */
    private final String f15786e;

    /* renamed from: f, reason: collision with root package name */
    private final String f15787f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15788g;

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2) {
        this(1 == (i2 & 1) ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? null : str7);
    }

    public final String a() {
        return this.f15783b;
    }

    public final String b() {
        return this.f15782a;
    }

    public final String c() {
        return this.f15785d;
    }

    public final String d() {
        return this.f15788g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f15786e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f15782a, aVar.f15782a) && x.n(this.f15783b, aVar.f15783b) && x.n(this.f15784c, aVar.f15784c) && x.n(this.f15785d, aVar.f15785d) && x.n(this.f15786e, aVar.f15786e) && x.n(this.f15787f, aVar.f15787f) && x.n(this.f15788g, aVar.f15788g);
    }

    public final String f() {
        return this.f15784c;
    }

    public final String g() {
        return this.f15787f;
    }

    public final int hashCode() {
        String str = this.f15782a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f15783b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i2 = iHashCode * 31;
        String str3 = this.f15784c;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f15785d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f15786e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f15787f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f15788g;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        return "Address(country=" + this.f15782a + ", city=" + this.f15783b + ", streetName=" + this.f15784c + ", houseNumber=" + this.f15785d + ", state=" + this.f15786e + ", zip=" + this.f15787f + ", serverFormatted=" + this.f15788g + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x.f(parcel, "dest");
        parcel.writeString(this.f15782a);
        parcel.writeString(this.f15783b);
        parcel.writeString(this.f15784c);
        parcel.writeString(this.f15785d);
        parcel.writeString(this.f15786e);
        parcel.writeString(this.f15787f);
        parcel.writeString(this.f15788g);
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f15782a = str;
        this.f15783b = str2;
        this.f15784c = str3;
        this.f15785d = str4;
        this.f15786e = str5;
        this.f15787f = str6;
        this.f15788g = str7;
    }

    public a() {
        this(null, null, null, null, null, null, null, 127);
    }
}
