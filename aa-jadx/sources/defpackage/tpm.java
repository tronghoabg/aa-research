package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tpm implements java.lang.Comparable, java.io.Serializable {
    public int a;
    public int b;
    public int c;

    public tpm(defpackage.tpm tpmVar) {
        this.a = tpmVar.a;
        this.b = tpmVar.b;
        this.c = tpmVar.c;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static float e(defpackage.tpm tpmVar, defpackage.tpm tpmVar2, defpackage.tpm tpmVar3, defpackage.tpm tpmVar4) {
        int i = tpmVar2.a;
        int i2 = tpmVar.a;
        int i3 = tpmVar2.b;
        int i4 = tpmVar.b;
        int i5 = tpmVar2.c;
        int i6 = tpmVar.c;
        float f = i5 - i6;
        float f2 = i3 - i4;
        float f3 = i - i2;
        float f4 = (((f3 * (tpmVar3.a - i2)) + (f2 * (tpmVar3.b - i4))) + (f * (tpmVar3.c - i6))) / (((f3 * f3) + (f2 * f2)) + (f * f));
        if (f4 <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            tpmVar4.A(tpmVar);
        } else if (f4 >= 1.0f) {
            tpmVar4.A(tpmVar2);
        } else {
            p(tpmVar, tpmVar2, f4, tpmVar4);
        }
        return tpmVar3.d(tpmVar4);
    }

    public static int f(int i) {
        if (i < -536870912) {
            return -536870912;
        }
        if (i >= 536870912) {
            return 536870911;
        }
        return i;
    }

    public static defpackage.tpm i(defpackage.tpm tpmVar) {
        return new defpackage.tpm(tpmVar.a, tpmVar.b, tpmVar.c);
    }

    public static defpackage.tpm j(int i, int i2) {
        return l(((double) i) * 1.0E-7d, ((double) i2) * 1.0E-7d);
    }

    public static defpackage.tpm k(defpackage.tpg tpgVar) {
        if (tpgVar == null) {
            return null;
        }
        return l(tpgVar.a, tpgVar.b);
    }

    public static defpackage.tpm l(double d, double d2) {
        defpackage.tpm tpmVar = new defpackage.tpm();
        tpmVar.t(d, d2);
        return tpmVar;
    }

    public static void n(defpackage.tpm tpmVar, defpackage.tpm tpmVar2, defpackage.tpm tpmVar3) {
        tpmVar3.a = tpmVar.a + tpmVar2.a;
        tpmVar3.b = tpmVar.b + tpmVar2.b;
        tpmVar3.c = tpmVar.c + tpmVar2.c;
    }

    public static void p(defpackage.tpm tpmVar, defpackage.tpm tpmVar2, float f, defpackage.tpm tpmVar3) {
        int i = tpmVar2.a;
        int i2 = tpmVar.a;
        tpmVar3.a = ((int) ((i - i2) * f)) + i2;
        int i3 = tpmVar2.b;
        int i4 = tpmVar.b;
        tpmVar3.b = ((int) ((i3 - i4) * f)) + i4;
        int i5 = tpmVar2.c;
        int i6 = tpmVar.c;
        tpmVar3.c = ((int) (f * (i5 - i6))) + i6;
    }

    public static void q(defpackage.tpm tpmVar, float f, defpackage.tpm tpmVar2) {
        float f2 = tpmVar.a;
        float f3 = tpmVar.b;
        float f4 = tpmVar.c;
        float fSqrt = (float) java.lang.Math.sqrt((f2 * f2) + (f3 * f3) + (f4 * f4));
        tpmVar2.a = (int) ((tpmVar.a * f) / fSqrt);
        tpmVar2.b = (int) ((tpmVar.b * f) / fSqrt);
        tpmVar2.c = (int) ((tpmVar.c * f) / fSqrt);
    }

    public static void v(defpackage.tpm tpmVar, defpackage.tpm tpmVar2, defpackage.tpm tpmVar3) {
        tpmVar3.a = tpmVar.a - tpmVar2.a;
        tpmVar3.b = tpmVar.b - tpmVar2.b;
        tpmVar3.c = tpmVar.c - tpmVar2.c;
    }

    public static int[] x(double d, double d2) {
        int iRound = (int) java.lang.Math.round(d2 * 0.017453292519943295d * 1.708913188941079E8d);
        if (iRound == 536870912) {
            iRound = d2 < 180.0d ? 536870911 : 536870912;
        }
        return new int[]{iRound, (int) java.lang.Math.min(java.lang.Math.max(java.lang.Math.round(java.lang.Math.log(java.lang.Math.tan((d * 0.017453292519943295d * 0.5d) + 0.7853981633974483d)) * 1.708913188941079E8d), -2147483648L), 2147483647L)};
    }

    public final void A(defpackage.tpm tpmVar) {
        this.a = tpmVar.a;
        this.b = tpmVar.b;
        this.c = tpmVar.c;
    }

    public final double a() {
        double dAtan = java.lang.Math.atan(java.lang.Math.exp(((double) this.b) * 5.8516723170686385E-9d)) - 0.7853981633974483d;
        return (dAtan + dAtan) * 57.29577951308232d;
    }

    public final double b() {
        double d = ((double) this.a) * 5.8516723170686385E-9d * 57.29577951308232d;
        while (d > 180.0d) {
            d -= 360.0d;
        }
        while (d < -180.0d) {
            d += 360.0d;
        }
        return d;
    }

    public final float c(defpackage.tpm tpmVar) {
        return (float) java.lang.Math.sqrt(d(tpmVar));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        defpackage.tpm tpmVar = (defpackage.tpm) obj;
        int i = this.a;
        int i2 = tpmVar.a;
        if (i != i2) {
            return i - i2;
        }
        int i3 = this.b;
        int i4 = tpmVar.b;
        return i3 == i4 ? this.c - tpmVar.c : i3 - i4;
    }

    public final float d(defpackage.tpm tpmVar) {
        int i = this.a - tpmVar.a;
        int i2 = this.b - tpmVar.b;
        int i3 = this.c - tpmVar.c;
        float f = i2;
        float f2 = i;
        float f3 = i3;
        return (f2 * f2) + (f * f) + (f3 * f3);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.tpm) {
            defpackage.tpm tpmVar = (defpackage.tpm) obj;
            if (this.a == tpmVar.a && this.b == tpmVar.b && this.c == tpmVar.c) {
                return true;
            }
        }
        return false;
    }

    public final defpackage.tpg g() {
        return new defpackage.tpg(a(), b());
    }

    public final defpackage.tpm h(defpackage.tpm tpmVar) {
        return new defpackage.tpm(this.a + tpmVar.a, this.b + tpmVar.b, this.c + tpmVar.c);
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = i2 - i3;
        int i5 = ((i - i2) - i3) ^ (i3 >> 13);
        int i6 = (i4 - i5) ^ (i5 << 8);
        int i7 = ((i3 - i5) - i6) ^ (i6 >> 13);
        int i8 = ((i5 - i6) - i7) ^ (i7 >> 12);
        int i9 = ((i6 - i7) - i8) ^ (i8 << 16);
        int i10 = ((i7 - i8) - i9) ^ (i9 >> 5);
        int i11 = ((i8 - i9) - i10) ^ (i10 >> 3);
        int i12 = i10 - i11;
        int i13 = ((i9 - i10) - i11) ^ (i11 << 10);
        return (i12 - i13) ^ (i13 >> 15);
    }

    public final defpackage.tpm m(defpackage.tpm tpmVar) {
        return new defpackage.tpm(this.a - tpmVar.a, this.b - tpmVar.b, this.c - tpmVar.c);
    }

    public final void o(defpackage.tpm tpmVar) {
        tpmVar.a = f(this.a);
        tpmVar.b = f(this.b);
        tpmVar.c = this.c;
    }

    public final void r(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = 0;
    }

    public final void s(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final void t(double d, double d2) {
        int[] iArrX = x(d, d2);
        r(iArrX[0], iArrX[1]);
    }

    public final java.lang.String toString() {
        return "(" + this.a + "," + this.b + "," + this.c + ")";
    }

    public final void u(int i, int i2) {
        t(((double) i) * 1.0E-7d, ((double) i2) * 1.0E-7d);
    }

    public final void w(defpackage.tpm tpmVar) {
        tpmVar.a = defpackage.a.G(this.a);
        tpmVar.b = this.b;
        tpmVar.c = this.c;
    }

    public final void y(defpackage.tpm tpmVar) {
        this.a += tpmVar.a;
        this.b += tpmVar.b;
        this.c += tpmVar.c;
    }

    public final void z(double d) {
        double dCos = java.lang.Math.cos(d);
        double dSin = java.lang.Math.sin(d);
        double d2 = this.a;
        double d3 = this.b;
        this.a = (int) java.lang.Math.round((d2 * dCos) - (d3 * dSin));
        this.b = (int) java.lang.Math.round((d2 * dSin) + (d3 * dCos));
    }

    public tpm(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public tpm(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public tpm() {
    }
}
