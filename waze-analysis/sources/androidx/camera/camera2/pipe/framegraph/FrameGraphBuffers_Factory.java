package androidx.camera.camera2.pipe.framegraph;

import androidx.camera.camera2.pipe.CameraGraph;
import c.b.c;
import c.b.e;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FrameGraphBuffers_Factory implements c<FrameGraphBuffers> {
    private final e<CameraGraph> cameraGraphProvider;
    private final e<af> frameGraphCoroutineScopeProvider;

    private FrameGraphBuffers_Factory(e<CameraGraph> eVar, e<af> eVar2) {
        this.cameraGraphProvider = eVar;
        this.frameGraphCoroutineScopeProvider = eVar2;
    }

    public static FrameGraphBuffers_Factory create(e<CameraGraph> eVar, e<af> eVar2) {
        return new FrameGraphBuffers_Factory(eVar, eVar2);
    }

    public static FrameGraphBuffers newInstance(CameraGraph cameraGraph, af afVar) {
        return new FrameGraphBuffers(cameraGraph, afVar);
    }

    @Override // g.a.a, f.a.a
    public FrameGraphBuffers get() {
        return newInstance(this.cameraGraphProvider.get(), this.frameGraphCoroutineScopeProvider.get());
    }
}
