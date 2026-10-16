package com.google.android.gms.car.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rrn;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class StopDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StopDetails> CREATOR = new rrn(15);
    public final EnergyAtDistance a;
    public final ChargingStationDetails b;

    public StopDetails(EnergyAtDistance energyAtDistance, ChargingStationDetails chargingStationDetails) {
        this.a = energyAtDistance;
        this.b = chargingStationDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StopDetails) {
            StopDetails stopDetails = (StopDetails) obj;
            if (Objects.equals(this.a, stopDetails.a) && Objects.equals(this.b, stopDetails.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        ChargingStationDetails chargingStationDetails = this.b;
        return "StopDetails{expectedArrivalEnergy=" + String.valueOf(this.a) + ", chargingInfo=" + String.valueOf(chargingStationDetails) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        EnergyAtDistance energyAtDistance = this.a;
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 1, energyAtDistance, i);
        spu.E(parcel, 2, this.b, i);
        spu.m(parcel, iL);
    }
}
