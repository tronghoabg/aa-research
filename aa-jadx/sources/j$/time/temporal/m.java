package j$.time.temporal;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public interface m {
    boolean h(j$.time.temporal.TemporalAccessor temporalAccessor);

    boolean isDateBased();

    j$.time.temporal.p k(j$.time.temporal.TemporalAccessor temporalAccessor);

    long l(j$.time.temporal.TemporalAccessor temporalAccessor);

    j$.time.temporal.TemporalAccessor p(java.util.HashMap map, j$.time.format.c0 c0Var, j$.time.format.d0 d0Var);

    j$.time.temporal.Temporal r(j$.time.temporal.Temporal temporal, long j);

    j$.time.temporal.p range();
}
