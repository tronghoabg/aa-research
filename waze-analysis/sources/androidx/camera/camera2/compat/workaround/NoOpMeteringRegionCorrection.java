package androidx.camera.camera2.compat.workaround;

import android.graphics.PointF;
import androidx.camera.core.MeteringPoint;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class NoOpMeteringRegionCorrection implements MeteringRegionCorrection {
    public static final NoOpMeteringRegionCorrection INSTANCE = new NoOpMeteringRegionCorrection();

    private NoOpMeteringRegionCorrection() {
    }

    @Override // androidx.camera.camera2.compat.workaround.MeteringRegionCorrection
    public PointF getCorrectedPoint(MeteringPoint meteringPoint, int i2) {
        x.f(meteringPoint, "meteringPoint");
        return new PointF(meteringPoint.getX(), meteringPoint.getY());
    }
}
