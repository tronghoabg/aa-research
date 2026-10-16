package androidx.camera.camera2.impl;

import androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FlashControl_Factory implements c<FlashControl> {
    private final e<CameraProperties> cameraPropertiesProvider;
    private final e<State3AControl> state3AControlProvider;
    private final e<UseCaseThreads> threadsProvider;
    private final e<TorchControl> torchControlProvider;
    private final e<UseFlashModeTorchFor3aUpdate> useFlashModeTorchFor3aUpdateProvider;

    private FlashControl_Factory(e<CameraProperties> eVar, e<State3AControl> eVar2, e<UseCaseThreads> eVar3, e<TorchControl> eVar4, e<UseFlashModeTorchFor3aUpdate> eVar5) {
        this.cameraPropertiesProvider = eVar;
        this.state3AControlProvider = eVar2;
        this.threadsProvider = eVar3;
        this.torchControlProvider = eVar4;
        this.useFlashModeTorchFor3aUpdateProvider = eVar5;
    }

    public static FlashControl_Factory create(e<CameraProperties> eVar, e<State3AControl> eVar2, e<UseCaseThreads> eVar3, e<TorchControl> eVar4, e<UseFlashModeTorchFor3aUpdate> eVar5) {
        return new FlashControl_Factory(eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static FlashControl newInstance(CameraProperties cameraProperties, State3AControl state3AControl, UseCaseThreads useCaseThreads, TorchControl torchControl, UseFlashModeTorchFor3aUpdate useFlashModeTorchFor3aUpdate) {
        return new FlashControl(cameraProperties, state3AControl, useCaseThreads, torchControl, useFlashModeTorchFor3aUpdate);
    }

    @Override // g.a.a, f.a.a
    public FlashControl get() {
        return newInstance(this.cameraPropertiesProvider.get(), this.state3AControlProvider.get(), this.threadsProvider.get(), this.torchControlProvider.get(), this.useFlashModeTorchFor3aUpdateProvider.get());
    }
}
