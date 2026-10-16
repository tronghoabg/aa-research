package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.Temporal;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public interface e extends Temporal, j$.time.temporal.k, Comparable {
    ChronoZonedDateTime A(ZoneId zoneId);

    /* renamed from: G */
    int compareTo(e eVar);

    Chronology getChronology();

    long toEpochSecond(ZoneOffset zoneOffset);

    b toLocalDate();

    LocalTime toLocalTime();
}
