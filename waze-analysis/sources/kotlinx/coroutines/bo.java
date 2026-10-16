package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class bo {
    public static final Object a(h.c.j jVar, h.g.a.a aVar, h.c.e eVar) {
        return o(jVar, new bn(aVar, null), eVar);
    }

    public static final am b(af afVar, br brVar, ag agVar, h.g.a.p pVar) {
        return p(afVar, brVar, agVar, pVar);
    }

    public static /* synthetic */ void c(af afVar, br brVar, h.g.a.p pVar) {
        ag agVar = ag.f51342a;
        h.g.b.x.d(brVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext");
        q(afVar, brVar, agVar, pVar);
    }

    public static /* synthetic */ void d(af afVar, cl clVar, h.g.a.p pVar) {
        ag agVar = ag.f51342a;
        h.g.b.x.d(clVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext");
        q(afVar, clVar, agVar, pVar);
    }

    public static final Executor e(ab abVar) {
        Executor executorA;
        bh bhVar = abVar instanceof bh ? (bh) abVar : null;
        return (bhVar == null || (executorA = bhVar.a()) == null) ? new au(abVar) : executorA;
    }

    public static final ab f(Executor executor) {
        ab abVar;
        au auVar = executor instanceof au ? (au) executor : null;
        return (auVar == null || (abVar = auVar.f51369a) == null) ? new bi(executor) : abVar;
    }

    public static final CancellationException g(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final CompletableDeferred h(Object obj) throws Throwable {
        r rVar = new r();
        rVar.P(obj);
        return rVar;
    }

    public static final boolean i(CompletableDeferred completableDeferred, Object obj) {
        Throwable thC = h.m.c(obj);
        return thC == null ? completableDeferred.a(obj) : completableDeferred.b(thC);
    }

    public static final CompletableDeferred j() {
        return new r();
    }

    public static final l k(h.c.e eVar) {
        if (!(eVar instanceof kotlinx.coroutines.e.j)) {
            return new l(eVar, 1);
        }
        l lVarB = ((kotlinx.coroutines.e.j) eVar).b();
        if (lVarB == null) {
            return new l(eVar, 2);
        }
        lVarB.C();
        return lVarB;
    }

    public static final void l(k kVar, ax axVar) {
        m(kVar, new i(axVar, 2));
    }

    public static final void m(k kVar, j jVar) {
        if (!(kVar instanceof l)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((l) kVar).v(jVar);
    }

    public static final Object o(h.c.j jVar, h.g.a.p pVar, h.c.e eVar) throws Throwable {
        Object objI;
        h.c.j context = eVar.getContext();
        h.c.j jVarA = y.a(context, jVar);
        aj.Y(jVarA);
        if (jVarA == context) {
            kotlinx.coroutines.e.ah ahVar = new kotlinx.coroutines.e.ah(jVarA, eVar);
            objI = kotlinx.coroutines.g.d.b(ahVar, ahVar, pVar);
        } else {
            h.c.f fVar = h.c.g.f48059a;
            if (h.g.b.x.n(jVarA.get(fVar), context.get(fVar))) {
                dj djVar = new dj(jVarA, eVar);
                h.c.j context2 = djVar.getContext();
                Object objB = kotlinx.coroutines.e.ap.b(context2, null);
                try {
                    Object objB2 = kotlinx.coroutines.g.d.b(djVar, djVar, pVar);
                    kotlinx.coroutines.e.ap.c(context2, objB);
                    objI = objB2;
                } catch (Throwable th) {
                    kotlinx.coroutines.e.ap.c(context2, objB);
                    throw th;
                }
            } else {
                as asVar = new as(jVarA, eVar);
                kotlinx.coroutines.e.al.i(pVar, asVar, asVar);
                objI = asVar.i();
            }
        }
        if (objI == h.c.a.a.f48038a) {
            h.d.b.c(eVar);
        }
        return objI;
    }

    public static final am p(af afVar, h.c.j jVar, ag agVar, h.g.a.p pVar) {
        h.c.j jVarB = y.b(afVar, jVar);
        an chVar = agVar.a() ? new ch(jVarB, pVar) : new an(jVarB, true);
        chVar.bS(agVar, chVar, pVar);
        return chVar;
    }

    public static final br q(af afVar, h.c.j jVar, ag agVar, h.g.a.p pVar) {
        h.c.j jVarB = y.b(afVar, jVar);
        cz ciVar = agVar.a() ? new ci(jVarB, pVar) : new cz(jVarB, true);
        ciVar.bS(agVar, ciVar, pVar);
        return ciVar;
    }
}
