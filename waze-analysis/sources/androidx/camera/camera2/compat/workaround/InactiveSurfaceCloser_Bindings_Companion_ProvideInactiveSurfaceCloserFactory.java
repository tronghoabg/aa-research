package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser;
import c.b.c;
import c.b.e;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class InactiveSurfaceCloser_Bindings_Companion_ProvideInactiveSurfaceCloserFactory implements c<InactiveSurfaceCloser> {
    private final e<CameraQuirks> cameraQuirksProvider;

    private InactiveSurfaceCloser_Bindings_Companion_ProvideInactiveSurfaceCloserFactory(e<CameraQuirks> eVar) {
        this.cameraQuirksProvider = eVar;
    }

    public static InactiveSurfaceCloser_Bindings_Companion_ProvideInactiveSurfaceCloserFactory create(e<CameraQuirks> eVar) {
        return new InactiveSurfaceCloser_Bindings_Companion_ProvideInactiveSurfaceCloserFactory(eVar);
    }

    public static InactiveSurfaceCloser provideInactiveSurfaceCloser(CameraQuirks cameraQuirks) {
        InactiveSurfaceCloser inactiveSurfaceCloserProvideInactiveSurfaceCloser = InactiveSurfaceCloser.Bindings.Companion.provideInactiveSurfaceCloser(cameraQuirks);
        r.g(inactiveSurfaceCloserProvideInactiveSurfaceCloser);
        return inactiveSurfaceCloserProvideInactiveSurfaceCloser;
    }

    @Override // g.a.a, f.a.a
    public InactiveSurfaceCloser get() {
        return provideInactiveSurfaceCloser(this.cameraQuirksProvider.get());
    }
}
