package androidx.camera.camera2.compat;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Range;
import androidx.camera.camera2.compat.workaround.CameraMetadataSafeGetterKt;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import h.ab;
import h.g.b.o;
import h.g.b.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface ZoomCompat {
    am<ab> applyAsync(float f2, UseCaseCameraRequestControl useCaseCameraRequestControl);

    Rect getCropSensorRegion();

    float getMaxZoomRatio();

    float getMinZoomRatio();

    am<ab> resetAsync(UseCaseCameraRequestControl useCaseCameraRequestControl);

    /* compiled from: WazeSource */
    public abstract class Bindings {
        public static final Companion Companion = new Companion(null);

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final ZoomCompat provideZoomCompat(CameraProperties cameraProperties) {
                Range<Float> controlZoomRatioRangeSafely;
                x.f(cameraProperties, "cameraProperties");
                if (x.n("robolectric", Build.FINGERPRINT)) {
                    List<CameraCharacteristics.Key<Rect>> requiredCharacteristics = NoOpZoomCompat.Companion.getRequiredCharacteristics();
                    if (!(requiredCharacteristics instanceof Collection) || !requiredCharacteristics.isEmpty()) {
                        Iterator<T> it = requiredCharacteristics.iterator();
                        while (it.hasNext()) {
                            CameraCharacteristics.Key key = (CameraCharacteristics.Key) it.next();
                            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                            if (Logger.isWarnEnabled(Log.TAG)) {
                                android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Failed to read " + key + " for zoom features.");
                            }
                            CameraMetadata metadata = cameraProperties.getMetadata();
                            x.c(key);
                            if (metadata.get(key) == null) {
                                return new NoOpZoomCompat(cameraProperties);
                            }
                        }
                    }
                } else if (Build.VERSION.SDK_INT >= 30 && (controlZoomRatioRangeSafely = CameraMetadataSafeGetterKt.getControlZoomRatioRangeSafely(cameraProperties.getMetadata())) != null) {
                    return new AndroidRZoomCompat(cameraProperties, controlZoomRatioRangeSafely);
                }
                return new CropRegionZoomCompat(cameraProperties);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }
}
