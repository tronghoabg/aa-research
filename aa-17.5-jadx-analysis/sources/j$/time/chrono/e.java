package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public interface e extends Temporal, j$.time.temporal.l, Comparable {
    /* renamed from: E */
    int compareTo(e eVar);

    a getChronology();

    b toLocalDate();

    LocalTime toLocalTime();

    j z(ZoneId zoneId);
}
