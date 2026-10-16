package androidx.camera.camera2.config;

import android.content.Context;
import androidx.camera.camera2.compat.workaround.ExtraSupportedSurfaceCombinationsContainer;
import androidx.camera.camera2.impl.CameraInteropStateCallbackRepository;
import androidx.camera.camera2.impl.DisplayInfoManager;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraThreadConfig;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraAppConfig {
    private final CameraInteropStateCallbackRepository camera2InteropCallbacks;
    private final CameraCoordinator cameraCoordinator;
    private final CameraPipe cameraPipe;
    private final CameraThreadConfig cameraThreadConfig;
    private final CameraXConfig cameraXConfig;
    private final Context context;

    public CameraAppConfig(Context context, CameraThreadConfig cameraThreadConfig, CameraPipe cameraPipe, CameraInteropStateCallbackRepository cameraInteropStateCallbackRepository, CameraCoordinator cameraCoordinator, CameraXConfig cameraXConfig) {
        x.f(context, "context");
        x.f(cameraThreadConfig, "cameraThreadConfig");
        x.f(cameraPipe, "cameraPipe");
        x.f(cameraInteropStateCallbackRepository, "camera2InteropCallbacks");
        x.f(cameraCoordinator, "cameraCoordinator");
        x.f(cameraXConfig, "cameraXConfig");
        this.context = context;
        this.cameraThreadConfig = cameraThreadConfig;
        this.cameraPipe = cameraPipe;
        this.camera2InteropCallbacks = cameraInteropStateCallbackRepository;
        this.cameraCoordinator = cameraCoordinator;
        this.cameraXConfig = cameraXConfig;
    }

    public final CameraInteropStateCallbackRepository provideCamera2InteropCallbacks() {
        return this.camera2InteropCallbacks;
    }

    public final CameraCoordinator provideCameraCoordinator() {
        return this.cameraCoordinator;
    }

    public final CameraPipe provideCameraPipe() {
        return this.cameraPipe;
    }

    public final CameraThreadConfig provideCameraThreadConfig() {
        return this.cameraThreadConfig;
    }

    public final CameraXConfig provideCameraXConfig() {
        return this.cameraXConfig;
    }

    public final Context provideContext() {
        return this.context;
    }

    public final DisplayInfoManager provideDisplayInfoManager(Context context) {
        x.f(context, "context");
        return DisplayInfoManager.Companion.getInstance(context);
    }

    public final ExtraSupportedSurfaceCombinationsContainer provideExtraSupportedSurfaceCombinationsContainer(CameraXConfig cameraXConfig) {
        x.f(cameraXConfig, "cameraXConfig");
        return new ExtraSupportedSurfaceCombinationsContainer(cameraXConfig.getExtraSupportedSurfaceCombinations());
    }
}
