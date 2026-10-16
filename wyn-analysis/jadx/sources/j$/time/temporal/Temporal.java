package j$.time.temporal;

/* loaded from: classes2.dex */
public interface Temporal extends TemporalAccessor {
    Temporal d(long j8, q qVar);

    Temporal e(long j8, TemporalUnit temporalUnit);

    long f(Temporal temporal, TemporalUnit temporalUnit);

    Temporal o(long j8, ChronoUnit chronoUnit);

    Temporal s(j$.time.g gVar);
}
