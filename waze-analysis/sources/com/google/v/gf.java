package com.google.v;

import com.waze.strings.DisplayStrings;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gf {

    /* renamed from: a, reason: collision with root package name */
    private static final gf f12997a = new gf(0, new int[0], new Object[0], false);

    /* renamed from: b, reason: collision with root package name */
    private int f12998b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f12999c;

    /* renamed from: d, reason: collision with root package name */
    private Object[] f13000d;

    /* renamed from: e, reason: collision with root package name */
    private int f13001e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f13002f;

    private gf(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f13001e = -1;
        this.f12998b = i2;
        this.f12999c = iArr;
        this.f13000d = objArr;
        this.f13002f = z;
    }

    public static gf c() {
        return f12997a;
    }

    static gf d(gf gfVar, gf gfVar2) {
        int i2 = gfVar.f12998b + gfVar2.f12998b;
        int[] iArrCopyOf = Arrays.copyOf(gfVar.f12999c, i2);
        System.arraycopy(gfVar2.f12999c, 0, iArrCopyOf, gfVar.f12998b, gfVar2.f12998b);
        Object[] objArrCopyOf = Arrays.copyOf(gfVar.f13000d, i2);
        System.arraycopy(gfVar2.f13000d, 0, objArrCopyOf, gfVar.f12998b, gfVar2.f12998b);
        return new gf(i2, iArrCopyOf, objArrCopyOf, true);
    }

    static gf e() {
        return new gf();
    }

    private final void n(int i2) {
        int[] iArr = this.f12999c;
        if (i2 > iArr.length) {
            int i3 = this.f12998b;
            int i4 = i3 + (i3 / 2);
            if (i4 >= i2) {
                i2 = i4;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.f12999c = Arrays.copyOf(iArr, i2);
            this.f13000d = Arrays.copyOf(this.f13000d, i2);
        }
    }

    public final int a() {
        int iX;
        int i2 = this.f13001e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f12998b; i4++) {
            int i5 = this.f12999c[i4];
            int iA = go.a(i5);
            int iB = go.b(i5);
            if (iB == 0) {
                iX = ae.X(iA, ((Long) this.f13000d[i4]).longValue());
            } else if (iB == 1) {
                ((Long) this.f13000d[i4]).longValue();
                iX = ae.aq(iA);
            } else if (iB == 2) {
                iX = ae.F(iA, (v) this.f13000d[i4]);
            } else if (iB == 3) {
                int iU = ae.U(iA);
                iX = iU + iU + ((gf) this.f13000d[i4]).a();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(new et());
                }
                ((Integer) this.f13000d[i4]).intValue();
                iX = ae.ap(iA);
            }
            i3 += iX;
        }
        this.f13001e = i3;
        return i3;
    }

    public final int b() {
        int i2 = this.f13001e;
        if (i2 != -1) {
            return i2;
        }
        int iV = 0;
        for (int i3 = 0; i3 < this.f12998b; i3++) {
            int iA = go.a(this.f12999c[i3]);
            v vVar = (v) this.f13000d[i3];
            int iU = ae.U(1);
            iV += iU + iU + ae.V(2, iA) + ae.F(3, vVar);
        }
        this.f13001e = iV;
        return iV;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gf)) {
            return false;
        }
        gf gfVar = (gf) obj;
        int i2 = this.f12998b;
        if (i2 == gfVar.f12998b) {
            int[] iArr = this.f12999c;
            int[] iArr2 = gfVar.f12999c;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.f13000d;
                    Object[] objArr2 = gfVar.f13000d;
                    int i4 = this.f12998b;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (objArr[i5].equals(objArr2[i5])) {
                        }
                    }
                    return true;
                }
                if (iArr[i3] != iArr2[i3]) {
                    break;
                }
                i3++;
            }
        }
        return false;
    }

    final void f() {
        if (!this.f13002f) {
            throw new UnsupportedOperationException();
        }
    }

    public final void g() {
        if (this.f13002f) {
            this.f13002f = false;
        }
    }

    final void h(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.f12998b; i3++) {
            fk.b(sb, i2, String.valueOf(go.a(this.f12999c[i3])), this.f13000d[i3]);
        }
    }

    public final int hashCode() {
        int i2 = this.f12998b;
        int i3 = i2 + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL;
        int[] iArr = this.f12999c;
        int iHashCode = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i3 * 31) + i4) * 31;
        Object[] objArr = this.f13000d;
        int i7 = this.f12998b;
        for (int i8 = 0; i8 < i7; i8++) {
            iHashCode = (iHashCode * 31) + objArr[i8].hashCode();
        }
        return i6 + iHashCode;
    }

    final void i(int i2, Object obj) {
        f();
        n(this.f12998b + 1);
        int[] iArr = this.f12999c;
        int i3 = this.f12998b;
        iArr[i3] = i2;
        this.f13000d[i3] = obj;
        this.f12998b = i3 + 1;
    }

    final void j(af afVar) {
        for (int i2 = 0; i2 < this.f12998b; i2++) {
            afVar.x(go.a(this.f12999c[i2]), this.f13000d[i2]);
        }
    }

    public final void k(af afVar) {
        if (this.f12998b != 0) {
            for (int i2 = 0; i2 < this.f12998b; i2++) {
                int i3 = this.f12999c[i2];
                Object obj = this.f13000d[i2];
                int iA = go.a(i3);
                int iB = go.b(i3);
                if (iB == 0) {
                    afVar.t(iA, ((Long) obj).longValue());
                } else if (iB == 1) {
                    afVar.m(iA, ((Long) obj).longValue());
                } else if (iB == 2) {
                    afVar.d(iA, (v) obj);
                } else if (iB == 3) {
                    afVar.G(iA);
                    ((gf) obj).k(afVar);
                    afVar.h(iA);
                } else {
                    if (iB != 5) {
                        throw new RuntimeException(new et());
                    }
                    afVar.k(iA, ((Integer) obj).intValue());
                }
            }
        }
    }

    final boolean l(int i2, z zVar) throws eu {
        int iQ;
        f();
        int iB = go.b(i2);
        if (iB == 0) {
            i(i2, Long.valueOf(zVar.u()));
            return true;
        }
        if (iB == 1) {
            i(i2, Long.valueOf(zVar.t()));
            return true;
        }
        if (iB == 2) {
            i(i2, zVar.B());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                zVar.V();
                return false;
            }
            if (iB != 5) {
                throw new et();
            }
            i(i2, Integer.valueOf(zVar.h()));
            return true;
        }
        zVar.U();
        zVar.f13071b++;
        gf gfVar = new gf();
        do {
            iQ = zVar.q();
            if (iQ == 0) {
                break;
            }
        } while (gfVar.l(iQ, zVar));
        zVar.f13071b--;
        zVar.E(go.c(go.a(i2), 4));
        i(i2, gfVar);
        return true;
    }

    final void m(gf gfVar) {
        if (gfVar.equals(f12997a)) {
            return;
        }
        f();
        int i2 = this.f12998b + gfVar.f12998b;
        n(i2);
        System.arraycopy(gfVar.f12999c, 0, this.f12999c, this.f12998b, gfVar.f12998b);
        System.arraycopy(gfVar.f13000d, 0, this.f13000d, this.f12998b, gfVar.f12998b);
        this.f12998b = i2;
    }

    private gf() {
        this(0, new int[8], new Object[8], true);
    }
}
