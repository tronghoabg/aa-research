package androidx.navigation.compose.internal;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class WeakReference<T> {
    public static final int $stable = 8;
    private final java.lang.ref.WeakReference<T> weakReference;

    public WeakReference(T t) {
        this.weakReference = new java.lang.ref.WeakReference<>(t);
    }

    public final void clear() {
        this.weakReference.clear();
    }

    public final T get() {
        return this.weakReference.get();
    }
}
