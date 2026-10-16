package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.Request;
import h.g.b.x;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface GraphCommand {

    /* compiled from: WazeSource */
    public final class Abort implements GraphCommand {
        public static final Abort INSTANCE = new Abort();

        private Abort() {
        }
    }

    /* compiled from: WazeSource */
    public final class Capture implements GraphCommand {
        private final List<Request> requests;

        public Capture(List<Request> list) {
            x.f(list, "requests");
            this.requests = list;
        }

        public final List<Request> getRequests() {
            return this.requests;
        }
    }

    /* compiled from: WazeSource */
    public final class Invalidate implements GraphCommand {
        public static final Invalidate INSTANCE = new Invalidate();

        private Invalidate() {
        }
    }

    /* compiled from: WazeSource */
    public final class Listeners implements GraphCommand {
        private final List<Request.Listener> listeners;

        /* JADX WARN: Multi-variable type inference failed */
        public Listeners(List<? extends Request.Listener> list) {
            x.f(list, "listeners");
            this.listeners = list;
        }

        public final List<Request.Listener> getListeners() {
            return this.listeners;
        }
    }

    /* compiled from: WazeSource */
    public final class Parameters implements GraphCommand {
        private final Map<?, Object> graph3AParameters;
        private final GraphParameters graphParameters;

        public Parameters(GraphParameters graphParameters, Map<?, ? extends Object> map) {
            x.f(graphParameters, "graphParameters");
            x.f(map, "graph3AParameters");
            this.graphParameters = graphParameters;
            this.graph3AParameters = map;
        }

        public final Map<?, Object> getGraph3AParameters() {
            return this.graph3AParameters;
        }

        public final GraphParameters getGraphParameters() {
            return this.graphParameters;
        }
    }

    /* compiled from: WazeSource */
    public final class Repeat implements GraphCommand {
        private final Request request;

        public Repeat(Request request) {
            x.f(request, "request");
            this.request = request;
        }

        public final Request getRequest() {
            return this.request;
        }
    }

    /* compiled from: WazeSource */
    public final class RequestProcessor implements GraphCommand {

        /* renamed from: new, reason: not valid java name */
        private final GraphRequestProcessor f0new;
        private final GraphRequestProcessor old;

        public RequestProcessor(GraphRequestProcessor graphRequestProcessor, GraphRequestProcessor graphRequestProcessor2) {
            this.old = graphRequestProcessor;
            this.f0new = graphRequestProcessor2;
        }

        public final GraphRequestProcessor getNew() {
            return this.f0new;
        }

        public final GraphRequestProcessor getOld() {
            return this.old;
        }
    }

    /* compiled from: WazeSource */
    public final class Shutdown implements GraphCommand {
        public static final Shutdown INSTANCE = new Shutdown();

        private Shutdown() {
        }
    }

    /* compiled from: WazeSource */
    public final class Stop implements GraphCommand {
        public static final Stop INSTANCE = new Stop();

        private Stop() {
        }
    }

    /* compiled from: WazeSource */
    public final class Trigger implements GraphCommand {
        private final Map<?, Object> triggerParameters;

        public Trigger(Map<?, ? extends Object> map) {
            x.f(map, "triggerParameters");
            this.triggerParameters = map;
        }

        public final Map<?, Object> getTriggerParameters() {
            return this.triggerParameters;
        }
    }
}
