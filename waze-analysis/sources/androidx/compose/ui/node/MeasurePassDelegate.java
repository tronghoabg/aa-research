package androidx.compose.ui.node;

import android.os.Trace;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.tooling.ComposeToolingFlags;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.e;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MeasurePassDelegate extends Placeable implements Measurable, AlignmentLinesOwner, MotionReferencePlacementDelegate {
    public static final int $stable = 8;
    private boolean duringAlignmentLinesQuery;
    private boolean isPlaced;
    private boolean isPlacedByParent;
    private boolean isPlacedUnderMotionFrameOfReference;
    private GraphicsLayer lastExplicitLayer;
    private l<? super GraphicsLayerScope, ab> lastLayerBlock;
    private float lastZIndex;
    private boolean layingOutChildren;
    private final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
    private boolean layoutPending;
    private boolean layoutPendingForAlignment;
    private boolean measurePending;
    private boolean measuredOnce;
    private boolean needsCoordinatesUpdate;
    private boolean onNodePlacedCalled;
    private Object parentData;
    private GraphicsLayer placeOuterCoordinatorLayer;
    private l<? super GraphicsLayerScope, ab> placeOuterCoordinatorLayerBlock;
    private float placeOuterCoordinatorZIndex;
    private boolean placedOnce;
    private boolean relayoutWithoutParentInProgress;
    private float zIndex;
    private int previousPlaceOrder = Integer.MAX_VALUE;
    private int placeOrder = Integer.MAX_VALUE;
    private LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;
    private long lastPosition = IntOffset.Companion.m11307getZeronOccac();
    private boolean parentDataDirty = true;
    private final AlignmentLines alignmentLines = new LayoutNodeAlignmentLines(this);
    private final MutableVector<MeasurePassDelegate> _childDelegates = new MutableVector<>(new MeasurePassDelegate[16], 0);
    private boolean childDelegatesDirty = true;
    private long performMeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private final a<ab> performMeasureBlock = new MeasurePassDelegate$performMeasureBlock$1(this);
    private final a<ab> layoutChildrenBlock = new MeasurePassDelegate$layoutChildrenBlock$1(this);
    private long placeOuterCoordinatorPosition = IntOffset.Companion.m11307getZeronOccac();
    private final a<ab> placeOuterCoordinatorBlock = new MeasurePassDelegate$placeOuterCoordinatorBlock$1(this);

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
            try {
                iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public MeasurePassDelegate(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate) {
        this.layoutNodeLayoutDelegate = layoutNodeLayoutDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkChildrenPlaceOrderForUpdates() {
        LayoutNode layoutNode = getLayoutNode();
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutNode layoutNode2 = layoutNodeArr[i2];
            if (layoutNode2.getMeasurePassDelegate$ui().previousPlaceOrder != layoutNode2.getPlaceOrder$ui()) {
                layoutNode.onZSortedChildrenInvalidated$ui();
                layoutNode.invalidateLayer$ui();
                if (layoutNode2.getPlaceOrder$ui() == Integer.MAX_VALUE) {
                    if (layoutNode2.getLayoutDelegate$ui().getDetachedFromParentLookaheadPlacement$ui() || LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode2)) {
                        LookaheadPassDelegate lookaheadPassDelegate$ui = layoutNode2.getLookaheadPassDelegate$ui();
                        if (lookaheadPassDelegate$ui == null) {
                            x.g();
                        }
                        lookaheadPassDelegate$ui.markNodeAndSubtreeAsNotPlaced$ui(false);
                    }
                    layoutNode2.getMeasurePassDelegate$ui().markSubtreeAsNotPlaced();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearPlaceOrder() {
        this.layoutNodeLayoutDelegate.setNextChildPlaceOrder$ui(0);
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            MeasurePassDelegate measurePassDelegate$ui = layoutNodeArr[i2].getMeasurePassDelegate$ui();
            measurePassDelegate$ui.previousPlaceOrder = measurePassDelegate$ui.getPlaceOrder();
            measurePassDelegate$ui.placeOrder = Integer.MAX_VALUE;
            measurePassDelegate$ui.isPlacedByParent = false;
            if (measurePassDelegate$ui.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                measurePassDelegate$ui.measuredByParent = LayoutNode.UsageByParent.NotUsed;
            }
        }
    }

    private final void forEachChildDelegate(l<? super MeasurePassDelegate, ab> lVar) {
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            lVar.invoke(layoutNodeArr[i2].getMeasurePassDelegate$ui());
        }
    }

    private final LookaheadPassDelegate getLookaheadPassDelegate() {
        return this.layoutNodeLayoutDelegate.getLookaheadPassDelegate$ui();
    }

    private final void markNodeAndSubtreeAsPlaced() {
        boolean z = this.isPlaced;
        this.isPlaced = true;
        LayoutNode layoutNode = getLayoutNode();
        if (!z) {
            layoutNode.getInnerCoordinator$ui().onPlaced();
            LayoutNodeKt.requireOwner(layoutNode).getRectManager().recalculateRectIfDirty(getLayoutNode());
            if (layoutNode.getMeasurePending$ui()) {
                LayoutNode.requestRemeasure$ui$default(layoutNode, true, false, false, 6, null);
            } else if (layoutNode.getLookaheadMeasurePending$ui()) {
                LayoutNode.requestLookaheadRemeasure$ui$default(layoutNode, true, false, false, 6, null);
            }
        }
        NodeCoordinator wrapped$ui = layoutNode.getInnerCoordinator$ui().getWrapped$ui();
        for (NodeCoordinator outerCoordinator$ui = layoutNode.getOuterCoordinator$ui(); !x.n(outerCoordinator$ui, wrapped$ui) && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.getWrapped$ui()) {
            if (outerCoordinator$ui.getLastLayerDrawingWasSkipped$ui()) {
                outerCoordinator$ui.invalidateLayer();
            }
        }
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutNode layoutNode2 = layoutNodeArr[i2];
            if (layoutNode2.getPlaceOrder$ui() != Integer.MAX_VALUE) {
                layoutNode2.getMeasurePassDelegate$ui().markNodeAndSubtreeAsPlaced();
                layoutNode.rescheduleRemeasureOrRelayout$ui(layoutNode2);
            }
        }
    }

    private final void markSubtreeAsNotPlaced() {
        if (this.isPlaced) {
            this.isPlaced = false;
            LayoutNodeKt.requireOwner(getLayoutNode()).getRectManager().remove(getLayoutNode());
            LayoutNode layoutNode = getLayoutNode();
            NodeCoordinator wrapped$ui = layoutNode.getInnerCoordinator$ui().getWrapped$ui();
            for (NodeCoordinator outerCoordinator$ui = layoutNode.getOuterCoordinator$ui(); !x.n(outerCoordinator$ui, wrapped$ui) && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.getWrapped$ui()) {
                outerCoordinator$ui.onUnplaced();
                outerCoordinator$ui.releaseLayer();
            }
            MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui();
            LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                layoutNodeArr[i2].getMeasurePassDelegate$ui().markSubtreeAsNotPlaced();
            }
        }
    }

    private final void onBeforeLayoutChildren() {
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutNode layoutNode = layoutNodeArr[i2];
            if (layoutNode.getMeasurePending$ui() && layoutNode.getMeasuredByParent$ui() == LayoutNode.UsageByParent.InMeasureBlock && LayoutNode.m9975remeasure_Sx5XlM$ui$default(layoutNode, null, 1, null)) {
                LayoutNode.requestRemeasure$ui$default(getLayoutNode(), false, false, false, 7, null);
            }
        }
    }

    private final void onIntrinsicsQueried() {
        LayoutNode.requestRemeasure$ui$default(getLayoutNode(), false, false, false, 7, null);
        LayoutNode parent$ui = getLayoutNode().getParent$ui();
        if (parent$ui == null || getLayoutNode().getIntrinsicsUsageByParent$ui() != LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        LayoutNode layoutNode = getLayoutNode();
        LayoutNode.LayoutState layoutState$ui = parent$ui.getLayoutState$ui();
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Measuring;
        int iOrdinal = layoutState$ui.ordinal();
        layoutNode.setIntrinsicsUsageByParent$ui(iOrdinal != 0 ? iOrdinal != 2 ? parent$ui.getIntrinsicsUsageByParent$ui() : LayoutNode.UsageByParent.InLayoutBlock : LayoutNode.UsageByParent.InMeasureBlock);
    }

    /* renamed from: placeOuterCoordinator-MLgxB_4, reason: not valid java name */
    private final void m10017placeOuterCoordinatorMLgxB_4(long j2, float f2, l<? super GraphicsLayerScope, ab> lVar, GraphicsLayer graphicsLayer) {
        if (getLayoutNode().isDeactivated()) {
            InlineClassHelperKt.throwIllegalArgumentException("place is called on a deactivated node");
        }
        setLayoutState(LayoutNode.LayoutState.LayingOut);
        this.lastPosition = j2;
        this.lastZIndex = f2;
        this.lastLayerBlock = lVar;
        this.lastExplicitLayer = graphicsLayer;
        this.onNodePlacedCalled = false;
        Owner ownerRequireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        if (this.layoutPending || !this.isPlaced) {
            getAlignmentLines().setUsedByModifierLayout$ui(false);
            this.layoutNodeLayoutDelegate.setCoordinatesAccessedDuringModifierPlacement(false);
            this.placeOuterCoordinatorLayerBlock = lVar;
            this.placeOuterCoordinatorPosition = j2;
            this.placeOuterCoordinatorZIndex = f2;
            this.placeOuterCoordinatorLayer = graphicsLayer;
            OwnerSnapshotObserver snapshotObserver = ownerRequireOwner.getSnapshotObserver();
            LayoutNode layoutNode = getLayoutNode();
            a<ab> aVar = this.placeOuterCoordinatorBlock;
            l lVar2 = snapshotObserver.onCommitAffectingLayoutModifier;
            snapshotObserver.observer.observeReads(layoutNode, lVar2, aVar);
        } else {
            getOuterCoordinator().m10057placeSelfApparentToRealOffsetMLgxB_4(j2, f2, lVar, graphicsLayer);
            onNodePlaced$ui();
        }
        setLayoutState(LayoutNode.LayoutState.Idle);
        if (getOuterCoordinator().isPlacingForAlignment$ui() && (this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringPlacement())) {
            requestLayout();
        }
        this.placedOnce = true;
    }

    /* renamed from: placeSelf-MLgxB_4, reason: not valid java name */
    private final void m10018placeSelfMLgxB_4(long j2, float f2, l<? super GraphicsLayerScope, ab> lVar, GraphicsLayer graphicsLayer) throws Throwable {
        Placeable.PlacementScope placementScope;
        LayoutNode layoutNode = getLayoutNode();
        try {
            this.isPlacedByParent = true;
            if (!IntOffset.m11295equalsimpl0(j2, this.lastPosition) || lVar != this.lastLayerBlock || this.needsCoordinatesUpdate) {
                if (this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringPlacement() || this.needsCoordinatesUpdate) {
                    this.layoutPending = true;
                    this.needsCoordinatesUpdate = false;
                }
            }
            LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
            if (lookaheadPassDelegate != null) {
                lookaheadPassDelegate.onApproachPlacement$ui();
            }
            LookaheadPassDelegate lookaheadPassDelegate2 = getLookaheadPassDelegate();
            if (lookaheadPassDelegate2 != null && lookaheadPassDelegate2.getNeedsToBePlacedInApproach()) {
                NodeCoordinator wrappedBy$ui = getOuterCoordinator().getWrappedBy$ui();
                if (wrappedBy$ui == null || (placementScope = wrappedBy$ui.getPlacementScope()) == null) {
                    placementScope = LayoutNodeKt.requireOwner(getLayoutNode()).getPlacementScope();
                }
                Placeable.PlacementScope placementScope2 = placementScope;
                LookaheadPassDelegate lookaheadPassDelegate3 = getLookaheadPassDelegate();
                if (lookaheadPassDelegate3 == null) {
                    x.g();
                }
                LayoutNode parent$ui = getLayoutNode().getParent$ui();
                if (parent$ui != null) {
                    parent$ui.getLayoutDelegate$ui().setNextChildLookaheadPlaceOrder$ui(0);
                }
                lookaheadPassDelegate3.setPlaceOrder$ui(Integer.MAX_VALUE);
                Placeable.PlacementScope.place$default(placementScope2, lookaheadPassDelegate3, IntOffset.m11296getXimpl(j2), IntOffset.m11297getYimpl(j2), 0.0f, 4, null);
            }
            LookaheadPassDelegate lookaheadPassDelegate4 = getLookaheadPassDelegate();
            if (lookaheadPassDelegate4 != null && !lookaheadPassDelegate4.getPlacedOnce$ui()) {
                InlineClassHelperKt.throwIllegalStateException("Error: Placement happened before lookahead.");
            }
            m10017placeOuterCoordinatorMLgxB_4(j2, f2, lVar, graphicsLayer);
        } catch (Throwable th) {
            layoutNode.rethrowWithComposeStackTrace(th);
            throw new e();
        }
    }

    private final void trackMeasurementByParent(LayoutNode layoutNode) {
        LayoutNode.UsageByParent usageByParent;
        LayoutNode parent$ui = layoutNode.getParent$ui();
        if (parent$ui == null) {
            this.measuredByParent = LayoutNode.UsageByParent.NotUsed;
            return;
        }
        if (this.measuredByParent != LayoutNode.UsageByParent.NotUsed && !layoutNode.getCanMultiMeasure$ui()) {
            InlineClassHelperKt.throwIllegalStateException(LayoutNodeLayoutDelegateKt.MeasuredTwiceErrorMessage);
        }
        LayoutNode.LayoutState layoutState$ui = parent$ui.getLayoutState$ui();
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Measuring;
        int iOrdinal = layoutState$ui.ordinal();
        if (iOrdinal == 0) {
            usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
        } else {
            if (iOrdinal != 2) {
                LayoutNode.LayoutState layoutState$ui2 = parent$ui.getLayoutState$ui();
                Objects.toString(layoutState$ui2);
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(String.valueOf(layoutState$ui2)));
            }
            usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
        }
        this.measuredByParent = usageByParent;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public Map<AlignmentLine, Integer> calculateAlignmentLines() {
        if (!this.duringAlignmentLinesQuery) {
            if (getLayoutState() == LayoutNode.LayoutState.Measuring) {
                getAlignmentLines().setUsedByModifierMeasurement$ui(true);
                if (getAlignmentLines().getDirty$ui()) {
                    markLayoutPending();
                }
            } else {
                getAlignmentLines().setUsedByModifierLayout$ui(true);
            }
        }
        NodeCoordinator innerCoordinator = getInnerCoordinator();
        boolean zIsPlacingForAlignment$ui = innerCoordinator.isPlacingForAlignment$ui();
        innerCoordinator.setPlacingForAlignment$ui(true);
        layoutChildren();
        innerCoordinator.setPlacingForAlignment$ui(zIsPlacingForAlignment$ui);
        return getAlignmentLines().getLastCalculation();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void forEachChildAlignmentLinesOwner(l<? super AlignmentLinesOwner, ab> lVar) {
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            lVar.invoke(layoutNodeArr[i2].getLayoutDelegate$ui().getAlignmentLinesOwner$ui());
        }
    }

    @Override // androidx.compose.ui.layout.Measured
    public int get(AlignmentLine alignmentLine) {
        LayoutNode parent$ui = getLayoutNode().getParent$ui();
        if ((parent$ui != null ? parent$ui.getLayoutState$ui() : null) == LayoutNode.LayoutState.Measuring) {
            getAlignmentLines().setUsedDuringParentMeasurement$ui(true);
        } else {
            LayoutNode parent$ui2 = getLayoutNode().getParent$ui();
            if ((parent$ui2 != null ? parent$ui2.getLayoutState$ui() : null) == LayoutNode.LayoutState.LayingOut) {
                getAlignmentLines().setUsedDuringParentLayout$ui(true);
            }
        }
        this.duringAlignmentLinesQuery = true;
        int i2 = getOuterCoordinator().get(alignmentLine);
        this.duringAlignmentLinesQuery = false;
        return i2;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public AlignmentLines getAlignmentLines() {
        return this.alignmentLines;
    }

    public final List<MeasurePassDelegate> getChildDelegates$ui() {
        getLayoutNode().updateChildrenIfDirty$ui();
        if (!this.childDelegatesDirty) {
            return this._childDelegates.asMutableList();
        }
        LayoutNode layoutNode = getLayoutNode();
        MutableVector<MeasurePassDelegate> mutableVector = this._childDelegates;
        MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector2.content;
        int size = mutableVector2.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutNode layoutNode2 = layoutNodeArr[i2];
            if (mutableVector.getSize() <= i2) {
                mutableVector.add(layoutNode2.getLayoutDelegate$ui().getMeasurePassDelegate$ui());
            } else {
                mutableVector.set(i2, layoutNode2.getLayoutDelegate$ui().getMeasurePassDelegate$ui());
            }
        }
        mutableVector.removeRange(layoutNode.getChildren$ui().size(), mutableVector.getSize());
        this.childDelegatesDirty = false;
        return this._childDelegates.asMutableList();
    }

    public final boolean getChildDelegatesDirty$ui() {
        return this.childDelegatesDirty;
    }

    public final boolean getDuringAlignmentLinesQuery$ui() {
        return this.duringAlignmentLinesQuery;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public NodeCoordinator getInnerCoordinator() {
        return getLayoutNode().getInnerCoordinator$ui();
    }

    /* renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
    public final Constraints m10019getLastConstraintsDWUhwKw() {
        if (this.measuredOnce) {
            return Constraints.m11094boximpl(m9809getMeasurementConstraintsmsEJaDk());
        }
        return null;
    }

    /* renamed from: getLastPosition-nOcc-ac$ui, reason: not valid java name */
    public final long m10020getLastPositionnOccac$ui() {
        return this.lastPosition;
    }

    public final boolean getLayingOutChildren() {
        return this.layingOutChildren;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNodeLayoutDelegate.getLayoutNode$ui();
    }

    public final boolean getLayoutPending$ui() {
        return this.layoutPending;
    }

    public final LayoutNode.LayoutState getLayoutState() {
        return this.layoutNodeLayoutDelegate.getLayoutState$ui();
    }

    public final boolean getMeasurePending$ui() {
        return this.measurePending;
    }

    public final LayoutNode.UsageByParent getMeasuredByParent$ui() {
        return this.measuredByParent;
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return getOuterCoordinator().getMeasuredHeight();
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return getOuterCoordinator().getMeasuredWidth();
    }

    public final NodeCoordinator getOuterCoordinator() {
        return this.layoutNodeLayoutDelegate.getOuterCoordinator();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public AlignmentLinesOwner getParentAlignmentLinesOwner() {
        LayoutNodeLayoutDelegate layoutDelegate$ui;
        LayoutNode parent$ui = getLayoutNode().getParent$ui();
        if (parent$ui == null || (layoutDelegate$ui = parent$ui.getLayoutDelegate$ui()) == null) {
            return null;
        }
        return layoutDelegate$ui.getAlignmentLinesOwner$ui();
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public Object getParentData() {
        return this.parentData;
    }

    public final a<ab> getPerformMeasureBlock$ui() {
        return this.performMeasureBlock;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public int getPlaceOrder() {
        return this.placeOrder;
    }

    public final boolean getPlacedOnce() {
        return this.placedOnce;
    }

    public final int getPreviousPlaceOrder$ui() {
        return this.previousPlaceOrder;
    }

    public final float getZIndex$ui() {
        return this.zIndex;
    }

    public final void invalidateIntrinsicsParent(boolean z) {
        LayoutNode layoutNode;
        LayoutNode parent$ui = getLayoutNode().getParent$ui();
        LayoutNode.UsageByParent intrinsicsUsageByParent$ui = getLayoutNode().getIntrinsicsUsageByParent$ui();
        if (parent$ui == null || intrinsicsUsageByParent$ui == LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        do {
            layoutNode = parent$ui;
            if (layoutNode.getIntrinsicsUsageByParent$ui() != intrinsicsUsageByParent$ui) {
                break;
            } else {
                parent$ui = layoutNode.getParent$ui();
            }
        } while (parent$ui != null);
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Measuring;
        int iOrdinal = intrinsicsUsageByParent$ui.ordinal();
        if (iOrdinal == 0) {
            LayoutNode.requestRemeasure$ui$default(layoutNode, z, false, false, 6, null);
        } else {
            if (iOrdinal != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            layoutNode.requestRelayout$ui(z);
        }
    }

    public final void invalidateParentData() {
        this.parentDataDirty = true;
    }

    public final boolean isPlaced$ui() {
        return this.isPlaced;
    }

    public final boolean isPlacedByParent() {
        return this.isPlacedByParent;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public boolean isPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void layoutChildren() {
        this.layingOutChildren = true;
        getAlignmentLines().recalculateQueryOwner();
        if (this.layoutPending) {
            onBeforeLayoutChildren();
        }
        if (this.layoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !getInnerCoordinator().isPlacingForAlignment$ui() && this.layoutPending)) {
            this.layoutPending = false;
            LayoutNode.LayoutState layoutState = getLayoutState();
            setLayoutState(LayoutNode.LayoutState.LayingOut);
            this.layoutNodeLayoutDelegate.setCoordinatesAccessedDuringPlacement(false);
            LayoutNode layoutNode = getLayoutNode();
            OwnerSnapshotObserver snapshotObserver = LayoutNodeKt.requireOwner(layoutNode).getSnapshotObserver();
            a<ab> aVar = this.layoutChildrenBlock;
            l lVar = snapshotObserver.onCommitAffectingLayout;
            snapshotObserver.observer.observeReads(layoutNode, lVar, aVar);
            setLayoutState(layoutState);
            this.layoutPendingForAlignment = false;
        }
        if (getAlignmentLines().getUsedDuringParentLayout$ui()) {
            getAlignmentLines().setPreviousUsedDuringParentLayout$ui(true);
        }
        if (getAlignmentLines().getDirty$ui() && getAlignmentLines().getRequired$ui()) {
            getAlignmentLines().recalculate();
        }
        this.layingOutChildren = false;
    }

    public final void markDetachedFromParentLookaheadPass$ui() {
        this.layoutNodeLayoutDelegate.setDetachedFromParentLookaheadPass$ui(true);
    }

    public final void markLayoutPending() {
        this.layoutPending = true;
        this.layoutPendingForAlignment = true;
    }

    public final void markMeasurePending$ui() {
        this.measurePending = true;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i2) {
        if (!LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            onIntrinsicsQueried();
            return getOuterCoordinator().maxIntrinsicHeight(i2);
        }
        LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        if (lookaheadPassDelegate == null) {
            x.g();
        }
        return lookaheadPassDelegate.maxIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i2) {
        if (!LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            onIntrinsicsQueried();
            return getOuterCoordinator().maxIntrinsicWidth(i2);
        }
        LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        if (lookaheadPassDelegate == null) {
            x.g();
        }
        return lookaheadPassDelegate.maxIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    public Placeable mo9741measureBRTryo0(long j2) throws Throwable {
        if (getLayoutNode().getIntrinsicsUsageByParent$ui() == LayoutNode.UsageByParent.NotUsed) {
            getLayoutNode().clearSubtreeIntrinsicsUsage$ui();
        }
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
            if (lookaheadPassDelegate == null) {
                x.g();
            }
            lookaheadPassDelegate.setMeasuredByParent$ui(LayoutNode.UsageByParent.NotUsed);
            if (ComposeToolingFlags.isVerboseTracingEnabled) {
                Trace.beginSection("Compose:lookaheadMeasure");
                try {
                    lookaheadPassDelegate.mo9741measureBRTryo0(j2);
                } finally {
                    Trace.endSection();
                }
            } else {
                lookaheadPassDelegate.mo9741measureBRTryo0(j2);
            }
        }
        trackMeasurementByParent(getLayoutNode());
        m10022remeasureBRTryo0(j2);
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i2) {
        if (!LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            onIntrinsicsQueried();
            return getOuterCoordinator().minIntrinsicHeight(i2);
        }
        LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        if (lookaheadPassDelegate == null) {
            x.g();
        }
        return lookaheadPassDelegate.minIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i2) {
        if (!LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            onIntrinsicsQueried();
            return getOuterCoordinator().minIntrinsicWidth(i2);
        }
        LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        if (lookaheadPassDelegate == null) {
            x.g();
        }
        return lookaheadPassDelegate.minIntrinsicWidth(i2);
    }

    public final void onNodeDetached() {
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        this.isPlaced = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNodePlaced$ui() {
        /*
            r6 = this;
            r0 = 1
            r6.onNodePlacedCalled = r0
            androidx.compose.ui.node.LayoutNode r1 = r6.getLayoutNode()
            androidx.compose.ui.node.LayoutNode r1 = r1.getParent$ui()
            androidx.compose.ui.node.NodeCoordinator r2 = r6.getInnerCoordinator()
            float r2 = r2.getZIndex()
            androidx.compose.ui.node.LayoutNode r3 = r6.getLayoutNode()
            androidx.compose.ui.node.NodeCoordinator r4 = r3.getOuterCoordinator$ui()
            androidx.compose.ui.node.NodeCoordinator r3 = r3.getInnerCoordinator$ui()
        L1f:
            if (r4 == r3) goto L32
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator"
            h.g.b.x.d(r4, r5)
            androidx.compose.ui.node.LayoutModifierNodeCoordinator r4 = (androidx.compose.ui.node.LayoutModifierNodeCoordinator) r4
            float r5 = r4.getZIndex()
            float r2 = r2 + r5
            androidx.compose.ui.node.NodeCoordinator r4 = r4.getWrapped$ui()
            goto L1f
        L32:
            float r3 = r6.zIndex
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 != 0) goto L39
            goto L45
        L39:
            r6.zIndex = r2
            if (r1 == 0) goto L40
            r1.onZSortedChildrenInvalidated$ui()
        L40:
            if (r1 == 0) goto L45
            r1.invalidateLayer$ui()
        L45:
            androidx.compose.ui.node.NodeCoordinator r2 = r6.getInnerCoordinator()
            boolean r2 = r2.isPlacingForAlignment$ui()
            r3 = 0
            if (r2 != 0) goto L7e
            boolean r2 = r6.isPlaced
            if (r2 == 0) goto L5e
            androidx.compose.ui.node.AlignmentLines r4 = r6.getAlignmentLines()
            boolean r4 = r4.getQueried$ui()
            if (r4 == 0) goto L73
        L5e:
            r6.markNodeAndSubtreeAsPlaced()
            if (r2 != 0) goto L73
            if (r1 == 0) goto L68
            r1.invalidateLayer$ui()
        L68:
            boolean r2 = r6.relayoutWithoutParentInProgress
            if (r2 == 0) goto L7e
            if (r1 == 0) goto L7e
            r2 = 0
            androidx.compose.ui.node.LayoutNode.requestRelayout$ui$default(r1, r3, r0, r2)
            goto L7e
        L73:
            androidx.compose.ui.node.LayoutNode r2 = r6.getLayoutNode()
            androidx.compose.ui.node.NodeCoordinator r2 = r2.getInnerCoordinator$ui()
            r2.onPlaced()
        L7e:
            if (r1 == 0) goto Lb1
            boolean r2 = r6.relayoutWithoutParentInProgress
            if (r2 != 0) goto Lb3
            androidx.compose.ui.node.LayoutNode$LayoutState r2 = r1.getLayoutState$ui()
            androidx.compose.ui.node.LayoutNode$LayoutState r3 = androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut
            if (r2 != r3) goto Lb3
            int r2 = r6.getPlaceOrder()
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r3) goto L9a
            java.lang.String r2 = "Place was called on a node which was placed already"
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException(r2)
        L9a:
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r2 = r1.getLayoutDelegate$ui()
            int r2 = r2.getNextChildPlaceOrder$ui()
            r6.placeOrder = r2
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r1 = r1.getLayoutDelegate$ui()
            int r2 = r1.getNextChildPlaceOrder$ui()
            int r2 = r2 + r0
            r1.setNextChildPlaceOrder$ui(r2)
            goto Lb3
        Lb1:
            r6.placeOrder = r3
        Lb3:
            r6.layoutChildren()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.MeasurePassDelegate.onNodePlaced$ui():void");
    }

    /* renamed from: performMeasure-BRTryo0$ui, reason: not valid java name */
    public final void m10021performMeasureBRTryo0$ui(long j2) {
        if (getLayoutState() != LayoutNode.LayoutState.Idle) {
            InlineClassHelperKt.throwIllegalStateException("layout state is not idle before measure starts");
        }
        this.performMeasureConstraints = j2;
        setLayoutState(LayoutNode.LayoutState.Measuring);
        this.measurePending = false;
        OwnerSnapshotObserver snapshotObserver = LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
        LayoutNode layoutNode = getLayoutNode();
        a<ab> performMeasureBlock$ui = getPerformMeasureBlock$ui();
        l lVar = snapshotObserver.onCommitAffectingMeasure;
        snapshotObserver.observer.observeReads(layoutNode, lVar, performMeasureBlock$ui);
        if (getLayoutState() == LayoutNode.LayoutState.Measuring) {
            markLayoutPending();
            setLayoutState(LayoutNode.LayoutState.Idle);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo9810placeAtf8xVGno(long j2, float f2, GraphicsLayer graphicsLayer) throws Throwable {
        m10018placeSelfMLgxB_4(j2, f2, null, graphicsLayer);
    }

    /* renamed from: remeasure-BRTryo0, reason: not valid java name */
    public final boolean m10022remeasureBRTryo0(long j2) throws Throwable {
        LayoutNode layoutNode = getLayoutNode();
        try {
            if (getLayoutNode().isDeactivated()) {
                InlineClassHelperKt.throwIllegalArgumentException("measure is called on a deactivated node");
            }
            Owner ownerRequireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
            LayoutNode parent$ui = getLayoutNode().getParent$ui();
            boolean z = true;
            getLayoutNode().setCanMultiMeasure$ui(getLayoutNode().getCanMultiMeasure$ui() || (parent$ui != null && parent$ui.getCanMultiMeasure$ui()));
            if (!getLayoutNode().getMeasurePending$ui() && Constraints.m11100equalsimpl0(m9809getMeasurementConstraintsmsEJaDk(), j2)) {
                Owner.CC.forceMeasureTheSubtree$default(ownerRequireOwner, getLayoutNode(), false, 2, null);
                getLayoutNode().resetSubtreeIntrinsicsUsage$ui();
                return false;
            }
            getAlignmentLines().setUsedByModifierMeasurement$ui(false);
            forEachChildAlignmentLinesOwner(MeasurePassDelegate$remeasure$1$2.INSTANCE);
            this.measuredOnce = true;
            long jMo9743getSizeYbymL2g = getOuterCoordinator().mo9743getSizeYbymL2g();
            m9812setMeasurementConstraintsBRTryo0(j2);
            if (getLayoutState() != LayoutNode.LayoutState.Idle) {
                InlineClassHelperKt.throwIllegalStateException("layout state is not idle before measure starts");
            }
            this.performMeasureConstraints = j2;
            setLayoutState(LayoutNode.LayoutState.Measuring);
            this.measurePending = false;
            OwnerSnapshotObserver snapshotObserver = LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
            snapshotObserver.observer.observeReads(getLayoutNode(), snapshotObserver.onCommitAffectingMeasure, getPerformMeasureBlock$ui());
            if (getLayoutState() == LayoutNode.LayoutState.Measuring) {
                markLayoutPending();
                setLayoutState(LayoutNode.LayoutState.Idle);
            }
            if (IntSize.m11337equalsimpl0(getOuterCoordinator().mo9743getSizeYbymL2g(), jMo9743getSizeYbymL2g) && getOuterCoordinator().getWidth() == getWidth() && getOuterCoordinator().getHeight() == getHeight()) {
                z = false;
            }
            m9811setMeasuredSizeozmzZPI((getOuterCoordinator().getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (getOuterCoordinator().getWidth() << 32));
            return z;
        } catch (Throwable th) {
            layoutNode.rethrowWithComposeStackTrace(th);
            throw new e();
        }
    }

    public final void replace() {
        MeasurePassDelegate measurePassDelegate;
        LayoutNode parent$ui;
        try {
            this.relayoutWithoutParentInProgress = true;
            if (!this.placedOnce) {
                InlineClassHelperKt.throwIllegalStateException("replace called on unplaced item");
            }
            boolean z = this.isPlaced;
            measurePassDelegate = this;
            try {
                measurePassDelegate.m10017placeOuterCoordinatorMLgxB_4(this.lastPosition, this.lastZIndex, this.lastLayerBlock, this.lastExplicitLayer);
                if (z && !measurePassDelegate.onNodePlacedCalled && (parent$ui = measurePassDelegate.getLayoutNode().getParent$ui()) != null) {
                    LayoutNode.requestRelayout$ui$default(parent$ui, false, 1, null);
                }
            } catch (Throwable th) {
                th = th;
                try {
                    measurePassDelegate.getLayoutNode().rethrowWithComposeStackTrace(th);
                    throw new e();
                } finally {
                    measurePassDelegate.relayoutWithoutParentInProgress = false;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            measurePassDelegate = this;
        }
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void requestLayout() {
        LayoutNode.requestRelayout$ui$default(getLayoutNode(), false, 1, null);
    }

    public final void requestLayoutIfCoordinatesAreUsedAndNotifyChildren() {
        if (!getLayoutNode().isPlaced() || this.layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() <= 0) {
            return;
        }
        LayoutNodeLayoutDelegate layoutDelegate$ui = getLayoutNode().getLayoutDelegate$ui();
        if ((layoutDelegate$ui.getCoordinatesAccessedDuringPlacement() || layoutDelegate$ui.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate$ui.getLayoutPending$ui()) {
            LayoutNode.requestRelayout$ui$default(getLayoutNode(), false, 1, null);
        }
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            layoutNodeArr[i2].getMeasurePassDelegate$ui().requestLayoutIfCoordinatesAreUsedAndNotifyChildren();
        }
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void requestMeasure() {
        LayoutNode.requestRemeasure$ui$default(getLayoutNode(), false, false, false, 7, null);
    }

    public final void setChildDelegatesDirty$ui(boolean z) {
        this.childDelegatesDirty = z;
    }

    public final void setDuringAlignmentLinesQuery$ui(boolean z) {
        this.duringAlignmentLinesQuery = z;
    }

    public final void setLayoutState(LayoutNode.LayoutState layoutState) {
        this.layoutNodeLayoutDelegate.setLayoutState$ui(layoutState);
    }

    public final void setMeasuredByParent$ui(LayoutNode.UsageByParent usageByParent) {
        this.measuredByParent = usageByParent;
    }

    public final void setPlaced$ui(boolean z) {
        this.isPlaced = z;
    }

    public final void setPlacedByParent$ui(boolean z) {
        this.isPlacedByParent = z;
    }

    public void setPlacedUnderMotionFrameOfReference(boolean z) {
        this.isPlacedUnderMotionFrameOfReference = z;
    }

    public final boolean updateParentData() {
        if ((getParentData() == null && getOuterCoordinator().getParentData() == null) || !this.parentDataDirty) {
            return false;
        }
        this.parentDataDirty = false;
        this.parentData = getOuterCoordinator().getParentData();
        return true;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public void updatePlacedUnderMotionFrameOfReference(boolean z) {
        if (z != getOuterCoordinator().isPlacedUnderMotionFrameOfReference()) {
            getOuterCoordinator().setPlacedUnderMotionFrameOfReference(z);
            this.needsCoordinatesUpdate = true;
        }
        setPlacedUnderMotionFrameOfReference(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo9742placeAtf8xVGno(long j2, float f2, l<? super GraphicsLayerScope, ab> lVar) throws Throwable {
        m10018placeSelfMLgxB_4(j2, f2, lVar, null);
    }
}
