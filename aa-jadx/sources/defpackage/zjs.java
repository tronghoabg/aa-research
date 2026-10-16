package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zjs implements java.util.concurrent.Executor {
    private volatile java.util.concurrent.Executor a;

    public zjs(java.util.concurrent.Executor executor) {
        this.a = executor;
    }

    public final void a() {
        this.a = defpackage.zgt.INSTANCE;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.a.execute(runnable);
    }
}
