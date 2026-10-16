package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.Image;
import android.media.ImageReader;
import androidx.camera.camera2.pipe.CameraMetadata;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Api33Compat {
    public static final Api33Compat INSTANCE = new Api33Compat();

    private Api33Compat() {
    }

    public static final Set<CaptureRequest.Key<Object>> getAvailableCaptureRequestKeys(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i2) {
        x.f(cameraExtensionCharacteristics, "extensionCharacteristics");
        Set<CaptureRequest.Key<Object>> availableCaptureRequestKeys = cameraExtensionCharacteristics.getAvailableCaptureRequestKeys(i2);
        x.e(availableCaptureRequestKeys, "getAvailableCaptureRequestKeys(...)");
        return availableCaptureRequestKeys;
    }

    public static final Set<CaptureResult.Key<Object>> getAvailableCaptureResultKeys(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i2) {
        x.f(cameraExtensionCharacteristics, "extensionCharacteristics");
        Set<CaptureResult.Key<Object>> availableCaptureResultKeys = cameraExtensionCharacteristics.getAvailableCaptureResultKeys(i2);
        x.e(availableCaptureResultKeys, "getAvailableCaptureResultKeys(...)");
        return availableCaptureResultKeys;
    }

    public static final long[] getAvailableStreamUseCases(CameraMetadata cameraMetadata) {
        x.f(cameraMetadata, "cameraMetadata");
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
        x.e(key, "SCALER_AVAILABLE_STREAM_USE_CASES");
        return (long[]) cameraMetadata.get(key);
    }

    public static final int getDataSpace(Image image) {
        x.f(image, "image");
        return image.getDataSpace();
    }

    public static final long getDynamicRangeProfile(OutputConfiguration outputConfiguration) {
        x.f(outputConfiguration, "outputConfig");
        return outputConfiguration.getDynamicRangeProfile();
    }

    public static final int getMirrorMode(OutputConfiguration outputConfiguration) {
        x.f(outputConfiguration, "outputConfig");
        return outputConfiguration.getMirrorMode();
    }

    public static final long getStreamUseCase(OutputConfiguration outputConfiguration) {
        x.f(outputConfiguration, "outputConfig");
        return outputConfiguration.getStreamUseCase();
    }

    public static final int getTimestampBase(OutputConfiguration outputConfiguration) {
        x.f(outputConfiguration, "outputConfig");
        return outputConfiguration.getTimestampBase();
    }

    public static final ImageReader newImageReaderFromImageReaderBuilder(int i2, int i3, Integer num, Integer num2, Long l2, Integer num3, Integer num4) {
        ImageReader.Builder builder = new ImageReader.Builder(i2, i3);
        if (num != null) {
            builder.setImageFormat(num.intValue());
        }
        if (num2 != null) {
            builder.setMaxImages(num2.intValue());
        }
        if (l2 != null) {
            builder.setUsage(l2.longValue());
        }
        if (num3 != null) {
            builder.setDefaultDataSpace(num3.intValue());
        }
        if (num4 != null) {
            builder.setDefaultHardwareBufferFormat(num4.intValue());
        }
        ImageReader imageReaderBuild = builder.build();
        x.e(imageReaderBuild, "build(...)");
        return imageReaderBuild;
    }

    public static /* synthetic */ ImageReader newImageReaderFromImageReaderBuilder$default(int i2, int i3, Integer num, Integer num2, Long l2, Integer num3, Integer num4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            num = null;
        }
        if ((i4 & 8) != 0) {
            num2 = null;
        }
        if ((i4 & 16) != 0) {
            l2 = null;
        }
        if ((i4 & 32) != 0) {
            num3 = null;
        }
        if ((i4 & 64) != 0) {
            num4 = null;
        }
        return newImageReaderFromImageReaderBuilder(i2, i3, num, num2, l2, num3, num4);
    }

    public static final void setDataSpace(Image image, int i2) {
        x.f(image, "image");
        image.setDataSpace(i2);
    }

    public static final void setDynamicRangeProfile(OutputConfiguration outputConfiguration, long j2) {
        x.f(outputConfiguration, "outputConfig");
        outputConfiguration.setDynamicRangeProfile(j2);
    }

    public static final void setMirrorMode(OutputConfiguration outputConfiguration, int i2) {
        x.f(outputConfiguration, "outputConfig");
        outputConfiguration.setMirrorMode(i2);
    }

    public static final void setStreamUseCase(OutputConfiguration outputConfiguration, long j2) {
        x.f(outputConfiguration, "outputConfig");
        outputConfiguration.setStreamUseCase(j2);
    }

    public static final void setTimestampBase(OutputConfiguration outputConfiguration, int i2) {
        x.f(outputConfiguration, "outputConfig");
        outputConfiguration.setTimestampBase(i2);
    }

    public final boolean supportsPreviewStabilization(CameraMetadata cameraMetadata) {
        x.f(cameraMetadata, "cameraMetadata");
        return h.a.c.ah(CameraMetadata.Companion.getAvailableVideoStabilizationModes(cameraMetadata), 2);
    }
}
