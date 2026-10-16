package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.Temporal;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public interface j extends Temporal, Comparable {
    j g(ZoneId zoneId);

    a getChronology();

    ZoneOffset getOffset();

    ZoneId getZone();

    long toEpochSecond();

    b toLocalDate();

    e toLocalDateTime();

    LocalTime toLocalTime();

    j v(ZoneId zoneId);
}
