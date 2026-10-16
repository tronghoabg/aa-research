package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.GraphState;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface GraphListener {
    void onGraphError(GraphState.GraphStateError graphStateError);

    void onGraphModified(GraphRequestProcessor graphRequestProcessor);

    void onGraphStarted(GraphRequestProcessor graphRequestProcessor);

    void onGraphStarting();

    void onGraphStopped(GraphRequestProcessor graphRequestProcessor);

    void onGraphStopping();

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.graph.GraphListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onGraphStarting(GraphListener graphListener) {
        }

        public static void $default$onGraphStopping(GraphListener graphListener) {
        }

        public static /* synthetic */ void access$onGraphStarting$jd(GraphListener graphListener) {
        }

        public static /* synthetic */ void access$onGraphStopping$jd(GraphListener graphListener) {
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static void onGraphStarting(GraphListener graphListener) {
        }

        @Deprecated
        public static void onGraphStopping(GraphListener graphListener) {
        }
    }
}
