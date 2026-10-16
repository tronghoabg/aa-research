package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pm implements java.util.concurrent.Executor {
    private final /* synthetic */ int a;

    public pm(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        if (this.a != 0) {
            new java.lang.Thread(runnable).start();
        } else {
            ((defpackage.po) defpackage.pn.bn().d).d.execute(runnable);
        }
    }
}
