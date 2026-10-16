package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class ezj implements Executor {
    private final Executor a;
    private Runnable c;
    private final ArrayDeque b = new ArrayDeque();
    private final Object d = new Object();

    public ezj(Executor executor) {
        this.a = executor;
    }

    public final void a() {
        synchronized (this.d) {
            Object objPoll = this.b.poll();
            Runnable runnable = (Runnable) objPoll;
            this.c = runnable;
            if (objPoll != null) {
                this.a.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.d) {
            this.b.offer(new esx(runnable, this, 6, (char[]) null));
            if (this.c == null) {
                a();
            }
        }
    }
}
