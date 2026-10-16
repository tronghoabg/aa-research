package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class FillNode extends Modifier.Node implements LayoutModifierNode {
    private Direction direction;
    private float fraction;

    public FillNode(Direction direction, float f2) {
        this.direction = direction;
        this.fraction = f2;
    }

    static final ab measure_3p2s80s$lambda$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return ab.f48028a;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final float getFraction() {
        return this.fraction;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.maxIntrinsicHeight.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public AnonymousClass1() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.maxIntrinsicWidth.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public C03831() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1732measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        int iM11109getMinWidthimpl;
        int iM11107getMaxWidthimpl;
        int iM11106getMaxHeightimpl;
        int i2;
        if (!Constraints.m11103getHasBoundedWidthimpl(j2) || this.direction == Direction.Vertical) {
            iM11109getMinWidthimpl = Constraints.m11109getMinWidthimpl(j2);
            iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
        } else {
            float fM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2) * this.fraction;
            int iM11109getMinWidthimpl2 = Constraints.m11109getMinWidthimpl(j2);
            iM11109getMinWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
            int iRound = Math.round(fM11107getMaxWidthimpl);
            if (iRound >= iM11109getMinWidthimpl2) {
                iM11109getMinWidthimpl2 = iRound;
            }
            if (iM11109getMinWidthimpl2 <= iM11109getMinWidthimpl) {
                iM11109getMinWidthimpl = iM11109getMinWidthimpl2;
            }
            iM11107getMaxWidthimpl = iM11109getMinWidthimpl;
        }
        if (!Constraints.m11102getHasBoundedHeightimpl(j2) || this.direction == Direction.Horizontal) {
            int iM11108getMinHeightimpl = Constraints.m11108getMinHeightimpl(j2);
            int iM11106getMaxHeightimpl2 = Constraints.m11106getMaxHeightimpl(j2);
            iM11106getMaxHeightimpl = iM11108getMinHeightimpl;
            i2 = iM11106getMaxHeightimpl2;
        } else {
            float fM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(j2) * this.fraction;
            int iM11108getMinHeightimpl2 = Constraints.m11108getMinHeightimpl(j2);
            iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(j2);
            int iRound2 = Math.round(fM11106getMaxHeightimpl);
            if (iRound2 >= iM11108getMinHeightimpl2) {
                iM11108getMinHeightimpl2 = iRound2;
            }
            if (iM11108getMinHeightimpl2 <= iM11106getMaxHeightimpl) {
                iM11106getMaxHeightimpl = iM11108getMinHeightimpl2;
            }
            i2 = iM11106getMaxHeightimpl;
        }
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(ConstraintsKt.Constraints(iM11109getMinWidthimpl, iM11107getMaxWidthimpl, iM11106getMaxHeightimpl, i2));
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.foundation.layout.FillNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return FillNode.measure_3p2s80s$lambda$0(placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.minIntrinsicHeight.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public C03841() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.minIntrinsicWidth.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public C03851() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    public final void setDirection(Direction direction) {
        this.direction = direction;
    }

    public final void setFraction(float f2) {
        this.fraction = f2;
    }
}
