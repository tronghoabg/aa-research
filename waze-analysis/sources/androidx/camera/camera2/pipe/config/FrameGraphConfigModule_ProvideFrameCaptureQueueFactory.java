package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.internal.FrameCaptureQueue;
import c.b.c;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FrameGraphConfigModule_ProvideFrameCaptureQueueFactory implements c<FrameCaptureQueue> {
    private final FrameGraphConfigModule module;

    private FrameGraphConfigModule_ProvideFrameCaptureQueueFactory(FrameGraphConfigModule frameGraphConfigModule) {
        this.module = frameGraphConfigModule;
    }

    public static FrameGraphConfigModule_ProvideFrameCaptureQueueFactory create(FrameGraphConfigModule frameGraphConfigModule) {
        return new FrameGraphConfigModule_ProvideFrameCaptureQueueFactory(frameGraphConfigModule);
    }

    public static FrameCaptureQueue provideFrameCaptureQueue(FrameGraphConfigModule frameGraphConfigModule) {
        FrameCaptureQueue frameCaptureQueueProvideFrameCaptureQueue = frameGraphConfigModule.provideFrameCaptureQueue();
        r.g(frameCaptureQueueProvideFrameCaptureQueue);
        return frameCaptureQueueProvideFrameCaptureQueue;
    }

    @Override // g.a.a, f.a.a
    public FrameCaptureQueue get() {
        return provideFrameCaptureQueue(this.module);
    }
}
