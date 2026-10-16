package s8;

import Va.M6;

/* renamed from: s8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4025a {

    /* renamed from: a, reason: collision with root package name */
    public final long f45318a;

    /* renamed from: b, reason: collision with root package name */
    public final long f45319b;

    /* renamed from: c, reason: collision with root package name */
    public final long f45320c;

    public C4025a(long j8, long j10, long j11) {
        this.f45318a = j8;
        this.f45319b = j10;
        this.f45320c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4025a) {
            C4025a c4025a = (C4025a) obj;
            if (this.f45318a == c4025a.f45318a && this.f45319b == c4025a.f45319b && this.f45320c == c4025a.f45320c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f45318a;
        long j10 = this.f45319b;
        int i5 = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f45320c;
        return i5 ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f45318a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f45319b);
        sb2.append(", uptimeMillis=");
        return M6.s(sb2, this.f45320c, "}");
    }
}
