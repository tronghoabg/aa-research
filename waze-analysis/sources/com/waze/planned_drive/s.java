package com.waze.planned_drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.waze.navigate.AddressItem;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new com.google.android.gms.common.api.n(4);

    /* renamed from: a, reason: collision with root package name */
    private final AddressItem f33359a;

    /* renamed from: b, reason: collision with root package name */
    private final AddressItem f33360b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f33361c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f33362d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f33363e;

    /* renamed from: f, reason: collision with root package name */
    private final bj f33364f;

    public s(AddressItem addressItem, AddressItem addressItem2, boolean z, boolean z2, boolean z3, bj bjVar) {
        h.g.b.x.f(bjVar, "caller");
        this.f33359a = addressItem;
        this.f33360b = addressItem2;
        this.f33361c = z;
        this.f33362d = z2;
        this.f33363e = z3;
        this.f33364f = bjVar;
    }

    public final AddressItem a() {
        return this.f33360b;
    }

    public final AddressItem b() {
        return this.f33359a;
    }

    public final bj c() {
        return this.f33364f;
    }

    public final boolean d() {
        return this.f33361c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f33363e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return h.g.b.x.n(this.f33359a, sVar.f33359a) && h.g.b.x.n(this.f33360b, sVar.f33360b) && this.f33361c == sVar.f33361c && this.f33362d == sVar.f33362d && this.f33363e == sVar.f33363e && this.f33364f == sVar.f33364f;
    }

    public final boolean f() {
        return this.f33362d;
    }

    public final int hashCode() {
        AddressItem addressItem = this.f33359a;
        int iHashCode = addressItem == null ? 0 : addressItem.hashCode();
        AddressItem addressItem2 = this.f33360b;
        return (((((((((iHashCode * 31) + (addressItem2 != null ? addressItem2.hashCode() : 0)) * 31) + a.a.a(this.f33361c)) * 31) + a.a.a(this.f33362d)) * 31) + a.a.a(this.f33363e)) * 31) + this.f33364f.hashCode();
    }

    public final String toString() {
        return "PlannedDriveFlowInput(origin=" + this.f33359a + ", destination=" + this.f33360b + ", selectDestination=" + this.f33361c + ", isEdit=" + this.f33362d + ", shouldStopNavigationOnSave=" + this.f33363e + ", caller=" + this.f33364f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        parcel.writeParcelable(this.f33359a, i2);
        parcel.writeParcelable(this.f33360b, i2);
        parcel.writeInt(this.f33361c ? 1 : 0);
        parcel.writeInt(this.f33362d ? 1 : 0);
        parcel.writeInt(this.f33363e ? 1 : 0);
        parcel.writeString(this.f33364f.name());
    }
}
