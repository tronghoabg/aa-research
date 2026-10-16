package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class too implements Comparable, Serializable {
    public int a;
    public int b;
    public int c;

    public too(too tooVar) {
        this.a = tooVar.a;
        this.b = tooVar.b;
        this.c = tooVar.c;
    }

    @ResultIgnorabilityUnspecified
    public static float e(too tooVar, too tooVar2, too tooVar3, too tooVar4) {
        int i = tooVar2.a - tooVar.a;
        int i2 = tooVar2.b - tooVar.b;
        float f = tooVar2.c - tooVar.c;
        float f2 = i2;
        float f3 = i;
        float f4 = (((f3 * (tooVar3.a - r1)) + (f2 * (tooVar3.b - r3))) + (f * (tooVar3.c - r5))) / (((f3 * f3) + (f2 * f2)) + (f * f));
        if (f4 <= BitmapDescriptorFactory.HUE_RED) {
            tooVar4.A(tooVar);
        } else if (f4 >= 1.0f) {
            tooVar4.A(tooVar2);
        } else {
            p(tooVar, tooVar2, f4, tooVar4);
        }
        return tooVar3.d(tooVar4);
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

    public static too i(too tooVar) {
        return new too(tooVar.a, tooVar.b, tooVar.c);
    }

    public static too j(int i, int i2) {
        return l(i * 1.0E-7d, i2 * 1.0E-7d);
    }

    public static too k(toi toiVar) {
        if (toiVar == null) {
            return null;
        }
        return l(toiVar.a, toiVar.b);
    }

    public static too l(double d, double d2) {
        too tooVar = new too();
        tooVar.t(d, d2);
        return tooVar;
    }

    public static void n(too tooVar, too tooVar2, too tooVar3) {
        tooVar3.a = tooVar.a + tooVar2.a;
        tooVar3.b = tooVar.b + tooVar2.b;
        tooVar3.c = tooVar.c + tooVar2.c;
    }

    public static void p(too tooVar, too tooVar2, float f, too tooVar3) {
        int i = tooVar2.a;
        tooVar3.a = ((int) ((i - r1) * f)) + tooVar.a;
        int i2 = tooVar2.b;
        tooVar3.b = ((int) ((i2 - r1) * f)) + tooVar.b;
        int i3 = tooVar2.c;
        tooVar3.c = ((int) (f * (i3 - r2))) + tooVar.c;
    }

    public static void q(too tooVar, float f, too tooVar2) {
        float f2 = tooVar.a;
        float f3 = tooVar.b;
        float f4 = tooVar.c;
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f3 * f3) + (f4 * f4));
        tooVar2.a = (int) ((tooVar.a * f) / fSqrt);
        tooVar2.b = (int) ((tooVar.b * f) / fSqrt);
        tooVar2.c = (int) ((tooVar.c * f) / fSqrt);
    }

    public static void v(too tooVar, too tooVar2, too tooVar3) {
        tooVar3.a = tooVar.a - tooVar2.a;
        tooVar3.b = tooVar.b - tooVar2.b;
        tooVar3.c = tooVar.c - tooVar2.c;
    }

    public static int[] x(double d, double d2) {
        int iRound = (int) Math.round(d2 * 0.017453292519943295d * 1.708913188941079E8d);
        if (iRound == 536870912) {
            iRound = d2 < 180.0d ? 536870911 : 536870912;
        }
        return new int[]{iRound, (int) Math.min(Math.max(Math.round(Math.log(Math.tan((d * 0.017453292519943295d * 0.5d) + 0.7853981633974483d)) * 1.708913188941079E8d), -2147483648L), 2147483647L)};
    }

    public final void A(too tooVar) {
        this.a = tooVar.a;
        this.b = tooVar.b;
        this.c = tooVar.c;
    }

    public final double a() {
        double dAtan = Math.atan(Math.exp(this.b * 5.8516723170686385E-9d)) - 0.7853981633974483d;
        return (dAtan + dAtan) * 57.29577951308232d;
    }

    public final double b() {
        double d = this.a * 5.8516723170686385E-9d * 57.29577951308232d;
        while (d > 180.0d) {
            d -= 360.0d;
        }
        while (d < -180.0d) {
            d += 360.0d;
        }
        return d;
    }

    public final float c(too tooVar) {
        return (float) Math.sqrt(d(tooVar));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        too tooVar = (too) obj;
        int i = this.a;
        int i2 = tooVar.a;
        if (i != i2) {
            return i - i2;
        }
        int i3 = this.b;
        int i4 = tooVar.b;
        return i3 == i4 ? this.c - tooVar.c : i3 - i4;
    }

    public final float d(too tooVar) {
        int i = this.a - tooVar.a;
        int i2 = this.b - tooVar.b;
        int i3 = this.c - tooVar.c;
        float f = i2;
        float f2 = i;
        float f3 = i3;
        return (f2 * f2) + (f * f) + (f3 * f3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof too) {
            too tooVar = (too) obj;
            if (this.a == tooVar.a && this.b == tooVar.b && this.c == tooVar.c) {
                return true;
            }
        }
        return false;
    }

    public final toi g() {
        return new toi(a(), b());
    }

    public final too h(too tooVar) {
        return new too(this.a + tooVar.a, this.b + tooVar.b, this.c + tooVar.c);
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

    public final too m(too tooVar) {
        return new too(this.a - tooVar.a, this.b - tooVar.b, this.c - tooVar.c);
    }

    public final void o(too tooVar) {
        tooVar.a = f(this.a);
        tooVar.b = f(this.b);
        tooVar.c = this.c;
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

    public final String toString() {
        return "(" + this.a + "," + this.b + "," + this.c + ")";
    }

    public final void u(int i, int i2) {
        t(i * 1.0E-7d, i2 * 1.0E-7d);
    }

    public final void w(too tooVar) {
        tooVar.a = a.H(this.a);
        tooVar.b = this.b;
        tooVar.c = this.c;
    }

    public final void y(too tooVar) {
        this.a += tooVar.a;
        this.b += tooVar.b;
        this.c += tooVar.c;
    }

    public final void z(double d) {
        double dCos = Math.cos(d);
        double dSin = Math.sin(d);
        double d2 = this.a;
        double d3 = this.b;
        this.a = (int) Math.round((d2 * dCos) - (d3 * dSin));
        this.b = (int) Math.round((d2 * dSin) + (d3 * dCos));
    }

    public too(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public too(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public too() {
    }
}
