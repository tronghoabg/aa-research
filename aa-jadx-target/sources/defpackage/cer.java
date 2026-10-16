package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cer {
    public static defpackage.ceq c;
    public static long d;
    public static java.util.List f;
    public static java.util.List g;
    public static final defpackage.cec h;
    private static final defpackage.ccu j;
    public static final defpackage.affc a = new defpackage.bwy(6);
    public static final defpackage.lam i = new defpackage.lam((byte[]) null);
    public static final java.lang.Object b = new java.lang.Object();
    public static final defpackage.ceo e = new defpackage.ceo();
    private static final defpackage.den k = new defpackage.den(null);

    static {
        c = defpackage.ceq.a;
        d = 2L;
        defpackage.afce afceVar = defpackage.afce.a;
        f = afceVar;
        g = afceVar;
        long j2 = d;
        d = 1 + j2;
        defpackage.cec cecVar = new defpackage.cec(j2, defpackage.ceq.a);
        c = c.d(cecVar.i);
        h = cecVar;
        j = new defpackage.ccu();
    }

    public static final defpackage.cej a(defpackage.cej cejVar, defpackage.affc affcVar, boolean z) {
        boolean z2 = cejVar instanceof defpackage.ced;
        if (z2 || cejVar == null) {
            return new defpackage.cfh(z2 ? (defpackage.ced) cejVar : null, affcVar, null, false, z);
        }
        return new defpackage.cfi(cejVar, affcVar, false, z);
    }

    public static final defpackage.cej b() {
        defpackage.cej cejVar = (defpackage.cej) i.j();
        return cejVar == null ? h : cejVar;
    }

    public static final defpackage.ceq c(defpackage.ceq ceqVar, long j2, long j3) {
        while (defpackage.afga.c(j2, j3) < 0) {
            ceqVar = ceqVar.d(j2);
            j2++;
        }
        return ceqVar;
    }

    public static final defpackage.cfe d(defpackage.cfe cfeVar, defpackage.cej cejVar) {
        defpackage.cfe cfeVarI;
        defpackage.cfe cfeVarI2 = i(cfeVar, cejVar.v(), cejVar.x());
        if (cfeVarI2 != null) {
            return cfeVarI2;
        }
        synchronized (b) {
            cfeVarI = i(cfeVar, cejVar.v(), cejVar.x());
        }
        if (cfeVarI != null) {
            return cfeVarI;
        }
        throw new java.lang.IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final defpackage.cfe e(defpackage.cfe cfeVar, defpackage.cfc cfcVar) {
        defpackage.cfe cfeVarI;
        defpackage.cej cejVarB = b();
        defpackage.cfe cfeVarI2 = i(cfeVar, cejVarB.v(), cejVarB.x());
        if (cfeVarI2 != null) {
            return cfeVarI2;
        }
        synchronized (b) {
            defpackage.cej cejVarB2 = b();
            defpackage.cfe cfeVarC = cfcVar.getA();
            cfeVarC.getClass();
            cfeVarI = i(cfeVarC, cejVarB2.v(), cejVarB2.x());
        }
        if (cfeVarI != null) {
            return cfeVarI;
        }
        throw new java.lang.IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final defpackage.cfe f(defpackage.cfe cfeVar, defpackage.cfc cfcVar) {
        long jA = e.a(d) - 1;
        defpackage.ceq ceqVar = defpackage.ceq.a;
        defpackage.cfe cfeVar2 = null;
        defpackage.cfe cfeVar3 = null;
        for (defpackage.cfe cfeVarC = cfcVar.getA(); cfeVarC != null; cfeVarC = cfeVarC.h) {
            long j2 = cfeVarC.g;
            if (j2 != 0) {
                if (v(jA, j2, ceqVar)) {
                    if (cfeVar3 == null) {
                        cfeVar3 = cfeVarC;
                    } else if (defpackage.afga.c(cfeVarC.g, cfeVar3.g) >= 0) {
                        cfeVar2 = cfeVar3;
                        break;
                    }
                }
            }
            cfeVar2 = cfeVarC;
            break;
        }
        if (cfeVar2 != null) {
            cfeVar2.g = Long.MAX_VALUE;
            return cfeVar2;
        }
        defpackage.cfe cfeVarA = cfeVar.a(Long.MAX_VALUE);
        cfeVarA.h = cfcVar.getA();
        cfcVar.d(cfeVarA);
        return cfeVarA;
    }

    public static final defpackage.cfe g(defpackage.cfe cfeVar, defpackage.cfc cfcVar, defpackage.cej cejVar, defpackage.cfe cfeVar2) {
        defpackage.cfe cfeVarF;
        if (cejVar.r()) {
            cejVar.n(cfcVar);
        }
        long jV = cejVar.v();
        if (cfeVar2.g == jV) {
            return cfeVar2;
        }
        synchronized (b) {
            cfeVarF = f(cfeVar, cfcVar);
        }
        cfeVarF.g = jV;
        cejVar.n(cfcVar);
        return cfeVarF;
    }

    public static final defpackage.cfe h(defpackage.cfe cfeVar, defpackage.cfc cfcVar) {
        defpackage.cfe cfeVarI;
        defpackage.cej cejVarB = b();
        defpackage.affc affcVarI = cejVarB.i();
        if (affcVarI != null) {
            affcVarI.invoke(cfcVar);
        }
        defpackage.cfe cfeVarI2 = i(cfeVar, cejVarB.v(), cejVarB.x());
        if (cfeVarI2 != null) {
            return cfeVarI2;
        }
        synchronized (b) {
            defpackage.cej cejVarB2 = b();
            defpackage.cfe cfeVarC = cfcVar.getA();
            cfeVarC.getClass();
            cfeVarI = i(cfeVarC, cejVarB2.v(), cejVarB2.x());
            if (cfeVarI == null) {
                throw new java.lang.IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
            }
        }
        return cfeVarI;
    }

    public static final defpackage.cfe i(defpackage.cfe cfeVar, long j2, defpackage.ceq ceqVar) {
        defpackage.cfe cfeVar2 = null;
        while (cfeVar != null) {
            if (v(j2, cfeVar.g, ceqVar) && (cfeVar2 == null || defpackage.afga.c(cfeVar2.g, cfeVar.g) < 0)) {
                cfeVar2 = cfeVar;
            }
            cfeVar = cfeVar.h;
        }
        if (cfeVar2 != null) {
            return cfeVar2;
        }
        return null;
    }

    public static final defpackage.cfe j(defpackage.cfe cfeVar, defpackage.cfc cfcVar, defpackage.cej cejVar) {
        defpackage.cfe cfeVarI;
        defpackage.cfe cfeVarI2;
        if (cejVar.r()) {
            cejVar.n(cfcVar);
        }
        long jV = cejVar.v();
        defpackage.cfe cfeVarI3 = i(cfeVar, jV, cejVar.x());
        if (cfeVarI3 == null) {
            synchronized (b) {
                defpackage.cej cejVarB = b();
                defpackage.cfe cfeVar2 = ((androidx.compose.runtime.snapshots.SnapshotStateList) cfcVar).a;
                cfeVar2.getClass();
                cfeVarI2 = i(cfeVar2, cejVarB.v(), cejVarB.x());
                if (cfeVarI2 == null) {
                    throw new java.lang.IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                }
            }
            cfeVarI3 = cfeVarI2;
        }
        if (cfeVarI3.g == cejVar.v()) {
            return cfeVarI3;
        }
        synchronized (b) {
            cfeVarI = i(((androidx.compose.runtime.snapshots.SnapshotStateList) cfcVar).a, jV, cejVar.x());
            if (cfeVarI == null) {
                throw new java.lang.IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
            }
            if (cfeVarI.g != jV) {
                defpackage.cfe cfeVarF = f(cfeVarI, cfcVar);
                cfeVarF.b(cfeVarI);
                cfeVarF.g = cejVar.v();
                cfeVarI = cfeVarF;
            }
        }
        cejVar.n(cfcVar);
        return cfeVarI;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x008a A[LOOP:1: B:27:0x0053->B:38:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x008d A[EDGE_INSN: B:55:0x008d->B:39:0x008d BREAK  A[LOOP:1: B:27:0x0053->B:38:0x008a], SYNTHETIC] */
    public static final java.lang.Object k(defpackage.affc affcVar) {
        defpackage.aaw aawVar;
        java.lang.Object objL;
        int i2;
        defpackage.cec cecVar = h;
        synchronized (b) {
            aawVar = cecVar.g;
            if (aawVar != null) {
                j.addAndGet(1);
            }
            objL = l(cecVar, affcVar);
        }
        if (aawVar != null) {
            try {
                java.util.List list = f;
                defpackage.bzf bzfVar = new defpackage.bzf(aawVar);
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((defpackage.affg) list.get(i3)).invoke(bzfVar, cecVar);
                }
                j.addAndGet(-1);
            } catch (java.lang.Throwable th) {
                j.addAndGet(-1);
                throw th;
            }
        }
        synchronized (b) {
            p();
            if (aawVar != null) {
                java.lang.Object[] objArr = aawVar.b;
                long[] jArr = aawVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j2 = jArr[i4];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i4 != length) {
                                break;
                                break;
                            }
                            i4++;
                        } else {
                            int i5 = ~(i4 - length);
                            int i6 = 0;
                            while (true) {
                                i2 = 8 - (i5 >>> 31);
                                if (i6 >= i2) {
                                    break;
                                }
                                if ((255 & j2) < 128) {
                                    r((defpackage.cfc) objArr[(i4 << 3) + i6]);
                                }
                                j2 >>= 8;
                                i6++;
                            }
                            if (i2 != 8) {
                                break;
                            }
                            if (i4 != length) {
                                break;
                            }
                            i4++;
                        }
                    }
                }
            }
        }
        return objL;
    }

    public static final java.lang.Object l(defpackage.cec cecVar, defpackage.affc affcVar) {
        long j2 = cecVar.i;
        java.lang.Object objInvoke = affcVar.invoke(c.b(j2));
        long j3 = d;
        d = 1 + j3;
        c = c.b(j2);
        cecVar.i = j3;
        cecVar.h = c;
        cecVar.c = 0;
        cecVar.g = null;
        cecVar.z();
        c = c.d(j3);
        return objInvoke;
    }

    public static final java.util.Map m(long j2, defpackage.ced cedVar, defpackage.ceq ceqVar) {
        long[] jArr;
        java.util.Map map;
        long j3;
        defpackage.ceq ceqVar2;
        long[] jArr2;
        char c2;
        long j4;
        defpackage.cfe cfeVarI;
        defpackage.aaw aawVarS = cedVar.s();
        java.util.Map map2 = null;
        if (aawVarS == null) {
            return null;
        }
        long jV = cedVar.v();
        defpackage.ceq ceqVarC = cedVar.x().d(jV).c(cedVar.d);
        java.lang.Object[] objArr = aawVarS.b;
        long[] jArr3 = aawVarS.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return null;
        }
        java.util.HashMap map3 = null;
        int i2 = 0;
        while (true) {
            long j5 = jArr3[i2];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    map = map2;
                    int i5 = 8 - ((~i3) >>> 31);
                    if (i4 >= i5) {
                        jArr = jArr3;
                        j3 = jV;
                        ceqVar2 = ceqVarC;
                        if (i5 == 8) {
                            break;
                        }
                        return map3;
                    }
                    if ((j5 & 255) < 128) {
                        defpackage.cfc cfcVar = (defpackage.cfc) objArr[(i2 << 3) + i4];
                        defpackage.cfe cfeVarC = cfcVar.getA();
                        jArr2 = jArr3;
                        c2 = '\b';
                        defpackage.cfe cfeVarI2 = i(cfeVarC, j2, ceqVar);
                        j4 = jV;
                        if (cfeVarI2 != null && (cfeVarI = i(cfeVarC, j4, ceqVarC)) != null && !defpackage.afga.f(cfeVarI2, cfeVarI)) {
                            defpackage.cfe cfeVarI3 = i(cfeVarC, j4, cedVar.x());
                            if (cfeVarI3 == null) {
                                throw new java.lang.IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                            }
                            defpackage.cfe cfeVarG = cfcVar.g(cfeVarI, cfeVarI2, cfeVarI3);
                            if (cfeVarG == null) {
                                return map;
                            }
                            if (map3 == null) {
                                map3 = new java.util.HashMap();
                            }
                            map3.put(cfeVarI2, cfeVarG);
                        }
                        j5 >>= c2;
                        i4++;
                        jV = j4;
                        map2 = map;
                        ceqVarC = ceqVarC;
                        jArr3 = jArr2;
                    } else {
                        jArr2 = jArr3;
                        c2 = '\b';
                        j4 = jV;
                    }
                    j5 >>= c2;
                    i4++;
                    jV = j4;
                    map2 = map;
                    ceqVarC = ceqVarC;
                    jArr3 = jArr2;
                }
            } else {
                jArr = jArr3;
                map = map2;
                j3 = jV;
                ceqVar2 = ceqVarC;
            }
            if (i2 == length) {
                return map3;
            }
            i2++;
            jV = j3;
            map2 = map;
            ceqVarC = ceqVar2;
            jArr3 = jArr;
        }
    }

    public static final defpackage.affc n(defpackage.affc affcVar, defpackage.affc affcVar2, boolean z) {
        byte[] bArr = null;
        if (true != z) {
            affcVar2 = null;
        }
        if (affcVar == null || affcVar2 == null || affcVar == affcVar2) {
            return affcVar == null ? affcVar2 : affcVar;
        }
        return new defpackage.beh(affcVar, affcVar2, 13, bArr);
    }

    public static final defpackage.affc o(defpackage.affc affcVar, defpackage.affc affcVar2) {
        if (affcVar == null || affcVar2 == null || affcVar == affcVar2) {
            return affcVar == null ? affcVar2 : affcVar;
        }
        return new defpackage.beh(affcVar, affcVar2, 14, null);
    }

    public static final void p() {
        defpackage.den denVar = k;
        int i2 = denVar.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            defpackage.cdj cdjVar = ((defpackage.cdj[]) denVar.c)[i3];
            java.lang.Object obj = cdjVar != null ? cdjVar.get() : null;
            if (obj != null && u((defpackage.cfc) obj)) {
                if (i4 != i3) {
                    ((defpackage.cdj[]) denVar.c)[i4] = cdjVar;
                    int[] iArr = (int[]) denVar.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((defpackage.cdj[]) denVar.c)[i5] = null;
            ((int[]) denVar.b)[i5] = 0;
        }
        if (i4 != i2) {
            denVar.a = i4;
        }
    }

    public static final void q(defpackage.cej cejVar, defpackage.cfc cfcVar) {
        cejVar.q(cejVar.h() + 1);
        defpackage.affc affcVarK = cejVar.k();
        if (affcVarK != null) {
            affcVarK.invoke(cfcVar);
        }
    }

    public static final void r(defpackage.cfc cfcVar) {
        if (u(cfcVar)) {
            defpackage.den denVar = k;
            int i2 = denVar.a;
            int iIdentityHashCode = java.lang.System.identityHashCode(cfcVar);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = denVar.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 <= i4) {
                        int i6 = (i5 + i4) >>> 1;
                        int i7 = ((int[]) denVar.b)[i6];
                        if (i7 >= iIdentityHashCode) {
                            if (i7 <= iIdentityHashCode) {
                                defpackage.cdj cdjVar = ((defpackage.cdj[]) denVar.c)[i6];
                                if (cfcVar != (cdjVar != null ? cdjVar.get() : null)) {
                                    i3 = i6 - 1;
                                    while (true) {
                                        if (i3 >= 0 && ((int[]) denVar.b)[i3] == iIdentityHashCode) {
                                            defpackage.cdj cdjVar2 = ((defpackage.cdj[]) denVar.c)[i3];
                                            if ((cdjVar2 != null ? cdjVar2.get() : null) == cfcVar) {
                                                break;
                                            } else {
                                                i3--;
                                            }
                                        } else {
                                            i6++;
                                            int i8 = denVar.a;
                                            while (true) {
                                                if (i6 >= i8) {
                                                    i5 = denVar.a;
                                                } else if (((int[]) denVar.b)[i6] == iIdentityHashCode) {
                                                    defpackage.cdj cdjVar3 = ((defpackage.cdj[]) denVar.c)[i6];
                                                    if ((cdjVar3 != null ? cdjVar3.get() : null) == cfcVar) {
                                                        i3 = i6;
                                                        break;
                                                    }
                                                    i6++;
                                                } else {
                                                    i3 = -(i6 + 1);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    i3 = i6;
                                    break;
                                }
                            } else {
                                i4 = i6 - 1;
                            }
                        } else {
                            i5 = i6 + 1;
                        }
                    }
                    i3 = -(i5 + 1);
                    break;
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i9 = -(i3 + 1);
            int i10 = i9 + 1;
            java.lang.Object obj = denVar.c;
            int length = ((defpackage.cdj[]) obj).length;
            if (i2 == length) {
                int i11 = i2 - i9;
                int i12 = length + length;
                defpackage.cdj[] cdjVarArr = new defpackage.cdj[i12];
                int[] iArr = new int[i12];
                java.lang.System.arraycopy(obj, i9, cdjVarArr, i10, i11);
                java.lang.System.arraycopy(denVar.c, 0, cdjVarArr, 0, i9);
                java.lang.Object obj2 = denVar.b;
                obj2.getClass();
                java.lang.System.arraycopy(obj2, i9, iArr, i10, i11);
                defpackage.afga.cm((int[]) denVar.b, iArr, 0, i9, 6);
                denVar.c = cdjVarArr;
                denVar.b = iArr;
            } else {
                int i13 = i2 - i9;
                java.lang.System.arraycopy(obj, i9, obj, i10, i13);
                java.lang.Object obj3 = denVar.b;
                obj3.getClass();
                obj3.getClass();
                java.lang.System.arraycopy(obj3, i9, obj3, i10, i13);
            }
            ((defpackage.cdj[]) denVar.c)[i9] = new defpackage.cdj(cfcVar);
            ((int[]) denVar.b)[i9] = iIdentityHashCode;
            denVar.a++;
        }
    }

    public static final void s(defpackage.cej cejVar) {
        java.lang.Long lValueOf;
        if (c.e(cejVar.v())) {
            return;
        }
        long jV = cejVar.v();
        boolean z = cejVar.j;
        defpackage.ced cedVar = cejVar instanceof defpackage.ced ? (defpackage.ced) cejVar : null;
        java.lang.Object objValueOf = cedVar != null ? java.lang.Boolean.valueOf(cedVar.f) : "read-only";
        synchronized (b) {
            lValueOf = java.lang.Long.valueOf(e.a(-1L));
        }
        throw new java.lang.IllegalStateException("Snapshot is not open: snapshotId=" + jV + ", disposed=" + z + ", applied=" + objValueOf + ", lowestPin=" + lValueOf);
    }

    public static final void t() {
        throw new java.lang.IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    private static final boolean u(defpackage.cfc cfcVar) {
        long jA = e.a(d);
        defpackage.cfe cfeVar = null;
        int i2 = 0;
        defpackage.cfe cfeVarC = null;
        for (defpackage.cfe cfeVarC2 = cfcVar.getA(); cfeVarC2 != null; cfeVarC2 = cfeVarC2.h) {
            long j2 = cfeVarC2.g;
            if (j2 != 0) {
                if (defpackage.afga.c(j2, jA) >= 0) {
                    i2++;
                } else if (cfeVar == null) {
                    i2++;
                    cfeVar = cfeVarC2;
                } else {
                    int iC = defpackage.afga.c(j2, cfeVar.g);
                    defpackage.cfe cfeVar2 = iC < 0 ? cfeVarC2 : cfeVar;
                    if (iC >= 0) {
                        cfeVar = cfeVarC2;
                    }
                    if (cfeVarC == null) {
                        cfeVarC = cfcVar.getA();
                        defpackage.cfe cfeVar3 = cfeVarC;
                        while (true) {
                            if (cfeVarC == null) {
                                cfeVarC = cfeVar3;
                                break;
                            }
                            long j3 = cfeVarC.g;
                            if (defpackage.afga.c(j3, jA) >= 0) {
                                break;
                            }
                            if (defpackage.afga.c(cfeVar3.g, j3) < 0) {
                                cfeVar3 = cfeVarC;
                            }
                            cfeVarC = cfeVarC.h;
                        }
                    }
                    cfeVar2.g = 0L;
                    cfeVar2.b(cfeVarC);
                }
            }
        }
        return i2 > 1;
    }

    private static final boolean v(long j2, long j3, defpackage.ceq ceqVar) {
        return (j3 == 0 || defpackage.afga.c(j3, j2) > 0 || ceqVar.e(j3)) ? false : true;
    }
}
