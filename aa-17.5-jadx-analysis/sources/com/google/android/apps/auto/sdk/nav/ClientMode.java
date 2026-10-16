package com.google.android.apps.auto.sdk.nav;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.auto.sdk.AbstractBundleable;

/* loaded from: classes.dex */
public class ClientMode extends AbstractBundleable {
    public static final Parcelable.Creator<ClientMode> CREATOR = new AbstractBundleable.BundleableCreator(ClientMode.class);
    private int a;

    public ClientMode(byte[] bArr) throws IllegalArgumentException {
        this.a = 1;
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(Bundle bundle) {
        this.a = bundle.getInt("mode");
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(Bundle bundle) {
        bundle.putInt("mode", this.a);
    }

    public ClientMode() {
    }
}
