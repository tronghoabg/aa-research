package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class RecalculateWindowInsetsModifierNode extends InsetsConsumingModifierNode implements LayoutModifierNode {
    private final ValueInsets insets = new ValueInsets(new InsetsValues(0, 0, 0, 0), "reset");

    static final ab measure_3p2s80s$lambda$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return ab.f48028a;
    }

    static final ab measure_3p2s80s$lambda$1(RecalculateWindowInsetsModifierNode recalculateWindowInsetsModifierNode, Measurable measurable, int i2, int i3, Placeable.PlacementScope placementScope) {
        LayoutCoordinates coordinates = placementScope.getCoordinates();
        if (coordinates != null) {
            long jPositionInRoot = LayoutCoordinatesKt.positionInRoot(coordinates);
            long jMo9743getSizeYbymL2g = coordinates.mo9743getSizeYbymL2g();
            long j2 = jMo9743getSizeYbymL2g >> 32;
            long j3 = jMo9743getSizeYbymL2g & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            long jMo9746localToRootMKHz9U = coordinates.mo9746localToRootMKHz9U((Float.floatToRawIntBits((int) j3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits((int) j2) << 32));
            long jMo9743getSizeYbymL2g2 = LayoutCoordinatesKt.findRootCoordinates(coordinates).mo9743getSizeYbymL2g();
            int iRound = Math.round(Float.intBitsToFloat((int) (jPositionInRoot >> 32)));
            int iRound2 = Math.round(Float.intBitsToFloat((int) (jPositionInRoot & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
            int iRound3 = ((int) (jMo9743getSizeYbymL2g2 >> 32)) - Math.round(Float.intBitsToFloat((int) (jMo9746localToRootMKHz9U >> 32)));
            int iRound4 = ((int) (jMo9743getSizeYbymL2g2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - Math.round(Float.intBitsToFloat((int) (jMo9746localToRootMKHz9U & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
            InsetsValues value$foundation_layout = recalculateWindowInsetsModifierNode.insets.getValue$foundation_layout();
            if (value$foundation_layout.getLeft() != iRound || value$foundation_layout.getTop() != iRound2 || value$foundation_layout.getRight() != iRound3 || value$foundation_layout.getBottom() != iRound4) {
                recalculateWindowInsetsModifierNode.insets.setValue$foundation_layout(new InsetsValues(iRound, iRound2, iRound3, iRound4));
                recalculateWindowInsetsModifierNode.insetsInvalidated();
            }
        }
        Placeable.PlacementScope.place$default(placementScope, measurable.mo9741measureBRTryo0(Constraints.Companion.m11117fixedJhjzzOo(i2, i3)), 0, 0, 0.0f, 4, null);
        return ab.f48028a;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public WindowInsets calculateInsets(WindowInsets windowInsets) {
        return this.insets.getValue$foundation_layout().getLeft() == -1 ? windowInsets : this.insets;
    }

    public final ValueInsets getInsets() {
        return this.insets;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.maxIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.maxIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1732measure3p2s80s(MeasureScope measureScope, final Measurable measurable, long j2) {
        if (Constraints.m11105getHasFixedWidthimpl(j2) && Constraints.m11104getHasFixedHeightimpl(j2)) {
            final int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
            final int iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(j2);
            return MeasureScope.CC.layout$default(measureScope, iM11107getMaxWidthimpl, iM11106getMaxHeightimpl, null, new l() { // from class: androidx.compose.foundation.layout.RecalculateWindowInsetsModifierNode$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return RecalculateWindowInsetsModifierNode.measure_3p2s80s$lambda$1(this.f$0, measurable, iM11107getMaxWidthimpl, iM11106getMaxHeightimpl, (Placeable.PlacementScope) obj);
                }
            }, 4, null);
        }
        if (this.insets.getValue$foundation_layout().getLeft() != -1) {
            this.insets.setValue$foundation_layout(new InsetsValues(-1, -1, -1, -1));
            insetsInvalidated();
        }
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(j2);
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.foundation.layout.RecalculateWindowInsetsModifierNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return RecalculateWindowInsetsModifierNode.measure_3p2s80s$lambda$0(placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.minIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.minIntrinsicWidth(i2);
    }
}
