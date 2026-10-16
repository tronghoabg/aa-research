package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import h.ab;
import h.g.a.l;
import h.g.b.ao;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class BoxMeasurePolicy implements MeasurePolicy {
    private final Alignment alignment;
    private final boolean propagateMinConstraints;

    public BoxMeasurePolicy(Alignment alignment, boolean z) {
        this.alignment = alignment;
        this.propagateMinConstraints = z;
    }

    private final Alignment component1() {
        return this.alignment;
    }

    private final boolean component2() {
        return this.propagateMinConstraints;
    }

    public static /* synthetic */ BoxMeasurePolicy copy$default(BoxMeasurePolicy boxMeasurePolicy, Alignment alignment, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            alignment = boxMeasurePolicy.alignment;
        }
        if ((i2 & 2) != 0) {
            z = boxMeasurePolicy.propagateMinConstraints;
        }
        return boxMeasurePolicy.copy(alignment, z);
    }

    static final ab measure_3p2s80s$lambda$1(Placeable placeable, Measurable measurable, MeasureScope measureScope, int i2, int i3, BoxMeasurePolicy boxMeasurePolicy, Placeable.PlacementScope placementScope) {
        BoxKt.placeInBox(placementScope, placeable, measurable, measureScope.getLayoutDirection(), i2, i3, boxMeasurePolicy.alignment);
        return ab.f48028a;
    }

    static final ab measure_3p2s80s$lambda$4(Placeable[] placeableArr, List list, MeasureScope measureScope, ao aoVar, ao aoVar2, BoxMeasurePolicy boxMeasurePolicy, Placeable.PlacementScope placementScope) {
        int length = placeableArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            Placeable placeable = placeableArr[i2];
            x.d(placeable, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            BoxKt.placeInBox(placementScope, placeable, (Measurable) list.get(i3), measureScope.getLayoutDirection(), aoVar.f48103a, aoVar2.f48103a, boxMeasurePolicy.alignment);
            i2++;
            i3++;
        }
        return ab.f48028a;
    }

    public final BoxMeasurePolicy copy(Alignment alignment, boolean z) {
        return new BoxMeasurePolicy(alignment, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxMeasurePolicy)) {
            return false;
        }
        BoxMeasurePolicy boxMeasurePolicy = (BoxMeasurePolicy) obj;
        return x.n(this.alignment, boxMeasurePolicy.alignment) && this.propagateMinConstraints == boxMeasurePolicy.propagateMinConstraints;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + BoxMeasurePolicy$$ExternalSyntheticBackport0.m(this.propagateMinConstraints);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1704measure3p2s80s(final MeasureScope measureScope, final List<? extends Measurable> list, long j2) {
        int iM11109getMinWidthimpl;
        int iM11108getMinHeightimpl;
        Placeable placeableMo9741measureBRTryo0;
        if (list.isEmpty()) {
            return MeasureScope.CC.layout$default(measureScope, Constraints.m11109getMinWidthimpl(j2), Constraints.m11108getMinHeightimpl(j2), null, new l() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return ab.f48028a;
                }
            }, 4, null);
        }
        long j3 = this.propagateMinConstraints ? j2 : j2 & ConstraintsKt.MaxDimensionsAndFocusMask;
        if (list.size() == 1) {
            final Measurable measurable = list.get(0);
            if (BoxKt.getMatchesParentSize(measurable)) {
                iM11109getMinWidthimpl = Constraints.m11109getMinWidthimpl(j2);
                iM11108getMinHeightimpl = Constraints.m11108getMinHeightimpl(j2);
                placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(Constraints.Companion.m11117fixedJhjzzOo(Constraints.m11109getMinWidthimpl(j2), Constraints.m11108getMinHeightimpl(j2)));
            } else {
                placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(j3);
                iM11109getMinWidthimpl = Math.max(Constraints.m11109getMinWidthimpl(j2), placeableMo9741measureBRTryo0.getWidth());
                iM11108getMinHeightimpl = Math.max(Constraints.m11108getMinHeightimpl(j2), placeableMo9741measureBRTryo0.getHeight());
            }
            final int i2 = iM11109getMinWidthimpl;
            final int i3 = iM11108getMinHeightimpl;
            final Placeable placeable = placeableMo9741measureBRTryo0;
            return MeasureScope.CC.layout$default(measureScope, i2, i3, null, new l() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$$ExternalSyntheticLambda2
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return BoxMeasurePolicy.measure_3p2s80s$lambda$1(placeable, measurable, measureScope, i2, i3, this, (Placeable.PlacementScope) obj);
                }
            }, 4, null);
        }
        final Placeable[] placeableArr = new Placeable[list.size()];
        final ao aoVar = new ao();
        aoVar.f48103a = Constraints.m11109getMinWidthimpl(j2);
        final ao aoVar2 = new ao();
        aoVar2.f48103a = Constraints.m11108getMinHeightimpl(j2);
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            Measurable measurable2 = list.get(i4);
            if (BoxKt.getMatchesParentSize(measurable2)) {
                z = true;
            } else {
                Placeable placeableMo9741measureBRTryo02 = measurable2.mo9741measureBRTryo0(j3);
                placeableArr[i4] = placeableMo9741measureBRTryo02;
                aoVar.f48103a = Math.max(aoVar.f48103a, placeableMo9741measureBRTryo02.getWidth());
                aoVar2.f48103a = Math.max(aoVar2.f48103a, placeableMo9741measureBRTryo02.getHeight());
            }
        }
        if (z) {
            int i5 = aoVar.f48103a;
            int i6 = i5 != Integer.MAX_VALUE ? i5 : 0;
            int i7 = aoVar2.f48103a;
            long jConstraints = ConstraintsKt.Constraints(i6, i5, i7 != Integer.MAX_VALUE ? i7 : 0, i7);
            int size2 = list2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                Measurable measurable3 = list.get(i8);
                if (BoxKt.getMatchesParentSize(measurable3)) {
                    placeableArr[i8] = measurable3.mo9741measureBRTryo0(jConstraints);
                }
            }
        }
        return MeasureScope.CC.layout$default(measureScope, aoVar.f48103a, aoVar2.f48103a, null, new l() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return BoxMeasurePolicy.measure_3p2s80s$lambda$4(placeableArr, list, measureScope, aoVar, aoVar2, this, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }

    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.alignment + ", propagateMinConstraints=" + this.propagateMinConstraints + ')';
    }
}
