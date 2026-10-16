package defpackage;

/* loaded from: classes.dex */
public final class cxp {
    public final cxb a;
    public boolean b;
    public boolean c;
    public dle g;
    public final nfh i = new nfh((char[]) null, (byte[]) null);
    public final cyi d = new cyi();
    public final byw e = new byw(new cyl[16]);
    public final byw f = new byw(new cxo[16]);
    public final cjn h = null;

    public cxp(cxb cxbVar) {
        this.a = cxbVar;
    }

    public static final boolean k(cxb cxbVar, dle dleVar) {
        if (cxbVar.j == null) {
            return false;
        }
        boolean zAp = dleVar != null ? cxbVar.ap(dleVar) : cxbVar.ap(cxbVar.w.c());
        cxb cxbVarL = cxbVar.l();
        if (zAp && cxbVarL != null) {
            if (cxbVarL.j == null) {
                cxbVarL.X(false, true, false);
                return zAp;
            }
            if (cxbVar.ax() == 1) {
                cxbVarL.V(false, true, false);
                return zAp;
            }
            if (cxbVar.ax() == 2) {
                cxbVarL.U(false);
                return true;
            }
        }
        return zAp;
    }

    public static final boolean l(cxb cxbVar, dle dleVar) {
        boolean zAq = dleVar != null ? cxbVar.aq(dleVar) : cxbVar.aq(cxbVar.w.b());
        cxb cxbVarL = cxbVar.l();
        if (zAq && cxbVarL != null) {
            if (cxbVar.aw() == 1) {
                cxbVarL.X(false, true, false);
                return zAq;
            }
            if (cxbVar.aw() == 2) {
                cxbVarL.W(false);
                return true;
            }
        }
        return zAq;
    }

    public static final boolean m(cxb cxbVar) {
        cvv cvvVar;
        if (!cxbVar.ak()) {
            return false;
        }
        if (cxbVar.ax() != 3) {
            return true;
        }
        cxn cxnVar = cxbVar.w.p;
        return (cxnVar == null || (cvvVar = cxnVar.p) == null || !cvvVar.j()) ? false : true;
    }

    public static final boolean n(cxb cxbVar) {
        cxb cxbVarL;
        if (!cxbVar.al()) {
            return false;
        }
        do {
            if ((cxbVar.aw() == 3 && !cxbVar.w.o.w.j() && ((cxbVarL = cxbVar.l()) == null || cxbVarL.av() != 1)) || (cxbVar = cxbVar.l()) == null) {
                return false;
            }
        } while (!cxbVar.an());
        return true;
    }

