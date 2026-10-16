package od;

import A7.C0237b0;
import java.util.Arrays;
import java.util.Set;
import l8.AbstractC3414P;

/* loaded from: classes5.dex */
public final class I1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f41602a;

    /* renamed from: b, reason: collision with root package name */
    public final long f41603b;

    /* renamed from: c, reason: collision with root package name */
    public final long f41604c;

    /* renamed from: d, reason: collision with root package name */
    public final double f41605d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f41606e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC3414P f41607f;

    public I1(int i5, long j8, long j10, double d3, Long l10, Set set) {
        this.f41602a = i5;
        this.f41603b = j8;
        this.f41604c = j10;
        this.f41605d = d3;
        this.f41606e = l10;
        this.f41607f = AbstractC3414P.j(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof I1)) {
            return false;
        }
        I1 i12 = (I1) obj;
        return this.f41602a == i12.f41602a && this.f41603b == i12.f41603b && this.f41604c == i12.f41604c && Double.compare(this.f41605d, i12.f41605d) == 0 && Fe.b.v(this.f41606e, i12.f41606e) && Fe.b.v(this.f41607f, i12.f41607f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f41602a), Long.valueOf(this.f41603b), Long.valueOf(this.f41604c), Double.valueOf(this.f41605d), this.f41606e, this.f41607f});
    }

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.h("maxAttempts", String.valueOf(this.f41602a));
        c0237b0S.e(this.f41603b, "initialBackoffNanos");
        c0237b0S.e(this.f41604c, "maxBackoffNanos");
        c0237b0S.h("backoffMultiplier", String.valueOf(this.f41605d));
        c0237b0S.f(this.f41606e, "perAttemptRecvTimeoutNanos");
        c0237b0S.f(this.f41607f, "retryableStatusCodes");
        return c0237b0S.toString();
    }
}
