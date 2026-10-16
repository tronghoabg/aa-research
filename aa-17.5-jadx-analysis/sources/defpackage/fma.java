package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public final class fma {
    public static final String a = fjo.b("WorkerWrapper");

    public static final Object a(zgp zgpVar, fjn fjnVar, afck afckVar) throws Throwable {
        try {
            if (zgpVar.isDone()) {
                return b(zgpVar);
            }
            aitg aitgVar = new aitg(affa.s(afckVar), 1);
            aitgVar.z();
            zgpVar.c(new fku(zgpVar, aitgVar, 0), fjf.a);
            aitgVar.d(new dah(fjnVar, zgpVar, 7, null));
            return aitgVar.k();
        } catch (ExecutionException e) {
            throw c(e);
        }
    }

    public static final Object b(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final Throwable c(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }
}
