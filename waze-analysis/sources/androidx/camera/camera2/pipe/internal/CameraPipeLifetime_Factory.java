package androidx.camera.camera2.pipe.internal;

import c.b.c;
import c.b.e;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraPipeLifetime_Factory implements c<CameraPipeLifetime> {
    private final e<br> cameraPipeJobProvider;

    private CameraPipeLifetime_Factory(e<br> eVar) {
        this.cameraPipeJobProvider = eVar;
    }

    public static CameraPipeLifetime_Factory create(e<br> eVar) {
        return new CameraPipeLifetime_Factory(eVar);
    }

    public static CameraPipeLifetime newInstance(br brVar) {
        return new CameraPipeLifetime(brVar);
    }

    @Override // g.a.a, f.a.a
    public CameraPipeLifetime get() {
        return newInstance(this.cameraPipeJobProvider.get());
    }
}
