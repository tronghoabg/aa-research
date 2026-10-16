package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.b.v;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SegmentedButtonContentMeasurePolicy implements MultiContentMeasurePolicy {
    public static final int $stable = 0;
    private Animatable<Integer, AnimationVector1D> animatable;
    private final AnimationSpec<Integer> animationSpec;
    private Integer initialOffset;
    private final af scope;

    public SegmentedButtonContentMeasurePolicy(af afVar, AnimationSpec<Integer> animationSpec) {
        this.scope = afVar;
        this.animationSpec = animationSpec;
    }

    static final ab measure_3p2s80s$lambda$6(List list, SegmentedButtonContentMeasurePolicy segmentedButtonContentMeasurePolicy, int i2, List list2, int i3, Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Placeable placeable = (Placeable) list.get(i4);
            Placeable.PlacementScope.place$default(placementScope, placeable, 0, (i3 - placeable.getHeight()) / 2, 0.0f, 4, null);
        }
        int iMo2121roundToPx0680j_4 = placementScope.mo2121roundToPx0680j_4(SegmentedButtonDefaults.INSTANCE.m5521getIconSizeD9Ej5fM()) + placementScope.mo2121roundToPx0680j_4(SegmentedButtonKt.IconSpacing);
        Animatable<Integer, AnimationVector1D> animatable = segmentedButtonContentMeasurePolicy.animatable;
        if (animatable != null) {
            i2 = animatable.getValue().intValue();
        }
        int i5 = iMo2121roundToPx0680j_4 + i2;
        int size2 = list2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            Placeable placeable2 = (Placeable) list2.get(i6);
            Placeable.PlacementScope.place$default(placementScope, placeable2, i5, (i3 - placeable2.getHeight()) / 2, 0.0f, 4, null);
        }
        return ab.f48028a;
    }

    public final Animatable<Integer, AnimationVector1D> getAnimatable() {
        return this.animatable;
    }

    public final AnimationSpec<Integer> getAnimationSpec() {
        return this.animationSpec;
    }

    public final af getScope() {
        return this.scope;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MultiContentMeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MultiContentMeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo2625measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j2) {
        Object obj;
        Object obj2;
        Object obj3;
        List<? extends Measurable> list2 = list.get(0);
        int i2 = 1;
        List<? extends Measurable> list3 = list.get(1);
        ArrayList arrayList = new ArrayList(list2.size());
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(list2.get(i3).mo9741measureBRTryo0(j2));
        }
        final ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(0);
            int width = ((Placeable) obj).getWidth();
            int iE = i.e(arrayList2);
            if (iE > 0) {
                int i4 = 1;
                while (true) {
                    Object obj4 = arrayList2.get(i4);
                    int width2 = ((Placeable) obj4).getWidth();
                    int i5 = width < width2 ? width2 : width;
                    if (width < width2) {
                        obj = obj4;
                    }
                    if (i4 == iE) {
                        break;
                    }
                    i4++;
                    width = i5;
                }
            }
        }
        Placeable placeable = (Placeable) obj;
        int width3 = placeable != null ? placeable.getWidth() : 0;
        ArrayList arrayList3 = new ArrayList(list3.size());
        int size2 = list3.size();
        for (int i6 = 0; i6 < size2; i6++) {
            arrayList3.add(list3.get(i6).mo9741measureBRTryo0(j2));
        }
        final ArrayList arrayList4 = arrayList3;
        if (arrayList4.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList4.get(0);
            int width4 = ((Placeable) obj2).getWidth();
            int iE2 = i.e(arrayList4);
            if (iE2 > 0) {
                int i7 = 1;
                while (true) {
                    Object obj5 = arrayList4.get(i7);
                    int width5 = ((Placeable) obj5).getWidth();
                    int i8 = width4 < width5 ? width5 : width4;
                    if (width4 < width5) {
                        obj2 = obj5;
                    }
                    if (i7 == iE2) {
                        break;
                    }
                    i7++;
                    width4 = i8;
                }
            }
        }
        Placeable placeable2 = (Placeable) obj2;
        Integer numValueOf = placeable2 != null ? Integer.valueOf(placeable2.getWidth()) : null;
        if (arrayList4.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList4.get(0);
            int height = ((Placeable) obj3).getHeight();
            int iE3 = i.e(arrayList4);
            if (iE3 > 0) {
                while (true) {
                    Object obj6 = arrayList4.get(i2);
                    int height2 = ((Placeable) obj6).getHeight();
                    int i9 = height < height2 ? height2 : height;
                    if (height < height2) {
                        obj3 = obj6;
                    }
                    if (i2 == iE3) {
                        break;
                    }
                    i2++;
                    height = i9;
                }
            }
        }
        Placeable placeable3 = (Placeable) obj3;
        int height3 = placeable3 != null ? placeable3.getHeight() : 0;
        int iMax = Math.max(measureScope.mo2121roundToPx0680j_4(SegmentedButtonDefaults.INSTANCE.m5521getIconSizeD9Ej5fM()), width3) + measureScope.mo2121roundToPx0680j_4(SegmentedButtonKt.IconSpacing) + (numValueOf != null ? numValueOf.intValue() : 0);
        int i10 = width3 == 0 ? (-(measureScope.mo2121roundToPx0680j_4(SegmentedButtonDefaults.INSTANCE.m5521getIconSizeD9Ej5fM()) + measureScope.mo2121roundToPx0680j_4(SegmentedButtonKt.IconSpacing))) / 2 : 0;
        Integer num = this.initialOffset;
        if (num == null) {
            this.initialOffset = Integer.valueOf(i10);
        } else {
            Animatable<Integer, AnimationVector1D> animatable = this.animatable;
            if (animatable == null) {
                Animatable<Integer, AnimationVector1D> animatable2 = new Animatable<>(num, VectorConvertersKt.getVectorConverter(v.f48128a), null, null, 12, null);
                this.animatable = animatable2;
                animatable = animatable2;
            }
            if (animatable.getTargetValue().intValue() != i10) {
                aj.z(this.scope, null, null, new SegmentedButtonContentMeasurePolicy$measure$1(animatable, i10, this, null), 3);
            }
        }
        final int i11 = height3;
        final int i12 = i10;
        return MeasureScope.CC.layout$default(measureScope, iMax, i11, null, new l() { // from class: androidx.compose.material3.SegmentedButtonContentMeasurePolicy$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj7) {
                return SegmentedButtonContentMeasurePolicy.measure_3p2s80s$lambda$6(arrayList2, this, i12, arrayList4, i11, (Placeable.PlacementScope) obj7);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MultiContentMeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MultiContentMeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }

    public final void setAnimatable(Animatable<Integer, AnimationVector1D> animatable) {
        this.animatable = animatable;
    }
}
