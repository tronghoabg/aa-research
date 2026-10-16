package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public interface b extends Temporal, j$.time.temporal.k, Comparable {
    e E(LocalTime localTime);

    b H(TemporalAmount temporalAmount);

    /* renamed from: K */
    int compareTo(b bVar);

    @Override // j$.time.temporal.Temporal
    b a(long j2, j$.time.temporal.m mVar);

    @Override // j$.time.temporal.Temporal
    b b(long j2, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.TemporalAccessor
    boolean c(j$.time.temporal.m mVar);

    boolean equals(Object obj);

    Chronology getChronology();

    l getEra();

    int hashCode();

    boolean isLeapYear();

    int lengthOfYear();

    /* renamed from: s */
    b z(long j2, TemporalUnit temporalUnit);

    long toEpochDay();

    String toString();

    @Override // j$.time.temporal.Temporal
    long until(Temporal temporal, TemporalUnit temporalUnit);

    b y(j$.time.temporal.k kVar);
}
