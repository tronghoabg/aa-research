package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class xqy {
    public final float a;
    public final float b;
    public final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;

    public xqy(float f, float f2, float f3) {
        this.d = BitmapDescriptorFactory.HUE_RED;
        this.a = f;
        this.e = BitmapDescriptorFactory.HUE_RED;
        this.f = BitmapDescriptorFactory.HUE_RED;
        this.g = BitmapDescriptorFactory.HUE_RED;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqy)) {
            return false;
        }
        xqy xqyVar = (xqy) obj;
        float f = xqyVar.d;
        if (Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) != 0 || Float.compare(this.a, xqyVar.a) != 0) {
            return false;
        }
        float f2 = xqyVar.e;
        if (Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) != 0) {
            return false;
        }
        float f3 = xqyVar.f;
        if (Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) != 0) {
            return false;
        }
        float f4 = xqyVar.g;
        return Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && Float.compare(this.b, xqyVar.b) == 0 && Float.compare(this.c, xqyVar.c) == 0;
    }

    public final int hashCode() {
        return (((((((((((Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED) * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED)) * 31) + Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED)) * 31) + Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED)) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "RimLightConfig(startBlurRadius=0.0, endBlurRadius=" + this.a + ", distortionSpeed=0.0, distortionFrequency=0.0, distortionAmplitude=0.0, rimWidth=" + this.b + ", alpha=" + this.c + ")";
    }

    public xqy() {
        this(23.6f, 32.0f, 1.0f);
    }
}
