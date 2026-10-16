package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eq implements java.util.concurrent.Executor {
    final java.util.concurrent.Executor b;
    java.lang.Runnable c;
    private final java.lang.Object d = new java.lang.Object();
    final java.util.Queue a = new java.util.ArrayDeque();

    public eq(java.util.concurrent.Executor executor) {
        this.b = executor;
    }

    public final void a() {
        synchronized (this.d) {
            java.lang.Runnable runnable = (java.lang.Runnable) this.a.poll();
            this.c = runnable;
            if (runnable != null) {
                this.b.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        synchronized (this.d) {
            this.a.add(new defpackage.af((java.lang.Object) this, (java.lang.Object) runnable, 6, (byte[]) null));
            if (this.c == null) {
                a();
            }
        }
    }
}
