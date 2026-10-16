package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public abstract class akcy extends akcz {
    private static final long serialVersionUID = -6728465968995518215L;
    private transient akcf A;
    private transient akcf B;
    private transient akcf C;
    private transient akcf D;
    private transient akcf E;
    private transient akcf F;
    private transient akcf G;
    private transient akcf I;
    private transient akcf J;
    private transient akcf K;
    private transient akcf Nj;
    public final akcd a;
    public final Object b;
    public transient akcm c;
    public transient akcm d;
    public transient akcm e;
    public transient akcm f;
    public transient akcm g;
    public transient akcm h;
    public transient akcf i;
    public transient akcf j;
    public transient akcf k;
    public transient akcf l;
    public transient akcf m;
    public transient akcf n;
    private transient akcm o;
    private transient akcm p;
    private transient akcm q;
    private transient akcm r;
    private transient akcm s;
    private transient akcm t;
    private transient akcf u;
    private transient akcf v;
    private transient akcf w;
    private transient akcf x;
    private transient akcf y;
    private transient akcf z;

    protected akcy(akcd akcdVar, Object obj) {
        this.a = akcdVar;
        this.b = obj;
        N();
    }

    private final void N() {
        akcx akcxVar = new akcx();
        akcd akcdVar = this.a;
        if (akcdVar != null) {
            akcm akcmVarF = akcdVar.F();
            if (akcx.b(akcmVarF)) {
                akcxVar.a = akcmVarF;
            }
            akcm akcmVarI = akcdVar.I();
            if (akcx.b(akcmVarI)) {
                akcxVar.b = akcmVarI;
            }
            akcm akcmVarG = akcdVar.G();
            if (akcx.b(akcmVarG)) {
                akcxVar.c = akcmVarG;
            }
            akcm akcmVarE = akcdVar.E();
            if (akcx.b(akcmVarE)) {
                akcxVar.d = akcmVarE;
            }
            akcm akcmVarD = akcdVar.D();
            if (akcx.b(akcmVarD)) {
                akcxVar.e = akcmVarD;
            }
            akcm akcmVarB = akcdVar.B();
            if (akcx.b(akcmVarB)) {
                akcxVar.f = akcmVarB;
            }
            akcm akcmVarJ = akcdVar.J();
            if (akcx.b(akcmVarJ)) {
                akcxVar.g = akcmVarJ;
            }
            akcm akcmVarK = akcdVar.K();
            if (akcx.b(akcmVarK)) {
                akcxVar.h = akcmVarK;
            }
            akcm akcmVarH = akcdVar.H();
            if (akcx.b(akcmVarH)) {
                akcxVar.i = akcmVarH;
            }
            akcm akcmVarL = akcdVar.L();
            if (akcx.b(akcmVarL)) {
                akcxVar.j = akcmVarL;
            }
            akcm akcmVarA = akcdVar.A();
            if (akcx.b(akcmVarA)) {
                akcxVar.k = akcmVarA;
            }
            akcm akcmVarC = akcdVar.C();
            if (akcx.b(akcmVarC)) {
                akcxVar.l = akcmVarC;
            }
            akcf akcfVarN = akcdVar.n();
            if (akcx.a(akcfVarN)) {
                akcxVar.m = akcfVarN;
            }
            akcf akcfVarM = akcdVar.m();
            if (akcx.a(akcfVarM)) {
                akcxVar.n = akcfVarM;
            }
            akcf akcfVarS = akcdVar.s();
            if (akcx.a(akcfVarS)) {
                akcxVar.o = akcfVarS;
            }
            akcf akcfVarR = akcdVar.r();
            if (akcx.a(akcfVarR)) {
                akcxVar.p = akcfVarR;
            }
            akcf akcfVarP = akcdVar.p();
            if (akcx.a(akcfVarP)) {
                akcxVar.q = akcfVarP;
            }
            akcf akcfVarO = akcdVar.o();
            if (akcx.a(akcfVarO)) {
                akcxVar.r = akcfVarO;
            }
            akcf akcfVarK = akcdVar.k();
            if (akcx.a(akcfVarK)) {
                akcxVar.s = akcfVarK;
            }
            akcf akcfVarD = akcdVar.d();
            if (akcx.a(akcfVarD)) {
                akcxVar.t = akcfVarD;
            }
            akcf akcfVarL = akcdVar.l();
            if (akcx.a(akcfVarL)) {
                akcxVar.u = akcfVarL;
            }
            akcf akcfVarE = akcdVar.e();
            if (akcx.a(akcfVarE)) {
                akcxVar.v = akcfVarE;
            }
            akcf akcfVarJ = akcdVar.j();
            if (akcx.a(akcfVarJ)) {
                akcxVar.w = akcfVarJ;
            }
            akcf akcfVarG = akcdVar.g();
            if (akcx.a(akcfVarG)) {
                akcxVar.x = akcfVarG;
            }
            akcf akcfVarF = akcdVar.f();
            if (akcx.a(akcfVarF)) {
                akcxVar.y = akcfVarF;
            }
            akcf akcfVarH = akcdVar.h();
            if (akcx.a(akcfVarH)) {
                akcxVar.z = akcfVarH;
            }
            akcf akcfVarT = akcdVar.t();
            if (akcx.a(akcfVarT)) {
                akcxVar.A = akcfVarT;
            }
            akcf akcfVarU = akcdVar.u();
            if (akcx.a(akcfVarU)) {
                akcxVar.B = akcfVarU;
            }
            akcf akcfVarV = akcdVar.v();
            if (akcx.a(akcfVarV)) {
                akcxVar.C = akcfVarV;
            }
            akcf akcfVarQ = akcdVar.q();
            if (akcx.a(akcfVarQ)) {
                akcxVar.D = akcfVarQ;
            }
            akcf akcfVarW = akcdVar.w();
            if (akcx.a(akcfVarW)) {
                akcxVar.E = akcfVarW;
            }
            akcf akcfVarY = akcdVar.y();
            if (akcx.a(akcfVarY)) {
                akcxVar.F = akcfVarY;
            }
            akcf akcfVarX = akcdVar.x();
            if (akcx.a(akcfVarX)) {
                akcxVar.G = akcfVarX;
            }
            akcf akcfVarC = akcdVar.c();
            if (akcx.a(akcfVarC)) {
                akcxVar.H = akcfVarC;
            }
            akcf akcfVarI = akcdVar.i();
            if (akcx.a(akcfVarI)) {
                akcxVar.I = akcfVarI;
            }
        }
        M(akcxVar);
        akcm akcmVarF2 = akcxVar.a;
        if (akcmVarF2 == null) {
            akcmVarF2 = super.F();
        }
        this.o = akcmVarF2;
        akcm akcmVarI2 = akcxVar.b;
        if (akcmVarI2 == null) {
            akcmVarI2 = super.I();
        }
        this.p = akcmVarI2;
        akcm akcmVarG2 = akcxVar.c;
        if (akcmVarG2 == null) {
            akcmVarG2 = super.G();
        }
        this.q = akcmVarG2;
        akcm akcmVarE2 = akcxVar.d;
        if (akcmVarE2 == null) {
            akcmVarE2 = super.E();
        }
        this.r = akcmVarE2;
        akcm akcmVarD2 = akcxVar.e;
        if (akcmVarD2 == null) {
            akcmVarD2 = super.D();
        }
        this.s = akcmVarD2;
        akcm akcmVarB2 = akcxVar.f;
        if (akcmVarB2 == null) {
            akcmVarB2 = super.B();
        }
        this.c = akcmVarB2;
        akcm akcmVarJ2 = akcxVar.g;
        if (akcmVarJ2 == null) {
            akcmVarJ2 = super.J();
        }
        this.d = akcmVarJ2;
        akcm akcmVarK2 = akcxVar.h;
        if (akcmVarK2 == null) {
            akcmVarK2 = super.K();
        }
        this.e = akcmVarK2;
        akcm akcmVarH2 = akcxVar.i;
        if (akcmVarH2 == null) {
            akcmVarH2 = super.H();
        }
        this.f = akcmVarH2;
        akcm akcmVarL2 = akcxVar.j;
        if (akcmVarL2 == null) {
            akcmVarL2 = super.L();
        }
        this.g = akcmVarL2;
        akcm akcmVarA2 = akcxVar.k;
        if (akcmVarA2 == null) {
            akcmVarA2 = super.A();
        }
        this.t = akcmVarA2;
        akcm akcmVarC2 = akcxVar.l;
        if (akcmVarC2 == null) {
            akcmVarC2 = super.C();
        }
        this.h = akcmVarC2;
        akcf akcfVarN2 = akcxVar.m;
        if (akcfVarN2 == null) {
            akcfVarN2 = super.n();
        }
        this.u = akcfVarN2;
        akcf akcfVarM2 = akcxVar.n;
        if (akcfVarM2 == null) {
            akcfVarM2 = super.m();
        }
        this.i = akcfVarM2;
        akcf akcfVarS2 = akcxVar.o;
        if (akcfVarS2 == null) {
            akcfVarS2 = super.s();
        }
        this.v = akcfVarS2;
        akcf akcfVarR2 = akcxVar.p;
        if (akcfVarR2 == null) {
            akcfVarR2 = super.r();
        }
        this.w = akcfVarR2;
        akcf akcfVarP2 = akcxVar.q;
        if (akcfVarP2 == null) {
            akcfVarP2 = super.p();
        }
        this.x = akcfVarP2;
        akcf akcfVarO2 = akcxVar.r;
        if (akcfVarO2 == null) {
            akcfVarO2 = super.o();
        }
        this.y = akcfVarO2;
        akcf akcfVarK2 = akcxVar.s;
        if (akcfVarK2 == null) {
            akcfVarK2 = super.k();
        }
        this.z = akcfVarK2;
        akcf akcfVarD2 = akcxVar.t;
        if (akcfVarD2 == null) {
            akcfVarD2 = super.d();
        }
        this.A = akcfVarD2;
        akcf akcfVarL2 = akcxVar.u;
        if (akcfVarL2 == null) {
            akcfVarL2 = super.l();
        }
        this.B = akcfVarL2;
        akcf akcfVarE2 = akcxVar.v;
        if (akcfVarE2 == null) {
            akcfVarE2 = super.e();
        }
        this.C = akcfVarE2;
        akcf akcfVarJ2 = akcxVar.w;
        if (akcfVarJ2 == null) {
            akcfVarJ2 = super.j();
        }
        this.D = akcfVarJ2;
        akcf akcfVarG2 = akcxVar.x;
        if (akcfVarG2 == null) {
            akcfVarG2 = super.g();
        }
        this.j = akcfVarG2;
        akcf akcfVarF2 = akcxVar.y;
        if (akcfVarF2 == null) {
            akcfVarF2 = super.f();
        }
        this.k = akcfVarF2;
        akcf akcfVarH2 = akcxVar.z;
        if (akcfVarH2 == null) {
            akcfVarH2 = super.h();
        }
        this.E = akcfVarH2;
        akcf akcfVarT2 = akcxVar.A;
        if (akcfVarT2 == null) {
            akcfVarT2 = super.t();
        }
        this.l = akcfVarT2;
        akcf akcfVarU2 = akcxVar.B;
        if (akcfVarU2 == null) {
            akcfVarU2 = super.u();
        }
        this.F = akcfVarU2;
        akcf akcfVarV2 = akcxVar.C;
        if (akcfVarV2 == null) {
            akcfVarV2 = super.v();
        }
        this.G = akcfVarV2;
        akcf akcfVarQ2 = akcxVar.D;
        if (akcfVarQ2 == null) {
            akcfVarQ2 = super.q();
        }
        this.m = akcfVarQ2;
        akcf akcfVarW2 = akcxVar.E;
        if (akcfVarW2 == null) {
            akcfVarW2 = super.w();
        }
        this.n = akcfVarW2;
        akcf akcfVarY2 = akcxVar.F;
        if (akcfVarY2 == null) {
            akcfVarY2 = super.y();
        }
        this.Nj = akcfVarY2;
        akcf akcfVarX2 = akcxVar.G;
        if (akcfVarX2 == null) {
            akcfVarX2 = super.x();
        }
        this.I = akcfVarX2;
        akcf akcfVarC2 = akcxVar.H;
        if (akcfVarC2 == null) {
            akcfVarC2 = super.c();
        }
        this.J = akcfVarC2;
        akcf akcfVarI2 = akcxVar.I;
        if (akcfVarI2 == null) {
            akcfVarI2 = super.i();
        }
        this.K = akcfVarI2;
        if (akcdVar == null) {
            return;
        }
        if (this.z == akcdVar.k() && this.x == akcdVar.p() && this.v == akcdVar.s()) {
            akcdVar.n();
        }
        akcdVar.m();
        if (this.n == akcdVar.w() && this.m == akcdVar.q()) {
            akcdVar.f();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        N();
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcm A() {
        return this.t;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcm B() {
        return this.c;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcm C() {
        return this.h;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcm D() {
        return this.s;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcm E() {
        return this.r;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcm F() {
        return this.o;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcm G() {
        return this.q;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcm H() {
        return this.f;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcm I() {
        return this.p;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcm J() {
        return this.d;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcm K() {
        return this.e;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcm L() {
        return this.g;
    }

    protected abstract void M(akcx akcxVar);

    @Override // defpackage.akcz, defpackage.akcd
    public final akcf c() {
        return this.J;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcf d() {
        return this.A;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcf e() {
        return this.C;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcf f() {
        return this.k;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcf g() {
        return this.j;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcf h() {
        return this.E;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcf i() {
        return this.K;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcf j() {
        return this.D;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcf k() {
        return this.z;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcf l() {
        return this.B;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcf m() {
        return this.i;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcf n() {
        return this.u;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcf o() {
        return this.y;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcf p() {
        return this.x;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcf q() {
        return this.m;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcf r() {
        return this.w;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcf s() {
        return this.v;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcf t() {
        return this.l;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcf u() {
        return this.F;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcf v() {
        return this.G;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcf w() {
        return this.n;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcf x() {
        return this.I;
    }

    @Override // defpackage.akcz, defpackage.akcd
    public final akcf y() {
        return this.Nj;
    }

    @Override // defpackage.akcd
    public akcl z() {
        akcd akcdVar = this.a;
        if (akcdVar != null) {
            return akcdVar.z();
        }
        return null;
    }
}
