package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class bvv extends bwc {
    public kgx A;
    private final Set B;
    private bvz D;
    private int E;
    private int F;
    private int G;
    private boolean H;
    private boolean J;
    private int K;
    private final ArrayList L;
    private bzb M;
    private bzm N;
    private final cff O;
    private cfd P;
    private zc R;
    private final ceq S;
    public final buj a;
    public final bvb b;
    public final bzg c;
    public final bvd d;
    public int[] e;
    public boolean f;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public boolean l;
    public bzf m;
    public bzg n;
    public bzj o;
    public boolean p;
    public final bzl q;
    public bxw r;
    public final afco s;
    public boolean t;
    public long u;
    public ccx v;
    public zh w;
    public final kgx y;
    public final kgx z;
    private final ArrayList C = new ArrayList();
    private final vtn T = new vtn((char[]) null);
    public final List g = new ArrayList();
    private final vtn U = new vtn((char[]) null);
    private ccx Q = ccx.d;
    public final vtn x = new vtn((char[]) null);
    private int I = -1;

    public bvv(buj bujVar, bvb bvbVar, bzg bzgVar, Set set, kgx kgxVar, kgx kgxVar2, bvd bvdVar) {
        this.a = bujVar;
        this.b = bvbVar;
        this.c = bzgVar;
        this.B = set;
        this.y = kgxVar;
        this.z = kgxVar2;
        this.d = bvdVar;
        this.k = bvbVar.n() || bvbVar.l();
        this.S = new ceq(this, 1);
        this.L = new ArrayList();
        bzf bzfVarE = bzgVar.e();
        bzfVarE.r();
        this.m = bzfVarE;
        bzg bzgVar2 = new bzg();
        if (bvbVar.n()) {
            bzgVar2.b();
        }
        if (bvbVar.l()) {
            bzgVar2.a();
        }
        this.n = bzgVar2;
        bzj bzjVarF = bzgVar2.f();
        bzjVarF.w(true);
        this.o = bzjVarF;
        this.q = new bzl(this, kgxVar);
        bzf bzfVarE2 = this.n.e();
        try {
            bzb bzbVarG = bzfVarE2.g(0);
            bzfVarE2.r();
            this.M = bzbVarG;
            this.N = new bzm();
            this.O = new cff(this);
            afco afcoVarD = bvbVar.d();
            afco afcoVarQ = Q();
            this.s = afcoVarD.plus(afcoVarQ == null ? afcp.a : afcoVarQ);
        } catch (Throwable th) {
            bzfVarE2.r();
            throw th;
        }
    }

    private final void aA(int i) {
        boolean zB = this.m.B(i);
        if (zB) {
            bzl bzlVar = this.q;
            bzlVar.h();
            bzlVar.c(this.m.o(i));
        }
        aq(this, i, i, zB, 0);
        bzl bzlVar2 = this.q;
        bzlVar2.h();
        if (zB) {
            bzlVar2.e();
        }
    }

    private static final void aB(bvv bvvVar, List list, int i) {
        int iC = bvvVar.m.c(i) + i;
        int iC2 = i + 1;
        while (iC2 < iC) {
            if (bvvVar.m.y(iC2)) {
                bwl bwlVarAr = ar(bvvVar, iC2);
                if (bwlVarAr != null) {
                    list.add(bwlVarAr);
                }
            } else if (bvvVar.m.w(iC2)) {
                aB(bvvVar, list, iC2);
            }
            iC2 += bvvVar.m.c(iC2);
        }
    }

    private final void aC() {
        bzf bzfVar = this.m;
        int i = bzfVar.h;
        this.F = i >= 0 ? bzfVar.b[(i * 5) + 1] & 67108863 : 0;
        bzfVar.u();
    }

    private final void aD(boolean z, Object obj) {
        if (z) {
            bzf bzfVar = this.m;
            if (bzfVar.i <= 0) {
                if ((bzfVar.b[(bzfVar.f * 5) + 1] & 1073741824) == 0) {
                    bxc.a("Expected a node group");
                }
                bzfVar.v();
                return;
            }
            return;
        }
        if (obj != null && this.m.h() != obj) {
            bzl bzlVar = this.q;
            bzlVar.i(false);
            cbc cbcVar = (cbc) bzlVar.k.a;
            cbcVar.b(cas.a);
            cbb.a(cbcVar, 0, obj);
        }
        this.m.v();
    }

    private final void aE(int i, int i2) {
        int iO = O(i);
        if (iO != i2) {
            ArrayList arrayList = this.C;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iO2 = O(i) + (i2 - iO);
                ae(i, iO2);
                int i3 = size;
                while (true) {
                    if (i3 < 0) {
                        break;
                    }
                    int i4 = i3 - 1;
                    bvz bvzVar = (bvz) arrayList.get(i3);
                    if (bvzVar != null && bvzVar.d(i, iO2)) {
                        size = i4;
                        break;
                    }
                    i3 = i4;
                }
                bzf bzfVar = this.m;
                if (i < 0) {
                    i = bzfVar.h;
                } else if (bzfVar.B(i)) {
                    return;
                } else {
                    i = this.m.e(i);
                }
            }
        }
    }

    private final void aF(Object obj) {
        R();
        af(obj);
    }

    private final void aG() {
        if (!this.H) {
            buz.b("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.H = false;
    }

    private final void aH() {
        if (this.H) {
            buz.b("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final ccx aI(int i) {
        ccx ccxVar;
        if (this.t && this.p) {
            int iK = this.o.q;
            while (iK > 0) {
                if (this.o.h(iK) == 202 && affa.f(this.o.r(iK), buz.d)) {
                    Object objQ = this.o.q(iK);
                    objQ.getClass();
                    ccx ccxVar2 = (ccx) objQ;
                    this.v = ccxVar2;
                    return ccxVar2;
                }
                iK = this.o.k(iK);
            }
        }
        if (this.m.c > 0) {
            while (i > 0) {
                if (this.m.b(i) == 202 && affa.f(this.m.m(i), buz.d)) {
                    zh zhVar = this.w;
                    if (zhVar == null || (ccxVar = (ccx) zhVar.a(i)) == null) {
                        Object objJ = this.m.j(i);
                        objJ.getClass();
                        ccxVar = (ccx) objJ;
                    }
                    this.v = ccxVar;
                    return ccxVar;
                }
                i = this.m.e(i);
            }
        }
        ccx ccxVar3 = this.Q;
        this.v = ccxVar3;
        return ccxVar3;
    }

    private final int ap(int i) {
        int iE = this.m.e(i) + 1;
        int i2 = 0;
        while (iE < i) {
            if (!this.m.z(iE)) {
                i2++;
            }
            iE += this.m.c(iE);
        }
        return i2;
    }

    private static final int aq(bvv bvvVar, int i, int i2, boolean z, int i3) {
        long[] jArr;
        Object[] objArr;
        int i4;
        long[] jArr2;
        Object[] objArr2;
        char c;
        int i5;
        bzf bzfVar = bvvVar.m;
        int i6 = 0;
        if (!bzfVar.y(i2)) {
            if (!bzfVar.w(i2)) {
                if (bzfVar.B(i2)) {
                    return 1;
                }
                return bzfVar.d(i2);
            }
            int iC = bzfVar.c(i2) + i2;
            int iAq = 0;
            for (int iC2 = i2 + 1; iC2 < iC; iC2 += bzfVar.c(iC2)) {
                boolean zB = bzfVar.B(iC2);
                if (zB) {
                    bzl bzlVar = bvvVar.q;
                    bzlVar.h();
                    bzlVar.c(bzfVar.o(iC2));
                }
                iAq += aq(bvvVar, i, iC2, zB || z, zB ? 0 : i3 + iAq);
                if (zB) {
                    bzl bzlVar2 = bvvVar.q;
                    bzlVar2.h();
                    bzlVar2.e();
                }
            }
            if (bzfVar.B(i2)) {
                return 1;
            }
            return iAq;
        }
        int iB = bzfVar.b(i2);
        Object objM = bzfVar.m(i2);
        if (iB == 126665345) {
            if (objM instanceof bwk) {
                bwl bwlVarAr = ar(bvvVar, i2);
                if (bwlVarAr != null) {
                    bvb bvbVar = bvvVar.b;
                    bvbVar.e(bwlVarAr);
                    bzl bzlVar3 = bvvVar.q;
                    bzlVar3.j();
                    bvd bvdVar = bvvVar.d;
                    cbc cbcVar = (cbc) bzlVar3.k.a;
                    cbcVar.b(cah.a);
                    cbb.c(cbcVar, bvdVar, bvbVar, bwlVarAr);
                }
                if (!z || i2 == i) {
                    return bzfVar.d(i2);
                }
                bzl bzlVar4 = bvvVar.q;
                bzlVar4.h();
                bzlVar4.f();
                int iD = bzlVar4.a().B(i2) ? 1 : bzlVar4.a().d(i2);
                if (iD <= 0) {
                    return 0;
                }
                bzlVar4.k(i3, iD);
                return 0;
            }
        } else if (iB == 206 && affa.f(objM, buz.f)) {
            Object objL = bzfVar.l(i2, 0);
            bxr bxrVar = objL instanceof bxr ? (bxr) objL : null;
            bxq bxqVarA = bxrVar != null ? bxrVar.a() : null;
            bvt bvtVar = bxqVarA instanceof bvt ? (bvt) bxqVarA : null;
            if (bvtVar != null) {
                aap aapVar = bvtVar.a.c;
                Object[] objArr3 = aapVar.b;
                long[] jArr3 = aapVar.a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j = jArr3[i7];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = (~(i7 - length)) >>> 31;
                            int i9 = i6;
                            while (true) {
                                int i10 = 8 - i8;
                                if (i9 >= i10) {
                                    jArr = jArr3;
                                    objArr = objArr3;
                                    i4 = i6;
                                    if (i10 != 8) {
                                        break;
                                    }
                                } else {
                                    if ((255 & j) < 128) {
                                        bvv bvvVar2 = (bvv) objArr3[(i7 << 3) + i9];
                                        bzg bzgVar = bvvVar2.c;
                                        c = '\b';
                                        if (bzgVar.b <= 0 || (bzgVar.a[1] & 67108864) == 0) {
                                            jArr2 = jArr3;
                                            objArr2 = objArr3;
                                            i5 = i6;
                                        } else {
                                            bvd bvdVar2 = bvvVar2.d;
                                            synchronized (bvdVar2.c) {
                                                jArr2 = jArr3;
                                                Object andSet = bvdVar2.b.getAndSet(afbg.a);
                                                if (!affa.f(andSet, bve.a) && andSet != null) {
                                                    if (andSet instanceof Set) {
                                                        bvdVar2.i((Set) andSet, false);
                                                    } else {
                                                        if (!(andSet instanceof Object[])) {
                                                            AtomicReference atomicReference = bvdVar2.b;
                                                            Objects.toString(atomicReference);
                                                            buz.a("corrupt pendingModifications drain: ".concat(atomicReference.toString()));
                                                            throw new aezp();
                                                        }
                                                        Set[] setArr = (Set[]) andSet;
                                                        int length2 = setArr.length;
                                                        int i11 = 0;
                                                        while (i11 < length2) {
                                                            int i12 = i11;
                                                            bvdVar2.i(setArr[i12], false);
                                                            i11 = i12 + 1;
                                                            objArr3 = objArr3;
                                                        }
                                                    }
                                                }
                                                objArr2 = objArr3;
                                                aan aanVarX = bvdVar2.x();
                                                try {
                                                    bvdVar2.k.al(aanVarX);
                                                } catch (Throwable th) {
                                                    bvdVar2.n = aanVarX;
                                                    throw th;
                                                }
                                            }
                                            kgx kgxVar = new kgx(null, null, null);
                                            bvvVar2.A = kgxVar;
                                            bzf bzfVarE = bzgVar.e();
                                            try {
                                                bvvVar2.m = bzfVarE;
                                                bzl bzlVar5 = bvvVar2.q;
                                                kgx kgxVar2 = bzlVar5.k;
                                                try {
                                                    bzlVar5.k = kgxVar;
                                                    i5 = 0;
                                                    bvvVar2.aA(0);
                                                    bzlVar5.f();
                                                    if (bzlVar5.a) {
                                                        bzlVar5.l();
                                                        bzlVar5.b();
                                                    }
                                                } finally {
                                                }
                                            } finally {
                                                bzfVarE.r();
                                            }
                                        }
                                        bvvVar.b.u(bvvVar2.d);
                                    } else {
                                        jArr2 = jArr3;
                                        objArr2 = objArr3;
                                        c = '\b';
                                        i5 = i6;
                                    }
                                    j >>= c;
                                    i9++;
                                    i6 = i5;
                                    jArr3 = jArr2;
                                    objArr3 = objArr2;
                                }
                            }
                        } else {
                            jArr = jArr3;
                            objArr = objArr3;
                            i4 = i6;
                        }
                        if (i7 == length) {
                            break;
                        }
                        i7++;
                        i6 = i4;
                        jArr3 = jArr;
                        objArr3 = objArr;
                    }
                }
            }
            return bzfVar.d(i2);
        }
        if (bzfVar.B(i2)) {
            return 1;
        }
        return bzfVar.d(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final defpackage.bwl ar(defpackage.bvv r13, int r14) {
        /*
            bzf r0 = r13.m
            int r0 = r0.b(r14)
            bzf r1 = r13.m
            java.lang.Object r1 = r1.m(r14)
            r2 = 126665345(0x78cc281, float:2.1179178E-34)
            r3 = 0
            if (r0 != r2) goto L88
            boolean r0 = r1 instanceof defpackage.bwk
            if (r0 == 0) goto L88
            bzf r0 = r13.m
            boolean r0 = r0.w(r14)
            if (r0 == 0) goto L2f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            aB(r13, r0, r14)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2d
            goto L2f
        L2d:
            r12 = r0
            goto L30
        L2f:
            r12 = r3
        L30:
            bzf r0 = r13.m
            java.lang.Object r0 = r0.m(r14)
            r0.getClass()
            r5 = r0
            bwk r5 = (defpackage.bwk) r5
            bzf r0 = r13.m
            r1 = 0
            java.lang.Object r6 = r0.l(r14, r1)
            bzf r0 = r13.m
            bzb r9 = r0.g(r14)
            bzf r0 = r13.m
            int r0 = r0.c(r14)
            int r0 = r0 + r14
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List r1 = r13.g
            int r2 = defpackage.bvw.b(r1, r14)
        L5b:
            int r3 = r1.size()
            if (r2 >= r3) goto L7a
            java.lang.Object r3 = r1.get(r2)
            bwd r3 = (defpackage.bwd) r3
            int r4 = r3.a
            if (r4 >= r0) goto L7a
            java.lang.Object r4 = r3.c
            java.lang.Object r3 = r3.b
            aezu r7 = new aezu
            r7.<init>(r4, r3)
            r10.add(r7)
            int r2 = r2 + 1
            goto L5b
        L7a:
            bvd r7 = r13.d
            bzg r8 = r13.c
            bwl r4 = new bwl
            ccx r11 = r13.aI(r14)
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        L88:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvv.ar(bvv, int):bwl");
    }

    private final void as(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        as(this.m.e(i), i2);
        if (this.m.B(i)) {
            this.q.c(this.m.o(i));
        }
    }

    private final void at() {
        if (this.o.r) {
            bzj bzjVarF = this.n.f();
            this.o = bzjVarF;
            bzjVarF.I();
            this.p = false;
            this.v = null;
        }
    }

    private final void au(boolean z, bvz bvzVar) {
        this.C.add(this.D);
        this.D = bvzVar;
        vtn vtnVar = this.T;
        vtnVar.e(this.F);
        vtnVar.e(this.G);
        vtnVar.e(this.E);
        if (z) {
            this.E = 0;
        }
        this.F = 0;
        this.G = 0;
    }

    private final void av(bxf bxfVar) {
        bxfVar.d = this.K;
        bxfVar.j(false);
    }

    private final void aw() {
        bzg bzgVar = new bzg();
        if (this.k) {
            bzgVar.b();
        }
        if (this.b.l()) {
            bzgVar.a();
        }
        this.n = bzgVar;
        bzj bzjVarF = bzgVar.f();
        bzjVarF.w(true);
        this.o = bzjVarF;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ax() {
        /*
            Method dump skipped, instructions count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvv.ax():void");
    }

    private final void ay() {
        aA(this.m.f);
        bzl bzlVar = this.q;
        bzlVar.g();
        ((cbc) bzlVar.k.a).b(cak.a);
        int i = bzlVar.c;
        bzf bzfVarA = bzlVar.a();
        bzlVar.c = i + bzfVarA.b[(bzfVarA.f * 5) + 3];
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void az(int r7, int r8, int r9) {
        /*
            r6 = this;
            bzf r0 = r6.m
            if (r7 != r8) goto L5
            goto L17
        L5:
            if (r7 == r9) goto L55
            if (r8 == r9) goto L55
            int r1 = r0.e(r7)
            if (r1 != r8) goto L11
            r9 = r8
            goto L55
        L11:
            int r1 = r0.e(r8)
            if (r1 != r7) goto L19
        L17:
            r9 = r7
            goto L55
        L19:
            int r1 = r0.e(r7)
            int r2 = r0.e(r8)
            if (r1 != r2) goto L28
            int r9 = r0.e(r7)
            goto L55
        L28:
            int r1 = defpackage.bvw.a(r0, r7, r9)
            int r9 = defpackage.bvw.a(r0, r8, r9)
            int r2 = r1 - r9
            r3 = 0
            r5 = r7
            r4 = r3
        L35:
            if (r4 >= r2) goto L3e
            int r5 = r0.e(r5)
            int r4 = r4 + 1
            goto L35
        L3e:
            int r9 = r9 - r1
            r1 = r8
        L40:
            if (r3 >= r9) goto L49
            int r1 = r0.e(r1)
            int r3 = r3 + 1
            goto L40
        L49:
            if (r5 == r1) goto L54
            int r5 = r0.e(r5)
            int r1 = r0.e(r1)
            goto L49
        L54:
            r9 = r5
        L55:
            if (r7 <= 0) goto L69
            if (r7 == r9) goto L69
            boolean r1 = r0.B(r7)
            if (r1 == 0) goto L64
            bzl r1 = r6.q
            r1.e()
        L64:
            int r7 = r0.e(r7)
            goto L55
        L69:
            r6.as(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvv.az(int, int, int):void");
    }

    @Override // defpackage.bwc, defpackage.bux
    public final boolean A(int i) {
        Object objR = R();
        if ((objR instanceof Integer) && i == ((Number) objR).intValue()) {
            return false;
        }
        af(Integer.valueOf(i));
        return true;
    }

    @Override // defpackage.bwc, defpackage.bux
    public final boolean B(long j) {
        Object objR = R();
        if ((objR instanceof Long) && j == ((Number) objR).longValue()) {
            return false;
        }
        af(Long.valueOf(j));
        return true;
    }

    @Override // defpackage.bux
    public final boolean C(Object obj) {
        if (affa.f(R(), obj)) {
            return false;
        }
        af(obj);
        return true;
    }

    @Override // defpackage.bwc, defpackage.bux
    public final boolean D(boolean z) {
        Object objR = R();
        if ((objR instanceof Boolean) && z == ((Boolean) objR).booleanValue()) {
            return false;
        }
        af(Boolean.valueOf(z));
        return true;
    }

    @Override // defpackage.bwc, defpackage.bux
    public final boolean E(Object obj) {
        if (R() == obj) {
            return false;
        }
        af(obj);
        return true;
    }

    @Override // defpackage.bux
    public final boolean F() {
        if (!H() || this.h) {
            return true;
        }
        bxf bxfVarP = P();
        return (bxfVarP == null || (bxfVarP.b & 4) == 0) ? false : true;
    }

    @Override // defpackage.bux
    public final boolean G() {
        return this.t;
    }

    @Override // defpackage.bux
    public final boolean H() {
        bxf bxfVarP;
        return (this.t || this.i || this.h || (bxfVarP = P()) == null || (bxfVarP.b & 8) != 0) ? false : true;
    }

    @Override // defpackage.bux
    public final boolean I(boolean z, int i) {
        bxf bxfVarP;
        if (i != 0 || (!this.t && !this.i)) {
            return z || !H();
        }
        bxw bxwVar = this.r;
        if (bxwVar == null || (bxfVarP = P()) == null || !bxwVar.a() || bxfVarP.k()) {
            return true;
        }
        bxfVarP.q();
        bxfVarP.i(this.i);
        bxfVarP.d(true);
        cbc cbcVar = (cbc) this.q.k.a;
        cbcVar.b(caj.a);
        cbb.a(cbcVar, 0, bxfVarP);
        this.b.i(bxfVarP);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c A[EDGE_INSN: B:58:0x007c->B:29:0x007c BREAK  A[LOOP:0: B:15:0x0036->B:28:0x0078], EDGE_INSN: B:59:0x007c->B:29:0x007c BREAK  A[LOOP:0: B:15:0x0036->B:28:0x0078]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    @Override // defpackage.bux
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bxf J() {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvv.J():bxf");
    }

    @Override // defpackage.bux
    public final void K() {
        ab(1219399079, null, 0, null);
    }

    @Override // defpackage.bux
    public final void L(Object obj) {
        if (!this.t && this.m.a() == 207 && !affa.f(this.m.h(), obj) && this.I < 0) {
            this.I = this.m.f;
            this.i = true;
        }
        ab(207, null, 0, obj);
    }

    @Override // defpackage.bux
    public final ccx N() {
        return ah();
    }

    public final int O(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.e;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.m.d(i) : i2;
        }
        zc zcVar = this.R;
        if (zcVar == null || zcVar.a(i) < 0) {
            return 0;
        }
        int iA = zcVar.a(i);
        if (iA < 0) {
            ca.ab(a.bp(i, "Cannot find value for key "));
        }
        return zcVar.c[iA];
    }

    @Override // defpackage.bwc
    public final bxf P() {
        if (this.j != 0) {
            return null;
        }
        ArrayList arrayList = this.L;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (bxf) arrayList.get(arrayList.size() - 1);
    }

    @Override // defpackage.bwc
    public final cff Q() {
        if (this.b.o()) {
            return this.O;
        }
        return null;
    }

    public final Object R() {
        if (this.t) {
            aH();
            return buw.a;
        }
        Object objN = this.m.n();
        return (!this.i || (objN instanceof bxu)) ? objN : buw.a;
    }

    public final Object S() {
        if (this.t) {
            aH();
            return buw.a;
        }
        Object objN = this.m.n();
        return (!this.i || (objN instanceof bxu)) ? objN instanceof bxr ? ((bxr) objN).a() : objN : buw.a;
    }

    @Override // defpackage.bwc
    public final List T() {
        bvb bvbVar = this.b;
        bva bvaVarC = bvbVar.c();
        if (true != (bvaVarC instanceof bvd)) {
            bvaVarC = null;
        }
        if (bvaVarC == null) {
            return afbe.a;
        }
        bvd bvdVar = (bvd) bvaVarC;
        bzf bzfVarE = ((bzg) bvdVar.e).e();
        try {
            Integer numB = vh.b(bzfVarE, bvbVar, 0, bzfVarE.c);
            if (numB == null) {
                return afbe.a;
            }
            bzfVarE = ((bzg) bvdVar.e).e();
            try {
                List listC = vh.c(bzfVarE, numB.intValue(), 0);
                bzfVarE.r();
                return woy.bY(listC, bvdVar.k.T());
            } finally {
            }
        } finally {
        }
    }

    public final void U() {
        if (this.J) {
            this.J = false;
            this.b.f();
        }
        V();
        this.C.clear();
        this.T.d();
        this.U.d();
        this.x.d();
        this.w = null;
        bzm bzmVar = this.N;
        bzmVar.b.a();
        bzmVar.a.a();
        this.u = 0L;
        this.j = 0;
        this.H = false;
        this.t = false;
        this.i = false;
        this.l = false;
        this.I = -1;
        bzf bzfVar = this.m;
        if (!bzfVar.e) {
            bzfVar.r();
        }
        if (this.o.r) {
            return;
        }
        aw();
    }

    public final void V() {
        this.D = null;
        this.E = 0;
        this.F = 0;
        this.u = 0L;
        this.H = false;
        bzl bzlVar = this.q;
        bzlVar.a = false;
        bzlVar.j.d();
        bzlVar.c = 0;
        bzlVar.b = true;
        bzlVar.d = 0;
        bzlVar.e.clear();
        bzlVar.f = -1;
        bzlVar.g = -1;
        bzlVar.h = -1;
        bzlVar.i = 0;
        this.L.clear();
        this.e = null;
        this.R = null;
    }

    public final void W() {
        if (!this.o.r) {
            buz.b("Check failed");
        }
        aw();
    }

    @Override // defpackage.bwc
    public final void X() {
        this.L.clear();
        this.g.clear();
        this.y.m();
        this.w = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f1  */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y(boolean r38) {
        /*
            Method dump skipped, instructions count: 1201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvv.Y(boolean):void");
    }

    @Override // defpackage.bwc
    public final void Z() {
        if (this.l || this.I != 0) {
            bxc.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.I = -1;
        this.i = false;
    }

    public final void aa() {
        this.F += this.m.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [int] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v36 */
    public final void ab(int i, Object obj, int i2, Object obj2) {
        int iHashCode;
        long j;
        int i3;
        int i4;
        bvz bvzVar;
        boolean z;
        int i5;
        boolean z2;
        long[] jArr;
        long[] jArr2;
        char c;
        char c2;
        int i6;
        int i7;
        long jRotateLeft;
        Object obj3 = obj;
        aH();
        int i8 = this.G;
        if (obj3 == null) {
            long j2 = i8;
            if (obj2 != null) {
                i3 = 207;
                i7 = i;
                if (i7 == 207) {
                    if (!affa.f(obj2, buw.a)) {
                        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.u, 3) ^ obj2.hashCode(), 3);
                    }
                    this.u = j2 ^ jRotateLeft;
                }
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.u, 3) ^ i3, 3);
                this.u = j2 ^ jRotateLeft;
            } else {
                i7 = i;
            }
            i3 = i7;
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.u, 3) ^ i3, 3);
            this.u = j2 ^ jRotateLeft;
        } else {
            if (obj3 instanceof Enum) {
                iHashCode = ((Enum) obj3).ordinal();
                j = this.u;
            } else {
                iHashCode = obj3.hashCode();
                j = this.u;
            }
            this.u = Long.rotateLeft(Long.rotateLeft(j, 3) ^ iHashCode, 3);
            i3 = i;
        }
        boolean z3 = true;
        if (obj3 == null) {
            this.G++;
        }
        boolean z4 = i2 != 0;
        int i9 = -1;
        if (this.t) {
            this.m.q();
            bzj bzjVar = this.o;
            int i10 = bzjVar.o;
            if (z4) {
                bzjVar.M(i3, buw.a);
            } else {
                if (obj2 != null) {
                    if (obj3 == null) {
                        obj3 = buw.a;
                    }
                    bzjVar.L(i3, obj3, false, obj2);
                } else {
                    if (obj3 == null) {
                        obj3 = buw.a;
                    }
                    bzjVar.K(i3, obj3);
                }
                z3 = false;
            }
            bvz bvzVar2 = this.D;
            if (bvzVar2 != null) {
                bzd bzdVar = new bzd(i3, -1, (-2) - i10, -1);
                bvzVar2.c(bzdVar, this.E - bvzVar2.b);
                bvzVar2.e(bzdVar);
            }
            au(z3, null);
            return;
        }
        boolean z5 = i2 == 1 && this.i;
        if (this.D == null) {
            int iA = this.m.a();
            if (!z5 && iA == i3 && affa.f(obj3, this.m.i())) {
                aD(z4, obj2);
                i4 = -1;
            } else {
                bzf bzfVar = this.m;
                ArrayList arrayList = new ArrayList();
                if (bzfVar.i <= 0) {
                    int i11 = bzfVar.f;
                    while (i11 < bzfVar.g) {
                        int i12 = i11 * 5;
                        int i13 = i9;
                        int[] iArr = bzfVar.b;
                        int i14 = iArr[i12];
                        Object objP = bzfVar.p(iArr, i11);
                        int i15 = iArr[i12 + 1];
                        arrayList.add(new bzd(i14, objP, i11, (i15 & 1073741824) != 0 ? 1 : i15 & 67108863));
                        i11 += iArr[i12 + 3];
                        i9 = i13;
                    }
                }
                i4 = i9;
                this.D = new bvz(arrayList, this.E);
            }
        } else {
            i4 = -1;
        }
        bvz bvzVar3 = this.D;
        if (bvzVar3 != null) {
            Object bweVar = obj3 != null ? new bwe(Integer.valueOf(i3), obj3) : Integer.valueOf(i3);
            aan aanVar = ((bys) bvzVar3.e.a()).a;
            Object objA = aanVar.a(bweVar);
            if (objA == null) {
                objA = null;
            } else if (objA instanceof aag) {
                aag aagVar = (aag) objA;
                Object objH = aagVar.h(0);
                if (aagVar.f()) {
                    aanVar.i(bweVar);
                }
                if (aagVar.b == 1) {
                    aanVar.m(bweVar, aagVar.b());
                }
                objA = objH;
            } else {
                aanVar.i(bweVar);
            }
            bzd bzdVar2 = (bzd) objA;
            if (z5 || bzdVar2 == null) {
                boolean z6 = z4;
                this.m.q();
                boolean z7 = true;
                this.t = true;
                this.v = null;
                at();
                this.o.v();
                bzj bzjVar2 = this.o;
                int i16 = bzjVar2.o;
                if (z6) {
                    bzjVar2.M(i3, buw.a);
                    z = false;
                } else {
                    if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = buw.a;
                        }
                        z = false;
                        bzjVar2.L(i3, obj3, false, obj2);
                    } else {
                        z = false;
                        if (obj3 == null) {
                            obj3 = buw.a;
                        }
                        bzjVar2.K(i3, obj3);
                    }
                    z7 = z;
                }
                this.M = this.o.o(i16);
                bzd bzdVar3 = new bzd(i3, Integer.valueOf(i4), (-2) - i16, i4);
                bvzVar3.c(bzdVar3, this.E - bvzVar3.b);
                bvzVar3.e(bzdVar3);
                bvzVar = new bvz(new ArrayList(), z7 ? z : this.E);
                z4 = z7;
            } else {
                bvzVar3.e(bzdVar2);
                this.E = bvzVar3.a(bzdVar2) + bvzVar3.b;
                zh zhVar = bvzVar3.f;
                int i17 = bzdVar2.c;
                squ squVar = (squ) zhVar.a(i17);
                int i18 = squVar != null ? squVar.c : i4;
                int i19 = bvzVar3.c;
                int i20 = i18 - i19;
                int i21 = 8;
                if (i18 > i19) {
                    Object[] objArr = zhVar.c;
                    long[] jArr3 = zhVar.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i22 = 0;
                        char c3 = 7;
                        while (true) {
                            long j3 = jArr3[i22];
                            i5 = i20;
                            z2 = z4;
                            if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i23 = 8 - ((~(i22 - length)) >>> 31);
                                int i24 = 0;
                                while (i24 < i23) {
                                    if ((j3 & 255) < 128) {
                                        c2 = c3;
                                        squ squVar2 = (squ) objArr[(i22 << 3) + i24];
                                        i6 = i21;
                                        int i25 = squVar2.c;
                                        if (i25 == i18) {
                                            squVar2.c = i19;
                                        } else if (i19 <= i25 && i25 < i18) {
                                            squVar2.c = i25 + 1;
                                        }
                                    } else {
                                        c2 = c3;
                                        i6 = i21;
                                    }
                                    j3 >>= i6;
                                    i24++;
                                    i21 = i6;
                                    c3 = c2;
                                }
                                c = c3;
                                if (i23 != i21) {
                                    break;
                                }
                            } else {
                                c = c3;
                            }
                            if (i22 == length) {
                                break;
                            }
                            i22++;
                            z4 = z2;
                            i20 = i5;
                            c3 = c;
                            i21 = 8;
                        }
                    } else {
                        i5 = i20;
                        z2 = z4;
                    }
                } else {
                    i5 = i20;
                    z2 = z4;
                    if (i19 > i18) {
                        Object[] objArr2 = zhVar.c;
                        long[] jArr4 = zhVar.a;
                        int length2 = jArr4.length - 2;
                        if (length2 >= 0) {
                            int i26 = 0;
                            while (true) {
                                long j4 = jArr4[i26];
                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i27 = 8 - ((~(i26 - length2)) >>> 31);
                                    int i28 = 0;
                                    while (i28 < i27) {
                                        if ((j4 & 255) >= 128) {
                                            jArr2 = jArr4;
                                        } else {
                                            squ squVar3 = (squ) objArr2[(i26 << 3) + i28];
                                            int i29 = squVar3.c;
                                            if (i29 == i18) {
                                                squVar3.c = i19;
                                                jArr2 = jArr4;
                                            } else {
                                                jArr2 = jArr4;
                                                if (i18 + 1 <= i29 && i29 < i19) {
                                                    squVar3.c = i29 - 1;
                                                }
                                            }
                                        }
                                        j4 >>= 8;
                                        i28++;
                                        jArr4 = jArr2;
                                    }
                                    jArr = jArr4;
                                    if (i27 != 8) {
                                        break;
                                    }
                                } else {
                                    jArr = jArr4;
                                }
                                if (i26 == length2) {
                                    break;
                                }
                                i26++;
                                jArr4 = jArr;
                            }
                        }
                    }
                }
                bzl bzlVar = this.q;
                bzlVar.d(i17);
                this.m.t(i17);
                if (i5 > 0) {
                    bzlVar.g();
                    cbc cbcVar = (cbc) bzlVar.k.a;
                    cbcVar.b(cae.a);
                    cbcVar.c[cbcVar.d - cbcVar.a[cbcVar.b - 1].b] = i5;
                }
                aD(z2, obj2);
                z4 = z2;
                bvzVar = null;
            }
        } else {
            bvzVar = null;
        }
        au(z4, bvzVar);
    }

    @Override // defpackage.bwc
    public final void ac() {
        this.I = 0;
        this.i = true;
    }

    public final void ad(Object obj) {
        if (obj instanceof bxq) {
            bwa bwaVar = new bwa((bxq) obj, this.G - 1);
            if (this.t) {
                cbc cbcVar = (cbc) this.q.k.a;
                cbcVar.b(cai.a);
                cbb.a(cbcVar, 0, bwaVar);
            }
            this.B.add(obj);
            obj = bwaVar;
        }
        af(obj);
    }

    public final void ae(int i, int i2) {
        if (O(i) != i2) {
            if (i < 0) {
                zc zcVar = this.R;
                if (zcVar == null) {
                    zcVar = new zc(6);
                    this.R = zcVar;
                }
                zcVar.c(i, i2);
                return;
            }
            int[] iArr = this.e;
            if (iArr == null) {
                int i3 = this.m.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.e = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final void af(Object obj) {
        if (this.t) {
            this.o.X(obj);
            return;
        }
        bzf bzfVar = this.m;
        if (!bzfVar.l) {
            bzl bzlVar = this.q;
            bzb bzbVarG = bzfVar.g(bzfVar.h);
            cbc cbcVar = (cbc) bzlVar.k.a;
            cbcVar.b(bzo.a);
            cbb.b(cbcVar, 0, bzbVarG, 1, obj);
            return;
        }
        int iD = bzfVar.j - bzi.d(bzfVar.b, bzfVar.h);
        bzl bzlVar2 = this.q;
        int i = iD - 1;
        if (bzlVar2.a().h - bzlVar2.c >= 0) {
            bzlVar2.i(true);
            cbc cbcVar2 = (cbc) bzlVar2.k.a;
            cbcVar2.b(cau.a);
            cbb.a(cbcVar2, 0, obj);
            cbcVar2.c[cbcVar2.d - cbcVar2.a[cbcVar2.b - 1].b] = i;
            return;
        }
        bzf bzfVar2 = this.m;
        bzb bzbVarG2 = bzfVar2.g(bzfVar2.h);
        cbc cbcVar3 = (cbc) bzlVar2.k.a;
        cbcVar3.b(car.a);
        cbb.b(cbcVar3, 0, obj, 1, bzbVarG2);
        cbcVar3.c[cbcVar3.d - cbcVar3.a[cbcVar3.b - 1].b] = i;
    }

    @Override // defpackage.bwc
    public final boolean ag(bxf bxfVar, Object obj) {
        bzb bzbVar = bxfVar.e;
        if (bzbVar == null) {
            return false;
        }
        int iD = this.m.a.d(bzi.h(bzbVar));
        if (!this.l || iD < this.m.f) {
            return false;
        }
        List list = this.g;
        int iC = bvw.c(list, iD);
        if (iC < 0) {
            int i = iC + 1;
            if (true != (obj instanceof bvk)) {
                obj = null;
            }
            list.add(-i, new bwd(bxfVar, iD, obj));
        } else {
            bwd bwdVar = (bwd) list.get(iC);
            if (obj instanceof bvk) {
                Object obj2 = bwdVar.b;
                if (obj2 == null) {
                    bwdVar.b = obj;
                } else if (obj2 instanceof aap) {
                    ((aap) obj2).j(obj);
                } else {
                    aap aapVar = aaq.a;
                    aap aapVar2 = new aap(2);
                    aapVar2.h(obj2);
                    aapVar2.h(obj);
                    bwdVar.b = aapVar2;
                }
            } else {
                bwdVar.b = null;
            }
        }
        return true;
    }

    public final ccx ah() {
        ccx ccxVar = this.v;
        return ccxVar != null ? ccxVar : aI(this.m.h);
    }

    public final ccx ai(ccx ccxVar, ccx ccxVar2) {
        ccw ccwVar = new ccw(ccxVar);
        ccwVar.putAll(ccxVar2);
        ccx ccxVarG = ccwVar.b();
        ab(204, buz.e, 0, null);
        aF(ccxVarG);
        aF(ccxVar2);
        Y(false);
        return ccxVarG;
    }

    public final void aj(ccx ccxVar) {
        zh zhVar = this.w;
        if (zhVar == null) {
            zhVar = new zh(6);
            this.w = zhVar;
        }
        zhVar.g(this.m.f, ccxVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068 A[Catch: all -> 0x022c, TryCatch #2 {all -> 0x022c, blocks: (B:6:0x0029, B:8:0x0056, B:9:0x005c, B:11:0x0060, B:14:0x0077, B:16:0x0083, B:17:0x008d, B:20:0x00a0, B:21:0x00a3, B:69:0x01ce, B:71:0x01f1, B:72:0x01f6, B:74:0x01fe, B:75:0x0203, B:79:0x0215, B:83:0x0224, B:84:0x022b, B:13:0x0068, B:22:0x00a9, B:24:0x00b0, B:25:0x00bd, B:28:0x00c3, B:30:0x00cb, B:31:0x00de, B:33:0x00e6, B:34:0x00eb, B:38:0x0104, B:40:0x010c, B:49:0x0165, B:53:0x0176, B:57:0x0185, B:59:0x018d, B:60:0x0199, B:61:0x019f, B:63:0x01a3, B:64:0x01b2, B:66:0x01b6, B:67:0x01c3, B:42:0x0123, B:43:0x0134, B:45:0x0138, B:46:0x014d, B:47:0x0150), top: B:94:0x0029, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ak(defpackage.aan r17, defpackage.afeg r18) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvv.ak(aan, afeg):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    @Override // defpackage.bwc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void al(defpackage.aan r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.util.List r0 = r0.g
            int r2 = r0.size()
        La:
            int r2 = r2 + (-1)
            if (r2 < 0) goto L37
            java.lang.Object r4 = r0.get(r2)
            bwd r4 = (defpackage.bwd) r4
            java.lang.Object r5 = r4.c
            bxf r5 = (defpackage.bxf) r5
            bzb r5 = r5.e
            if (r5 == 0) goto L21
            bzb r3 = defpackage.bzi.h(r5)
            goto L22
        L21:
            r3 = 0
        L22:
            if (r3 == 0) goto L33
            boolean r5 = r3.a()
            if (r5 == 0) goto L33
            int r5 = r4.a
            int r3 = r3.a
            if (r5 == r3) goto La
            r4.a = r3
            goto La
        L33:
            r0.remove(r2)
            goto La
        L37:
            java.lang.Object[] r2 = r1.b
            java.lang.Object[] r4 = r1.c
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L97
            r6 = 0
            r7 = r6
        L44:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L92
            int r10 = r7 - r5
            int r10 = ~r10
            r11 = r6
        L58:
            int r12 = r10 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L90
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L8c
            int r12 = r7 << 3
            int r12 = r12 + r11
            r14 = r2[r12]
            r12 = r4[r12]
            r14.getClass()
            bxf r14 = (defpackage.bxf) r14
            bzb r15 = r14.e
            if (r15 == 0) goto L8c
            bzb r15 = defpackage.bzi.h(r15)
            int r15 = r15.a
            bxv r3 = defpackage.bxv.a
            if (r12 != r3) goto L84
            r12 = 0
        L84:
            bwd r3 = new bwd
            r3.<init>(r14, r15, r12)
            r0.add(r3)
        L8c:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L58
        L90:
            if (r12 != r13) goto L97
        L92:
            if (r7 == r5) goto L97
            int r7 = r7 + 1
            goto L44
        L97:
            java.util.Comparator r1 = defpackage.bvw.a
            defpackage.woy.bs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvv.al(aan):void");
    }

    public final void am(bwk bwkVar, ccx ccxVar, Object obj) {
        ab(126665345, bwkVar, 0, null);
        aF(obj);
        long j = this.u;
        try {
            this.u = 126665345L;
            if (this.t) {
                bzj bzjVar = this.o;
                bzjVar.D(bzjVar.q);
            }
            boolean z = (this.t || affa.f(this.m.h(), ccxVar)) ? false : true;
            if (z) {
                aj(ccxVar);
            }
            ab(202, buz.d, 0, ccxVar);
            this.v = null;
            boolean z2 = this.h;
            this.h = z;
            bxc.g(this, new cct(-59194059, true, new abp(10)));
            this.h = z2;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0057 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:10:0x0027, B:9:0x0024, B:13:0x002e, B:16:0x0036, B:19:0x003e, B:21:0x0046, B:23:0x004c, B:24:0x0050, B:25:0x0051, B:27:0x0057, B:20:0x0042), top: B:35:0x0005, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void an(defpackage.bvd r9, defpackage.bvd r10, java.lang.Integer r11, java.util.List r12, defpackage.afdr r13) {
        /*
            r8 = this;
            boolean r0 = r8.l
            int r1 = r8.E
            r2 = 1
            r8.l = r2     // Catch: java.lang.Throwable -> L5f
            r2 = 0
            r8.E = r2     // Catch: java.lang.Throwable -> L5f
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L5f
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2a
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L5f
            aezu r6 = (defpackage.aezu) r6     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r7 = r6.a     // Catch: java.lang.Throwable -> L5f
            bxf r7 = (defpackage.bxf) r7     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r6 = r6.b     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L24
            r8.ag(r7, r6)     // Catch: java.lang.Throwable -> L5f
            goto L27
        L24:
            r8.ag(r7, r5)     // Catch: java.lang.Throwable -> L5f
        L27:
            int r4 = r4 + 1
            goto Lf
        L2a:
            if (r9 == 0) goto L57
            if (r11 == 0) goto L33
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L5f
            goto L34
        L33:
            r11 = -1
        L34:
            if (r10 == 0) goto L51
            boolean r12 = defpackage.affa.f(r10, r9)     // Catch: java.lang.Throwable -> L5f
            if (r12 != 0) goto L51
            if (r11 < 0) goto L51
            r9.h = r10     // Catch: java.lang.Throwable -> L5f
            r9.i = r11     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L4b
            r9.h = r5     // Catch: java.lang.Throwable -> L5f
            r9.i = r2     // Catch: java.lang.Throwable -> L5f
            goto L55
        L4b:
            r10 = move-exception
            r9.h = r5     // Catch: java.lang.Throwable -> L5f
            r9.i = r2     // Catch: java.lang.Throwable -> L5f
            throw r10     // Catch: java.lang.Throwable -> L5f
        L51:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L5f
        L55:
            if (r10 != 0) goto L5a
        L57:
            r13.invoke()     // Catch: java.lang.Throwable -> L5f
        L5a:
            r8.l = r0
            r8.E = r1
            return
        L5f:
            r9 = move-exception
            r8.l = r0
            r8.E = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvv.an(bvd, bvd, java.lang.Integer, java.util.List, afdr):void");
    }

    public final admq ao() {
        List arrayList;
        if (!this.b.o()) {
            return null;
        }
        afbt afbtVar = new afbt(10);
        bzj bzjVar = this.o;
        afbtVar.addAll(vh.d(bzjVar, bzjVar.o, null));
        bzf bzfVar = this.m;
        if (bzfVar.e || bzfVar.c == 0) {
            arrayList = afbe.a;
        } else {
            arrayList = new ArrayList();
            int iE = bzfVar.h;
            Object objValueOf = Integer.valueOf(bzfVar.j - bzi.d(bzfVar.b, iE));
            while (iE >= 0) {
                cdj.c(bzfVar.b(iE), bzfVar.z(iE) ? bzfVar.m(iE) : buw.a, bzfVar.a.j(iE), objValueOf, arrayList);
                objValueOf = bzfVar.g(iE);
                iE = bzfVar.e(iE);
            }
        }
        afbtVar.addAll(arrayList);
        afbtVar.addAll(T());
        return new admq(afbtVar.f(), this.k);
    }

    @Override // defpackage.bux
    public final long b() {
        return this.u;
    }

    @Override // defpackage.bux
    public final bux c(int i) {
        bxf bxfVar;
        boolean z;
        v(i);
        if (this.t) {
            bxf bxfVar2 = new bxf(this.d);
            this.L.add(bxfVar2);
            af(bxfVar2);
            av(bxfVar2);
            return this;
        }
        bwd bwdVarE = bvw.e(this.g, this.m.h);
        Object objN = this.m.n();
        if (affa.f(objN, buw.a)) {
            bxfVar = new bxf(this.d);
            af(bxfVar);
        } else {
            objN.getClass();
            bxfVar = (bxf) objN;
        }
        if (bwdVarE == null) {
            int i2 = bxfVar.b;
            if ((i2 & 64) != 0) {
                bxfVar.b = i2 & (-65);
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        bxfVar.e(z);
        this.L.add(bxfVar);
        av(bxfVar);
        if ((bxfVar.b & 256) != 0) {
            bxfVar.d(false);
            bxfVar.h(true);
            cbc cbcVar = (cbc) this.q.k.a;
            cbcVar.b(cap.a);
            cbb.a(cbcVar, 0, bxfVar);
            if (!this.i && bxfVar.l()) {
                this.i = true;
                this.I = this.m.h;
                bxfVar.g(true);
            }
        }
        return this;
    }

    @Override // defpackage.bux
    public final bvb d() {
        bvv bvvVar;
        ab(206, buz.f, 0, null);
        if (this.t) {
            bzj bzjVar = this.o;
            bzjVar.D(bzjVar.q);
        }
        Object objR = R();
        bxr bxuVar = objR instanceof bxr ? (bxr) objR : null;
        if (bxuVar == null) {
            bvvVar = this;
            bxuVar = new bxu(new bvt(new bvu(bvvVar, this.u, this.f, this.k)));
            bvvVar.af(bxuVar);
        } else {
            bvvVar = this;
        }
        bxq bxqVarA = bxuVar.a();
        bxqVarA.getClass();
        bvu bvuVar = ((bvt) bxqVarA).a;
        bvuVar.a.b(bvvVar.ah());
        bvvVar.Y(false);
        return bvuVar;
    }

    @Override // defpackage.bux
    public final cfd e() {
        cfd cfdVar = this.P;
        if (cfdVar != null) {
            return cfdVar;
        }
        bvx bvxVar = new bvx(this.d);
        this.P = bvxVar;
        return bvxVar;
    }

    @Override // defpackage.bux
    public final Object f(bvf bvfVar) {
        return czz.al(ah(), bvfVar);
    }

    @Override // defpackage.bux
    public final Object g() {
        return S();
    }

    @Override // defpackage.bux
    public final afco h() {
        return this.s;
    }

    @Override // defpackage.bux
    public final void i(Object obj, afeg afegVar) {
        if (this.t) {
            cbc cbcVar = this.N.a;
            cbcVar.b(cat.a);
            cbb.a(cbcVar, 0, obj);
            afegVar.getClass();
            affz.g(afegVar, 2);
            cbb.a(cbcVar, 1, afegVar);
            return;
        }
        bzl bzlVar = this.q;
        bzlVar.f();
        cbc cbcVar2 = (cbc) bzlVar.k.a;
        cbcVar2.b(cat.a);
        afegVar.getClass();
        affz.g(afegVar, 2);
        cbb.b(cbcVar2, 0, obj, 1, afegVar);
    }

    @Override // defpackage.bux
    public final void j(afdr afdrVar) {
        aG();
        if (!this.t) {
            buz.b("createNode() can only be called when inserting");
        }
        int i = ((int[]) this.T.b)[r0.a - 1];
        bzj bzjVar = this.o;
        bzb bzbVarO = bzjVar.o(bzjVar.q);
        this.F++;
        bzm bzmVar = this.N;
        cbc cbcVar = bzmVar.a;
        cbcVar.b(cab.a);
        cbb.a(cbcVar, 0, afdrVar);
        cbcVar.c[cbcVar.d - cbcVar.a[cbcVar.b - 1].b] = i;
        cbb.a(cbcVar, 1, bzbVarO);
        cbc cbcVar2 = bzmVar.b;
        cbcVar2.b(cag.a);
        cbcVar2.c[cbcVar2.d - cbcVar2.a[cbcVar2.b - 1].b] = i;
        cbb.a(cbcVar2, 0, bzbVarO);
    }

    @Override // defpackage.bux
    public final void k(boolean z) {
        if (this.F != 0) {
            buz.b("No nodes can be emitted before calling deactivateToEndGroup");
        }
        if (this.t) {
            return;
        }
        if (!z) {
            aC();
            return;
        }
        bzf bzfVar = this.m;
        int i = bzfVar.f;
        int i2 = bzfVar.g;
        bzl bzlVar = this.q;
        bzlVar.i(false);
        ((cbc) bzlVar.k.a).b(bzs.a);
        bvw.h(this.g, i, i2);
        this.m.u();
    }

    @Override // defpackage.bux
    public final void l() {
        Y(false);
        bxf bxfVarP = P();
        if (bxfVarP == null || !bxfVarP.n()) {
            return;
        }
        bxfVarP.b |= 2;
    }

    @Override // defpackage.bux
    public final void m() {
        Y(false);
    }

    @Override // defpackage.bux
    public final void n() {
        Y(true);
    }

    @Override // defpackage.bux
    public final void o() {
        Y(false);
    }

    @Override // defpackage.bux
    public final void p() {
        Y(false);
    }

    @Override // defpackage.bux
    public final void q() {
        if (this.i && this.m.h == this.I) {
            this.I = -1;
            this.i = false;
        }
        Y(false);
    }

    @Override // defpackage.bux
    public final void r(afdr afdrVar) {
        cbc cbcVar = (cbc) this.q.k.a;
        cbcVar.b(can.a);
        cbb.a(cbcVar, 0, afdrVar);
    }

    @Override // defpackage.bux
    public final void s() {
        if (this.F != 0) {
            buz.b("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.t) {
            return;
        }
        bxf bxfVarP = P();
        if (bxfVarP != null && !bxfVarP.l()) {
            bxfVarP.j(true);
        }
        if (this.g.isEmpty()) {
            aC();
        } else {
            ax();
        }
    }

    @Override // defpackage.bux
    public final void t(int i, Object obj) {
        ab(i, obj, 0, null);
    }

    @Override // defpackage.bux
    public final void u() {
        ab(125, null, 1, null);
        this.H = true;
    }

    @Override // defpackage.bux
    public final void v(int i) {
        int i2;
        if (this.D != null) {
            ab(i, null, 0, null);
            return;
        }
        aH();
        this.u = Long.rotateLeft(Long.rotateLeft(this.u, 3) ^ i, 3) ^ this.G;
        this.G++;
        bzf bzfVar = this.m;
        if (this.t) {
            bzfVar.q();
            this.o.K(i, buw.a);
            au(false, null);
            return;
        }
        if (bzfVar.a() == i && ((i2 = bzfVar.f) >= bzfVar.g || (bzfVar.b[(i2 * 5) + 1] & 536870912) == 0)) {
            bzfVar.v();
            au(false, null);
            return;
        }
        if (!bzfVar.A()) {
            int i3 = this.E;
            int i4 = bzfVar.f;
            ay();
            this.q.k(i3, bzfVar.f());
            bvw.h(this.g, i4, bzfVar.f);
        }
        bzfVar.q();
        this.t = true;
        this.v = null;
        at();
        bzj bzjVar = this.o;
        bzjVar.v();
        int i5 = bzjVar.o;
        bzjVar.K(i, buw.a);
        this.M = bzjVar.o(i5);
        au(false, null);
    }

    @Override // defpackage.bux
    public final void w() {
        ab(125, null, 2, null);
        this.H = true;
    }

    @Override // defpackage.bux
    public final void x(Object obj) {
        ad(obj);
    }

    @Override // defpackage.bux
    public final void y() {
        boolean z;
        aG();
        if (this.t) {
            buz.b("useNode() called while inserting");
        }
        bzf bzfVar = this.m;
        Object objO = bzfVar.o(bzfVar.h);
        bzl bzlVar = this.q;
        bzlVar.c(objO);
        if (this.i && ((z = objO instanceof bur))) {
            bzlVar.f();
            kgx kgxVar = bzlVar.k;
            if (z) {
                ((cbc) kgxVar.a).b(caw.a);
            }
        }
    }

    @Override // defpackage.bwc, defpackage.bux
    public final boolean z(float f) {
        Object objR = R();
        if ((objR instanceof Float) && f == ((Number) objR).floatValue()) {
            return false;
        }
        af(Float.valueOf(f));
        return true;
    }

    @Override // defpackage.bux
    public final void M() {
    }
}
