package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cxl implements defpackage.buy, defpackage.cyv, defpackage.cyt {
    private static final defpackage.cxk G = new defpackage.cxj();
    private static final defpackage.dck H = new defpackage.cxi();
    public static final defpackage.afer a;
    public static final java.util.Comparator b;
    public defpackage.affc A;
    public boolean B;
    public int C;
    public boolean D;
    public int E;
    public defpackage.cdd F;
    private final boolean I;
    private int J;
    private defpackage.bzc K;
    private boolean L;
    private defpackage.cxl M;
    private defpackage.ddz N;
    private final defpackage.bzc O;
    private boolean P;
    private defpackage.cyl Q;
    private boolean R;
    private defpackage.cgf S;
    private int T;
    private defpackage.tc U;
    private final defpackage.bil V;
    public int c;
    public boolean d;
    public long e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public defpackage.cxl j;
    public defpackage.cyu k;
    public defpackage.dmm l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public defpackage.cty q;
    public defpackage.dlo r;
    public defpackage.dlz s;
    public defpackage.dck t;
    public boolean u;
    public final defpackage.cyg v;
    public final defpackage.cxp w;
    public defpackage.ctu x;
    public defpackage.cgf y;
    public defpackage.affc z;

    static {
        int i = 3;
        a = new defpackage.con(i);
        b = new defpackage.azq(i);
    }

    public cxl(boolean z, int i) {
        this.I = z;
        this.c = i;
        this.e = 9223372034707292159L;
        this.f = true;
        this.g = true;
        this.h = -4;
        this.V = new defpackage.bil(new defpackage.bzc(new defpackage.cxl[16]), new defpackage.cew(this, 4), (byte[]) null);
        this.O = new defpackage.bzc(new defpackage.cxl[16]);
        this.P = true;
        this.q = G;
        this.r = defpackage.cxo.a;
        this.s = defpackage.dlz.a;
        this.t = H;
        this.F = defpackage.bvn.a;
        this.E = 3;
        this.T = 3;
        this.v = new defpackage.cyg(this);
        this.w = new defpackage.cxp(this);
        this.R = true;
        this.y = defpackage.cgf.e;
    }

    private final java.lang.String aA(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        defpackage.bzc bzcVarK = k();
        java.lang.Object[] objArr = bzcVarK.a;
        int i3 = bzcVarK.b;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((defpackage.cxl) objArr[i4]).aA(i + 1));
        }
        java.lang.String string = sb.toString();
        if (i != 0) {
            return string;
        }
        java.lang.String strSubstring = string.substring(0, string.length() - 1);
        strSubstring.getClass();
        return strSubstring;
    }

    private final java.lang.String aB(defpackage.cxl cxlVar) {
        java.lang.String strAA = aA(0);
        defpackage.cxl cxlVar2 = cxlVar.M;
        return "Cannot insert " + cxlVar + " because it already has a parent or an owner. This tree: " + strAA + " Other tree: " + (cxlVar2 != null ? cxlVar2.aA(0) : null);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 5371. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private final void aC(defpackage.cgf r23) {
        /*
            Method dump skipped, instruction units count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxl.aC(cgf):void");
    }

    private final void aD() {
        defpackage.cxl cxlVar;
        if (this.J > 0) {
            this.L = true;
        }
        if (!this.I || (cxlVar = this.M) == null) {
            return;
        }
        cxlVar.aD();
    }

    private final void aE(defpackage.cxl cxlVar) {
        if (cxlVar.w.k > 0) {
            defpackage.cxp cxpVar = this.w;
            cxpVar.g(cxpVar.k - 1);
        }
        if (this.k != null) {
            cxlVar.B();
        }
        cxlVar.M = null;
        if (cxlVar.C > 0) {
            ac(this.C - 1);
        }
        cxlVar.q().x = null;
        if (cxlVar.I) {
            this.J--;
            defpackage.bzc bzcVar = (defpackage.bzc) cxlVar.V.b;
            java.lang.Object[] objArr = bzcVar.a;
            int i = bzcVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((defpackage.cxl) objArr[i2]).q().x = null;
            }
        }
        aD();
        Q();
    }

    private final void aF() {
        I();
        defpackage.cxl cxlVarL = l();
        if (cxlVarL != null) {
            cxlVarL.G();
        } else {
            defpackage.cyu cyuVar = this.k;
            if (cyuVar != null) {
                ((defpackage.czz) cyuVar).invalidate();
            }
        }
        H();
    }

    private final void aG() {
        defpackage.cyg cygVar = this.v;
        for (defpackage.cge cgeVar = cygVar.e; cgeVar != null; cgeVar = cgeVar.t) {
            if (cgeVar.A) {
                cgeVar.Q();
            }
        }
        cygVar.f();
        cygVar.c();
    }

    private final void aH(defpackage.cxl cxlVar) {
        if (defpackage.afga.f(cxlVar, this.j)) {
            return;
        }
        this.j = cxlVar;
        defpackage.cxp cxpVar = this.w;
        if (cxlVar != null) {
            if (cxpVar.p == null) {
                cxpVar.p = new defpackage.cxw(cxpVar);
            }
            defpackage.cyl cylVar = p().w;
            for (defpackage.cyl cylVarQ = q(); !defpackage.afga.f(cylVarQ, cylVar) && cylVarQ != null; cylVarQ = cylVarQ.w) {
                cylVarQ.D();
            }
        } else {
            cxpVar.p = null;
            cxpVar.e = false;
            cxpVar.d = false;
        }
        I();
    }

    public final void A() {
        this.T = this.E;
        this.E = 3;
        defpackage.bzc bzcVarK = k();
        java.lang.Object[] objArr = bzcVarK.a;
        int i = bzcVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.cxl cxlVar = (defpackage.cxl) objArr[i2];
            if (cxlVar.E == 2) {
                cxlVar.A();
            }
        }
    }

    public final void B() {
        defpackage.cwe cweVar;
        defpackage.cyu cyuVar = this.k;
        if (cyuVar == null) {
            defpackage.cxl cxlVarL = l();
            defpackage.csc.a("Cannot detach node that is already detached!  Tree: ".concat(java.lang.String.valueOf(cxlVarL != null ? cxlVarL.aA(0) : null)));
            throw new defpackage.afap();
        }
        defpackage.cxl cxlVarL2 = l();
        if (cxlVarL2 != null) {
            cxlVarL2.G();
            cxlVarL2.I();
            o().G = 3;
            defpackage.cxw cxwVarN = n();
            if (cxwVarN != null) {
                cxwVarN.y = 3;
            }
        }
        defpackage.cxp cxpVar = this.w;
        cxpVar.o.w.h();
        defpackage.cxw cxwVar = cxpVar.p;
        if (cxwVar != null && (cweVar = cxwVar.p) != null) {
            cweVar.h();
        }
        defpackage.cyl cylVar = p().w;
        for (defpackage.cyl cylVarQ = q(); !defpackage.afga.f(cylVarQ, cylVar) && cylVarQ != null; cylVarQ = cylVarQ.w) {
            cylVarQ.au();
            if (cylVarQ.t.an()) {
                cylVarQ.aq();
            }
        }
        defpackage.affc affcVar = this.A;
        if (affcVar != null) {
            affcVar.invoke(cyuVar);
        }
        defpackage.cyg cygVar = this.v;
        cygVar.f();
        this.n = true;
        defpackage.bzc bzcVar = (defpackage.bzc) this.V.b;
        java.lang.Object[] objArr = bzcVar.a;
        int i = bzcVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((defpackage.cxl) objArr[i2]).B();
        }
        this.n = false;
        cygVar.c();
        defpackage.czz czzVar = (defpackage.czz) cyuVar;
        czzVar.M.d(this.c);
        defpackage.cxy cxyVar = czzVar.z;
        cxyVar.i.w(this);
        ((defpackage.bzc) cxyVar.g.a).m(this);
        czzVar.v = true;
        defpackage.cgp cgpVar = czzVar.Q;
        if (cgpVar != null && cgpVar.h.e(this.c)) {
            cgpVar.g.c(cgpVar.a, this.c, false);
        }
        czzVar.p.f(this);
        this.k = null;
        aH(null);
        this.m = 0;
        defpackage.cxz cxzVarO = o();
        cxzVarO.i = Integer.MAX_VALUE;
        cxzVarO.h = Integer.MAX_VALUE;
        cxzVarO.s = false;
        defpackage.cxw cxwVarN2 = n();
        if (cxwVarN2 != null) {
            cxwVarN2.i = Integer.MAX_VALUE;
            cxwVarN2.h = Integer.MAX_VALUE;
            cxwVarN2.z = 3;
        }
        if (cygVar.i(8)) {
            defpackage.ddz ddzVar = this.N;
            this.N = null;
            this.o = false;
            czzVar.W.y(this, ddzVar);
            cyuVar.B();
        }
    }

    public final void C(defpackage.ckc ckcVar, defpackage.cmq cmqVar) throws java.lang.Throwable {
        try {
            q().ah(ckcVar, cmqVar);
        } catch (java.lang.Throwable th) {
            as(th);
            throw new defpackage.afap();
        }
    }

    public final void D() {
        if (this.j != null) {
            V(false, false, true);
        } else {
            X(false, false, true);
        }
        defpackage.dlm dlmVarB = this.w.b();
        defpackage.cyu cyuVar = this.k;
        if (dlmVarB != null) {
            if (cyuVar != null) {
                cyuVar.w(this, dlmVarB.a);
            }
        } else if (cyuVar != null) {
            cyuVar.v(true);
        }
    }

    public final void E(long j, defpackage.cwy cwyVar, int i, boolean z) {
        defpackage.cyl cylVarQ = q();
        defpackage.affc affcVar = defpackage.cyl.p;
        q().aj(defpackage.cyl.r, cylVarQ.aB(j), cwyVar, i, z);
    }

    public final void F(int i, defpackage.cxl cxlVar) {
        if (cxlVar.M != null && cxlVar.k != null) {
            defpackage.csc.c(aB(cxlVar));
        }
        cxlVar.M = this;
        this.V.n(i, cxlVar);
        Q();
        if (cxlVar.I) {
            this.J++;
        }
        aD();
        defpackage.cyu cyuVar = this.k;
        if (cyuVar != null) {
            cxlVar.y(cyuVar);
        }
        if (cxlVar.w.k > 0) {
            defpackage.cxp cxpVar = this.w;
            cxpVar.g(cxpVar.k + 1);
        }
        if (cxlVar.C > 0) {
            ac(this.C + 1);
        }
    }

    public final void G() {
        if (this.R) {
            defpackage.cyl cylVarP = p();
            defpackage.cyl cylVar = q().x;
            this.Q = null;
            while (!defpackage.afga.f(cylVarP, cylVar)) {
                if ((cylVarP != null ? cylVarP.I : null) != null) {
                    this.Q = cylVarP;
                    break;
                }
                cylVarP = cylVarP != null ? cylVarP.x : null;
            }
            this.R = false;
        }
        defpackage.cyl cylVar2 = this.Q;
        if (cylVar2 != null && cylVar2.I == null) {
            defpackage.csc.a("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
            throw new defpackage.afap();
        }
        if (cylVar2 != null) {
            cylVar2.ak();
            return;
        }
        defpackage.cxl cxlVarL = l();
        if (cxlVarL != null) {
            cxlVarL.G();
            return;
        }
        defpackage.cyu cyuVar = this.k;
        if (cyuVar != null) {
            ((defpackage.czz) cyuVar).invalidate();
        }
    }

    public final void H() {
        defpackage.cyl cylVarQ = q();
        defpackage.cyl cylVarP = p();
        while (cylVarQ != cylVarP) {
            cylVarQ.getClass();
            defpackage.cxh cxhVar = (defpackage.cxh) cylVarQ;
            defpackage.cys cysVar = cxhVar.I;
            if (cysVar != null) {
                cysVar.invalidate();
            }
            cylVarQ = cxhVar.w;
        }
        defpackage.cys cysVar2 = p().I;
        if (cysVar2 != null) {
            cysVar2.invalidate();
        }
    }

    public final void I() {
        if (this.I) {
            defpackage.cxl cxlVarL = l();
            if (cxlVarL != null) {
                cxlVarL.I();
                return;
            }
            return;
        }
        if (this.j != null) {
            V(false, true, true);
        } else {
            X(false, true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [affc, java.lang.Object] */
    public final void J() {
        if (this.p) {
            return;
        }
        if (this.v.b.u != null || ah()) {
            this.o = true;
            return;
        }
        defpackage.ddz ddzVar = this.N;
        this.p = true;
        defpackage.afgv afgvVar = new defpackage.afgv();
        afgvVar.a = new defpackage.ddz();
        defpackage.cyx cyxVar = ((defpackage.czz) defpackage.cxo.a(this)).w;
        defpackage.bxn bxnVar = new defpackage.bxn(this, afgvVar, 3);
        ((defpackage.cez) cyxVar.a).b(this, cyxVar.d, bxnVar);
        this.p = false;
        this.N = (defpackage.ddz) afgvVar.a;
        this.o = false;
        defpackage.cyu cyuVarA = defpackage.cxo.a(this);
        ((defpackage.czz) cyuVarA).W.y(this, ddzVar);
        cyuVarA.B();
    }

    public final void K() {
        defpackage.cxl cxlVarL;
        if (this.E == 3) {
            A();
        }
        defpackage.cxw cxwVarN = n();
        cxwVarN.getClass();
        try {
            cxwVarN.g = true;
            if (!cxwVarN.k) {
                defpackage.csc.c("replace() called on item that was not placed");
            }
            cxwVarN.x = false;
            boolean zE = cxwVarN.E();
            cxwVarN.G(cxwVarN.m, cxwVarN.n, cxwVarN.o);
            if (zE && !cxwVarN.x && (cxlVarL = cxwVarN.p().l()) != null) {
                cxlVarL.U(false);
            }
        } finally {
            cxwVarN.g = false;
        }
    }

    public final void L() {
        this.w.o.s();
    }

    public final void M() {
        this.w.d = true;
    }

    public final void N() {
        this.w.o.t();
    }

    public final void O(int i, int i2, int i3) {
        if (i != i2) {
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i > i2 ? i + i4 : i;
                int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
                defpackage.bil bilVar = this.V;
                bilVar.n(i6, (defpackage.cxl) bilVar.m(i5));
            }
            Q();
            aD();
            I();
        }
    }

    public final void P(defpackage.cyl cylVar) {
        defpackage.cyu cyuVar = this.k;
        defpackage.dep depVar = cyuVar != null ? ((defpackage.czz) cyuVar).p : null;
        boolean z = av() != 5 || al() || ai();
        if (this.h != -4 && depVar != null) {
            if (cylVar == q()) {
                this.g = true;
                if (!z) {
                    depVar.e(this);
                }
            } else {
                this.f = true;
                defpackage.bzc bzcVarK = k();
                java.lang.Object[] objArr = bzcVarK.a;
                int i = bzcVarK.b;
                for (int i2 = 0; i2 < i; i2++) {
                    defpackage.cxl cxlVar = (defpackage.cxl) objArr[i2];
                    cxlVar.g = true;
                    if (!z) {
                        depVar.e(cxlVar);
                    }
                }
                if (defpackage.dep.h(this)) {
                    depVar.d = true;
                    int iA = depVar.a(this) + 2;
                    long[] jArr = (long[]) depVar.b.b;
                    long j = jArr[iA];
                    jArr[iA] = j | (((j >> 63) & 1) << 60);
                }
                depVar.i();
            }
        }
        this.w.o.D();
    }

    public final void Q() {
        if (!this.I) {
            this.P = true;
            return;
        }
        defpackage.cxl cxlVarL = l();
        if (cxlVarL != null) {
            cxlVarL.Q();
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [afer, java.lang.Object] */
    public final void R() {
        defpackage.bil bilVar = this.V;
        defpackage.bzc bzcVar = (defpackage.bzc) bilVar.b;
        int i = bzcVar.b;
        while (true) {
            i--;
            if (i < 0) {
                bzcVar.g();
                bilVar.a.invoke();
                return;
            }
            aE((defpackage.cxl) bzcVar.a[i]);
        }
    }

    public final void S(int i, int i2) {
        if (i2 < 0) {
            defpackage.csc.b(defpackage.a.bm(i2, "count (", ") must be greater than 0"));
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            defpackage.bil bilVar = this.V;
            aE((defpackage.cxl) ((defpackage.bzc) bilVar.b).a[i3]);
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void T() {
        defpackage.cxl cxlVarL;
        if (this.E == 3) {
            A();
        }
        defpackage.cxz cxzVarO = o();
        try {
            cxzVarO.g = true;
            if (!cxzVarO.k) {
                defpackage.csc.c("replace called on unplaced item");
            }
            boolean z = cxzVarO.s;
            cxzVarO.C(cxzVarO.m, cxzVarO.p, cxzVarO.n, cxzVarO.o);
            if (z && !cxzVarO.B && (cxlVarL = cxzVarO.p().l()) != null) {
                cxlVarL.W(false);
            }
            cxzVarO.g = false;
        } catch (java.lang.Throwable th) {
            try {
                cxzVarO.p().as(th);
                throw new defpackage.afap();
            } catch (java.lang.Throwable th2) {
                cxzVarO.g = false;
                throw th2;
            }
        }
    }

    public final void U(boolean z) {
        defpackage.cyu cyuVar;
        if (this.I || (cyuVar = this.k) == null) {
            return;
        }
        cyuVar.A(this, true, z);
    }

    public final void V(boolean z, boolean z2, boolean z3) {
        defpackage.cxl cxlVarL;
        if (this.j == null) {
            defpackage.csc.c("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        defpackage.cyu cyuVar = this.k;
        if (cyuVar == null || this.n || this.I) {
            return;
        }
        cyuVar.z(this, true, z, z2);
        if (z3) {
            defpackage.cxw cxwVarN = n();
            cxwVarN.getClass();
            defpackage.cxl cxlVarL2 = cxwVarN.p().l();
            int i = cxwVarN.p().E;
            if (cxlVarL2 == null || i == 3) {
                return;
            }
            while (cxlVarL2.E == i && (cxlVarL = cxlVarL2.l()) != null) {
                cxlVarL2 = cxlVarL;
            }
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                if (cxlVarL2.j != null) {
                    cxlVarL2.V(z, true, true);
                    return;
                } else {
                    cxlVarL2.X(z, true, true);
                    return;
                }
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (cxlVarL2.j != null) {
                cxlVarL2.U(z);
            } else {
                cxlVarL2.W(z);
            }
        }
    }

    public final void W(boolean z) {
        defpackage.cyu cyuVar;
        if (this.I || (cyuVar = this.k) == null) {
            return;
        }
        cyuVar.A(this, false, z);
    }

    public final void X(boolean z, boolean z2, boolean z3) {
        defpackage.cyu cyuVar;
        defpackage.cxl cxlVarL;
        if (this.n || this.I || (cyuVar = this.k) == null) {
            return;
        }
        cyuVar.z(this, false, z, z2);
        if (z3) {
            defpackage.cxz cxzVarO = o();
            defpackage.cxl cxlVarL2 = cxzVarO.p().l();
            int i = cxzVarO.p().E;
            if (cxlVarL2 == null || i == 3) {
                return;
            }
            while (cxlVarL2.E == i && (cxlVarL = cxlVarL2.l()) != null) {
                cxlVarL2 = cxlVarL;
            }
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                cxlVarL2.X(z, true, true);
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("Intrinsics isn't used by the parent");
                }
                cxlVarL2.W(z);
            }
        }
    }

    public final void Y(defpackage.cxl cxlVar) {
        int iAv = cxlVar.av();
        int i = iAv - 1;
        if (iAv == 0) {
            throw null;
        }
        if (i != 4) {
            int iAv2 = cxlVar.av();
            defpackage.dai.D(iAv2);
            throw new java.lang.IllegalStateException("Unexpected state ".concat(defpackage.dai.D(iAv2)));
        }
        if (cxlVar.ak()) {
            cxlVar.V(true, true, true);
            return;
        }
        if (cxlVar.aj()) {
            cxlVar.U(true);
        }
        if (cxlVar.al()) {
            cxlVar.X(true, true, true);
        } else if (cxlVar.ai()) {
            cxlVar.W(true);
        }
    }

    public final void Z() {
        defpackage.bzc bzcVarK = k();
        java.lang.Object[] objArr = bzcVarK.a;
        int i = bzcVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.cxl cxlVar = (defpackage.cxl) objArr[i2];
            int i3 = cxlVar.T;
            cxlVar.E = i3;
            if (i3 != 3) {
                cxlVar.Z();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [cge] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [cge] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [bzc] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [bzc] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // defpackage.cyt
    public final void a() {
        defpackage.cyl cylVarP = p();
        int i = defpackage.cym.a;
        defpackage.czf czfVar = ((defpackage.cxa) cylVarP).f;
        for (defpackage.cge cgeVarAb = cylVarP.ab(true); cgeVarAb != null && (cgeVarAb.s & 4194304) != 0; cgeVarAb = cgeVarAb.u) {
            if ((cgeVarAb.r & 4194304) != 0) {
                ?? O = cgeVarAb;
                ?? bzcVar = 0;
                while (O != 0) {
                    if (O instanceof defpackage.cxc) {
                        ((defpackage.cxc) O).f(p());
                    } else if ((O.r & 4194304) != 0 && (O instanceof defpackage.cwo)) {
                        defpackage.cge cgeVar = ((defpackage.cwo) O).C;
                        int i2 = 0;
                        while (cgeVar != null) {
                            if ((cgeVar.r & 4194304) != 0) {
                                i2++;
                                if (i2 == 1) {
                                    O = O;
                                    bzcVar = bzcVar;
                                    bzcVar = bzcVar;
                                    O = cgeVar;
                                } else {
                                    if (bzcVar == 0) {
                                        bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                    }
                                    if (O != 0) {
                                        bzcVar.n(O);
                                    }
                                    bzcVar.n(cgeVar);
                                    O = 0;
                                }
                            } else {
                                O = O;
                                bzcVar = bzcVar;
                            }
                            cgeVar = cgeVar.u;
                            O = O;
                            bzcVar = bzcVar;
                        }
                        if (i2 != 1) {
                            O = O;
                            bzcVar = bzcVar;
                        } else {
                            O = O;
                            bzcVar = bzcVar;
                        }
                    }
                    O = defpackage.cjv.o(bzcVar);
                }
            }
            if (cgeVarAb == czfVar) {
                return;
            }
        }
    }

    public final void aa(int i) {
        this.i = i;
    }

    public final void ab(defpackage.dlo dloVar) {
        if (defpackage.afga.f(this.r, dloVar)) {
            return;
        }
        this.r = dloVar;
        aF();
        for (defpackage.cge cgeVar = this.v.f; cgeVar != null; cgeVar = cgeVar.u) {
            cgeVar.t();
        }
    }

    public final void ac(int i) {
        defpackage.cxl cxlVarL;
        defpackage.cxl cxlVarL2;
        int i2 = this.C;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (cxlVarL2 = l()) != null) {
                cxlVarL2.ac(cxlVarL2.C + 1);
            }
            if (i == 0 && this.C > 0 && (cxlVarL = l()) != null) {
                cxlVarL.ac(cxlVarL.C - 1);
            }
            this.C = i;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [bwx, java.lang.Object] */
    public final void ad(defpackage.cty ctyVar) {
        if (defpackage.afga.f(this.q, ctyVar)) {
            return;
        }
        this.q = ctyVar;
        defpackage.tc tcVar = this.U;
        if (tcVar != null) {
            tcVar.a.b(ctyVar);
        }
        I();
    }

    public final void ae(defpackage.cgf cgfVar) {
        if (this.I && this.y != defpackage.cgf.e) {
            defpackage.csc.b("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.D) {
            defpackage.csc.b("modifier is updated when deactivated");
        }
        if (!am()) {
            this.S = cgfVar;
            return;
        }
        aC(cgfVar);
        if (this.o) {
            J();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [cge] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [cge] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [bzc] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [bzc] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void af(defpackage.dck dckVar) {
        if (defpackage.afga.f(this.t, dckVar)) {
            return;
        }
        this.t = dckVar;
        defpackage.cyg cygVar = this.v;
        if ((cygVar.a() & 16) != 0) {
            for (defpackage.cge cgeVar = cygVar.f; cgeVar != null; cgeVar = cgeVar.u) {
                if ((cgeVar.r & 16) != 0) {
                    ?? O = cgeVar;
                    ?? bzcVar = 0;
                    while (O != 0) {
                        if (O instanceof defpackage.cza) {
                            ((defpackage.cza) O).t();
                        } else if ((O.r & 16) != 0 && (O instanceof defpackage.cwo)) {
                            defpackage.cge cgeVar2 = ((defpackage.cwo) O).C;
                            int i = 0;
                            O = O;
                            bzcVar = bzcVar;
                            while (cgeVar2 != null) {
                                if ((cgeVar2.r & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        bzcVar = bzcVar;
                                        O = cgeVar2;
                                    } else {
                                        if (bzcVar == 0) {
                                            bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                        }
                                        if (O != 0) {
                                            bzcVar.n(O);
                                        }
                                        bzcVar.n(cgeVar2);
                                        O = 0;
                                    }
                                }
                                cgeVar2 = cgeVar2.u;
                                O = O;
                                bzcVar = bzcVar;
                            }
                            if (i != 1) {
                            }
                        }
                        O = defpackage.cjv.o(bzcVar);
                    }
                }
                if ((cgeVar.s & 16) == 0) {
                    return;
                }
            }
        }
    }

    public final void ag() {
        if (this.J <= 0 || !this.L) {
            return;
        }
        this.L = false;
        defpackage.bzc bzcVar = this.K;
        if (bzcVar == null) {
            bzcVar = new defpackage.bzc(new defpackage.cxl[16]);
            this.K = bzcVar;
        }
        bzcVar.g();
        defpackage.bzc bzcVar2 = (defpackage.bzc) this.V.b;
        java.lang.Object[] objArr = bzcVar2.a;
        int i = bzcVar2.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.cxl cxlVar = (defpackage.cxl) objArr[i2];
            if (cxlVar.I) {
                bzcVar.o(bzcVar.b, cxlVar.k());
            } else {
                bzcVar.n(cxlVar);
            }
        }
        this.w.d();
    }

    public final boolean ah() {
        return this.S != null;
    }

    public final boolean ai() {
        return this.w.n();
    }

    public final boolean aj() {
        return this.w.e;
    }

    public final boolean ak() {
        return this.w.d;
    }

    public final boolean al() {
        return this.w.o.u;
    }

    public final boolean am() {
        return this.k != null;
    }

    public final boolean an() {
        return o().s;
    }

    public final boolean ao() {
        return o().t;
    }

    public final boolean ap(defpackage.dlm dlmVar) {
        if (dlmVar == null || this.j == null) {
            return false;
        }
        defpackage.cxw cxwVarN = n();
        cxwVarN.getClass();
        return cxwVarN.F(dlmVar.a);
    }

    public final boolean aq(defpackage.dlm dlmVar) {
        if (dlmVar == null) {
            return false;
        }
        if (this.E == 3) {
            z();
        }
        return o().E(dlmVar.a);
    }

    public final void ar(long j, defpackage.cwy cwyVar, boolean z) {
        defpackage.cyl cylVarQ = q();
        defpackage.affc affcVar = defpackage.cyl.p;
        q().aj(defpackage.cyl.s, cylVarQ.aB(j), cwyVar, 1, z);
    }

    public final void as(java.lang.Throwable th) throws java.lang.Throwable {
        defpackage.cfm cfmVar = (defpackage.cfm) this.F.f(defpackage.cfn.a);
        if (cfmVar == null) {
            throw th;
        }
        cfmVar.c(th, this);
        throw th;
    }

    public final void at() {
        this.R = true;
    }

    public final void au() {
        this.f = false;
    }

    public final int av() {
        return this.w.q;
    }

    public final int aw() {
        return o().G;
    }

    public final int ax() {
        int i;
        defpackage.cxw cxwVarN = n();
        if (cxwVarN == null || (i = cxwVarN.y) == 0) {
            return 3;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [cge] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [cge] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [bzc] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [bzc] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final void ay(defpackage.cdd cddVar) {
        this.F = cddVar;
        ab((defpackage.dlo) cddVar.f(defpackage.dbl.d));
        defpackage.dlz dlzVar = (defpackage.dlz) cddVar.f(defpackage.dbl.i);
        if (this.s != dlzVar) {
            this.s = dlzVar;
            aF();
            for (defpackage.cge cgeVar = this.v.f; cgeVar != null; cgeVar = cgeVar.u) {
                cgeVar.dk();
            }
        }
        af((defpackage.dck) cddVar.f(defpackage.dbl.n));
        defpackage.cyg cygVar = this.v;
        if ((cygVar.a() & 32768) != 0) {
            for (defpackage.cge cgeVar2 = cygVar.f; cgeVar2 != null; cgeVar2 = cgeVar2.u) {
                if ((cgeVar2.r & 32768) != 0) {
                    ?? O = cgeVar2;
                    ?? bzcVar = 0;
                    while (O != 0) {
                        if (O instanceof defpackage.cwm) {
                            defpackage.cge cgeVarM = ((defpackage.cwm) O).M();
                            if (cgeVarM.A) {
                                defpackage.cym.g(cgeVarM);
                            } else {
                                cgeVarM.y = true;
                            }
                        } else if ((O.r & 32768) != 0 && (O instanceof defpackage.cwo)) {
                            defpackage.cge cgeVar3 = ((defpackage.cwo) O).C;
                            int i = 0;
                            while (cgeVar3 != null) {
                                if ((cgeVar3.r & 32768) != 0) {
                                    i++;
                                    if (i == 1) {
                                        O = O;
                                        bzcVar = bzcVar;
                                        bzcVar = bzcVar;
                                        O = cgeVar3;
                                    } else {
                                        if (bzcVar == 0) {
                                            bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                        }
                                        if (O != 0) {
                                            bzcVar.n(O);
                                        }
                                        bzcVar.n(cgeVar3);
                                        O = 0;
                                    }
                                } else {
                                    O = O;
                                    bzcVar = bzcVar;
                                }
                                cgeVar3 = cgeVar3.u;
                                O = O;
                                bzcVar = bzcVar;
                            }
                            if (i != 1) {
                                O = O;
                                bzcVar = bzcVar;
                            } else {
                                O = O;
                                bzcVar = bzcVar;
                            }
                        }
                        O = defpackage.cjv.o(bzcVar);
                    }
                }
                if ((cgeVar2.s & 32768) == 0) {
                    return;
                }
            }
        }
    }

    public final defpackage.tc az() {
        defpackage.tc tcVar = this.U;
        if (tcVar != null) {
            return tcVar;
        }
        defpackage.tc tcVar2 = new defpackage.tc(this, this.q);
        this.U = tcVar2;
        return tcVar2;
    }

    @Override // defpackage.buy
    public final void b() {
        defpackage.cgp cgpVar;
        defpackage.dmm dmmVar = this.l;
        if (dmmVar != null) {
            dmmVar.removeAllViewsInLayout();
        }
        defpackage.ctu ctuVar = this.x;
        if (ctuVar != null) {
            ctuVar.l(true);
        }
        this.D = true;
        aG();
        if (am()) {
            this.N = null;
            this.o = false;
        }
        defpackage.cyu cyuVar = this.k;
        if (cyuVar == null || (cgpVar = ((defpackage.czz) cyuVar).Q) == null || !cgpVar.h.e(this.c)) {
            return;
        }
        cgpVar.g.c(cgpVar.a, this.c, false);
    }

    @Override // defpackage.buy
    public final void c() {
        defpackage.dmm dmmVar = this.l;
        if (dmmVar != null) {
            dmmVar.c();
        }
        defpackage.ctu ctuVar = this.x;
        if (ctuVar != null) {
            ctuVar.g();
        }
        defpackage.cyl cylVar = p().w;
        for (defpackage.cyl cylVarQ = q(); !defpackage.afga.f(cylVarQ, cylVar) && cylVarQ != null; cylVarQ = cylVarQ.w) {
            cylVarQ.ap();
        }
    }

    public final float d() {
        return o().A;
    }

    public final int e() {
        return this.w.o.b;
    }

    public final int f() {
        return o().i;
    }

    public final int g() {
        return this.w.o.a;
    }

    public final android.view.View h() {
        defpackage.dmm dmmVar = this.l;
        if (dmmVar != null) {
            return dmmVar.b;
        }
        return null;
    }

    @Override // defpackage.buy
    public final void i() {
        defpackage.dep depVar;
        defpackage.cgp cgpVar;
        defpackage.dep depVar2;
        if (!am()) {
            defpackage.csc.b("onReuse is only expected on attached node");
        }
        defpackage.dmm dmmVar = this.l;
        if (dmmVar != null) {
            dmmVar.i();
        }
        defpackage.ctu ctuVar = this.x;
        if (ctuVar != null) {
            ctuVar.l(false);
        }
        this.p = false;
        if (this.D) {
            this.D = false;
        } else {
            aG();
        }
        int i = this.c;
        defpackage.cyu cyuVar = this.k;
        if (cyuVar != null && (depVar2 = ((defpackage.czz) cyuVar).p) != null) {
            depVar2.f(this);
        }
        this.c = defpackage.dea.a.addAndGet(1);
        defpackage.cyu cyuVar2 = this.k;
        if (cyuVar2 != null) {
            defpackage.zo zoVar = ((defpackage.czz) cyuVar2).M;
            zoVar.d(i);
            zoVar.g(this.c, this);
        }
        defpackage.cyg cygVar = this.v;
        cygVar.b();
        cygVar.e();
        if (cygVar.i(8)) {
            J();
        }
        Y(this);
        defpackage.cyu cyuVar3 = this.k;
        if (cyuVar3 != null && (cgpVar = ((defpackage.czz) cyuVar3).Q) != null) {
            if (cgpVar.h.e(i)) {
                cgpVar.g.c(cgpVar.a, i, false);
            }
            defpackage.ddz ddzVarR = r();
            if (ddzVarR != null && defpackage.aau.f(ddzVarR.c, defpackage.def.r)) {
                cgpVar.h.d(this.c);
                cgpVar.g.c(cgpVar.a, this.c, true);
            }
        }
        defpackage.cyu cyuVar4 = this.k;
        if (cyuVar4 == null || (depVar = ((defpackage.czz) cyuVar4).p) == null) {
            return;
        }
        depVar.e(this);
    }

    public final defpackage.bzc j() {
        if (this.P) {
            defpackage.bzc bzcVar = this.O;
            bzcVar.g();
            bzcVar.o(bzcVar.b, k());
            bzcVar.j(b);
            this.P = false;
        }
        return this.O;
    }

    public final defpackage.bzc k() {
        java.lang.Object obj;
        ag();
        if (this.J == 0) {
            obj = this.V.b;
        } else {
            obj = this.K;
            obj.getClass();
        }
        return (defpackage.bzc) obj;
    }

    public final defpackage.cxl l() {
        do {
            this = this.M;
            if (this == null) {
                break;
            }
        } while (this.I);
        return this;
    }

    public final defpackage.cxn m() {
        return ((defpackage.czz) defpackage.cxo.a(this)).P().h;
    }

    public final defpackage.cxw n() {
        return this.w.p;
    }

    public final defpackage.cxz o() {
        return this.w.o;
    }

    public final defpackage.cyl p() {
        return this.v.c;
    }

    public final defpackage.cyl q() {
        return this.v.d;
    }

    public final defpackage.ddz r() {
        if (am() && !this.D && this.v.i(8)) {
            return this.N;
        }
        return null;
    }

    public final java.lang.Boolean s() {
        defpackage.cxw cxwVarN = n();
        if (cxwVarN != null) {
            return java.lang.Boolean.valueOf(cxwVarN.E());
        }
        return null;
    }

    public final java.util.List t() {
        defpackage.cxw cxwVarN = n();
        cxwVarN.getClass();
        cxwVarN.p().v();
        if (!cxwVarN.r) {
            return cxwVarN.q.e();
        }
        defpackage.cxl cxlVarP = cxwVarN.p();
        defpackage.bzc bzcVar = cxwVarN.q;
        defpackage.bzc bzcVarK = cxlVarP.k();
        java.lang.Object[] objArr = bzcVarK.a;
        int i = bzcVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.cxl cxlVar = (defpackage.cxl) objArr[i2];
            if (bzcVar.b <= i2) {
                defpackage.cxw cxwVar = cxlVar.w.p;
                cxwVar.getClass();
                bzcVar.n(cxwVar);
            } else {
                defpackage.cxw cxwVar2 = cxlVar.w.p;
                cxwVar2.getClass();
                bzcVar.d(i2, cxwVar2);
            }
        }
        bzcVar.h(cxlVarP.v().size(), bzcVar.b);
        cxwVarN.r = false;
        return bzcVar.e();
    }

    public final java.lang.String toString() {
        return defpackage.dbc.f(this) + " children: " + v().size() + " measurePolicy: " + this.q + " deactivated: " + this.D + " isVirtual: " + this.I + " isPlaced: " + an();
    }

    public final java.util.List u() {
        return o().r();
    }

    public final java.util.List v() {
        return k().e();
    }

    @Override // defpackage.cyv
    public final boolean w() {
        return am();
    }

    public final java.util.List x() {
        return ((defpackage.bzc) this.V.b).e();
    }

    public final void y(defpackage.cyu cyuVar) {
        defpackage.cxl cxlVar;
        defpackage.ddz ddzVarR;
        if (this.k != null) {
            defpackage.csc.c("Cannot attach " + this + " as it already is attached.  Tree: " + aA(0));
        }
        defpackage.cxl cxlVar2 = this.M;
        if (cxlVar2 != null && !defpackage.afga.f(cxlVar2.k, cyuVar)) {
            defpackage.cxl cxlVarL = l();
            defpackage.cyu cyuVar2 = cxlVarL != null ? cxlVarL.k : null;
            java.lang.String strAA = aA(0);
            defpackage.cxl cxlVar3 = this.M;
            defpackage.csc.c("Attaching to a different owner(" + cyuVar + ") than the parent's owner(" + cyuVar2 + "). This tree: " + strAA + " Parent tree: " + (cxlVar3 != null ? cxlVar3.aA(0) : null));
        }
        defpackage.cxl cxlVarL2 = l();
        if (cxlVarL2 == null) {
            o().s = true;
            ((defpackage.czz) cyuVar).p.e(this);
            defpackage.cxw cxwVarN = n();
            if (cxwVarN != null) {
                cxwVarN.z = 1;
            }
        }
        q().x = cxlVarL2 != null ? cxlVarL2.p() : null;
        this.k = cyuVar;
        this.m = (cxlVarL2 != null ? cxlVarL2.m : -1) + 1;
        defpackage.cgf cgfVar = this.S;
        if (cgfVar != null) {
            aC(cgfVar);
        }
        this.S = null;
        defpackage.czz czzVar = (defpackage.czz) cyuVar;
        czzVar.M.g(this.c, this);
        defpackage.cxl cxlVar4 = this.M;
        if (cxlVar4 == null || (cxlVar = cxlVar4.j) == null) {
            cxlVar = this.j;
        }
        aH(cxlVar);
        if (this.j == null && this.v.i(512)) {
            aH(this);
        }
        if (!this.D) {
            this.v.b();
        }
        defpackage.bzc bzcVar = (defpackage.bzc) this.V.b;
        java.lang.Object[] objArr = bzcVar.a;
        int i = bzcVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((defpackage.cxl) objArr[i2]).y(cyuVar);
        }
        if (!this.D) {
            this.v.e();
        }
        I();
        if (cxlVarL2 != null) {
            cxlVarL2.I();
        }
        defpackage.affc affcVar = this.z;
        if (affcVar != null) {
            affcVar.invoke(cyuVar);
        }
        this.w.m();
        if (!this.D && this.v.i(8)) {
            J();
        }
        defpackage.cgp cgpVar = czzVar.Q;
        if (cgpVar == null || (ddzVarR = r()) == null || !defpackage.aau.f(ddzVarR.c, defpackage.def.r)) {
            return;
        }
        cgpVar.h.d(this.c);
        cgpVar.g.c(cgpVar.a, this.c, true);
    }

    public final void z() {
        this.T = this.E;
        this.E = 3;
        defpackage.bzc bzcVarK = k();
        java.lang.Object[] objArr = bzcVarK.a;
        int i = bzcVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.cxl cxlVar = (defpackage.cxl) objArr[i2];
            if (cxlVar.E != 3) {
                cxlVar.z();
            }
        }
    }

    public cxl() {
        this(false, 3, null);
    }

    public /* synthetic */ cxl(boolean z, int i, byte[] bArr) {
        this(1 == ((z ? 1 : 0) & ((i & 1) ^ 1)), defpackage.dea.a.addAndGet(1));
    }
}
