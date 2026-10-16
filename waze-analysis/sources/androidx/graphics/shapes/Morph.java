package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import androidx.graphics.shapes.MeasuredPolygon;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Morph {
    public static final Companion Companion = new Companion(null);
    private final List<k<Cubic, Cubic>> _morphMatch;
    private final RoundedPolygon end;
    private final RoundedPolygon start;

    public Morph(RoundedPolygon roundedPolygon, RoundedPolygon roundedPolygon2) {
        x.f(roundedPolygon, TtmlNode.START);
        x.f(roundedPolygon2, TtmlNode.END);
        this.start = roundedPolygon;
        this.end = roundedPolygon2;
        this._morphMatch = Companion.match$graphics_shapes(roundedPolygon, roundedPolygon2);
    }

    public static /* synthetic */ float[] calculateBounds$default(Morph morph, float[] fArr, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fArr = new float[4];
        }
        morph.calculateBounds(fArr, z | (!((i2 & 2) == 0)));
        return fArr;
    }

    public static /* synthetic */ float[] calculateMaxBounds$default(Morph morph, float[] fArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fArr = new float[4];
        }
        morph.calculateMaxBounds(fArr);
        return fArr;
    }

    public static /* synthetic */ void forEachCubic$default(Morph morph, float f2, MutableCubic mutableCubic, l lVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            mutableCubic = new MutableCubic();
        }
        x.f(mutableCubic, "mutableCubic");
        x.f(lVar, "callback");
        int size = morph.getMorphMatch().size();
        for (int i3 = 0; i3 < size; i3++) {
            mutableCubic.interpolate((Cubic) morph.getMorphMatch().get(i3).c(), (Cubic) morph.getMorphMatch().get(i3).d(), f2);
            lVar.invoke(mutableCubic);
        }
    }

    public static /* synthetic */ void getMorphMatch$annotations() {
    }

    public final List<Cubic> asCubics(float f2) {
        List<k<Cubic, Cubic>> list = this._morphMatch;
        List listB = i.b();
        int size = list.size();
        Cubic cubic = null;
        int i2 = 0;
        Cubic cubic2 = null;
        while (i2 < size) {
            float[] fArr = new float[8];
            for (int i3 = 0; i3 < 8; i3++) {
                fArr[i3] = Utils.interpolate(((Cubic) this._morphMatch.get(i2).c()).getPoints$graphics_shapes()[i3], ((Cubic) this._morphMatch.get(i2).d()).getPoints$graphics_shapes()[i3], f2);
            }
            Cubic cubic3 = new Cubic(fArr);
            if (cubic2 == null) {
                cubic2 = cubic3;
            }
            if (cubic != null) {
                listB.add(cubic);
            }
            i2++;
            cubic = cubic3;
        }
        if (cubic != null && cubic2 != null) {
            listB.add(CubicKt.Cubic(cubic.getAnchor0X(), cubic.getAnchor0Y(), cubic.getControl0X(), cubic.getControl0Y(), cubic.getControl1X(), cubic.getControl1Y(), cubic2.getAnchor0X(), cubic2.getAnchor0Y()));
        }
        return i.a(listB);
    }

    public final float[] calculateBounds(float[] fArr, boolean z) {
        x.f(fArr, "bounds");
        this.start.calculateBounds(fArr, z);
        RoundedPolygon roundedPolygon = this.end;
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        roundedPolygon.calculateBounds(fArr, z);
        fArr[0] = Math.min(f2, fArr[0]);
        fArr[1] = Math.min(f3, fArr[1]);
        fArr[2] = Math.max(f4, fArr[2]);
        fArr[3] = Math.max(f5, fArr[3]);
        return fArr;
    }

    public final float[] calculateMaxBounds(float[] fArr) {
        x.f(fArr, "bounds");
        this.start.calculateMaxBounds(fArr);
        RoundedPolygon roundedPolygon = this.end;
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        roundedPolygon.calculateMaxBounds(fArr);
        fArr[0] = Math.min(f2, fArr[0]);
        fArr[1] = Math.min(f3, fArr[1]);
        fArr[2] = Math.max(f4, fArr[2]);
        fArr[3] = Math.max(f5, fArr[3]);
        return fArr;
    }

    public final void forEachCubic(float f2, MutableCubic mutableCubic, l<? super MutableCubic, ab> lVar) {
        x.f(mutableCubic, "mutableCubic");
        x.f(lVar, "callback");
        int size = getMorphMatch().size();
        for (int i2 = 0; i2 < size; i2++) {
            mutableCubic.interpolate((Cubic) getMorphMatch().get(i2).c(), (Cubic) getMorphMatch().get(i2).d(), f2);
            lVar.invoke(mutableCubic);
        }
    }

    public final List<k<Cubic, Cubic>> getMorphMatch() {
        return this._morphMatch;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private static final String match$lambda$8(FloatFloatPair floatFloatPair) {
            return Format_jvmKt.toStringWithLessPrecision(PointKt.m11940getXDnnuFBc(floatFloatPair.m1683unboximpl()) * 100.0f) + " " + Format_jvmKt.toStringWithLessPrecision(PointKt.m11941getYDnnuFBc(floatFloatPair.m1683unboximpl()) * 100.0f);
        }

        private static final CharSequence match$lambda$9$1$0(l lVar, Cubic cubic) {
            x.f(cubic, "it");
            return "C " + lVar.invoke(FloatFloatPair.m1672boximpl(FloatFloatPair.m1675constructorimpl(cubic.getControl0X(), cubic.getControl0Y()))) + ", " + lVar.invoke(FloatFloatPair.m1672boximpl(FloatFloatPair.m1675constructorimpl(cubic.getControl1X(), cubic.getControl1Y()))) + ", " + lVar.invoke(FloatFloatPair.m1672boximpl(FloatFloatPair.m1675constructorimpl(cubic.getAnchor1X(), cubic.getAnchor1Y())));
        }

        public final List<k<Cubic, Cubic>> match$graphics_shapes(RoundedPolygon roundedPolygon, RoundedPolygon roundedPolygon2) {
            k<MeasuredPolygon.MeasuredCubic, MeasuredPolygon.MeasuredCubic> kVarCutAtProgress;
            k<MeasuredPolygon.MeasuredCubic, MeasuredPolygon.MeasuredCubic> kVarCutAtProgress2;
            x.f(roundedPolygon, "p1");
            x.f(roundedPolygon2, "p2");
            MeasuredPolygon measuredPolygonMeasurePolygon$graphics_shapes = MeasuredPolygon.Companion.measurePolygon$graphics_shapes(new LengthMeasurer(), roundedPolygon);
            MeasuredPolygon measuredPolygonMeasurePolygon$graphics_shapes2 = MeasuredPolygon.Companion.measurePolygon$graphics_shapes(new LengthMeasurer(), roundedPolygon2);
            DoubleMapper doubleMapperFeatureMapper = FeatureMappingKt.featureMapper(measuredPolygonMeasurePolygon$graphics_shapes.getFeatures(), measuredPolygonMeasurePolygon$graphics_shapes2.getFeatures());
            float map = doubleMapperFeatureMapper.map(0.0f);
            MeasuredPolygon measuredPolygonCutAndShift = measuredPolygonMeasurePolygon$graphics_shapes2.cutAndShift(map);
            ArrayList arrayList = new ArrayList();
            MeasuredPolygon measuredPolygon = measuredPolygonMeasurePolygon$graphics_shapes;
            MeasuredPolygon.MeasuredCubic measuredCubic = (MeasuredPolygon.MeasuredCubic) i.S(measuredPolygon, 0);
            MeasuredPolygon measuredPolygon2 = measuredPolygonCutAndShift;
            MeasuredPolygon.MeasuredCubic measuredCubic2 = (MeasuredPolygon.MeasuredCubic) i.S(measuredPolygon2, 0);
            int i2 = 1;
            int i3 = 1;
            while (measuredCubic != null && measuredCubic2 != null) {
                float endOutlineProgress = i2 == measuredPolygonMeasurePolygon$graphics_shapes.size() ? 1.0f : measuredCubic.getEndOutlineProgress();
                float fMapBack = i3 == measuredPolygonCutAndShift.size() ? 1.0f : doubleMapperFeatureMapper.mapBack(Utils.positiveModulo(measuredCubic2.getEndOutlineProgress() + map, 1.0f));
                float fMin = Math.min(endOutlineProgress, fMapBack);
                float f2 = 1.0E-6f + fMin;
                if (endOutlineProgress > f2) {
                    kVarCutAtProgress = measuredCubic.cutAtProgress(fMin);
                } else {
                    k<MeasuredPolygon.MeasuredCubic, MeasuredPolygon.MeasuredCubic> kVar = new k<>(measuredCubic, i.S(measuredPolygon, i2));
                    i2++;
                    kVarCutAtProgress = kVar;
                }
                MeasuredPolygon.MeasuredCubic measuredCubic3 = (MeasuredPolygon.MeasuredCubic) kVarCutAtProgress.a();
                measuredCubic = (MeasuredPolygon.MeasuredCubic) kVarCutAtProgress.b();
                if (fMapBack > f2) {
                    kVarCutAtProgress2 = measuredCubic2.cutAtProgress(Utils.positiveModulo(doubleMapperFeatureMapper.map(fMin) - map, 1.0f));
                } else {
                    k<MeasuredPolygon.MeasuredCubic, MeasuredPolygon.MeasuredCubic> kVar2 = new k<>(measuredCubic2, i.S(measuredPolygon2, i3));
                    i3++;
                    kVarCutAtProgress2 = kVar2;
                }
                MeasuredPolygon.MeasuredCubic measuredCubic4 = (MeasuredPolygon.MeasuredCubic) kVarCutAtProgress2.a();
                measuredCubic2 = (MeasuredPolygon.MeasuredCubic) kVarCutAtProgress2.b();
                arrayList.add(new k(measuredCubic3.getCubic(), measuredCubic4.getCubic()));
            }
            if (measuredCubic == null && measuredCubic2 == null) {
                return arrayList;
            }
            throw new IllegalArgumentException("Expected both Polygon's Cubic to be fully matched");
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public final float[] calculateBounds(float[] fArr) {
        x.f(fArr, "bounds");
        return calculateBounds$default(this, fArr, false, 2, null);
    }

    public final float[] calculateBounds() {
        return calculateBounds$default(this, null, false, 3, null);
    }

    public final void forEachCubic(float f2, l<? super MutableCubic, ab> lVar) {
        x.f(lVar, "callback");
        MutableCubic mutableCubic = new MutableCubic();
        int size = getMorphMatch().size();
        for (int i2 = 0; i2 < size; i2++) {
            mutableCubic.interpolate((Cubic) getMorphMatch().get(i2).c(), (Cubic) getMorphMatch().get(i2).d(), f2);
            lVar.invoke(mutableCubic);
        }
    }
}
