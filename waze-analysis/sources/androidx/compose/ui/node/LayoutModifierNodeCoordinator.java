package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScopeImpl;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LayoutModifierNodeCoordinator extends NodeCoordinator {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Paint modifierBoundsPaint;
    private ApproachMeasureScopeImpl approachMeasureScope;
    private LayoutModifierNode layoutModifierNode;
    private Constraints lookaheadConstraints;
    private LookaheadDelegate lookaheadDelegate;

    /* compiled from: WazeSource */
    final class LookaheadDelegateForLayoutModifierNode extends LookaheadDelegate {
        public LookaheadDelegateForLayoutModifierNode() {
            super(LayoutModifierNodeCoordinator.this);
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int calculateAlignmentLine(AlignmentLine alignmentLine) {
            int iCalculateAlignmentAndPlaceChildAsNeeded = LayoutModifierNodeCoordinatorKt.calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
            getCachedAlignmentLinesMap().set(alignmentLine, iCalculateAlignmentAndPlaceChildAsNeeded);
            return iCalculateAlignmentAndPlaceChildAsNeeded;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i2) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
            LookaheadDelegateForLayoutModifierNode lookaheadDelegateForLayoutModifierNode = this;
            LookaheadDelegate lookaheadDelegate = layoutModifierNodeCoordinator.getWrappedNonNull().getLookaheadDelegate();
            if (lookaheadDelegate == null) {
                x.g();
            }
            return layoutModifierNode.maxIntrinsicHeight(lookaheadDelegateForLayoutModifierNode, lookaheadDelegate, i2);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i2) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
            LookaheadDelegateForLayoutModifierNode lookaheadDelegateForLayoutModifierNode = this;
            LookaheadDelegate lookaheadDelegate = layoutModifierNodeCoordinator.getWrappedNonNull().getLookaheadDelegate();
            if (lookaheadDelegate == null) {
                x.g();
            }
            return layoutModifierNode.maxIntrinsicWidth(lookaheadDelegateForLayoutModifierNode, lookaheadDelegate, i2);
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public Placeable mo9741measureBRTryo0(long j2) {
            LookaheadDelegateForLayoutModifierNode lookaheadDelegateForLayoutModifierNode = this;
            lookaheadDelegateForLayoutModifierNode.m9812setMeasurementConstraintsBRTryo0(j2);
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            layoutModifierNodeCoordinator.m9971setLookaheadConstraints_Sx5XlM$ui(Constraints.m11094boximpl(j2));
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
            LookaheadDelegateForLayoutModifierNode lookaheadDelegateForLayoutModifierNode2 = this;
            LookaheadDelegate lookaheadDelegate = layoutModifierNodeCoordinator.getWrappedNonNull().getLookaheadDelegate();
            if (lookaheadDelegate == null) {
                x.g();
            }
            lookaheadDelegateForLayoutModifierNode.set_measureResult(layoutModifierNode.mo1732measure3p2s80s(lookaheadDelegateForLayoutModifierNode2, lookaheadDelegate, j2));
            return lookaheadDelegateForLayoutModifierNode;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i2) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
            LookaheadDelegateForLayoutModifierNode lookaheadDelegateForLayoutModifierNode = this;
            LookaheadDelegate lookaheadDelegate = layoutModifierNodeCoordinator.getWrappedNonNull().getLookaheadDelegate();
            if (lookaheadDelegate == null) {
                x.g();
            }
            return layoutModifierNode.minIntrinsicHeight(lookaheadDelegateForLayoutModifierNode, lookaheadDelegate, i2);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i2) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
            LookaheadDelegateForLayoutModifierNode lookaheadDelegateForLayoutModifierNode = this;
            LookaheadDelegate lookaheadDelegate = layoutModifierNodeCoordinator.getWrappedNonNull().getLookaheadDelegate();
            if (lookaheadDelegate == null) {
                x.g();
            }
            return layoutModifierNode.minIntrinsicWidth(lookaheadDelegateForLayoutModifierNode, lookaheadDelegate, i2);
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo8104setColor8_81llA(Color.Companion.m8255getBlue0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo8108setStylek9PVt8s(PaintingStyle.Companion.m8539getStrokeTiuSbCo());
        modifierBoundsPaint = Paint;
    }

    public LayoutModifierNodeCoordinator(LayoutNode layoutNode, LayoutModifierNode layoutModifierNode) {
        super(layoutNode);
        this.layoutModifierNode = layoutModifierNode;
        ApproachMeasureScopeImpl approachMeasureScopeImpl = null;
        this.lookaheadDelegate = layoutNode.getLookaheadRoot$ui() != null ? new LookaheadDelegateForLayoutModifierNode() : null;
        if ((layoutModifierNode.getNode().getKindSet$ui() & 512) != 0) {
            x.d(layoutModifierNode, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
            approachMeasureScopeImpl = new ApproachMeasureScopeImpl(this, (ApproachLayoutModifierNode) layoutModifierNode);
        }
        this.approachMeasureScope = approachMeasureScopeImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onAfterPlaceAt() {
        /*
            r8 = this;
            boolean r0 = r8.isShallowPlacing$ui()
            if (r0 == 0) goto L7
            return
        L7:
            r8.onPlaced()
            androidx.compose.ui.node.NodeCoordinator r0 = r8.getWrappedNonNull()
            androidx.compose.ui.layout.ApproachMeasureScopeImpl r1 = r8.approachMeasureScope
            r2 = 0
            if (r1 == 0) goto L6f
            androidx.compose.ui.layout.ApproachLayoutModifierNode r3 = r1.getApproachNode()
            androidx.compose.ui.layout.Placeable$PlacementScope r4 = r8.getPlacementScope()
            androidx.compose.ui.node.LookaheadDelegate r5 = r8.getLookaheadDelegate()
            if (r5 != 0) goto L24
            h.g.b.x.g()
        L24:
            androidx.compose.ui.layout.LookaheadLayoutCoordinates r5 = r5.getLookaheadLayoutCoordinates()
            androidx.compose.ui.layout.LayoutCoordinates r5 = (androidx.compose.ui.layout.LayoutCoordinates) r5
            boolean r3 = r3.isPlacementApproachInProgress(r4, r5)
            if (r3 != 0) goto L6b
            boolean r1 = r1.getApproachMeasureRequired$ui()
            if (r1 != 0) goto L6b
            long r3 = r8.mo9743getSizeYbymL2g()
            androidx.compose.ui.node.LookaheadDelegate r1 = r8.getLookaheadDelegate()
            r5 = 0
            if (r1 == 0) goto L4a
            long r6 = r1.m10003getSizeYbymL2g$ui()
            androidx.compose.ui.unit.IntSize r1 = androidx.compose.ui.unit.IntSize.m11331boximpl(r6)
            goto L4b
        L4a:
            r1 = r5
        L4b:
            boolean r1 = androidx.compose.ui.unit.IntSize.m11336equalsimpl(r3, r1)
            if (r1 == 0) goto L6b
            long r3 = r0.mo9743getSizeYbymL2g()
            androidx.compose.ui.node.LookaheadDelegate r1 = r0.getLookaheadDelegate()
            if (r1 == 0) goto L63
            long r5 = r1.m10003getSizeYbymL2g$ui()
            androidx.compose.ui.unit.IntSize r5 = androidx.compose.ui.unit.IntSize.m11331boximpl(r5)
        L63:
            boolean r1 = androidx.compose.ui.unit.IntSize.m11336equalsimpl(r3, r5)
            if (r1 == 0) goto L6b
            r1 = 1
            goto L6c
        L6b:
            r1 = r2
        L6c:
            r0.setForcePlaceWithLookaheadOffset$ui(r1)
        L6f:
            boolean r1 = r0.isPlacingForAlignment$ui()
            boolean r3 = r8.isPlacingForAlignment$ui()
            r0.setPlacingForAlignment$ui(r3)
            androidx.compose.ui.layout.MeasureResult r8 = r8.getMeasureResult$ui()
            r8.placeChildren()
            r0.setPlacingForAlignment$ui(r1)
            r0.setForcePlaceWithLookaheadOffset$ui(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutModifierNodeCoordinator.onAfterPlaceAt():void");
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        return lookaheadDelegate != null ? lookaheadDelegate.getCachedAlignmentLine$ui(alignmentLine) : LayoutModifierNodeCoordinatorKt.calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void ensureLookaheadDelegateCreated() {
        if (getLookaheadDelegate() == null) {
            setLookaheadDelegate(new LookaheadDelegateForLayoutModifierNode());
        }
    }

    public final LayoutModifierNode getLayoutModifierNode() {
        return this.layoutModifierNode;
    }

    /* renamed from: getLookaheadConstraints-DWUhwKw$ui, reason: not valid java name */
    public final Constraints m9970getLookaheadConstraintsDWUhwKw$ui() {
        return this.lookaheadConstraints;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public Modifier.Node getTail() {
        return this.layoutModifierNode.getNode();
    }

    public final NodeCoordinator getWrappedNonNull() {
        NodeCoordinator wrapped$ui = getWrapped$ui();
        if (wrapped$ui == null) {
            x.g();
        }
        return wrapped$ui;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i2) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.getApproachNode().maxApproachIntrinsicHeight(approachMeasureScopeImpl, getWrappedNonNull(), i2) : this.layoutModifierNode.maxIntrinsicHeight(this, getWrappedNonNull(), i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i2) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.getApproachNode().maxApproachIntrinsicWidth(approachMeasureScopeImpl, getWrappedNonNull(), i2) : this.layoutModifierNode.maxIntrinsicWidth(this, getWrappedNonNull(), i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.ui.layout.Placeable mo9741measureBRTryo0(long r9) {
        /*
            r8 = this;
            boolean r0 = r8.getForceMeasureWithLookaheadConstraints$ui()
            if (r0 == 0) goto L17
            androidx.compose.ui.unit.Constraints r9 = r8.lookaheadConstraints
            if (r9 == 0) goto Lf
            long r9 = r9.m11113unboximpl()
            goto L17
        Lf:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Lookahead constraints cannot be null in approach pass."
            r8.<init>(r9)
            throw r8
        L17:
            r0 = r8
            androidx.compose.ui.node.NodeCoordinator r0 = (androidx.compose.ui.node.NodeCoordinator) r0
            androidx.compose.ui.node.NodeCoordinator.m10033access$setMeasurementConstraintsBRTryo0(r0, r9)
            androidx.compose.ui.layout.ApproachMeasureScopeImpl r0 = access$getApproachMeasureScope$p(r8)
            if (r0 == 0) goto Lc0
            androidx.compose.ui.layout.ApproachLayoutModifierNode r1 = r0.getApproachNode()
            long r2 = r0.mo9718getLookaheadSizeYbymL2g()
            boolean r2 = r1.mo1738isMeasurementApproachInProgressozmzZPI(r2)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L40
            androidx.compose.ui.unit.Constraints r2 = r8.m9970getLookaheadConstraintsDWUhwKw$ui()
            boolean r2 = androidx.compose.ui.unit.Constraints.m11099equalsimpl(r9, r2)
            if (r2 != 0) goto L3e
            goto L40
        L3e:
            r2 = r3
            goto L41
        L40:
            r2 = r4
        L41:
            r0.setApproachMeasureRequired$ui(r2)
            boolean r2 = r0.getApproachMeasureRequired$ui()
            if (r2 != 0) goto L51
            androidx.compose.ui.node.NodeCoordinator r2 = r8.getWrappedNonNull()
            r2.setForceMeasureWithLookaheadConstraints$ui(r4)
        L51:
            r2 = r0
            androidx.compose.ui.layout.ApproachMeasureScope r2 = (androidx.compose.ui.layout.ApproachMeasureScope) r2
            androidx.compose.ui.node.NodeCoordinator r5 = r8.getWrappedNonNull()
            androidx.compose.ui.layout.Measurable r5 = (androidx.compose.ui.layout.Measurable) r5
            androidx.compose.ui.layout.MeasureResult r1 = r1.mo1737approachMeasure3p2s80s(r2, r5, r9)
            androidx.compose.ui.node.NodeCoordinator r2 = r8.getWrappedNonNull()
            r2.setForceMeasureWithLookaheadConstraints$ui(r3)
            int r2 = r1.getWidth()
            androidx.compose.ui.node.LookaheadDelegate r5 = r8.getLookaheadDelegate()
            if (r5 != 0) goto L72
            h.g.b.x.g()
        L72:
            int r5 = r5.getWidth()
            if (r2 != r5) goto L8c
            int r2 = r1.getHeight()
            androidx.compose.ui.node.LookaheadDelegate r5 = r8.getLookaheadDelegate()
            if (r5 != 0) goto L85
            h.g.b.x.g()
        L85:
            int r5 = r5.getHeight()
            if (r2 != r5) goto L8c
            r3 = r4
        L8c:
            boolean r0 = r0.getApproachMeasureRequired$ui()
            if (r0 != 0) goto Lbe
            androidx.compose.ui.node.NodeCoordinator r0 = r8.getWrappedNonNull()
            long r4 = r0.mo9743getSizeYbymL2g()
            androidx.compose.ui.node.NodeCoordinator r0 = r8.getWrappedNonNull()
            androidx.compose.ui.node.LookaheadDelegate r0 = r0.getLookaheadDelegate()
            if (r0 == 0) goto Lad
            long r6 = r0.m10003getSizeYbymL2g$ui()
            androidx.compose.ui.unit.IntSize r0 = androidx.compose.ui.unit.IntSize.m11331boximpl(r6)
            goto Lae
        Lad:
            r0 = 0
        Lae:
            boolean r0 = androidx.compose.ui.unit.IntSize.m11336equalsimpl(r4, r0)
            if (r0 == 0) goto Lbe
            if (r3 != 0) goto Lbe
            androidx.compose.ui.node.LayoutModifierNodeCoordinator$measure$1$1$1$1 r0 = new androidx.compose.ui.node.LayoutModifierNodeCoordinator$measure$1$1$1$1
            r0.<init>(r8)
            r1 = r0
            androidx.compose.ui.layout.MeasureResult r1 = (androidx.compose.ui.layout.MeasureResult) r1
        Lbe:
            if (r1 != 0) goto Ld1
        Lc0:
            androidx.compose.ui.node.LayoutModifierNode r0 = r8.getLayoutModifierNode()
            r1 = r8
            androidx.compose.ui.layout.MeasureScope r1 = (androidx.compose.ui.layout.MeasureScope) r1
            androidx.compose.ui.node.NodeCoordinator r2 = r8.getWrappedNonNull()
            androidx.compose.ui.layout.Measurable r2 = (androidx.compose.ui.layout.Measurable) r2
            androidx.compose.ui.layout.MeasureResult r1 = r0.mo1732measure3p2s80s(r1, r2, r9)
        Ld1:
            r8.setMeasureResult$ui(r1)
            r9 = r8
            androidx.compose.ui.layout.Placeable r9 = (androidx.compose.ui.layout.Placeable) r9
            r8.onMeasured()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutModifierNodeCoordinator.mo9741measureBRTryo0(long):androidx.compose.ui.layout.Placeable");
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i2) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.getApproachNode().minApproachIntrinsicHeight(approachMeasureScopeImpl, getWrappedNonNull(), i2) : this.layoutModifierNode.minIntrinsicHeight(this, getWrappedNonNull(), i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i2) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.getApproachNode().minApproachIntrinsicWidth(approachMeasureScopeImpl, getWrappedNonNull(), i2) : this.layoutModifierNode.minIntrinsicWidth(this, getWrappedNonNull(), i2);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void performDraw(Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator wrapped$ui;
        getWrappedNonNull().draw(canvas, graphicsLayer);
        if (!LayoutNodeKt.requireOwner(getLayoutNode()).getShowLayoutBounds() || (wrapped$ui = getWrapped$ui()) == null) {
            return;
        }
        if (IntSize.m11337equalsimpl0(mo9743getSizeYbymL2g(), wrapped$ui.mo9743getSizeYbymL2g()) && IntOffset.m11295equalsimpl0(wrapped$ui.mo9995getPositionnOccac(), IntOffset.Companion.m11307getZeronOccac())) {
            return;
        }
        drawBorder(canvas, modifierBoundsPaint);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo9810placeAtf8xVGno(long j2, float f2, GraphicsLayer graphicsLayer) {
        super.mo9810placeAtf8xVGno(j2, f2, graphicsLayer);
        onAfterPlaceAt();
    }

    public final void setLayoutModifierNode$ui(LayoutModifierNode layoutModifierNode) {
        if (!x.n(layoutModifierNode, this.layoutModifierNode)) {
            if ((layoutModifierNode.getNode().getKindSet$ui() & 512) != 0) {
                x.d(layoutModifierNode, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
                ApproachLayoutModifierNode approachLayoutModifierNode = (ApproachLayoutModifierNode) layoutModifierNode;
                ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
                if (approachMeasureScopeImpl != null) {
                    approachMeasureScopeImpl.setApproachNode(approachLayoutModifierNode);
                } else {
                    approachMeasureScopeImpl = new ApproachMeasureScopeImpl(this, approachLayoutModifierNode);
                }
                this.approachMeasureScope = approachMeasureScopeImpl;
            } else {
                this.approachMeasureScope = null;
            }
        }
        this.layoutModifierNode = layoutModifierNode;
    }

    /* renamed from: setLookaheadConstraints-_Sx5XlM$ui, reason: not valid java name */
    public final void m9971setLookaheadConstraints_Sx5XlM$ui(Constraints constraints) {
        this.lookaheadConstraints = constraints;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    protected void setLookaheadDelegate(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Paint getModifierBoundsPaint() {
            return LayoutModifierNodeCoordinator.modifierBoundsPaint;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo9742placeAtf8xVGno(long j2, float f2, l<? super GraphicsLayerScope, ab> lVar) {
        super.mo9742placeAtf8xVGno(j2, f2, lVar);
        onAfterPlaceAt();
    }
}
