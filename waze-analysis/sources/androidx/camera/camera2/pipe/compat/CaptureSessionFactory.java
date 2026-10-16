package androidx.camera.camera2.pipe.compat;

import android.view.Surface;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.StreamId;
import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CaptureSessionFactory {

    /* compiled from: WazeSource */
    public interface Result {

        /* compiled from: WazeSource */
        public final class Failed implements Result {
            public static final Failed INSTANCE = new Failed();

            private Failed() {
            }
        }

        /* compiled from: WazeSource */
        public final class Success implements Result {
            private final Map<StreamId, OutputConfigurationWrapper> deferred;
            private final Map<OutputId, Surface> outputSurfaceMap;

            /* JADX WARN: Multi-variable type inference failed */
            public Success(Map<StreamId, ? extends OutputConfigurationWrapper> map, Map<OutputId, ? extends Surface> map2) {
                x.f(map, "deferred");
                x.f(map2, "outputSurfaceMap");
                this.deferred = map;
                this.outputSurfaceMap = map2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Success copy$default(Success success, Map map, Map map2, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    map = success.deferred;
                }
                if ((i2 & 2) != 0) {
                    map2 = success.outputSurfaceMap;
                }
                return success.copy(map, map2);
            }

            public final Map<StreamId, OutputConfigurationWrapper> component1() {
                return this.deferred;
            }

            public final Map<OutputId, Surface> component2() {
                return this.outputSurfaceMap;
            }

            public final Success copy(Map<StreamId, ? extends OutputConfigurationWrapper> map, Map<OutputId, ? extends Surface> map2) {
                x.f(map, "deferred");
                x.f(map2, "outputSurfaceMap");
                return new Success(map, map2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return x.n(this.deferred, success.deferred) && x.n(this.outputSurfaceMap, success.outputSurfaceMap);
            }

            public final Map<StreamId, OutputConfigurationWrapper> getDeferred() {
                return this.deferred;
            }

            public final Map<OutputId, Surface> getOutputSurfaceMap() {
                return this.outputSurfaceMap;
            }

            public int hashCode() {
                return (this.deferred.hashCode() * 31) + this.outputSurfaceMap.hashCode();
            }

            public String toString() {
                return "Success(deferred=" + this.deferred + ", outputSurfaceMap=" + this.outputSurfaceMap + ")";
            }
        }
    }

    Result create(CameraDeviceWrapper cameraDeviceWrapper, Map<StreamId, ? extends Surface> map, CaptureSessionState captureSessionState);
}
