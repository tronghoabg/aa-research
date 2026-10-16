package androidx.tracing;

import androidx.tracing.Poolable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class Poolable<T extends Poolable<T>> {
    private final Pool<T> owner;

    public Poolable(Pool<T> pool) {
        this.owner = pool;
    }

    public Pool<T> getOwner$tracing() {
        return this.owner;
    }

    public abstract void recycle();
}
