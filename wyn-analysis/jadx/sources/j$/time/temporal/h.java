package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes2.dex */
enum h implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears", Duration.w(31556952)),
    QUARTER_YEARS("QuarterYears", Duration.w(7889238));


    /* renamed from: a, reason: collision with root package name */
    private final String f37674a;

    /* renamed from: b, reason: collision with root package name */
    private final Duration f37675b;

    h(String str, Duration duration) {
        this.f37674a = str;
        this.f37675b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Duration q() {
        return this.f37675b;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal o(Temporal temporal, long j8) {
        int i5 = b.f37670a[ordinal()];
        if (i5 == 1) {
            return temporal.d(j$.time.b.b(temporal.q(r0), j8), i.f37678c);
        }
        if (i5 == 2) {
            return temporal.e(j8 / 4, ChronoUnit.YEARS).e((j8 % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // j$.time.temporal.TemporalUnit
    public final long between(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.f(temporal2, this);
        }
        int i5 = b.f37670a[ordinal()];
        if (i5 == 1) {
            q qVar = i.f37678c;
            return j$.time.b.h(temporal2.w(qVar), temporal.w(qVar));
        }
        if (i5 == 2) {
            return temporal.f(temporal2, ChronoUnit.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f37674a;
    }
}
