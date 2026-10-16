package j$.time;

import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.media3.common.C;
import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.b0;
import j$.time.format.c0;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class YearMonth implements Temporal, j$.time.temporal.k, Comparable<YearMonth>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f49819c = 0;
    private static final long serialVersionUID = 4183400860270640070L;

    /* renamed from: a, reason: collision with root package name */
    public final int f49820a;

    /* renamed from: b, reason: collision with root package name */
    public final int f49821b;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.n(j$.time.temporal.a.YEAR, 4, 10, c0.EXCEEDS_PAD);
        dateTimeFormatterBuilder.d('-');
        dateTimeFormatterBuilder.m(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        dateTimeFormatterBuilder.r(Locale.getDefault(), b0.SMART, null);
    }

    public YearMonth(int i2, int i3) {
        this.f49820a = i2;
        this.f49821b = i3;
    }

    public static YearMonth from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof YearMonth) {
            return (YearMonth) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            if (!j$.time.chrono.r.f49878d.equals(Chronology.CC.a(temporalAccessor))) {
                temporalAccessor = LocalDate.M(temporalAccessor);
            }
            j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
            int iF = temporalAccessor.f(aVar);
            j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
            int iF2 = temporalAccessor.f(aVar2);
            aVar.z(iF);
            aVar2.z(iF2);
            return new YearMonth(iF, iF2);
        } catch (c e2) {
            throw new c(j$.desugar.sun.nio.fs.h.b("Unable to obtain YearMonth from TemporalAccessor: ", String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()), e2);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o(StylePropertiesKt.HeightFractionId, this);
    }

    public final long B() {
        return ((this.f49820a * 12) + this.f49821b) - 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return mVar.k(this);
        }
        int i2 = r.f50029a[((j$.time.temporal.a) mVar).ordinal()];
        if (i2 == 1) {
            return this.f49821b;
        }
        if (i2 == 2) {
            return B();
        }
        int i3 = this.f49820a;
        if (i2 == 3) {
            if (i3 < 1) {
                i3 = 1 - i3;
            }
            return i3;
        }
        if (i2 == 4) {
            return i3;
        }
        if (i2 == 5) {
            return i3 < 1 ? 0 : 1;
        }
        f.f("Unsupported field: ".concat(String.valueOf(mVar)));
        return 0L;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final YearMonth b(long j2, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (YearMonth) temporalUnit.f(this, j2);
        }
        switch (r.f50030b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return M(j2);
            case 2:
                return N(j2);
            case 3:
                return N(j$.com.android.tools.r8.a.Q(j2, 10L));
            case 4:
                return N(j$.com.android.tools.r8.a.Q(j2, 100L));
            case 5:
                return N(j$.com.android.tools.r8.a.Q(j2, 1000L));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(j$.com.android.tools.r8.a.P(D(aVar), j2), aVar);
            default:
                f.f("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return null;
        }
    }

    public final YearMonth M(long j2) {
        if (j2 == 0) {
            return this;
        }
        long j3 = (this.f49820a * 12) + (this.f49821b - 1) + j2;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return O(aVar.f50048b.a(j$.com.android.tools.r8.a.F(j3, 12L), aVar), ((int) j$.com.android.tools.r8.a.O(j3, 12L)) + 1);
    }

    public final YearMonth N(long j2) {
        if (j2 == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return O(aVar.f50048b.a(this.f49820a + j2, aVar), this.f49821b);
    }

    public final YearMonth O(int i2, int i3) {
        return (this.f49820a == i2 && this.f49821b == i3) ? this : new YearMonth(i2, i3);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final YearMonth a(long j2, j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return (YearMonth) mVar.x(this, j2);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) mVar;
        aVar.z(j2);
        int i2 = r.f50029a[aVar.ordinal()];
        int i3 = this.f49820a;
        if (i2 == 1) {
            int i4 = (int) j2;
            j$.time.temporal.a.MONTH_OF_YEAR.z(i4);
            return O(i3, i4);
        }
        if (i2 == 2) {
            return M(j2 - B());
        }
        int i5 = this.f49821b;
        if (i2 == 3) {
            if (i3 < 1) {
                j2 = 1 - j2;
            }
            int i6 = (int) j2;
            j$.time.temporal.a.YEAR.z(i6);
            return O(i6, i5);
        }
        if (i2 == 4) {
            int i7 = (int) j2;
            j$.time.temporal.a.YEAR.z(i7);
            return O(i7, i5);
        }
        if (i2 != 5) {
            f.f("Unsupported field: ".concat(String.valueOf(mVar)));
            return null;
        }
        if (D(j$.time.temporal.a.ERA) == j2) {
            return this;
        }
        int i8 = 1 - i3;
        j$.time.temporal.a.YEAR.z(i8);
        return O(i8, i5);
    }

    public LocalDate atDay(int i2) {
        return LocalDate.of(this.f49820a, this.f49821b, i2);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.m mVar) {
        return mVar instanceof j$.time.temporal.a ? mVar == j$.time.temporal.a.YEAR || mVar == j$.time.temporal.a.MONTH_OF_YEAR || mVar == j$.time.temporal.a.PROLEPTIC_MONTH || mVar == j$.time.temporal.a.YEAR_OF_ERA || mVar == j$.time.temporal.a.ERA : mVar != null && mVar.f(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(YearMonth yearMonth) {
        YearMonth yearMonth2 = yearMonth;
        int i2 = this.f49820a - yearMonth2.f49820a;
        return i2 == 0 ? this.f49821b - yearMonth2.f49821b : i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YearMonth) {
            YearMonth yearMonth = (YearMonth) obj;
            if (this.f49820a == yearMonth.f49820a && this.f49821b == yearMonth.f49821b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int f(j$.time.temporal.m mVar) {
        return k(mVar).a(D(mVar), mVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: h */
    public final Temporal y(LocalDate localDate) {
        localDate.getClass();
        return (YearMonth) j$.com.android.tools.r8.a.a(localDate, this);
    }

    public final int hashCode() {
        return this.f49820a ^ (this.f49821b << 27);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(j$.time.temporal.m mVar) {
        if (mVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.p.f(1L, this.f49820a <= 0 ? C.NANOS_PER_SECOND : 999999999L);
        }
        return j$.time.temporal.n.d(this, mVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal m(Temporal temporal) {
        if (Chronology.CC.a(temporal).equals(j$.time.chrono.r.f49878d)) {
            return temporal.a(B(), j$.time.temporal.a.PROLEPTIC_MONTH);
        }
        f.h("Adjustment only supported on ISO date-time");
        return null;
    }

    public final String toString() {
        int i2 = this.f49820a;
        int iAbs = Math.abs(i2);
        StringBuilder sb = new StringBuilder(9);
        if (iAbs >= 1000) {
            sb.append(i2);
        } else if (i2 < 0) {
            sb.append(i2 - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i2 + 10000);
            sb.deleteCharAt(0);
        }
        int i3 = this.f49821b;
        sb.append(i3 < 10 ? "-0" : "-");
        sb.append(i3);
        return sb.toString();
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        YearMonth yearMonthFrom = from(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, yearMonthFrom);
        }
        long jB = yearMonthFrom.B() - B();
        switch (r.f50030b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jB;
            case 2:
                return jB / 12;
            case 3:
                return jB / 120;
            case 4:
                return jB / 1200;
            case 5:
                return jB / 12000;
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return yearMonthFrom.D(aVar) - D(aVar);
            default:
                f.f("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object x(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.n.f50066b ? j$.time.chrono.r.f49878d : nVar == j$.time.temporal.n.f50067c ? ChronoUnit.MONTHS : j$.time.temporal.n.c(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal z(long j2, ChronoUnit chronoUnit) {
        long j3;
        if (j2 == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, chronoUnit);
            j3 = 1;
        } else {
            j3 = -j2;
        }
        return this.b(j3, chronoUnit);
    }
}
