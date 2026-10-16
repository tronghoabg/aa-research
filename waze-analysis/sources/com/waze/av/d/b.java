package com.waze.av.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.w;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new w(7);

    /* renamed from: a, reason: collision with root package name */
    private final Long f16045a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f16046b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16047c;

    public b(Long l2, Integer num, String str) {
        this.f16045a = l2;
        this.f16046b = num;
        this.f16047c = str;
    }

    public final Integer a() {
        return this.f16046b;
    }

    public final Long b() {
        return this.f16045a;
    }

    public final String c() {
        return this.f16047c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return x.n(this.f16045a, bVar.f16045a) && x.n(this.f16046b, bVar.f16046b) && x.n(this.f16047c, bVar.f16047c);
    }

    public final int hashCode() {
        Long l2 = this.f16045a;
        int iHashCode = l2 == null ? 0 : l2.hashCode();
        Integer num = this.f16046b;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        int i2 = iHashCode * 31;
        String str = this.f16047c;
        return ((i2 + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "BookingOfferPrice(units=" + this.f16045a + ", nanos=" + this.f16046b + ", currencyCode=" + this.f16047c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x.f(parcel, "dest");
        Long l2 = this.f16045a;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Integer num = this.f16046b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.f16047c);
    }
}
