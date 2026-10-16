package androidx.camera.camera2.pipe.config;

import android.content.Context;
import android.content.pm.PackageManager;
import c.b.c;
import c.b.e;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraPipeModule_Companion_ProvidePackageManagerFactory implements c<PackageManager> {
    private final e<Context> cameraPipeContextProvider;

    private CameraPipeModule_Companion_ProvidePackageManagerFactory(e<Context> eVar) {
        this.cameraPipeContextProvider = eVar;
    }

    public static CameraPipeModule_Companion_ProvidePackageManagerFactory create(e<Context> eVar) {
        return new CameraPipeModule_Companion_ProvidePackageManagerFactory(eVar);
    }

    public static PackageManager providePackageManager(Context context) {
        PackageManager packageManagerProvidePackageManager = CameraPipeModule.Companion.providePackageManager(context);
        r.g(packageManagerProvidePackageManager);
        return packageManagerProvidePackageManager;
    }

    @Override // g.a.a, f.a.a
    public PackageManager get() {
        return providePackageManager(this.cameraPipeContextProvider.get());
    }
}
