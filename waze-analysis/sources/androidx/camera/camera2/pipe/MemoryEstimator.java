package androidx.camera.camera2.pipe;

import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface MemoryEstimator {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.MemoryEstimator$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static MemoryEstimator create(long j2) {
            return MemoryEstimator.Companion.create(j2);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ MemoryEstimator create$default(Companion companion, long j2, int i2, Object obj) {
            if (1 == (i2 & 1)) {
                j2 = Long.MAX_VALUE;
            }
            return companion.create(j2);
        }

        public final MemoryEstimator create(long j2) {
            return new MemoryEstimatorImpl(j2);
        }
    }

    boolean canAllocate(long j2);

    void decrementUsage(long j2);

    k<Long> getCapacity();

    ch<Long> getEvictable();

    ch<Long> getUsage();

    void incrementUsage(long j2);

    void updateEvictable(long j2);
}
