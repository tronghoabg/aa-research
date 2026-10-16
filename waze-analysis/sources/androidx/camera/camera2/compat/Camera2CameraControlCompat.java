package androidx.camera.camera2.compat;

import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import h.g.b.x;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface Camera2CameraControlCompat extends Request.Listener {

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.compat.Camera2CameraControlCompat$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ am applyAsync$default(Camera2CameraControlCompat camera2CameraControlCompat, UseCaseCameraRequestControl useCaseCameraRequestControl, boolean z, int i2, Object obj) {
            if (obj == null) {
                return camera2CameraControlCompat.applyAsync(useCaseCameraRequestControl, z | (!((i2 & 2) == 0)));
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyAsync");
        }
    }

    /* compiled from: WazeSource */
    public abstract class Bindings {
        public abstract Camera2CameraControlCompat bindCamera2CameraControlCompImpl(Camera2CameraControlCompatImpl camera2CameraControlCompatImpl);
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static void onAborted(Camera2CameraControlCompat camera2CameraControlCompat, Request request) {
            x.f(request, "request");
            x.f(request, "request");
        }

        @Deprecated
        /* renamed from: onBufferLost-DlC0U5Y, reason: not valid java name */
        public static void m212onBufferLostDlC0U5Y(Camera2CameraControlCompat camera2CameraControlCompat, RequestMetadata requestMetadata, long j2, int i2) {
            x.f(requestMetadata, "requestMetadata");
            x.f(requestMetadata, "requestMetadata");
        }

        @Deprecated
        /* renamed from: onBufferLost-iiEMlm4, reason: not valid java name */
        public static void m213onBufferLostiiEMlm4(Camera2CameraControlCompat camera2CameraControlCompat, RequestMetadata requestMetadata, long j2, int i2, int i3) {
            x.f(requestMetadata, "requestMetadata");
            x.f(requestMetadata, "requestMetadata");
        }

        @Deprecated
        public static void onCaptureProgress(Camera2CameraControlCompat camera2CameraControlCompat, RequestMetadata requestMetadata, int i2) {
            x.f(requestMetadata, "requestMetadata");
            x.f(requestMetadata, "requestMetadata");
        }

        @Deprecated
        /* renamed from: onComplete-CcXjc1I, reason: not valid java name */
        public static void m214onCompleteCcXjc1I(Camera2CameraControlCompat camera2CameraControlCompat, RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
            x.f(requestMetadata, "requestMetadata");
            x.f(frameInfo, "result");
            Request.Listener.CC.m854$default$onCompleteCcXjc1I(camera2CameraControlCompat, requestMetadata, j2, frameInfo);
        }

        @Deprecated
        /* renamed from: onFailed-CcXjc1I, reason: not valid java name */
        public static void m215onFailedCcXjc1I(Camera2CameraControlCompat camera2CameraControlCompat, RequestMetadata requestMetadata, long j2, RequestFailure requestFailure) {
            x.f(requestMetadata, "requestMetadata");
            x.f(requestFailure, "requestFailure");
            Request.Listener.CC.m855$default$onFailedCcXjc1I(camera2CameraControlCompat, requestMetadata, j2, requestFailure);
        }

        @Deprecated
        /* renamed from: onPartialCaptureResult-CcXjc1I, reason: not valid java name */
        public static void m216onPartialCaptureResultCcXjc1I(Camera2CameraControlCompat camera2CameraControlCompat, RequestMetadata requestMetadata, long j2, FrameMetadata frameMetadata) {
            x.f(requestMetadata, "requestMetadata");
            x.f(frameMetadata, "captureResult");
            Request.Listener.CC.m856$default$onPartialCaptureResultCcXjc1I(camera2CameraControlCompat, requestMetadata, j2, frameMetadata);
        }

        @Deprecated
        /* renamed from: onReadoutStarted-mP9r-9w, reason: not valid java name */
        public static void m217onReadoutStartedmP9r9w(Camera2CameraControlCompat camera2CameraControlCompat, RequestMetadata requestMetadata, long j2, long j3) {
            x.f(requestMetadata, "requestMetadata");
            x.f(requestMetadata, "requestMetadata");
        }

        @Deprecated
        public static void onRequestSequenceAborted(Camera2CameraControlCompat camera2CameraControlCompat, RequestMetadata requestMetadata) {
            x.f(requestMetadata, "requestMetadata");
            x.f(requestMetadata, "requestMetadata");
        }

        @Deprecated
        /* renamed from: onRequestSequenceCompleted-RuT0dZU, reason: not valid java name */
        public static void m218onRequestSequenceCompletedRuT0dZU(Camera2CameraControlCompat camera2CameraControlCompat, RequestMetadata requestMetadata, long j2) {
            x.f(requestMetadata, "requestMetadata");
            x.f(requestMetadata, "requestMetadata");
        }

        @Deprecated
        public static void onRequestSequenceCreated(Camera2CameraControlCompat camera2CameraControlCompat, RequestMetadata requestMetadata) {
            x.f(requestMetadata, "requestMetadata");
            x.f(requestMetadata, "requestMetadata");
        }

        @Deprecated
        public static void onRequestSequenceSubmitted(Camera2CameraControlCompat camera2CameraControlCompat, RequestMetadata requestMetadata) {
            x.f(requestMetadata, "requestMetadata");
            x.f(requestMetadata, "requestMetadata");
        }

        @Deprecated
        /* renamed from: onStarted-uGKBvU4, reason: not valid java name */
        public static void m219onStarteduGKBvU4(Camera2CameraControlCompat camera2CameraControlCompat, RequestMetadata requestMetadata, long j2, long j3) {
            x.f(requestMetadata, "requestMetadata");
            x.f(requestMetadata, "requestMetadata");
        }

        @Deprecated
        /* renamed from: onTotalCaptureResult-CcXjc1I, reason: not valid java name */
        public static void m220onTotalCaptureResultCcXjc1I(Camera2CameraControlCompat camera2CameraControlCompat, RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
            x.f(requestMetadata, "requestMetadata");
            x.f(frameInfo, "totalCaptureResult");
            Request.Listener.CC.m860$default$onTotalCaptureResultCcXjc1I(camera2CameraControlCompat, requestMetadata, j2, frameInfo);
        }
    }

    void addRequestOption(CaptureRequestOptions captureRequestOptions);

    am<Void> applyAsync(UseCaseCameraRequestControl useCaseCameraRequestControl, boolean z);

    void cancelCurrentTask();

    void clearRequestOption();

    CaptureRequestOptions getRequestOption();
}
