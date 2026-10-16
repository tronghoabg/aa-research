package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.CameraId;
import h.ab;
import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraStatusMonitor extends AutoCloseable {
    ch<CameraStatus> getCameraAvailability();

    bq<ab> getCameraPriorities();

    /* compiled from: WazeSource */
    public abstract class CameraStatus {

        /* compiled from: WazeSource */
        public final class CameraPrioritiesChanged extends CameraStatus {
            public static final CameraPrioritiesChanged INSTANCE = new CameraPrioritiesChanged();

            private CameraPrioritiesChanged() {
            }

            public String toString() {
                return "CameraPrioritiesChanged";
            }
        }

        /* compiled from: WazeSource */
        public final class Unknown extends CameraStatus {
            public static final Unknown INSTANCE = new Unknown();

            private Unknown() {
            }

            public String toString() {
                return "UnknownCameraStatus";
            }
        }

        /* compiled from: WazeSource */
        public final class CameraAvailable extends CameraStatus {
            private final String cameraId;

            private CameraAvailable(String str) {
                x.f(str, "cameraId");
                this.cameraId = str;
            }

            /* renamed from: getCameraId-Dz_R5H8, reason: not valid java name */
            public final String m1205getCameraIdDz_R5H8() {
                return this.cameraId;
            }

            public String toString() {
                return "CameraAvailable(camera=" + CameraId.m552toStringimpl(this.cameraId) + ")";
            }

            public /* synthetic */ CameraAvailable(String str, o oVar) {
                this(str);
            }
        }

        /* compiled from: WazeSource */
        public final class CameraUnavailable extends CameraStatus {
            private final String cameraId;

            private CameraUnavailable(String str) {
                x.f(str, "cameraId");
                this.cameraId = str;
            }

            /* renamed from: getCameraId-Dz_R5H8, reason: not valid java name */
            public final String m1206getCameraIdDz_R5H8() {
                return this.cameraId;
            }

            public String toString() {
                return "CameraUnavailable(camera=" + CameraId.m552toStringimpl(this.cameraId) + ")";
            }

            public /* synthetic */ CameraUnavailable(String str, o oVar) {
                this(str);
            }
        }
    }
}
