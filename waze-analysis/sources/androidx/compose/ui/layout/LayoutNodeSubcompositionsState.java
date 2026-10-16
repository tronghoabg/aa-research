package androidx.compose.ui.layout;

import androidx.collection.IntSetKt;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PausableComposition;
import androidx.compose.runtime.PausedComposition;
import androidx.compose.runtime.ReusableComposition;
import androidx.compose.runtime.ShouldPauseCallback;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.LookaheadPassDelegate;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.OutOfFrameExecutor;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.SubcompositionKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.FontScaling;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.a.ac;
import h.ab;
import h.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import h.g.b.y;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LayoutNodeSubcompositionsState implements ComposeNodeLifecycleCallback {
    public static final int $stable = 8;
    private CompositionContext compositionContext;
    private int currentApproachIndex;
    private int currentIndex;
    private int precomposedCount;
    private int reusableCount;
    private final LayoutNode root;
    private SubcomposeSlotReusePolicy slotReusePolicy;
    private final MutableScatterMap<LayoutNode, NodeState> nodeToNodeState = ScatterMapKt.mutableScatterMapOf();
    private final MutableScatterMap<Object, LayoutNode> slotIdToNode = ScatterMapKt.mutableScatterMapOf();
    private final Scope scope = new Scope();
    private final ApproachMeasureScopeImpl approachMeasureScope = new ApproachMeasureScopeImpl();
    private final MutableScatterMap<Object, LayoutNode> precomposeMap = ScatterMapKt.mutableScatterMapOf();
    private final SubcomposeSlotReusePolicy.SlotIdsSet reusableSlotIdsSet = new SubcomposeSlotReusePolicy.SlotIdsSet(null, 1, null);
    private final MutableScatterMap<Object, SubcomposeLayoutState.PrecomposedSlotHandle> approachPrecomposeSlotHandleMap = ScatterMapKt.mutableScatterMapOf();
    private final MutableVector<Object> slotIdsOfCompositionsNeededInApproach = new MutableVector<>(new Object[16], 0);
    private final String NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    public static /* synthetic */ boolean $r8$lambda$I9S4Oy4uvsJFCZpX9_LGbxS5mDc() {
        return false;
    }

    public LayoutNodeSubcompositionsState(LayoutNode layoutNode, SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.root = layoutNode;
        this.slotReusePolicy = subcomposeSlotReusePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPausedPrecomposition(NodeState nodeState, boolean z) {
        PausedComposition pausedComposition = nodeState.getPausedComposition();
        if (pausedComposition != null) {
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                LayoutNode layoutNode = this.root;
                layoutNode.ignoreRemeasureRequests = true;
                if (z) {
                    while (!pausedComposition.isComplete()) {
                        try {
                            pausedComposition.resume(new ShouldPauseCallback() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$$ExternalSyntheticLambda0
                                @Override // androidx.compose.runtime.ShouldPauseCallback
                                public final boolean shouldPause() {
                                    return false;
                                }
                            });
                        } catch (Throwable th) {
                            MutableIntList operations = nodeState.getOperations();
                            if (operations == null) {
                                throw th;
                            }
                            throw new SubcomposeLayoutPausableCompositionException(operations, nodeState.getSlotId(), th);
                        }
                    }
                }
                pausedComposition.apply();
                nodeState.setPausedComposition(null);
                layoutNode.ignoreRemeasureRequests = false;
            } finally {
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            }
        }
    }

    private static final boolean applyPausedPrecomposition$lambda$0$0$0() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Measurable> approachSubcompose(Object obj, p<? super Composer, ? super Integer, ab> pVar) {
        if (this.slotIdsOfCompositionsNeededInApproach.getSize() < this.currentApproachIndex) {
            InlineClassHelperKt.throwIllegalArgumentException("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        LayoutNode layoutNode = this.slotIdToNode.get(obj);
        int size = this.slotIdsOfCompositionsNeededInApproach.getSize();
        int i2 = this.currentApproachIndex;
        MutableVector<Object> mutableVector = this.slotIdsOfCompositionsNeededInApproach;
        if (size == i2) {
            mutableVector.add(obj);
        } else {
            mutableVector.set(i2, obj);
        }
        this.currentApproachIndex++;
        boolean zContains = this.precomposeMap.contains(obj);
        if (zContains || layoutNode != null) {
            if (!zContains) {
                move(this.root.getFoldedChildren$ui().indexOf(layoutNode), this.root.getFoldedChildren$ui().size(), 1);
                this.precomposedCount++;
                this.slotIdToNode.remove(obj);
                this.precomposeMap.set(obj, layoutNode);
                this.approachPrecomposeSlotHandleMap.set(obj, createPrecomposedSlotHandle(obj));
                if (this.root.isAttached()) {
                    makeSureStateIsConsistent();
                }
            }
            LayoutNode layoutNode2 = this.precomposeMap.get(obj);
            NodeState nodeState = layoutNode2 != null ? this.nodeToNodeState.get(layoutNode2) : null;
            if (nodeState != null && nodeState.getForceRecompose()) {
                subcompose(layoutNode2, obj, false, pVar);
            }
            if ((nodeState != null ? nodeState.getPausedComposition() : null) != null) {
                applyPausedPrecomposition(nodeState, true);
            }
        } else {
            this.approachPrecomposeSlotHandleMap.set(obj, precompose(obj, pVar));
        }
        LayoutNode layoutNode3 = this.precomposeMap.get(obj);
        if (layoutNode3 == null) {
            return ac.f47967a;
        }
        List<MeasurePassDelegate> childDelegates$ui = layoutNode3.getMeasurePassDelegate$ui().getChildDelegates$ui();
        int size2 = childDelegates$ui.size();
        for (int i3 = 0; i3 < size2; i3++) {
            childDelegates$ui.get(i3).markDetachedFromParentLookaheadPass$ui();
        }
        return childDelegates$ui;
    }

    private final void cancelPausedPrecomposition(NodeState nodeState) {
        PausedComposition pausedComposition = nodeState.getPausedComposition();
        if (pausedComposition != null) {
            pausedComposition.cancel();
            nodeState.setPausedComposition(null);
            ReusableComposition composition = nodeState.getComposition();
            if (composition != null) {
                composition.dispose();
            }
            nodeState.setComposition(null);
        }
    }

    private final MeasureResult createMeasureResult(final MeasureResult measureResult, final h.g.a.a<ab> aVar) {
        return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.createMeasureResult.1
            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return measureResult.getAlignmentLines();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return measureResult.getHeight();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public l<RulerScope, ab> getRulers() {
                return measureResult.getRulers();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return measureResult.getWidth();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                aVar.invoke();
            }
        };
    }

    private final LayoutNode createNodeAt(int i2) {
        LayoutNode layoutNode = new LayoutNode(true, 0, 2, null);
        LayoutNode layoutNode2 = this.root;
        layoutNode2.ignoreRemeasureRequests = true;
        this.root.insertAt$ui(i2, layoutNode);
        layoutNode2.ignoreRemeasureRequests = false;
        return layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SubcomposeLayoutState.PrecomposedSlotHandle createPrecomposedSlotHandle(final Object obj) {
        return !this.root.isAttached() ? new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.createPrecomposedSlotHandle.1
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public /* synthetic */ int getPlaceablesCount() {
                return 0;
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            /* renamed from: getSize-YEO4UFw, reason: not valid java name */
            public /* synthetic */ long mo9773getSizeYEO4UFw(int i2) {
                return IntSize.Companion.m11344getZeroYbymL2g();
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void dispose() {
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            /* renamed from: premeasure-0kLqBqw, reason: not valid java name */
            public /* synthetic */ void mo9774premeasure0kLqBqw(int i2, long j2) {
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public /* synthetic */ void traverseDescendants(Object obj2, l lVar) {
            }
        } : new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.createPrecomposedSlotHandle.2
            private final MutableIntSet hasPremeasured = IntSetKt.mutableIntSetOf();

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void dispose() {
                LayoutNodeSubcompositionsState.this.disposePrecomposedSlot(obj);
            }

            public final MutableIntSet getHasPremeasured() {
                return this.hasPremeasured;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public int getPlaceablesCount() {
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.get(obj);
                if (layoutNode != null) {
                    return layoutNode.getChildren$ui().size();
                }
                return 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            /* renamed from: getSize-YEO4UFw */
            public long mo9773getSizeYEO4UFw(int i2) {
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.get(obj);
                if (layoutNode != null && layoutNode.isAttached()) {
                    int size = layoutNode.getChildren$ui().size();
                    if (i2 < 0 || i2 >= size) {
                        InlineClassHelperKt.throwIndexOutOfBoundsException("Index (" + i2 + ") is out of bound of [0, " + size + ')');
                    }
                    if (this.hasPremeasured.contains(i2)) {
                        int width = layoutNode.getChildren$ui().get(i2).getWidth();
                        return (layoutNode.getChildren$ui().get(i2).getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (width << 32);
                    }
                }
                return IntSize.Companion.m11344getZeroYbymL2g();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            /* renamed from: premeasure-0kLqBqw */
            public void mo9774premeasure0kLqBqw(int i2, long j2) {
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.get(obj);
                if (layoutNode == null || !layoutNode.isAttached()) {
                    return;
                }
                int size = layoutNode.getChildren$ui().size();
                if (i2 < 0 || i2 >= size) {
                    InlineClassHelperKt.throwIndexOutOfBoundsException("Index (" + i2 + ") is out of bound of [0, " + size + ')');
                }
                if (layoutNode.isPlaced()) {
                    InlineClassHelperKt.throwIllegalArgumentException("Pre-measure called on node that is not placed");
                }
                LayoutNode layoutNode2 = LayoutNodeSubcompositionsState.this.root;
                layoutNode2.ignoreRemeasureRequests = true;
                LayoutNodeKt.requireOwner(layoutNode).mo10134measureAndLayout0kLqBqw(layoutNode.getChildren$ui().get(i2), j2);
                layoutNode2.ignoreRemeasureRequests = false;
                this.hasPremeasured.add(i2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void traverseDescendants(Object obj2, l<? super TraversableNode, ? extends TraversableNode.Companion.TraverseDescendantsAction> lVar) {
                NodeChain nodes$ui;
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.get(obj);
                Modifier.Node head$ui = null;
                if (layoutNode != null && (nodes$ui = layoutNode.getNodes$ui()) != null) {
                    head$ui = nodes$ui.getHead$ui();
                }
                if (head$ui == null || !head$ui.isAttached()) {
                    return;
                }
                TraversableNodeKt.traverseDescendants(head$ui, obj2, lVar);
            }
        };
    }

    private final void deactivateOutOfFrame(NodeState nodeState, OutOfFrameExecutor outOfFrameExecutor) {
        outOfFrameExecutor.schedule(new C03771(nodeState));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void disposeCurrentNodes() {
        /*
            r17 = this;
            r0 = r17
            androidx.compose.ui.node.LayoutNode r1 = r0.root
            r2 = 1
            androidx.compose.ui.node.LayoutNode.access$setIgnoreRemeasureRequests$p(r1, r2)
            androidx.collection.MutableScatterMap<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState> r2 = r0.nodeToNodeState
            androidx.collection.ScatterMap r2 = (androidx.collection.ScatterMap) r2
            java.lang.Object[] r3 = r2.values
            long[] r2 = r2.metadata
            int r4 = r2.length
            int r4 = r4 + (-2)
            r5 = 0
            if (r4 < 0) goto L57
            r6 = r5
        L17:
            r7 = r2[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L52
            int r9 = r6 - r4
            r10 = r5
        L2a:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L50
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L4c
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r3[r11]
            androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState r11 = (androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState) r11
            androidx.compose.runtime.ReusableComposition r11 = r11.getComposition()
            if (r11 == 0) goto L4c
            r11.dispose()
        L4c:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L2a
        L50:
            if (r11 != r12) goto L57
        L52:
            if (r6 == r4) goto L57
            int r6 = r6 + 1
            goto L17
        L57:
            androidx.compose.ui.node.LayoutNode r2 = r0.root
            r2.removeAll$ui()
            androidx.compose.ui.node.LayoutNode.access$setIgnoreRemeasureRequests$p(r1, r5)
            androidx.collection.MutableScatterMap<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState> r1 = r0.nodeToNodeState
            r1.clear()
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.ui.node.LayoutNode> r1 = r0.slotIdToNode
            r1.clear()
            r0.precomposedCount = r5
            r0.reusableCount = r5
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.ui.node.LayoutNode> r1 = r0.precomposeMap
            r1.clear()
            r0.makeSureStateIsConsistent()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.disposeCurrentNodes():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disposePrecomposedSlot(Object obj) {
        makeSureStateIsConsistent();
        LayoutNode layoutNodeRemove = this.precomposeMap.remove(obj);
        if (layoutNodeRemove != null) {
            if (this.precomposedCount <= 0) {
                InlineClassHelperKt.throwIllegalStateException("No pre-composed items to dispose");
            }
            int iIndexOf = this.root.getFoldedChildren$ui().indexOf(layoutNodeRemove);
            if (iIndexOf < this.root.getFoldedChildren$ui().size() - this.precomposedCount) {
                InlineClassHelperKt.throwIllegalStateException("Item is not in pre-composed item range");
            }
            this.reusableCount++;
            this.precomposedCount--;
            NodeState nodeState = this.nodeToNodeState.get(layoutNodeRemove);
            if (nodeState != null) {
                cancelPausedPrecomposition(nodeState);
            }
            int size = (this.root.getFoldedChildren$ui().size() - this.precomposedCount) - this.reusableCount;
            move(iIndexOf, size, 1);
            disposeOrReuseStartingFromIndex(size);
        }
        if (this.slotIdsOfCompositionsNeededInApproach.contains(obj)) {
            LayoutNode.requestRemeasure$ui$default(this.root, true, false, false, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disposeUnusedSlotsInApproach() {
        int i2;
        MutableScatterMap<Object, SubcomposeLayoutState.PrecomposedSlotHandle> mutableScatterMap = this.approachPrecomposeSlotHandleMap;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i3 - length;
                int i5 = 0;
                while (true) {
                    i2 = 8 - ((~i4) >>> 31);
                    if (i5 >= i2) {
                        break;
                    }
                    if ((255 & j2) < 128) {
                        int i6 = (i3 << 3) + i5;
                        Object obj = mutableScatterMap.keys[i6];
                        SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = (SubcomposeLayoutState.PrecomposedSlotHandle) mutableScatterMap.values[i6];
                        int iIndexOf = this.slotIdsOfCompositionsNeededInApproach.indexOf(obj);
                        if (iIndexOf < 0 || iIndexOf >= this.currentApproachIndex) {
                            if (iIndexOf >= 0) {
                                this.slotIdsOfCompositionsNeededInApproach.set(iIndexOf, SubcomposeLayoutKt.UnspecifiedSlotId);
                            }
                            if (this.precomposeMap.contains(obj)) {
                                precomposedSlotHandle.dispose();
                            }
                            mutableScatterMap.removeValueAt(i6);
                        }
                    }
                    j2 >>= 8;
                    i5++;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    private final OutOfFrameExecutor getOutOfFrameExecutor() {
        return LayoutNodeKt.requireOwner(this.root).getOutOfFrameExecutor();
    }

    private final Object getSlotIdAtIndex(List<LayoutNode> list, int i2) {
        NodeState nodeState = this.nodeToNodeState.get(list.get(i2));
        if (nodeState == null) {
            x.g();
        }
        return nodeState.getSlotId();
    }

    private final <T> T ignoreRemeasureRequests(h.g.a.a<? extends T> aVar) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        T tInvoke = aVar.invoke();
        layoutNode.ignoreRemeasureRequests = false;
        return tInvoke;
    }

    private final void markActiveNodesAsReused(boolean z) {
        this.precomposedCount = 0;
        this.precomposeMap.clear();
        List<LayoutNode> foldedChildren$ui = this.root.getFoldedChildren$ui();
        int size = foldedChildren$ui.size();
        if (this.reusableCount != size) {
            this.reusableCount = size;
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    LayoutNode layoutNode = foldedChildren$ui.get(i2);
                    NodeState nodeState = this.nodeToNodeState.get(layoutNode);
                    if (nodeState != null && nodeState.getActive()) {
                        resetLayoutState(layoutNode);
                        reuseComposition(nodeState, z);
                        nodeState.setSlotId(SubcomposeLayoutKt.ReusedSlotId);
                    }
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            this.slotIdToNode.clear();
        }
        makeSureStateIsConsistent();
    }

    private final void move(int i2, int i3, int i4) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        this.root.move$ui(i2, i3, i4);
        layoutNode.ignoreRemeasureRequests = false;
    }

    static /* synthetic */ void move$default(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i4 = 1;
        }
        layoutNodeSubcompositionsState.move(i2, i3, i4);
    }

    private final void precompose(Object obj, p<? super Composer, ? super Integer, ab> pVar, boolean z) {
        if (this.root.isAttached()) {
            makeSureStateIsConsistent();
            if (this.slotIdToNode.containsKey(obj)) {
                return;
            }
            this.approachPrecomposeSlotHandleMap.remove(obj);
            MutableScatterMap<Object, LayoutNode> mutableScatterMap = this.precomposeMap;
            LayoutNode layoutNodeTakeNodeFromReusables = mutableScatterMap.get(obj);
            if (layoutNodeTakeNodeFromReusables == null) {
                layoutNodeTakeNodeFromReusables = takeNodeFromReusables(obj);
                LayoutNode layoutNode = this.root;
                if (layoutNodeTakeNodeFromReusables != null) {
                    move(layoutNode.getFoldedChildren$ui().indexOf(layoutNodeTakeNodeFromReusables), this.root.getFoldedChildren$ui().size(), 1);
                    this.precomposedCount++;
                } else {
                    layoutNodeTakeNodeFromReusables = createNodeAt(layoutNode.getFoldedChildren$ui().size());
                    this.precomposedCount++;
                }
                mutableScatterMap.set(obj, layoutNodeTakeNodeFromReusables);
            }
            subcompose(layoutNodeTakeNodeFromReusables, obj, z, pVar);
        }
    }

    private final void resetLayoutState(LayoutNode layoutNode) {
        layoutNode.getMeasurePassDelegate$ui().setMeasuredByParent$ui(LayoutNode.UsageByParent.NotUsed);
        LookaheadPassDelegate lookaheadPassDelegate$ui = layoutNode.getLookaheadPassDelegate$ui();
        if (lookaheadPassDelegate$ui != null) {
            lookaheadPassDelegate$ui.setMeasuredByParent$ui(LayoutNode.UsageByParent.NotUsed);
        }
    }

    private final void reuseComposition(NodeState nodeState, boolean z) {
        ReusableComposition composition;
        if (z || !nodeState.getComposedWithReusableContentHost()) {
            nodeState.setActiveState(SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null));
        } else {
            nodeState.setActive(false);
        }
        if (nodeState.getPausedComposition() != null) {
            cancelPausedPrecomposition(nodeState);
            return;
        }
        if (z) {
            ReusableComposition composition2 = nodeState.getComposition();
            if (composition2 != null) {
                composition2.deactivate();
                return;
            }
            return;
        }
        OutOfFrameExecutor outOfFrameExecutor = getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            deactivateOutOfFrame(nodeState, outOfFrameExecutor);
        } else {
            if (nodeState.getComposedWithReusableContentHost() || (composition = nodeState.getComposition()) == null) {
                return;
            }
            composition.deactivate();
        }
    }

    private final LayoutNode takeNodeFromReusables(Object obj) {
        int i2;
        if (this.reusableCount == 0) {
            return null;
        }
        List<LayoutNode> foldedChildren$ui = this.root.getFoldedChildren$ui();
        int size = foldedChildren$ui.size() - this.precomposedCount;
        int i3 = size - this.reusableCount;
        int i4 = size - 1;
        int i5 = i4;
        while (true) {
            if (i5 < i3) {
                i2 = -1;
                break;
            }
            if (x.n(getSlotIdAtIndex(foldedChildren$ui, i5), obj)) {
                i2 = i5;
                break;
            }
            i5--;
        }
        if (i2 == -1) {
            while (i4 >= i3) {
                NodeState nodeState = this.nodeToNodeState.get(foldedChildren$ui.get(i4));
                if (nodeState == null) {
                    x.g();
                }
                NodeState nodeState2 = nodeState;
                if (nodeState2.getSlotId() == SubcomposeLayoutKt.ReusedSlotId || this.slotReusePolicy.areCompatible(obj, nodeState2.getSlotId())) {
                    nodeState2.setSlotId(obj);
                    i5 = i4;
                    i2 = i5;
                    break;
                }
                i4--;
            }
            i5 = i4;
            i2 = -1;
        }
        if (i2 == -1) {
            return null;
        }
        if (i5 != i3) {
            move(i5, i3, 1);
        }
        this.reusableCount--;
        LayoutNode layoutNode = foldedChildren$ui.get(i3);
        NodeState nodeState3 = this.nodeToNodeState.get(layoutNode);
        if (nodeState3 == null) {
            x.g();
        }
        NodeState nodeState4 = nodeState3;
        nodeState4.setActiveState(SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null));
        nodeState4.setForceReuse(true);
        nodeState4.setForceRecompose(true);
        return layoutNode;
    }

    public final MeasurePolicy createMeasurePolicy(final p<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> pVar) {
        return new LayoutNode.NoIntrinsicsMeasurePolicy(this.NoIntrinsicsMessage) { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.createMeasurePolicy.1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo1704measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
                LayoutNodeSubcompositionsState.this.scope.setLayoutDirection(measureScope.getLayoutDirection());
                LayoutNodeSubcompositionsState.this.scope.setDensity(measureScope.getDensity());
                LayoutNodeSubcompositionsState.this.scope.setFontScale(measureScope.getFontScale());
                if (measureScope.isLookingAhead() || LayoutNodeSubcompositionsState.this.root.getLookaheadRoot$ui() == null) {
                    LayoutNodeSubcompositionsState.this.currentIndex = 0;
                    final MeasureResult measureResultInvoke = pVar.invoke(LayoutNodeSubcompositionsState.this.scope, Constraints.m11094boximpl(j2));
                    final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                    final int i2 = layoutNodeSubcompositionsState.currentIndex;
                    return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$2
                        @Override // androidx.compose.ui.layout.MeasureResult
                        public Map<AlignmentLine, Integer> getAlignmentLines() {
                            return measureResultInvoke.getAlignmentLines();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public int getHeight() {
                            return measureResultInvoke.getHeight();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public l<RulerScope, ab> getRulers() {
                            return measureResultInvoke.getRulers();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public int getWidth() {
                            return measureResultInvoke.getWidth();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public void placeChildren() {
                            layoutNodeSubcompositionsState.currentIndex = i2;
                            measureResultInvoke.placeChildren();
                            if (layoutNodeSubcompositionsState.root.getLookaheadRoot$ui() == null) {
                                LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = layoutNodeSubcompositionsState;
                                layoutNodeSubcompositionsState2.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState2.currentIndex);
                            }
                        }
                    };
                }
                LayoutNodeSubcompositionsState.this.currentApproachIndex = 0;
                final MeasureResult measureResultInvoke2 = pVar.invoke(LayoutNodeSubcompositionsState.this.approachMeasureScope, Constraints.m11094boximpl(j2));
                final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = LayoutNodeSubcompositionsState.this;
                final int i3 = layoutNodeSubcompositionsState2.currentApproachIndex;
                return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$1
                    @Override // androidx.compose.ui.layout.MeasureResult
                    public Map<AlignmentLine, Integer> getAlignmentLines() {
                        return measureResultInvoke2.getAlignmentLines();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getHeight() {
                        return measureResultInvoke2.getHeight();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public l<RulerScope, ab> getRulers() {
                        return measureResultInvoke2.getRulers();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getWidth() {
                        return measureResultInvoke2.getWidth();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public void placeChildren() {
                        layoutNodeSubcompositionsState2.currentApproachIndex = i3;
                        measureResultInvoke2.placeChildren();
                        layoutNodeSubcompositionsState2.disposeUnusedSlotsInApproach();
                        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState3 = layoutNodeSubcompositionsState2;
                        layoutNodeSubcompositionsState3.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState3.currentIndex);
                    }
                };
            }
        };
    }

    public final void disposeOrReuseStartingFromIndex(int i2) {
        this.reusableCount = 0;
        List<LayoutNode> foldedChildren$ui = this.root.getFoldedChildren$ui();
        int size = (foldedChildren$ui.size() - this.precomposedCount) - 1;
        if (i2 <= size) {
            this.reusableSlotIdsSet.clear();
            if (i2 <= size) {
                int i3 = i2;
                while (true) {
                    this.reusableSlotIdsSet.add(getSlotIdAtIndex(foldedChildren$ui, i3));
                    if (i3 == size) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.slotReusePolicy.getSlotsToRetain(this.reusableSlotIdsSet);
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            boolean z = false;
            while (size >= i2) {
                try {
                    LayoutNode layoutNode = foldedChildren$ui.get(size);
                    NodeState nodeState = this.nodeToNodeState.get(layoutNode);
                    if (nodeState == null) {
                        x.g();
                    }
                    NodeState nodeState2 = nodeState;
                    Object slotId = nodeState2.getSlotId();
                    if (this.reusableSlotIdsSet.contains(slotId)) {
                        this.reusableCount++;
                        if (nodeState2.getActive()) {
                            resetLayoutState(layoutNode);
                            reuseComposition(nodeState2, false);
                            if (nodeState2.getComposedWithReusableContentHost()) {
                                z = true;
                            }
                        }
                    } else {
                        LayoutNode layoutNode2 = this.root;
                        layoutNode2.ignoreRemeasureRequests = true;
                        this.nodeToNodeState.remove(layoutNode);
                        ReusableComposition composition = nodeState2.getComposition();
                        if (composition != null) {
                            composition.dispose();
                        }
                        this.root.removeAt$ui(size, 1);
                        layoutNode2.ignoreRemeasureRequests = false;
                    }
                    this.slotIdToNode.remove(slotId);
                    size--;
                } finally {
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                }
            }
            if (z) {
                Snapshot.Companion.sendApplyNotifications();
            }
        }
        makeSureStateIsConsistent();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void forceRecomposeChildren() {
        /*
            r15 = this;
            androidx.compose.ui.node.LayoutNode r0 = r15.root
            java.util.List r0 = r0.getFoldedChildren$ui()
            int r0 = r0.size()
            int r1 = r15.reusableCount
            if (r1 == r0) goto L83
            androidx.collection.MutableScatterMap<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState> r0 = r15.nodeToNodeState
            androidx.collection.ScatterMap r0 = (androidx.collection.ScatterMap) r0
            java.lang.Object[] r1 = r0.values
            long[] r0 = r0.metadata
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L58
            r3 = 0
            r4 = r3
        L1d:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L53
            int r7 = r4 - r2
            r8 = r3
        L30:
            int r9 = ~r7
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            if (r8 >= r9) goto L51
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r5
            r13 = 128(0x80, double:6.3E-322)
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 >= 0) goto L4d
            int r9 = r4 << 3
            int r9 = r9 + r8
            r9 = r1[r9]
            androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState r9 = (androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState) r9
            r11 = 1
            r9.setForceRecompose(r11)
        L4d:
            long r5 = r5 >> r10
            int r8 = r8 + 1
            goto L30
        L51:
            if (r9 != r10) goto L58
        L53:
            if (r4 == r2) goto L58
            int r4 = r4 + 1
            goto L1d
        L58:
            androidx.compose.ui.node.LayoutNode r0 = r15.root
            androidx.compose.ui.node.LayoutNode r0 = r0.getLookaheadRoot$ui()
            androidx.compose.ui.node.LayoutNode r1 = r15.root
            if (r0 == 0) goto L73
            boolean r0 = r1.getLookaheadMeasurePending$ui()
            if (r0 != 0) goto L83
            androidx.compose.ui.node.LayoutNode r1 = r15.root
            r5 = 7
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            androidx.compose.ui.node.LayoutNode.requestLookaheadRemeasure$ui$default(r1, r2, r3, r4, r5, r6)
            return
        L73:
            boolean r0 = r1.getMeasurePending$ui()
            if (r0 != 0) goto L83
            androidx.compose.ui.node.LayoutNode r1 = r15.root
            r5 = 7
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            androidx.compose.ui.node.LayoutNode.requestRemeasure$ui$default(r1, r2, r3, r4, r5, r6)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.forceRecomposeChildren():void");
    }

    public final CompositionContext getCompositionContext() {
        return this.compositionContext;
    }

    public final SubcomposeSlotReusePolicy getSlotReusePolicy() {
        return this.slotReusePolicy;
    }

    public final void makeSureStateIsConsistent() {
        int size = this.root.getFoldedChildren$ui().size();
        if (this.nodeToNodeState.getSize() != size) {
            InlineClassHelperKt.throwIllegalArgumentException("Inconsistency between the count of nodes tracked by the state (" + this.nodeToNodeState.getSize() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((size - this.reusableCount) - this.precomposedCount < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Incorrect state. Total children " + size + ". Reusable children " + this.reusableCount + ". Precomposed children " + this.precomposedCount);
        }
        if (this.precomposeMap.getSize() == this.precomposedCount) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Incorrect state. Precomposed children " + this.precomposedCount + ". Map size " + this.precomposeMap.getSize());
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        markActiveNodesAsReused(true);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        disposeCurrentNodes();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        markActiveNodesAsReused(false);
    }

    public final SubcomposeLayoutState.PausedPrecomposition precomposePaused(final Object obj, p<? super Composer, ? super Integer, ab> pVar) {
        if (!this.root.isAttached()) {
            return new PausedPrecompositionImpl() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.precomposePaused.1
                private final boolean isComplete = true;

                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
                public SubcomposeLayoutState.PrecomposedSlotHandle apply() {
                    return LayoutNodeSubcompositionsState.this.createPrecomposedSlotHandle(obj);
                }

                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
                public boolean isComplete() {
                    return this.isComplete;
                }

                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
                public boolean resume(ShouldPauseCallback shouldPauseCallback) {
                    return true;
                }

                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
                public void cancel() {
                }
            };
        }
        precompose(obj, pVar, true);
        return new PausedPrecompositionImpl() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.precomposePaused.2
            /* JADX WARN: Multi-variable type inference failed */
            private final NodeState getNodeState() {
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.get(obj);
                if (layoutNode != null) {
                    return (NodeState) LayoutNodeSubcompositionsState.this.nodeToNodeState.get(layoutNode);
                }
                return null;
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
            public SubcomposeLayoutState.PrecomposedSlotHandle apply() {
                NodeState nodeState = getNodeState();
                if (nodeState != null) {
                    LayoutNodeSubcompositionsState.this.applyPausedPrecomposition(nodeState, false);
                }
                return LayoutNodeSubcompositionsState.this.createPrecomposedSlotHandle(obj);
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
            public void cancel() {
                NodeState nodeState = getNodeState();
                if ((nodeState != null ? nodeState.getPausedComposition() : null) != null) {
                    LayoutNodeSubcompositionsState.this.disposePrecomposedSlot(obj);
                }
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
            public boolean isComplete() {
                PausedComposition pausedComposition;
                NodeState nodeState = getNodeState();
                if (nodeState == null || (pausedComposition = nodeState.getPausedComposition()) == null) {
                    return true;
                }
                return pausedComposition.isComplete();
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
            public boolean resume(ShouldPauseCallback shouldPauseCallback) {
                NodeState nodeState = getNodeState();
                PausedComposition pausedComposition = nodeState != null ? nodeState.getPausedComposition() : null;
                if (pausedComposition == null || pausedComposition.isComplete()) {
                    return true;
                }
                Object obj2 = obj;
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    return pausedComposition.resume(shouldPauseCallback);
                } catch (Throwable th) {
                    try {
                        if (nodeState.getOperations() != null) {
                            throw new SubcomposeLayoutPausableCompositionException(nodeState.getOperations(), obj2, th);
                        }
                        throw th;
                    } finally {
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    }
                }
            }
        };
    }

    public final void setCompositionContext(CompositionContext compositionContext) {
        this.compositionContext = compositionContext;
    }

    public final void setSlotReusePolicy(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        if (this.slotReusePolicy != subcomposeSlotReusePolicy) {
            this.slotReusePolicy = subcomposeSlotReusePolicy;
            markActiveNodesAsReused(false);
            LayoutNode.requestRemeasure$ui$default(this.root, false, false, false, 7, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<androidx.compose.ui.layout.Measurable> subcompose(java.lang.Object r10, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r11) {
        /*
            r9 = this;
            r9.makeSureStateIsConsistent()
            androidx.compose.ui.node.LayoutNode r0 = r9.root
            androidx.compose.ui.node.LayoutNode$LayoutState r0 = r0.getLayoutState$ui()
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.ui.node.LayoutNode.LayoutState.Measuring
            if (r0 == r1) goto L1e
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut
            if (r0 == r1) goto L1e
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring
            if (r0 == r1) goto L1e
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut
            if (r0 == r1) goto L1e
            java.lang.String r1 = "subcompose can only be used inside the measure or layout blocks"
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException(r1)
        L1e:
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.ui.node.LayoutNode> r1 = r9.slotIdToNode
            java.lang.Object r2 = r1.get(r10)
            if (r2 != 0) goto L57
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.ui.node.LayoutNode> r2 = r9.precomposeMap
            java.lang.Object r2 = r2.remove(r10)
            androidx.compose.ui.node.LayoutNode r2 = (androidx.compose.ui.node.LayoutNode) r2
            if (r2 == 0) goto L48
            androidx.collection.MutableScatterMap<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState> r3 = r9.nodeToNodeState
            java.lang.Object r3 = r3.get(r2)
            androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState r3 = (androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState) r3
            int r3 = r9.precomposedCount
            if (r3 > 0) goto L41
            java.lang.String r3 = "Check failed."
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException(r3)
        L41:
            int r3 = r9.precomposedCount
            int r3 = r3 + (-1)
            r9.precomposedCount = r3
            goto L54
        L48:
            androidx.compose.ui.node.LayoutNode r2 = r9.takeNodeFromReusables(r10)
            if (r2 != 0) goto L54
            int r2 = r9.currentIndex
            androidx.compose.ui.node.LayoutNode r2 = r9.createNodeAt(r2)
        L54:
            r1.set(r10, r2)
        L57:
            androidx.compose.ui.node.LayoutNode r1 = r9.root
            androidx.compose.ui.node.LayoutNode r2 = (androidx.compose.ui.node.LayoutNode) r2
            java.util.List r1 = r1.getFoldedChildren$ui()
            int r3 = r9.currentIndex
            java.lang.Object r1 = h.a.i.S(r1, r3)
            if (r1 == r2) goto L97
            androidx.compose.ui.node.LayoutNode r1 = r9.root
            java.util.List r1 = r1.getFoldedChildren$ui()
            int r4 = r1.indexOf(r2)
            int r1 = r9.currentIndex
            if (r4 >= r1) goto L8b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Key \""
            r1.<init>(r3)
            r1.append(r10)
            java.lang.String r3 = "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException(r1)
        L8b:
            int r5 = r9.currentIndex
            if (r5 == r4) goto L97
            r7 = 4
            r8 = 0
            r6 = 0
            r3 = r9
            move$default(r3, r4, r5, r6, r7, r8)
            goto L98
        L97:
            r3 = r9
        L98:
            int r9 = r3.currentIndex
            int r9 = r9 + 1
            r3.currentIndex = r9
            r9 = 0
            r3.subcompose(r2, r10, r9, r11)
            androidx.compose.ui.node.LayoutNode$LayoutState r9 = androidx.compose.ui.node.LayoutNode.LayoutState.Measuring
            if (r0 == r9) goto Lb0
            androidx.compose.ui.node.LayoutNode$LayoutState r9 = androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut
            if (r0 != r9) goto Lab
            goto Lb0
        Lab:
            java.util.List r9 = r2.getChildLookaheadMeasurables$ui()
            return r9
        Lb0:
            java.util.List r9 = r2.getChildMeasurables$ui()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose(java.lang.Object, h.g.a.p):java.util.List");
    }

    /* compiled from: WazeSource */
    final class Scope implements SubcomposeMeasureScope {
        private float density;
        private float fontScale;
        private LayoutDirection layoutDirection = LayoutDirection.Rtl;

        public Scope() {
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.fontScale;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return LayoutNodeSubcompositionsState.this.root.getLayoutState$ui() == LayoutNode.LayoutState.LookaheadLayingOut || LayoutNodeSubcompositionsState.this.root.getLayoutState$ui() == LayoutNode.LayoutState.LookaheadMeasuring;
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public MeasureResult layout(final int i2, final int i3, final Map<AlignmentLine, Integer> map, final l<? super RulerScope, ab> lVar, final l<? super Placeable.PlacementScope, ab> lVar2) {
            if ((i2 & (-16777216)) != 0 || ((-16777216) & i3) != 0) {
                InlineClassHelperKt.throwIllegalStateException(a.a(i3, i2));
            }
            final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
            return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$Scope$layout$1
                @Override // androidx.compose.ui.layout.MeasureResult
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return map;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getHeight() {
                    return i3;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public l<RulerScope, ab> getRulers() {
                    return lVar;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getWidth() {
                    return i2;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public void placeChildren() {
                    LookaheadDelegate lookaheadDelegate;
                    if (!this.isLookingAhead() || (lookaheadDelegate = layoutNodeSubcompositionsState.root.getInnerCoordinator$ui().getLookaheadDelegate()) == null) {
                        lVar2.invoke(layoutNodeSubcompositionsState.root.getInnerCoordinator$ui().getPlacementScope());
                    } else {
                        lVar2.invoke(lookaheadDelegate.getPlacementScope());
                    }
                }
            };
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public /* synthetic */ int mo2120roundToPxR2X_6o(long j2) {
            return Density.CC.m11128$default$roundToPxR2X_6o(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public /* synthetic */ int mo2121roundToPx0680j_4(float f2) {
            return Density.CC.m11129$default$roundToPx0680j_4(this, f2);
        }

        public void setDensity(float f2) {
            this.density = f2;
        }

        public void setFontScale(float f2) {
            this.fontScale = f2;
        }

        public void setLayoutDirection(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public List<Measurable> subcompose(Object obj, p<? super Composer, ? super Integer, ab> pVar) {
            return LayoutNodeSubcompositionsState.this.subcompose(obj, pVar);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toDp-GaN1DYA */
        public /* synthetic */ float mo2122toDpGaN1DYA(long j2) {
            return FontScaling.CC.m11273$default$toDpGaN1DYA(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo2123toDpu2uoSUM(float f2) {
            return Density.CC.m11130$default$toDpu2uoSUM(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public /* synthetic */ long mo2125toDpSizekrfVVM(long j2) {
            return Density.CC.m11132$default$toDpSizekrfVVM(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public /* synthetic */ float mo2126toPxR2X_6o(long j2) {
            return Density.CC.m11133$default$toPxR2X_6o(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public /* synthetic */ float mo2127toPx0680j_4(float f2) {
            return Density.CC.m11134$default$toPx0680j_4(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        public /* synthetic */ Rect toRect(DpRect dpRect) {
            return Density.CC.$default$toRect(this, dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public /* synthetic */ long mo2128toSizeXkaWNTQ(long j2) {
            return Density.CC.m11135$default$toSizeXkaWNTQ(this, j2);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toSp-0xMU5do */
        public /* synthetic */ long mo2129toSp0xMU5do(float f2) {
            return FontScaling.CC.m11274$default$toSp0xMU5do(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo2130toSpkPz2Gy4(float f2) {
            return Density.CC.m11136$default$toSpkPz2Gy4(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo2124toDpu2uoSUM(int i2) {
            return Density.CC.m11131$default$toDpu2uoSUM((Density) this, i2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo2131toSpkPz2Gy4(int i2) {
            return Density.CC.m11137$default$toSpkPz2Gy4((Density) this, i2);
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public /* synthetic */ MeasureResult layout(int i2, int i3, Map map, l lVar) {
            return MeasureScope.CC.$default$layout(this, i2, i3, map, lVar);
        }
    }

    /* compiled from: WazeSource */
    final class ApproachMeasureScopeImpl implements SubcomposeMeasureScope, MeasureScope {
        private final /* synthetic */ Scope $$delegate_0;

        public ApproachMeasureScopeImpl() {
            this.$$delegate_0 = LayoutNodeSubcompositionsState.this.scope;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public LayoutDirection getLayoutDirection() {
            return this.$$delegate_0.getLayoutDirection();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return this.$$delegate_0.isLookingAhead();
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public MeasureResult layout(int i2, int i3, Map<AlignmentLine, Integer> map, l<? super Placeable.PlacementScope, ab> lVar) {
            return this.$$delegate_0.layout(i2, i3, map, lVar);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public int mo2120roundToPxR2X_6o(long j2) {
            return this.$$delegate_0.mo2120roundToPxR2X_6o(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public int mo2121roundToPx0680j_4(float f2) {
            return this.$$delegate_0.mo2121roundToPx0680j_4(f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public List<Measurable> subcompose(Object obj, p<? super Composer, ? super Integer, ab> pVar) {
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.slotIdToNode.get(obj);
            return (layoutNode == null || LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui().indexOf(layoutNode) >= LayoutNodeSubcompositionsState.this.currentIndex) ? LayoutNodeSubcompositionsState.this.approachSubcompose(obj, pVar) : layoutNode.getChildMeasurables$ui();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toDp-GaN1DYA */
        public float mo2122toDpGaN1DYA(long j2) {
            return this.$$delegate_0.mo2122toDpGaN1DYA(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public float mo2123toDpu2uoSUM(float f2) {
            return this.$$delegate_0.mo2123toDpu2uoSUM(f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public long mo2125toDpSizekrfVVM(long j2) {
            return this.$$delegate_0.mo2125toDpSizekrfVVM(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public float mo2126toPxR2X_6o(long j2) {
            return this.$$delegate_0.mo2126toPxR2X_6o(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public float mo2127toPx0680j_4(float f2) {
            return this.$$delegate_0.mo2127toPx0680j_4(f2);
        }

        @Override // androidx.compose.ui.unit.Density
        public Rect toRect(DpRect dpRect) {
            return this.$$delegate_0.toRect(dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public long mo2128toSizeXkaWNTQ(long j2) {
            return this.$$delegate_0.mo2128toSizeXkaWNTQ(j2);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toSp-0xMU5do */
        public long mo2129toSp0xMU5do(float f2) {
            return this.$$delegate_0.mo2129toSp0xMU5do(f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public long mo2130toSpkPz2Gy4(float f2) {
            return this.$$delegate_0.mo2130toSpkPz2Gy4(f2);
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public MeasureResult layout(int i2, int i3, Map<AlignmentLine, Integer> map, l<? super RulerScope, ab> lVar, l<? super Placeable.PlacementScope, ab> lVar2) {
            return this.$$delegate_0.layout(i2, i3, map, lVar, lVar2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public float mo2124toDpu2uoSUM(int i2) {
            return this.$$delegate_0.mo2124toDpu2uoSUM(i2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public long mo2131toSpkPz2Gy4(int i2) {
            return this.$$delegate_0.mo2131toSpkPz2Gy4(i2);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$deactivateOutOfFrame$1, reason: invalid class name and case insensitive filesystem */
    final class C03771 extends y implements h.g.a.a<ab> {
        final /* synthetic */ NodeState $this_deactivateOutOfFrame;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03771(NodeState nodeState) {
            super(0);
            this.$this_deactivateOutOfFrame = nodeState;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ReusableComposition composition;
            if (this.$this_deactivateOutOfFrame.getActive() || (composition = this.$this_deactivateOutOfFrame.getComposition()) == null) {
                return;
            }
            composition.deactivate();
        }

        @Override // h.g.a.a
        public /* bridge */ /* synthetic */ ab invoke() {
            invoke2();
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    final class NodeState {
        private MutableState<Boolean> activeState;
        private boolean composedWithReusableContentHost;
        private ReusableComposition composition;
        private p<? super Composer, ? super Integer, ab> content;
        private boolean forceRecompose;
        private boolean forceReuse;
        private final MutableIntList operations;
        private PausedComposition pausedComposition;
        private Object slotId;

        public NodeState(Object obj, p<? super Composer, ? super Integer, ab> pVar, ReusableComposition reusableComposition) {
            this.slotId = obj;
            this.content = pVar;
            this.composition = reusableComposition;
            this.activeState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
            this.operations = null;
        }

        public final boolean getActive() {
            return this.activeState.getValue().booleanValue();
        }

        public final MutableState<Boolean> getActiveState() {
            return this.activeState;
        }

        public final boolean getComposedWithReusableContentHost() {
            return this.composedWithReusableContentHost;
        }

        public final ReusableComposition getComposition() {
            return this.composition;
        }

        public final p<Composer, Integer, ab> getContent() {
            return this.content;
        }

        public final boolean getForceRecompose() {
            return this.forceRecompose;
        }

        public final boolean getForceReuse() {
            return this.forceReuse;
        }

        public final MutableIntList getOperations() {
            return this.operations;
        }

        public final PausedComposition getPausedComposition() {
            return this.pausedComposition;
        }

        public final Object getSlotId() {
            return this.slotId;
        }

        /* renamed from: record-Fsph7yY, reason: not valid java name */
        public final void m9772recordFsph7yY(int i2) {
            MutableIntList mutableIntList = this.operations;
            if (mutableIntList == null) {
                return;
            }
            mutableIntList.add(i2);
            if (mutableIntList._size >= 50) {
                mutableIntList.removeRange(0, 10);
            }
        }

        public final void setActive(boolean z) {
            this.activeState.setValue(Boolean.valueOf(z));
        }

        public final void setActiveState(MutableState<Boolean> mutableState) {
            this.activeState = mutableState;
        }

        public final void setComposedWithReusableContentHost(boolean z) {
            this.composedWithReusableContentHost = z;
        }

        public final void setComposition(ReusableComposition reusableComposition) {
            this.composition = reusableComposition;
        }

        public final void setContent(p<? super Composer, ? super Integer, ab> pVar) {
            this.content = pVar;
        }

        public final void setForceRecompose(boolean z) {
            this.forceRecompose = z;
        }

        public final void setForceReuse(boolean z) {
            this.forceReuse = z;
        }

        public final void setPausedComposition(PausedComposition pausedComposition) {
            this.pausedComposition = pausedComposition;
        }

        public final void setSlotId(Object obj) {
            this.slotId = obj;
        }

        public /* synthetic */ NodeState(Object obj, p pVar, ReusableComposition reusableComposition, int i2, o oVar) {
            this(obj, pVar, (i2 & 4) != 0 ? null : reusableComposition);
        }
    }

    public final SubcomposeLayoutState.PrecomposedSlotHandle precompose(Object obj, p<? super Composer, ? super Integer, ab> pVar) {
        precompose(obj, pVar, false);
        return createPrecomposedSlotHandle(obj);
    }

    private final void subcompose(LayoutNode layoutNode, Object obj, boolean z, p<? super Composer, ? super Integer, ab> pVar) {
        MutableScatterMap<LayoutNode, NodeState> mutableScatterMap = this.nodeToNodeState;
        NodeState nodeState = mutableScatterMap.get(layoutNode);
        if (nodeState == null) {
            NodeState nodeState2 = new NodeState(obj, ComposableSingletons$SubcomposeLayoutKt.INSTANCE.getLambda$641200809$ui(), null, 4, null);
            mutableScatterMap.set(layoutNode, nodeState2);
            nodeState = nodeState2;
        }
        NodeState nodeState3 = nodeState;
        boolean z2 = nodeState3.getContent() != pVar;
        if (nodeState3.getPausedComposition() != null) {
            if (z2) {
                cancelPausedPrecomposition(nodeState3);
            } else {
                if (z) {
                    return;
                }
                applyPausedPrecomposition(nodeState3, true);
                z = false;
            }
        }
        ReusableComposition composition = nodeState3.getComposition();
        boolean hasInvalidations = composition != null ? composition.getHasInvalidations() : true;
        if (z2 || hasInvalidations || nodeState3.getForceRecompose()) {
            nodeState3.setContent(pVar);
            subcompose(layoutNode, nodeState3, z);
            nodeState3.setForceRecompose(false);
        }
    }

    private final void subcompose(LayoutNode layoutNode, NodeState nodeState, boolean z) {
        if (nodeState.getPausedComposition() != null) {
            InlineClassHelperKt.throwIllegalArgumentException("new subcompose call while paused composition is still active");
        }
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            LayoutNode layoutNode2 = this.root;
            layoutNode2.ignoreRemeasureRequests = true;
            PausableComposition composition = nodeState.getComposition();
            CompositionContext compositionContext = this.compositionContext;
            if (compositionContext != null) {
                if (composition == null || composition.isDisposed()) {
                    if (z) {
                        composition = SubcompositionKt.createPausableSubcomposition(layoutNode, compositionContext);
                    } else {
                        composition = SubcompositionKt.createSubcomposition(layoutNode, compositionContext);
                    }
                }
                nodeState.setComposition(composition);
                ComposableLambda content = nodeState.getContent();
                if (getOutOfFrameExecutor() != null) {
                    nodeState.setComposedWithReusableContentHost(false);
                } else {
                    nodeState.setComposedWithReusableContentHost(true);
                    content = ComposableLambdaKt.composableLambdaInstance(1524156494, true, new LayoutNodeSubcompositionsState$subcompose$4$1$composable$1(nodeState, content));
                }
                if (z) {
                    PausableComposition pausableComposition = (PausableComposition) composition;
                    if (nodeState.getForceReuse()) {
                        nodeState.setPausedComposition(pausableComposition.setPausableContentWithReuse(content));
                    } else {
                        nodeState.setPausedComposition(pausableComposition.setPausableContent(content));
                    }
                } else if (nodeState.getForceReuse()) {
                    composition.setContentWithReuse(content);
                } else {
                    composition.setContent(content);
                }
                nodeState.setForceReuse(false);
                layoutNode2.ignoreRemeasureRequests = false;
                return;
            }
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("parent composition reference not set");
            throw new e();
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }
}
