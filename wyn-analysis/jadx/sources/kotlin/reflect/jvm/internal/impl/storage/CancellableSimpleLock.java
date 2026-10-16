package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class CancellableSimpleLock extends DefaultSimpleLock {

    @NotNull
    private final Runnable checkCancelled;

    @NotNull
    private final l interruptedExceptionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancellableSimpleLock(@NotNull Lock lock, @NotNull Runnable checkCancelled, @NotNull l interruptedExceptionHandler) {
        super(lock);
        AbstractC3340k.e(lock, "lock");
        AbstractC3340k.e(checkCancelled, "checkCancelled");
        AbstractC3340k.e(interruptedExceptionHandler, "interruptedExceptionHandler");
        this.checkCancelled = checkCancelled;
        this.interruptedExceptionHandler = interruptedExceptionHandler;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.DefaultSimpleLock, kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
        while (!getLock().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.checkCancelled.run();
            } catch (InterruptedException e7) {
                this.interruptedExceptionHandler.invoke(e7);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CancellableSimpleLock(@NotNull Runnable checkCancelled, @NotNull l interruptedExceptionHandler) {
        this(new ReentrantLock(), checkCancelled, interruptedExceptionHandler);
        AbstractC3340k.e(checkCancelled, "checkCancelled");
        AbstractC3340k.e(interruptedExceptionHandler, "interruptedExceptionHandler");
    }
}
