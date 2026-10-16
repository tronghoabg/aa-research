package j$.time.temporal;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public interface Temporal extends j$.time.temporal.TemporalAccessor {
    j$.time.temporal.Temporal a(long j, j$.time.temporal.m mVar);

    j$.time.temporal.Temporal b(long j, j$.time.temporal.TemporalUnit temporalUnit);

    long e(j$.time.temporal.Temporal temporal, j$.time.temporal.TemporalUnit temporalUnit);

    /* JADX INFO: renamed from: k */
    j$.time.temporal.Temporal x(j$.time.LocalDate localDate);

    j$.time.temporal.Temporal y(long j, j$.time.temporal.ChronoUnit chronoUnit);
}
