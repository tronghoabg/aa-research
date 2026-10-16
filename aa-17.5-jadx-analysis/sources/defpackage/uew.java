package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class uew {
    public double b;
    private final tpf j = new tpf();
    public final tpf a = new tpf();
    protected final tpf c = new tpf();
    protected final tpf d = new tpf();
    protected final tpf e = new tpf();
    protected final tpf f = new tpf();
    protected final tpf g = new tpf();
    protected final tpf h = new tpf();
    public final uev i = new uev();

    private final boolean i(tpf tpfVar, tpf tpfVar2) {
        float fB = tpfVar2.b(tpfVar2);
        float fAbs = Math.abs(tpfVar.b(tpfVar2));
        return fAbs >= fB && fAbs >= fB + (Math.abs(this.c.b(tpfVar2)) + Math.abs(this.d.b(tpfVar2)));
    }

    private static boolean j(tpf tpfVar, tpf tpfVar2, uev uevVar) {
        float fB = tpfVar2.b(tpfVar2);
        float fAbs = Math.abs(tpfVar.b(tpfVar2));
        return fAbs >= fB && fAbs >= fB + (Math.abs((uevVar.b() / 2.0f) * tpfVar2.b) + Math.abs((uevVar.a() / 2.0f) * tpfVar2.c));
    }

    public final float a() {
        return this.d.c();
    }

    public final float b() {
        return this.c.c();
    }

    public final tpf c(int i) {
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
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void d(tpf tpfVar) {
        tpf tpfVar2 = this.a;
        tpf.g(tpfVar2, tpfVar, tpfVar2);
        tpf tpfVar3 = this.e;
        tpf.g(tpfVar3, tpfVar, tpfVar3);
        tpf tpfVar4 = this.f;
        tpf.g(tpfVar4, tpfVar, tpfVar4);
        tpf tpfVar5 = this.g;
        tpf.g(tpfVar5, tpfVar, tpfVar5);
        tpf tpfVar6 = this.h;
        tpf.g(tpfVar6, tpfVar, tpfVar6);
        uev uevVar = this.i;
        float f = tpfVar.b;
        float f2 = tpfVar.c;
        uevVar.a += f;
        uevVar.b += f2;
        uevVar.c += f;
        uevVar.d += f2;
        tpf tpfVar7 = uevVar.e;
        tpf.g(tpfVar7, tpfVar, tpfVar7);
    }

    public final boolean e(tpf tpfVar) {
        double d = this.b;
        if (d > -0.0010000000474974513d && d < 0.0010000000474974513d) {
            return this.i.d(tpfVar);
        }
        if (!this.i.d(tpfVar)) {
            return false;
        }
        tpf tpfVar2 = this.h;
        tpf tpfVar3 = this.e;
        if (tpf.a(tpfVar2, tpfVar3, tpfVar) >= BitmapDescriptorFactory.HUE_RED) {
            tpf tpfVar4 = this.f;
            if (tpf.a(tpfVar3, tpfVar4, tpfVar) >= BitmapDescriptorFactory.HUE_RED) {
                tpf tpfVar5 = this.g;
                if (tpf.a(tpfVar4, tpfVar5, tpfVar) >= BitmapDescriptorFactory.HUE_RED && tpf.a(tpfVar5, tpfVar2, tpfVar) >= BitmapDescriptorFactory.HUE_RED) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uew) {
            uew uewVar = (uew) obj;
            if (this.a.equals(uewVar.a) && this.c.equals(uewVar.c) && this.d.equals(uewVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(uev uevVar) {
        if (!uevVar.e(this.i)) {
            return false;
        }
        double d = this.b;
        if (d > -0.0010000000474974513d && d < 0.0010000000474974513d) {
            return true;
        }
        tpf tpfVar = uevVar.e;
        if (!e(tpfVar)) {
            tpf tpfVar2 = this.a;
            if (!uevVar.d(tpfVar2)) {
                tpf tpfVar3 = this.j;
                tpf.p(tpfVar, tpfVar2, tpfVar3);
                return (j(tpfVar3, this.d, uevVar) || j(tpfVar3, this.c, uevVar)) ? false : true;
            }
        }
        return true;
    }

    public final boolean g(uew uewVar) {
        double d = this.b;
        if (d > -0.0010000000474974513d && d < 0.0010000000474974513d) {
            double d2 = uewVar.b;
            if (d2 > -0.0010000000474974513d && d2 < 0.0010000000474974513d) {
                return this.i.e(uewVar.i);
            }
        }
        if (!this.i.e(uewVar.i)) {
            return false;
        }
        tpf tpfVar = uewVar.a;
        if (!e(tpfVar)) {
            tpf tpfVar2 = this.a;
            if (!uewVar.e(tpfVar2)) {
                tpf tpfVar3 = this.j;
                tpf.p(tpfVar, tpfVar2, tpfVar3);
                return (i(tpfVar3, uewVar.d) || uewVar.i(tpfVar3, this.d) || i(tpfVar3, uewVar.c) || uewVar.i(tpfVar3, this.c)) ? false : true;
            }
        }
        return true;
    }

    public final void h(float f, float f2, double d, float f3, float f4) {
        this.a.n(f, f2);
        this.b = d;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f5 = f3 * fCos;
        float f6 = f3 * fSin;
        this.c.n(f5, f6);
        float f7 = (-fSin) * f4;
        float f8 = f4 * fCos;
        this.d.n(f7, f8);
        float f9 = f2 + f6;
        float f10 = f + f5;
        tpf tpfVar = this.e;
        tpfVar.n(f10 + f7, f9 + f8);
        float f11 = f2 - f6;
        float f12 = f - f5;
        tpf tpfVar2 = this.f;
        tpfVar2.n(f12 + f7, f11 + f8);
        tpf tpfVar3 = this.g;
        tpfVar3.n(f12 - f7, f11 - f8);
        tpf tpfVar4 = this.h;
        tpfVar4.n(f10 - f7, f9 - f8);
        float f13 = tpfVar.b;
        float f14 = tpfVar.c;
        float f15 = tpfVar2.b;
        if (f15 < f13) {
            f15 = f13;
            f13 = f15;
        } else if (f15 <= f13) {
            f15 = f13;
        }
        float f16 = tpfVar2.c;
        if (f16 < f14) {
            f16 = f14;
            f14 = f16;
        } else if (f16 <= f14) {
            f16 = f14;
        }
        float f17 = tpfVar3.b;
        if (f17 < f13) {
            f13 = f17;
        } else if (f17 > f15) {
            f15 = f17;
        }
        float f18 = tpfVar3.c;
        if (f18 < f14) {
            f14 = f18;
        } else if (f18 > f16) {
            f16 = f18;
        }
        float f19 = tpfVar4.b;
        if (f19 < f13) {
            f13 = f19;
        } else if (f19 > f15) {
            f15 = f19;
        }
        float f20 = tpfVar4.c;
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

    public final String toString() {
        return "OBB{center: " + this.a.toString() + " angle " + this.b + " abscissa: " + this.c.toString() + " ordinate: " + this.d.toString() + "}";
    }
}
