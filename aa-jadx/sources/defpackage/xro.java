package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xro {
    public static volatile int o;
    public final java.lang.String a;
    public final float b;
    public final int c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final defpackage.xrw n;
    private final boolean p;

    static {
        int i = defpackage.xrw.a;
        o = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ xro() {
        int i = defpackage.xrw.a;
        if (o == 0) {
            throw null;
        }
        this("return blurredSdfMask;", 1.0f, i, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 0.02f, 3.0f, 10.0f, 59.0f, 59.0f, 3.5f, 0.12f, -0.07f, 1.0f, defpackage.xrw.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.xro)) {
            return false;
        }
        defpackage.xro xroVar = (defpackage.xro) obj;
        if (!defpackage.afga.f(this.a, xroVar.a) || java.lang.Float.compare(this.b, xroVar.b) != 0 || this.c != xroVar.c || java.lang.Float.compare(this.d, xroVar.d) != 0 || java.lang.Float.compare(this.e, xroVar.e) != 0 || java.lang.Float.compare(this.f, xroVar.f) != 0 || java.lang.Float.compare(this.g, xroVar.g) != 0 || java.lang.Float.compare(this.h, xroVar.h) != 0 || java.lang.Float.compare(this.i, xroVar.i) != 0 || java.lang.Float.compare(this.j, xroVar.j) != 0 || java.lang.Float.compare(this.k, xroVar.k) != 0 || java.lang.Float.compare(this.l, xroVar.l) != 0 || java.lang.Float.compare(this.m, xroVar.m) != 0) {
            return false;
        }
        boolean z = xroVar.p;
        return defpackage.afga.f(this.n, xroVar.n);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((this.a.hashCode() * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + this.c) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.f)) * 31) + java.lang.Float.floatToIntBits(this.g)) * 31) + java.lang.Float.floatToIntBits(this.h)) * 31) + java.lang.Float.floatToIntBits(this.i)) * 31) + java.lang.Float.floatToIntBits(this.j)) * 31) + java.lang.Float.floatToIntBits(this.k)) * 31) + java.lang.Float.floatToIntBits(this.l)) * 31) + java.lang.Float.floatToIntBits(this.m)) * 31) + 1237) * 31) + this.n.hashCode();
    }

    public final java.lang.String toString() {
        return "DotsConfig(mask=" + defpackage.xrp.a(this.a) + ", alpha=" + this.b + ", color=" + this.c + ", yFractGradientWeight=" + this.d + ", waveFrequency=" + this.e + ", waveAmplitude=" + this.f + ", waveSpeed=" + this.g + ", maskInnerStrokeWidth=" + this.h + ", maskOuterStrokeWidth=" + this.i + ", gridSize=" + this.j + ", maxRadius=" + this.k + ", minRadius=" + this.l + ", hdrBoost=" + this.m + ", showMaskOnly=false, internalDotsConfig=" + this.n + ")";
    }

    public xro(java.lang.String str, float f, int i, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, defpackage.xrw xrwVar) {
        xrwVar.getClass();
        this.a = str;
        this.b = f;
        this.c = i;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = f7;
        this.j = f8;
        this.k = f9;
        this.l = f10;
        this.m = f11;
        this.p = false;
        this.n = xrwVar;
    }
}
