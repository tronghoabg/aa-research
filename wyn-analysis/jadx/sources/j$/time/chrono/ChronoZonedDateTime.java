package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.InterfaceC2894b;
import j$.time.temporal.Temporal;

/* loaded from: classes2.dex */
public interface ChronoZonedDateTime<D extends InterfaceC2894b> extends Temporal, Comparable<ChronoZonedDateTime<?>> {
    InterfaceC2897e G();

    long Q();

    m a();

    j$.time.k b();

    InterfaceC2894b c();

    ZoneOffset i();

    boolean isBefore(ChronoZonedDateTime<?> chronoZonedDateTime);

    ChronoZonedDateTime j(ZoneId zoneId);

    ChronoZonedDateTime k(ZoneId zoneId);

    Instant toInstant();

    ZoneId u();
}
