package androidx.camera.camera2.compat;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.internal.ZoomMath;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import h.a.i;
import h.a.r;
import h.ab;
import h.g.b.x;
import h.k;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CropRegionZoomCompat implements ZoomCompat {
    private final CameraProperties cameraProperties;
    private Rect currentCropRect;
    private final Rect sensorRect;

    public CropRegionZoomCompat(CameraProperties cameraProperties) {
        x.f(cameraProperties, "cameraProperties");
        this.cameraProperties = cameraProperties;
        CameraMetadata metadata = cameraProperties.getMetadata();
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        x.e(key, "SENSOR_INFO_ACTIVE_ARRAY_SIZE");
        Object obj = metadata.get((CameraCharacteristics.Key<Object>) key);
        x.c(obj);
        this.sensorRect = (Rect) obj;
    }

    private final Rect computeCropRect(Rect rect, float f2) {
        if (ZoomMath.INSTANCE.nearZero$camera_camera2(f2)) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            f2 = 1.0f;
            if (Logger.isWarnEnabled(Log.TAG)) {
                android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "ZoomCompat: Invalid zoom ratio of 0.0f passed in, defaulting to 1.0f");
            }
        }
        float fWidth = rect.width();
        float fHeight = rect.height();
        float fWidth2 = rect.width();
        float f3 = fHeight / f2;
        float fHeight2 = (rect.height() - f3) / 2.0f;
        float f4 = fWidth / f2;
        float f5 = (fWidth2 - f4) / 2.0f;
        return new Rect((int) f5, (int) fHeight2, (int) (f4 + f5), (int) (f3 + fHeight2));
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public am<ab> applyAsync(float f2, UseCaseCameraRequestControl useCaseCameraRequestControl) {
        x.f(useCaseCameraRequestControl, "requestControl");
        this.currentCropRect = computeCropRect(this.sensorRect, f2);
        CaptureRequest.Key key = CaptureRequest.SCALER_CROP_REGION;
        Rect rect = this.currentCropRect;
        x.d(rect, "null cannot be cast to non-null type kotlin.Any");
        return UseCaseCameraRequestControl.CC.setParametersAsync$default(useCaseCameraRequestControl, r.e(new k(key, rect)), null, null, 6, null);
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public Rect getCropSensorRegion() {
        Rect rect = this.currentCropRect;
        return rect == null ? this.sensorRect : rect;
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public float getMaxZoomRatio() {
        CameraMetadata metadata = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM;
        x.e(key, "SCALER_AVAILABLE_MAX_DIGITAL_ZOOM");
        Float f2 = (Float) metadata.getOrDefault((CameraCharacteristics.Key<CameraCharacteristics.Key>) key, (CameraCharacteristics.Key) Float.valueOf(1.0f));
        ZoomMath zoomMath = ZoomMath.INSTANCE;
        x.c(f2);
        if (!zoomMath.nearZero$camera_camera2(f2.floatValue())) {
            return f2.floatValue();
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isWarnEnabled(Log.TAG)) {
            android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Invalid max zoom ratio of " + f2 + " detected, defaulting to 1.0f");
        }
        return 1.0f;
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public float getMinZoomRatio() {
        return 1.0f;
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public am<ab> resetAsync(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        x.f(useCaseCameraRequestControl, "requestControl");
        return UseCaseCameraRequestControl.CC.removeParametersAsync$default(useCaseCameraRequestControl, i.d(CaptureRequest.SCALER_CROP_REGION), null, 2, null);
    }
}
