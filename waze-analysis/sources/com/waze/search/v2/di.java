package com.waze.search.v2;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class di implements Parcelable {
    public static final Parcelable.Creator<di> CREATOR = new com.google.android.gms.common.api.n(9);

    /* renamed from: a, reason: collision with root package name */
    private final String f36364a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36365b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36366c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.av.d.k f36367d;

    /* renamed from: e, reason: collision with root package name */
    private final q f36368e;

    /* renamed from: f, reason: collision with root package name */
    private final String f36369f;

    public di(String str, String str2, String str3, com.waze.av.d.k kVar, q qVar, String str4) {
        h.g.b.x.f(qVar, "mode");
        this.f36364a = str;
        this.f36365b = str2;
        this.f36366c = str3;
        this.f36367d = kVar;
        this.f36368e = qVar;
        this.f36369f = str4;
    }

    public final com.waze.av.d.k a() {
        return this.f36367d;
    }

    public final q b() {
        return this.f36368e;
    }

    public final String c() {
        return this.f36365b;
    }

    public final String d() {
        return this.f36366c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f36369f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di)) {
            return false;
        }
        di diVar = (di) obj;
        return h.g.b.x.n(this.f36364a, diVar.f36364a) && h.g.b.x.n(this.f36365b, diVar.f36365b) && h.g.b.x.n(this.f36366c, diVar.f36366c) && h.g.b.x.n(this.f36367d, diVar.f36367d) && this.f36368e == diVar.f36368e && h.g.b.x.n(this.f36369f, diVar.f36369f);
    }

    public final String f() {
        return this.f36364a;
    }

    public final int hashCode() {
        String str = this.f36364a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f36365b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i2 = iHashCode * 31;
        String str3 = this.f36366c;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31;
        com.waze.av.d.k kVar = this.f36367d;
        int iHashCode4 = (((iHashCode3 + (kVar == null ? 0 : kVar.hashCode())) * 31) + this.f36368e.hashCode()) * 31;
        String str4 = this.f36369f;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "SearchV2Params(searchTerm=" + this.f36364a + ", categoryGroupId=" + this.f36365b + ", categoryId=" + this.f36366c + ", parkingFor=" + this.f36367d + ", mode=" + this.f36368e + ", forcedSearchId=" + this.f36369f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        parcel.writeString(this.f36364a);
        parcel.writeString(this.f36365b);
        parcel.writeString(this.f36366c);
        parcel.writeParcelable(this.f36367d, i2);
        parcel.writeString(this.f36368e.name());
        parcel.writeString(this.f36369f);
    }
}
