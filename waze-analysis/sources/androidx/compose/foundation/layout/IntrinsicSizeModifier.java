package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
abstract class IntrinsicSizeModifier extends Modifier.Node implements LayoutModifierNode {
    static final ab measure_3p2s80s$lambda$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.m9814placeRelative70tqf50$default(placementScope, placeable, IntOffset.Companion.m11307getZeronOccac(), 0.0f, 2, null);
        return ab.f48028a;
    }

    /* renamed from: calculateContentConstraints-l58MMJ0 */
    public abstract long mo2708calculateContentConstraintsl58MMJ0(MeasureScope measureScope, Measurable measurable, long j2);

    public abstract boolean getEnforceIncoming();

    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.maxIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.maxIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo1732measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        long jMo2708calculateContentConstraintsl58MMJ0 = mo2708calculateContentConstraintsl58MMJ0(measureScope, measurable, j2);
        if (getEnforceIncoming()) {
            jMo2708calculateContentConstraintsl58MMJ0 = ConstraintsKt.m11122constrainN9IONVI(j2, jMo2708calculateContentConstraintsl58MMJ0);
        }
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(jMo2708calculateContentConstraintsl58MMJ0);
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.foundation.layout.IntrinsicSizeModifier$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return IntrinsicSizeModifier.measure_3p2s80s$lambda$0(placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.minIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.minIntrinsicWidth(i2);
    }
}
