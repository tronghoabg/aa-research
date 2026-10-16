package androidx.camera.camera2.pipe;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.util.Range;
import android.util.Size;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraExtensionMetadata extends Metadata, UnsafeWrapper {
    <T> T get(CameraCharacteristics.Key<T> key);

    /* renamed from: getCamera-Dz_R5H8, reason: not valid java name */
    String mo496getCameraDz_R5H8();

    int getCameraExtension();

    Range<Long> getEstimatedCaptureLatencyRangeMillis(Size size, int i2);

    Set<CameraCharacteristics.Key<?>> getKeys();

    <T> T getOrDefault(CameraCharacteristics.Key<T> key, T t);

    Set<Size> getOutputSizes(int i2);

    Set<Size> getOutputSizes(Class<?> cls);

    Set<Size> getPostviewSizes(Size size, int i2);

    Set<CaptureRequest.Key<?>> getRequestKeys();

    Set<CaptureResult.Key<?>> getResultKeys();

    boolean isCaptureProgressSupported();

    boolean isPostviewSupported();

    boolean isRedacted();
}
