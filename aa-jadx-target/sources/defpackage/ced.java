package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ced extends defpackage.cej {
    private static final int[] l = new int[0];
    public final defpackage.affc a;
    public final defpackage.affc b;
    public int c;
    public defpackage.ceq d;
    public int[] e;
    public boolean f;
    public defpackage.aaw g;
    private java.util.List m;
    private int n;

    public ced(long j, defpackage.ceq ceqVar, defpackage.affc affcVar, defpackage.affc affcVar2) {
        super(j, ceqVar);
        this.a = affcVar;
        this.b = affcVar2;
        this.d = defpackage.ceq.a;
        this.e = l;
        this.n = 1;
    }

    private final void E() {
        if (!this.f || this.k >= 0) {
            return;
        }
        defpackage.bxi.b("Unsupported operation on a disposed or applied snapshot");
    }

    public defpackage.ced a(defpackage.affc affcVar, defpackage.affc affcVar2) {
        defpackage.cee ceeVar;
        C();
        E();
        o(v());
        synchronized (defpackage.cer.b) {
            long j = defpackage.cer.d;
            defpackage.cer.d = j + 1;
            defpackage.cer.c = defpackage.cer.c.d(j);
            defpackage.ceq ceqVarX = x();
            A(ceqVarX.d(j));
            ceeVar = new defpackage.cee(j, defpackage.cer.c(ceqVarX, v() + 1, j), defpackage.cer.n(affcVar, i(), true), defpackage.cer.o(affcVar2, k()), this);
        }
        if (this.f || this.j) {
            return ceeVar;
        }
        long jV = v();
        synchronized (defpackage.cer.b) {
            long j2 = defpackage.cer.d;
            defpackage.cer.d = j2 + 1;
            B(j2);
            defpackage.cer.c = defpackage.cer.c.d(v());
        }
        A(defpackage.cer.c(x(), jV + 1, v()));
        return ceeVar;
    }

    @Override // defpackage.cej
    public defpackage.cej b(defpackage.affc affcVar) {
        defpackage.cef cefVar;
        C();
        E();
        long jV = v();
        o(v());
        synchronized (defpackage.cer.b) {
            long j = defpackage.cer.d;
            defpackage.cer.d = j + 1;
            defpackage.cer.c = defpackage.cer.c.d(j);
            cefVar = new defpackage.cef(j, defpackage.cer.c(x(), jV + 1, j), defpackage.cer.n(affcVar, i(), true), this);
        }
        if (this.f || this.j) {
            return cefVar;
        }
        long jV2 = v();
        synchronized (defpackage.cer.b) {
            long j2 = defpackage.cer.d;
            defpackage.cer.d = j2 + 1;
            B(j2);
            defpackage.cer.c = defpackage.cer.c.d(v());
        }
        A(defpackage.cer.c(x(), jV2 + 1, v()));
        return cefVar;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0102 A[Catch: all -> 0x0161, LOOP:2: B:46:0x00d3->B:56:0x0102, LOOP_END, TryCatch #0 {, blocks: (B:41:0x00b7, B:43:0x00c7, B:46:0x00d3, B:48:0x00df, B:50:0x00e9, B:52:0x00ef, B:53:0x00fa, B:59:0x010b, B:62:0x0115, B:64:0x011f, B:66:0x0129, B:68:0x012f, B:69:0x0139, B:72:0x0141, B:73:0x0144, B:75:0x0148, B:77:0x014f, B:78:0x015b, B:56:0x0102), top: B:88:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0105  */
    /* JADX WARN: Code duplicated, block: B:71:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0141 A[Catch: all -> 0x0161, LOOP:4: B:62:0x0115->B:72:0x0141, LOOP_END, TryCatch #0 {, blocks: (B:41:0x00b7, B:43:0x00c7, B:46:0x00d3, B:48:0x00df, B:50:0x00e9, B:52:0x00ef, B:53:0x00fa, B:59:0x010b, B:62:0x0115, B:64:0x011f, B:66:0x0129, B:68:0x012f, B:69:0x0139, B:72:0x0141, B:73:0x0144, B:75:0x0148, B:77:0x014f, B:78:0x015b, B:56:0x0102), top: B:88:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0109 A[EDGE_INSN: B:94:0x0109->B:58:0x0109 BREAK  A[LOOP:2: B:46:0x00d3->B:56:0x0102], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0144 A[EDGE_INSN: B:99:0x0144->B:73:0x0144 BREAK  A[LOOP:4: B:62:0x0115->B:72:0x0141], SYNTHETIC] */
    public defpackage.cen c() {
        java.util.Map mapM;
        java.util.List list;
        defpackage.aaw aawVar;
        long j;
        long j2;
        defpackage.aaw aawVarS = s();
        if (aawVarS != null) {
            long j3 = defpackage.cer.h.i;
            mapM = defpackage.cer.m(j3, this, defpackage.cer.c.b(j3));
        } else {
            mapM = null;
        }
        defpackage.afce afceVar = defpackage.afce.a;
        synchronized (defpackage.cer.b) {
            defpackage.cer.s(this);
            if (aawVarS == null || aawVarS.d == 0) {
                m();
                defpackage.cec cecVar = defpackage.cer.h;
                defpackage.aaw aawVar2 = cecVar.g;
                defpackage.cer.l(cecVar, defpackage.cer.a);
                if (aawVar2 == null || !aawVar2.c()) {
                    list = afceVar;
                    aawVar = null;
                } else {
                    list = defpackage.cer.f;
                    aawVar = aawVar2;
                }
            } else {
                defpackage.cec cecVar2 = defpackage.cer.h;
                defpackage.cen cenVarT = t(defpackage.cer.d, aawVarS, mapM, defpackage.cer.c.b(cecVar2.i));
                if (!defpackage.afga.f(cenVarT, defpackage.cem.a)) {
                    return cenVarT;
                }
                m();
                aawVar = cecVar2.g;
                defpackage.cer.l(cecVar2, defpackage.cer.a);
                u(null);
                cecVar2.g = null;
                list = defpackage.cer.f;
            }
            this.f = true;
            if (aawVar != null) {
                defpackage.bzf bzfVar = new defpackage.bzf(aawVar);
                if (!bzfVar.isEmpty()) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((defpackage.affg) list.get(i)).invoke(bzfVar, this);
                    }
                }
            }
            if (aawVarS != null && aawVarS.c()) {
                defpackage.bzf bzfVar2 = new defpackage.bzf(aawVarS);
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((defpackage.affg) list.get(i2)).invoke(bzfVar2, this);
                }
            }
            synchronized (defpackage.cer.b) {
                p();
                defpackage.cer.p();
                if (aawVar != null) {
                    java.lang.Object[] objArr = aawVar.b;
                    long[] jArr = aawVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        j = 128;
                        while (true) {
                            long j4 = jArr[i3];
                            j2 = 255;
                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i3 != length) {
                                    break;
                                    break;
                                }
                                i3++;
                            } else {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((j4 & 255) < 128) {
                                        defpackage.cer.r((defpackage.cfc) objArr[(i3 << 3) + i5]);
                                    }
                                    j4 >>= 8;
                                }
                                if (i4 != 8) {
                                    break;
                                }
                                if (i3 != length) {
                                    break;
                                }
                                i3++;
                            }
                        }
                    } else {
                        j = 128;
                        j2 = 255;
                    }
                } else {
                    j = 128;
                    j2 = 255;
                }
                if (aawVarS != null) {
                    java.lang.Object[] objArr2 = aawVarS.b;
                    long[] jArr2 = aawVarS.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j5 = jArr2[i6];
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i6 != length2) {
                                    break;
                                    break;
                                }
                                i6++;
                            } else {
                                int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    if ((j5 & j2) < j) {
                                        defpackage.cer.r((defpackage.cfc) objArr2[(i6 << 3) + i8]);
                                    }
                                    j5 >>= 8;
                                }
                                if (i7 != 8) {
                                    break;
                                }
                                if (i6 != length2) {
                                    break;
                                }
                                i6++;
                            }
                        }
                    }
                }
                java.util.List list2 = this.m;
                if (list2 != null) {
                    int size3 = list2.size();
                    for (int i9 = 0; i9 < size3; i9++) {
                        defpackage.cer.r((defpackage.cfc) list2.get(i9));
                    }
                }
                this.m = null;
            }
            return defpackage.cem.a;
        }
    }

    @Override // defpackage.cej
    public void d() {
        if (this.j) {
            return;
        }
        super.d();
        g();
    }

    @Override // defpackage.cej
    public void e() {
        if (this.f || this.j) {
            return;
        }
        l();
    }

    @Override // defpackage.cej
    public void f() {
        this.n++;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008d A[LOOP:0: B:17:0x0038->B:35:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0090 A[EDGE_INSN: B:39:0x0090->B:36:0x0090 BREAK  A[LOOP:0: B:17:0x0038->B:35:0x008d], SYNTHETIC] */
    @Override // defpackage.cej
    public void g() {
        int i;
        if (this.n <= 0) {
            defpackage.bxi.a("no pending nested snapshots");
        }
        int i2 = this.n - 1;
        this.n = i2;
        if (i2 != 0 || this.f) {
            return;
        }
        defpackage.aaw aawVarS = s();
        if (aawVarS != null) {
            if (this.f) {
                defpackage.bxi.b("Unsupported operation on a snapshot that has been applied");
            }
            u(null);
            long jV = v();
            java.lang.Object[] objArr = aawVarS.b;
            long[] jArr = aawVarS.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        int i4 = ~(i3 - length);
                        int i5 = 0;
                        while (true) {
                            i = 8 - (i4 >>> 31);
                            if (i5 >= i) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                for (defpackage.cfe a = ((defpackage.cfc) objArr[(i3 << 3) + i5]).getA(); a != null; a = a.h) {
                                    long j2 = a.g;
                                    if (j2 == jV || defpackage.afga.bh(this.d, java.lang.Long.valueOf(j2))) {
                                        defpackage.affc affcVar = defpackage.cer.a;
                                        a.g = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                            i5++;
                        }
                        if (i != 8) {
                            break;
                        } else if (i3 != length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        y();
    }

    @Override // defpackage.cej
    public int h() {
        return this.c;
    }

    @Override // defpackage.cej
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public defpackage.affc i() {
        return this.a;
    }

    @Override // defpackage.cej
    public defpackage.affc k() {
        return this.b;
    }

    public final void l() {
        o(v());
        if (this.f || this.j) {
            return;
        }
        long jV = v();
        synchronized (defpackage.cer.b) {
            long j = defpackage.cer.d;
            defpackage.cer.d = j + 1;
            B(j);
            defpackage.cer.c = defpackage.cer.c.d(v());
        }
        A(defpackage.cer.c(x(), jV + 1, v()));
    }

    @Override // defpackage.cej
    public final void m() {
        defpackage.cer.c = defpackage.cer.c.b(v()).a(this.d);
    }

    @Override // defpackage.cej
    public void n(defpackage.cfc cfcVar) {
        defpackage.aaw aawVarS = s();
        if (aawVarS == null) {
            defpackage.aaw aawVar = defpackage.aax.a;
            aawVarS = new defpackage.aaw(6);
            u(aawVarS);
        }
        aawVarS.j(cfcVar);
    }

    public final void o(long j) {
        synchronized (defpackage.cer.b) {
            this.d = this.d.d(j);
        }
    }

    @Override // defpackage.cej
    public final void p() {
        int length = this.e.length;
        for (int i = 0; i < length; i++) {
            defpackage.cer.e.b(this.e[i]);
        }
        z();
    }

    @Override // defpackage.cej
    public void q(int i) {
        this.c = i;
    }

    @Override // defpackage.cej
    public boolean r() {
        return false;
    }

    public defpackage.aaw s() {
        return this.g;
    }

    public final defpackage.cen t(long j, defpackage.aaw aawVar, java.util.Map map, defpackage.ceq ceqVar) {
        java.util.List listAS;
        defpackage.ceq ceqVar2;
        java.lang.Object[] objArr;
        long[] jArr;
        long[] jArr2;
        int i;
        java.util.ArrayList arrayList;
        long j2;
        int i2;
        defpackage.cfe cfeVarG;
        defpackage.ceq ceqVarC = x().d(v()).c(this.d);
        java.lang.Object[] objArr2 = aawVar.b;
        long[] jArr3 = aawVar.a;
        int length = jArr3.length - 2;
        java.util.ArrayList arrayList2 = null;
        if (length >= 0) {
            listAS = null;
            int i3 = 0;
            while (true) {
                long j3 = jArr3[i3];
                java.util.ArrayList arrayList3 = arrayList2;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    objArr = objArr2;
                    arrayList2 = arrayList3;
                    int i5 = 0;
                    while (true) {
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            ceqVar2 = ceqVarC;
                            jArr = jArr3;
                            if (i6 != 8) {
                                break;
                            }
                            break;
                        }
                        if ((j3 & 255) < 128) {
                            defpackage.cfc cfcVar = (defpackage.cfc) objArr[(i3 << 3) + i5];
                            jArr2 = jArr3;
                            defpackage.cfe a = cfcVar.getA();
                            i = i4;
                            arrayList = arrayList2;
                            defpackage.cfe cfeVarI = defpackage.cer.i(a, j, ceqVar);
                            if (cfeVarI != null) {
                                j2 = j3;
                                defpackage.cfe cfeVarI2 = defpackage.cer.i(a, v(), ceqVarC);
                                if (cfeVarI2 != null) {
                                    i2 = i5;
                                    if (cfeVarI2.g == 1 || defpackage.afga.f(cfeVarI, cfeVarI2)) {
                                        ceqVarC = ceqVarC;
                                    } else {
                                        ceqVarC = ceqVarC;
                                        defpackage.cfe cfeVarI3 = defpackage.cer.i(a, v(), x());
                                        if (cfeVarI3 == null) {
                                            throw new java.lang.IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                                        }
                                        if (map == null || (cfeVarG = (defpackage.cfe) map.get(cfeVarI)) == null) {
                                            cfeVarG = cfcVar.g(cfeVarI2, cfeVarI, cfeVarI3);
                                        }
                                        if (cfeVarG == null) {
                                            return new defpackage.cel(this);
                                        }
                                        if (!defpackage.afga.f(cfeVarG, cfeVarI3)) {
                                            if (defpackage.afga.f(cfeVarG, cfeVarI)) {
                                                java.util.ArrayList arrayList4 = arrayList == null ? new java.util.ArrayList() : arrayList;
                                                arrayList4.add(new defpackage.afau(cfcVar, cfeVarI.a(v())));
                                                if (listAS == null) {
                                                    listAS = new java.util.ArrayList();
                                                }
                                                listAS.add(cfcVar);
                                                arrayList2 = arrayList4;
                                            } else {
                                                arrayList2 = arrayList == null ? new java.util.ArrayList() : arrayList;
                                                arrayList2.add(!defpackage.afga.f(cfeVarG, cfeVarI2) ? new defpackage.afau(cfcVar, cfeVarG) : new defpackage.afau(cfcVar, cfeVarI2.a(v())));
                                            }
                                        }
                                    }
                                }
                                j3 = j2 >> 8;
                                i5 = i2 + 1;
                                jArr3 = jArr2;
                                i4 = i;
                                ceqVarC = ceqVarC;
                            } else {
                                j2 = j3;
                            }
                            i2 = i5;
                        } else {
                            ceqVarC = ceqVarC;
                            jArr2 = jArr3;
                            i = i4;
                            arrayList = arrayList2;
                            j2 = j3;
                            i2 = i5;
                        }
                        arrayList2 = arrayList;
                        j3 = j2 >> 8;
                        i5 = i2 + 1;
                        jArr3 = jArr2;
                        i4 = i;
                        ceqVarC = ceqVarC;
                    }
                } else {
                    ceqVar2 = ceqVarC;
                    objArr = objArr2;
                    jArr = jArr3;
                    arrayList2 = arrayList3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                objArr2 = objArr;
                jArr3 = jArr;
                ceqVarC = ceqVar2;
            }
        } else {
            listAS = null;
        }
        if (arrayList2 != null) {
            l();
            int size = arrayList2.size();
            for (int i7 = 0; i7 < size; i7++) {
                defpackage.afau afauVar = (defpackage.afau) arrayList2.get(i7);
                defpackage.cfc cfcVar2 = (defpackage.cfc) afauVar.a;
                defpackage.cfe cfeVar = (defpackage.cfe) afauVar.b;
                cfeVar.g = j;
                synchronized (defpackage.cer.b) {
                    cfeVar.h = cfcVar2.getA();
                    cfcVar2.d(cfeVar);
                }
            }
        }
        if (listAS != null) {
            int size2 = listAS.size();
            for (int i8 = 0; i8 < size2; i8++) {
                aawVar.l((defpackage.cfc) listAS.get(i8));
            }
            java.util.List list = this.m;
            if (list != null) {
                listAS = defpackage.afga.aS(list, listAS);
            }
            this.m = listAS;
        }
        return defpackage.cem.a;
    }

    public void u(defpackage.aaw aawVar) {
        this.g = aawVar;
    }
}
