package e.a;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class em extends ab {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f47431b = Logger.getLogger(em.class.getName());

    /* renamed from: a, reason: collision with root package name */
    static final ThreadLocal f47430a = new ThreadLocal();

    em() {
    }

    @Override // e.a.ab
    public final ac a() {
        ac acVar = (ac) f47430a.get();
        return acVar == null ? ac.f46235c : acVar;
    }

    @Override // e.a.ab
    public final ac b(ac acVar) {
        ac acVarA = a();
        f47430a.set(acVar);
        return acVarA;
    }

    @Override // e.a.ab
    public final void c(ac acVar, ac acVar2) {
        if (a() != acVar) {
            f47431b.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (acVar2 != ac.f46235c) {
            f47430a.set(acVar2);
        } else {
            f47430a.set(null);
        }
    }
}
