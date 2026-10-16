package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes2.dex */
public final class w extends AbstractC2893a implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final w f37546d = new w();
    private static final long serialVersionUID = 459996390165777884L;

    @Override // j$.time.chrono.m
    public final String n() {
        return "Japanese";
    }

    @Override // j$.time.chrono.m
    public final String v() {
        return "japanese";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC2894b H(int i5, int i10, int i11) {
        return new y(j$.time.g.g0(i5, i10, i11));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC2894b y(int i5, int i10) {
        return new y(j$.time.g.j0(i5, i10));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC2894b m(long j8) {
        return new y(j$.time.g.i0(j8));
    }

    @Override // j$.time.chrono.AbstractC2893a
    public final InterfaceC2894b q() {
        return new y(j$.time.g.T(j$.time.g.f0(j$.time.b.i())));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC2894b r(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof y) {
            return (y) temporalAccessor;
        }
        return new y(j$.time.g.T(temporalAccessor));
    }

    private w() {
    }

    @Override // j$.time.chrono.m
    public final int h(n nVar, int i5) {
        if (!(nVar instanceof z)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        z zVar = (z) nVar;
        int iA0 = (zVar.n().a0() + i5) - 1;
        if (i5 != 1 && (iA0 < -999999999 || iA0 > 999999999 || iA0 < zVar.n().a0() || nVar != z.h(j$.time.g.g0(iA0, 1, 1)))) {
            throw new j$.time.c("Invalid yearOfEra value");
        }
        return iA0;
    }

    @Override // j$.time.chrono.m
    public final n P(int i5) {
        return z.v(i5);
    }

    @Override // j$.time.chrono.m
    public final List N() {
        return j$.time.b.d(z.C());
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.t K(j$.time.temporal.a aVar) {
        switch (v.f37545a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.s("Unsupported field: " + aVar);
            case 5:
                return j$.time.temporal.t.k(z.A(), 999999999 - z.m().n().a0());
            case 6:
                return j$.time.temporal.t.k(z.y(), j$.time.temporal.a.DAY_OF_YEAR.o().d());
            case 7:
                return j$.time.temporal.t.j(y.f37548d.a0(), 999999999L);
            case 8:
                return j$.time.temporal.t.j(z.f37552d.getValue(), z.m().getValue());
            default:
                return aVar.o();
        }
    }

    @Override // j$.time.chrono.AbstractC2893a, j$.time.chrono.m
    public final InterfaceC2894b J(Map map, j$.time.format.y yVar) {
        return (y) super.J(map, yVar);
    }

    @Override // j$.time.chrono.AbstractC2893a
    final InterfaceC2894b R(Map map, j$.time.format.y yVar) {
        y yVarA0;
        int i5 = 0;
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        Long l10 = (Long) map.get(aVar);
        z zVarV = l10 != null ? z.v(K(aVar).a(l10.longValue(), aVar)) : null;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l11 = (Long) map.get(aVar2);
        int iA = l11 != null ? K(aVar2).a(l11.longValue(), aVar2) : 0;
        if (zVarV == null && l11 != null && !map.containsKey(j$.time.temporal.a.YEAR) && yVar != j$.time.format.y.STRICT) {
            zVarV = z.C()[z.C().length - 1];
        }
        if (l11 != null && zVarV != null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                j$.time.temporal.a aVar4 = j$.time.temporal.a.DAY_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    map.remove(aVar);
                    map.remove(aVar2);
                    if (yVar == j$.time.format.y.LENIENT) {
                        return new y(j$.time.g.g0((zVarV.n().a0() + iA) - 1, 1, 1)).X(j$.time.b.h(((Long) map.remove(aVar3)).longValue(), 1L), ChronoUnit.MONTHS).X(j$.time.b.h(((Long) map.remove(aVar4)).longValue(), 1L), ChronoUnit.DAYS);
                    }
                    int iA2 = K(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int iA3 = K(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    if (yVar != j$.time.format.y.SMART) {
                        j$.time.g gVar = y.f37548d;
                        Objects.requireNonNull(zVarV, "era");
                        j$.time.g gVarG0 = j$.time.g.g0((zVarV.n().a0() + iA) - 1, iA2, iA3);
                        if (gVarG0.b0(zVarV.n()) || zVarV != z.h(gVarG0)) {
                            throw new j$.time.c("year, month, and day not valid for Era");
                        }
                        return new y(zVarV, iA, gVarG0);
                    }
                    if (iA < 1) {
                        throw new j$.time.c("Invalid YearOfEra: " + iA);
                    }
                    int iA0 = (zVarV.n().a0() + iA) - 1;
                    try {
                        yVarA0 = new y(j$.time.g.g0(iA0, iA2, iA3));
                    } catch (j$.time.c unused) {
                        yVarA0 = new y(j$.time.g.g0(iA0, iA2, 1)).a0(new j$.time.temporal.o(i5));
                    }
                    if (yVarA0.W() == zVarV || j$.time.temporal.l.a(yVarA0, j$.time.temporal.a.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return yVarA0;
                    }
                    throw new j$.time.c("Invalid YearOfEra for Era: " + zVarV + StringUtils.SPACE + iA);
                }
            }
            j$.time.temporal.a aVar5 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar5)) {
                map.remove(aVar);
                map.remove(aVar2);
                if (yVar == j$.time.format.y.LENIENT) {
                    return new y(j$.time.g.j0((zVarV.n().a0() + iA) - 1, 1)).X(j$.time.b.h(((Long) map.remove(aVar5)).longValue(), 1L), ChronoUnit.DAYS);
                }
                int iA4 = K(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5);
                j$.time.g gVar2 = y.f37548d;
                Objects.requireNonNull(zVarV, "era");
                j$.time.g gVarJ0 = iA == 1 ? j$.time.g.j0(zVarV.n().a0(), (zVarV.n().X() + iA4) - 1) : j$.time.g.j0((zVarV.n().a0() + iA) - 1, iA4);
                if (gVarJ0.b0(zVarV.n()) || zVarV != z.h(gVarJ0)) {
                    throw new j$.time.c("Invalid parameters");
                }
                return new y(zVarV, iA, gVarJ0);
            }
        }
        return null;
    }

    @Override // j$.time.chrono.m
    public final ChronoZonedDateTime L(Instant instant, ZoneId zoneId) {
        return l.S(this, instant, zoneId);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new F((byte) 1, this);
    }
}
