package defpackage;

import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public final class adxy {
    public final Object a;
    Future b;
    public boolean c;

    public adxy(Object obj) {
        this.a = obj;
    }

    public final Future a() {
        this.c = true;
        return this.b;
    }

    final void b(Future future) {
        boolean z;
        synchronized (this.a) {
            z = this.c;
            if (!z) {
                this.b = future;
            }
        }
        if (z) {
            future.cancel(false);
        }
    }
}
