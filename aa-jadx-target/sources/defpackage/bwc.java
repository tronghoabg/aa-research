package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bwc extends defpackage.bwj {
    public defpackage.khb A;
    private final java.util.Set B;
    private defpackage.bwg D;
    private int E;
    private int F;
    private int G;
    private boolean H;
    private boolean J;
    private int K;
    private final java.util.ArrayList L;
    private defpackage.bzh M;
    private defpackage.bzs N;
    private final defpackage.cfm O;
    private defpackage.cfk P;
    private defpackage.zj R;
    private final defpackage.cex S;
    public final defpackage.buq a;
    public final defpackage.bvi b;
    public final defpackage.bzm c;
    public final defpackage.bvk d;
    public int[] e;
    public boolean f;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public boolean l;
    public defpackage.bzl m;
    public defpackage.bzm n;
    public defpackage.bzp o;
    public boolean p;
    public final defpackage.bzr q;
    public defpackage.byc r;
    public final defpackage.afdo s;
    public boolean t;
    public long u;
    public defpackage.cdd v;
    public defpackage.zo w;
    public final defpackage.khb y;
    public final defpackage.khb z;
    private final java.util.ArrayList C = new java.util.ArrayList();
    private final defpackage.vuj T = new defpackage.vuj((char[]) null);
    public final java.util.List g = new java.util.ArrayList();
    private final defpackage.vuj U = new defpackage.vuj((char[]) null);
    private defpackage.cdd Q = defpackage.cdd.d;
    public final defpackage.vuj x = new defpackage.vuj((char[]) null);
    private int I = -1;

    public bwc(defpackage.buq buqVar, defpackage.bvi bviVar, defpackage.bzm bzmVar, java.util.Set set, defpackage.khb khbVar, defpackage.khb khbVar2, defpackage.bvk bvkVar) {
        this.a = buqVar;
        this.b = bviVar;
        this.c = bzmVar;
        this.B = set;
        this.y = khbVar;
        this.z = khbVar2;
        this.d = bvkVar;
        this.k = bviVar.n() || bviVar.l();
        this.S = new defpackage.cex(this, 1);
        this.L = new java.util.ArrayList();
        defpackage.bzl bzlVarE = bzmVar.e();
        bzlVarE.r();
        this.m = bzlVarE;
        defpackage.bzm bzmVar2 = new defpackage.bzm();
        if (bviVar.n()) {
            bzmVar2.b();
        }
        if (bviVar.l()) {
            bzmVar2.a();
        }
        this.n = bzmVar2;
        defpackage.bzp bzpVarF = bzmVar2.f();
        bzpVarF.w(true);
        this.o = bzpVarF;
        this.q = new defpackage.bzr(this, khbVar);
        defpackage.bzl bzlVarE2 = this.n.e();
        try {
            defpackage.bzh bzhVarG = bzlVarE2.g(0);
            bzlVarE2.r();
            this.M = bzhVarG;
            this.N = new defpackage.bzs();
            this.O = new defpackage.cfm(this);
            defpackage.afdo afdoVarD = bviVar.d();
            defpackage.afdo afdoVarQ = Q();
            this.s = afdoVarD.plus(afdoVarQ == null ? defpackage.afdp.a : afdoVarQ);
        } catch (java.lang.Throwable th) {
            bzlVarE2.r();
            throw th;
        }
    }

    private final void aA(int i) {
        boolean zB = this.m.B(i);
        if (zB) {
            defpackage.bzr bzrVar = this.q;
            bzrVar.h();
            bzrVar.c(this.m.o(i));
        }
        aq(this, i, i, zB, 0);
        defpackage.bzr bzrVar2 = this.q;
        bzrVar2.h();
        if (zB) {
            bzrVar2.e();
        }
    }

    private static final void aB(defpackage.bwc bwcVar, java.util.List list, int i) {
        int iC = bwcVar.m.c(i) + i;
        int iC2 = i + 1;
        while (iC2 < iC) {
            if (bwcVar.m.y(iC2)) {
                defpackage.bws bwsVarAr = ar(bwcVar, iC2);
                if (bwsVarAr != null) {
                    list.add(bwsVarAr);
                }
            } else if (bwcVar.m.w(iC2)) {
                aB(bwcVar, list, iC2);
            }
            iC2 += bwcVar.m.c(iC2);
        }
    }

    private final void aC() {
        defpackage.bzl bzlVar = this.m;
        int i = bzlVar.h;
        this.F = i >= 0 ? bzlVar.b[(i * 5) + 1] & 67108863 : 0;
        bzlVar.u();
    }

    private final void aD(boolean z, java.lang.Object obj) {
        if (z) {
            defpackage.bzl bzlVar = this.m;
            if (bzlVar.i <= 0) {
                if ((bzlVar.b[(bzlVar.f * 5) + 1] & 1073741824) == 0) {
                    defpackage.bxi.a("Expected a node group");
                }
                bzlVar.v();
                return;
            }
            return;
        }
        if (obj != null && this.m.h() != obj) {
            defpackage.bzr bzrVar = this.q;
            bzrVar.i(false);
            defpackage.cbi cbiVar = (defpackage.cbi) bzrVar.k.a;
            cbiVar.b(defpackage.cay.a);
            defpackage.cbh.a(cbiVar, 0, obj);
        }
        this.m.v();
    }

    private final void aE(int i, int i2) {
        int iO = O(i);
        if (iO != i2) {
            java.util.ArrayList arrayList = this.C;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iO2 = O(i) + (i2 - iO);
                ae(i, iO2);
                int i3 = size;
                while (i3 >= 0) {
                    int i4 = i3 - 1;
                    defpackage.bwg bwgVar = (defpackage.bwg) arrayList.get(i3);
                    if (bwgVar != null && bwgVar.d(i, iO2)) {
                        size = i4;
                        break;
                    }
                    i3 = i4;
                }
                defpackage.bzl bzlVar = this.m;
                if (i < 0) {
                    i = bzlVar.h;
                } else if (bzlVar.B(i)) {
                    return;
                } else {
                    i = this.m.e(i);
                }
            }
        }
    }

    private final void aF(java.lang.Object obj) {
        R();
        af(obj);
    }

    private final void aG() {
        if (!this.H) {
            defpackage.bvg.b("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.H = false;
    }

    private final void aH() {
        if (this.H) {
            defpackage.bvg.b("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final defpackage.cdd aI(int i) {
        defpackage.cdd cddVar;
        if (this.t && this.p) {
            int iK = this.o.q;
            while (iK > 0) {
                if (this.o.h(iK) == 202 && defpackage.afga.f(this.o.r(iK), defpackage.bvg.d)) {
                    java.lang.Object objQ = this.o.q(iK);
                    objQ.getClass();
                    defpackage.cdd cddVar2 = (defpackage.cdd) objQ;
                    this.v = cddVar2;
                    return cddVar2;
                }
                iK = this.o.k(iK);
            }
        }
        if (this.m.c > 0) {
            while (i > 0) {
                if (this.m.b(i) == 202 && defpackage.afga.f(this.m.m(i), defpackage.bvg.d)) {
                    defpackage.zo zoVar = this.w;
                    if (zoVar == null || (cddVar = (defpackage.cdd) zoVar.a(i)) == null) {
                        java.lang.Object objJ = this.m.j(i);
                        objJ.getClass();
                        cddVar = (defpackage.cdd) objJ;
                    }
                    this.v = cddVar;
                    return cddVar;
                }
                i = this.m.e(i);
            }
        }
        defpackage.cdd cddVar3 = this.Q;
        this.v = cddVar3;
        return cddVar3;
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

    private static final int aq(defpackage.bwc bwcVar, int i, int i2, boolean z, int i3) {
        long[] jArr;
        java.lang.Object[] objArr;
        int i4;
        java.lang.Object[] objArr2;
        int i5;
        defpackage.bzl bzlVar = bwcVar.m;
        int i6 = 0;
        if (!bzlVar.y(i2)) {
            if (!bzlVar.w(i2)) {
                if (bzlVar.B(i2)) {
                    return 1;
                }
                return bzlVar.d(i2);
            }
            int iC = bzlVar.c(i2) + i2;
            int iAq = 0;
            for (int iC2 = i2 + 1; iC2 < iC; iC2 += bzlVar.c(iC2)) {
                boolean zB = bzlVar.B(iC2);
                if (zB) {
                    defpackage.bzr bzrVar = bwcVar.q;
                    bzrVar.h();
                    bzrVar.c(bzlVar.o(iC2));
                }
                iAq += aq(bwcVar, i, iC2, zB || z, zB ? 0 : i3 + iAq);
                if (zB) {
                    defpackage.bzr bzrVar2 = bwcVar.q;
                    bzrVar2.h();
                    bzrVar2.e();
                }
            }
            if (bzlVar.B(i2)) {
                return 1;
            }
            return iAq;
        }
        int iB = bzlVar.b(i2);
        java.lang.Object objM = bzlVar.m(i2);
        if (iB == 126665345) {
            if (objM instanceof defpackage.bwr) {
                defpackage.bws bwsVarAr = ar(bwcVar, i2);
                if (bwsVarAr != null) {
                    defpackage.bvi bviVar = bwcVar.b;
                    bviVar.e(bwsVarAr);
                    defpackage.bzr bzrVar3 = bwcVar.q;
                    bzrVar3.j();
                    defpackage.bvk bvkVar = bwcVar.d;
                    defpackage.cbi cbiVar = (defpackage.cbi) bzrVar3.k.a;
                    cbiVar.b(defpackage.can.a);
                    defpackage.cbh.c(cbiVar, bvkVar, bviVar, bwsVarAr);
                }
                if (!z || i2 == i) {
                    return bzlVar.d(i2);
                }
                defpackage.bzr bzrVar4 = bwcVar.q;
                bzrVar4.h();
                bzrVar4.f();
                int iD = bzrVar4.a().B(i2) ? 1 : bzrVar4.a().d(i2);
                if (iD <= 0) {
                    return 0;
                }
                bzrVar4.k(i3, iD);
                return 0;
            }
        } else if (iB == 206 && defpackage.afga.f(objM, defpackage.bvg.f)) {
            java.lang.Object objL = bzlVar.l(i2, 0);
            defpackage.bxx bxxVar = objL instanceof defpackage.bxx ? (defpackage.bxx) objL : null;
            defpackage.bxw bxwVarA = bxxVar != null ? bxxVar.a() : null;
            defpackage.bwa bwaVar = bxwVarA instanceof defpackage.bwa ? (defpackage.bwa) bxwVarA : null;
            if (bwaVar != null) {
                defpackage.aaw aawVar = bwaVar.a.c;
                java.lang.Object[] objArr3 = aawVar.b;
                long[] jArr2 = aawVar.a;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j = jArr2[i7];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = (~(i7 - length)) >>> 31;
                            int i9 = i6;
                            while (true) {
                                int i10 = 8 - i8;
                                if (i9 >= i10) {
                                    jArr = jArr2;
                                    objArr = objArr3;
                                    i4 = i6;
                                    if (i10 == 8) {
                                        break;
                                    }
                                } else {
                                    if ((255 & j) < 128) {
                                        defpackage.bwc bwcVar2 = (defpackage.bwc) objArr3[(i7 << 3) + i9];
                                        defpackage.bzm bzmVar = bwcVar2.c;
                                        if (bzmVar.b <= 0 || (bzmVar.a[1] & 67108864) == 0) {
                                            objArr2 = objArr3;
                                            i5 = i6;
                                        } else {
                                            defpackage.bvk bvkVar2 = bwcVar2.d;
                                            synchronized (bvkVar2.c) {
                                                java.lang.Object andSet = bvkVar2.b.getAndSet(defpackage.afcg.a);
                                                if (!defpackage.afga.f(andSet, defpackage.bvl.a) && andSet != null) {
                                                    if (andSet instanceof java.util.Set) {
                                                        bvkVar2.i((java.util.Set) andSet, false);
                                                    } else {
                                                        if (!(andSet instanceof java.lang.Object[])) {
                                                            java.util.concurrent.atomic.AtomicReference atomicReference = bvkVar2.b;
                                                            java.util.Objects.toString(atomicReference);
                                                            defpackage.bvg.a("corrupt pendingModifications drain: ".concat(atomicReference.toString()));
                                                            throw new defpackage.afap();
                                                        }
                                                        java.util.Set[] setArr = (java.util.Set[]) andSet;
                                                        int length2 = setArr.length;
                                                        int i11 = 0;
                                                        while (i11 < length2) {
                                                            int i12 = i11;
                                                            bvkVar2.i(setArr[i12], false);
                                                            i11 = i12 + 1;
                                                            objArr3 = objArr3;
                                                        }
                                                    }
                                                }
                                                objArr2 = objArr3;
                                                defpackage.aau aauVarX = bvkVar2.x();
                                                try {
                                                    bvkVar2.k.al(aauVarX);
                                                } catch (java.lang.Throwable th) {
                                                    bvkVar2.n = aauVarX;
                                                    throw th;
                                                }
                                            }
                                            defpackage.khb khbVar = new defpackage.khb((byte[]) null, (byte[]) null, (char[]) null);
                                            bwcVar2.A = khbVar;
                                            defpackage.bzl bzlVarE = bzmVar.e();
                                            try {
                                                bwcVar2.m = bzlVarE;
                                                defpackage.bzr bzrVar5 = bwcVar2.q;
                                                defpackage.khb khbVar2 = bzrVar5.k;
                                                try {
                                                    bzrVar5.k = khbVar;
                                                    i5 = 0;
                                                    bwcVar2.aA(0);
                                                    bzrVar5.f();
                                                    if (bzrVar5.a) {
                                                        bzrVar5.l();
                                                        bzrVar5.b();
                                                    }
                                                    bzrVar5.k = khbVar2;
                                                    bzlVarE.r();
                                                } catch (java.lang.Throwable th2) {
                                                    bzrVar5.k = khbVar2;
                                                    throw th2;
                                                }
                                            } catch (java.lang.Throwable th3) {
                                                bzlVarE.r();
                                                throw th3;
                                            }
                                        }
                                        bwcVar.b.u(bwcVar2.d);
                                    } else {
                                        jArr2 = jArr2;
                                        objArr2 = objArr3;
                                        i5 = i6;
                                    }
                                    j >>= 8;
                                    i9++;
                                    i6 = i5;
                                    jArr2 = jArr2;
                                    objArr3 = objArr2;
                                }
                            }
                        } else {
                            jArr = jArr2;
                            objArr = objArr3;
                            i4 = i6;
                        }
                        if (i7 != length) {
                            i7++;
                            i6 = i4;
                            jArr2 = jArr;
                            objArr3 = objArr;
                        }
                    }
                }
            }
            return bzlVar.d(i2);
        }
        if (bzlVar.B(i2)) {
            return 1;
        }
        return bzlVar.d(i2);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    private static final defpackage.bws ar(defpackage.bwc bwcVar, int i) {
        java.util.ArrayList arrayList;
        int iB = bwcVar.m.b(i);
        java.lang.Object objM = bwcVar.m.m(i);
        if (iB != 126665345 || !(objM instanceof defpackage.bwr)) {
            return null;
        }
        if (bwcVar.m.w(i)) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            aB(bwcVar, arrayList2, i);
            if (arrayList2.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = arrayList2;
            }
        } else {
            arrayList = null;
        }
        java.lang.Object objM2 = bwcVar.m.m(i);
        objM2.getClass();
        defpackage.bwr bwrVar = (defpackage.bwr) objM2;
        java.lang.Object objL = bwcVar.m.l(i, 0);
        defpackage.bzh bzhVarG = bwcVar.m.g(i);
        int iC = bwcVar.m.c(i) + i;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.List list = bwcVar.g;
        for (int iB2 = defpackage.bwd.b(list, i); iB2 < list.size(); iB2++) {
            defpackage.bwk bwkVar = (defpackage.bwk) list.get(iB2);
            if (bwkVar.a >= iC) {
                break;
            }
            arrayList3.add(new defpackage.afau(bwkVar.c, bwkVar.b));
        }
        return new defpackage.bws(bwrVar, objL, bwcVar.d, bwcVar.c, bzhVarG, arrayList3, bwcVar.aI(i), arrayList);
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
            defpackage.bzp bzpVarF = this.n.f();
            this.o = bzpVarF;
            bzpVarF.I();
            this.p = false;
            this.v = null;
        }
    }

    private final void au(boolean z, defpackage.bwg bwgVar) {
        this.C.add(this.D);
        this.D = bwgVar;
        defpackage.vuj vujVar = this.T;
        vujVar.e(this.F);
        vujVar.e(this.G);
        vujVar.e(this.E);
        if (z) {
            this.E = 0;
        }
        this.F = 0;
        this.G = 0;
    }

    private final void av(defpackage.bxl bxlVar) {
        bxlVar.d = this.K;
        bxlVar.j(false);
    }

    private final void aw() {
        defpackage.bzm bzmVar = new defpackage.bzm();
        if (this.k) {
            bzmVar.b();
        }
        if (this.b.l()) {
            bzmVar.a();
        }
        this.n = bzmVar;
        defpackage.bzp bzpVarF = bzmVar.f();
        bzpVarF.w(true);
        this.o = bzpVarF;
    }

    /* JADX WARN: Code duplicated, block: B:172:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2 A[LOOP:7: B:22:0x0080->B:38:0x00c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:6:0x003a  */
    private final void ax() {
        int i;
        long j;
        int i2;
        boolean z;
        boolean zS;
        long j2;
        int i3;
        defpackage.aal aalVar;
        long j3;
        int iB;
        long j4;
        boolean z2 = this.l;
        this.l = true;
        defpackage.bzl bzlVar = this.m;
        int i4 = bzlVar.h;
        int iC = bzlVar.c(i4) + i4;
        int i5 = this.E;
        long j5 = this.u;
        int i6 = this.F;
        int i7 = this.G;
        int i8 = this.m.f;
        java.util.List list = this.g;
        defpackage.bwk bwkVarD = defpackage.bwd.d(list, i8, iC);
        int i9 = i4;
        boolean z3 = false;
        while (bwkVarD != null) {
            int i10 = bwkVarD.a;
            defpackage.bwd.e(list, i10);
            java.lang.Object obj = bwkVarD.b;
            if (obj == null) {
                i = i5;
                j = j5;
                i2 = i6;
                z = z3;
                zS = true;
            } else {
                int i11 = 8;
                defpackage.aau aauVar = ((defpackage.bxl) bwkVarD.c).g;
                if (aauVar == null) {
                    i = i5;
                } else {
                    i = i5;
                    if (obj instanceof defpackage.bvr) {
                        zS = defpackage.bxl.s((defpackage.bvr) obj, aauVar);
                        j = j5;
                        i2 = i6;
                        z = z3;
                    } else {
                        if (obj instanceof defpackage.aaw) {
                            defpackage.aaw aawVar = (defpackage.aaw) obj;
                            if (aawVar.c()) {
                                java.lang.Object[] objArr = aawVar.b;
                                long[] jArr = aawVar.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    j = j5;
                                    i2 = i6;
                                    int i12 = 0;
                                    while (true) {
                                        long j6 = jArr[i12];
                                        long[] jArr2 = jArr;
                                        z = z3;
                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i13 = 8 - ((~(i12 - length)) >>> 31);
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 < i13) {
                                                    if ((j6 & 255) < 128) {
                                                        java.lang.Object obj2 = objArr[(i12 << 3) + i14];
                                                        if (!(obj2 instanceof defpackage.bvr) || defpackage.bxl.s((defpackage.bvr) obj2, aauVar)) {
                                                        }
                                                    }
                                                    j6 >>= i11;
                                                    i14++;
                                                } else if (i13 == i11) {
                                                    if (i12 != length) {
                                                        i12++;
                                                        z3 = z;
                                                        jArr = jArr2;
                                                        i11 = 8;
                                                    }
                                                }
                                            }
                                        } else if (i12 != length) {
                                            i12++;
                                            z3 = z;
                                            jArr = jArr2;
                                            i11 = 8;
                                        }
                                    }
                                } else {
                                    j = j5;
                                    i2 = i6;
                                    z = z3;
                                }
                            } else {
                                j = j5;
                                i2 = i6;
                                z = z3;
                            }
                            zS = false;
                        }
                        zS = true;
                    }
                }
                j = j5;
                i2 = i6;
                z = z3;
                zS = true;
            }
            java.lang.Object obj3 = bwkVarD.c;
            if (zS) {
                this.m.t(i10);
                int i15 = this.m.f;
                az(i9, i15, i4);
                int iE = this.m.e(i15);
                while (iE != i4 && !this.m.B(iE)) {
                    iE = this.m.e(iE);
                }
                int iO = true != this.m.B(iE) ? i : 0;
                if (iE != i15) {
                    int iO2 = (O(iE) - this.m.d(i15)) + iO;
                    while (iO < iO2 && iE != i10) {
                        iE++;
                        while (true) {
                            if (iE >= i10) {
                                break;
                            }
                            int iC2 = this.m.c(iE) + iE;
                            if (i10 >= iC2) {
                                iO += this.m.B(iE) ? 1 : O(iE);
                                iE = iC2;
                            }
                        }
                    }
                }
                this.E = iO;
                this.G = ap(i15);
                int iE2 = this.m.e(i15);
                long jRotateLeft = 0;
                int i16 = 0;
                int i17 = 3;
                while (true) {
                    if (iE2 < 0) {
                        j3 = j;
                    } else if (iE2 == i4) {
                        j3 = j;
                        jRotateLeft ^= java.lang.Long.rotateLeft(j3, i16);
                    } else {
                        j3 = j;
                        defpackage.bzl bzlVar2 = this.m;
                        i15 = i15;
                        if (bzlVar2.z(iE2)) {
                            java.lang.Object objM = bzlVar2.m(iE2);
                            if (objM != null) {
                                if (objM instanceof java.lang.Enum) {
                                    iB = ((java.lang.Enum) objM).ordinal();
                                } else if (objM instanceof defpackage.bwr) {
                                    j4 = jRotateLeft;
                                    iB = 126665345;
                                } else {
                                    iB = objM.hashCode();
                                }
                                j4 = jRotateLeft;
                            } else {
                                j4 = jRotateLeft;
                                iB = 0;
                            }
                        } else {
                            iB = bzlVar2.b(iE2);
                            j4 = jRotateLeft;
                            if (iB == 207) {
                                java.lang.Object objJ = bzlVar2.j(iE2);
                                iB = (objJ == null || defpackage.afga.f(objJ, defpackage.bvd.a)) ? 207 : objJ.hashCode();
                            }
                        }
                        if (iB == 126665345) {
                            jRotateLeft = j4 ^ java.lang.Long.rotateLeft(126665345L, i16);
                            break;
                        }
                        jRotateLeft = (j4 ^ java.lang.Long.rotateLeft(iB, i17)) ^ java.lang.Long.rotateLeft(this.m.z(iE2) ? 0 : ap(iE2), i16);
                        iE2 = this.m.e(iE2);
                        i16 = (i16 + 6) % 64;
                        i17 = (i17 + 6) % 64;
                        j = j3;
                        i15 = i15;
                    }
                    break;
                }
                this.u = jRotateLeft;
                this.v = null;
                defpackage.affg affgVar = ((defpackage.bxl) obj3).c;
                if (affgVar == null) {
                    throw new java.lang.IllegalStateException("Invalid restart scope");
                }
                affgVar.invoke(this, 1);
                this.v = null;
                defpackage.bzl bzlVar3 = this.m;
                int i18 = bzlVar3.b[(i4 * 5) + 3] + i4;
                int i19 = bzlVar3.f;
                if (i19 < i4 || i19 > i18) {
                    defpackage.bvg.b(defpackage.a.bn(i19, i4, "Index ", " is not a parent of "));
                }
                bzlVar3.h = i4;
                bzlVar3.g = i18;
                bzlVar3.j = 0;
                bzlVar3.k = 0;
                j2 = j3;
                i9 = i15;
                z3 = true;
            } else {
                j2 = j;
                java.util.ArrayList arrayList = this.L;
                arrayList.add(obj3);
                defpackage.bxl bxlVar = (defpackage.bxl) obj3;
                defpackage.bxm bxmVar = bxlVar.a;
                if (bxmVar == null || (aalVar = bxlVar.f) == null) {
                    i3 = i9;
                } else {
                    bxlVar.f(true);
                    try {
                        java.lang.Object[] objArr2 = aalVar.b;
                        int[] iArr = aalVar.c;
                        long[] jArr3 = aalVar.a;
                        int length2 = jArr3.length - 2;
                        if (length2 >= 0) {
                            int i20 = 0;
                            while (true) {
                                long j7 = jArr3[i20];
                                java.lang.Object[] objArr3 = objArr2;
                                i3 = i9;
                                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i21 = 8 - ((~(i20 - length2)) >>> 31);
                                    long j8 = j7;
                                    for (int i22 = 0; i22 < i21; i22++) {
                                        if ((j8 & 255) < 128) {
                                            int i23 = (i20 << 3) + i22;
                                            java.lang.Object obj4 = objArr3[i23];
                                            int i24 = iArr[i23];
                                            bxmVar.a(obj4);
                                        }
                                        j8 >>= 8;
                                    }
                                    if (i21 != 8) {
                                        break;
                                    }
                                }
                                if (i20 == length2) {
                                    break;
                                }
                                i20++;
                                i9 = i3;
                                objArr2 = objArr3;
                            }
                        } else {
                            i3 = i9;
                        }
                        bxlVar.f(false);
                    } catch (java.lang.Throwable th) {
                        bxlVar.f(false);
                        throw th;
                    }
                }
                arrayList.remove(arrayList.size() - 1);
                z3 = z;
                i9 = i3;
            }
            bwkVarD = defpackage.bwd.d(list, this.m.f, iC);
            i5 = i;
            i6 = i2;
            j5 = j2;
        }
        int i25 = i5;
        long j9 = j5;
        int i26 = i6;
        int i27 = i9;
        if (z3) {
            az(i27, i4, i4);
            this.m.u();
            int iO3 = O(i4);
            this.E = i25 + iO3;
            this.F = i26 + iO3;
            this.G = i7;
        } else {
            aC();
        }
        this.u = j9;
        this.l = z2;
    }

    private final void ay() {
        aA(this.m.f);
        defpackage.bzr bzrVar = this.q;
        bzrVar.g();
        ((defpackage.cbi) bzrVar.k.a).b(defpackage.caq.a);
        int i = bzrVar.c;
        defpackage.bzl bzlVarA = bzrVar.a();
        bzrVar.c = i + bzlVarA.b[(bzlVarA.f * 5) + 3];
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0017  */
    private final void az(int i, int i2, int i3) {
        defpackage.bzl bzlVar = this.m;
        if (i == i2) {
            i3 = i;
        } else if (i != i3 && i2 != i3) {
            if (bzlVar.e(i) == i2) {
                i3 = i2;
            } else if (bzlVar.e(i2) == i) {
                i3 = i;
            } else if (bzlVar.e(i) == bzlVar.e(i2)) {
                i3 = bzlVar.e(i);
            } else {
                int iA = defpackage.bwd.a(bzlVar, i, i3);
                int iA2 = defpackage.bwd.a(bzlVar, i2, i3);
                int i4 = iA - iA2;
                int iE = i;
                for (int i5 = 0; i5 < i4; i5++) {
                    iE = bzlVar.e(iE);
                }
                int i6 = iA2 - iA;
                int iE2 = i2;
                for (int i7 = 0; i7 < i6; i7++) {
                    iE2 = bzlVar.e(iE2);
                }
                while (iE != iE2) {
                    iE = bzlVar.e(iE);
                    iE2 = bzlVar.e(iE2);
                }
                i3 = iE;
            }
        }
        while (i > 0 && i != i3) {
            if (bzlVar.B(i)) {
                this.q.e();
            }
            i = bzlVar.e(i);
        }
        as(i2, i3);
    }

    @Override // defpackage.bwj, defpackage.bve
    public final boolean A(int i) {
        java.lang.Object objR = R();
        if ((objR instanceof java.lang.Integer) && i == ((java.lang.Number) objR).intValue()) {
            return false;
        }
        af(java.lang.Integer.valueOf(i));
        return true;
    }

    @Override // defpackage.bwj, defpackage.bve
    public final boolean B(long j) {
        java.lang.Object objR = R();
        if ((objR instanceof java.lang.Long) && j == ((java.lang.Number) objR).longValue()) {
            return false;
        }
        af(java.lang.Long.valueOf(j));
        return true;
    }

    @Override // defpackage.bve
    public final boolean C(java.lang.Object obj) {
        if (defpackage.afga.f(R(), obj)) {
            return false;
        }
        af(obj);
        return true;
    }

    @Override // defpackage.bwj, defpackage.bve
    public final boolean D(boolean z) {
        java.lang.Object objR = R();
        if ((objR instanceof java.lang.Boolean) && z == ((java.lang.Boolean) objR).booleanValue()) {
            return false;
        }
        af(java.lang.Boolean.valueOf(z));
        return true;
    }

    @Override // defpackage.bwj, defpackage.bve
    public final boolean E(java.lang.Object obj) {
        if (R() == obj) {
            return false;
        }
        af(obj);
        return true;
    }

    @Override // defpackage.bve
    public final boolean F() {
        if (!H() || this.h) {
            return true;
        }
        defpackage.bxl bxlVarP = P();
        return (bxlVarP == null || (bxlVarP.b & 4) == 0) ? false : true;
    }

    @Override // defpackage.bve
    public final boolean G() {
        return this.t;
    }

    @Override // defpackage.bve
    public final boolean H() {
        defpackage.bxl bxlVarP;
        return (this.t || this.i || this.h || (bxlVarP = P()) == null || (bxlVarP.b & 8) != 0) ? false : true;
    }

    @Override // defpackage.bve
    public final boolean I(boolean z, int i) {
        defpackage.bxl bxlVarP;
        if (i != 0 || (!this.t && !this.i)) {
            return z || !H();
        }
        defpackage.byc bycVar = this.r;
        if (bycVar == null || (bxlVarP = P()) == null || !bycVar.a() || bxlVarP.k()) {
            return true;
        }
        bxlVarP.q();
        bxlVarP.i(this.i);
        bxlVarP.d(true);
        defpackage.cbi cbiVar = (defpackage.cbi) this.q.k.a;
        cbiVar.b(defpackage.cap.a);
        defpackage.cbh.a(cbiVar, 0, bxlVarP);
        this.b.i(bxlVarP);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0078 A[LOOP:0: B:15:0x0036->B:28:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x007c A[EDGE_INSN: B:29:0x007c->B:30:0x007d BREAK  A[LOOP:0: B:15:0x0036->B:28:0x0078]] */
    /* JADX WARN: Code duplicated, block: B:59:0x007c A[SYNTHETIC] */
    @Override // defpackage.bve
    public final defpackage.bxl J() {
        defpackage.bxl bxlVar;
        defpackage.bzh bzhVarG;
        defpackage.bfr bfrVar;
        java.util.ArrayList arrayList = this.L;
        defpackage.bxl bxlVar2 = !arrayList.isEmpty() ? (defpackage.bxl) arrayList.remove(arrayList.size() - 1) : null;
        if (bxlVar2 != null) {
            bxlVar2.e(false);
            int i = this.K;
            defpackage.aal aalVar = bxlVar2.f;
            if (aalVar != null && !bxlVar2.m()) {
                java.lang.Object[] objArr = aalVar.b;
                int[] iArr = aalVar.c;
                long[] jArr = aalVar.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    bfrVar = null;
                    break;
                }
                int i2 = 0;
                loop0: while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 == length) {
                            bfrVar = null;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = ~(i2 - length);
                        int i4 = 0;
                        while (true) {
                            int i5 = 8 - (i3 >>> 31);
                            if (i4 >= i5) {
                                if (i5 == 8) {
                                    if (i2 == length) {
                                        i2++;
                                    }
                                }
                                bfrVar = null;
                                break;
                            }
                            if ((j & 255) < 128) {
                                int i6 = (i2 << 3) + i4;
                                java.lang.Object obj = objArr[i6];
                                if (iArr[i6] != i) {
                                    bfrVar = new defpackage.bfr(bxlVar2, i, aalVar, 2);
                                    break loop0;
                                }
                            }
                            j >>= 8;
                            i4++;
                        }
                    }
                }
            } else {
                bfrVar = null;
                break;
            }
            if (bfrVar != null) {
                defpackage.bzr bzrVar = this.q;
                defpackage.bvk bvkVar = this.d;
                defpackage.cbi cbiVar = (defpackage.cbi) bzrVar.k.a;
                cbiVar.b(defpackage.cab.a);
                defpackage.cbh.b(cbiVar, 0, bfrVar, 1, bvkVar);
            }
            if (bxlVar2.k()) {
                bxlVar2.h(false);
                defpackage.cbi cbiVar2 = (defpackage.cbi) this.q.k.a;
                cbiVar2.b(defpackage.cae.a);
                defpackage.cbh.a(cbiVar2, 0, bxlVar2);
                bxlVar2.i(false);
                if ((bxlVar2.b & 1024) != 0) {
                    bxlVar2.g(false);
                    if (this.I == this.m.h) {
                        this.i = false;
                        this.I = -1;
                    }
                }
            }
        }
        if (bxlVar2 == null || bxlVar2.m() || !(bxlVar2.n() || this.f)) {
            bxlVar = null;
        } else {
            if (bxlVar2.e == null) {
                if (this.t) {
                    defpackage.bzp bzpVar = this.o;
                    bzhVarG = bzpVar.o(bzpVar.q);
                } else {
                    defpackage.bzl bzlVar = this.m;
                    bzhVarG = bzlVar.g(bzlVar.h);
                }
                bxlVar2.e = bzhVarG;
            }
            bxlVar2.c(false);
            bxlVar = bxlVar2;
        }
        Y(false);
        return bxlVar;
    }

    @Override // defpackage.bve
    public final void K() {
        ab(1219399079, null, 0, null);
    }

    @Override // defpackage.bve
    public final void L(java.lang.Object obj) {
        if (!this.t && this.m.a() == 207 && !defpackage.afga.f(this.m.h(), obj) && this.I < 0) {
            this.I = this.m.f;
            this.i = true;
        }
        ab(207, null, 0, obj);
    }

    @Override // defpackage.bve
    public final defpackage.cdd N() {
        return ah();
    }

    public final int O(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.e;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.m.d(i) : i2;
        }
        defpackage.zj zjVar = this.R;
        if (zjVar == null || zjVar.a(i) < 0) {
            return 0;
        }
        int iA = zjVar.a(i);
        if (iA < 0) {
            defpackage.ca.ab(defpackage.a.bo(i, "Cannot find value for key "));
        }
        return zjVar.c[iA];
    }

    @Override // defpackage.bwj
    public final defpackage.bxl P() {
        if (this.j != 0) {
            return null;
        }
        java.util.ArrayList arrayList = this.L;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (defpackage.bxl) arrayList.get(arrayList.size() - 1);
    }

    @Override // defpackage.bwj
    public final defpackage.cfm Q() {
        if (this.b.o()) {
            return this.O;
        }
        return null;
    }

    public final java.lang.Object R() {
        if (this.t) {
            aH();
            return defpackage.bvd.a;
        }
        java.lang.Object objN = this.m.n();
        return (!this.i || (objN instanceof defpackage.bya)) ? objN : defpackage.bvd.a;
    }

    public final java.lang.Object S() {
        if (this.t) {
            aH();
            return defpackage.bvd.a;
        }
        java.lang.Object objN = this.m.n();
        if (!this.i || (objN instanceof defpackage.bya)) {
            return objN instanceof defpackage.bxx ? ((defpackage.bxx) objN).a() : objN;
        }
        return defpackage.bvd.a;
    }

    @Override // defpackage.bwj
    public final java.util.List T() {
        defpackage.bvi bviVar = this.b;
        defpackage.bvh bvhVarC = bviVar.c();
        if (true != (bvhVarC instanceof defpackage.bvk)) {
            bvhVarC = null;
        }
        if (bvhVarC == null) {
            return defpackage.afce.a;
        }
        defpackage.bvk bvkVar = (defpackage.bvk) bvhVarC;
        defpackage.bzl bzlVarE = ((defpackage.bzm) bvkVar.e).e();
        try {
            java.lang.Integer numB = defpackage.vm.b(bzlVarE, bviVar, 0, bzlVarE.c);
            bzlVarE.r();
            if (numB == null) {
                return defpackage.afce.a;
            }
            defpackage.bzl bzlVarE2 = ((defpackage.bzm) bvkVar.e).e();
            try {
                return defpackage.afga.aS(defpackage.vm.c(bzlVarE2, numB.intValue(), 0), bvkVar.k.T());
            } finally {
                bzlVarE2.r();
            }
        } catch (java.lang.Throwable th) {
            bzlVarE.r();
            throw th;
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
        defpackage.bzs bzsVar = this.N;
        bzsVar.b.a();
        bzsVar.a.a();
        this.u = 0L;
        this.j = 0;
        this.H = false;
        this.t = false;
        this.i = false;
        this.l = false;
        this.I = -1;
        defpackage.bzl bzlVar = this.m;
        if (!bzlVar.e) {
            bzlVar.r();
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
        defpackage.bzr bzrVar = this.q;
        bzrVar.a = false;
        bzrVar.j.d();
        bzrVar.c = 0;
        bzrVar.b = true;
        bzrVar.d = 0;
        bzrVar.e.clear();
        bzrVar.f = -1;
        bzrVar.g = -1;
        bzrVar.h = -1;
        bzrVar.i = 0;
        this.L.clear();
        this.e = null;
        this.R = null;
    }

    public final void W() {
        if (!this.o.r) {
            defpackage.bvg.b("Check failed");
        }
        aw();
    }

    @Override // defpackage.bwj
    public final void X() {
        this.L.clear();
        this.g.clear();
        this.y.i();
        this.w = null;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x02f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v14 */
    public final void Y(boolean z) {
        int iHashCode;
        long j;
        long jRotateRight;
        defpackage.vuj vujVar;
        int i;
        boolean z2;
        ?? r8;
        int i2;
        defpackage.vuj vujVar2;
        java.util.List list;
        java.util.List list2;
        java.util.HashSet hashSet;
        defpackage.aaw aawVar;
        int i3;
        int i4;
        int i5;
        long j2;
        int i6;
        int i7;
        int i8;
        long j3;
        int i9;
        int iHashCode2;
        long j4;
        long jRotateRight2;
        defpackage.vuj vujVar3 = this.T;
        int i10 = -1;
        int i11 = ((int[]) vujVar3.b)[vujVar3.a - 2] - 1;
        int i12 = 207;
        if (this.t) {
            defpackage.bzp bzpVar = this.o;
            int i13 = bzpVar.q;
            int iH = bzpVar.h(i13);
            java.lang.Object objR = this.o.r(i13);
            java.lang.Object objQ = this.o.q(i13);
            if (objR == null) {
                long j5 = i11;
                if (objQ == null || iH != 207) {
                    i12 = iH;
                } else {
                    if (!defpackage.afga.f(objQ, defpackage.bvd.a)) {
                        iHashCode2 = objQ.hashCode();
                        j4 = this.u ^ j5;
                    }
                    this.u = java.lang.Long.rotateRight(jRotateRight2, 3);
                }
                jRotateRight2 = ((long) i12) ^ java.lang.Long.rotateRight(j5 ^ this.u, 3);
                this.u = java.lang.Long.rotateRight(jRotateRight2, 3);
            } else if (objR instanceof java.lang.Enum) {
                iHashCode2 = ((java.lang.Enum) objR).ordinal();
                j4 = this.u;
            } else {
                iHashCode2 = objR.hashCode();
                j4 = this.u;
            }
            jRotateRight2 = java.lang.Long.rotateRight(j4, 3) ^ ((long) iHashCode2);
            this.u = java.lang.Long.rotateRight(jRotateRight2, 3);
        } else {
            defpackage.bzl bzlVar = this.m;
            int i14 = bzlVar.h;
            int iB = bzlVar.b(i14);
            java.lang.Object objM = this.m.m(i14);
            java.lang.Object objJ = this.m.j(i14);
            if (objM == null) {
                long j6 = i11;
                if (objJ == null || iB != 207) {
                    i12 = iB;
                } else {
                    if (!defpackage.afga.f(objJ, defpackage.bvd.a)) {
                        iHashCode = objJ.hashCode();
                        j = this.u ^ j6;
                    }
                    this.u = java.lang.Long.rotateRight(jRotateRight, 3);
                }
                jRotateRight = ((long) i12) ^ java.lang.Long.rotateRight(j6 ^ this.u, 3);
                this.u = java.lang.Long.rotateRight(jRotateRight, 3);
            } else if (objM instanceof java.lang.Enum) {
                iHashCode = ((java.lang.Enum) objM).ordinal();
                j = this.u;
            } else {
                iHashCode = objM.hashCode();
                j = this.u;
            }
            jRotateRight = java.lang.Long.rotateRight(j, 3) ^ ((long) iHashCode);
            this.u = java.lang.Long.rotateRight(jRotateRight, 3);
        }
        int i15 = this.F;
        defpackage.bwg bwgVar = this.D;
        if (bwgVar != null) {
            java.util.List list3 = bwgVar.a;
            if (list3.size() > 0) {
                java.util.List list4 = bwgVar.d;
                java.util.HashSet hashSet2 = new java.util.HashSet(list4.size());
                int size = list4.size();
                for (int i16 = 0; i16 < size; i16++) {
                    hashSet2.add(list4.get(i16));
                }
                defpackage.aaw aawVar2 = defpackage.aax.a;
                defpackage.aaw aawVar3 = new defpackage.aaw(6);
                int size2 = list4.size();
                int size3 = list3.size();
                int i17 = 0;
                int i18 = 0;
                int iB2 = 0;
                while (i17 < size3) {
                    defpackage.bzj bzjVar = (defpackage.bzj) list3.get(i17);
                    if (hashSet2.contains(bzjVar)) {
                        vujVar2 = vujVar3;
                        i2 = i10;
                        if (aawVar3.a(bzjVar)) {
                            i17++;
                        } else if (i18 < size2) {
                            defpackage.bzj bzjVar2 = (defpackage.bzj) list4.get(i18);
                            if (bzjVar2 != bzjVar) {
                                int iA = bwgVar.a(bzjVar2);
                                aawVar3.j(bzjVar2);
                                if (iA != iB2) {
                                    int iB3 = bwgVar.b(bzjVar2);
                                    defpackage.bzr bzrVar = this.q;
                                    list = list3;
                                    int i19 = bwgVar.b;
                                    if (iB3 > 0) {
                                        int i20 = iB2 + i19;
                                        list2 = list4;
                                        int i21 = iA + i19;
                                        hashSet = hashSet2;
                                        int i22 = bzrVar.i;
                                        if (i22 > 0) {
                                            aawVar = aawVar3;
                                            if (bzrVar.g == i21 - i22 && bzrVar.h == i20 - i22) {
                                                bzrVar.i = i22 + iB3;
                                            }
                                        } else {
                                            aawVar = aawVar3;
                                        }
                                        bzrVar.h();
                                        bzrVar.g = i21;
                                        bzrVar.h = i20;
                                        bzrVar.i = iB3;
                                    } else {
                                        list2 = list4;
                                        hashSet = hashSet2;
                                        aawVar = aawVar3;
                                    }
                                    if (iA <= iB2) {
                                        i3 = size2;
                                        i4 = size3;
                                        if (iB2 > iA) {
                                            defpackage.zo zoVar = bwgVar.f;
                                            java.lang.Object[] objArr = zoVar.c;
                                            long[] jArr = zoVar.a;
                                            int length = jArr.length - 2;
                                            if (length >= 0) {
                                                int i23 = 0;
                                                while (true) {
                                                    long j7 = jArr[i23];
                                                    long[] jArr2 = jArr;
                                                    java.lang.Object[] objArr2 = objArr;
                                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i24 = 8 - ((~(i23 - length)) >>> 31);
                                                        int i25 = 0;
                                                        while (i25 < i24) {
                                                            if ((j7 & 255) < 128) {
                                                                i5 = i25;
                                                                defpackage.srs srsVar = (defpackage.srs) objArr2[(i23 << 3) + i25];
                                                                j2 = j7;
                                                                int i26 = srsVar.b;
                                                                if (iA <= i26 && i26 < iA + iB3) {
                                                                    i6 = (i26 - iA) + iB2;
                                                                } else if (iA + 1 <= i26 && i26 < iB2) {
                                                                    i6 = i26 - iB3;
                                                                }
                                                                srsVar.b = i6;
                                                            } else {
                                                                i5 = i25;
                                                                j2 = j7;
                                                            }
                                                            j7 = j2 >> 8;
                                                            i25 = i5 + 1;
                                                        }
                                                        if (i24 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i23 == length) {
                                                        break;
                                                    }
                                                    i23++;
                                                    objArr = objArr2;
                                                    jArr = jArr2;
                                                }
                                            }
                                        }
                                    } else {
                                        defpackage.zo zoVar2 = bwgVar.f;
                                        java.lang.Object[] objArr3 = zoVar2.c;
                                        long[] jArr3 = zoVar2.a;
                                        int length2 = jArr3.length - 2;
                                        if (length2 >= 0) {
                                            int i27 = 0;
                                            while (true) {
                                                long j8 = jArr3[i27];
                                                i3 = size2;
                                                i4 = size3;
                                                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i28 = 8 - ((~(i27 - length2)) >>> 31);
                                                    int i29 = 0;
                                                    while (i29 < i28) {
                                                        if ((j8 & 255) < 128) {
                                                            i8 = iB3;
                                                            defpackage.srs srsVar2 = (defpackage.srs) objArr3[(i27 << 3) + i29];
                                                            j3 = j8;
                                                            int i30 = srsVar2.b;
                                                            if (iA <= i30 && i30 < iA + i8) {
                                                                i9 = (i30 - iA) + iB2;
                                                            } else if (iB2 <= i30 && i30 < iA) {
                                                                i9 = i30 + i8;
                                                            }
                                                            srsVar2.b = i9;
                                                        } else {
                                                            i8 = iB3;
                                                            j3 = j8;
                                                        }
                                                        j8 = j3 >> 8;
                                                        i29++;
                                                        iB3 = i8;
                                                    }
                                                    i7 = iB3;
                                                    if (i28 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    i7 = iB3;
                                                }
                                                if (i27 == length2) {
                                                    break;
                                                }
                                                i27++;
                                                size2 = i3;
                                                size3 = i4;
                                                iB3 = i7;
                                            }
                                        }
                                    }
                                } else {
                                    list = list3;
                                    list2 = list4;
                                    hashSet = hashSet2;
                                    aawVar = aawVar3;
                                }
                                i3 = size2;
                                i4 = size3;
                            } else {
                                list = list3;
                                list2 = list4;
                                hashSet = hashSet2;
                                aawVar = aawVar3;
                                i3 = size2;
                                i4 = size3;
                                i17++;
                            }
                            i18++;
                            iB2 += bwgVar.b(bzjVar2);
                            vujVar3 = vujVar2;
                            i10 = i2;
                            list3 = list;
                            hashSet2 = hashSet;
                            list4 = list2;
                            aawVar3 = aawVar;
                            size2 = i3;
                            size3 = i4;
                        }
                    } else {
                        i17++;
                        int iA2 = bwgVar.a(bzjVar);
                        i2 = i10;
                        defpackage.bzr bzrVar2 = this.q;
                        int i31 = iA2 + bwgVar.b;
                        vujVar2 = vujVar3;
                        bzrVar2.k(i31, bzjVar.d);
                        int i32 = bzjVar.c;
                        bwgVar.d(i32, 0);
                        bzrVar2.d(i32);
                        this.m.t(i32);
                        ay();
                        this.m.f();
                        defpackage.bwd.h(this.g, i32, this.m.c(i32) + i32);
                    }
                    vujVar3 = vujVar2;
                    i10 = i2;
                }
                vujVar = vujVar3;
                i = i10;
                defpackage.bzr bzrVar3 = this.q;
                bzrVar3.h();
                if (list3.size() > 0) {
                    bzrVar3.d(this.m.g);
                    this.m.u();
                }
            } else {
                vujVar = vujVar3;
                i = -1;
            }
        } else {
            vujVar = vujVar3;
            i = -1;
        }
        boolean z3 = this.t;
        if (!z3) {
            defpackage.bzl bzlVar2 = this.m;
            int i33 = bzlVar2.k - bzlVar2.j;
            if (i33 > 0) {
                defpackage.bzr bzrVar4 = this.q;
                bzrVar4.g();
                defpackage.cbi cbiVar = (defpackage.cbi) bzrVar4.k.a;
                cbiVar.b(defpackage.caw.a);
                cbiVar.c[cbiVar.d - cbiVar.a[cbiVar.b - 1].b] = i33;
            }
        }
        int i34 = this.E;
        while (!this.m.A()) {
            int i35 = this.m.f;
            ay();
            this.q.k(i34, this.m.f());
            defpackage.bwd.h(this.g, i35, this.m.f);
        }
        if (z3) {
            if (z) {
                defpackage.bzs bzsVar = this.N;
                defpackage.cbi cbiVar2 = bzsVar.b;
                if (!cbiVar2.d()) {
                    defpackage.bvg.b("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                defpackage.cbi cbiVar3 = bzsVar.a;
                defpackage.cbd[] cbdVarArr = cbiVar2.a;
                int i36 = cbiVar2.b - 1;
                cbiVar2.b = i36;
                defpackage.cbd cbdVar = cbdVarArr[i36];
                cbdVarArr[i36] = null;
                cbiVar3.b(cbdVar);
                java.lang.Object[] objArr4 = cbiVar2.e;
                java.lang.Object[] objArr5 = cbiVar3.e;
                int i37 = cbiVar3.f;
                int i38 = cbdVar.c;
                int i39 = cbiVar2.f;
                int i40 = i39 - i38;
                java.lang.System.arraycopy(objArr4, i40, objArr5, i37 - i38, i39 - i40);
                java.lang.Object[] objArr6 = cbiVar2.e;
                int i41 = cbiVar2.f;
                objArr6.getClass();
                java.util.Arrays.fill(objArr6, i41 - i38, i41, (java.lang.Object) null);
                int[] iArr = cbiVar2.c;
                int[] iArr2 = cbiVar3.c;
                int i42 = cbiVar3.d;
                int i43 = cbdVar.b;
                int i44 = cbiVar2.d;
                int i45 = i44 - i43;
                iArr.getClass();
                iArr2.getClass();
                java.lang.System.arraycopy(iArr, i45, iArr2, i42 - i43, i44 - i45);
                cbiVar2.f -= i38;
                cbiVar2.d -= i43;
                i15 = 1;
            }
            defpackage.bzl bzlVar3 = this.m;
            if (bzlVar3.i <= 0) {
                defpackage.bxi.a("Unbalanced begin/end empty");
            }
            bzlVar3.i--;
            defpackage.bzp bzpVar2 = this.o;
            int i46 = bzpVar2.q;
            bzpVar2.V();
            if (!this.m.x()) {
                int i47 = (-2) - i46;
                this.o.x();
                this.o.w(true);
                defpackage.bzh bzhVar = this.M;
                defpackage.bzs bzsVar2 = this.N;
                boolean zC = bzsVar2.a.c();
                defpackage.bzr bzrVar5 = this.q;
                if (zC) {
                    defpackage.bzm bzmVar = this.n;
                    bzrVar5.f();
                    bzrVar5.g();
                    bzrVar5.h();
                    defpackage.cbi cbiVar4 = (defpackage.cbi) bzrVar5.k.a;
                    cbiVar4.b(defpackage.cai.a);
                    r8 = 0;
                    defpackage.cbh.b(cbiVar4, 0, bzhVar, 1, bzmVar);
                } else {
                    defpackage.bzm bzmVar2 = this.n;
                    bzrVar5.f();
                    bzrVar5.g();
                    bzrVar5.h();
                    defpackage.cbi cbiVar5 = (defpackage.cbi) bzrVar5.k.a;
                    cbiVar5.b(defpackage.caj.a);
                    defpackage.cbh.c(cbiVar5, bzhVar, bzmVar2, bzsVar2);
                    this.N = new defpackage.bzs();
                    r8 = 0;
                }
                this.t = r8;
                if (!this.c.c()) {
                    ae(i47, r8);
                    aE(i47, i15);
                }
            }
        } else {
            if (z) {
                this.q.e();
                z2 = true;
            } else {
                z2 = false;
            }
            defpackage.bzr bzrVar6 = this.q;
            int i48 = bzrVar6.a().h;
            defpackage.vuj vujVar4 = bzrVar6.j;
            int i49 = i;
            if (vujVar4.b(i49) > i48) {
                defpackage.bvg.b("Missed recording an endGroup");
            }
            if (vujVar4.b(i49) == i48) {
                bzrVar6.i(false);
                vujVar4.c();
                bzrVar6.k.j();
            }
            int i50 = this.m.h;
            if (i15 != O(i50)) {
                aE(i50, i15);
            }
            if (true == z2) {
                i15 = 1;
            }
            this.m.s();
            bzrVar6.h();
        }
        java.util.ArrayList arrayList = this.C;
        defpackage.bwg bwgVar2 = (defpackage.bwg) arrayList.remove(arrayList.size() - 1);
        if (bwgVar2 != null && !z3) {
            bwgVar2.c++;
        }
        this.D = bwgVar2;
        this.E = vujVar.c() + i15;
        this.G = vujVar.c();
        this.F = vujVar.c() + i15;
    }

    @Override // defpackage.bwj
    public final void Z() {
        if (this.l || this.I != 0) {
            defpackage.bxi.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.I = -1;
        this.i = false;
    }

    public final void aa() {
        this.F += this.m.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [int] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v37 */
    public final void ab(int i, java.lang.Object obj, int i2, java.lang.Object obj2) {
        int iHashCode;
        long j;
        int i3;
        int i4;
        defpackage.bwg bwgVar;
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
        java.lang.Object obj3 = obj;
        aH();
        int i8 = this.G;
        if (obj3 == null) {
            long j2 = i8;
            if (obj2 != null) {
                i3 = 207;
                i7 = i;
                if (i7 == 207) {
                    if (!defpackage.afga.f(obj2, defpackage.bvd.a)) {
                        jRotateLeft = java.lang.Long.rotateLeft(java.lang.Long.rotateLeft(this.u, 3) ^ ((long) obj2.hashCode()), 3);
                    }
                    this.u = j2 ^ jRotateLeft;
                }
                jRotateLeft = java.lang.Long.rotateLeft(java.lang.Long.rotateLeft(this.u, 3) ^ ((long) i3), 3);
                this.u = j2 ^ jRotateLeft;
            } else {
                i7 = i;
            }
            i3 = i7;
            jRotateLeft = java.lang.Long.rotateLeft(java.lang.Long.rotateLeft(this.u, 3) ^ ((long) i3), 3);
            this.u = j2 ^ jRotateLeft;
        } else {
            if (obj3 instanceof java.lang.Enum) {
                iHashCode = ((java.lang.Enum) obj3).ordinal();
                j = this.u;
            } else {
                iHashCode = obj3.hashCode();
                j = this.u;
            }
            this.u = java.lang.Long.rotateLeft(java.lang.Long.rotateLeft(j, 3) ^ ((long) iHashCode), 3);
            i3 = i;
        }
        boolean z3 = true;
        if (obj3 == null) {
            this.G++;
        } else if (i3 == 201) {
            if (defpackage.afga.f(obj3, defpackage.bvg.c)) {
                i3 = 201;
                this.G++;
            } else {
                i3 = 201;
            }
        }
        boolean z4 = i2 != 0;
        int i9 = -1;
        if (this.t) {
            this.m.q();
            defpackage.bzp bzpVar = this.o;
            int i10 = bzpVar.o;
            if (z4) {
                bzpVar.M(i3, defpackage.bvd.a);
            } else {
                if (obj2 != null) {
                    if (obj3 == null) {
                        obj3 = defpackage.bvd.a;
                    }
                    bzpVar.L(i3, obj3, false, obj2);
                } else {
                    if (obj3 == null) {
                        obj3 = defpackage.bvd.a;
                    }
                    bzpVar.K(i3, obj3);
                }
                z3 = false;
            }
            defpackage.bwg bwgVar2 = this.D;
            if (bwgVar2 != null) {
                defpackage.bzj bzjVar = new defpackage.bzj(i3, -1, (-2) - i10, -1);
                bwgVar2.c(bzjVar, this.E - bwgVar2.b);
                bwgVar2.e(bzjVar);
            }
            au(z3, null);
            return;
        }
        boolean z5 = i2 == 1 && this.i;
        if (this.D == null) {
            int iA = this.m.a();
            if (!z5 && iA == i3 && defpackage.afga.f(obj3, this.m.i())) {
                aD(z4, obj2);
                i4 = -1;
            } else {
                defpackage.bzl bzlVar = this.m;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (bzlVar.i <= 0) {
                    int i11 = bzlVar.f;
                    while (i11 < bzlVar.g) {
                        int i12 = i11 * 5;
                        int i13 = i9;
                        int[] iArr = bzlVar.b;
                        int i14 = iArr[i12];
                        java.lang.Object objP = bzlVar.p(iArr, i11);
                        int i15 = iArr[i12 + 1];
                        arrayList.add(new defpackage.bzj(i14, objP, i11, (i15 & 1073741824) != 0 ? 1 : i15 & 67108863));
                        i11 += iArr[i12 + 3];
                        i9 = i13;
                    }
                }
                i4 = i9;
                this.D = new defpackage.bwg(arrayList, this.E);
            }
        } else {
            i4 = -1;
        }
        defpackage.bwg bwgVar3 = this.D;
        if (bwgVar3 != null) {
            java.lang.Object bwlVar = obj3 != null ? new defpackage.bwl(java.lang.Integer.valueOf(i3), obj3) : java.lang.Integer.valueOf(i3);
            defpackage.aau aauVar = ((defpackage.byy) bwgVar3.e.a()).a;
            java.lang.Object objA = aauVar.a(bwlVar);
            if (objA == null) {
                objA = null;
            } else if (objA instanceof defpackage.aan) {
                defpackage.aan aanVar = (defpackage.aan) objA;
                java.lang.Object objH = aanVar.h(0);
                if (aanVar.f()) {
                    aauVar.i(bwlVar);
                }
                if (aanVar.b == 1) {
                    aauVar.m(bwlVar, aanVar.b());
                }
                objA = objH;
            } else {
                aauVar.i(bwlVar);
            }
            defpackage.bzj bzjVar2 = (defpackage.bzj) objA;
            if (z5 || bzjVar2 == null) {
                boolean z6 = z4;
                this.m.q();
                boolean z7 = true;
                this.t = true;
                this.v = null;
                at();
                this.o.v();
                defpackage.bzp bzpVar2 = this.o;
                int i16 = bzpVar2.o;
                if (z6) {
                    bzpVar2.M(i3, defpackage.bvd.a);
                    z = false;
                } else {
                    if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = defpackage.bvd.a;
                        }
                        z = false;
                        bzpVar2.L(i3, obj3, false, obj2);
                    } else {
                        z = false;
                        if (obj3 == null) {
                            obj3 = defpackage.bvd.a;
                        }
                        bzpVar2.K(i3, obj3);
                    }
                    z7 = z;
                }
                this.M = this.o.o(i16);
                defpackage.bzj bzjVar3 = new defpackage.bzj(i3, java.lang.Integer.valueOf(i4), (-2) - i16, i4);
                bwgVar3.c(bzjVar3, this.E - bwgVar3.b);
                bwgVar3.e(bzjVar3);
                bwgVar = new defpackage.bwg(new java.util.ArrayList(), z7 ? z : this.E);
                z4 = z7;
            } else {
                bwgVar3.e(bzjVar2);
                this.E = bwgVar3.a(bzjVar2) + bwgVar3.b;
                defpackage.zo zoVar = bwgVar3.f;
                int i17 = bzjVar2.c;
                defpackage.srs srsVar = (defpackage.srs) zoVar.a(i17);
                int i18 = srsVar != null ? srsVar.c : i4;
                int i19 = bwgVar3.c;
                int i20 = i18 - i19;
                int i21 = 8;
                if (i18 <= i19) {
                    i5 = i20;
                    z2 = z4;
                    if (i19 > i18) {
                        java.lang.Object[] objArr = zoVar.c;
                        long[] jArr3 = zoVar.a;
                        int length = jArr3.length - 2;
                        if (length >= 0) {
                            int i22 = 0;
                            while (true) {
                                long j3 = jArr3[i22];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i23 = 8 - ((~(i22 - length)) >>> 31);
                                    int i24 = 0;
                                    while (i24 < i23) {
                                        if ((j3 & 255) >= 128) {
                                            jArr2 = jArr3;
                                        } else {
                                            defpackage.srs srsVar2 = (defpackage.srs) objArr[(i22 << 3) + i24];
                                            int i25 = srsVar2.c;
                                            if (i25 == i18) {
                                                srsVar2.c = i19;
                                                jArr2 = jArr3;
                                            } else {
                                                jArr2 = jArr3;
                                                if (i18 + 1 <= i25 && i25 < i19) {
                                                    srsVar2.c = i25 - 1;
                                                }
                                            }
                                        }
                                        j3 >>= 8;
                                        i24++;
                                        jArr3 = jArr2;
                                    }
                                    jArr = jArr3;
                                    if (i23 != 8) {
                                        break;
                                    }
                                } else {
                                    jArr = jArr3;
                                }
                                if (i22 == length) {
                                    break;
                                }
                                i22++;
                                jArr3 = jArr;
                            }
                        }
                    }
                } else {
                    java.lang.Object[] objArr2 = zoVar.c;
                    long[] jArr4 = zoVar.a;
                    int length2 = jArr4.length - 2;
                    if (length2 >= 0) {
                        int i26 = 0;
                        char c3 = 7;
                        while (true) {
                            long j4 = jArr4[i26];
                            i5 = i20;
                            z2 = z4;
                            if ((((~j4) << c3) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i27 = 8 - ((~(i26 - length2)) >>> 31);
                                int i28 = 0;
                                while (i28 < i27) {
                                    if ((j4 & 255) < 128) {
                                        c2 = c3;
                                        defpackage.srs srsVar3 = (defpackage.srs) objArr2[(i26 << 3) + i28];
                                        i6 = i21;
                                        int i29 = srsVar3.c;
                                        if (i29 == i18) {
                                            srsVar3.c = i19;
                                        } else if (i19 <= i29 && i29 < i18) {
                                            srsVar3.c = i29 + 1;
                                        }
                                    } else {
                                        c2 = c3;
                                        i6 = i21;
                                    }
                                    j4 >>= i6;
                                    i28++;
                                    i21 = i6;
                                    c3 = c2;
                                }
                                c = c3;
                                if (i27 != i21) {
                                    break;
                                }
                            } else {
                                c = c3;
                            }
                            if (i26 == length2) {
                                break;
                            }
                            i26++;
                            z4 = z2;
                            i20 = i5;
                            c3 = c;
                            i21 = 8;
                        }
                    } else {
                        i5 = i20;
                        z2 = z4;
                    }
                }
                defpackage.bzr bzrVar = this.q;
                bzrVar.d(i17);
                this.m.t(i17);
                if (i5 > 0) {
                    bzrVar.g();
                    defpackage.cbi cbiVar = (defpackage.cbi) bzrVar.k.a;
                    cbiVar.b(defpackage.cak.a);
                    cbiVar.c[cbiVar.d - cbiVar.a[cbiVar.b - 1].b] = i5;
                }
                aD(z2, obj2);
                z4 = z2;
                bwgVar = null;
            }
        } else {
            bwgVar = null;
        }
        au(z4, bwgVar);
    }

    @Override // defpackage.bwj
    public final void ac() {
        this.I = 0;
        this.i = true;
    }

    public final void ad(java.lang.Object obj) {
        if (obj instanceof defpackage.bxw) {
            defpackage.bwh bwhVar = new defpackage.bwh((defpackage.bxw) obj, this.G - 1);
            if (this.t) {
                defpackage.cbi cbiVar = (defpackage.cbi) this.q.k.a;
                cbiVar.b(defpackage.cao.a);
                defpackage.cbh.a(cbiVar, 0, bwhVar);
            }
            this.B.add(obj);
            obj = bwhVar;
        }
        af(obj);
    }

    public final void ae(int i, int i2) {
        if (O(i) != i2) {
            if (i < 0) {
                defpackage.zj zjVar = this.R;
                if (zjVar == null) {
                    zjVar = new defpackage.zj(6);
                    this.R = zjVar;
                }
                zjVar.c(i, i2);
                return;
            }
            int[] iArr = this.e;
            if (iArr == null) {
                int i3 = this.m.c;
                int[] iArr2 = new int[i3];
                java.util.Arrays.fill(iArr2, 0, i3, -1);
                this.e = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final void af(java.lang.Object obj) {
        if (this.t) {
            this.o.X(obj);
            return;
        }
        defpackage.bzl bzlVar = this.m;
        if (!bzlVar.l) {
            defpackage.bzr bzrVar = this.q;
            defpackage.bzh bzhVarG = bzlVar.g(bzlVar.h);
            defpackage.cbi cbiVar = (defpackage.cbi) bzrVar.k.a;
            cbiVar.b(defpackage.bzu.a);
            defpackage.cbh.b(cbiVar, 0, bzhVarG, 1, obj);
            return;
        }
        int iD = bzlVar.j - defpackage.bzo.d(bzlVar.b, bzlVar.h);
        defpackage.bzr bzrVar2 = this.q;
        int i = iD - 1;
        if (bzrVar2.a().h - bzrVar2.c >= 0) {
            bzrVar2.i(true);
            defpackage.cbi cbiVar2 = (defpackage.cbi) bzrVar2.k.a;
            cbiVar2.b(defpackage.cba.a);
            defpackage.cbh.a(cbiVar2, 0, obj);
            cbiVar2.c[cbiVar2.d - cbiVar2.a[cbiVar2.b - 1].b] = i;
            return;
        }
        defpackage.bzl bzlVar2 = this.m;
        defpackage.bzh bzhVarG2 = bzlVar2.g(bzlVar2.h);
        defpackage.cbi cbiVar3 = (defpackage.cbi) bzrVar2.k.a;
        cbiVar3.b(defpackage.cax.a);
        defpackage.cbh.b(cbiVar3, 0, obj, 1, bzhVarG2);
        cbiVar3.c[cbiVar3.d - cbiVar3.a[cbiVar3.b - 1].b] = i;
    }

    @Override // defpackage.bwj
    public final boolean ag(defpackage.bxl bxlVar, java.lang.Object obj) {
        defpackage.bzh bzhVar = bxlVar.e;
        if (bzhVar == null) {
            return false;
        }
        int iD = this.m.a.d(defpackage.bzd.d(bzhVar));
        if (!this.l || iD < this.m.f) {
            return false;
        }
        java.util.List list = this.g;
        int iC = defpackage.bwd.c(list, iD);
        if (iC < 0) {
            int i = iC + 1;
            if (true != (obj instanceof defpackage.bvr)) {
                obj = null;
            }
            list.add(-i, new defpackage.bwk(bxlVar, iD, obj));
        } else {
            defpackage.bwk bwkVar = (defpackage.bwk) list.get(iC);
            if (obj instanceof defpackage.bvr) {
                java.lang.Object obj2 = bwkVar.b;
                if (obj2 == null) {
                    bwkVar.b = obj;
                } else if (obj2 instanceof defpackage.aaw) {
                    ((defpackage.aaw) obj2).j(obj);
                } else {
                    defpackage.aaw aawVar = defpackage.aax.a;
                    defpackage.aaw aawVar2 = new defpackage.aaw(2);
                    aawVar2.h(obj2);
                    aawVar2.h(obj);
                    bwkVar.b = aawVar2;
                }
            } else {
                bwkVar.b = null;
            }
        }
        return true;
    }

    public final defpackage.cdd ah() {
        defpackage.cdd cddVar = this.v;
        return cddVar != null ? cddVar : aI(this.m.h);
    }

    public final defpackage.cdd ai(defpackage.cdd cddVar, defpackage.cdd cddVar2) {
        defpackage.cdc cdcVar = new defpackage.cdc(cddVar);
        cdcVar.putAll(cddVar2);
        defpackage.cdd cddVarG = cdcVar.b();
        ab(204, defpackage.bvg.e, 0, null);
        aF(cddVarG);
        aF(cddVar2);
        Y(false);
        return cddVarG;
    }

    public final void aj(defpackage.cdd cddVar) {
        defpackage.zo zoVar = this.w;
        if (zoVar == null) {
            zoVar = new defpackage.zo(6);
            this.w = zoVar;
        }
        zoVar.g(this.m.f, cddVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0068 A[Catch: all -> 0x022f, TryCatch #2 {all -> 0x022f, blocks: (B:6:0x0029, B:8:0x0056, B:9:0x005c, B:11:0x0060, B:14:0x007a, B:16:0x0086, B:17:0x0090, B:20:0x00a3, B:21:0x00a6, B:69:0x01d1, B:71:0x01f4, B:72:0x01f9, B:74:0x0201, B:75:0x0206, B:79:0x0218, B:83:0x0227, B:84:0x022e, B:13:0x0068, B:22:0x00ac, B:24:0x00b3, B:25:0x00c0, B:28:0x00c6, B:30:0x00ce, B:31:0x00e1, B:33:0x00e9, B:34:0x00ee, B:38:0x0107, B:40:0x010f, B:49:0x0168, B:53:0x0179, B:57:0x0188, B:59:0x0190, B:60:0x019c, B:61:0x01a2, B:63:0x01a6, B:64:0x01b5, B:66:0x01b9, B:67:0x01c6, B:42:0x0126, B:43:0x0137, B:45:0x013b, B:46:0x0150, B:47:0x0153), top: B:94:0x0029, inners: #0 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void ak(defpackage.aau aauVar, defpackage.affg affgVar) {
        long jRotateLeft;
        int iHashCode;
        long jRotateRight;
        long jRotateRight2;
        if (this.l) {
            defpackage.bvg.b("Reentrant composition is not supported");
        }
        long jV = defpackage.cer.b().v();
        this.K = (int) (jV ^ (jV >>> 32));
        this.w = null;
        al(aauVar);
        this.E = 0;
        boolean z = true;
        this.l = true;
        try {
            this.G = 0;
            this.m = this.c.e();
            ab(100, null, 0, null);
            defpackage.bvi bviVar = this.b;
            bviVar.j();
            this.J = true;
            defpackage.cdd cddVarR = bviVar.r();
            this.x.e(this.h ? 1 : 0);
            this.h = C(cddVarR);
            this.v = null;
            if (!this.f) {
                this.f = bviVar.m();
            }
            if (this.k) {
                defpackage.bvm bvmVar = defpackage.cfn.a;
                bvmVar.getClass();
                cddVarR = cddVarR.g(bvmVar, new defpackage.byv(Q()));
            } else {
                boolean zN = bviVar.n();
                this.k = zN;
                if (zN) {
                    defpackage.bvm bvmVar2 = defpackage.cfn.a;
                    bvmVar2.getClass();
                    cddVarR = cddVarR.g(bvmVar2, new defpackage.byv(Q()));
                }
            }
            this.Q = cddVarR;
            java.util.Set set = (java.util.Set) defpackage.dai.az(cddVarR, defpackage.cfp.a);
            if (set != null) {
                set.add(e());
                bviVar.g(set);
            }
            long jA = bviVar.a();
            ab((int) (jA ^ (jA >>> 32)), null, 0, null);
            java.lang.Object objR = R();
            if (objR != affgVar && affgVar != null) {
                af(affgVar);
            }
            defpackage.cex cexVar = this.S;
            defpackage.bzc bzcVarA = defpackage.byp.a();
            try {
                bzcVarA.n(cexVar);
                if (affgVar != null) {
                    ab(200, defpackage.bvg.b, 0, null);
                    defpackage.dai.aq(this, affgVar);
                    Y(false);
                } else if (this.h && objR != null && !defpackage.afga.f(objR, defpackage.bvd.a)) {
                    ab(200, defpackage.bvg.b, 0, null);
                    defpackage.afgz.g(objR, 2);
                    defpackage.dai.aq(this, (defpackage.affg) objR);
                    Y(false);
                } else if (this.g.isEmpty()) {
                    aa();
                } else {
                    defpackage.bzl bzlVar = this.m;
                    int iA = bzlVar.a();
                    java.lang.Object objI = bzlVar.i();
                    java.lang.Object objH = bzlVar.h();
                    int i = this.G;
                    int i2 = 207;
                    if (objI != null) {
                        if (objI instanceof java.lang.Enum) {
                            jRotateLeft = java.lang.Long.rotateLeft(((long) ((java.lang.Enum) objI).ordinal()) ^ java.lang.Long.rotateLeft(this.u, 3), 3);
                        } else {
                            jRotateLeft = java.lang.Long.rotateLeft(((long) objI.hashCode()) ^ java.lang.Long.rotateLeft(this.u, 3), 3);
                        }
                        this.u = jRotateLeft;
                        iA = iA;
                    } else if (objH == null || iA != 207) {
                        this.u = java.lang.Long.rotateLeft(java.lang.Long.rotateLeft(this.u, 3) ^ ((long) iA), 3) ^ ((long) i);
                    } else if (defpackage.afga.f(objH, defpackage.bvd.a)) {
                        iA = 207;
                        this.u = java.lang.Long.rotateLeft(java.lang.Long.rotateLeft(this.u, 3) ^ ((long) iA), 3) ^ ((long) i);
                    } else {
                        this.u = java.lang.Long.rotateLeft(java.lang.Long.rotateLeft(this.u, 3) ^ ((long) objH.hashCode()), 3) ^ ((long) i);
                        iA = 207;
                    }
                    aD((bzlVar.b[(bzlVar.f * 5) + 1] & 1073741824) != 0, null);
                    ax();
                    bzlVar.s();
                    if (objI == null) {
                        if (objH == null || iA != 207) {
                            i2 = iA;
                        } else {
                            if (!defpackage.afga.f(objH, defpackage.bvd.a)) {
                                iHashCode = objH.hashCode();
                                jRotateRight = java.lang.Long.rotateRight(this.u ^ ((long) i), 3);
                            }
                            this.u = jRotateRight2;
                        }
                        jRotateRight2 = java.lang.Long.rotateRight(java.lang.Long.rotateRight(this.u ^ ((long) i), 3) ^ ((long) i2), 3);
                        this.u = jRotateRight2;
                    } else if (objI instanceof java.lang.Enum) {
                        iHashCode = ((java.lang.Enum) objI).ordinal();
                        jRotateRight = java.lang.Long.rotateRight(this.u, 3);
                    } else {
                        iHashCode = objI.hashCode();
                        jRotateRight = java.lang.Long.rotateRight(this.u, 3);
                    }
                    jRotateRight2 = java.lang.Long.rotateRight(jRotateRight ^ ((long) iHashCode), 3);
                    this.u = jRotateRight2;
                }
                bzcVarA.c(bzcVarA.b - 1);
                Y(false);
                this.J = false;
                this.b.f();
                Y(false);
                defpackage.bzr bzrVar = this.q;
                bzrVar.b();
                bzrVar.f();
                if (bzrVar.j.a != 0) {
                    defpackage.bvg.b("Missed recording an endGroup()");
                }
                if (!this.C.isEmpty()) {
                    defpackage.bvg.b("Start/end imbalance");
                }
                V();
                this.m.r();
                if (this.x.c() == 0) {
                    z = false;
                }
                this.h = z;
                this.l = false;
                this.g.clear();
                W();
            } catch (java.lang.Throwable th) {
                bzcVarA.c(bzcVarA.b - 1);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            try {
                defpackage.vm.a(th2, new defpackage.bjd(this, 17));
                throw th2;
            } catch (java.lang.Throwable th3) {
                this.l = false;
                this.g.clear();
                U();
                W();
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0094 A[LOOP:1: B:19:0x0044->B:35:0x0094, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0097 A[EDGE_INSN: B:48:0x0097->B:36:0x0097 BREAK  A[LOOP:1: B:19:0x0044->B:35:0x0094], SYNTHETIC] */
    @Override // defpackage.bwj
    public final void al(defpackage.aau aauVar) {
        int i;
        java.util.List list = this.g;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            defpackage.bwk bwkVar = (defpackage.bwk) list.get(size);
            defpackage.bzh bzhVar = ((defpackage.bxl) bwkVar.c).e;
            defpackage.bzh bzhVarD = bzhVar != null ? defpackage.bzd.d(bzhVar) : null;
            if (bzhVarD == null || !bzhVarD.a()) {
                list.remove(size);
            } else {
                int i2 = bwkVar.a;
                int i3 = bzhVarD.a;
                if (i2 != i3) {
                    bwkVar.a = i3;
                }
            }
        }
        java.lang.Object[] objArr = aauVar.b;
        java.lang.Object[] objArr2 = aauVar.c;
        long[] jArr = aauVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j = jArr[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i4 != length) {
                        break;
                        break;
                    }
                    i4++;
                } else {
                    int i5 = ~(i4 - length);
                    int i6 = 0;
                    while (true) {
                        i = 8 - (i5 >>> 31);
                        if (i6 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i7 = (i4 << 3) + i6;
                            java.lang.Object obj = objArr[i7];
                            java.lang.Object obj2 = objArr2[i7];
                            obj.getClass();
                            defpackage.bxl bxlVar = (defpackage.bxl) obj;
                            defpackage.bzh bzhVar2 = bxlVar.e;
                            if (bzhVar2 != null) {
                                int i8 = defpackage.bzd.d(bzhVar2).a;
                                if (obj2 == defpackage.byb.a) {
                                    obj2 = null;
                                }
                                list.add(new defpackage.bwk(bxlVar, i8, obj2));
                            }
                        }
                        j >>= 8;
                        i6++;
                    }
                    if (i != 8) {
                        break;
                    } else if (i4 != length) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        defpackage.afga.am(list, defpackage.bwd.a);
    }

    public final void am(defpackage.bwr bwrVar, defpackage.cdd cddVar, java.lang.Object obj) {
        ab(126665345, bwrVar, 0, null);
        aF(obj);
        long j = this.u;
        try {
            this.u = 126665345L;
            if (this.t) {
                defpackage.bzp bzpVar = this.o;
                bzpVar.D(bzpVar.q);
            }
            boolean z = (this.t || defpackage.afga.f(this.m.h(), cddVar)) ? false : true;
            if (z) {
                aj(cddVar);
            }
            ab(202, defpackage.bvg.d, 0, cddVar);
            this.v = null;
            boolean z2 = this.h;
            this.h = z;
            defpackage.dai.aq(this, new defpackage.ccz(-59194059, true, new defpackage.abw(10)));
            this.h = z2;
            Y(false);
            this.v = null;
            this.u = j;
            Y(false);
        } catch (java.lang.Throwable th) {
            try {
                defpackage.vm.a(th, new defpackage.bjd(this, 16));
                throw th;
            } catch (java.lang.Throwable th2) {
                Y(false);
                this.v = null;
                this.u = j;
                Y(false);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0057 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:10:0x0027, B:9:0x0024, B:13:0x002e, B:16:0x0036, B:19:0x003e, B:21:0x0046, B:23:0x004c, B:24:0x0050, B:25:0x0051, B:27:0x0057, B:20:0x0042), top: B:35:0x0005, inners: #0 }] */
    public final void an(defpackage.bvk bvkVar, defpackage.bvk bvkVar2, java.lang.Integer num, java.util.List list, defpackage.afer aferVar) {
        java.lang.Object objInvoke;
        boolean z = this.l;
        int i = this.E;
        try {
            this.l = true;
            this.E = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                defpackage.afau afauVar = (defpackage.afau) list.get(i2);
                defpackage.bxl bxlVar = (defpackage.bxl) afauVar.a;
                java.lang.Object obj = afauVar.b;
                if (obj != null) {
                    ag(bxlVar, obj);
                } else {
                    ag(bxlVar, null);
                }
            }
            if (bvkVar == null) {
                aferVar.invoke();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (bvkVar2 == null || defpackage.afga.f(bvkVar2, bvkVar) || iIntValue < 0) {
                    objInvoke = aferVar.invoke();
                } else {
                    bvkVar.h = bvkVar2;
                    bvkVar.i = iIntValue;
                    try {
                        objInvoke = aferVar.invoke();
                        bvkVar.h = null;
                        bvkVar.i = 0;
                    } catch (java.lang.Throwable th) {
                        bvkVar.h = null;
                        bvkVar.i = 0;
                        throw th;
                    }
                }
                if (objInvoke == null) {
                    aferVar.invoke();
                }
            }
            this.l = z;
            this.E = i;
        } catch (java.lang.Throwable th2) {
            this.l = z;
            this.E = i;
            throw th2;
        }
    }

    public final defpackage.adnr ao() {
        java.util.List arrayList;
        if (!this.b.o()) {
            return null;
        }
        defpackage.afct afctVar = new defpackage.afct(10);
        defpackage.bzp bzpVar = this.o;
        afctVar.addAll(defpackage.vm.d(bzpVar, bzpVar.o, null));
        defpackage.bzl bzlVar = this.m;
        if (bzlVar.e || bzlVar.c == 0) {
            arrayList = defpackage.afce.a;
        } else {
            arrayList = new java.util.ArrayList();
            int iE = bzlVar.h;
            java.lang.Object objValueOf = java.lang.Integer.valueOf(bzlVar.j - defpackage.bzo.d(bzlVar.b, iE));
            while (iE >= 0) {
                defpackage.cdp.d(bzlVar.b(iE), bzlVar.z(iE) ? bzlVar.m(iE) : defpackage.bvd.a, bzlVar.a.j(iE), objValueOf, arrayList);
                objValueOf = bzlVar.g(iE);
                iE = bzlVar.e(iE);
            }
        }
        afctVar.addAll(arrayList);
        afctVar.addAll(T());
        return new defpackage.adnr(afctVar.f(), this.k);
    }

    @Override // defpackage.bve
    public final long b() {
        return this.u;
    }

    @Override // defpackage.bve
    public final defpackage.bve c(int i) {
        defpackage.bxl bxlVar;
        boolean z;
        v(i);
        if (this.t) {
            defpackage.bxl bxlVar2 = new defpackage.bxl(this.d);
            this.L.add(bxlVar2);
            af(bxlVar2);
            av(bxlVar2);
            return this;
        }
        defpackage.bwk bwkVarE = defpackage.bwd.e(this.g, this.m.h);
        java.lang.Object objN = this.m.n();
        if (defpackage.afga.f(objN, defpackage.bvd.a)) {
            bxlVar = new defpackage.bxl(this.d);
            af(bxlVar);
        } else {
            objN.getClass();
            bxlVar = (defpackage.bxl) objN;
        }
        if (bwkVarE == null) {
            int i2 = bxlVar.b;
            if ((i2 & 64) != 0) {
                bxlVar.b = i2 & (-65);
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        bxlVar.e(z);
        this.L.add(bxlVar);
        av(bxlVar);
        if ((bxlVar.b & 256) != 0) {
            bxlVar.d(false);
            bxlVar.h(true);
            defpackage.cbi cbiVar = (defpackage.cbi) this.q.k.a;
            cbiVar.b(defpackage.cav.a);
            defpackage.cbh.a(cbiVar, 0, bxlVar);
            if (!this.i && bxlVar.l()) {
                this.i = true;
                this.I = this.m.h;
                bxlVar.g(true);
            }
        }
        return this;
    }

    @Override // defpackage.bve
    public final defpackage.bvi d() {
        defpackage.bwc bwcVar;
        ab(206, defpackage.bvg.f, 0, null);
        if (this.t) {
            defpackage.bzp bzpVar = this.o;
            bzpVar.D(bzpVar.q);
        }
        java.lang.Object objR = R();
        defpackage.bxx byaVar = objR instanceof defpackage.bxx ? (defpackage.bxx) objR : null;
        if (byaVar == null) {
            bwcVar = this;
            byaVar = new defpackage.bya(new defpackage.bwa(new defpackage.bwb(bwcVar, this.u, this.f, this.k)));
            bwcVar.af(byaVar);
        } else {
            bwcVar = this;
        }
        defpackage.bxw bxwVarA = byaVar.a();
        bxwVarA.getClass();
        defpackage.bwb bwbVar = ((defpackage.bwa) bxwVarA).a;
        bwbVar.a.b(bwcVar.ah());
        bwcVar.Y(false);
        return bwbVar;
    }

    @Override // defpackage.bve
    public final defpackage.cfk e() {
        defpackage.cfk cfkVar = this.P;
        if (cfkVar != null) {
            return cfkVar;
        }
        defpackage.bwe bweVar = new defpackage.bwe(this.d);
        this.P = bweVar;
        return bweVar;
    }

    @Override // defpackage.bve
    public final java.lang.Object f(defpackage.bvm bvmVar) {
        return defpackage.dai.az(ah(), bvmVar);
    }

    @Override // defpackage.bve
    public final java.lang.Object g() {
        return S();
    }

    @Override // defpackage.bve
    public final defpackage.afdo h() {
        return this.s;
    }

    @Override // defpackage.bve
    public final void i(java.lang.Object obj, defpackage.affg affgVar) {
        if (this.t) {
            defpackage.cbi cbiVar = this.N.a;
            cbiVar.b(defpackage.caz.a);
            defpackage.cbh.a(cbiVar, 0, obj);
            affgVar.getClass();
            defpackage.afgz.g(affgVar, 2);
            defpackage.cbh.a(cbiVar, 1, affgVar);
            return;
        }
        defpackage.bzr bzrVar = this.q;
        bzrVar.f();
        defpackage.cbi cbiVar2 = (defpackage.cbi) bzrVar.k.a;
        cbiVar2.b(defpackage.caz.a);
        affgVar.getClass();
        defpackage.afgz.g(affgVar, 2);
        defpackage.cbh.b(cbiVar2, 0, obj, 1, affgVar);
    }

    @Override // defpackage.bve
    public final void j(defpackage.afer aferVar) {
        aG();
        if (!this.t) {
            defpackage.bvg.b("createNode() can only be called when inserting");
        }
        defpackage.vuj vujVar = this.T;
        int i = ((int[]) vujVar.b)[vujVar.a - 1];
        defpackage.bzp bzpVar = this.o;
        defpackage.bzh bzhVarO = bzpVar.o(bzpVar.q);
        this.F++;
        defpackage.bzs bzsVar = this.N;
        defpackage.cbi cbiVar = bzsVar.a;
        cbiVar.b(defpackage.cah.a);
        defpackage.cbh.a(cbiVar, 0, aferVar);
        cbiVar.c[cbiVar.d - cbiVar.a[cbiVar.b - 1].b] = i;
        defpackage.cbh.a(cbiVar, 1, bzhVarO);
        defpackage.cbi cbiVar2 = bzsVar.b;
        cbiVar2.b(defpackage.cam.a);
        cbiVar2.c[cbiVar2.d - cbiVar2.a[cbiVar2.b - 1].b] = i;
        defpackage.cbh.a(cbiVar2, 0, bzhVarO);
    }

    @Override // defpackage.bve
    public final void k(boolean z) {
        if (this.F != 0) {
            defpackage.bvg.b("No nodes can be emitted before calling deactivateToEndGroup");
        }
        if (this.t) {
            return;
        }
        if (!z) {
            aC();
            return;
        }
        defpackage.bzl bzlVar = this.m;
        int i = bzlVar.f;
        int i2 = bzlVar.g;
        defpackage.bzr bzrVar = this.q;
        bzrVar.i(false);
        ((defpackage.cbi) bzrVar.k.a).b(defpackage.bzy.a);
        defpackage.bwd.h(this.g, i, i2);
        this.m.u();
    }

    @Override // defpackage.bve
    public final void l() {
        Y(false);
        defpackage.bxl bxlVarP = P();
        if (bxlVarP == null || !bxlVarP.n()) {
            return;
        }
        bxlVarP.b |= 2;
    }

    @Override // defpackage.bve
    public final void m() {
        Y(false);
    }

    @Override // defpackage.bve
    public final void n() {
        Y(true);
    }

    @Override // defpackage.bve
    public final void o() {
        Y(false);
    }

    @Override // defpackage.bve
    public final void p() {
        Y(false);
    }

    @Override // defpackage.bve
    public final void q() {
        if (this.i && this.m.h == this.I) {
            this.I = -1;
            this.i = false;
        }
        Y(false);
    }

    @Override // defpackage.bve
    public final void r(defpackage.afer aferVar) {
        defpackage.cbi cbiVar = (defpackage.cbi) this.q.k.a;
        cbiVar.b(defpackage.cat.a);
        defpackage.cbh.a(cbiVar, 0, aferVar);
    }

    @Override // defpackage.bve
    public final void s() {
        if (this.F != 0) {
            defpackage.bvg.b("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.t) {
            return;
        }
        defpackage.bxl bxlVarP = P();
        if (bxlVarP != null && !bxlVarP.l()) {
            bxlVarP.j(true);
        }
        if (this.g.isEmpty()) {
            aC();
        } else {
            ax();
        }
    }

    @Override // defpackage.bve
    public final void t(int i, java.lang.Object obj) {
        ab(i, obj, 0, null);
    }

    @Override // defpackage.bve
    public final void u() {
        ab(125, null, 1, null);
        this.H = true;
    }

    @Override // defpackage.bve
    public final void v(int i) {
        int i2;
        if (this.D != null) {
            ab(i, null, 0, null);
            return;
        }
        aH();
        this.u = java.lang.Long.rotateLeft(java.lang.Long.rotateLeft(this.u, 3) ^ ((long) i), 3) ^ ((long) this.G);
        this.G++;
        defpackage.bzl bzlVar = this.m;
        if (this.t) {
            bzlVar.q();
            this.o.K(i, defpackage.bvd.a);
            au(false, null);
            return;
        }
        if (bzlVar.a() == i && ((i2 = bzlVar.f) >= bzlVar.g || (bzlVar.b[(i2 * 5) + 1] & 536870912) == 0)) {
            bzlVar.v();
            au(false, null);
            return;
        }
        if (!bzlVar.A()) {
            int i3 = this.E;
            int i4 = bzlVar.f;
            ay();
            this.q.k(i3, bzlVar.f());
            defpackage.bwd.h(this.g, i4, bzlVar.f);
        }
        bzlVar.q();
        this.t = true;
        this.v = null;
        at();
        defpackage.bzp bzpVar = this.o;
        bzpVar.v();
        int i5 = bzpVar.o;
        bzpVar.K(i, defpackage.bvd.a);
        this.M = bzpVar.o(i5);
        au(false, null);
    }

    @Override // defpackage.bve
    public final void w() {
        ab(125, null, 2, null);
        this.H = true;
    }

    @Override // defpackage.bve
    public final void x(java.lang.Object obj) {
        ad(obj);
    }

    @Override // defpackage.bve
    public final void y() {
        boolean z;
        aG();
        if (this.t) {
            defpackage.bvg.b("useNode() called while inserting");
        }
        defpackage.bzl bzlVar = this.m;
        java.lang.Object objO = bzlVar.o(bzlVar.h);
        defpackage.bzr bzrVar = this.q;
        bzrVar.c(objO);
        if (this.i && ((z = objO instanceof defpackage.buy))) {
            bzrVar.f();
            defpackage.khb khbVar = bzrVar.k;
            if (z) {
                ((defpackage.cbi) khbVar.a).b(defpackage.cbc.a);
            }
        }
    }

    @Override // defpackage.bwj, defpackage.bve
    public final boolean z(float f) {
        java.lang.Object objR = R();
        if ((objR instanceof java.lang.Float) && f == ((java.lang.Number) objR).floatValue()) {
            return false;
        }
        af(java.lang.Float.valueOf(f));
        return true;
    }

    @Override // defpackage.bve
    public final void M() {
    }
}
