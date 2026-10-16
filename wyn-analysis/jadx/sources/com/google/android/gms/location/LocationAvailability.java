package com.google.android.gms.location;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f7.AbstractC2614a;
import java.util.Arrays;
import w7.C4381i;
import x7.w;

/* loaded from: classes4.dex */
public final class LocationAvailability extends AbstractC2614a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new C4381i(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f26721a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26722b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26723c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26724d;

    /* renamed from: e, reason: collision with root package name */
    public final w[] f26725e;

    public LocationAvailability(int i5, int i10, int i11, long j8, w[] wVarArr) {
        this.f26724d = i5 < 1000 ? 0 : 1000;
        this.f26721a = i10;
        this.f26722b = i11;
        this.f26723c = j8;
        this.f26725e = wVarArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f26721a == locationAvailability.f26721a && this.f26722b == locationAvailability.f26722b && this.f26723c == locationAvailability.f26723c && this.f26724d == locationAvailability.f26724d && Arrays.equals(this.f26725e, locationAvailability.f26725e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f26724d)});
    }

    public final String toString() {
        boolean z2 = this.f26724d < 1000;
        StringBuilder sb2 = new StringBuilder(String.valueOf(z2).length() + 22);
        sb2.append("LocationAvailability[");
        sb2.append(z2);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f26721a);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f26722b);
        AbstractC1304a.k0(parcel, 3, 8);
        parcel.writeLong(this.f26723c);
        AbstractC1304a.k0(parcel, 4, 4);
        int i10 = this.f26724d;
        parcel.writeInt(i10);
        AbstractC1304a.d0(parcel, 5, this.f26725e, i5);
        int i11 = i10 >= 1000 ? 0 : 1;
        AbstractC1304a.k0(parcel, 6, 4);
        parcel.writeInt(i11);
        AbstractC1304a.m0(iL0, parcel);
    }
}
