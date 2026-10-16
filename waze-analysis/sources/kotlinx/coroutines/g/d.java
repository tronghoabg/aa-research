package kotlinx.coroutines.g;

import h.g.a.p;
import h.g.b.au;
import h.g.b.x;
import java.lang.annotation.Annotation;
import kotlinx.b.a.q;
import kotlinx.coroutines.ai;
import kotlinx.coroutines.ar;
import kotlinx.coroutines.cg;
import kotlinx.coroutines.df;
import kotlinx.coroutines.e.ah;
import kotlinx.coroutines.e.aj;
import kotlinx.coroutines.u;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class d {
    public static final void a(k kVar, long j2, h.g.a.l lVar) {
        c cVar = new c(j2);
        b bVar = b.f51978a;
        au.h(bVar, 3);
        kVar.n(new org.a.d.a(cVar, bVar), lVar);
    }

    public static final Object b(ah ahVar, Object obj, p pVar) {
        return f(ahVar, true, obj, pVar);
    }

    public static final Object c(ah ahVar, Object obj, p pVar) {
        return f(ahVar, false, obj, pVar);
    }

    public static final kotlinx.b.d.a.a d(kotlinx.b.d.b bVar, String str) {
        x.f(bVar, "json");
        x.f(str, "source");
        return new kotlinx.b.d.a.a(str);
    }

    public static final String e(q qVar, kotlinx.b.d.b bVar) {
        x.f(qVar, "<this>");
        x.f(bVar, "json");
        for (Annotation annotation : qVar.e()) {
            if (annotation instanceof kotlinx.b.d.g) {
                return ((kotlinx.b.d.g) annotation).a();
            }
        }
        return bVar.a().a();
    }

    private static final Object f(ah ahVar, boolean z, Object obj, p pVar) throws Throwable {
        Object uVar;
        Object objC;
        try {
            if (pVar instanceof h.c.b.a.a) {
                au.h(pVar, 2);
                uVar = pVar.invoke(obj, ahVar);
            } else {
                uVar = h.c.a.h.a(pVar, obj, ahVar);
            }
        } catch (ar e2) {
            ahVar.P(new u(e2.getCause()));
            h.c.e eVar = ahVar.f51865c;
            Throwable cause = e2.getCause();
            if (ai.c() && (eVar instanceof h.c.b.a.d)) {
                throw aj.a(cause, (h.c.b.a.d) eVar);
            }
            throw cause;
        } catch (Throwable th) {
            uVar = new u(th);
        }
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (uVar == aVar || (objC = ahVar.C(uVar)) == cg.f51801a) {
            return aVar;
        }
        ahVar.bT();
        if (!(objC instanceof u)) {
            return cg.b(objC);
        }
        if (!z) {
            Throwable th2 = ((u) objC).f52067a;
            if ((th2 instanceof df) && ((df) th2).f51838a == ahVar) {
                if (!(uVar instanceof u)) {
                    return uVar;
                }
                Throwable th3 = ((u) uVar).f52067a;
                h.c.e eVar2 = ahVar.f51865c;
                if (ai.c() && (eVar2 instanceof h.c.b.a.d)) {
                    throw aj.a(th3, (h.c.b.a.d) eVar2);
                }
                throw th3;
            }
        }
        Throwable th4 = ((u) objC).f52067a;
        h.c.e eVar3 = ahVar.f51865c;
        if (ai.c() && (eVar3 instanceof h.c.b.a.d)) {
            throw aj.a(th4, (h.c.b.a.d) eVar3);
        }
        throw th4;
    }
}
