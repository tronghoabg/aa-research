package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class prv implements Executor {
    public final Executor a;
    public final Deque b = new ArrayDeque();
    public boolean c;

    public prv(Executor executor) {
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Deque deque = this.b;
        synchronized (deque) {
            deque.add(runnable);
            if (this.c) {
                return;
            }
            this.c = true;
            xul xulVarO = ysi.o();
            try {
                this.a.execute(new pru(this, 0));
                xulVarO.close();
            } catch (Throwable th) {
                try {
                    xulVarO.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
