package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zie implements java.util.concurrent.Executor {
    public static final defpackage.zhr a = new defpackage.zhr(defpackage.zie.class);
    private final java.util.concurrent.Executor e;
    public final java.util.Deque b = new java.util.ArrayDeque();
    public int d = 1;
    public long c = 0;
    private final defpackage.zid f = new defpackage.zid(this);

    public zie(java.util.concurrent.Executor executor) {
        executor.getClass();
        this.e = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        runnable.getClass();
        java.util.Deque deque = this.b;
        synchronized (deque) {
            int i = this.d;
            if (i != 4 && i != 3) {
                long j = this.c;
                defpackage.zic zicVar = new defpackage.zic(runnable);
                deque.add(zicVar);
                this.d = 2;
                try {
                    this.e.execute(this.f);
                    if (this.d != 2) {
                        return;
                    }
                    synchronized (this.b) {
                        if (this.c == j && this.d == 2) {
                            this.d = 3;
                        }
                    }
                    return;
                } catch (java.lang.Throwable th) {
                    java.util.Deque deque2 = this.b;
                    synchronized (deque2) {
                        int i2 = this.d;
                        boolean z = false;
                        if ((i2 == 1 || i2 == 2) && deque2.removeLastOccurrence(zicVar)) {
                            z = true;
                        }
                        if (!(th instanceof java.util.concurrent.RejectedExecutionException) || z) {
                            throw th;
                        }
                        return;
                    }
                }
            }
            deque.add(runnable);
        }
    }

    public final java.lang.String toString() {
        java.util.concurrent.Executor executor = this.e;
        return "SequentialExecutor@" + java.lang.System.identityHashCode(this) + "{" + java.lang.String.valueOf(executor) + "}";
    }
}
