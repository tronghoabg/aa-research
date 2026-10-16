package com.google.android.apps.auto.sdk.nav.state;

/* JADX INFO: loaded from: classes2.dex */
public class ChargingStationDetails extends com.google.android.apps.auto.sdk.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.apps.auto.sdk.nav.state.ChargingStationDetails> CREATOR = new com.google.android.apps.auto.sdk.AbstractBundleable.BundleableCreator(com.google.android.apps.auto.sdk.nav.state.ChargingStationDetails.class);
    public int a = -1;
    public int b = -1;
    public int c = -1;

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        this.a = bundle.getInt("min_departure_energy_wh", -1);
        this.b = bundle.getInt("max_rated_power_watts", -1);
        this.c = bundle.getInt("estimated_charging_time_seconds", -1);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(android.os.Bundle bundle) {
        bundle.putInt("min_departure_energy_wh", this.a);
        bundle.putInt("max_rated_power_watts", this.b);
        bundle.putInt("estimated_charging_time_seconds", this.c);
    }
}
