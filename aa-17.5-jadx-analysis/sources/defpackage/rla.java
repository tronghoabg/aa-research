package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class rla {
    private static zgp a = wub.Y(false);
    public static rla i;

    public static rla m() {
        rla rlaVar = i;
        rlaVar.getClass();
        return rlaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean n() {
        try {
            return ((Boolean) a.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            return false;
        }
    }

    protected static synchronized zgp o(Context context, Executor executor) {
        zhk zhkVar;
        zhkVar = new zhk(new iml(context, 4));
        executor.execute(zhkVar);
        a = zhkVar;
        return zhkVar;
    }

    public abstract Object b(par parVar, rkz rkzVar) throws Throwable;

    public abstract Object c(par parVar, rkz rkzVar, Handler handler, rky rkyVar) throws Throwable;

    public abstract void d(pba pbaVar);

    public abstract void e(pbd pbdVar, rkw rkwVar);

    public abstract void f(pbd pbdVar, rkx rkxVar);

    public abstract void h(par parVar);

    public abstract void i();

    public abstract void k(yxi yxiVar);
}
