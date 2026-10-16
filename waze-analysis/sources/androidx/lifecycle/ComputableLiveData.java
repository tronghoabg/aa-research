package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;
import h.g.b.o;
import h.g.b.x;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class ComputableLiveData<T> {
    private final LiveData<T> _liveData;
    private final AtomicBoolean computing;
    private final Executor executor;
    private final AtomicBoolean invalid;
    public final Runnable invalidationRunnable;
    private final LiveData<T> liveData;
    public final Runnable refreshRunnable;

    public ComputableLiveData(Executor executor) {
        x.f(executor, "executor");
        this.executor = executor;
        LiveData<T> liveData = new LiveData<T>(this) { // from class: androidx.lifecycle.ComputableLiveData$_liveData$1
            final /* synthetic */ ComputableLiveData<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.lifecycle.LiveData
            protected void onActive() {
                ComputableLiveData<T> computableLiveData = this.this$0;
                computableLiveData.getExecutor$lifecycle_livedata().execute(computableLiveData.refreshRunnable);
            }
        };
        this._liveData = liveData;
        this.liveData = liveData;
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.refreshRunnable = new Runnable() { // from class: androidx.lifecycle.ComputableLiveData$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ComputableLiveData.refreshRunnable$lambda$0(this.f$0);
            }
        };
        this.invalidationRunnable = new Runnable() { // from class: androidx.lifecycle.ComputableLiveData$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ComputableLiveData.invalidationRunnable$lambda$0(this.f$0);
            }
        };
    }

    public static /* synthetic */ void getInvalidationRunnable$lifecycle_livedata$annotations() {
    }

    public static /* synthetic */ void getRefreshRunnable$lifecycle_livedata$annotations() {
    }

    static final void invalidationRunnable$lambda$0(ComputableLiveData computableLiveData) {
        boolean zHasActiveObservers = computableLiveData.getLiveData().hasActiveObservers();
        if (computableLiveData.invalid.compareAndSet(false, true) && zHasActiveObservers) {
            computableLiveData.executor.execute(computableLiveData.refreshRunnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final void refreshRunnable$lambda$0(ComputableLiveData computableLiveData) {
        do {
            if (!computableLiveData.computing.compareAndSet(false, true)) {
                return;
            }
            Object objCompute = null;
            boolean z = false;
            while (computableLiveData.invalid.compareAndSet(true, false)) {
                try {
                    objCompute = computableLiveData.compute();
                    z = true;
                } finally {
                    computableLiveData.computing.set(false);
                }
            }
            if (z) {
                computableLiveData.getLiveData().postValue(objCompute);
            }
            if (!z) {
                return;
            }
        } while (computableLiveData.invalid.get());
    }

    protected abstract T compute();

    public final AtomicBoolean getComputing$lifecycle_livedata() {
        return this.computing;
    }

    public final Executor getExecutor$lifecycle_livedata() {
        return this.executor;
    }

    public final AtomicBoolean getInvalid$lifecycle_livedata() {
        return this.invalid;
    }

    public LiveData<T> getLiveData() {
        return this.liveData;
    }

    public void invalidate() {
        ArchTaskExecutor.getInstance().executeOnMainThread(this.invalidationRunnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComputableLiveData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ComputableLiveData(Executor executor, int i2, o oVar) {
        if ((i2 & 1) != 0) {
            executor = ArchTaskExecutor.getIOThreadExecutor();
            x.e(executor, "getIOThreadExecutor(...)");
        }
        this(executor);
    }
}
