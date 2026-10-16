package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class tpf {
    public static final tpf a = new tpf();
    public float b;
    public float c;

    public tpf(tpf tpfVar) {
        this.b = tpfVar.b;
        this.c = tpfVar.c;
    }

    public static float a(tpf tpfVar, tpf tpfVar2, tpf tpfVar3) {
        float f = tpfVar2.b;
        float f2 = tpfVar.b;
        float f3 = tpfVar2.c;
        float f4 = tpfVar.c;
        return ((f - f2) * (tpfVar3.c - f4)) - ((f3 - f4) * (tpfVar3.b - f2));
    }

    public static void d(tpf tpfVar, tpf tpfVar2, float f, tpf tpfVar3) {
        float f2 = tpfVar2.b;
        float f3 = tpfVar.b;
        tpfVar3.b = ((f2 - f3) * f) + f3;
        float f4 = tpfVar2.c;
        float f5 = tpfVar.c;
        tpfVar3.c = (f * (f4 - f5)) + f5;
    }

    public static void e(tpf tpfVar, tpf tpfVar2, tpf tpfVar3) {
        float f = tpfVar2.b;
        float f2 = tpfVar2.c;
        float f3 = tpfVar.b;
        float f4 = tpfVar.c;
        tpfVar3.b = (f3 * f) - (f4 * f2);
        tpfVar3.c = (f3 * f2) + (f4 * f);
    }

    public static void g(tpf tpfVar, tpf tpfVar2, tpf tpfVar3) {
        tpfVar3.b = tpfVar.b + tpfVar2.b;
        tpfVar3.c = tpfVar.c + tpfVar2.c;
    }

    public static void h(tpf tpfVar, float f, tpf tpfVar2) {
        tpfVar2.b = tpfVar.b / f;
        tpfVar2.c = tpfVar.c / f;
    }

    public static void i(tpf tpfVar, float f, tpf tpfVar2) {
        tpfVar2.b = tpfVar.b * f;
        tpfVar2.c = tpfVar.c * f;
    }

    public static void j(tpf tpfVar, tpf tpfVar2) {
        tpfVar2.b = -tpfVar.b;
        tpfVar2.c = -tpfVar.c;
    }

    public static void k(tpf tpfVar, tpf tpfVar2) {
        float fC = tpfVar.c();
        if (fC == BitmapDescriptorFactory.HUE_RED) {
            tpfVar2.b = BitmapDescriptorFactory.HUE_RED;
            tpfVar2.c = BitmapDescriptorFactory.HUE_RED;
        } else {
            tpfVar2.b = tpfVar.b / fC;
            tpfVar2.c = tpfVar.c / fC;
        }
    }

    public static void l(tpf tpfVar, tpf tpfVar2) {
        float f = tpfVar.b;
        tpfVar2.b = -tpfVar.c;
        tpfVar2.c = f;
    }

    public static void p(tpf tpfVar, tpf tpfVar2, tpf tpfVar3) {
        tpfVar3.b = tpfVar.b - tpfVar2.b;
        tpfVar3.c = tpfVar.c - tpfVar2.c;
    }

    public final float b(tpf tpfVar) {
        return (this.b * tpfVar.b) + (this.c * tpfVar.c);
    }

    public final float c() {
        return (float) Math.hypot(this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (obj.getClass() == getClass()) {
                tpf tpfVar = (tpf) obj;
                if (this.b == tpfVar.b && this.c == tpfVar.c) {
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
        return Float.floatToIntBits(this.c) ^ Float.floatToIntBits(this.b);
    }

    public final void m(float f) {
        this.b *= f;
        this.c *= f;
    }

    public final void n(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public final void o(tpf tpfVar) {
        this.b = tpfVar.b;
        this.c = tpfVar.c;
    }

    public final String toString() {
        return "(" + this.b + "," + this.c + ")";
    }

    public tpf(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public tpf() {
        this.b = BitmapDescriptorFactory.HUE_RED;
        this.c = BitmapDescriptorFactory.HUE_RED;
    }
}
