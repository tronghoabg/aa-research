package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes2.dex */
public final class epg {
    public boolean b;
    private boolean c;
    public boolean a = true;
    private final Queue d = new ArrayDeque();

    public final void a() {
        if (this.c) {
            return;
        }
        try {
            this.c = true;
            while (true) {
                Queue queue = this.d;
                if (queue.isEmpty() || !c()) {
                    break;
                }
                Runnable runnable = (Runnable) queue.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } finally {
            this.c = false;
        }
    }

    public final void b(Runnable runnable) {
        if (!this.d.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables");
        }
        a();
    }

    public final boolean c() {
        return this.b || !this.a;
    }
}
