package com.waze.av.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.w;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new w(8);

    /* renamed from: a, reason: collision with root package name */
    private final b f16048a;

    /* renamed from: b, reason: collision with root package name */
    private final b f16049b;

    /* renamed from: c, reason: collision with root package name */
    private final long f16050c;

    public c(b bVar, b bVar2, long j2) {
        x.f(bVar, "standardRate");
        this.f16048a = bVar;
        this.f16049b = bVar2;
        this.f16050c = j2;
    }

    public final long a() {
        return this.f16050c;
    }

    public final b b() {
        return this.f16049b;
    }

    public final b c() {
        return this.f16048a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return x.n(this.f16048a, cVar.f16048a) && x.n(this.f16049b, cVar.f16049b) && this.f16050c == cVar.f16050c;
    }

    public final int hashCode() {
        int iHashCode = this.f16048a.hashCode() * 31;
        b bVar = this.f16049b;
        return ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + a.a.b(this.f16050c);
    }

    public final String toString() {
        return "BookingOfferRate(standardRate=" + this.f16048a + ", discountedRate=" + this.f16049b + ", durationSeconds=" + this.f16050c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x.f(parcel, "dest");
        this.f16048a.writeToParcel(parcel, i2);
        b bVar = this.f16049b;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i2);
        }
        parcel.writeLong(this.f16050c);
    }
}
