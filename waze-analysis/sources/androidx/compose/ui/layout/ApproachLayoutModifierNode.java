package androidx.compose.ui.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ApproachLayoutModifierNode extends LayoutModifierNode {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.layout.ApproachLayoutModifierNode$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$isPlacementApproachInProgress(ApproachLayoutModifierNode approachLayoutModifierNode, Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
            return false;
        }

        public static int $default$maxApproachIntrinsicHeight(final ApproachLayoutModifierNode approachLayoutModifierNode, ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
            NodeCoordinator coordinator$ui = approachLayoutModifierNode.getNode().getCoordinator$ui();
            if (coordinator$ui == null) {
                x.g();
            }
            LookaheadDelegate lookaheadDelegate = coordinator$ui.getLookaheadDelegate();
            if (lookaheadDelegate == null) {
                x.g();
            }
            return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.maxApproachIntrinsicHeight.1
                @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
                /* renamed from: measure-3p2s80s, reason: not valid java name */
                public final MeasureResult mo9720measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2) {
                    return ApproachLayoutModifierNode.this.mo1737approachMeasure3p2s80s(approachMeasureScope, measurable, j2);
                }
            }, approachIntrinsicMeasureScope, intrinsicMeasurable, i2) : intrinsicMeasurable.maxIntrinsicHeight(i2);
        }

        public static int $default$maxApproachIntrinsicWidth(final ApproachLayoutModifierNode approachLayoutModifierNode, ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
            NodeCoordinator coordinator$ui = approachLayoutModifierNode.getNode().getCoordinator$ui();
            if (coordinator$ui == null) {
                x.g();
            }
            LookaheadDelegate lookaheadDelegate = coordinator$ui.getLookaheadDelegate();
            if (lookaheadDelegate == null) {
                x.g();
            }
            return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.maxApproachIntrinsicWidth.1
                @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo9720measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2) {
                    return ApproachLayoutModifierNode.this.mo1737approachMeasure3p2s80s(approachMeasureScope, measurable, j2);
                }
            }, approachIntrinsicMeasureScope, intrinsicMeasurable, i2) : intrinsicMeasurable.maxIntrinsicWidth(i2);
        }

        /* renamed from: $default$measure-3p2s80s, reason: not valid java name */
        public static MeasureResult m9719$default$measure3p2s80s(ApproachLayoutModifierNode approachLayoutModifierNode, MeasureScope measureScope, Measurable measurable, long j2) {
            Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(j2);
            return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new ApproachLayoutModifierNode$measure$1$1(placeableMo9741measureBRTryo0), 4, null);
        }

        public static int $default$minApproachIntrinsicHeight(final ApproachLayoutModifierNode approachLayoutModifierNode, ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
            NodeCoordinator coordinator$ui = approachLayoutModifierNode.getNode().getCoordinator$ui();
            if (coordinator$ui == null) {
                x.g();
            }
            LookaheadDelegate lookaheadDelegate = coordinator$ui.getLookaheadDelegate();
            if (lookaheadDelegate == null) {
                x.g();
            }
            return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.minHeight$ui(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.minApproachIntrinsicHeight.1
                @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo9720measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2) {
                    return ApproachLayoutModifierNode.this.mo1737approachMeasure3p2s80s(approachMeasureScope, measurable, j2);
                }
            }, approachIntrinsicMeasureScope, intrinsicMeasurable, i2) : intrinsicMeasurable.minIntrinsicHeight(i2);
        }

        public static int $default$minApproachIntrinsicWidth(final ApproachLayoutModifierNode approachLayoutModifierNode, ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
            NodeCoordinator coordinator$ui = approachLayoutModifierNode.getNode().getCoordinator$ui();
            if (coordinator$ui == null) {
                x.g();
            }
            LookaheadDelegate lookaheadDelegate = coordinator$ui.getLookaheadDelegate();
            if (lookaheadDelegate == null) {
                x.g();
            }
            return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.minWidth$ui(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.minApproachIntrinsicWidth.1
                @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo9720measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2) {
                    return ApproachLayoutModifierNode.this.mo1737approachMeasure3p2s80s(approachMeasureScope, measurable, j2);
                }
            }, approachIntrinsicMeasureScope, intrinsicMeasurable, i2) : intrinsicMeasurable.minIntrinsicWidth(i2);
        }
    }

    /* renamed from: approachMeasure-3p2s80s */
    MeasureResult mo1737approachMeasure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2);

    /* renamed from: isMeasurementApproachInProgress-ozmzZPI */
    boolean mo1738isMeasurementApproachInProgressozmzZPI(long j2);

    boolean isPlacementApproachInProgress(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates);

    int maxApproachIntrinsicHeight(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2);

    int maxApproachIntrinsicWidth(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2);

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    MeasureResult mo1732measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2);

    int minApproachIntrinsicHeight(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2);

    int minApproachIntrinsicWidth(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2);
}
