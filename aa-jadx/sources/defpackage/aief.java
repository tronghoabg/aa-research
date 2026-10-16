package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aief extends defpackage.aieg {
    private final java.lang.Runnable checkCancelled;
    private final defpackage.affc<java.lang.InterruptedException, defpackage.afbk> interruptedExceptionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public aief(java.util.concurrent.locks.Lock lock, java.lang.Runnable runnable, defpackage.affc<? super java.lang.InterruptedException, defpackage.afbk> affcVar) {
        super(lock);
        lock.getClass();
        runnable.getClass();
        affcVar.getClass();
        this.checkCancelled = runnable;
        this.interruptedExceptionHandler = affcVar;
    }

    @Override // defpackage.aieg, defpackage.aiff
    public void lock() {
        while (!getLock().tryLock(50L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
            try {
                this.checkCancelled.run();
            } catch (java.lang.InterruptedException e) {
                this.interruptedExceptionHandler.invoke(e);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aief(java.lang.Runnable runnable, defpackage.affc<? super java.lang.InterruptedException, defpackage.afbk> affcVar) {
        this(new java.util.concurrent.locks.ReentrantLock(), runnable, affcVar);
        runnable.getClass();
        affcVar.getClass();
    }
}
