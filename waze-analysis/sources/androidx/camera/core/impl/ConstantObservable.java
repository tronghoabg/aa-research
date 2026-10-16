package androidx.camera.core.impl;

import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.d.m.a.bm;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ConstantObservable<T> implements Observable<T> {
    private static final ConstantObservable<Object> NULL_OBSERVABLE = new ConstantObservable<>(null);
    private static final String TAG = "ConstantObservable";
    private final bm<T> mValueFuture;

    private ConstantObservable(T t) {
        this.mValueFuture = Futures.immediateFuture(t);
    }

    public static <U> Observable<U> withValue(U u) {
        return u == null ? NULL_OBSERVABLE : new ConstantObservable(u);
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(Executor executor, final Observable.Observer<? super T> observer) {
        this.mValueFuture.addListener(new Runnable() { // from class: androidx.camera.core.impl.ConstantObservable$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1364x573c7728(observer);
            }
        }, executor);
    }

    @Override // androidx.camera.core.impl.Observable
    public bm<T> fetchData() {
        return this.mValueFuture;
    }

    /* renamed from: lambda$addObserver$0$androidx-camera-core-impl-ConstantObservable, reason: not valid java name */
    /* synthetic */ void m1364x573c7728(Observable.Observer observer) {
        try {
            observer.onNewData(this.mValueFuture.get());
        } catch (InterruptedException | ExecutionException e2) {
            observer.onError(e2);
        }
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(Observable.Observer<? super T> observer) {
    }
}
