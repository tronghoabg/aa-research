package Q5;

import J5.s;
import J5.u;
import android.util.Pair;
import u6.v;

/* loaded from: classes3.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f9854a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f9855b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9856c;

    public c(long[] jArr, long[] jArr2, long j8) {
        this.f9854a = jArr;
        this.f9855b = jArr2;
        this.f9856c = j8 == -9223372036854775807L ? v.y(jArr2[jArr2.length - 1]) : j8;
    }

    public static Pair a(long j8, long[] jArr, long[] jArr2) {
        int iE = v.e(jArr, j8, true);
        long j10 = jArr[iE];
        long j11 = jArr2[iE];
        int i5 = iE + 1;
        if (i5 == jArr.length) {
            return Pair.create(Long.valueOf(j10), Long.valueOf(j11));
        }
        return Pair.create(Long.valueOf(j8), Long.valueOf(((long) ((jArr[i5] == j10 ? 0.0d : (j8 - j10) / (r6 - j10)) * (jArr2[i5] - j11))) + j11));
    }

    @Override // Q5.f
    public final long b(long j8) {
        return v.y(((Long) a(j8, this.f9854a, this.f9855b).second).longValue());
    }

    @Override // J5.t
    public final s c(long j8) {
        Pair pairA = a(v.F(v.i(j8, 0L, this.f9856c)), this.f9855b, this.f9854a);
        u uVar = new u(v.y(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue());
        return new s(uVar, uVar);
    }

    @Override // Q5.f
    public final long d() {
        return -1L;
    }

    @Override // J5.t
    public final boolean e() {
        return true;
    }

    @Override // J5.t
    public final long f() {
        return this.f9856c;
    }
}
