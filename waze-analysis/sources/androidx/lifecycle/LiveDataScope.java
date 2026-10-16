package androidx.lifecycle;

import h.ab;
import h.c.e;
import kotlinx.coroutines.ax;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface LiveDataScope<T> {
    Object emit(T t, e<? super ab> eVar);

    Object emitSource(LiveData<T> liveData, e<? super ax> eVar);

    T getLatestValue();
}
