package j$.time.chrono;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class a implements Chronology {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f49835a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f49836b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final Locale f49837c = new Locale("ja", "JP", "JP");

    public static void f(Map map, j$.time.temporal.a aVar, long j2) {
        Long l2 = (Long) map.get(aVar);
        if (l2 == null || l2.longValue() == j2) {
            map.put(aVar, Long.valueOf(j2));
            return;
        }
        throw new j$.time.c("Conflict found: " + String.valueOf(aVar) + " " + l2 + " differs from " + String.valueOf(aVar) + " " + j2);
    }

    public static boolean k() {
        if (f49835a.get(ExifInterface.TAG_RW2_ISO) != null) {
            return false;
        }
        n nVar = n.m;
        nVar.getClass();
        x(nVar, "Hijrah-umalqura");
        u uVar = u.f49881d;
        uVar.getClass();
        x(uVar, "Japanese");
        z zVar = z.f49893d;
        zVar.getClass();
        x(zVar, "Minguo");
        f0 f0Var = f0.f49846d;
        f0Var.getClass();
        x(f0Var, "ThaiBuddhist");
        try {
            for (a aVar : Arrays.asList(new a[0])) {
                if (!aVar.getId().equals(ExifInterface.TAG_RW2_ISO)) {
                    x(aVar, aVar.getId());
                }
            }
            r rVar = r.f49878d;
            rVar.getClass();
            x(rVar, ExifInterface.TAG_RW2_ISO);
            return true;
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static Chronology m(String str) {
        Objects.requireNonNull(str, TtmlNode.ATTR_ID);
        do {
            Chronology chronology = (Chronology) f49835a.get(str);
            if (chronology == null) {
                chronology = (Chronology) f49836b.get(str);
            }
            if (chronology != null) {
                return chronology;
            }
        } while (k());
        Iterator it = ServiceLoader.load(Chronology.class).iterator();
        while (it.hasNext()) {
            Chronology chronology2 = (Chronology) it.next();
            if (str.equals(chronology2.getId()) || str.equals(chronology2.getCalendarType())) {
                return chronology2;
            }
        }
        throw new j$.time.c("Unknown chronology: " + str);
    }

    public static Chronology x(Chronology chronology, String str) {
        String calendarType;
        Chronology chronology2 = (Chronology) f49835a.putIfAbsent(str, chronology);
        if (chronology2 == null && (calendarType = chronology.getCalendarType()) != null) {
            f49836b.putIfAbsent(calendarType, chronology);
        }
        return chronology2;
    }

    public static b z(b bVar, long j2, long j3, long j4) {
        long j5;
        b bVarB = bVar.b(j2, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        b bVarB2 = bVarB.b(j3, (TemporalUnit) chronoUnit);
        if (j4 <= 7) {
            if (j4 < 1) {
                bVarB2 = bVarB2.b(j$.com.android.tools.r8.a.R(j4, 7L) / 7, (TemporalUnit) chronoUnit);
                j5 = (j4 + 6) % 7;
            }
            return bVarB2.y(new j$.time.temporal.l(DayOfWeek.B((int) j4).getValue(), 0));
        }
        long j6 = j4 - 1;
        bVarB2 = bVarB2.b(j6 / 7, (TemporalUnit) chronoUnit);
        j5 = j6 % 7;
        j4 = j5 + 1;
        return bVarB2.y(new j$.time.temporal.l(DayOfWeek.B((int) j4).getValue(), 0));
    }

    public void B(Map map, j$.time.format.b0 b0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l2 = (Long) map.remove(aVar);
        if (l2 != null) {
            if (b0Var != j$.time.format.b0.LENIENT) {
                aVar.z(l2.longValue());
            }
            b bVarA = h().a(1L, (j$.time.temporal.m) j$.time.temporal.a.DAY_OF_MONTH).a(l2.longValue(), (j$.time.temporal.m) aVar);
            f(map, j$.time.temporal.a.MONTH_OF_YEAR, bVarA.f(r6));
            f(map, j$.time.temporal.a.YEAR, bVarA.f(r6));
        }
    }

    public b D(Map map, j$.time.format.b0 b0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = o(aVar).a(((Long) map.remove(aVar)).longValue(), aVar);
        if (b0Var == j$.time.format.b0.LENIENT) {
            long jR = j$.com.android.tools.r8.a.R(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return date(iA, 1, 1).b(jR, (TemporalUnit) ChronoUnit.MONTHS).b(j$.com.android.tools.r8.a.R(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = o(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = o(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (b0Var != j$.time.format.b0.SMART) {
            return date(iA, iA2, iA3);
        }
        try {
            return date(iA, iA2, iA3);
        } catch (j$.time.c unused) {
            return this.date(iA, iA2, 1).y(new j$.desugar.sun.nio.fs.n(3));
        }
    }

    @Override // j$.time.chrono.Chronology
    public e F(TemporalAccessor temporalAccessor) {
        try {
            return C(temporalAccessor).E(LocalTime.M(temporalAccessor));
        } catch (j$.time.c e2) {
            throw new j$.time.c("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ".concat(String.valueOf(temporalAccessor.getClass())), e2);
        }
    }

    @Override // j$.time.chrono.Chronology
    public b I(Map map, j$.time.format.b0 b0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return dateEpochDay(((Long) map.remove(aVar)).longValue());
        }
        B(map, b0Var);
        b bVarL = L(map, b0Var);
        if (bVarL != null) {
            return bVarL;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (map.containsKey(aVar2)) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                    return D(map, b0Var);
                }
                j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                    if (map.containsKey(aVar5)) {
                        int iA = o(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                        if (b0Var == j$.time.format.b0.LENIENT) {
                            long jR = j$.com.android.tools.r8.a.R(((Long) map.remove(aVar3)).longValue(), 1L);
                            return date(iA, 1, 1).b(jR, (TemporalUnit) ChronoUnit.MONTHS).b(j$.com.android.tools.r8.a.R(((Long) map.remove(aVar4)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).b(j$.com.android.tools.r8.a.R(((Long) map.remove(aVar5)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                        }
                        int iA2 = o(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                        int iA3 = o(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                        b bVarB = date(iA, iA2, 1).b((o(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5) - 1) + ((iA3 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                        if (b0Var != j$.time.format.b0.STRICT || bVarB.f(aVar3) == iA2) {
                            return bVarB;
                        }
                        j$.time.f.h("Strict mode rejected resolved date as it is in a different month");
                        return null;
                    }
                    j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                    if (map.containsKey(aVar6)) {
                        int iA4 = o(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                        if (b0Var == j$.time.format.b0.LENIENT) {
                            return z(date(iA4, 1, 1), j$.com.android.tools.r8.a.R(((Long) map.remove(aVar3)).longValue(), 1L), j$.com.android.tools.r8.a.R(((Long) map.remove(aVar4)).longValue(), 1L), j$.com.android.tools.r8.a.R(((Long) map.remove(aVar6)).longValue(), 1L));
                        }
                        int iA5 = o(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                        b bVarY = date(iA4, iA5, 1).b((o(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).y(new j$.time.temporal.l(DayOfWeek.B(o(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6)).getValue(), 0));
                        if (b0Var != j$.time.format.b0.STRICT || bVarY.f(aVar3) == iA5) {
                            return bVarY;
                        }
                        j$.time.f.h("Strict mode rejected resolved date as it is in a different month");
                        return null;
                    }
                }
            }
            j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar7)) {
                int iA6 = o(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                if (b0Var != j$.time.format.b0.LENIENT) {
                    return dateYearDay(iA6, o(aVar7).a(((Long) map.remove(aVar7)).longValue(), aVar7));
                }
                return dateYearDay(iA6, 1).b(j$.com.android.tools.r8.a.R(((Long) map.remove(aVar7)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
            }
            j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
            if (map.containsKey(aVar8)) {
                j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
                if (map.containsKey(aVar9)) {
                    int iA7 = o(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (b0Var == j$.time.format.b0.LENIENT) {
                        return dateYearDay(iA7, 1).b(j$.com.android.tools.r8.a.R(((Long) map.remove(aVar8)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).b(j$.com.android.tools.r8.a.R(((Long) map.remove(aVar9)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    int iA8 = o(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8);
                    b bVarB2 = dateYearDay(iA7, 1).b((o(aVar9).a(((Long) map.remove(aVar9)).longValue(), aVar9) - 1) + ((iA8 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                    if (b0Var != j$.time.format.b0.STRICT || bVarB2.f(aVar2) == iA7) {
                        return bVarB2;
                    }
                    j$.time.f.h("Strict mode rejected resolved date as it is in a different year");
                    return null;
                }
                j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
                if (map.containsKey(aVar10)) {
                    int iA9 = o(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (b0Var == j$.time.format.b0.LENIENT) {
                        return z(dateYearDay(iA9, 1), 0L, j$.com.android.tools.r8.a.R(((Long) map.remove(aVar8)).longValue(), 1L), j$.com.android.tools.r8.a.R(((Long) map.remove(aVar10)).longValue(), 1L));
                    }
                    b bVarY2 = dateYearDay(iA9, 1).b((o(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).y(new j$.time.temporal.l(DayOfWeek.B(o(aVar10).a(((Long) map.remove(aVar10)).longValue(), aVar10)).getValue(), 0));
                    if (b0Var != j$.time.format.b0.STRICT || bVarY2.f(aVar2) == iA9) {
                        return bVarY2;
                    }
                    j$.time.f.h("Strict mode rejected resolved date as it is in a different year");
                    return null;
                }
            }
        }
        return null;
    }

    public b L(Map map, j$.time.format.b0 b0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l2 = (Long) map.remove(aVar);
        if (l2 == null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            if (!map.containsKey(aVar2)) {
                return null;
            }
            o(aVar2).b(((Long) map.get(aVar2)).longValue(), aVar2);
            return null;
        }
        Long l3 = (Long) map.remove(j$.time.temporal.a.ERA);
        int iA = b0Var != j$.time.format.b0.LENIENT ? o(aVar).a(l2.longValue(), aVar) : j$.com.android.tools.r8.a.E(l2.longValue());
        if (l3 != null) {
            f(map, j$.time.temporal.a.YEAR, u(eraOf(o(r2).a(l3.longValue(), r2)), iA));
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
        if (map.containsKey(aVar3)) {
            f(map, aVar3, u(dateYearDay(o(aVar3).a(((Long) map.get(aVar3)).longValue(), aVar3), 1).getEra(), iA));
            return null;
        }
        if (b0Var == j$.time.format.b0.STRICT) {
            map.put(aVar, l2);
            return null;
        }
        if (eras().isEmpty()) {
            f(map, aVar3, iA);
            return null;
        }
        f(map, aVar3, u((l) r9.get(r9.size() - 1), iA));
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && compareTo((a) obj) == 0;
    }

    public abstract /* synthetic */ b h();

    @Override // j$.time.chrono.Chronology
    public final int hashCode() {
        return getId().hashCode() ^ getClass().hashCode();
    }

    @Override // j$.time.chrono.Chronology
    public ChronoZonedDateTime l(TemporalAccessor temporalAccessor) {
        try {
            ZoneId zoneIdB = ZoneId.B(temporalAccessor);
            try {
                return J(Instant.L(temporalAccessor), zoneIdB);
            } catch (j$.time.c unused) {
                return k.B(zoneIdB, null, g.B(this, this.F(temporalAccessor)));
            }
        } catch (j$.time.c e2) {
            throw new j$.time.c("Unable to obtain ChronoZonedDateTime from TemporalAccessor: ".concat(String.valueOf(temporalAccessor.getClass())), e2);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Chronology chronology) {
        return getId().compareTo(chronology.getId());
    }

    @Override // j$.time.chrono.Chronology
    public final String toString() {
        return getId();
    }
}
