package j$.time.temporal;

import j$.time.LocalDate;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public interface Temporal extends TemporalAccessor {
    Temporal a(long j2, m mVar);

    Temporal b(long j2, TemporalUnit temporalUnit);

    /* renamed from: h */
    Temporal y(LocalDate localDate);

    long until(Temporal temporal, TemporalUnit temporalUnit);

    Temporal z(long j2, ChronoUnit chronoUnit);
}
