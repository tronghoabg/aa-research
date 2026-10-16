package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tqd {
    public static final defpackage.tqd a = new defpackage.tqd();
    public float b;
    public float c;

    public tqd(defpackage.tqd tqdVar) {
        this.b = tqdVar.b;
        this.c = tqdVar.c;
    }

    public static float a(defpackage.tqd tqdVar, defpackage.tqd tqdVar2, defpackage.tqd tqdVar3) {
        float f = tqdVar2.b;
        float f2 = tqdVar.b;
        float f3 = tqdVar2.c;
        float f4 = tqdVar.c;
        return ((f - f2) * (tqdVar3.c - f4)) - ((f3 - f4) * (tqdVar3.b - f2));
    }

    public static void d(defpackage.tqd tqdVar, defpackage.tqd tqdVar2, float f, defpackage.tqd tqdVar3) {
        float f2 = tqdVar2.b;
        float f3 = tqdVar.b;
        tqdVar3.b = ((f2 - f3) * f) + f3;
        float f4 = tqdVar2.c;
        float f5 = tqdVar.c;
        tqdVar3.c = (f * (f4 - f5)) + f5;
    }

    public static void e(defpackage.tqd tqdVar, defpackage.tqd tqdVar2, defpackage.tqd tqdVar3) {
        float f = tqdVar2.b;
        float f2 = tqdVar2.c;
        float f3 = tqdVar.b;
        float f4 = tqdVar.c;
        tqdVar3.b = (f3 * f) - (f4 * f2);
        tqdVar3.c = (f3 * f2) + (f4 * f);
    }

    public static void g(defpackage.tqd tqdVar, defpackage.tqd tqdVar2, defpackage.tqd tqdVar3) {
        tqdVar3.b = tqdVar.b + tqdVar2.b;
        tqdVar3.c = tqdVar.c + tqdVar2.c;
    }

    public static void h(defpackage.tqd tqdVar, float f, defpackage.tqd tqdVar2) {
        tqdVar2.b = tqdVar.b / f;
        tqdVar2.c = tqdVar.c / f;
    }

    public static void i(defpackage.tqd tqdVar, float f, defpackage.tqd tqdVar2) {
        tqdVar2.b = tqdVar.b * f;
        tqdVar2.c = tqdVar.c * f;
    }

    public static void j(defpackage.tqd tqdVar, defpackage.tqd tqdVar2) {
        tqdVar2.b = -tqdVar.b;
        tqdVar2.c = -tqdVar.c;
    }

    public static void k(defpackage.tqd tqdVar, defpackage.tqd tqdVar2) {
        float fC = tqdVar.c();
        if (fC == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            tqdVar2.b = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            tqdVar2.c = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        } else {
            tqdVar2.b = tqdVar.b / fC;
            tqdVar2.c = tqdVar.c / fC;
        }
    }

    public static void l(defpackage.tqd tqdVar, defpackage.tqd tqdVar2) {
        float f = tqdVar.b;
        tqdVar2.b = -tqdVar.c;
        tqdVar2.c = f;
    }

    public static void p(defpackage.tqd tqdVar, defpackage.tqd tqdVar2, defpackage.tqd tqdVar3) {
        tqdVar3.b = tqdVar.b - tqdVar2.b;
        tqdVar3.c = tqdVar.c - tqdVar2.c;
    }

    public final float b(defpackage.tqd tqdVar) {
        return (this.b * tqdVar.b) + (this.c * tqdVar.c);
    }

    public final float c() {
        return (float) java.lang.Math.hypot(this.b, this.c);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (obj.getClass() == getClass()) {
                defpackage.tqd tqdVar = (defpackage.tqd) obj;
                if (this.b == tqdVar.b && this.c == tqdVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(float f, float f2) {
        this.b += f;
        this.c += f2;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.c) ^ java.lang.Float.floatToIntBits(this.b);
    }

    public final void m(float f) {
        this.b *= f;
        this.c *= f;
    }

    public final void n(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public final void o(defpackage.tqd tqdVar) {
        this.b = tqdVar.b;
        this.c = tqdVar.c;
    }

    public final java.lang.String toString() {
        return "(" + this.b + "," + this.c + ")";
    }

    public tqd(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public tqd() {
        this.b = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.c = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }
}
