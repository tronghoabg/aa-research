package androidx.camera.camera2.impl;

import android.content.Context;
import androidx.camera.camera2.adapter.CameraStateAdapter;
import androidx.camera.camera2.adapter.SupportedSurfaceCombination;
import androidx.camera.camera2.adapter.ZslControl;
import androidx.camera.camera2.config.UseCaseCameraComponent;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import c.b.c;
import c.b.e;
import g.a.a;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UseCaseManager_Factory implements c<UseCaseManager> {
    private final e<UseCaseCameraComponent.Builder> builderProvider;
    private final e<Camera2CameraControl> camera2CameraControlProvider;
    private final e<CameraCoordinator> cameraCoordinatorProvider;
    private final e<CameraGraphConfigProvider> cameraGraphConfigProvider;
    private final e<CameraInfoInternal> cameraInfoInternalProvider;
    private final e<CameraInternal> cameraInternalProvider;
    private final e<CameraPipe> cameraPipeProvider;
    private final e<CameraProperties> cameraPropertiesProvider;
    private final e<CameraStateAdapter> cameraStateAdapterProvider;
    private final e<CameraXConfig> cameraXConfigProvider;
    private final e<Context> contextProvider;
    private final e<Set<UseCaseCameraControl>> controlsProvider;
    private final e<DisplayInfoManager> displayInfoManagerProvider;
    private final e<EncoderProfilesProvider> encoderProfilesProvider;
    private final e<LowLightBoostControl> lowLightBoostControlProvider;
    private final e<SupportedSurfaceCombination> supportedSurfaceCombinationProvider;
    private final e<UseCaseThreads> useCaseThreadsProvider;
    private final e<ZslControl> zslControlProvider;

    private UseCaseManager_Factory(e<CameraPipe> eVar, e<CameraCoordinator> eVar2, e<UseCaseCameraComponent.Builder> eVar3, e<ZslControl> eVar4, e<LowLightBoostControl> eVar5, e<Set<UseCaseCameraControl>> eVar6, e<Camera2CameraControl> eVar7, e<CameraStateAdapter> eVar8, e<CameraInternal> eVar9, e<UseCaseThreads> eVar10, e<CameraInfoInternal> eVar11, e<EncoderProfilesProvider> eVar12, e<CameraProperties> eVar13, e<CameraXConfig> eVar14, e<CameraGraphConfigProvider> eVar15, e<SupportedSurfaceCombination> eVar16, e<Context> eVar17, e<DisplayInfoManager> eVar18) {
        this.cameraPipeProvider = eVar;
        this.cameraCoordinatorProvider = eVar2;
        this.builderProvider = eVar3;
        this.zslControlProvider = eVar4;
        this.lowLightBoostControlProvider = eVar5;
        this.controlsProvider = eVar6;
        this.camera2CameraControlProvider = eVar7;
        this.cameraStateAdapterProvider = eVar8;
        this.cameraInternalProvider = eVar9;
        this.useCaseThreadsProvider = eVar10;
        this.cameraInfoInternalProvider = eVar11;
        this.encoderProfilesProvider = eVar12;
        this.cameraPropertiesProvider = eVar13;
        this.cameraXConfigProvider = eVar14;
        this.cameraGraphConfigProvider = eVar15;
        this.supportedSurfaceCombinationProvider = eVar16;
        this.contextProvider = eVar17;
        this.displayInfoManagerProvider = eVar18;
    }

    public static UseCaseManager_Factory create(e<CameraPipe> eVar, e<CameraCoordinator> eVar2, e<UseCaseCameraComponent.Builder> eVar3, e<ZslControl> eVar4, e<LowLightBoostControl> eVar5, e<Set<UseCaseCameraControl>> eVar6, e<Camera2CameraControl> eVar7, e<CameraStateAdapter> eVar8, e<CameraInternal> eVar9, e<UseCaseThreads> eVar10, e<CameraInfoInternal> eVar11, e<EncoderProfilesProvider> eVar12, e<CameraProperties> eVar13, e<CameraXConfig> eVar14, e<CameraGraphConfigProvider> eVar15, e<SupportedSurfaceCombination> eVar16, e<Context> eVar17, e<DisplayInfoManager> eVar18) {
        return new UseCaseManager_Factory(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16, eVar17, eVar18);
    }

    public static UseCaseManager newInstance(CameraPipe cameraPipe, CameraCoordinator cameraCoordinator, UseCaseCameraComponent.Builder builder, ZslControl zslControl, LowLightBoostControl lowLightBoostControl, Set<UseCaseCameraControl> set, Camera2CameraControl camera2CameraControl, CameraStateAdapter cameraStateAdapter, a<CameraInternal> aVar, a<UseCaseThreads> aVar2, a<CameraInfoInternal> aVar3, EncoderProfilesProvider encoderProfilesProvider, CameraProperties cameraProperties, CameraXConfig cameraXConfig, CameraGraphConfigProvider cameraGraphConfigProvider, SupportedSurfaceCombination supportedSurfaceCombination, Context context, DisplayInfoManager displayInfoManager) {
        return new UseCaseManager(cameraPipe, cameraCoordinator, builder, zslControl, lowLightBoostControl, set, camera2CameraControl, cameraStateAdapter, aVar, aVar2, aVar3, encoderProfilesProvider, cameraProperties, cameraXConfig, cameraGraphConfigProvider, supportedSurfaceCombination, context, displayInfoManager);
    }

    @Override // g.a.a, f.a.a
    public UseCaseManager get() {
        return newInstance(this.cameraPipeProvider.get(), this.cameraCoordinatorProvider.get(), this.builderProvider.get(), this.zslControlProvider.get(), this.lowLightBoostControlProvider.get(), this.controlsProvider.get(), this.camera2CameraControlProvider.get(), this.cameraStateAdapterProvider.get(), this.cameraInternalProvider, this.useCaseThreadsProvider, this.cameraInfoInternalProvider, this.encoderProfilesProvider.get(), this.cameraPropertiesProvider.get(), this.cameraXConfigProvider.get(), this.cameraGraphConfigProvider.get(), this.supportedSurfaceCombinationProvider.get(), this.contextProvider.get(), this.displayInfoManagerProvider.get());
    }
}
