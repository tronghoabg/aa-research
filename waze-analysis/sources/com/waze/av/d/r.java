package com.waze.av.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.w;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new w(17);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16111a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16112b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f16113c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f16114d;

    public r(boolean z, boolean z2, Integer num, Integer num2) {
        this.f16111a = z;
        this.f16112b = z2;
        this.f16113c = num;
        this.f16114d = num2;
    }

    public final Integer a() {
        return this.f16114d;
    }

    public final Integer b() {
        return this.f16113c;
    }

    public final boolean c() {
        return this.f16111a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f16111a == rVar.f16111a && this.f16112b == rVar.f16112b && x.n(this.f16113c, rVar.f16113c) && x.n(this.f16114d, rVar.f16114d);
    }

    public final int hashCode() {
        Integer num = this.f16113c;
        int iHashCode = num == null ? 0 : num.hashCode();
        boolean z = this.f16112b;
        boolean z2 = this.f16111a;
        Integer num2 = this.f16114d;
        return (((((a.a.a(z2) * 31) + a.a.a(z)) * 31) + iHashCode) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "VenueParkingData(isPopular=" + this.f16111a + ", isBest=" + this.f16112b + ", walkingMinutes=" + this.f16113c + ", walkingDistanceMeters=" + this.f16114d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x.f(parcel, "dest");
        parcel.writeInt(this.f16111a ? 1 : 0);
        parcel.writeInt(this.f16112b ? 1 : 0);
        Integer num = this.f16113c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.f16114d;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }
}
