package com.google.android.apps.auto.sdk.nav.state;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.auto.sdk.AbstractBundleable;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class EnergyAtDistance extends AbstractBundleable {
    public static final Parcelable.Creator<EnergyAtDistance> CREATOR = new AbstractBundleable.BundleableCreator(EnergyAtDistance.class);
    public int a = Integer.MIN_VALUE;
    public int b = Integer.MIN_VALUE;
    public int c = Integer.MIN_VALUE;

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(Bundle bundle) {
        this.a = bundle.getInt("distance_meters", Integer.MIN_VALUE);
        this.b = bundle.getInt("arrival_battery_energy_wh", Integer.MIN_VALUE);
        this.c = bundle.getInt("time_to_arrival_seconds", Integer.MIN_VALUE);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(Bundle bundle) {
        bundle.putInt("distance_meters", this.a);
        bundle.putInt("arrival_battery_energy_wh", this.b);
        bundle.putInt("time_to_arrival_seconds", this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EnergyAtDistance) {
            EnergyAtDistance energyAtDistance = (EnergyAtDistance) obj;
            if (this.a == energyAtDistance.a && this.b == energyAtDistance.b && this.c == energyAtDistance.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final String toString() {
        return "EnergyAtDistance{distanceMeters=" + this.a + ", arrivalBatteryEnergyWh=" + this.b + ", timeToArrivalSeconds=" + this.c + "}";
    }
}
