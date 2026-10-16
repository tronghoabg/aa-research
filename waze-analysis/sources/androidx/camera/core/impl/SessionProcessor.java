package androidx.camera.core.impl;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.CameraInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface SessionProcessor {
    public static final int TYPE_CAMERA2_EXTENSION = 1;
    public static final int TYPE_DEFAULT = 0;

    /* compiled from: WazeSource */
    public interface CaptureSessionRequestProcessor {
        Pair<Long, Long> getRealtimeStillCaptureLatency();

        void setExtensionStrength(int i2);
    }

    void deInitSession();

    List<Pair<CameraCharacteristics.Key, Object>> getAvailableCharacteristicsKeyValues();

    int[] getExtensionAvailableStabilizationModes();

    Range<Float> getExtensionZoomRange();

    Pair<Integer, Integer> getImplementationType();

    Pair<Long, Long> getRealtimeCaptureLatency();

    Set<Integer> getSupportedCameraOperations();

    Map<Integer, List<Size>> getSupportedPostviewSize(Size size);

    SessionConfig initSession(CameraInfo cameraInfo, OutputSurfaceConfiguration outputSurfaceConfiguration);

    void setCaptureSessionRequestProcessor(CaptureSessionRequestProcessor captureSessionRequestProcessor);

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.impl.SessionProcessor$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static int[] $default$getExtensionAvailableStabilizationModes(SessionProcessor sessionProcessor) {
            for (Pair<CameraCharacteristics.Key, Object> pair : sessionProcessor.getAvailableCharacteristicsKeyValues()) {
                if (((CameraCharacteristics.Key) pair.first).equals(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) {
                    return (int[]) pair.second;
                }
            }
            return null;
        }

        public static Range $default$getExtensionZoomRange(SessionProcessor sessionProcessor) {
            if (Build.VERSION.SDK_INT < 30) {
                return null;
            }
            for (Pair<CameraCharacteristics.Key, Object> pair : sessionProcessor.getAvailableCharacteristicsKeyValues()) {
                if (((CameraCharacteristics.Key) pair.first).equals(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE)) {
                    return (Range) pair.second;
                }
            }
            return null;
        }

        public static Pair $default$getRealtimeCaptureLatency(SessionProcessor sessionProcessor) {
            return null;
        }

        public static void $default$setCaptureSessionRequestProcessor(SessionProcessor sessionProcessor, CaptureSessionRequestProcessor captureSessionRequestProcessor) {
        }
    }
}
