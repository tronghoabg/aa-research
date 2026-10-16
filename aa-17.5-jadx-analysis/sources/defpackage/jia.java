package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class jia implements jhv {
    protected final float a = 1.0f / b(1.0f);

    static float b(float f) {
        return ((float) (-Math.pow(100.0d, -f))) + 1.0f + (f * BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.jhv
    public float a(float f, float f2, float f3) {
        if (f <= f2) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f >= f3) {
            return 1.0f;
        }
        return b((f - f2) / (f3 - f2)) * this.a;
    }
}
