package kotlinx.coroutines;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class l extends at implements k, h.c.b.a.d, dl {

    /* renamed from: b, reason: collision with root package name */
    private final h.c.e f52053b;

    /* renamed from: c, reason: collision with root package name */
    private final h.c.j f52054c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.a.b f52055d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.a.d f52056e;

    /* renamed from: h, reason: collision with root package name */
    private final kotlinx.a.d f52057h;

    public l(h.c.e eVar, int i2) {
        super(i2);
        this.f52053b = eVar;
        int i3 = ai.f51347a;
        this.f52054c = eVar.getContext();
        this.f52055d = h.e.b.f(536870911);
        this.f52056e = h.e.b.h(b.f51376a);
        this.f52057h = h.e.b.h(null);
    }

    private final ax E() {
        return (ax) this.f52057h.b();
    }

    private final ax F() {
        br brVar = (br) this.f52054c.get(br.f51766a);
        if (brVar == null) {
            return null;
        }
        ax axVarU = aj.U(brVar, true, new o(this));
        this.f52057h.e(null, axVarU);
        return axVarU;
    }

    private final void G() {
        if (J()) {
            return;
        }
        t();
    }

    private final void H(int i2) {
        kotlinx.a.b bVar;
        int iD;
        do {
            bVar = this.f52055d;
            iD = bVar.d();
            int i3 = iD >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                l lVar = this;
                int i4 = ai.f51347a;
                h.c.e eVarQ = lVar.q();
                boolean z = i2 == 4;
                if (z || !(eVarQ instanceof kotlinx.coroutines.e.j) || aj.n(i2) != aj.n(lVar.f51368a)) {
                    aj.m(lVar, eVarQ, z);
                    return;
                }
                kotlinx.coroutines.e.j jVar = (kotlinx.coroutines.e.j) eVarQ;
                ab abVar = jVar.f51900b;
                h.c.j context = jVar.getContext();
                if (kotlinx.coroutines.e.k.d(abVar, context)) {
                    kotlinx.coroutines.e.k.c(abVar, context, lVar);
                    return;
                }
                int i5 = dd.f51833a;
                ba baVarB = dd.b();
                if (baVarB.l()) {
                    baVarB.j(lVar);
                    return;
                }
                baVarB.k(true);
                try {
                    aj.m(lVar, lVar.q(), true);
                    do {
                    } while (baVarB.n());
                    return;
                } catch (Throwable th) {
                    try {
                        lVar.D(th);
                        return;
                    } finally {
                        baVarB.i(true);
                    }
                }
            }
        } while (!bVar.g(iD, (536870911 & iD) + 1073741824));
    }

    private final void I(Object obj) {
        int i2 = ai.f51347a;
        while (true) {
            kotlinx.a.d dVar = this.f52056e;
            Object objB = dVar.b();
            if (objB instanceof b) {
                if (dVar.e(objB, obj)) {
                    return;
                }
            } else if ((objB instanceof j) || (objB instanceof kotlinx.coroutines.e.e)) {
                K(obj, objB);
            } else {
                if (objB instanceof u) {
                    u uVar = (u) objB;
                    if (!uVar.c()) {
                        K(obj, objB);
                    }
                    if (objB instanceof n) {
                        Throwable th = uVar != null ? uVar.f52067a : null;
                        if (obj instanceof j) {
                            r((j) obj, th);
                            return;
                        } else {
                            h.g.b.x.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            N((kotlinx.coroutines.e.e) obj);
                            return;
                        }
                    }
                    return;
                }
                if (objB instanceof t) {
                    t tVar = (t) objB;
                    if (tVar.f52063b != null) {
                        K(obj, objB);
                    }
                    if (obj instanceof kotlinx.coroutines.e.e) {
                        return;
                    }
                    h.g.b.x.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    j jVar = (j) obj;
                    if (tVar.a()) {
                        r(jVar, tVar.f52066e);
                        return;
                    } else if (dVar.e(objB, t.b(tVar, jVar, null, 29))) {
                        return;
                    }
                } else {
                    if (obj instanceof kotlinx.coroutines.e.e) {
                        return;
                    }
                    h.g.b.x.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (dVar.e(objB, new t(objB, (j) obj, null, null, 28))) {
                        return;
                    }
                }
            }
        }
    }

    private final boolean J() {
        if (this.f51368a != 2) {
            return false;
        }
        h.c.e eVar = this.f52053b;
        h.g.b.x.d(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((kotlinx.coroutines.e.j) eVar).e();
    }

    private static final void K(Object obj, Object obj2) {
        throw new IllegalStateException("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2);
    }

    private static final Object L(cn cnVar, Object obj, int i2, h.g.a.q qVar) {
        h.g.a.q qVar2;
        if (obj instanceof u) {
            int i3 = ai.f51347a;
            return obj;
        }
        if (aj.n(i2)) {
            if (qVar != null) {
                qVar2 = qVar;
            } else if (cnVar instanceof j) {
                qVar2 = null;
            }
            return new t(obj, cnVar instanceof j ? (j) cnVar : null, qVar2, null, 16);
        }
        return obj;
    }

    private final kotlinx.coroutines.e.ak M(Object obj, h.g.a.q qVar) {
        kotlinx.a.d dVar;
        Object objB;
        do {
            dVar = this.f52056e;
            objB = dVar.b();
            if (!(objB instanceof cn)) {
                return null;
            }
        } while (!dVar.e(objB, L((cn) objB, obj, this.f51368a, qVar)));
        G();
        return m.f52058a;
    }

    private final void N(kotlinx.coroutines.e.e eVar) {
        int iD = this.f52055d.d() & 536870911;
        if (iD == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            eVar.l(iD, this.f52054c);
        } catch (Throwable th) {
            h.c.j jVar = this.f52054c;
            toString();
            h.f.s.h(jVar, new v("Exception in invokeOnCancellation handler for ".concat(toString()), th));
        }
    }

    @Override // kotlinx.coroutines.at
    public final void A(Throwable th) {
        while (true) {
            kotlinx.a.d dVar = this.f52056e;
            Object objB = dVar.b();
            if (objB instanceof cn) {
                throw new IllegalStateException("Not completed");
            }
            if (objB instanceof u) {
                return;
            }
            if (objB instanceof t) {
                t tVar = (t) objB;
                if (tVar.a()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                if (dVar.e(objB, t.b(tVar, null, th, 15))) {
                    j jVar = tVar.f52063b;
                    if (jVar != null) {
                        r(jVar, th);
                    }
                    h.g.a.q qVar = tVar.f52064c;
                    if (qVar != null) {
                        s(qVar, th, tVar.f52062a);
                        return;
                    }
                    return;
                }
            } else {
                Throwable th2 = th;
                if (dVar.e(objB, new t(objB, null, null, th2, 14))) {
                    return;
                } else {
                    th = th2;
                }
            }
        }
    }

    public final void C() {
        int i2 = ai.f51347a;
        kotlinx.a.d dVar = this.f52056e;
        Object objB = dVar.b();
        if (objB instanceof t) {
            Object obj = ((t) objB).f52065d;
        }
        this.f52055d.f(536870911);
        dVar.d(b.f51376a);
    }

    @Override // kotlinx.coroutines.k
    public final Object a(Throwable th) {
        return M(new u(th), null);
    }

    @Override // kotlinx.coroutines.k
    public final void b(Object obj) {
        int i2 = ai.f51347a;
        H(this.f51368a);
    }

    @Override // kotlinx.coroutines.k
    public final void c(h.g.a.l lVar) {
        bo.m(this, new i(lVar, 0));
    }

    @Override // kotlinx.coroutines.k
    public final void d(Object obj, h.g.a.q qVar) {
        y(obj, this.f51368a, qVar);
    }

    @Override // kotlinx.coroutines.k
    public final void e(ab abVar, Object obj) {
        h.c.e eVar = this.f52053b;
        kotlinx.coroutines.e.j jVar = eVar instanceof kotlinx.coroutines.e.j ? (kotlinx.coroutines.e.j) eVar : null;
        y(obj, (jVar != null ? jVar.f51900b : null) == abVar ? 4 : this.f51368a, null);
    }

    @Override // kotlinx.coroutines.k
    public final boolean f(Throwable th) {
        kotlinx.a.d dVar;
        Object objB;
        do {
            dVar = this.f52056e;
            objB = dVar.b();
            if (!(objB instanceof cn)) {
                return false;
            }
        } while (!dVar.e(objB, new n(this, th, (objB instanceof j) || (objB instanceof kotlinx.coroutines.e.e))));
        cn cnVar = (cn) objB;
        if (cnVar instanceof j) {
            r((j) objB, th);
        } else if (cnVar instanceof kotlinx.coroutines.e.e) {
            N((kotlinx.coroutines.e.e) objB);
        }
        G();
        H(this.f51368a);
        return true;
    }

    @Override // kotlinx.coroutines.k
    public final boolean g() {
        return k() instanceof cn;
    }

    @Override // h.c.b.a.d
    public final h.c.b.a.d getCallerFrame() {
        h.c.e eVar = this.f52053b;
        if (eVar instanceof h.c.b.a.d) {
            return (h.c.b.a.d) eVar;
        }
        return null;
    }

    @Override // h.c.e
    public final h.c.j getContext() {
        return this.f52054c;
    }

    @Override // h.c.b.a.d
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.k
    public final boolean h() {
        return !(k() instanceof cn);
    }

    @Override // kotlinx.coroutines.k
    public final Object i(Object obj, h.g.a.q qVar) {
        return M(obj, qVar);
    }

    public final Object j() {
        kotlinx.a.b bVar;
        int iD;
        br brVar;
        boolean zJ = J();
        do {
            bVar = this.f52055d;
            iD = bVar.d();
            int i2 = iD >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zJ) {
                    x();
                }
                Object objK = k();
                if (objK instanceof u) {
                    Throwable th = ((u) objK).f52067a;
                    l lVar = this;
                    if (ai.c() && (lVar instanceof h.c.b.a.d)) {
                        throw kotlinx.coroutines.e.aj.a(th, lVar);
                    }
                    throw th;
                }
                if (!aj.n(this.f51368a) || (brVar = (br) this.f52054c.get(br.f51766a)) == null || brVar.bZ()) {
                    return l(objK);
                }
                CancellationException cancellationExceptionN = brVar.n();
                A(cancellationExceptionN);
                l lVar2 = this;
                if (ai.c() && (lVar2 instanceof h.c.b.a.d)) {
                    throw kotlinx.coroutines.e.aj.a(cancellationExceptionN, lVar2);
                }
                throw cancellationExceptionN;
            }
        } while (!bVar.g(iD, (536870911 & iD) + 536870912));
        if (E() == null) {
            F();
        }
        if (zJ) {
            x();
        }
        return h.c.a.a.f48038a;
    }

    public final Object k() {
        return this.f52056e.b();
    }

    @Override // kotlinx.coroutines.at
    public final Object l(Object obj) {
        return obj instanceof t ? ((t) obj).f52062a : obj;
    }

    @Override // kotlinx.coroutines.at
    public final Object m() {
        return k();
    }

    protected String n() {
        return "CancellableContinuation";
    }

    public Throwable o(br brVar) {
        return brVar.n();
    }

    @Override // kotlinx.coroutines.at
    public final Throwable p(Object obj) {
        Throwable thP = super.p(obj);
        if (thP == null) {
            return null;
        }
        h.c.e eVar = this.f52053b;
        return (ai.c() && (eVar instanceof h.c.b.a.d)) ? kotlinx.coroutines.e.aj.a(thP, (h.c.b.a.d) eVar) : thP;
    }

    @Override // kotlinx.coroutines.at
    public final h.c.e q() {
        return this.f52053b;
    }

    public final void r(j jVar, Throwable th) {
        try {
            jVar.b(th);
        } catch (Throwable th2) {
            h.c.j jVar2 = this.f52054c;
            toString();
            h.f.s.h(jVar2, new v("Exception in invokeOnCancellation handler for ".concat(toString()), th2));
        }
    }

    @Override // h.c.e
    public final void resumeWith(Object obj) {
        l lVar = this;
        Throwable thC = h.m.c(obj);
        if (thC != null) {
            l lVar2 = lVar;
            if (ai.c() && (lVar2 instanceof h.c.b.a.d)) {
                thC = kotlinx.coroutines.e.aj.a(thC, lVar2);
            }
            obj = new u(thC);
        }
        y(obj, this.f51368a, null);
    }

    public final void s(h.g.a.q qVar, Throwable th, Object obj) {
        try {
            qVar.invoke(th, obj, this.f52054c);
        } catch (Throwable th2) {
            h.c.j jVar = this.f52054c;
            toString();
            h.f.s.h(jVar, new v("Exception in resume onCancellation handler for ".concat(toString()), th2));
        }
    }

    public final void t() {
        ax axVarE = E();
        if (axVarE == null) {
            return;
        }
        axVarE.dispose();
        this.f52057h.d(cm.f51811a);
    }

    public final String toString() {
        String strC = aj.c(this.f52053b);
        Object objK = k();
        String str = objK instanceof cn ? "Active" : objK instanceof n ? "Cancelled" : "Completed";
        return n() + "(" + strC + "){" + str + "}@" + aj.b(this);
    }

    public final void u() {
        ax axVarF = F();
        if (axVarF != null && h()) {
            axVarF.dispose();
            this.f52057h.d(cm.f51811a);
        }
    }

    public final void v(j jVar) {
        I(jVar);
    }

    public final void w(Throwable th) {
        if (J()) {
            h.c.e eVar = this.f52053b;
            h.g.b.x.d(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((kotlinx.coroutines.e.j) eVar).f(th)) {
                return;
            }
        }
        f(th);
        G();
    }

    public final void x() {
        Throwable thA;
        h.c.e eVar = this.f52053b;
        kotlinx.coroutines.e.j jVar = eVar instanceof kotlinx.coroutines.e.j ? (kotlinx.coroutines.e.j) eVar : null;
        if (jVar == null || (thA = jVar.a(this)) == null) {
            return;
        }
        t();
        f(thA);
    }

    public final void y(Object obj, int i2, h.g.a.q qVar) {
        kotlinx.a.d dVar;
        Object objB;
        do {
            dVar = this.f52056e;
            objB = dVar.b();
            if (!(objB instanceof cn)) {
                if (objB instanceof n) {
                    n nVar = (n) objB;
                    if (nVar.a()) {
                        if (qVar != null) {
                            s(qVar, nVar.f52067a, obj);
                            return;
                        }
                        return;
                    }
                }
                Objects.toString(obj);
                throw new IllegalStateException("Already resumed, but proposed with update ".concat(String.valueOf(obj)));
            }
        } while (!dVar.e(objB, L((cn) objB, obj, i2, qVar)));
        G();
        H(i2);
    }

    @Override // kotlinx.coroutines.dl
    public final void z(kotlinx.coroutines.e.e eVar, int i2) {
        kotlinx.a.b bVar;
        int iD;
        do {
            bVar = this.f52055d;
            iD = bVar.d();
            if ((iD & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!bVar.g(iD, ((iD >> 29) << 29) + i2));
        I(eVar);
    }
}
