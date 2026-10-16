package com.google.android.apps.auto.sdk.nav.state;

/* JADX INFO: loaded from: classes2.dex */
public class DestinationDetails extends com.google.android.apps.auto.sdk.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.apps.auto.sdk.nav.state.DestinationDetails> CREATOR = new com.google.android.apps.auto.sdk.AbstractBundleable.BundleableCreator(com.google.android.apps.auto.sdk.nav.state.DestinationDetails.class);
    public java.lang.String a;
    public com.google.android.apps.auto.sdk.nav.state.ChargingStationDetails b;

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        this.a = bundle.getString("address");
        android.os.Bundle bundle2 = bundle.getBundle("charging_station_details");
        if (bundle2 != null) {
            com.google.android.apps.auto.sdk.nav.state.ChargingStationDetails chargingStationDetails = new com.google.android.apps.auto.sdk.nav.state.ChargingStationDetails();
            chargingStationDetails.b(bundle2);
            this.b = chargingStationDetails;
        }
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(android.os.Bundle bundle) {
        bundle.putString("address", this.a);
        if (this.b != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            this.b.d(bundle2);
            bundle.putBundle("charging_station_details", bundle2);
        }
    }
}
