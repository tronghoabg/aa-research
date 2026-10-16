package androidx.graphics.path;

import androidx.collection.FloatFloatPair;
import androidx.graphics.path.Conic;
import androidx.media3.muxer.MuxerUtil;
import h.a.i;
import h.g.b.x;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ConicsImplKt {
    private static final int MAX_CONIC_TO_QUAD_COUNT = 5;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: add-HiPawso, reason: not valid java name */
    public static final void m11921addHiPawso(ArrayList<Float> arrayList, long j2) {
        arrayList.add(Float.valueOf(m11923getXDnnuFBc(j2)));
        arrayList.add(Float.valueOf(m11924getYDnnuFBc(j2)));
    }

    private static final boolean approxEquals(float f2, float f3) {
        return Math.abs(f2 - f3) < 1.0E-4f;
    }

    /* renamed from: approxEquals-ybeJwSQ, reason: not valid java name */
    private static final boolean m11922approxEqualsybeJwSQ(long j2, long j3) {
        return approxEquals(m11923getXDnnuFBc(j2), m11923getXDnnuFBc(j3)) && approxEquals(m11924getYDnnuFBc(j2), m11924getYDnnuFBc(j3));
    }

    private static final boolean between(float f2, float f3, float f4) {
        return (f2 - f3) * (f4 - f3) <= 0.0f;
    }

    public static final float[] conicToQuadratics(float[] fArr, int i2, float f2, float f3) {
        x.f(fArr, "conicPoints");
        Conic conic = toConic(fArr, i2, f2);
        int iComputeQuadraticCount = conic.computeQuadraticCount(f3);
        ArrayList<Float> arrayList = new ArrayList<>();
        conic.splitIntoQuadratics(arrayList, iComputeQuadraticCount);
        return i.az(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getX-DnnuFBc, reason: not valid java name */
    public static final float m11923getXDnnuFBc(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getY-DnnuFBc, reason: not valid java name */
    public static final float m11924getYDnnuFBc(long j2) {
        return Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isFinite-DnnuFBc, reason: not valid java name */
    public static final boolean m11925isFiniteDnnuFBc(long j2) {
        return Math.abs(m11923getXDnnuFBc(j2)) <= Float.MAX_VALUE && Math.abs(m11924getYDnnuFBc(j2)) <= Float.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: plus-ybeJwSQ, reason: not valid java name */
    public static final long m11926plusybeJwSQ(long j2, long j3) {
        return FloatFloatPair.m1675constructorimpl(m11923getXDnnuFBc(j2) + m11923getXDnnuFBc(j3), m11924getYDnnuFBc(j2) + m11924getYDnnuFBc(j3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subdivide(Conic conic, ArrayList<Float> arrayList, int i2) {
        if (i2 == 0) {
            m11921addHiPawso(arrayList, conic.getPoints()[1].m1683unboximpl());
            m11921addHiPawso(arrayList, conic.getPoints()[2].m1683unboximpl());
            return;
        }
        Conic.SplitResult splitResultSplit = conic.split();
        float fM11924getYDnnuFBc = m11924getYDnnuFBc(conic.getPoints()[0].m1683unboximpl());
        float fM11924getYDnnuFBc2 = m11924getYDnnuFBc(conic.getPoints()[2].m1683unboximpl());
        if (between(fM11924getYDnnuFBc, m11924getYDnnuFBc(conic.getPoints()[1].m1683unboximpl()), fM11924getYDnnuFBc2)) {
            float fM11924getYDnnuFBc3 = m11924getYDnnuFBc(splitResultSplit.getA().getPoints()[2].m1683unboximpl());
            if (!between(fM11924getYDnnuFBc, fM11924getYDnnuFBc3, fM11924getYDnnuFBc2)) {
                float f2 = Math.abs(fM11924getYDnnuFBc3 - fM11924getYDnnuFBc) < Math.abs(fM11924getYDnnuFBc3 - fM11924getYDnnuFBc2) ? fM11924getYDnnuFBc : fM11924getYDnnuFBc2;
                splitResultSplit.getA().getPoints()[2] = FloatFloatPair.m1672boximpl(FloatFloatPair.m1675constructorimpl(m11923getXDnnuFBc(splitResultSplit.getA().getPoints()[2].m1683unboximpl()), f2));
                splitResultSplit.getB().getPoints()[0] = FloatFloatPair.m1672boximpl(FloatFloatPair.m1675constructorimpl(m11923getXDnnuFBc(splitResultSplit.getB().getPoints()[0].m1683unboximpl()), f2));
            }
            if (!between(fM11924getYDnnuFBc, m11924getYDnnuFBc(splitResultSplit.getA().getPoints()[1].m1683unboximpl()), m11924getYDnnuFBc(splitResultSplit.getA().getPoints()[2].m1683unboximpl()))) {
                splitResultSplit.getA().getPoints()[1] = FloatFloatPair.m1672boximpl(FloatFloatPair.m1675constructorimpl(m11923getXDnnuFBc(splitResultSplit.getA().getPoints()[1].m1683unboximpl()), fM11924getYDnnuFBc));
            }
            if (!between(m11924getYDnnuFBc(splitResultSplit.getB().getPoints()[0].m1683unboximpl()), m11924getYDnnuFBc(splitResultSplit.getB().getPoints()[1].m1683unboximpl()), fM11924getYDnnuFBc2)) {
                splitResultSplit.getB().getPoints()[1] = FloatFloatPair.m1672boximpl(FloatFloatPair.m1675constructorimpl(m11923getXDnnuFBc(splitResultSplit.getB().getPoints()[1].m1683unboximpl()), fM11924getYDnnuFBc2));
            }
        }
        int i3 = i2 - 1;
        subdivide(splitResultSplit.getA(), arrayList, i3);
        subdivide(splitResultSplit.getB(), arrayList, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: times-ybeJwSQ, reason: not valid java name */
    public static final long m11927timesybeJwSQ(long j2, long j3) {
        return FloatFloatPair.m1675constructorimpl(m11923getXDnnuFBc(j2) * m11923getXDnnuFBc(j3), m11924getYDnnuFBc(j2) * m11924getYDnnuFBc(j3));
    }

    private static final Conic toConic(float[] fArr, int i2, float f2) {
        return new Conic(new FloatFloatPair[]{FloatFloatPair.m1672boximpl(FloatFloatPair.m1675constructorimpl(fArr[i2], fArr[i2 + 1])), FloatFloatPair.m1672boximpl(FloatFloatPair.m1675constructorimpl(fArr[i2 + 2], fArr[i2 + 3])), FloatFloatPair.m1672boximpl(FloatFloatPair.m1675constructorimpl(fArr[i2 + 4], fArr[i2 + 5]))}, f2);
    }
}
