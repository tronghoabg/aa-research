package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class uvs {
    protected volatile uvy C;
    protected volatile float[] D = new float[4];

    public uvs(int i, int i2) {
        this.C = new uvy(0, 0);
        this.C = new uvy(i, i2);
        h(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
    }

    public final int f() {
        return this.C.b;
    }

    public final int g() {
        return this.C.a;
    }

    public final void h(float f, float f2, float f3, float f4) {
        this.D = new float[]{f, f2, f3, f4};
    }
}
