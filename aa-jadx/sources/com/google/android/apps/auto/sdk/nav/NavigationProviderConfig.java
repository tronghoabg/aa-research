package com.google.android.apps.auto.sdk.nav;

/* JADX INFO: loaded from: classes.dex */
public class NavigationProviderConfig extends com.google.android.apps.auto.sdk.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.apps.auto.sdk.nav.NavigationProviderConfig> CREATOR = new com.google.android.apps.auto.sdk.AbstractBundleable.BundleableCreator(com.google.android.apps.auto.sdk.nav.NavigationProviderConfig.class);
    public int a;
    public int b;

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        this.a = bundle.getInt("MIN_VERSION");
        this.b = bundle.getInt("MAX_VERSION");
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(android.os.Bundle bundle) {
        bundle.putInt("MIN_VERSION", this.a);
        bundle.putInt("MAX_VERSION", this.b);
    }
}
