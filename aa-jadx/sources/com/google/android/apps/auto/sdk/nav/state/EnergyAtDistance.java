package com.google.android.apps.auto.sdk.nav.state;

/* JADX INFO: loaded from: classes2.dex */
public final class EnergyAtDistance extends com.google.android.apps.auto.sdk.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.apps.auto.sdk.nav.state.EnergyAtDistance> CREATOR = new com.google.android.apps.auto.sdk.AbstractBundleable.BundleableCreator(com.google.android.apps.auto.sdk.nav.state.EnergyAtDistance.class);
    public int a = Integer.MIN_VALUE;
    public int b = Integer.MIN_VALUE;
    public int c = Integer.MIN_VALUE;

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        this.a = bundle.getInt("distance_meters", Integer.MIN_VALUE);
        this.b = bundle.getInt("arrival_battery_energy_wh", Integer.MIN_VALUE);
        this.c = bundle.getInt("time_to_arrival_seconds", Integer.MIN_VALUE);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(android.os.Bundle bundle) {
        bundle.putInt("distance_meters", this.a);
        bundle.putInt("arrival_battery_energy_wh", this.b);
        bundle.putInt("time_to_arrival_seconds", this.c);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.apps.auto.sdk.nav.state.EnergyAtDistance) {
            com.google.android.apps.auto.sdk.nav.state.EnergyAtDistance energyAtDistance = (com.google.android.apps.auto.sdk.nav.state.EnergyAtDistance) obj;
            if (this.a == energyAtDistance.a && this.b == energyAtDistance.b && this.c == energyAtDistance.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c));
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final java.lang.String toString() {
        return "EnergyAtDistance{distanceMeters=" + this.a + ", arrivalBatteryEnergyWh=" + this.b + ", timeToArrivalSeconds=" + this.c + "}";
    }
}
