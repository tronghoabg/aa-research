package com.google.android.apps.auto.sdk.nav.state;

/* JADX INFO: loaded from: classes2.dex */
public final class VehicleEnergyForecast extends com.google.android.apps.auto.sdk.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.apps.auto.sdk.nav.state.VehicleEnergyForecast> CREATOR = new com.google.android.apps.auto.sdk.AbstractBundleable.BundleableCreator(com.google.android.apps.auto.sdk.nav.state.VehicleEnergyForecast.class);
    public com.google.android.apps.auto.sdk.nav.state.EnergyAtDistance a;
    public com.google.android.apps.auto.sdk.nav.state.EnergyAtDistance b;
    public int c;
    public com.google.android.apps.auto.sdk.nav.state.ChargingStationDetails d;
    public java.util.List e;
    public java.util.List f;

    public VehicleEnergyForecast() {
        int i = defpackage.ygw.d;
        defpackage.ygw ygwVar = defpackage.ymx.a;
        this.e = ygwVar;
        this.f = ygwVar;
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = bundle.getBundle("energy_at_next_stop_bundle");
        if (bundle2 != null) {
            com.google.android.apps.auto.sdk.nav.state.EnergyAtDistance energyAtDistance = new com.google.android.apps.auto.sdk.nav.state.EnergyAtDistance();
            this.a = energyAtDistance;
            energyAtDistance.b(bundle2);
        }
        android.os.Bundle bundle3 = bundle.getBundle("distance_to_empty_bundle");
        if (bundle3 != null) {
            com.google.android.apps.auto.sdk.nav.state.EnergyAtDistance energyAtDistance2 = new com.google.android.apps.auto.sdk.nav.state.EnergyAtDistance();
            this.b = energyAtDistance2;
            energyAtDistance2.b(bundle3);
        }
        this.c = bundle.getInt("forecast_quality");
        android.os.Bundle bundle4 = bundle.getBundle("next_charging_stop_bundle");
        if (bundle4 != null) {
            com.google.android.apps.auto.sdk.nav.state.ChargingStationDetails chargingStationDetails = new com.google.android.apps.auto.sdk.nav.state.ChargingStationDetails();
            this.d = chargingStationDetails;
            chargingStationDetails.b(bundle4);
        }
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("stop_details_bundles");
        if (parcelableArrayList != null) {
            int i = defpackage.ygw.d;
            defpackage.ygr ygrVar = new defpackage.ygr(4);
            int size = parcelableArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                android.os.Bundle bundle5 = (android.os.Bundle) parcelableArrayList.get(i2);
                com.google.android.apps.auto.sdk.nav.state.StopDetails stopDetails = new com.google.android.apps.auto.sdk.nav.state.StopDetails();
                stopDetails.b(bundle5);
                ygrVar.i(stopDetails);
            }
            this.e = ygrVar.g();
        } else {
            int i3 = defpackage.ygw.d;
            this.e = defpackage.ymx.a;
        }
        java.util.ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("data_authorizations_bundles");
        if (parcelableArrayList2 == null) {
            this.f = defpackage.ymx.a;
            return;
        }
        defpackage.ygr ygrVar2 = new defpackage.ygr(4);
        int size2 = parcelableArrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            android.os.Bundle bundle6 = (android.os.Bundle) parcelableArrayList2.get(i4);
            com.google.android.apps.auto.sdk.nav.state.DataAuthorization dataAuthorization = new com.google.android.apps.auto.sdk.nav.state.DataAuthorization();
            dataAuthorization.b(bundle6);
            ygrVar2.i(dataAuthorization);
        }
        this.f = ygrVar2.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(android.os.Bundle bundle) {
        if (this.a != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            this.a.d(bundle2);
            bundle.putBundle("energy_at_next_stop_bundle", bundle2);
        }
        if (this.b != null) {
            android.os.Bundle bundle3 = new android.os.Bundle();
            this.b.d(bundle3);
            bundle.putBundle("distance_to_empty_bundle", bundle3);
        }
        bundle.putInt("forecast_quality", this.c);
        if (this.d != null) {
            android.os.Bundle bundle4 = new android.os.Bundle();
            this.d.d(bundle4);
            bundle.putBundle("next_charging_stop_bundle", bundle4);
        }
        if (!this.e.isEmpty()) {
            java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(((defpackage.ymx) this.e).c);
            defpackage.you youVarListIterator = ((defpackage.ygw) this.e).listIterator(0);
            while (youVarListIterator.hasNext()) {
                com.google.android.apps.auto.sdk.nav.state.StopDetails stopDetails = (com.google.android.apps.auto.sdk.nav.state.StopDetails) youVarListIterator.next();
                android.os.Bundle bundle5 = new android.os.Bundle();
                stopDetails.d(bundle5);
                arrayList.add(bundle5);
            }
            bundle.putParcelableArrayList("stop_details_bundles", arrayList);
        }
        if (this.f.isEmpty()) {
            return;
        }
        java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = new java.util.ArrayList<>(((defpackage.ymx) this.f).c);
        defpackage.you youVarListIterator2 = ((defpackage.ygw) this.f).listIterator(0);
        while (youVarListIterator2.hasNext()) {
            com.google.android.apps.auto.sdk.nav.state.DataAuthorization dataAuthorization = (com.google.android.apps.auto.sdk.nav.state.DataAuthorization) youVarListIterator2.next();
            android.os.Bundle bundle6 = new android.os.Bundle();
            dataAuthorization.d(bundle6);
            arrayList2.add(bundle6);
        }
        bundle.putParcelableArrayList("data_authorizations_bundles", arrayList2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.apps.auto.sdk.nav.state.VehicleEnergyForecast) {
            com.google.android.apps.auto.sdk.nav.state.VehicleEnergyForecast vehicleEnergyForecast = (com.google.android.apps.auto.sdk.nav.state.VehicleEnergyForecast) obj;
            if (this.c == vehicleEnergyForecast.c && j$.util.Objects.equals(this.a, vehicleEnergyForecast.a) && j$.util.Objects.equals(this.b, vehicleEnergyForecast.b) && j$.util.Objects.equals(this.d, vehicleEnergyForecast.d) && j$.util.Objects.equals(this.e, vehicleEnergyForecast.e) && j$.util.Objects.equals(this.f, vehicleEnergyForecast.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, this.b, java.lang.Integer.valueOf(this.c), this.d, this.e, this.f);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final java.lang.String toString() {
        return "VehicleEnergyForecast{energyAtNextStop=" + java.lang.String.valueOf(this.a) + ", distanceToEmpty=" + java.lang.String.valueOf(this.b) + ", forecastQuality=" + this.c + ", nextChargingStop=" + java.lang.String.valueOf(this.d) + ", stopDetails=" + java.lang.String.valueOf(this.e) + ", dataAuthorizations=" + java.lang.String.valueOf(this.f) + "}";
    }
}
