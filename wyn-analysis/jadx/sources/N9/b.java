package N9;

import Va.M6;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f8603a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8604b;

    public b(long j8, long j10) {
        this.f8603a = j8;
        this.f8604b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        bVar.getClass();
        return this.f8603a == bVar.f8603a && this.f8604b == bVar.f8604b;
    }

    public final int hashCode() {
        long j8 = this.f8603a;
        int i5 = (((int) (j8 ^ (j8 >>> 32))) ^ 430065837) * 1000003;
        long j10 = this.f8604b;
        return i5 ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RateLimit{limiterKey=APP_FOREGROUND_ONE_PER_DAY_LIMITER_KEY, limit=");
        sb2.append(this.f8603a);
        sb2.append(", timeToLiveMillis=");
        return M6.s(sb2, this.f8604b, "}");
    }
}
