package kotlinx.coroutines.e;

import java.util.Objects;
import kotlinx.coroutines.ba;
import kotlinx.coroutines.dd;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class j extends kotlinx.coroutines.at implements h.c.b.a.d, h.c.e {

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.ab f51900b;

    /* renamed from: c, reason: collision with root package name */
    public final h.c.e f51901c;

    /* renamed from: d, reason: collision with root package name */
    public Object f51902d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f51903e;

    /* renamed from: h, reason: collision with root package name */
    private final kotlinx.a.d f51904h;

    public j(kotlinx.coroutines.ab abVar, h.c.e eVar) {
        super(-1);
        this.f51900b = abVar;
        this.f51901c = eVar;
        this.f51902d = k.f51906b;
        this.f51903e = ap.a(getContext());
        this.f51904h = h.e.b.h(null);
    }

    public final Throwable a(kotlinx.coroutines.k kVar) {
        kotlinx.a.d dVar;
        ak akVar;
        do {
            dVar = this.f51904h;
            Object objB = dVar.b();
            akVar = k.f51905a;
            if (objB != akVar) {
                if (!(objB instanceof Throwable)) {
                    Objects.toString(objB);
                    throw new IllegalStateException("Inconsistent state ".concat(String.valueOf(objB)));
                }
                if (dVar.e(objB, null)) {
                    return (Throwable) objB;
                }
                throw new IllegalArgumentException("Failed requirement.");
            }
        } while (!dVar.e(akVar, kVar));
        return null;
    }

    public final kotlinx.coroutines.l b() {
        while (true) {
            kotlinx.a.d dVar = this.f51904h;
            Object objB = dVar.b();
            if (objB == null) {
                dVar.d(k.f51905a);
                return null;
            }
            if (objB instanceof kotlinx.coroutines.l) {
                if (dVar.e(objB, k.f51905a)) {
                    return (kotlinx.coroutines.l) objB;
                }
            } else if (objB != k.f51905a && !(objB instanceof Throwable)) {
                Objects.toString(objB);
                throw new IllegalStateException("Inconsistent state ".concat(objB.toString()));
            }
        }
    }

    public final void c(h.c.j jVar, Object obj) {
        this.f51902d = obj;
        this.f51368a = 1;
        this.f51900b.dispatchYield(jVar, this);
    }

    public final void d() {
        kotlinx.a.d dVar;
        do {
            dVar = this.f51904h;
        } while (dVar.b() == k.f51905a);
        Object objB = dVar.b();
        kotlinx.coroutines.l lVar = objB instanceof kotlinx.coroutines.l ? (kotlinx.coroutines.l) objB : null;
        if (lVar != null) {
            lVar.t();
        }
    }

    public final boolean e() {
        return this.f51904h.b() != null;
    }

    public final boolean f(Throwable th) {
        while (true) {
            kotlinx.a.d dVar = this.f51904h;
            Object objB = dVar.b();
            ak akVar = k.f51905a;
            if (h.g.b.x.n(objB, akVar)) {
                if (dVar.e(akVar, th)) {
                    return true;
                }
            } else {
                if (objB instanceof Throwable) {
                    return true;
                }
                if (dVar.e(objB, null)) {
                    return false;
                }
            }
        }
    }

    @Override // h.c.b.a.d
    public final h.c.b.a.d getCallerFrame() {
        h.c.e eVar = this.f51901c;
        if (eVar instanceof h.c.b.a.d) {
            return (h.c.b.a.d) eVar;
        }
        return null;
    }

    @Override // h.c.e
    public final h.c.j getContext() {
        return this.f51901c.getContext();
    }

    @Override // h.c.b.a.d
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.at
    public final Object m() {
        Object obj = this.f51902d;
        int i2 = kotlinx.coroutines.ai.f51347a;
        this.f51902d = k.f51906b;
        return obj;
    }

    @Override // kotlinx.coroutines.at
    public final h.c.e q() {
        return this;
    }

    @Override // h.c.e
    public final void resumeWith(Object obj) {
        Object objJ = h.f.s.j(obj);
        kotlinx.coroutines.ab abVar = this.f51900b;
        if (k.d(abVar, getContext())) {
            this.f51902d = objJ;
            this.f51368a = 0;
            k.c(abVar, getContext(), this);
            return;
        }
        int i2 = kotlinx.coroutines.ai.f51347a;
        int i3 = dd.f51833a;
        ba baVarB = dd.b();
        if (baVarB.l()) {
            this.f51902d = objJ;
            this.f51368a = 0;
            baVarB.j(this);
            return;
        }
        j jVar = this;
        baVarB.k(true);
        try {
            h.c.j context = getContext();
            Object objB = ap.b(context, this.f51903e);
            try {
                this.f51901c.resumeWith(obj);
                while (baVarB.n()) {
                }
            } finally {
                ap.c(context, objB);
            }
        } catch (Throwable th) {
            try {
                jVar.D(th);
            } finally {
                baVarB.i(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f51900b + ", " + kotlinx.coroutines.aj.c(this.f51901c) + "]";
    }
}
