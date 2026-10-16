package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.b;
import j$.time.temporal.Temporal;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public interface ChronoZonedDateTime<D extends b> extends Temporal, Comparable<ChronoZonedDateTime<?>> {
    int compareTo(ChronoZonedDateTime chronoZonedDateTime);

    ChronoZonedDateTime d(ZoneId zoneId);

    Chronology getChronology();

    ZoneOffset getOffset();

    ZoneId getZone();

    long toEpochSecond();

    b toLocalDate();

    e toLocalDateTime();

    LocalTime toLocalTime();

    ChronoZonedDateTime w(ZoneId zoneId);
}
