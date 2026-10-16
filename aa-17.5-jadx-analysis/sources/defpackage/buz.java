package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class buz {
    public static int a;
    public static final Object b = new bww("provider");
    public static final Object c = new bww("provider");
    public static final Object d = new bww("compositionLocalMap");
    public static final Object e = new bww("providers");
    public static final Object f = new bww("reference");

    public static final Void a(String str) {
        throw new buu(a.bq(str, "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void b(String str) {
        throw new buu(a.bq(str, "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final kgx c(bvd bvdVar, bwl bwlVar, bzj bzjVar, buj bujVar) {
        bzb bzbVar;
        bzg bzgVar;
        int i;
        List arrayList;
        long[] jArr;
        int i2;
        bzb bzbVar2;
        long[] jArr2;
        bzg bzgVar2;
        long j;
        int i3;
        int i4;
        char c2;
        boolean zB;
        bzg bzgVar3;
        long j2;
        int i5;
        bzg bzgVar4 = new bzg();
        if (bzjVar.e != null) {
            bzgVar4.b();
        }
        if (bzjVar.s != null) {
            bzgVar4.a();
        }
        int i6 = bzjVar.o;
        if (bujVar != null && bzjVar.j(i6) > 0) {
            int iK = bzjVar.q;
            while (iK > 0 && !bzjVar.S(iK)) {
                iK = bzjVar.k(iK);
            }
            if (iK >= 0 && bzjVar.S(iK)) {
                Object objS = bzjVar.s(iK);
                int i7 = iK + 1;
                int i8 = iK + bzjVar.i(iK);
                int iJ = 0;
                while (i7 < i8) {
                    int i9 = bzjVar.i(i7) + i7;
                    if (i9 > i6) {
                        break;
                    }
                    iJ += bzjVar.S(i7) ? 1 : bzjVar.j(i7);
                    i7 = i9;
                }
                int iJ2 = bzjVar.S(i6) ? 1 : bzjVar.j(i6);
                bujVar.d(objS);
                bujVar.l(iJ, iJ2);
                bujVar.h();
            }
        }
        bzb bzbVar3 = bwlVar.g;
        if (bzbVar3.a()) {
            bvdVar.getClass();
            if (bvdVar.n.e > 0) {
                arrayList = new ArrayList();
                aan aanVar = bvdVar.n;
                long[] jArr3 = aanVar.a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j3 = jArr3[i10];
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
                                    Object obj = aanVar.b[i13];
                                    bzbVar2 = bzbVar3;
                                    Object obj2 = aanVar.c[i13];
                                    obj.getClass();
                                    jArr2 = jArr3;
                                    if (obj2 instanceof aap) {
                                        obj2.getClass();
                                        aap aapVar = (aap) obj2;
                                        Object[] objArr = aapVar.b;
                                        long[] jArr4 = aapVar.a;
                                        int length2 = jArr4.length - 2;
                                        if (length2 >= 0) {
                                            j = j3;
                                            int i15 = 0;
                                            while (true) {
                                                long j4 = jArr4[i15];
                                                i3 = i11;
                                                i4 = i12;
                                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                    int i17 = 0;
                                                    while (i17 < i16) {
                                                        if ((j4 & 255) < 128) {
                                                            j2 = j4;
                                                            int i18 = (i15 << 3) + i17;
                                                            Object obj3 = objArr[i18];
                                                            i5 = i17;
                                                            bxf bxfVar = (bxf) obj;
                                                            bzb bzbVar4 = bxfVar.e;
                                                            if (bzbVar4 != null) {
                                                                bzgVar3 = bzgVar4;
                                                                if (bzjVar.Q(bzi.h(bzbVar2), bzi.h(bzbVar4))) {
                                                                    arrayList.add(new aezu(bxfVar, obj3));
                                                                    aapVar.i(i18);
                                                                }
                                                            } else {
                                                                bzgVar3 = bzgVar4;
                                                            }
                                                        } else {
                                                            bzgVar3 = bzgVar4;
                                                            j2 = j4;
                                                            i5 = i17;
                                                        }
                                                        j4 = j2 >> i14;
                                                        i17 = i5 + 1;
                                                        bzgVar4 = bzgVar3;
                                                    }
                                                    bzgVar2 = bzgVar4;
                                                    if (i16 != i14) {
                                                        break;
                                                    }
                                                } else {
                                                    bzgVar2 = bzgVar4;
                                                }
                                                if (i15 == length2) {
                                                    break;
                                                }
                                                i15++;
                                                i11 = i3;
                                                i12 = i4;
                                                bzgVar4 = bzgVar2;
                                                i14 = 8;
                                            }
                                        } else {
                                            bzgVar2 = bzgVar4;
                                            j = j3;
                                            i3 = i11;
                                            i4 = i12;
                                        }
                                        zB = aapVar.b();
                                    } else {
                                        bzgVar2 = bzgVar4;
                                        j = j3;
                                        i3 = i11;
                                        i4 = i12;
                                        obj2.getClass();
                                        bxf bxfVar2 = (bxf) obj;
                                        bzb bzbVar5 = bxfVar2.e;
                                        if (bzbVar5 == null || !bzjVar.Q(bzi.h(bzbVar2), bzi.h(bzbVar5))) {
                                            zB = false;
                                        } else {
                                            arrayList.add(new aezu(bxfVar2, obj2));
                                            zB = true;
                                        }
                                    }
                                    if (zB) {
                                        aanVar.j(i13);
                                    }
                                    c2 = '\b';
                                } else {
                                    bzbVar2 = bzbVar3;
                                    jArr2 = jArr3;
                                    bzgVar2 = bzgVar4;
                                    j = j3;
                                    i3 = i11;
                                    i4 = i12;
                                    c2 = '\b';
                                }
                                j3 = j >> c2;
                                i12 = i4 + 1;
                                bzbVar3 = bzbVar2;
                                jArr3 = jArr2;
                                i11 = i3;
                                bzgVar4 = bzgVar2;
                            }
                            bzbVar = bzbVar3;
                            jArr = jArr3;
                            bzgVar = bzgVar4;
                            if (i2 != 8) {
                                break;
                            }
                        } else {
                            bzbVar = bzbVar3;
                            jArr = jArr3;
                            bzgVar = bzgVar4;
                            i = 1;
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                        bzbVar3 = bzbVar;
                        jArr3 = jArr;
                        bzgVar4 = bzgVar;
                    }
                } else {
                    bzbVar = bzbVar3;
                    bzgVar = bzgVar4;
                    i = 1;
                }
            } else {
                bzbVar = bzbVar3;
                bzgVar = bzgVar4;
                i = 1;
                arrayList = afbe.a;
            }
            bwlVar.d = woy.bY(bwlVar.d, arrayList);
        } else {
            bzbVar = bzbVar3;
            bzgVar = bzgVar4;
            i = 1;
        }
        bzj bzjVarF = bzgVar.f();
        try {
            bzjVarF.v();
            bzjVarF.K(126665345, bwlVar.a);
            bzjVarF.D(bzjVarF.q);
            bzjVarF.X(bwlVar.b);
            bzb bzbVarH = bzi.h(bzbVar);
            if (bzjVarF.m <= 0) {
                b("Check failed");
            }
            if (bzjVar.m != 0) {
                b("Check failed");
            }
            if (!bzbVarH.a()) {
                b("Check failed");
            }
            int iA = bzjVar.a(bzbVarH) + 1;
            int i19 = bzjVar.o;
            if (i19 > iA || iA >= bzjVar.p) {
                b("Check failed");
            }
            int iK2 = bzjVar.k(iA);
            int i20 = bzjVar.i(iA);
            int iJ3 = bzjVar.S(iA) ? i : bzjVar.j(iA);
            List listG = bzi.g(bzjVar, iA, bzjVarF, false, false, true);
            bzjVar.O(iK2);
            int i21 = iJ3 > 0 ? i : 0;
            while (iK2 >= i19) {
                int iG = bzjVar.g(iK2);
                int[] iArr = bzjVar.b;
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
                iK2 = bzjVar.k(iK2);
            }
            if (i21 != 0) {
                if (bzjVar.n < iJ3) {
                    b("Check failed");
                }
                bzjVar.n -= iJ3;
            }
            bzjVarF.l();
            bzjVarF.V();
            bzjVarF.x();
            bzjVarF.w(i);
            bzg bzgVar5 = bzgVar;
            kgx kgxVar = new kgx(bzgVar5, (byte[]) null);
            if (!listG.isEmpty()) {
                int size = listG.size();
                for (int i26 = 0; i26 < size; i26++) {
                    bzb bzbVar6 = (bzb) listG.get(i26);
                    if (bzgVar5.h(bzbVar6)) {
                        int iD = bzgVar5.d(bzbVar6);
                        int iD2 = bzi.d(bzgVar5.a, iD);
                        int i27 = iD + 1;
                        if (((i27 < bzgVar5.b ? bzgVar5.a[(i27 * 5) + 4] : bzgVar5.c.length) - iD2 > 0 ? bzgVar5.c[iD2] : buw.a) instanceof bxf) {
                            buy buyVar = new buy(bvdVar, bwlVar);
                            bzjVarF = bzgVar5.f();
                            try {
                                bxc.c(bzjVarF, listG, buyVar);
                                bzjVarF.w(true);
                                return kgxVar;
                            } finally {
                            }
                        }
                    }
                }
            }
            return kgxVar;
        } finally {
        }
    }
}
