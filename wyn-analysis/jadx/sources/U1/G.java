package U1;

import N1.C0753b;
import android.util.Pair;
import java.util.ArrayList;
import l8.AbstractC3409K;
import l8.C3406H;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: c, reason: collision with root package name */
    public final V1.d f11936c;

    /* renamed from: d, reason: collision with root package name */
    public final Q1.s f11937d;

    /* renamed from: e, reason: collision with root package name */
    public final S8.b f11938e;

    /* renamed from: f, reason: collision with root package name */
    public long f11939f;

    /* renamed from: g, reason: collision with root package name */
    public int f11940g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11941h;

    /* renamed from: i, reason: collision with root package name */
    public E f11942i;

    /* renamed from: j, reason: collision with root package name */
    public E f11943j;
    public E k;

    /* renamed from: l, reason: collision with root package name */
    public E f11944l;

    /* renamed from: m, reason: collision with root package name */
    public int f11945m;

    /* renamed from: n, reason: collision with root package name */
    public Object f11946n;

    /* renamed from: o, reason: collision with root package name */
    public long f11947o;

    /* renamed from: a, reason: collision with root package name */
    public final N1.L f11934a = new N1.L();

    /* renamed from: b, reason: collision with root package name */
    public final N1.M f11935b = new N1.M();

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f11948p = new ArrayList();

    public G(V1.d dVar, Q1.s sVar, S8.b bVar, C0842l c0842l) {
        this.f11936c = dVar;
        this.f11937d = sVar;
        this.f11938e = bVar;
    }

    public static k2.H m(N1.N n10, Object obj, long j8, long j10, N1.M m10, N1.L l10) {
        n10.g(obj, l10);
        n10.n(l10.f8050c, m10);
        n10.b(obj);
        int i5 = l10.f8054g.f8137a;
        if (i5 != 0) {
            if (i5 == 1) {
                l10.f(0);
            }
            l10.f8054g.getClass();
            l10.g(0);
        }
        n10.g(obj, l10);
        int iC = l10.c(j8);
        return iC == -1 ? new k2.H(obj, j10, l10.b(j8)) : new k2.H(obj, iC, l10.e(iC), j10, -1);
    }

    public final E a() {
        E e7 = this.f11942i;
        if (e7 == null) {
            return null;
        }
        if (e7 == this.f11943j) {
            this.f11943j = e7.f11921m;
        }
        e7.i();
        int i5 = this.f11945m - 1;
        this.f11945m = i5;
        if (i5 == 0) {
            this.k = null;
            E e10 = this.f11942i;
            this.f11946n = e10.f11911b;
            this.f11947o = e10.f11916g.f11925a.f38906d;
        }
        this.f11942i = this.f11942i.f11921m;
        k();
        return this.f11942i;
    }

    public final void b() {
        if (this.f11945m == 0) {
            return;
        }
        E e7 = this.f11942i;
        Q1.k.h(e7);
        this.f11946n = e7.f11911b;
        this.f11947o = e7.f11916g.f11925a.f38906d;
        while (e7 != null) {
            e7.i();
            e7 = e7.f11921m;
        }
        this.f11942i = null;
        this.k = null;
        this.f11943j = null;
        this.f11945m = 0;
        k();
    }

    public final F c(N1.N n10, E e7, long j8) {
        N1.N n11;
        N1.L l10;
        Object obj;
        long j10;
        long j11;
        long j12;
        long jO;
        F f10 = e7.f11916g;
        long j13 = (e7.f11924p + f10.f11929e) - j8;
        if (f10.f11931g) {
            F f11 = e7.f11916g;
            k2.H h10 = f11.f11925a;
            int iD = n10.d(n10.b(h10.f38903a), this.f11934a, this.f11935b, this.f11940g, this.f11941h);
            if (iD != -1) {
                N1.L l11 = this.f11934a;
                int i5 = n10.f(iD, l11, true).f8050c;
                Object obj2 = l11.f8049b;
                obj2.getClass();
                long j14 = h10.f38906d;
                if (n10.m(i5, this.f11935b, 0L).f8069n == iD) {
                    Pair pairJ = n10.j(this.f11935b, this.f11934a, i5, -9223372036854775807L, Math.max(0L, j13));
                    if (pairJ != null) {
                        Object obj3 = pairJ.first;
                        long jLongValue = ((Long) pairJ.second).longValue();
                        E e10 = e7.f11921m;
                        if (e10 == null || !e10.f11911b.equals(obj3)) {
                            jO = o(obj3);
                            if (jO == -1) {
                                jO = this.f11939f;
                                this.f11939f = 1 + jO;
                            }
                        } else {
                            jO = e10.f11916g.f11925a.f38906d;
                        }
                        obj = obj3;
                        j10 = jLongValue;
                        j12 = jO;
                        j11 = -9223372036854775807L;
                    }
                } else {
                    obj = obj2;
                    j10 = 0;
                    j11 = 0;
                    j12 = j14;
                }
                k2.H hM = m(n10, obj, j10, j12, this.f11935b, this.f11934a);
                if (j11 != -9223372036854775807L && f11.f11927c != -9223372036854775807L) {
                    int i10 = n10.g(h10.f38903a, l11).f8054g.f8137a;
                    l11.f8054g.getClass();
                    if (i10 > 0) {
                        l11.g(0);
                    }
                }
                return d(n10, hM, j11, j10);
            }
            return null;
        }
        k2.H h11 = f10.f11925a;
        Object obj4 = h11.f38903a;
        N1.L l12 = this.f11934a;
        n10.g(obj4, l12);
        boolean zB = h11.b();
        Object obj5 = h11.f38903a;
        if (!zB) {
            int i11 = h11.f38907e;
            if (i11 != -1) {
                l12.f(i11);
            }
            int iE = l12.e(i11);
            l12.g(i11);
            if (iE != l12.f8054g.a(i11).f8129a) {
                return e(n10, h11.f38903a, h11.f38907e, iE, f10.f11929e, h11.f38906d);
            }
            n10.g(obj5, l12);
            l12.d(i11);
            l12.f8054g.a(i11).getClass();
            return f(n10, h11.f38903a, 0L, f10.f11929e, h11.f38906d);
        }
        C0753b c0753b = l12.f8054g;
        int i12 = h11.f38904b;
        int i13 = c0753b.a(i12).f8129a;
        if (i13 == -1) {
            return null;
        }
        int iA = l12.f8054g.a(i12).a(h11.f38905c);
        if (iA < i13) {
            return e(n10, h11.f38903a, i12, iA, f10.f11927c, h11.f38906d);
        }
        long jLongValue2 = f10.f11927c;
        if (jLongValue2 == -9223372036854775807L) {
            l10 = l12;
            n11 = n10;
            Pair pairJ2 = n11.j(this.f11935b, l10, l10.f8050c, -9223372036854775807L, Math.max(0L, j13));
            if (pairJ2 == null) {
                return null;
            }
            jLongValue2 = ((Long) pairJ2.second).longValue();
        } else {
            n11 = n10;
            l10 = l12;
        }
        n11.g(obj5, l10);
        int i14 = h11.f38904b;
        l10.d(i14);
        l10.f8054g.a(i14).getClass();
        return f(n11, h11.f38903a, Math.max(0L, jLongValue2), f10.f11927c, h11.f38906d);
    }

    public final F d(N1.N n10, k2.H h10, long j8, long j10) {
        n10.g(h10.f38903a, this.f11934a);
        if (!h10.b()) {
            return f(n10, h10.f38903a, j10, j8, h10.f38906d);
        }
        return e(n10, h10.f38903a, h10.f38904b, h10.f38905c, j8, h10.f38906d);
    }

    public final F e(N1.N n10, Object obj, int i5, int i10, long j8, long j10) {
        k2.H h10 = new k2.H(obj, i5, i10, j10, -1);
        N1.L l10 = this.f11934a;
        long jA = n10.g(obj, l10).a(i5, i10);
        if (i10 == l10.e(i5)) {
            l10.f8054g.getClass();
        }
        l10.g(i5);
        long jMax = 0;
        if (jA != -9223372036854775807L && 0 >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new F(h10, jMax, j8, -9223372036854775807L, jA, false, false, false, false);
    }

    public final F f(N1.N n10, Object obj, long j8, long j10, long j11) {
        long j12;
        N1.L l10 = this.f11934a;
        n10.g(obj, l10);
        int iB = l10.b(j8);
        if (iB != -1) {
            l10.f(iB);
        }
        boolean z2 = false;
        if (iB != -1) {
            l10.g(iB);
        } else if (l10.f8054g.f8137a > 0) {
            l10.g(0);
        }
        k2.H h10 = new k2.H(obj, j11, iB);
        if (!h10.b() && iB == -1) {
            z2 = true;
        }
        boolean zI = i(n10, h10);
        boolean zH = h(n10, h10, z2);
        if (iB != -1) {
            l10.g(iB);
        }
        if (iB != -1) {
            l10.d(iB);
            j12 = 0;
        } else {
            j12 = -9223372036854775807L;
        }
        long j13 = (j12 == -9223372036854775807L || j12 == Long.MIN_VALUE) ? l10.f8051d : j12;
        return new F(h10, (j13 == -9223372036854775807L || j8 < j13) ? j8 : Math.max(0L, j13 - 1), j10, j12, j13, false, z2, zI, zH);
    }

    public final F g(N1.N n10, F f10) {
        long j8;
        k2.H h10 = f10.f11925a;
        boolean zB = h10.b();
        int i5 = h10.f38907e;
        boolean z2 = !zB && i5 == -1;
        boolean zI = i(n10, h10);
        boolean zH = h(n10, h10, z2);
        Object obj = h10.f38903a;
        N1.L l10 = this.f11934a;
        n10.g(obj, l10);
        if (h10.b() || i5 == -1) {
            j8 = -9223372036854775807L;
        } else {
            l10.d(i5);
            j8 = 0;
        }
        boolean zB2 = h10.b();
        int i10 = h10.f38904b;
        long jA = zB2 ? l10.a(i10, h10.f38905c) : (j8 == -9223372036854775807L || j8 == Long.MIN_VALUE) ? l10.f8051d : j8;
        if (h10.b()) {
            l10.g(i10);
        } else if (i5 != -1) {
            l10.g(i5);
        }
        return new F(h10, f10.f11926b, f10.f11927c, j8, jA, false, z2, zI, zH);
    }

    public final boolean h(N1.N n10, k2.H h10, boolean z2) {
        int iB = n10.b(h10.f38903a);
        if (!n10.m(n10.f(iB, this.f11934a, false).f8050c, this.f11935b, 0L).f8065i) {
            if (n10.d(iB, this.f11934a, this.f11935b, this.f11940g, this.f11941h) == -1 && z2) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(N1.N n10, k2.H h10) {
        if (!h10.b() && h10.f38907e == -1) {
            Object obj = h10.f38903a;
            if (n10.m(n10.g(obj, this.f11934a).f8050c, this.f11935b, 0L).f8070o == n10.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        E e7 = this.f11944l;
        if (e7 == null || e7.h()) {
            this.f11944l = null;
            for (int i5 = 0; i5 < this.f11948p.size(); i5++) {
                E e10 = (E) this.f11948p.get(i5);
                if (!e10.h()) {
                    this.f11944l = e10;
                    return;
                }
            }
        }
    }

    public final void k() {
        C3406H c3406hI = AbstractC3409K.i();
        for (E e7 = this.f11942i; e7 != null; e7 = e7.f11921m) {
            c3406hI.a(e7.f11916g.f11925a);
        }
        E e10 = this.f11943j;
        this.f11937d.c(new Ab.a(this, c3406hI, e10 == null ? null : e10.f11916g.f11925a, 8));
    }

    public final boolean l(E e7) {
        Q1.k.h(e7);
        boolean z2 = false;
        if (e7.equals(this.k)) {
            return false;
        }
        this.k = e7;
        while (true) {
            e7 = e7.f11921m;
            if (e7 == null) {
                break;
            }
            if (e7 == this.f11943j) {
                this.f11943j = this.f11942i;
                z2 = true;
            }
            e7.i();
            this.f11945m--;
        }
        E e10 = this.k;
        e10.getClass();
        if (e10.f11921m != null) {
            e10.b();
            e10.f11921m = null;
            e10.c();
        }
        k();
        return z2;
    }

    public final k2.H n(N1.N n10, Object obj, long j8) {
        long jO;
        int iB;
        Object obj2 = obj;
        N1.L l10 = this.f11934a;
        int i5 = n10.g(obj2, l10).f8050c;
        Object obj3 = this.f11946n;
        if (obj3 == null || (iB = n10.b(obj3)) == -1 || n10.f(iB, l10, false).f8050c != i5) {
            E e7 = this.f11942i;
            while (true) {
                if (e7 == null) {
                    E e10 = this.f11942i;
                    while (true) {
                        if (e10 != null) {
                            int iB2 = n10.b(e10.f11911b);
                            if (iB2 != -1 && n10.f(iB2, l10, false).f8050c == i5) {
                                jO = e10.f11916g.f11925a.f38906d;
                                break;
                            }
                            e10 = e10.f11921m;
                        } else {
                            jO = o(obj2);
                            if (jO == -1) {
                                jO = this.f11939f;
                                this.f11939f = 1 + jO;
                                if (this.f11942i == null) {
                                    this.f11946n = obj2;
                                    this.f11947o = jO;
                                }
                            }
                        }
                    }
                } else {
                    if (e7.f11911b.equals(obj2)) {
                        jO = e7.f11916g.f11925a.f38906d;
                        break;
                    }
                    e7 = e7.f11921m;
                }
            }
        } else {
            jO = this.f11947o;
        }
        n10.g(obj2, l10);
        int i10 = l10.f8050c;
        N1.M m10 = this.f11935b;
        n10.n(i10, m10);
        boolean z2 = false;
        for (int iB3 = n10.b(obj); iB3 >= m10.f8069n; iB3--) {
            n10.f(iB3, l10, true);
            boolean z10 = l10.f8054g.f8137a > 0;
            z2 |= z10;
            if (l10.c(l10.f8051d) != -1) {
                obj2 = l10.f8049b;
                obj2.getClass();
            }
            if (z2 && (!z10 || l10.f8051d != 0)) {
                break;
            }
        }
        return m(n10, obj2, j8, jO, this.f11935b, this.f11934a);
    }

    public final long o(Object obj) {
        for (int i5 = 0; i5 < this.f11948p.size(); i5++) {
            E e7 = (E) this.f11948p.get(i5);
            if (e7.f11911b.equals(obj)) {
                return e7.f11916g.f11925a.f38906d;
            }
        }
        return -1L;
    }

    public final boolean p(N1.N n10) {
        N1.N n11;
        E e7;
        E e10 = this.f11942i;
        if (e10 == null) {
            return true;
        }
        int iB = n10.b(e10.f11911b);
        while (true) {
            n11 = n10;
            iB = n11.d(iB, this.f11934a, this.f11935b, this.f11940g, this.f11941h);
            while (true) {
                e10.getClass();
                e7 = e10.f11921m;
                if (e7 == null || e10.f11916g.f11931g) {
                    break;
                }
                e10 = e7;
            }
            if (iB == -1 || e7 == null || n11.b(e7.f11911b) != iB) {
                break;
            }
            e10 = e7;
            n10 = n11;
        }
        boolean zL = l(e10);
        e10.f11916g = g(n11, e10.f11916g);
        return !zL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0085, code lost:
    
        return !l(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0086, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(N1.N r11, long r12, long r14) {
        /*
            r10 = this;
            U1.E r0 = r10.f11942i
            r1 = 0
        L3:
            r2 = 1
            if (r0 == 0) goto L86
            U1.F r3 = r0.f11916g
            if (r1 != 0) goto Lf
            U1.F r1 = r10.g(r11, r3)
            goto L2e
        Lf:
            U1.F r4 = r10.c(r11, r1, r12)
            if (r4 != 0) goto L1b
            boolean r11 = r10.l(r1)
            r11 = r11 ^ r2
            return r11
        L1b:
            long r5 = r3.f11926b
            long r7 = r4.f11926b
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L80
            k2.H r5 = r3.f11925a
            k2.H r6 = r4.f11925a
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L80
            r1 = r4
        L2e:
            long r4 = r3.f11927c
            U1.F r4 = r1.a(r4)
            r0.f11916g = r4
            long r3 = r3.f11929e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L7a
            long r7 = r1.f11929e
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 != 0) goto L48
            goto L7a
        L48:
            r0.k()
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 != 0) goto L55
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L58
        L55:
            long r11 = r0.f11924p
            long r11 = r11 + r7
        L58:
            U1.E r13 = r10.f11943j
            r1 = 0
            if (r0 != r13) goto L6f
            U1.F r13 = r0.f11916g
            boolean r13 = r13.f11930f
            if (r13 != 0) goto L6f
            r3 = -9223372036854775808
            int r13 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r13 == 0) goto L6d
            int r11 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r11 < 0) goto L6f
        L6d:
            r11 = r2
            goto L70
        L6f:
            r11 = r1
        L70:
            boolean r12 = r10.l(r0)
            if (r12 != 0) goto L79
            if (r11 != 0) goto L79
            goto L86
        L79:
            return r1
        L7a:
            U1.E r1 = r0.f11921m
            r9 = r1
            r1 = r0
            r0 = r9
            goto L3
        L80:
            boolean r11 = r10.l(r1)
            r11 = r11 ^ r2
            return r11
        L86:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.G.q(N1.N, long, long):boolean");
    }
}
