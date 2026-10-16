package androidx.camera.camera2.pipe.config;

import android.content.Context;
import androidx.camera.featurecombinationquery.CameraDeviceSetupCompatFactory;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraPipeModule_Companion_ProvideCameraDeviceSetupCompatFactoryFactory implements c<CameraDeviceSetupCompatFactory> {
    private final e<Context> cameraPipeContextProvider;

    private CameraPipeModule_Companion_ProvideCameraDeviceSetupCompatFactoryFactory(e<Context> eVar) {
        this.cameraPipeContextProvider = eVar;
    }

    public static CameraPipeModule_Companion_ProvideCameraDeviceSetupCompatFactoryFactory create(e<Context> eVar) {
        return new CameraPipeModule_Companion_ProvideCameraDeviceSetupCompatFactoryFactory(eVar);
    }

    public static CameraDeviceSetupCompatFactory provideCameraDeviceSetupCompatFactory(Context context) {
        return CameraPipeModule.Companion.provideCameraDeviceSetupCompatFactory(context);
    }

    @Override // g.a.a, f.a.a
    public CameraDeviceSetupCompatFactory get() {
        return provideCameraDeviceSetupCompatFactory(this.cameraPipeContextProvider.get());
    }
}
