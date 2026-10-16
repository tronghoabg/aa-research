package androidx.camera.core.impl;

import android.util.Log;
import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.impl.Observable;
import androidx.core.util.Preconditions;
import com.google.d.m.a.bm;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class AbstractCameraPresenceSource implements Observable<List<CameraIdentifier>> {
    private static final String TAG = "CameraPresenceSrc";
    private List<CameraIdentifier> mCurrentData;
    private Throwable mCurrentError;
    private boolean mIsActive;
    private final Object mLock;
    private final List<ObserverWrapper> mObservers;

    /* compiled from: WazeSource */
    class ObserverWrapper {
        final Executor mExecutor;
        final Observable.Observer<? super List<CameraIdentifier>> mObserver;

        ObserverWrapper(Executor executor, Observable.Observer<? super List<CameraIdentifier>> observer) {
            this.mExecutor = executor;
            this.mObserver = observer;
        }
    }

    public AbstractCameraPresenceSource(List<String> list) {
        this.mLock = new Object();
        this.mObservers = new CopyOnWriteArrayList();
        this.mCurrentError = null;
        this.mIsActive = false;
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CameraIdentifier.Factory.create(it.next()));
        }
        this.mCurrentData = arrayList;
    }

    static /* synthetic */ void lambda$notifyObserver$0(Throwable th, ObserverWrapper observerWrapper, List list) {
        if (th != null) {
            observerWrapper.mObserver.onError(th);
        } else {
            observerWrapper.mObserver.onNewData(list);
        }
    }

    private void notifyObserver(final ObserverWrapper observerWrapper, final List<CameraIdentifier> list, final Throwable th) {
        observerWrapper.mExecutor.execute(new Runnable() { // from class: androidx.camera.core.impl.AbstractCameraPresenceSource$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractCameraPresenceSource.lambda$notifyObserver$0(th, observerWrapper, list);
            }
        });
    }

    private void updateState(List<CameraIdentifier> list, Throwable th) {
        List<CameraIdentifier> list2;
        boolean z;
        List<CameraIdentifier> listUnmodifiableList;
        Throwable th2;
        synchronized (this.mLock) {
            if (th != null) {
                z = this.mCurrentError == null || !this.mCurrentData.isEmpty();
                this.mCurrentError = th;
                list2 = Collections.EMPTY_LIST;
                this.mCurrentData = list2;
            } else {
                Preconditions.checkNotNull(list);
                boolean z2 = (this.mCurrentError == null && this.mCurrentData.equals(list)) ? false : true;
                this.mCurrentError = null;
                this.mCurrentData = list;
                boolean z3 = z2;
                list2 = list;
                z = z3;
            }
            listUnmodifiableList = DesugarCollections.unmodifiableList(list2);
            th2 = this.mCurrentError;
        }
        if (z) {
            StringBuilder sb = new StringBuilder("Data changed. Notifying ");
            sb.append(this.mObservers.size());
            sb.append(" observers. Error: ");
            sb.append(th2 != null);
            Log.d(TAG, sb.toString());
            Iterator<ObserverWrapper> it = this.mObservers.iterator();
            while (it.hasNext()) {
                notifyObserver(it.next(), listUnmodifiableList, th2);
            }
        }
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(Executor executor, Observable.Observer<? super List<CameraIdentifier>> observer) {
        List<CameraIdentifier> listUnmodifiableList;
        Throwable th;
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(observer);
        this.mObservers.add(new ObserverWrapper(executor, observer));
        synchronized (this.mLock) {
            if (!this.mIsActive && !this.mObservers.isEmpty()) {
                Log.i(TAG, "First observer added. Starting monitoring.");
                this.mIsActive = true;
                startMonitoring();
            }
            listUnmodifiableList = DesugarCollections.unmodifiableList(this.mCurrentData);
            th = this.mCurrentError;
        }
        notifyObserver(new ObserverWrapper(executor, observer), listUnmodifiableList, th);
    }

    @Override // androidx.camera.core.impl.Observable
    public abstract bm<List<CameraIdentifier>> fetchData();

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(Observable.Observer<? super List<CameraIdentifier>> observer) {
        ObserverWrapper next;
        Preconditions.checkNotNull(observer);
        Iterator<ObserverWrapper> it = this.mObservers.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next.mObserver.equals(observer)) {
                    break;
                }
            }
        }
        if (next != null) {
            this.mObservers.remove(next);
        }
        synchronized (this.mLock) {
            if (this.mIsActive && this.mObservers.isEmpty()) {
                Log.i(TAG, "Last observer removed. Stopping monitoring.");
                this.mIsActive = false;
                stopMonitoring();
            }
        }
    }

    protected abstract void startMonitoring();

    protected abstract void stopMonitoring();

    protected void updateData(List<CameraIdentifier> list) {
        updateState(list, null);
    }

    protected void updateError(Throwable th) {
        updateState(null, th);
    }

    public AbstractCameraPresenceSource() {
        this(Collections.EMPTY_LIST);
    }
}
