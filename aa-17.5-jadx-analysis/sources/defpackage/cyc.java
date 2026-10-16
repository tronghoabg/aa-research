package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class cyc extends cxk implements cto, cst, cyn {
    public cjb B;
    public cjb C;
    public boolean D;
    public boolean E;
    public cmi F;
    public cju G;
    public boolean H;
    public cyk I;
    private boolean J;
    private boolean K;
    private afec L;
    private dlg M;
    private dlr N;
    private ctq P;
    private ciz Q;
    private cwr R;
    private afeg S;
    private final afdr T;
    private cmi U;
    private aae V;
    public final cxb t;
    public boolean u;
    public boolean v;
    public cyc w;
    public cyc x;
    public float z;
    private static final afec f = new bwr(15);
    public static final afec p = new bwr(16);
    public static final cks q = new cks();
    private static final cwr g = new cwr();
    private static final float[] h = cki.e();
    public static final cyb r = new cxz();
    public static final cyb s = new cya();
    private float O = 1.0f;
    public long y = 0;
    public ckv A = ckq.a;

    public cyc(cxb cxbVar) {
        this.t = cxbVar;
        this.M = cxbVar.r;
        this.N = cxbVar.s;
        cjb cjbVar = cjb.a;
        this.B = cjbVar;
        this.C = cjbVar;
        this.T = new bxh(this, 12);
    }

    private final afeg G() {
        afeg afegVar = this.S;
        if (afegVar != null) {
            return afegVar;
        }
        apn apnVar = new apn(this, new bxh(this, 11), 14, null);
        this.S = apnVar;
        return apnVar;
    }

    private final void H(cyc cycVar, ciz cizVar, boolean z) {
        if (cycVar == this) {
            return;
        }
        cyc cycVar2 = this.x;
        if (cycVar2 != null) {
            cycVar2.H(cycVar, cizVar, z);
        }
        long j = this.y;
        float f2 = (int) (j >> 32);
        cizVar.a -= f2;
        cizVar.c -= f2;
        float f3 = (int) (j & 4294967295L);
        cizVar.b -= f3;
        cizVar.d -= f3;
        cyk cykVar = this.I;
        if (cykVar != null) {
            cykVar.e(cizVar, true);
            if (this.K && z) {
                long j2 = this.c;
                cizVar.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    private final void aD(cfx cfxVar, cyb cybVar, long j, cwo cwoVar, int i, boolean z) {
        if (cfxVar == null) {
            E(cybVar, j, cwoVar, i, z);
            return;
        }
        if (!cybVar.d(cfxVar)) {
            aD(cjn.q(cfxVar, cybVar.a()), cybVar, j, cwoVar, i, z);
            return;
        }
        int i2 = cwoVar.a;
        cwoVar.d(i2 + 1, cwoVar.a());
        cwoVar.a++;
        cwoVar.b.p(cfxVar);
        cwoVar.c.b(tv.g(-1.0f, z, false));
        aD(cjn.q(cfxVar, cybVar.a()), cybVar, j, cwoVar, i, z);
        cwoVar.a = i2;
    }

    private final void aE(cfx cfxVar, cyb cybVar, long j, cwo cwoVar, int i, boolean z, float f2) {
        if (cfxVar == null) {
            E(cybVar, j, cwoVar, i, z);
            return;
        }
        if (!cybVar.d(cfxVar)) {
            aE(cjn.q(cfxVar, cybVar.a()), cybVar, j, cwoVar, i, z, f2);
            return;
        }
        int i2 = cwoVar.a;
        cwoVar.d(i2 + 1, cwoVar.a());
        cwoVar.a++;
        cwoVar.b.p(cfxVar);
        cwoVar.c.b(tv.g(f2, z, false));
        ar(cjn.q(cfxVar, cybVar.a()), cybVar, j, cwoVar, i, z, f2, true);
        cwoVar.a = i2;
    }

    private final void aF(cfx cfxVar, cyb cybVar, long j, cwo cwoVar, int i, boolean z, float f2) {
        if (cfxVar == null) {
            E(cybVar, j, cwoVar, i, z);
        } else if (!cybVar.d(cfxVar)) {
            aF(cjn.q(cfxVar, cybVar.a()), cybVar, j, cwoVar, i, z, f2);
        } else {
            cybVar.f(cfxVar);
            ar(cjn.q(cfxVar, cybVar.a()), cybVar, j, cwoVar, i, z, f2, false);
        }
    }

    private final void aG(cyc cycVar, float[] fArr) {
        if (affa.f(cycVar, this)) {
            return;
        }
        cyc cycVar2 = this.x;
        cycVar2.getClass();
        cycVar2.aG(cycVar, fArr);
        if (this.y != 0) {
            float[] fArr2 = h;
            cki.c(fArr2);
            long j = this.y;
            cki.g(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            cki.d(fArr, fArr2);
        }
        cyk cykVar = this.I;
        if (cykVar != null) {
            cykVar.d(fArr);
        }
    }

    private final void aH(cyc cycVar, float[] fArr) {
        while (!affa.f(this, cycVar)) {
            cyk cykVar = this.I;
            if (cykVar != null) {
                cykVar.i(fArr);
            }
            if (this.y != 0) {
                float[] fArr2 = h;
                cki.c(fArr2);
                cki.g(fArr2, (int) (r0 >> 32), (int) (r0 & 4294967295L));
                cki.d(fArr, fArr2);
            }
            this = this.x;
            this.getClass();
        }
    }

    private final boolean aI() {
        return this.D && !this.B.h();
    }

    private final boolean aJ(int i) {
        int i2 = cyd.a;
        cfx cfxVarAb = ab((i & 128) != 0);
        return (cfxVarAb == null || (cfxVarAb.M().s & i) == 0) ? false : true;
    }

    private final long aK(cyc cycVar, long j) {
        if (cycVar == this) {
            return j;
        }
        cyc cycVar2 = this.x;
        return (cycVar2 == null || affa.f(cycVar, cycVar2)) ? aB(j) : aB(cycVar2.aK(cycVar, j));
    }

    private static final cyc aL(cst cstVar) {
        cyc cycVarA;
        ctn ctnVar = cstVar instanceof ctn ? (ctn) cstVar : null;
        if (ctnVar != null && (cycVarA = ctnVar.a()) != null) {
            return cycVarA;
        }
        cstVar.getClass();
        return (cyc) cstVar;
    }

    public abstract cfx B();

    public abstract cxl C();

    public abstract void D();

    public void E(cyb cybVar, long j, cwo cwoVar, int i, boolean z) {
        cyc cycVar = this.w;
        if (cycVar != null) {
            cycVar.aj(cybVar, cycVar.aB(j), cwoVar, i, z);
        }
    }

    public void F(cju cjuVar, cmi cmiVar) {
        throw null;
    }

    @Override // defpackage.cxk
    public final long I() {
        return this.y;
    }

    @Override // defpackage.cxk
    public final ctq K() {
        ctq ctqVar = this.P;
        if (ctqVar != null) {
            return ctqVar;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // defpackage.cxk, defpackage.cxr
    public final cxb L() {
        return this.t;
    }

    @Override // defpackage.cxk
    public final cxk N() {
        return this.w;
    }

    @Override // defpackage.cxk
    public final cxk O() {
        return this.x;
    }

    @Override // defpackage.cxk
    public final void S() {
        cmi cmiVar = this.U;
        long j = this.y;
        if (cmiVar != null) {
            y(j, this.z, cmiVar);
        } else {
            ev(j, this.z, this.L);
        }
    }

    @Override // defpackage.cxk
    public final boolean V() {
        return this.P != null;
    }

    protected final float X(long j, long j2) {
        if (x() >= Float.intBitsToFloat((int) (j2 >> 32)) && eC() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jY = Y(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jY >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jY & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, fIntBitsToFloat3 < BitmapDescriptorFactory.HUE_RED ? -fIntBitsToFloat3 : fIntBitsToFloat3 - x());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fMax2 = Math.max(BitmapDescriptorFactory.HUE_RED, fIntBitsToFloat4 < BitmapDescriptorFactory.HUE_RED ? -fIntBitsToFloat4 : fIntBitsToFloat4 - eC());
        long jFloatToRawIntBits = Float.floatToRawIntBits(fMax);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fMax2);
        long j3 = jFloatToRawIntBits << 32;
        long j4 = jFloatToRawIntBits2 & 4294967295L;
        if (fIntBitsToFloat <= BitmapDescriptorFactory.HUE_RED && fIntBitsToFloat2 <= BitmapDescriptorFactory.HUE_RED) {
            return Float.POSITIVE_INFINITY;
        }
        long j5 = j3 | j4;
        int i = (int) (j5 >> 32);
        if (Float.intBitsToFloat(i) > fIntBitsToFloat) {
            return Float.POSITIVE_INFINITY;
        }
        int i2 = (int) (j5 & 4294967295L);
        if (Float.intBitsToFloat(i2) > fIntBitsToFloat2) {
            return Float.POSITIVE_INFINITY;
        }
        float fIntBitsToFloat5 = Float.intBitsToFloat(i);
        float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
        return (fIntBitsToFloat5 * fIntBitsToFloat5) + (fIntBitsToFloat6 * fIntBitsToFloat6);
    }

    protected final long Y(long j) {
        float fX;
        float fEC;
        if (aI()) {
            cjb cjbVar = this.B;
            fX = cjbVar.d - cjbVar.b;
        } else {
            fX = x();
        }
        if (aI()) {
            cjb cjbVar2 = this.B;
            fEC = cjbVar2.e - cjbVar2.c;
        } else {
            fEC = eC();
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - fX;
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (j & 4294967295L)) - fEC) / 2.0f;
        float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, fIntBitsToFloat / 2.0f);
        float fMax2 = Math.max(BitmapDescriptorFactory.HUE_RED, fIntBitsToFloat2);
        return (Float.floatToRawIntBits(fMax2) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final long Z() {
        return this.M.eH(this.t.t.g());
    }

    @Override // defpackage.dlg
    public final float a() {
        return this.t.r.a();
    }

    protected final void aA(cju cjuVar, cjk cjkVar) {
        long j = this.c;
        cjuVar.l(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, cjkVar);
    }

    public final long aB(long j) {
        long j2 = this.y;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L));
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        cyk cykVar = this.I;
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (jFloatToRawIntBits << 32);
        return cykVar != null ? cykVar.a(jFloatToRawIntBits2, true) : jFloatToRawIntBits2;
    }

    public final long aC(long j) {
        cyk cykVar = this.I;
        if (cykVar != null) {
            j = cykVar.a(j, false);
        }
        return dlf.r(j, this.y);
    }

    public final cfx aa(int i) {
        int i2 = cyd.a;
        cfx cfxVar = B().t;
        if (cfxVar == null) {
            return null;
        }
        for (cfx cfxVarAb = ab(false); cfxVarAb != null && (cfxVarAb.s & i) != 0; cfxVarAb = cfxVarAb.u) {
            if ((cfxVarAb.r & i) != 0) {
                return cfxVarAb;
            }
            if (cfxVarAb == cfxVar) {
                return null;
            }
        }
        return null;
    }

    public final cfx ab(boolean z) {
        cfx cfxVarB;
        cxb cxbVar = this.t;
        if (cxbVar.q() == this) {
            return cxbVar.v.f;
        }
        cyc cycVar = this.x;
        if (!z) {
            if (cycVar == null) {
                return null;
            }
            return cycVar.B();
        }
        if (cycVar == null || (cfxVarB = cycVar.B()) == null) {
            return null;
        }
        return cfxVarB.u;
    }

    protected final ciz ac() {
        ciz cizVar = this.Q;
        if (cizVar != null) {
            return cizVar;
        }
        ciz cizVar2 = new ciz();
        this.Q = cizVar2;
        return cizVar2;
    }

    public final cjb ad() {
        if (t()) {
            cst cstVarJ = crt.j(this);
            ciz cizVarAc = ac();
            long jY = Y(Z());
            boolean zAI = aI();
            float f2 = BitmapDescriptorFactory.HUE_RED;
            float f3 = zAI ? this.B.b : 0.0f;
            if (aI()) {
                f2 = this.B.c;
            }
            float fX = aI() ? this.B.d : x();
            float fEC = aI() ? this.B.e : eC();
            int i = (int) (jY >> 32);
            cizVarAc.a = f3 - Float.intBitsToFloat(i);
            int i2 = (int) (jY & 4294967295L);
            cizVarAc.b = f2 - Float.intBitsToFloat(i2);
            cizVarAc.c = fX + Float.intBitsToFloat(i);
            cizVarAc.d = fEC + Float.intBitsToFloat(i2);
            while (this != cstVarJ) {
                this.at(cizVarAc, false, true);
                if (!cizVarAc.c()) {
                    this = this.x;
                    this.getClass();
                }
            }
            return byx.F(cizVarAc);
        }
        return cjb.a;
    }

    public final cvw ae() {
        return this.t.w.o;
    }

    public final cyc af(cyc cycVar) {
        cxb cxbVar = cycVar.t;
        cxb cxbVar2 = this.t;
        if (cxbVar == cxbVar2) {
            cfx cfxVarB = cycVar.B();
            cfx cfxVarB2 = B();
            if (!cfxVarB2.M().A) {
                crt.c("visitLocalAncestors called on an unattached node");
            }
            cfx cfxVarM = cfxVarB2.M();
            while (true) {
                cfxVarM = cfxVarM.t;
                if (cfxVarM == null) {
                    return this;
                }
                if ((cfxVarM.r & 2) != 0 && cfxVarM == cfxVarB) {
                    break;
                }
            }
        } else {
            cxb cxbVarL = cxbVar;
            while (cxbVarL.m > cxbVar2.m) {
                cxbVarL = cxbVarL.l();
                cxbVarL.getClass();
            }
            cxb cxbVarL2 = cxbVar2;
            while (cxbVarL2.m > cxbVarL.m) {
                cxbVarL2 = cxbVarL2.l();
                cxbVarL2.getClass();
            }
            while (cxbVarL != cxbVarL2) {
                cxbVarL = cxbVarL.l();
                cxbVarL2 = cxbVarL2.l();
                if (cxbVarL == null || cxbVarL2 == null) {
                    throw new IllegalArgumentException("layouts are not part of the same hierarchy");
                }
            }
            if (cxbVarL2 == cxbVar2) {
                return this;
            }
            if (cxbVarL != cxbVar) {
                return cxbVarL.p();
            }
        }
        return cycVar;
    }

    public final cyp ag() {
        return ((czq) cxe.a(this.t)).w;
    }

    public final void ah(cju cjuVar, cmi cmiVar) {
        cyk cykVar = this.I;
        if (cykVar != null) {
            cykVar.c(cjuVar, cmiVar);
            return;
        }
        long j = this.y;
        float f2 = (int) (j >> 32);
        float f3 = (int) (j & 4294967295L);
        cjuVar.i(f2, f3);
        ai(cjuVar, cmiVar);
        cjuVar.i(-f2, -f3);
    }

    public final void ai(cju cjuVar, cmi cmiVar) {
        cyc cycVar;
        cju cjuVar2;
        cmi cmiVar2;
        cfx cfxVarAa = aa(4);
        if (cfxVarAa == null) {
            F(cjuVar, cmiVar);
            return;
        }
        cxd cxdVarM = this.t.m();
        long jK = dln.k(this.c);
        byw bywVar = null;
        while (cfxVarAa != null) {
            if (cfxVarAa instanceof cwk) {
                cycVar = this;
                cjuVar2 = cjuVar;
                cmiVar2 = cmiVar;
                cxdVarM.u(cjuVar2, jK, cycVar, (cwk) cfxVarAa, cmiVar2);
            } else {
                cycVar = this;
                cjuVar2 = cjuVar;
                cmiVar2 = cmiVar;
                if ((cfxVarAa.r & 4) != 0 && (cfxVarAa instanceof cwe)) {
                    int i = 0;
                    for (cfx cfxVar = ((cwe) cfxVarAa).C; cfxVar != null; cfxVar = cfxVar.u) {
                        if ((cfxVar.r & 4) != 0) {
                            i++;
                            if (i == 1) {
                                cfxVarAa = cfxVar;
                            } else {
                                if (bywVar == null) {
                                    bywVar = new byw(new cfx[16]);
                                }
                                if (cfxVarAa != null) {
                                    bywVar.n(cfxVarAa);
                                }
                                bywVar.n(cfxVar);
                                cfxVarAa = null;
                            }
                        }
                    }
                    if (i != 1) {
                    }
                }
                cjuVar = cjuVar2;
                this = cycVar;
                cmiVar = cmiVar2;
            }
            cfxVarAa = bzi.n(bywVar);
            cjuVar = cjuVar2;
            this = cycVar;
            cmiVar = cmiVar2;
        }
    }

    public final void aj(cyb cybVar, long j, cwo cwoVar, int i, boolean z) {
        float fX;
        cyc cycVar;
        long j2;
        boolean z2;
        float f2;
        boolean z3;
        int i2 = i;
        cfx cfxVarAa = aa(cybVar.a());
        if (!az(j)) {
            if (i2 == 1) {
                float fX2 = X(j, Z());
                if ((Float.floatToRawIntBits(fX2) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || !cwoVar.e(fX2, false)) {
                    return;
                }
                aE(cfxVarAa, cybVar, j, cwoVar, 1, false, fX2);
                return;
            }
            return;
        }
        if (cfxVarAa == null) {
            E(cybVar, j, cwoVar, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        if (fIntBitsToFloat >= BitmapDescriptorFactory.HUE_RED && fIntBitsToFloat2 >= BitmapDescriptorFactory.HUE_RED && fIntBitsToFloat < x() && fIntBitsToFloat2 < eC()) {
            aD(cfxVarAa, cybVar, j, cwoVar, i2, z);
            return;
        }
        if (i2 == 1) {
            fX = X(j, Z());
            i2 = 1;
        } else {
            fX = Float.POSITIVE_INFINITY;
        }
        if ((Float.floatToRawIntBits(fX) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040) {
            z2 = z;
            if (cwoVar.e(fX, z2)) {
                cycVar = this;
                j2 = j;
                f2 = fX;
                z3 = true;
                cycVar.ar(cfxVarAa, cybVar, j2, cwoVar, i2, z2, f2, z3);
            }
            cycVar = this;
            j2 = j;
        } else {
            cycVar = this;
            j2 = j;
            z2 = z;
        }
        f2 = fX;
        z3 = false;
        cycVar.ar(cfxVarAa, cybVar, j2, cwoVar, i2, z2, f2, z3);
    }

    public final void ak() {
        cyk cykVar = this.I;
        if (cykVar != null) {
            cykVar.invalidate();
            return;
        }
        cyc cycVar = this.x;
        if (cycVar != null) {
            cycVar.ak();
        }
    }

    public final void al() {
        this.t.w.f();
    }

    public final void am() {
        cyk cykVar = this.I;
        if (cykVar != null) {
            cykVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [cfx] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [cfx] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [byw] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [byw] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void an() {
        if (aJ(128)) {
            cec cecVar = (cec) cek.i.j();
            afec afecVarI = cecVar != null ? cecVar.i() : null;
            cec cecVarI = byx.i(cecVar);
            try {
                int i = cyd.a;
                cfx cfxVarB = B();
                for (cfx cfxVarAb = ab(true); cfxVarAb != null; cfxVarAb = cfxVarAb.u) {
                    if ((cfxVarAb.s & 128) == 0) {
                        break;
                    }
                    if ((cfxVarAb.r & 128) != 0) {
                        ?? bywVar = 0;
                        cwe cweVarN = cfxVarAb;
                        while (cweVarN != 0) {
                            if (cweVarN instanceof cxs) {
                                ((cxs) cweVarN).et(this.c);
                            } else if ((cweVarN.r & 128) != 0 && (cweVarN instanceof cwe)) {
                                cfx cfxVar = cweVarN.C;
                                int i2 = 0;
                                cweVarN = cweVarN;
                                bywVar = bywVar;
                                while (cfxVar != null) {
                                    if ((cfxVar.r & 128) != 0) {
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
                    if (cfxVarAb == cfxVarB) {
                        break;
                    }
                }
            } finally {
                byx.l(cecVar, cecVarI, afecVarI);
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
    public final void ao() {
        int i = cyd.a;
        cfx cfxVarB = B();
        for (cfx cfxVarAb = ab(true); cfxVarAb != null && (cfxVarAb.s & 4194304) != 0; cfxVarAb = cfxVarAb.u) {
            if ((cfxVarAb.r & 4194304) != 0) {
                cwe cweVarN = cfxVarAb;
                ?? bywVar = 0;
                while (cweVarN != 0) {
                    if (cweVarN instanceof cws) {
                        ((cws) cweVarN).f(this);
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
            if (cfxVarAb == cfxVarB) {
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
    /* JADX WARN: Type inference failed for: r4v1, types: [cfx] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [cfx] */
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
    /* JADX WARN: Type inference failed for: r5v3, types: [byw] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [byw] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void aq() {
        if (aJ(1048576)) {
            int i = cyd.a;
            cfx cfxVar = B().t;
            if (cfxVar == null) {
                return;
            }
            for (cfx cfxVarAb = ab(false); cfxVarAb != null && (cfxVarAb.s & 1048576) != 0; cfxVarAb = cfxVarAb.u) {
                if ((cfxVarAb.r & 1048576) != 0) {
                    cwe cweVarN = cfxVarAb;
                    ?? bywVar = 0;
                    while (cweVarN != 0) {
                        if (cweVarN instanceof czb) {
                            ((czb) cweVarN).en();
                        } else if ((cweVarN.r & 1048576) != 0 && (cweVarN instanceof cwe)) {
                            cfx cfxVar2 = cweVarN.C;
                            int i2 = 0;
                            cweVarN = cweVarN;
                            bywVar = bywVar;
                            while (cfxVar2 != null) {
                                if ((cfxVar2.r & 1048576) != 0) {
                                    i2++;
                                    bywVar = bywVar;
                                    if (i2 == 1) {
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
                            if (i2 != 1) {
                            }
                        }
                        cweVarN = bzi.n(bywVar);
                    }
                }
                if (cfxVarAb == cfxVar) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018f A[PHI: r4
  0x018f: PHI (r4v16 byw) = (r4v1 byw), (r4v1 byw), (r4v18 byw) binds: [B:49:0x015f, B:51:0x0163, B:65:0x018d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [cfx] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ar(final defpackage.cfx r16, defpackage.cyb r17, final long r18, final defpackage.cwo r20, int r21, final boolean r22, final float r23, final boolean r24) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyc.ar(cfx, cyb, long, cwo, int, boolean, float, boolean):void");
    }

    public final void as(long j, float f2, afec afecVar, cmi cmiVar) {
        if (cmiVar != null) {
            if (afecVar != null) {
                crt.b("both ways to create layers shouldn't be used together");
            }
            if (this.U != cmiVar) {
                this.U = null;
                aw(null, false);
                this.U = cmiVar;
            }
            if (this.I == null) {
                cxb cxbVar = this.t;
                cym cymVarA = cxe.a(cxbVar);
                afeg afegVarG = G();
                afdr afdrVar = this.T;
                cyk cykVarO = cymVarA.o(afegVarG, afdrVar, cmiVar);
                cykVarO.g(this.c);
                cykVarO.f(j);
                this.I = cykVarO;
                cxbVar.at();
                afdrVar.invoke();
            }
        } else {
            if (this.U != null) {
                this.U = null;
                aw(null, false);
            }
            aw(afecVar, false);
        }
        if (this.y != j) {
            cxb cxbVar2 = this.t;
            cxe.a(cxbVar2).E(-4.0f);
            this.y = j;
            cyk cykVar = this.I;
            if (cykVar != null) {
                cykVar.f(j);
            } else {
                cyc cycVar = this.x;
                if (cycVar != null) {
                    cycVar.ak();
                }
            }
            cxbVar2.P(this);
            W(this);
            cym cymVar = cxbVar2.k;
            if (cymVar != null) {
                cymVar.y(cxbVar2);
            }
        }
        this.z = f2;
        cxb cxbVar3 = this.t;
        if (this == cxbVar3.q()) {
            ((czq) cxe.a(cxbVar3)).p.e(cxbVar3);
        }
        if (this.m) {
            return;
        }
        R(K());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void at(defpackage.ciz r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyc.at(ciz, boolean, boolean):void");
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
    /* JADX WARN: Type inference failed for: r6v3, types: [cfx] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [cfx] */
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
    /* JADX WARN: Type inference failed for: r7v3, types: [byw] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [byw] */
    public final void av(ctq ctqVar) {
        cyc cycVar;
        ctq ctqVar2 = this.P;
        if (ctqVar != ctqVar2) {
            this.P = ctqVar;
            if (ctqVar2 == null || ctqVar.c() != ctqVar2.c() || ctqVar.b() != ctqVar2.b()) {
                long jC = ctqVar.c();
                long jB = ctqVar.b();
                cyk cykVar = this.I;
                long j = (jC << 32) | (jB & 4294967295L);
                if (cykVar != null) {
                    cykVar.g(j);
                } else if (this.t.an() && (cycVar = this.x) != null) {
                    cycVar.ak();
                }
                z(j);
                if (this.L != null) {
                    ax(false);
                }
                int i = cyd.a;
                cfx cfxVar = B().t;
                if (cfxVar != null) {
                    for (cfx cfxVarAb = ab(false); cfxVarAb != null && (cfxVarAb.s & 4) != 0; cfxVarAb = cfxVarAb.u) {
                        if ((cfxVarAb.r & 4) != 0) {
                            cwe cweVarN = cfxVarAb;
                            ?? bywVar = 0;
                            while (cweVarN != 0) {
                                if (cweVarN instanceof cwk) {
                                    ((cwk) cweVarN).a();
                                } else if ((cweVarN.r & 4) != 0 && (cweVarN instanceof cwe)) {
                                    cfx cfxVar2 = cweVarN.C;
                                    int i2 = 0;
                                    cweVarN = cweVarN;
                                    bywVar = bywVar;
                                    while (cfxVar2 != null) {
                                        if ((cfxVar2.r & 4) != 0) {
                                            i2++;
                                            bywVar = bywVar;
                                            if (i2 == 1) {
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
                                    if (i2 != 1) {
                                    }
                                }
                                cweVarN = bzi.n(bywVar);
                            }
                        }
                        if (cfxVarAb == cfxVar) {
                            break;
                        }
                    }
                }
                cxb cxbVar = this.t;
                cym cymVar = cxbVar.k;
                if (cymVar != null) {
                    cymVar.y(cxbVar);
                }
                cxbVar.P(this);
            }
            aae aaeVar = this.V;
            if ((aaeVar == null || !aaeVar.c()) && ctqVar.f().isEmpty()) {
                return;
            }
            aae aaeVar2 = this.V;
            Map mapF = ctqVar.f();
            if (aaeVar2 != null && aaeVar2.e == mapF.size()) {
                Object[] objArr = aaeVar2.b;
                int[] iArr = aaeVar2.c;
                long[] jArr = aaeVar2.a;
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
                            if (i5 < i6) {
                                if ((255 & j2) < 128) {
                                    int i7 = (i3 << 3) + i5;
                                    Object obj = objArr[i7];
                                    int i8 = iArr[i7];
                                    Integer num = (Integer) mapF.get((crw) obj);
                                    if (num == null || num.intValue() != i8) {
                                        break loop0;
                                    }
                                }
                                j2 >>= 8;
                                i5++;
                            } else if (i6 != 8) {
                                return;
                            }
                        }
                    }
                    if (i3 == length) {
                        return;
                    } else {
                        i3++;
                    }
                }
            }
            ((cxq) ae()).w.e();
            aae aaeVar3 = this.V;
            if (aaeVar3 == null) {
                aae aaeVar4 = aaf.a;
                aaeVar3 = new aae(6);
                this.V = aaeVar3;
            }
            aaeVar3.e();
            for (Map.Entry entry : ctqVar.f().entrySet()) {
                aaeVar3.g(entry.getKey(), ((Number) entry.getValue()).intValue());
            }
        }
    }

    public final void aw(afec afecVar, boolean z) {
        cym cymVar;
        if (afecVar != null && this.U != null) {
            crt.b("layerBlock can't be provided when explicitLayer is provided");
        }
        cxb cxbVar = this.t;
        boolean z2 = (!z && this.L == afecVar && affa.f(this.M, cxbVar.r) && this.N == cxbVar.s) ? false : true;
        this.M = cxbVar.r;
        this.N = cxbVar.s;
        if (!cxbVar.am() || afecVar == null) {
            this.L = null;
            cyk cykVar = this.I;
            if (cykVar != null) {
                if (!czz.X(cykVar.m())) {
                    cxbVar.P(this);
                }
                cykVar.b();
                this.I = null;
                cxbVar.at();
                this.T.invoke();
                if (t() && cxbVar.an() && (cymVar = cxbVar.k) != null) {
                    cymVar.y(cxbVar);
                }
            }
            this.H = false;
            return;
        }
        this.L = afecVar;
        if (this.I != null) {
            if (z2) {
                ax(true);
                return;
            }
            return;
        }
        cym cymVarA = cxe.a(cxbVar);
        afeg afegVarG = G();
        afdr afdrVar = this.T;
        cyk cykVarO = cymVarA.o(afegVarG, afdrVar, null);
        cykVarO.g(this.c);
        cykVarO.f(this.y);
        this.I = cykVarO;
        ax(true);
        cxbVar.at();
        afdrVar.invoke();
    }

    public final void ax(boolean z) {
        if (this.U != null) {
            return;
        }
        cyk cykVar = this.I;
        afec afecVar = this.L;
        if (cykVar == null) {
            if (afecVar != null) {
                crt.c("null layer with a non-null layerBlock");
                return;
            }
            return;
        }
        if (afecVar == null) {
            crt.a("updateLayerParameters requires a non-null layerBlock");
            throw new aezp();
        }
        cks cksVar = q;
        cksVar.n();
        cxb cxbVar = this.t;
        cksVar.t = cxbVar.r;
        cksVar.u = cxbVar.s;
        cksVar.r = dln.k(this.c);
        affq affqVar = new affq();
        cyp cypVarAg = ag();
        ((ces) cypVarAg.a).b(this, f, new axf(afecVar, this, affqVar, 5));
        cwr cwrVar = this.R;
        if (cwrVar == null) {
            cwrVar = new cwr();
            this.R = cwrVar;
        }
        cwr cwrVar2 = g;
        cwrVar2.a = cwrVar.a;
        cwrVar2.b = cwrVar.b;
        cwrVar2.c = cwrVar.c;
        cwrVar2.d = cwrVar.d;
        cwrVar2.e = cwrVar.e;
        cwrVar2.f = cwrVar.f;
        cwrVar2.g = cwrVar.g;
        cwrVar2.h = cwrVar.h;
        cwrVar2.i = cwrVar.i;
        cwrVar.a = cksVar.b;
        cwrVar.b = cksVar.c;
        cwrVar.c = cksVar.e;
        cwrVar.d = cksVar.f;
        cwrVar.e = cksVar.j;
        cwrVar.f = cksVar.k;
        cwrVar.g = cksVar.l;
        cwrVar.h = cksVar.m;
        cwrVar.i = cksVar.n;
        cykVar.k(cksVar);
        boolean z2 = this.K;
        boolean z3 = cksVar.p;
        this.K = z3;
        this.O = cksVar.d;
        boolean z4 = false;
        if (cwrVar2.a == cwrVar.a && cwrVar2.b == cwrVar.b && cwrVar2.c == cwrVar.c && cwrVar2.d == cwrVar.d && cwrVar2.e == cwrVar.e && cwrVar2.f == cwrVar.f && cwrVar2.g == cwrVar.g && cwrVar2.h == cwrVar.h && cwrVar2.i == cwrVar.i) {
            z4 = true;
        }
        if (z) {
            if (z4 && z2 == z3 && !affqVar.a) {
                return;
            }
            cym cymVar = cxbVar.k;
            if (cymVar != null) {
                cymVar.y(cxbVar);
            }
        }
        if (z4) {
            return;
        }
        cxbVar.P(this);
        if (cxbVar.C > 0) {
            cxe.a(cxbVar).D(cxbVar);
        }
    }

    public final boolean ay() {
        cmi cmiVar = this.U;
        if ((cmiVar != null ? cmiVar.a() : this.I != null ? this.O : 1.0f) <= BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        cyc cycVar = this.x;
        if (cycVar != null) {
            return cycVar.ay();
        }
        return false;
    }

    protected final boolean az(long j) {
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        cyk cykVar = this.I;
        return cykVar == null || !this.K || cykVar.l(j);
    }

    @Override // defpackage.dlm
    public final float b() {
        return this.t.r.b();
    }

    @Override // defpackage.cst
    public final void eD(cst cstVar, float[] fArr) {
        cyc cycVarAL = aL(cstVar);
        cycVarAL.al();
        cyc cycVarAf = af(cycVarAL);
        cki.c(fArr);
        cycVarAL.aH(cycVarAf, fArr);
        aG(cycVarAf, fArr);
    }

    @Override // defpackage.cuo
    public void ev(long j, float f2, afec afecVar) {
        if (!this.u) {
            as(j, f2, afecVar, null);
            return;
        }
        cxl cxlVarC = C();
        cxlVarC.getClass();
        as(cxlVarC.h, f2, afecVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [cfx] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [cfx] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [byw] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [byw] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.cuo, defpackage.csp
    public final Object g() {
        cxb cxbVar = this.t;
        cxx cxxVar = cxbVar.v;
        if (!cxxVar.i(64)) {
            return null;
        }
        B();
        affv affvVar = new affv();
        for (cfx cfxVar = cxxVar.e; cfxVar != null; cfxVar = cfxVar.t) {
            if ((cfxVar.r & 64) != 0) {
                cwe cweVarN = cfxVar;
                ?? bywVar = 0;
                while (cweVarN != 0) {
                    if (cweVarN instanceof cyq) {
                        dlg dlgVar = cxbVar.r;
                        affvVar.a = ((cyq) cweVarN).ek(affvVar.a);
                    } else if ((cweVarN.r & 64) != 0 && (cweVarN instanceof cwe)) {
                        cfx cfxVar2 = cweVarN.C;
                        int i = 0;
                        cweVarN = cweVarN;
                        bywVar = bywVar;
                        while (cfxVar2 != null) {
                            if ((cfxVar2.r & 64) != 0) {
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
        }
        return affvVar.a;
    }

    @Override // defpackage.cst
    public final long h() {
        return this.c;
    }

    @Override // defpackage.cst
    public final long i(cst cstVar, long j) {
        return u(cstVar, j);
    }

    @Override // defpackage.cst
    public final long j(long j) {
        if (!t()) {
            crt.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        al();
        while (this != null) {
            cxb cxbVar = this.t;
            if (this == cxbVar.q() && !cxbVar.d) {
                long jB = ((czq) cxe.a(cxbVar)).p.b(cxbVar);
                if (jB != 9223372034707292159L) {
                    return dlf.r(j, jB);
                }
            }
            j = this.aC(j);
            this = this.x;
        }
        return j;
    }

    @Override // defpackage.cst
    public final long k(long j) {
        if (!t()) {
            crt.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return cxe.a(this.t).l(j(j));
    }

    @Override // defpackage.cst
    public final long l(long j) {
        cxb cxbVar = this.t;
        long j2 = j(j);
        czq czqVar = (czq) cxe.a(cxbVar);
        czqVar.T();
        return cki.a(czqVar.A, j2);
    }

    @Override // defpackage.cst
    public final long m(long j) {
        if (!t()) {
            crt.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return u(crt.j(this), cxe.a(this.t).m(j));
    }

    @Override // defpackage.cst
    public final long n(long j) {
        if (!t()) {
            crt.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        cst cstVarJ = crt.j(this);
        czq czqVar = (czq) cxe.a(this.t);
        czqVar.T();
        return u(cstVarJ, aclh.y(cki.a(czqVar.B, j), cstVarJ.j(0L)));
    }

    @Override // defpackage.cst
    public final cjb o(cst cstVar, boolean z) {
        if (!t()) {
            crt.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!cstVar.t()) {
            crt.c(a.bm(cstVar, "LayoutCoordinates ", " is not attached!"));
        }
        cyc cycVarAL = aL(cstVar);
        cycVarAL.al();
        cyc cycVarAf = af(cycVarAL);
        ciz cizVarAc = ac();
        cizVarAc.a = BitmapDescriptorFactory.HUE_RED;
        cizVarAc.b = BitmapDescriptorFactory.HUE_RED;
        cizVarAc.c = (int) (cstVar.h() >> 32);
        cizVarAc.d = (int) (cstVar.h() & 4294967295L);
        while (cycVarAL != cycVarAf) {
            cycVarAL.at(cizVarAc, z, false);
            if (cizVarAc.c()) {
                return cjb.a;
            }
            cycVarAL = cycVarAL.x;
            cycVarAL.getClass();
        }
        H(cycVarAf, cizVarAc, z);
        return byx.F(cizVarAc);
    }

    @Override // defpackage.csq
    public final dlr p() {
        return this.t.s;
    }

    @Override // defpackage.cst
    public final cst q() {
        if (!t()) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (cxb cxbVarL = this.t; cxbVarL != null; cxbVarL = cxbVarL.l()) {
                sb.append("\n|");
                sb.append(cxbVarL);
                sb.append(" isAttached=");
                sb.append(cxbVarL.am());
                sb.append(" modifier=");
                sb.append(cxbVarL.y);
                sb.append(" tail=");
                sb.append(B());
            }
            crt.c(sb.toString());
        }
        al();
        return this.t.q().x;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cqg, cym] */
    @Override // defpackage.cst
    public final void s(float[] fArr) {
        ?? A = cxe.a(this.t);
        aH(aL(crt.j(this)), fArr);
        A.k(fArr);
    }

    @Override // defpackage.cst
    public final boolean t() {
        return B().A;
    }

    @Override // defpackage.cst
    public final long u(cst cstVar, long j) {
        if (cstVar instanceof ctn) {
            ctn ctnVar = (ctn) cstVar;
            ctnVar.a().al();
            return ctnVar.u(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        cyc cycVarAL = aL(cstVar);
        cycVarAL.al();
        cyc cycVarAf = af(cycVarAL);
        while (cycVarAL != cycVarAf) {
            j = cycVarAL.aC(j);
            cycVarAL = cycVarAL.x;
            cycVarAL.getClass();
        }
        return aK(cycVarAf, j);
    }

    @Override // defpackage.cxk, defpackage.cyn
    public final boolean w() {
        return (this.I == null || this.J || !this.t.am()) ? false : true;
    }

    @Override // defpackage.cuo
    public void y(long j, float f2, cmi cmiVar) {
        if (!this.u) {
            as(j, f2, null, cmiVar);
            return;
        }
        cxl cxlVarC = C();
        cxlVarC.getClass();
        as(cxlVarC.h, f2, null, cmiVar);
    }

    @Override // defpackage.cxk
    public final cst J() {
        return this;
    }
}
