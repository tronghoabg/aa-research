package androidx.camera.camera2.impl;

import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class StillCaptureRequestControl_Factory implements c<StillCaptureRequestControl> {
    private final e<FlashControl> flashControlProvider;
    private final e<UseCaseThreads> threadsProvider;

    private StillCaptureRequestControl_Factory(e<FlashControl> eVar, e<UseCaseThreads> eVar2) {
        this.flashControlProvider = eVar;
        this.threadsProvider = eVar2;
    }

    public static StillCaptureRequestControl_Factory create(e<FlashControl> eVar, e<UseCaseThreads> eVar2) {
        return new StillCaptureRequestControl_Factory(eVar, eVar2);
    }

    public static StillCaptureRequestControl newInstance(FlashControl flashControl, UseCaseThreads useCaseThreads) {
        return new StillCaptureRequestControl(flashControl, useCaseThreads);
    }

    @Override // g.a.a, f.a.a
    public StillCaptureRequestControl get() {
        return newInstance(this.flashControlProvider.get(), this.threadsProvider.get());
    }
}
