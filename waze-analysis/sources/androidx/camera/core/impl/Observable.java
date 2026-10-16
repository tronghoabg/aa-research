package androidx.camera.core.impl;

import com.google.d.m.a.bm;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface Observable<T> {

    /* compiled from: WazeSource */
    public interface Observer<T> {
        void onError(Throwable th);

        void onNewData(T t);
    }

    void addObserver(Executor executor, Observer<? super T> observer);

    bm<T> fetchData();

    void removeObserver(Observer<? super T> observer);
}
