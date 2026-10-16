package defpackage;

import j$.time.Clock;
import j$.time.Instant;

/* loaded from: classes2.dex */
public final class fvw implements gmo {
    public final boolean a;
    private final Clock b;
    private final int c;
    private final int d;
    private final Instant e;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ fvw(int i, int i2, boolean z, int i3) {
        Clock clockSystemUTC;
        if ((i3 & 1) != 0) {
            clockSystemUTC = Clock.systemUTC();
            clockSystemUTC.getClass();
        } else {
            clockSystemUTC = null;
        }
        this(clockSystemUTC, (i3 & 2) != 0 ? 10000 : i, (i3 & 4) != 0 ? 0 : i2, z & ((i3 & 8) == 0));
    }

    public final long a() {
        long epochMilli = this.b.instant().toEpochMilli() - this.e.toEpochMilli();
        aiss aissVar = aiss.c;
        return aisq.h(afzc.c(this.d, aissVar), afzc.d(epochMilli, aissVar));
    }

    public final long b() {
        return afzc.c(this.c, aiss.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvw)) {
            return false;
        }
        fvw fvwVar = (fvw) obj;
        return affa.f(this.b, fvwVar.b) && this.c == fvwVar.c && this.d == fvwVar.d && this.a == fvwVar.a;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c) * 31) + this.d) * 31) + a.f(this.a);
    }

    public final String toString() {
        return "ActionTimeInfoInternal(clock=" + this.b + ", totalDurationMillis=" + this.c + ", startDurationMillis=" + this.d + ", defaultBased=" + this.a + ")";
    }

    public fvw(Clock clock, int i, int i2, boolean z) {
        clock.getClass();
        this.b = clock;
        this.c = i;
        this.d = i2;
        this.a = z;
        Instant instant = clock.instant();
        instant.getClass();
        this.e = instant;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fvw() {
        this(0, (int) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), 15);
    }
}
