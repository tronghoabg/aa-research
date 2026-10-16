package com.waze.navigate.location_preview;

import android.os.Parcel;
import android.os.Parcelable;
import com.waze.navigate.AddressItem;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class az implements Parcelable {
    public static final Parcelable.Creator<az> CREATOR = new com.google.android.gms.common.w(20);

    /* renamed from: a, reason: collision with root package name */
    private final AddressItem f31594a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f31595b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31596c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f31597d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f31598e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f31599f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f31600g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f31601h;

    /* renamed from: i, reason: collision with root package name */
    private final AddressItem f31602i;

    /* renamed from: j, reason: collision with root package name */
    private final String f31603j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.modules.navigation.ah f31604k;

    /* renamed from: l, reason: collision with root package name */
    private final String f31605l;
    private final com.waze.ads.a.f m;
    private final boolean n;
    private final boolean o;

    public az(AddressItem addressItem, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Integer num, boolean z6, AddressItem addressItem2, String str, com.waze.modules.navigation.ah ahVar, String str2, com.waze.ads.a.f fVar, boolean z7, boolean z8) {
        h.g.b.x.f(addressItem, "ai");
        this.f31594a = addressItem;
        this.f31595b = z;
        this.f31596c = z2;
        this.f31597d = z3;
        this.f31598e = z4;
        this.f31599f = z5;
        this.f31600g = num;
        this.f31601h = z6;
        this.f31602i = addressItem2;
        this.f31603j = str;
        this.f31604k = ahVar;
        this.f31605l = str2;
        this.m = fVar;
        this.n = z7;
        this.o = z8;
    }

    public final com.waze.ads.a.f a() {
        return this.m;
    }

    public final com.waze.modules.navigation.ah b() {
        return this.f31604k;
    }

    public final AddressItem c() {
        return this.f31594a;
    }

    public final AddressItem d() {
        return this.f31602i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.f31600g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az)) {
            return false;
        }
        az azVar = (az) obj;
        return h.g.b.x.n(this.f31594a, azVar.f31594a) && this.f31595b == azVar.f31595b && this.f31596c == azVar.f31596c && this.f31597d == azVar.f31597d && this.f31598e == azVar.f31598e && this.f31599f == azVar.f31599f && h.g.b.x.n(this.f31600g, azVar.f31600g) && this.f31601h == azVar.f31601h && h.g.b.x.n(this.f31602i, azVar.f31602i) && h.g.b.x.n(this.f31603j, azVar.f31603j) && this.f31604k == azVar.f31604k && h.g.b.x.n(this.f31605l, azVar.f31605l) && h.g.b.x.n(this.m, azVar.m) && this.n == azVar.n && this.o == azVar.o;
    }

    public final boolean f() {
        return this.n;
    }

    public final boolean g() {
        return this.f31597d;
    }

    public final boolean h() {
        return this.f31598e;
    }

    public final int hashCode() {
        int iHashCode = this.f31594a.hashCode() * 31;
        Integer num = this.f31600g;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        boolean z = this.f31599f;
        boolean z2 = this.f31598e;
        int iA = (((((((((((((iHashCode + a.a.a(this.f31595b)) * 31) + a.a.a(this.f31596c)) * 31) + a.a.a(this.f31597d)) * 31) + a.a.a(z2)) * 31) + a.a.a(z)) * 31) + iHashCode2) * 31) + a.a.a(this.f31601h)) * 31;
        AddressItem addressItem = this.f31602i;
        int iHashCode3 = (iA + (addressItem == null ? 0 : addressItem.hashCode())) * 31;
        String str = this.f31603j;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        com.waze.modules.navigation.ah ahVar = this.f31604k;
        int iHashCode5 = (iHashCode4 + (ahVar == null ? 0 : ahVar.hashCode())) * 31;
        String str2 = this.f31605l;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        com.waze.ads.a.f fVar = this.m;
        return ((((iHashCode6 + (fVar != null ? fVar.hashCode() : 0)) * 31) + a.a.a(this.n)) * 31) + a.a.a(this.o);
    }

    public final boolean i() {
        return this.f31599f;
    }

    public final boolean j() {
        return this.f31601h;
    }

    public final boolean k() {
        return this.o;
    }

    public final String toString() {
        return "LocationPreviewParams(ai=" + this.f31594a + ", clearContext=" + this.f31595b + ", edit=" + this.f31596c + ", loadVenue=" + this.f31597d + ", openSetLocation=" + this.f31598e + ", parkingMode=" + this.f31599f + ", walkingDistanceMeters=" + this.f31600g + ", isParkingPopular=" + this.f31601h + ", parkingAddressItem=" + this.f31602i + ", parkingContext=" + this.f31603j + ", caller=" + this.f31604k + ", callerName=" + this.f31605l + ", mapAdData=" + this.m + ", addStopMode=" + this.n + ", isSingleSearchResult=" + this.o + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        parcel.writeParcelable(this.f31594a, i2);
        parcel.writeInt(this.f31595b ? 1 : 0);
        parcel.writeInt(this.f31596c ? 1 : 0);
        parcel.writeInt(this.f31597d ? 1 : 0);
        parcel.writeInt(this.f31598e ? 1 : 0);
        parcel.writeInt(this.f31599f ? 1 : 0);
        Integer num = this.f31600g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.f31601h ? 1 : 0);
        parcel.writeParcelable(this.f31602i, i2);
        parcel.writeString(this.f31603j);
        com.waze.modules.navigation.ah ahVar = this.f31604k;
        if (ahVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(ahVar.name());
        }
        parcel.writeString(this.f31605l);
        parcel.writeParcelable(this.m, i2);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
    }
}
