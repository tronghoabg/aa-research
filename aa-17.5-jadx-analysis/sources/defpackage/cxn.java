package defpackage;

import androidx.car.app.model.Alert;
import java.util.Objects;

/* loaded from: classes.dex */
public final class cxn extends cuo implements cto, cvw, cxu {
    private boolean A;
    public final cxf f;
    public boolean g;
    public boolean j;
    public boolean k;
    public dle l;
    public afec n;
    public cmi o;
    public boolean s;
    public boolean x;
    public int h = Alert.DURATION_SHOW_INDEFINITELY;
    public int i = Alert.DURATION_SHOW_INDEFINITELY;
    public int y = 3;
    public long m = 0;
    public int z = 3;
    public final cvv p = new cxg(this);
    public final byw q = new byw(new cxn[16]);
    public boolean r = true;
    private final afdr B = new cxm(this, 0);
    public boolean t = true;
    public Object u = q().r;
    public long v = dlf.d(0, Alert.DURATION_SHOW_INDEFINITELY, 0, Alert.DURATION_SHOW_INDEFINITELY);
    public final afdr w = new cxm(this, 2);
    private final afdr C = new cxm(this, 3);

    public cxn(cxf cxfVar) {
        this.f = cxfVar;
    }

    private final void J() {
        int i = this.z;
        if (L()) {
            this.z = 2;
        } else {
            this.z = 1;
        }
        if (i != 1 && this.f.d) {
            p().V(true, true, true);
        }
        byw bywVarK = p().k();
        Object[] objArr = bywVarK.a;
        int i2 = bywVarK.b;
        for (int i3 = 0; i3 < i2; i3++) {
            cxb cxbVar = (cxb) objArr[i3];
            cxn cxnVarN = cxbVar.n();
            if (cxnVarN == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (cxnVarN.i != Integer.MAX_VALUE) {
                cxnVarN.J();
                cxbVar.Y(cxbVar);
            }
        }
    }

    private final void K() {
        int i = 1;
        p().V(false, true, true);
        cxb cxbVarL = p().l();
        if (cxbVarL == null || p().E != 3) {
            return;
        }
        cxb cxbVarP = p();
        int iAv = cxbVarL.av();
        int i2 = iAv - 1;
        if (iAv == 0) {
            throw null;
        }
        if (i2 != 0) {
            i = 2;
            if (i2 != 2) {
                i = cxbVarL.E;
            }
        }
        cxbVarP.E = i;
    }

    private final boolean L() {
        return this.f.c;
    }

    private final boolean M() {
        return this.f.e;
    }

    public final void B(boolean z) {
        this.f.e = z;
    }

    public final void C(boolean z) {
        this.f.f = z;
    }

    public final boolean D() {
        return cjn.s(p()) || L();
    }

    public final boolean E() {
        return this.z != 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [afec, java.lang.Object] */
    public final boolean F(long j) throws Throwable {
        dle dleVar;
        cxb cxbVarP = p();
        try {
            if (p().D) {
                crt.b("measure is called on a deactivated node");
            }
            cxb cxbVarL = p().l();
            p().u = p().u || (cxbVarL != null && cxbVarL.u);
            if (!p().ak() && (dleVar = this.l) != null && dleVar.a == j) {
                cym cymVar = p().k;
                if (cymVar != null) {
                    cymVar.u(p(), true);
                }
                p().Z();
                return false;
            }
            this.l = new dle(j);
            A(j);
            this.p.f = false;
            l(new cmj(7));
            long j2 = this.A ? this.c : -9223372034707292160L;
            this.A = true;
            cxl cxlVarC = r().C();
            if (cxlVarC == null) {
                crt.c("Lookahead result from lookaheadRemeasure cannot be null");
            }
            cxn cxnVar = this.f.p;
            if (cxnVar != null) {
                cxnVar.I(2);
                cxnVar.f.d = false;
                cxnVar.v = j;
                cyp cypVar = ((czq) cxe.a(cxnVar.p())).w;
                ((ces) cypVar.a).b(cxnVar.p(), cypVar.b, cxnVar.w);
                cxnVar.B(true);
                cxnVar.C(true);
                if (cjn.s(cxnVar.p())) {
                    cxnVar.q().s();
                } else {
                    cxnVar.q().t();
                }
                cxnVar.I(5);
            }
            z((cxlVarC.b & 4294967295L) | (cxlVarC.a << 32));
            if (((int) (j2 >> 32)) == cxlVarC.a) {
                if (((int) (j2 & 4294967295L)) == cxlVarC.b) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            cxbVarP.as(th);
            throw new aezp();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [afec, java.lang.Object] */
    public final void G(long j, afec afecVar, cmi cmiVar) throws Throwable {
        cxb cxbVarP = p();
        try {
            cxb cxbVarL = p().l();
            if (cxbVarL != null && cxbVarL.av() == 4) {
                this.f.c = false;
            }
            if (p().D) {
                crt.b("place is called on a deactivated node");
            }
            I(4);
            this.k = true;
            this.x = false;
            if (j != this.m) {
                cxf cxfVar = this.f;
                if (cxfVar.m || cxfVar.l) {
                    B(true);
                }
                t();
            }
            cym cymVarA = cxe.a(p());
            this.m = j;
            if (M() || !E()) {
                this.f.k(false);
                this.p.g = false;
                cyp cypVar = ((czq) cymVarA).w;
                cxb cxbVarP2 = p();
                afdr afdrVar = this.C;
                ((ces) cypVar.a).b(cxbVarP2, cypVar.g, afdrVar);
            } else {
                cxl cxlVarC = r().C();
                cxlVarC.getClass();
                cxlVarC.B(dlo.d(j, cxlVarC.e));
                u();
            }
            this.n = afecVar;
            this.o = cmiVar;
            I(5);
        } catch (Throwable th) {
            cxbVarP.as(th);
            throw new aezp();
        }
    }

    public final int H() {
        return this.f.q;
    }

    public final void I(int i) {
        this.f.q = i;
    }

    @Override // defpackage.cxu
    public final void U(boolean z) {
        cxl cxlVarC;
        cxl cxlVarC2 = r().C();
        if (affa.f(Boolean.valueOf(z), cxlVarC2 != null ? Boolean.valueOf(cxlVarC2.k) : null) || (cxlVarC = r().C()) == null) {
            return;
        }
        cxlVarC.k = z;
    }

    @Override // defpackage.csp
    public final int c(int i) {
        K();
        cxl cxlVarC = r().C();
        cxlVarC.getClass();
        return cxlVarC.c(i);
    }

    @Override // defpackage.csp
    public final int d(int i) {
        K();
        cxl cxlVarC = r().C();
        cxlVarC.getClass();
        return cxlVarC.d(i);
    }

    @Override // defpackage.csp
    public final int e(int i) {
        K();
        cxl cxlVarC = r().C();
        cxlVarC.getClass();
        return cxlVarC.e(i);
    }

    @Override // defpackage.ctt
    public final int eB(crw crwVar) {
        cxb cxbVarL = p().l();
        if (cxbVarL == null || cxbVarL.av() != 2) {
            cxb cxbVarL2 = p().l();
            if (cxbVarL2 != null && cxbVarL2.av() == 4) {
                this.p.d = true;
            }
        } else {
            this.p.c = true;
        }
        this.j = true;
        cxl cxlVarC = r().C();
        cxlVarC.getClass();
        int iEB = cxlVarC.eB(crwVar);
        this.j = false;
        return iEB;
    }

    @Override // defpackage.cuo, defpackage.ctt
    public final int eC() {
        cxl cxlVarC = r().C();
        cxlVarC.getClass();
        return cxlVarC.eC();
    }

    @Override // defpackage.cuo
    public final void ev(long j, float f, afec afecVar) throws Throwable {
        G(j, afecVar, null);
    }

    @Override // defpackage.csp
    public final int f(int i) {
        K();
        cxl cxlVarC = r().C();
        cxlVarC.getClass();
        return cxlVarC.f(i);
    }

    @Override // defpackage.cuo, defpackage.csp
    public final Object g() {
        return this.u;
    }

    @Override // defpackage.cvw
    public final int h() {
        return this.i;
    }

    @Override // defpackage.cvw
    public final cvv i() {
        return this.p;
    }

    @Override // defpackage.cvw
    public final cvw j() {
        cxf cxfVar;
        cxb cxbVarL = p().l();
        if (cxbVarL == null || (cxfVar = cxbVarL.w) == null) {
            return null;
        }
        return cxfVar.p;
    }

    @Override // defpackage.cvw
    public final cyc k() {
        return p().p();
    }

    @Override // defpackage.cvw
    public final void l(afec afecVar) {
        byw bywVarK = p().k();
        Object[] objArr = bywVarK.a;
        int i = bywVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            cxn cxnVar = ((cxb) objArr[i2]).w.p;
            cxnVar.getClass();
            afecVar.invoke(cxnVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [afec, java.lang.Object] */
    @Override // defpackage.cvw
    public final void m() {
        this.s = true;
        cvv cvvVar = this.p;
        cvvVar.g();
        if (M()) {
            byw bywVarK = p().k();
            Object[] objArr = bywVarK.a;
            int i = bywVarK.b;
            for (int i2 = 0; i2 < i; i2++) {
                cxb cxbVar = (cxb) objArr[i2];
                if (cxbVar.ak() && cxbVar.ax() == 1) {
                    cxf cxfVar = cxbVar.w;
                    cxn cxnVar = cxfVar.p;
                    cxnVar.getClass();
                    dle dleVarC = cxfVar.c();
                    dleVarC.getClass();
                    if (cxnVar.F(dleVarC.a)) {
                        p().V(false, true, true);
                    }
                }
            }
        }
        cxl cxlVar = ((cwq) k()).g;
        cxlVar.getClass();
        cxf cxfVar2 = this.f;
        if (cxfVar2.f || (!this.j && !cxlVar.m && M())) {
            B(false);
            int iH = H();
            I(4);
            cxfVar2.l(false);
            cyp cypVar = ((czq) cxe.a(p())).w;
            ((ces) cypVar.a).b(p(), cypVar.h, this.B);
            I(iH);
            if (cxfVar2.l && cxlVar.m) {
                n();
            }
            C(false);
        }
        if (cvvVar.d) {
            cvvVar.e = true;
        }
        if (cvvVar.b && cvvVar.j()) {
            cvvVar.f();
        }
        this.s = false;
    }

    @Override // defpackage.cvw
    public final void n() {
        p().U(false);
    }

    @Override // defpackage.cvw
    public final void o() {
        p().V(false, true, true);
    }

    public final cxb p() {
        return this.f.a;
    }

    public final cxq q() {
        return this.f.o;
    }

    public final cyc r() {
        return this.f.a();
    }

    public final void s(boolean z) {
        if (z) {
            if (D()) {
                return;
            }
        } else if (!D()) {
            return;
        }
        this.z = 3;
        byw bywVarK = p().k();
        Object[] objArr = bywVarK.a;
        int i = bywVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            cxn cxnVar = ((cxb) objArr[i2]).w.p;
            cxnVar.getClass();
            cxnVar.s(true);
        }
    }

    public final void t() {
        if (this.f.n > 0) {
            byw bywVarK = p().k();
            Object[] objArr = bywVarK.a;
            int i = bywVarK.b;
            for (int i2 = 0; i2 < i; i2++) {
                cxb cxbVar = (cxb) objArr[i2];
                cxf cxfVar = cxbVar.w;
                if ((cxfVar.l || cxfVar.m) && !cxfVar.e) {
                    cxbVar.U(false);
                }
                cxn cxnVar = cxfVar.p;
                if (cxnVar != null) {
                    cxnVar.t();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u() {
        /*
            r5 = this;
            r0 = 1
            r5.x = r0
            cxb r1 = r5.p()
            cxb r1 = r1.l()
            int r2 = r5.z
            r3 = 0
            if (r2 == r0) goto L19
            boolean r4 = r5.L()
            if (r4 == 0) goto L1f
            r4 = 2
            if (r2 == r4) goto L2b
        L19:
            boolean r2 = r5.L()
            if (r2 == 0) goto L2b
        L1f:
            r5.J()
            boolean r2 = r5.g
            if (r2 == 0) goto L2b
            if (r1 == 0) goto L2b
            r1.U(r3)
        L2b:
            if (r1 == 0) goto L55
            boolean r2 = r5.g
            if (r2 != 0) goto L57
            int r2 = r1.av()
            r3 = 3
            if (r2 == r3) goto L3f
            int r2 = r1.av()
            r3 = 4
            if (r2 != r3) goto L57
        L3f:
            int r2 = r5.i
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r3) goto L4b
            java.lang.String r2 = "Place was called on a node which was placed already"
            defpackage.crt.c(r2)
        L4b:
            cxf r1 = r1.w
            int r2 = r1.g
            r5.i = r2
            int r2 = r2 + r0
            r1.g = r2
            goto L57
        L55:
            r5.i = r3
        L57:
            r5.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxn.u():void");
    }

    @Override // defpackage.cto
    public final cuo v(long j) {
        cxb cxbVarL;
        cxb cxbVarL2 = p().l();
        int i = 2;
        if ((cxbVarL2 != null && cxbVarL2.av() == 2) || ((cxbVarL = p().l()) != null && cxbVarL.av() == 4)) {
            this.f.b = false;
        }
        cxb cxbVarP = p();
        cxb cxbVarL3 = cxbVarP.l();
        if (cxbVarL3 != null) {
            if (this.y != 3 && !cxbVarP.u) {
                crt.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iAv = cxbVarL3.av();
            int i2 = iAv - 1;
            if (iAv == 0) {
                throw null;
            }
            if (i2 == 0 || i2 == 1) {
                i = 1;
            } else if (i2 != 2 && i2 != 3) {
                int iAv2 = cxbVarL3.av();
                Objects.toString(cjn.t(iAv2));
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(cjn.t(iAv2)));
            }
            this.y = i;
        } else {
            this.y = 3;
        }
        if (p().E == 3) {
            p().z();
        }
        F(j);
        return this;
    }

    @Override // defpackage.cuo
    public final int x() {
        cxl cxlVarC = r().C();
        cxlVarC.getClass();
        return cxlVarC.x();
    }

    @Override // defpackage.cuo
    public final void y(long j, float f, cmi cmiVar) throws Throwable {
        G(j, null, cmiVar);
    }
}
