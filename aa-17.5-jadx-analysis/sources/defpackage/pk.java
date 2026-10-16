package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class pk extends ca {
    public static final Executor c = new pj(0);
    private static volatile pk e;
    public final ca d;
    private final ca f;

    private pk() {
        super(null);
        pl plVar = new pl();
        this.f = plVar;
        this.d = plVar;
    }

    public static pk bn() {
        if (e == null) {
            synchronized (pk.class) {
                if (e == null) {
                    e = new pk();
                }
            }
        }
        return e;
    }

    public final boolean bo() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
