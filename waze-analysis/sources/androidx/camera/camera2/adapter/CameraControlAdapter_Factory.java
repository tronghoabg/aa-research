package androidx.camera.camera2.adapter;

import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.EvCompControl;
import androidx.camera.camera2.impl.FlashControl;
import androidx.camera.camera2.impl.FocusMeteringControl;
import androidx.camera.camera2.impl.LowLightBoostControl;
import androidx.camera.camera2.impl.StillCaptureRequestControl;
import androidx.camera.camera2.impl.TorchControl;
import androidx.camera.camera2.impl.UseCaseManager;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.camera2.impl.VideoUsageControl;
import androidx.camera.camera2.impl.ZoomControl;
import androidx.camera.camera2.interop.Camera2CameraControl;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraControlAdapter_Factory implements c<CameraControlAdapter> {
    private final e<Camera2CameraControl> camera2cameraControlProvider;
    private final e<CameraProperties> cameraPropertiesProvider;
    private final e<EvCompControl> evCompControlProvider;
    private final e<FlashControl> flashControlProvider;
    private final e<FocusMeteringControl> focusMeteringControlProvider;
    private final e<LowLightBoostControl> lowLightBoostControlProvider;
    private final e<StillCaptureRequestControl> stillCaptureRequestControlProvider;
    private final e<UseCaseThreads> threadsProvider;
    private final e<TorchControl> torchControlProvider;
    private final e<UseCaseManager> useCaseManagerProvider;
    private final e<VideoUsageControl> videoUsageControlProvider;
    private final e<ZoomControl> zoomControlProvider;
    private final e<ZslControl> zslControlProvider;

    private CameraControlAdapter_Factory(e<CameraProperties> eVar, e<EvCompControl> eVar2, e<FlashControl> eVar3, e<FocusMeteringControl> eVar4, e<StillCaptureRequestControl> eVar5, e<TorchControl> eVar6, e<LowLightBoostControl> eVar7, e<ZoomControl> eVar8, e<ZslControl> eVar9, e<Camera2CameraControl> eVar10, e<UseCaseManager> eVar11, e<UseCaseThreads> eVar12, e<VideoUsageControl> eVar13) {
        this.cameraPropertiesProvider = eVar;
        this.evCompControlProvider = eVar2;
        this.flashControlProvider = eVar3;
        this.focusMeteringControlProvider = eVar4;
        this.stillCaptureRequestControlProvider = eVar5;
        this.torchControlProvider = eVar6;
        this.lowLightBoostControlProvider = eVar7;
        this.zoomControlProvider = eVar8;
        this.zslControlProvider = eVar9;
        this.camera2cameraControlProvider = eVar10;
        this.useCaseManagerProvider = eVar11;
        this.threadsProvider = eVar12;
        this.videoUsageControlProvider = eVar13;
    }

    public static CameraControlAdapter_Factory create(e<CameraProperties> eVar, e<EvCompControl> eVar2, e<FlashControl> eVar3, e<FocusMeteringControl> eVar4, e<StillCaptureRequestControl> eVar5, e<TorchControl> eVar6, e<LowLightBoostControl> eVar7, e<ZoomControl> eVar8, e<ZslControl> eVar9, e<Camera2CameraControl> eVar10, e<UseCaseManager> eVar11, e<UseCaseThreads> eVar12, e<VideoUsageControl> eVar13) {
        return new CameraControlAdapter_Factory(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13);
    }

    public static CameraControlAdapter newInstance(CameraProperties cameraProperties, EvCompControl evCompControl, FlashControl flashControl, FocusMeteringControl focusMeteringControl, StillCaptureRequestControl stillCaptureRequestControl, TorchControl torchControl, LowLightBoostControl lowLightBoostControl, ZoomControl zoomControl, ZslControl zslControl, Camera2CameraControl camera2CameraControl, UseCaseManager useCaseManager, UseCaseThreads useCaseThreads, VideoUsageControl videoUsageControl) {
        return new CameraControlAdapter(cameraProperties, evCompControl, flashControl, focusMeteringControl, stillCaptureRequestControl, torchControl, lowLightBoostControl, zoomControl, zslControl, camera2CameraControl, useCaseManager, useCaseThreads, videoUsageControl);
    }

    @Override // g.a.a, f.a.a
    public CameraControlAdapter get() {
        return newInstance(this.cameraPropertiesProvider.get(), this.evCompControlProvider.get(), this.flashControlProvider.get(), this.focusMeteringControlProvider.get(), this.stillCaptureRequestControlProvider.get(), this.torchControlProvider.get(), this.lowLightBoostControlProvider.get(), this.zoomControlProvider.get(), this.zslControlProvider.get(), this.camera2cameraControlProvider.get(), this.useCaseManagerProvider.get(), this.threadsProvider.get(), this.videoUsageControlProvider.get());
    }
}
