package j$.time.chrono;

import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import org.apache.tika.utils.StringUtils;

/* renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2893a implements m {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap f37510a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap f37511b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f37512c = 0;

    public abstract /* synthetic */ InterfaceC2894b q();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return n().compareTo(((m) obj).n());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    static m t(AbstractC2893a abstractC2893a, String str) {
        String strV;
        m mVar = (m) f37510a.putIfAbsent(str, abstractC2893a);
        if (mVar == null && (strV = abstractC2893a.v()) != null) {
            f37511b.putIfAbsent(strV, abstractC2893a);
        }
        return mVar;
    }

    static m s(String str) {
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap = f37510a;
            m mVar = (m) concurrentHashMap.get(str);
            if (mVar == null) {
                mVar = (m) f37511b.get(str);
            }
            if (mVar != null) {
                return mVar;
            }
            if (concurrentHashMap.get("ISO") != null) {
                Iterator it = ServiceLoader.load(m.class).iterator();
                while (it.hasNext()) {
                    m mVar2 = (m) it.next();
                    if (str.equals(mVar2.n()) || str.equals(mVar2.v())) {
                        return mVar2;
                    }
                }
                throw new j$.time.c("Unknown chronology: " + str);
            }
            p pVar = p.f37528m;
            t(pVar, pVar.n());
            w wVar = w.f37546d;
            t(wVar, wVar.n());
            B b5 = B.f37499d;
            t(b5, b5.n());
            H h10 = H.f37506d;
            t(h10, h10.n());
            try {
                for (AbstractC2893a abstractC2893a : Arrays.asList(new AbstractC2893a[0])) {
                    if (!abstractC2893a.n().equals("ISO")) {
                        t(abstractC2893a, abstractC2893a.n());
                    }
                }
                t tVar = t.f37543d;
                t(tVar, tVar.n());
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    protected AbstractC2893a() {
    }

    @Override // j$.time.chrono.m
    public InterfaceC2894b J(Map map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return m(((Long) map.remove(aVar)).longValue());
        }
        B(map, yVar);
        InterfaceC2894b interfaceC2894bR = R(map, yVar);
        if (interfaceC2894bR != null) {
            return interfaceC2894bR;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (!map.containsKey(aVar2)) {
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
        if (map.containsKey(aVar3)) {
            if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                return D(map, yVar);
            }
            j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(aVar4)) {
                j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(aVar5)) {
                    int iA = K(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (yVar == j$.time.format.y.LENIENT) {
                        long jH = j$.time.b.h(((Long) map.remove(aVar3)).longValue(), 1L);
                        return H(iA, 1, 1).e(jH, (TemporalUnit) ChronoUnit.MONTHS).e(j$.time.b.h(((Long) map.remove(aVar4)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).e(j$.time.b.h(((Long) map.remove(aVar5)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    int iA2 = K(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int iA3 = K(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    InterfaceC2894b interfaceC2894bE = H(iA, iA2, 1).e((K(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5) - 1) + ((iA3 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                    if (yVar != j$.time.format.y.STRICT || interfaceC2894bE.q(aVar3) == iA2) {
                        return interfaceC2894bE;
                    }
                    throw new j$.time.c("Strict mode rejected resolved date as it is in a different month");
                }
                j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                if (map.containsKey(aVar6)) {
                    int iA4 = K(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (yVar == j$.time.format.y.LENIENT) {
                        return w(H(iA4, 1, 1), j$.time.b.h(((Long) map.remove(aVar3)).longValue(), 1L), j$.time.b.h(((Long) map.remove(aVar4)).longValue(), 1L), j$.time.b.h(((Long) map.remove(aVar6)).longValue(), 1L));
                    }
                    int iA5 = K(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    InterfaceC2894b interfaceC2894bS = H(iA4, iA5, 1).e((K(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).s(new j$.time.temporal.n(DayOfWeek.R(K(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6)).getValue(), 0));
                    if (yVar != j$.time.format.y.STRICT || interfaceC2894bS.q(aVar3) == iA5) {
                        return interfaceC2894bS;
                    }
                    throw new j$.time.c("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
        if (map.containsKey(aVar7)) {
            int iA6 = K(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (yVar != j$.time.format.y.LENIENT) {
                return y(iA6, K(aVar7).a(((Long) map.remove(aVar7)).longValue(), aVar7));
            }
            return y(iA6, 1).e(j$.time.b.h(((Long) map.remove(aVar7)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(aVar8)) {
            return null;
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(aVar9)) {
            int iA7 = K(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (yVar == j$.time.format.y.LENIENT) {
                return y(iA7, 1).e(j$.time.b.h(((Long) map.remove(aVar8)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).e(j$.time.b.h(((Long) map.remove(aVar9)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
            }
            int iA8 = K(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8);
            InterfaceC2894b interfaceC2894bE2 = y(iA7, 1).e((K(aVar9).a(((Long) map.remove(aVar9)).longValue(), aVar9) - 1) + ((iA8 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
            if (yVar != j$.time.format.y.STRICT || interfaceC2894bE2.q(aVar2) == iA7) {
                return interfaceC2894bE2;
            }
            throw new j$.time.c("Strict mode rejected resolved date as it is in a different year");
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
        if (!map.containsKey(aVar10)) {
            return null;
        }
        int iA9 = K(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        if (yVar == j$.time.format.y.LENIENT) {
            return w(y(iA9, 1), 0L, j$.time.b.h(((Long) map.remove(aVar8)).longValue(), 1L), j$.time.b.h(((Long) map.remove(aVar10)).longValue(), 1L));
        }
        InterfaceC2894b interfaceC2894bS2 = y(iA9, 1).e((K(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).s(new j$.time.temporal.n(DayOfWeek.R(K(aVar10).a(((Long) map.remove(aVar10)).longValue(), aVar10)).getValue(), 0));
        if (yVar != j$.time.format.y.STRICT || interfaceC2894bS2.q(aVar2) == iA9) {
            return interfaceC2894bS2;
        }
        throw new j$.time.c("Strict mode rejected resolved date as it is in a different year");
    }

    @Override // j$.time.chrono.m
    public InterfaceC2897e C(Temporal temporal) {
        try {
            return r(temporal).z(j$.time.k.T(temporal));
        } catch (j$.time.c e7) {
            throw new j$.time.c("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + temporal.getClass(), e7);
        }
    }

    void B(Map map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l10 = (Long) map.remove(aVar);
        if (l10 != null) {
            if (yVar != j$.time.format.y.LENIENT) {
                aVar.S(l10.longValue());
            }
            InterfaceC2894b interfaceC2894bD = q().d(1L, (j$.time.temporal.q) j$.time.temporal.a.DAY_OF_MONTH).d(l10.longValue(), (j$.time.temporal.q) aVar);
            o(map, j$.time.temporal.a.MONTH_OF_YEAR, interfaceC2894bD.q(r0));
            o(map, j$.time.temporal.a.YEAR, interfaceC2894bD.q(r0));
        }
    }

    InterfaceC2894b R(Map map, j$.time.format.y yVar) {
        int iA;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l10 = (Long) map.remove(aVar);
        if (l10 == null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            if (!map.containsKey(aVar2)) {
                return null;
            }
            K(aVar2).b(((Long) map.get(aVar2)).longValue(), aVar2);
            return null;
        }
        Long l11 = (Long) map.remove(j$.time.temporal.a.ERA);
        if (yVar != j$.time.format.y.LENIENT) {
            iA = K(aVar).a(l10.longValue(), aVar);
        } else {
            long jLongValue = l10.longValue();
            int i5 = (int) jLongValue;
            if (jLongValue != i5) {
                throw new ArithmeticException();
            }
            iA = i5;
        }
        if (l11 != null) {
            o(map, j$.time.temporal.a.YEAR, h(P(K(r2).a(l11.longValue(), r2)), iA));
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
        if (map.containsKey(aVar3)) {
            o(map, aVar3, h(y(K(aVar3).a(((Long) map.get(aVar3)).longValue(), aVar3), 1).E(), iA));
            return null;
        }
        if (yVar == j$.time.format.y.STRICT) {
            map.put(aVar, l10);
            return null;
        }
        if (N().isEmpty()) {
            o(map, aVar3, iA);
            return null;
        }
        o(map, aVar3, h((n) r11.get(r11.size() - 1), iA));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [j$.time.chrono.ChronoZonedDateTime] */
    @Override // j$.time.chrono.m
    public ChronoZonedDateTime A(Temporal temporal) {
        try {
            ZoneId zoneIdR = ZoneId.R(temporal);
            try {
                temporal = L(Instant.S(temporal), zoneIdR);
                return temporal;
            } catch (j$.time.c unused) {
                return l.R(zoneIdR, null, C2899g.R(this, C(temporal)));
            }
        } catch (j$.time.c e7) {
            throw new j$.time.c("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + temporal.getClass(), e7);
        }
    }

    InterfaceC2894b D(Map map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = K(aVar).a(((Long) map.remove(aVar)).longValue(), aVar);
        if (yVar == j$.time.format.y.LENIENT) {
            long jH = j$.time.b.h(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return H(iA, 1, 1).e(jH, (TemporalUnit) ChronoUnit.MONTHS).e(j$.time.b.h(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = K(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = K(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (yVar != j$.time.format.y.SMART) {
            return H(iA, iA2, iA3);
        }
        try {
            return H(iA, iA2, iA3);
        } catch (j$.time.c unused) {
            return H(iA, iA2, 1).s(new j$.time.temporal.o(0));
        }
    }

    static InterfaceC2894b w(InterfaceC2894b interfaceC2894b, long j8, long j10, long j11) {
        long j12;
        InterfaceC2894b interfaceC2894bE = interfaceC2894b.e(j8, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        InterfaceC2894b interfaceC2894bE2 = interfaceC2894bE.e(j10, (TemporalUnit) chronoUnit);
        if (j11 > 7) {
            long j13 = j11 - 1;
            interfaceC2894bE2 = interfaceC2894bE2.e(j13 / 7, (TemporalUnit) chronoUnit);
            j12 = j13 % 7;
        } else {
            if (j11 < 1) {
                interfaceC2894bE2 = interfaceC2894bE2.e(j$.time.b.h(j11, 7L) / 7, (TemporalUnit) chronoUnit);
                j12 = (j11 + 6) % 7;
            }
            return interfaceC2894bE2.s(new j$.time.temporal.n(DayOfWeek.R((int) j11).getValue(), 0));
        }
        j11 = j12 + 1;
        return interfaceC2894bE2.s(new j$.time.temporal.n(DayOfWeek.R((int) j11).getValue(), 0));
    }

    static void o(Map map, j$.time.temporal.a aVar, long j8) {
        Long l10 = (Long) map.get(aVar);
        if (l10 != null && l10.longValue() != j8) {
            throw new j$.time.c("Conflict found: " + aVar + StringUtils.SPACE + l10 + " differs from " + aVar + StringUtils.SPACE + j8);
        }
        map.put(aVar, Long.valueOf(j8));
    }

    @Override // j$.time.chrono.m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC2893a) && n().compareTo(((AbstractC2893a) obj).n()) == 0;
    }

    @Override // j$.time.chrono.m
    public final int hashCode() {
        return getClass().hashCode() ^ n().hashCode();
    }

    @Override // j$.time.chrono.m
    public final String toString() {
        return n();
    }
}
