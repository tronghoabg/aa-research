package com.google.android.apps.auto.sdk.nav.state;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.auto.sdk.AbstractBundleable;
import java.util.List;

/* loaded from: classes2.dex */
public final class Lane extends AbstractBundleable {
    public static final Parcelable.Creator<Lane> CREATOR = new AbstractBundleable.BundleableCreator(Lane.class);
    public List a;

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(Bundle bundle) {
        this.a = a(bundle, "lane_directions", "lane_directions_bundles", LaneDirection.class);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(Bundle bundle) {
        c(bundle, "lane_directions_bundles", this.a);
    }
}
