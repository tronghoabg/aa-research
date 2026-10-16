package com.google.android.apps.auto.sdk.nav.state;

/* JADX INFO: loaded from: classes.dex */
public class NavigationSummary extends com.google.android.apps.auto.sdk.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.apps.auto.sdk.nav.state.NavigationSummary> CREATOR = new com.google.android.apps.auto.sdk.AbstractBundleable.BundleableCreator(com.google.android.apps.auto.sdk.nav.state.NavigationSummary.class);
    public int a;

    @java.lang.Deprecated
    private int c = -1;

    @java.lang.Deprecated
    private java.lang.CharSequence b = "";

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        this.b = bundle.getCharSequence("formatted_eta", "");
        this.c = bundle.getInt("sec_to_dest", -1);
        this.a = bundle.getInt("nav_status");
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(android.os.Bundle bundle) {
        bundle.putCharSequence("formatted_eta", this.b);
        bundle.putInt("sec_to_dest", this.c);
        bundle.putInt("nav_status", this.a);
    }
}
