package j$.time.chrono;

import com.waze.strings.DisplayStrings;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class z extends a implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final z f49893d = new z();
    private static final long serialVersionUID = 1039765215346859963L;

    private z() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public final b C(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof b0 ? (b0) temporalAccessor : new b0(LocalDate.M(temporalAccessor));
    }

    @Override // j$.time.chrono.a, j$.time.chrono.Chronology
    public final b I(Map map, j$.time.format.b0 b0Var) {
        return (b0) super.I(map, b0Var);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime J(Instant instant, ZoneId zoneId) {
        return k.L(this, instant, zoneId);
    }

    @Override // j$.time.chrono.Chronology
    public final b date(int i2, int i3, int i4) {
        return new b0(LocalDate.of(i2 + DisplayStrings.DS_CUSTOM_PROMPT_FIFTH, i3, i4));
    }

    @Override // j$.time.chrono.Chronology
    public final b dateEpochDay(long j2) {
        return new b0(LocalDate.ofEpochDay(j2));
    }

    @Override // j$.time.chrono.Chronology
    public final b dateYearDay(int i2, int i3) {
        return new b0(LocalDate.U(i2 + DisplayStrings.DS_CUSTOM_PROMPT_FIFTH, i3));
    }

    @Override // j$.time.chrono.Chronology
    public final l eraOf(int i2) {
        if (i2 == 0) {
            return c0.BEFORE_ROC;
        }
        if (i2 == 1) {
            return c0.ROC;
        }
        j$.time.f.c("Invalid era: ", i2);
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final List eras() {
        return j$.com.android.tools.r8.a.I(c0.values());
    }

    @Override // j$.time.chrono.Chronology
    public final String getCalendarType() {
        return "roc";
    }

    @Override // j$.time.chrono.Chronology
    public final String getId() {
        return "Minguo";
    }

    @Override // j$.time.chrono.a
    public final b h() {
        return new b0(LocalDate.M(LocalDate.T(j$.time.b.a())));
    }

    @Override // j$.time.chrono.Chronology
    public final boolean isLeapYear(long j2) {
        return r.f49878d.isLeapYear(j2 + 1911);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.p o(j$.time.temporal.a aVar) {
        int i2 = y.f49892a[aVar.ordinal()];
        if (i2 == 1) {
            j$.time.temporal.p pVar = j$.time.temporal.a.PROLEPTIC_MONTH.f50048b;
            return j$.time.temporal.p.f(pVar.f50072a - 22932, pVar.f50075d - 22932);
        }
        if (i2 == 2) {
            j$.time.temporal.p pVar2 = j$.time.temporal.a.YEAR.f50048b;
            return j$.time.temporal.p.g(1L, pVar2.f50075d - 1911, (-pVar2.f50072a) + 1912);
        }
        if (i2 != 3) {
            return aVar.f50048b;
        }
        j$.time.temporal.p pVar3 = j$.time.temporal.a.YEAR.f50048b;
        return j$.time.temporal.p.f(pVar3.f50072a - 1911, pVar3.f50075d - 1911);
    }

    @Override // j$.time.chrono.Chronology
    public final int u(l lVar, int i2) {
        if (lVar instanceof c0) {
            return lVar == c0.ROC ? i2 : 1 - i2;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    public Object writeReplace() {
        return new d0((byte) 1, this);
    }
}
