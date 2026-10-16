package com.google.android.apps.auto.sdk.nav.state;

/* JADX INFO: loaded from: classes2.dex */
public final class DestinationDistance extends com.google.android.apps.auto.sdk.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.apps.auto.sdk.nav.state.DestinationDistance> CREATOR = new com.google.android.apps.auto.sdk.AbstractBundleable.BundleableCreator(com.google.android.apps.auto.sdk.nav.state.DestinationDistance.class);
    public com.google.android.apps.auto.sdk.nav.state.Distance a;
    public java.lang.String b;
    public long c;

    public DestinationDistance(com.google.android.apps.auto.sdk.nav.state.Distance distance, java.lang.String str, long j) {
        this.a = distance;
        this.b = str;
        this.c = j;
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        com.google.android.apps.auto.sdk.AbstractBundleable abstractBundleable;
        android.os.Bundle bundle2 = bundle.getBundle("distance_bundle");
        com.google.android.apps.auto.sdk.AbstractBundleable abstractBundleable2 = null;
        if (bundle2 != null) {
            try {
                abstractBundleable = (com.google.android.apps.auto.sdk.AbstractBundleable) com.google.android.apps.auto.sdk.nav.state.Distance.class.newInstance();
                abstractBundleable.b(bundle2);
            } catch (java.lang.Exception e) {
                android.util.Log.e("CSL.AbstractBundleable", "Failed to instantiate Distance from bundle", e);
            }
        } else {
            try {
                abstractBundleable = (com.google.android.apps.auto.sdk.AbstractBundleable) bundle.getParcelable("distance");
            } catch (java.lang.RuntimeException e2) {
                android.util.Log.w("CSL.AbstractBundleable", "Failed to read legacy parcelable distance", e2);
            }
        }
        abstractBundleable2 = abstractBundleable;
        this.a = (com.google.android.apps.auto.sdk.nav.state.Distance) abstractBundleable2;
        this.b = bundle.getString("estimated_time_of_arrival");
        this.c = bundle.getLong("time_to_destination_seconds", -1L);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(android.os.Bundle bundle) {
        com.google.android.apps.auto.sdk.nav.state.Distance distance = this.a;
        if (distance != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            distance.d(bundle2);
            bundle.putBundle("distance_bundle", bundle2);
        }
        bundle.putString("estimated_time_of_arrival", this.b);
        bundle.putLong("time_to_destination_seconds", this.c);
    }

    public DestinationDistance() {
        this.c = -1L;
    }
}
