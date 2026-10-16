package com.google.android.gms.car.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rrn;
import defpackage.spu;
import defpackage.yfq;
import defpackage.yls;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes2.dex */
public final class VehicleEnergyForecast extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VehicleEnergyForecast> CREATOR = new rrn(17);
    public final EnergyAtDistance a;
    public final EnergyAtDistance b;
    public final int c;
    public final ChargingStationDetails d;
    private final List e;
    private final List f;

    public VehicleEnergyForecast(EnergyAtDistance energyAtDistance, EnergyAtDistance energyAtDistance2, int i, ChargingStationDetails chargingStationDetails, List list, List list2) {
        yfq yfqVarO;
        this.a = energyAtDistance;
        this.b = energyAtDistance2;
        this.c = i;
        this.d = chargingStationDetails;
        if (list == null) {
            int i2 = yfq.d;
            yfqVarO = yls.a;
        } else {
            yfqVarO = yfq.o(list);
        }
        this.e = yfqVarO;
        this.f = list2 == null ? yls.a : yfq.o(list2);
    }

    public final yfq a() {
        return yfq.o(this.f);
    }

    public final yfq b() {
        return yfq.o(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VehicleEnergyForecast) {
            VehicleEnergyForecast vehicleEnergyForecast = (VehicleEnergyForecast) obj;
            if (this.c == vehicleEnergyForecast.c && Objects.equals(this.a, vehicleEnergyForecast.a) && Objects.equals(this.b, vehicleEnergyForecast.b) && Objects.equals(this.d, vehicleEnergyForecast.d) && Objects.equals(this.e, vehicleEnergyForecast.e) && Objects.equals(this.f, vehicleEnergyForecast.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), this.d, this.e, this.f);
    }

    public final String toString() {
        List list = this.f;
        List list2 = this.e;
        ChargingStationDetails chargingStationDetails = this.d;
        EnergyAtDistance energyAtDistance = this.b;
        return "VehicleEnergyForecast{energyAtNextStop=" + String.valueOf(this.a) + ", distanceToEmpty=" + String.valueOf(energyAtDistance) + ", forecastQuality=" + this.c + ", nextChargingStop=" + String.valueOf(chargingStationDetails) + ", stopDetails=" + String.valueOf(list2) + ", dataAuthorizations=" + String.valueOf(list) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        EnergyAtDistance energyAtDistance = this.a;
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 1, energyAtDistance, i);
        spu.E(parcel, 2, this.b, i);
        spu.r(parcel, 3, this.c);
        spu.E(parcel, 4, this.d, i);
        spu.J(parcel, 5, b());
        spu.J(parcel, 6, a());
        spu.m(parcel, iL);
    }
}
