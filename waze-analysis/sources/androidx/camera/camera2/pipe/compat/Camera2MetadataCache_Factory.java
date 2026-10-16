package androidx.camera.camera2.pipe.compat;

import android.content.Context;
import androidx.camera.camera2.pipe.core.Permissions;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.TimeSource;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2MetadataCache_Factory implements c.b.c<Camera2MetadataCache> {
    private final c.b.e<Context> cameraPipeContextProvider;
    private final c.b.e<Permissions> permissionsProvider;
    private final c.b.e<Threads> threadsProvider;
    private final c.b.e<TimeSource> timeSourceProvider;

    private Camera2MetadataCache_Factory(c.b.e<Context> eVar, c.b.e<Threads> eVar2, c.b.e<Permissions> eVar3, c.b.e<TimeSource> eVar4) {
        this.cameraPipeContextProvider = eVar;
        this.threadsProvider = eVar2;
        this.permissionsProvider = eVar3;
        this.timeSourceProvider = eVar4;
    }

    public static Camera2MetadataCache_Factory create(c.b.e<Context> eVar, c.b.e<Threads> eVar2, c.b.e<Permissions> eVar3, c.b.e<TimeSource> eVar4) {
        return new Camera2MetadataCache_Factory(eVar, eVar2, eVar3, eVar4);
    }

    public static Camera2MetadataCache newInstance(Context context, Threads threads, Permissions permissions, TimeSource timeSource) {
        return new Camera2MetadataCache(context, threads, permissions, timeSource);
    }

    @Override // g.a.a, f.a.a
    public Camera2MetadataCache get() {
        return newInstance(this.cameraPipeContextProvider.get(), this.threadsProvider.get(), this.permissionsProvider.get(), this.timeSourceProvider.get());
    }
}
