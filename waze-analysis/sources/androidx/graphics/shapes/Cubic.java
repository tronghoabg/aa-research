package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import h.a.c;
import h.g.b.o;
import h.g.b.x;
import h.k;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class Cubic {
    public static final Companion Companion = new Companion(null);
    private final float[] points;

    private Cubic(long j2, long j3, long j4, long j5) {
        this(new float[]{PointKt.m11940getXDnnuFBc(j2), PointKt.m11941getYDnnuFBc(j2), PointKt.m11940getXDnnuFBc(j3), PointKt.m11941getYDnnuFBc(j3), PointKt.m11940getXDnnuFBc(j4), PointKt.m11941getYDnnuFBc(j4), PointKt.m11940getXDnnuFBc(j5), PointKt.m11941getYDnnuFBc(j5)});
    }

    public static /* synthetic */ void calculateBounds$graphics_shapes$default(Cubic cubic, float[] fArr, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateBounds");
        }
        if ((i2 & 1) != 0) {
            fArr = new float[4];
        }
        cubic.calculateBounds$graphics_shapes(fArr, z & ((i2 & 2) == 0));
    }

    public static final Cubic circularArc(float f2, float f3, float f4, float f5, float f6, float f7) {
        return Companion.circularArc(f2, f3, f4, f5, f6, f7);
    }

    public static final Cubic straightLine(float f2, float f3, float f4, float f5) {
        return Companion.straightLine(f2, f3, f4, f5);
    }

    private final boolean zeroIsh(float f2) {
        return Math.abs(f2) < 1.0E-4f;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c9 A[PHI: r0 r7
  0x01c9: PHI (r0v2 float) = (r0v1 float), (r0v3 float) binds: [B:86:0x021b, B:62:0x01c7] A[DONT_GENERATE, DONT_INLINE]
  0x01c9: PHI (r7v16 float) = (r7v12 float), (r7v18 float) binds: [B:86:0x021b, B:62:0x01c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021e A[PHI: r9 r20
  0x021e: PHI (r9v5 float) = (r9v2 float), (r9v3 float), (r9v3 float), (r9v2 float), (r9v2 float), (r9v2 float) binds: [B:65:0x01d2, B:78:0x0203, B:80:0x0207, B:51:0x01a6, B:54:0x01af, B:56:0x01b3] A[DONT_GENERATE, DONT_INLINE]
  0x021e: PHI (r20v5 float) = (r20v1 float), (r20v2 float), (r20v2 float), (r20v1 float), (r20v1 float), (r20v1 float) binds: [B:65:0x01d2, B:78:0x0203, B:80:0x0207, B:51:0x01a6, B:54:0x01af, B:56:0x01b3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void calculateBounds$graphics_shapes(float[] r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.graphics.shapes.Cubic.calculateBounds$graphics_shapes(float[], boolean):void");
    }

    public final boolean convexTo$graphics_shapes(Cubic cubic) {
        x.f(cubic, "next");
        return Utils.m11972convexb22R3LQ(FloatFloatPair.m1675constructorimpl(getAnchor0X(), getAnchor0Y()), FloatFloatPair.m1675constructorimpl(getAnchor1X(), getAnchor1Y()), FloatFloatPair.m1675constructorimpl(cubic.getAnchor1X(), cubic.getAnchor1Y()));
    }

    public final Cubic div(float f2) {
        return times(1.0f / f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Cubic) {
            return Arrays.equals(this.points, ((Cubic) obj).points);
        }
        return false;
    }

    public final float getAnchor0X() {
        return this.points[0];
    }

    public final float getAnchor0Y() {
        return this.points[1];
    }

    public final float getAnchor1X() {
        return this.points[6];
    }

    public final float getAnchor1Y() {
        return this.points[7];
    }

    public final float getControl0X() {
        return this.points[2];
    }

    public final float getControl0Y() {
        return this.points[3];
    }

    public final float getControl1X() {
        return this.points[4];
    }

    public final float getControl1Y() {
        return this.points[5];
    }

    public final float[] getPoints$graphics_shapes() {
        return this.points;
    }

    public int hashCode() {
        return Arrays.hashCode(this.points);
    }

    public final Cubic plus(Cubic cubic) {
        x.f(cubic, "o");
        float[] fArr = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr[i2] = this.points[i2] + cubic.points[i2];
        }
        return new Cubic(fArr);
    }

    /* renamed from: pointOnCurve-OOQOV4g$graphics_shapes, reason: not valid java name */
    public final long m11928pointOnCurveOOQOV4g$graphics_shapes(float f2) {
        float f3 = 1.0f - f2;
        float f4 = f3 * f3 * f3;
        float anchor0X = getAnchor0X() * f4;
        float f5 = 3.0f * f2;
        float f6 = f5 * f3 * f3;
        float control0X = getControl0X() * f6;
        float f7 = f5 * f2 * f3;
        float control1X = getControl1X() * f7;
        float f8 = f2 * f2 * f2;
        float anchor1X = getAnchor1X() * f8;
        float anchor0Y = getAnchor0Y() * f4;
        float control0Y = getControl0Y() * f6;
        return FloatFloatPair.m1675constructorimpl(anchor0X + control0X + control1X + anchor1X, anchor0Y + control0Y + (getControl1Y() * f7) + (getAnchor1Y() * f8));
    }

    public final Cubic reverse() {
        return CubicKt.Cubic(getAnchor1X(), getAnchor1Y(), getControl1X(), getControl1Y(), getControl0X(), getControl0Y(), getAnchor0X(), getAnchor0Y());
    }

    public final k<Cubic, Cubic> split(float f2) {
        long jM11928pointOnCurveOOQOV4g$graphics_shapes = m11928pointOnCurveOOQOV4g$graphics_shapes(f2);
        float anchor0X = getAnchor0X();
        float anchor0Y = getAnchor0Y();
        float f3 = 1.0f - f2;
        float anchor0X2 = getAnchor0X() * f3;
        float control0X = getControl0X() * f2;
        float anchor0Y2 = getAnchor0Y() * f3;
        float control0Y = getControl0Y() * f2;
        float f4 = f3 * f3;
        float anchor0X3 = getAnchor0X() * f4;
        float f5 = (f3 + f3) * f2;
        float control0X2 = getControl0X() * f5;
        float f6 = f2 * f2;
        float control1X = getControl1X() * f6;
        float anchor0Y3 = getAnchor0Y() * f4;
        float control0Y2 = getControl0Y() * f5;
        Cubic Cubic = CubicKt.Cubic(anchor0X, anchor0Y, anchor0X2 + control0X, anchor0Y2 + control0Y, anchor0X3 + control0X2 + control1X, anchor0Y3 + control0Y2 + (getControl1Y() * f6), PointKt.m11940getXDnnuFBc(jM11928pointOnCurveOOQOV4g$graphics_shapes), PointKt.m11941getYDnnuFBc(jM11928pointOnCurveOOQOV4g$graphics_shapes));
        float fM11940getXDnnuFBc = PointKt.m11940getXDnnuFBc(jM11928pointOnCurveOOQOV4g$graphics_shapes);
        float fM11941getYDnnuFBc = PointKt.m11941getYDnnuFBc(jM11928pointOnCurveOOQOV4g$graphics_shapes);
        float control0X3 = getControl0X() * f4;
        float control1X2 = getControl1X() * f5;
        float anchor1X = getAnchor1X() * f6;
        float control0Y3 = getControl0Y() * f4;
        float control1Y = getControl1Y() * f5;
        return new k<>(Cubic, CubicKt.Cubic(fM11940getXDnnuFBc, fM11941getYDnnuFBc, control0X3 + control1X2 + anchor1X, control0Y3 + control1Y + (getAnchor1Y() * f6), (getControl1X() * f3) + (getAnchor1X() * f2), (getControl1Y() * f3) + (getAnchor1Y() * f2), getAnchor1X(), getAnchor1Y()));
    }

    public final Cubic times(float f2) {
        float[] fArr = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr[i2] = this.points[i2] * f2;
        }
        return new Cubic(fArr);
    }

    public String toString() {
        return "anchor0: (" + getAnchor0X() + ", " + getAnchor0Y() + ") control0: (" + getControl0X() + ", " + getControl0Y() + "), control1: (" + getControl1X() + ", " + getControl1Y() + "), anchor1: (" + getAnchor1X() + ", " + getAnchor1Y() + ")";
    }

    public final Cubic transformed(PointTransformer pointTransformer) {
        x.f(pointTransformer, "f");
        MutableCubic mutableCubic = new MutableCubic();
        c.aK(this.points, mutableCubic.getPoints$graphics_shapes(), 0, 0, 14);
        mutableCubic.transform(pointTransformer);
        return mutableCubic;
    }

    public final boolean zeroLength$graphics_shapes() {
        return Math.abs(getAnchor0X() - getAnchor1X()) < 1.0E-4f && Math.abs(getAnchor0Y() - getAnchor1Y()) < 1.0E-4f;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Cubic circularArc(float f2, float f3, float f4, float f5, float f6, float f7) {
            float f8 = f6 - f2;
            float f9 = f7 - f3;
            float f10 = f4 - f2;
            float f11 = f5 - f3;
            long jDirectionVector = Utils.directionVector(f10, f11);
            long jDirectionVector2 = Utils.directionVector(f8, f9);
            long jM11975rotate90DnnuFBc = Utils.m11975rotate90DnnuFBc(jDirectionVector);
            long jM11975rotate90DnnuFBc2 = Utils.m11975rotate90DnnuFBc(jDirectionVector2);
            float fM11935dotProduct5P9i7ZU = PointKt.m11935dotProduct5P9i7ZU(jM11975rotate90DnnuFBc, f8, f9);
            float fM11936dotProductybeJwSQ = PointKt.m11936dotProductybeJwSQ(jDirectionVector, jDirectionVector2);
            if (fM11936dotProductybeJwSQ > 0.999f) {
                return straightLine(f4, f5, f6, f7);
            }
            float fDistance = ((((Utils.distance(f10, f11) * 4.0f) / 3.0f) * (((float) Math.sqrt(r8 + r8)) - ((float) Math.sqrt(1.0f - (fM11936dotProductybeJwSQ * fM11936dotProductybeJwSQ))))) / (1.0f - fM11936dotProductybeJwSQ)) * (fM11935dotProduct5P9i7ZU < 0.0f ? -1.0f : 1.0f);
            return CubicKt.Cubic(f4, f5, (PointKt.m11940getXDnnuFBc(jM11975rotate90DnnuFBc) * fDistance) + f4, (PointKt.m11941getYDnnuFBc(jM11975rotate90DnnuFBc) * fDistance) + f5, f6 - (PointKt.m11940getXDnnuFBc(jM11975rotate90DnnuFBc2) * fDistance), f7 - (PointKt.m11941getYDnnuFBc(jM11975rotate90DnnuFBc2) * fDistance), f6, f7);
        }

        public final Cubic empty$graphics_shapes(float f2, float f3) {
            return CubicKt.Cubic(f2, f3, f2, f3, f2, f3, f2, f3);
        }

        public final Cubic straightLine(float f2, float f3, float f4, float f5) {
            return CubicKt.Cubic(f2, f3, Utils.interpolate(f2, f4, 0.33333334f), Utils.interpolate(f3, f5, 0.33333334f), Utils.interpolate(f2, f4, 0.6666667f), Utils.interpolate(f3, f5, 0.6666667f), f4, f5);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public final Cubic div(int i2) {
        return div(i2);
    }

    public final Cubic times(int i2) {
        return times(i2);
    }

    public /* synthetic */ Cubic(long j2, long j3, long j4, long j5, o oVar) {
        this(j2, j3, j4, j5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Cubic() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public Cubic(float[] fArr) {
        x.f(fArr, "points");
        this.points = fArr;
        if (fArr.length != 8) {
            throw new IllegalArgumentException("Points array size should be 8");
        }
    }

    public /* synthetic */ Cubic(float[] fArr, int i2, o oVar) {
        this((i2 & 1) != 0 ? new float[8] : fArr);
    }
}
