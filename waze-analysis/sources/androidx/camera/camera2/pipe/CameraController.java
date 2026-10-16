package androidx.camera.camera2.pipe;

import android.view.Surface;
import androidx.camera.camera2.pipe.StreamGraph;
import h.c.e;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraController {

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.CameraController$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Object awaitClosed$suspendImpl(CameraController cameraController, e<? super Boolean> eVar) {
            return true;
        }
    }

    /* compiled from: WazeSource */
    public abstract class ControllerState {

        /* compiled from: WazeSource */
        public final class CLOSED extends ControllerState {
            public static final CLOSED INSTANCE = new CLOSED();

            private CLOSED() {
            }
        }

        /* compiled from: WazeSource */
        public final class CLOSING extends ControllerState {
            public static final CLOSING INSTANCE = new CLOSING();

            private CLOSING() {
            }
        }

        /* compiled from: WazeSource */
        public final class DISCONNECTED extends ControllerState {
            public static final DISCONNECTED INSTANCE = new DISCONNECTED();

            private DISCONNECTED() {
            }
        }

        /* compiled from: WazeSource */
        public final class ERROR extends ControllerState {
            public static final ERROR INSTANCE = new ERROR();

            private ERROR() {
            }
        }

        /* compiled from: WazeSource */
        public final class STARTED extends ControllerState {
            public static final STARTED INSTANCE = new STARTED();

            private STARTED() {
            }
        }

        /* compiled from: WazeSource */
        public final class STOPPED extends ControllerState {
            public static final STOPPED INSTANCE = new STOPPED();

            private STOPPED() {
            }
        }

        /* compiled from: WazeSource */
        public final class STOPPING extends ControllerState {
            public static final STOPPING INSTANCE = new STOPPING();

            private STOPPING() {
            }
        }
    }

    Object awaitClosed(e<? super Boolean> eVar);

    void close();

    CameraGraphId getCameraGraphId();

    /* renamed from: getCameraId-Dz_R5H8, reason: not valid java name */
    String mo423getCameraIdDz_R5H8();

    /* renamed from: getOutputLatency-n5Pu2dI, reason: not valid java name */
    StreamGraph.OutputLatency mo424getOutputLatencyn5Pu2dI(StreamId streamId);

    boolean isForeground();

    void setForeground(boolean z);

    void start();

    void stop();

    void updateSurfaceMap(Map<StreamId, ? extends Surface> map);
}
