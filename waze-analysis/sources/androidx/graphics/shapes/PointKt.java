package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PointKt {
    /* renamed from: clockwise-ybeJwSQ, reason: not valid java name */
    public static final boolean m11931clockwiseybeJwSQ(long j2, long j3) {
        return (m11940getXDnnuFBc(j2) * m11941getYDnnuFBc(j3)) - (m11941getYDnnuFBc(j2) * m11940getXDnnuFBc(j3)) > 0.0f;
    }

    /* renamed from: copy-5P9i7ZU, reason: not valid java name */
    public static final long m11932copy5P9i7ZU(long j2, float f2, float f3) {
        return FloatFloatPair.m1675constructorimpl(f2, f3);
    }

    /* renamed from: copy-5P9i7ZU$default, reason: not valid java name */
    public static /* synthetic */ long m11933copy5P9i7ZU$default(long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Float.intBitsToFloat((int) (j2 >> 32));
        }
        if ((i2 & 2) != 0) {
            f3 = Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2));
        }
        return m11932copy5P9i7ZU(j2, f2, f3);
    }

    /* renamed from: div-so9K2fw, reason: not valid java name */
    public static final long m11934divso9K2fw(long j2, float f2) {
        return FloatFloatPair.m1675constructorimpl(m11940getXDnnuFBc(j2) / f2, m11941getYDnnuFBc(j2) / f2);
    }

    /* renamed from: dotProduct-5P9i7ZU, reason: not valid java name */
    public static final float m11935dotProduct5P9i7ZU(long j2, float f2, float f3) {
        return (m11940getXDnnuFBc(j2) * f2) + (m11941getYDnnuFBc(j2) * f3);
    }

    /* renamed from: dotProduct-ybeJwSQ, reason: not valid java name */
    public static final float m11936dotProductybeJwSQ(long j2, long j3) {
        return (m11940getXDnnuFBc(j2) * m11940getXDnnuFBc(j3)) + (m11941getYDnnuFBc(j2) * m11941getYDnnuFBc(j3));
    }

    /* renamed from: getDirection-DnnuFBc, reason: not valid java name */
    public static final long m11937getDirectionDnnuFBc(long j2) {
        float fM11938getDistanceDnnuFBc = m11938getDistanceDnnuFBc(j2);
        if (fM11938getDistanceDnnuFBc > 0.0f) {
            return m11934divso9K2fw(j2, fM11938getDistanceDnnuFBc);
        }
        throw new IllegalArgumentException("Can't get the direction of a 0-length vector");
    }

    /* renamed from: getDistance-DnnuFBc, reason: not valid java name */
    public static final float m11938getDistanceDnnuFBc(long j2) {
        return (float) Math.sqrt((m11940getXDnnuFBc(j2) * m11940getXDnnuFBc(j2)) + (m11941getYDnnuFBc(j2) * m11941getYDnnuFBc(j2)));
    }

    /* renamed from: getDistanceSquared-DnnuFBc, reason: not valid java name */
    public static final float m11939getDistanceSquaredDnnuFBc(long j2) {
        return (m11940getXDnnuFBc(j2) * m11940getXDnnuFBc(j2)) + (m11941getYDnnuFBc(j2) * m11941getYDnnuFBc(j2));
    }

    /* renamed from: getX-DnnuFBc, reason: not valid java name */
    public static final float m11940getXDnnuFBc(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* renamed from: getY-DnnuFBc, reason: not valid java name */
    public static final float m11941getYDnnuFBc(long j2) {
        return Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* renamed from: interpolate-dLqxh1s, reason: not valid java name */
    public static final long m11942interpolatedLqxh1s(long j2, long j3, float f2) {
        return FloatFloatPair.m1675constructorimpl(Utils.interpolate(m11940getXDnnuFBc(j2), m11940getXDnnuFBc(j3), f2), Utils.interpolate(m11941getYDnnuFBc(j2), m11941getYDnnuFBc(j3), f2));
    }

    /* renamed from: minus-ybeJwSQ, reason: not valid java name */
    public static final long m11943minusybeJwSQ(long j2, long j3) {
        return FloatFloatPair.m1675constructorimpl(m11940getXDnnuFBc(j2) - m11940getXDnnuFBc(j3), m11941getYDnnuFBc(j2) - m11941getYDnnuFBc(j3));
    }

    /* renamed from: plus-ybeJwSQ, reason: not valid java name */
    public static final long m11944plusybeJwSQ(long j2, long j3) {
        return FloatFloatPair.m1675constructorimpl(m11940getXDnnuFBc(j2) + m11940getXDnnuFBc(j3), m11941getYDnnuFBc(j2) + m11941getYDnnuFBc(j3));
    }

    /* renamed from: rem-so9K2fw, reason: not valid java name */
    public static final long m11945remso9K2fw(long j2, float f2) {
        return FloatFloatPair.m1675constructorimpl(m11940getXDnnuFBc(j2) % f2, m11941getYDnnuFBc(j2) % f2);
    }

    /* renamed from: times-so9K2fw, reason: not valid java name */
    public static final long m11946timesso9K2fw(long j2, float f2) {
        return FloatFloatPair.m1675constructorimpl(m11940getXDnnuFBc(j2) * f2, m11941getYDnnuFBc(j2) * f2);
    }

    /* renamed from: transformed-so9K2fw, reason: not valid java name */
    public static final long m11947transformedso9K2fw(long j2, PointTransformer pointTransformer) {
        x.f(pointTransformer, "f");
        long jMo6289transformXgqJiTY = pointTransformer.mo6289transformXgqJiTY(m11940getXDnnuFBc(j2), m11941getYDnnuFBc(j2));
        return FloatFloatPair.m1675constructorimpl(Float.intBitsToFloat((int) (jMo6289transformXgqJiTY >> 32)), Float.intBitsToFloat((int) (jMo6289transformXgqJiTY & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
    }

    /* renamed from: unaryMinus-DnnuFBc, reason: not valid java name */
    public static final long m11948unaryMinusDnnuFBc(long j2) {
        return FloatFloatPair.m1675constructorimpl(-m11940getXDnnuFBc(j2), -m11941getYDnnuFBc(j2));
    }
}
