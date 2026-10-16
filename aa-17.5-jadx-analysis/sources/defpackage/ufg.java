package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public abstract class ufg {
    public final float h;
    public final float i;

    protected ufg(float f, float f2) {
        this.h = f;
        this.i = f2;
    }

    public abstract uwk a();

    public float c() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    public final float d() {
        return (this.i - c()) - i();
    }

    public float i() {
        return BitmapDescriptorFactory.HUE_RED;
    }
}
