package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xrw {
    public static final int a = -36421;
    public static final defpackage.xrw b;
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
        defpackage.xrw xrwVarA = a(new defpackage.xrw(0.1f, 2.0f, 0.2f, 0.2f, 2.0f, 2.0f, 1.06f, 0.62f, 1.1f), com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 0.03f, 0.04f, 2.0f, 2.0f, 15875);
        b = xrwVarA;
        a(xrwVarA, 0.3f, 5.0f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 15872);
    }

    public xrw(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
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

    public static /* synthetic */ defpackage.xrw a(defpackage.xrw xrwVar, float f, float f2, float f3, float f4, float f5, float f6, int i) {
        if ((i & 1) != 0) {
            f = xrwVar.c;
        }
        float f7 = f;
        if ((i & 2) != 0) {
            f2 = xrwVar.d;
        }
        float f8 = xrwVar.l;
        float f9 = xrwVar.m;
        float f10 = xrwVar.n;
        float f11 = xrwVar.o;
        float f12 = xrwVar.p;
        return new defpackage.xrw(f7, f2, f3, f4, f5, f6, 0.6f, 0.9f, -1.79f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.xrw)) {
            return false;
        }
        defpackage.xrw xrwVar = (defpackage.xrw) obj;
        if (java.lang.Float.compare(this.c, xrwVar.c) != 0 || java.lang.Float.compare(this.d, xrwVar.d) != 0 || java.lang.Float.compare(this.e, xrwVar.e) != 0 || java.lang.Float.compare(this.f, xrwVar.f) != 0 || java.lang.Float.compare(this.g, xrwVar.g) != 0 || java.lang.Float.compare(this.h, xrwVar.h) != 0 || java.lang.Float.compare(this.i, xrwVar.i) != 0 || java.lang.Float.compare(this.j, xrwVar.j) != 0 || java.lang.Float.compare(this.k, xrwVar.k) != 0) {
            return false;
        }
        float f = xrwVar.l;
        float f2 = xrwVar.m;
        float f3 = xrwVar.n;
        float f4 = xrwVar.o;
        float f5 = xrwVar.p;
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((java.lang.Float.floatToIntBits(this.c) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.f)) * 31) + java.lang.Float.floatToIntBits(this.g)) * 31) + java.lang.Float.floatToIntBits(this.h)) * 31) + java.lang.Float.floatToIntBits(this.i)) * 31) + java.lang.Float.floatToIntBits(this.j)) * 31) + java.lang.Float.floatToIntBits(this.k)) * 31) - 1086324736) * 31) + 1065353216) * 31) + 1036831949) * 31) + 993364195) * 31) + 1051931443;
    }

    public final java.lang.String toString() {
        return "InternalEnergyShaderDotsConfig(blurRadius=" + this.c + ", moveStrength=" + this.d + ", sizeNoiseScaleX=" + this.e + ", sizeNoiseScaleY=" + this.f + ", motionNoiseScaleX=" + this.g + ", motionNoiseScaleY=" + this.h + ", motionNoiseSpeedX=" + this.i + ", motionNoiseSpeedY=" + this.j + ", motionNoiseSpeedZ=" + this.k + ", thresholdMin=-0.75, thresholdMax=1.0, noiseRotationSpeed=0.1, noiseSpatialScale=0.00277, noiseManhattanLimit=0.35)";
    }
}
