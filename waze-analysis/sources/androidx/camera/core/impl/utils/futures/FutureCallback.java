package androidx.camera.core.impl.utils.futures;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface FutureCallback<V> {
    void onFailure(Throwable th);

    void onSuccess(V v);
}
