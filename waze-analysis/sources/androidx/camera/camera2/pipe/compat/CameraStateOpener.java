package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.TimeSource;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import h.ab;
import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraStateOpener {
    private static final long CAMERA_OPEN_CANCEL_TIMEOUT;
    private static final long CAMERA_OPEN_TIMEOUT;
    private static final Companion Companion = new Companion(null);
    private final Camera2MetadataProvider camera2MetadataProvider;
    private final Camera2Quirks camera2Quirks;
    private final Camera2SystemState camera2SystemState;
    private final CameraErrorListener cameraErrorListener;
    private final CameraPipe.CameraInteropConfig cameraInteropConfig;
    private CompletableDeferred<ab> cameraOpenCancelled;
    private final CameraOpener cameraOpener;
    private final Threads threads;
    private final TimeSource timeSource;

    static {
        h.o.c cVar = h.o.a.f48264a;
        CAMERA_OPEN_TIMEOUT = h.o.c.i(3, h.o.d.f48273d);
        CAMERA_OPEN_CANCEL_TIMEOUT = h.o.c.i(2, h.o.d.f48273d);
    }

    public CameraStateOpener(CameraOpener cameraOpener, Camera2MetadataProvider camera2MetadataProvider, CameraErrorListener cameraErrorListener, Camera2Quirks camera2Quirks, Camera2SystemState camera2SystemState, TimeSource timeSource, CameraPipe.CameraInteropConfig cameraInteropConfig, Threads threads) {
        x.f(cameraOpener, "cameraOpener");
        x.f(camera2MetadataProvider, "camera2MetadataProvider");
        x.f(cameraErrorListener, "cameraErrorListener");
        x.f(camera2Quirks, "camera2Quirks");
        x.f(camera2SystemState, "camera2SystemState");
        x.f(timeSource, "timeSource");
        x.f(threads, "threads");
        this.cameraOpener = cameraOpener;
        this.camera2MetadataProvider = camera2MetadataProvider;
        this.cameraErrorListener = cameraErrorListener;
        this.camera2Quirks = camera2Quirks;
        this.camera2SystemState = camera2SystemState;
        this.timeSource = timeSource;
        this.cameraInteropConfig = cameraInteropConfig;
        this.threads = threads;
        this.cameraOpenCancelled = bo.j();
    }

    public final void cancelOpen$camera_camera2_pipe() {
        this.cameraOpenCancelled.a(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: tryOpenCamera-7pD7j80$camera_camera2_pipe, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1074tryOpenCamera7pD7j80$camera_camera2_pipe(java.lang.String r24, int r25, long r26, androidx.camera.camera2.pipe.compat.Camera2DeviceCloser r28, androidx.camera.camera2.pipe.compat.AudioRestrictionController r29, h.c.e<? super androidx.camera.camera2.pipe.compat.OpenCameraResult> r30) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.CameraStateOpener.m1074tryOpenCamera7pD7j80$camera_camera2_pipe(java.lang.String, int, long, androidx.camera.camera2.pipe.compat.Camera2DeviceCloser, androidx.camera.camera2.pipe.compat.AudioRestrictionController, h.c.e):java.lang.Object");
    }

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        /* renamed from: getCAMERA_OPEN_CANCEL_TIMEOUT-UwyO8pc, reason: not valid java name */
        public final long m1075getCAMERA_OPEN_CANCEL_TIMEOUTUwyO8pc() {
            return CameraStateOpener.CAMERA_OPEN_CANCEL_TIMEOUT;
        }

        /* renamed from: getCAMERA_OPEN_TIMEOUT-UwyO8pc, reason: not valid java name */
        public final long m1076getCAMERA_OPEN_TIMEOUTUwyO8pc() {
            return CameraStateOpener.CAMERA_OPEN_TIMEOUT;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
