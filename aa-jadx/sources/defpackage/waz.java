package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class waz implements java.util.concurrent.ThreadFactory {
    private final /* synthetic */ int a;

    public /* synthetic */ waz(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        if (this.a != 0) {
            return new defpackage.dwt(runnable);
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.wba.a;
        return new java.lang.Thread(runnable, "ProcessStablePhenotypeFlag");
    }
}
