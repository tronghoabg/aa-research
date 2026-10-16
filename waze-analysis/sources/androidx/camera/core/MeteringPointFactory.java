package androidx.camera.core;

import android.graphics.PointF;
import android.util.Rational;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class MeteringPointFactory {
    private Rational mSurfaceAspectRatio;

    public MeteringPointFactory(Rational rational) {
        this.mSurfaceAspectRatio = rational;
    }

    public static float getDefaultPointSize() {
        return 0.15f;
    }

    protected abstract PointF convertPoint(float f2, float f3);

    public final MeteringPoint createPoint(float f2, float f3, float f4) {
        PointF pointFConvertPoint = convertPoint(f2, f3);
        return new MeteringPoint(pointFConvertPoint.x, pointFConvertPoint.y, f4, this.mSurfaceAspectRatio);
    }

    protected void setSurfaceAspectRatio(Rational rational) {
        this.mSurfaceAspectRatio = rational;
    }

    public MeteringPointFactory() {
        this(null);
    }

    public final MeteringPoint createPoint(float f2, float f3) {
        return createPoint(f2, f3, 0.15f);
    }
}
