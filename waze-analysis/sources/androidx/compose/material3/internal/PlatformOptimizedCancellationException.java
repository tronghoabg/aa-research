package androidx.compose.material3.internal;

import h.g.b.o;
import java.util.concurrent.CancellationException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    public static final int $stable = 8;

    public /* synthetic */ PlatformOptimizedCancellationException(String str, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : str);
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(PlatformOptimizedCancellationException_jvmAndAndroidKt.EmptyStackTraceElements);
        return this;
    }

    public PlatformOptimizedCancellationException(String str) {
        super(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlatformOptimizedCancellationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
