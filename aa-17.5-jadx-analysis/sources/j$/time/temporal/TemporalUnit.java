package j$.time.temporal;

import j$.time.Duration;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public interface TemporalUnit {
    Duration getDuration();

    long h(Temporal temporal, Temporal temporal2);

    boolean isDurationEstimated();

    Temporal k(Temporal temporal, long j);
}
