package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class epm {
    public boolean b;
    private boolean c;
    public boolean a = true;
    private final java.util.Queue d = new java.util.ArrayDeque();

    public final void a() {
        if (this.c) {
            return;
        }
        try {
            this.c = true;
            while (true) {
                java.util.Queue queue = this.d;
                if (queue.isEmpty() || !c()) {
                    break;
                }
                java.lang.Runnable runnable = (java.lang.Runnable) queue.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
            this.c = false;
        } catch (java.lang.Throwable th) {
            this.c = false;
            throw th;
        }
    }

    public final void b(java.lang.Runnable runnable) {
        if (!this.d.offer(runnable)) {
            throw new java.lang.IllegalStateException("cannot enqueue any more runnables");
        }
        a();
    }

    public final boolean c() {
        return this.b || !this.a;
    }
}
