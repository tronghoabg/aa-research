package j$.time.chrono;

import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* renamed from: j$.time.chrono.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2901i {
    public static boolean j(n nVar, j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.ERA : qVar != null && qVar.t(nVar);
    }

    public static m q(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        Object objRequireNonNull = (m) temporalAccessor.B(j$.time.temporal.l.e());
        t tVar = t.f37543d;
        if (objRequireNonNull == null) {
            objRequireNonNull = Objects.requireNonNull(tVar, "defaultObj");
        }
        return (m) objRequireNonNull;
    }

    public static int e(ChronoZonedDateTime chronoZonedDateTime, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i5 = AbstractC2902j.f37522a[((j$.time.temporal.a) qVar).ordinal()];
            if (i5 == 1) {
                throw new j$.time.temporal.s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i5 == 2) {
                return chronoZonedDateTime.i().Z();
            }
            return chronoZonedDateTime.G().q(qVar);
        }
        return j$.time.temporal.l.a(chronoZonedDateTime, qVar);
    }

    public static int f(n nVar, j$.time.temporal.a aVar) {
        if (aVar == j$.time.temporal.a.ERA) {
            return nVar.getValue();
        }
        return j$.time.temporal.l.a(nVar, aVar);
    }

    public static long g(n nVar, j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return nVar.getValue();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(j$.time.d.a("Unsupported field: ", qVar));
        }
        return qVar.s(nVar);
    }

    public static Object n(n nVar, j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.ERAS;
        }
        return j$.time.temporal.l.c(nVar, rVar);
    }

    public static Object l(InterfaceC2897e interfaceC2897e, j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.k() || rVar == j$.time.temporal.l.j() || rVar == j$.time.temporal.l.h()) {
            return null;
        }
        if (rVar == j$.time.temporal.l.g()) {
            return interfaceC2897e.b();
        }
        if (rVar == j$.time.temporal.l.e()) {
            return interfaceC2897e.a();
        }
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.NANOS;
        }
        return rVar.h(interfaceC2897e);
    }

    public static boolean i(InterfaceC2894b interfaceC2894b, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).D();
        }
        return qVar != null && qVar.t(interfaceC2894b);
    }

    public static long o(InterfaceC2897e interfaceC2897e, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        return ((interfaceC2897e.c().x() * 86400) + interfaceC2897e.b().k0()) - zoneOffset.Z();
    }

    public static Object m(ChronoZonedDateTime chronoZonedDateTime, j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.j() || rVar == j$.time.temporal.l.k()) {
            return chronoZonedDateTime.u();
        }
        if (rVar == j$.time.temporal.l.h()) {
            return chronoZonedDateTime.i();
        }
        if (rVar == j$.time.temporal.l.g()) {
            return chronoZonedDateTime.b();
        }
        if (rVar == j$.time.temporal.l.e()) {
            return chronoZonedDateTime.a();
        }
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.NANOS;
        }
        return rVar.h(chronoZonedDateTime);
    }

    public static int c(InterfaceC2897e interfaceC2897e, InterfaceC2897e interfaceC2897e2) {
        int iCompareTo = interfaceC2897e.c().compareTo(interfaceC2897e2.c());
        return (iCompareTo == 0 && (iCompareTo = interfaceC2897e.b().compareTo(interfaceC2897e2.b())) == 0) ? ((AbstractC2893a) interfaceC2897e.a()).n().compareTo(interfaceC2897e2.a().n()) : iCompareTo;
    }

    public static Object k(InterfaceC2894b interfaceC2894b, j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.k() || rVar == j$.time.temporal.l.j() || rVar == j$.time.temporal.l.h() || rVar == j$.time.temporal.l.g()) {
            return null;
        }
        if (rVar == j$.time.temporal.l.e()) {
            return interfaceC2894b.a();
        }
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.DAYS;
        }
        return rVar.h(interfaceC2894b);
    }

    public static Temporal a(InterfaceC2894b interfaceC2894b, Temporal temporal) {
        return temporal.d(interfaceC2894b.x(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static long p(ChronoZonedDateTime chronoZonedDateTime) {
        return ((chronoZonedDateTime.c().x() * 86400) + chronoZonedDateTime.b().k0()) - chronoZonedDateTime.i().Z();
    }

    public static int d(ChronoZonedDateTime chronoZonedDateTime, ChronoZonedDateTime chronoZonedDateTime2) {
        int iCompare = Long.compare(chronoZonedDateTime.Q(), chronoZonedDateTime2.Q());
        return (iCompare == 0 && (iCompare = chronoZonedDateTime.b().X() - chronoZonedDateTime2.b().X()) == 0 && (iCompare = chronoZonedDateTime.G().compareTo(chronoZonedDateTime2.G())) == 0 && (iCompare = chronoZonedDateTime.u().n().compareTo(chronoZonedDateTime2.u().n())) == 0) ? ((AbstractC2893a) chronoZonedDateTime.a()).n().compareTo(chronoZonedDateTime2.a().n()) : iCompare;
    }

    public static boolean h(ChronoZonedDateTime chronoZonedDateTime, ChronoZonedDateTime chronoZonedDateTime2) {
        long jQ = chronoZonedDateTime.Q();
        long jQ2 = chronoZonedDateTime2.Q();
        if (jQ >= jQ2) {
            return jQ == jQ2 && chronoZonedDateTime.b().X() < chronoZonedDateTime2.b().X();
        }
        return true;
    }

    public static int b(InterfaceC2894b interfaceC2894b, InterfaceC2894b interfaceC2894b2) {
        int iCompare = Long.compare(interfaceC2894b.x(), interfaceC2894b2.x());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC2893a) interfaceC2894b.a()).n().compareTo(interfaceC2894b2.a().n());
    }
}
