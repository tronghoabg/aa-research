package defpackage;

/* JADX INFO: loaded from: classes3.dex */
enum adkm implements java.util.concurrent.Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return "Context.DirectExecutor";
    }
}
