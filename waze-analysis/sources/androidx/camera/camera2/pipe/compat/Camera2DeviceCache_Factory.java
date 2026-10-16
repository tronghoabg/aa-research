package androidx.camera.camera2.pipe.compat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import androidx.camera.camera2.pipe.internal.CameraPipeLifetime;
import androidx.camera.featurecombinationquery.CameraDeviceSetupCompatFactory;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2DeviceCache_Factory implements c.b.c<Camera2DeviceCache> {
    private final c.b.e<CameraDeviceSetupCompatFactory> cameraDeviceSetupCompatFactoryProvider;
    private final c.b.e<CameraErrorListener> cameraErrorListenerProvider;
    private final c.b.e<CameraManager> cameraManagerProvider;
    private final c.b.e<br> cameraPipeJobProvider;
    private final c.b.e<CameraPipeLifetime> cameraPipeLifetimeProvider;
    private final c.b.e<Context> contextProvider;
    private final c.b.e<Camera2MetadataProvider> metadataProvider;
    private final c.b.e<PackageManager> packageManagerProvider;
    private final c.b.e<Threads> threadsProvider;

    private Camera2DeviceCache_Factory(c.b.e<CameraManager> eVar, c.b.e<Camera2MetadataProvider> eVar2, c.b.e<Threads> eVar3, c.b.e<Context> eVar4, c.b.e<PackageManager> eVar5, c.b.e<CameraErrorListener> eVar6, c.b.e<CameraDeviceSetupCompatFactory> eVar7, c.b.e<CameraPipeLifetime> eVar8, c.b.e<br> eVar9) {
        this.cameraManagerProvider = eVar;
        this.metadataProvider = eVar2;
        this.threadsProvider = eVar3;
        this.contextProvider = eVar4;
        this.packageManagerProvider = eVar5;
        this.cameraErrorListenerProvider = eVar6;
        this.cameraDeviceSetupCompatFactoryProvider = eVar7;
        this.cameraPipeLifetimeProvider = eVar8;
        this.cameraPipeJobProvider = eVar9;
    }

    public static Camera2DeviceCache_Factory create(c.b.e<CameraManager> eVar, c.b.e<Camera2MetadataProvider> eVar2, c.b.e<Threads> eVar3, c.b.e<Context> eVar4, c.b.e<PackageManager> eVar5, c.b.e<CameraErrorListener> eVar6, c.b.e<CameraDeviceSetupCompatFactory> eVar7, c.b.e<CameraPipeLifetime> eVar8, c.b.e<br> eVar9) {
        return new Camera2DeviceCache_Factory(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9);
    }

    public static Camera2DeviceCache newInstance(g.a.a<CameraManager> aVar, Camera2MetadataProvider camera2MetadataProvider, Threads threads, Context context, PackageManager packageManager, CameraErrorListener cameraErrorListener, g.a.a<CameraDeviceSetupCompatFactory> aVar2, CameraPipeLifetime cameraPipeLifetime, br brVar) {
        return new Camera2DeviceCache(aVar, camera2MetadataProvider, threads, context, packageManager, cameraErrorListener, aVar2, cameraPipeLifetime, brVar);
    }

    @Override // g.a.a, f.a.a
    public Camera2DeviceCache get() {
        Camera2MetadataProvider camera2MetadataProvider = this.metadataProvider.get();
        Threads threads = this.threadsProvider.get();
        Context context = this.contextProvider.get();
        PackageManager packageManager = this.packageManagerProvider.get();
        CameraErrorListener cameraErrorListener = this.cameraErrorListenerProvider.get();
        CameraPipeLifetime cameraPipeLifetime = this.cameraPipeLifetimeProvider.get();
        br brVar = this.cameraPipeJobProvider.get();
        return newInstance(this.cameraManagerProvider, camera2MetadataProvider, threads, context, packageManager, cameraErrorListener, this.cameraDeviceSetupCompatFactoryProvider, cameraPipeLifetime, brVar);
    }
}
