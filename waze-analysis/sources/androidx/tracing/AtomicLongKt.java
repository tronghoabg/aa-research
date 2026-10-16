package androidx.tracing;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class AtomicLongKt {
    public static final boolean decrement(AtomicLong atomicLong) {
        long j2 = atomicLong.get();
        return atomicLong.compareAndSet(j2, (-1) + j2);
    }
}
