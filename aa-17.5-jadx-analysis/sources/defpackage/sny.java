package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class sny implements Executor {
    public static Context a;
    private static volatile sny b;

    private sny() {
    }

    public static sny a(Context context) {
        sny snyVar;
        sny snyVar2 = b;
        if (snyVar2 != null) {
            return snyVar2;
        }
        synchronized (sny.class) {
            snyVar = b;
            if (snyVar == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    throw new NullPointerException("null reference");
                }
                a = applicationContext;
                snyVar = new sny();
                b = snyVar;
            }
        }
        return snyVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        snx.a.post(runnable);
    }
}
