package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class t extends AbstractC2893a implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final t f37543d = new t();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.m
    public final n P(int i5) {
        if (i5 == 0) {
            return u.BCE;
        }
        if (i5 == 1) {
            return u.CE;
        }
        throw new j$.time.c("Invalid era: " + i5);
    }

    @Override // j$.time.chrono.m
    public final String n() {
        return "ISO";
    }

    @Override // j$.time.chrono.m
    public final String v() {
        return "iso8601";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC2894b H(int i5, int i10, int i11) {
        return j$.time.g.g0(i5, i10, i11);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC2894b y(int i5, int i10) {
        return j$.time.g.j0(i5, i10);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC2894b m(long j8) {
        return j$.time.g.i0(j8);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC2894b r(TemporalAccessor temporalAccessor) {
        return j$.time.g.T(temporalAccessor);
    }

    private t() {
    }

    @Override // j$.time.chrono.AbstractC2893a, j$.time.chrono.m
    public final InterfaceC2897e C(Temporal temporal) {
        return LocalDateTime.S(temporal);
    }

    @Override // j$.time.chrono.AbstractC2893a, j$.time.chrono.m
    public final ChronoZonedDateTime A(Temporal temporal) {
        return ZonedDateTime.R(temporal);
    }

    @Override // j$.time.chrono.m
    public final ChronoZonedDateTime L(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.S(instant, zoneId);
    }

    @Override // j$.time.chrono.AbstractC2893a
    public final InterfaceC2894b q() {
        j$.time.b bVarI = j$.time.b.i();
        Objects.requireNonNull(bVarI, "clock");
        return j$.time.g.T(j$.time.g.f0(bVarI));
    }

    public static boolean S(long j8) {
        if ((3 & j8) == 0) {
            return j8 % 100 != 0 || j8 % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.m
    public final int h(n nVar, int i5) {
        if (nVar instanceof u) {
            return nVar == u.CE ? i5 : 1 - i5;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.m
    public final List N() {
        return j$.time.b.d(u.values());
    }

    @Override // j$.time.chrono.AbstractC2893a, j$.time.chrono.m
    public final InterfaceC2894b J(Map map, j$.time.format.y yVar) {
        return (j$.time.g) super.J(map, yVar);
    }

    @Override // j$.time.chrono.AbstractC2893a
    final void B(Map map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l10 = (Long) map.remove(aVar);
        if (l10 != null) {
            if (yVar != j$.time.format.y.LENIENT) {
                aVar.S(l10.longValue());
            }
            AbstractC2893a.o(map, j$.time.temporal.a.MONTH_OF_YEAR, ((int) j$.time.b.e(l10.longValue(), r4)) + 1);
            AbstractC2893a.o(map, j$.time.temporal.a.YEAR, j$.time.b.f(l10.longValue(), 12));
        }
    }

    @Override // j$.time.chrono.AbstractC2893a
    final InterfaceC2894b R(Map map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l10 = (Long) map.remove(aVar);
        if (l10 != null) {
            if (yVar != j$.time.format.y.LENIENT) {
                aVar.S(l10.longValue());
            }
            Long l11 = (Long) map.remove(j$.time.temporal.a.ERA);
            if (l11 != null) {
                if (l11.longValue() == 1) {
                    AbstractC2893a.o(map, j$.time.temporal.a.YEAR, l10.longValue());
                    return null;
                }
                if (l11.longValue() == 0) {
                    AbstractC2893a.o(map, j$.time.temporal.a.YEAR, j$.time.b.h(1L, l10.longValue()));
                    return null;
                }
                throw new j$.time.c("Invalid value for era: " + l11);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
            Long l12 = (Long) map.get(aVar2);
            if (yVar != j$.time.format.y.STRICT) {
                AbstractC2893a.o(map, aVar2, (l12 == null || l12.longValue() > 0) ? l10.longValue() : j$.time.b.h(1L, l10.longValue()));
                return null;
            }
            if (l12 != null) {
                long jLongValue = l12.longValue();
                long jLongValue2 = l10.longValue();
                if (jLongValue <= 0) {
                    jLongValue2 = j$.time.b.h(1L, jLongValue2);
                }
                AbstractC2893a.o(map, aVar2, jLongValue2);
                return null;
            }
            map.put(aVar, l10);
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
        if (!map.containsKey(aVar3)) {
            return null;
        }
        aVar3.S(((Long) map.get(aVar3)).longValue());
        return null;
    }

    @Override // j$.time.chrono.AbstractC2893a
    final InterfaceC2894b D(Map map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iR = aVar.R(((Long) map.remove(aVar)).longValue());
        boolean z2 = true;
        if (yVar == j$.time.format.y.LENIENT) {
            return j$.time.g.g0(iR, 1, 1).m0(j$.time.b.h(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L)).l0(j$.time.b.h(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L));
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iR2 = aVar2.R(((Long) map.remove(aVar2)).longValue());
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iR3 = aVar3.R(((Long) map.remove(aVar3)).longValue());
        if (yVar == j$.time.format.y.SMART) {
            if (iR2 == 4 || iR2 == 6 || iR2 == 9 || iR2 == 11) {
                iR3 = Math.min(iR3, 30);
            } else if (iR2 == 2) {
                j$.time.m mVar = j$.time.m.FEBRUARY;
                long j8 = iR;
                int i5 = j$.time.v.f37700b;
                if ((3 & j8) != 0 || (j8 % 100 == 0 && j8 % 400 != 0)) {
                    z2 = false;
                }
                iR3 = Math.min(iR3, mVar.S(z2));
            }
        }
        return j$.time.g.g0(iR, iR2, iR3);
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.t K(j$.time.temporal.a aVar) {
        return aVar.o();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new F((byte) 1, this);
    }
}
