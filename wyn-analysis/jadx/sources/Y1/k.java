package Y1;

import N1.C0765n;
import java.util.ArrayList;
import l8.AbstractC3409K;

/* loaded from: classes.dex */
public final class k extends m implements X1.g {

    /* renamed from: f, reason: collision with root package name */
    public final n f16355f;

    public k(C0765n c0765n, AbstractC3409K abstractC3409K, n nVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(c0765n, abstractC3409K, nVar, arrayList, arrayList2, arrayList3);
        this.f16355f = nVar;
    }

    @Override // X1.g
    public final boolean D() {
        return this.f16355f.i();
    }

    @Override // X1.g
    public final long E() {
        return this.f16355f.f16363d;
    }

    @Override // X1.g
    public final long F(long j8, long j10) {
        return this.f16355f.b(j8, j10);
    }

    @Override // Y1.m
    public final String a() {
        return null;
    }

    @Override // X1.g
    public final long b(long j8) {
        return this.f16355f.g(j8);
    }

    @Override // Y1.m
    public final j d() {
        return null;
    }

    @Override // X1.g
    public final long o(long j8, long j10) {
        return this.f16355f.e(j8, j10);
    }

    @Override // X1.g
    public final long q(long j8, long j10) {
        return this.f16355f.c(j8, j10);
    }

    @Override // X1.g
    public final long r(long j8, long j10) {
        n nVar = this.f16355f;
        if (nVar.f16365f != null) {
            return -9223372036854775807L;
        }
        long jB = nVar.b(j8, j10) + nVar.c(j8, j10);
        return (nVar.e(jB, j8) + nVar.g(jB)) - nVar.f16368i;
    }

    @Override // X1.g
    public final j u(long j8) {
        return this.f16355f.h(this, j8);
    }

    @Override // X1.g
    public final long v(long j8, long j10) {
        return this.f16355f.f(j8, j10);
    }

    @Override // X1.g
    public final long w(long j8) {
        return this.f16355f.d(j8);
    }

    @Override // Y1.m
    public final X1.g c() {
        return this;
    }
}
