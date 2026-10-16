package com.google.android.apps.auto.sdk.nav.state;

/* JADX INFO: loaded from: classes2.dex */
public final class StopDetails extends com.google.android.apps.auto.sdk.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.apps.auto.sdk.nav.state.StopDetails> CREATOR = new com.google.android.apps.auto.sdk.AbstractBundleable.BundleableCreator(com.google.android.apps.auto.sdk.nav.state.StopDetails.class);
    public com.google.android.apps.auto.sdk.nav.state.EnergyAtDistance a;
    public com.google.android.apps.auto.sdk.nav.state.ChargingStationDetails b;

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = bundle.getBundle("expected_arrival_energy_bundle");
        if (bundle2 != null) {
            com.google.android.apps.auto.sdk.nav.state.EnergyAtDistance energyAtDistance = new com.google.android.apps.auto.sdk.nav.state.EnergyAtDistance();
            this.a = energyAtDistance;
            energyAtDistance.b(bundle2);
        }
        android.os.Bundle bundle3 = bundle.getBundle("charging_info_bundle");
        if (bundle3 != null) {
            com.google.android.apps.auto.sdk.nav.state.ChargingStationDetails chargingStationDetails = new com.google.android.apps.auto.sdk.nav.state.ChargingStationDetails();
            this.b = chargingStationDetails;
            chargingStationDetails.b(bundle3);
        }
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(android.os.Bundle bundle) {
        if (this.a != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            this.a.d(bundle2);
            bundle.putBundle("expected_arrival_energy_bundle", bundle2);
        }
        if (this.b != null) {
            android.os.Bundle bundle3 = new android.os.Bundle();
            this.b.d(bundle3);
            bundle.putBundle("charging_info_bundle", bundle3);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.apps.auto.sdk.nav.state.StopDetails) {
            com.google.android.apps.auto.sdk.nav.state.StopDetails stopDetails = (com.google.android.apps.auto.sdk.nav.state.StopDetails) obj;
            if (j$.util.Objects.equals(this.a, stopDetails.a) && j$.util.Objects.equals(this.b, stopDetails.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, this.b);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final java.lang.String toString() {
        return "StopDetails{expectedArrivalEnergy=" + java.lang.String.valueOf(this.a) + ", chargingInfo=" + java.lang.String.valueOf(this.b) + "}";
    }
}
