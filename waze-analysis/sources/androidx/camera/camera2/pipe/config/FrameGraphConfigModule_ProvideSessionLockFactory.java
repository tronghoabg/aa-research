package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.internal.GraphSessionLock;
import c.b.c;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FrameGraphConfigModule_ProvideSessionLockFactory implements c<GraphSessionLock> {
    private final FrameGraphConfigModule module;

    private FrameGraphConfigModule_ProvideSessionLockFactory(FrameGraphConfigModule frameGraphConfigModule) {
        this.module = frameGraphConfigModule;
    }

    public static FrameGraphConfigModule_ProvideSessionLockFactory create(FrameGraphConfigModule frameGraphConfigModule) {
        return new FrameGraphConfigModule_ProvideSessionLockFactory(frameGraphConfigModule);
    }

    public static GraphSessionLock provideSessionLock(FrameGraphConfigModule frameGraphConfigModule) {
        GraphSessionLock graphSessionLockProvideSessionLock = frameGraphConfigModule.provideSessionLock();
        r.g(graphSessionLockProvideSessionLock);
        return graphSessionLockProvideSessionLock;
    }

    @Override // g.a.a, f.a.a
    public GraphSessionLock get() {
        return provideSessionLock(this.module);
    }
}
