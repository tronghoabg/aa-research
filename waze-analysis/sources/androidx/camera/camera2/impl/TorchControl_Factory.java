package androidx.camera.camera2.impl;

import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TorchControl_Factory implements c<TorchControl> {
    private final e<CameraProperties> cameraPropertiesProvider;
    private final e<State3AControl> state3AControlProvider;
    private final e<UseCaseThreads> threadsProvider;

    private TorchControl_Factory(e<CameraProperties> eVar, e<State3AControl> eVar2, e<UseCaseThreads> eVar3) {
        this.cameraPropertiesProvider = eVar;
        this.state3AControlProvider = eVar2;
        this.threadsProvider = eVar3;
    }

    public static TorchControl_Factory create(e<CameraProperties> eVar, e<State3AControl> eVar2, e<UseCaseThreads> eVar3) {
        return new TorchControl_Factory(eVar, eVar2, eVar3);
    }

    public static TorchControl newInstance(CameraProperties cameraProperties, State3AControl state3AControl, UseCaseThreads useCaseThreads) {
        return new TorchControl(cameraProperties, state3AControl, useCaseThreads);
    }

    @Override // g.a.a, f.a.a
    public TorchControl get() {
        return newInstance(this.cameraPropertiesProvider.get(), this.state3AControlProvider.get(), this.threadsProvider.get());
    }
}
