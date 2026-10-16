package h.c.a;

import androidx.compose.material3.internal.CalendarModelKt;
import h.c.i;
import h.c.j;
import h.c.k;
import h.g.a.p;
import h.g.a.q;
import h.g.b.au;
import h.g.b.x;
import h.k.n;
import java.util.List;
import java.util.Objects;
import l.a.bpv;
import l.a.bpy;
import l.a.bqq;
import l.a.brd;
import l.a.ep;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h {
    public static final Object a(p pVar, Object obj, h.c.e eVar) {
        x.f(pVar, "<this>");
        x.f(eVar, "completion");
        h.d.b.d(eVar);
        h.c.e eVarT = t(eVar);
        au.h(pVar, 2);
        return pVar.invoke(obj, eVarT);
    }

    public static final Object b(q qVar, Object obj, Object obj2, h.c.e eVar) {
        x.f(qVar, "<this>");
        x.f(eVar, "completion");
        h.d.b.d(eVar);
        h.c.e eVarT = t(eVar);
        au.h(qVar, 3);
        return qVar.invoke(obj, obj2, eVarT);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final h.c.e c(p pVar, Object obj, h.c.e eVar) {
        x.f(pVar, "<this>");
        x.f(eVar, "completion");
        h.d.b.d(eVar);
        if (pVar instanceof h.c.b.a.a) {
            return ((h.c.b.a.a) pVar).create(obj, eVar);
        }
        j context = eVar.getContext();
        return context == k.f48060a ? new d(eVar, pVar, obj) : new e(eVar, context, pVar, obj);
    }

    public static final h.c.e d(h.c.e eVar) {
        x.f(eVar, "<this>");
        h.c.b.a.c cVar = eVar instanceof h.c.b.a.c ? (h.c.b.a.c) eVar : null;
        return cVar != null ? cVar.intercepted() : eVar;
    }

    public static Object e(h.c.h hVar, Object obj, p pVar) {
        x.f(pVar, "operation");
        return pVar.invoke(obj, hVar);
    }

    public static h.c.h f(h.c.h hVar, i iVar) {
        x.f(iVar, "key");
        if (!x.n(hVar.getKey(), iVar)) {
            return null;
        }
        x.d(hVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
        return hVar;
    }

    public static j g(h.c.h hVar, i iVar) {
        x.f(iVar, "key");
        return x.n(hVar.getKey(), iVar) ? k.f48060a : hVar;
    }

    public static j h(h.c.h hVar, j jVar) {
        x.f(jVar, "context");
        return h.b.a.i(hVar, jVar);
    }

    public static final long i(long j2, long j3, h.o.d dVar) {
        x.f(dVar, "unit");
        return (((-1) + j3) | 1) == Long.MAX_VALUE ? h.o.a.v(u(j3)) : v(j2, j3, dVar);
    }

    public static final long j(long j2, long j3, h.o.d dVar) {
        x.f(dVar, "unit");
        if (((j3 - 1) | 1) != Long.MAX_VALUE) {
            return (((-1) + j2) | 1) == Long.MAX_VALUE ? u(j2) : v(j2, j3, dVar);
        }
        if (j2 != j3) {
            return h.o.a.v(u(j3));
        }
        h.o.c cVar = h.o.a.f48264a;
        return 0L;
    }

    public static final double k(double d2, h.o.d dVar, h.o.d dVar2) {
        x.f(dVar, "sourceUnit");
        x.f(dVar2, "targetUnit");
        long jConvert = dVar2.a().convert(1L, dVar.a());
        return jConvert > 0 ? d2 * jConvert : d2 / dVar.a().convert(1L, dVar2.a());
    }

    public static final long l(long j2, h.o.d dVar, h.o.d dVar2) {
        x.f(dVar, "sourceUnit");
        x.f(dVar2, "targetUnit");
        return dVar2.a().convert(j2, dVar.a());
    }

    public static final long m(long j2, h.o.d dVar, h.o.d dVar2) {
        x.f(dVar, "sourceUnit");
        x.f(dVar2, "targetUnit");
        return dVar2.a().convert(j2, dVar.a());
    }

    public static long n(long j2, h.o.d dVar) {
        long j3;
        x.f(dVar, "unit");
        h.o.d dVar2 = h.o.d.f48270a;
        int iOrdinal = dVar.ordinal();
        if (iOrdinal == 2) {
            j3 = 1;
        } else if (iOrdinal == 3) {
            j3 = 1000;
        } else if (iOrdinal == 4) {
            j3 = 60000;
        } else if (iOrdinal == 5) {
            j3 = 3600000;
        } else {
            if (iOrdinal != 6) {
                Objects.toString(dVar);
                throw new IllegalStateException("Wrong unit for millisMultiplier: ".concat(String.valueOf(dVar)));
            }
            j3 = CalendarModelKt.MillisecondsIn24Hours;
        }
        if (j2 == 0) {
            return 0L;
        }
        if (j2 == 1) {
            return j3;
        }
        if (j3 == 1) {
            return n.l(j2, 4611686018427387903L);
        }
        int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j2)) - Long.numberOfLeadingZeros(j3);
        if (iNumberOfLeadingZeros < 63) {
            return j2 * j3;
        }
        if (iNumberOfLeadingZeros > 63) {
            return 4611686018427387903L;
        }
        return n.l(j2 * j3, 4611686018427387903L);
    }

    public static final /* synthetic */ com.google.v.b.a o(bpv bpvVar) {
        List listA = bpvVar.a();
        x.e(listA, "getAnnouncementChunksList(...)");
        return new com.google.v.b.a(listA);
    }

    public static final /* synthetic */ void p(com.google.v.b.a aVar, ep epVar, bpv bpvVar) {
        x.f(aVar, "<this>");
        x.f(epVar, "value");
        bpvVar.b(epVar);
    }

    public static final /* synthetic */ com.waze.sharedui.d.a.b q(brd brdVar) {
        x.f(brdVar, "builder");
        return new com.waze.sharedui.d.a.b(brdVar);
    }

    public static final /* synthetic */ com.waze.sharedui.d.a.b r(bqq bqqVar) {
        x.f(bqqVar, "builder");
        return new com.waze.sharedui.d.a.b(bqqVar);
    }

    public static final /* synthetic */ com.waze.sharedui.d.a.b s(bpy bpyVar) {
        x.f(bpyVar, "builder");
        return new com.waze.sharedui.d.a.b(bpyVar);
    }

    private static final h.c.e t(h.c.e eVar) {
        j context = eVar.getContext();
        return context == k.f48060a ? new f(eVar) : new g(eVar, context);
    }

    private static final long u(long j2) {
        return j2 < 0 ? h.o.a.f48266c : h.o.a.f48265b;
    }

    private static final long v(long j2, long j3, h.o.d dVar) {
        long j4 = j2 - j3;
        if (((~(j4 ^ j3)) & (j4 ^ j2)) >= 0) {
            return h.o.c.j(j4, dVar);
        }
        h.o.d dVar2 = h.o.d.f48272c;
        if (dVar.compareTo(dVar2) >= 0) {
            return h.o.a.v(u(j4));
        }
        long jL = l(1L, dVar2, dVar);
        long j5 = (j2 / jL) - (j3 / jL);
        long j6 = (j2 % jL) - (j3 % jL);
        h.o.c cVar = h.o.a.f48264a;
        return h.o.a.r(h.o.c.j(j5, dVar2), h.o.c.j(j6, dVar));
    }
}
