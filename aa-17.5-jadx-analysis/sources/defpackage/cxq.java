package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class cxq extends cuo implements cto, cvw, cxu {
    public float A;
    public boolean B;
    public afec C;
    public cmi D;
    public float F;
    private boolean H;
    private boolean M;
    public final cxf f;
    public boolean g;
    public boolean j;
    public boolean k;
    public boolean l;
    public afec n;
    public cmi o;
    public float p;
    public Object r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean y;
    public int h = Alert.DURATION_SHOW_INDEFINITELY;
    public int i = Alert.DURATION_SHOW_INDEFINITELY;
    public int G = 3;
    public long m = 0;
    public boolean q = true;
    public final cvv w = new cxc(this);
    private final byw I = new byw(new cxq[16]);
    public boolean x = true;
    public long z = dlf.d(0, Alert.DURATION_SHOW_INDEFINITELY, 0, Alert.DURATION_SHOW_INDEFINITELY);
    private final afdr J = new bxh(this, 8);
    private final afdr K = new bxh(this, 9);
    public long E = 0;
    private final afdr L = new bxh(this, 10);

    public cxq(cxf cxfVar) {
        this.f = cxfVar;
    }

    private final cxn H() {
        return this.f.p;
    }

    private final void I() {
        boolean z = this.s;
        this.s = true;
        cxb cxbVarP = p();
        if (!z) {
            cxbVarP.p().ao();
            ((czq) cxe.a(cxbVarP)).p.e(p());
            if (cxbVarP.al()) {
                cxbVarP.X(true, true, true);
            } else if (cxbVarP.ak()) {
                cxbVarP.V(true, true, true);
            }
        }
        cyc cycVar = cxbVarP.p().w;
        for (cyc cycVarQ = cxbVarP.q(); !affa.f(cycVarQ, cycVar) && cycVarQ != null; cycVarQ = cycVarQ.w) {
            if (cycVarQ.H) {
                cycVarQ.ak();
            }
        }
        byw bywVarK = cxbVarP.k();
        Object[] objArr = bywVarK.a;
        int i = bywVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            cxb cxbVar = (cxb) objArr[i2];
            if (cxbVar.f() != Integer.MAX_VALUE) {
                cxbVar.o().I();
                cxbVarP.Y(cxbVar);
            }
        }
    }

    private final void J() {
        int i = 1;
        p().X(false, true, true);
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

    private final void K(long j, float f, afec afecVar, cmi cmiVar) throws Throwable {
        cun cukVar;
        cxb cxbVarP = p();
        try {
            this.t = true;
            if (j != this.m || afecVar != this.n || this.M) {
                cxf cxfVar = this.f;
                if (cxfVar.j || cxfVar.i || this.M) {
                    this.v = true;
                    this.M = false;
                }
            }
            cxn cxnVarH = H();
            if (cxnVarH != null && cxnVarH.z == 3 && !cjn.s(cxnVarH.p())) {
                cxnVarH.f.c = true;
            }
            cxn cxnVarH2 = H();
            if (cxnVarH2 != null && cxnVarH2.D()) {
                cyc cycVar = q().x;
                if (cycVar == null || (cukVar = cycVar.n) == null) {
                    cukVar = new cuk(cxe.a(p()));
                }
                cxn cxnVarH3 = H();
                cxnVarH3.getClass();
                cxb cxbVarL = p().l();
                if (cxbVarL != null) {
                    cxbVarL.w.g = 0;
                }
                cxnVarH3.i = Alert.DURATION_SHOW_INDEFINITELY;
                cukVar.r(cxnVarH3, (int) (j >> 32), (int) (4294967295L & j), BitmapDescriptorFactory.HUE_RED);
            }
            cxn cxnVarH4 = H();
            if (cxnVarH4 != null && !cxnVarH4.k) {
                crt.c("Error: Placement happened before lookahead.");
            }
            C(j, f, afecVar, cmiVar);
        } catch (Throwable th) {
            cxbVarP.as(th);
            throw new aezp();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B() {
        /*
            r6 = this;
            r0 = 1
            r6.B = r0
            cxb r1 = r6.p()
            cxb r1 = r1.l()
            cyc r2 = r6.k()
            float r2 = r2.z
            cxb r3 = r6.p()
            cyc r4 = r3.q()
            cyc r3 = r3.p()
        L1d:
            if (r4 == r3) goto L2a
            r4.getClass()
            cwx r4 = (defpackage.cwx) r4
            float r5 = r4.z
            float r2 = r2 + r5
            cyc r4 = r4.w
            goto L1d
        L2a:
            float r3 = r6.A
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 != 0) goto L31
            goto L3d
        L31:
            r6.A = r2
            if (r1 == 0) goto L38
            r1.Q()
        L38:
            if (r1 == 0) goto L3d
            r1.G()
        L3d:
            cyc r2 = r6.k()
            boolean r2 = r2.m
            r3 = 0
            if (r2 != 0) goto L71
            boolean r2 = r6.s
            if (r2 == 0) goto L52
            cvv r4 = r6.w
            boolean r4 = r4.i()
            if (r4 == 0) goto L66
        L52:
            r6.I()
            if (r2 != 0) goto L66
            if (r1 == 0) goto L5c
            r1.G()
        L5c:
            boolean r2 = r6.g
            if (r2 == 0) goto L71
            if (r1 == 0) goto L71
            r1.W(r3)
            goto L71
        L66:
            cxb r2 = r6.p()
            cyc r2 = r2.p()
            r2.ao()
        L71:
            if (r1 == 0) goto L94
            boolean r2 = r6.g
            if (r2 != 0) goto L96
            int r2 = r1.av()
            r3 = 3
            if (r2 != r3) goto L96
            int r2 = r6.i
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r3) goto L8a
            java.lang.String r2 = "Place was called on a node which was placed already"
            defpackage.crt.c(r2)
        L8a:
            cxf r1 = r1.w
            int r2 = r1.h
            r6.i = r2
            int r2 = r2 + r0
            r1.h = r2
            goto L96
        L94:
            r6.i = r3
        L96:
            r6.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxq.B():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [afec, java.lang.Object] */
    public final void C(long j, float f, afec afecVar, cmi cmiVar) {
        if (p().D) {
            crt.b("place is called on a deactivated node");
        }
        G(3);
        this.m = j;
        this.p = f;
        this.n = afecVar;
        this.o = cmiVar;
        this.B = false;
        cym cymVarA = cxe.a(p());
        if (this.v || !this.s) {
            this.w.g = false;
            this.f.i(false);
            this.C = afecVar;
            this.E = j;
            this.F = f;
            this.D = cmiVar;
            cyp cypVar = ((czq) cymVarA).w;
            cxb cxbVarP = p();
            afdr afdrVar = this.L;
            ((ces) cypVar.a).b(cxbVarP, cypVar.f, afdrVar);
        } else {
            cyc cycVarQ = q();
            cycVarQ.as(dlo.d(j, cycVarQ.e), f, afecVar, cmiVar);
            B();
        }
        G(5);
        if (q().m) {
            cxf cxfVar = this.f;
            if (cxfVar.j || cxfVar.i) {
                n();
            }
        }
        this.k = true;
    }

    public final void D() {
        if (!p().an() || this.f.k <= 0) {
            return;
        }
        cxf cxfVar = p().w;
        if ((cxfVar.i || cxfVar.j) && !cxfVar.n()) {
            p().W(false);
        }
        byw bywVarK = p().k();
        Object[] objArr = bywVarK.a;
        int i = bywVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((cxb) objArr[i2]).o().D();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [afec, java.lang.Object] */
    public final boolean E(long j) throws Throwable {
        cxb cxbVarP = p();
        try {
            if (p().D) {
                crt.b("measure is called on a deactivated node");
            }
            cym cymVarA = cxe.a(p());
            cxb cxbVarL = p().l();
            p().u = p().u || (cxbVarL != null && cxbVarL.u);
            if (!p().al() && this.d == j) {
                cymVarA.u(p(), false);
                p().Z();
                return false;
            }
            this.w.f = false;
            l(new bwr(14));
            this.j = true;
            long j2 = q().c;
            A(j);
            if (F() != 5) {
                crt.c("layout state is not idle before measure starts");
            }
            this.z = j;
            G(1);
            this.u = false;
            cyp cypVar = ((czq) cxe.a(p())).w;
            ((ces) cypVar.a).b(p(), cypVar.c, this.J);
            if (F() == 1) {
                s();
                G(5);
            }
            boolean z = (q().c == j2 && q().a == this.a && q().b == this.b) ? false : true;
            z((q().b & 4294967295L) | (q().a << 32));
            return z;
        } catch (Throwable th) {
            cxbVarP.as(th);
            throw new aezp();
        }
    }

    public final int F() {
        return this.f.q;
    }

    public final void G(int i) {
        this.f.q = i;
    }

    @Override // defpackage.cxu
    public final void U(boolean z) {
        if (z != q().k) {
            q().k = z;
            this.M = true;
        }
    }

    @Override // defpackage.csp
    public final int c(int i) {
        if (!cjn.s(p())) {
            J();
            return q().c(i);
        }
        cxn cxnVarH = H();
        cxnVarH.getClass();
        return cxnVarH.c(i);
    }

    @Override // defpackage.csp
    public final int d(int i) {
        if (!cjn.s(p())) {
            J();
            return q().d(i);
        }
        cxn cxnVarH = H();
        cxnVarH.getClass();
        return cxnVarH.d(i);
    }

    @Override // defpackage.csp
    public final int e(int i) {
        if (!cjn.s(p())) {
            J();
            return q().e(i);
        }
        cxn cxnVarH = H();
        cxnVarH.getClass();
        return cxnVarH.e(i);
    }

    @Override // defpackage.ctt
    public final int eB(crw crwVar) {
        cxb cxbVarL = p().l();
        if (cxbVarL == null || cxbVarL.av() != 1) {
            cxb cxbVarL2 = p().l();
            if (cxbVarL2 != null && cxbVarL2.av() == 3) {
                this.w.d = true;
            }
        } else {
            this.w.c = true;
        }
        this.l = true;
        int iEB = q().eB(crwVar);
        this.l = false;
        return iEB;
    }

    @Override // defpackage.cuo, defpackage.ctt
    public final int eC() {
        return q().eC();
    }

    @Override // defpackage.cuo
    public final void ev(long j, float f, afec afecVar) throws Throwable {
        K(j, f, afecVar, null);
    }

    @Override // defpackage.csp
    public final int f(int i) {
        if (!cjn.s(p())) {
            J();
            return q().f(i);
        }
        cxn cxnVarH = H();
        cxnVarH.getClass();
        return cxnVarH.f(i);
    }

    @Override // defpackage.cuo, defpackage.csp
    public final Object g() {
        return this.r;
    }

    @Override // defpackage.cvw
    public final int h() {
        return this.i;
    }

    @Override // defpackage.cvw
    public final cvv i() {
        return this.w;
    }

    @Override // defpackage.cvw
    public final cvw j() {
        cxf cxfVar;
        cxb cxbVarL = p().l();
        if (cxbVarL == null || (cxfVar = cxbVarL.w) == null) {
            return null;
        }
        return cxfVar.o;
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
            afecVar.invoke(((cxb) objArr[i2]).w.o);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [afec, java.lang.Object] */
    @Override // defpackage.cvw
    public final void m() {
        this.y = true;
        cvv cvvVar = this.w;
        cvvVar.g();
        if (this.v) {
            byw bywVarK = p().k();
            Object[] objArr = bywVarK.a;
            int i = bywVarK.b;
            for (int i2 = 0; i2 < i; i2++) {
                cxb cxbVar = (cxb) objArr[i2];
                if (cxbVar.al() && cxbVar.aw() == 1 && cxbVar.aq(cxbVar.w.b())) {
                    p().X(false, true, true);
                }
            }
        }
        if (this.H || (!this.l && !k().m && this.v)) {
            this.v = false;
            int iF = F();
            G(3);
            this.f.j(false);
            cxb cxbVarP = p();
            cyp cypVar = ((czq) cxe.a(cxbVarP)).w;
            ((ces) cypVar.a).b(cxbVarP, cypVar.e, this.K);
            G(iF);
            this.H = false;
        }
        if (cvvVar.d) {
            cvvVar.e = true;
        }
        if (cvvVar.b && cvvVar.j()) {
            cvvVar.f();
        }
        this.y = false;
    }

    @Override // defpackage.cvw
    public final void n() {
        p().W(false);
    }

    @Override // defpackage.cvw
    public final void o() {
        p().X(false, true, true);
    }

    public final cxb p() {
        return this.f.a;
    }

    public final cyc q() {
        return this.f.a();
    }

    public final List r() {
        p().ag();
        if (!this.x) {
            return this.I.e();
        }
        cxb cxbVarP = p();
        byw bywVar = this.I;
        byw bywVarK = cxbVarP.k();
        Object[] objArr = bywVarK.a;
        int i = bywVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            cxb cxbVar = (cxb) objArr[i2];
            if (bywVar.b <= i2) {
                bywVar.n(cxbVar.w.o);
            } else {
                bywVar.d(i2, cxbVar.w.o);
            }
        }
        bywVar.h(cxbVarP.v().size(), bywVar.b);
        this.x = false;
        return bywVar.e();
    }

    public final void s() {
        this.v = true;
        this.H = true;
    }

    public final void t() {
        this.u = true;
    }

    public final void u() {
        if (this.s) {
            this.s = false;
            ((czq) cxe.a(p())).p.f(p());
            cxb cxbVarP = p();
            cyc cycVar = cxbVarP.p().w;
            for (cyc cycVarQ = cxbVarP.q(); !affa.f(cycVarQ, cycVar) && cycVarQ != null; cycVarQ = cycVarQ.w) {
                cycVarQ.aq();
                cycVarQ.au();
            }
            byw bywVarK = p().k();
            Object[] objArr = bywVarK.a;
            int i = bywVarK.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((cxb) objArr[i2]).o().u();
            }
        }
    }

    @Override // defpackage.cto
    public final cuo v(long j) throws Throwable {
        int i = 3;
        if (p().E == 3) {
            p().z();
        }
        if (cjn.s(p())) {
            cxn cxnVarH = H();
            cxnVarH.getClass();
            cxnVarH.y = 3;
            cxnVarH.v(j);
        }
        cxb cxbVarP = p();
        cxb cxbVarL = cxbVarP.l();
        if (cxbVarL != null) {
            if (this.G != 3 && !cxbVarP.u) {
                crt.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iAv = cxbVarL.av();
            int i2 = iAv - 1;
            if (iAv == 0) {
                throw null;
            }
            if (i2 == 0) {
                i = 1;
            } else {
                if (i2 != 2) {
                    int iAv2 = cxbVarL.av();
                    Objects.toString(cjn.t(iAv2));
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(cjn.t(iAv2)));
                }
                i = 2;
            }
        }
        this.G = i;
        E(j);
        return this;
    }

    @Override // defpackage.cuo
    public final int x() {
        return q().x();
    }

    @Override // defpackage.cuo
    public final void y(long j, float f, cmi cmiVar) throws Throwable {
        K(j, f, null, cmiVar);
    }
}
