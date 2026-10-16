package androidx.camera.camera2.compat.workaround;

import android.graphics.PointF;
import androidx.camera.core.MeteringPoint;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MeteringRegionQuirkCorrection implements MeteringRegionCorrection {
    public static final MeteringRegionQuirkCorrection INSTANCE = new MeteringRegionQuirkCorrection();

    private MeteringRegionQuirkCorrection() {
    }

    @Override // androidx.camera.camera2.compat.workaround.MeteringRegionCorrection
    public PointF getCorrectedPoint(MeteringPoint meteringPoint, int i2) {
        x.f(meteringPoint, "meteringPoint");
        return i2 == 1 ? new PointF(1.0f - meteringPoint.getX(), meteringPoint.getY()) : new PointF(meteringPoint.getX(), meteringPoint.getY());
    }
}
