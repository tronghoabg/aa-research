package androidx.camera.camera2.compat;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Range;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.pipe.CameraMetadata;
import h.a.i;
import h.a.r;
import h.ab;
import h.g.b.x;
import h.k;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidRZoomCompat implements ZoomCompat {
    private final CameraProperties cameraProperties;
    private final Range<Float> range;

    public AndroidRZoomCompat(CameraProperties cameraProperties, Range<Float> range) {
        x.f(cameraProperties, "cameraProperties");
        x.f(range, "range");
        this.cameraProperties = cameraProperties;
        this.range = range;
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public am<ab> applyAsync(float f2, UseCaseCameraRequestControl useCaseCameraRequestControl) {
        x.f(useCaseCameraRequestControl, "requestControl");
        float minZoomRatio = getMinZoomRatio();
        if (f2 > getMaxZoomRatio() || minZoomRatio > f2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Map mapM = r.m(new k(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(f2)));
        if (Build.VERSION.SDK_INT >= 34 && CameraMetadata.Companion.getSupportsZoomOverride(this.cameraProperties.getMetadata())) {
            Api34Compat.setSettingsOverrideZoom(mapM);
        }
        return UseCaseCameraRequestControl.CC.setParametersAsync$default(useCaseCameraRequestControl, mapM, null, null, 6, null);
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public Rect getCropSensorRegion() {
        CameraMetadata metadata = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        x.e(key, "SENSOR_INFO_ACTIVE_ARRAY_SIZE");
        Object obj = metadata.get((CameraCharacteristics.Key<Object>) key);
        x.c(obj);
        return (Rect) obj;
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public float getMaxZoomRatio() {
        Object upper = this.range.getUpper();
        x.e(upper, "getUpper(...)");
        return ((Number) upper).floatValue();
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public float getMinZoomRatio() {
        Object lower = this.range.getLower();
        x.e(lower, "getLower(...)");
        return ((Number) lower).floatValue();
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public am<ab> resetAsync(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        x.f(useCaseCameraRequestControl, "requestControl");
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        x.e(key, "CONTROL_ZOOM_RATIO");
        List listL = i.l(key);
        if (Build.VERSION.SDK_INT >= 34) {
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_SETTINGS_OVERRIDE;
            x.e(key2, "CONTROL_SETTINGS_OVERRIDE");
            listL.add(key2);
        }
        return UseCaseCameraRequestControl.CC.removeParametersAsync$default(useCaseCameraRequestControl, listL, null, 2, null);
    }
}
