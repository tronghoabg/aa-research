package androidx.graphics.path;

import androidx.collection.FloatFloatPair;
import androidx.media3.exoplayer.upstream.CmcdData;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class Conic {
    private final FloatFloatPair[] points;
    private final float weight;

    /* compiled from: WazeSource */
    public final class SplitResult {

        /* renamed from: a, reason: collision with root package name */
        private final Conic f1681a;

        /* renamed from: b, reason: collision with root package name */
        private final Conic f1682b;

        public SplitResult(Conic conic, Conic conic2) {
            x.f(conic, CmcdData.OBJECT_TYPE_AUDIO_ONLY);
            x.f(conic2, "b");
            this.f1681a = conic;
            this.f1682b = conic2;
        }

        public final Conic getA() {
            return this.f1681a;
        }

        public final Conic getB() {
            return this.f1682b;
        }
    }

    public Conic(FloatFloatPair[] floatFloatPairArr, float f2) {
        x.f(floatFloatPairArr, "points");
        this.points = floatFloatPairArr;
        this.weight = f2;
    }

    public final int commonFinitePointCheck(ArrayList<Float> arrayList, int i2) {
        x.f(arrayList, "dstPoints");
        Iterator<Float> it = arrayList.iterator();
        x.e(it, "iterator(...)");
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Float next = it.next();
            x.e(next, "next(...)");
            if (Math.abs(next.floatValue()) > Float.MAX_VALUE) {
                int size = arrayList.size() / 2;
                long jM1683unboximpl = this.points[1].m1683unboximpl();
                for (int i3 = 1; i3 < size; i3++) {
                    int i4 = i3 + i3;
                    arrayList.set(i4, Float.valueOf(ConicsImplKt.m11923getXDnnuFBc(jM1683unboximpl)));
                    arrayList.set(i4 + 1, Float.valueOf(ConicsImplKt.m11924getYDnnuFBc(jM1683unboximpl)));
                }
            }
        }
        return 1 << i2;
    }

    public final int computeQuadraticCount(float f2) {
        int i2 = 0;
        float fM11923getXDnnuFBc = ConicsImplKt.m11923getXDnnuFBc(this.points[0].m1683unboximpl());
        float fM11923getXDnnuFBc2 = ConicsImplKt.m11923getXDnnuFBc(this.points[1].m1683unboximpl());
        float fM11923getXDnnuFBc3 = (fM11923getXDnnuFBc - (fM11923getXDnnuFBc2 + fM11923getXDnnuFBc2)) + ConicsImplKt.m11923getXDnnuFBc(this.points[2].m1683unboximpl());
        float fM11924getYDnnuFBc = ConicsImplKt.m11924getYDnnuFBc(this.points[0].m1683unboximpl());
        float fM11924getYDnnuFBc2 = ConicsImplKt.m11924getYDnnuFBc(this.points[1].m1683unboximpl());
        float fM11924getYDnnuFBc3 = (fM11924getYDnnuFBc - (fM11924getYDnnuFBc2 + fM11924getYDnnuFBc2)) + ConicsImplKt.m11924getYDnnuFBc(this.points[2].m1683unboximpl());
        float f3 = this.weight - 1.0f;
        float f4 = f3 / ((2.0f + f3) * 4.0f);
        float f5 = fM11924getYDnnuFBc3 * f4;
        float f6 = f4 * fM11923getXDnnuFBc3;
        float fSqrt = (float) Math.sqrt((f6 * f6) + (f5 * f5));
        while (i2 < 5 && fSqrt > f2) {
            fSqrt *= 0.25f;
            i2++;
        }
        return i2;
    }

    public final FloatFloatPair[] getPoints() {
        return this.points;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final SplitResult split() {
        char c2;
        char c3;
        float f2 = 1.0f / (this.weight + 1.0f);
        long jM1675constructorimpl = FloatFloatPair.m1675constructorimpl(f2, f2);
        float fSqrt = (float) Math.sqrt((r1 * 0.5f) + 0.5f);
        long jM1683unboximpl = this.points[0].m1683unboximpl();
        long jM1683unboximpl2 = this.points[1].m1683unboximpl();
        long jM1683unboximpl3 = this.points[2].m1683unboximpl();
        float f3 = this.weight;
        long jM11927timesybeJwSQ = ConicsImplKt.m11927timesybeJwSQ(FloatFloatPair.m1675constructorimpl(f3, f3), jM1683unboximpl2);
        long jM11927timesybeJwSQ2 = ConicsImplKt.m11927timesybeJwSQ(ConicsImplKt.m11927timesybeJwSQ(ConicsImplKt.m11926plusybeJwSQ(ConicsImplKt.m11926plusybeJwSQ(ConicsImplKt.m11926plusybeJwSQ(jM1683unboximpl, jM11927timesybeJwSQ), jM11927timesybeJwSQ), jM1683unboximpl3), jM1675constructorimpl), FloatFloatPair.m1675constructorimpl(0.5f, 0.5f));
        if (ConicsImplKt.m11925isFiniteDnnuFBc(jM11927timesybeJwSQ2)) {
            c2 = 0;
            c3 = 2;
        } else {
            float f4 = this.weight;
            c2 = 0;
            c3 = 2;
            double d2 = f4;
            double d3 = 1.0d / (d2 + 1.0d);
            double d4 = d2 + d2;
            double d5 = d3 * 0.5d;
            jM11927timesybeJwSQ2 = FloatFloatPair.m1675constructorimpl((float) ((ConicsImplKt.m11923getXDnnuFBc(jM1683unboximpl) + (d4 * ConicsImplKt.m11923getXDnnuFBc(jM1683unboximpl2)) + ConicsImplKt.m11923getXDnnuFBc(jM1683unboximpl3)) * d5), (float) ((ConicsImplKt.m11924getYDnnuFBc(jM1683unboximpl) + (ConicsImplKt.m11924getYDnnuFBc(jM1683unboximpl2) * d4) + ConicsImplKt.m11924getYDnnuFBc(jM1683unboximpl3)) * d5));
        }
        FloatFloatPair[] floatFloatPairArr = new FloatFloatPair[3];
        floatFloatPairArr[c2] = FloatFloatPair.m1672boximpl(jM1683unboximpl);
        floatFloatPairArr[1] = FloatFloatPair.m1672boximpl(ConicsImplKt.m11927timesybeJwSQ(ConicsImplKt.m11926plusybeJwSQ(jM1683unboximpl, jM11927timesybeJwSQ), jM1675constructorimpl));
        floatFloatPairArr[c3] = FloatFloatPair.m1672boximpl(jM11927timesybeJwSQ2);
        Conic conic = new Conic(floatFloatPairArr, fSqrt);
        FloatFloatPair[] floatFloatPairArr2 = new FloatFloatPair[3];
        floatFloatPairArr2[c2] = FloatFloatPair.m1672boximpl(jM11927timesybeJwSQ2);
        floatFloatPairArr2[1] = FloatFloatPair.m1672boximpl(ConicsImplKt.m11927timesybeJwSQ(ConicsImplKt.m11926plusybeJwSQ(jM11927timesybeJwSQ, jM1683unboximpl3), jM1675constructorimpl));
        floatFloatPairArr2[c3] = FloatFloatPair.m1672boximpl(jM1683unboximpl3);
        return new SplitResult(conic, new Conic(floatFloatPairArr2, fSqrt));
    }

    public final int splitIntoQuadratics(ArrayList<Float> arrayList, int i2) {
        x.f(arrayList, "dstPoints");
        ConicsImplKt.m11921addHiPawso(arrayList, this.points[0].m1683unboximpl());
        ConicsImplKt.subdivide(this, arrayList, i2);
        return commonFinitePointCheck(arrayList, i2);
    }
}
