package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class esy {
    private static Handler a;
    public volatile int f = 1;
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicBoolean e = new AtomicBoolean();
    public final FutureTask c = new esw(this, new flt(this, 1));

    public abstract Object a();

    protected void b(Object obj) {
        throw null;
    }

    protected void c(Object obj) {
        throw null;
    }

    public final void d(Object obj) {
        Handler handler;
        synchronized (esy.class) {
            handler = a;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                a = handler;
            }
        }
        handler.post(new esx(this, obj, 0));
    }

    final void e(Object obj) {
        if (this.e.get()) {
            return;
        }
        d(obj);
    }

    public final boolean f() {
        return this.d.get();
    }
}
