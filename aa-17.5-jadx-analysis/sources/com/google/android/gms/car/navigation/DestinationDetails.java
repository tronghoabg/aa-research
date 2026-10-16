package com.google.android.gms.car.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rrn;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class DestinationDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DestinationDetails> CREATOR = new rrn(3);
    public final String a;
    public final ChargingStationDetails b;

    public DestinationDetails(String str, ChargingStationDetails chargingStationDetails) {
        this.a = str;
        this.b = chargingStationDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DestinationDetails destinationDetails = (DestinationDetails) obj;
            if (Objects.equals(this.a, destinationDetails.a) && Objects.equals(this.b, destinationDetails.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return "DestinationDetails{address=" + this.a + ", chargingStationDetails=" + String.valueOf(this.b) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.F(parcel, 1, this.a);
        spu.E(parcel, 2, this.b, i);
        spu.m(parcel, iL);
    }
}
