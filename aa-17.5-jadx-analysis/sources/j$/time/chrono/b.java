package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public interface b extends Temporal, j$.time.temporal.l, Comparable {
    e D(LocalTime localTime);

    b F(TemporalAmount temporalAmount);

    /* renamed from: G */
    int compareTo(b bVar);

    @Override // j$.time.temporal.Temporal
    b a(long j, j$.time.temporal.n nVar);

    @Override // j$.time.temporal.Temporal
    b b(long j, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.k
    boolean d(j$.time.temporal.n nVar);

    @Override // j$.time.temporal.Temporal
    long e(Temporal temporal, TemporalUnit temporalUnit);

    boolean equals(Object obj);

    a getChronology();

    m getEra();

    int hashCode();

    boolean isLeapYear();

    int lengthOfYear();

    /* renamed from: t */
    b y(long j, TemporalUnit temporalUnit);

    long toEpochDay();

    String toString();

    b x(j$.time.temporal.l lVar);
}
