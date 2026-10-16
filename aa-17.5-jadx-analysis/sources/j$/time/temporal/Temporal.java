package j$.time.temporal;

import j$.time.LocalDate;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public interface Temporal extends k {
    Temporal a(long j, n nVar);

    Temporal b(long j, TemporalUnit temporalUnit);

    long e(Temporal temporal, TemporalUnit temporalUnit);

    /* renamed from: k */
    Temporal x(LocalDate localDate);

    Temporal y(long j, ChronoUnit chronoUnit);
}
