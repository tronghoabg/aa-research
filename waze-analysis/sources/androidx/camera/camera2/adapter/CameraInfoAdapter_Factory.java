package androidx.camera.camera2.adapter;

import androidx.camera.camera2.compat.StreamConfigurationMapCompat;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.config.CameraConfig;
import androidx.camera.camera2.impl.CameraCallbackMap;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.FocusMeteringControl;
import androidx.camera.camera2.impl.NightModeIndicatorMonitor;
import androidx.camera.camera2.internal.IntrinsicZoomCalculator;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.internal.StreamSpecsCalculator;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraInfoAdapter_Factory implements c<CameraInfoAdapter> {
    private final e<CameraCallbackMap> cameraCallbackMapProvider;
    private final e<CameraConfig> cameraConfigProvider;
    private final e<CameraControlStateAdapter> cameraControlStateAdapterProvider;
    private final e<CameraProperties> cameraPropertiesProvider;
    private final e<CameraQuirks> cameraQuirksProvider;
    private final e<CameraSessionLifecycleAdapter> cameraSessionLifecycleAdapterProvider;
    private final e<CameraStateAdapter> cameraStateAdapterProvider;
    private final e<EncoderProfilesProvider> encoderProfilesProvider;
    private final e<FocusMeteringControl> focusMeteringControlProvider;
    private final e<IntrinsicZoomCalculator> intrinsicZoomCalculatorProvider;
    private final e<NightModeIndicatorMonitor> nightModeIndicatorMonitorProvider;
    private final e<StreamConfigurationMapCompat> streamConfigurationMapCompatProvider;
    private final e<StreamSpecsCalculator> streamSpecsCalculatorProvider;

    private CameraInfoAdapter_Factory(e<CameraProperties> eVar, e<CameraConfig> eVar2, e<CameraStateAdapter> eVar3, e<CameraControlStateAdapter> eVar4, e<NightModeIndicatorMonitor> eVar5, e<CameraCallbackMap> eVar6, e<FocusMeteringControl> eVar7, e<CameraQuirks> eVar8, e<EncoderProfilesProvider> eVar9, e<StreamConfigurationMapCompat> eVar10, e<IntrinsicZoomCalculator> eVar11, e<StreamSpecsCalculator> eVar12, e<CameraSessionLifecycleAdapter> eVar13) {
        this.cameraPropertiesProvider = eVar;
        this.cameraConfigProvider = eVar2;
        this.cameraStateAdapterProvider = eVar3;
        this.cameraControlStateAdapterProvider = eVar4;
        this.nightModeIndicatorMonitorProvider = eVar5;
        this.cameraCallbackMapProvider = eVar6;
        this.focusMeteringControlProvider = eVar7;
        this.cameraQuirksProvider = eVar8;
        this.encoderProfilesProvider = eVar9;
        this.streamConfigurationMapCompatProvider = eVar10;
        this.intrinsicZoomCalculatorProvider = eVar11;
        this.streamSpecsCalculatorProvider = eVar12;
        this.cameraSessionLifecycleAdapterProvider = eVar13;
    }

    public static CameraInfoAdapter_Factory create(e<CameraProperties> eVar, e<CameraConfig> eVar2, e<CameraStateAdapter> eVar3, e<CameraControlStateAdapter> eVar4, e<NightModeIndicatorMonitor> eVar5, e<CameraCallbackMap> eVar6, e<FocusMeteringControl> eVar7, e<CameraQuirks> eVar8, e<EncoderProfilesProvider> eVar9, e<StreamConfigurationMapCompat> eVar10, e<IntrinsicZoomCalculator> eVar11, e<StreamSpecsCalculator> eVar12, e<CameraSessionLifecycleAdapter> eVar13) {
        return new CameraInfoAdapter_Factory(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13);
    }

    public static CameraInfoAdapter newInstance(CameraProperties cameraProperties, CameraConfig cameraConfig, CameraStateAdapter cameraStateAdapter, CameraControlStateAdapter cameraControlStateAdapter, NightModeIndicatorMonitor nightModeIndicatorMonitor, CameraCallbackMap cameraCallbackMap, FocusMeteringControl focusMeteringControl, CameraQuirks cameraQuirks, EncoderProfilesProvider encoderProfilesProvider, StreamConfigurationMapCompat streamConfigurationMapCompat, IntrinsicZoomCalculator intrinsicZoomCalculator, StreamSpecsCalculator streamSpecsCalculator, CameraSessionLifecycleAdapter cameraSessionLifecycleAdapter) {
        return new CameraInfoAdapter(cameraProperties, cameraConfig, cameraStateAdapter, cameraControlStateAdapter, nightModeIndicatorMonitor, cameraCallbackMap, focusMeteringControl, cameraQuirks, encoderProfilesProvider, streamConfigurationMapCompat, intrinsicZoomCalculator, streamSpecsCalculator, cameraSessionLifecycleAdapter);
    }

    @Override // g.a.a, f.a.a
    public CameraInfoAdapter get() {
        return newInstance(this.cameraPropertiesProvider.get(), this.cameraConfigProvider.get(), this.cameraStateAdapterProvider.get(), this.cameraControlStateAdapterProvider.get(), this.nightModeIndicatorMonitorProvider.get(), this.cameraCallbackMapProvider.get(), this.focusMeteringControlProvider.get(), this.cameraQuirksProvider.get(), this.encoderProfilesProvider.get(), this.streamConfigurationMapCompatProvider.get(), this.intrinsicZoomCalculatorProvider.get(), this.streamSpecsCalculatorProvider.get(), this.cameraSessionLifecycleAdapterProvider.get());
    }
}
