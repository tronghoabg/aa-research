package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.graph.Controller3A;
import c.b.c;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FrameGraphConfigModule_ProvideController3AFactory implements c<Controller3A> {
    private final FrameGraphConfigModule module;

    private FrameGraphConfigModule_ProvideController3AFactory(FrameGraphConfigModule frameGraphConfigModule) {
        this.module = frameGraphConfigModule;
    }

    public static FrameGraphConfigModule_ProvideController3AFactory create(FrameGraphConfigModule frameGraphConfigModule) {
        return new FrameGraphConfigModule_ProvideController3AFactory(frameGraphConfigModule);
    }

    public static Controller3A provideController3A(FrameGraphConfigModule frameGraphConfigModule) {
        Controller3A controller3AProvideController3A = frameGraphConfigModule.provideController3A();
        r.g(controller3AProvideController3A);
        return controller3AProvideController3A;
    }

    @Override // g.a.a, f.a.a
    public Controller3A get() {
        return provideController3A(this.module);
    }
}
