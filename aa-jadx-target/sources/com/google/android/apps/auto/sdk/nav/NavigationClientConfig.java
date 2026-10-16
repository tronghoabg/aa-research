package com.google.android.apps.auto.sdk.nav;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class NavigationClientConfig extends com.google.android.apps.auto.sdk.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.apps.auto.sdk.nav.NavigationClientConfig> CREATOR = new com.google.android.apps.auto.sdk.AbstractBundleable.BundleableCreator(com.google.android.apps.auto.sdk.nav.NavigationClientConfig.class);
    private int a;
    private android.os.Bundle b;

    public NavigationClientConfig(int i, android.os.Bundle bundle) throws java.lang.IllegalArgumentException {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "Invalid version. Must be > 0. Version = "));
        }
        this.a = i;
        this.b = bundle;
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        this.a = bundle.getInt("version");
        android.os.Bundle bundle2 = bundle.getBundle("dynamic_configuration");
        this.b = bundle2;
        if (bundle2 == null) {
            this.b = new android.os.Bundle();
        }
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(android.os.Bundle bundle) {
        bundle.putInt("version", this.a);
        bundle.putBundle("dynamic_configuration", this.b);
    }

    public NavigationClientConfig() {
    }
}
