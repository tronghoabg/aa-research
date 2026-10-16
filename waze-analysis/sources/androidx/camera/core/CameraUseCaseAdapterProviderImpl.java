package androidx.camera.core;

import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.AdapterCameraInfo;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.core.internal.StreamSpecsCalculator;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraUseCaseAdapterProviderImpl implements CameraUseCaseAdapterProvider {
    private final CameraCoordinator cameraCoordinator;
    private final CameraRepository cameraRepository;
    private final StreamSpecsCalculator streamSpecsCalculator;
    private final UseCaseConfigFactory useCaseConfigFactory;

    public CameraUseCaseAdapterProviderImpl(CameraRepository cameraRepository, CameraCoordinator cameraCoordinator, UseCaseConfigFactory useCaseConfigFactory, StreamSpecsCalculator streamSpecsCalculator) {
        x.f(cameraRepository, "cameraRepository");
        x.f(cameraCoordinator, "cameraCoordinator");
        x.f(useCaseConfigFactory, "useCaseConfigFactory");
        x.f(streamSpecsCalculator, "streamSpecsCalculator");
        this.cameraRepository = cameraRepository;
        this.cameraCoordinator = cameraCoordinator;
        this.useCaseConfigFactory = useCaseConfigFactory;
        this.streamSpecsCalculator = streamSpecsCalculator;
    }

    private final CameraUseCaseAdapter provideInternal(CameraInternal cameraInternal, CameraInternal cameraInternal2, AdapterCameraInfo adapterCameraInfo, AdapterCameraInfo adapterCameraInfo2, CompositionSettings compositionSettings, CompositionSettings compositionSettings2) {
        return new CameraUseCaseAdapter(cameraInternal, cameraInternal2, adapterCameraInfo, adapterCameraInfo2, compositionSettings, compositionSettings2, this.cameraCoordinator, this.streamSpecsCalculator, this.useCaseConfigFactory);
    }

    static /* synthetic */ CameraUseCaseAdapter provideInternal$default(CameraUseCaseAdapterProviderImpl cameraUseCaseAdapterProviderImpl, CameraInternal cameraInternal, CameraInternal cameraInternal2, AdapterCameraInfo adapterCameraInfo, AdapterCameraInfo adapterCameraInfo2, CompositionSettings compositionSettings, CompositionSettings compositionSettings2, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            compositionSettings = CompositionSettings.DEFAULT;
            x.e(compositionSettings, "DEFAULT");
        }
        CompositionSettings compositionSettings3 = compositionSettings;
        if ((i2 & 32) != 0) {
            compositionSettings2 = CompositionSettings.DEFAULT;
            x.e(compositionSettings2, "DEFAULT");
        }
        CompositionSettings compositionSettings4 = compositionSettings2;
        int i3 = i2 & 2;
        return cameraUseCaseAdapterProviderImpl.provideInternal(cameraInternal, i3 != 0 ? null : cameraInternal2, adapterCameraInfo, (i2 & 8) != 0 ? null : adapterCameraInfo2, compositionSettings3, compositionSettings4);
    }

    @Override // androidx.camera.core.CameraUseCaseAdapterProvider
    public CameraUseCaseAdapter provide(String str) {
        x.f(str, "cameraId");
        CameraInternal camera = this.cameraRepository.getCamera(str);
        x.e(camera, "getCamera(...)");
        return provideInternal$default(this, camera, null, new AdapterCameraInfo(camera.getCameraInfoInternal(), CameraConfigs.defaultConfig()), null, null, null, 58, null);
    }

    @Override // androidx.camera.core.CameraUseCaseAdapterProvider
    public CameraUseCaseAdapter provide(CameraInternal cameraInternal, CameraInternal cameraInternal2, AdapterCameraInfo adapterCameraInfo, AdapterCameraInfo adapterCameraInfo2, CompositionSettings compositionSettings, CompositionSettings compositionSettings2) {
        x.f(cameraInternal, "camera");
        x.f(adapterCameraInfo, "adapterCameraInfo");
        x.f(compositionSettings, "compositionSettings");
        x.f(compositionSettings2, "secondaryCompositionSettings");
        return provideInternal(cameraInternal, cameraInternal2, adapterCameraInfo, adapterCameraInfo2, compositionSettings, compositionSettings2);
    }
}
