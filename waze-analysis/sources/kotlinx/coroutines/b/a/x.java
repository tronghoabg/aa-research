package kotlinx.coroutines.b.a;

import h.g.b.au;
import kotlinx.coroutines.e.ap;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x {
    public static final Object a(h.g.a.p pVar, h.c.e eVar) {
        v vVar = new v(eVar.getContext(), eVar);
        Object objB = kotlinx.coroutines.g.d.b(vVar, vVar, pVar);
        if (objB == h.c.a.a.f48038a) {
            h.d.b.c(eVar);
        }
        return objB;
    }

    public static final kotlinx.coroutines.b.k b(h.g.a.q qVar) {
        return new w(qVar);
    }

    public static final Object c(kotlinx.coroutines.b.l lVar, kotlinx.coroutines.b.k[] kVarArr, h.g.a.a aVar, h.g.a.q qVar, h.c.e eVar) {
        Object objA = a(new t(kVarArr, aVar, qVar, lVar, null), eVar);
        return objA == h.c.a.a.f48038a ? objA : h.ab.f48028a;
    }

    public static final Object d(h.c.j jVar, Object obj, Object obj2, h.g.a.p pVar, h.c.e eVar) {
        Object objInvoke;
        Object objB = ap.b(jVar, obj2);
        try {
            ag agVar = new ag(eVar, jVar);
            if (pVar instanceof h.c.b.a.a) {
                au.h(pVar, 2);
                objInvoke = pVar.invoke(obj, agVar);
            } else {
                objInvoke = h.c.a.h.a(pVar, obj, agVar);
            }
            ap.c(jVar, objB);
            if (objInvoke == h.c.a.a.f48038a) {
                h.d.b.c(eVar);
            }
            return objInvoke;
        } catch (Throwable th) {
            ap.c(jVar, objB);
            throw th;
        }
    }

    public static /* synthetic */ int e(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }
}
