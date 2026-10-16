package androidx.compose.foundation.gestures;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
abstract class TransformEvent {

    /* compiled from: WazeSource */
    public final class TransformStarted extends TransformEvent {
        public static final int $stable = 0;
        public static final TransformStarted INSTANCE = new TransformStarted();

        private TransformStarted() {
            super(null);
        }
    }

    /* compiled from: WazeSource */
    public final class TransformStopped extends TransformEvent {
        public static final int $stable = 0;
        public static final TransformStopped INSTANCE = new TransformStopped();

        private TransformStopped() {
            super(null);
        }
    }

    private TransformEvent() {
    }

    public /* synthetic */ TransformEvent(o oVar) {
        this();
    }

    /* compiled from: WazeSource */
    public final class TransformDelta extends TransformEvent {
        public static final int $stable = 0;
        private final long centroid;
        private final long panChange;
        private final float rotationChange;
        private final float zoomChange;

        private TransformDelta(long j2, float f2, long j3, float f3) {
            super(null);
            this.centroid = j2;
            this.zoomChange = f2;
            this.panChange = j3;
            this.rotationChange = f3;
        }

        /* renamed from: getCentroid-F1C5BW0, reason: not valid java name */
        public final long m2341getCentroidF1C5BW0() {
            return this.centroid;
        }

        /* renamed from: getPanChange-F1C5BW0, reason: not valid java name */
        public final long m2342getPanChangeF1C5BW0() {
            return this.panChange;
        }

        public final float getRotationChange() {
            return this.rotationChange;
        }

        public final float getZoomChange() {
            return this.zoomChange;
        }

        public /* synthetic */ TransformDelta(long j2, float f2, long j3, float f3, o oVar) {
            this(j2, f2, j3, f3);
        }
    }
}
