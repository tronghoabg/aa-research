package androidx.camera.camera2.compat;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.compat.workaround.CameraMetadataSafeGetterKt;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import h.a.i;
import h.ab;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class NoOpZoomCompat implements ZoomCompat {
    public static final Companion Companion = new Companion(null);
    private static final List<CameraCharacteristics.Key<Rect>> requiredCharacteristics = i.d(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    private final CameraProperties cameraProperties;
    private final float maxZoomRatio;
    private final float minZoomRatio;

    public NoOpZoomCompat(CameraProperties cameraProperties) {
        x.f(cameraProperties, "cameraProperties");
        this.cameraProperties = cameraProperties;
        this.minZoomRatio = 1.0f;
        this.maxZoomRatio = 1.0f;
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public am<ab> applyAsync(float f2, UseCaseCameraRequestControl useCaseCameraRequestControl) {
        x.f(useCaseCameraRequestControl, "requestControl");
        return bo.h(ab.f48028a);
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public Rect getCropSensorRegion() {
        return CameraMetadataSafeGetterKt.getActiveArraySizeSafely(this.cameraProperties.getMetadata());
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public float getMaxZoomRatio() {
        return this.maxZoomRatio;
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public float getMinZoomRatio() {
        return this.minZoomRatio;
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public am<ab> resetAsync(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        x.f(useCaseCameraRequestControl, "requestControl");
        return bo.h(ab.f48028a);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final List<CameraCharacteristics.Key<Rect>> getRequiredCharacteristics() {
            return NoOpZoomCompat.requiredCharacteristics;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
