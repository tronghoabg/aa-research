package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.GraphState;
import androidx.camera.camera2.pipe.graph.GraphListener;
import androidx.camera.camera2.pipe.graph.GraphRequestProcessor;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class NoOpGraphListener implements GraphListener {
    public static final NoOpGraphListener INSTANCE = new NoOpGraphListener();

    private NoOpGraphListener() {
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public void onGraphError(GraphState.GraphStateError graphStateError) {
        x.f(graphStateError, "graphStateError");
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public void onGraphModified(GraphRequestProcessor graphRequestProcessor) {
        x.f(graphRequestProcessor, "requestProcessor");
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public void onGraphStarted(GraphRequestProcessor graphRequestProcessor) {
        x.f(graphRequestProcessor, "requestProcessor");
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public /* synthetic */ void onGraphStarting() {
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public /* synthetic */ void onGraphStopping() {
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public void onGraphStopped(GraphRequestProcessor graphRequestProcessor) {
    }
}
