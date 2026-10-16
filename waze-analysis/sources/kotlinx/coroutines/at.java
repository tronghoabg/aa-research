package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class at extends kotlinx.coroutines.f.i {

    /* renamed from: a, reason: collision with root package name */
    public int f51368a;

    public at(int i2) {
        super(0L, false);
        this.f51368a = i2;
    }

    public final void D(Throwable th) {
        h.f.s.h(q().getContext(), new ah("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object m();

    public Throwable p(Object obj) {
        u uVar = obj instanceof u ? (u) obj : null;
        if (uVar != null) {
            return uVar.f52067a;
        }
        return null;
    }

    public abstract h.c.e q();

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = ai.f51347a;
        try {
            h.c.e eVarQ = q();
            h.g.b.x.d(eVarQ, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            kotlinx.coroutines.e.j jVar = (kotlinx.coroutines.e.j) eVarQ;
            h.c.e eVar = jVar.f51901c;
            Object obj = jVar.f51903e;
            h.c.j context = eVar.getContext();
            Object objB = kotlinx.coroutines.e.ap.b(context, obj);
            br brVar = null;
            dj djVarC = objB != kotlinx.coroutines.e.ap.f51872a ? y.c(eVar, context, objB) : null;
            try {
                h.c.j context2 = eVar.getContext();
                Object objM = m();
                Throwable thP = p(objM);
                if (thP == null && aj.n(this.f51368a)) {
                    brVar = (br) context2.get(br.f51766a);
                }
                if (brVar != null && !brVar.bZ()) {
                    CancellationException cancellationExceptionN = brVar.n();
                    A(cancellationExceptionN);
                    if (ai.c() && (eVar instanceof h.c.b.a.d)) {
                        cancellationExceptionN = kotlinx.coroutines.e.aj.a(cancellationExceptionN, (h.c.b.a.d) eVar);
                    }
                    eVar.resumeWith(e.b.c.a(cancellationExceptionN));
                } else if (thP != null) {
                    eVar.resumeWith(e.b.c.a(thP));
                } else {
                    eVar.resumeWith(l(objM));
                }
                if (djVarC != null && !djVarC.U()) {
                    return;
                }
                kotlinx.coroutines.e.ap.c(context, objB);
            } catch (Throwable th) {
                if (djVarC == null || djVarC.U()) {
                    kotlinx.coroutines.e.ap.c(context, objB);
                }
                throw th;
            }
        } catch (ar e2) {
            h.f.s.h(q().getContext(), e2.getCause());
        } catch (Throwable th2) {
            D(th2);
        }
    }

    public void A(Throwable th) {
    }

    public Object l(Object obj) {
        return obj;
    }
}
