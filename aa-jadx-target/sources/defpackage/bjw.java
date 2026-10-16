package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bjw {
    public final defpackage.djv a;
    public long b;
    public final defpackage.dfb c;
    public final defpackage.nub d;
    private final defpackage.dfb e;
    private final long f;
    private final defpackage.dga g;
    private final defpackage.dkd h;
    private final defpackage.bfi i;

    public bjw(defpackage.dkd dkdVar, defpackage.djv djvVar, defpackage.bfi bfiVar, defpackage.nub nubVar) {
        defpackage.dfb dfbVar = dkdVar.a;
        long j = dkdVar.b;
        defpackage.dga dgaVar = bfiVar != null ? bfiVar.a : null;
        this.e = dfbVar;
        this.f = j;
        this.g = dgaVar;
        this.a = djvVar;
        this.d = nubVar;
        this.b = j;
        this.c = dfbVar;
        this.h = dkdVar;
        this.i = bfiVar;
    }

    private final int B(int i) {
        return defpackage.afqt.f(i, f().length() - 1);
    }

    private final int C(defpackage.dga dgaVar, int i) {
        int iD = D();
        defpackage.nub nubVar = this.d;
        if (nubVar.a == null) {
            nubVar.a = java.lang.Float.valueOf(dgaVar.m(iD).b);
        }
        int iG = dgaVar.g(iD) + i;
        if (iG < 0) {
            return 0;
        }
        if (iG >= dgaVar.e()) {
            return f().length();
        }
        float fA = dgaVar.a(iG) - 1.0f;
        java.lang.Object obj = nubVar.a;
        obj.getClass();
        java.lang.Number number = (java.lang.Number) obj;
        float fFloatValue = number.floatValue();
        if ((h() && fFloatValue >= dgaVar.c(iG)) || (!h() && fFloatValue <= dgaVar.b(iG))) {
            return dgaVar.f(iG, true);
        }
        return this.a.b(dgaVar.j((((long) java.lang.Float.floatToRawIntBits(number.floatValue())) << 32) | (((long) java.lang.Float.floatToRawIntBits(fA)) & 4294967295L)));
    }

    private final int D() {
        return this.a.a(defpackage.dgc.a(this.b));
    }

    private final void E() {
        int iA;
        this.d.f();
        if (f().length() <= 0 || (iA = a()) == -1) {
            return;
        }
        g(iA, iA);
    }

    private final void F() {
        java.lang.Integer numD;
        this.d.f();
        if (f().length() <= 0 || (numD = d()) == null) {
            return;
        }
        int iIntValue = numD.intValue();
        g(iIntValue, iIntValue);
    }

    private final void G() {
        this.d.f();
        if (f().length() > 0) {
            defpackage.dfb dfbVar = this.c;
            int iZ = defpackage.asq.Z(dfbVar.b, defpackage.dgc.a(this.b));
            if (iZ != -1) {
                g(iZ, iZ);
            }
        }
    }

    private final void H() {
        java.lang.Integer numE;
        this.d.f();
        if (f().length() <= 0 || (numE = e()) == null) {
            return;
        }
        int iIntValue = numE.intValue();
        g(iIntValue, iIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    private final int I(defpackage.bfi bfiVar, int i) {
        defpackage.cjj cjjVarO;
        defpackage.ctc ctcVar = bfiVar.b;
        if (ctcVar == null) {
            cjjVarO = defpackage.cjj.a;
        } else {
            defpackage.ctc ctcVar2 = bfiVar.c;
            cjjVarO = ctcVar2 != null ? ctcVar2.o(ctcVar, true) : null;
            if (cjjVarO == null) {
                cjjVarO = defpackage.cjj.a;
            }
        }
        defpackage.djv djvVar = this.a;
        int iA = defpackage.dgc.a(this.h.b);
        defpackage.dga dgaVar = bfiVar.a;
        defpackage.cjj cjjVarM = dgaVar.m(djvVar.a(iA));
        return djvVar.b(dgaVar.j((((long) java.lang.Float.floatToRawIntBits(cjjVarM.b)) << 32) | (4294967295L & ((long) java.lang.Float.floatToRawIntBits(cjjVarM.c + (java.lang.Float.intBitsToFloat((int) (cjjVarO.b() & 4294967295L)) * i))))));
    }

    public final void A() {
        defpackage.bfi bfiVar;
        if (f().length() <= 0 || (bfiVar = this.i) == null) {
            return;
        }
        int I = I(bfiVar, -1);
        g(I, I);
    }

    public final int a() {
        return defpackage.asq.Y(this.c.b, defpackage.dgc.a(this.b));
    }

    public final java.lang.Integer b() {
        defpackage.dga dgaVar = this.g;
        if (dgaVar == null) {
            return null;
        }
        defpackage.djv djvVar = this.a;
        return java.lang.Integer.valueOf(djvVar.b(dgaVar.f(dgaVar.g(djvVar.a(defpackage.dgc.c(this.b))), true)));
    }

    public final java.lang.Integer c() {
        defpackage.dga dgaVar = this.g;
        if (dgaVar == null) {
            return null;
        }
        defpackage.djv djvVar = this.a;
        return java.lang.Integer.valueOf(djvVar.b(dgaVar.i(dgaVar.g(djvVar.a(defpackage.dgc.d(this.b))))));
    }

    public final java.lang.Integer d() {
        int iA;
        defpackage.dga dgaVar = this.g;
        if (dgaVar == null) {
            return null;
        }
        int iD = D();
        while (true) {
            defpackage.dfb dfbVar = this.e;
            if (iD < dfbVar.a()) {
                long jK = dgaVar.k(B(iD));
                if (defpackage.dgc.a(jK) > iD) {
                    iA = this.a.b(defpackage.dgc.a(jK));
                    break;
                }
                iD++;
            } else {
                iA = dfbVar.a();
                break;
            }
        }
        return java.lang.Integer.valueOf(iA);
    }

    public final java.lang.Integer e() {
        int iB;
        defpackage.dga dgaVar = this.g;
        if (dgaVar == null) {
            return null;
        }
        for (int iD = D(); iD > 0; iD--) {
            long jK = dgaVar.k(B(iD));
            if (defpackage.dgc.e(jK) < iD) {
                iB = this.a.b(defpackage.dgc.e(jK));
                return java.lang.Integer.valueOf(iB);
            }
        }
        iB = 0;
        return java.lang.Integer.valueOf(iB);
    }

    public final java.lang.String f() {
        return this.c.b;
    }

    public final void g(int i, int i2) {
        long jG = defpackage.dax.g(i, i2);
        long j = defpackage.dgc.a;
        this.b = jG;
    }

    public final boolean h() {
        defpackage.dga dgaVar = this.g;
        return dgaVar == null || dgaVar.q(D()) != 2;
    }

    public final void i() {
        if (f().length() > 0) {
            long j = this.f;
            long j2 = defpackage.dgc.a;
            this.b = defpackage.dax.g(defpackage.dgc.e(j), defpackage.dgc.a(this.b));
        }
    }

    public final defpackage.dkd j() {
        return defpackage.dkd.b(this.h, this.c, this.b, 4);
    }

    public final java.util.List k(defpackage.affc affcVar) {
        if (!defpackage.dgc.i(this.b)) {
            return defpackage.afga.ac(new defpackage.djb("", 0), new defpackage.dkc(defpackage.dgc.d(this.b), defpackage.dgc.d(this.b)));
        }
        defpackage.djg djgVar = (defpackage.djg) affcVar.invoke(this);
        if (djgVar == null) {
            return null;
        }
        return defpackage.afga.aa(djgVar);
    }

    public final void l() {
        defpackage.dga dgaVar;
        if (f().length() <= 0 || (dgaVar = this.g) == null) {
            return;
        }
        int iC = C(dgaVar, 1);
        g(iC, iC);
    }

    public final void m() {
        defpackage.bfi bfiVar;
        if (f().length() <= 0 || (bfiVar = this.i) == null) {
            return;
        }
        int I = I(bfiVar, 1);
        g(I, I);
    }

    public final void n() {
        this.d.f();
        if (f().length() > 0) {
            if (h()) {
                G();
            } else {
                E();
            }
        }
    }

    public final void o() {
        this.d.f();
        if (f().length() > 0) {
            if (h()) {
                H();
            } else {
                F();
            }
        }
    }

    public final void p() {
        this.d.f();
        if (f().length() > 0) {
            int iAa = defpackage.asq.aa(f(), defpackage.dgc.c(this.b));
            if (iAa == defpackage.dgc.c(this.b) && iAa != f().length()) {
                iAa = defpackage.asq.aa(f(), iAa + 1);
            }
            g(iAa, iAa);
        }
    }

    public final void q() {
        this.d.f();
        if (f().length() > 0) {
            int iAb = defpackage.asq.ab(f(), defpackage.dgc.d(this.b));
            if (iAb == defpackage.dgc.d(this.b) && iAb != 0) {
                iAb = defpackage.asq.ab(f(), iAb - 1);
            }
            g(iAb, iAb);
        }
    }

    public final void r() {
        this.d.f();
        if (f().length() > 0) {
            if (h()) {
                E();
            } else {
                G();
            }
        }
    }

    public final void s() {
        this.d.f();
        if (f().length() > 0) {
            if (h()) {
                F();
            } else {
                H();
            }
        }
    }

    public final void t() {
        this.d.f();
        if (f().length() > 0) {
            int length = f().length();
            g(length, length);
        }
    }

    public final void u() {
        this.d.f();
        if (f().length() > 0) {
            g(0, 0);
        }
    }

    public final void v() {
        java.lang.Integer numB;
        this.d.f();
        if (f().length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        g(iIntValue, iIntValue);
    }

    public final void w() {
        this.d.f();
        if (f().length() > 0) {
            if (h()) {
                y();
            } else {
                v();
            }
        }
    }

    public final void x() {
        this.d.f();
        if (f().length() > 0) {
            if (h()) {
                v();
            } else {
                y();
            }
        }
    }

    public final void y() {
        java.lang.Integer numC;
        this.d.f();
        if (f().length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        g(iIntValue, iIntValue);
    }

    public final void z() {
        defpackage.dga dgaVar;
        if (f().length() <= 0 || (dgaVar = this.g) == null) {
            return;
        }
        int iC = C(dgaVar, -1);
        g(iC, iC);
    }
}
