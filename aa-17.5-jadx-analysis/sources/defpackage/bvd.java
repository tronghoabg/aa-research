package defpackage;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class bvd implements bxg, bva {
    public final bvb a;
    public final AtomicReference b = new AtomicReference(null);
    public final Object c = new Object();
    public final Set d;
    public final bxy e;
    public bxw f;
    public bxa g;
    public bvd h;
    public int i;
    public final cda j;
    public final bwc k;
    public final aan l;
    public final aan m;
    public aan n;
    private final buj o;
    private boolean p;
    private int q;
    private afeg r;
    private final aap s;
    private final aap t;
    private final aan u;
    private final kgx v;
    private final kgx w;

    public bvd(bvb bvbVar, buj bujVar) {
        this.a = bvbVar;
        this.o = bujVar;
        aap aapVar = new aap(6);
        Set aadVar = aapVar.e;
        if (aadVar == null) {
            aadVar = new aad(aapVar);
            aapVar.e = aadVar;
        }
        Set set = aadVar;
        this.d = set;
        bzg bzgVar = new bzg();
        if (bvbVar.l()) {
            bzgVar.a();
        }
        if (bvbVar.n()) {
            bzgVar.b();
        }
        this.e = bzgVar;
        long[] jArr = aao.a;
        this.l = new aan(6);
        this.s = new aap(6);
        this.t = new aap(6);
        this.m = new aan(6);
        kgx kgxVar = new kgx(null, null, null);
        this.v = kgxVar;
        kgx kgxVar2 = new kgx(null, null, null);
        this.w = kgxVar2;
        this.u = new aan(6);
        this.n = new aan(6);
        this.j = new cda();
        bvv bvvVar = new bvv(bujVar, bvbVar, bzgVar, set, kgxVar, kgxVar2, this);
        bvbVar.h(bvvVar);
        this.k = bvvVar;
        this.r = buq.a;
    }

    private final void A(afeg afegVar) {
        this.r = afegVar;
        this.a.s(this, afegVar);
    }

    private final void B(Object obj) {
        int i;
        Object objA = this.l.a(obj);
        if (objA == null) {
            return;
        }
        if (!(objA instanceof aap)) {
            bxf bxfVar = (bxf) objA;
            if (bxfVar.r(obj) != 4 || (obj instanceof bvk)) {
                return;
            }
            bza.a(this.u, obj, bxfVar);
            return;
        }
        aap aapVar = (aap) objA;
        Object[] objArr = aapVar.b;
        long[] jArr = aapVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        bxf bxfVar2 = (bxf) objArr[(i2 << 3) + i4];
                        if (bxfVar2.r(obj) == 4 && !(obj instanceof bvk)) {
                            bza.a(this.u, obj, bxfVar2);
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    private final boolean C(bxf bxfVar, Object obj) {
        return v() && this.k.ag(bxfVar, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int D(defpackage.bxf r22, defpackage.bzb r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvd.D(bxf, bzb, java.lang.Object):int");
    }

    /* JADX WARN: Finally extract failed */
    private final void E(kgx kgxVar) throws Throwable {
        long[] jArr;
        int i;
        long[] jArr2;
        long j;
        char c;
        long j2;
        char c2;
        long[] jArr3;
        cda cdaVar = this.j;
        cdaVar.h(this.d, this.k.Q());
        try {
            try {
                if (!kgxVar.o()) {
                    bxa bxaVar = this.g;
                    buj bujVar = bxaVar != null ? bxaVar.g : this.o;
                    affa.f(bujVar, bxaVar != null ? bxaVar.g : null);
                    bxa bxaVar2 = this.g;
                    cda cdaVar2 = bxaVar2 != null ? bxaVar2.f : this.j;
                    bxy bxyVar = this.e;
                    cff cffVarQ = this.k.Q();
                    bzj bzjVarF = ((bzg) bxyVar).f();
                    int i2 = 0;
                    try {
                        kgxVar.p(bujVar, bzjVarF, cdaVar2, cffVarQ);
                        bzjVarF.w(true);
                        bujVar.f();
                        cda cdaVar3 = this.j;
                        cdaVar3.c();
                        cdaVar3.d();
                        if (this.p) {
                            this.p = false;
                            aan aanVar = this.l;
                            long[] jArr4 = aanVar.a;
                            int length = jArr4.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                while (true) {
                                    long j3 = jArr4[i3];
                                    char c3 = 7;
                                    long j4 = -9187201950435737472L;
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i4 = i3 - length;
                                        int i5 = i2;
                                        while (true) {
                                            i = 8 - ((~i4) >>> 31);
                                            if (i5 >= i) {
                                                break;
                                            }
                                            if ((j3 & 255) < 128) {
                                                int i6 = (i3 << 3) + i5;
                                                c = c3;
                                                Object obj = aanVar.b[i6];
                                                Object obj2 = aanVar.c[i6];
                                                j2 = j4;
                                                if (obj2 instanceof aap) {
                                                    obj2.getClass();
                                                    aap aapVar = (aap) obj2;
                                                    Object[] objArr = aapVar.b;
                                                    long[] jArr5 = aapVar.a;
                                                    int length2 = jArr5.length - 2;
                                                    if (length2 >= 0) {
                                                        int i7 = 8;
                                                        while (true) {
                                                            int i8 = length2;
                                                            long j5 = jArr5[i2];
                                                            j = j3;
                                                            if ((((~j5) << c) & j5 & j2) != j2) {
                                                                int i9 = 8 - ((~(i2 - i8)) >>> 31);
                                                                int i10 = 0;
                                                                while (i10 < i9) {
                                                                    if ((j5 & 255) < 128) {
                                                                        jArr3 = jArr4;
                                                                        int i11 = (i2 << 3) + i10;
                                                                        if (!((bxf) objArr[i11]).o()) {
                                                                            aapVar.i(i11);
                                                                        }
                                                                    } else {
                                                                        jArr3 = jArr4;
                                                                    }
                                                                    j5 >>= i7;
                                                                    i10++;
                                                                    jArr4 = jArr3;
                                                                }
                                                                jArr2 = jArr4;
                                                                if (i9 != i7) {
                                                                    break;
                                                                }
                                                            } else {
                                                                jArr2 = jArr4;
                                                            }
                                                            length2 = i8;
                                                            if (i2 == length2) {
                                                                break;
                                                            }
                                                            i2++;
                                                            j3 = j;
                                                            jArr4 = jArr2;
                                                            i7 = 8;
                                                        }
                                                    } else {
                                                        jArr2 = jArr4;
                                                        j = j3;
                                                    }
                                                    if (aapVar.b()) {
                                                        aanVar.j(i6);
                                                    }
                                                    c2 = '\b';
                                                } else {
                                                    jArr2 = jArr4;
                                                    j = j3;
                                                    obj2.getClass();
                                                    if (!((bxf) obj2).o()) {
                                                        aanVar.j(i6);
                                                    }
                                                    c2 = '\b';
                                                }
                                            } else {
                                                jArr2 = jArr4;
                                                j = j3;
                                                c = c3;
                                                j2 = j4;
                                                c2 = '\b';
                                            }
                                            j3 = j >> c2;
                                            i5++;
                                            c3 = c;
                                            j4 = j2;
                                            jArr4 = jArr2;
                                            i2 = 0;
                                        }
                                        jArr = jArr4;
                                        if (i != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr = jArr4;
                                    }
                                    if (i3 == length) {
                                        break;
                                    }
                                    i3++;
                                    jArr4 = jArr;
                                    i2 = 0;
                                }
                            }
                            z();
                        }
                        if (this.w.o() && this.g == null) {
                            cdaVar = this.j;
                            cdaVar.b();
                        }
                    } catch (Throwable th) {
                        bzjVarF.w(false);
                        throw th;
                    }
                } else if (this.w.o() && this.g == null) {
                    cdaVar.b();
                }
                this.j.a();
            } catch (Throwable th2) {
                th = th2;
                if (this.w.o() && this.g == null) {
                    this.j.b();
                }
                this.j.a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            this.j.a();
            throw th;
        }
    }

    private final void y(Object obj, boolean z) {
        int i;
        Object objA = this.l.a(obj);
        if (objA == null) {
            return;
        }
        if (!(objA instanceof aap)) {
            bxf bxfVar = (bxf) objA;
            if (bza.c(this.u, obj, bxfVar) || bxfVar.r(obj) == 1) {
                return;
            }
            if (!bxfVar.p() || z) {
                this.s.j(bxfVar);
                return;
            } else {
                this.t.j(bxfVar);
                return;
            }
        }
        aap aapVar = (aap) objA;
        Object[] objArr = aapVar.b;
        long[] jArr = aapVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        bxf bxfVar2 = (bxf) objArr[(i2 << 3) + i4];
                        if (!bza.c(this.u, obj, bxfVar2) && bxfVar2.r(obj) != 1) {
                            if (!bxfVar2.p() || z) {
                                this.s.j(bxfVar2);
                            } else {
                                this.t.j(bxfVar2);
                            }
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4 A[PHI: r21 r24 r28 r29
  0x00e4: PHI (r21v8 long) = (r21v7 long), (r21v10 long) binds: [B:38:0x00e2, B:35:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r24v4 int) = (r24v3 int), (r24v7 int) binds: [B:38:0x00e2, B:35:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r28v6 long[]) = (r28v5 long[]), (r28v9 long[]) binds: [B:38:0x00e2, B:35:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r29v3 int) = (r29v2 int), (r29v6 int) binds: [B:38:0x00e2, B:35:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void z() {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvd.z():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    @Override // defpackage.bxg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            bwc r2 = r0.k
            r3 = r2
            bvv r3 = (defpackage.bvv) r3
            int r3 = r3.j
            if (r3 <= 0) goto Lf
            goto Lc4
        Lf:
            bxf r2 = r2.P()
            if (r2 == 0) goto Lc4
            r2.q()
            int r3 = r2.b
            r3 = r3 & 32
            r4 = 6
            if (r3 == 0) goto L20
            goto L37
        L20:
            aae r3 = r2.f
            if (r3 != 0) goto L2b
            aae r3 = new aae
            r3.<init>(r4)
            r2.f = r3
        L2b:
            int r5 = r2.d
            int r3 = r3.h(r1, r5)
            int r5 = r2.d
            if (r3 != r5) goto L37
            goto Lc4
        L37:
            boolean r3 = r1 instanceof defpackage.cew
            r5 = 1
            if (r3 == 0) goto L42
            r3 = r1
            cew r3 = (defpackage.cew) r3
            r3.i(r5)
        L42:
            aan r3 = r0.l
            defpackage.bza.a(r3, r1, r2)
            boolean r3 = r1 instanceof defpackage.bvk
            if (r3 == 0) goto Lc4
            r3 = r1
            bvk r3 = (defpackage.bvk) r3
            bvj r6 = r3.e()
            aan r0 = r0.m
            defpackage.bza.b(r0, r1)
            aae r7 = r6.d
            java.lang.Object[] r8 = r7.b
            long[] r7 = r7.a
            int r9 = r7.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto Lb3
            r11 = 0
        L63:
            r12 = r7[r11]
            long r14 = ~r12
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto Lad
            int r14 = r11 - r9
            r15 = 0
        L79:
            int r10 = ~r14
            int r10 = r10 >>> 31
            r4 = 8
            int r10 = 8 - r10
            if (r15 >= r10) goto Lab
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r12 & r17
            r19 = 128(0x80, double:6.3E-322)
            int r10 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r10 >= 0) goto La3
            int r10 = r11 << 3
            int r10 = r10 + r15
            r10 = r8[r10]
            cev r10 = (defpackage.cev) r10
            r17 = r4
            boolean r4 = r10 instanceof defpackage.cew
            if (r4 == 0) goto L9f
            r4 = r10
            cew r4 = (defpackage.cew) r4
            r4.i(r5)
        L9f:
            defpackage.bza.a(r0, r10, r1)
            goto La5
        La3:
            r17 = r4
        La5:
            long r12 = r12 >> r17
            int r15 = r15 + 1
            r4 = 6
            goto L79
        Lab:
            if (r10 != r4) goto Lb3
        Lad:
            if (r11 == r9) goto Lb3
            int r11 = r11 + 1
            r4 = 6
            goto L63
        Lb3:
            java.lang.Object r0 = r6.e
            aan r1 = r2.g
            if (r1 != 0) goto Lc1
            aan r1 = new aan
            r4 = 6
            r1.<init>(r4)
            r2.g = r1
        Lc1:
            r1.m(r3, r0)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvd.a(java.lang.Object):void");
    }

    @Override // defpackage.bxg
    public final void b() {
        this.p = true;
    }

    @Override // defpackage.bxg
    public final int c(bxf bxfVar, Object obj) {
        bvd bvdVar;
        if ((bxfVar.b & 2) != 0) {
            bxfVar.c(true);
        }
        bzb bzbVar = bxfVar.e;
        if (bzbVar == null || !bzbVar.a()) {
            return 1;
        }
        if (((bzg) this.e).h(bzi.h(bzbVar))) {
            if (bxfVar.c != null) {
                return D(bxfVar, bzbVar, obj);
            }
            return 1;
        }
        synchronized (this.c) {
            bvdVar = this.h;
        }
        return (bvdVar == null || !bvdVar.C(bxfVar, obj)) ? 1 : 4;
    }

    @Override // defpackage.bva
    public final void d() {
        synchronized (this.c) {
            bwc bwcVar = this.k;
            if (((bvv) bwcVar).l) {
                bxc.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
            }
            if (this.q != 3) {
                this.q = 3;
                this.r = buq.b;
                kgx kgxVar = ((bvv) bwcVar).A;
                if (kgxVar != null) {
                    E(kgxVar);
                }
                bxy bxyVar = this.e;
                boolean zC = bxyVar.c();
                if (!zC || !this.d.isEmpty()) {
                    cda cdaVar = this.j;
                    try {
                        cdaVar.h(this.d, bwcVar.Q());
                        if (!zC) {
                            buj bujVar = this.o;
                            bzb.b((bzg) bxyVar, cdaVar);
                            bujVar.c();
                            bujVar.f();
                            cdaVar.c();
                        }
                        cdaVar.b();
                    } finally {
                        cdaVar.a();
                    }
                }
                this.u.k();
                bwc bwcVar2 = this.k;
                ((bvv) bwcVar2).b.k(bwcVar2);
                ((bvv) bwcVar2).X();
                ((bvv) bwcVar2).a.c();
            }
        }
        this.a.v(this);
    }

    @Override // defpackage.bva
    public final void e(afeg afegVar) {
        boolean zU = u();
        q();
        if (zU) {
            m(afegVar);
        } else {
            A(afegVar);
        }
    }

    @Override // defpackage.bva
    public final boolean f() {
        return this.q == 3;
    }

    public final bxw g(bxw bxwVar) {
        bxw bxwVar2 = this.f;
        this.f = bxwVar;
        return bxwVar2;
    }

    public final void h() {
        this.b.set(null);
        this.v.m();
        this.w.m();
        Set set = this.d;
        if (set.isEmpty()) {
            return;
        }
        cda cdaVar = this.j;
        try {
            cdaVar.h(set, this.k.Q());
            cdaVar.b();
        } finally {
            cdaVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0251 A[PHI: r24 r33
  0x0251: PHI (r24v14 long[]) = (r24v13 long[]), (r24v13 long[]), (r24v15 long[]) binds: [B:115:0x0249, B:117:0x024f, B:112:0x0239] A[DONT_GENERATE, DONT_INLINE]
  0x0251: PHI (r33v11 long) = (r33v10 long), (r33v10 long), (r33v12 long) binds: [B:115:0x0249, B:117:0x024f, B:112:0x0239] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0176 A[EDGE_INSN: B:71:0x0176->B:225:0x0113 BREAK  A[LOOP:13: B:61:0x0144->B:72:0x0178]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.util.Set r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvd.i(java.util.Set, boolean):void");
    }

    public final void j() {
        synchronized (this.c) {
            try {
                E(this.v);
                p();
            } catch (Throwable th) {
                try {
                    Set set = this.d;
                    if (!set.isEmpty()) {
                        cda cdaVar = this.j;
                        try {
                            cdaVar.h(set, this.k.Q());
                            cdaVar.b();
                            cdaVar.a();
                        } catch (Throwable th2) {
                            cdaVar.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    h();
                    throw th3;
                }
            }
        }
    }

    public final void k() {
        synchronized (this.c) {
            try {
                kgx kgxVar = this.w;
                if (kgxVar.l()) {
                    E(kgxVar);
                }
            } catch (Throwable th) {
                try {
                    Set set = this.d;
                    if (!set.isEmpty()) {
                        cda cdaVar = this.j;
                        try {
                            cdaVar.h(set, this.k.Q());
                            cdaVar.b();
                            cdaVar.a();
                        } catch (Throwable th2) {
                            cdaVar.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    h();
                    throw th3;
                }
            }
        }
    }

    public final void l() {
        cda cdaVar;
        synchronized (this.c) {
            try {
                bwc bwcVar = this.k;
                ((bvv) bwcVar).w = null;
                Set set = this.d;
                if (!set.isEmpty()) {
                    cdaVar = this.j;
                    try {
                        cdaVar.h(set, bwcVar.Q());
                        cdaVar.b();
                        cdaVar.a();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    Set set2 = this.d;
                    if (!set2.isEmpty()) {
                        cdaVar = this.j;
                        try {
                            cdaVar.h(set2, this.k.Q());
                            cdaVar.b();
                            cdaVar.a();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    h();
                    throw th2;
                }
            }
        }
    }

    public final void m(afeg afegVar) {
        this.k.ac();
        A(afegVar);
        this.k.Z();
    }

    public final void n() {
        synchronized (this.c) {
            if (this.g != null) {
                bxc.b("Deactivate is not supported while pausable composition is in progress");
            }
            bxy bxyVar = this.e;
            boolean zC = bxyVar.c();
            if (!zC || !this.d.isEmpty()) {
                cda cdaVar = this.j;
                try {
                    cdaVar.h(this.d, this.k.Q());
                    if (!zC) {
                        buj bujVar = this.o;
                        bzj bzjVarF = ((bzg) bxyVar).f();
                        try {
                            bzjVarF.A(bzjVarF.o, new apn(cdaVar, bzjVarF, 13));
                            bzjVarF.w(true);
                            bujVar.f();
                            cdaVar.c();
                        } catch (Throwable th) {
                            bzjVarF.w(false);
                            throw th;
                        }
                    }
                    cdaVar.b();
                } finally {
                    cdaVar.a();
                }
            }
            this.l.k();
            this.m.k();
            this.n.k();
            this.v.m();
            this.w.m();
            this.k.X();
            this.q = 1;
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.b;
        Object obj = bve.a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (affa.f(andSet, obj)) {
                buz.a("pending composition has not been applied");
                throw new aezp();
            }
            if (andSet instanceof Set) {
                i((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                Objects.toString(atomicReference);
                buz.a("corrupt pendingModifications drain: ".concat(atomicReference.toString()));
                throw new aezp();
            }
            for (Set set : (Set[]) andSet) {
                i(set, true);
            }
        }
    }

    public final void p() {
        AtomicReference atomicReference = this.b;
        Object andSet = atomicReference.getAndSet(null);
        if (affa.f(andSet, bve.a)) {
            return;
        }
        if (andSet instanceof Set) {
            i((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                i(set, false);
            }
            return;
        }
        if (andSet != null) {
            Objects.toString(atomicReference);
            buz.a("corrupt pendingModifications drain: ".concat(atomicReference.toString()));
            throw new aezp();
        }
        if (this.g == null) {
            buz.b("calling recordModificationsOf and applyChanges concurrently is not supported");
        }
    }

    public final void q() {
        int i = this.q;
        if (i != 0) {
            bxc.b(i != 1 ? i != 2 ? "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.g == null) {
            return;
        }
        bxc.b("A pausable composition is in progress");
    }

    public final void r(aap aapVar) {
        this.g = null;
        if (aapVar != null) {
            this.j.g = aapVar;
            this.q = 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.lang.Object[]] */
    public final void s(Set set) {
        AtomicReference atomicReference;
        Object obj;
        Set set2;
        do {
            atomicReference = this.b;
            obj = atomicReference.get();
            if (obj == null || affa.f(obj, bve.a)) {
                set2 = set;
            } else if (obj instanceof Set) {
                set2 = new Set[]{obj, set};
            } else {
                if (!(obj instanceof Object[])) {
                    AtomicReference atomicReference2 = this.b;
                    Objects.toString(atomicReference2);
                    throw new IllegalStateException("corrupt pendingModifications: ".concat(atomicReference2.toString()));
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? CopyOf = Arrays.copyOf(setArr, length + 1);
                CopyOf[length] = set;
                CopyOf.getClass();
                set2 = CopyOf;
            }
        } while (!a.h(atomicReference, obj, set2));
        if (obj == null) {
            synchronized (this.c) {
                p();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = r0.c
            monitor-enter(r1)
            r17.B(r18)     // Catch: java.lang.Throwable -> L64
            aan r2 = r0.m     // Catch: java.lang.Throwable -> L64
            r3 = r18
            java.lang.Object r2 = r2.a(r3)     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L62
            boolean r3 = r2 instanceof defpackage.aap     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto L5d
            aap r2 = (defpackage.aap) r2     // Catch: java.lang.Throwable -> L64
            java.lang.Object[] r3 = r2.b     // Catch: java.lang.Throwable -> L64
            long[] r2 = r2.a     // Catch: java.lang.Throwable -> L64
            int r4 = r2.length     // Catch: java.lang.Throwable -> L64
            int r4 = r4 + (-2)
            if (r4 < 0) goto L62
            r5 = 0
            r6 = r5
        L23:
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L64
            long r9 = ~r7     // Catch: java.lang.Throwable -> L64
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L58
            int r9 = r6 - r4
            r10 = r5
        L36:
            int r11 = ~r9     // Catch: java.lang.Throwable -> L64
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L56
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L52
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L64
            bvk r11 = (defpackage.bvk) r11     // Catch: java.lang.Throwable -> L64
            r0.B(r11)     // Catch: java.lang.Throwable -> L64
        L52:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L36
        L56:
            if (r11 != r12) goto L62
        L58:
            if (r6 == r4) goto L62
            int r6 = r6 + 1
            goto L23
        L5d:
            bvk r2 = (defpackage.bvk) r2     // Catch: java.lang.Throwable -> L64
            r0.B(r2)     // Catch: java.lang.Throwable -> L64
        L62:
            monitor-exit(r1)
            return
        L64:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvd.t(java.lang.Object):void");
    }

    public final boolean u() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (this.q != 1) {
                z = false;
            }
            if (z) {
                this.q = 0;
            }
        }
        return z;
    }

    public final boolean v() {
        return ((bvv) this.k).l;
    }

    public final bxa w(boolean z, afeg afegVar) {
        if (this.g != null) {
            bxc.b("A pausable composition is in progress");
        }
        bxa bxaVar = new bxa(this, this.a, this.k, this.d, afegVar, z, this.o, this.c);
        this.g = bxaVar;
        return bxaVar;
    }

    public final aan x() {
        aan aanVar = this.n;
        long[] jArr = aao.a;
        this.n = new aan(6);
        return aanVar;
    }
}
