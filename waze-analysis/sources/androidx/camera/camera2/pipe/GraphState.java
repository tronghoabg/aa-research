package androidx.camera.camera2.pipe;

import androidx.autofill.HintConstants;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class GraphState {
    private final String name;

    /* compiled from: WazeSource */
    public final class GraphStateStarted extends GraphState {
        public static final GraphStateStarted INSTANCE = new GraphStateStarted();

        private GraphStateStarted() {
            super("GRAPH_STARTED");
        }
    }

    /* compiled from: WazeSource */
    public final class GraphStateStarting extends GraphState {
        public static final GraphStateStarting INSTANCE = new GraphStateStarting();

        private GraphStateStarting() {
            super("GRAPH_STARTING");
        }
    }

    /* compiled from: WazeSource */
    public final class GraphStateStopped extends GraphState {
        public static final GraphStateStopped INSTANCE = new GraphStateStopped();

        private GraphStateStopped() {
            super("GRAPH_STOPPED");
        }
    }

    /* compiled from: WazeSource */
    public final class GraphStateStopping extends GraphState {
        public static final GraphStateStopping INSTANCE = new GraphStateStopping();

        private GraphStateStopping() {
            super("GRAPH_STOPPING");
        }
    }

    public GraphState(String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.name = str;
    }

    public String toString() {
        return this.name;
    }

    /* compiled from: WazeSource */
    public final class GraphStateError extends GraphState {
        private final int cameraError;
        private final boolean willAttemptRetry;

        private GraphStateError(int i2, boolean z) {
            super("GRAPH_ERROR");
            this.cameraError = i2;
            this.willAttemptRetry = z;
        }

        /* renamed from: getCameraError-v7Vf74A, reason: not valid java name */
        public final int m706getCameraErrorv7Vf74A() {
            return this.cameraError;
        }

        public final boolean getWillAttemptRetry() {
            return this.willAttemptRetry;
        }

        @Override // androidx.camera.camera2.pipe.GraphState
        public String toString() {
            int i2 = this.cameraError;
            return super.toString() + "(cameraError=" + CameraError.m477toStringimpl(i2) + ", willAttemptRetry=" + this.willAttemptRetry + ")";
        }

        public /* synthetic */ GraphStateError(int i2, boolean z, o oVar) {
            this(i2, z);
        }
    }
}
