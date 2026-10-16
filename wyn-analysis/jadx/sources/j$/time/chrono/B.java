package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class B extends AbstractC2893a implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final B f37499d = new B();
    private static final long serialVersionUID = 1039765215346859963L;

    @Override // j$.time.chrono.m
    public final String n() {
        return "Minguo";
    }

    @Override // j$.time.chrono.m
    public final n P(int i5) {
        if (i5 == 0) {
            return E.BEFORE_ROC;
        }
        if (i5 == 1) {
            return E.ROC;
        }
        throw new j$.time.c("Invalid era: " + i5);
    }

    @Override // j$.time.chrono.m
    public final String v() {
        return "roc";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC2894b H(int i5, int i10, int i11) {
        return new D(j$.time.g.g0(i5 + 1911, i10, i11));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC2894b y(int i5, int i10) {
        return new D(j$.time.g.j0(i5 + 1911, i10));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC2894b m(long j8) {
        return new D(j$.time.g.i0(j8));
    }

    @Override // j$.time.chrono.AbstractC2893a
    public final InterfaceC2894b q() {
        return new D(j$.time.g.T(j$.time.g.f0(j$.time.b.i())));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC2894b r(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof D) {
            return (D) temporalAccessor;
        }
        return new D(j$.time.g.T(temporalAccessor));
    }

    @Override // j$.time.chrono.m
    public final int h(n nVar, int i5) {
        if (nVar instanceof E) {
            return nVar == E.ROC ? i5 : 1 - i5;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.m
    public final List N() {
        return j$.time.b.d(E.values());
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.t K(j$.time.temporal.a aVar) {
        int i5 = A.f37498a[aVar.ordinal()];
        if (i5 == 1) {
            j$.time.temporal.t tVarO = j$.time.temporal.a.PROLEPTIC_MONTH.o();
            return j$.time.temporal.t.j(tVarO.e() - 22932, tVarO.d() - 22932);
        }
        if (i5 == 2) {
            j$.time.temporal.t tVarO2 = j$.time.temporal.a.YEAR.o();
            return j$.time.temporal.t.k(tVarO2.d() - 1911, (-tVarO2.e()) + 1912);
        }
        if (i5 == 3) {
            j$.time.temporal.t tVarO3 = j$.time.temporal.a.YEAR.o();
            return j$.time.temporal.t.j(tVarO3.e() - 1911, tVarO3.d() - 1911);
        }
        return aVar.o();
    }

    @Override // j$.time.chrono.AbstractC2893a, j$.time.chrono.m
    public final InterfaceC2894b J(Map map, j$.time.format.y yVar) {
        return (D) super.J(map, yVar);
    }

    private B() {
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
