package X;

import N.C0720e;
import N.C0751z;
import N.O0;
import N.Y;
import N.z0;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC3340k;
import x.C4425r;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final Dd.c f15717a = new Dd.c(9);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f15718b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static k f15719c;

    /* renamed from: d, reason: collision with root package name */
    public static int f15720d;

    /* renamed from: e, reason: collision with root package name */
    public static final W9.o f15721e;

    /* renamed from: f, reason: collision with root package name */
    public static final E4.n f15722f;

    /* renamed from: g, reason: collision with root package name */
    public static Object f15723g;

    /* renamed from: h, reason: collision with root package name */
    public static Object f15724h;

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReference f15725i;

    /* renamed from: j, reason: collision with root package name */
    public static final g f15726j;
    public static final C0720e k;

    /* JADX WARN: Type inference failed for: r3v1, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int[], java.io.Serializable] */
    static {
        k kVar = k.f15710e;
        f15719c = kVar;
        f15720d = 2;
        W9.o oVar = new W9.o();
        oVar.f15359c = new int[16];
        oVar.f15360d = new int[16];
        ?? r32 = new int[16];
        int i5 = 0;
        while (i5 < 16) {
            int i10 = i5 + 1;
            r32[i5] = i10;
            i5 = i10;
        }
        oVar.f15361e = r32;
        f15721e = oVar;
        E4.n nVar = new E4.n((short) 0, 5);
        nVar.f2939c = new int[16];
        nVar.f2940d = new O0[16];
        f15722f = nVar;
        ff.v vVar = ff.v.f35432a;
        f15723g = vVar;
        f15724h = vVar;
        int i11 = f15720d;
        f15720d = i11 + 1;
        C1269b c1269b = new C1269b(i11, kVar);
        f15719c = f15719c.f(c1269b.f15700b);
        AtomicReference atomicReference = new AtomicReference(c1269b);
        f15725i = atomicReference;
        f15726j = (g) atomicReference.get();
        k = new C0720e(0);
    }

    public static final void a() {
        f(l.f15715j);
    }

    public static final tf.l b(tf.l lVar, tf.l lVar2) {
        return (lVar == null || lVar2 == null || lVar == lVar2) ? lVar == null ? lVar2 : lVar : new C1268a(lVar, lVar2, 2);
    }

    public static final HashMap c(C1270c c1270c, C1270c c1270c2, k kVar) {
        long[] jArr;
        int i5;
        k kVar2;
        long[] jArr2;
        int i10;
        k kVar3;
        int i11;
        C4425r c4425rW = c1270c2.w();
        int iD = c1270c.d();
        if (c4425rW != null) {
            k kVarE = c1270c2.e().f(c1270c2.d()).e(c1270c2.f15690j);
            Object[] objArr = c4425rW.f47554b;
            long[] jArr3 = c4425rW.f47553a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i12 = 0;
                HashMap map = null;
                while (true) {
                    long j8 = jArr3[i12];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8;
                        int i14 = 8 - ((~(i12 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((255 & j8) < 128) {
                                y yVar = (y) objArr[(i12 << 3) + i15];
                                A aE = yVar.e();
                                i11 = i13;
                                A aT = t(aE, iD, kVar);
                                if (aT == null) {
                                    jArr2 = jArr3;
                                } else {
                                    jArr2 = jArr3;
                                    A aT2 = t(aE, iD, kVarE);
                                    if (aT2 != null && !aT.equals(aT2)) {
                                        i10 = iD;
                                        kVar3 = kVarE;
                                        A aT3 = t(aE, c1270c2.d(), c1270c2.e());
                                        if (aT3 == null) {
                                            s();
                                            throw null;
                                        }
                                        A aF = yVar.f(aT2, aT, aT3);
                                        if (aF == null) {
                                            return null;
                                        }
                                        if (map == null) {
                                            map = new HashMap();
                                        }
                                        map.put(aT, aF);
                                        map = map;
                                    }
                                }
                                i10 = iD;
                                kVar3 = kVarE;
                            } else {
                                jArr2 = jArr3;
                                i10 = iD;
                                kVar3 = kVarE;
                                i11 = i13;
                            }
                            j8 >>= i11;
                            i15++;
                            i13 = i11;
                            jArr3 = jArr2;
                            iD = i10;
                            kVarE = kVar3;
                        }
                        jArr = jArr3;
                        i5 = iD;
                        kVar2 = kVarE;
                        if (i14 != i13) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        i5 = iD;
                        kVar2 = kVarE;
                    }
                    if (i12 == length) {
                        return map;
                    }
                    i12++;
                    jArr3 = jArr;
                    iD = i5;
                    kVarE = kVar2;
                }
            }
        }
        return null;
    }

    public static final void d(g gVar) {
        int i5;
        if (f15719c.d(gVar.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Snapshot is not open: id=");
        sb2.append(gVar.d());
        sb2.append(", disposed=");
        sb2.append(gVar.f15701c);
        sb2.append(", applied=");
        C1270c c1270c = gVar instanceof C1270c ? (C1270c) gVar : null;
        sb2.append(c1270c != null ? Boolean.valueOf(c1270c.f15692m) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (f15718b) {
            W9.o oVar = f15721e;
            i5 = oVar.f15357a > 0 ? ((int[]) oVar.f15359c)[0] : -1;
        }
        sb2.append(i5);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static final k e(k kVar, int i5, int i10) {
        while (i5 < i10) {
            kVar = kVar.f(i5);
            i5++;
        }
        return kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(tf.l r15) {
        /*
            X.g r0 = X.m.f15726j
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot"
            kotlin.jvm.internal.AbstractC3340k.c(r0, r1)
            X.b r0 = (X.C1269b) r0
            java.lang.Object r0 = X.m.f15718b
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = X.m.f15725i     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L20
            r2 = r1
            X.b r2 = (X.C1269b) r2     // Catch: java.lang.Throwable -> L20
            x.r r2 = r2.f15688h     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L23
            N.e r3 = X.m.k     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L20
            goto L23
        L20:
            r15 = move-exception
            goto Laa
        L23:
            r3 = r1
            X.g r3 = (X.g) r3     // Catch: java.lang.Throwable -> L20
            java.lang.Object r15 = w(r3, r15)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)
            r0 = 0
            if (r2 == 0) goto L57
            r3 = -1
            java.lang.Object r4 = X.m.f15723g     // Catch: java.lang.Throwable -> L49
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L49
            r6 = r0
        L36:
            if (r6 >= r5) goto L4b
            java.lang.Object r7 = r4.get(r6)     // Catch: java.lang.Throwable -> L49
            tf.p r7 = (tf.p) r7     // Catch: java.lang.Throwable -> L49
            P.f r8 = new P.f     // Catch: java.lang.Throwable -> L49
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L49
            r7.invoke(r8, r1)     // Catch: java.lang.Throwable -> L49
            int r6 = r6 + 1
            goto L36
        L49:
            r15 = move-exception
            goto L51
        L4b:
            N.e r1 = X.m.k
            r1.addAndGet(r3)
            goto L57
        L51:
            N.e r0 = X.m.k
            r0.addAndGet(r3)
            throw r15
        L57:
            java.lang.Object r1 = X.m.f15718b
            monitor-enter(r1)
            g()     // Catch: java.lang.Throwable -> L99
            if (r2 == 0) goto La6
            java.lang.Object[] r3 = r2.f47554b     // Catch: java.lang.Throwable -> L99
            long[] r2 = r2.f47553a     // Catch: java.lang.Throwable -> L99
            int r4 = r2.length     // Catch: java.lang.Throwable -> L99
            int r4 = r4 + (-2)
            if (r4 < 0) goto La6
            r5 = r0
        L69:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L99
            long r8 = ~r6     // Catch: java.lang.Throwable -> L99
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto La1
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L99
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r0
        L83:
            if (r10 >= r8) goto L9f
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L9b
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L99
            X.y r11 = (X.y) r11     // Catch: java.lang.Throwable -> L99
            r(r11)     // Catch: java.lang.Throwable -> L99
            goto L9b
        L99:
            r15 = move-exception
            goto La8
        L9b:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L83
        L9f:
            if (r8 != r9) goto La6
        La1:
            if (r5 == r4) goto La6
            int r5 = r5 + 1
            goto L69
        La6:
            monitor-exit(r1)
            return r15
        La8:
            monitor-exit(r1)
            throw r15
        Laa:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.m.f(tf.l):java.lang.Object");
    }

    public static final void g() {
        E4.n nVar = f15722f;
        int i5 = nVar.f2938b;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= i5) {
                break;
            }
            O0 o02 = ((O0[]) nVar.f2940d)[i10];
            Object obj = o02 != null ? o02.get() : null;
            if (obj != null && q((y) obj)) {
                if (i11 != i10) {
                    ((O0[]) nVar.f2940d)[i11] = o02;
                    int[] iArr = (int[]) nVar.f2939c;
                    iArr[i11] = iArr[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < i5; i12++) {
            ((O0[]) nVar.f2940d)[i12] = null;
            ((int[]) nVar.f2939c)[i12] = 0;
        }
        if (i11 != i5) {
            nVar.f2938b = i11;
        }
    }

    public static final g h(g gVar, tf.l lVar, boolean z2) {
        boolean z10 = gVar instanceof C1270c;
        if (z10 || gVar == null) {
            return new D(z10 ? (C1270c) gVar : null, lVar, null, false, z2);
        }
        return new E(gVar, lVar, z2);
    }

    public static final A i(A a5) {
        A aT;
        g gVarK = k();
        A aT2 = t(a5, gVarK.d(), gVarK.e());
        if (aT2 != null) {
            return aT2;
        }
        synchronized (f15718b) {
            g gVarK2 = k();
            aT = t(a5, gVarK2.d(), gVarK2.e());
        }
        if (aT != null) {
            return aT;
        }
        s();
        throw null;
    }

    public static final A j(A a5, g gVar) {
        A aT = t(a5, gVar.d(), gVar.e());
        if (aT != null) {
            return aT;
        }
        s();
        throw null;
    }

    public static final g k() {
        g gVar = (g) f15717a.E();
        return gVar == null ? (g) f15725i.get() : gVar;
    }

    public static final tf.l l(tf.l lVar, tf.l lVar2, boolean z2) {
        if (!z2) {
            lVar2 = null;
        }
        return (lVar == null || lVar2 == null || lVar == lVar2) ? lVar == null ? lVar2 : lVar : new C1268a(lVar, lVar2, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.A m(X.A r12, X.y r13) {
        /*
            X.A r0 = r13.e()
            int r1 = X.m.f15720d
            W9.o r2 = X.m.f15721e
            int r3 = r2.f15357a
            r4 = 0
            if (r3 <= 0) goto L13
            java.lang.Object r1 = r2.f15359c
            int[] r1 = (int[]) r1
            r1 = r1[r4]
        L13:
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            r5 = r3
        L17:
            if (r0 == 0) goto L5a
            int r6 = r0.f15664a
            if (r6 != 0) goto L1e
            goto L53
        L1e:
            if (r6 == 0) goto L57
            if (r6 > r1) goto L57
            int r6 = r6 + 0
            r7 = 0
            r9 = 1
            r11 = 64
            if (r6 < 0) goto L38
            if (r6 >= r11) goto L38
            long r9 = r9 << r6
            long r9 = r9 & r7
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L36
        L34:
            r6 = r2
            goto L47
        L36:
            r6 = r4
            goto L47
        L38:
            if (r6 < r11) goto L36
            r11 = 128(0x80, float:1.8E-43)
            if (r6 >= r11) goto L36
            int r6 = r6 + (-64)
            long r9 = r9 << r6
            long r9 = r9 & r7
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L36
            goto L34
        L47:
            if (r6 != 0) goto L57
            if (r5 != 0) goto L4d
            r5 = r0
            goto L57
        L4d:
            int r1 = r0.f15664a
            int r2 = r5.f15664a
            if (r1 >= r2) goto L55
        L53:
            r3 = r0
            goto L5a
        L55:
            r3 = r5
            goto L5a
        L57:
            X.A r0 = r0.f15665b
            goto L17
        L5a:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == 0) goto L62
            r3.f15664a = r0
            return r3
        L62:
            X.A r12 = r12.b()
            r12.f15664a = r0
            X.A r0 = r13.e()
            r12.f15665b = r0
            r13.c(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.m.m(X.A, X.y):X.A");
    }

    public static final A n(A a5, C0751z c0751z, g gVar) {
        A aM;
        synchronized (f15718b) {
            aM = m(a5, c0751z);
            aM.a(a5);
            aM.f15664a = gVar.d();
        }
        return aM;
    }

    public static final void o(g gVar, y yVar) {
        gVar.s(gVar.h() + 1);
        tf.l lVarI = gVar.i();
        if (lVarI != null) {
            lVarI.invoke(yVar);
        }
    }

    public static final A p(A a5, Y y10, g gVar, z0 z0Var) {
        A aM;
        if (gVar.g()) {
            gVar.n(y10);
        }
        int iD = gVar.d();
        if (z0Var.f15664a == iD) {
            return z0Var;
        }
        synchronized (f15718b) {
            aM = m(a5, y10);
        }
        aM.f15664a = iD;
        if (z0Var.f15664a != 1) {
            gVar.n(y10);
        }
        return aM;
    }

    public static final boolean q(y yVar) {
        A a5;
        int i5 = f15720d;
        W9.o oVar = f15721e;
        if (oVar.f15357a > 0) {
            i5 = ((int[]) oVar.f15359c)[0];
        }
        A a10 = null;
        A aE = null;
        int i10 = 0;
        for (A aE2 = yVar.e(); aE2 != null; aE2 = aE2.f15665b) {
            int i11 = aE2.f15664a;
            if (i11 != 0) {
                if (i11 >= i5) {
                    i10++;
                } else if (a10 == null) {
                    i10++;
                    a10 = aE2;
                } else {
                    if (i11 < a10.f15664a) {
                        a5 = a10;
                        a10 = aE2;
                    } else {
                        a5 = aE2;
                    }
                    if (aE == null) {
                        aE = yVar.e();
                        A a11 = aE;
                        while (true) {
                            if (aE == null) {
                                aE = a11;
                                break;
                            }
                            int i12 = aE.f15664a;
                            if (i12 >= i5) {
                                break;
                            }
                            if (a11.f15664a < i12) {
                                a11 = aE;
                            }
                            aE = aE.f15665b;
                        }
                    }
                    a10.f15664a = 0;
                    a10.a(aE);
                    a10 = a5;
                }
            }
        }
        return i10 > 1;
    }

    public static final void r(y yVar) {
        if (q(yVar)) {
            E4.n nVar = f15722f;
            int i5 = nVar.f2938b;
            int iIdentityHashCode = System.identityHashCode(yVar);
            int i10 = -1;
            if (i5 > 0) {
                int i11 = nVar.f2938b - 1;
                int i12 = 0;
                while (true) {
                    if (i12 > i11) {
                        i10 = -(i12 + 1);
                        break;
                    }
                    int i13 = (i12 + i11) >>> 1;
                    int i14 = ((int[]) nVar.f2939c)[i13];
                    if (i14 < iIdentityHashCode) {
                        i12 = i13 + 1;
                    } else if (i14 > iIdentityHashCode) {
                        i11 = i13 - 1;
                    } else {
                        O0 o02 = ((O0[]) nVar.f2940d)[i13];
                        if (yVar == (o02 != null ? o02.get() : null)) {
                            i10 = i13;
                        } else {
                            for (int i15 = i13 - 1; -1 < i15 && ((int[]) nVar.f2939c)[i15] == iIdentityHashCode; i15--) {
                                O0 o03 = ((O0[]) nVar.f2940d)[i15];
                                if ((o03 != null ? o03.get() : null) == yVar) {
                                    i10 = i15;
                                    break;
                                }
                            }
                            i13++;
                            int i16 = nVar.f2938b;
                            while (true) {
                                if (i13 >= i16) {
                                    i10 = -(nVar.f2938b + 1);
                                    break;
                                } else {
                                    if (((int[]) nVar.f2939c)[i13] != iIdentityHashCode) {
                                        i10 = -(i13 + 1);
                                        break;
                                    }
                                    O0 o04 = ((O0[]) nVar.f2940d)[i13];
                                    if ((o04 != null ? o04.get() : null) == yVar) {
                                        break;
                                    } else {
                                        i13++;
                                    }
                                }
                            }
                            i10 = i13;
                        }
                    }
                }
                if (i10 >= 0) {
                    return;
                }
            }
            int i17 = -(i10 + 1);
            O0[] o0Arr = (O0[]) nVar.f2940d;
            int length = o0Arr.length;
            if (i5 == length) {
                int i18 = length * 2;
                O0[] o0Arr2 = new O0[i18];
                int[] iArr = new int[i18];
                int i19 = i17 + 1;
                ff.m.h0(o0Arr, i19, o0Arr2, i17, i5);
                ff.m.j0((O0[]) nVar.f2940d, 0, o0Arr2, i17, 6);
                ff.m.g0(i19, i17, i5, (int[]) nVar.f2939c, iArr);
                ff.m.i0(i17, 6, (int[]) nVar.f2939c, iArr);
                nVar.f2940d = o0Arr2;
                nVar.f2939c = iArr;
            } else {
                int i20 = i17 + 1;
                ff.m.h0(o0Arr, i20, o0Arr, i17, i5);
                int[] iArr2 = (int[]) nVar.f2939c;
                ff.m.g0(i20, i17, i5, iArr2, iArr2);
            }
            ((O0[]) nVar.f2940d)[i17] = new O0(yVar);
            ((int[]) nVar.f2939c)[i17] = iIdentityHashCode;
            nVar.f2938b++;
        }
    }

    public static final void s() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final A t(A a5, int i5, k kVar) {
        A a10 = null;
        while (a5 != null) {
            int i10 = a5.f15664a;
            if (i10 != 0 && i10 <= i5 && !kVar.d(i10) && (a10 == null || a10.f15664a < a5.f15664a)) {
                a10 = a5;
            }
            a5 = a5.f15665b;
        }
        if (a10 != null) {
            return a10;
        }
        return null;
    }

    public static final A u(A a5, y yVar) {
        A aT;
        g gVarK = k();
        tf.l lVarF = gVarK.f();
        if (lVarF != null) {
            lVarF.invoke(yVar);
        }
        A aT2 = t(a5, gVarK.d(), gVarK.e());
        if (aT2 != null) {
            return aT2;
        }
        synchronized (f15718b) {
            g gVarK2 = k();
            A aE = yVar.e();
            AbstractC3340k.c(aE, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            aT = t(aE, gVarK2.d(), gVarK2.e());
            if (aT == null) {
                s();
                throw null;
            }
        }
        return aT;
    }

    public static final void v(int i5) {
        int i10;
        W9.o oVar = f15721e;
        int i11 = ((int[]) oVar.f15361e)[i5];
        oVar.h(i11, oVar.f15357a - 1);
        oVar.f15357a--;
        int[] iArr = (int[]) oVar.f15359c;
        int i12 = iArr[i11];
        int i13 = i11;
        while (i13 > 0) {
            int i14 = ((i13 + 1) >> 1) - 1;
            if (iArr[i14] <= i12) {
                break;
            }
            oVar.h(i14, i13);
            i13 = i14;
        }
        int[] iArr2 = (int[]) oVar.f15359c;
        int i15 = oVar.f15357a >> 1;
        while (i11 < i15) {
            int i16 = (i11 + 1) << 1;
            int i17 = i16 - 1;
            if (i16 < oVar.f15357a && (i10 = iArr2[i16]) < iArr2[i17]) {
                if (i10 >= iArr2[i11]) {
                    break;
                }
                oVar.h(i16, i11);
                i11 = i16;
            } else {
                if (iArr2[i17] >= iArr2[i11]) {
                    break;
                }
                oVar.h(i17, i11);
                i11 = i17;
            }
        }
        ((int[]) oVar.f15361e)[i5] = oVar.f15358b;
        oVar.f15358b = i5;
    }

    public static final Object w(g gVar, tf.l lVar) {
        Object objInvoke = lVar.invoke(f15719c.c(gVar.d()));
        synchronized (f15718b) {
            int i5 = f15720d;
            f15720d = i5 + 1;
            k kVarC = f15719c.c(gVar.d());
            f15719c = kVarC;
            f15725i.set(new C1269b(i5, kVarC));
            gVar.c();
            f15719c = f15719c.f(i5);
        }
        return objInvoke;
    }

    public static final A x(A a5, y yVar, g gVar) {
        A aT;
        if (gVar.g()) {
            gVar.n(yVar);
        }
        int iD = gVar.d();
        A aT2 = t(a5, iD, gVar.e());
        if (aT2 == null) {
            s();
            throw null;
        }
        if (aT2.f15664a == gVar.d()) {
            return aT2;
        }
        synchronized (f15718b) {
            aT = t(yVar.e(), iD, gVar.e());
            if (aT == null) {
                s();
                throw null;
            }
            if (aT.f15664a != iD) {
                A aM = m(aT, yVar);
                aM.a(aT);
                aM.f15664a = gVar.d();
                aT = aM;
            }
        }
        if (aT2.f15664a != 1) {
            gVar.n(yVar);
        }
        return aT;
    }
}
