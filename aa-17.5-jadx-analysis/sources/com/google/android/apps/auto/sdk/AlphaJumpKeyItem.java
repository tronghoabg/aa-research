package com.google.android.apps.auto.sdk;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.auto.sdk.AbstractBundleable;

/* loaded from: classes2.dex */
public class AlphaJumpKeyItem extends AbstractBundleable {
    public static final Parcelable.Creator<AlphaJumpKeyItem> CREATOR = new AbstractBundleable.BundleableCreator(AlphaJumpKeyItem.class);
    public char a;
    public boolean b;
    public int c = -1;

    AlphaJumpKeyItem() {
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(Bundle bundle) {
        this.a = bundle.getChar("character");
        this.b = bundle.getBoolean("is_enabled");
        this.c = bundle.getInt("jump_position");
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(Bundle bundle) {
        bundle.putChar("character", this.a);
        bundle.putBoolean("is_enabled", this.b);
        bundle.putInt("jump_position", this.c);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final String toString() {
        return "[AlphaJumpKeyItem , character " + this.a + ", isEnabled " + this.b + ", jumpPosition " + this.c + "]";
    }
}
