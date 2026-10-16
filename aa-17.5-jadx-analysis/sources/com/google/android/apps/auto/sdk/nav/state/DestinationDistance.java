package com.google.android.apps.auto.sdk.nav.state;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.apps.auto.sdk.AbstractBundleable;

/* loaded from: classes2.dex */
public final class DestinationDistance extends AbstractBundleable {
    public static final Parcelable.Creator<DestinationDistance> CREATOR = new AbstractBundleable.BundleableCreator(DestinationDistance.class);
    public Distance a;
    public String b;
    public long c;

    public DestinationDistance(Distance distance, String str, long j) {
        this.a = distance;
        this.b = str;
        this.c = j;
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(Bundle bundle) {
        AbstractBundleable abstractBundleable;
        Bundle bundle2 = bundle.getBundle("distance_bundle");
        AbstractBundleable abstractBundleable2 = null;
        if (bundle2 != null) {
            try {
                abstractBundleable = (AbstractBundleable) Distance.class.newInstance();
                abstractBundleable.b(bundle2);
                abstractBundleable2 = abstractBundleable;
            } catch (Exception e) {
                Log.e("CSL.AbstractBundleable", "Failed to instantiate Distance from bundle", e);
            }
        } else {
            try {
                abstractBundleable = (AbstractBundleable) bundle.getParcelable("distance");
                abstractBundleable2 = abstractBundleable;
            } catch (RuntimeException e2) {
                Log.w("CSL.AbstractBundleable", "Failed to read legacy parcelable distance", e2);
            }
        }
        this.a = (Distance) abstractBundleable2;
        this.b = bundle.getString("estimated_time_of_arrival");
        this.c = bundle.getLong("time_to_destination_seconds", -1L);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(Bundle bundle) {
        Distance distance = this.a;
        if (distance != null) {
            Bundle bundle2 = new Bundle();
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
