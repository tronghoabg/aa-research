package androidx.compose.foundation.gestures;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class DragEvent {
    public static final int $stable = 0;

    /* compiled from: WazeSource */
    public final class DragCancelled extends DragEvent {
        public static final int $stable = 0;
        public static final DragCancelled INSTANCE = new DragCancelled();

        private DragCancelled() {
            super(null);
        }
    }

    private DragEvent() {
    }

    public /* synthetic */ DragEvent(o oVar) {
        this();
    }

    /* compiled from: WazeSource */
    public final class DragStarted extends DragEvent {
        public static final int $stable = 0;
        private final long startPoint;

        private DragStarted(long j2) {
            super(null);
            this.startPoint = j2;
        }

        /* renamed from: getStartPoint-F1C5BW0, reason: not valid java name */
        public final long m2181getStartPointF1C5BW0() {
            return this.startPoint;
        }

        public /* synthetic */ DragStarted(long j2, o oVar) {
            this(j2);
        }
    }

    /* compiled from: WazeSource */
    public final class DragDelta extends DragEvent {
        public static final int $stable = 0;
        private final long delta;
        private final boolean isIndirectPointerEvent;

        private DragDelta(long j2, boolean z) {
            super(null);
            this.delta = j2;
            this.isIndirectPointerEvent = z;
        }

        /* renamed from: getDelta-F1C5BW0, reason: not valid java name */
        public final long m2180getDeltaF1C5BW0() {
            return this.delta;
        }

        public final boolean isIndirectPointerEvent() {
            return this.isIndirectPointerEvent;
        }

        public /* synthetic */ DragDelta(long j2, boolean z, o oVar) {
            this(j2, z);
        }
    }

    /* compiled from: WazeSource */
    public final class DragStopped extends DragEvent {
        public static final int $stable = 0;
        private final boolean isIndirectPointerEvent;
        private final long velocity;

        private DragStopped(long j2, boolean z) {
            super(null);
            this.velocity = j2;
            this.isIndirectPointerEvent = z;
        }

        /* renamed from: getVelocity-9UxMQ8M, reason: not valid java name */
        public final long m2182getVelocity9UxMQ8M() {
            return this.velocity;
        }

        public final boolean isIndirectPointerEvent() {
            return this.isIndirectPointerEvent;
        }

        public /* synthetic */ DragStopped(long j2, boolean z, o oVar) {
            this(j2, z);
        }
    }
}
