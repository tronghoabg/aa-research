package androidx.graphics.shapes;

import androidx.collection.FloatList;
import androidx.collection.MutableFloatList;
import androidx.graphics.shapes.Feature;
import h.a.g;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import h.k;
import h.k.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MeasuredPolygon extends g<MeasuredCubic> {
    public static final Companion Companion = new Companion(null);
    private final List<MeasuredCubic> cubics;
    private final List<ProgressableFeature> features;
    private final Measurer measurer;

    /* compiled from: WazeSource */
    public final class MeasuredCubic {
        private final Cubic cubic;
        private float endOutlineProgress;
        private final float measuredSize;
        private float startOutlineProgress;
        final /* synthetic */ MeasuredPolygon this$0;

        public MeasuredCubic(MeasuredPolygon measuredPolygon, Cubic cubic, float f2, float f3) {
            x.f(cubic, "cubic");
            this.this$0 = measuredPolygon;
            this.cubic = cubic;
            if (f3 < f2) {
                throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
            }
            this.measuredSize = measuredPolygon.measurer.measureCubic(cubic);
            this.startOutlineProgress = f2;
            this.endOutlineProgress = f3;
        }

        public static /* synthetic */ void updateProgressRange$graphics_shapes$default(MeasuredCubic measuredCubic, float f2, float f3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f2 = measuredCubic.startOutlineProgress;
            }
            if ((i2 & 2) != 0) {
                f3 = measuredCubic.endOutlineProgress;
            }
            measuredCubic.updateProgressRange$graphics_shapes(f2, f3);
        }

        public final k<MeasuredCubic, MeasuredCubic> cutAtProgress(float f2) {
            float fG = n.g(f2, this.startOutlineProgress, this.endOutlineProgress);
            float f3 = this.endOutlineProgress;
            float f4 = this.startOutlineProgress;
            float fFindCubicCutPoint = this.this$0.measurer.findCubicCutPoint(this.cubic, ((fG - f4) / (f3 - f4)) * this.measuredSize);
            if (fFindCubicCutPoint < 0.0f || fFindCubicCutPoint > 1.0f) {
                throw new IllegalArgumentException("Cubic cut point is expected to be between 0 and 1");
            }
            k<Cubic, Cubic> kVarSplit = this.cubic.split(fFindCubicCutPoint);
            return new k<>(new MeasuredCubic(this.this$0, (Cubic) kVarSplit.a(), this.startOutlineProgress, fG), new MeasuredCubic(this.this$0, (Cubic) kVarSplit.b(), fG, this.endOutlineProgress));
        }

        public final Cubic getCubic() {
            return this.cubic;
        }

        public final float getEndOutlineProgress() {
            return this.endOutlineProgress;
        }

        public final float getMeasuredSize() {
            return this.measuredSize;
        }

        public final float getStartOutlineProgress() {
            return this.startOutlineProgress;
        }

        public String toString() {
            return "MeasuredCubic(outlineProgress=[" + this.startOutlineProgress + " .. " + this.endOutlineProgress + "], size=" + this.measuredSize + ", cubic=" + this.cubic + ")";
        }

        public final void updateProgressRange$graphics_shapes(float f2, float f3) {
            if (f3 < f2) {
                throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
            }
            this.startOutlineProgress = f2;
            this.endOutlineProgress = f3;
        }
    }

    private MeasuredPolygon(Measurer measurer, List<ProgressableFeature> list, List<? extends Cubic> list2, FloatList floatList) {
        if (floatList._size != list2.size() + 1) {
            throw new IllegalArgumentException("Outline progress size is expected to be the cubics size + 1");
        }
        if (floatList.first() != 0.0f) {
            throw new IllegalArgumentException("First outline progress value is expected to be zero");
        }
        if (floatList.last() != 1.0f) {
            throw new IllegalArgumentException("Last outline progress value is expected to be one");
        }
        this.measurer = measurer;
        this.features = list;
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        int i2 = 0;
        float f2 = 0.0f;
        while (i2 < size) {
            int i3 = i2 + 1;
            if (floatList.get(i3) - floatList.get(i2) > 1.0E-4f) {
                arrayList.add(new MeasuredCubic(this, list2.get(i2), f2, floatList.get(i3)));
                f2 = floatList.get(i3);
            }
            i2 = i3;
        }
        MeasuredCubic.updateProgressRange$graphics_shapes$default((MeasuredCubic) arrayList.get(i.e(arrayList)), 0.0f, 1.0f, 1, null);
        this.cubics = arrayList;
    }

    @Override // h.a.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof MeasuredCubic) {
            return contains((MeasuredCubic) obj);
        }
        return false;
    }

    public final MeasuredPolygon cutAndShift(float f2) {
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("Cutting point is expected to be between 0 and 1");
        }
        if (f2 < 1.0E-4f) {
            return this;
        }
        Iterator<MeasuredCubic> it = this.cubics.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            MeasuredCubic next = it.next();
            float startOutlineProgress = next.getStartOutlineProgress();
            if (f2 <= next.getEndOutlineProgress() && startOutlineProgress <= f2) {
                break;
            }
            i2++;
        }
        k<MeasuredCubic, MeasuredCubic> kVarCutAtProgress = this.cubics.get(i2).cutAtProgress(f2);
        MeasuredCubic measuredCubic = (MeasuredCubic) kVarCutAtProgress.a();
        List listL = i.l(((MeasuredCubic) kVarCutAtProgress.b()).getCubic());
        int size = this.cubics.size();
        for (int i3 = 1; i3 < size; i3++) {
            List<MeasuredCubic> list = this.cubics;
            listL.add(list.get((i3 + i2) % list.size()).getCubic());
        }
        listL.add(measuredCubic.getCubic());
        MutableFloatList mutableFloatList = new MutableFloatList(this.cubics.size() + 2);
        int size2 = this.cubics.size() + 2;
        int i4 = 0;
        while (i4 < size2) {
            mutableFloatList.add(i4 == 0 ? 0.0f : i4 == this.cubics.size() + 1 ? 1.0f : Utils.positiveModulo(this.cubics.get(((i2 + i4) - 1) % this.cubics.size()).getEndOutlineProgress() - f2, 1.0f));
            i4++;
        }
        List<ProgressableFeature> list2 = this.features;
        List listB = i.b();
        int size3 = list2.size();
        for (int i5 = 0; i5 < size3; i5++) {
            listB.add(new ProgressableFeature(Utils.positiveModulo(this.features.get(i5).getProgress() - f2, 1.0f), this.features.get(i5).getFeature()));
        }
        return new MeasuredPolygon(this.measurer, i.a(listB), listL, mutableFloatList);
    }

    @Override // h.a.g, java.util.List
    public MeasuredCubic get(int i2) {
        return this.cubics.get(i2);
    }

    public final List<ProgressableFeature> getFeatures() {
        return this.features;
    }

    @Override // h.a.g, h.a.a
    public int getSize() {
        return this.cubics.size();
    }

    @Override // h.a.g, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof MeasuredCubic) {
            return indexOf((MeasuredCubic) obj);
        }
        return -1;
    }

    @Override // h.a.g, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof MeasuredCubic) {
            return lastIndexOf((MeasuredCubic) obj);
        }
        return -1;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final MeasuredPolygon measurePolygon$graphics_shapes(Measurer measurer, RoundedPolygon roundedPolygon) {
            ArrayList arrayListD;
            x.f(measurer, "measurer");
            x.f(roundedPolygon, "polygon");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = roundedPolygon.getFeatures().size();
            for (int i2 = 0; i2 < size; i2++) {
                Feature feature = roundedPolygon.getFeatures().get(i2);
                int size2 = feature.getCubics().size();
                for (int i3 = 0; i3 < size2; i3++) {
                    if ((feature instanceof Feature.Corner) && i3 == feature.getCubics().size() / 2) {
                        arrayList2.add(new k(feature, Integer.valueOf(arrayList.size())));
                    }
                    arrayList.add(feature.getCubics().get(i3));
                }
            }
            ArrayList<Cubic> arrayList3 = arrayList;
            Float fValueOf = Float.valueOf(0.0f);
            int iQ = i.q(arrayList3, 9);
            if (iQ == 0) {
                arrayListD = i.d(fValueOf);
            } else {
                ArrayList arrayList4 = new ArrayList(iQ + 1);
                arrayList4.add(fValueOf);
                for (Cubic cubic : arrayList3) {
                    float fFloatValue = fValueOf.floatValue();
                    float fMeasureCubic = measurer.measureCubic(cubic);
                    if (fMeasureCubic < 0.0f) {
                        throw new IllegalArgumentException("Measured cubic is expected to be greater or equal to zero");
                    }
                    fValueOf = Float.valueOf(fFloatValue + fMeasureCubic);
                    arrayList4.add(fValueOf);
                }
                arrayListD = arrayList4;
            }
            float fFloatValue2 = ((Number) i.T(arrayListD)).floatValue();
            MutableFloatList mutableFloatList = new MutableFloatList(arrayListD.size());
            int size3 = arrayListD.size();
            for (int i4 = 0; i4 < size3; i4++) {
                mutableFloatList.add(((Number) arrayListD.get(i4)).floatValue() / fFloatValue2);
            }
            List listB = i.b();
            int size4 = arrayList2.size();
            for (int i5 = 0; i5 < size4; i5++) {
                int iIntValue = ((Number) ((k) arrayList2.get(i5)).d()).intValue();
                listB.add(new ProgressableFeature(Utils.positiveModulo((mutableFloatList.get(iIntValue) + mutableFloatList.get(iIntValue + 1)) / 2.0f, 1.0f), (Feature) ((k) arrayList2.get(i5)).c()));
            }
            return new MeasuredPolygon(measurer, i.a(listB), arrayList, mutableFloatList, null);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* bridge */ boolean contains(MeasuredCubic measuredCubic) {
        return super.contains((Object) measuredCubic);
    }

    public /* bridge */ int indexOf(MeasuredCubic measuredCubic) {
        return super.indexOf((Object) measuredCubic);
    }

    public /* bridge */ int lastIndexOf(MeasuredCubic measuredCubic) {
        return super.lastIndexOf((Object) measuredCubic);
    }

    public /* synthetic */ MeasuredPolygon(Measurer measurer, List list, List list2, FloatList floatList, o oVar) {
        this(measurer, list, list2, floatList);
    }
}
