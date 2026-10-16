package androidx.camera.core;

import androidx.camera.core.impl.CameraConfig;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface Camera {
    CameraControl getCameraControl();

    CameraInfo getCameraInfo();

    CameraConfig getExtendedConfig();

    boolean isUseCasesCombinationSupported(boolean z, UseCase... useCaseArr);

    boolean isUseCasesCombinationSupported(UseCase... useCaseArr);

    boolean isUseCasesCombinationSupportedByFramework(UseCase... useCaseArr);

    void setCompositionSettings(List<CompositionSettings> list);

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.Camera$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$isUseCasesCombinationSupported(Camera camera, boolean z, UseCase... useCaseArr) {
            return true;
        }

        public static void $default$setCompositionSettings(Camera camera, List list) {
        }
    }
}
