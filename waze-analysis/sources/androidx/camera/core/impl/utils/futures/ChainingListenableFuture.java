package androidx.camera.core.impl.utils.futures;

import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.core.util.Preconditions;
import com.google.d.m.a.bm;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
class ChainingListenableFuture<I, O> extends FutureChain<O> implements Runnable {
    private AsyncFunction<? super I, ? extends O> mFunction;
    private bm<? extends I> mInputFuture;
    private final BlockingQueue<Boolean> mMayInterruptIfRunningChannel = new LinkedBlockingQueue(1);
    private final CountDownLatch mOutputCreated = new CountDownLatch(1);
    volatile bm<? extends O> mOutputFuture;

    ChainingListenableFuture(AsyncFunction<? super I, ? extends O> asyncFunction, bm<? extends I> bmVar) {
        Preconditions.checkNotNull(asyncFunction);
        this.mFunction = asyncFunction;
        Preconditions.checkNotNull(bmVar);
        this.mInputFuture = bmVar;
    }

    private <E> void putUninterruptibly(BlockingQueue<E> blockingQueue, E e2) {
        boolean z = false;
        while (true) {
            try {
                blockingQueue.put(e2);
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private <E> E takeUninterruptibly(BlockingQueue<E> blockingQueue) {
        E eTake;
        boolean z = false;
        while (true) {
            try {
                eTake = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return eTake;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (!super.cancel(z)) {
            return false;
        }
        putUninterruptibly(this.mMayInterruptIfRunningChannel, Boolean.valueOf(z));
        cancel(this.mInputFuture, z);
        cancel(this.mOutputFuture, z);
        return true;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public O get(long j2, TimeUnit timeUnit) throws TimeoutException {
        if (!isDone()) {
            if (timeUnit != TimeUnit.NANOSECONDS) {
                j2 = TimeUnit.NANOSECONDS.convert(j2, timeUnit);
                timeUnit = TimeUnit.NANOSECONDS;
            }
            bm<? extends I> bmVar = this.mInputFuture;
            if (bmVar != null) {
                long jNanoTime = System.nanoTime();
                bmVar.get(j2, timeUnit);
                j2 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            CountDownLatch countDownLatch = this.mOutputCreated;
            long jNanoTime2 = System.nanoTime();
            if (!countDownLatch.await(j2, timeUnit)) {
                throw new TimeoutException();
            }
            j2 -= Math.max(0L, System.nanoTime() - jNanoTime2);
            bm<? extends O> bmVar2 = this.mOutputFuture;
            if (bmVar2 != null) {
                bmVar2.get(j2, timeUnit);
            }
        }
        return (O) super.get(j2, timeUnit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    try {
                        try {
                            final bm<? extends O> bmVarApply = this.mFunction.apply(Futures.getUninterruptibly(this.mInputFuture));
                            this.mOutputFuture = bmVarApply;
                            if (isCancelled()) {
                                bmVarApply.cancel(((Boolean) takeUninterruptibly(this.mMayInterruptIfRunningChannel)).booleanValue());
                                this.mOutputFuture = null;
                            } else {
                                bmVarApply.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ChainingListenableFuture.1
                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.camera.core.impl.utils.futures.ChainingListenableFuture] */
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        try {
                                            try {
                                                ChainingListenableFuture.this.set(Futures.getUninterruptibly(bmVarApply));
                                            } catch (CancellationException unused) {
                                                ChainingListenableFuture.this.cancel(false);
                                            } catch (ExecutionException e2) {
                                                ChainingListenableFuture.this.setException(e2.getCause());
                                            }
                                        } finally {
                                            ChainingListenableFuture.this.mOutputFuture = null;
                                        }
                                    }
                                }, CameraXExecutors.directExecutor());
                            }
                        } catch (Error e2) {
                            setException(e2);
                        }
                    } catch (UndeclaredThrowableException e3) {
                        setException(e3.getCause());
                    }
                } catch (Throwable th) {
                    this.mFunction = null;
                    this.mInputFuture = null;
                    this.mOutputCreated.countDown();
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e4) {
                setException(e4.getCause());
            }
        } catch (Exception e5) {
            setException(e5);
        }
        this.mFunction = null;
        this.mInputFuture = null;
        this = (ChainingListenableFuture<I, O>) this.mOutputCreated;
        this.countDown();
    }

    private void cancel(Future<?> future, boolean z) {
        if (future != null) {
            future.cancel(z);
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public O get() throws InterruptedException {
        if (!isDone()) {
            bm<? extends I> bmVar = this.mInputFuture;
            if (bmVar != null) {
                bmVar.get();
            }
            this.mOutputCreated.await();
            bm<? extends O> bmVar2 = this.mOutputFuture;
            if (bmVar2 != null) {
                bmVar2.get();
            }
        }
        return (O) super.get();
    }
}
