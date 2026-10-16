package j$.time.chrono;

import j$.time.Clock;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class g0 extends a implements Serializable {
    public static final g0 c = new g0();
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

    private g0() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.a
    public final int B(m mVar, int i) {
        if (mVar instanceof j0) {
            return mVar == j0.BE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    @Override // j$.time.chrono.a
    public final j$.time.temporal.q C(j$.time.temporal.a aVar) {
        int i = f0.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.q qVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.q.f(qVar.a + 6516, qVar.d + 6516);
        }
        if (i == 2) {
            j$.time.temporal.q qVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.q.g(1L, (-(qVar2.a + 543)) + 1, qVar2.d + 543);
        }
        if (i != 3) {
            return aVar.b;
        }
        j$.time.temporal.q qVar3 = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.q.f(qVar3.a + 543, qVar3.d + 543);
    }

    @Override // j$.time.chrono.a
    public final b J(Map map, j$.time.format.d0 d0Var) {
        return (i0) super.J(map, d0Var);
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
        return j$.desugar.sun.nio.fs.g.A(j0.values());
    }

    @Override // j$.time.chrono.a
    public final String getCalendarType() {
        return "buddhist";
    }

    @Override // j$.time.chrono.a
    public final String getId() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.a
    public final boolean isLeapYear(long j) {
        return s.c.isLeapYear(j - 543);
    }

    @Override // j$.time.chrono.a
    public final b k(int i, int i2, int i3) {
        return new i0(LocalDate.O(i - 543, i2, i3));
    }

    @Override // j$.time.chrono.a
    public final b l(j$.time.temporal.k kVar) {
        return kVar instanceof i0 ? (i0) kVar : new i0(LocalDate.A(kVar));
    }

    @Override // j$.time.chrono.a
    public final b p(long j) {
        return new i0(LocalDate.ofEpochDay(j));
    }

    @Override // j$.time.chrono.a
    public final b r() {
        int i = Clock.a;
        return new i0(LocalDate.A(LocalDate.N(new j$.time.a(ZoneId.systemDefault()))));
    }

    @Override // j$.time.chrono.a
    public final b s(int i, int i2) {
        return new i0(LocalDate.P(i - 543, i2));
    }

    @Override // j$.time.chrono.a
    public final m w(int i) {
        if (i == 0) {
            return j0.BEFORE_BE;
        }
        if (i == 1) {
            return j0.BE;
        }
        j$.time.g.b("Invalid era: ", i);
        return null;
    }

    public Object writeReplace() {
        return new e0((byte) 1, this);
    }

    @Override // j$.time.chrono.a
    public final e y(Temporal temporal) {
        return super.y(temporal);
    }
}
