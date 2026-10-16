package defpackage;

import android.view.View;
import androidx.car.app.model.Alert;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class cxb implements bur, cyn, cyl {
    public afec A;
    public boolean B;
    public int C;
    public boolean D;
    public int E;
    public ccx F;
    private final boolean I;
    private int J;
    private byw K;
    private boolean L;
    private cxb M;
    private ddr N;
    private final byw O;
    private boolean P;
    private cyc Q;
    private boolean R;
    private cfy S;
    private int T;
    private sx U;
    private final bii V;
    public int c;
    public boolean d;
    public long e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public cxb j;
    public cym k;
    public dme l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public ctp q;
    public dlg r;
    public dlr s;
    public dcc t;
    public boolean u;
    public final cxx v;
    public final cxf w;
    public ctl x;
    public cfy y;
    public afec z;
    private static final cxa G = new cwz();
    public static final afdr a = new blv(18);
    private static final dcc H = new cwy();
    public static final Comparator b = new azl(3);

    public cxb(boolean z, int i) {
        this.I = z;
        this.c = i;
        this.e = 9223372034707292159L;
        this.f = true;
        this.g = true;
        this.h = -4;
        this.V = new bii(new byw(new cxb[16]), new bxh(this, 7), (byte[]) null);
        this.O = new byw(new cxb[16]);
        this.P = true;
        this.q = G;
        this.r = cxe.a;
        this.s = dlr.a;
        this.t = H;
        this.F = bvg.a;
        this.E = 3;
        this.T = 3;
        this.v = new cxx(this);
        this.w = new cxf(this);
        this.R = true;
        this.y = cfy.e;
    }

    private final String aA(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        byw bywVarK = k();
        Object[] objArr = bywVarK.a;
        int i3 = bywVarK.b;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((cxb) objArr[i4]).aA(i + 1));
        }
        String string = sb.toString();
        if (i != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        strSubstring.getClass();
        return strSubstring;
    }

    private final String aB(cxb cxbVar) {
        String strAA = aA(0);
        cxb cxbVar2 = cxbVar.M;
        return "Cannot insert " + cxbVar + " because it already has a parent or an owner. This tree: " + strAA + " Other tree: " + (cxbVar2 != null ? cxbVar2.aA(0) : null);
    }

    private final void aC(cfy cfyVar) {
        aag aagVar;
        cxw cxwVar;
        cxx cxxVar;
        boolean z;
        aag aagVar2;
        cxb cxbVar;
        cxx cxxVar2 = this.v;
        boolean zI = cxxVar2.i(16);
        boolean zI2 = cxxVar2.i(1024);
        this.y = cfyVar;
        cfx cfxVar = cxxVar2.f;
        cxw cxwVar2 = cxxVar2.b;
        if (cfxVar == cxwVar2) {
            crt.c("padChain called on already padded chain");
        }
        cfx cfxVar2 = cxxVar2.f;
        cfxVar2.t = cxwVar2;
        cxwVar2.u = cfxVar2;
        aag aagVar3 = cxxVar2.g;
        int i = aagVar3.b;
        cxb cxbVar2 = cxxVar2.a;
        cxb cxbVar3 = cxbVar2;
        for (cxb cxbVarL = cxbVar2.l(); cxbVarL != null; cxbVarL = cxbVarL.l()) {
            cxbVar3 = cxbVarL;
        }
        cxx cxxVar3 = cxbVar3.v;
        aag aagVar4 = cxxVar3.h;
        if (aagVar4 == null) {
            aagVar4 = new aag(16);
            cxxVar3.h = aagVar4;
        }
        aag aagVar5 = aagVar4;
        int i2 = -1;
        int i3 = aagVar5.b - 1;
        aag aagVar6 = i3 >= 0 ? (aag) aagVar5.h(i3) : new aag(16);
        aag aagVar7 = cxxVar3.i;
        if (aagVar7 == null) {
            aagVar7 = new aag(16);
        }
        cxxVar3.i = null;
        aagVar7.p(cfyVar);
        cep cepVar = null;
        while (aagVar7.g()) {
            cfy cfyVar2 = (cfy) aagVar7.h(aagVar7.b + i2);
            if (cfyVar2 instanceof cft) {
                cft cftVar = (cft) cfyVar2;
                aagVar7.p(cftVar.b);
                aagVar7.p(cftVar.a);
            } else if (cfyVar2 instanceof cfw) {
                aagVar6.p(cfyVar2);
            } else {
                if (cepVar == null) {
                    cepVar = new cep(aagVar6, 12);
                }
                cfyVar2.c(cepVar);
            }
            i2 = -1;
        }
        int i4 = aagVar6.b;
        if (i4 == i) {
            cfx cfxVar3 = cxwVar2.u;
            int i5 = 0;
            while (cfxVar3 != null && i5 < i) {
                if (aagVar3 == null) {
                    crt.a("expected prior modifier list to be non-empty");
                    throw new aezp();
                }
                cfw cfwVar = (cfw) aagVar3.c(i5);
                cfw cfwVar2 = (cfw) aagVar6.c(i5);
                aagVar2 = aagVar3;
                int iR = cjn.r(cfwVar, cfwVar2);
                cxbVar = cxbVar2;
                if (iR == 0) {
                    cfxVar3 = cfxVar3.t;
                    break;
                }
                if (iR == 1) {
                    cxx.m(cfwVar, cfwVar2, cfxVar3);
                }
                cfxVar3 = cfxVar3.u;
                i5++;
                aagVar3 = aagVar2;
                cxbVar2 = cxbVar;
            }
            aagVar2 = aagVar3;
            cxbVar = cxbVar2;
            cfx cfxVar4 = cfxVar3;
            if (i5 >= i) {
                aagVar = aagVar6;
                cxwVar = cxwVar2;
                cxxVar = cxxVar2;
                aagVar3 = aagVar2;
                z = false;
            } else {
                if (aagVar2 == null) {
                    crt.a("expected prior modifier list to be non-empty");
                    throw new aezp();
                }
                if (cfxVar4 == null) {
                    crt.a("structuralUpdate requires a non-null tail");
                    throw new aezp();
                }
                aagVar = aagVar6;
                aagVar3 = aagVar2;
                cxxVar = cxxVar2;
                cxxVar.j(i5, aagVar3, aagVar, cfxVar4, !cxbVar.ah());
                cxwVar = cxwVar2;
                z = true;
            }
        } else if (cxbVar2.ah() && i == 0) {
            cfx cfxVarK = cxwVar2;
            for (int i6 = 0; i6 < aagVar6.b; i6++) {
                cfxVarK = cxx.k((cfw) aagVar6.c(i6), cfxVarK);
            }
            cxxVar2.g();
            cxxVar = cxxVar2;
            aagVar = aagVar6;
            cxwVar = cxwVar2;
            z = true;
        } else if (i4 != 0) {
            boolean z2 = !cxbVar2.ah();
            aagVar = aagVar6;
            cxwVar = cxwVar2;
            cxxVar = cxxVar2;
            cxxVar.j(0, aagVar3, aagVar, cxwVar, z2);
            z = true;
        } else {
            if (aagVar3 == null) {
                crt.a("expected prior modifier list to be non-empty");
                throw new aezp();
            }
            cfx cfxVar5 = cxwVar2.u;
            for (int i7 = 0; cfxVar5 != null && i7 < aagVar3.b; i7++) {
                cfxVar5 = cxx.l(cfxVar5).u;
            }
            cwq cwqVar = cxxVar2.c;
            cxb cxbVarL2 = cxbVar2.l();
            cwqVar.x = cxbVarL2 != null ? cxbVarL2.p() : null;
            cxxVar2.d = cwqVar;
            cxxVar = cxxVar2;
            aagVar = aagVar6;
            cxwVar = cxwVar2;
            z = false;
        }
        cxxVar.g = aagVar;
        aagVar3.k();
        aagVar5.p(aagVar3);
        aagVar7.k();
        cxxVar3.i = aagVar7;
        cfx cfxVar6 = cxwVar.u;
        if (cfxVar6 == null) {
            cfxVar6 = cxxVar.e;
        }
        cfxVar6.t = null;
        cxwVar.u = null;
        cxwVar.s = -1;
        cxwVar.w = null;
        if (cfxVar6 == cxwVar) {
            crt.c("trimChain did not update the head");
        }
        cxxVar.f = cfxVar6;
        if (z) {
            cxxVar.h();
        }
        boolean zI3 = cxxVar.i(16);
        boolean zI4 = cxxVar.i(1024);
        this.w.m();
        if (this.j == null && cxxVar.i(sk.AUDIO_CONTENT_BUFFER_SIZE)) {
            aH(this);
        }
        if (zI == zI3 && zI2 == zI4) {
            return;
        }
        dei deiVar = ((czq) cxe.a(this)).p;
        if (am() && dei.h(this)) {
            def defVar = deiVar.b;
            int iA = deiVar.a(this) + 2;
            long[] jArr = (long[]) defVar.b;
            jArr[iA] = ((zI3 ? 1L : 0L) * 4611686018427387904L) | (jArr[iA] & (-6917529027641081857L)) | ((zI4 ? 1L : 0L) * 2305843009213693952L);
        }
    }

    private final void aD() {
        cxb cxbVar;
        if (this.J > 0) {
            this.L = true;
        }
        if (!this.I || (cxbVar = this.M) == null) {
            return;
        }
        cxbVar.aD();
    }

    private final void aE(cxb cxbVar) {
        if (cxbVar.w.k > 0) {
            this.w.g(r0.k - 1);
        }
        if (this.k != null) {
            cxbVar.B();
        }
        cxbVar.M = null;
        if (cxbVar.C > 0) {
            ac(this.C - 1);
        }
        cxbVar.q().x = null;
        if (cxbVar.I) {
            this.J--;
            byw bywVar = (byw) cxbVar.V.b;
            Object[] objArr = bywVar.a;
            int i = bywVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((cxb) objArr[i2]).q().x = null;
            }
        }
        aD();
        Q();
    }

    private final void aF() {
        I();
        cxb cxbVarL = l();
        if (cxbVarL != null) {
            cxbVarL.G();
        } else {
            cym cymVar = this.k;
            if (cymVar != null) {
                ((czq) cymVar).invalidate();
            }
        }
        H();
    }

    private final void aG() {
        cxx cxxVar = this.v;
        for (cfx cfxVar = cxxVar.e; cfxVar != null; cfxVar = cfxVar.t) {
            if (cfxVar.A) {
                cfxVar.Q();
            }
        }
        cxxVar.f();
        cxxVar.c();
    }

    private final void aH(cxb cxbVar) {
        if (affa.f(cxbVar, this.j)) {
            return;
        }
        this.j = cxbVar;
        cxf cxfVar = this.w;
        if (cxbVar != null) {
            if (cxfVar.p == null) {
                cxfVar.p = new cxn(cxfVar);
            }
            cyc cycVar = p().w;
            for (cyc cycVarQ = q(); !affa.f(cycVarQ, cycVar) && cycVarQ != null; cycVarQ = cycVarQ.w) {
                cycVarQ.D();
            }
        } else {
            cxfVar.p = null;
            cxfVar.e = false;
            cxfVar.d = false;
        }
        I();
    }

    public final void A() {
        this.T = this.E;
        this.E = 3;
        byw bywVarK = k();
        Object[] objArr = bywVarK.a;
        int i = bywVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            cxb cxbVar = (cxb) objArr[i2];
            if (cxbVar.E == 2) {
                cxbVar.A();
            }
        }
    }

    public final void B() {
        cvv cvvVar;
        cym cymVar = this.k;
        if (cymVar == null) {
            cxb cxbVarL = l();
            crt.a("Cannot detach node that is already detached!  Tree: ".concat(String.valueOf(cxbVarL != null ? cxbVarL.aA(0) : null)));
            throw new aezp();
        }
        cxb cxbVarL2 = l();
        if (cxbVarL2 != null) {
            cxbVarL2.G();
            cxbVarL2.I();
            o().G = 3;
            cxn cxnVarN = n();
            if (cxnVarN != null) {
                cxnVarN.y = 3;
            }
        }
        cxf cxfVar = this.w;
        cxfVar.o.w.h();
        cxn cxnVar = cxfVar.p;
        if (cxnVar != null && (cvvVar = cxnVar.p) != null) {
            cvvVar.h();
        }
        cyc cycVar = p().w;
        for (cyc cycVarQ = q(); !affa.f(cycVarQ, cycVar) && cycVarQ != null; cycVarQ = cycVarQ.w) {
            cycVarQ.au();
            if (cycVarQ.t.an()) {
                cycVarQ.aq();
            }
        }
        afec afecVar = this.A;
        if (afecVar != null) {
            afecVar.invoke(cymVar);
        }
        cxx cxxVar = this.v;
        cxxVar.f();
        this.n = true;
        byw bywVar = (byw) this.V.b;
        Object[] objArr = bywVar.a;
        int i = bywVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((cxb) objArr[i2]).B();
        }
        this.n = false;
        cxxVar.c();
        czq czqVar = (czq) cymVar;
        czqVar.M.d(this.c);
        cxp cxpVar = czqVar.z;
        cxpVar.i.w(this);
        ((byw) cxpVar.d.a).m(this);
        czqVar.v = true;
        cgi cgiVar = czqVar.Q;
        if (cgiVar != null && cgiVar.h.e(this.c)) {
            cgiVar.g.c(cgiVar.a, this.c, false);
        }
        czqVar.p.f(this);
        this.k = null;
        aH(null);
        this.m = 0;
        cxq cxqVarO = o();
        cxqVarO.i = Alert.DURATION_SHOW_INDEFINITELY;
        cxqVarO.h = Alert.DURATION_SHOW_INDEFINITELY;
        cxqVarO.s = false;
        cxn cxnVarN2 = n();
        if (cxnVarN2 != null) {
            cxnVarN2.i = Alert.DURATION_SHOW_INDEFINITELY;
            cxnVarN2.h = Alert.DURATION_SHOW_INDEFINITELY;
            cxnVarN2.z = 3;
        }
        if (cxxVar.i(8)) {
            ddr ddrVar = this.N;
            this.N = null;
            this.o = false;
            czqVar.W.B(this, ddrVar);
            cymVar.B();
        }
    }

    public final void C(cju cjuVar, cmi cmiVar) throws Throwable {
        try {
            q().ah(cjuVar, cmiVar);
        } catch (Throwable th) {
            as(th);
            throw new aezp();
        }
    }

    public final void D() {
        if (this.j != null) {
            V(false, false, true);
        } else {
            X(false, false, true);
        }
        dle dleVarB = this.w.b();
        cym cymVar = this.k;
        if (dleVarB != null) {
            if (cymVar != null) {
                cymVar.w(this, dleVarB.a);
            }
        } else if (cymVar != null) {
            cymVar.v(true);
        }
    }

    public final void E(long j, cwo cwoVar, int i, boolean z) {
        cyc cycVarQ = q();
        afec afecVar = cyc.p;
        q().aj(cyc.r, cycVarQ.aB(j), cwoVar, i, z);
    }

    public final void F(int i, cxb cxbVar) {
        if (cxbVar.M != null && cxbVar.k != null) {
            crt.c(aB(cxbVar));
        }
        cxbVar.M = this;
        this.V.n(i, cxbVar);
        Q();
        if (cxbVar.I) {
            this.J++;
        }
        aD();
        cym cymVar = this.k;
        if (cymVar != null) {
            cxbVar.y(cymVar);
        }
        if (cxbVar.w.k > 0) {
            cxf cxfVar = this.w;
            cxfVar.g(cxfVar.k + 1);
        }
        if (cxbVar.C > 0) {
            ac(this.C + 1);
        }
    }

    public final void G() {
        if (this.R) {
            cyc cycVarP = p();
            cyc cycVar = q().x;
            this.Q = null;
            while (true) {
                if (affa.f(cycVarP, cycVar)) {
                    break;
                }
                if ((cycVarP != null ? cycVarP.I : null) != null) {
                    this.Q = cycVarP;
                    break;
                }
                cycVarP = cycVarP != null ? cycVarP.x : null;
            }
            this.R = false;
        }
        cyc cycVar2 = this.Q;
        if (cycVar2 != null && cycVar2.I == null) {
            crt.a("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
            throw new aezp();
        }
        if (cycVar2 != null) {
            cycVar2.ak();
            return;
        }
        cxb cxbVarL = l();
        if (cxbVarL != null) {
            cxbVarL.G();
            return;
        }
        cym cymVar = this.k;
        if (cymVar != null) {
            ((czq) cymVar).invalidate();
        }
    }

    public final void H() {
        cyc cycVarQ = q();
        cyc cycVarP = p();
        while (cycVarQ != cycVarP) {
            cycVarQ.getClass();
            cwx cwxVar = (cwx) cycVarQ;
            cyk cykVar = cwxVar.I;
            if (cykVar != null) {
                cykVar.invalidate();
            }
            cycVarQ = cwxVar.w;
        }
        cyk cykVar2 = p().I;
        if (cykVar2 != null) {
            cykVar2.invalidate();
        }
    }

    public final void I() {
        if (this.I) {
            cxb cxbVarL = l();
            if (cxbVarL != null) {
                cxbVarL.I();
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
    /* JADX WARN: Type inference failed for: r4v1, types: [afec, java.lang.Object] */
    public final void J() {
        if (this.p) {
            return;
        }
        if (this.v.b.u != null || ah()) {
            this.o = true;
            return;
        }
        ddr ddrVar = this.N;
        this.p = true;
        affv affvVar = new affv();
        affvVar.a = new ddr();
        cyp cypVar = ((czq) cxe.a(this)).w;
        bws bwsVar = new bws(this, affvVar, 4);
        ((ces) cypVar.a).b(this, cypVar.d, bwsVar);
        this.p = false;
        this.N = (ddr) affvVar.a;
        this.o = false;
        cym cymVarA = cxe.a(this);
        ((czq) cymVarA).W.B(this, ddrVar);
        cymVarA.B();
    }

    public final void K() {
        cxb cxbVarL;
        if (this.E == 3) {
            A();
        }
        cxn cxnVarN = n();
        cxnVarN.getClass();
        try {
            cxnVarN.g = true;
            if (!cxnVarN.k) {
                crt.c("replace() called on item that was not placed");
            }
            cxnVarN.x = false;
            boolean zE = cxnVarN.E();
            cxnVarN.G(cxnVarN.m, cxnVarN.n, cxnVarN.o);
            if (zE && !cxnVarN.x && (cxbVarL = cxnVarN.p().l()) != null) {
                cxbVarL.U(false);
            }
        } finally {
            cxnVarN.g = false;
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
                bii biiVar = this.V;
                biiVar.n(i6, (cxb) biiVar.m(i5));
            }
            Q();
            aD();
            I();
        }
    }

    public final void P(cyc cycVar) {
        cym cymVar = this.k;
        dei deiVar = cymVar != null ? ((czq) cymVar).p : null;
        boolean z = av() != 5 || al() || ai();
        if (this.h != -4 && deiVar != null) {
            if (cycVar == q()) {
                this.g = true;
                if (!z) {
                    deiVar.e(this);
                }
            } else {
                this.f = true;
                byw bywVarK = k();
                Object[] objArr = bywVarK.a;
                int i = bywVarK.b;
                for (int i2 = 0; i2 < i; i2++) {
                    cxb cxbVar = (cxb) objArr[i2];
                    cxbVar.g = true;
                    if (!z) {
                        deiVar.e(cxbVar);
                    }
                }
                if (dei.h(this)) {
                    deiVar.d = true;
                    int iA = deiVar.a(this) + 2;
                    long[] jArr = (long[]) deiVar.b.b;
                    long j = jArr[iA];
                    jArr[iA] = j | (((j >> 63) & 1) << 60);
                }
                deiVar.i();
            }
        }
        this.w.o.D();
    }

    public final void Q() {
        if (!this.I) {
            this.P = true;
            return;
        }
        cxb cxbVarL = l();
        if (cxbVarL != null) {
            cxbVarL.Q();
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [afdr, java.lang.Object] */
    public final void R() {
        bii biiVar = this.V;
        byw bywVar = (byw) biiVar.b;
        int i = bywVar.b;
        while (true) {
            i--;
            if (i < 0) {
                bywVar.g();
                biiVar.a.invoke();
                return;
            }
            aE((cxb) bywVar.a[i]);
        }
    }

    public final void S(int i, int i2) {
        if (i2 < 0) {
            crt.b(a.bn(i2, "count (", ") must be greater than 0"));
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            bii biiVar = this.V;
            aE((cxb) ((byw) biiVar.b).a[i3]);
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void T() {
        cxb cxbVarL;
        if (this.E == 3) {
            A();
        }
        cxq cxqVarO = o();
        try {
            cxqVarO.g = true;
            if (!cxqVarO.k) {
                crt.c("replace called on unplaced item");
            }
            boolean z = cxqVarO.s;
            cxqVarO.C(cxqVarO.m, cxqVarO.p, cxqVarO.n, cxqVarO.o);
            if (z && !cxqVarO.B && (cxbVarL = cxqVarO.p().l()) != null) {
                cxbVarL.W(false);
            }
        } finally {
        }
    }

    public final void U(boolean z) {
        cym cymVar;
        if (this.I || (cymVar = this.k) == null) {
            return;
        }
        cymVar.A(this, true, z);
    }

    public final void V(boolean z, boolean z2, boolean z3) {
        cxb cxbVarL;
        if (this.j == null) {
            crt.c("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        cym cymVar = this.k;
        if (cymVar == null || this.n || this.I) {
            return;
        }
        cymVar.z(this, true, z, z2);
        if (z3) {
            cxn cxnVarN = n();
            cxnVarN.getClass();
            cxb cxbVarL2 = cxnVarN.p().l();
            int i = cxnVarN.p().E;
            if (cxbVarL2 == null || i == 3) {
                return;
            }
            while (cxbVarL2.E == i && (cxbVarL = cxbVarL2.l()) != null) {
                cxbVarL2 = cxbVarL;
            }
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                if (cxbVarL2.j != null) {
                    cxbVarL2.V(z, true, true);
                    return;
                } else {
                    cxbVarL2.X(z, true, true);
                    return;
                }
            }
            if (i2 != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (cxbVarL2.j != null) {
                cxbVarL2.U(z);
            } else {
                cxbVarL2.W(z);
            }
        }
    }

    public final void W(boolean z) {
        cym cymVar;
        if (this.I || (cymVar = this.k) == null) {
            return;
        }
        cymVar.A(this, false, z);
    }

    public final void X(boolean z, boolean z2, boolean z3) {
        cym cymVar;
        cxb cxbVarL;
        if (this.n || this.I || (cymVar = this.k) == null) {
            return;
        }
        cymVar.z(this, false, z, z2);
        if (z3) {
            cxq cxqVarO = o();
            cxb cxbVarL2 = cxqVarO.p().l();
            int i = cxqVarO.p().E;
            if (cxbVarL2 == null || i == 3) {
                return;
            }
            while (cxbVarL2.E == i && (cxbVarL = cxbVarL2.l()) != null) {
                cxbVarL2 = cxbVarL;
            }
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                cxbVarL2.X(z, true, true);
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                cxbVarL2.W(z);
            }
        }
    }

    public final void Y(cxb cxbVar) {
        int iAv = cxbVar.av();
        int i = iAv - 1;
        if (iAv == 0) {
            throw null;
        }
        if (i != 4) {
            int iAv2 = cxbVar.av();
            Objects.toString(cjn.t(iAv2));
            throw new IllegalStateException("Unexpected state ".concat(cjn.t(iAv2)));
        }
        if (cxbVar.ak()) {
            cxbVar.V(true, true, true);
            return;
        }
        if (cxbVar.aj()) {
            cxbVar.U(true);
        }
        if (cxbVar.al()) {
            cxbVar.X(true, true, true);
        } else if (cxbVar.ai()) {
            cxbVar.W(true);
        }
    }

    public final void Z() {
        byw bywVarK = k();
        Object[] objArr = bywVarK.a;
        int i = bywVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            cxb cxbVar = (cxb) objArr[i2];
            int i3 = cxbVar.T;
            cxbVar.E = i3;
            if (i3 != 3) {
                cxbVar.Z();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [cfx] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [cfx] */
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
    /* JADX WARN: Type inference failed for: r6v3, types: [byw] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [byw] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.cyl
    public final void a() {
        cyc cycVarP = p();
        int i = cyd.a;
        cyx cyxVar = ((cwq) cycVarP).f;
        for (cfx cfxVarAb = cycVarP.ab(true); cfxVarAb != null && (cfxVarAb.s & 4194304) != 0; cfxVarAb = cfxVarAb.u) {
            if ((cfxVarAb.r & 4194304) != 0) {
                cwe cweVarN = cfxVarAb;
                ?? bywVar = 0;
                while (cweVarN != 0) {
                    if (cweVarN instanceof cws) {
                        ((cws) cweVarN).f(p());
                    } else if ((cweVarN.r & 4194304) != 0 && (cweVarN instanceof cwe)) {
                        cfx cfxVar = cweVarN.C;
                        int i2 = 0;
                        cweVarN = cweVarN;
                        bywVar = bywVar;
                        while (cfxVar != null) {
                            if ((cfxVar.r & 4194304) != 0) {
                                i2++;
                                bywVar = bywVar;
                                if (i2 == 1) {
                                    cweVarN = cfxVar;
                                } else {
                                    if (bywVar == 0) {
                                        bywVar = new byw(new cfx[16]);
                                    }
                                    if (cweVarN != 0) {
                                        bywVar.n(cweVarN);
                                    }
                                    bywVar.n(cfxVar);
                                    cweVarN = 0;
                                }
                            }
                            cfxVar = cfxVar.u;
                            cweVarN = cweVarN;
                            bywVar = bywVar;
                        }
                        if (i2 != 1) {
                        }
                    }
                    cweVarN = bzi.n(bywVar);
                }
            }
            if (cfxVarAb == cyxVar) {
                return;
            }
        }
    }

    public final void aa(int i) {
        this.i = i;
    }

    public final void ab(dlg dlgVar) {
        if (affa.f(this.r, dlgVar)) {
            return;
        }
        this.r = dlgVar;
        aF();
        for (cfx cfxVar = this.v.f; cfxVar != null; cfxVar = cfxVar.u) {
            cfxVar.t();
        }
    }

    public final void ac(int i) {
        cxb cxbVarL;
        cxb cxbVarL2;
        int i2 = this.C;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (cxbVarL2 = l()) != null) {
                cxbVarL2.ac(cxbVarL2.C + 1);
            }
            if (i == 0 && this.C > 0 && (cxbVarL = l()) != null) {
                cxbVarL.ac(cxbVarL.C - 1);
            }
            this.C = i;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [bwq, java.lang.Object] */
    public final void ad(ctp ctpVar) {
        if (affa.f(this.q, ctpVar)) {
            return;
        }
        this.q = ctpVar;
        sx sxVar = this.U;
        if (sxVar != null) {
            sxVar.a.b(ctpVar);
        }
        I();
    }

    public final void ae(cfy cfyVar) {
        if (this.I && this.y != cfy.e) {
            crt.b("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.D) {
            crt.b("modifier is updated when deactivated");
        }
        if (!am()) {
            this.S = cfyVar;
            return;
        }
        aC(cfyVar);
        if (this.o) {
            J();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [cfx] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [cfx] */
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
    /* JADX WARN: Type inference failed for: r2v3, types: [byw] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [byw] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void af(dcc dccVar) {
        if (affa.f(this.t, dccVar)) {
            return;
        }
        this.t = dccVar;
        cxx cxxVar = this.v;
        if ((cxxVar.a() & 16) != 0) {
            for (cfx cfxVar = cxxVar.f; cfxVar != null; cfxVar = cfxVar.u) {
                if ((cfxVar.r & 16) != 0) {
                    cwe cweVarN = cfxVar;
                    ?? bywVar = 0;
                    while (cweVarN != 0) {
                        if (cweVarN instanceof cys) {
                            ((cys) cweVarN).t();
                        } else if ((cweVarN.r & 16) != 0 && (cweVarN instanceof cwe)) {
                            cfx cfxVar2 = cweVarN.C;
                            int i = 0;
                            cweVarN = cweVarN;
                            bywVar = bywVar;
                            while (cfxVar2 != null) {
                                if ((cfxVar2.r & 16) != 0) {
                                    i++;
                                    bywVar = bywVar;
                                    if (i == 1) {
                                        cweVarN = cfxVar2;
                                    } else {
                                        if (bywVar == 0) {
                                            bywVar = new byw(new cfx[16]);
                                        }
                                        if (cweVarN != 0) {
                                            bywVar.n(cweVarN);
                                        }
                                        bywVar.n(cfxVar2);
                                        cweVarN = 0;
                                    }
                                }
                                cfxVar2 = cfxVar2.u;
                                cweVarN = cweVarN;
                                bywVar = bywVar;
                            }
                            if (i != 1) {
                            }
                        }
                        cweVarN = bzi.n(bywVar);
                    }
                }
                if ((cfxVar.s & 16) == 0) {
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
        byw bywVar = this.K;
        if (bywVar == null) {
            bywVar = new byw(new cxb[16]);
            this.K = bywVar;
        }
        bywVar.g();
        byw bywVar2 = (byw) this.V.b;
        Object[] objArr = bywVar2.a;
        int i = bywVar2.b;
        for (int i2 = 0; i2 < i; i2++) {
            cxb cxbVar = (cxb) objArr[i2];
            if (cxbVar.I) {
                bywVar.o(bywVar.b, cxbVar.k());
            } else {
                bywVar.n(cxbVar);
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

    public final boolean ap(dle dleVar) {
        if (dleVar == null || this.j == null) {
            return false;
        }
        cxn cxnVarN = n();
        cxnVarN.getClass();
        return cxnVarN.F(dleVar.a);
    }

    public final boolean aq(dle dleVar) {
        if (dleVar == null) {
            return false;
        }
        if (this.E == 3) {
            z();
        }
        return o().E(dleVar.a);
    }

    public final void ar(long j, cwo cwoVar, boolean z) {
        cyc cycVarQ = q();
        afec afecVar = cyc.p;
        q().aj(cyc.s, cycVarQ.aB(j), cwoVar, 1, z);
    }

    public final void as(Throwable th) throws Throwable {
        cff cffVar = (cff) this.F.f(cfg.a);
        if (cffVar == null) {
            throw th;
        }
        cffVar.c(th, this);
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
        cxn cxnVarN = n();
        if (cxnVarN == null || (i = cxnVarN.y) == 0) {
            return 3;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [cfx] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [cfx] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [byw] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [byw] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void ay(ccx ccxVar) {
        this.F = ccxVar;
        ab((dlg) ccxVar.f(dbc.d));
        dlr dlrVar = (dlr) ccxVar.f(dbc.i);
        if (this.s != dlrVar) {
            this.s = dlrVar;
            aF();
            for (cfx cfxVar = this.v.f; cfxVar != null; cfxVar = cfxVar.u) {
                cfxVar.ec();
            }
        }
        af((dcc) ccxVar.f(dbc.n));
        cxx cxxVar = this.v;
        if ((cxxVar.a() & 32768) != 0) {
            for (cfx cfxVar2 = cxxVar.f; cfxVar2 != null; cfxVar2 = cfxVar2.u) {
                if ((cfxVar2.r & 32768) != 0) {
                    cwe cweVarN = cfxVar2;
                    ?? bywVar = 0;
                    while (cweVarN != 0) {
                        if (cweVarN instanceof cwc) {
                            cfx cfxVarM = ((cwc) cweVarN).M();
                            if (cfxVarM.A) {
                                cyd.g(cfxVarM);
                            } else {
                                cfxVarM.y = true;
                            }
                        } else if ((cweVarN.r & 32768) != 0 && (cweVarN instanceof cwe)) {
                            cfx cfxVar3 = cweVarN.C;
                            int i = 0;
                            cweVarN = cweVarN;
                            bywVar = bywVar;
                            while (cfxVar3 != null) {
                                if ((cfxVar3.r & 32768) != 0) {
                                    i++;
                                    bywVar = bywVar;
                                    if (i == 1) {
                                        cweVarN = cfxVar3;
                                    } else {
                                        if (bywVar == 0) {
                                            bywVar = new byw(new cfx[16]);
                                        }
                                        if (cweVarN != 0) {
                                            bywVar.n(cweVarN);
                                        }
                                        bywVar.n(cfxVar3);
                                        cweVarN = 0;
                                    }
                                }
                                cfxVar3 = cfxVar3.u;
                                cweVarN = cweVarN;
                                bywVar = bywVar;
                            }
                            if (i != 1) {
                            }
                        }
                        cweVarN = bzi.n(bywVar);
                    }
                }
                if ((cfxVar2.s & 32768) == 0) {
                    return;
                }
            }
        }
    }

    public final sx az() {
        sx sxVar = this.U;
        if (sxVar != null) {
            return sxVar;
        }
        sx sxVar2 = new sx(this, this.q);
        this.U = sxVar2;
        return sxVar2;
    }

    @Override // defpackage.bur
    public final void b() {
        cgi cgiVar;
        dme dmeVar = this.l;
        if (dmeVar != null) {
            dmeVar.removeAllViewsInLayout();
        }
        ctl ctlVar = this.x;
        if (ctlVar != null) {
            ctlVar.l(true);
        }
        this.D = true;
        aG();
        if (am()) {
            this.N = null;
            this.o = false;
        }
        cym cymVar = this.k;
        if (cymVar == null || (cgiVar = ((czq) cymVar).Q) == null || !cgiVar.h.e(this.c)) {
            return;
        }
        cgiVar.g.c(cgiVar.a, this.c, false);
    }

    @Override // defpackage.bur
    public final void c() {
        dme dmeVar = this.l;
        if (dmeVar != null) {
            dmeVar.c();
        }
        ctl ctlVar = this.x;
        if (ctlVar != null) {
            ctlVar.g();
        }
        cyc cycVar = p().w;
        for (cyc cycVarQ = q(); !affa.f(cycVarQ, cycVar) && cycVarQ != null; cycVarQ = cycVarQ.w) {
            cycVarQ.ap();
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

    public final View h() {
        dme dmeVar = this.l;
        if (dmeVar != null) {
            return dmeVar.b;
        }
        return null;
    }

    @Override // defpackage.bur
    public final void i() {
        dei deiVar;
        cgi cgiVar;
        dei deiVar2;
        if (!am()) {
            crt.b("onReuse is only expected on attached node");
        }
        dme dmeVar = this.l;
        if (dmeVar != null) {
            dmeVar.i();
        }
        ctl ctlVar = this.x;
        if (ctlVar != null) {
            ctlVar.l(false);
        }
        this.p = false;
        if (this.D) {
            this.D = false;
        } else {
            aG();
        }
        int i = this.c;
        cym cymVar = this.k;
        if (cymVar != null && (deiVar2 = ((czq) cymVar).p) != null) {
            deiVar2.f(this);
        }
        this.c = dds.a.addAndGet(1);
        cym cymVar2 = this.k;
        if (cymVar2 != null) {
            zh zhVar = ((czq) cymVar2).M;
            zhVar.d(i);
            zhVar.g(this.c, this);
        }
        cxx cxxVar = this.v;
        cxxVar.b();
        cxxVar.e();
        if (cxxVar.i(8)) {
            J();
        }
        Y(this);
        cym cymVar3 = this.k;
        if (cymVar3 != null && (cgiVar = ((czq) cymVar3).Q) != null) {
            if (cgiVar.h.e(i)) {
                cgiVar.g.c(cgiVar.a, i, false);
            }
            ddr ddrVarR = r();
            if (ddrVarR != null && aan.f(ddrVarR.c, ddx.r)) {
                cgiVar.h.d(this.c);
                cgiVar.g.c(cgiVar.a, this.c, true);
            }
        }
        cym cymVar4 = this.k;
        if (cymVar4 == null || (deiVar = ((czq) cymVar4).p) == null) {
            return;
        }
        deiVar.e(this);
    }

    public final byw j() {
        if (this.P) {
            byw bywVar = this.O;
            bywVar.g();
            bywVar.o(bywVar.b, k());
            bywVar.j(b);
            this.P = false;
        }
        return this.O;
    }

    public final byw k() {
        Object obj;
        ag();
        if (this.J == 0) {
            obj = this.V.b;
        } else {
            obj = this.K;
            obj.getClass();
        }
        return (byw) obj;
    }

    public final cxb l() {
        do {
            this = this.M;
            if (this == null) {
                break;
            }
        } while (this.I);
        return this;
    }

    public final cxd m() {
        return ((czq) cxe.a(this)).P().h;
    }

    public final cxn n() {
        return this.w.p;
    }

    public final cxq o() {
        return this.w.o;
    }

    public final cyc p() {
        return this.v.c;
    }

    public final cyc q() {
        return this.v.d;
    }

    public final ddr r() {
        if (am() && !this.D && this.v.i(8)) {
            return this.N;
        }
        return null;
    }

    public final Boolean s() {
        cxn cxnVarN = n();
        if (cxnVarN != null) {
            return Boolean.valueOf(cxnVarN.E());
        }
        return null;
    }

    public final List t() {
        cxn cxnVarN = n();
        cxnVarN.getClass();
        cxnVarN.p().v();
        if (!cxnVarN.r) {
            return cxnVarN.q.e();
        }
        cxb cxbVarP = cxnVarN.p();
        byw bywVar = cxnVarN.q;
        byw bywVarK = cxbVarP.k();
        Object[] objArr = bywVarK.a;
        int i = bywVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            cxb cxbVar = (cxb) objArr[i2];
            if (bywVar.b <= i2) {
                cxn cxnVar = cxbVar.w.p;
                cxnVar.getClass();
                bywVar.n(cxnVar);
            } else {
                cxn cxnVar2 = cxbVar.w.p;
                cxnVar2.getClass();
                bywVar.d(i2, cxnVar2);
            }
        }
        bywVar.h(cxbVarP.v().size(), bywVar.b);
        cxnVarN.r = false;
        return bywVar.e();
    }

    public final String toString() {
        return dat.f(this) + " children: " + v().size() + " measurePolicy: " + this.q + " deactivated: " + this.D + " isVirtual: " + this.I + " isPlaced: " + an();
    }

    public final List u() {
        return o().r();
    }

    public final List v() {
        return k().e();
    }

    @Override // defpackage.cyn
    public final boolean w() {
        return am();
    }

    public final List x() {
        return ((byw) this.V.b).e();
    }

    public final void y(cym cymVar) {
        cxb cxbVar;
        ddr ddrVarR;
        if (this.k != null) {
            crt.c("Cannot attach " + this + " as it already is attached.  Tree: " + aA(0));
        }
        cxb cxbVar2 = this.M;
        if (cxbVar2 != null && !affa.f(cxbVar2.k, cymVar)) {
            cxb cxbVarL = l();
            cym cymVar2 = cxbVarL != null ? cxbVarL.k : null;
            String strAA = aA(0);
            cxb cxbVar3 = this.M;
            crt.c("Attaching to a different owner(" + cymVar + ") than the parent's owner(" + cymVar2 + "). This tree: " + strAA + " Parent tree: " + (cxbVar3 != null ? cxbVar3.aA(0) : null));
        }
        cxb cxbVarL2 = l();
        if (cxbVarL2 == null) {
            o().s = true;
            ((czq) cymVar).p.e(this);
            cxn cxnVarN = n();
            if (cxnVarN != null) {
                cxnVarN.z = 1;
            }
        }
        q().x = cxbVarL2 != null ? cxbVarL2.p() : null;
        this.k = cymVar;
        this.m = (cxbVarL2 != null ? cxbVarL2.m : -1) + 1;
        cfy cfyVar = this.S;
        if (cfyVar != null) {
            aC(cfyVar);
        }
        this.S = null;
        czq czqVar = (czq) cymVar;
        czqVar.M.g(this.c, this);
        cxb cxbVar4 = this.M;
        if (cxbVar4 == null || (cxbVar = cxbVar4.j) == null) {
            cxbVar = this.j;
        }
        aH(cxbVar);
        if (this.j == null && this.v.i(sk.AUDIO_CONTENT_BUFFER_SIZE)) {
            aH(this);
        }
        if (!this.D) {
            this.v.b();
        }
        byw bywVar = (byw) this.V.b;
        Object[] objArr = bywVar.a;
        int i = bywVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((cxb) objArr[i2]).y(cymVar);
        }
        if (!this.D) {
            this.v.e();
        }
        I();
        if (cxbVarL2 != null) {
            cxbVarL2.I();
        }
        afec afecVar = this.z;
        if (afecVar != null) {
            afecVar.invoke(cymVar);
        }
        this.w.m();
        if (!this.D && this.v.i(8)) {
            J();
        }
        cgi cgiVar = czqVar.Q;
        if (cgiVar == null || (ddrVarR = r()) == null || !aan.f(ddrVarR.c, ddx.r)) {
            return;
        }
        cgiVar.h.d(this.c);
        cgiVar.g.c(cgiVar.a, this.c, true);
    }

    public final void z() {
        this.T = this.E;
        this.E = 3;
        byw bywVarK = k();
        Object[] objArr = bywVarK.a;
        int i = bywVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            cxb cxbVar = (cxb) objArr[i2];
            if (cxbVar.E != 3) {
                cxbVar.z();
            }
        }
    }

    public cxb() {
        this(false, 3, null);
    }

    public /* synthetic */ cxb(boolean z, int i, byte[] bArr) {
        this(1 == ((z ? 1 : 0) & ((i & 1) ^ 1)), dds.a.addAndGet(1));
    }
}
