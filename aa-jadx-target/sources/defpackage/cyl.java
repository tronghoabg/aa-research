package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class cyl extends defpackage.cxu implements defpackage.ctx, defpackage.ctc, defpackage.cyv {
    public defpackage.cjj B;
    public defpackage.cjj C;
    public boolean D;
    public boolean E;
    public defpackage.cmq F;
    public defpackage.ckc G;
    public boolean H;
    public defpackage.cys I;
    private boolean J;
    private boolean K;
    private defpackage.affc L;
    private defpackage.dlo M;
    private defpackage.dlz N;
    private defpackage.ctz P;
    private defpackage.cjh Q;
    private defpackage.cxb R;
    private defpackage.affg S;
    private final defpackage.afer T;
    private defpackage.cmq U;
    private defpackage.aal V;
    public final defpackage.cxl t;
    public boolean u;
    public boolean v;
    public defpackage.cyl w;
    public defpackage.cyl x;
    public float z;
    private static final defpackage.affc f = new defpackage.bwy(15);
    public static final defpackage.affc p = new defpackage.bwy(16);
    public static final defpackage.cla q = new defpackage.cla();
    private static final defpackage.cxb g = new defpackage.cxb();
    private static final float[] h = defpackage.ckq.e();
    public static final defpackage.cyk r = new defpackage.cyi();
    public static final defpackage.cyk s = new defpackage.cyj();
    private float O = 1.0f;
    public long y = 0;
    public defpackage.cld A = defpackage.cky.a;

    public cyl(defpackage.cxl cxlVar) {
        this.t = cxlVar;
        this.M = cxlVar.r;
        this.N = cxlVar.s;
        defpackage.cjj cjjVar = defpackage.cjj.a;
        this.B = cjjVar;
        this.C = cjjVar;
        this.T = new defpackage.cew(this, 9);
    }

    private final defpackage.affg G() {
        defpackage.affg affgVar = this.S;
        if (affgVar != null) {
            return affgVar;
        }
        defpackage.aps apsVar = new defpackage.aps(this, new defpackage.cew(this, 8), 14, null);
        this.S = apsVar;
        return apsVar;
    }

    private final void H(defpackage.cyl cylVar, defpackage.cjh cjhVar, boolean z) {
        if (cylVar == this) {
            return;
        }
        defpackage.cyl cylVar2 = this.x;
        if (cylVar2 != null) {
            cylVar2.H(cylVar, cjhVar, z);
        }
        long j = this.y;
        float f2 = (int) (j >> 32);
        cjhVar.a -= f2;
        cjhVar.c -= f2;
        float f3 = (int) (j & 4294967295L);
        cjhVar.b -= f3;
        cjhVar.d -= f3;
        defpackage.cys cysVar = this.I;
        if (cysVar != null) {
            cysVar.e(cjhVar, true);
            if (this.K && z) {
                long j2 = this.c;
                cjhVar.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    private final void aD(defpackage.cge cgeVar, defpackage.cyk cykVar, long j, defpackage.cwy cwyVar, int i, boolean z) {
        if (cgeVar == null) {
            E(cykVar, j, cwyVar, i, z);
            return;
        }
        if (!cykVar.d(cgeVar)) {
            aD(defpackage.dai.A(cgeVar, cykVar.a()), cykVar, j, cwyVar, i, z);
            return;
        }
        int i2 = cwyVar.a;
        cwyVar.d(i2 + 1, cwyVar.a());
        cwyVar.a++;
        cwyVar.b.p(cgeVar);
        cwyVar.c.b(defpackage.ua.f(-1.0f, z, false));
        aD(defpackage.dai.A(cgeVar, cykVar.a()), cykVar, j, cwyVar, i, z);
        cwyVar.a = i2;
    }

    private final void aE(defpackage.cge cgeVar, defpackage.cyk cykVar, long j, defpackage.cwy cwyVar, int i, boolean z, float f2) {
        if (cgeVar == null) {
            E(cykVar, j, cwyVar, i, z);
            return;
        }
        if (!cykVar.d(cgeVar)) {
            aE(defpackage.dai.A(cgeVar, cykVar.a()), cykVar, j, cwyVar, i, z, f2);
            return;
        }
        int i2 = cwyVar.a;
        cwyVar.d(i2 + 1, cwyVar.a());
        cwyVar.a++;
        cwyVar.b.p(cgeVar);
        cwyVar.c.b(defpackage.ua.f(f2, z, false));
        ar(defpackage.dai.A(cgeVar, cykVar.a()), cykVar, j, cwyVar, i, z, f2, true);
        cwyVar.a = i2;
    }

    private final void aF(defpackage.cge cgeVar, defpackage.cyk cykVar, long j, defpackage.cwy cwyVar, int i, boolean z, float f2) {
        if (cgeVar == null) {
            E(cykVar, j, cwyVar, i, z);
        } else if (!cykVar.d(cgeVar)) {
            aF(defpackage.dai.A(cgeVar, cykVar.a()), cykVar, j, cwyVar, i, z, f2);
        } else {
            cykVar.f(cgeVar);
            ar(defpackage.dai.A(cgeVar, cykVar.a()), cykVar, j, cwyVar, i, z, f2, false);
        }
    }

    private final void aG(defpackage.cyl cylVar, float[] fArr) {
        if (defpackage.afga.f(cylVar, this)) {
            return;
        }
        defpackage.cyl cylVar2 = this.x;
        cylVar2.getClass();
        cylVar2.aG(cylVar, fArr);
        if (this.y != 0) {
            float[] fArr2 = h;
            defpackage.ckq.c(fArr2);
            long j = this.y;
            defpackage.ckq.g(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            defpackage.ckq.d(fArr, fArr2);
        }
        defpackage.cys cysVar = this.I;
        if (cysVar != null) {
            cysVar.d(fArr);
        }
    }

    private final void aH(defpackage.cyl cylVar, float[] fArr) {
        while (!defpackage.afga.f(this, cylVar)) {
            defpackage.cys cysVar = this.I;
            if (cysVar != null) {
                cysVar.i(fArr);
            }
            long j = this.y;
            if (j != 0) {
                float[] fArr2 = h;
                defpackage.ckq.c(fArr2);
                defpackage.ckq.g(fArr2, (int) (j >> 32), (int) (j & 4294967295L));
                defpackage.ckq.d(fArr, fArr2);
            }
            this = this.x;
            this.getClass();
        }
    }

    private final boolean aI() {
        return this.D && !this.B.h();
    }

    private final boolean aJ(int i) {
        int i2 = defpackage.cym.a;
        defpackage.cge cgeVarAb = ab((i & 128) != 0);
        return (cgeVarAb == null || (cgeVarAb.M().s & i) == 0) ? false : true;
    }

    private final long aK(defpackage.cyl cylVar, long j) {
        if (cylVar == this) {
            return j;
        }
        defpackage.cyl cylVar2 = this.x;
        return (cylVar2 == null || defpackage.afga.f(cylVar, cylVar2)) ? aB(j) : aB(cylVar2.aK(cylVar, j));
    }

    private static final defpackage.cyl aL(defpackage.ctc ctcVar) {
        defpackage.cyl cylVarA;
        defpackage.ctw ctwVar = ctcVar instanceof defpackage.ctw ? (defpackage.ctw) ctcVar : null;
        if (ctwVar != null && (cylVarA = ctwVar.a()) != null) {
            return cylVarA;
        }
        ctcVar.getClass();
        return (defpackage.cyl) ctcVar;
    }

    public abstract defpackage.cge B();

    public abstract defpackage.cxv C();

    public abstract void D();

    public void E(defpackage.cyk cykVar, long j, defpackage.cwy cwyVar, int i, boolean z) {
        defpackage.cyl cylVar = this.w;
        if (cylVar != null) {
            cylVar.aj(cykVar, cylVar.aB(j), cwyVar, i, z);
        }
    }

    public void F(defpackage.ckc ckcVar, defpackage.cmq cmqVar) {
        throw null;
    }

    @Override // defpackage.cxu
    public final long I() {
        return this.y;
    }

    @Override // defpackage.cxu
    public final defpackage.ctz K() {
        defpackage.ctz ctzVar = this.P;
        if (ctzVar != null) {
            return ctzVar;
        }
        throw new java.lang.IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // defpackage.cxu, defpackage.cya
    public final defpackage.cxl L() {
        return this.t;
    }

    @Override // defpackage.cxu
    public final defpackage.cxu N() {
        return this.w;
    }

    @Override // defpackage.cxu
    public final defpackage.cxu O() {
        return this.x;
    }

    @Override // defpackage.cxu
    public final void S() {
        defpackage.cmq cmqVar = this.U;
        long j = this.y;
        if (cmqVar != null) {
            y(j, this.z, cmqVar);
        } else {
            dD(j, this.z, this.L);
        }
    }

    @Override // defpackage.cxu
    public final boolean V() {
        return this.P != null;
    }

    protected final float X(long j, long j2) {
        if (x() >= java.lang.Float.intBitsToFloat((int) (j2 >> 32)) && dK() >= java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jY = Y(j2);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jY >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (jY & 4294967295L));
        float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fMax = java.lang.Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - x());
        float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        float fMax2 = java.lang.Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - dK());
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fMax);
        long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fMax2);
        long j3 = jFloatToRawIntBits << 32;
        long j4 = jFloatToRawIntBits2 & 4294967295L;
        if (fIntBitsToFloat <= 0.0f && fIntBitsToFloat2 <= 0.0f) {
            return Float.POSITIVE_INFINITY;
        }
        long j5 = j3 | j4;
        int i = (int) (j5 >> 32);
        if (java.lang.Float.intBitsToFloat(i) > fIntBitsToFloat) {
            return Float.POSITIVE_INFINITY;
        }
        int i2 = (int) (j5 & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i2) > fIntBitsToFloat2) {
            return Float.POSITIVE_INFINITY;
        }
        float fIntBitsToFloat5 = java.lang.Float.intBitsToFloat(i);
        float fIntBitsToFloat6 = java.lang.Float.intBitsToFloat(i2);
        return (fIntBitsToFloat5 * fIntBitsToFloat5) + (fIntBitsToFloat6 * fIntBitsToFloat6);
    }

    protected final long Y(long j) {
        float fX;
        float fDK;
        if (aI()) {
            defpackage.cjj cjjVar = this.B;
            fX = cjjVar.d - cjjVar.b;
        } else {
            fX = x();
        }
        if (aI()) {
            defpackage.cjj cjjVar2 = this.B;
            fDK = cjjVar2.e - cjjVar2.c;
        } else {
            fDK = dK();
        }
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) - fX;
        float fIntBitsToFloat2 = (java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - fDK) / 2.0f;
        float fMax = java.lang.Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return (((long) java.lang.Float.floatToRawIntBits(java.lang.Math.max(0.0f, fIntBitsToFloat2))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fMax) << 32);
    }

    public final long Z() {
        return this.M.dP(this.t.t.g());
    }

    @Override // defpackage.dlo
    public final float a() {
        return this.t.r.a();
    }

    protected final void aA(defpackage.ckc ckcVar, defpackage.cjs cjsVar) {
        long j = this.c;
        ckcVar.l(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, cjsVar);
    }

    public final long aB(long j) {
        long j2 = this.y;
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L));
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fIntBitsToFloat);
        long jFloatToRawIntBits2 = ((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
        defpackage.cys cysVar = this.I;
        long j3 = jFloatToRawIntBits2 | (jFloatToRawIntBits << 32);
        return cysVar != null ? cysVar.a(j3, true) : j3;
    }

    public final long aC(long j) {
        defpackage.cys cysVar = this.I;
        if (cysVar != null) {
            j = cysVar.a(j, false);
        }
        return defpackage.dlv.c(j, this.y);
    }

    public final defpackage.cge aa(int i) {
        int i2 = defpackage.cym.a;
        defpackage.cge cgeVar = B().t;
        if (cgeVar == null) {
            return null;
        }
        for (defpackage.cge cgeVarAb = ab(false); cgeVarAb != null && (cgeVarAb.s & i) != 0; cgeVarAb = cgeVarAb.u) {
            if ((cgeVarAb.r & i) != 0) {
                return cgeVarAb;
            }
            if (cgeVarAb == cgeVar) {
                return null;
            }
        }
        return null;
    }

    public final defpackage.cge ab(boolean z) {
        defpackage.cge cgeVarB;
        defpackage.cxl cxlVar = this.t;
        if (cxlVar.q() == this) {
            return cxlVar.v.f;
        }
        defpackage.cyl cylVar = this.x;
        if (!z) {
            if (cylVar == null) {
                return null;
            }
            return cylVar.B();
        }
        if (cylVar == null || (cgeVarB = cylVar.B()) == null) {
            return null;
        }
        return cgeVarB.u;
    }

    protected final defpackage.cjh ac() {
        defpackage.cjh cjhVar = this.Q;
        if (cjhVar != null) {
            return cjhVar;
        }
        defpackage.cjh cjhVar2 = new defpackage.cjh();
        this.Q = cjhVar2;
        return cjhVar2;
    }

    public final defpackage.cjj ad() {
        if (t()) {
            defpackage.ctc ctcVarG = defpackage.csc.g(this);
            defpackage.cjh cjhVarAc = ac();
            long jY = Y(Z());
            float f2 = aI() ? this.B.b : 0.0f;
            float f3 = aI() ? this.B.c : 0.0f;
            float fX = aI() ? this.B.d : x();
            float fDK = aI() ? this.B.e : dK();
            int i = (int) (jY >> 32);
            cjhVarAc.a = f2 - java.lang.Float.intBitsToFloat(i);
            int i2 = (int) (jY & 4294967295L);
            cjhVarAc.b = f3 - java.lang.Float.intBitsToFloat(i2);
            cjhVarAc.c = fX + java.lang.Float.intBitsToFloat(i);
            cjhVarAc.d = fDK + java.lang.Float.intBitsToFloat(i2);
            while (this != ctcVarG) {
                this.at(cjhVarAc, false, true);
                if (!cjhVarAc.c()) {
                    this = this.x;
                    this.getClass();
                }
            }
            return defpackage.bzd.o(cjhVarAc);
        }
        return defpackage.cjj.a;
    }

    public final defpackage.cwf ae() {
        return this.t.w.o;
    }

    public final defpackage.cyl af(defpackage.cyl cylVar) {
        defpackage.cxl cxlVar = cylVar.t;
        defpackage.cxl cxlVar2 = this.t;
        if (cxlVar == cxlVar2) {
            defpackage.cge cgeVarB = cylVar.B();
            defpackage.cge cgeVarB2 = B();
            if (!cgeVarB2.M().A) {
                defpackage.csc.c("visitLocalAncestors called on an unattached node");
            }
            defpackage.cge cgeVarM = cgeVarB2.M();
            while (true) {
                cgeVarM = cgeVarM.t;
                if (cgeVarM == null) {
                    return this;
                }
                if ((cgeVarM.r & 2) == 0 || cgeVarM != cgeVarB) {
                }
            }
        } else {
            defpackage.cxl cxlVarL = cxlVar;
            while (cxlVarL.m > cxlVar2.m) {
                cxlVarL = cxlVarL.l();
                cxlVarL.getClass();
            }
            defpackage.cxl cxlVarL2 = cxlVar2;
            while (cxlVarL2.m > cxlVarL.m) {
                cxlVarL2 = cxlVarL2.l();
                cxlVarL2.getClass();
            }
            while (cxlVarL != cxlVarL2) {
                cxlVarL = cxlVarL.l();
                cxlVarL2 = cxlVarL2.l();
                if (cxlVarL == null || cxlVarL2 == null) {
                    throw new java.lang.IllegalArgumentException("layouts are not part of the same hierarchy");
                }
            }
            if (cxlVarL2 == cxlVar2) {
                return this;
            }
            if (cxlVarL != cxlVar) {
                return cxlVarL.p();
            }
        }
        return cylVar;
    }

    public final defpackage.cyx ag() {
        return ((defpackage.czz) defpackage.cxo.a(this.t)).w;
    }

    public final void ah(defpackage.ckc ckcVar, defpackage.cmq cmqVar) {
        defpackage.cys cysVar = this.I;
        if (cysVar != null) {
            cysVar.c(ckcVar, cmqVar);
            return;
        }
        long j = this.y;
        float f2 = (int) (j >> 32);
        float f3 = (int) (j & 4294967295L);
        ckcVar.i(f2, f3);
        ai(ckcVar, cmqVar);
        ckcVar.i(-f2, -f3);
    }

    public final void ai(defpackage.ckc ckcVar, defpackage.cmq cmqVar) {
        defpackage.cyl cylVar;
        defpackage.ckc ckcVar2;
        defpackage.cmq cmqVar2;
        defpackage.cge cgeVarAa = aa(4);
        if (cgeVarAa == null) {
            F(ckcVar, cmqVar);
            return;
        }
        defpackage.cxn cxnVarM = this.t.m();
        long jF = defpackage.dlv.f(this.c);
        defpackage.bzc bzcVar = null;
        while (cgeVarAa != null) {
            if (cgeVarAa instanceof defpackage.cwu) {
                cylVar = this;
                ckcVar2 = ckcVar;
                cmqVar2 = cmqVar;
                cxnVarM.u(ckcVar2, jF, cylVar, (defpackage.cwu) cgeVarAa, cmqVar2);
            } else {
                cylVar = this;
                ckcVar2 = ckcVar;
                cmqVar2 = cmqVar;
                if ((cgeVarAa.r & 4) != 0 && (cgeVarAa instanceof defpackage.cwo)) {
                    int i = 0;
                    for (defpackage.cge cgeVar = ((defpackage.cwo) cgeVarAa).C; cgeVar != null; cgeVar = cgeVar.u) {
                        if ((cgeVar.r & 4) != 0) {
                            i++;
                            if (i == 1) {
                                cgeVarAa = cgeVar;
                            } else {
                                if (bzcVar == null) {
                                    bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                }
                                if (cgeVarAa != null) {
                                    bzcVar.n(cgeVarAa);
                                }
                                bzcVar.n(cgeVar);
                                cgeVarAa = null;
                            }
                        }
                    }
                    if (i != 1) {
                    }
                }
                ckcVar = ckcVar2;
                this = cylVar;
                cmqVar = cmqVar2;
            }
            cgeVarAa = defpackage.cjv.o(bzcVar);
            ckcVar = ckcVar2;
            this = cylVar;
            cmqVar = cmqVar2;
        }
    }

    public final void aj(defpackage.cyk cykVar, long j, defpackage.cwy cwyVar, int i, boolean z) {
        float fX;
        boolean z2;
        boolean z3;
        int i2 = i;
        defpackage.cge cgeVarAa = aa(cykVar.a());
        if (!az(j)) {
            if (i2 == 1) {
                float fX2 = X(j, Z());
                if ((java.lang.Float.floatToRawIntBits(fX2) & Integer.MAX_VALUE) >= 2139095040 || !cwyVar.e(fX2, false)) {
                    return;
                }
                aE(cgeVarAa, cykVar, j, cwyVar, 1, false, fX2);
                return;
            }
            return;
        }
        if (cgeVarAa == null) {
            E(cykVar, j, cwyVar, i, z);
            return;
        }
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (4294967295L & j));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < x() && fIntBitsToFloat2 < dK()) {
            aD(cgeVarAa, cykVar, j, cwyVar, i2, z);
            return;
        }
        if (i2 == 1) {
            fX = X(j, Z());
            i2 = 1;
        } else {
            fX = Float.POSITIVE_INFINITY;
        }
        if ((java.lang.Float.floatToRawIntBits(fX) & Integer.MAX_VALUE) < 2139095040) {
            z2 = z;
            if (cwyVar.e(fX, z2)) {
                this = this;
                j = j;
                z3 = true;
            }
            this.ar(cgeVarAa, cykVar, j, cwyVar, i2, z2, fX, z3);
        }
        z2 = z;
        z3 = false;
        this.ar(cgeVarAa, cykVar, j, cwyVar, i2, z2, fX, z3);
    }

    public final void ak() {
        defpackage.cys cysVar = this.I;
        if (cysVar != null) {
            cysVar.invalidate();
            return;
        }
        defpackage.cyl cylVar = this.x;
        if (cylVar != null) {
            cylVar.ak();
        }
    }

    public final void al() {
        this.t.w.f();
    }

    public final void am() {
        defpackage.cys cysVar = this.I;
        if (cysVar != null) {
            cysVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [cge] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [cge] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [bzc] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [bzc] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void an() {
        if (aJ(128)) {
            defpackage.cej cejVar = (defpackage.cej) defpackage.cer.i.j();
            defpackage.affc affcVarI = cejVar != null ? cejVar.i() : null;
            defpackage.cej cejVarH = defpackage.bzd.h(cejVar);
            try {
                int i = defpackage.cym.a;
                defpackage.cge cgeVarB = B();
                for (defpackage.cge cgeVarAb = ab(true); cgeVarAb != null && (cgeVarAb.s & 128) != 0; cgeVarAb = cgeVarAb.u) {
                    if ((cgeVarAb.r & 128) != 0) {
                        ?? bzcVar = 0;
                        ?? O = cgeVarAb;
                        while (O != 0) {
                            if (O instanceof defpackage.cyb) {
                                ((defpackage.cyb) O).dB(this.c);
                            } else if ((O.r & 128) != 0 && (O instanceof defpackage.cwo)) {
                                defpackage.cge cgeVar = ((defpackage.cwo) O).C;
                                int i2 = 0;
                                while (cgeVar != null) {
                                    if ((cgeVar.r & 128) != 0) {
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
                    if (cgeVarAb == cgeVarB) {
                        break;
                    }
                }
            } finally {
                defpackage.bzd.k(cejVar, cejVarH, affcVarI);
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
    /* JADX WARN: Type inference failed for: r7v4 */
    public final void ao() {
        int i = defpackage.cym.a;
        defpackage.cge cgeVarB = B();
        for (defpackage.cge cgeVarAb = ab(true); cgeVarAb != null && (cgeVarAb.s & 4194304) != 0; cgeVarAb = cgeVarAb.u) {
            if ((cgeVarAb.r & 4194304) != 0) {
                ?? O = cgeVarAb;
                ?? bzcVar = 0;
                while (O != 0) {
                    if (O instanceof defpackage.cxc) {
                        ((defpackage.cxc) O).f(this);
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
            if (cgeVarAb == cgeVarB) {
                return;
            }
        }
    }

    public final void ap() {
        this.J = true;
        this.T.invoke();
        au();
        if (this.y == 0) {
            return;
        }
        this.t.P(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [cge] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [cge] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [bzc] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [bzc] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void aq() {
        if (aJ(1048576)) {
            int i = defpackage.cym.a;
            defpackage.cge cgeVar = B().t;
            if (cgeVar == null) {
                return;
            }
            for (defpackage.cge cgeVarAb = ab(false); cgeVarAb != null && (cgeVarAb.s & 1048576) != 0; cgeVarAb = cgeVarAb.u) {
                if ((cgeVarAb.r & 1048576) != 0) {
                    ?? O = cgeVarAb;
                    ?? bzcVar = 0;
                    while (O != 0) {
                        if (O instanceof defpackage.czj) {
                            ((defpackage.czj) O).dv();
                        } else if ((O.r & 1048576) != 0 && (O instanceof defpackage.cwo)) {
                            defpackage.cge cgeVar2 = ((defpackage.cwo) O).C;
                            int i2 = 0;
                            O = O;
                            bzcVar = bzcVar;
                            while (cgeVar2 != null) {
                                if ((cgeVar2.r & 1048576) != 0) {
                                    i2++;
                                    if (i2 == 1) {
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
                            if (i2 != 1) {
                            }
                        }
                        O = defpackage.cjv.o(bzcVar);
                    }
                }
                if (cgeVarAb == cgeVar) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x018f A[PHI: r4
  0x018f: PHI (r4v16 ??) = (r4v1 ??), (r4v1 ??), (r4v18 ??) binds: [B:49:0x015f, B:51:0x0163, B:65:0x018d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [cge] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [cge] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v16, types: [bzc] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20, types: [bzc] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    public final void ar(final defpackage.cge cgeVar, defpackage.cyk cykVar, final long j, final defpackage.cwy cwyVar, int i, final boolean z, final float f2, final boolean z2) {
        ?? O;
        if (cgeVar == null) {
            E(cykVar, j, cwyVar, i, z);
            return;
        }
        final defpackage.cyk cykVar2 = cykVar;
        int i2 = i;
        if (!cykVar2.d(cgeVar)) {
            ar(defpackage.dai.A(cgeVar, cykVar.a()), cykVar, j, cwyVar, i, z, f2, z2);
            return;
        }
        if (i2 == 3 || i2 == 4) {
            ?? bzcVar = 0;
            ?? r0 = cgeVar;
            while (r0 != 0) {
                if (r0 instanceof defpackage.cza) {
                    long jDy = ((defpackage.cza) r0).dy();
                    int i3 = (int) (j >> 32);
                    float fIntBitsToFloat = java.lang.Float.intBitsToFloat(i3);
                    defpackage.dlz dlzVarP = p();
                    defpackage.dlz dlzVar = defpackage.dlz.a;
                    if (fIntBitsToFloat < (-((dlzVarP == dlzVar ? (int) jDy : (int) (jDy >> 30)) & 32767))) {
                        break;
                    }
                    if (java.lang.Float.intBitsToFloat(i3) >= x() + ((p() == dlzVar ? (int) (jDy >> 30) : (int) jDy) & 32767)) {
                        break;
                    }
                    int i4 = (int) (j & 4294967295L);
                    if (java.lang.Float.intBitsToFloat(i4) < (-(((int) (jDy >> 15)) & 32767)) || java.lang.Float.intBitsToFloat(i4) >= dK() + (((int) (jDy >> 45)) & 32767)) {
                        break;
                        break;
                    }
                    final int i5 = i2;
                    defpackage.afer aferVar = new defpackage.afer() { // from class: cyh
                        @Override // defpackage.afer
                        public final java.lang.Object invoke() {
                            defpackage.cge cgeVar2 = cgeVar;
                            defpackage.cyk cykVar3 = cykVar2;
                            this.a.ar(defpackage.dai.A(cgeVar2, cykVar3.a()), cykVar3, j, cwyVar, i5, z, f2, z2);
                            return defpackage.afbk.a;
                        }
                    };
                    int i6 = cwyVar.a;
                    if (i6 == cwyVar.a() - 1) {
                        cwyVar.d(i6 + 1, cwyVar.a());
                        cwyVar.a++;
                        cwyVar.b.p(cgeVar);
                        cwyVar.c.b(defpackage.ua.f(0.0f, z, true));
                        aferVar.invoke();
                        cwyVar.a = i6;
                        return;
                    }
                    long jB = cwyVar.b();
                    int i7 = cwyVar.a;
                    if (!defpackage.cws.b(jB)) {
                        if (java.lang.Float.intBitsToFloat((int) (jB >> 32)) > 0.0f) {
                            int i8 = cwyVar.a;
                            cwyVar.d(i8 + 1, cwyVar.a());
                            cwyVar.a++;
                            cwyVar.b.p(cgeVar);
                            cwyVar.c.b(defpackage.ua.f(0.0f, z, true));
                            aferVar.invoke();
                            cwyVar.a = i8;
                            return;
                        }
                        return;
                    }
                    int iA = cwyVar.a();
                    int i9 = iA - 1;
                    cwyVar.a = i9;
                    cwyVar.d(iA, cwyVar.a());
                    cwyVar.a++;
                    cwyVar.b.p(cgeVar);
                    cwyVar.c.b(defpackage.ua.f(0.0f, z, true));
                    aferVar.invoke();
                    cwyVar.a = i9;
                    if (java.lang.Float.intBitsToFloat((int) (cwyVar.b() >> 32)) < 0.0f) {
                        cwyVar.d(i7 + 1, cwyVar.a + 1);
                    }
                    cwyVar.a = i7;
                    return;
                }
                if ((r0.r & 16) == 0 || !(r0 instanceof defpackage.cwo)) {
                    O = r0;
                    bzcVar = bzcVar;
                    O = defpackage.cjv.o(bzcVar);
                } else {
                    defpackage.cge cgeVar2 = ((defpackage.cwo) r0).C;
                    int i10 = 0;
                    while (cgeVar2 != null) {
                        if ((cgeVar2.r & 16) != 0) {
                            i10++;
                            if (i10 == 1) {
                                O = r0;
                                bzcVar = bzcVar;
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
                        } else {
                            O = r0;
                            bzcVar = bzcVar;
                        }
                        cgeVar2 = cgeVar2.u;
                        O = O;
                        bzcVar = bzcVar;
                    }
                    if (i10 != 1) {
                        O = r0;
                        bzcVar = bzcVar;
                        O = defpackage.cjv.o(bzcVar);
                    } else {
                        O = r0;
                        bzcVar = bzcVar;
                    }
                }
                cykVar2 = cykVar;
                i2 = i;
                r0 = O;
                bzcVar = bzcVar;
            }
        }
        if (z2) {
            aE(cgeVar, cykVar, j, cwyVar, i, z, f2);
        } else {
            aF(cgeVar, cykVar, j, cwyVar, i, z, f2);
        }
    }

    public final void as(long j, float f2, defpackage.affc affcVar, defpackage.cmq cmqVar) {
        if (cmqVar != null) {
            if (affcVar != null) {
                defpackage.csc.b("both ways to create layers shouldn't be used together");
            }
            if (this.U != cmqVar) {
                this.U = null;
                aw(null, false);
                this.U = cmqVar;
            }
            if (this.I == null) {
                defpackage.cxl cxlVar = this.t;
                defpackage.cyu cyuVarA = defpackage.cxo.a(cxlVar);
                defpackage.affg affgVarG = G();
                defpackage.afer aferVar = this.T;
                defpackage.cys cysVarO = cyuVarA.o(affgVarG, aferVar, cmqVar);
                cysVarO.g(this.c);
                cysVarO.f(j);
                this.I = cysVarO;
                cxlVar.at();
                aferVar.invoke();
            }
        } else {
            if (this.U != null) {
                this.U = null;
                aw(null, false);
            }
            aw(affcVar, false);
        }
        if (this.y != j) {
            defpackage.cxl cxlVar2 = this.t;
            defpackage.cxo.a(cxlVar2).E(-4.0f);
            this.y = j;
            defpackage.cys cysVar = this.I;
            if (cysVar != null) {
                cysVar.f(j);
            } else {
                defpackage.cyl cylVar = this.x;
                if (cylVar != null) {
                    cylVar.ak();
                }
            }
            cxlVar2.P(this);
            W(this);
            defpackage.cyu cyuVar = cxlVar2.k;
            if (cyuVar != null) {
                cyuVar.y(cxlVar2);
            }
        }
        this.z = f2;
        defpackage.cxl cxlVar3 = this.t;
        if (this == cxlVar3.q()) {
            ((defpackage.czz) defpackage.cxo.a(cxlVar3)).p.e(cxlVar3);
        }
        if (this.m) {
            return;
        }
        R(K());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    public final void at(defpackage.cjh cjhVar, boolean z, boolean z2) {
        long jFloatToRawIntBits;
        defpackage.cys cysVar = this.I;
        if (cysVar != null) {
            if (this.K) {
                if (z2) {
                    long jZ = Z();
                    long j = jZ >> 32;
                    float f2 = cjhVar.a;
                    float f3 = cjhVar.b;
                    int i = (int) (jZ & 4294967295L);
                    int i2 = (int) j;
                    if (cjhVar.c >= 0.0f) {
                        long j2 = this.c;
                        if (f2 > ((int) (j2 >> 32)) || cjhVar.d < 0.0f || f3 > ((int) (j2 & 4294967295L))) {
                            jFloatToRawIntBits = 0;
                        } else {
                            float fIntBitsToFloat = java.lang.Float.intBitsToFloat(i2);
                            float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i);
                            float f4 = (fIntBitsToFloat - (cjhVar.c - cjhVar.a)) / 2.0f;
                            if (f4 > 0.0f) {
                                f2 -= f4;
                            } else {
                                float f5 = (-fIntBitsToFloat) / 2.0f;
                                if (f2 < f5) {
                                    f2 = f5;
                                }
                            }
                            float f6 = (fIntBitsToFloat2 - (cjhVar.d - cjhVar.b)) / 2.0f;
                            if (f6 > 0.0f) {
                                f3 -= f6;
                            } else {
                                float f7 = (-fIntBitsToFloat2) / 2.0f;
                                if (f3 < f7) {
                                    f3 = f7;
                                }
                            }
                            jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(f2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f3)) & 4294967295L);
                        }
                    } else {
                        jFloatToRawIntBits = 0;
                    }
                    float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                    float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    long j3 = this.c;
                    float f8 = (int) (j3 >> 32);
                    float f9 = (int) (j3 & 4294967295L);
                    cjhVar.a(fIntBitsToFloat3, fIntBitsToFloat4, java.lang.Math.min(java.lang.Float.intBitsToFloat(i2) + f8, java.lang.Math.max(f8, java.lang.Float.intBitsToFloat(i2) + fIntBitsToFloat3)), java.lang.Math.min(java.lang.Float.intBitsToFloat(i) + f9, java.lang.Math.max(f9, java.lang.Float.intBitsToFloat(i) + fIntBitsToFloat4)));
                } else if (z) {
                    long j4 = this.c;
                    cjhVar.a(0.0f, 0.0f, (int) (j4 >> 32), (int) (j4 & 4294967295L));
                }
                if (cjhVar.c()) {
                    return;
                }
            }
            cysVar.e(cjhVar, false);
        }
        long j5 = this.y;
        float f10 = (int) (j5 >> 32);
        cjhVar.a += f10;
        cjhVar.c += f10;
        float f11 = (int) (j5 & 4294967295L);
        cjhVar.b += f11;
        cjhVar.d += f11;
    }

    public final void au() {
        if (this.I != null) {
            if (this.U != null) {
                this.U = null;
            }
            aw(null, false);
            this.t.W(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [cge] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [cge] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [bzc] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [bzc] */
    /* JADX WARN: Type inference failed for: r8v6 */
    public final void av(defpackage.ctz ctzVar) {
        defpackage.cyl cylVar;
        defpackage.ctz ctzVar2 = this.P;
        if (ctzVar != ctzVar2) {
            this.P = ctzVar;
            if (ctzVar2 == null || ctzVar.c() != ctzVar2.c() || ctzVar.b() != ctzVar2.b()) {
                long jC = ctzVar.c();
                long jB = ctzVar.b();
                defpackage.cys cysVar = this.I;
                long j = (jC << 32) | (jB & 4294967295L);
                if (cysVar != null) {
                    cysVar.g(j);
                } else if (this.t.an() && (cylVar = this.x) != null) {
                    cylVar.ak();
                }
                z(j);
                if (this.L != null) {
                    ax(false);
                }
                int i = defpackage.cym.a;
                defpackage.cge cgeVar = B().t;
                if (cgeVar != null) {
                    for (defpackage.cge cgeVarAb = ab(false); cgeVarAb != null && (cgeVarAb.s & 4) != 0; cgeVarAb = cgeVarAb.u) {
                        if ((cgeVarAb.r & 4) != 0) {
                            ?? O = cgeVarAb;
                            ?? bzcVar = 0;
                            while (O != 0) {
                                if (O instanceof defpackage.cwu) {
                                    ((defpackage.cwu) O).a();
                                } else if ((O.r & 4) != 0 && (O instanceof defpackage.cwo)) {
                                    defpackage.cge cgeVar2 = ((defpackage.cwo) O).C;
                                    int i2 = 0;
                                    O = O;
                                    bzcVar = bzcVar;
                                    while (cgeVar2 != null) {
                                        if ((cgeVar2.r & 4) != 0) {
                                            i2++;
                                            if (i2 == 1) {
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
                                    if (i2 != 1) {
                                    }
                                }
                                O = defpackage.cjv.o(bzcVar);
                            }
                        }
                        if (cgeVarAb == cgeVar) {
                            break;
                        }
                    }
                }
                defpackage.cxl cxlVar = this.t;
                defpackage.cyu cyuVar = cxlVar.k;
                if (cyuVar != null) {
                    cyuVar.y(cxlVar);
                }
                cxlVar.P(this);
            }
            defpackage.aal aalVar = this.V;
            if ((aalVar == null || !aalVar.c()) && ctzVar.f().isEmpty()) {
                return;
            }
            defpackage.aal aalVar2 = this.V;
            java.util.Map mapF = ctzVar.f();
            if (aalVar2 != null && aalVar2.e == mapF.size()) {
                java.lang.Object[] objArr = aalVar2.b;
                int[] iArr = aalVar2.c;
                long[] jArr = aalVar2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j2 = jArr[i3];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = i3 - length;
                        int i5 = 0;
                        while (true) {
                            int i6 = 8 - ((~i4) >>> 31);
                            if (i5 >= i6) {
                                if (i6 == 8) {
                                    break;
                                } else {
                                    return;
                                }
                            }
                            if ((255 & j2) < 128) {
                                int i7 = (i3 << 3) + i5;
                                java.lang.Object obj = objArr[i7];
                                int i8 = iArr[i7];
                                java.lang.Integer num = (java.lang.Integer) mapF.get((defpackage.csf) obj);
                                if (num == null || num.intValue() != i8) {
                                    break loop0;
                                }
                            }
                            j2 >>= 8;
                            i5++;
                        }
                    }
                    if (i3 == length) {
                        return;
                    } else {
                        i3++;
                    }
                }
            }
            ((defpackage.cxz) ae()).w.e();
            defpackage.aal aalVar3 = this.V;
            if (aalVar3 == null) {
                defpackage.aal aalVar4 = defpackage.aam.a;
                aalVar3 = new defpackage.aal(6);
                this.V = aalVar3;
            }
            aalVar3.e();
            for (java.util.Map.Entry entry : ctzVar.f().entrySet()) {
                aalVar3.g(entry.getKey(), ((java.lang.Number) entry.getValue()).intValue());
            }
        }
    }

    public final void aw(defpackage.affc affcVar, boolean z) {
        defpackage.cyu cyuVar;
        if (affcVar != null && this.U != null) {
            defpackage.csc.b("layerBlock can't be provided when explicitLayer is provided");
        }
        defpackage.cxl cxlVar = this.t;
        boolean z2 = (!z && this.L == affcVar && defpackage.afga.f(this.M, cxlVar.r) && this.N == cxlVar.s) ? false : true;
        this.M = cxlVar.r;
        this.N = cxlVar.s;
        if (!cxlVar.am() || affcVar == null) {
            this.L = null;
            defpackage.cys cysVar = this.I;
            if (cysVar != null) {
                if (!defpackage.cjv.e(cysVar.m())) {
                    cxlVar.P(this);
                }
                cysVar.b();
                this.I = null;
                cxlVar.at();
                this.T.invoke();
                if (t() && cxlVar.an() && (cyuVar = cxlVar.k) != null) {
                    cyuVar.y(cxlVar);
                }
            }
            this.H = false;
            return;
        }
        this.L = affcVar;
        if (this.I != null) {
            if (z2) {
                ax(true);
                return;
            }
            return;
        }
        defpackage.cyu cyuVarA = defpackage.cxo.a(cxlVar);
        defpackage.affg affgVarG = G();
        defpackage.afer aferVar = this.T;
        defpackage.cys cysVarO = cyuVarA.o(affgVarG, aferVar, null);
        cysVarO.g(this.c);
        cysVarO.f(this.y);
        this.I = cysVarO;
        ax(true);
        cxlVar.at();
        aferVar.invoke();
    }

    public final void ax(boolean z) {
        if (this.U != null) {
            return;
        }
        defpackage.cys cysVar = this.I;
        defpackage.affc affcVar = this.L;
        if (cysVar == null) {
            if (affcVar != null) {
                defpackage.csc.c("null layer with a non-null layerBlock");
                return;
            }
            return;
        }
        if (affcVar == null) {
            defpackage.csc.a("updateLayerParameters requires a non-null layerBlock");
            throw new defpackage.afap();
        }
        defpackage.cla claVar = q;
        claVar.n();
        defpackage.cxl cxlVar = this.t;
        claVar.t = cxlVar.r;
        claVar.u = cxlVar.s;
        claVar.r = defpackage.dlv.f(this.c);
        defpackage.afgq afgqVar = new defpackage.afgq();
        defpackage.cyx cyxVarAg = ag();
        ((defpackage.cez) cyxVarAg.a).b(this, f, new defpackage.axl(affcVar, this, afgqVar, 5));
        defpackage.cxb cxbVar = this.R;
        if (cxbVar == null) {
            cxbVar = new defpackage.cxb();
            this.R = cxbVar;
        }
        defpackage.cxb cxbVar2 = g;
        cxbVar2.a = cxbVar.a;
        cxbVar2.b = cxbVar.b;
        cxbVar2.c = cxbVar.c;
        cxbVar2.d = cxbVar.d;
        cxbVar2.e = cxbVar.e;
        cxbVar2.f = cxbVar.f;
        cxbVar2.g = cxbVar.g;
        cxbVar2.h = cxbVar.h;
        cxbVar2.i = cxbVar.i;
        cxbVar.a = claVar.b;
        cxbVar.b = claVar.c;
        cxbVar.c = claVar.e;
        cxbVar.d = claVar.f;
        cxbVar.e = claVar.j;
        cxbVar.f = claVar.k;
        cxbVar.g = claVar.l;
        cxbVar.h = claVar.m;
        cxbVar.i = claVar.n;
        cysVar.k(claVar);
        boolean z2 = this.K;
        boolean z3 = claVar.p;
        this.K = z3;
        this.O = claVar.d;
        boolean z4 = false;
        if (cxbVar2.a == cxbVar.a && cxbVar2.b == cxbVar.b && cxbVar2.c == cxbVar.c && cxbVar2.d == cxbVar.d && cxbVar2.e == cxbVar.e && cxbVar2.f == cxbVar.f && cxbVar2.g == cxbVar.g && cxbVar2.h == cxbVar.h && cxbVar2.i == cxbVar.i) {
            z4 = true;
        }
        if (z) {
            if (z4 && z2 == z3 && !afgqVar.a) {
                return;
            }
            defpackage.cyu cyuVar = cxlVar.k;
            if (cyuVar != null) {
                cyuVar.y(cxlVar);
            }
        }
        if (z4) {
            return;
        }
        cxlVar.P(this);
        if (cxlVar.C > 0) {
            defpackage.cxo.a(cxlVar).D(cxlVar);
        }
    }

    public final boolean ay() {
        float fA;
        defpackage.cmq cmqVar = this.U;
        if (cmqVar != null) {
            fA = cmqVar.a();
        } else {
            fA = this.I != null ? this.O : 1.0f;
        }
        if (fA <= 0.0f) {
            return true;
        }
        defpackage.cyl cylVar = this.x;
        if (cylVar != null) {
            return cylVar.ay();
        }
        return false;
    }

    protected final boolean az(long j) {
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        defpackage.cys cysVar = this.I;
        return cysVar == null || !this.K || cysVar.l(j);
    }

    @Override // defpackage.dlu
    public final float b() {
        return this.t.r.b();
    }

    @Override // defpackage.cux
    public void dD(long j, float f2, defpackage.affc affcVar) {
        if (!this.u) {
            as(j, f2, affcVar, null);
            return;
        }
        defpackage.cxv cxvVarC = C();
        cxvVarC.getClass();
        as(cxvVarC.h, f2, affcVar, null);
    }

    @Override // defpackage.ctc
    public final void dL(defpackage.ctc ctcVar, float[] fArr) {
        defpackage.cyl cylVarAL = aL(ctcVar);
        cylVarAL.al();
        defpackage.cyl cylVarAf = af(cylVarAL);
        defpackage.ckq.c(fArr);
        cylVarAL.aH(cylVarAf, fArr);
        aG(cylVarAf, fArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [cge] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [cge] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [bzc] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [bzc] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // defpackage.cux, defpackage.csy
    public final java.lang.Object g() {
        defpackage.cxl cxlVar = this.t;
        defpackage.cyg cygVar = cxlVar.v;
        if (!cygVar.i(64)) {
            return null;
        }
        B();
        defpackage.afgv afgvVar = new defpackage.afgv();
        for (defpackage.cge cgeVar = cygVar.e; cgeVar != null; cgeVar = cgeVar.t) {
            if ((cgeVar.r & 64) != 0) {
                ?? O = cgeVar;
                ?? bzcVar = 0;
                while (O != 0) {
                    if (O instanceof defpackage.cyy) {
                        defpackage.dlo dloVar = cxlVar.r;
                        afgvVar.a = ((defpackage.cyy) O).ds(afgvVar.a);
                    } else if ((O.r & 64) != 0 && (O instanceof defpackage.cwo)) {
                        defpackage.cge cgeVar2 = ((defpackage.cwo) O).C;
                        int i = 0;
                        O = O;
                        bzcVar = bzcVar;
                        while (cgeVar2 != null) {
                            if ((cgeVar2.r & 64) != 0) {
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
        }
        return afgvVar.a;
    }

    @Override // defpackage.ctc
    public final long h() {
        return this.c;
    }

    @Override // defpackage.ctc
    public final long i(defpackage.ctc ctcVar, long j) {
        return u(ctcVar, j);
    }

    @Override // defpackage.ctc
    public final long j(long j) {
        if (!t()) {
            defpackage.csc.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        al();
        while (this != null) {
            defpackage.cxl cxlVar = this.t;
            if (this == cxlVar.q() && !cxlVar.d) {
                long jB = ((defpackage.czz) defpackage.cxo.a(cxlVar)).p.b(cxlVar);
                if (jB != 9223372034707292159L) {
                    return defpackage.dlv.c(j, jB);
                }
            }
            j = this.aC(j);
            this = this.x;
        }
        return j;
    }

    @Override // defpackage.ctc
    public final long k(long j) {
        if (!t()) {
            defpackage.csc.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return defpackage.cxo.a(this.t).l(j(j));
    }

    @Override // defpackage.ctc
    public final long l(long j) {
        defpackage.cxl cxlVar = this.t;
        long j2 = j(j);
        defpackage.czz czzVar = (defpackage.czz) defpackage.cxo.a(cxlVar);
        czzVar.T();
        return defpackage.ckq.a(czzVar.A, j2);
    }

    @Override // defpackage.ctc
    public final long m(long j) {
        if (!t()) {
            defpackage.csc.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return u(defpackage.csc.g(this), defpackage.cxo.a(this.t).m(j));
    }

    @Override // defpackage.ctc
    public final long n(long j) {
        if (!t()) {
            defpackage.csc.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        defpackage.ctc ctcVarG = defpackage.csc.g(this);
        defpackage.czz czzVar = (defpackage.czz) defpackage.cxo.a(this.t);
        czzVar.T();
        return u(ctcVarG, defpackage.acmj.r(defpackage.ckq.a(czzVar.B, j), ctcVarG.j(0L)));
    }

    @Override // defpackage.ctc
    public final defpackage.cjj o(defpackage.ctc ctcVar, boolean z) {
        if (!t()) {
            defpackage.csc.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!ctcVar.t()) {
            defpackage.csc.c(defpackage.a.bl(ctcVar, "LayoutCoordinates ", " is not attached!"));
        }
        defpackage.cyl cylVarAL = aL(ctcVar);
        cylVarAL.al();
        defpackage.cyl cylVarAf = af(cylVarAL);
        defpackage.cjh cjhVarAc = ac();
        cjhVarAc.a = 0.0f;
        cjhVarAc.b = 0.0f;
        cjhVarAc.c = (int) (ctcVar.h() >> 32);
        cjhVarAc.d = (int) (ctcVar.h() & 4294967295L);
        while (cylVarAL != cylVarAf) {
            cylVarAL.at(cjhVarAc, z, false);
            if (cjhVarAc.c()) {
                return defpackage.cjj.a;
            }
            cylVarAL = cylVarAL.x;
            cylVarAL.getClass();
        }
        H(cylVarAf, cjhVarAc, z);
        return defpackage.bzd.o(cjhVarAc);
    }

    @Override // defpackage.csz
    public final defpackage.dlz p() {
        return this.t.s;
    }

    @Override // defpackage.ctc
    public final defpackage.ctc q() {
        if (!t()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (defpackage.cxl cxlVarL = this.t; cxlVarL != null; cxlVarL = cxlVarL.l()) {
                sb.append("\n|");
                sb.append(cxlVarL);
                sb.append(" isAttached=");
                sb.append(cxlVarL.am());
                sb.append(" modifier=");
                sb.append(cxlVarL.y);
                sb.append(" tail=");
                sb.append(B());
            }
            defpackage.csc.c(sb.toString());
        }
        al();
        return this.t.q().x;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cqp, cyu] */
    @Override // defpackage.ctc
    public final void s(float[] fArr) {
        ?? A = defpackage.cxo.a(this.t);
        aH(aL(defpackage.csc.g(this)), fArr);
        A.k(fArr);
    }

    @Override // defpackage.ctc
    public final boolean t() {
        return B().A;
    }

    @Override // defpackage.ctc
    public final long u(defpackage.ctc ctcVar, long j) {
        if (ctcVar instanceof defpackage.ctw) {
            defpackage.ctw ctwVar = (defpackage.ctw) ctcVar;
            ctwVar.a().al();
            return ctwVar.u(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        defpackage.cyl cylVarAL = aL(ctcVar);
        cylVarAL.al();
        defpackage.cyl cylVarAf = af(cylVarAL);
        while (cylVarAL != cylVarAf) {
            j = cylVarAL.aC(j);
            cylVarAL = cylVarAL.x;
            cylVarAL.getClass();
        }
        return aK(cylVarAf, j);
    }

    @Override // defpackage.cxu, defpackage.cyv
    public final boolean w() {
        return (this.I == null || this.J || !this.t.am()) ? false : true;
    }

    @Override // defpackage.cux
    public void y(long j, float f2, defpackage.cmq cmqVar) {
        if (!this.u) {
            as(j, f2, null, cmqVar);
            return;
        }
        defpackage.cxv cxvVarC = C();
        cxvVarC.getClass();
        as(cxvVarC.h, f2, null, cmqVar);
    }

    @Override // defpackage.cxu
    public final defpackage.ctc J() {
        return this;
    }
}
