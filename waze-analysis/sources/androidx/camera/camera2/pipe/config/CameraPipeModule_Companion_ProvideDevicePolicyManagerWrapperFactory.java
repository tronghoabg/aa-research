package androidx.camera.camera2.pipe.config;

import android.content.Context;
import androidx.camera.camera2.pipe.compat.DevicePolicyManagerWrapper;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraPipeModule_Companion_ProvideDevicePolicyManagerWrapperFactory implements c<DevicePolicyManagerWrapper> {
    private final e<Context> cameraPipeContextProvider;

    private CameraPipeModule_Companion_ProvideDevicePolicyManagerWrapperFactory(e<Context> eVar) {
        this.cameraPipeContextProvider = eVar;
    }

    public static CameraPipeModule_Companion_ProvideDevicePolicyManagerWrapperFactory create(e<Context> eVar) {
        return new CameraPipeModule_Companion_ProvideDevicePolicyManagerWrapperFactory(eVar);
    }

    public static DevicePolicyManagerWrapper provideDevicePolicyManagerWrapper(Context context) {
        return CameraPipeModule.Companion.provideDevicePolicyManagerWrapper(context);
    }

    @Override // g.a.a, f.a.a
    public DevicePolicyManagerWrapper get() {
        return provideDevicePolicyManagerWrapper(this.cameraPipeContextProvider.get());
    }
}
