package androidx.camera.camera2.impl;

import androidx.camera.camera2.compat.ZoomCompat;
import androidx.camera.camera2.compat.workaround.MeteringRegionCorrection;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FocusMeteringControl_Factory implements c<FocusMeteringControl> {
    private final e<CameraProperties> cameraPropertiesProvider;
    private final e<MeteringRegionCorrection> meteringRegionCorrectionProvider;
    private final e<State3AControl> state3AControlProvider;
    private final e<UseCaseThreads> threadsProvider;
    private final e<ZoomCompat> zoomCompatProvider;

    private FocusMeteringControl_Factory(e<CameraProperties> eVar, e<MeteringRegionCorrection> eVar2, e<State3AControl> eVar3, e<UseCaseThreads> eVar4, e<ZoomCompat> eVar5) {
        this.cameraPropertiesProvider = eVar;
        this.meteringRegionCorrectionProvider = eVar2;
        this.state3AControlProvider = eVar3;
        this.threadsProvider = eVar4;
        this.zoomCompatProvider = eVar5;
    }

    public static FocusMeteringControl_Factory create(e<CameraProperties> eVar, e<MeteringRegionCorrection> eVar2, e<State3AControl> eVar3, e<UseCaseThreads> eVar4, e<ZoomCompat> eVar5) {
        return new FocusMeteringControl_Factory(eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static FocusMeteringControl newInstance(CameraProperties cameraProperties, MeteringRegionCorrection meteringRegionCorrection, State3AControl state3AControl, UseCaseThreads useCaseThreads, ZoomCompat zoomCompat) {
        return new FocusMeteringControl(cameraProperties, meteringRegionCorrection, state3AControl, useCaseThreads, zoomCompat);
    }

    @Override // g.a.a, f.a.a
    public FocusMeteringControl get() {
        return newInstance(this.cameraPropertiesProvider.get(), this.meteringRegionCorrectionProvider.get(), this.state3AControlProvider.get(), this.threadsProvider.get(), this.zoomCompatProvider.get());
    }
}
