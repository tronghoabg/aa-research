package com.google.android.apps.auto.sdk.nav;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.auto.sdk.AbstractBundleable;

/* loaded from: classes.dex */
public class NavigationProviderConfig extends AbstractBundleable {
    public static final Parcelable.Creator<NavigationProviderConfig> CREATOR = new AbstractBundleable.BundleableCreator(NavigationProviderConfig.class);
    public int a;
    public int b;

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(Bundle bundle) {
        this.a = bundle.getInt("MIN_VERSION");
        this.b = bundle.getInt("MAX_VERSION");
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(Bundle bundle) {
        bundle.putInt("MIN_VERSION", this.a);
        bundle.putInt("MAX_VERSION", this.b);
    }
}
