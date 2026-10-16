package j$.time.temporal;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public interface TemporalUnit {
    j$.time.Duration getDuration();

    long h(j$.time.temporal.Temporal temporal, j$.time.temporal.Temporal temporal2);

    boolean isDurationEstimated();

    j$.time.temporal.Temporal k(j$.time.temporal.Temporal temporal, long j);
}
