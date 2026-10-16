package j$.time.chrono;

import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class v extends a implements Serializable {
    public static final v c = new v();
    private static final long serialVersionUID = 459996390165777884L;

    private v() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.a
    public final int B(m mVar, int i) {
        if (!(mVar instanceof y)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i2 = ((y) mVar).b.a;
        int i3 = (i2 + i) - 1;
        if (i == 1 || (i3 >= -999999999 && i3 <= 999999999 && i3 >= i2 && mVar == y.c(LocalDate.O(i3, 1, 1)))) {
            return i3;
        }
        j$.time.g.g("Invalid yearOfEra value");
        return 0;
    }

    @Override // j$.time.chrono.a
    public final j$.time.temporal.q C(j$.time.temporal.a aVar) {
        switch (u.a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                j$.time.g.e("Unsupported field: ".concat(String.valueOf(aVar)));
                return null;
            case 5:
                y[] yVarArr = y.e;
                int i = yVarArr[yVarArr.length - 1].b.a;
                int iMin = 1000000000 - yVarArr[yVarArr.length - 1].b.a;
                int i2 = yVarArr[0].b.a;
                for (int i3 = 1; i3 < yVarArr.length; i3++) {
                    y yVar = yVarArr[i3];
                    iMin = Math.min(iMin, (yVar.b.a - i2) + 1);
                    i2 = yVar.b.a;
                }
                return j$.time.temporal.q.g(1L, iMin, 999999999 - i);
            case 6:
                y yVar2 = y.d;
                long j = j$.time.temporal.a.DAY_OF_YEAR.b.c;
                long jMin = j;
                for (y yVar3 : y.e) {
                    long jMin2 = Math.min(jMin, (yVar3.b.lengthOfYear() - yVar3.b.I()) + 1);
                    jMin = yVar3.f() != null ? Math.min(jMin2, yVar3.f().b.I() - 1) : jMin2;
                }
                return j$.time.temporal.q.g(1L, jMin, j$.time.temporal.a.DAY_OF_YEAR.b.d);
            case 7:
                return j$.time.temporal.q.f(x.d.a, 999999999L);
            case 8:
                long j2 = y.d.a;
                y[] yVarArr2 = y.e;
                return j$.time.temporal.q.f(j2, yVarArr2[yVarArr2.length - 1].a);
            default:
                return aVar.b;
        }
    }

    @Override // j$.time.chrono.a
    public final b J(Map map, j$.time.format.d0 d0Var) {
        return (x) super.J(map, d0Var);
    }

    @Override // j$.time.chrono.a
    public final b M(Map map, j$.time.format.d0 d0Var) {
        x xVarK;
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        Long l = (Long) map.get(aVar);
        y yVarI = l != null ? y.i(C(aVar).a(l.longValue(), aVar)) : null;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l2 = (Long) map.get(aVar2);
        int iA = l2 != null ? C(aVar2).a(l2.longValue(), aVar2) : 0;
        if (yVarI == null && l2 != null && !map.containsKey(j$.time.temporal.a.YEAR) && d0Var != j$.time.format.d0.STRICT) {
            y[] yVarArr = y.e;
            yVarI = ((y[]) Arrays.copyOf(yVarArr, yVarArr.length))[((y[]) Arrays.copyOf(yVarArr, yVarArr.length)).length - 1];
        }
        if (l2 != null && yVarI != null) {
            LocalDate localDate = yVarI.b;
            int i = localDate.a;
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                j$.time.temporal.a aVar4 = j$.time.temporal.a.DAY_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    map.remove(aVar);
                    map.remove(aVar2);
                    if (d0Var == j$.time.format.d0.LENIENT) {
                        return new x(LocalDate.O((localDate.a + iA) - 1, 1, 1)).I(j$.desugar.sun.nio.fs.g.I(((Long) map.remove(aVar3)).longValue(), 1L), ChronoUnit.MONTHS).I(j$.desugar.sun.nio.fs.g.I(((Long) map.remove(aVar4)).longValue(), 1L), ChronoUnit.DAYS);
                    }
                    int iA2 = C(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int iA3 = C(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    if (d0Var != j$.time.format.d0.SMART) {
                        LocalDate localDate2 = x.d;
                        LocalDate localDateO = LocalDate.O((i + iA) - 1, iA2, iA3);
                        if (!localDateO.K(localDate) && yVarI == y.c(localDateO)) {
                            return new x(yVarI, iA, localDateO);
                        }
                        j$.time.g.g("year, month, and day not valid for Era");
                        return null;
                    }
                    if (iA < 1) {
                        j$.time.g.b("Invalid YearOfEra: ", iA);
                        return null;
                    }
                    int i2 = (localDate.a + iA) - 1;
                    try {
                        xVarK = new x(LocalDate.O(i2, iA2, iA3));
                    } catch (DateTimeException unused) {
                        xVarK = new x(LocalDate.O(i2, iA2, 1)).K(new j$.desugar.sun.nio.fs.n((byte) 5));
                    }
                    if (xVarK.b == yVarI || j$.time.temporal.o.a(xVarK, j$.time.temporal.a.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return xVarK;
                    }
                    throw new DateTimeException("Invalid YearOfEra for Era: " + String.valueOf(yVarI) + " " + iA);
                }
            }
            j$.time.temporal.a aVar5 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar5)) {
                map.remove(aVar);
                map.remove(aVar2);
                if (d0Var == j$.time.format.d0.LENIENT) {
                    return new x(LocalDate.P((localDate.a + iA) - 1, 1)).I(j$.desugar.sun.nio.fs.g.I(((Long) map.remove(aVar5)).longValue(), 1L), ChronoUnit.DAYS);
                }
                int iA4 = C(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5);
                LocalDate localDate3 = x.d;
                LocalDate localDateP = iA == 1 ? LocalDate.P(i, (localDate.I() + iA4) - 1) : LocalDate.P((i + iA) - 1, iA4);
                if (!localDateP.K(localDate) && yVarI == y.c(localDateP)) {
                    return new x(yVarI, iA, localDateP);
                }
                j$.time.g.g("Invalid parameters");
            }
        }
        return null;
    }

    @Override // j$.time.chrono.a
    public final j N(Instant instant, ZoneId zoneId) {
        return l.s(this, instant, zoneId);
    }

    @Override // j$.time.chrono.a
    public final j O(Temporal temporal) {
        return super.O(temporal);
    }

    @Override // j$.time.chrono.a
    public final List eras() {
        y[] yVarArr = y.e;
        return j$.desugar.sun.nio.fs.g.A((y[]) Arrays.copyOf(yVarArr, yVarArr.length));
    }

    @Override // j$.time.chrono.a
    public final String getCalendarType() {
        return "japanese";
    }

    @Override // j$.time.chrono.a
    public final String getId() {
        return "Japanese";
    }

    @Override // j$.time.chrono.a
    public final boolean isLeapYear(long j) {
        return s.c.isLeapYear(j);
    }

    @Override // j$.time.chrono.a
    public final b k(int i, int i2, int i3) {
        return new x(LocalDate.O(i, i2, i3));
    }

    @Override // j$.time.chrono.a
    public final b l(j$.time.temporal.k kVar) {
        return kVar instanceof x ? (x) kVar : new x(LocalDate.A(kVar));
    }

    @Override // j$.time.chrono.a
    public final b p(long j) {
        return new x(LocalDate.ofEpochDay(j));
    }

    @Override // j$.time.chrono.a
    public final b r() {
        int i = Clock.a;
        return new x(LocalDate.A(LocalDate.N(new j$.time.a(ZoneId.systemDefault()))));
    }

    @Override // j$.time.chrono.a
    public final b s(int i, int i2) {
        return new x(LocalDate.P(i, i2));
    }

    @Override // j$.time.chrono.a
    public final m w(int i) {
        return y.i(i);
    }

    public Object writeReplace() {
        return new e0((byte) 1, this);
    }

    @Override // j$.time.chrono.a
    public final e y(Temporal temporal) {
        return super.y(temporal);
    }
}
