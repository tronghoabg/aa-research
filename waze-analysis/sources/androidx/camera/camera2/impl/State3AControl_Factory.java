package androidx.camera.camera2.impl;

import androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class State3AControl_Factory implements c<State3AControl> {
    private final e<AutoFlashAEModeDisabler> aeModeDisablerProvider;
    private final e<CameraProperties> cameraPropertiesProvider;
    private final e<UseCaseThreads> threadsProvider;

    private State3AControl_Factory(e<CameraProperties> eVar, e<AutoFlashAEModeDisabler> eVar2, e<UseCaseThreads> eVar3) {
        this.cameraPropertiesProvider = eVar;
        this.aeModeDisablerProvider = eVar2;
        this.threadsProvider = eVar3;
    }

    public static State3AControl_Factory create(e<CameraProperties> eVar, e<AutoFlashAEModeDisabler> eVar2, e<UseCaseThreads> eVar3) {
        return new State3AControl_Factory(eVar, eVar2, eVar3);
    }

    public static State3AControl newInstance(CameraProperties cameraProperties, AutoFlashAEModeDisabler autoFlashAEModeDisabler, UseCaseThreads useCaseThreads) {
        return new State3AControl(cameraProperties, autoFlashAEModeDisabler, useCaseThreads);
    }

    @Override // g.a.a, f.a.a
    public State3AControl get() {
        return newInstance(this.cameraPropertiesProvider.get(), this.aeModeDisablerProvider.get(), this.threadsProvider.get());
    }
}
