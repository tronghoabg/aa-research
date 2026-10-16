package com.google.android.apps.auto.sdk;

/* JADX INFO: loaded from: classes2.dex */
public class AlphaJumpKeyItem extends com.google.android.apps.auto.sdk.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.apps.auto.sdk.AlphaJumpKeyItem> CREATOR = new com.google.android.apps.auto.sdk.AbstractBundleable.BundleableCreator(com.google.android.apps.auto.sdk.AlphaJumpKeyItem.class);
    public char a;
    public boolean b;
    public int c = -1;

    AlphaJumpKeyItem() {
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        this.a = bundle.getChar("character");
        this.b = bundle.getBoolean("is_enabled");
        this.c = bundle.getInt("jump_position");
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(android.os.Bundle bundle) {
        bundle.putChar("character", this.a);
        bundle.putBoolean("is_enabled", this.b);
        bundle.putInt("jump_position", this.c);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final java.lang.String toString() {
        return "[AlphaJumpKeyItem , character " + this.a + ", isEnabled " + this.b + ", jumpPosition " + this.c + "]";
    }
}
