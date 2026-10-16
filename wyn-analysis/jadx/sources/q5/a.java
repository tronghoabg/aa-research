package Q5;

import J5.s;
import J5.t;
import J5.u;

/* loaded from: classes3.dex */
public final class a implements f, t {

    /* renamed from: a, reason: collision with root package name */
    public final long f9847a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9848b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9849c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9850d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9851e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9852f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9853g;

    public a(long j8, long j10, int i5, int i10, boolean z2) {
        this.f9847a = j8;
        this.f9848b = j10;
        this.f9849c = i10 == -1 ? 1 : i10;
        this.f9851e = i5;
        this.f9853g = z2;
        if (j8 == -1) {
            this.f9850d = -1L;
            this.f9852f = -9223372036854775807L;
        } else {
            long j11 = j8 - j10;
            this.f9850d = j11;
            this.f9852f = (Math.max(0L, j11) * 8000000) / i5;
        }
    }

    @Override // Q5.f
    public final long b(long j8) {
        return (Math.max(0L, j8 - this.f9848b) * 8000000) / this.f9851e;
    }

    @Override // J5.t
    public final s c(long j8) {
        long j10 = this.f9850d;
        long j11 = this.f9848b;
        if (j10 == -1 && !this.f9853g) {
            u uVar = new u(0L, j11);
            return new s(uVar, uVar);
        }
        int i5 = this.f9851e;
        long j12 = this.f9849c;
        long jMin = (((i5 * j8) / 8000000) / j12) * j12;
        if (j10 != -1) {
            jMin = Math.min(jMin, j10 - j12);
        }
        long jMax = Math.max(jMin, 0L) + j11;
        long jMax2 = (Math.max(0L, jMax - j11) * 8000000) / i5;
        u uVar2 = new u(jMax2, jMax);
        if (j10 != -1 && jMax2 < j8) {
            long j13 = jMax + j12;
            if (j13 < this.f9847a) {
                return new s(uVar2, new u((Math.max(0L, j13 - j11) * 8000000) / i5, j13));
            }
        }
        return new s(uVar2, uVar2);
    }

    @Override // Q5.f
    public final long d() {
        return -1L;
    }

    @Override // J5.t
    public final boolean e() {
        return this.f9850d != -1 || this.f9853g;
    }

    @Override // J5.t
    public final long f() {
        return this.f9852f;
    }
}
