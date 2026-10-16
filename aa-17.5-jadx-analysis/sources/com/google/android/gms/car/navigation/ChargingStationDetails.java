package com.google.android.gms.car.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rrn;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class ChargingStationDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ChargingStationDetails> CREATOR = new rrn(0);
    public final int a;
    public final int b;
    public final int c;

    public ChargingStationDetails(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ChargingStationDetails chargingStationDetails = (ChargingStationDetails) obj;
            if (this.a == chargingStationDetails.a && this.b == chargingStationDetails.b && this.c == chargingStationDetails.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        return "ChargingStationDetails{minDepartureEnergyWh=" + this.a + ", maxRatedPowerWatts=" + this.b + ", estimatedChargingTimeSeconds=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, i2);
        spu.r(parcel, 2, this.b);
        spu.r(parcel, 3, this.c);
        spu.m(parcel, iL);
    }
}
