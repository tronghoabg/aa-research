package com.google.android.apps.auto.sdk.nav.state;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.auto.sdk.AbstractBundleable;

/* loaded from: classes.dex */
public class CarInstrumentClusterConfig extends AbstractBundleable {
    public static final Parcelable.Creator<CarInstrumentClusterConfig> CREATOR = new AbstractBundleable.BundleableCreator(CarInstrumentClusterConfig.class);
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;

    public CarInstrumentClusterConfig(int i, int i2, int i3, int i4, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(Bundle bundle) {
        this.a = bundle.getInt("min_interval");
        this.b = bundle.getInt("img_width");
        this.c = bundle.getInt("img_height");
        this.d = bundle.getInt("img_depth");
        this.e = bundle.getBoolean("supports_images");
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(Bundle bundle) {
        bundle.putInt("min_interval", this.a);
        bundle.putInt("img_width", this.b);
        bundle.putInt("img_height", this.c);
        bundle.putInt("img_depth", this.d);
        bundle.putBoolean("supports_images", this.e);
    }

    public CarInstrumentClusterConfig() {
    }
}
