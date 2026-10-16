package defpackage;

import android.graphics.Color;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class xqs {
    public static final int a = Color.argb(255, 255, 113, 187);
    public static final xqs b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l = -0.75f;
    public final float m = 1.0f;
    public final float n = 0.1f;
    public final float o = 0.00277f;
    public final float p = 0.35f;

    static {
        xqs xqsVarA = a(new xqs(0.1f, 2.0f, 0.2f, 0.2f, 2.0f, 2.0f, 1.06f, 0.62f, 1.1f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.03f, 0.04f, 2.0f, 2.0f, 15875);
        b = xqsVarA;
        a(xqsVarA, 0.3f, 5.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 15872);
    }

    public xqs(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = f7;
        this.j = f8;
        this.k = f9;
    }

    public static /* synthetic */ xqs a(xqs xqsVar, float f, float f2, float f3, float f4, float f5, float f6, int i) {
        if ((i & 1) != 0) {
            f = xqsVar.c;
        }
        float f7 = f;
        if ((i & 2) != 0) {
            f2 = xqsVar.d;
        }
        float f8 = xqsVar.l;
        float f9 = xqsVar.m;
        float f10 = xqsVar.n;
        float f11 = xqsVar.o;
        float f12 = xqsVar.p;
        return new xqs(f7, f2, f3, f4, f5, f6, 0.6f, 0.9f, -1.79f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqs)) {
            return false;
        }
        xqs xqsVar = (xqs) obj;
        if (Float.compare(this.c, xqsVar.c) != 0 || Float.compare(this.d, xqsVar.d) != 0 || Float.compare(this.e, xqsVar.e) != 0 || Float.compare(this.f, xqsVar.f) != 0 || Float.compare(this.g, xqsVar.g) != 0 || Float.compare(this.h, xqsVar.h) != 0 || Float.compare(this.i, xqsVar.i) != 0 || Float.compare(this.j, xqsVar.j) != 0 || Float.compare(this.k, xqsVar.k) != 0) {
            return false;
        }
        float f = xqsVar.l;
        if (Float.compare(-0.75f, -0.75f) != 0) {
            return false;
        }
        float f2 = xqsVar.m;
        if (Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        float f3 = xqsVar.n;
        if (Float.compare(0.1f, 0.1f) != 0) {
            return false;
        }
        float f4 = xqsVar.o;
        if (Float.compare(0.00277f, 0.00277f) != 0) {
            return false;
        }
        float f5 = xqsVar.p;
        return Float.compare(0.35f, 0.35f) == 0;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + Float.floatToIntBits(this.i)) * 31) + Float.floatToIntBits(this.j)) * 31) + Float.floatToIntBits(this.k)) * 31) + Float.floatToIntBits(-0.75f)) * 31) + Float.floatToIntBits(1.0f)) * 31) + Float.floatToIntBits(0.1f)) * 31) + Float.floatToIntBits(0.00277f)) * 31) + Float.floatToIntBits(0.35f);
    }

    public final String toString() {
        return "InternalEnergyShaderDotsConfig(blurRadius=" + this.c + ", moveStrength=" + this.d + ", sizeNoiseScaleX=" + this.e + ", sizeNoiseScaleY=" + this.f + ", motionNoiseScaleX=" + this.g + ", motionNoiseScaleY=" + this.h + ", motionNoiseSpeedX=" + this.i + ", motionNoiseSpeedY=" + this.j + ", motionNoiseSpeedZ=" + this.k + ", thresholdMin=-0.75, thresholdMax=1.0, noiseRotationSpeed=0.1, noiseSpatialScale=0.00277, noiseManhattanLimit=0.35)";
    }
}
