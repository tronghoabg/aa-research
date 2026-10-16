package androidx.compose.ui.node;

import android.os.Trace;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.tooling.ComposeToolingFlags;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.unit.Constraints;
import h.ab;
import h.g.a.a;
import h.g.b.x;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MeasureAndLayoutDelegate {
    public static final int $stable = 8;
    private final LayoutTreeConsistencyChecker consistencyChecker;
    private boolean duringFullMeasureLayoutPass;
    private boolean duringMeasureLayout;
    private long measureIteration;
    private final MutableVector<Owner.OnLayoutCompletedListener> onLayoutCompletedListeners;
    private final OnPositionedDispatcher onPositionedDispatcher;
    private final MutableVector<PostponedRequest> postponedMeasureRequests;
    private final DepthSortedSetsForDifferentPasses relayoutNodes;
    private final LayoutNode root;
    private Constraints rootConstraints;
    private RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler;

    /* compiled from: WazeSource */
    public final class PostponedRequest {
        public static final int $stable = 8;
        private final boolean isForced;
        private final boolean isLookahead;
        private final LayoutNode node;

        public PostponedRequest(LayoutNode layoutNode, boolean z, boolean z2) {
            this.node = layoutNode;
            this.isLookahead = z;
            this.isForced = z2;
        }

        public final LayoutNode getNode() {
            return this.node;
        }

        public final boolean isForced() {
            return this.isForced;
        }

        public final boolean isLookahead() {
            return this.isLookahead;
        }
    }

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MeasureAndLayoutDelegate(LayoutNode layoutNode) {
        this.root = layoutNode;
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = new DepthSortedSetsForDifferentPasses(Owner.Companion.getEnableExtraAssertions());
        this.relayoutNodes = depthSortedSetsForDifferentPasses;
        this.onPositionedDispatcher = new OnPositionedDispatcher();
        this.onLayoutCompletedListeners = new MutableVector<>(new Owner.OnLayoutCompletedListener[16], 0);
        this.measureIteration = 1L;
        MutableVector<PostponedRequest> mutableVector = new MutableVector<>(new PostponedRequest[16], 0);
        this.postponedMeasureRequests = mutableVector;
        this.consistencyChecker = Owner.Companion.getEnableExtraAssertions() ? new LayoutTreeConsistencyChecker(layoutNode, depthSortedSetsForDifferentPasses, mutableVector.asMutableList()) : null;
    }

    private final void callOnLayoutCompletedListeners() {
        MutableVector<Owner.OnLayoutCompletedListener> mutableVector = this.onLayoutCompletedListeners;
        Owner.OnLayoutCompletedListener[] onLayoutCompletedListenerArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            onLayoutCompletedListenerArr[i2].onLayoutComplete();
        }
        this.onLayoutCompletedListeners.clear();
    }

    /* renamed from: doLookaheadRemeasure-sdFAvZA, reason: not valid java name */
    private final boolean m10012doLookaheadRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        if (layoutNode.getLookaheadRoot$ui() == null) {
            return false;
        }
        boolean zM9979lookaheadRemeasure_Sx5XlM$ui = constraints != null ? layoutNode.m9979lookaheadRemeasure_Sx5XlM$ui(constraints) : LayoutNode.m9974lookaheadRemeasure_Sx5XlM$ui$default(layoutNode, null, 1, null);
        LayoutNode parent$ui = layoutNode.getParent$ui();
        if (zM9979lookaheadRemeasure_Sx5XlM$ui && parent$ui != null) {
            if (parent$ui.getLookaheadRoot$ui() == null) {
                LayoutNode.requestRemeasure$ui$default(parent$ui, false, false, false, 3, null);
                return zM9979lookaheadRemeasure_Sx5XlM$ui;
            }
            if (layoutNode.getMeasuredByParentInLookahead$ui() == LayoutNode.UsageByParent.InMeasureBlock) {
                LayoutNode.requestLookaheadRemeasure$ui$default(parent$ui, false, false, false, 3, null);
                return zM9979lookaheadRemeasure_Sx5XlM$ui;
            }
            if (layoutNode.getMeasuredByParentInLookahead$ui() == LayoutNode.UsageByParent.InLayoutBlock) {
                parent$ui.requestLookaheadRelayout$ui(1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)));
                return true;
            }
        }
        return zM9979lookaheadRemeasure_Sx5XlM$ui;
    }

    /* renamed from: doRemeasure-sdFAvZA, reason: not valid java name */
    private final boolean m10013doRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        boolean zM9980remeasure_Sx5XlM$ui = constraints != null ? layoutNode.m9980remeasure_Sx5XlM$ui(constraints) : LayoutNode.m9975remeasure_Sx5XlM$ui$default(layoutNode, null, 1, null);
        LayoutNode parent$ui = layoutNode.getParent$ui();
        if (zM9980remeasure_Sx5XlM$ui && parent$ui != null) {
            if (layoutNode.getMeasuredByParent$ui() == LayoutNode.UsageByParent.InMeasureBlock) {
                LayoutNode.requestRemeasure$ui$default(parent$ui, false, false, false, 3, null);
                return zM9980remeasure_Sx5XlM$ui;
            }
            if (layoutNode.getMeasuredByParent$ui() == LayoutNode.UsageByParent.InLayoutBlock) {
                LayoutNode.requestRelayout$ui$default(parent$ui, false, 1, null);
                return true;
            }
        }
        return zM9980remeasure_Sx5XlM$ui;
    }

    private final void drainPostponedMeasureRequests() {
        if (this.postponedMeasureRequests.getSize() != 0) {
            MutableVector<PostponedRequest> mutableVector = this.postponedMeasureRequests;
            PostponedRequest[] postponedRequestArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                PostponedRequest postponedRequest = postponedRequestArr[i2];
                if (postponedRequest.getNode().isAttached()) {
                    if (postponedRequest.isLookahead()) {
                        LayoutNode.requestLookaheadRemeasure$ui$default(postponedRequest.getNode(), postponedRequest.isForced(), false, false, 2, null);
                    } else {
                        LayoutNode.requestRemeasure$ui$default(postponedRequest.getNode(), postponedRequest.isForced(), false, false, 2, null);
                    }
                }
            }
            this.postponedMeasureRequests.clear();
        }
    }

    private final void ensureSubtreeLookaheadReplaced(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutNode layoutNode2 = layoutNodeArr[i2];
            if (x.n(layoutNode2.isPlacedInLookahead(), true) && !layoutNode2.isDeactivated()) {
                if (this.relayoutNodes.contains(layoutNode2, true)) {
                    layoutNode2.lookaheadReplace$ui();
                }
                ensureSubtreeLookaheadReplaced(layoutNode2);
            }
        }
    }

    private final void forceMeasureTheSubtreeInternal(LayoutNode layoutNode, boolean z) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutNode layoutNode2 = layoutNodeArr[i2];
            if ((!z && getRemeasureCanAffectParentSize(layoutNode2)) || (z && getLookaheadRemeasureCanAffectParentSize(layoutNode2))) {
                if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode2) && !z) {
                    if (layoutNode2.getLookaheadMeasurePending$ui() && this.relayoutNodes.contains(layoutNode2, true)) {
                        remeasureIfNeeded$default(this, layoutNode2, true, false, 4, null);
                    } else {
                        forceMeasureTheSubtree(layoutNode2, true);
                    }
                }
                onlyRemeasureIfPending(layoutNode2, z);
                if (!measurePending(layoutNode2, z)) {
                    forceMeasureTheSubtreeInternal(layoutNode2, z);
                }
            }
        }
        onlyRemeasureIfPending(layoutNode, z);
    }

    private final boolean getCanAffectParentInLookahead(LayoutNode layoutNode) {
        AlignmentLines alignmentLines;
        if (!layoutNode.getLookaheadMeasurePending$ui()) {
            return false;
        }
        if (layoutNode.getMeasuredByParentInLookahead$ui() != LayoutNode.UsageByParent.NotUsed) {
            return true;
        }
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui = layoutNode.getLayoutDelegate$ui().getLookaheadAlignmentLinesOwner$ui();
        return (lookaheadAlignmentLinesOwner$ui == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui.getAlignmentLines()) == null || !alignmentLines.getRequired$ui()) ? false : true;
    }

    private final boolean getCanAffectPlacedParent(LayoutNode layoutNode) {
        return layoutNode.getMeasurePending$ui() && getMeasuredByPlacedParent(layoutNode);
    }

    private final boolean getLookaheadRemeasureCanAffectParentSize(LayoutNode layoutNode) {
        AlignmentLines alignmentLines;
        if (layoutNode.getMeasuredByParentInLookahead$ui() == LayoutNode.UsageByParent.InMeasureBlock) {
            return true;
        }
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui = layoutNode.getLayoutDelegate$ui().getLookaheadAlignmentLinesOwner$ui();
        return (lookaheadAlignmentLinesOwner$ui == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui.getAlignmentLines()) == null || !alignmentLines.getRequired$ui()) ? false : true;
    }

    private final boolean getMeasuredByPlacedParent(LayoutNode layoutNode) {
        do {
            if (layoutNode.getMeasuredByParent$ui() == LayoutNode.UsageByParent.NotUsed && !layoutNode.getLayoutDelegate$ui().getAlignmentLinesOwner$ui().getAlignmentLines().getRequired$ui()) {
                LayoutNode parent$ui = layoutNode.getParent$ui();
                if ((parent$ui != null ? parent$ui.getLayoutState$ui() : null) != LayoutNode.LayoutState.Measuring) {
                    return false;
                }
            }
            layoutNode = layoutNode.getParent$ui();
            if (layoutNode == null) {
                return false;
            }
        } while (!layoutNode.isPlaced());
        return true;
    }

    private final boolean getRemeasureCanAffectParentSize(LayoutNode layoutNode) {
        return layoutNode.getMeasuredByParent$ui() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode.getLayoutDelegate$ui().getAlignmentLinesOwner$ui().getAlignmentLines().getRequired$ui();
    }

    private final boolean isUsedInMeasureOrLayout(LayoutNode layoutNode) {
        return layoutNode.isPlaced() || layoutNode.isPlacedByParent() || getCanAffectPlacedParent(layoutNode) || x.n(layoutNode.isPlacedInLookahead(), true) || getCanAffectParentInLookahead(layoutNode) || layoutNode.getAlignmentLinesRequired$ui();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean measureAndLayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, a aVar, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            aVar = null;
        }
        return measureAndLayoutDelegate.measureAndLayout(aVar);
    }

    private final boolean measurePending(LayoutNode layoutNode, boolean z) {
        return z ? layoutNode.getLookaheadMeasurePending$ui() : layoutNode.getMeasurePending$ui();
    }

    private final void onlyRemeasureIfPending(LayoutNode layoutNode, boolean z) {
        if (measurePending(layoutNode, z)) {
            remeasureIfNeeded$default(this, layoutNode, z, false, 4, null);
        }
    }

    private final void performMeasureAndLayout(boolean z, a<ab> aVar) {
        if (!this.root.isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.isPlaced()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = z;
            try {
                aVar.invoke();
            } catch (Throwable th) {
                try {
                    RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler = this.uncaughtExceptionHandler;
                    if (uncaughtExceptionHandler == null) {
                        throw th;
                    }
                    uncaughtExceptionHandler.onUncaughtException(th);
                } finally {
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                }
            }
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean remeasureAndRelayoutIfNeeded(LayoutNode layoutNode, boolean z) {
        Constraints constraints;
        boolean zM10013doRemeasuresdFAvZA;
        LayoutNode parent$ui;
        boolean zM10012doLookaheadRemeasuresdFAvZA = false;
        if (layoutNode.isDeactivated()) {
            return false;
        }
        if (isUsedInMeasureOrLayout(layoutNode)) {
            if (layoutNode == this.root) {
                constraints = this.rootConstraints;
                if (constraints == null) {
                    x.g();
                }
            } else {
                constraints = null;
            }
            if (z) {
                if (layoutNode.getLookaheadMeasurePending$ui()) {
                    if (ComposeToolingFlags.isVerboseTracingEnabled) {
                        Trace.beginSection("Compose:lookaheadMeasure");
                        try {
                            zM10012doLookaheadRemeasuresdFAvZA = m10012doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
                            Trace.endSection();
                        } finally {
                        }
                    } else {
                        zM10012doLookaheadRemeasuresdFAvZA = m10012doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
                    }
                }
                if ((zM10012doLookaheadRemeasuresdFAvZA || layoutNode.getLookaheadLayoutPending$ui()) && x.n(layoutNode.isPlacedInLookahead(), true)) {
                    if (ComposeToolingFlags.isVerboseTracingEnabled) {
                        Trace.beginSection("Compose:lookaheadLayout");
                        try {
                            layoutNode.lookaheadReplace$ui();
                        } finally {
                        }
                    } else {
                        layoutNode.lookaheadReplace$ui();
                    }
                }
            } else {
                if (!layoutNode.getMeasurePending$ui()) {
                    zM10013doRemeasuresdFAvZA = false;
                } else if (ComposeToolingFlags.isVerboseTracingEnabled) {
                    Trace.beginSection("Compose:measure");
                    try {
                        zM10013doRemeasuresdFAvZA = m10013doRemeasuresdFAvZA(layoutNode, constraints);
                        Trace.endSection();
                    } finally {
                    }
                } else {
                    zM10013doRemeasuresdFAvZA = m10013doRemeasuresdFAvZA(layoutNode, constraints);
                }
                if (layoutNode.getLayoutPending$ui() && (layoutNode == this.root || ((parent$ui = layoutNode.getParent$ui()) != null && parent$ui.isPlaced() && layoutNode.isPlacedByParent()))) {
                    if (ComposeToolingFlags.isVerboseTracingEnabled) {
                        Trace.beginSection("Compose:layout");
                        try {
                            if (layoutNode == this.root) {
                                layoutNode.place$ui(0, 0);
                            } else {
                                layoutNode.replace$ui();
                            }
                            Trace.endSection();
                        } finally {
                        }
                    } else if (layoutNode == this.root) {
                        layoutNode.place$ui(0, 0);
                    } else {
                        layoutNode.replace$ui();
                    }
                    this.onPositionedDispatcher.onNodePositioned(layoutNode);
                    LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                    if (layoutTreeConsistencyChecker != null) {
                        layoutTreeConsistencyChecker.assertConsistent();
                    }
                }
                zM10012doLookaheadRemeasuresdFAvZA = zM10013doRemeasuresdFAvZA;
            }
            drainPostponedMeasureRequests();
        }
        return zM10012doLookaheadRemeasuresdFAvZA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean remeasureIfNeeded(LayoutNode layoutNode, boolean z, boolean z2) {
        Constraints constraints;
        boolean zM10013doRemeasuresdFAvZA = false;
        if (layoutNode.isDeactivated()) {
            return false;
        }
        if (isUsedInMeasureOrLayout(layoutNode)) {
            if (layoutNode == this.root) {
                constraints = this.rootConstraints;
                if (constraints == null) {
                    x.g();
                }
            } else {
                constraints = null;
            }
            if (z) {
                if (layoutNode.getLookaheadMeasurePending$ui()) {
                    if (ComposeToolingFlags.isVerboseTracingEnabled && z2) {
                        Trace.beginSection("Compose:lookaheadMeasure");
                        try {
                            zM10013doRemeasuresdFAvZA = m10012doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
                        } finally {
                        }
                    } else {
                        zM10013doRemeasuresdFAvZA = m10012doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
                    }
                }
            } else if (layoutNode.getMeasurePending$ui()) {
                if (ComposeToolingFlags.isVerboseTracingEnabled && z2) {
                    Trace.beginSection("Compose:measure");
                    try {
                        zM10013doRemeasuresdFAvZA = m10013doRemeasuresdFAvZA(layoutNode, constraints);
                        Trace.endSection();
                    } finally {
                    }
                } else {
                    zM10013doRemeasuresdFAvZA = m10013doRemeasuresdFAvZA(layoutNode, constraints);
                }
            }
            drainPostponedMeasureRequests();
        }
        return zM10013doRemeasuresdFAvZA;
    }

    static /* synthetic */ boolean remeasureIfNeeded$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, boolean z2, int i2, Object obj) {
        return measureAndLayoutDelegate.remeasureIfNeeded(layoutNode, z | (!((i2 & 2) == 0)), z2 & ((i2 & 4) == 0));
    }

    private final void remeasureLookaheadRootsInSubtree(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutNode layoutNode2 = layoutNodeArr[i2];
            if (getRemeasureCanAffectParentSize(layoutNode2)) {
                if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode2)) {
                    remeasureOnly(layoutNode2, true);
                } else {
                    remeasureLookaheadRootsInSubtree(layoutNode2);
                }
            }
        }
    }

    private final void remeasureOnly(LayoutNode layoutNode, boolean z) {
        Constraints constraints;
        if (layoutNode.isDeactivated()) {
            return;
        }
        if (layoutNode == this.root) {
            constraints = this.rootConstraints;
            if (constraints == null) {
                x.g();
            }
        } else {
            constraints = null;
        }
        if (z) {
            m10012doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
        } else {
            m10013doRemeasuresdFAvZA(layoutNode, constraints);
        }
    }

    public final void dispatchOnPositionedCallbacks(boolean z) {
        if (z) {
            this.onPositionedDispatcher.onRootNodePositioned(this.root);
        }
        if (this.onPositionedDispatcher.isNotEmpty()) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                this.onPositionedDispatcher.dispatch();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void forceMeasureTheSubtree(LayoutNode layoutNode, boolean z) {
        if (!this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalStateException("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (measurePending(layoutNode, z)) {
            InlineClassHelperKt.throwIllegalArgumentException("node not yet measured");
        }
        forceMeasureTheSubtreeInternal(layoutNode, z);
    }

    public final boolean getDuringMeasureLayout$ui() {
        return this.duringMeasureLayout;
    }

    public final boolean getHasPendingMeasureOrLayout() {
        return this.relayoutNodes.isNotEmpty();
    }

    public final boolean getHasPendingOnPositionedCallbacks() {
        return this.onPositionedDispatcher.isNotEmpty();
    }

    public final long getMeasureIteration() {
        if (!this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalArgumentException("measureIteration should be only used during the measure/layout pass");
        }
        return this.measureIteration;
    }

    public final RootForTest.UncaughtExceptionHandler getUncaughtExceptionHandler$ui() {
        return this.uncaughtExceptionHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean measureAndLayout(h.g.a.a<h.ab> r9) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.MeasureAndLayoutDelegate.measureAndLayout(h.g.a.a):boolean");
    }

    /* renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    public final void m10014measureAndLayout0kLqBqw(LayoutNode layoutNode, long j2) {
        if (layoutNode.isDeactivated()) {
            return;
        }
        if (x.n(layoutNode, this.root)) {
            InlineClassHelperKt.throwIllegalArgumentException("measureAndLayout called on root");
        }
        if (!this.root.isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.isPlaced()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = false;
            try {
                this.relayoutNodes.remove(layoutNode);
                if ((m10012doLookaheadRemeasuresdFAvZA(layoutNode, Constraints.m11094boximpl(j2)) || layoutNode.getLookaheadLayoutPending$ui()) && x.n(layoutNode.isPlacedInLookahead(), true)) {
                    layoutNode.lookaheadReplace$ui();
                }
                ensureSubtreeLookaheadReplaced(layoutNode);
                m10013doRemeasuresdFAvZA(layoutNode, Constraints.m11094boximpl(j2));
                if (layoutNode.getLayoutPending$ui() && layoutNode.isPlaced()) {
                    layoutNode.replace$ui();
                    this.onPositionedDispatcher.onNodePositioned(layoutNode);
                }
                drainPostponedMeasureRequests();
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
            } catch (Throwable th) {
                try {
                    RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler = this.uncaughtExceptionHandler;
                    if (uncaughtExceptionHandler == null) {
                        throw th;
                    }
                    uncaughtExceptionHandler.onUncaughtException(th);
                } finally {
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                }
            }
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        }
        callOnLayoutCompletedListeners();
    }

    public final void measureOnly() {
        if (this.relayoutNodes.isNotEmpty()) {
            if (!this.root.isAttached()) {
                InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
            }
            if (!this.root.isPlaced()) {
                InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
            }
            if (this.duringMeasureLayout) {
                InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
            }
            if (this.rootConstraints != null) {
                this.duringMeasureLayout = true;
                this.duringFullMeasureLayoutPass = false;
                try {
                    if (ComposeToolingFlags.isVerboseTracingEnabled) {
                        Trace.beginSection("Compose:lookaheadRemeasure");
                        try {
                            if (this.relayoutNodes.getAffectsLookaheadMeasure()) {
                                LayoutNode lookaheadRoot$ui = this.root.getLookaheadRoot$ui();
                                LayoutNode layoutNode = this.root;
                                if (lookaheadRoot$ui != null) {
                                    remeasureOnly(layoutNode, true);
                                } else {
                                    remeasureLookaheadRootsInSubtree(layoutNode);
                                }
                            }
                            Trace.endSection();
                        } finally {
                        }
                    } else if (this.relayoutNodes.getAffectsLookaheadMeasure()) {
                        LayoutNode lookaheadRoot$ui2 = this.root.getLookaheadRoot$ui();
                        LayoutNode layoutNode2 = this.root;
                        if (lookaheadRoot$ui2 != null) {
                            remeasureOnly(layoutNode2, true);
                        } else {
                            remeasureLookaheadRootsInSubtree(layoutNode2);
                        }
                    }
                    if (ComposeToolingFlags.isVerboseTracingEnabled) {
                        Trace.beginSection("Compose:remeasure");
                        try {
                            remeasureOnly(this.root, false);
                            Trace.endSection();
                        } finally {
                        }
                    } else {
                        remeasureOnly(this.root, false);
                    }
                } catch (Throwable th) {
                    try {
                        RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler = this.uncaughtExceptionHandler;
                        if (uncaughtExceptionHandler == null) {
                            throw th;
                        }
                        uncaughtExceptionHandler.onUncaughtException(th);
                    } finally {
                        this.duringMeasureLayout = false;
                        this.duringFullMeasureLayoutPass = false;
                    }
                }
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            }
        }
    }

    public final void onNodeDetached(LayoutNode layoutNode) {
        this.relayoutNodes.remove(layoutNode);
        this.onPositionedDispatcher.remove(layoutNode);
    }

    public final void registerOnLayoutCompletedListener(Owner.OnLayoutCompletedListener onLayoutCompletedListener) {
        this.onLayoutCompletedListeners.add(onLayoutCompletedListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestLookaheadRelayout(androidx.compose.ui.node.LayoutNode r5, boolean r6) {
        /*
            r4 = this;
            androidx.compose.ui.node.LayoutNode$LayoutState r0 = r5.getLayoutState$ui()
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.ui.node.LayoutNode.LayoutState.Measuring
            int r0 = r0.ordinal()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 == r2) goto L20
            r3 = 2
            if (r0 == r3) goto L28
            r3 = 3
            if (r0 == r3) goto L20
            r3 = 4
            if (r0 != r3) goto L1a
            goto L28
        L1a:
            h.i r4 = new h.i
            r4.<init>()
            throw r4
        L20:
            androidx.compose.ui.node.LayoutTreeConsistencyChecker r4 = r4.consistencyChecker
            if (r4 == 0) goto L99
            r4.assertConsistent()
            return r1
        L28:
            boolean r0 = r5.getLookaheadMeasurePending$ui()
            if (r0 != 0) goto L34
            boolean r0 = r5.getLookaheadLayoutPending$ui()
            if (r0 == 0) goto L3e
        L34:
            if (r6 != 0) goto L3e
            androidx.compose.ui.node.LayoutTreeConsistencyChecker r4 = r4.consistencyChecker
            if (r4 == 0) goto L99
            r4.assertConsistent()
            return r1
        L3e:
            r5.markLookaheadLayoutPending$ui()
            r5.markLayoutPending$ui()
            boolean r6 = r5.isDeactivated()
            if (r6 != 0) goto L99
            androidx.compose.ui.node.LayoutNode r6 = r5.getParent$ui()
            java.lang.Boolean r0 = r5.isPlacedInLookahead()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            boolean r0 = h.g.b.x.n(r0, r3)
            if (r0 == 0) goto L76
            if (r6 == 0) goto L65
            boolean r0 = r6.getLookaheadMeasurePending$ui()
            if (r0 != r2) goto L65
            goto L76
        L65:
            if (r6 == 0) goto L6e
            boolean r0 = r6.getLookaheadLayoutPending$ui()
            if (r0 != r2) goto L6e
            goto L76
        L6e:
            androidx.compose.ui.node.DepthSortedSetsForDifferentPasses r6 = r4.relayoutNodes
            androidx.compose.ui.node.Invalidation r0 = androidx.compose.ui.node.Invalidation.LookaheadPlacement
            r6.add(r5, r0)
            goto L94
        L76:
            boolean r0 = r5.isPlaced()
            if (r0 == 0) goto L94
            if (r6 == 0) goto L85
            boolean r0 = r6.getLayoutPending$ui()
            if (r0 != r2) goto L85
            goto L94
        L85:
            if (r6 == 0) goto L8d
            boolean r6 = r6.getMeasurePending$ui()
            if (r6 == r2) goto L94
        L8d:
            androidx.compose.ui.node.DepthSortedSetsForDifferentPasses r6 = r4.relayoutNodes
            androidx.compose.ui.node.Invalidation r0 = androidx.compose.ui.node.Invalidation.Placement
            r6.add(r5, r0)
        L94:
            boolean r4 = r4.duringFullMeasureLayoutPass
            if (r4 != 0) goto L99
            return r2
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.MeasureAndLayoutDelegate.requestLookaheadRelayout(androidx.compose.ui.node.LayoutNode, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestLookaheadRemeasure(androidx.compose.ui.node.LayoutNode r5, boolean r6) {
        /*
            r4 = this;
            androidx.compose.ui.node.LayoutNode r0 = r5.getLookaheadRoot$ui()
            if (r0 != 0) goto Lb
            java.lang.String r0 = "Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope"
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException(r0)
        Lb:
            androidx.compose.ui.node.LayoutNode$LayoutState r0 = r5.getLayoutState$ui()
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.ui.node.LayoutNode.LayoutState.Measuring
            int r0 = r0.ordinal()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8b
            if (r0 == r2) goto L9c
            r3 = 2
            if (r0 == r3) goto L8b
            r3 = 3
            if (r0 == r3) goto L8b
            r3 = 4
            if (r0 != r3) goto L85
            boolean r0 = r5.getLookaheadMeasurePending$ui()
            if (r0 == 0) goto L2c
            if (r6 == 0) goto L9c
        L2c:
            r5.markLookaheadMeasurePending$ui()
            r5.markMeasurePending$ui()
            boolean r6 = r5.isDeactivated()
            if (r6 == 0) goto L39
            goto L9c
        L39:
            java.lang.Boolean r6 = r5.isPlacedInLookahead()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r6 = h.g.b.x.n(r6, r0)
            if (r6 != 0) goto L4d
            boolean r6 = r4.getCanAffectParentInLookahead(r5)
            if (r6 == 0) goto L59
        L4d:
            androidx.compose.ui.node.LayoutNode r6 = r5.getParent$ui()
            if (r6 == 0) goto L79
            boolean r6 = r6.getLookaheadMeasurePending$ui()
            if (r6 != r2) goto L79
        L59:
            boolean r6 = r5.isPlaced()
            if (r6 != 0) goto L65
            boolean r6 = r4.getCanAffectPlacedParent(r5)
            if (r6 == 0) goto L80
        L65:
            androidx.compose.ui.node.LayoutNode r6 = r5.getParent$ui()
            if (r6 == 0) goto L71
            boolean r6 = r6.getMeasurePending$ui()
            if (r6 == r2) goto L80
        L71:
            androidx.compose.ui.node.DepthSortedSetsForDifferentPasses r6 = r4.relayoutNodes
            androidx.compose.ui.node.Invalidation r0 = androidx.compose.ui.node.Invalidation.Measurement
            r6.add(r5, r0)
            goto L80
        L79:
            androidx.compose.ui.node.DepthSortedSetsForDifferentPasses r6 = r4.relayoutNodes
            androidx.compose.ui.node.Invalidation r0 = androidx.compose.ui.node.Invalidation.LookaheadMeasurement
            r6.add(r5, r0)
        L80:
            boolean r4 = r4.duringFullMeasureLayoutPass
            if (r4 != 0) goto L9c
            return r2
        L85:
            h.i r4 = new h.i
            r4.<init>()
            throw r4
        L8b:
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.MeasureAndLayoutDelegate$PostponedRequest> r0 = r4.postponedMeasureRequests
            androidx.compose.ui.node.MeasureAndLayoutDelegate$PostponedRequest r3 = new androidx.compose.ui.node.MeasureAndLayoutDelegate$PostponedRequest
            r3.<init>(r5, r2, r6)
            r0.add(r3)
            androidx.compose.ui.node.LayoutTreeConsistencyChecker r4 = r4.consistencyChecker
            if (r4 == 0) goto L9c
            r4.assertConsistent()
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.MeasureAndLayoutDelegate.requestLookaheadRemeasure(androidx.compose.ui.node.LayoutNode, boolean):boolean");
    }

    public final void requestOnPositionedCallback(LayoutNode layoutNode) {
        this.onPositionedDispatcher.onNodePositioned(layoutNode);
    }

    public final boolean requestRelayout(LayoutNode layoutNode, boolean z) {
        LayoutNode.LayoutState layoutState$ui = layoutNode.getLayoutState$ui();
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Measuring;
        int iOrdinal = layoutState$ui.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        } else {
            if (iOrdinal != 4) {
                throw new i();
            }
            LayoutNode parent$ui = layoutNode.getParent$ui();
            boolean z2 = parent$ui == null || parent$ui.isPlaced();
            if (z || !(layoutNode.getMeasurePending$ui() || (layoutNode.getLayoutPending$ui() && layoutNode.isPlaced() == z2 && layoutNode.isPlaced() == layoutNode.isPlacedByParent()))) {
                layoutNode.markLayoutPending$ui();
                if (!layoutNode.isDeactivated() && layoutNode.isPlacedByParent() && z2) {
                    if ((parent$ui == null || !parent$ui.getLayoutPending$ui()) && (parent$ui == null || !parent$ui.getMeasurePending$ui())) {
                        this.relayoutNodes.add(layoutNode, Invalidation.Placement);
                    }
                    if (!this.duringFullMeasureLayoutPass) {
                        return true;
                    }
                }
            } else {
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
                if (layoutTreeConsistencyChecker2 != null) {
                    layoutTreeConsistencyChecker2.assertConsistent();
                    return false;
                }
            }
        }
        return false;
    }

    public final boolean requestRemeasure(LayoutNode layoutNode, boolean z) {
        LayoutNode.LayoutState layoutState$ui = layoutNode.getLayoutState$ui();
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Measuring;
        int iOrdinal = layoutState$ui.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.postponedMeasureRequests.add(new PostponedRequest(layoutNode, false, z));
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } else {
                if (iOrdinal != 4) {
                    throw new i();
                }
                if (!layoutNode.getMeasurePending$ui() || z) {
                    layoutNode.markMeasurePending$ui();
                    if (!layoutNode.isDeactivated() && (layoutNode.isPlaced() || getCanAffectPlacedParent(layoutNode))) {
                        LayoutNode parent$ui = layoutNode.getParent$ui();
                        if (parent$ui == null || !parent$ui.getMeasurePending$ui()) {
                            this.relayoutNodes.add(layoutNode, Invalidation.Measurement);
                        }
                        if (!this.duringFullMeasureLayoutPass) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void setDuringMeasureLayout$ui(boolean z) {
        this.duringMeasureLayout = z;
    }

    public final void setUncaughtExceptionHandler$ui(RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.uncaughtExceptionHandler = uncaughtExceptionHandler;
    }

    /* renamed from: updateRootConstraints-BRTryo0, reason: not valid java name */
    public final void m10015updateRootConstraintsBRTryo0(long j2) {
        Constraints constraints = this.rootConstraints;
        if (constraints != null && Constraints.m11100equalsimpl0(constraints.m11113unboximpl(), j2)) {
            return;
        }
        if (this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalArgumentException("updateRootConstraints called while measuring");
        }
        this.rootConstraints = Constraints.m11094boximpl(j2);
        if (this.root.isAttached()) {
            if (this.root.getLookaheadRoot$ui() != null) {
                this.root.markLookaheadMeasurePending$ui();
            }
            this.root.markMeasurePending$ui();
            DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.relayoutNodes;
            LayoutNode layoutNode = this.root;
            depthSortedSetsForDifferentPasses.add(layoutNode, layoutNode.getLookaheadRoot$ui() != null ? Invalidation.LookaheadMeasurement : Invalidation.Measurement);
        }
    }
}
