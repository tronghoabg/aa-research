package j$.time.chrono;

import androidx.exifinterface.media.ExifInterface;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.Month;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class r extends a implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final r f49878d = new r();
    private static final long serialVersionUID = -1440403870442975015L;

    private r() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.a
    public final void B(Map map, j$.time.format.b0 b0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l2 = (Long) map.remove(aVar);
        if (l2 != null) {
            if (b0Var != j$.time.format.b0.LENIENT) {
                aVar.z(l2.longValue());
            }
            a.f(map, j$.time.temporal.a.MONTH_OF_YEAR, ((int) j$.com.android.tools.r8.a.O(l2.longValue(), 12L)) + 1);
            a.f(map, j$.time.temporal.a.YEAR, j$.com.android.tools.r8.a.F(l2.longValue(), 12L));
        }
    }

    @Override // j$.time.chrono.Chronology
    public final b C(TemporalAccessor temporalAccessor) {
        return LocalDate.M(temporalAccessor);
    }

    @Override // j$.time.chrono.a
    public final b D(Map map, j$.time.format.b0 b0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = aVar.f50048b.a(((Long) map.remove(aVar)).longValue(), aVar);
        boolean z = true;
        if (b0Var == j$.time.format.b0.LENIENT) {
            return LocalDate.of(iA, 1, 1).plusMonths(j$.com.android.tools.r8.a.R(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L)).W(j$.com.android.tools.r8.a.R(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L));
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = aVar2.f50048b.a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = aVar3.f50048b.a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (b0Var == j$.time.format.b0.SMART) {
            if (iA2 == 4 || iA2 == 6 || iA2 == 9 || iA2 == 11) {
                iA3 = Math.min(iA3, 30);
            } else if (iA2 == 2) {
                Month month = Month.FEBRUARY;
                long j2 = iA;
                int i2 = j$.time.q.f50027b;
                if ((3 & j2) != 0 || (j2 % 100 == 0 && j2 % 400 != 0)) {
                    z = false;
                }
                iA3 = Math.min(iA3, month.L(z));
            }
        }
        return LocalDate.of(iA, iA2, iA3);
    }

    @Override // j$.time.chrono.a, j$.time.chrono.Chronology
    public final e F(TemporalAccessor temporalAccessor) {
        return LocalDateTime.L(temporalAccessor);
    }

    @Override // j$.time.chrono.a, j$.time.chrono.Chronology
    public final b I(Map map, j$.time.format.b0 b0Var) {
        return (LocalDate) super.I(map, b0Var);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime J(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.L(instant, zoneId);
    }

    @Override // j$.time.chrono.a
    public final b L(Map map, j$.time.format.b0 b0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l2 = (Long) map.remove(aVar);
        if (l2 == null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            if (!map.containsKey(aVar2)) {
                return null;
            }
            aVar2.z(((Long) map.get(aVar2)).longValue());
            return null;
        }
        if (b0Var != j$.time.format.b0.LENIENT) {
            aVar.z(l2.longValue());
        }
        Long l3 = (Long) map.remove(j$.time.temporal.a.ERA);
        if (l3 != null) {
            if (l3.longValue() == 1) {
                a.f(map, j$.time.temporal.a.YEAR, l2.longValue());
                return null;
            }
            if (l3.longValue() == 0) {
                a.f(map, j$.time.temporal.a.YEAR, j$.com.android.tools.r8.a.R(1L, l2.longValue()));
                return null;
            }
            throw new j$.time.c("Invalid value for era: " + l3);
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
        Long l4 = (Long) map.get(aVar3);
        if (b0Var != j$.time.format.b0.STRICT) {
            a.f(map, aVar3, (l4 == null || l4.longValue() > 0) ? l2.longValue() : j$.com.android.tools.r8.a.R(1L, l2.longValue()));
            return null;
        }
        if (l4 == null) {
            map.put(aVar, l2);
            return null;
        }
        long jLongValue = l4.longValue();
        long jLongValue2 = l2.longValue();
        if (jLongValue <= 0) {
            jLongValue2 = j$.com.android.tools.r8.a.R(1L, jLongValue2);
        }
        a.f(map, aVar3, jLongValue2);
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final b date(int i2, int i3, int i4) {
        return LocalDate.of(i2, i3, i4);
    }

    @Override // j$.time.chrono.Chronology
    public final b dateEpochDay(long j2) {
        return LocalDate.ofEpochDay(j2);
    }

    @Override // j$.time.chrono.Chronology
    public final b dateYearDay(int i2, int i3) {
        return LocalDate.U(i2, i3);
    }

    @Override // j$.time.chrono.Chronology
    public final l eraOf(int i2) {
        if (i2 == 0) {
            return s.BCE;
        }
        if (i2 == 1) {
            return s.CE;
        }
        j$.time.f.c("Invalid era: ", i2);
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final List eras() {
        return j$.com.android.tools.r8.a.I(s.values());
    }

    @Override // j$.time.chrono.Chronology
    public final String getCalendarType() {
        return "iso8601";
    }

    @Override // j$.time.chrono.Chronology
    public final String getId() {
        return ExifInterface.TAG_RW2_ISO;
    }

    @Override // j$.time.chrono.a
    public final b h() {
        j$.time.a aVarA = j$.time.b.a();
        Objects.requireNonNull(aVarA, "clock");
        return LocalDate.M(LocalDate.T(aVarA));
    }

    @Override // j$.time.chrono.Chronology
    public final boolean isLeapYear(long j2) {
        if ((3 & j2) == 0) {
            return j2 % 100 != 0 || j2 % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.a, j$.time.chrono.Chronology
    public final ChronoZonedDateTime l(TemporalAccessor temporalAccessor) {
        return ZonedDateTime.B(temporalAccessor);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.p o(j$.time.temporal.a aVar) {
        return aVar.f50048b;
    }

    @Override // j$.time.chrono.Chronology
    public final int u(l lVar, int i2) {
        if (lVar instanceof s) {
            return lVar == s.CE ? i2 : 1 - i2;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    public Object writeReplace() {
        return new d0((byte) 1, this);
    }
}
