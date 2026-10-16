package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;
import defpackage.sqy;

/* loaded from: classes2.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new sqy(16);
    final int a;

    @Deprecated
    public LocationAvailability(int i) {
        this.a = i;
    }

    public final boolean a() {
        return this.a < 1000;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof LocationAvailability) && this.a == ((LocationAvailability) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "LocationAvailability[" + a() + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 4, this.a);
        spu.n(parcel, 6, a());
        spu.m(parcel, iL);
    }
}
