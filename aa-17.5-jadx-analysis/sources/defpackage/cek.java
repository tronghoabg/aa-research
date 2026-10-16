package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class cek {
    public static cej c;
    public static long d;
    public static List f;
    public static List g;
    public static final cdv h;
    private static final cco j;
    public static final afec a = new bwr(6);
    public static final lah i = new lah((byte[]) null);
    public static final Object b = new Object();
    public static final ceh e = new ceh();
    private static final def k = new def(null);

    static {
        c = cej.a;
        d = 2L;
        afbe afbeVar = afbe.a;
        f = afbeVar;
        g = afbeVar;
        long j2 = d;
        d = 1 + j2;
        cdv cdvVar = new cdv(j2, cej.a);
        c = c.d(cdvVar.i);
        h = cdvVar;
        j = new cco();
    }

    public static final cec a(cec cecVar, afec afecVar, boolean z) {
        boolean z2 = cecVar instanceof cdw;
        if (z2 || cecVar == null) {
            return new cfa(z2 ? (cdw) cecVar : null, afecVar, null, false, z);
        }
        return new cfb(cecVar, afecVar, false, z);
    }

    public static final cec b() {
        cec cecVar = (cec) i.j();
        return cecVar == null ? h : cecVar;
    }

    public static final cej c(cej cejVar, long j2, long j3) {
        while (affa.c(j2, j3) < 0) {
            cejVar = cejVar.d(j2);
            j2++;
        }
        return cejVar;
    }

    public static final cex d(cex cexVar, cec cecVar) {
        cex cexVarI;
        cex cexVarI2 = i(cexVar, cecVar.v(), cecVar.x());
        if (cexVarI2 != null) {
            return cexVarI2;
        }
        synchronized (b) {
            cexVarI = i(cexVar, cecVar.v(), cecVar.x());
        }
        if (cexVarI != null) {
            return cexVarI;
        }
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final cex e(cex cexVar, cev cevVar) {
        cex cexVarI;
        cec cecVarB = b();
        cex cexVarI2 = i(cexVar, cecVarB.v(), cecVarB.x());
        if (cexVarI2 != null) {
            return cexVarI2;
        }
        synchronized (b) {
            cec cecVarB2 = b();
            cex cexVarC = cevVar.getA();
            cexVarC.getClass();
            cexVarI = i(cexVarC, cecVarB2.v(), cecVarB2.x());
        }
        if (cexVarI != null) {
            return cexVarI;
        }
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final cex f(cex cexVar, cev cevVar) {
        cex cexVarC = cevVar.getA();
        long jA = e.a(d) - 1;
        cej cejVar = cej.a;
        cex cexVar2 = null;
        cex cexVar3 = null;
        while (true) {
            if (cexVarC == null) {
                break;
            }
            long j2 = cexVarC.g;
            if (j2 == 0) {
                break;
            }
            if (v(jA, j2, cejVar)) {
                if (cexVar3 == null) {
                    cexVar3 = cexVarC;
                } else if (affa.c(cexVarC.g, cexVar3.g) >= 0) {
                    cexVar2 = cexVar3;
                }
            }
            cexVarC = cexVarC.h;
        }
        cexVar2 = cexVarC;
        if (cexVar2 != null) {
            cexVar2.g = Long.MAX_VALUE;
            return cexVar2;
        }
        cex cexVarA = cexVar.a(Long.MAX_VALUE);
        cexVarA.h = cevVar.getA();
        cevVar.d(cexVarA);
        return cexVarA;
    }

    public static final cex g(cex cexVar, cev cevVar, cec cecVar, cex cexVar2) {
        cex cexVarF;
        if (cecVar.r()) {
            cecVar.n(cevVar);
        }
        long jV = cecVar.v();
        if (cexVar2.g == jV) {
            return cexVar2;
        }
        synchronized (b) {
            cexVarF = f(cexVar, cevVar);
        }
        cexVarF.g = jV;
        cecVar.n(cevVar);
        return cexVarF;
    }

    public static final cex h(cex cexVar, cev cevVar) {
        cex cexVarI;
        cec cecVarB = b();
        afec afecVarI = cecVarB.i();
        if (afecVarI != null) {
            afecVarI.invoke(cevVar);
        }
        cex cexVarI2 = i(cexVar, cecVarB.v(), cecVarB.x());
        if (cexVarI2 != null) {
            return cexVarI2;
        }
        synchronized (b) {
            cec cecVarB2 = b();
            cex cexVarC = cevVar.getA();
            cexVarC.getClass();
            cexVarI = i(cexVarC, cecVarB2.v(), cecVarB2.x());
            if (cexVarI == null) {
                throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
            }
        }
        return cexVarI;
    }

    public static final cex i(cex cexVar, long j2, cej cejVar) {
        cex cexVar2 = null;
        while (cexVar != null) {
            if (v(j2, cexVar.g, cejVar) && (cexVar2 == null || affa.c(cexVar2.g, cexVar.g) < 0)) {
                cexVar2 = cexVar;
            }
            cexVar = cexVar.h;
        }
        if (cexVar2 != null) {
            return cexVar2;
        }
        return null;
    }

    public static final cex j(cex cexVar, cev cevVar, cec cecVar) {
        cex cexVarI;
        cex cexVarI2;
        if (cecVar.r()) {
            cecVar.n(cevVar);
        }
        long jV = cecVar.v();
        cex cexVarI3 = i(cexVar, jV, cecVar.x());
        if (cexVarI3 == null) {
            synchronized (b) {
                cec cecVarB = b();
                cex cexVar2 = ((SnapshotStateList) cevVar).a;
                cexVar2.getClass();
                cexVarI2 = i(cexVar2, cecVarB.v(), cecVarB.x());
                if (cexVarI2 == null) {
                    throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                }
            }
            cexVarI3 = cexVarI2;
        }
        if (cexVarI3.g == cecVar.v()) {
            return cexVarI3;
        }
        synchronized (b) {
            cexVarI = i(((SnapshotStateList) cevVar).a, jV, cecVar.x());
            if (cexVarI == null) {
                throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
            }
            if (cexVarI.g != jV) {
                cex cexVarF = f(cexVarI, cevVar);
                cexVarF.b(cexVarI);
                cexVarF.g = cecVar.v();
                cexVarI = cexVarF;
            }
        }
        cecVar.n(cevVar);
        return cexVarI;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(defpackage.afec r17) {
        /*
            cdv r0 = defpackage.cek.h
            java.lang.Object r1 = defpackage.cek.b
            monitor-enter(r1)
            aap r2 = r0.g     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto Lf
            cco r3 = defpackage.cek.j     // Catch: java.lang.Throwable -> L92
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L92
        Lf:
            r3 = r17
            java.lang.Object r3 = l(r0, r3)     // Catch: java.lang.Throwable -> L92
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L41
            r4 = -1
            java.util.List r5 = defpackage.cek.f     // Catch: java.lang.Throwable -> L3a
            byz r6 = new byz     // Catch: java.lang.Throwable -> L3a
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L3a
            int r7 = r5.size()     // Catch: java.lang.Throwable -> L3a
            r8 = r1
        L26:
            if (r8 >= r7) goto L34
            java.lang.Object r9 = r5.get(r8)     // Catch: java.lang.Throwable -> L3a
            afeg r9 = (defpackage.afeg) r9     // Catch: java.lang.Throwable -> L3a
            r9.invoke(r6, r0)     // Catch: java.lang.Throwable -> L3a
            int r8 = r8 + 1
            goto L26
        L34:
            cco r0 = defpackage.cek.j
            r0.addAndGet(r4)
            goto L41
        L3a:
            r0 = move-exception
            cco r1 = defpackage.cek.j
            r1.addAndGet(r4)
            throw r0
        L41:
            java.lang.Object r4 = defpackage.cek.b
            monitor-enter(r4)
            p()     // Catch: java.lang.Throwable -> L8f
            if (r2 == 0) goto L8d
            java.lang.Object[] r0 = r2.b     // Catch: java.lang.Throwable -> L8f
            long[] r2 = r2.a     // Catch: java.lang.Throwable -> L8f
            int r5 = r2.length     // Catch: java.lang.Throwable -> L8f
            int r5 = r5 + (-2)
            if (r5 < 0) goto L8d
            r6 = r1
        L53:
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L8f
            long r9 = ~r7     // Catch: java.lang.Throwable -> L8f
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L88
            int r9 = r6 - r5
            int r9 = ~r9     // Catch: java.lang.Throwable -> L8f
            r10 = r1
        L67:
            int r11 = r9 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L86
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L82
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r0[r11]     // Catch: java.lang.Throwable -> L8f
            cev r11 = (defpackage.cev) r11     // Catch: java.lang.Throwable -> L8f
            r(r11)     // Catch: java.lang.Throwable -> L8f
        L82:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L67
        L86:
            if (r11 != r12) goto L8d
        L88:
            if (r6 == r5) goto L8d
            int r6 = r6 + 1
            goto L53
        L8d:
            monitor-exit(r4)
            return r3
        L8f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L92:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cek.k(afec):java.lang.Object");
    }

    public static final Object l(cdv cdvVar, afec afecVar) {
        long j2 = cdvVar.i;
        Object objInvoke = afecVar.invoke(c.b(j2));
        long j3 = d;
        d = 1 + j3;
        c = c.b(j2);
        cdvVar.i = j3;
        cdvVar.h = c;
        cdvVar.c = 0;
        cdvVar.g = null;
        cdvVar.z();
        c = c.d(j3);
        return objInvoke;
    }

    public static final Map m(long j2, cdw cdwVar, cej cejVar) {
        long[] jArr;
        Map map;
        long j3;
        cej cejVar2;
        long[] jArr2;
        char c2;
        long j4;
        cej cejVar3;
        cex cexVarI;
        aap aapVarS = cdwVar.s();
        Map map2 = null;
        if (aapVarS == null) {
            return null;
        }
        long jV = cdwVar.v();
        cej cejVarC = cdwVar.x().d(jV).c(cdwVar.d);
        Object[] objArr = aapVarS.b;
        long[] jArr3 = aapVarS.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return null;
        }
        HashMap map3 = null;
        int i2 = 0;
        while (true) {
            long j5 = jArr3[i2];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    map = map2;
                    int i5 = 8 - ((~i3) >>> 31);
                    if (i4 < i5) {
                        if ((j5 & 255) < 128) {
                            cev cevVar = (cev) objArr[(i2 << 3) + i4];
                            cex cexVarC = cevVar.getA();
                            jArr2 = jArr3;
                            c2 = '\b';
                            cex cexVarI2 = i(cexVarC, j2, cejVar);
                            j4 = jV;
                            if (cexVarI2 != null && (cexVarI = i(cexVarC, j4, cejVarC)) != null && !affa.f(cexVarI2, cexVarI)) {
                                cejVar3 = cejVarC;
                                cex cexVarI3 = i(cexVarC, j4, cdwVar.x());
                                if (cexVarI3 == null) {
                                    throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                                }
                                cex cexVarG = cevVar.g(cexVarI, cexVarI2, cexVarI3);
                                if (cexVarG == null) {
                                    return map;
                                }
                                if (map3 == null) {
                                    map3 = new HashMap();
                                }
                                map3.put(cexVarI2, cexVarG);
                            }
                            j5 >>= c2;
                            i4++;
                            jV = j4;
                            map2 = map;
                            cejVarC = cejVar3;
                            jArr3 = jArr2;
                        } else {
                            jArr2 = jArr3;
                            c2 = '\b';
                            j4 = jV;
                        }
                        cejVar3 = cejVarC;
                        j5 >>= c2;
                        i4++;
                        jV = j4;
                        map2 = map;
                        cejVarC = cejVar3;
                        jArr3 = jArr2;
                    } else {
                        jArr = jArr3;
                        j3 = jV;
                        cejVar2 = cejVarC;
                        if (i5 != 8) {
                            return map3;
                        }
                    }
                }
            } else {
                jArr = jArr3;
                map = map2;
                j3 = jV;
                cejVar2 = cejVarC;
            }
            if (i2 == length) {
                return map3;
            }
            i2++;
            jV = j3;
            map2 = map;
            cejVarC = cejVar2;
            jArr3 = jArr;
        }
    }

    public static final afec n(afec afecVar, afec afecVar2, boolean z) {
        byte[] bArr = null;
        if (true != z) {
            afecVar2 = null;
        }
        return (afecVar == null || afecVar2 == null || afecVar == afecVar2) ? afecVar == null ? afecVar2 : afecVar : new bee(afecVar, afecVar2, 13, bArr);
    }

    public static final afec o(afec afecVar, afec afecVar2) {
        return (afecVar == null || afecVar2 == null || afecVar == afecVar2) ? afecVar == null ? afecVar2 : afecVar : new bee(afecVar, afecVar2, 14, null);
    }

    public static final void p() {
        def defVar = k;
        int i2 = defVar.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            cdd cddVar = ((cdd[]) defVar.c)[i3];
            Object obj = cddVar != null ? cddVar.get() : null;
            if (obj != null && u((cev) obj)) {
                if (i4 != i3) {
                    ((cdd[]) defVar.c)[i4] = cddVar;
                    int[] iArr = (int[]) defVar.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((cdd[]) defVar.c)[i5] = null;
            ((int[]) defVar.b)[i5] = 0;
        }
        if (i4 != i2) {
            defVar.a = i4;
        }
    }

    public static final void q(cec cecVar, cev cevVar) {
        cecVar.q(cecVar.h() + 1);
        afec afecVarK = cecVar.k();
        if (afecVarK != null) {
            afecVarK.invoke(cevVar);
        }
    }

    public static final void r(cev cevVar) {
        if (u(cevVar)) {
            def defVar = k;
            int i2 = defVar.a;
            int iIdentityHashCode = System.identityHashCode(cevVar);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = defVar.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) defVar.b)[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        cdd cddVar = ((cdd[]) defVar.c)[i6];
                        if (cevVar == (cddVar != null ? cddVar.get() : null)) {
                            i3 = i6;
                            break;
                        }
                        i3 = i6 - 1;
                        while (i3 >= 0 && ((int[]) defVar.b)[i3] == iIdentityHashCode) {
                            cdd cddVar2 = ((cdd[]) defVar.c)[i3];
                            if ((cddVar2 != null ? cddVar2.get() : null) == cevVar) {
                                break;
                            } else {
                                i3--;
                            }
                        }
                        i6++;
                        int i8 = defVar.a;
                        while (i6 < i8) {
                            if (((int[]) defVar.b)[i6] == iIdentityHashCode) {
                                cdd cddVar3 = ((cdd[]) defVar.c)[i6];
                                if ((cddVar3 != null ? cddVar3.get() : null) == cevVar) {
                                    i3 = i6;
                                    break;
                                }
                                i6++;
                            } else {
                                i3 = -(i6 + 1);
                                break;
                            }
                        }
                        i5 = defVar.a;
                    }
                }
                i3 = -(i5 + 1);
                if (i3 >= 0) {
                    return;
                }
            }
            int i9 = -(i3 + 1);
            int i10 = i9 + 1;
            Object obj = defVar.c;
            int length = ((cdd[]) obj).length;
            if (i2 == length) {
                int i11 = i2 - i9;
                int i12 = length + length;
                cdd[] cddVarArr = new cdd[i12];
                int[] iArr = new int[i12];
                System.arraycopy(obj, i9, cddVarArr, i10, i11);
                System.arraycopy(defVar.c, 0, cddVarArr, 0, i9);
                Object obj2 = defVar.b;
                obj2.getClass();
                System.arraycopy(obj2, i9, iArr, i10, i11);
                woy.ds((int[]) defVar.b, iArr, 0, i9, 6);
                defVar.c = cddVarArr;
                defVar.b = iArr;
            } else {
                int i13 = i2 - i9;
                System.arraycopy(obj, i9, obj, i10, i13);
                Object obj3 = defVar.b;
                obj3.getClass();
                obj3.getClass();
                System.arraycopy(obj3, i9, obj3, i10, i13);
            }
            ((cdd[]) defVar.c)[i9] = new cdd(cevVar);
            ((int[]) defVar.b)[i9] = iIdentityHashCode;
            defVar.a++;
        }
    }

    public static final void s(cec cecVar) {
        Long lValueOf;
        if (c.e(cecVar.v())) {
            return;
        }
        long jV = cecVar.v();
        boolean z = cecVar.j;
        cdw cdwVar = cecVar instanceof cdw ? (cdw) cecVar : null;
        String strValueOf = cdwVar != null ? Boolean.valueOf(cdwVar.f) : "read-only";
        synchronized (b) {
            lValueOf = Long.valueOf(e.a(-1L));
        }
        throw new IllegalStateException("Snapshot is not open: snapshotId=" + jV + ", disposed=" + z + ", applied=" + strValueOf + ", lowestPin=" + lValueOf);
    }

    public static final void t() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    private static final boolean u(cev cevVar) {
        long jA = e.a(d);
        cex cexVar = null;
        int i2 = 0;
        cex cexVarC = null;
        for (cex cexVarC2 = cevVar.getA(); cexVarC2 != null; cexVarC2 = cexVarC2.h) {
            long j2 = cexVarC2.g;
            if (j2 != 0) {
                if (affa.c(j2, jA) >= 0) {
                    i2++;
                } else if (cexVar == null) {
                    i2++;
                    cexVar = cexVarC2;
                } else {
                    int iC = affa.c(j2, cexVar.g);
                    cex cexVar2 = iC < 0 ? cexVarC2 : cexVar;
                    if (iC >= 0) {
                        cexVar = cexVarC2;
                    }
                    if (cexVarC == null) {
                        cexVarC = cevVar.getA();
                        cex cexVar3 = cexVarC;
                        while (true) {
                            if (cexVarC == null) {
                                cexVarC = cexVar3;
                                break;
                            }
                            long j3 = cexVarC.g;
                            if (affa.c(j3, jA) >= 0) {
                                break;
                            }
                            if (affa.c(cexVar3.g, j3) < 0) {
                                cexVar3 = cexVarC;
                            }
                            cexVarC = cexVarC.h;
                        }
                    }
                    cexVar2.g = 0L;
                    cexVar2.b(cexVarC);
                }
            }
        }
        return i2 > 1;
    }

    private static final boolean v(long j2, long j3, cej cejVar) {
        return (j3 == 0 || affa.c(j3, j2) > 0 || cejVar.e(j3)) ? false : true;
    }
}
