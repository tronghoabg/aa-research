package androidx.camera.camera2.pipe;

import androidx.camera.camera2.pipe.GraphState;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface GraphStateListener {
    void onGraphError(GraphState.GraphStateError graphStateError);

    void onGraphStarted();

    void onGraphStarting();

    void onGraphStopped();

    void onGraphStopping();

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.GraphStateListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onGraphStarted(GraphStateListener graphStateListener) {
        }

        public static void $default$onGraphStarting(GraphStateListener graphStateListener) {
        }

        public static void $default$onGraphStopped(GraphStateListener graphStateListener) {
        }

        public static void $default$onGraphStopping(GraphStateListener graphStateListener) {
        }
    }
}
