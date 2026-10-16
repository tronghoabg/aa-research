package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public final class zft {
    private static final zgo d = new zgo(zft.class);
    public boolean a;
    public final afep b = new afep();
    public gjt c;

    public static void a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            d.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ExecutionList", "executeListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + executor.toString(), (Throwable) e);
        }
    }
}
