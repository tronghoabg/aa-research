package com.google.android.gms.car.navigation;

/* JADX INFO: loaded from: classes2.dex */
public final class VehicleEnergyForecast extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.navigation.VehicleEnergyForecast> CREATOR = new defpackage.rsh(17);
    public final com.google.android.gms.car.navigation.EnergyAtDistance a;
    public final com.google.android.gms.car.navigation.EnergyAtDistance b;
    public final int c;
    public final com.google.android.gms.car.navigation.ChargingStationDetails d;
    private final java.util.List e;
    private final java.util.List f;

    public VehicleEnergyForecast(com.google.android.gms.car.navigation.EnergyAtDistance energyAtDistance, com.google.android.gms.car.navigation.EnergyAtDistance energyAtDistance2, int i, com.google.android.gms.car.navigation.ChargingStationDetails chargingStationDetails, java.util.List list, java.util.List list2) {
        defpackage.ygw ygwVarO;
        this.a = energyAtDistance;
        this.b = energyAtDistance2;
        this.c = i;
        this.d = chargingStationDetails;
        if (list == null) {
            int i2 = defpackage.ygw.d;
            ygwVarO = defpackage.ymx.a;
        } else {
            ygwVarO = defpackage.ygw.o(list);
        }
        this.e = ygwVarO;
        this.f = list2 == null ? defpackage.ymx.a : defpackage.ygw.o(list2);
    }

    public final defpackage.ygw a() {
        return defpackage.ygw.o(this.f);
    }

    public final defpackage.ygw b() {
        return defpackage.ygw.o(this.e);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.car.navigation.VehicleEnergyForecast) {
            com.google.android.gms.car.navigation.VehicleEnergyForecast vehicleEnergyForecast = (com.google.android.gms.car.navigation.VehicleEnergyForecast) obj;
            if (this.c == vehicleEnergyForecast.c && j$.util.Objects.equals(this.a, vehicleEnergyForecast.a) && j$.util.Objects.equals(this.b, vehicleEnergyForecast.b) && j$.util.Objects.equals(this.d, vehicleEnergyForecast.d) && j$.util.Objects.equals(this.e, vehicleEnergyForecast.e) && j$.util.Objects.equals(this.f, vehicleEnergyForecast.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, this.b, java.lang.Integer.valueOf(this.c), this.d, this.e, this.f);
    }

    public final java.lang.String toString() {
        java.util.List list = this.f;
        java.util.List list2 = this.e;
        com.google.android.gms.car.navigation.ChargingStationDetails chargingStationDetails = this.d;
        com.google.android.gms.car.navigation.EnergyAtDistance energyAtDistance = this.b;
        return "VehicleEnergyForecast{energyAtNextStop=" + java.lang.String.valueOf(this.a) + ", distanceToEmpty=" + java.lang.String.valueOf(energyAtDistance) + ", forecastQuality=" + this.c + ", nextChargingStop=" + java.lang.String.valueOf(chargingStationDetails) + ", stopDetails=" + java.lang.String.valueOf(list2) + ", dataAuthorizations=" + java.lang.String.valueOf(list) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.car.navigation.EnergyAtDistance energyAtDistance = this.a;
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.I(parcel, 1, energyAtDistance, i);
        defpackage.sqs.I(parcel, 2, this.b, i);
        defpackage.sqs.v(parcel, 3, this.c);
        defpackage.sqs.I(parcel, 4, this.d, i);
        defpackage.sqs.N(parcel, 5, b());
        defpackage.sqs.N(parcel, 6, a());
        defpackage.sqs.q(parcel, iP);
    }
}
