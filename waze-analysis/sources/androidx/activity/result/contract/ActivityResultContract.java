package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class ActivityResultContract<I, O> {

    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    public final class SynchronousResult<T> {
        private final T value;

        public SynchronousResult(T t) {
            this.value = t;
        }

        public final T getValue() {
            return this.value;
        }
    }

    public abstract Intent createIntent(Context context, I i2);

    public SynchronousResult<O> getSynchronousResult(Context context, I i2) {
        x.f(context, "context");
        return null;
    }

    public abstract O parseResult(int i2, Intent intent);
}
