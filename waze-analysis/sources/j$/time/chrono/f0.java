package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class f0 extends a implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final f0 f49846d = new f0();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private f0() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public final b C(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof h0 ? (h0) temporalAccessor : new h0(LocalDate.M(temporalAccessor));
    }

    @Override // j$.time.chrono.a, j$.time.chrono.Chronology
    public final b I(Map map, j$.time.format.b0 b0Var) {
        return (h0) super.I(map, b0Var);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime J(Instant instant, ZoneId zoneId) {
        return k.L(this, instant, zoneId);
    }

    @Override // j$.time.chrono.Chronology
    public final b date(int i2, int i3, int i4) {
        return new h0(LocalDate.of(i2 - 543, i3, i4));
    }

    @Override // j$.time.chrono.Chronology
    public final b dateEpochDay(long j2) {
        return new h0(LocalDate.ofEpochDay(j2));
    }

    @Override // j$.time.chrono.Chronology
    public final b dateYearDay(int i2, int i3) {
        return new h0(LocalDate.U(i2 - 543, i3));
    }

    @Override // j$.time.chrono.Chronology
    public final l eraOf(int i2) {
        if (i2 == 0) {
            return i0.BEFORE_BE;
        }
        if (i2 == 1) {
            return i0.BE;
        }
        j$.time.f.c("Invalid era: ", i2);
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final List eras() {
        return j$.com.android.tools.r8.a.I(i0.values());
    }

    @Override // j$.time.chrono.Chronology
    public final String getCalendarType() {
        return "buddhist";
    }

    @Override // j$.time.chrono.Chronology
    public final String getId() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.a
    public final b h() {
        return new h0(LocalDate.M(LocalDate.T(j$.time.b.a())));
    }

    @Override // j$.time.chrono.Chronology
    public final boolean isLeapYear(long j2) {
        return r.f49878d.isLeapYear(j2 - 543);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.p o(j$.time.temporal.a aVar) {
        int i2 = e0.f49844a[aVar.ordinal()];
        if (i2 == 1) {
            j$.time.temporal.p pVar = j$.time.temporal.a.PROLEPTIC_MONTH.f50048b;
            return j$.time.temporal.p.f(pVar.f50072a + 6516, pVar.f50075d + 6516);
        }
        if (i2 == 2) {
            j$.time.temporal.p pVar2 = j$.time.temporal.a.YEAR.f50048b;
            return j$.time.temporal.p.g(1L, (-(pVar2.f50072a + 543)) + 1, pVar2.f50075d + 543);
        }
        if (i2 != 3) {
            return aVar.f50048b;
        }
        j$.time.temporal.p pVar3 = j$.time.temporal.a.YEAR.f50048b;
        return j$.time.temporal.p.f(pVar3.f50072a + 543, pVar3.f50075d + 543);
    }

    @Override // j$.time.chrono.Chronology
    public final int u(l lVar, int i2) {
        if (lVar instanceof i0) {
            return lVar == i0.BE ? i2 : 1 - i2;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    public Object writeReplace() {
        return new d0((byte) 1, this);
    }
}
