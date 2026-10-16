package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xry {
    public static final float[] a = defpackage.xue.e(10000.0f);
    public final java.lang.Float b;
    public final java.lang.Float c;
    public final float[] d;
    public final float e;
    public final float f;
    public final float[] g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final float k;
    public final java.lang.String l;
    public final float m;
    public final float n;
    private final java.lang.Float o;
    private final java.lang.Float p;
    private final float q;

    public /* synthetic */ xry(java.lang.Float f, java.lang.Float f2, float[] fArr, float f3, float f4, float[] fArr2, boolean z, boolean z2, boolean z3, float f5, java.lang.String str, int i) {
        fArr = (i & 16) != 0 ? defpackage.xue.e(32.0f) : fArr;
        f3 = (i & 32) != 0 ? 0.5f : f3;
        f4 = (i & 64) != 0 ? 0.5f : f4;
        fArr2 = (i & 128) != 0 ? defpackage.xuf.g() : fArr2;
        int i2 = i & 8;
        int i3 = i & 4;
        f2 = i2 != 0 ? null : f2;
        f = i3 != 0 ? null : f;
        fArr.getClass();
        fArr2.getClass();
        str.getClass();
        this.o = null;
        this.p = null;
        this.b = f;
        this.c = f2;
        this.d = fArr;
        this.e = f3;
        this.f = f4;
        this.g = fArr2;
        this.q = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = f5;
        this.l = str;
        this.m = java.lang.Math.max(defpackage.xue.c(fArr) + defpackage.xue.a(fArr), defpackage.xue.d(fArr) + defpackage.xue.b(fArr));
        this.n = java.lang.Math.max(defpackage.xue.c(fArr) + defpackage.xue.d(fArr), defpackage.xue.a(fArr) + defpackage.xue.b(fArr));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.xry)) {
            return false;
        }
        defpackage.xry xryVar = (defpackage.xry) obj;
        java.lang.Float f = xryVar.o;
        if (!defpackage.afga.f(null, null)) {
            return false;
        }
        java.lang.Float f2 = xryVar.p;
        if (!defpackage.afga.f(null, null) || !defpackage.afga.f(this.b, xryVar.b) || !defpackage.afga.f(this.c, xryVar.c) || !defpackage.afga.f(this.d, xryVar.d) || java.lang.Float.compare(this.e, xryVar.e) != 0 || java.lang.Float.compare(this.f, xryVar.f) != 0 || !defpackage.afga.f(this.g, xryVar.g)) {
            return false;
        }
        float f3 = xryVar.q;
        if (this.h != xryVar.h || this.i != xryVar.i || this.j != xryVar.j || java.lang.Float.compare(this.k, xryVar.k) != 0) {
            return false;
        }
        java.lang.String str = this.l;
        java.lang.String str2 = xryVar.l;
        java.lang.String str3 = defpackage.xse.a;
        return defpackage.afga.f(str, str2);
    }

    public final int hashCode() {
        java.lang.Float f = this.b;
        int iHashCode = f == null ? 0 : f.hashCode();
        java.lang.Float f2 = this.c;
        int iHashCode2 = (((((((((((((((((iHashCode * 31) + (f2 != null ? f2.hashCode() : 0)) * 31) + java.util.Arrays.hashCode(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.f)) * 31) + java.util.Arrays.hashCode(this.g)) * 961) + defpackage.a.e(this.h)) * 31) + defpackage.a.e(this.i)) * 31) + defpackage.a.e(this.j)) * 31) + java.lang.Float.floatToIntBits(this.k);
        java.lang.String str = this.l;
        java.lang.String str2 = defpackage.xse.a;
        return (iHashCode2 * 31) + str.hashCode();
    }

    public final java.lang.String toString() {
        return "LayoutConfig(centerX=null, centerY=null, height=" + this.b + ", width=" + this.c + ", cornerRadii=" + ("CornerRadii(values=" + java.util.Arrays.toString(this.d) + ")") + ", anchorPercentX=" + this.e + ", anchorPercentY=" + this.f + ", margins=" + ("Margins(values=" + java.util.Arrays.toString(this.g) + ")") + ", padding=0.0, updateHeightForBounds=" + this.h + ", updateWidthForBounds=" + this.i + ", limitRadiiByBounds=" + this.j + ", spread=" + this.k + ", shape=" + defpackage.xse.b(this.l) + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ xry() {
        float[] fArrE = defpackage.xue.e(32.0f);
        float[] fArrG = defpackage.xuf.g();
        float f = 0.5f;
        this(null, null, fArrE, f, f, fArrG, true, true, true, (defpackage.xuf.b(fArrG) + defpackage.xuf.f(fArrG)) / 4.0f, defpackage.xse.a, 3);
    }
}
