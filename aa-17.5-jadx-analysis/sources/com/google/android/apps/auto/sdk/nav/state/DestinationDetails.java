package com.google.android.apps.auto.sdk.nav.state;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.auto.sdk.AbstractBundleable;

/* loaded from: classes2.dex */
public class DestinationDetails extends AbstractBundleable {
    public static final Parcelable.Creator<DestinationDetails> CREATOR = new AbstractBundleable.BundleableCreator(DestinationDetails.class);
    public String a;
    public ChargingStationDetails b;

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(Bundle bundle) {
        this.a = bundle.getString("address");
        Bundle bundle2 = bundle.getBundle("charging_station_details");
        if (bundle2 != null) {
            ChargingStationDetails chargingStationDetails = new ChargingStationDetails();
            chargingStationDetails.b(bundle2);
            this.b = chargingStationDetails;
        }
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(Bundle bundle) {
        bundle.putString("address", this.a);
        if (this.b != null) {
            Bundle bundle2 = new Bundle();
            this.b.d(bundle2);
            bundle.putBundle("charging_station_details", bundle2);
        }
    }
}
