package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import h.a.i;
import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class RoundedCorner {
    private long center;
    private final float cornerRadius;
    private final float cosAngle;
    private final long d1;
    private final long d2;
    private final float expectedRoundCut;
    private final long p0;
    private final long p1;
    private final long p2;
    private final CornerRounding rounding;
    private final float sinAngle;
    private final float smoothing;

    private RoundedCorner(long j2, long j3, long j4, CornerRounding cornerRounding) {
        this.p0 = j2;
        this.p1 = j3;
        this.p2 = j4;
        this.rounding = cornerRounding;
        long jM11943minusybeJwSQ = PointKt.m11943minusybeJwSQ(j2, j3);
        long jM11943minusybeJwSQ2 = PointKt.m11943minusybeJwSQ(j4, j3);
        float fM11938getDistanceDnnuFBc = PointKt.m11938getDistanceDnnuFBc(jM11943minusybeJwSQ);
        float fM11938getDistanceDnnuFBc2 = PointKt.m11938getDistanceDnnuFBc(jM11943minusybeJwSQ2);
        if (fM11938getDistanceDnnuFBc <= 0.0f || fM11938getDistanceDnnuFBc2 <= 0.0f) {
            this.d1 = FloatFloatPair.m1675constructorimpl(0.0f, 0.0f);
            this.d2 = FloatFloatPair.m1675constructorimpl(0.0f, 0.0f);
            this.cornerRadius = 0.0f;
            this.smoothing = 0.0f;
            this.cosAngle = 0.0f;
            this.sinAngle = 0.0f;
            this.expectedRoundCut = 0.0f;
        } else {
            long jM11934divso9K2fw = PointKt.m11934divso9K2fw(jM11943minusybeJwSQ, fM11938getDistanceDnnuFBc);
            this.d1 = jM11934divso9K2fw;
            long jM11934divso9K2fw2 = PointKt.m11934divso9K2fw(jM11943minusybeJwSQ2, fM11938getDistanceDnnuFBc2);
            this.d2 = jM11934divso9K2fw2;
            float radius = cornerRounding != null ? cornerRounding.getRadius() : 0.0f;
            this.cornerRadius = radius;
            this.smoothing = cornerRounding != null ? cornerRounding.getSmoothing() : 0.0f;
            float fM11936dotProductybeJwSQ = PointKt.m11936dotProductybeJwSQ(jM11934divso9K2fw, jM11934divso9K2fw2);
            this.cosAngle = fM11936dotProductybeJwSQ;
            float fSqrt = (float) Math.sqrt(1.0f - Utils.square(fM11936dotProductybeJwSQ));
            this.sinAngle = fSqrt;
            this.expectedRoundCut = ((double) fSqrt) > 0.001d ? (radius * (fM11936dotProductybeJwSQ + 1.0f)) / fSqrt : 0.0f;
        }
        this.center = FloatFloatPair.m1675constructorimpl(0.0f, 0.0f);
    }

    private final float calculateActualSmoothingValue(float f2) {
        if (f2 > getExpectedCut()) {
            return this.smoothing;
        }
        float f3 = this.expectedRoundCut;
        if (f2 <= f3) {
            return 0.0f;
        }
        return (this.smoothing * (f2 - f3)) / (getExpectedCut() - f3);
    }

    /* renamed from: computeFlankingCurve-oAJzIJU, reason: not valid java name */
    private final Cubic m11949computeFlankingCurveoAJzIJU(float f2, float f3, long j2, long j3, long j4, long j5, long j6, float f4) {
        long jM11937getDirectionDnnuFBc = PointKt.m11937getDirectionDnnuFBc(PointKt.m11943minusybeJwSQ(j3, j2));
        long jM11944plusybeJwSQ = PointKt.m11944plusybeJwSQ(j2, PointKt.m11946timesso9K2fw(PointKt.m11946timesso9K2fw(jM11937getDirectionDnnuFBc, f2), 1.0f + f3));
        long jM1683unboximpl = j4;
        long jM11942interpolatedLqxh1s = PointKt.m11942interpolatedLqxh1s(jM1683unboximpl, PointKt.m11934divso9K2fw(PointKt.m11944plusybeJwSQ(j4, j5), 2.0f), f3);
        long jM11944plusybeJwSQ2 = PointKt.m11944plusybeJwSQ(j6, PointKt.m11946timesso9K2fw(Utils.directionVector(PointKt.m11940getXDnnuFBc(jM11942interpolatedLqxh1s) - PointKt.m11940getXDnnuFBc(j6), PointKt.m11941getYDnnuFBc(jM11942interpolatedLqxh1s) - PointKt.m11941getYDnnuFBc(j6)), f4));
        FloatFloatPair floatFloatPairM11950lineIntersectionCBFvKDc = m11950lineIntersectionCBFvKDc(j3, jM11937getDirectionDnnuFBc, jM11944plusybeJwSQ2, Utils.m11975rotate90DnnuFBc(PointKt.m11943minusybeJwSQ(jM11944plusybeJwSQ2, j6)));
        if (floatFloatPairM11950lineIntersectionCBFvKDc != null) {
            jM1683unboximpl = floatFloatPairM11950lineIntersectionCBFvKDc.m1683unboximpl();
        }
        return new Cubic(jM11944plusybeJwSQ, PointKt.m11934divso9K2fw(PointKt.m11944plusybeJwSQ(jM11944plusybeJwSQ, PointKt.m11946timesso9K2fw(jM1683unboximpl, 2.0f)), 3.0f), jM1683unboximpl, jM11944plusybeJwSQ2, null);
    }

    public static /* synthetic */ List getCubics$default(RoundedCorner roundedCorner, float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = f2;
        }
        return roundedCorner.getCubics(f2, f3);
    }

    /* renamed from: lineIntersection-CBFvKDc, reason: not valid java name */
    private final FloatFloatPair m11950lineIntersectionCBFvKDc(long j2, long j3, long j4, long j5) {
        long jM11975rotate90DnnuFBc = Utils.m11975rotate90DnnuFBc(j5);
        float fM11936dotProductybeJwSQ = PointKt.m11936dotProductybeJwSQ(j3, jM11975rotate90DnnuFBc);
        if (Math.abs(fM11936dotProductybeJwSQ) < 1.0E-4f) {
            return null;
        }
        float fM11936dotProductybeJwSQ2 = PointKt.m11936dotProductybeJwSQ(PointKt.m11943minusybeJwSQ(j4, j2), jM11975rotate90DnnuFBc);
        if (Math.abs(fM11936dotProductybeJwSQ) >= Math.abs(fM11936dotProductybeJwSQ2) * 1.0E-4f) {
            return FloatFloatPair.m1672boximpl(PointKt.m11944plusybeJwSQ(j2, PointKt.m11946timesso9K2fw(j3, fM11936dotProductybeJwSQ2 / fM11936dotProductybeJwSQ)));
        }
        return null;
    }

    /* renamed from: getCenter-1ufDz9w, reason: not valid java name */
    public final long m11951getCenter1ufDz9w() {
        return this.center;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final float getCosAngle() {
        return this.cosAngle;
    }

    public final List<Cubic> getCubics(float f2, float f3) {
        float fMin = Math.min(f2, f3);
        float f4 = this.expectedRoundCut;
        if (f4 < 1.0E-4f || fMin < 1.0E-4f || this.cornerRadius < 1.0E-4f) {
            long j2 = this.p1;
            this.center = j2;
            return i.d(Cubic.Companion.straightLine(PointKt.m11940getXDnnuFBc(j2), PointKt.m11941getYDnnuFBc(j2), PointKt.m11940getXDnnuFBc(j2), PointKt.m11941getYDnnuFBc(j2)));
        }
        float fMin2 = Math.min(fMin, f4);
        float fCalculateActualSmoothingValue = calculateActualSmoothingValue(f2);
        float fCalculateActualSmoothingValue2 = calculateActualSmoothingValue(f3);
        float f5 = (this.cornerRadius * fMin2) / this.expectedRoundCut;
        this.center = PointKt.m11944plusybeJwSQ(this.p1, PointKt.m11946timesso9K2fw(PointKt.m11937getDirectionDnnuFBc(PointKt.m11934divso9K2fw(PointKt.m11944plusybeJwSQ(this.d1, this.d2), 2.0f)), (float) Math.sqrt(Utils.square(f5) + Utils.square(fMin2))));
        long jM11944plusybeJwSQ = PointKt.m11944plusybeJwSQ(this.p1, PointKt.m11946timesso9K2fw(this.d1, fMin2));
        long jM11944plusybeJwSQ2 = PointKt.m11944plusybeJwSQ(this.p1, PointKt.m11946timesso9K2fw(this.d2, fMin2));
        Cubic cubicM11949computeFlankingCurveoAJzIJU = m11949computeFlankingCurveoAJzIJU(fMin2, fCalculateActualSmoothingValue, this.p1, this.p0, jM11944plusybeJwSQ, jM11944plusybeJwSQ2, this.center, f5);
        Cubic cubicReverse = m11949computeFlankingCurveoAJzIJU(fMin2, fCalculateActualSmoothingValue2, this.p1, this.p2, jM11944plusybeJwSQ2, jM11944plusybeJwSQ, this.center, f5).reverse();
        return i.i(cubicM11949computeFlankingCurveoAJzIJU, Cubic.Companion.circularArc(PointKt.m11940getXDnnuFBc(this.center), PointKt.m11941getYDnnuFBc(this.center), cubicM11949computeFlankingCurveoAJzIJU.getAnchor1X(), cubicM11949computeFlankingCurveoAJzIJU.getAnchor1Y(), cubicReverse.getAnchor0X(), cubicReverse.getAnchor0Y()), cubicReverse);
    }

    /* renamed from: getD1-1ufDz9w, reason: not valid java name */
    public final long m11952getD11ufDz9w() {
        return this.d1;
    }

    /* renamed from: getD2-1ufDz9w, reason: not valid java name */
    public final long m11953getD21ufDz9w() {
        return this.d2;
    }

    public final float getExpectedCut() {
        return (this.smoothing + 1.0f) * this.expectedRoundCut;
    }

    public final float getExpectedRoundCut() {
        return this.expectedRoundCut;
    }

    /* renamed from: getP0-1ufDz9w, reason: not valid java name */
    public final long m11954getP01ufDz9w() {
        return this.p0;
    }

    /* renamed from: getP1-1ufDz9w, reason: not valid java name */
    public final long m11955getP11ufDz9w() {
        return this.p1;
    }

    /* renamed from: getP2-1ufDz9w, reason: not valid java name */
    public final long m11956getP21ufDz9w() {
        return this.p2;
    }

    public final CornerRounding getRounding() {
        return this.rounding;
    }

    public final float getSinAngle() {
        return this.sinAngle;
    }

    public final float getSmoothing() {
        return this.smoothing;
    }

    /* renamed from: setCenter-DnnuFBc, reason: not valid java name */
    public final void m11957setCenterDnnuFBc(long j2) {
        this.center = j2;
    }

    public /* synthetic */ RoundedCorner(long j2, long j3, long j4, CornerRounding cornerRounding, o oVar) {
        this(j2, j3, j4, cornerRounding);
    }

    public /* synthetic */ RoundedCorner(long j2, long j3, long j4, CornerRounding cornerRounding, int i2, o oVar) {
        this(j2, j3, j4, (i2 & 8) != 0 ? null : cornerRounding, null);
    }

    public final List<Cubic> getCubics(float f2) {
        return getCubics$default(this, f2, 0.0f, 2, null);
    }
}
