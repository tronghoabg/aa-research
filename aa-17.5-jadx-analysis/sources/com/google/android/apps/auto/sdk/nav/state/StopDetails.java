package com.google.android.apps.auto.sdk.nav.state;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.auto.sdk.AbstractBundleable;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class StopDetails extends AbstractBundleable {
    public static final Parcelable.Creator<StopDetails> CREATOR = new AbstractBundleable.BundleableCreator(StopDetails.class);
    public EnergyAtDistance a;
    public ChargingStationDetails b;

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("expected_arrival_energy_bundle");
        if (bundle2 != null) {
            EnergyAtDistance energyAtDistance = new EnergyAtDistance();
            this.a = energyAtDistance;
            energyAtDistance.b(bundle2);
        }
        Bundle bundle3 = bundle.getBundle("charging_info_bundle");
        if (bundle3 != null) {
            ChargingStationDetails chargingStationDetails = new ChargingStationDetails();
            this.b = chargingStationDetails;
            chargingStationDetails.b(bundle3);
        }
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(Bundle bundle) {
        if (this.a != null) {
            Bundle bundle2 = new Bundle();
            this.a.d(bundle2);
            bundle.putBundle("expected_arrival_energy_bundle", bundle2);
        }
        if (this.b != null) {
            Bundle bundle3 = new Bundle();
            this.b.d(bundle3);
            bundle.putBundle("charging_info_bundle", bundle3);
        }
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

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final String toString() {
        return "StopDetails{expectedArrivalEnergy=" + String.valueOf(this.a) + ", chargingInfo=" + String.valueOf(this.b) + "}";
    }
}
