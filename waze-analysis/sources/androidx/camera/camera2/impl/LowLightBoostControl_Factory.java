package androidx.camera.camera2.impl;

import androidx.camera.camera2.pipe.CameraMetadata;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class LowLightBoostControl_Factory implements c<LowLightBoostControl> {
    private final e<CameraMetadata> cameraMetadataProvider;
    private final e<ComboRequestListener> comboRequestListenerProvider;
    private final e<State3AControl> state3AControlProvider;
    private final e<UseCaseThreads> threadsProvider;

    private LowLightBoostControl_Factory(e<CameraMetadata> eVar, e<State3AControl> eVar2, e<UseCaseThreads> eVar3, e<ComboRequestListener> eVar4) {
        this.cameraMetadataProvider = eVar;
        this.state3AControlProvider = eVar2;
        this.threadsProvider = eVar3;
        this.comboRequestListenerProvider = eVar4;
    }

    public static LowLightBoostControl_Factory create(e<CameraMetadata> eVar, e<State3AControl> eVar2, e<UseCaseThreads> eVar3, e<ComboRequestListener> eVar4) {
        return new LowLightBoostControl_Factory(eVar, eVar2, eVar3, eVar4);
    }

    public static LowLightBoostControl newInstance(CameraMetadata cameraMetadata, State3AControl state3AControl, UseCaseThreads useCaseThreads, ComboRequestListener comboRequestListener) {
        return new LowLightBoostControl(cameraMetadata, state3AControl, useCaseThreads, comboRequestListener);
    }

    @Override // g.a.a, f.a.a
    public LowLightBoostControl get() {
        return newInstance(this.cameraMetadataProvider.get(), this.state3AControlProvider.get(), this.threadsProvider.get(), this.comboRequestListenerProvider.get());
    }
}
