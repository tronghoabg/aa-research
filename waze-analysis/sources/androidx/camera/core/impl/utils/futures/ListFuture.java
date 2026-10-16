package androidx.camera.core.impl.utils.futures;

import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.d.m.a.bm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
class ListFuture<V> implements bm<List<V>> {
    private final boolean mAllMustSucceed;
    List<? extends bm<? extends V>> mFutures;
    private final AtomicInteger mRemaining;
    private final bm<List<V>> mResult;
    CallbackToFutureAdapter.Completer<List<V>> mResultNotifier;
    List<V> mValues;

    ListFuture(List<? extends bm<? extends V>> list, boolean z, Executor executor) {
        Preconditions.checkNotNull(list);
        this.mFutures = list;
        this.mValues = new ArrayList(list.size());
        this.mAllMustSucceed = z;
        this.mRemaining = new AtomicInteger(list.size());
        this.mResult = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver<List<V>>() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public Object attachCompleter(CallbackToFutureAdapter.Completer<List<V>> completer) {
                Preconditions.checkState(ListFuture.this.mResultNotifier == null, "The result can only set once!");
                ListFuture.this.mResultNotifier = completer;
                return "ListFuture[" + this + "]";
            }
        });
        init(executor);
    }

    private void callAllGets() throws InterruptedException {
        List<? extends bm<? extends V>> list = this.mFutures;
        if (list == null || isDone()) {
            return;
        }
        for (bm<? extends V> bmVar : list) {
            while (!bmVar.isDone()) {
                try {
                    bmVar.get();
                } catch (Error e2) {
                    throw e2;
                } catch (InterruptedException e3) {
                    throw e3;
                } catch (Throwable unused) {
                    if (this.mAllMustSucceed) {
                        return;
                    }
                }
            }
        }
    }

    private void init(Executor executor) {
        addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.2
            @Override // java.lang.Runnable
            public void run() {
                ListFuture listFuture = ListFuture.this;
                listFuture.mValues = null;
                listFuture.mFutures = null;
            }
        }, CameraXExecutors.directExecutor());
        if (this.mFutures.isEmpty()) {
            this.mResultNotifier.set(new ArrayList(this.mValues));
            return;
        }
        for (int i2 = 0; i2 < this.mFutures.size(); i2++) {
            this.mValues.add(null);
        }
        List<? extends bm<? extends V>> list = this.mFutures;
        for (final int i3 = 0; i3 < list.size(); i3++) {
            final bm<? extends V> bmVar = list.get(i3);
            bmVar.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.3
                @Override // java.lang.Runnable
                public void run() {
                    ListFuture.this.setOneValue(i3, bmVar);
                }
            }, executor);
        }
    }

    @Override // com.google.d.m.a.bm
    public void addListener(Runnable runnable, Executor executor) {
        this.mResult.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        List<? extends bm<? extends V>> list = this.mFutures;
        if (list != null) {
            Iterator<? extends bm<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z);
            }
        }
        return this.mResult.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public List<V> get() throws InterruptedException {
        callAllGets();
        return this.mResult.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.mResult.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.mResult.isDone();
    }

    void setOneValue(int i2, Future<? extends V> future) {
        int iDecrementAndGet;
        List<V> list = this.mValues;
        if (isDone() || list == null) {
            Preconditions.checkState(this.mAllMustSucceed, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    try {
                        Preconditions.checkState(future.isDone(), "Tried to set value from future which is not done");
                        list.set(i2, Futures.getUninterruptibly(future));
                    } catch (CancellationException unused) {
                        if (this.mAllMustSucceed) {
                            cancel(false);
                        }
                    }
                } catch (Error e2) {
                    this.mResultNotifier.setException(e2);
                }
            } catch (RuntimeException e3) {
                if (this.mAllMustSucceed) {
                    this.mResultNotifier.setException(e3);
                }
            } catch (ExecutionException e4) {
                if (this.mAllMustSucceed) {
                    this.mResultNotifier.setException(e4.getCause());
                }
            }
            Preconditions.checkState(iDecrementAndGet >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet == 0) {
                List<V> list2 = this.mValues;
                if (list2 != null) {
                    this.mResultNotifier.set(new ArrayList(list2));
                } else {
                    Preconditions.checkState(isDone());
                }
            }
        } finally {
            int iDecrementAndGet2 = this.mRemaining.decrementAndGet();
            Preconditions.checkState(iDecrementAndGet2 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet2 == 0) {
                List<V> list3 = this.mValues;
                if (list3 != null) {
                    this.mResultNotifier.set(new ArrayList(list3));
                } else {
                    Preconditions.checkState(isDone());
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public List<V> get(long j2, TimeUnit timeUnit) {
        return this.mResult.get(j2, timeUnit);
    }
}
