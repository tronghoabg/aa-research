package A7;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC1732v;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class E {

    /* renamed from: A, reason: collision with root package name */
    public Long f438A;

    /* renamed from: B, reason: collision with root package name */
    public Long f439B;

    /* renamed from: C, reason: collision with root package name */
    public long f440C;

    /* renamed from: D, reason: collision with root package name */
    public String f441D;

    /* renamed from: E, reason: collision with root package name */
    public int f442E;

    /* renamed from: F, reason: collision with root package name */
    public int f443F;

    /* renamed from: G, reason: collision with root package name */
    public long f444G;

    /* renamed from: H, reason: collision with root package name */
    public String f445H;

    /* renamed from: I, reason: collision with root package name */
    public byte[] f446I;

    /* renamed from: J, reason: collision with root package name */
    public long f447J;

    /* renamed from: K, reason: collision with root package name */
    public long f448K;
    public long L;

    /* renamed from: M, reason: collision with root package name */
    public long f449M;

    /* renamed from: N, reason: collision with root package name */
    public long f450N;

    /* renamed from: O, reason: collision with root package name */
    public long f451O;

    /* renamed from: P, reason: collision with root package name */
    public String f452P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f453Q;

    /* renamed from: R, reason: collision with root package name */
    public long f454R;

    /* renamed from: S, reason: collision with root package name */
    public long f455S;

    /* renamed from: a, reason: collision with root package name */
    public final C0273n0 f456a;

    /* renamed from: b, reason: collision with root package name */
    public final String f457b;

    /* renamed from: c, reason: collision with root package name */
    public String f458c;

    /* renamed from: d, reason: collision with root package name */
    public String f459d;

    /* renamed from: e, reason: collision with root package name */
    public String f460e;

    /* renamed from: f, reason: collision with root package name */
    public String f461f;

    /* renamed from: g, reason: collision with root package name */
    public long f462g;

    /* renamed from: h, reason: collision with root package name */
    public long f463h;

    /* renamed from: i, reason: collision with root package name */
    public long f464i;

    /* renamed from: j, reason: collision with root package name */
    public String f465j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public String f466l;

    /* renamed from: m, reason: collision with root package name */
    public long f467m;

    /* renamed from: n, reason: collision with root package name */
    public long f468n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f469o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f470p;

    /* renamed from: q, reason: collision with root package name */
    public String f471q;

    /* renamed from: r, reason: collision with root package name */
    public Boolean f472r;

    /* renamed from: s, reason: collision with root package name */
    public long f473s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f474t;

    /* renamed from: u, reason: collision with root package name */
    public String f475u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f476v;

    /* renamed from: w, reason: collision with root package name */
    public long f477w;

    /* renamed from: x, reason: collision with root package name */
    public long f478x;

    /* renamed from: y, reason: collision with root package name */
    public int f479y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f480z;

    public E(C0273n0 c0273n0, String str) {
        AbstractC1732v.i(c0273n0);
        AbstractC1732v.f(str);
        this.f456a = c0273n0;
        this.f457b = str;
        C0264k0 c0264k0 = c0273n0.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
    }

    public final void A(String str) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= !Objects.equals(this.f461f, str);
        this.f461f = str;
    }

    public final void B(long j8) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= this.f450N != j8;
        this.f450N = j8;
    }

    public final void C(String str) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f453Q |= !Objects.equals(this.f459d, str);
        this.f459d = str;
    }

    public final void D(long j8) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= this.L != j8;
        this.L = j8;
    }

    public final void E(String str) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= !Objects.equals(this.f452P, str);
        this.f452P = str;
    }

    public final void F(long j8) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= this.f448K != j8;
        this.f448K = j8;
    }

    public final void G(String str) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= !Objects.equals(this.f460e, str);
        this.f460e = str;
    }

    public final void H(long j8) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= this.f451O != j8;
        this.f451O = j8;
    }

    public final void I(long j8) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= this.f447J != j8;
        this.f447J = j8;
    }

    public final void J(long j8) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= this.f468n != j8;
        this.f468n = j8;
    }

    public final void K(long j8) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= this.f473s != j8;
        this.f473s = j8;
    }

    public final void L(long j8) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= this.f455S != j8;
        this.f455S = j8;
    }

    public final void M(long j8) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= this.f467m != j8;
        this.f467m = j8;
    }

    public final long N() {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        return this.f473s;
    }

    public final void O(long j8) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= this.f444G != j8;
        this.f444G = j8;
    }

    public final void P(long j8) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= this.f464i != j8;
        this.f464i = j8;
    }

    public final void Q(long j8) {
        AbstractC1732v.b(j8 >= 0);
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= this.f462g != j8;
        this.f462g = j8;
    }

    public final void R(long j8) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= this.f463h != j8;
        this.f463h = j8;
    }

    public final void S(long j8) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= this.f478x != j8;
        this.f478x = j8;
    }

    public final void T(long j8) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= this.f477w != j8;
        this.f477w = j8;
    }

    public final Boolean U() {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        return this.f472r;
    }

    public final void a(long j8) {
        C0273n0 c0273n0 = this.f456a;
        C0264k0 c0264k0 = c0273n0.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        long j10 = this.f462g + j8;
        N n10 = c0273n0.f981i;
        String str = this.f457b;
        if (j10 > 2147483647L) {
            C0273n0.d(n10);
            n10.f608i.d("Bundle index overflow. appId", N.h0(str));
            j10 = j8 - 1;
        }
        long j11 = this.f444G + 1;
        if (j11 > 2147483647L) {
            C0273n0.d(n10);
            n10.f608i.d("Delivery index overflow. appId", N.h0(str));
            j11 = 0;
        }
        this.f453Q = true;
        this.f462g = j10;
        this.f444G = j11;
    }

    public final void b(String str) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f453Q |= !Objects.equals(this.f471q, str);
        this.f471q = str;
    }

    public final void c(List list) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        if (Objects.equals(this.f474t, list)) {
            return;
        }
        this.f453Q = true;
        this.f474t = list != null ? new ArrayList(list) : null;
    }

    public final String d() {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        return this.f471q;
    }

    public final String e() {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        String str = this.f452P;
        E(null);
        return str;
    }

    public final String f() {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        return this.f457b;
    }

    public final String g() {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        return this.f458c;
    }

    public final String h() {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        return this.f465j;
    }

    public final String i() {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        return this.f461f;
    }

    public final String j() {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        return this.f459d;
    }

    public final String k() {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        return this.f445H;
    }

    public final String l() {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        return this.f441D;
    }

    public final void m() {
        C0273n0 c0273n0 = this.f456a;
        C0264k0 c0264k0 = c0273n0.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        long j8 = this.f462g + 1;
        if (j8 > 2147483647L) {
            N n10 = c0273n0.f981i;
            C0273n0.d(n10);
            n10.f608i.d("Bundle index overflow. appId", N.h0(this.f457b));
            j8 = 0;
        }
        this.f453Q = true;
        this.f462g = j8;
    }

    public final boolean n() {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        return this.f453Q;
    }

    public final boolean o() {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        return this.f476v;
    }

    public final void p(int i5) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= this.f443F != i5;
        this.f443F = i5;
    }

    public final void q(long j8) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= this.k != j8;
        this.k = j8;
    }

    public final void r(String str) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= !Objects.equals(this.f458c, str);
        this.f458c = str;
    }

    public final void s(boolean z2) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= this.f469o != z2;
        this.f469o = z2;
    }

    public final void t(int i5) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= this.f442E != i5;
        this.f442E = i5;
    }

    public final void u(long j8) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= this.f440C != j8;
        this.f440C = j8;
    }

    public final void v(String str) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= !Objects.equals(this.f466l, str);
        this.f466l = str;
    }

    public final void w(long j8) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= this.f454R != j8;
        this.f454R = j8;
    }

    public final void x(String str) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= !Objects.equals(this.f465j, str);
        this.f465j = str;
    }

    public final long y() {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        return this.k;
    }

    public final void z(long j8) {
        C0264k0 c0264k0 = this.f456a.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        this.f453Q |= this.f449M != j8;
        this.f449M = j8;
    }
}
