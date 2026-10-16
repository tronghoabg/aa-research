package defpackage;

import android.os.Looper;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ely {
    private static final ThreadLocal i = new ThreadLocal();
    public elx f;
    public final rz g;
    public final aat a = new aat(0);
    public final ArrayList b = new ArrayList();
    public final ajmd h = new ajmd(this, null);
    public final Runnable c = new elt(this, 2);
    public boolean d = false;
    public float e = 1.0f;

    public ely(rz rzVar) {
        this.g = rzVar;
    }

    static ely a() {
        ThreadLocal threadLocal = i;
        if (threadLocal.get() == null) {
            threadLocal.set(new ely(new rz((short[]) null)));
        }
        return (ely) threadLocal.get();
    }

    final boolean b() {
        return Thread.currentThread() == ((Looper) this.g.b).getThread();
    }
}
