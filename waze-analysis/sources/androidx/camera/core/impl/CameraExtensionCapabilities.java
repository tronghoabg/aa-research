package androidx.camera.core.impl;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraExtensionCapabilities {

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.impl.CameraExtensionCapabilities$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$isCurrentExtensionModeSupported(CameraExtensionCapabilities cameraExtensionCapabilities) {
            if (Build.VERSION.SDK_INT >= 34) {
                return cameraExtensionCapabilities.getAvailableCaptureResultKeys().contains(CaptureResult.EXTENSION_CURRENT_TYPE);
            }
            return false;
        }

        public static boolean $default$isExtensionStrengthSupported(CameraExtensionCapabilities cameraExtensionCapabilities) {
            if (Build.VERSION.SDK_INT >= 34) {
                return cameraExtensionCapabilities.getAvailableCaptureRequestKeys().contains(CaptureRequest.EXTENSION_STRENGTH);
            }
            return false;
        }
    }

    <T> T get(Object obj);

    Set<Object> getAvailableCaptureRequestKeys();

    Set<Object> getAvailableCaptureResultKeys();

    List<Pair<Object, Object>> getAvailableCharacteristicsKeyValues();

    Range<Long> getEstimatedCaptureLatencyRangeMillis(Size size, int i2);

    Set<Size> getOutputSizes(int i2);

    Set<Size> getOutputSizes(Class<?> cls);

    Set<Size> getPostviewSizes(Size size, int i2);

    boolean isCaptureProcessProgressSupported();

    boolean isCurrentExtensionModeSupported();

    boolean isExtensionStrengthSupported();

    boolean isPostviewSupported();
}
