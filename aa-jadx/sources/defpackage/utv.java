package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class utv {
    public final defpackage.tuj a;
    public final int b;
    public final int c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final double n;
    public final double o;
    public final double p;
    public final float q;
    public final float r;
    public final float s;
    public final float t;
    public final defpackage.tqh u;
    public final float[] v;
    public final float[] w;
    public final float[] x;
    public final float[] y;

    public utv() {
        this(defpackage.tuj.a, 0, 0, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 0, 0, 0, 0, 0, 0, 0.0d, 0.0d, 0.0d, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, new defpackage.tqh(new defpackage.tpm[]{new defpackage.tpm(), new defpackage.tpm(), new defpackage.tpm(), new defpackage.tpm()}), new float[16], new float[16], new float[16], new float[16]);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.utv) {
            defpackage.utv utvVar = (defpackage.utv) obj;
            if (this.a.equals(utvVar.a) && this.b == utvVar.b && this.c == utvVar.c && this.d == utvVar.d && this.e == utvVar.e && this.f == utvVar.f && this.g == utvVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Float.valueOf(this.d), java.lang.Float.valueOf(this.e), java.lang.Float.valueOf(this.f), java.lang.Float.valueOf(this.g));
    }

    public utv(defpackage.tuj tujVar, int i, int i2, float f, float f2, float f3, float f4, int i3, int i4, int i5, int i6, int i7, int i8, double d, double d2, double d3, float f5, float f6, float f7, float f8, defpackage.tqh tqhVar, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        this.a = tujVar;
        this.b = i;
        this.c = i2;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = i8;
        this.n = d;
        this.o = d2;
        this.p = d3;
        this.q = f5;
        this.r = f6;
        this.s = f7;
        this.t = f8;
        this.u = tqhVar;
        this.w = fArr2;
        this.v = fArr;
        this.x = fArr3;
        this.y = fArr4;
    }
}
