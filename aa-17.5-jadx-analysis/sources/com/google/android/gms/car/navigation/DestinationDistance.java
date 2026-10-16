package com.google.android.gms.car.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rrn;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class DestinationDistance extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DestinationDistance> CREATOR = new rrn(4);
    public final Distance a;
    public final String b;
    public final long c;

    public DestinationDistance(Distance distance, String str, long j) {
        this.a = distance;
        this.b = str;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DestinationDistance destinationDistance = (DestinationDistance) obj;
            if (this.c == destinationDistance.c && Objects.equals(this.a, destinationDistance.a) && Objects.equals(this.b, destinationDistance.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Long.valueOf(this.c));
    }

    public final String toString() {
        return "DestinationDistance{distance=" + String.valueOf(this.a) + ", estimatedTimeOfArrival='" + this.b + "', timeToArrivalSeconds=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 1, this.a, i);
        spu.F(parcel, 2, this.b);
        spu.s(parcel, 3, this.c);
        spu.m(parcel, iL);
    }
}
