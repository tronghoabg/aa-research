package j$.time.chrono;

import com.waze.strings.DisplayStrings;
import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.Serializable;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class d implements b, Temporal, j$.time.temporal.k, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public static b B(Chronology chronology, Temporal temporal) {
        b bVar = (b) temporal;
        if (chronology.equals(bVar.getChronology())) {
            return bVar;
        }
        throw new ClassCastException(j$.desugar.sun.nio.fs.h.b("Chronology mismatch, expected: ", chronology.getId(), ", actual: ", bVar.getChronology().getId()));
    }

    @Override // j$.time.chrono.b
    public e E(LocalTime localTime) {
        return new g(this, localTime);
    }

    @Override // j$.time.chrono.b
    public b H(TemporalAmount temporalAmount) {
        return B(getChronology(), temporalAmount.f(this));
    }

    @Override // java.lang.Comparable
    /* renamed from: K */
    public final /* synthetic */ int compareTo(b bVar) {
        return j$.com.android.tools.r8.a.d(this, bVar);
    }

    public final long L(b bVar) {
        if (getChronology().o(j$.time.temporal.a.MONTH_OF_YEAR).f50075d != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        long jD = D(aVar) * 32;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_MONTH;
        return (((bVar.D(aVar) * 32) + bVar.f(aVar2)) - (jD + j$.time.temporal.n.a(this, aVar2))) / 32;
    }

    public abstract b M(long j2);

    public abstract b N(long j2);

    public abstract b O(long j2);

    @Override // j$.time.temporal.Temporal
    public b a(long j2, j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return B(getChronology(), mVar.x(this, j2));
        }
        j$.time.f.f("Unsupported field: ".concat(String.valueOf(mVar)));
        return null;
    }

    @Override // j$.time.temporal.Temporal
    public b b(long j2, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        if (!z) {
            if (!z) {
                return B(getChronology(), temporalUnit.f(this, j2));
            }
            j$.time.f.f("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            return null;
        }
        switch (c.f49840a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return M(j2);
            case 2:
                return M(j$.com.android.tools.r8.a.Q(j2, 7L));
            case 3:
                return N(j2);
            case 4:
                return O(j2);
            case 5:
                return O(j$.com.android.tools.r8.a.Q(j2, 10L));
            case 6:
                return O(j$.com.android.tools.r8.a.Q(j2, 100L));
            case 7:
                return O(j$.com.android.tools.r8.a.Q(j2, 1000L));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(j$.com.android.tools.r8.a.P(D(aVar), j2), (j$.time.temporal.m) aVar);
            default:
                j$.time.f.f("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return null;
        }
    }

    @Override // j$.time.chrono.b, j$.time.temporal.TemporalAccessor
    public /* synthetic */ boolean c(j$.time.temporal.m mVar) {
        return j$.com.android.tools.r8.a.o(this, mVar);
    }

    @Override // j$.time.chrono.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && j$.com.android.tools.r8.a.d(this, (b) obj) == 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int f(j$.time.temporal.m mVar) {
        return j$.time.temporal.n.a(this, mVar);
    }

    @Override // j$.time.chrono.b
    public l getEra() {
        return getChronology().eraOf(j$.time.temporal.n.a(this, j$.time.temporal.a.ERA));
    }

    @Override // j$.time.chrono.b
    public int hashCode() {
        long epochDay = toEpochDay();
        return getChronology().hashCode() ^ ((int) (epochDay ^ (epochDay >>> 32)));
    }

    @Override // j$.time.chrono.b
    public boolean isLeapYear() {
        return getChronology().isLeapYear(D(j$.time.temporal.a.YEAR));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ j$.time.temporal.p k(j$.time.temporal.m mVar) {
        return j$.time.temporal.n.d(this, mVar);
    }

    @Override // j$.time.chrono.b
    public int lengthOfYear() {
        return isLeapYear() ? DisplayStrings.DS_MAIN_MENU_HEADER_BUTTON : DisplayStrings.DS_MAIN_MENU_GENERIC_GREETING;
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ Temporal m(Temporal temporal) {
        return j$.com.android.tools.r8.a.a(this, temporal);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: s */
    public b z(long j2, TemporalUnit temporalUnit) {
        return B(getChronology(), j$.time.temporal.n.b(this, j2, temporalUnit));
    }

    @Override // j$.time.chrono.b
    public long toEpochDay() {
        return D(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        long jD = D(j$.time.temporal.a.YEAR_OF_ERA);
        long jD2 = D(j$.time.temporal.a.MONTH_OF_YEAR);
        long jD3 = D(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(getChronology().toString());
        sb.append(" ");
        sb.append(getEra());
        sb.append(" ");
        sb.append(jD);
        sb.append(jD2 < 10 ? "-0" : "-");
        sb.append(jD2);
        sb.append(jD3 < 10 ? "-0" : "-");
        sb.append(jD3);
        return sb.toString();
    }

    @Override // j$.time.chrono.b, j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        b bVarC = getChronology().C(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.between(this, bVarC);
        }
        switch (c.f49840a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return bVarC.toEpochDay() - toEpochDay();
            case 2:
                return (bVarC.toEpochDay() - toEpochDay()) / 7;
            case 3:
                return L(bVarC);
            case 4:
                return L(bVarC) / 12;
            case 5:
                return L(bVarC) / 120;
            case 6:
                return L(bVarC) / 1200;
            case 7:
                return L(bVarC) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return bVarC.D(aVar) - D(aVar);
            default:
                j$.time.f.f("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object x(j$.desugar.sun.nio.fs.n nVar) {
        return j$.com.android.tools.r8.a.q(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    public b y(j$.time.temporal.k kVar) {
        return B(getChronology(), kVar.m(this));
    }
}
