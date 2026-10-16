package U1;

import android.os.SystemClock;
import java.util.List;
import k2.n0;
import l8.e0;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: u, reason: collision with root package name */
    public static final k2.H f11976u = new k2.H(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final N1.N f11977a;

    /* renamed from: b, reason: collision with root package name */
    public final k2.H f11978b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11979c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11980d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11981e;

    /* renamed from: f, reason: collision with root package name */
    public final C0840j f11982f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11983g;

    /* renamed from: h, reason: collision with root package name */
    public final n0 f11984h;

    /* renamed from: i, reason: collision with root package name */
    public final n2.t f11985i;

    /* renamed from: j, reason: collision with root package name */
    public final List f11986j;
    public final k2.H k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f11987l;

    /* renamed from: m, reason: collision with root package name */
    public final int f11988m;

    /* renamed from: n, reason: collision with root package name */
    public final int f11989n;

    /* renamed from: o, reason: collision with root package name */
    public final N1.F f11990o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f11991p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f11992q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f11993r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f11994s;

    /* renamed from: t, reason: collision with root package name */
    public volatile long f11995t;

    public P(N1.N n10, k2.H h10, long j8, long j10, int i5, C0840j c0840j, boolean z2, n0 n0Var, n2.t tVar, List list, k2.H h11, boolean z10, int i10, int i11, N1.F f10, long j11, long j12, long j13, long j14, boolean z11) {
        this.f11977a = n10;
        this.f11978b = h10;
        this.f11979c = j8;
        this.f11980d = j10;
        this.f11981e = i5;
        this.f11982f = c0840j;
        this.f11983g = z2;
        this.f11984h = n0Var;
        this.f11985i = tVar;
        this.f11986j = list;
        this.k = h11;
        this.f11987l = z10;
        this.f11988m = i10;
        this.f11989n = i11;
        this.f11990o = f10;
        this.f11992q = j11;
        this.f11993r = j12;
        this.f11994s = j13;
        this.f11995t = j14;
        this.f11991p = z11;
    }

    public static P i(n2.t tVar) {
        N1.K k = N1.N.f8072a;
        k2.H h10 = f11976u;
        return new P(k, h10, -9223372036854775807L, 0L, 1, null, false, n0.f39127d, tVar, e0.f40101e, h10, false, 1, 0, N1.F.f8031d, 0L, 0L, 0L, 0L, false);
    }

    public final P a() {
        return new P(this.f11977a, this.f11978b, this.f11979c, this.f11980d, this.f11981e, this.f11982f, this.f11983g, this.f11984h, this.f11985i, this.f11986j, this.k, this.f11987l, this.f11988m, this.f11989n, this.f11990o, this.f11992q, this.f11993r, j(), SystemClock.elapsedRealtime(), this.f11991p);
    }

    public final P b(k2.H h10) {
        return new P(this.f11977a, this.f11978b, this.f11979c, this.f11980d, this.f11981e, this.f11982f, this.f11983g, this.f11984h, this.f11985i, this.f11986j, h10, this.f11987l, this.f11988m, this.f11989n, this.f11990o, this.f11992q, this.f11993r, this.f11994s, this.f11995t, this.f11991p);
    }

    public final P c(k2.H h10, long j8, long j10, long j11, long j12, n0 n0Var, n2.t tVar, List list) {
        return new P(this.f11977a, h10, j10, j11, this.f11981e, this.f11982f, this.f11983g, n0Var, tVar, list, this.k, this.f11987l, this.f11988m, this.f11989n, this.f11990o, this.f11992q, j12, j8, SystemClock.elapsedRealtime(), this.f11991p);
    }

    public final P d(int i5, int i10, boolean z2) {
        return new P(this.f11977a, this.f11978b, this.f11979c, this.f11980d, this.f11981e, this.f11982f, this.f11983g, this.f11984h, this.f11985i, this.f11986j, this.k, z2, i5, i10, this.f11990o, this.f11992q, this.f11993r, this.f11994s, this.f11995t, this.f11991p);
    }

    public final P e(C0840j c0840j) {
        return new P(this.f11977a, this.f11978b, this.f11979c, this.f11980d, this.f11981e, c0840j, this.f11983g, this.f11984h, this.f11985i, this.f11986j, this.k, this.f11987l, this.f11988m, this.f11989n, this.f11990o, this.f11992q, this.f11993r, this.f11994s, this.f11995t, this.f11991p);
    }

    public final P f(N1.F f10) {
        return new P(this.f11977a, this.f11978b, this.f11979c, this.f11980d, this.f11981e, this.f11982f, this.f11983g, this.f11984h, this.f11985i, this.f11986j, this.k, this.f11987l, this.f11988m, this.f11989n, f10, this.f11992q, this.f11993r, this.f11994s, this.f11995t, this.f11991p);
    }

    public final P g(int i5) {
        return new P(this.f11977a, this.f11978b, this.f11979c, this.f11980d, i5, this.f11982f, this.f11983g, this.f11984h, this.f11985i, this.f11986j, this.k, this.f11987l, this.f11988m, this.f11989n, this.f11990o, this.f11992q, this.f11993r, this.f11994s, this.f11995t, this.f11991p);
    }

    public final P h(N1.N n10) {
        return new P(n10, this.f11978b, this.f11979c, this.f11980d, this.f11981e, this.f11982f, this.f11983g, this.f11984h, this.f11985i, this.f11986j, this.k, this.f11987l, this.f11988m, this.f11989n, this.f11990o, this.f11992q, this.f11993r, this.f11994s, this.f11995t, this.f11991p);
    }

    public final long j() {
        long j8;
        long j10;
        if (!k()) {
            return this.f11994s;
        }
        do {
            j8 = this.f11995t;
            j10 = this.f11994s;
        } while (j8 != this.f11995t);
        return Q1.x.K(Q1.x.W(j10) + ((long) ((SystemClock.elapsedRealtime() - j8) * this.f11990o.f8032a)));
    }

    public final boolean k() {
        return this.f11981e == 3 && this.f11987l && this.f11989n == 0;
    }
}
