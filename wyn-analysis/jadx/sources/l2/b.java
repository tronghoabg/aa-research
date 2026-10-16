package L2;

import Q1.l;
import Q1.x;
import java.math.RoundingMode;
import s2.u;
import s2.v;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long f6829a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6830b;

    /* renamed from: c, reason: collision with root package name */
    public final u f6831c;

    public b(long j8, long j10, long j11) {
        this.f6831c = new u(new long[]{j10}, new long[]{0}, j8);
        this.f6829a = j11;
        int i5 = -2147483647;
        if (j8 == -9223372036854775807L) {
            this.f6830b = -2147483647;
            return;
        }
        long jS = x.S(j10 - j11, 8L, j8, RoundingMode.HALF_UP);
        if (jS > 0 && jS <= 2147483647L) {
            i5 = (int) jS;
        }
        this.f6830b = i5;
    }

    @Override // L2.f
    public final long b(long j8) {
        u uVar = this.f6831c;
        l lVar = uVar.f44933b;
        if (lVar.f9690b == 0) {
            return -9223372036854775807L;
        }
        return lVar.c(x.b(uVar.f44932a, j8));
    }

    @Override // s2.w
    public final v c(long j8) {
        return this.f6831c.c(j8);
    }

    @Override // L2.f
    public final long d() {
        return this.f6829a;
    }

    @Override // s2.w
    public final boolean e() {
        return this.f6831c.e();
    }

    @Override // s2.w
    public final long f() {
        return this.f6831c.f44934c;
    }

    @Override // L2.f
    public final int l() {
        return this.f6830b;
    }
}
