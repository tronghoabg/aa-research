package com.google.android.apps.auto.sdk.nav;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.auto.sdk.AbstractBundleable;
import defpackage.a;

/* loaded from: classes.dex */
public class NavigationClientConfig extends AbstractBundleable {
    public static final Parcelable.Creator<NavigationClientConfig> CREATOR = new AbstractBundleable.BundleableCreator(NavigationClientConfig.class);
    private int a;
    private Bundle b;

    public NavigationClientConfig(int i, Bundle bundle) throws IllegalArgumentException {
        if (i <= 0) {
            throw new IllegalArgumentException(a.bp(i, "Invalid version. Must be > 0. Version = "));
        }
        this.a = i;
        this.b = bundle;
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(Bundle bundle) {
        this.a = bundle.getInt("version");
        Bundle bundle2 = bundle.getBundle("dynamic_configuration");
        this.b = bundle2;
        if (bundle2 == null) {
            this.b = new Bundle();
        }
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(Bundle bundle) {
        bundle.putInt("version", this.a);
        bundle.putBundle("dynamic_configuration", this.b);
    }

    public NavigationClientConfig() {
    }
}
