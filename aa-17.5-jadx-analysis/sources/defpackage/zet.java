package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class zet extends zga implements Runnable {
    public static final /* synthetic */ int d = 0;
    zgp a;
    Class b;
    Object c;

    public zet(zgp zgpVar, Class cls, Object obj) {
        zgpVar.getClass();
        this.a = zgpVar;
        this.b = cls;
        this.c = obj;
    }

    public static zgp f(zgp zgpVar, Class cls, xwx xwxVar, Executor executor) {
        zes zesVar = new zes(zgpVar, cls, xwxVar);
        zgpVar.c(zesVar, yrm.aK(executor, zesVar));
        return zesVar;
    }

    public static zgp g(zgp zgpVar, Class cls, zfk zfkVar, Executor executor) {
        zer zerVar = new zer(zgpVar, cls, zfkVar);
        zgpVar.c(zerVar, yrm.aK(executor, zerVar));
        return zerVar;
    }

    @Override // defpackage.zeu
    protected final void b() {
        m(this.a);
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public abstract Object d(Object obj, Throwable th) throws Exception;

    public abstract void e(Object obj);

    @Override // defpackage.zeu
    protected final String fO() {
        zgp zgpVar = this.a;
        Class cls = this.b;
        Object obj = this.c;
        String strFO = super.fO();
        String strBW = zgpVar != null ? a.bW(zgpVar, "inputFuture=[", "], ") : "";
        if (cls == null || obj == null) {
            if (strFO != null) {
                return strBW.concat(strFO);
            }
            return null;
        }
        return strBW + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object objL;
        zgp zgpVar = this.a;
        Class cls = this.b;
        Object obj = this.c;
        if (((obj == null) || ((zgpVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.a = null;
        try {
            th = zgpVar instanceof zhm ? ((zhm) zgpVar).j() : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + String.valueOf(zgpVar.getClass()) + " threw " + String.valueOf(e.getClass()) + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            woy.ad(zgpVar.isDone(), "Future was expected to be done: %s", zgpVar);
            objL = a.L(zgpVar);
        } else {
            objL = null;
        }
        if (th == null) {
            o(objL);
            return;
        }
        if (!cls.isInstance(th)) {
            r(zgpVar);
            return;
        }
        try {
            Object objD = d(obj, th);
            this.b = null;
            this.c = null;
            e(objD);
        } catch (Throwable th2) {
            try {
                yrm.aG(th2);
                p(th2);
            } finally {
                this.b = null;
                this.c = null;
            }
        }
    }
}
