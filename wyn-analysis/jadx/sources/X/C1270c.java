package X;

import N.C0718d;
import ef.C2527k;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC3340k;
import x.AbstractC4428u;
import x.C4425r;

/* renamed from: X.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1270c extends g {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f15684n = new int[0];

    /* renamed from: e, reason: collision with root package name */
    public final tf.l f15685e;

    /* renamed from: f, reason: collision with root package name */
    public final tf.l f15686f;

    /* renamed from: g, reason: collision with root package name */
    public int f15687g;

    /* renamed from: h, reason: collision with root package name */
    public C4425r f15688h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f15689i;

    /* renamed from: j, reason: collision with root package name */
    public k f15690j;
    public int[] k;

    /* renamed from: l, reason: collision with root package name */
    public int f15691l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15692m;

    public C1270c(int i5, k kVar, tf.l lVar, tf.l lVar2) {
        super(i5, kVar);
        this.f15685e = lVar;
        this.f15686f = lVar2;
        this.f15690j = k.f15710e;
        this.k = f15684n;
        this.f15691l = 1;
    }

    public final void A(k kVar) {
        synchronized (m.f15718b) {
            this.f15690j = this.f15690j.e(kVar);
        }
    }

    public void B(C4425r c4425r) {
        this.f15688h = c4425r;
    }

    public C1270c C(tf.l lVar, tf.l lVar2) throws Throwable {
        if (this.f15701c) {
            C0718d.O("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f15692m && this.f15702d < 0) {
            C0718d.P("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        z(d());
        Object obj = m.f15718b;
        synchronized (obj) {
            try {
                int i5 = m.f15720d;
                m.f15720d = i5 + 1;
                m.f15719c = m.f15719c.f(i5);
                k kVarE = e();
                r(kVarE.f(i5));
                try {
                    C1271d c1271d = new C1271d(i5, m.e(kVarE, d() + 1, i5), m.l(lVar, f(), true), m.b(lVar2, i()), this);
                    if (this.f15692m || this.f15701c) {
                        return c1271d;
                    }
                    int iD = d();
                    synchronized (obj) {
                        int i10 = m.f15720d;
                        m.f15720d = i10 + 1;
                        q(i10);
                        m.f15719c = m.f15719c.f(d());
                    }
                    r(m.e(e(), iD + 1, d()));
                    return c1271d;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // X.g
    public final void b() {
        m.f15719c = m.f15719c.c(d()).a(this.f15690j);
    }

    @Override // X.g
    public void c() {
        if (this.f15701c) {
            return;
        }
        this.f15701c = true;
        synchronized (m.f15718b) {
            int i5 = this.f15702d;
            if (i5 >= 0) {
                m.v(i5);
                this.f15702d = -1;
            }
        }
        l();
    }

    @Override // X.g
    public boolean g() {
        return false;
    }

    @Override // X.g
    public int h() {
        return this.f15687g;
    }

    @Override // X.g
    public tf.l i() {
        return this.f15686f;
    }

    @Override // X.g
    public void k() {
        this.f15691l++;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    @Override // X.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l() {
        /*
            r15 = this;
            int r0 = r15.f15691l
            r1 = 0
            if (r0 <= 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = r1
        L8:
            r3 = 0
            if (r2 == 0) goto L8c
            int r0 = r0 + (-1)
            r15.f15691l = r0
            if (r0 != 0) goto L8b
            boolean r0 = r15.f15692m
            if (r0 != 0) goto L8b
            x.r r0 = r15.w()
            if (r0 == 0) goto L88
            boolean r2 = r15.f15692m
            if (r2 != 0) goto L82
            r15.B(r3)
            int r2 = r15.d()
            java.lang.Object[] r3 = r0.f47554b
            long[] r0 = r0.f47553a
            int r4 = r0.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L88
            r5 = r1
        L30:
            r6 = r0[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L7d
            int r8 = r5 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L4a:
            if (r10 >= r8) goto L7b
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L77
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]
            X.y r11 = (X.y) r11
            X.A r11 = r11.e()
        L60:
            if (r11 == 0) goto L77
            int r12 = r11.f15664a
            if (r12 == r2) goto L72
            X.k r13 = r15.f15690j
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            boolean r12 = ff.o.k0(r13, r12)
            if (r12 == 0) goto L74
        L72:
            r11.f15664a = r1
        L74:
            X.A r11 = r11.f15665b
            goto L60
        L77:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L4a
        L7b:
            if (r8 != r9) goto L88
        L7d:
            if (r5 == r4) goto L88
            int r5 = r5 + 1
            goto L30
        L82:
            java.lang.String r0 = "Unsupported operation on a snapshot that has been applied"
            N.C0718d.P(r0)
            throw r3
        L88:
            r15.a()
        L8b:
            return
        L8c:
            java.lang.String r0 = "no pending nested snapshots"
            N.C0718d.O(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1270c.l():void");
    }

    @Override // X.g
    public void m() {
        if (this.f15692m || this.f15701c) {
            return;
        }
        u();
    }

    @Override // X.g
    public void n(y yVar) {
        C4425r c4425rW = w();
        if (c4425rW == null) {
            int i5 = AbstractC4428u.f47560a;
            c4425rW = new C4425r();
            B(c4425rW);
        }
        c4425rW.a(yVar);
    }

    @Override // X.g
    public final void o() {
        int length = this.k.length;
        for (int i5 = 0; i5 < length; i5++) {
            m.v(this.k[i5]);
        }
        int i10 = this.f15702d;
        if (i10 >= 0) {
            m.v(i10);
            this.f15702d = -1;
        }
    }

    @Override // X.g
    public void s(int i5) {
        this.f15687g = i5;
    }

    @Override // X.g
    public g t(tf.l lVar) {
        C1272e c1272e;
        if (this.f15701c) {
            C0718d.O("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f15692m && this.f15702d < 0) {
            C0718d.P("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        int iD = d();
        z(d());
        Object obj = m.f15718b;
        synchronized (obj) {
            int i5 = m.f15720d;
            m.f15720d = i5 + 1;
            m.f15719c = m.f15719c.f(i5);
            c1272e = new C1272e(i5, m.e(e(), iD + 1, i5), m.l(lVar, f(), true), this);
        }
        if (this.f15692m || this.f15701c) {
            return c1272e;
        }
        int iD2 = d();
        synchronized (obj) {
            int i10 = m.f15720d;
            m.f15720d = i10 + 1;
            q(i10);
            m.f15719c = m.f15719c.f(d());
        }
        r(m.e(e(), iD2 + 1, d()));
        return c1272e;
    }

    public final void u() {
        z(d());
        if (this.f15692m || this.f15701c) {
            return;
        }
        int iD = d();
        synchronized (m.f15718b) {
            int i5 = m.f15720d;
            m.f15720d = i5 + 1;
            q(i5);
            m.f15719c = m.f15719c.f(d());
        }
        r(m.e(e(), iD + 1, d()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.q v() {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1270c.v():X.q");
    }

    public C4425r w() {
        return this.f15688h;
    }

    @Override // X.g
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public tf.l f() {
        return this.f15685e;
    }

    public final q y(int i5, HashMap map, k kVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayListE0;
        ArrayList arrayList3;
        k kVar2;
        Object[] objArr;
        long[] jArr;
        k kVar3;
        Object[] objArr2;
        long[] jArr2;
        int i10;
        int i11;
        A aT;
        A aF;
        k kVarE = e().f(d()).e(this.f15690j);
        C4425r c4425rW = w();
        AbstractC3340k.b(c4425rW);
        Object[] objArr3 = c4425rW.f47554b;
        long[] jArr3 = c4425rW.f47553a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i12 = 0;
            arrayList3 = null;
            arrayListE0 = null;
            while (true) {
                long j8 = jArr3[i12];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j8 & 255) < 128) {
                            y yVar = (y) objArr3[(i12 << 3) + i15];
                            i11 = i13;
                            A aE = yVar.e();
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i10 = i15;
                            A aT2 = m.t(aE, i5, kVar);
                            if (aT2 == null || (aT = m.t(aE, d(), kVarE)) == null) {
                                kVar3 = kVarE;
                            } else {
                                kVar3 = kVarE;
                                if (aT.f15664a != 1 && !aT2.equals(aT)) {
                                    A aT3 = m.t(aE, d(), e());
                                    if (aT3 == null) {
                                        m.s();
                                        throw null;
                                    }
                                    if (map == null || (aF = (A) map.get(aT2)) == null) {
                                        aF = yVar.f(aT, aT2, aT3);
                                    }
                                    if (aF == null) {
                                        return new h();
                                    }
                                    if (!aF.equals(aT3)) {
                                        if (aF.equals(aT2)) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(new C2527k(yVar, aT2.b()));
                                            if (arrayListE0 == null) {
                                                arrayListE0 = new ArrayList();
                                            }
                                            arrayListE0.add(yVar);
                                        } else {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(!aF.equals(aT) ? new C2527k(yVar, aF) : new C2527k(yVar, aT.b()));
                                        }
                                    }
                                }
                            }
                        } else {
                            kVar3 = kVarE;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i10 = i15;
                            i11 = i13;
                        }
                        j8 >>= i11;
                        i15 = i10 + 1;
                        i13 = i11;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        kVarE = kVar3;
                    }
                    kVar2 = kVarE;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i14 != i13) {
                        break;
                    }
                } else {
                    kVar2 = kVarE;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i12 == length) {
                    arrayList2 = arrayList3;
                    arrayList = arrayListE0;
                    break;
                }
                i12++;
                objArr3 = objArr;
                jArr3 = jArr;
                kVarE = kVar2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList2;
        arrayListE0 = arrayList;
        if (arrayList3 != null) {
            u();
            int size = arrayList3.size();
            for (int i16 = 0; i16 < size; i16++) {
                C2527k c2527k = (C2527k) arrayList3.get(i16);
                y yVar2 = (y) c2527k.f34671a;
                A a5 = (A) c2527k.f34672b;
                a5.f15664a = d();
                synchronized (m.f15718b) {
                    a5.f15665b = yVar2.e();
                    yVar2.c(a5);
                }
            }
        }
        if (arrayListE0 != null) {
            int size2 = arrayListE0.size();
            for (int i17 = 0; i17 < size2; i17++) {
                c4425rW.j((y) arrayListE0.get(i17));
            }
            ArrayList arrayList4 = this.f15689i;
            if (arrayList4 != null) {
                arrayListE0 = ff.o.E0(arrayListE0, arrayList4);
            }
            this.f15689i = arrayListE0;
        }
        return i.f15703c;
    }

    public final void z(int i5) {
        synchronized (m.f15718b) {
            this.f15690j = this.f15690j.f(i5);
        }
    }
}
