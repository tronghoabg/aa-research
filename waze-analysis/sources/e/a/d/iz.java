package e.a.d;

import j$.util.Objects;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class iz {

    /* renamed from: a, reason: collision with root package name */
    final int f47206a;

    /* renamed from: b, reason: collision with root package name */
    final long f47207b;

    /* renamed from: c, reason: collision with root package name */
    final long f47208c;

    /* renamed from: d, reason: collision with root package name */
    final double f47209d;

    /* renamed from: e, reason: collision with root package name */
    final Long f47210e;

    /* renamed from: f, reason: collision with root package name */
    final Set f47211f;

    iz(int i2, long j2, long j3, double d2, Long l2, Set set) {
        this.f47206a = i2;
        this.f47207b = j2;
        this.f47208c = j3;
        this.f47209d = d2;
        this.f47210e = l2;
        this.f47211f = com.google.d.d.ci.m(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof iz)) {
            return false;
        }
        iz izVar = (iz) obj;
        return this.f47206a == izVar.f47206a && this.f47207b == izVar.f47207b && this.f47208c == izVar.f47208c && Double.compare(this.f47209d, izVar.f47209d) == 0 && Objects.equals(this.f47210e, izVar.f47210e) && Objects.equals(this.f47211f, izVar.f47211f);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f47206a), Long.valueOf(this.f47207b), Long.valueOf(this.f47208c), Double.valueOf(this.f47209d), this.f47210e, this.f47211f);
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.b("maxAttempts", this.f47206a);
        zVarH.c("initialBackoffNanos", this.f47207b);
        zVarH.c("maxBackoffNanos", this.f47208c);
        zVarH.f(this.f47209d);
        zVarH.d("perAttemptRecvTimeoutNanos", this.f47210e);
        zVarH.d("retryableStatusCodes", this.f47211f);
        return zVarH.toString();
    }
}
