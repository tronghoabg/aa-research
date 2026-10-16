package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class u extends a implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final u f49881d = new u();
    private static final long serialVersionUID = 459996390165777884L;

    private u() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public final b C(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof w ? (w) temporalAccessor : new w(LocalDate.M(temporalAccessor));
    }

    @Override // j$.time.chrono.a, j$.time.chrono.Chronology
    public final b I(Map map, j$.time.format.b0 b0Var) {
        return (w) super.I(map, b0Var);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime J(Instant instant, ZoneId zoneId) {
        return k.L(this, instant, zoneId);
    }

    @Override // j$.time.chrono.a
    public final b L(Map map, j$.time.format.b0 b0Var) {
        w wVarR;
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        Long l2 = (Long) map.get(aVar);
        x xVarI = l2 != null ? x.i(o(aVar).a(l2.longValue(), aVar)) : null;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l3 = (Long) map.get(aVar2);
        int iA = l3 != null ? o(aVar2).a(l3.longValue(), aVar2) : 0;
        if (xVarI == null && l3 != null && !map.containsKey(j$.time.temporal.a.YEAR) && b0Var != j$.time.format.b0.STRICT) {
            x[] xVarArr = x.f49888e;
            xVarI = ((x[]) Arrays.copyOf(xVarArr, xVarArr.length))[((x[]) Arrays.copyOf(xVarArr, xVarArr.length)).length - 1];
        }
        if (l3 != null && xVarI != null) {
            LocalDate localDate = xVarI.f49890b;
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                j$.time.temporal.a aVar4 = j$.time.temporal.a.DAY_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    map.remove(aVar);
                    map.remove(aVar2);
                    if (b0Var == j$.time.format.b0.LENIENT) {
                        return new w(LocalDate.of((localDate.getYear() + iA) - 1, 1, 1)).P(j$.com.android.tools.r8.a.R(((Long) map.remove(aVar3)).longValue(), 1L), ChronoUnit.MONTHS).P(j$.com.android.tools.r8.a.R(((Long) map.remove(aVar4)).longValue(), 1L), ChronoUnit.DAYS);
                    }
                    int iA2 = o(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int iA3 = o(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    if (b0Var != j$.time.format.b0.SMART) {
                        LocalDate localDate2 = w.f49883d;
                        Objects.requireNonNull(xVarI, "era");
                        LocalDate localDateOf = LocalDate.of((localDate.getYear() + iA) - 1, iA2, iA3);
                        if (!localDateOf.Q(localDate) && xVarI == x.e(localDateOf)) {
                            return new w(xVarI, iA, localDateOf);
                        }
                        j$.time.f.h("year, month, and day not valid for Era");
                        return null;
                    }
                    if (iA < 1) {
                        j$.time.f.c("Invalid YearOfEra: ", iA);
                        return null;
                    }
                    int year = (localDate.getYear() + iA) - 1;
                    try {
                        wVarR = new w(LocalDate.of(year, iA2, iA3));
                    } catch (j$.time.c unused) {
                        wVarR = new w(LocalDate.of(year, iA2, 1)).R(new j$.desugar.sun.nio.fs.n(3));
                    }
                    if (wVarR.f49885b == xVarI || j$.time.temporal.n.a(wVarR, j$.time.temporal.a.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return wVarR;
                    }
                    throw new j$.time.c("Invalid YearOfEra for Era: " + String.valueOf(xVarI) + " " + iA);
                }
            }
            j$.time.temporal.a aVar5 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar5)) {
                map.remove(aVar);
                map.remove(aVar2);
                if (b0Var == j$.time.format.b0.LENIENT) {
                    return new w(LocalDate.U((localDate.getYear() + iA) - 1, 1)).P(j$.com.android.tools.r8.a.R(((Long) map.remove(aVar5)).longValue(), 1L), ChronoUnit.DAYS);
                }
                int iA4 = o(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5);
                LocalDate localDate3 = w.f49883d;
                Objects.requireNonNull(xVarI, "era");
                LocalDate localDateU = iA == 1 ? LocalDate.U(localDate.getYear(), (localDate.O() + iA4) - 1) : LocalDate.U((localDate.getYear() + iA) - 1, iA4);
                if (!localDateU.Q(localDate) && xVarI == x.e(localDateU)) {
                    return new w(xVarI, iA, localDateU);
                }
                j$.time.f.h("Invalid parameters");
            }
        }
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final b date(int i2, int i3, int i4) {
        return new w(LocalDate.of(i2, i3, i4));
    }

    @Override // j$.time.chrono.Chronology
    public final b dateEpochDay(long j2) {
        return new w(LocalDate.ofEpochDay(j2));
    }

    @Override // j$.time.chrono.Chronology
    public final b dateYearDay(int i2, int i3) {
        return new w(LocalDate.U(i2, i3));
    }

    @Override // j$.time.chrono.Chronology
    public final l eraOf(int i2) {
        return x.i(i2);
    }

    @Override // j$.time.chrono.Chronology
    public final List eras() {
        x[] xVarArr = x.f49888e;
        return j$.com.android.tools.r8.a.I((x[]) Arrays.copyOf(xVarArr, xVarArr.length));
    }

    @Override // j$.time.chrono.Chronology
    public final String getCalendarType() {
        return "japanese";
    }

    @Override // j$.time.chrono.Chronology
    public final String getId() {
        return "Japanese";
    }

    @Override // j$.time.chrono.a
    public final b h() {
        return new w(LocalDate.M(LocalDate.T(j$.time.b.a())));
    }

    @Override // j$.time.chrono.Chronology
    public final boolean isLeapYear(long j2) {
        return r.f49878d.isLeapYear(j2);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.p o(j$.time.temporal.a aVar) {
        switch (t.f49880a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                j$.time.f.f("Unsupported field: ".concat(String.valueOf(aVar)));
                return null;
            case 5:
                x[] xVarArr = x.f49888e;
                int year = xVarArr[xVarArr.length - 1].f49890b.getYear();
                int year2 = 1000000000 - xVarArr[xVarArr.length - 1].f49890b.getYear();
                int year3 = xVarArr[0].f49890b.getYear();
                for (int i2 = 1; i2 < xVarArr.length; i2++) {
                    x xVar = xVarArr[i2];
                    year2 = Math.min(year2, (xVar.f49890b.getYear() - year3) + 1);
                    year3 = xVar.f49890b.getYear();
                }
                return j$.time.temporal.p.g(1L, year2, 999999999 - year);
            case 6:
                x xVar2 = x.f49887d;
                long j2 = j$.time.temporal.a.DAY_OF_YEAR.f50048b.f50074c;
                long jMin = j2;
                for (x xVar3 : x.f49888e) {
                    long jMin2 = Math.min(jMin, (xVar3.f49890b.lengthOfYear() - xVar3.f49890b.O()) + 1);
                    jMin = xVar3.g() != null ? Math.min(jMin2, xVar3.g().f49890b.O() - 1) : jMin2;
                }
                return j$.time.temporal.p.g(1L, jMin, j$.time.temporal.a.DAY_OF_YEAR.f50048b.f50075d);
            case 7:
                return j$.time.temporal.p.f(w.f49883d.getYear(), 999999999L);
            case 8:
                long j3 = x.f49887d.f49889a;
                x[] xVarArr2 = x.f49888e;
                return j$.time.temporal.p.f(j3, xVarArr2[xVarArr2.length - 1].f49889a);
            default:
                return aVar.f50048b;
        }
    }

    @Override // j$.time.chrono.Chronology
    public final int u(l lVar, int i2) {
        if (!(lVar instanceof x)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        LocalDate localDate = ((x) lVar).f49890b;
        int year = (localDate.getYear() + i2) - 1;
        if (i2 == 1 || (year >= -999999999 && year <= 999999999 && year >= localDate.getYear() && lVar == x.e(LocalDate.of(year, 1, 1)))) {
            return year;
        }
        j$.time.f.h("Invalid yearOfEra value");
        return 0;
    }

    public Object writeReplace() {
        return new d0((byte) 1, this);
    }
}
