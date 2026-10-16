package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface m extends Comparable {
    ChronoZonedDateTime A(Temporal temporal);

    InterfaceC2897e C(Temporal temporal);

    InterfaceC2894b H(int i5, int i10, int i11);

    InterfaceC2894b J(Map map, j$.time.format.y yVar);

    j$.time.temporal.t K(j$.time.temporal.a aVar);

    ChronoZonedDateTime L(Instant instant, ZoneId zoneId);

    List N();

    n P(int i5);

    boolean equals(Object obj);

    int h(n nVar, int i5);

    int hashCode();

    InterfaceC2894b m(long j8);

    String n();

    InterfaceC2894b r(TemporalAccessor temporalAccessor);

    String toString();

    String v();

    InterfaceC2894b y(int i5, int i10);
}
