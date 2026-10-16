package com.google.android.apps.auto.sdk.nav;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ClientMode extends com.google.android.apps.auto.sdk.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.apps.auto.sdk.nav.ClientMode> CREATOR = new com.google.android.apps.auto.sdk.AbstractBundleable.BundleableCreator(com.google.android.apps.auto.sdk.nav.ClientMode.class);
    private int a;

    public ClientMode(byte[] bArr) throws java.lang.IllegalArgumentException {
        this.a = 1;
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        this.a = bundle.getInt("mode");
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(android.os.Bundle bundle) {
        bundle.putInt("mode", this.a);
    }

    public ClientMode() {
    }
}
