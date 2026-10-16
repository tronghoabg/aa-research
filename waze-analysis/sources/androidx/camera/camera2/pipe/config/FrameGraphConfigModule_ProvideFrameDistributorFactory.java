package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.internal.FrameDistributor;
import c.b.c;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FrameGraphConfigModule_ProvideFrameDistributorFactory implements c<FrameDistributor> {
    private final FrameGraphConfigModule module;

    private FrameGraphConfigModule_ProvideFrameDistributorFactory(FrameGraphConfigModule frameGraphConfigModule) {
        this.module = frameGraphConfigModule;
    }

    public static FrameGraphConfigModule_ProvideFrameDistributorFactory create(FrameGraphConfigModule frameGraphConfigModule) {
        return new FrameGraphConfigModule_ProvideFrameDistributorFactory(frameGraphConfigModule);
    }

    public static FrameDistributor provideFrameDistributor(FrameGraphConfigModule frameGraphConfigModule) {
        FrameDistributor frameDistributorProvideFrameDistributor = frameGraphConfigModule.provideFrameDistributor();
        r.g(frameDistributorProvideFrameDistributor);
        return frameDistributorProvideFrameDistributor;
    }

    @Override // g.a.a, f.a.a
    public FrameDistributor get() {
        return provideFrameDistributor(this.module);
    }
}
