package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public /* synthetic */ class ezd {
    public static Object b(ezc ezcVar, afec afecVar, afck afckVar) {
        if (ezcVar.o() && ezcVar.q() && ezcVar.p()) {
            return afecVar.invoke(afckVar);
        }
        if (afckVar.hH().get(eze.a) == null) {
            return afecVar.invoke(afckVar);
        }
        epm epmVar = new epm(afecVar, (afck) null, 3);
        ezi eziVar = (ezi) afckVar.hH().get(ezi.a);
        afcl afclVar = eziVar != null ? eziVar.b : null;
        return afclVar != null ? ahnc.a(afclVar, epmVar, afckVar) : e(ezcVar, epmVar, afckVar);
    }

    public static void c(faj fajVar, fca fcaVar) {
        fajVar.a(fcaVar.a);
    }

    public static Object d(afeg afegVar) {
        Thread.interrupted();
        return aiik.a(afcp.a, new fan(afegVar, (afck) null, 1));
    }

    private static Object e(ezc ezcVar, afeg afegVar, afck afckVar) {
        aitg aitgVar = new aitg(affa.s(afckVar), 1);
        aitgVar.z();
        try {
            Executor executor = ezcVar.c;
            if (executor == null) {
                affa.d("internalTransactionExecutor");
                executor = null;
            }
            executor.execute(new ae((aitf) aitgVar, ezcVar, afegVar, 7));
        } catch (RejectedExecutionException e) {
            aitgVar.g(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        Object objK = aitgVar.k();
        if (objK == afcr.a) {
            afckVar.getClass();
        }
        return objK;
    }

    public void a(fbl fblVar) {
    }
}
