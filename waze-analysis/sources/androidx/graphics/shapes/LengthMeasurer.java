package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class LengthMeasurer implements Measurer {
    private final int segments = 3;

    /* renamed from: closestProgressTo-XgqJiTY, reason: not valid java name */
    private final long m11930closestProgressToXgqJiTY(Cubic cubic, float f2) {
        long jM1675constructorimpl = FloatFloatPair.m1675constructorimpl(cubic.getAnchor0X(), cubic.getAnchor0Y());
        int i2 = this.segments;
        float f3 = 0.0f;
        if (i2 > 0) {
            int i3 = 1;
            float f4 = f2;
            while (true) {
                float f5 = i3 / this.segments;
                long jM11928pointOnCurveOOQOV4g$graphics_shapes = cubic.m11928pointOnCurveOOQOV4g$graphics_shapes(f5);
                float fM11938getDistanceDnnuFBc = PointKt.m11938getDistanceDnnuFBc(PointKt.m11943minusybeJwSQ(jM11928pointOnCurveOOQOV4g$graphics_shapes, jM1675constructorimpl));
                if (fM11938getDistanceDnnuFBc < f4) {
                    f4 -= fM11938getDistanceDnnuFBc;
                    f3 += fM11938getDistanceDnnuFBc;
                    if (i3 == i2) {
                        break;
                    }
                    i3++;
                    jM1675constructorimpl = jM11928pointOnCurveOOQOV4g$graphics_shapes;
                } else {
                    return FloatFloatPair.m1675constructorimpl(f5 - ((1.0f - (f4 / fM11938getDistanceDnnuFBc)) / this.segments), f2);
                }
            }
        }
        return FloatFloatPair.m1675constructorimpl(1.0f, f3);
    }

    @Override // androidx.graphics.shapes.Measurer
    public float findCubicCutPoint(Cubic cubic, float f2) {
        x.f(cubic, "c");
        return Float.intBitsToFloat((int) (m11930closestProgressToXgqJiTY(cubic, f2) >> 32));
    }

    @Override // androidx.graphics.shapes.Measurer
    public float measureCubic(Cubic cubic) {
        x.f(cubic, "c");
        return Float.intBitsToFloat((int) (m11930closestProgressToXgqJiTY(cubic, Float.POSITIVE_INFINITY) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }
}
