package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface InactiveSurfaceCloser {
    void closeAll();

    /* renamed from: configure-hB7JTeY, reason: not valid java name */
    void mo225configurehB7JTeY(int i2, DeferrableSurface deferrableSurface, CameraGraph cameraGraph);

    void onSurfaceInactive(DeferrableSurface deferrableSurface);

    /* compiled from: WazeSource */
    public abstract class Bindings {
        public static final Companion Companion = new Companion(null);

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final InactiveSurfaceCloser provideInactiveSurfaceCloser(CameraQuirks cameraQuirks) {
                x.f(cameraQuirks, "cameraQuirks");
                Quirks quirks = cameraQuirks.getQuirks();
                return (quirks.contains(ConfigureSurfaceToSecondarySessionFailQuirk.class) || quirks.contains(PreviewOrientationIncorrectQuirk.class) || quirks.contains(TextureViewIsClosedQuirk.class)) ? new InactiveSurfaceCloserImpl() : NoOpInactiveSurfaceCloser.INSTANCE;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }
}
