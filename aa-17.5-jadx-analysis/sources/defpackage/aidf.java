package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public final class aidf extends aidg {
    private final Runnable checkCancelled;
    private final afec<InterruptedException, afak> interruptedExceptionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public aidf(Lock lock, Runnable runnable, afec<? super InterruptedException, afak> afecVar) {
        super(lock);
        lock.getClass();
        runnable.getClass();
        afecVar.getClass();
        this.checkCancelled = runnable;
        this.interruptedExceptionHandler = afecVar;
    }

    @Override // defpackage.aidg, defpackage.aief
    public void lock() {
        while (!getLock().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.checkCancelled.run();
            } catch (InterruptedException e) {
                this.interruptedExceptionHandler.invoke(e);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aidf(Runnable runnable, afec<? super InterruptedException, afak> afecVar) {
        this(new ReentrantLock(), runnable, afecVar);
        runnable.getClass();
        afecVar.getClass();
    }
}
