package com.google.android.apps.auto.sdk.nav.state;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.auto.sdk.AbstractBundleable;

/* loaded from: classes.dex */
public class NavigationSummary extends AbstractBundleable {
    public static final Parcelable.Creator<NavigationSummary> CREATOR = new AbstractBundleable.BundleableCreator(NavigationSummary.class);
    public int a;

    @Deprecated
    private int c = -1;

    @Deprecated
    private CharSequence b = "";

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(Bundle bundle) {
        this.b = bundle.getCharSequence("formatted_eta", "");
        this.c = bundle.getInt("sec_to_dest", -1);
        this.a = bundle.getInt("nav_status");
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(Bundle bundle) {
        bundle.putCharSequence("formatted_eta", this.b);
        bundle.putInt("sec_to_dest", this.c);
        bundle.putInt("nav_status", this.a);
    }
}
