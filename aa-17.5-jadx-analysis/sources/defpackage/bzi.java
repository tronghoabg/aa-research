package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class bzi {
    public static boolean a;

    public static ctq A(cts ctsVar, int i, int i2, Map map, afec afecVar, afec afecVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            crt.c(a.bB(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new ctr(i, i2, map, afecVar, ctsVar, afecVar2);
    }

    public static final cfy C(cfy cfyVar, afeh afehVar) {
        return cfyVar.a(new csu(afehVar));
    }

    public static final Object D(cto ctoVar) {
        Object objG = ctoVar.g();
        csx csxVar = objG instanceof csx ? (csx) objG : null;
        if (csxVar != null) {
            return csxVar.d();
        }
        return null;
    }

    public static final int a(ArrayList arrayList, int i, int i2) {
        int iC = c(arrayList, i, i2);
        return iC >= 0 ? iC : -(iC + 1);
    }

    public static final int b(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + Integer.bitCount(iArr[i2 + 1] >> 30);
    }

    public static final int c(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((bzb) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int iB = affa.b(i5, i);
            if (iB < 0) {
                i3 = i4 + 1;
            } else {
                if (iB <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int d(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + Integer.bitCount(iArr[i2 + 1] >> 28);
    }

    public static final bzb e(ArrayList arrayList, int i, int i2) {
        int iC = c(arrayList, i, i2);
        if (iC >= 0) {
            return (bzb) arrayList.get(iC);
        }
        return null;
    }

    public static final void f() {
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List g(bzj bzjVar, int i, bzj bzjVar2, boolean z, boolean z2, boolean z3) {
        int i2;
        afbe afbeVar;
        boolean zT;
        int i3;
        int i4;
        int i5 = bzjVar.i(i);
        int i6 = i + i5;
        int iB = bzjVar.b(i);
        int iB2 = bzjVar.b(i6);
        int i7 = iB2 - iB;
        boolean z4 = i >= 0 && (bzjVar.b[(bzjVar.g(i) * 5) + 1] & 201326592) != 0;
        bzjVar2.B(i5);
        bzjVar2.C(i7, bzjVar2.o);
        if (bzjVar.f < i6) {
            bzjVar.E(i6);
        }
        if (bzjVar.j < iB2) {
            bzjVar.F(iB2, i6);
        }
        int[] iArr = bzjVar2.b;
        int i8 = bzjVar2.o;
        int[] iArr2 = bzjVar.b;
        int i9 = i8 * 5;
        int i10 = i * 5;
        iArr2.getClass();
        iArr.getClass();
        System.arraycopy(iArr2, i10, iArr, i9, (i6 * 5) - i10);
        Object[] objArr = bzjVar2.c;
        int i11 = bzjVar2.h;
        System.arraycopy(bzjVar.c, iB, objArr, i11, i7);
        int i12 = bzjVar2.q;
        iArr[i9 + 2] = i12;
        int i13 = i8 - i;
        int i14 = i8 + i5;
        int iC = i11 - bzjVar2.c(iArr, i8);
        int i15 = bzjVar2.l;
        int i16 = bzjVar2.k;
        int length = objArr.length;
        int i17 = i15;
        boolean z5 = z4;
        int i18 = i8;
        while (i18 < i14) {
            int i19 = i18 * 5;
            if (i18 != i8) {
                int i20 = i19 + 2;
                iArr[i20] = iArr[i20] + i13;
            }
            int[] iArr3 = iArr;
            int iC2 = bzjVar2.c(iArr, i18) + iC;
            if (i17 < i18) {
                i3 = i8;
                i4 = 0;
            } else {
                i3 = i8;
                i4 = bzjVar2.j;
            }
            if (iC2 > i4) {
                iC2 = -(((length - i16) - iC2) + 1);
            }
            iArr3[i19 + 4] = iC2;
            if (i18 == i17) {
                i17++;
            }
            i18++;
            i8 = i3;
            iArr = iArr3;
        }
        int[] iArr4 = iArr;
        bzjVar2.l = i17;
        int iA = a(bzjVar.d, i, bzjVar.f());
        int iA2 = a(bzjVar.d, i6, bzjVar.f());
        if (iA < iA2) {
            ArrayList arrayList = bzjVar.d;
            ArrayList arrayList2 = new ArrayList(iA2 - iA);
            for (int i21 = iA; i21 < iA2; i21++) {
                bzb bzbVar = (bzb) arrayList.get(i21);
                bzbVar.a += i13;
                arrayList2.add(bzbVar);
            }
            i2 = i9;
            bzjVar2.d.addAll(a(bzjVar2.d, bzjVar2.o, bzjVar2.f()), arrayList2);
            arrayList.subList(iA, iA2).clear();
            afbeVar = arrayList2;
        } else {
            i2 = i9;
            afbeVar = afbe.a;
        }
        if (!afbeVar.isEmpty()) {
            HashMap map = bzjVar.e;
            HashMap map2 = bzjVar2.e;
            if (map != null && map2 != null) {
                int size = afbeVar.size();
                for (int i22 = 0; i22 < size; i22++) {
                    bzb bzbVar2 = (bzb) afbeVar.get(i22);
                    bzi bziVar = (bzi) map.get(bzbVar2);
                    if (bziVar != null) {
                        map.remove(bzbVar2);
                        map2.put(bzbVar2, bziVar);
                    }
                }
            }
        }
        int i23 = bzjVar2.q;
        if (bzjVar2.Y(i12) != null) {
            int i24 = i23 + 1;
            int i25 = bzjVar2.o;
            while (i24 < i25) {
                i24 += bzjVar2.b[(i24 * 5) + 3];
            }
            throw null;
        }
        int iK = bzjVar.k(i);
        if (z3) {
            if (z) {
                boolean z6 = iK >= 0;
                if (z6) {
                    bzjVar.J();
                    bzjVar.u(iK - bzjVar.o);
                    bzjVar.J();
                }
                bzjVar.u(i - bzjVar.o);
                zT = bzjVar.T();
                if (z6) {
                    bzjVar.I();
                    bzjVar.V();
                    bzjVar.I();
                    bzjVar.V();
                }
            } else {
                boolean zU = bzjVar.U(i, i5);
                bzjVar.H(iB, i7, i - 1);
                zT = zU;
            }
            if (zT) {
                buz.b("Unexpectedly removed anchors");
            }
        }
        int i26 = bzjVar2.n;
        int i27 = iArr4[i2 + 1];
        bzjVar2.n = i26 + ((1073741824 & i27) != 0 ? 1 : i27 & 67108863);
        if (z2) {
            bzjVar2.o = i14;
            bzjVar2.h = i11 + i7;
        }
        if (z5) {
            bzjVar2.O(i12);
        }
        return afbeVar;
    }

    public static final bzb h(bzb bzbVar) {
        if (true != (bzbVar instanceof bzb)) {
            bzbVar = null;
        }
        if (bzbVar != null) {
            return bzbVar;
        }
        buz.a("Inconsistent composition");
        throw new aezp();
    }

    public static final cfy i(bux buxVar, cfy cfyVar) {
        if (cfyVar.c(new bwr(7))) {
            return cfyVar;
        }
        buxVar.K();
        cfy cfyVar2 = (cfy) cfyVar.b(cfy.e, new alx(buxVar, 19));
        buxVar.p();
        return cfyVar2;
    }

    public static final cfy j(bux buxVar, cfy cfyVar) {
        buxVar.v(439770924);
        cfy cfyVarI = i(buxVar, cfyVar);
        buxVar.o();
        return cfyVarI;
    }

    public static final boolean l(Object obj, Object obj2) {
        return obj.getClass() == obj2.getClass();
    }

    public static final int m(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final cfx n(byw bywVar) {
        int i;
        if (bywVar == null || (i = bywVar.b) == 0) {
            return null;
        }
        return (cfx) bywVar.c(i - 1);
    }

    public static final cst o(cwd cwdVar) {
        if (!cwdVar.M().A) {
            crt.c("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        cyc cycVarR = r(cwdVar, 2);
        if (!cycVarR.t()) {
            crt.c("LayoutCoordinates is not attached.");
        }
        return cycVarR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final cwu p(cfx cfxVar) {
        if ((cfxVar.r & 2) == 0) {
            return null;
        }
        if (cfxVar instanceof cwu) {
            return (cwu) cfxVar;
        }
        if (!(cfxVar instanceof cwe)) {
            return null;
        }
        cfx cfxVar2 = ((cwe) cfxVar).C;
        while (cfxVar2 != 0) {
            if (cfxVar2 instanceof cwu) {
                return (cwu) cfxVar2;
            }
            cfxVar2 = (!(cfxVar2 instanceof cwe) || (cfxVar2.r & 2) == 0) ? cfxVar2.u : ((cwe) cfxVar2).C;
        }
        return null;
    }

    public static final cxb q(cwd cwdVar) {
        cyc cycVar = cwdVar.M().w;
        if (cycVar != null) {
            return cycVar.t;
        }
        crt.a("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new aezp();
    }

    public static final cyc r(cwd cwdVar, int i) {
        cyc cycVar = cwdVar.M().w;
        cycVar.getClass();
        if (cycVar.B() == cwdVar) {
            int i2 = cyd.a;
            int i3 = i & 128;
            if ((i3 != 0) | ((i & 4194304) != 0)) {
                cyc cycVar2 = cycVar.w;
                cycVar2.getClass();
                return cycVar2;
            }
        }
        return cycVar;
    }

    public static final cym s(cwd cwdVar) {
        cym cymVar = q(cwdVar).k;
        if (cymVar != null) {
            return cymVar;
        }
        crt.a("This node does not have an owner.");
        throw new aezp();
    }

    public static final dlg t(cwd cwdVar) {
        return q(cwdVar).r;
    }

    public static final void u(cwd cwdVar) {
        cgi cgiVar;
        cxb cxbVarQ = q(cwdVar);
        if (cxbVarQ.p || (cgiVar = ((czq) cxe.a(cxbVarQ)).Q) == null) {
            return;
        }
        int i = cxbVarQ.c;
        dei deiVar = cgiVar.b;
        cxb cxbVar = (cxb) deiVar.a.a(i);
        if (cxbVar == null || !dei.h(cxbVar)) {
            return;
        }
        def defVar = deiVar.b;
        int iA = deiVar.a(cxbVar);
        long[] jArr = (long[]) defVar.b;
        long j = jArr[iA];
        long j2 = jArr[iA + 1];
        int i2 = (int) j;
        Rect rect = cgiVar.d;
        int i3 = (int) (j2 >> 32);
        rect.set((int) (j >> 32), i2, i3, (int) j2);
        cgiVar.g.a().requestAutofill(cgiVar.a, cxbVarQ.c, rect);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a2, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ayt v(defpackage.cwd r7) {
        /*
            r0 = r7
            cfx r0 = (defpackage.cfx) r0
            cfx r1 = r0.q
            boolean r1 = r1.A
            if (r1 != 0) goto Le
            java.lang.String r1 = "visitAncestors called on an unattached node"
            defpackage.crt.c(r1)
        Le:
            cfx r0 = r0.q
            cfx r0 = r0.t
            cxb r7 = q(r7)
        L16:
            r1 = 0
            if (r7 == 0) goto La2
            cxx r2 = r7.v
            cfx r2 = r2.f
            int r2 = r2.s
            r3 = 8388640(0x800020, float:1.1754988E-38)
            r2 = r2 & r3
            if (r2 != 0) goto L27
            goto L91
        L27:
            if (r0 == 0) goto L91
            int r2 = r0.r
            r4 = r2 & r3
            if (r4 == 0) goto L8e
            r4 = 8388608(0x800000, float:1.1754944E-38)
            r4 = r4 & r2
            r5 = 1
            if (r4 == 0) goto L53
            boolean r7 = r0 instanceof defpackage.ayt
            if (r7 == 0) goto L3a
            goto L4e
        L3a:
            boolean r7 = r0 instanceof defpackage.cwe
            if (r7 == 0) goto L4d
            cwe r0 = (defpackage.cwe) r0
            cfx r7 = r0.C
            r0 = r1
        L43:
            if (r7 == 0) goto L4e
            boolean r2 = r7 instanceof defpackage.ayt
            if (r5 != r2) goto L4a
            r0 = r7
        L4a:
            cfx r7 = r7.u
            goto L43
        L4d:
            r0 = r1
        L4e:
            ayt r0 = (defpackage.ayt) r0
            if (r0 == 0) goto La2
            return r0
        L53:
            r2 = r2 & 32
            if (r2 == 0) goto L8e
            boolean r2 = r0 instanceof defpackage.cvs
            if (r2 == 0) goto L5d
            r4 = r0
            goto L72
        L5d:
            boolean r2 = r0 instanceof defpackage.cwe
            if (r2 == 0) goto L71
            r2 = r0
            cwe r2 = (defpackage.cwe) r2
            cfx r2 = r2.C
            r4 = r1
        L67:
            if (r2 == 0) goto L72
            boolean r6 = r2 instanceof defpackage.cvs
            if (r5 != r6) goto L6e
            r4 = r2
        L6e:
            cfx r2 = r2.u
            goto L67
        L71:
            r4 = r1
        L72:
            cvs r4 = (defpackage.cvs) r4
            if (r4 == 0) goto L8e
            cvr r2 = r4.d()
            bzi r5 = defpackage.cse.a
            boolean r2 = r2.c(r5)
            if (r2 != 0) goto L83
            goto L8e
        L83:
            cvr r7 = r4.d()
            java.lang.Object r7 = r7.a(r5)
            ayt r7 = (defpackage.ayt) r7
            return r7
        L8e:
            cfx r0 = r0.t
            goto L27
        L91:
            cxb r7 = r7.l()
            if (r7 == 0) goto L9f
            cxx r0 = r7.v
            if (r0 == 0) goto L9f
            cfx r0 = r0.e
            goto L16
        L9f:
            r0 = r1
            goto L16
        La2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzi.v(cwd):ayt");
    }

    public static final void w(byw bywVar, cfx cfxVar) {
        byw bywVarK = q(cfxVar).k();
        int i = bywVarK.b - 1;
        Object[] objArr = bywVarK.a;
        if (i < objArr.length) {
            while (i >= 0) {
                bywVar.n(((cxb) objArr[i]).v.f);
                i--;
            }
        }
    }

    public static final Object x(cwc cwcVar, bvf bvfVar) {
        if (!cwcVar.M().A) {
            crt.c("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return q(cwcVar).F.f(bvfVar);
    }

    public static final long y(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public static final dek z(cwd cwdVar, afec afecVar) {
        cxb cxbVarQ = q(cwdVar);
        int i = cxbVarQ.c;
        dei deiVar = ((czq) cxe.a(cxbVarQ)).p;
        del delVar = deiVar.c;
        zh zhVar = delVar.g;
        dek dekVar = new dek(delVar, i, cwdVar, afecVar);
        Object objA = zhVar.a(i);
        if (objA == null) {
            zhVar.g(i, dekVar);
            objA = dekVar;
        }
        dek dekVar2 = (dek) objA;
        if (dekVar2 != dekVar) {
            while (true) {
                dek dekVar3 = dekVar2.b;
                if (dekVar3 == null) {
                    break;
                }
                dekVar2 = dekVar3;
            }
            dekVar2.b = dekVar;
        }
        cxb cxbVarQ2 = q(cwdVar.M());
        if (dei.h(cxbVarQ2)) {
            deiVar.b.b(deiVar.a(cxbVarQ2), true);
        }
        deiVar.d();
        deiVar.i();
        return dekVar;
    }
}
