package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ifx implements java.util.concurrent.Executor {
    private final /* synthetic */ int a;

    public ifx(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        if (this.a != 0) {
            defpackage.igg.g(runnable);
        } else {
            runnable.run();
        }
    }
}
