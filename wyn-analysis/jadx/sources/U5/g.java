package U5;

import J5.s;
import J5.t;
import J5.u;
import u6.v;

/* loaded from: classes3.dex */
public final class g implements t {

    /* renamed from: a, reason: collision with root package name */
    public final e f12346a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12347b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12348c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12349d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12350e;

    public g(e eVar, int i5, long j8, long j10) {
        this.f12346a = eVar;
        this.f12347b = i5;
        this.f12348c = j8;
        long j11 = (j10 - j8) / eVar.f12341c;
        this.f12349d = j11;
        this.f12350e = v.D(j11 * i5, 1000000L, eVar.f12340b);
    }

    @Override // J5.t
    public final s c(long j8) {
        e eVar = this.f12346a;
        int i5 = this.f12347b;
        long j10 = this.f12349d - 1;
        long jI = v.i((eVar.f12340b * j8) / (i5 * 1000000), 0L, j10);
        int i10 = eVar.f12341c;
        long j11 = this.f12348c;
        long jD = v.D(jI * i5, 1000000L, eVar.f12340b);
        u uVar = new u(jD, (i10 * jI) + j11);
        if (jD >= j8 || jI == j10) {
            return new s(uVar, uVar);
        }
        long j12 = jI + 1;
        return new s(uVar, new u(v.D(j12 * i5, 1000000L, eVar.f12340b), (i10 * j12) + j11));
    }

    @Override // J5.t
    public final boolean e() {
        return true;
    }

    @Override // J5.t
    public final long f() {
        return this.f12350e;
    }
}
