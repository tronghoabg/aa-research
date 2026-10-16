package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class adnx extends adjp {
    private static final Logger b = Logger.getLogger(adnx.class.getName());
    static final ThreadLocal a = new ThreadLocal();

    @Override // defpackage.adjp
    public final adjq a() {
        adjq adjqVar = (adjq) a.get();
        return adjqVar == null ? adjq.d : adjqVar;
    }

    @Override // defpackage.adjp
    public final adjq b(adjq adjqVar) {
        adjq adjqVarA = a();
        a.set(adjqVar);
        return adjqVarA;
    }

    @Override // defpackage.adjp
    public final void c(adjq adjqVar, adjq adjqVar2) {
        if (a() != adjqVar) {
            b.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (adjqVar2 != adjq.d) {
            a.set(adjqVar2);
        } else {
            a.set(null);
        }
    }
}
