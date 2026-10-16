package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class doy {
    public static boolean a = false;
    public static long b;
    public final lah j;
    private final dox r;
    private dox s;
    private int k = 1000;
    public boolean c = false;
    int d = 0;
    private int l = 32;
    private int m = 32;
    public boolean f = false;
    public boolean g = false;
    private boolean[] n = new boolean[32];
    int h = 1;
    int i = 0;
    private int o = 32;
    private dpb[] p = new dpb[1000];
    private int q = 0;
    dox[] e = new dox[32];

    public doy() {
        t();
        lah lahVar = new lah((short[]) null);
        this.j = lahVar;
        this.r = new dpa(lahVar);
        this.s = new dox(lahVar);
    }

    public static final int o(Object obj) {
        dpb dpbVar = ((dqm) obj).h;
        if (dpbVar != null) {
            return (int) (dpbVar.f + 0.5f);
        }
        return 0;
    }

    private final void q(dox doxVar) {
        int i;
        if (doxVar.d) {
            doxVar.a.d(this, doxVar.b);
        } else {
            dox[] doxVarArr = this.e;
            int i2 = this.i;
            doxVarArr[i2] = doxVar;
            dpb dpbVar = doxVar.a;
            dpbVar.d = i2;
            this.i = i2 + 1;
            dpbVar.e(this, doxVar);
        }
        if (this.c) {
            int i3 = 0;
            while (i3 < this.i) {
                if (this.e[i3] == null) {
                    System.out.println("WTF");
                }
                dox doxVar2 = this.e[i3];
                if (doxVar2 != null && doxVar2.d) {
                    doxVar2.a.d(this, doxVar2.b);
                    ((sjg) this.j.a).f(doxVar2);
                    this.e[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.i;
                        if (i4 >= i) {
                            break;
                        }
                        dox[] doxVarArr2 = this.e;
                        int i6 = i4 - 1;
                        dox doxVar3 = doxVarArr2[i4];
                        doxVarArr2[i6] = doxVar3;
                        dpb dpbVar2 = doxVar3.a;
                        if (dpbVar2.d == i4) {
                            dpbVar2.d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.e[i5] = null;
                    }
                    this.i = i - 1;
                    i3--;
                }
                i3++;
            }
            this.c = false;
        }
    }

    private final void r() {
        for (int i = 0; i < this.i; i++) {
            dox doxVar = this.e[i];
            doxVar.a.f = doxVar.b;
        }
    }

    private final void s() {
        int i = this.l;
        int i2 = i + i;
        this.l = i2;
        this.e = (dox[]) Arrays.copyOf(this.e, i2);
        lah lahVar = this.j;
        lahVar.b = (dpb[]) Arrays.copyOf((Object[]) lahVar.b, this.l);
        int i3 = this.l;
        this.n = new boolean[i3];
        this.m = i3;
        this.o = i3;
    }

    private final void t() {
        for (int i = 0; i < this.i; i++) {
            dox doxVar = this.e[i];
            if (doxVar != null) {
                ((sjg) this.j.a).f(doxVar);
            }
            this.e[i] = null;
        }
    }

    private final void u(dox doxVar) {
        dow dowVar;
        int i;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.n[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            z = true;
            i3++;
            int i4 = this.h;
            if (i3 >= i4 + i4) {
                return;
            }
            dpb dpbVar = doxVar.a;
            if (dpbVar != null) {
                this.n[dpbVar.c] = true;
            }
            dpb dpbVarK = doxVar.k(this.n);
            if (dpbVarK != null) {
                boolean[] zArr = this.n;
                int i5 = dpbVarK.c;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (dpbVarK != null) {
                float f = Float.MAX_VALUE;
                int i6 = -1;
                for (int i7 = 0; i7 < this.i; i7++) {
                    dox doxVar2 = this.e[i7];
                    if (doxVar2.a.n != 1 && !doxVar2.d && (i = (dowVar = doxVar2.e).e) != -1) {
                        int i8 = 0;
                        while (true) {
                            if (i == -1 || i8 >= dowVar.a) {
                                break;
                            }
                            if (dowVar.b[i] == dpbVarK.c) {
                                float fA = doxVar2.e.a(dpbVarK);
                                if (fA < BitmapDescriptorFactory.HUE_RED) {
                                    float f2 = (-doxVar2.b) / fA;
                                    if (f2 < f) {
                                        i6 = i7;
                                        f = f2;
                                    }
                                }
                            } else {
                                i = dowVar.c[i];
                                i8++;
                            }
                        }
                    }
                }
                if (i6 >= 0) {
                    dox doxVar3 = this.e[i6];
                    doxVar3.a.d = -1;
                    doxVar3.b(dpbVarK);
                    dpb dpbVar2 = doxVar3.a;
                    dpbVar2.d = i6;
                    dpbVar2.e(this, doxVar3);
                }
                z = false;
            }
        }
    }

    private final dpb v(int i) {
        dpb dpbVar = (dpb) ((sjg) this.j.c).e();
        if (dpbVar == null) {
            dpbVar = new dpb(i);
            dpbVar.n = i;
        } else {
            dpbVar.c();
            dpbVar.n = i;
        }
        int i2 = this.q;
        int i3 = this.k;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            this.k = i4;
            this.p = (dpb[]) Arrays.copyOf(this.p, i4);
        }
        dpb[] dpbVarArr = this.p;
        int i5 = this.q;
        this.q = i5 + 1;
        dpbVarArr[i5] = dpbVar;
        return dpbVar;
    }

    public final dox a() {
        lah lahVar = this.j;
        dox doxVar = (dox) ((sjg) lahVar.a).e();
        if (doxVar == null) {
            doxVar = new dox(lahVar);
            b++;
        } else {
            doxVar.a = null;
            doxVar.e.f();
            doxVar.b = BitmapDescriptorFactory.HUE_RED;
            doxVar.d = false;
        }
        dpb.a++;
        return doxVar;
    }

    public final dpb b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.h + 1 >= this.m) {
            s();
        }
        dqm dqmVar = (dqm) obj;
        dpb dpbVar = dqmVar.h;
        if (dpbVar == null) {
            dqmVar.m();
            dpbVar = dqmVar.h;
        }
        int i = dpbVar.c;
        if (i != -1) {
            if (i <= this.d && ((dpb[]) this.j.b)[i] != null) {
                return dpbVar;
            }
            if (i != -1) {
                dpbVar.c();
            }
        }
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        dpbVar.c = i2;
        dpbVar.n = 1;
        ((dpb[]) this.j.b)[i2] = dpbVar;
        return dpbVar;
    }

    public final dpb c() {
        if (this.h + 1 >= this.m) {
            s();
        }
        dpb dpbVarV = v(3);
        int i = this.d + 1;
        this.d = i;
        this.h++;
        dpbVarV.c = i;
        ((dpb[]) this.j.b)[i] = dpbVarV;
        return dpbVarV;
    }

    public final void d(dpb dpbVar, dpb dpbVar2, int i, float f, dpb dpbVar3, dpb dpbVar4, int i2, int i3) {
        dox doxVarA = a();
        if (dpbVar2 == dpbVar3) {
            doxVarA.e.g(dpbVar, 1.0f);
            doxVarA.e.g(dpbVar4, 1.0f);
            doxVarA.e.g(dpbVar2, -2.0f);
        } else if (f == 0.5f) {
            doxVarA.e.g(dpbVar, 1.0f);
            doxVarA.e.g(dpbVar2, -1.0f);
            doxVarA.e.g(dpbVar3, -1.0f);
            doxVarA.e.g(dpbVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                doxVarA.b = (-i) + i2;
            }
        } else if (f <= BitmapDescriptorFactory.HUE_RED) {
            doxVarA.e.g(dpbVar, -1.0f);
            doxVarA.e.g(dpbVar2, 1.0f);
            doxVarA.b = i;
        } else if (f >= 1.0f) {
            doxVarA.e.g(dpbVar4, -1.0f);
            doxVarA.e.g(dpbVar3, 1.0f);
            doxVarA.b = -i2;
        } else {
            float f2 = 1.0f - f;
            doxVarA.e.g(dpbVar, f2);
            doxVarA.e.g(dpbVar2, -f2);
            doxVarA.e.g(dpbVar3, -f);
            doxVarA.e.g(dpbVar4, f);
            if (i > 0 || i2 > 0) {
                doxVarA.b = ((-i) * f2) + (i2 * f);
            }
        }
        if (i3 != 8) {
            doxVarA.f(this, i3);
        }
        e(doxVarA);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0105, code lost:
    
        if (r5.l <= 1) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b6 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.dox r18) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.doy.e(dox):void");
    }

    public final void f(dpb dpbVar, int i) {
        int i2 = dpbVar.d;
        if (i2 == -1) {
            dpbVar.d(this, i);
            for (int i3 = 0; i3 < this.d + 1; i3++) {
                dpb dpbVar2 = ((dpb[]) this.j.b)[i3];
            }
            return;
        }
        if (i2 == -1) {
            float f = i;
            dox doxVarA = a();
            doxVarA.a = dpbVar;
            dpbVar.f = f;
            doxVarA.b = f;
            doxVarA.d = true;
            e(doxVarA);
            return;
        }
        dox doxVar = this.e[i2];
        if (doxVar.d) {
            doxVar.b = i;
            return;
        }
        if (doxVar.e.a == 0) {
            doxVar.d = true;
            doxVar.b = i;
            return;
        }
        dox doxVarA2 = a();
        if (i < 0) {
            doxVarA2.b = -i;
            doxVarA2.e.g(dpbVar, 1.0f);
        } else {
            doxVarA2.b = i;
            doxVarA2.e.g(dpbVar, -1.0f);
        }
        e(doxVarA2);
    }

    public final void g(dpb dpbVar, dpb dpbVar2, int i, int i2) {
        dox doxVarA = a();
        dpb dpbVarC = c();
        dpbVarC.e = 0;
        doxVarA.h(dpbVar, dpbVar2, dpbVarC, i);
        if (i2 != 8) {
            i(doxVarA, (int) (-doxVarA.e.a(dpbVarC)), i2);
        }
        e(doxVarA);
    }

    public final void h(dpb dpbVar, dpb dpbVar2, int i, int i2) {
        dox doxVarA = a();
        dpb dpbVarC = c();
        dpbVarC.e = 0;
        doxVarA.i(dpbVar, dpbVar2, dpbVarC, i);
        if (i2 != 8) {
            i(doxVarA, (int) (-doxVarA.e.a(dpbVarC)), i2);
        }
        e(doxVarA);
    }

    final void i(dox doxVar, int i, int i2) {
        doxVar.e.g(p(i2), i);
    }

    public final void j() throws Exception {
        dox doxVar = this.r;
        if (doxVar.e()) {
            r();
            return;
        }
        if (!this.g) {
            l(doxVar);
            return;
        }
        for (int i = 0; i < this.i; i++) {
            if (!this.e[i].d) {
                l(doxVar);
                return;
            }
        }
        r();
    }

    public final void k() {
        lah lahVar;
        int i = 0;
        while (true) {
            lahVar = this.j;
            dpb[] dpbVarArr = (dpb[]) lahVar.b;
            if (i >= dpbVarArr.length) {
                break;
            }
            dpb dpbVar = dpbVarArr[i];
            if (dpbVar != null) {
                dpbVar.c();
            }
            i++;
        }
        Object obj = lahVar.c;
        dpb[] dpbVarArr2 = this.p;
        int i2 = this.q;
        int length = dpbVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            dpb dpbVar2 = dpbVarArr2[i3];
            sjg sjgVar = (sjg) obj;
            int i4 = sjgVar.a;
            if (i4 < 256) {
                ((Object[]) sjgVar.b)[i4] = dpbVar2;
                sjgVar.a = i4 + 1;
            }
        }
        this.q = 0;
        Arrays.fill((Object[]) lahVar.b, (Object) null);
        this.d = 0;
        dpa dpaVar = (dpa) this.r;
        dpaVar.f = 0;
        dpaVar.b = BitmapDescriptorFactory.HUE_RED;
        this.h = 1;
        for (int i5 = 0; i5 < this.i; i5++) {
            dox doxVar = this.e[i5];
        }
        t();
        this.i = 0;
        this.s = new dox(lahVar);
    }

    final void l(dox doxVar) throws Exception {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.i) {
                break;
            }
            dox doxVar2 = this.e[i];
            if (doxVar2.a.n != 1) {
                float f = doxVar2.b;
                float f2 = BitmapDescriptorFactory.HUE_RED;
                if (f < BitmapDescriptorFactory.HUE_RED) {
                    boolean z2 = false;
                    int i2 = 0;
                    while (!z2) {
                        i2++;
                        float f3 = Float.MAX_VALUE;
                        int i3 = -1;
                        int i4 = -1;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.i) {
                            dox doxVar3 = this.e[i5];
                            if (doxVar3.a.n != 1 && !doxVar3.d && doxVar3.b < f2) {
                                int i7 = doxVar3.e.a;
                                int i8 = 0;
                                while (i8 < i7) {
                                    dpb dpbVarD = doxVar3.e.d(i8);
                                    float fA = doxVar3.e.a(dpbVarD);
                                    if (fA > f2) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f4 = dpbVarD.h[i9] / fA;
                                            if ((f4 < f3 && i9 == i6) || i9 > i6) {
                                                i4 = dpbVarD.c;
                                                i6 = i9;
                                                f3 = f4;
                                                i3 = i5;
                                            }
                                        }
                                    }
                                    i8++;
                                    f2 = BitmapDescriptorFactory.HUE_RED;
                                }
                            }
                            i5++;
                            f2 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (i3 != -1) {
                            dox doxVar4 = this.e[i3];
                            doxVar4.a.d = -1;
                            doxVar4.b(((dpb[]) this.j.b)[i4]);
                            dpb dpbVar = doxVar4.a;
                            dpbVar.d = i3;
                            dpbVar.e(this, doxVar4);
                            z = false;
                        } else {
                            z = true;
                        }
                        z2 = (!(i2 <= this.h / 2)) | z;
                        f2 = BitmapDescriptorFactory.HUE_RED;
                    }
                }
            }
            i++;
        }
        u(doxVar);
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.dpb r6, defpackage.dpb r7, int r8, int r9) {
        /*
            r5 = this;
            r0 = 8
            if (r9 != r0) goto L17
            boolean r9 = r7.g
            if (r9 == 0) goto L16
            int r9 = r6.d
            r1 = -1
            if (r9 == r1) goto Le
            goto L16
        Le:
            float r7 = r7.f
            float r8 = (float) r8
            float r7 = r7 + r8
            r6.d(r5, r7)
            return
        L16:
            r9 = r0
        L17:
            dox r1 = r5.a()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 == 0) goto L38
            if (r8 >= 0) goto L26
            int r8 = -r8
            r4 = 1
            goto L27
        L26:
            r4 = 0
        L27:
            float r8 = (float) r8
            r1.b = r8
            if (r4 != 0) goto L2d
            goto L38
        L2d:
            dow r8 = r1.e
            r8.g(r6, r2)
            dow r6 = r1.e
            r6.g(r7, r3)
            goto L42
        L38:
            dow r8 = r1.e
            r8.g(r6, r3)
            dow r6 = r1.e
            r6.g(r7, r2)
        L42:
            if (r9 == r0) goto L47
            r1.f(r5, r9)
        L47:
            r5.e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.doy.m(dpb, dpb, int, int):void");
    }

    public final void n(dpb dpbVar, dpb dpbVar2, dpb dpbVar3, dpb dpbVar4, float f) {
        dox doxVarA = a();
        doxVarA.g(dpbVar, dpbVar2, dpbVar3, dpbVar4, f);
        e(doxVarA);
    }

    public final dpb p(int i) {
        if (this.h + 1 >= this.m) {
            s();
        }
        dpb dpbVarV = v(4);
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        dpbVarV.c = i2;
        dpbVarV.e = i;
        ((dpb[]) this.j.b)[i2] = dpbVarV;
        dpa dpaVar = (dpa) this.r;
        doz dozVar = dpaVar.g;
        dozVar.a = dpbVarV;
        Arrays.fill(dozVar.a.i, BitmapDescriptorFactory.HUE_RED);
        dpbVarV.i[dpbVarV.e] = 1.0f;
        dpaVar.l(dpbVarV);
        return dpbVarV;
    }
}
