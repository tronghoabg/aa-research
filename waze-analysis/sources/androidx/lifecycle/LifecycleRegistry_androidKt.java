package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class LifecycleRegistry_androidKt {
    public static final boolean isMainThread() {
        return ArchTaskExecutor.getInstance().isMainThread();
    }
}
