package androidx.camera.core;

import androidx.camera.core.impl.AdapterCameraInfo;
import androidx.camera.core.impl.Identifier;
import androidx.core.util.Preconditions;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraIdentifier {
    private final List<String> cameraIds;
    private final Identifier compatibilityId;

    private CameraIdentifier(List<String> list, Identifier identifier) {
        this.cameraIds = list;
        this.compatibilityId = identifier;
        Preconditions.checkArgument(!list.isEmpty(), "Camera ID set cannot be empty.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraIdentifier)) {
            return false;
        }
        CameraIdentifier cameraIdentifier = (CameraIdentifier) obj;
        return x.n(this.cameraIds, cameraIdentifier.cameraIds) && x.n(this.compatibilityId, cameraIdentifier.compatibilityId);
    }

    public final List<String> getCameraIds() {
        return this.cameraIds;
    }

    public final Identifier getCompatibilityId() {
        return this.compatibilityId;
    }

    public final String getInternalId() {
        Preconditions.checkState(this.cameraIds.size() == 1, "getInternalId() is only available for single-camera identifiers.");
        return (String) i.P(this.cameraIds);
    }

    public int hashCode() {
        int iHashCode = this.cameraIds.hashCode() * 31;
        Identifier identifier = this.compatibilityId;
        return iHashCode + (identifier != null ? identifier.hashCode() : 0);
    }

    public final boolean isOf(Camera camera) {
        x.f(camera, "camera");
        Preconditions.checkNotNull(camera);
        return x.n(this, camera.getCameraInfo().getCameraIdentifier());
    }

    public String toString() throws IOException {
        String strConcat;
        String strAM = i.aM(this.cameraIds, ",", null, null, 0, null, 62);
        Identifier identifier = this.compatibilityId;
        if (identifier != null) {
            Objects.toString(identifier);
            strConcat = ", compatId=".concat(identifier.toString());
        } else {
            strConcat = "";
        }
        return "CameraIdentifier{cameraIds=" + strAM + strConcat + "}";
    }

    /* compiled from: WazeSource */
    public final class Factory {
        public static final Factory INSTANCE = new Factory();

        private Factory() {
        }

        public static final CameraIdentifier create(String str, String str2, Identifier identifier) {
            x.f(str, "primaryCameraId");
            List listL = i.l(str);
            if (str2 != null) {
                listL.add(str2);
            }
            return create((List<String>) listL, identifier);
        }

        public static /* synthetic */ CameraIdentifier create$default(String str, String str2, Identifier identifier, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                str2 = null;
            }
            if ((i2 & 4) != 0) {
                identifier = null;
            }
            return create(str, str2, identifier);
        }

        public static final CameraIdentifier fromAdapterInfos(AdapterCameraInfo adapterCameraInfo, AdapterCameraInfo adapterCameraInfo2) {
            x.f(adapterCameraInfo, "primaryInfo");
            String cameraId = adapterCameraInfo2 != null ? adapterCameraInfo2.getCameraId() : null;
            Identifier compatibilityId = adapterCameraInfo.getCameraConfig().getCompatibilityId();
            x.e(compatibilityId, "getCompatibilityId(...)");
            String cameraId2 = adapterCameraInfo.getCameraId();
            x.e(cameraId2, "getCameraId(...)");
            return create(cameraId2, cameraId, compatibilityId);
        }

        public static /* synthetic */ CameraIdentifier create$default(List list, Identifier identifier, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                identifier = null;
            }
            return create((List<String>) list, identifier);
        }

        public static final CameraIdentifier create(String str, String str2) {
            x.f(str, "primaryCameraId");
            return create$default(str, str2, null, 4, null);
        }

        public static final CameraIdentifier create(List<String> list) {
            x.f(list, "cameraIds");
            return create$default(list, null, 2, null);
        }

        public static final CameraIdentifier create(String str) {
            x.f(str, "primaryCameraId");
            return create$default(str, null, null, 6, null);
        }

        public static final CameraIdentifier create(List<String> list, Identifier identifier) {
            x.f(list, "cameraIds");
            return new CameraIdentifier(list, identifier, null);
        }
    }

    public /* synthetic */ CameraIdentifier(List list, Identifier identifier, o oVar) {
        this(list, identifier);
    }

    public final boolean isOf(CameraInfo cameraInfo) {
        x.f(cameraInfo, "cameraInfo");
        Preconditions.checkNotNull(cameraInfo);
        return x.n(this, cameraInfo.getCameraIdentifier());
    }
}
