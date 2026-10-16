package k2;

import N1.C0765n;
import java.util.List;
import l2.AbstractC3380e;

/* loaded from: classes.dex */
public final class N implements n2.q {

    /* renamed from: a, reason: collision with root package name */
    public final n2.q f38919a;

    /* renamed from: b, reason: collision with root package name */
    public final N1.O f38920b;

    public N(n2.q qVar, N1.O o7) {
        this.f38919a = qVar;
        this.f38920b = o7;
    }

    @Override // n2.q
    public final void a() {
        this.f38919a.a();
    }

    @Override // n2.q
    public final C0765n b(int i5) {
        return this.f38920b.f8076d[this.f38919a.c(i5)];
    }

    @Override // n2.q
    public final int c(int i5) {
        return this.f38919a.c(i5);
    }

    @Override // n2.q
    public final void d(float f10) {
        this.f38919a.d(f10);
    }

    @Override // n2.q
    public final void e() {
        this.f38919a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return this.f38919a.equals(n10.f38919a) && this.f38920b.equals(n10.f38920b);
    }

    @Override // n2.q
    public final int f(int i5) {
        return this.f38919a.f(i5);
    }

    @Override // n2.q
    public final N1.O g() {
        return this.f38920b;
    }

    @Override // n2.q
    public final void h(boolean z2) {
        this.f38919a.h(z2);
    }

    public final int hashCode() {
        return this.f38919a.hashCode() + ((this.f38920b.hashCode() + 527) * 31);
    }

    @Override // n2.q
    public final void i() {
        this.f38919a.i();
    }

    @Override // n2.q
    public final C0765n j() {
        return this.f38920b.f8076d[this.f38919a.t()];
    }

    @Override // n2.q
    public final void k() {
        this.f38919a.k();
    }

    @Override // n2.q
    public final void l(long j8, long j10, long j11, List list, l2.m[] mVarArr) {
        this.f38919a.l(j8, j10, j11, list, mVarArr);
    }

    @Override // n2.q
    public final int length() {
        return this.f38919a.length();
    }

    @Override // n2.q
    public final boolean m(int i5, long j8) {
        return this.f38919a.m(i5, j8);
    }

    @Override // n2.q
    public final int n() {
        return this.f38919a.n();
    }

    @Override // n2.q
    public final boolean o(int i5, long j8) {
        return this.f38919a.o(i5, j8);
    }

    @Override // n2.q
    public final Object p() {
        return this.f38919a.p();
    }

    @Override // n2.q
    public final int q(C0765n c0765n) {
        return this.f38919a.f(this.f38920b.a(c0765n));
    }

    @Override // n2.q
    public final boolean r(long j8, AbstractC3380e abstractC3380e, List list) {
        return this.f38919a.r(j8, abstractC3380e, list);
    }

    @Override // n2.q
    public final int s(long j8, List list) {
        return this.f38919a.s(j8, list);
    }

    @Override // n2.q
    public final int t() {
        return this.f38919a.t();
    }

    @Override // n2.q
    public final int u() {
        return this.f38919a.u();
    }
}
