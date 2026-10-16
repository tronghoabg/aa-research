package androidx.compose.animation.core;

import androidx.compose.ui.graphics.BezierKt;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CubicBezierEasing implements Easing {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name */
    private final float f1645a;

    /* renamed from: b, reason: collision with root package name */
    private final float f1646b;

    /* renamed from: c, reason: collision with root package name */
    private final float f1647c;

    /* renamed from: d, reason: collision with root package name */
    private final float f1648d;
    private final float max;
    private final float min;

    public CubicBezierEasing(float f2, float f3, float f4, float f5) {
        this.f1645a = f2;
        this.f1646b = f3;
        this.f1647c = f4;
        this.f1648d = f5;
        if (Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5)) {
            PreconditionsKt.throwIllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f2 + ", " + f3 + ", " + f4 + ", " + f5 + '.');
        }
        long jComputeCubicVerticalBounds = BezierKt.computeCubicVerticalBounds(0.0f, f3, f5, 1.0f, new float[5], 0);
        this.min = Float.intBitsToFloat((int) (jComputeCubicVerticalBounds >> 32));
        this.max = Float.intBitsToFloat((int) (jComputeCubicVerticalBounds & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    private final void throwNoSolution(float f2) {
        throw new IllegalArgumentException("The cubic curve with parameters (" + this.f1645a + ", " + this.f1646b + ", " + this.f1647c + ", " + this.f1648d + ") has no solution at " + f2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CubicBezierEasing)) {
            return false;
        }
        CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) obj;
        return this.f1645a == cubicBezierEasing.f1645a && this.f1646b == cubicBezierEasing.f1646b && this.f1647c == cubicBezierEasing.f1647c && this.f1648d == cubicBezierEasing.f1648d;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f1645a) * 31) + Float.floatToIntBits(this.f1646b)) * 31) + Float.floatToIntBits(this.f1647c)) * 31) + Float.floatToIntBits(this.f1648d);
    }

    public String toString() {
        return "CubicBezierEasing(a=" + this.f1645a + ", b=" + this.f1646b + ", c=" + this.f1647c + ", d=" + this.f1648d + ')';
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float f2) {
        if (f2 > 0.0f && f2 < 1.0f) {
            float fMax = Math.max(f2, 1.1920929E-7f);
            float fFindFirstCubicRoot = BezierKt.findFirstCubicRoot(-fMax, this.f1645a - fMax, this.f1647c - fMax, 1.0f - fMax);
            if (Float.isNaN(fFindFirstCubicRoot)) {
                throwNoSolution(f2);
            }
            f2 = BezierKt.evaluateCubic(this.f1646b, this.f1648d, fFindFirstCubicRoot);
            float f3 = this.min;
            float f4 = this.max;
            if (f2 < f3) {
                f2 = f3;
            }
            if (f2 > f4) {
                return f4;
            }
        }
        return f2;
    }
}
