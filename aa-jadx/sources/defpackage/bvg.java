package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bvg {
    public static int a;
    public static final java.lang.Object b = new defpackage.bxc("provider");
    public static final java.lang.Object c = new defpackage.bxc("provider");
    public static final java.lang.Object d = new defpackage.bxc("compositionLocalMap");
    public static final java.lang.Object e = new defpackage.bxc("providers");
    public static final java.lang.Object f = new defpackage.bxc("reference");

    public static final java.lang.Void a(java.lang.String str) {
        throw new defpackage.bvb(defpackage.a.bp(str, "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void b(java.lang.String str) {
        throw new defpackage.bvb(defpackage.a.bp(str, "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final defpackage.khb c(defpackage.bvk bvkVar, defpackage.bws bwsVar, defpackage.bzp bzpVar, defpackage.buq buqVar) {
        defpackage.bzh bzhVar;
        defpackage.bzm bzmVar;
        int i;
        java.util.List arrayList;
        long[] jArr;
        int i2;
        defpackage.bzh bzhVar2;
        defpackage.bzm bzmVar2;
        long j;
        int i3;
        int i4;
        char c2;
        boolean zB;
        defpackage.bzm bzmVar3;
        long j2;
        int i5;
        defpackage.bzm bzmVar4 = new defpackage.bzm();
        if (bzpVar.e != null) {
            bzmVar4.b();
        }
        if (bzpVar.s != null) {
            bzmVar4.a();
        }
        int i6 = bzpVar.o;
        if (buqVar != null && bzpVar.j(i6) > 0) {
            int iK = bzpVar.q;
            while (iK > 0 && !bzpVar.S(iK)) {
                iK = bzpVar.k(iK);
            }
            if (iK >= 0 && bzpVar.S(iK)) {
                java.lang.Object objS = bzpVar.s(iK);
                int i7 = iK + 1;
                int i8 = iK + bzpVar.i(iK);
                int iJ = 0;
                while (i7 < i8) {
                    int i9 = bzpVar.i(i7) + i7;
                    if (i9 > i6) {
                        break;
                    }
                    iJ += bzpVar.S(i7) ? 1 : bzpVar.j(i7);
                    i7 = i9;
                }
                int iJ2 = bzpVar.S(i6) ? 1 : bzpVar.j(i6);
                buqVar.d(objS);
                buqVar.l(iJ, iJ2);
                buqVar.h();
            }
        }
        defpackage.bzh bzhVar3 = bwsVar.g;
        if (bzhVar3.a()) {
            bvkVar.getClass();
            if (bvkVar.n.e > 0) {
                arrayList = new java.util.ArrayList();
                defpackage.aau aauVar = bvkVar.n;
                long[] jArr2 = aauVar.a;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j3 = jArr2[i10];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = (~(i10 - length)) >>> 31;
                            int i12 = 0;
                            while (true) {
                                i = 1;
                                i2 = 8 - i11;
                                if (i12 >= i2) {
                                    break;
                                }
                                if ((j3 & 255) < 128) {
                                    int i13 = (i10 << 3) + i12;
                                    int i14 = 8;
                                    java.lang.Object obj = aauVar.b[i13];
                                    bzhVar2 = bzhVar3;
                                    java.lang.Object obj2 = aauVar.c[i13];
                                    obj.getClass();
                                    if (obj2 instanceof defpackage.aaw) {
                                        obj2.getClass();
                                        defpackage.aaw aawVar = (defpackage.aaw) obj2;
                                        java.lang.Object[] objArr = aawVar.b;
                                        long[] jArr3 = aawVar.a;
                                        int length2 = jArr3.length - 2;
                                        if (length2 >= 0) {
                                            j = j3;
                                            int i15 = 0;
                                            while (true) {
                                                long j4 = jArr3[i15];
                                                i3 = i11;
                                                i4 = i12;
                                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                    int i17 = 0;
                                                    while (i17 < i16) {
                                                        if ((j4 & 255) < 128) {
                                                            j2 = j4;
                                                            int i18 = (i15 << 3) + i17;
                                                            java.lang.Object obj3 = objArr[i18];
                                                            i5 = i17;
                                                            defpackage.bxl bxlVar = (defpackage.bxl) obj;
                                                            defpackage.bzh bzhVar4 = bxlVar.e;
                                                            if (bzhVar4 != null) {
                                                                bzmVar3 = bzmVar4;
                                                                if (bzpVar.Q(defpackage.bzd.d(bzhVar2), defpackage.bzd.d(bzhVar4))) {
                                                                    arrayList.add(new defpackage.afau(bxlVar, obj3));
                                                                    aawVar.i(i18);
                                                                }
                                                            } else {
                                                                bzmVar3 = bzmVar4;
                                                            }
                                                        } else {
                                                            bzmVar3 = bzmVar4;
                                                            j2 = j4;
                                                            i5 = i17;
                                                        }
                                                        j4 = j2 >> i14;
                                                        i17 = i5 + 1;
                                                        bzmVar4 = bzmVar3;
                                                    }
                                                    bzmVar2 = bzmVar4;
                                                    if (i16 != i14) {
                                                        break;
                                                    }
                                                } else {
                                                    bzmVar2 = bzmVar4;
                                                }
                                                if (i15 == length2) {
                                                    break;
                                                }
                                                i15++;
                                                i11 = i3;
                                                i12 = i4;
                                                bzmVar4 = bzmVar2;
                                                i14 = 8;
                                            }
                                        } else {
                                            bzmVar2 = bzmVar4;
                                            j = j3;
                                            i3 = i11;
                                            i4 = i12;
                                        }
                                        zB = aawVar.b();
                                    } else {
                                        bzmVar2 = bzmVar4;
                                        j = j3;
                                        i3 = i11;
                                        i4 = i12;
                                        obj2.getClass();
                                        defpackage.bxl bxlVar2 = (defpackage.bxl) obj;
                                        defpackage.bzh bzhVar5 = bxlVar2.e;
                                        if (bzhVar5 == null || !bzpVar.Q(defpackage.bzd.d(bzhVar2), defpackage.bzd.d(bzhVar5))) {
                                            zB = false;
                                        } else {
                                            arrayList.add(new defpackage.afau(bxlVar2, obj2));
                                            zB = true;
                                        }
                                    }
                                    if (zB) {
                                        aauVar.j(i13);
                                    }
                                    c2 = '\b';
                                } else {
                                    bzhVar2 = bzhVar3;
                                    bzmVar2 = bzmVar4;
                                    j = j3;
                                    i3 = i11;
                                    i4 = i12;
                                    c2 = '\b';
                                }
                                j3 = j >> c2;
                                i12 = i4 + 1;
                                bzhVar3 = bzhVar2;
                                jArr2 = jArr2;
                                i11 = i3;
                                bzmVar4 = bzmVar2;
                            }
                            bzhVar = bzhVar3;
                            jArr = jArr2;
                            bzmVar = bzmVar4;
                            if (i2 != 8) {
                                break;
                            }
                        } else {
                            bzhVar = bzhVar3;
                            jArr = jArr2;
                            bzmVar = bzmVar4;
                            i = 1;
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                        bzhVar3 = bzhVar;
                        jArr2 = jArr;
                        bzmVar4 = bzmVar;
                    }
                } else {
                    bzhVar = bzhVar3;
                    bzmVar = bzmVar4;
                    i = 1;
                }
            } else {
                bzhVar = bzhVar3;
                bzmVar = bzmVar4;
                i = 1;
                arrayList = defpackage.afce.a;
            }
            bwsVar.d = defpackage.afga.aS(bwsVar.d, arrayList);
        } else {
            bzhVar = bzhVar3;
            bzmVar = bzmVar4;
            i = 1;
        }
        defpackage.bzp bzpVarF = bzmVar.f();
        try {
            bzpVarF.v();
            bzpVarF.K(126665345, bwsVar.a);
            bzpVarF.D(bzpVarF.q);
            bzpVarF.X(bwsVar.b);
            defpackage.bzh bzhVarD = defpackage.bzd.d(bzhVar);
            if (bzpVarF.m <= 0) {
                b("Check failed");
            }
            if (bzpVar.m != 0) {
                b("Check failed");
            }
            if (!bzhVarD.a()) {
                b("Check failed");
            }
            int iA = bzpVar.a(bzhVarD) + 1;
            int i19 = bzpVar.o;
            if (i19 > iA || iA >= bzpVar.p) {
                b("Check failed");
            }
            int iK2 = bzpVar.k(iA);
            int i20 = bzpVar.i(iA);
            int iJ3 = bzpVar.S(iA) ? i : bzpVar.j(iA);
            java.util.List listG = defpackage.bzo.g(bzpVar, iA, bzpVarF, false, false, true);
            bzpVar.O(iK2);
            int i21 = iJ3 > 0 ? i : 0;
            while (iK2 >= i19) {
                int iG = bzpVar.g(iK2);
                int[] iArr = bzpVar.b;
                int i22 = iG * 5;
                int i23 = i22 + 3;
                iArr[i23] = iArr[i23] - i20;
                if (i21 != 0) {
                    int i24 = i22 + 1;
                    int i25 = iArr[i24];
                    if ((1073741824 & i25) != 0) {
                        i21 = 0;
                    } else {
                        iArr[i24] = (i25 & (-67108864)) | ((67108863 & i25) - iJ3);
                        i21 = i;
                    }
                } else {
                    i21 = 0;
                }
                iK2 = bzpVar.k(iK2);
            }
            if (i21 != 0) {
                if (bzpVar.n < iJ3) {
                    b("Check failed");
                }
                bzpVar.n -= iJ3;
            }
            bzpVarF.l();
            bzpVarF.V();
            bzpVarF.x();
            bzpVarF.w(i);
            defpackage.bzm bzmVar5 = bzmVar;
            defpackage.khb khbVar = new defpackage.khb(bzmVar5, (byte[]) null);
            if (!listG.isEmpty()) {
                int size = listG.size();
                for (int i26 = 0; i26 < size; i26++) {
                    defpackage.bzh bzhVar6 = (defpackage.bzh) listG.get(i26);
                    if (bzmVar5.h(bzhVar6)) {
                        int iD = bzmVar5.d(bzhVar6);
                        int iD2 = defpackage.bzo.d(bzmVar5.a, iD);
                        int i27 = iD + 1;
                        if (((i27 < bzmVar5.b ? bzmVar5.a[(i27 * 5) + 4] : bzmVar5.c.length) - iD2 > 0 ? bzmVar5.c[iD2] : defpackage.bvd.a) instanceof defpackage.bxl) {
                            defpackage.bvf bvfVar = new defpackage.bvf(bvkVar, bwsVar);
                            defpackage.bzp bzpVarF2 = bzmVar5.f();
                            try {
                                defpackage.bxi.c(bzpVarF2, listG, bvfVar);
                                boolean z = true;
                                return khbVar;
                            } finally {
                                bzpVarF2.w(false);
                            }
                        }
                    }
                }
            }
            return khbVar;
        } catch (java.lang.Throwable th) {
            bzpVarF.w(false);
            throw th;
        }
    }
}
