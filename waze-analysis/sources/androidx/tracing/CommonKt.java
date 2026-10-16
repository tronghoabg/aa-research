package androidx.tracing;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class CommonKt {
    private static final AtomicLong id = new AtomicLong(42);

    public static final AtomicLong getId() {
        return id;
    }

    public static final long monotonicId() {
        return id.incrementAndGet();
    }
}
