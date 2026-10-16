package androidx.camera.camera2.compat;

import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.ComboRequestListener;
import androidx.camera.camera2.impl.UseCaseThreads;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class EvCompImpl_Factory implements c<EvCompImpl> {
    private final e<CameraProperties> cameraPropertiesProvider;
    private final e<ComboRequestListener> comboRequestListenerProvider;
    private final e<UseCaseThreads> threadsProvider;

    private EvCompImpl_Factory(e<CameraProperties> eVar, e<UseCaseThreads> eVar2, e<ComboRequestListener> eVar3) {
        this.cameraPropertiesProvider = eVar;
        this.threadsProvider = eVar2;
        this.comboRequestListenerProvider = eVar3;
    }

    public static EvCompImpl_Factory create(e<CameraProperties> eVar, e<UseCaseThreads> eVar2, e<ComboRequestListener> eVar3) {
        return new EvCompImpl_Factory(eVar, eVar2, eVar3);
    }

    public static EvCompImpl newInstance(CameraProperties cameraProperties, UseCaseThreads useCaseThreads, ComboRequestListener comboRequestListener) {
        return new EvCompImpl(cameraProperties, useCaseThreads, comboRequestListener);
    }

    @Override // g.a.a, f.a.a
    public EvCompImpl get() {
        return newInstance(this.cameraPropertiesProvider.get(), this.threadsProvider.get(), this.comboRequestListenerProvider.get());
    }
}
