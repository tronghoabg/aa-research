package j$.time.chrono;

import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract class a implements Comparable {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        new Locale("ja", "JP", "JP");
    }

    public static a A(String str) {
        Objects.a(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap = a;
            a aVar = (a) concurrentHashMap.get(str);
            if (aVar == null) {
                aVar = (a) b.get(str);
            }
            if (aVar != null) {
                return aVar;
            }
            if (concurrentHashMap.get("ISO") != null) {
                Iterator it = ServiceLoader.load(a.class).iterator();
                while (it.hasNext()) {
                    a aVar2 = (a) it.next();
                    if (str.equals(aVar2.getId()) || str.equals(aVar2.getCalendarType())) {
                        return aVar2;
                    }
                }
                j$.time.g.g("Unknown chronology: ".concat(str));
                return null;
            }
            o oVar = o.l;
            oVar.getClass();
            H(oVar, "Hijrah-umalqura");
            v vVar = v.c;
            vVar.getClass();
            H(vVar, "Japanese");
            a0 a0Var = a0.c;
            a0Var.getClass();
            H(a0Var, "Minguo");
            g0 g0Var = g0.c;
            g0Var.getClass();
            H(g0Var, "ThaiBuddhist");
            try {
                for (a aVar3 : Arrays.asList(new a[0])) {
                    if (!aVar3.getId().equals("ISO")) {
                        H(aVar3, aVar3.getId());
                    }
                }
                s sVar = s.c;
                sVar.getClass();
                H(sVar, "ISO");
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static a H(a aVar, String str) {
        String calendarType;
        a aVar2 = (a) a.putIfAbsent(str, aVar);
        if (aVar2 == null && (calendarType = aVar.getCalendarType()) != null) {
            b.putIfAbsent(calendarType, aVar);
        }
        return aVar2;
    }

    public static b I(b bVar, long j, long j2, long j3) {
        long j4;
        b bVarB = bVar.b(j, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        b bVarB2 = bVarB.b(j2, (TemporalUnit) chronoUnit);
        if (j3 <= 7) {
            if (j3 < 1) {
                bVarB2 = bVarB2.b(j$.desugar.sun.nio.fs.g.I(j3, 7L) / 7, (TemporalUnit) chronoUnit);
                j4 = (j3 + 6) % 7;
            }
            return bVarB2.x(new j$.time.temporal.m(j$.time.b.r((int) j3).getValue(), (byte) 0));
        }
        long j5 = j3 - 1;
        bVarB2 = bVarB2.b(j5 / 7, (TemporalUnit) chronoUnit);
        j4 = j5 % 7;
        j3 = j4 + 1;
        return bVarB2.x(new j$.time.temporal.m(j$.time.b.r((int) j3).getValue(), (byte) 0));
    }

    public static void h(Map map, j$.time.temporal.a aVar, long j) {
        Long l = (Long) map.get(aVar);
        if (l == null || l.longValue() == j) {
            map.put(aVar, Long.valueOf(j));
            return;
        }
        throw new DateTimeException("Conflict found: " + String.valueOf(aVar) + " " + l + " differs from " + String.valueOf(aVar) + " " + j);
    }

    public int B(m mVar, int i) {
        if (mVar instanceof r) {
            return i;
        }
        throw new ClassCastException("Era must be HijrahEra");
    }

    public j$.time.temporal.q C(j$.time.temporal.a aVar) {
        return aVar.b;
    }

    public b J(Map map, j$.time.format.d0 d0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return p(((Long) map.remove(aVar)).longValue());
        }
        K(map, d0Var);
        b bVarM = M(map, d0Var);
        if (bVarM != null) {
            return bVarM;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (map.containsKey(aVar2)) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            byte b2 = 0;
            if (map.containsKey(aVar3)) {
                if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                    return L(map, d0Var);
                }
                j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                    if (map.containsKey(aVar5)) {
                        int iA = C(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                        if (d0Var == j$.time.format.d0.LENIENT) {
                            long jI = j$.desugar.sun.nio.fs.g.I(((Long) map.remove(aVar3)).longValue(), 1L);
                            return k(iA, 1, 1).b(jI, (TemporalUnit) ChronoUnit.MONTHS).b(j$.desugar.sun.nio.fs.g.I(((Long) map.remove(aVar4)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).b(j$.desugar.sun.nio.fs.g.I(((Long) map.remove(aVar5)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                        }
                        int iA2 = C(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                        int iA3 = C(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                        b bVarB = k(iA, iA2, 1).b((C(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5) - 1) + ((iA3 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                        if (d0Var != j$.time.format.d0.STRICT || bVarB.h(aVar3) == iA2) {
                            return bVarB;
                        }
                        j$.time.g.g("Strict mode rejected resolved date as it is in a different month");
                        return null;
                    }
                    j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                    if (map.containsKey(aVar6)) {
                        int iA4 = C(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                        if (d0Var == j$.time.format.d0.LENIENT) {
                            return I(k(iA4, 1, 1), j$.desugar.sun.nio.fs.g.I(((Long) map.remove(aVar3)).longValue(), 1L), j$.desugar.sun.nio.fs.g.I(((Long) map.remove(aVar4)).longValue(), 1L), j$.desugar.sun.nio.fs.g.I(((Long) map.remove(aVar6)).longValue(), 1L));
                        }
                        int iA5 = C(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                        b bVarX = k(iA4, iA5, 1).b((C(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).x(new j$.time.temporal.m(j$.time.b.r(C(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6)).getValue(), b2));
                        if (d0Var != j$.time.format.d0.STRICT || bVarX.h(aVar3) == iA5) {
                            return bVarX;
                        }
                        j$.time.g.g("Strict mode rejected resolved date as it is in a different month");
                        return null;
                    }
                }
            }
            j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar7)) {
                int iA6 = C(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                if (d0Var != j$.time.format.d0.LENIENT) {
                    return s(iA6, C(aVar7).a(((Long) map.remove(aVar7)).longValue(), aVar7));
                }
                return s(iA6, 1).b(j$.desugar.sun.nio.fs.g.I(((Long) map.remove(aVar7)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
            }
            j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
            if (map.containsKey(aVar8)) {
                j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
                if (map.containsKey(aVar9)) {
                    int iA7 = C(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (d0Var == j$.time.format.d0.LENIENT) {
                        return s(iA7, 1).b(j$.desugar.sun.nio.fs.g.I(((Long) map.remove(aVar8)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).b(j$.desugar.sun.nio.fs.g.I(((Long) map.remove(aVar9)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    int iA8 = C(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8);
                    b bVarB2 = s(iA7, 1).b((C(aVar9).a(((Long) map.remove(aVar9)).longValue(), aVar9) - 1) + ((iA8 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                    if (d0Var != j$.time.format.d0.STRICT || bVarB2.h(aVar2) == iA7) {
                        return bVarB2;
                    }
                    j$.time.g.g("Strict mode rejected resolved date as it is in a different year");
                    return null;
                }
                j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
                if (map.containsKey(aVar10)) {
                    int iA9 = C(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (d0Var == j$.time.format.d0.LENIENT) {
                        return I(s(iA9, 1), 0L, j$.desugar.sun.nio.fs.g.I(((Long) map.remove(aVar8)).longValue(), 1L), j$.desugar.sun.nio.fs.g.I(((Long) map.remove(aVar10)).longValue(), 1L));
                    }
                    b bVarX2 = s(iA9, 1).b((C(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).x(new j$.time.temporal.m(j$.time.b.r(C(aVar10).a(((Long) map.remove(aVar10)).longValue(), aVar10)).getValue(), b2));
                    if (d0Var != j$.time.format.d0.STRICT || bVarX2.h(aVar2) == iA9) {
                        return bVarX2;
                    }
                    j$.time.g.g("Strict mode rejected resolved date as it is in a different year");
                    return null;
                }
            }
        }
        return null;
    }

    public void K(Map map, j$.time.format.d0 d0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (d0Var != j$.time.format.d0.LENIENT) {
                aVar.s(l.longValue());
            }
            b bVarA = r().a(1L, (j$.time.temporal.n) j$.time.temporal.a.DAY_OF_MONTH).a(l.longValue(), (j$.time.temporal.n) aVar);
            h(map, j$.time.temporal.a.MONTH_OF_YEAR, bVarA.h(r6));
            h(map, j$.time.temporal.a.YEAR, bVarA.h(r6));
        }
    }

    public b L(Map map, j$.time.format.d0 d0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = C(aVar).a(((Long) map.remove(aVar)).longValue(), aVar);
        if (d0Var == j$.time.format.d0.LENIENT) {
            long jI = j$.desugar.sun.nio.fs.g.I(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return k(iA, 1, 1).b(jI, (TemporalUnit) ChronoUnit.MONTHS).b(j$.desugar.sun.nio.fs.g.I(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = C(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = C(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (d0Var != j$.time.format.d0.SMART) {
            return k(iA, iA2, iA3);
        }
        try {
            return k(iA, iA2, iA3);
        } catch (DateTimeException unused) {
            return this.k(iA, iA2, 1).x(new j$.desugar.sun.nio.fs.n((byte) 5));
        }
    }

    public b M(Map map, j$.time.format.d0 d0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l = (Long) map.remove(aVar);
        if (l == null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            if (!map.containsKey(aVar2)) {
                return null;
            }
            C(aVar2).b(((Long) map.get(aVar2)).longValue(), aVar2);
            return null;
        }
        Long l2 = (Long) map.remove(j$.time.temporal.a.ERA);
        int iA = d0Var != j$.time.format.d0.LENIENT ? C(aVar).a(l.longValue(), aVar) : j$.desugar.sun.nio.fs.g.x(l.longValue());
        if (l2 != null) {
            h(map, j$.time.temporal.a.YEAR, B(w(C(r2).a(l2.longValue(), r2)), iA));
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
        if (map.containsKey(aVar3)) {
            h(map, aVar3, B(s(C(aVar3).a(((Long) map.get(aVar3)).longValue(), aVar3), 1).getEra(), iA));
            return null;
        }
        if (d0Var == j$.time.format.d0.STRICT) {
            map.put(aVar, l);
            return null;
        }
        if (eras().isEmpty()) {
            h(map, aVar3, iA);
            return null;
        }
        h(map, aVar3, B((m) r9.get(r9.size() - 1), iA));
        return null;
    }

    public j N(Instant instant, ZoneId zoneId) {
        return l.s(this, instant, zoneId);
    }

    public j O(Temporal temporal) {
        try {
            ZoneId zoneIdR = ZoneId.r(temporal);
            try {
                return N(Instant.s(temporal), zoneIdR);
            } catch (DateTimeException unused) {
                return l.r(zoneIdR, null, g.r(this, this.y(temporal)));
            }
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoZonedDateTime from TemporalAccessor: ".concat(String.valueOf(temporal.getClass())), e);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return getId().compareTo(((a) obj).getId());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && getId().compareTo(((a) obj).getId()) == 0;
    }

    public List eras() {
        return j$.desugar.sun.nio.fs.g.A(r.values());
    }

    public String getCalendarType() {
        return "islamic-umalqura";
    }

    public String getId() {
        return "Hijrah-umalqura";
    }

    public final int hashCode() {
        return getId().hashCode() ^ getClass().hashCode();
    }

    public boolean isLeapYear(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    public b k(int i, int i2, int i3) {
        return LocalDate.O(i, i2, i3);
    }

    public b l(j$.time.temporal.k kVar) {
        return LocalDate.A(kVar);
    }

    public b p(long j) {
        return LocalDate.ofEpochDay(j);
    }

    public b r() {
        int i = Clock.a;
        return LocalDate.A(LocalDate.N(new j$.time.a(ZoneId.systemDefault())));
    }

    public b s(int i, int i2) {
        return LocalDate.P(i, i2);
    }

    public final String toString() {
        return getId();
    }

    public m w(int i) {
        if (i == 1) {
            return r.AH;
        }
        j$.time.g.g("invalid Hijrah era");
        return null;
    }

    public e y(Temporal temporal) {
        try {
            return l(temporal).D(LocalTime.A(temporal));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ".concat(String.valueOf(temporal.getClass())), e);
        }
    }
}
