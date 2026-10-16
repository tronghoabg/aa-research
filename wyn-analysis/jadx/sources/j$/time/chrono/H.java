package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class H extends AbstractC2893a implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final H f37506d = new H();
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

    @Override // j$.time.chrono.m
    public final n P(int i5) {
        if (i5 == 0) {
            return K.BEFORE_BE;
        }
        if (i5 == 1) {
            return K.BE;
        }
        throw new j$.time.c("Invalid era: " + i5);
    }

    @Override // j$.time.chrono.m
    public final String n() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.m
    public final String v() {
        return "buddhist";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC2894b H(int i5, int i10, int i11) {
        return new J(j$.time.g.g0(i5 - 543, i10, i11));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC2894b y(int i5, int i10) {
        return new J(j$.time.g.j0(i5 - 543, i10));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC2894b m(long j8) {
        return new J(j$.time.g.i0(j8));
    }

    @Override // j$.time.chrono.AbstractC2893a
    public final InterfaceC2894b q() {
        return new J(j$.time.g.T(j$.time.g.f0(j$.time.b.i())));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC2894b r(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof J) {
            return (J) temporalAccessor;
        }
        return new J(j$.time.g.T(temporalAccessor));
    }

    @Override // j$.time.chrono.m
    public final int h(n nVar, int i5) {
        if (nVar instanceof K) {
            return nVar == K.BE ? i5 : 1 - i5;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    private H() {
    }

    @Override // j$.time.chrono.m
    public final List N() {
        return j$.time.b.d(K.values());
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.t K(j$.time.temporal.a aVar) {
        int i5 = G.f37505a[aVar.ordinal()];
        if (i5 == 1) {
            j$.time.temporal.t tVarO = j$.time.temporal.a.PROLEPTIC_MONTH.o();
            return j$.time.temporal.t.j(tVarO.e() + 6516, tVarO.d() + 6516);
        }
        if (i5 == 2) {
            j$.time.temporal.t tVarO2 = j$.time.temporal.a.YEAR.o();
            return j$.time.temporal.t.k((-(tVarO2.e() + 543)) + 1, tVarO2.d() + 543);
        }
        if (i5 == 3) {
            j$.time.temporal.t tVarO3 = j$.time.temporal.a.YEAR.o();
            return j$.time.temporal.t.j(tVarO3.e() + 543, tVarO3.d() + 543);
        }
        return aVar.o();
    }

    @Override // j$.time.chrono.AbstractC2893a, j$.time.chrono.m
    public final InterfaceC2894b J(Map map, j$.time.format.y yVar) {
        return (J) super.J(map, yVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.m
    public final ChronoZonedDateTime L(Instant instant, ZoneId zoneId) {
        return l.S(this, instant, zoneId);
    }

    Object writeReplace() {
        return new F((byte) 1, this);
    }
}
