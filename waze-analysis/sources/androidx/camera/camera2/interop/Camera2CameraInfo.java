package androidx.camera.camera2.interop;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import androidx.camera.camera2.adapter.CameraInfoAdapter;
import androidx.camera.camera2.compat.workaround.CameraMetadataSafeGetterKt;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.AdapterCameraInfo;
import androidx.camera.core.impl.SessionProcessor;
import h.g.b.o;
import h.g.b.x;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2CameraInfo {
    public static final Companion Companion = new Companion(null);
    public final /* synthetic */ String cameraId;
    private final CameraProperties cameraProperties;
    private final List<Pair<CameraCharacteristics.Key<?>, Object>> extensionsSpecificChars;

    /* JADX WARN: Multi-variable type inference failed */
    private Camera2CameraInfo(CameraProperties cameraProperties, List<? extends Pair<CameraCharacteristics.Key<?>, Object>> list) {
        this.cameraProperties = cameraProperties;
        this.extensionsSpecificChars = list;
        this.cameraId = cameraProperties.mo248getCameraIdDz_R5H8();
    }

    public static final Camera2CameraInfo create(CameraProperties cameraProperties) {
        return Companion.create(cameraProperties);
    }

    public static final Camera2CameraInfo from(CameraInfo cameraInfo) {
        return Companion.from(cameraInfo);
    }

    public final <T> T getCameraCharacteristic(CameraCharacteristics.Key<T> key) {
        x.f(key, "key");
        List<Pair<CameraCharacteristics.Key<?>, Object>> list = this.extensionsSpecificChars;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (x.n(pair.first, key)) {
                    return (T) pair.second;
                }
            }
        }
        return (T) CameraMetadataSafeGetterKt.getSafely(this.cameraProperties.getMetadata(), key);
    }

    public final String getCameraId() {
        return this.cameraId;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Camera2CameraInfo create(CameraProperties cameraProperties) {
            x.f(cameraProperties, "cameraProperties");
            return new Camera2CameraInfo(cameraProperties, null, 2, 0 == true ? 1 : 0);
        }

        public final Camera2CameraInfo from(CameraInfo cameraInfo) {
            x.f(cameraInfo, "cameraInfo");
            Camera2CameraInfo camera2CameraInfo = (Camera2CameraInfo) CameraInfoAdapter.Companion.unwrapAs(cameraInfo, Camera2CameraInfo.class);
            if (camera2CameraInfo == null) {
                throw new IllegalArgumentException("Could not unwrap " + cameraInfo + " as Camera2CameraInfo!");
            }
            if (cameraInfo instanceof AdapterCameraInfo) {
                AdapterCameraInfo adapterCameraInfo = (AdapterCameraInfo) cameraInfo;
                if (adapterCameraInfo.getSessionProcessor() != null) {
                    CameraProperties cameraProperties = camera2CameraInfo.cameraProperties;
                    SessionProcessor sessionProcessor = adapterCameraInfo.getSessionProcessor();
                    return new Camera2CameraInfo(cameraProperties, sessionProcessor != null ? sessionProcessor.getAvailableCharacteristicsKeyValues() : null, null);
                }
            }
            return camera2CameraInfo;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ Camera2CameraInfo(CameraProperties cameraProperties, List list, o oVar) {
        this(cameraProperties, list);
    }

    /* synthetic */ Camera2CameraInfo(CameraProperties cameraProperties, List list, int i2, o oVar) {
        this(cameraProperties, (i2 & 2) != 0 ? null : list);
    }
}
