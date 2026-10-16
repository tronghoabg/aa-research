package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class psk {
    public final psb a;
    public final Executor b;
    protected final Object c;
    public final Class d;
    public boolean e = false;

    public psk(Class cls, Object obj, psb psbVar, Executor executor) {
        obj.getClass();
        psbVar = psbVar == psb.DANGEROUS_PUBLISHER_THREAD ? psb.CURRENT : psbVar;
        this.a = psbVar;
        this.b = executor;
        this.c = obj;
        this.d = cls;
        if (psbVar == psb.CURRENT) {
            woy.Z(executor == null);
        } else {
            executor.getClass();
        }
    }

    public static Executor b(psb psbVar, Map map) {
        if (psbVar == psb.CURRENT || psbVar == psb.DANGEROUS_PUBLISHER_THREAD) {
            return null;
        }
        Executor executor = (Executor) map.get(psbVar);
        psbVar.name();
        executor.getClass();
        return executor;
    }

    protected void a(psm psmVar) {
        throw null;
    }

    public final synchronized void c(psm psmVar) {
        try {
            String[] strArr = vaq.a;
            if (fdi.b()) {
                vky.a(vky.c(null, this.c.getClass()), vky.c("-", psmVar.getClass()));
                fdi.b();
            }
            a(psmVar);
        } catch (IllegalArgumentException e) {
            throw new Error("Method rejected target/argument: " + this.c.toString() + ", " + psmVar.toString(), e);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof psk) && this.c == ((psk) obj).c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }
}
