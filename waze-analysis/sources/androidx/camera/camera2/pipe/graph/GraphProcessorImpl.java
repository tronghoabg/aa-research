package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.GraphState;
import androidx.camera.camera2.pipe.GraphStateListener;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.compat.Camera2Quirks;
import androidx.camera.camera2.pipe.compat.CameraPipeKeys;
import androidx.camera.camera2.pipe.config.CameraGraphScope;
import androidx.camera.camera2.pipe.config.ForCameraGraph;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import h.a.i;
import h.g.b.x;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
@CameraGraphScope
/* loaded from: classes2.dex */
public final class GraphProcessorImpl implements GraphProcessor, GraphListener {
    private final bn<GraphState> _graphState;
    private final CameraGraph.Config cameraGraphConfig;
    private final CameraGraphId cameraGraphId;
    private final List<GraphStateListener> externalStateGraphListeners;
    private final GraphLoop graphLoop;

    public GraphProcessorImpl(Threads threads, CameraGraphId cameraGraphId, CameraGraph.Config config, Listener3A listener3A, @ForCameraGraph List<Request.Listener> list, Camera2Quirks camera2Quirks) {
        x.f(threads, "threads");
        x.f(cameraGraphId, "cameraGraphId");
        x.f(config, "cameraGraphConfig");
        x.f(listener3A, "graphListener3A");
        x.f(list, "graphListeners");
        x.f(camera2Quirks, "camera2Quirks");
        this.cameraGraphId = cameraGraphId;
        this.cameraGraphConfig = config;
        this.externalStateGraphListeners = config.getGraphStateListeners();
        Map<?, Object> defaultParameters = config.getDefaultParameters();
        Map<?, Object> requiredParameters = config.getRequiredParameters();
        if ((x.n(defaultParameters.get(CameraPipeKeys.INSTANCE.getIgnore3ARequiredParameters()), true) || x.n(requiredParameters.get(CameraPipeKeys.INSTANCE.getIgnore3ARequiredParameters()), true)) && Log.INSTANCE.getINFO_LOGGABLE()) {
            Metadata.Key<Boolean> ignore3ARequiredParameters = CameraPipeKeys.INSTANCE.getIgnore3ARequiredParameters();
            Objects.toString(ignore3ARequiredParameters);
            android.util.Log.i(Log.TAG, String.valueOf(ignore3ARequiredParameters).concat(" is set to true, ignoring GraphState3A parameters."));
        }
        int repeatingRequestFrameCountForCapture$camera_camera2_pipe = camera2Quirks.getRepeatingRequestFrameCountForCapture$camera_camera2_pipe(config.getFlags());
        CaptureLimiter captureLimiter = repeatingRequestFrameCountForCapture$camera_camera2_pipe != 0 ? new CaptureLimiter(repeatingRequestFrameCountForCapture$camera_camera2_pipe) : null;
        GraphLoop graphLoop = new GraphLoop(cameraGraphId, defaultParameters, requiredParameters, i.af(list, i.j(captureLimiter)), i.k(listener3A, captureLimiter), threads.getCameraPipeScope(), threads.getLightweightDispatcher());
        this.graphLoop = graphLoop;
        if (captureLimiter != null) {
            captureLimiter.setGraphLoop(graphLoop);
        }
        this._graphState = ck.b(GraphState.GraphStateStopped.INSTANCE);
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public void abort() {
        this.graphLoop.abort();
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public void close() {
        this.graphLoop.close();
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public ch<GraphState> getGraphState() {
        return this._graphState;
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public Request getRepeatingRequest() {
        return this.graphLoop.getRepeatingRequest();
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public void invalidate() {
        this.graphLoop.invalidate();
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public void onGraphError(GraphState.GraphStateError graphStateError) {
        Object objD;
        GraphState graphState;
        x.f(graphStateError, "graphStateError");
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            android.util.Log.d(Log.TAG, this + " onGraphError(" + graphStateError + ")");
        }
        bn<GraphState> bnVar = this._graphState;
        do {
            objD = bnVar.d();
            graphState = (GraphState) objD;
        } while (!bnVar.f(objD, ((graphState instanceof GraphState.GraphStateStopping) || (graphState instanceof GraphState.GraphStateStopped)) ? GraphState.GraphStateStopped.INSTANCE : graphStateError));
        Iterator<GraphStateListener> it = this.externalStateGraphListeners.iterator();
        while (it.hasNext()) {
            it.next().onGraphError(graphStateError);
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public void onGraphModified(GraphRequestProcessor graphRequestProcessor) {
        x.f(graphRequestProcessor, "requestProcessor");
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            toString();
            android.util.Log.d(Log.TAG, toString().concat(" onGraphModified"));
        }
        this.graphLoop.invalidate();
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public void onGraphStarted(GraphRequestProcessor graphRequestProcessor) {
        x.f(graphRequestProcessor, "requestProcessor");
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            toString();
            android.util.Log.d(Log.TAG, toString().concat(" onGraphStarted"));
        }
        this._graphState.e(GraphState.GraphStateStarted.INSTANCE);
        this.graphLoop.setRequestProcessor(graphRequestProcessor);
        Iterator<GraphStateListener> it = this.externalStateGraphListeners.iterator();
        while (it.hasNext()) {
            it.next().onGraphStarted();
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public void onGraphStarting() {
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            toString();
            android.util.Log.d(Log.TAG, toString().concat(" onGraphStarting"));
        }
        this._graphState.e(GraphState.GraphStateStarting.INSTANCE);
        Iterator<GraphStateListener> it = this.externalStateGraphListeners.iterator();
        while (it.hasNext()) {
            it.next().onGraphStarting();
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public void onGraphStopped(GraphRequestProcessor graphRequestProcessor) {
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            toString();
            android.util.Log.d(Log.TAG, toString().concat(" onGraphStopped"));
        }
        this._graphState.e(GraphState.GraphStateStopped.INSTANCE);
        this.graphLoop.setRequestProcessor(null);
        Iterator<GraphStateListener> it = this.externalStateGraphListeners.iterator();
        while (it.hasNext()) {
            it.next().onGraphStopped();
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public void onGraphStopping() {
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            toString();
            android.util.Log.d(Log.TAG, toString().concat(" onGraphStopping"));
        }
        this._graphState.e(GraphState.GraphStateStopping.INSTANCE);
        this.graphLoop.setRequestProcessor(null);
        Iterator<GraphStateListener> it = this.externalStateGraphListeners.iterator();
        while (it.hasNext()) {
            it.next().onGraphStopping();
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public void setRepeatingRequest(Request request) {
        this.graphLoop.setRepeatingRequest(request);
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public boolean submit(List<Request> list) {
        Object next;
        x.f(list, "requests");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Request) next).getInputRequest() != null) {
                break;
            }
        }
        Request request = (Request) next;
        if (request == null || this.cameraGraphConfig.getInput() != null) {
            return this.graphLoop.submit(list);
        }
        throw new IllegalStateException("Cannot submit " + request + " with input request " + request.getInputRequest() + " to " + this + " because CameraGraph was not configured to support reprocessing");
    }

    public String toString() {
        return "GraphProcessor(cameraGraph: " + this.cameraGraphId + ")";
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public boolean trigger(Map<?, ? extends Object> map) {
        x.f(map, "parameters");
        return this.graphLoop.trigger(map);
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public void update3AParameters(Map<?, ? extends Object> map) {
        x.f(map, "parameters");
        this.graphLoop.setGraph3AParameters(map);
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public void updateGraphParameters(Map<?, ? extends Object> map, List<? extends Request.Listener> list) {
        x.f(map, "parameters");
        x.f(list, "listeners");
        this.graphLoop.setGraphParameters(new GraphParameters(map, list));
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public void updateRequestListeners(List<? extends Request.Listener> list) {
        x.f(list, "listeners");
        this.graphLoop.setRequestListeners(list);
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public boolean submit(Request request) {
        x.f(request, "request");
        return submit(i.d(request));
    }
}
