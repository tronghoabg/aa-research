package j$.time.temporal;

import j$.time.Duration;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public interface TemporalUnit {
    long between(Temporal temporal, Temporal temporal2);

    Temporal f(Temporal temporal, long j2);

    Duration getDuration();
}
