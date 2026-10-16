package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ufs {
    public double b;
    private final defpackage.tqd j = new defpackage.tqd();
    public final defpackage.tqd a = new defpackage.tqd();
    protected final defpackage.tqd c = new defpackage.tqd();
    protected final defpackage.tqd d = new defpackage.tqd();
    protected final defpackage.tqd e = new defpackage.tqd();
    protected final defpackage.tqd f = new defpackage.tqd();
    protected final defpackage.tqd g = new defpackage.tqd();
    protected final defpackage.tqd h = new defpackage.tqd();
    public final defpackage.ufr i = new defpackage.ufr();

    private final boolean i(defpackage.tqd tqdVar, defpackage.tqd tqdVar2) {
        float fB = tqdVar2.b(tqdVar2);
        float fAbs = java.lang.Math.abs(tqdVar.b(tqdVar2));
        return fAbs >= fB && fAbs >= fB + (java.lang.Math.abs(this.c.b(tqdVar2)) + java.lang.Math.abs(this.d.b(tqdVar2)));
    }

    private static boolean j(defpackage.tqd tqdVar, defpackage.tqd tqdVar2, defpackage.ufr ufrVar) {
        float fB = tqdVar2.b(tqdVar2);
        float fAbs = java.lang.Math.abs(tqdVar.b(tqdVar2));
        return fAbs >= fB && fAbs >= fB + (java.lang.Math.abs((ufrVar.b() / 2.0f) * tqdVar2.b) + java.lang.Math.abs((ufrVar.a() / 2.0f) * tqdVar2.c));
    }

    public final float a() {
        return this.d.c();
    }

    public final float b() {
        return this.c.c();
    }

    public final defpackage.tqd c(int i) {
        if (i == 0) {
            return this.e;
        }
        if (i == 1) {
            return this.f;
        }
        if (i == 2) {
            return this.g;
        }
        if (i == 3) {
            return this.h;
        }
        throw new java.lang.ArrayIndexOutOfBoundsException();
    }

    public final void d(defpackage.tqd tqdVar) {
        defpackage.tqd tqdVar2 = this.a;
        defpackage.tqd.g(tqdVar2, tqdVar, tqdVar2);
        defpackage.tqd tqdVar3 = this.e;
        defpackage.tqd.g(tqdVar3, tqdVar, tqdVar3);
        defpackage.tqd tqdVar4 = this.f;
        defpackage.tqd.g(tqdVar4, tqdVar, tqdVar4);
        defpackage.tqd tqdVar5 = this.g;
        defpackage.tqd.g(tqdVar5, tqdVar, tqdVar5);
        defpackage.tqd tqdVar6 = this.h;
        defpackage.tqd.g(tqdVar6, tqdVar, tqdVar6);
        defpackage.ufr ufrVar = this.i;
        float f = tqdVar.b;
        float f2 = tqdVar.c;
        ufrVar.a += f;
        ufrVar.b += f2;
        ufrVar.c += f;
        ufrVar.d += f2;
        defpackage.tqd tqdVar7 = ufrVar.e;
        defpackage.tqd.g(tqdVar7, tqdVar, tqdVar7);
    }

    public final boolean e(defpackage.tqd tqdVar) {
        double d = this.b;
        if (d > -0.0010000000474974513d && d < 0.0010000000474974513d) {
            return this.i.d(tqdVar);
        }
        if (!this.i.d(tqdVar)) {
            return false;
        }
        defpackage.tqd tqdVar2 = this.h;
        defpackage.tqd tqdVar3 = this.e;
        if (defpackage.tqd.a(tqdVar2, tqdVar3, tqdVar) >= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            defpackage.tqd tqdVar4 = this.f;
            if (defpackage.tqd.a(tqdVar3, tqdVar4, tqdVar) >= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                defpackage.tqd tqdVar5 = this.g;
                if (defpackage.tqd.a(tqdVar4, tqdVar5, tqdVar) >= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED && defpackage.tqd.a(tqdVar5, tqdVar2, tqdVar) >= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ufs) {
            defpackage.ufs ufsVar = (defpackage.ufs) obj;
            if (this.a.equals(ufsVar.a) && this.c.equals(ufsVar.c) && this.d.equals(ufsVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(defpackage.ufr ufrVar) {
        if (!ufrVar.e(this.i)) {
            return false;
        }
        double d = this.b;
        if (d > -0.0010000000474974513d && d < 0.0010000000474974513d) {
            return true;
        }
        defpackage.tqd tqdVar = ufrVar.e;
        if (!e(tqdVar)) {
            defpackage.tqd tqdVar2 = this.a;
            if (!ufrVar.d(tqdVar2)) {
                defpackage.tqd tqdVar3 = this.j;
                defpackage.tqd.p(tqdVar, tqdVar2, tqdVar3);
                return (j(tqdVar3, this.d, ufrVar) || j(tqdVar3, this.c, ufrVar)) ? false : true;
            }
        }
        return true;
    }

    public final boolean g(defpackage.ufs ufsVar) {
        double d = this.b;
        if (d > -0.0010000000474974513d && d < 0.0010000000474974513d) {
            double d2 = ufsVar.b;
            if (d2 > -0.0010000000474974513d && d2 < 0.0010000000474974513d) {
                return this.i.e(ufsVar.i);
            }
        }
        if (!this.i.e(ufsVar.i)) {
            return false;
        }
        defpackage.tqd tqdVar = ufsVar.a;
        if (!e(tqdVar)) {
            defpackage.tqd tqdVar2 = this.a;
            if (!ufsVar.e(tqdVar2)) {
                defpackage.tqd tqdVar3 = this.j;
                defpackage.tqd.p(tqdVar, tqdVar2, tqdVar3);
                return (i(tqdVar3, ufsVar.d) || ufsVar.i(tqdVar3, this.d) || i(tqdVar3, ufsVar.c) || ufsVar.i(tqdVar3, this.c)) ? false : true;
            }
        }
        return true;
    }

    public final void h(float f, float f2, double d, float f3, float f4) {
        this.a.n(f, f2);
        this.b = d;
        float fCos = (float) java.lang.Math.cos(d);
        float fSin = (float) java.lang.Math.sin(d);
        float f5 = f3 * fCos;
        float f6 = f3 * fSin;
        this.c.n(f5, f6);
        float f7 = (-fSin) * f4;
        float f8 = f4 * fCos;
        this.d.n(f7, f8);
        float f9 = f2 + f6;
        float f10 = f + f5;
        defpackage.tqd tqdVar = this.e;
        tqdVar.n(f10 + f7, f9 + f8);
        float f11 = f2 - f6;
        float f12 = f - f5;
        defpackage.tqd tqdVar2 = this.f;
        tqdVar2.n(f12 + f7, f11 + f8);
        defpackage.tqd tqdVar3 = this.g;
        tqdVar3.n(f12 - f7, f11 - f8);
        defpackage.tqd tqdVar4 = this.h;
        tqdVar4.n(f10 - f7, f9 - f8);
        float f13 = tqdVar.b;
        float f14 = tqdVar.c;
        float f15 = tqdVar2.b;
        if (f15 < f13) {
            f15 = f13;
            f13 = f15;
        } else if (f15 <= f13) {
            f15 = f13;
        }
        float f16 = tqdVar2.c;
        if (f16 < f14) {
            f16 = f14;
            f14 = f16;
        } else if (f16 <= f14) {
            f16 = f14;
        }
        float f17 = tqdVar3.b;
        if (f17 < f13) {
            f13 = f17;
        } else if (f17 > f15) {
            f15 = f17;
        }
        float f18 = tqdVar3.c;
        if (f18 < f14) {
            f14 = f18;
        } else if (f18 > f16) {
            f16 = f18;
        }
        float f19 = tqdVar4.b;
        if (f19 < f13) {
            f13 = f19;
        } else if (f19 > f15) {
            f15 = f19;
        }
        float f20 = tqdVar4.c;
        if (f20 < f14) {
            f14 = f20;
        } else if (f20 > f16) {
            f16 = f20;
        }
        this.i.c(f13, f14, f15, f16);
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 31) * 31) ^ this.c.hashCode();
        return this.d.hashCode() ^ (iHashCode * 31);
    }

    public final java.lang.String toString() {
        return "OBB{center: " + this.a.toString() + " angle " + this.b + " abscissa: " + this.c.toString() + " ordinate: " + this.d.toString() + "}";
    }
}
