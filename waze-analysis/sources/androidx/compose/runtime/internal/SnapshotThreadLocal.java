package androidx.compose.runtime.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SnapshotThreadLocal<T> {
    public static final int $stable = 8;
    private T mainThreadValue;
    private final AtomicReference<ThreadMap> map = new AtomicReference<>(SnapshotThreadLocalKt.emptyThreadMap);
    private final Object writeMutex = new Object();

    public final T get() {
        long jCurrentThreadId = Thread_jvmKt.currentThreadId();
        return jCurrentThreadId == Thread_androidKt.getMainThreadId() ? this.mainThreadValue : (T) this.map.get().get(jCurrentThreadId);
    }

    public final void set(T t) {
        long jCurrentThreadId = Thread_jvmKt.currentThreadId();
        if (jCurrentThreadId == Thread_androidKt.getMainThreadId()) {
            this.mainThreadValue = t;
            return;
        }
        synchronized (this.writeMutex) {
            ThreadMap threadMap = this.map.get();
            if (threadMap.trySet(jCurrentThreadId, t)) {
                return;
            }
            this.map.set(threadMap.newWith(jCurrentThreadId, t));
        }
    }
}
