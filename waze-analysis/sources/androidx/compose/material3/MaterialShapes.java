package androidx.compose.material3;

import androidx.compose.material3.internal.ShapeUtilKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Matrix;
import androidx.graphics.shapes.CornerRounding;
import androidx.graphics.shapes.RoundedPolygon;
import androidx.graphics.shapes.RoundedPolygonKt;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.a.aj;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import h.k.j;
import h.k.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class MaterialShapes {
    public static final int $stable = 0;
    private static RoundedPolygon _arch;
    private static RoundedPolygon _arrow;
    private static RoundedPolygon _boom;
    private static RoundedPolygon _bun;
    private static RoundedPolygon _burst;
    private static RoundedPolygon _circle;
    private static RoundedPolygon _clamShell;
    private static RoundedPolygon _clover4Leaf;
    private static RoundedPolygon _clover8Leaf;
    private static RoundedPolygon _cookie12Sided;
    private static RoundedPolygon _cookie4Sided;
    private static RoundedPolygon _cookie6Sided;
    private static RoundedPolygon _cookie7Sided;
    private static RoundedPolygon _cookie9Sided;
    private static RoundedPolygon _diamond;
    private static RoundedPolygon _fan;
    private static RoundedPolygon _flower;
    private static RoundedPolygon _gem;
    private static RoundedPolygon _ghostish;
    private static RoundedPolygon _heart;
    private static RoundedPolygon _oval;
    private static RoundedPolygon _pentagon;
    private static RoundedPolygon _pill;
    private static RoundedPolygon _pixelCircle;
    private static RoundedPolygon _pixelTriangle;
    private static RoundedPolygon _puffy;
    private static RoundedPolygon _puffyDiamond;
    private static RoundedPolygon _semiCircle;
    private static RoundedPolygon _slanted;
    private static RoundedPolygon _softBoom;
    private static RoundedPolygon _softBurst;
    private static RoundedPolygon _square;
    private static RoundedPolygon _sunny;
    private static RoundedPolygon _triangle;
    private static RoundedPolygon _verySunny;
    private static final float[] rotateNeg135;
    private static final float[] rotateNeg45;
    private static final float[] rotateNeg90;
    public static final Companion Companion = new Companion(null);
    private static final CornerRounding cornerRound15 = new CornerRounding(0.15f, 0.0f, 2, null);
    private static final CornerRounding cornerRound20 = new CornerRounding(0.2f, 0.0f, 2, null);
    private static final CornerRounding cornerRound30 = new CornerRounding(0.3f, 0.0f, 2, null);
    private static final CornerRounding cornerRound50 = new CornerRounding(0.5f, 0.0f, 2, null);
    private static final CornerRounding cornerRound100 = new CornerRounding(1.0f, 0.0f, 2, null);

    static {
        float[] fArrM8492constructorimpl$default = Matrix.m8492constructorimpl$default(null, 1, null);
        Matrix.m8506rotateZimpl(fArrM8492constructorimpl$default, -45.0f);
        rotateNeg45 = fArrM8492constructorimpl$default;
        float[] fArrM8492constructorimpl$default2 = Matrix.m8492constructorimpl$default(null, 1, null);
        Matrix.m8506rotateZimpl(fArrM8492constructorimpl$default2, -90.0f);
        rotateNeg90 = fArrM8492constructorimpl$default2;
        float[] fArrM8492constructorimpl$default3 = Matrix.m8492constructorimpl$default(null, 1, null);
        Matrix.m8506rotateZimpl(fArrM8492constructorimpl$default3, -135.0f);
        rotateNeg135 = fArrM8492constructorimpl$default3;
    }

    private MaterialShapes() {
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: angleDegrees-k-4lQ0M, reason: not valid java name */
        private final float m5183angleDegreesk4lQ0M(long j2) {
            return (((float) Math.atan2(Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)), Float.intBitsToFloat((int) (j2 >> 32)))) * 180.0f) / 3.1415927f;
        }

        public static /* synthetic */ RoundedPolygon circle$material3$default(Companion companion, int i2, int i3, Object obj) {
            if (1 == (i3 & 1)) {
                i2 = 10;
            }
            return companion.circle$material3(i2);
        }

        /* renamed from: customPolygon-Rg1IO4c, reason: not valid java name */
        private final RoundedPolygon m5184customPolygonRg1IO4c(List<PointNRound> list, int i2, long j2, boolean z) {
            List<PointNRound> listM5186doRepeatRg1IO4c = m5186doRepeatRg1IO4c(list, i2, j2, z);
            int size = listM5186doRepeatRg1IO4c.size();
            int i3 = size + size;
            float[] fArr = new float[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                long jM5192getOF1C5BW0 = listM5186doRepeatRg1IO4c.get(i4 / 2).m5192getOF1C5BW0();
                fArr[i4] = Float.intBitsToFloat((int) (i4 % 2 == 0 ? jM5192getOF1C5BW0 >> 32 : MuxerUtil.UNSIGNED_INT_MAX_VALUE & jM5192getOF1C5BW0));
            }
            List listB = i.b();
            Iterator<PointNRound> it = listM5186doRepeatRg1IO4c.iterator();
            while (it.hasNext()) {
                listB.add(it.next().getR());
            }
            return RoundedPolygonKt.RoundedPolygon$default(fArr, null, i.a(listB), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), 2, null);
        }

        /* renamed from: customPolygon-Rg1IO4c$default, reason: not valid java name */
        static /* synthetic */ RoundedPolygon m5185customPolygonRg1IO4c$default(Companion companion, List list, int i2, long j2, boolean z, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                j2 = (Float.floatToRawIntBits(0.5f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(0.5f) << 32);
            }
            return companion.m5184customPolygonRg1IO4c(list, i2, j2, ((i3 & 8) == 0) & z);
        }

        /* renamed from: doRepeat-Rg1IO4c, reason: not valid java name */
        private final List<PointNRound> m5186doRepeatRg1IO4c(List<PointNRound> list, int i2, long j2, boolean z) {
            float fFloatValue;
            long j3 = j2;
            int i3 = 0;
            if (!z) {
                int size = list.size();
                j jVarU = n.u(0, size * i2);
                ArrayList arrayList = new ArrayList(i.q(jVarU, 10));
                Iterator<Integer> it = jVarU.iterator();
                while (it.hasNext()) {
                    int iNextInt = ((aj) it).nextInt() % size;
                    arrayList.add(new PointNRound(MaterialShapes.Companion.m5187rotateDegreesHo4pAXE(list.get(iNextInt).m5192getOF1C5BW0(), ((r2 / size) * 360.0f) / i2, j3), list.get(iNextInt).getR(), null));
                    j3 = j2;
                }
                return arrayList;
            }
            List listB = i.b();
            ArrayList arrayList2 = new ArrayList(list.size());
            List<PointNRound> list2 = list;
            int i4 = 0;
            for (int size2 = list2.size(); i4 < size2; size2 = size2) {
                arrayList2.add(Float.valueOf(MaterialShapes.Companion.m5183angleDegreesk4lQ0M(Offset.m7984minusMKHz9U(list.get(i4).m5192getOF1C5BW0(), j3))));
                i4++;
            }
            ArrayList arrayList3 = arrayList2;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list2.size();
            for (int i5 = 0; i5 < size3; i5++) {
                arrayList4.add(Float.valueOf(Offset.m7978getDistanceimpl(Offset.m7984minusMKHz9U(list.get(i5).m5192getOF1C5BW0(), j3))));
            }
            ArrayList arrayList5 = arrayList4;
            int i6 = i2 + i2;
            float f2 = 360.0f / i6;
            int i7 = 0;
            while (i7 < i6) {
                Iterator<Integer> it2 = i.n(list2).iterator();
                while (it2.hasNext()) {
                    int iNextInt2 = ((aj) it2).nextInt();
                    int i8 = i7 % 2;
                    if (i8 != 0) {
                        iNextInt2 = i.e(list) - iNextInt2;
                    }
                    if (iNextInt2 <= 0) {
                        if (i8 == 0) {
                            i8 = i3;
                        }
                    }
                    float f3 = i7 * f2;
                    Companion companion = MaterialShapes.Companion;
                    if (i8 == 0) {
                        fFloatValue = ((Number) arrayList3.get(iNextInt2)).floatValue();
                    } else {
                        float fFloatValue2 = f2 - ((Number) arrayList3.get(iNextInt2)).floatValue();
                        float fFloatValue3 = ((Number) arrayList3.get(i3)).floatValue();
                        fFloatValue = fFloatValue2 + fFloatValue3 + fFloatValue3;
                    }
                    double radians = companion.toRadians(f3 + fFloatValue);
                    List list3 = listB;
                    float fCos = (float) Math.cos(radians);
                    float fSin = (float) Math.sin(radians);
                    long jFloatToRawIntBits = Float.floatToRawIntBits(fCos);
                    list3.add(new PointNRound(Offset.m7985plusMKHz9U(Offset.m7987timestuRUvjQ((Float.floatToRawIntBits(fSin) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32), ((Number) arrayList5.get(iNextInt2)).floatValue()), j3), list.get(iNextInt2).getR(), null));
                    listB = list3;
                    i3 = 0;
                }
                i7++;
                i3 = 0;
            }
            return i.a(listB);
        }

        /* renamed from: rotateDegrees-Ho4pAXE, reason: not valid java name */
        private final long m5187rotateDegreesHo4pAXE(long j2, float f2, long j3) {
            long jM7984minusMKHz9U = Offset.m7984minusMKHz9U(j2, j3);
            double radians = toRadians(f2);
            int i2 = (int) (jM7984minusMKHz9U >> 32);
            float fIntBitsToFloat = Float.intBitsToFloat(i2) * ((float) Math.cos(radians));
            int i3 = (int) (jM7984minusMKHz9U & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            float fIntBitsToFloat2 = Float.intBitsToFloat(i3) * ((float) Math.sin(radians));
            float fIntBitsToFloat3 = Float.intBitsToFloat(i2) * ((float) Math.sin(radians));
            float fIntBitsToFloat4 = Float.intBitsToFloat(i3) * ((float) Math.cos(radians));
            return Offset.m7985plusMKHz9U((Float.floatToRawIntBits(fIntBitsToFloat3 + fIntBitsToFloat4) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fIntBitsToFloat - fIntBitsToFloat2) << 32), j3);
        }

        /* renamed from: rotateDegrees-Ho4pAXE$default, reason: not valid java name */
        static /* synthetic */ long m5188rotateDegreesHo4pAXE$default(Companion companion, long j2, float f2, long j3, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j3 = Offset.Companion.m7996getZeroF1C5BW0();
            }
            return companion.m5187rotateDegreesHo4pAXE(j2, f2, j3);
        }

        private final float toRadians(float f2) {
            float f3 = f2 / 360.0f;
            return (f3 + f3) * 3.1415927f;
        }

        public final RoundedPolygon arch$material3() {
            return ShapeUtilKt.m6288transformedEL8BTi8(RoundedPolygonKt.RoundedPolygon$default(4, 0.0f, 0.0f, 0.0f, null, i.i(MaterialShapes.cornerRound100, MaterialShapes.cornerRound100, MaterialShapes.cornerRound20, MaterialShapes.cornerRound20), 30, null), MaterialShapes.rotateNeg135);
        }

        public final RoundedPolygon arrow$material3() {
            long jFloatToRawIntBits = Float.floatToRawIntBits(0.5f);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.892f);
            o oVar = null;
            CornerRounding cornerRounding = new CornerRounding(0.313f, 0.0f, 2, null);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(-0.216f);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(1.05f);
            return m5185customPolygonRg1IO4c$default(this, i.i(new PointNRound((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), cornerRounding, oVar), new PointNRound((jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.207f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(0.499f) << 32) | (Float.floatToRawIntBits(-0.16f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.215f, 1.0f), oVar), new PointNRound((Float.floatToRawIntBits(1.225f) << 32) | (Float.floatToRawIntBits(1.06f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.211f, 0.0f, 2, null), oVar)), 1, 0L, false, 12, null);
        }

        public final RoundedPolygon boom$material3() {
            o oVar = null;
            return m5185customPolygonRg1IO4c$default(this, i.i(new PointNRound((Float.floatToRawIntBits(0.457f) << 32) | (Float.floatToRawIntBits(0.296f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.007f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(-0.051f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.007f, 0.0f, 2, null), oVar)), 15, 0L, false, 12, null);
        }

        public final RoundedPolygon bun$material3() {
            long jFloatToRawIntBits = Float.floatToRawIntBits(0.796f);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.853f);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.518f);
            o oVar = null;
            return m5185customPolygonRg1IO4c$default(this, i.i(new PointNRound((jFloatToRawIntBits << 32) | (Float.floatToRawIntBits(0.5f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((jFloatToRawIntBits2 << 32) | (jFloatToRawIntBits3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(1.0f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(0.992f) << 32) | (Float.floatToRawIntBits(0.631f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(1.0f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(0.968f) << 32) | (Float.floatToRawIntBits(1.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(1.0f, 0.0f, 2, null), oVar)), 2, 0L, true, 4, null);
        }

        public final RoundedPolygon burst$material3() {
            o oVar = null;
            return m5185customPolygonRg1IO4c$default(this, i.i(new PointNRound((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(-0.006f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.006f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(0.592f) << 32) | (Float.floatToRawIntBits(0.158f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.006f, 0.0f, 2, null), oVar)), 12, 0L, false, 12, null);
        }

        public final RoundedPolygon circle$material3(int i2) {
            return androidx.graphics.shapes.ShapesKt.circle$default(RoundedPolygon.Companion, i2, 0.0f, 0.0f, 0.0f, 14, null);
        }

        public final RoundedPolygon clamShell$material3() {
            long jFloatToRawIntBits = Float.floatToRawIntBits(0.171f);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.841f);
            o oVar = null;
            return m5185customPolygonRg1IO4c$default(this, i.i(new PointNRound((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.159f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(-0.02f) << 32) | (Float.floatToRawIntBits(0.5f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.14f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(0.17f) << 32) | (Float.floatToRawIntBits(0.159f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.159f, 0.0f, 2, null), oVar)), 2, 0L, false, 12, null);
        }

        public final RoundedPolygon clover4$material3() {
            return m5185customPolygonRg1IO4c$default(this, i.i(new PointNRound((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.074f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((Float.floatToRawIntBits(0.725f) << 32) | (Float.floatToRawIntBits(-0.099f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.476f, 0.0f, 2, null), null)), 4, 0L, true, 4, null);
        }

        public final RoundedPolygon clover8$material3() {
            return m5185customPolygonRg1IO4c$default(this, i.i(new PointNRound((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.036f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((Float.floatToRawIntBits(0.758f) << 32) | (Float.floatToRawIntBits(-0.101f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.209f, 0.0f, 2, null), null)), 8, 0L, false, 12, null);
        }

        public final RoundedPolygon cookie12$material3() {
            return ShapeUtilKt.m6288transformedEL8BTi8(androidx.graphics.shapes.ShapesKt.star$default(RoundedPolygon.Companion, 12, 0.0f, 0.8f, MaterialShapes.cornerRound50, null, null, 0.0f, 0.0f, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PREFERENCES_5, null), MaterialShapes.rotateNeg90);
        }

        public final RoundedPolygon cookie4$material3() {
            o oVar = null;
            return m5185customPolygonRg1IO4c$default(this, i.i(new PointNRound((Float.floatToRawIntBits(1.237f) << 32) | (Float.floatToRawIntBits(1.236f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.258f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.918f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.233f, 0.0f, 2, null), oVar)), 4, 0L, false, 12, null);
        }

        public final RoundedPolygon cookie6$material3() {
            o oVar = null;
            return m5185customPolygonRg1IO4c$default(this, i.i(new PointNRound((Float.floatToRawIntBits(0.723f) << 32) | (Float.floatToRawIntBits(0.884f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.394f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(1.099f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.398f, 0.0f, 2, null), oVar)), 6, 0L, false, 12, null);
        }

        public final RoundedPolygon cookie7$material3() {
            return ShapeUtilKt.m6288transformedEL8BTi8(androidx.graphics.shapes.ShapesKt.star$default(RoundedPolygon.Companion, 7, 0.0f, 0.75f, MaterialShapes.cornerRound50, null, null, 0.0f, 0.0f, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PREFERENCES_5, null), MaterialShapes.rotateNeg90);
        }

        public final RoundedPolygon cookie9$material3() {
            return ShapeUtilKt.m6288transformedEL8BTi8(androidx.graphics.shapes.ShapesKt.star$default(RoundedPolygon.Companion, 9, 0.0f, 0.8f, MaterialShapes.cornerRound50, null, null, 0.0f, 0.0f, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PREFERENCES_5, null), MaterialShapes.rotateNeg90);
        }

        public final RoundedPolygon diamond$material3() {
            long jFloatToRawIntBits = Float.floatToRawIntBits(0.5f);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(1.096f);
            CornerRounding cornerRounding = new CornerRounding(0.151f, 0.524f);
            long j2 = (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            o oVar = null;
            return m5185customPolygonRg1IO4c$default(this, i.i(new PointNRound(j2, cornerRounding, oVar), new PointNRound((Float.floatToRawIntBits(0.04f) << 32) | (Float.floatToRawIntBits(0.5f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.159f, 0.0f, 2, null), oVar)), 2, 0L, false, 12, null);
        }

        public final RoundedPolygon fan$material3() {
            long jFloatToRawIntBits = Float.floatToRawIntBits(1.004f);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(1.0f);
            CornerRounding cornerRounding = new CornerRounding(0.148f, 0.417f);
            long j2 = (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            o oVar = null;
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(1.0f);
            return m5185customPolygonRg1IO4c$default(this, i.i(new PointNRound(j2, cornerRounding, oVar), new PointNRound((jFloatToRawIntBits4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits3 << 32), new CornerRounding(0.151f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(-0.003f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.148f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(0.978f) << 32) | (Float.floatToRawIntBits(0.02f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.803f, 0.0f, 2, null), oVar)), 1, 0L, false, 12, null);
        }

        public final RoundedPolygon flower$material3() {
            o oVar = null;
            return m5185customPolygonRg1IO4c$default(this, i.i(new PointNRound((Float.floatToRawIntBits(0.37f) << 32) | (Float.floatToRawIntBits(0.187f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((Float.floatToRawIntBits(0.416f) << 32) | (Float.floatToRawIntBits(0.049f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.381f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(0.479f) << 32) | (Float.floatToRawIntBits(0.001f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.095f, 0.0f, 2, null), oVar)), 8, 0L, true, 4, null);
        }

        public final RoundedPolygon gem$material3() {
            long jFloatToRawIntBits = Float.floatToRawIntBits(0.499f);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(1.023f);
            CornerRounding cornerRounding = new CornerRounding(0.241f, 0.778f);
            long j2 = (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            o oVar = null;
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(-0.005f);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(0.792f);
            return m5185customPolygonRg1IO4c$default(this, i.i(new PointNRound(j2, cornerRounding, oVar), new PointNRound((jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.208f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(0.073f) << 32) | (Float.floatToRawIntBits(0.258f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.228f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(0.433f) << 32) | (Float.floatToRawIntBits(0.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.491f, 0.0f, 2, null), oVar)), 1, 0L, true, 4, null);
        }

        public final RoundedPolygon getArch() {
            RoundedPolygon roundedPolygon = MaterialShapes._arch;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = arch$material3().normalized();
            MaterialShapes._arch = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getArrow() {
            RoundedPolygon roundedPolygon = MaterialShapes._arrow;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = arrow$material3().normalized();
            MaterialShapes._arrow = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getBoom() {
            RoundedPolygon roundedPolygon = MaterialShapes._boom;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = boom$material3().normalized();
            MaterialShapes._boom = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getBun() {
            RoundedPolygon roundedPolygon = MaterialShapes._bun;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = bun$material3().normalized();
            MaterialShapes._bun = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getBurst() {
            RoundedPolygon roundedPolygon = MaterialShapes._burst;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = burst$material3().normalized();
            MaterialShapes._burst = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getCircle() {
            RoundedPolygon roundedPolygon = MaterialShapes._circle;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = circle$material3$default(this, 0, 1, null).normalized();
            MaterialShapes._circle = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getClamShell() {
            RoundedPolygon roundedPolygon = MaterialShapes._clamShell;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = clamShell$material3().normalized();
            MaterialShapes._clamShell = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getClover4Leaf() {
            RoundedPolygon roundedPolygon = MaterialShapes._clover4Leaf;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = clover4$material3().normalized();
            MaterialShapes._clover4Leaf = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getClover8Leaf() {
            RoundedPolygon roundedPolygon = MaterialShapes._clover8Leaf;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = clover8$material3().normalized();
            MaterialShapes._clover8Leaf = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getCookie12Sided() {
            RoundedPolygon roundedPolygon = MaterialShapes._cookie12Sided;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = cookie12$material3().normalized();
            MaterialShapes._cookie12Sided = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getCookie4Sided() {
            RoundedPolygon roundedPolygon = MaterialShapes._cookie4Sided;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = cookie4$material3().normalized();
            MaterialShapes._cookie4Sided = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getCookie6Sided() {
            RoundedPolygon roundedPolygon = MaterialShapes._cookie6Sided;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = cookie6$material3().normalized();
            MaterialShapes._cookie6Sided = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getCookie7Sided() {
            RoundedPolygon roundedPolygon = MaterialShapes._cookie7Sided;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = cookie7$material3().normalized();
            MaterialShapes._cookie7Sided = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getCookie9Sided() {
            RoundedPolygon roundedPolygon = MaterialShapes._cookie9Sided;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = cookie9$material3().normalized();
            MaterialShapes._cookie9Sided = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getDiamond() {
            RoundedPolygon roundedPolygon = MaterialShapes._diamond;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = diamond$material3().normalized();
            MaterialShapes._diamond = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getFan() {
            RoundedPolygon roundedPolygon = MaterialShapes._fan;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = fan$material3().normalized();
            MaterialShapes._fan = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getFlower() {
            RoundedPolygon roundedPolygon = MaterialShapes._flower;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = flower$material3().normalized();
            MaterialShapes._flower = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getGem() {
            RoundedPolygon roundedPolygon = MaterialShapes._gem;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = gem$material3().normalized();
            MaterialShapes._gem = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getGhostish() {
            RoundedPolygon roundedPolygon = MaterialShapes._ghostish;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = ghostish$material3().normalized();
            MaterialShapes._ghostish = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getHeart() {
            RoundedPolygon roundedPolygon = MaterialShapes._heart;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = heart$material3().normalized();
            MaterialShapes._heart = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getOval() {
            RoundedPolygon roundedPolygon = MaterialShapes._oval;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = oval$material3().normalized();
            MaterialShapes._oval = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getPentagon() {
            RoundedPolygon roundedPolygon = MaterialShapes._pentagon;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = pentagon$material3().normalized();
            MaterialShapes._pentagon = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getPill() {
            RoundedPolygon roundedPolygon = MaterialShapes._pill;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = pill$material3().normalized();
            MaterialShapes._pill = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getPixelCircle() {
            RoundedPolygon roundedPolygon = MaterialShapes._pixelCircle;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = pixelCircle$material3().normalized();
            MaterialShapes._pixelCircle = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getPixelTriangle() {
            RoundedPolygon roundedPolygon = MaterialShapes._pixelTriangle;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = pixelTriangle$material3().normalized();
            MaterialShapes._pixelTriangle = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getPuffy() {
            RoundedPolygon roundedPolygon = MaterialShapes._puffy;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = puffy$material3().normalized();
            MaterialShapes._puffy = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getPuffyDiamond() {
            RoundedPolygon roundedPolygon = MaterialShapes._puffyDiamond;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = puffyDiamond$material3().normalized();
            MaterialShapes._puffyDiamond = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getSemiCircle() {
            RoundedPolygon roundedPolygon = MaterialShapes._semiCircle;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = semiCircle$material3().normalized();
            MaterialShapes._semiCircle = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getSlanted() {
            RoundedPolygon roundedPolygon = MaterialShapes._slanted;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = slanted$material3().normalized();
            MaterialShapes._slanted = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getSoftBoom() {
            RoundedPolygon roundedPolygon = MaterialShapes._softBoom;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = softBoom$material3().normalized();
            MaterialShapes._softBoom = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getSoftBurst() {
            RoundedPolygon roundedPolygon = MaterialShapes._softBurst;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = softBurst$material3().normalized();
            MaterialShapes._softBurst = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getSquare() {
            RoundedPolygon roundedPolygon = MaterialShapes._square;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = square$material3().normalized();
            MaterialShapes._square = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getSunny() {
            RoundedPolygon roundedPolygon = MaterialShapes._sunny;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = sunny$material3().normalized();
            MaterialShapes._sunny = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getTriangle() {
            RoundedPolygon roundedPolygon = MaterialShapes._triangle;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = triangle$material3().normalized();
            MaterialShapes._triangle = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon getVerySunny() {
            RoundedPolygon roundedPolygon = MaterialShapes._verySunny;
            if (roundedPolygon != null) {
                return roundedPolygon;
            }
            RoundedPolygon roundedPolygonNormalized = verySunny$material3().normalized();
            MaterialShapes._verySunny = roundedPolygonNormalized;
            return roundedPolygonNormalized;
        }

        public final RoundedPolygon ghostish$material3() {
            long jFloatToRawIntBits = Float.floatToRawIntBits(0.5f);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
            o oVar = null;
            CornerRounding cornerRounding = new CornerRounding(1.0f, 0.0f, 2, null);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(1.0f);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(0.0f);
            return m5185customPolygonRg1IO4c$default(this, i.i(new PointNRound((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), cornerRounding, oVar), new PointNRound((jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(1.0f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.14f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.254f, 0.106f), oVar), new PointNRound((Float.floatToRawIntBits(0.575f) << 32) | (Float.floatToRawIntBits(0.906f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.253f, 0.0f, 2, null), oVar)), 1, 0L, true, 4, null);
        }

        public final RoundedPolygon heart$material3() {
            long jFloatToRawIntBits = Float.floatToRawIntBits(0.5f);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.268f);
            o oVar = null;
            CornerRounding cornerRounding = new CornerRounding(0.016f, 0.0f, 2, null);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.792f);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(-0.066f);
            return m5185customPolygonRg1IO4c$default(this, i.i(new PointNRound((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), cornerRounding, oVar), new PointNRound((jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.958f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(1.064f) << 32) | (Float.floatToRawIntBits(0.276f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(1.0f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(0.501f) << 32) | (Float.floatToRawIntBits(0.946f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.129f, 0.0f, 2, null), oVar)), 1, 0L, true, 4, null);
        }

        public final RoundedPolygon oval$material3() {
            float[] fArrM8492constructorimpl$default = Matrix.m8492constructorimpl$default(null, 1, null);
            Matrix.m8508scaleimpl$default(fArrM8492constructorimpl$default, 1.0f, 0.64f, 0.0f, 4, null);
            return ShapeUtilKt.m6288transformedEL8BTi8(ShapeUtilKt.m6288transformedEL8BTi8(androidx.graphics.shapes.ShapesKt.circle$default(RoundedPolygon.Companion, 0, 0.0f, 0.0f, 0.0f, 15, null), fArrM8492constructorimpl$default), MaterialShapes.rotateNeg45);
        }

        public final RoundedPolygon pentagon$material3() {
            long jFloatToRawIntBits = Float.floatToRawIntBits(0.5f);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(-0.009f);
            o oVar = null;
            return m5185customPolygonRg1IO4c$default(this, i.i(new PointNRound((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.172f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(1.03f) << 32) | (Float.floatToRawIntBits(0.365f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.164f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(0.828f) << 32) | (Float.floatToRawIntBits(0.97f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.169f, 0.0f, 2, null), oVar)), 1, 0L, true, 4, null);
        }

        public final RoundedPolygon pill$material3() {
            o oVar = null;
            return m5185customPolygonRg1IO4c$default(this, i.i(new PointNRound((Float.floatToRawIntBits(0.961f) << 32) | (Float.floatToRawIntBits(0.039f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.426f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(1.001f) << 32) | (Float.floatToRawIntBits(0.428f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(0.609f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(1.0f, 0.0f, 2, null), oVar)), 2, 0L, true, 4, null);
        }

        public final RoundedPolygon pixelCircle$material3() {
            return m5185customPolygonRg1IO4c$default(this, i.i(new PointNRound((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((Float.floatToRawIntBits(0.704f) << 32) | (Float.floatToRawIntBits(0.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((Float.floatToRawIntBits(0.704f) << 32) | (Float.floatToRawIntBits(0.065f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((Float.floatToRawIntBits(0.843f) << 32) | (Float.floatToRawIntBits(0.065f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((Float.floatToRawIntBits(0.843f) << 32) | (Float.floatToRawIntBits(0.148f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((Float.floatToRawIntBits(0.926f) << 32) | (Float.floatToRawIntBits(0.148f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((Float.floatToRawIntBits(0.926f) << 32) | (Float.floatToRawIntBits(0.296f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(0.296f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null)), 2, 0L, true, 4, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final RoundedPolygon pixelTriangle$material3() {
            return m5185customPolygonRg1IO4c$default(this, i.i(new PointNRound((Float.floatToRawIntBits(0.11f) << 32) | (Float.floatToRawIntBits(0.5f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((Float.floatToRawIntBits(0.113f) << 32) | (Float.floatToRawIntBits(0.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((Float.floatToRawIntBits(0.287f) << 32) | (Float.floatToRawIntBits(0.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((Float.floatToRawIntBits(0.287f) << 32) | (Float.floatToRawIntBits(0.087f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((Float.floatToRawIntBits(0.421f) << 32) | (Float.floatToRawIntBits(0.087f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((Float.floatToRawIntBits(0.421f) << 32) | (Float.floatToRawIntBits(0.17f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((Float.floatToRawIntBits(0.56f) << 32) | (Float.floatToRawIntBits(0.17f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((Float.floatToRawIntBits(0.56f) << 32) | (Float.floatToRawIntBits(0.265f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((Float.floatToRawIntBits(0.674f) << 32) | (Float.floatToRawIntBits(0.265f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((Float.floatToRawIntBits(0.675f) << 32) | (Float.floatToRawIntBits(0.344f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((Float.floatToRawIntBits(0.789f) << 32) | (Float.floatToRawIntBits(0.344f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((Float.floatToRawIntBits(0.789f) << 32) | (Float.floatToRawIntBits(0.439f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((Float.floatToRawIntBits(0.888f) << 32) | (Float.floatToRawIntBits(0.439f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, 0 == true ? 1 : 0)), 1, 0L, true, 4, null);
        }

        public final RoundedPolygon puffy$material3() {
            o oVar = null;
            float[] fArrM8492constructorimpl$default = Matrix.m8492constructorimpl$default(null, 1, null);
            Matrix.m8508scaleimpl$default(fArrM8492constructorimpl$default, 1.0f, 0.742f, 0.0f, 4, null);
            long jFloatToRawIntBits = Float.floatToRawIntBits(0.5f);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.545f);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(-0.04f);
            CornerRounding cornerRounding = new CornerRounding(0.405f, 0.0f, 2, null);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(0.67f);
            long jFloatToRawIntBits5 = Float.floatToRawIntBits(-0.035f);
            int i2 = 2;
            o oVar2 = null;
            CornerRounding cornerRounding2 = null;
            return ShapeUtilKt.m6288transformedEL8BTi8(m5185customPolygonRg1IO4c$default(this, i.i(new PointNRound((jFloatToRawIntBits << 32) | (Float.floatToRawIntBits(0.053f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((jFloatToRawIntBits2 << 32) | (jFloatToRawIntBits3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), cornerRounding, oVar), new PointNRound((jFloatToRawIntBits4 << 32) | (jFloatToRawIntBits5 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.426f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(0.717f) << 32) | (Float.floatToRawIntBits(0.066f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.574f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(0.722f) << 32) | (Float.floatToRawIntBits(0.128f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), cornerRounding2, i2, oVar2), new PointNRound((Float.floatToRawIntBits(0.777f) << 32) | (Float.floatToRawIntBits(0.002f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.36f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(0.914f) << 32) | (Float.floatToRawIntBits(0.149f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.66f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(0.926f) << 32) | (Float.floatToRawIntBits(0.289f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.66f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(0.881f) << 32) | (Float.floatToRawIntBits(0.346f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), cornerRounding2, i2, oVar2), new PointNRound((Float.floatToRawIntBits(0.94f) << 32) | (Float.floatToRawIntBits(0.344f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.126f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(1.003f) << 32) | (Float.floatToRawIntBits(0.437f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.255f, 0.0f, 2, null), oVar)), 2, 0L, true, 4, null), fArrM8492constructorimpl$default);
        }

        public final RoundedPolygon puffyDiamond$material3() {
            o oVar = null;
            return m5185customPolygonRg1IO4c$default(this, i.i(new PointNRound((Float.floatToRawIntBits(0.87f) << 32) | (Float.floatToRawIntBits(0.13f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.146f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(0.818f) << 32) | (Float.floatToRawIntBits(0.357f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(0.332f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.853f, 0.0f, 2, null), oVar)), 4, 0L, true, 4, null);
        }

        public final RoundedPolygon semiCircle$material3() {
            return androidx.graphics.shapes.ShapesKt.rectangle$default(RoundedPolygon.Companion, 1.6f, 1.0f, null, i.i(MaterialShapes.cornerRound20, MaterialShapes.cornerRound20, MaterialShapes.cornerRound100, MaterialShapes.cornerRound100), 0.0f, 0.0f, 52, null);
        }

        public final RoundedPolygon slanted$material3() {
            long jFloatToRawIntBits = Float.floatToRawIntBits(0.926f);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.97f);
            CornerRounding cornerRounding = new CornerRounding(0.189f, 0.811f);
            long j2 = (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            o oVar = null;
            return m5185customPolygonRg1IO4c$default(this, i.i(new PointNRound(j2, cornerRounding, oVar), new PointNRound((Float.floatToRawIntBits(-0.021f) << 32) | (Float.floatToRawIntBits(0.967f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.187f, 0.057f), oVar)), 2, 0L, false, 12, null);
        }

        public final RoundedPolygon softBoom$material3() {
            long jFloatToRawIntBits = Float.floatToRawIntBits(0.733f);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.839f);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.437f);
            o oVar = null;
            return m5185customPolygonRg1IO4c$default(this, i.i(new PointNRound((jFloatToRawIntBits << 32) | (Float.floatToRawIntBits(0.454f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 2, null), new PointNRound((jFloatToRawIntBits2 << 32) | (jFloatToRawIntBits3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.532f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(0.949f) << 32) | (Float.floatToRawIntBits(0.449f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.439f, 1.0f), oVar), new PointNRound((Float.floatToRawIntBits(0.998f) << 32) | (Float.floatToRawIntBits(0.478f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.174f, 0.0f, 2, null), oVar)), 16, 0L, true, 4, null);
        }

        public final RoundedPolygon softBurst$material3() {
            o oVar = null;
            return m5185customPolygonRg1IO4c$default(this, i.i(new PointNRound((Float.floatToRawIntBits(0.193f) << 32) | (Float.floatToRawIntBits(0.277f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.053f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(0.176f) << 32) | (Float.floatToRawIntBits(0.055f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.053f, 0.0f, 2, null), oVar)), 10, 0L, false, 12, null);
        }

        public final RoundedPolygon square$material3() {
            return androidx.graphics.shapes.ShapesKt.rectangle$default(RoundedPolygon.Companion, 1.0f, 1.0f, MaterialShapes.cornerRound30, null, 0.0f, 0.0f, 56, null);
        }

        public final RoundedPolygon sunny$material3() {
            return androidx.graphics.shapes.ShapesKt.star$default(RoundedPolygon.Companion, 8, 0.0f, 0.8f, MaterialShapes.cornerRound15, null, null, 0.0f, 0.0f, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PREFERENCES_5, null);
        }

        public final RoundedPolygon triangle$material3() {
            return ShapeUtilKt.m6288transformedEL8BTi8(RoundedPolygonKt.RoundedPolygon$default(3, 0.0f, 0.0f, 0.0f, MaterialShapes.cornerRound20, null, 46, null), MaterialShapes.rotateNeg90);
        }

        public final RoundedPolygon verySunny$material3() {
            o oVar = null;
            return m5185customPolygonRg1IO4c$default(this, i.i(new PointNRound((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(1.08f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.085f, 0.0f, 2, null), oVar), new PointNRound((Float.floatToRawIntBits(0.358f) << 32) | (Float.floatToRawIntBits(0.843f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), new CornerRounding(0.085f, 0.0f, 2, null), oVar)), 8, 0L, false, 12, null);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* compiled from: WazeSource */
        final class PointNRound {
            private final long o;
            private final CornerRounding r;

            public /* synthetic */ PointNRound(long j2, CornerRounding cornerRounding, int i2, o oVar) {
                this(j2, (i2 & 2) != 0 ? CornerRounding.Unrounded : cornerRounding, null);
            }

            /* renamed from: copy-3MmeM6k$default, reason: not valid java name */
            public static /* synthetic */ PointNRound m5189copy3MmeM6k$default(PointNRound pointNRound, long j2, CornerRounding cornerRounding, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    j2 = pointNRound.o;
                }
                if ((i2 & 2) != 0) {
                    cornerRounding = pointNRound.r;
                }
                return pointNRound.m5191copy3MmeM6k(j2, cornerRounding);
            }

            /* renamed from: component1-F1C5BW0, reason: not valid java name */
            public final long m5190component1F1C5BW0() {
                return this.o;
            }

            public final CornerRounding component2() {
                return this.r;
            }

            /* renamed from: copy-3MmeM6k, reason: not valid java name */
            public final PointNRound m5191copy3MmeM6k(long j2, CornerRounding cornerRounding) {
                return new PointNRound(j2, cornerRounding, null);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PointNRound)) {
                    return false;
                }
                PointNRound pointNRound = (PointNRound) obj;
                return Offset.m7977equalsimpl0(this.o, pointNRound.o) && x.n(this.r, pointNRound.r);
            }

            /* renamed from: getO-F1C5BW0, reason: not valid java name */
            public final long m5192getOF1C5BW0() {
                return this.o;
            }

            public final CornerRounding getR() {
                return this.r;
            }

            public int hashCode() {
                return (Offset.m7982hashCodeimpl(this.o) * 31) + this.r.hashCode();
            }

            public String toString() {
                return "PointNRound(o=" + ((Object) Offset.m7988toStringimpl(this.o)) + ", r=" + this.r + ')';
            }

            public /* synthetic */ PointNRound(long j2, CornerRounding cornerRounding, o oVar) {
                this(j2, cornerRounding);
            }

            private PointNRound(long j2, CornerRounding cornerRounding) {
                this.o = j2;
                this.r = cornerRounding;
            }
        }
    }

    public /* synthetic */ MaterialShapes(o oVar) {
        this();
    }
}
