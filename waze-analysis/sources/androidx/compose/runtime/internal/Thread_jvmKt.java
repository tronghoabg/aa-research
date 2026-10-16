package androidx.compose.runtime.internal;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Thread_jvmKt {
    public static final long currentThreadId() {
        return Thread.currentThread().getId();
    }

    public static final String currentThreadName() {
        return Thread.currentThread().getName();
    }
}
