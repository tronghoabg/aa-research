package com.google.android.apps.auto.sdk.nav.state;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.auto.sdk.AbstractBundleable;

/* loaded from: classes2.dex */
public final class LaneDirection extends AbstractBundleable {
    public static final Parcelable.Creator<LaneDirection> CREATOR = new AbstractBundleable.BundleableCreator(LaneDirection.class);
    public int a = 0;
    public boolean b;

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(Bundle bundle) {
        this.a = bundle.getInt("lane_shape");
        this.b = bundle.getBoolean("is_highlighted");
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(Bundle bundle) {
        bundle.putInt("lane_shape", this.a);
        bundle.putBoolean("is_highlighted", this.b);
    }
}
