package androidx.camera.camera2.adapter;

import androidx.camera.camera2.impl.EvCompControl;
import androidx.camera.camera2.impl.LowLightBoostControl;
import androidx.camera.camera2.impl.TorchControl;
import androidx.camera.camera2.impl.ZoomControl;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraControlStateAdapter_Factory implements c<CameraControlStateAdapter> {
    private final e<EvCompControl> evCompControlProvider;
    private final e<LowLightBoostControl> lowLightBoostControlProvider;
    private final e<TorchControl> torchControlProvider;
    private final e<ZoomControl> zoomControlProvider;

    private CameraControlStateAdapter_Factory(e<ZoomControl> eVar, e<EvCompControl> eVar2, e<TorchControl> eVar3, e<LowLightBoostControl> eVar4) {
        this.zoomControlProvider = eVar;
        this.evCompControlProvider = eVar2;
        this.torchControlProvider = eVar3;
        this.lowLightBoostControlProvider = eVar4;
    }

    public static CameraControlStateAdapter_Factory create(e<ZoomControl> eVar, e<EvCompControl> eVar2, e<TorchControl> eVar3, e<LowLightBoostControl> eVar4) {
        return new CameraControlStateAdapter_Factory(eVar, eVar2, eVar3, eVar4);
    }

    public static CameraControlStateAdapter newInstance(ZoomControl zoomControl, EvCompControl evCompControl, TorchControl torchControl, LowLightBoostControl lowLightBoostControl) {
        return new CameraControlStateAdapter(zoomControl, evCompControl, torchControl, lowLightBoostControl);
    }

    @Override // g.a.a, f.a.a
    public CameraControlStateAdapter get() {
        return newInstance(this.zoomControlProvider.get(), this.evCompControlProvider.get(), this.torchControlProvider.get(), this.lowLightBoostControlProvider.get());
    }
}
