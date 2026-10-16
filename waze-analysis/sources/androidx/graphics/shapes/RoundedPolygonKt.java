package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import androidx.collection.MutableFloatList;
import androidx.graphics.shapes.Feature;
import androidx.media3.muxer.MuxerUtil;
import h.a.aj;
import h.a.i;
import h.g.b.x;
import h.k;
import h.k.j;
import h.k.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class RoundedPolygonKt {
    public static final RoundedPolygon RoundedPolygon(float[] fArr, CornerRounding cornerRounding, List<CornerRounding> list, float f2, float f3) {
        k kVar;
        CornerRounding cornerRounding2;
        x.f(fArr, "vertices");
        x.f(cornerRounding, "rounding");
        int length = fArr.length;
        if (length < 6) {
            throw new IllegalArgumentException("Polygons must have at least 3 vertices");
        }
        if ((length & 1) == 1) {
            throw new IllegalArgumentException("The vertices array should have even size");
        }
        if (list != null) {
            int size = list.size();
            if (size + size != length) {
                throw new IllegalArgumentException("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
            }
        }
        ArrayList arrayList = new ArrayList();
        int i2 = length >> 1;
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (i4 < i2) {
            CornerRounding cornerRounding3 = (list == null || (cornerRounding2 = list.get(i4)) == null) ? cornerRounding : cornerRounding2;
            int i5 = ((i4 + i2) - 1) % i2;
            int i6 = i4 + 1;
            int i7 = i6 % i2;
            int i8 = i5 + i5;
            int i9 = i4 + i4;
            int i10 = i7 + i7;
            arrayList2.add(new RoundedCorner(FloatFloatPair.m1675constructorimpl(fArr[i8], fArr[i8 + 1]), FloatFloatPair.m1675constructorimpl(fArr[i9], fArr[i9 + 1]), FloatFloatPair.m1675constructorimpl(fArr[i10], fArr[i10 + 1]), cornerRounding3, null));
            i4 = i6;
        }
        j jVarU = n.u(0, i2);
        ArrayList arrayList3 = new ArrayList(i.q(jVarU, 10));
        Iterator<Integer> it = jVarU.iterator();
        while (it.hasNext()) {
            int iNextInt = ((aj) it).nextInt();
            int i11 = (iNextInt + 1) % i2;
            float expectedRoundCut = ((RoundedCorner) arrayList2.get(iNextInt)).getExpectedRoundCut() + ((RoundedCorner) arrayList2.get(i11)).getExpectedRoundCut();
            float expectedCut = ((RoundedCorner) arrayList2.get(iNextInt)).getExpectedCut() + ((RoundedCorner) arrayList2.get(i11)).getExpectedCut();
            int i12 = iNextInt + iNextInt;
            int i13 = i11 + i11;
            float fDistance = Utils.distance(fArr[i12] - fArr[i13], fArr[i12 + 1] - fArr[i13 + 1]);
            if (expectedRoundCut > fDistance) {
                kVar = new k(Float.valueOf(fDistance / expectedRoundCut), Float.valueOf(0.0f));
            } else if (expectedCut > fDistance) {
                kVar = new k(Float.valueOf(1.0f), Float.valueOf((fDistance - expectedRoundCut) / (expectedCut - expectedRoundCut)));
            } else {
                Float fValueOf = Float.valueOf(1.0f);
                kVar = new k(fValueOf, fValueOf);
            }
            arrayList3.add(kVar);
        }
        ArrayList arrayList4 = arrayList3;
        for (int i14 = 0; i14 < i2; i14++) {
            MutableFloatList mutableFloatList = new MutableFloatList(2);
            for (int i15 = 0; i15 < 2; i15++) {
                k kVar2 = (k) arrayList4.get((((i14 + i2) - 1) + i15) % i2);
                mutableFloatList.add((((RoundedCorner) arrayList2.get(i14)).getExpectedRoundCut() * ((Number) kVar2.a()).floatValue()) + ((((RoundedCorner) arrayList2.get(i14)).getExpectedCut() - ((RoundedCorner) arrayList2.get(i14)).getExpectedRoundCut()) * ((Number) kVar2.b()).floatValue()));
            }
            arrayList.add(((RoundedCorner) arrayList2.get(i14)).getCubics(mutableFloatList.get(0), mutableFloatList.get(1)));
        }
        ArrayList arrayList5 = new ArrayList();
        while (i3 < i2) {
            int i16 = i3 + 1;
            int i17 = i3 + i3;
            long jM1675constructorimpl = FloatFloatPair.m1675constructorimpl(fArr[i17], fArr[i17 + 1]);
            int i18 = ((i3 + i2) - 1) % i2;
            int i19 = i18 + i18;
            long jM1675constructorimpl2 = FloatFloatPair.m1675constructorimpl(fArr[i19], fArr[i19 + 1]);
            int i20 = i16 % i2;
            int i21 = i20 + i20;
            arrayList5.add(new Feature.Corner((List) arrayList.get(i3), Utils.m11972convexb22R3LQ(jM1675constructorimpl2, jM1675constructorimpl, FloatFloatPair.m1675constructorimpl(fArr[i21], fArr[i21 + 1]))));
            arrayList5.add(new Feature.Edge(i.d(Cubic.Companion.straightLine(((Cubic) i.T((List) arrayList.get(i3))).getAnchor1X(), ((Cubic) i.T((List) arrayList.get(i3))).getAnchor1Y(), ((Cubic) i.P((List) arrayList.get(i20))).getAnchor0X(), ((Cubic) i.P((List) arrayList.get(i20))).getAnchor0Y()))));
            i3 = i16;
        }
        long jCalculateCenter = (f2 == Float.MIN_VALUE || f3 == Float.MIN_VALUE) ? calculateCenter(fArr) : FloatFloatPair.m1675constructorimpl(f2, f3);
        return RoundedPolygon(arrayList5, Float.intBitsToFloat((int) (jCalculateCenter >> 32)), Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & jCalculateCenter)));
    }

    public static /* synthetic */ RoundedPolygon RoundedPolygon$default(int i2, float f2, float f3, float f4, CornerRounding cornerRounding, List list, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            cornerRounding = CornerRounding.Unrounded;
        }
        CornerRounding cornerRounding2 = cornerRounding;
        int i4 = i3 & 4;
        int i5 = i3 & 2;
        float f5 = (i3 & 8) != 0 ? 0.0f : f4;
        float f6 = i4 != 0 ? 0.0f : f3;
        if (i5 != 0) {
            f2 = 1.0f;
        }
        float f7 = f2;
        if ((i3 & 32) != 0) {
            list = null;
        }
        return RoundedPolygon(i2, f7, f6, f5, cornerRounding2, list);
    }

    public static final long calculateCenter(float[] fArr) {
        x.f(fArr, "vertices");
        int i2 = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (true) {
            int length = fArr.length;
            if (i2 >= length) {
                float f4 = length >> 1;
                return FloatFloatPair.m1675constructorimpl(f2 / f4, f3 / f4);
            }
            int i3 = i2 + 1;
            f2 += fArr[i2];
            i2 += 2;
            f3 += fArr[i3];
        }
    }

    private static final float[] verticesFromNumVerts(int i2, float f2, float f3, float f4) {
        float[] fArr = new float[i2 + i2];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            float floatPi = Utils.getFloatPi() / i2;
            float f5 = f2;
            long jM11944plusybeJwSQ = PointKt.m11944plusybeJwSQ(Utils.m11974radialToCartesianL6JJ3z0$default(f5, (floatPi + floatPi) * i3, 0L, 4, null), FloatFloatPair.m1675constructorimpl(f3, f4));
            fArr[i4] = PointKt.m11940getXDnnuFBc(jM11944plusybeJwSQ);
            fArr[i4 + 1] = PointKt.m11941getYDnnuFBc(jM11944plusybeJwSQ);
            i4 += 2;
            i3++;
            f2 = f5;
        }
        return fArr;
    }

    public static /* synthetic */ RoundedPolygon RoundedPolygon$default(List list, float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            f3 = Float.NaN;
        }
        return RoundedPolygon((List<? extends Feature>) list, f2, f3);
    }

    public static /* synthetic */ RoundedPolygon RoundedPolygon$default(float[] fArr, CornerRounding cornerRounding, List list, float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            cornerRounding = CornerRounding.Unrounded;
        }
        if ((i2 & 4) != 0) {
            list = null;
        }
        if ((i2 & 8) != 0) {
            f2 = Float.MIN_VALUE;
        }
        if ((i2 & 16) != 0) {
            f3 = Float.MIN_VALUE;
        }
        return RoundedPolygon(fArr, cornerRounding, (List<CornerRounding>) list, f2, f3);
    }

    public static final RoundedPolygon RoundedPolygon(int i2, float f2) {
        return RoundedPolygon$default(i2, f2, 0.0f, 0.0f, null, null, 60, null);
    }

    public static final RoundedPolygon RoundedPolygon(int i2, float f2, float f3) {
        return RoundedPolygon$default(i2, f2, f3, 0.0f, null, null, 56, null);
    }

    public static final RoundedPolygon RoundedPolygon(int i2, float f2, float f3, float f4) {
        return RoundedPolygon$default(i2, f2, f3, f4, null, null, 48, null);
    }

    public static final RoundedPolygon RoundedPolygon(int i2, float f2, float f3, float f4, CornerRounding cornerRounding) {
        x.f(cornerRounding, "rounding");
        return RoundedPolygon$default(i2, f2, f3, f4, cornerRounding, null, 32, null);
    }

    public static final RoundedPolygon RoundedPolygon(List<? extends Feature> list) {
        x.f(list, "features");
        return RoundedPolygon$default(list, 0.0f, 0.0f, 6, null);
    }

    public static final RoundedPolygon RoundedPolygon(List<? extends Feature> list, float f2) {
        x.f(list, "features");
        return RoundedPolygon$default(list, f2, 0.0f, 4, null);
    }

    public static final RoundedPolygon RoundedPolygon(float[] fArr) {
        x.f(fArr, "vertices");
        return RoundedPolygon$default(fArr, null, null, 0.0f, 0.0f, 30, null);
    }

    public static final RoundedPolygon RoundedPolygon(float[] fArr, CornerRounding cornerRounding) {
        x.f(fArr, "vertices");
        x.f(cornerRounding, "rounding");
        return RoundedPolygon$default(fArr, cornerRounding, null, 0.0f, 0.0f, 28, null);
    }

    public static final RoundedPolygon RoundedPolygon(float[] fArr, CornerRounding cornerRounding, List<CornerRounding> list) {
        x.f(fArr, "vertices");
        x.f(cornerRounding, "rounding");
        return RoundedPolygon$default(fArr, cornerRounding, list, 0.0f, 0.0f, 24, null);
    }

    public static final RoundedPolygon RoundedPolygon(float[] fArr, CornerRounding cornerRounding, List<CornerRounding> list, float f2) {
        x.f(fArr, "vertices");
        x.f(cornerRounding, "rounding");
        return RoundedPolygon$default(fArr, cornerRounding, list, f2, 0.0f, 16, null);
    }

    public static final RoundedPolygon RoundedPolygon(int i2, float f2, float f3, float f4, CornerRounding cornerRounding, List<CornerRounding> list) {
        x.f(cornerRounding, "rounding");
        return RoundedPolygon(verticesFromNumVerts(i2, f2, f3, f4), cornerRounding, list, f3, f4);
    }

    public static final RoundedPolygon RoundedPolygon(List<? extends Feature> list, float f2, float f3) {
        x.f(list, "features");
        if (list.size() >= 2) {
            List listB = i.b();
            Iterator<? extends Feature> it = list.iterator();
            while (it.hasNext()) {
                for (Cubic cubic : it.next().getCubics()) {
                    listB.add(Float.valueOf(cubic.getAnchor0X()));
                    listB.add(Float.valueOf(cubic.getAnchor0Y()));
                }
            }
            float[] fArrAz = i.az(i.a(listB));
            if (Float.isNaN(f2)) {
                f2 = Float.intBitsToFloat((int) (calculateCenter(fArrAz) >> 32));
            }
            if (Float.isNaN(f3)) {
                f3 = Float.intBitsToFloat((int) (calculateCenter(fArrAz) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
            }
            return new RoundedPolygon(list, FloatFloatPair.m1675constructorimpl(f2, f3), null);
        }
        throw new IllegalArgumentException("Polygons must have at least 2 features");
    }

    public static final RoundedPolygon RoundedPolygon(int i2) {
        return RoundedPolygon$default(i2, 0.0f, 0.0f, 0.0f, null, null, 62, null);
    }

    public static final RoundedPolygon RoundedPolygon(RoundedPolygon roundedPolygon) {
        x.f(roundedPolygon, "source");
        return new RoundedPolygon(roundedPolygon.getFeatures(), roundedPolygon.m11958getCenter1ufDz9w$graphics_shapes(), null);
    }
}
