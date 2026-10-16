package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNodeCoordinator;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.e;
import h.g.a.l;
import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ApproachMeasureScopeImpl implements ApproachMeasureScope, MeasureScope, LookaheadScope {
    public static final int $stable = 0;
    private boolean approachMeasureRequired;
    private ApproachLayoutModifierNode approachNode;
    private final LayoutModifierNodeCoordinator coordinator;

    public ApproachMeasureScopeImpl(LayoutModifierNodeCoordinator layoutModifierNodeCoordinator, ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.coordinator = layoutModifierNodeCoordinator;
        this.approachNode = approachLayoutModifierNode;
    }

    public final boolean getApproachMeasureRequired$ui() {
        return this.approachMeasureRequired;
    }

    public final ApproachLayoutModifierNode getApproachNode() {
        return this.approachNode;
    }

    public final LayoutModifierNodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.ApproachIntrinsicMeasureScope
    /* renamed from: getLookaheadConstraints-msEJaDk */
    public long mo9717getLookaheadConstraintsmsEJaDk() {
        Constraints constraintsM9970getLookaheadConstraintsDWUhwKw$ui = this.coordinator.m9970getLookaheadConstraintsDWUhwKw$ui();
        if (constraintsM9970getLookaheadConstraintsDWUhwKw$ui != null) {
            return constraintsM9970getLookaheadConstraintsDWUhwKw$ui.m11113unboximpl();
        }
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Error: Lookahead constraints requested before lookahead measure.");
        throw new e();
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public LayoutCoordinates getLookaheadScopeCoordinates(Placeable.PlacementScope placementScope) {
        NodeCoordinator outerCoordinator$ui;
        LayoutNode lookaheadRoot$ui = this.coordinator.getLayoutNode().getLookaheadRoot$ui();
        if (lookaheadRoot$ui == null) {
            InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Error: Requesting LookaheadScopeCoordinates is not permitted from outside of a LookaheadScope.");
            throw new e();
        }
        if (!lookaheadRoot$ui.isVirtualLookaheadRoot$ui()) {
            return lookaheadRoot$ui.getOuterCoordinator$ui();
        }
        LayoutNode parent$ui = lookaheadRoot$ui.getParent$ui();
        if (parent$ui == null || (outerCoordinator$ui = parent$ui.getInnerCoordinator$ui()) == null) {
            outerCoordinator$ui = lookaheadRoot$ui.getChildren$ui().get(0).getOuterCoordinator$ui();
        }
        return outerCoordinator$ui;
    }

    @Override // androidx.compose.ui.layout.ApproachIntrinsicMeasureScope
    /* renamed from: getLookaheadSize-YbymL2g */
    public long mo9718getLookaheadSizeYbymL2g() {
        LookaheadDelegate lookaheadDelegate = this.coordinator.getLookaheadDelegate();
        if (lookaheadDelegate == null) {
            x.g();
        }
        MeasureResult measureResult$ui = lookaheadDelegate.getMeasureResult$ui();
        return (measureResult$ui.getWidth() << 32) | (measureResult$ui.getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return false;
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(int i2, int i3, Map<AlignmentLine, Integer> map, l<? super RulerScope, ab> lVar, l<? super Placeable.PlacementScope, ab> lVar2) {
        if ((i2 & (-16777216)) != 0 || ((-16777216) & i3) != 0) {
            InlineClassHelperKt.throwIllegalStateException(a.a(i3, i2));
        }
        return new MeasureResult(i2, i3, map, lVar, lVar2, this) { // from class: androidx.compose.ui.layout.ApproachMeasureScopeImpl.layout.1
            final /* synthetic */ l<Placeable.PlacementScope, ab> $placementBlock;
            private final Map<AlignmentLine, Integer> alignmentLines;
            private final int height;
            private final l<RulerScope, ab> rulers;
            final /* synthetic */ ApproachMeasureScopeImpl this$0;
            private final int width;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$placementBlock = lVar2;
                this.this$0 = this;
                this.width = i2;
                this.height = i3;
                this.alignmentLines = map;
                this.rulers = lVar;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public l<RulerScope, ab> getRulers() {
                return this.rulers;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                this.$placementBlock.invoke(this.this$0.getCoordinator().getPlacementScope());
            }

            public static /* synthetic */ void getAlignmentLines$annotations() {
            }
        };
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    /* renamed from: localLookaheadPositionOf-au-aQtc */
    public /* synthetic */ long mo1828localLookaheadPositionOfauaQtc(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j2, boolean z) {
        return LookaheadScopeKt.m9778localLookaheadPositionOfFgt4K4Q(this, layoutCoordinates, layoutCoordinates2, j2, z);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public int mo2120roundToPxR2X_6o(long j2) {
        return this.coordinator.mo2120roundToPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public int mo2121roundToPx0680j_4(float f2) {
        return this.coordinator.mo2121roundToPx0680j_4(f2);
    }

    public final void setApproachMeasureRequired$ui(boolean z) {
        this.approachMeasureRequired = z;
    }

    public final void setApproachNode(ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.approachNode = approachLayoutModifierNode;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo2122toDpGaN1DYA(long j2) {
        return this.coordinator.mo2122toDpGaN1DYA(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo2123toDpu2uoSUM(float f2) {
        return this.coordinator.mo2123toDpu2uoSUM(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo2125toDpSizekrfVVM(long j2) {
        return this.coordinator.mo2125toDpSizekrfVVM(j2);
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates) {
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates;
        if (!(layoutCoordinates instanceof LookaheadLayoutCoordinates)) {
            if (!(layoutCoordinates instanceof NodeCoordinator)) {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Unsupported LayoutCoordinates");
                throw new e();
            }
            LookaheadDelegate lookaheadDelegate = ((NodeCoordinator) layoutCoordinates).getLookaheadDelegate();
            if (lookaheadDelegate != null && (lookaheadLayoutCoordinates = lookaheadDelegate.getLookaheadLayoutCoordinates()) != null) {
                return lookaheadLayoutCoordinates;
            }
        }
        return layoutCoordinates;
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public float mo2126toPxR2X_6o(long j2) {
        return this.coordinator.mo2126toPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public float mo2127toPx0680j_4(float f2) {
        return this.coordinator.mo2127toPx0680j_4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect) {
        return this.coordinator.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo2128toSizeXkaWNTQ(long j2) {
        return this.coordinator.mo2128toSizeXkaWNTQ(j2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo2129toSp0xMU5do(float f2) {
        return this.coordinator.mo2129toSp0xMU5do(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo2130toSpkPz2Gy4(float f2) {
        return this.coordinator.mo2130toSpkPz2Gy4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo2124toDpu2uoSUM(int i2) {
        return this.coordinator.mo2124toDpu2uoSUM(i2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo2131toSpkPz2Gy4(int i2) {
        return this.coordinator.mo2131toSpkPz2Gy4(i2);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(int i2, int i3, Map<AlignmentLine, Integer> map, l<? super Placeable.PlacementScope, ab> lVar) {
        return this.coordinator.layout(i2, i3, map, lVar);
    }
}
