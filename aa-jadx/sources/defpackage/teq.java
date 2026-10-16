package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class teq extends defpackage.tep implements defpackage.zhs {
    private final defpackage.zhs a;

    public teq(defpackage.zhs zhsVar, java.lang.Thread thread) {
        super(zhsVar, thread);
        this.a = zhsVar;
    }

    @Override // defpackage.zhs
    public final void c(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        executor.getClass();
        this.a.c(runnable, executor);
    }
}
