package androidx.compose.foundation.lazy.layout;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PriorityTask {
    private static final int Low = 0;
    private final int priority;
    private final PrefetchRequest request;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int High = 1;

    public PriorityTask(int i2, PrefetchRequest prefetchRequest) {
        this.priority = i2;
        this.request = prefetchRequest;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final PrefetchRequest getRequest() {
        return this.request;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final int getHigh() {
            return PriorityTask.High;
        }

        public final int getLow() {
            return PriorityTask.Low;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
