package U1;

import E5.n0;
import android.util.Pair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import k2.C3139A;
import k2.C3148e;
import k2.C3165w;
import k2.d0;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11910a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11911b;

    /* renamed from: c, reason: collision with root package name */
    public final d0[] f11912c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11913d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11914e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11915f;

    /* renamed from: g, reason: collision with root package name */
    public F f11916g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11917h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f11918i;

    /* renamed from: j, reason: collision with root package name */
    public final X[] f11919j;
    public final n2.s k;

    /* renamed from: l, reason: collision with root package name */
    public final n0 f11920l;

    /* renamed from: m, reason: collision with root package name */
    public E f11921m;

    /* renamed from: n, reason: collision with root package name */
    public k2.n0 f11922n;

    /* renamed from: o, reason: collision with root package name */
    public n2.t f11923o;

    /* renamed from: p, reason: collision with root package name */
    public long f11924p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [k2.e] */
    public E(X[] xArr, long j8, n2.s sVar, o2.e eVar, n0 n0Var, F f10, n2.t tVar) {
        this.f11919j = xArr;
        this.f11924p = j8;
        this.k = sVar;
        this.f11920l = n0Var;
        k2.H h10 = f10.f11925a;
        this.f11911b = h10.f38903a;
        this.f11916g = f10;
        this.f11922n = k2.n0.f39127d;
        this.f11923o = tVar;
        this.f11912c = new d0[xArr.length];
        this.f11918i = new boolean[xArr.length];
        n0Var.getClass();
        int i5 = AbstractC0831a.f12016d;
        Pair pair = (Pair) h10.f38903a;
        Object obj = pair.first;
        k2.H hA = h10.a(pair.second);
        O o7 = (O) ((HashMap) n0Var.f3474d).get(obj);
        o7.getClass();
        ((HashSet) n0Var.f3476f).add(o7);
        N n10 = (N) ((HashMap) n0Var.f3475e).get(o7);
        if (n10 != null) {
            n10.f11968a.e(n10.f11969b);
        }
        o7.f11973c.add(hA);
        C3139A c3139aB = o7.f11971a.b(hA, eVar, f10.f11926b);
        ((IdentityHashMap) n0Var.f3473c).put(c3139aB, o7);
        n0Var.g();
        long j10 = f10.f11928d;
        this.f11910a = j10 != -9223372036854775807L ? new C3148e(c3139aB, true, 0L, j10) : c3139aB;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, k2.F] */
    public final long a(n2.t tVar, long j8, boolean z2, boolean[] zArr) {
        X[] xArr;
        d0[] d0VarArr;
        int i5 = 0;
        while (true) {
            boolean z10 = true;
            if (i5 >= tVar.f40897a) {
                break;
            }
            if (z2 || !tVar.a(this.f11923o, i5)) {
                z10 = false;
            }
            this.f11918i[i5] = z10;
            i5++;
        }
        int i10 = 0;
        while (true) {
            xArr = this.f11919j;
            int length = xArr.length;
            d0VarArr = this.f11912c;
            if (i10 >= length) {
                break;
            }
            if (xArr[i10].f() == -2) {
                d0VarArr[i10] = null;
            }
            i10++;
        }
        b();
        this.f11923o = tVar;
        c();
        long jR = this.f11910a.r(tVar.f40899c, this.f11918i, this.f11912c, zArr, j8);
        for (int i11 = 0; i11 < xArr.length; i11++) {
            if (xArr[i11].f() == -2 && this.f11923o.b(i11)) {
                d0VarArr[i11] = new C3165w();
            }
        }
        this.f11915f = false;
        for (int i12 = 0; i12 < d0VarArr.length; i12++) {
            if (d0VarArr[i12] != null) {
                Q1.k.g(tVar.b(i12));
                if (xArr[i12].f() != -2) {
                    this.f11915f = true;
                }
            } else {
                Q1.k.g(tVar.f40899c[i12] == null);
            }
        }
        return jR;
    }

    public final void b() {
        if (this.f11921m != null) {
            return;
        }
        int i5 = 0;
        while (true) {
            n2.t tVar = this.f11923o;
            if (i5 >= tVar.f40897a) {
                return;
            }
            boolean zB = tVar.b(i5);
            n2.q qVar = this.f11923o.f40899c[i5];
            if (zB && qVar != null) {
                qVar.a();
            }
            i5++;
        }
    }

    public final void c() {
        if (this.f11921m != null) {
            return;
        }
        int i5 = 0;
        while (true) {
            n2.t tVar = this.f11923o;
            if (i5 >= tVar.f40897a) {
                return;
            }
            boolean zB = tVar.b(i5);
            n2.q qVar = this.f11923o.f40899c[i5];
            if (zB && qVar != null) {
                qVar.i();
            }
            i5++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, k2.f0] */
    public final long d() {
        if (!this.f11914e) {
            return this.f11916g.f11926b;
        }
        long jN = this.f11915f ? this.f11910a.n() : Long.MIN_VALUE;
        return jN == Long.MIN_VALUE ? this.f11916g.f11929e : jN;
    }

    public final long e() {
        return this.f11916g.f11926b + this.f11924p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k2.F] */
    public final void f(float f10, N1.N n10, boolean z2) {
        this.f11914e = true;
        this.f11922n = this.f11910a.j();
        n2.t tVarJ = j(f10, n10, z2);
        F f11 = this.f11916g;
        long j8 = f11.f11929e;
        long jMax = f11.f11926b;
        if (j8 != -9223372036854775807L && jMax >= j8) {
            jMax = Math.max(0L, j8 - 1);
        }
        long jA = a(tVarJ, jMax, false, new boolean[this.f11919j.length]);
        long j10 = this.f11924p;
        F f12 = this.f11916g;
        this.f11924p = (f12.f11926b - jA) + j10;
        this.f11916g = f12.b(jA);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, k2.f0] */
    public final boolean g() {
        if (this.f11914e) {
            return !this.f11915f || this.f11910a.n() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.f11914e) {
            return g() || d() - this.f11916g.f11926b >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k2.F] */
    public final void i() {
        b();
        ?? r02 = this.f11910a;
        try {
            boolean z2 = r02 instanceof C3148e;
            n0 n0Var = this.f11920l;
            if (z2) {
                n0Var.q(((C3148e) r02).f39061a);
            } else {
                n0Var.q(r02);
            }
        } catch (RuntimeException e7) {
            Q1.k.l("MediaPeriodHolder", "Period release failed.", e7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0310  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final n2.t j(float r32, N1.N r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 2158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.E.j(float, N1.N, boolean):n2.t");
    }

    public final void k() {
        Object obj = this.f11910a;
        if (obj instanceof C3148e) {
            long j8 = this.f11916g.f11928d;
            if (j8 == -9223372036854775807L) {
                j8 = Long.MIN_VALUE;
            }
            C3148e c3148e = (C3148e) obj;
            c3148e.f39065e = 0L;
            c3148e.f39066f = j8;
        }
    }
}
