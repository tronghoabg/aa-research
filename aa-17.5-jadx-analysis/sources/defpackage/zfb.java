package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class zfb extends zga implements Runnable {
    public static final /* synthetic */ int c = 0;
    zgp a;
    Object b;

    public zfb(zgp zgpVar, Object obj) {
        zgpVar.getClass();
        this.a = zgpVar;
        obj.getClass();
        this.b = obj;
    }

    public static zgp f(zgp zgpVar, xwx xwxVar, Executor executor) {
        zfa zfaVar = new zfa(zgpVar, xwxVar);
        zgpVar.c(zfaVar, yrm.aK(executor, zfaVar));
        return zfaVar;
    }

    public static zgp g(zgp zgpVar, zfk zfkVar, Executor executor) {
        zez zezVar = new zez(zgpVar, zfkVar);
        zgpVar.c(zezVar, yrm.aK(executor, zezVar));
        return zezVar;
    }

    @Override // defpackage.zeu
    protected final void b() {
        m(this.a);
        this.a = null;
        this.b = null;
    }

    public abstract Object d(Object obj, Object obj2) throws Exception;

    public abstract void e(Object obj);

    @Override // defpackage.zeu
    protected final String fO() {
        zgp zgpVar = this.a;
        Object obj = this.b;
        String strFO = super.fO();
        String strBW = zgpVar != null ? a.bW(zgpVar, "inputFuture=[", "], ") : "";
        if (obj == null) {
            if (strFO != null) {
                return strBW.concat(strFO);
            }
            return null;
        }
        return strBW + "function=[" + obj.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        zgp zgpVar = this.a;
        Object obj = this.b;
        if ((isCancelled() | (zgpVar == null)) || (obj == null)) {
            return;
        }
        this.a = null;
        if (zgpVar.isCancelled()) {
            r(zgpVar);
            return;
        }
        try {
            woy.ad(zgpVar.isDone(), "Future was expected to be done: %s", zgpVar);
            try {
                Object objD = d(obj, a.L(zgpVar));
                this.b = null;
                e(objD);
            } catch (Throwable th) {
                try {
                    yrm.aG(th);
                    p(th);
                } finally {
                    this.b = null;
                }
            }
        } catch (Error e) {
            p(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            p(e2.getCause());
        } catch (Exception e3) {
            p(e3);
        }
    }
}
