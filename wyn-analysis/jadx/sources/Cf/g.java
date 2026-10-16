package Cf;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class g implements f, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f2221a;

    public static long a(long j8) {
        long jB = e.b();
        c unit = c.f2206b;
        AbstractC3340k.e(unit, "unit");
        return (1 | (j8 - 1)) == Long.MAX_VALUE ? a.k(Fe.e.I(j8)) : Fe.e.S(jB, j8, unit);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long jI;
        g other = (g) obj;
        AbstractC3340k.e(other, "other");
        int i5 = e.f2220b;
        c unit = c.f2206b;
        AbstractC3340k.e(unit, "unit");
        long j8 = other.f2221a;
        long j10 = (j8 - 1) | 1;
        long j11 = this.f2221a;
        if (j10 != Long.MAX_VALUE) {
            jI = (1 | (j11 - 1)) == Long.MAX_VALUE ? Fe.e.I(j11) : Fe.e.S(j11, j8, unit);
        } else if (j11 == j8) {
            h hVar = a.f2200b;
            jI = 0;
        } else {
            jI = a.k(Fe.e.I(j8));
        }
        return a.c(jI, 0L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f2221a == ((g) obj).f2221a;
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f2221a;
        return (int) (j8 ^ (j8 >>> 32));
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.f2221a + ')';
    }
}
