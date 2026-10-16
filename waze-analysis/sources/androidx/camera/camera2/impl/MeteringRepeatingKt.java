package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.camera.camera2.compat.workaround.SupportedRepeatingSurfaceSizeKt;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import h.a.c;
import h.b.a;
import h.g.b.x;
import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MeteringRepeatingKt {
    private static final Size DEFAULT_PREVIEW_SIZE = new Size(640, 480);

    private static final Size[] getOutputSizes(CameraProperties cameraProperties) {
        CameraMetadata metadata = cameraProperties.getMetadata();
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        x.e(key, "SCALER_STREAM_CONFIGURATION_MAP");
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) metadata.get(key);
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputSizes(34);
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (!Logger.isErrorEnabled(Log.TAG)) {
            return null;
        }
        android.util.Log.e(Camera2Logger.TRUNCATED_TAG, "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP.");
        return null;
    }

    public static final Size getProperPreviewSize(CameraProperties cameraProperties, DisplayInfoManager displayInfoManager) {
        x.f(cameraProperties, "cameraProperties");
        x.f(displayInfoManager, "displayInfoManager");
        Size[] outputSizes = getOutputSizes(cameraProperties);
        if (outputSizes == null || outputSizes.length == 0) {
            return DEFAULT_PREVIEW_SIZE;
        }
        Size[] supportedRepeatingSurfaceSizes = SupportedRepeatingSurfaceSizeKt.getSupportedRepeatingSurfaceSizes(outputSizes);
        if (supportedRepeatingSurfaceSizes.length == 0) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isWarnEnabled(Log.TAG)) {
                android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "No supported output size list, fallback to current list");
            }
        } else {
            outputSizes = supportedRepeatingSurfaceSizes;
        }
        int length = outputSizes.length;
        if (length > 1) {
            c.k(outputSizes, new Comparator() { // from class: androidx.camera.camera2.impl.MeteringRepeatingKt$getProperPreviewSize$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    Size size = (Size) t;
                    Size size2 = (Size) t2;
                    return a.a(Long.valueOf(size.getWidth() * size.getHeight()), Long.valueOf(size2.getWidth() * size2.getHeight()));
                }
            });
        }
        Size previewSize = displayInfoManager.getPreviewSize();
        long jMin = Math.min(307200L, previewSize.getWidth() * previewSize.getHeight());
        Size size = null;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Size size2 = outputSizes[i2];
            long width = size2.getWidth() * size2.getHeight();
            if (width == jMin) {
                return size2;
            }
            if (width <= jMin) {
                i2++;
                size = size2;
            } else if (size == null) {
                break;
            }
        }
        if (size == null) {
            return outputSizes[0];
        }
        return size;
    }
}