    private final void o(cxb cxbVar, boolean z) {
        cxn cxnVar;
        cvv cvvVar;
        byw bywVarK = cxbVar.k();
        Object[] objArr = bywVarK.a;
        int i = bywVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            cxb cxbVar2 = (cxb) objArr[i2];
            if ((!z && q(cxbVar2)) || (z && (cxbVar2.ax() == 1 || ((cxnVar = cxbVar2.w.p) != null && (cvvVar = cxnVar.p) != null && cvvVar.j())))) {
                if (cjn.s(cxbVar2) && !z) {
                    if (cxbVar2.ak() && this.i.v(cxbVar2)) {
                        s(cxbVar2, true);
                    } else {
                        e(cxbVar2, true);
                    }
                }
                p(cxbVar2, z);
                if (!r(cxbVar2, z)) {
                    o(cxbVar2, z);
                }
            }
        }
        p(cxbVar, z);
    }

    private final void p(cxb cxbVar, boolean z) {
        if (r(cxbVar, z)) {
            s(cxbVar, z);
        }
    }

    private static final boolean q(cxb cxbVar) {
        return cxbVar.aw() == 1 || cxbVar.w.o.w.j();
    }

    private static final boolean r(cxb cxbVar, boolean z) {
        return z ? cxbVar.ak() : cxbVar.al();
    }

    private final boolean s(cxb cxbVar, boolean z) {
        dle dleVar;
        boolean zL = false;
        if (cxbVar.D) {
            return false;
        }
        if (t(cxbVar)) {
            if (cxbVar == this.a) {
                dleVar = this.g;
                dleVar.getClass();
            } else {
                dleVar = null;
            }
            if (z) {
                if (cxbVar.ak()) {
                    zL = k(cxbVar, dleVar);
                }
            } else if (cxbVar.al()) {
                zL = l(cxbVar, dleVar);
            }
            c();
        }
        return zL;
    }

    private static final boolean t(cxb cxbVar) {
        cxn cxnVar;
        cvv cvvVar;
        if (!cxbVar.an() && !cxbVar.ao() && !n(cxbVar) && !affa.f(cxbVar.s(), true) && !m(cxbVar)) {
            cxf cxfVar = cxbVar.w;
            if (!cxfVar.o.w.j() && ((cxnVar = cxfVar.p) == null || (cvvVar = cxnVar.p) == null || !cvvVar.j())) {
                return false;
            }
        }
        return true;
    }

    public final void a() {
        byw bywVar = this.e;
        Object[] objArr = bywVar.a;
        int i = bywVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((cyl) objArr[i2]).a();
        }
        bywVar.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L17
            cyi r7 = r6.d
            cxb r0 = r6.a
            int r1 = r0.C
            if (r1 <= 0) goto L17
            java.lang.Object r7 = r7.a
            byw r7 = (defpackage.byw) r7
            r7.g()
            r7.n(r0)
            r7 = 1
            r0.B = r7
        L17:
            cyi r6 = r6.d
            boolean r7 = r6.c()
            if (r7 == 0) goto L77
            java.lang.Object r7 = r6.a
            cwg r0 = defpackage.cwg.a
            r1 = r7
            byw r1 = (defpackage.byw) r1
            r1.j(r0)
            r0 = r7
            byw r0 = (defpackage.byw) r0
            int r0 = r0.b
            java.lang.Object r1 = r6.b
            if (r1 == 0) goto L38
            r2 = r1
            cxb[] r2 = (defpackage.cxb[]) r2
            int r2 = r2.length
            if (r2 >= r0) goto L40
        L38:
            r1 = 16
            int r1 = java.lang.Math.max(r1, r0)
            cxb[] r1 = new defpackage.cxb[r1]
        L40:
            r2 = 0
            r6.b = r2
            r3 = 0
        L44:
            if (r3 >= r0) goto L57
            r4 = r7
            byw r4 = (defpackage.byw) r4
            java.lang.Object[] r4 = r4.a
            r4 = r4[r3]
            cxb r4 = (defpackage.cxb) r4
            r5 = r1
            cxb[] r5 = (defpackage.cxb[]) r5
            r5[r3] = r4
            int r3 = r3 + 1
            goto L44
        L57:
            byw r7 = (defpackage.byw) r7
            r7.g()
        L5c:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L75
            r7 = r1
            cxb[] r7 = (defpackage.cxb[]) r7
            r7 = r7[r0]
            r7.getClass()
            boolean r3 = r7.B
            if (r3 == 0) goto L6f
            r6.a(r7)
        L6f:
            r7 = r1
            cxb[] r7 = (defpackage.cxb[]) r7
            r7[r0] = r2
            goto L5c
        L75:
            r6.b = r1
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxp.b(boolean):void");
    }

    public final void c() {
        byw bywVar = this.f;
        int i = bywVar.b;
        if (i != 0) {
            Object[] objArr = bywVar.a;
            for (int i2 = 0; i2 < i; i2++) {
                cxo cxoVar = (cxo) objArr[i2];
                cxb cxbVar = cxoVar.a;
                if (cxbVar.am()) {
                    if (cxoVar.b) {
                        cxbVar.V(cxoVar.c, true, false);
                    } else {
                        cxbVar.X(cxoVar.c, true, false);
                    }
                }
            }
            bywVar.g();
        }
    }

    public final void d(cxb cxbVar) {
        byw bywVarK = cxbVar.k();
        Object[] objArr = bywVarK.a;
        int i = bywVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            cxb cxbVar2 = (cxb) objArr[i2];
            if (affa.f(cxbVar2.s(), true) && !cxbVar2.D) {
                if (this.i.v(cxbVar2)) {
                    cxbVar2.K();
                }
                d(cxbVar2);
            }
        }
    }

    public final void e(cxb cxbVar, boolean z) {
        if (!this.b) {
            crt.c("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (r(cxbVar, z)) {
            crt.b("node not yet measured");
        }
        o(cxbVar, z);
    }

    public final void f(cxb cxbVar) {
        byw bywVarK = cxbVar.k();
        Object[] objArr = bywVarK.a;
        int i = bywVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            cxb cxbVar2 = (cxb) objArr[i2];
            if (q(cxbVar2)) {
                if (cjn.s(cxbVar2)) {
                    g(cxbVar2, true);
                } else {
                    f(cxbVar2);
                }
            }
        }
    }

    public final void g(cxb cxbVar, boolean z) {
        dle dleVar;
        if (cxbVar.D) {
            return;
        }
        if (cxbVar == this.a) {
            dleVar = this.g;
            dleVar.getClass();
        } else {
            dleVar = null;
        }
        if (z) {
            k(cxbVar, dleVar);
        } else {
            l(cxbVar, dleVar);
        }
    }

    public final boolean h() {
        return this.i.u();
    }

    public final boolean i(afdr afdrVar) {
        boolean z;
        cxb cxbVarA;
        boolean z2;
        boolean z3;
        boolean zS;
        dle dleVar;
        cun cukVar;
        cxb cxbVarL;
        cxb cxbVar = this.a;
        if (!cxbVar.am()) {
            crt.b("performMeasureAndLayout called with unattached root");
        }
        if (!cxbVar.an()) {
            crt.b("performMeasureAndLayout called with unplaced root");
        }
        if (this.b) {
            crt.b("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.g != null) {
            this.b = true;
            this.c = true;
            try {
                nfh nfhVar = this.i;
                if (nfhVar.u()) {
                    z = false;
                    while (true) {
                        Object obj = nfhVar.a;
                        if (((cwf) obj).d()) {
                            Object obj2 = nfhVar.b;
                            if (((cwf) obj2).d()) {
                                Object obj3 = nfhVar.c;
                                if (((cwf) obj3).d()) {
                                    break;
                                }
                                cxbVarA = ((cwf) obj3).a();
                                z2 = true;
                                z3 = false;
                            } else {
                                cxbVarA = ((cwf) obj2).a();
                                z3 = cxbVarA.j != null;
                                z2 = true;
                            }
                        } else {
                            cxbVarA = ((cwf) obj).a();
                            z3 = cxbVarA.j != null;
                            z2 = false;
                        }
                        if (!z2) {
                            zS = s(cxbVarA, z3);
                            if (cxbVarA.aj()) {
                                nfhVar.x(cxbVarA, 2);
                            }
                            if (cxbVarA.ai()) {
                                nfhVar.x(cxbVarA, 4);
                            }
                        } else if (!cxbVarA.D && t(cxbVarA)) {
                            if (cxbVarA == cxbVar) {
                                dleVar = this.g;
                                dleVar.getClass();
                            } else {
                                dleVar = null;
                            }
                            if (z3) {
                                zS = cxbVarA.ak() ? k(cxbVarA, dleVar) : false;
                                if ((zS || cxbVarA.aj()) && affa.f(cxbVarA.s(), true)) {
                                    cxbVarA.K();
                                }
                            } else {
                                zS = cxbVarA.al() ? l(cxbVarA, dleVar) : false;
                                if (cxbVarA.ai() && (cxbVarA == cxbVar || ((cxbVarL = cxbVarA.l()) != null && cxbVarL.an() && cxbVarA.ao()))) {
                                    if (cxbVarA == cxbVar) {
                                        if (cxbVarA.E == 3) {
                                            cxbVarA.A();
                                        }
                                        cxb cxbVarL2 = cxbVarA.l();
                                        if (cxbVarL2 == null || (cukVar = cxbVarL2.p().n) == null) {
                                            cukVar = new cuk(cxe.a(cxbVarA));
                                        }
                                        cukVar.x(cxbVarA.o(), 0, 0);
                                    } else {
                                        cxbVarA.T();
                                    }
                                    this.d.b(cxbVarA);
                                }
                            }
                            c();
                        } else {
                            zS = false;
                        }
                        if (cxbVarA == cxbVar && zS) {
                            z = true;
                        }
                    }
                    if (afdrVar != null) {
                        afdrVar.invoke();
                    }
                } else {
                    z = false;
                }
                this.b = false;
                this.c = false;
                z4 = z;
            } finally {
            }
        }
        a();
        return z4;
    }

    public final boolean j(cxb cxbVar, boolean z) {
        int iAv = cxbVar.av();
        int i = iAv - 1;
        if (iAv == 0) {
            throw null;
        }
        if (i != 0 && i != 1) {
            if (i == 2 || i == 3) {
                this.f.n(new cxo(cxbVar, false, z));
            } else {
                if (i != 4) {
                    throw new aezs();
                }
                if (!cxbVar.al() || z) {
                    cxbVar.N();
                    if (!cxbVar.D && (cxbVar.an() || n(cxbVar))) {
                        cxb cxbVarL = cxbVar.l();
                        if (cxbVarL == null || !cxbVarL.al()) {
                            this.i.x(cxbVar, 3);
                        }
                        if (!this.c) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
