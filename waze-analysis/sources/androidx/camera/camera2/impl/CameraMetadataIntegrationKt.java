package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.pipe.CameraMetadata;
import h.a.c;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraMetadataIntegrationKt {
    public static final List<Integer> getAvailableAeModes(CameraMetadata cameraMetadata) {
        x.f(cameraMetadata, "<this>");
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        x.e(key, "CONTROL_AE_AVAILABLE_MODES");
        Object orDefault = cameraMetadata.getOrDefault((CameraCharacteristics.Key<CameraCharacteristics.Key>) key, (CameraCharacteristics.Key) new int[]{0});
        x.e(orDefault, "getOrDefault(...)");
        return c.h((int[]) orDefault);
    }

    public static final List<Integer> getAvailableAfModes(CameraMetadata cameraMetadata) {
        x.f(cameraMetadata, "<this>");
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
        x.e(key, "CONTROL_AF_AVAILABLE_MODES");
        Object orDefault = cameraMetadata.getOrDefault((CameraCharacteristics.Key<CameraCharacteristics.Key>) key, (CameraCharacteristics.Key) new int[]{0});
        x.e(orDefault, "getOrDefault(...)");
        return c.h((int[]) orDefault);
    }

    public static final List<Integer> getAvailableAwbModes(CameraMetadata cameraMetadata) {
        x.f(cameraMetadata, "<this>");
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES;
        x.e(key, "CONTROL_AWB_AVAILABLE_MODES");
        Object orDefault = cameraMetadata.getOrDefault((CameraCharacteristics.Key<CameraCharacteristics.Key>) key, (CameraCharacteristics.Key) new int[]{0});
        x.e(orDefault, "getOrDefault(...)");
        return c.h((int[]) orDefault);
    }

    public static final <T> T getOrDefault(CameraMetadata cameraMetadata, CameraCharacteristics.Key<T> key, T t) {
        T t2;
        x.f(key, "key");
        return (cameraMetadata == null || (t2 = (T) cameraMetadata.getOrDefault((CameraCharacteristics.Key<CameraCharacteristics.Key<T>>) key, (CameraCharacteristics.Key<T>) t)) == null) ? t : t2;
    }

    public static final int getSupportedAeMode(CameraMetadata cameraMetadata, int i2) {
        x.f(cameraMetadata, "<this>");
        if (!getAvailableAeModes(cameraMetadata).contains(Integer.valueOf(i2))) {
            i2 = 1;
            if (!getAvailableAeModes(cameraMetadata).contains(1)) {
                return 0;
            }
        }
        return i2;
    }

    public static final int getSupportedAfMode(CameraMetadata cameraMetadata, int i2) {
        x.f(cameraMetadata, "<this>");
        if (!getAvailableAfModes(cameraMetadata).contains(Integer.valueOf(i2))) {
            if (getAvailableAfModes(cameraMetadata).contains(4)) {
                return 4;
            }
            i2 = 1;
            if (!getAvailableAfModes(cameraMetadata).contains(1)) {
                return 0;
            }
        }
        return i2;
    }

    public static final int getSupportedAwbMode(CameraMetadata cameraMetadata, int i2) {
        x.f(cameraMetadata, "<this>");
        if (!getAvailableAwbModes(cameraMetadata).contains(Integer.valueOf(i2))) {
            i2 = 1;
            if (!getAvailableAwbModes(cameraMetadata).contains(1)) {
                return 0;
            }
        }
        return i2;
    }

    private static final boolean isAeModeSupported(CameraMetadata cameraMetadata, int i2) {
        return getSupportedAeMode(cameraMetadata, i2) == i2;
    }

    public static final boolean isExternalFlashAeModeSupported(CameraMetadata cameraMetadata) {
        x.f(cameraMetadata, "<this>");
        return isAeModeSupported(cameraMetadata, 5);
    }
}
