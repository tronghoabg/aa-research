package androidx.camera.camera2.pipe.compat;

import android.content.Context;
import androidx.camera.camera2.pipe.config.Camera2ControllerComponent;
import androidx.camera.camera2.pipe.core.Threads;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2Backend_Factory implements c.b.c<Camera2Backend> {
    private final c.b.e<Camera2ControllerComponent.Builder> camera2CameraControllerComponentProvider;
    private final c.b.e<Camera2DeviceCache> camera2DeviceCacheProvider;
    private final c.b.e<Camera2DeviceManager> camera2DeviceManagerProvider;
    private final c.b.e<Camera2MetadataCache> camera2MetadataCacheProvider;
    private final c.b.e<Context> cameraPipeContextProvider;
    private final c.b.e<Threads> threadsProvider;

    private Camera2Backend_Factory(c.b.e<Threads> eVar, c.b.e<Camera2DeviceCache> eVar2, c.b.e<Camera2MetadataCache> eVar3, c.b.e<Camera2DeviceManager> eVar4, c.b.e<Camera2ControllerComponent.Builder> eVar5, c.b.e<Context> eVar6) {
        this.threadsProvider = eVar;
        this.camera2DeviceCacheProvider = eVar2;
        this.camera2MetadataCacheProvider = eVar3;
        this.camera2DeviceManagerProvider = eVar4;
        this.camera2CameraControllerComponentProvider = eVar5;
        this.cameraPipeContextProvider = eVar6;
    }

    public static Camera2Backend_Factory create(c.b.e<Threads> eVar, c.b.e<Camera2DeviceCache> eVar2, c.b.e<Camera2MetadataCache> eVar3, c.b.e<Camera2DeviceManager> eVar4, c.b.e<Camera2ControllerComponent.Builder> eVar5, c.b.e<Context> eVar6) {
        return new Camera2Backend_Factory(eVar, eVar2, eVar3, eVar4, eVar5, eVar6);
    }

    public static Camera2Backend newInstance(Threads threads, Camera2DeviceCache camera2DeviceCache, Camera2MetadataCache camera2MetadataCache, Camera2DeviceManager camera2DeviceManager, Camera2ControllerComponent.Builder builder, Context context) {
        return new Camera2Backend(threads, camera2DeviceCache, camera2MetadataCache, camera2DeviceManager, builder, context);
    }

    @Override // g.a.a, f.a.a
    public Camera2Backend get() {
        return newInstance(this.threadsProvider.get(), this.camera2DeviceCacheProvider.get(), this.camera2MetadataCacheProvider.get(), this.camera2DeviceManagerProvider.get(), this.camera2CameraControllerComponentProvider.get(), this.cameraPipeContextProvider.get());
    }
}
