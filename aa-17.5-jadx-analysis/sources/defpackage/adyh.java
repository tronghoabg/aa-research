package defpackage;

import j$.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
final class adyh {
    final int a;
    final long b;
    final long c;
    final double d;
    final Long e;
    final Set f;

    public adyh(int i, long j, long j2, double d, Long l, Set set) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = l;
        this.f = ygr.n(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adyh)) {
            return false;
        }
        adyh adyhVar = (adyh) obj;
        return this.a == adyhVar.a && this.b == adyhVar.b && this.c == adyhVar.c && Double.compare(this.d, adyhVar.d) == 0 && Objects.equals(this.e, adyhVar.e) && Objects.equals(this.f, adyhVar.f);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Double.valueOf(this.d), this.e, this.f);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.f("maxAttempts", this.a);
        xxgVarAo.g("initialBackoffNanos", this.b);
        xxgVarAo.g("maxBackoffNanos", this.c);
        xxgVarAo.d("backoffMultiplier", this.d);
        xxgVarAo.b("perAttemptRecvTimeoutNanos", this.e);
        xxgVarAo.b("retryableStatusCodes", this.f);
        return xxgVarAo.toString();
    }
}
