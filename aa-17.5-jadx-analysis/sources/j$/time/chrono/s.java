package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class s extends a implements Serializable {
    public static final s c = new s();
    private static final long serialVersionUID = -1440403870442975015L;

    private s() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.a
    public final int B(m mVar, int i) {
        if (mVar instanceof t) {
            return mVar == t.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.a
    public final b J(Map map, j$.time.format.d0 d0Var) {
        return (LocalDate) super.J(map, d0Var);
    }

    @Override // j$.time.chrono.a
    public final void K(Map map, j$.time.format.d0 d0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (d0Var != j$.time.format.d0.LENIENT) {
                aVar.s(l.longValue());
            }
            a.h(map, j$.time.temporal.a.MONTH_OF_YEAR, ((int) j$.desugar.sun.nio.fs.g.F(l.longValue(), 12L)) + 1);
            a.h(map, j$.time.temporal.a.YEAR, j$.desugar.sun.nio.fs.g.y(l.longValue(), 12L));
        }
    }

    @Override // j$.time.chrono.a
    public final b L(Map map, j$.time.format.d0 d0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = aVar.b.a(((Long) map.remove(aVar)).longValue(), aVar);
        boolean z = true;
        if (d0Var == j$.time.format.d0.LENIENT) {
            return LocalDate.O(iA, 1, 1).S(j$.desugar.sun.nio.fs.g.I(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L)).R(j$.desugar.sun.nio.fs.g.I(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L));
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = aVar2.b.a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = aVar3.b.a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (d0Var == j$.time.format.d0.SMART) {
            if (iA2 == 4 || iA2 == 6 || iA2 == 9 || iA2 == 11) {
                iA3 = Math.min(iA3, 30);
            } else if (iA2 == 2) {
                j$.time.j jVar = j$.time.j.FEBRUARY;
                long j = iA;
                int i = j$.time.s.b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                iA3 = Math.min(iA3, jVar.s(z));
            }
        }
        return LocalDate.O(iA, iA2, iA3);
    }

    @Override // j$.time.chrono.a
    public final b M(Map map, j$.time.format.d0 d0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l = (Long) map.remove(aVar);
        if (l == null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            if (!map.containsKey(aVar2)) {
                return null;
            }
            aVar2.s(((Long) map.get(aVar2)).longValue());
            return null;
        }
        if (d0Var != j$.time.format.d0.LENIENT) {
            aVar.s(l.longValue());
        }
        Long l2 = (Long) map.remove(j$.time.temporal.a.ERA);
        if (l2 != null) {
            if (l2.longValue() == 1) {
                a.h(map, j$.time.temporal.a.YEAR, l.longValue());
                return null;
            }
            if (l2.longValue() == 0) {
                a.h(map, j$.time.temporal.a.YEAR, j$.desugar.sun.nio.fs.g.I(1L, l.longValue()));
                return null;
            }
            throw new DateTimeException("Invalid value for era: " + l2);
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
        Long l3 = (Long) map.get(aVar3);
        if (d0Var != j$.time.format.d0.STRICT) {
            a.h(map, aVar3, (l3 == null || l3.longValue() > 0) ? l.longValue() : j$.desugar.sun.nio.fs.g.I(1L, l.longValue()));
            return null;
        }
        if (l3 == null) {
            map.put(aVar, l);
            return null;
        }
        long jLongValue = l3.longValue();
        long jLongValue2 = l.longValue();
        if (jLongValue <= 0) {
            jLongValue2 = j$.desugar.sun.nio.fs.g.I(1L, jLongValue2);
        }
        a.h(map, aVar3, jLongValue2);
        return null;
    }

    @Override // j$.time.chrono.a
    public final j N(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.s(instant, zoneId);
    }

    @Override // j$.time.chrono.a
    public final j O(Temporal temporal) {
        return ZonedDateTime.r(temporal);
    }

    @Override // j$.time.chrono.a
    public final List eras() {
        return j$.desugar.sun.nio.fs.g.A(t.values());
    }

    @Override // j$.time.chrono.a
    public final String getCalendarType() {
        return "iso8601";
    }

    @Override // j$.time.chrono.a
    public final String getId() {
        return "ISO";
    }

    @Override // j$.time.chrono.a
    public final m w(int i) {
        if (i == 0) {
            return t.BCE;
        }
        if (i == 1) {
            return t.CE;
        }
        j$.time.g.b("Invalid era: ", i);
        return null;
    }

    public Object writeReplace() {
        return new e0((byte) 1, this);
    }

    @Override // j$.time.chrono.a
    public final e y(Temporal temporal) {
        return LocalDateTime.s(temporal);
    }
}
