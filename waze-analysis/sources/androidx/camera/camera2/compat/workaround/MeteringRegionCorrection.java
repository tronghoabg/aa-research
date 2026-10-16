package androidx.camera.camera2.compat.workaround;

import android.graphics.PointF;
import androidx.camera.camera2.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.core.MeteringPoint;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface MeteringRegionCorrection {
    PointF getCorrectedPoint(MeteringPoint meteringPoint, int i2);

    /* compiled from: WazeSource */
    public abstract class Bindings {
        public static final Companion Companion = new Companion(null);

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final MeteringRegionCorrection provideMeteringRegionCorrection(CameraQuirks cameraQuirks) {
                x.f(cameraQuirks, "cameraQuirks");
                return cameraQuirks.getQuirks().contains(AfRegionFlipHorizontallyQuirk.class) ? MeteringRegionQuirkCorrection.INSTANCE : NoOpMeteringRegionCorrection.INSTANCE;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }
}
