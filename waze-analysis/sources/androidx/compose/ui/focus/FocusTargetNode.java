package androidx.compose.ui.focus;

import android.os.Trace;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.EmptyMap;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSizeKt;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.aq;
import h.g.b.o;
import h.g.b.x;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FocusTargetNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutAwareModifierNode, FocusTargetModifierNode, ObserverModifierNode, ModifierLocalModifierNode {
    public static final int $stable = 8;
    private FocusStateImpl committedFocusState;
    private int focusability;
    private final boolean isInteropViewHost;
    private boolean isProcessingCustomEnter;
    private boolean isProcessingCustomExit;
    private final l<FocusTargetNode, ab> onDispatchEventsCompleted;
    private final p<FocusState, FocusState, ab> onFocusChange;
    private Integer previouslyFocusedChildHash;
    private final boolean shouldAutoInvalidate;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public /* synthetic */ FocusTargetNode(int i2, boolean z, p pVar, l lVar, int i3, o oVar) {
        this((i3 & 1) != 0 ? Focusability.Companion.m7914getAlwaysLCbbffg() : i2, ((i3 & 2) == 0) & z, (i3 & 4) != 0 ? null : pVar, (i3 & 8) != 0 ? null : lVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: assignFocus-3ESFkO8, reason: not valid java name */
    public final boolean m7894assignFocus3ESFkO8(int i2) {
        CustomDestinationResult customDestinationResultM7901performCustomRequestFocusMxy_nc0 = FocusTransactionsKt.m7901performCustomRequestFocusMxy_nc0(this, i2);
        CustomDestinationResult customDestinationResult = CustomDestinationResult.None;
        FocusStateImpl focusStateImpl = FocusStateImpl.Active;
        int iOrdinal = customDestinationResultM7901performCustomRequestFocusMxy_nc0.ordinal();
        if (iOrdinal == 0) {
            return FocusTransactionsKt.performRequestFocus(this);
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new i();
    }

    /* renamed from: fetchCustomEnterOrExit-ULY8qGw, reason: not valid java name */
    private final void m7895fetchCustomEnterOrExitULY8qGw(int i2, l<? super FocusRequester, ab> lVar, p<? super FocusProperties, ? super FocusEnterExitScope, ab> pVar) {
        FocusProperties focusPropertiesFetchFocusProperties$ui = fetchFocusProperties$ui();
        CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i2, null);
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        pVar.invoke(focusPropertiesFetchFocusProperties$ui, cancelIndicatingFocusBoundaryScope);
        FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
        if (cancelIndicatingFocusBoundaryScope.isCanceled()) {
            lVar.invoke(FocusRequester.Companion.getCancel());
        } else {
            if (activeFocusTargetNode == activeFocusTargetNode2 || activeFocusTargetNode2 == null) {
                return;
            }
            lVar.invoke(FocusRequester.Companion.getRedirect$ui());
        }
    }

    public static /* synthetic */ Rect fetchFocusRect$ui$default(FocusTargetNode focusTargetNode, LayoutCoordinates layoutCoordinates, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            layoutCoordinates = null;
        }
        return focusTargetNode.fetchFocusRect$ui(layoutCoordinates);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.Modifier$Node] */
    public final void dispatchFocusCallbacks$ui(FocusState focusState, FocusState focusState2) {
        NodeChain nodes$ui;
        p<FocusState, FocusState, ab> pVar;
        FocusTargetNode focusTargetNode = this;
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        if (!x.n(focusState, focusState2) && (pVar = this.onFocusChange) != null) {
            pVar.invoke(focusState, focusState2);
        }
        Modifier.Node node = focusTargetNode.getNode();
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = focusTargetNode.getNode();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        loop0: while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & 5120) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui() & 5120) != 0) {
                        if (node2 != node && (node2.getKindSet$ui() & 1024) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet$ui() & 4096) != 0) {
                            DelegatingNode delegatingNodePop = node2;
                            MutableVector mutableVector = null;
                            while (delegatingNodePop != 0) {
                                if (delegatingNodePop instanceof FocusEventModifierNode) {
                                    FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) delegatingNodePop;
                                    if (activeFocusTargetNode == focusOwner.getActiveFocusTargetNode()) {
                                        focusEventModifierNode.onFocusEvent(focusState2);
                                    }
                                } else if ((delegatingNodePop.getKindSet$ui() & 4096) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui = delegatingNodePop.getDelegate$ui();
                                    int i2 = 0;
                                    delegatingNodePop = delegatingNodePop;
                                    while (delegate$ui != null) {
                                        if ((delegate$ui.getKindSet$ui() & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                delegatingNodePop = delegate$ui;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNodePop != 0) {
                                                    mutableVector.add(delegatingNodePop);
                                                }
                                                mutableVector.add(delegate$ui);
                                                delegatingNodePop = 0;
                                            }
                                        }
                                        delegate$ui = delegate$ui.getChild$ui();
                                        delegatingNodePop = delegatingNodePop;
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            node2 = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        l<FocusTargetNode, ab> lVar = this.onDispatchEventsCompleted;
        if (lVar != null) {
            lVar.invoke(this);
        }
    }

    /* renamed from: fetchCustomEnter-aToIllA$ui, reason: not valid java name */
    public final void m7896fetchCustomEnteraToIllA$ui(int i2, l<? super FocusRequester, ab> lVar) {
        if (this.isProcessingCustomEnter) {
            return;
        }
        this.isProcessingCustomEnter = true;
        try {
            FocusProperties focusPropertiesFetchFocusProperties$ui = fetchFocusProperties$ui();
            CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i2, null);
            FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
            FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
            focusPropertiesFetchFocusProperties$ui.getOnEnter().invoke(cancelIndicatingFocusBoundaryScope);
            FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
            if (cancelIndicatingFocusBoundaryScope.isCanceled()) {
                lVar.invoke(FocusRequester.Companion.getCancel());
            } else if (activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null) {
                lVar.invoke(FocusRequester.Companion.getRedirect$ui());
            }
        } finally {
            this.isProcessingCustomEnter = false;
        }
    }

    /* renamed from: fetchCustomExit-aToIllA$ui, reason: not valid java name */
    public final void m7897fetchCustomExitaToIllA$ui(int i2, l<? super FocusRequester, ab> lVar) {
        if (this.isProcessingCustomExit) {
            return;
        }
        this.isProcessingCustomExit = true;
        try {
            FocusProperties focusPropertiesFetchFocusProperties$ui = fetchFocusProperties$ui();
            CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i2, null);
            FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
            FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
            focusPropertiesFetchFocusProperties$ui.getOnExit().invoke(cancelIndicatingFocusBoundaryScope);
            FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
            if (cancelIndicatingFocusBoundaryScope.isCanceled()) {
                lVar.invoke(FocusRequester.Companion.getCancel());
            } else if (activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null) {
                lVar.invoke(FocusRequester.Companion.getRedirect$ui());
            }
        } finally {
            this.isProcessingCustomExit = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [androidx.compose.ui.Modifier$Node] */
    public final FocusProperties fetchFocusProperties$ui() {
        NodeChain nodes$ui;
        FocusPropertiesImpl focusPropertiesImpl = new FocusPropertiesImpl();
        focusPropertiesImpl.setCanFocus(Focusability.m7907canFocusimpl$ui(mo7887getFocusabilityLCbbffg(), this));
        FocusTargetNode focusTargetNode = this;
        Modifier.Node node = focusTargetNode.getNode();
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = focusTargetNode.getNode();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        loop0: while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui() & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) != 0) {
                        if (node2 != node && (node2.getKindSet$ui() & 1024) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet$ui() & 2048) != 0) {
                            DelegatingNode delegatingNodePop = node2;
                            MutableVector mutableVector = null;
                            while (delegatingNodePop != 0) {
                                if (delegatingNodePop instanceof FocusPropertiesModifierNode) {
                                    ((FocusPropertiesModifierNode) delegatingNodePop).applyFocusProperties(focusPropertiesImpl);
                                } else if ((delegatingNodePop.getKindSet$ui() & 2048) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui = delegatingNodePop.getDelegate$ui();
                                    int i2 = 0;
                                    delegatingNodePop = delegatingNodePop;
                                    while (delegate$ui != null) {
                                        if ((delegate$ui.getKindSet$ui() & 2048) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                delegatingNodePop = delegate$ui;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNodePop != 0) {
                                                    mutableVector.add(delegatingNodePop);
                                                }
                                                mutableVector.add(delegate$ui);
                                                delegatingNodePop = 0;
                                            }
                                        }
                                        delegate$ui = delegate$ui.getChild$ui();
                                        delegatingNodePop = delegatingNodePop;
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            node2 = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        return focusPropertiesImpl;
    }

    public final Rect fetchFocusRect$ui(LayoutCoordinates layoutCoordinates) {
        Rect rectLocalBoundingBoxOf;
        Rect focusRect = fetchFocusProperties$ui().getFocusRect();
        return focusRect != FocusProperties.Companion.getUnsetFocusRect() ? layoutCoordinates == null ? focusRect : focusRect.m8017translatek4lQ0M(LayoutCoordinates.CC.m9763localPositionOfS_NoaFU$default(layoutCoordinates, DelegatableNodeKt.requireLayoutCoordinates(this), 0L, false, 6, null)) : (layoutCoordinates == null || (rectLocalBoundingBoxOf = layoutCoordinates.localBoundingBoxOf(DelegatableNodeKt.requireLayoutCoordinates(this), false)) == null) ? RectKt.m8020Recttz77jQw(Offset.Companion.m7996getZeroF1C5BW0(), IntSizeKt.m11351toSizeozmzZPI(DelegatableNodeKt.requireLayoutCoordinates(this).mo9743getSizeYbymL2g())) : rectLocalBoundingBoxOf;
    }

    public final BeyondBoundsLayout getBeyondBoundsLayoutParent() {
        return DelegatableNodeKt.findNearestBeyondBoundsLayoutAncestor(this);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public /* synthetic */ Object getCurrent(ModifierLocal modifierLocal) {
        return ModifierLocalModifierNode.CC.$default$getCurrent(this, modifierLocal);
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    public FocusStateImpl getFocusState() {
        NodeChain nodes$ui;
        if (!isAttached()) {
            return FocusStateImpl.Inactive;
        }
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        if (activeFocusTargetNode == null) {
            return FocusStateImpl.Inactive;
        }
        if (this == activeFocusTargetNode) {
            return focusOwner.isFocusCaptured() ? FocusStateImpl.Captured : FocusStateImpl.Active;
        }
        if (activeFocusTargetNode.isAttached()) {
            FocusTargetNode focusTargetNode = activeFocusTargetNode;
            if (!focusTargetNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui = focusTargetNode.getNode().getParent$ui();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            while (layoutNodeRequireLayoutNode != null) {
                if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & 1024) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & 1024) != 0) {
                            Modifier.Node nodePop = parent$ui;
                            MutableVector mutableVector = null;
                            while (nodePop != null) {
                                if (nodePop instanceof FocusTargetNode) {
                                    if (this == ((FocusTargetNode) nodePop)) {
                                        return FocusStateImpl.ActiveParent;
                                    }
                                } else if ((nodePop.getKindSet$ui() & 1024) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                        if ((delegate$ui.getKindSet$ui() & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                nodePop = delegate$ui;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    mutableVector.add(nodePop);
                                                }
                                                mutableVector.add(delegate$ui);
                                                nodePop = null;
                                            }
                                        }
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                nodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
                parent$ui = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
            }
        }
        return FocusStateImpl.Inactive;
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    /* renamed from: getFocusability-LCbbffg */
    public int mo7887getFocusabilityLCbbffg() {
        return this.focusability;
    }

    public final Integer getPreviouslyFocusedChildHash() {
        return this.previouslyFocusedChildHash;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ ModifierLocalMap getProvidedValues() {
        return EmptyMap.INSTANCE;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public final void invalidateFocus$ui() {
        FocusProperties focusProperties;
        FocusStateImpl focusState = getFocusState();
        CustomDestinationResult customDestinationResult = CustomDestinationResult.None;
        FocusStateImpl focusStateImpl = FocusStateImpl.Active;
        int iOrdinal = focusState.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new i();
                }
                return;
            }
        }
        aq aqVar = new aq();
        ObserverModifierNodeKt.observeReads(this, new FocusTargetNode$invalidateFocus$1(aqVar, this));
        Object obj = aqVar.f48105a;
        if (obj == null) {
            x.j("focusProperties");
            focusProperties = null;
        } else {
            focusProperties = (FocusProperties) obj;
        }
        if (focusProperties.getCanFocus()) {
            return;
        }
        DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
    }

    public final boolean isInteropViewHost() {
        return this.isInteropViewHost;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    @Override // androidx.compose.ui.Modifier.Node
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDetach() {
        /*
            r5 = this;
            androidx.compose.ui.focus.FocusStateImpl r0 = r5.getFocusState()
            androidx.compose.ui.focus.CustomDestinationResult r1 = androidx.compose.ui.focus.CustomDestinationResult.None
            androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.Active
            int r0 = r0.ordinal()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L3b
            if (r0 == r1) goto L1f
            r3 = 2
            if (r0 == r3) goto L3b
            r1 = 3
            if (r0 != r1) goto L19
            goto L5a
        L19:
            h.i r5 = new h.i
            r5.<init>()
            throw r5
        L1f:
            r0 = r5
            androidx.compose.ui.node.DelegatableNode r0 = (androidx.compose.ui.node.DelegatableNode) r0
            androidx.compose.ui.node.Owner r0 = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(r0)
            androidx.compose.ui.focus.FocusOwner r0 = r0.getFocusOwner()
            androidx.compose.ui.focus.FocusTargetNode r3 = androidx.compose.ui.focus.FocusTraversalKt.findActiveFocusNode(r5)
            if (r3 == 0) goto L5a
            boolean r3 = r3.isInteropViewHost
            if (r3 != r1) goto L5a
            r0.mo7875requestOwnerFocus7o62pno(r2, r2)
            r0.scheduleInvalidationForOwner()
            goto L5a
        L3b:
            r0 = r5
            androidx.compose.ui.node.DelegatableNode r0 = (androidx.compose.ui.node.DelegatableNode) r0
            androidx.compose.ui.node.Owner r0 = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(r0)
            androidx.compose.ui.focus.FocusOwner r0 = r0.getFocusOwner()
            androidx.compose.ui.focus.FocusDirection$Companion r3 = androidx.compose.ui.focus.FocusDirection.Companion
            int r3 = r3.m7861getExitdhqQ8s()
            r4 = 0
            r0.mo7870clearFocusI7lrPNg(r1, r1, r4, r3)
            boolean r1 = r5.isInteropViewHost
            if (r1 == 0) goto L57
            r0.mo7875requestOwnerFocus7o62pno(r2, r2)
        L57:
            r0.scheduleInvalidationForOwner()
        L5a:
            r5.committedFocusState = r2
            r5.previouslyFocusedChildHash = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTargetNode.onDetach():void");
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        invalidateFocus$ui();
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        if (ComposeUiFlags.isInitialFocusOnFocusableAvailable) {
            DelegatableNodeKt.requireOwner(getNode()).getFocusOwner().focusTargetAvailable();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        if (getFocusState().isFocused()) {
            DelegatableNodeKt.requireOwner(this).getFocusOwner().mo7870clearFocusI7lrPNg(true, true, true, FocusDirection.Companion.m7861getExitdhqQ8s());
        }
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ void provide(ModifierLocal modifierLocal, Object obj) {
        ModifierLocalModifierNode.CC.$default$provide(this, modifierLocal, obj);
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    public /* synthetic */ boolean requestFocus() {
        return mo7888requestFocus3ESFkO8(FocusDirection.Companion.m7860getEnterdhqQ8s());
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    /* renamed from: requestFocus-3ESFkO8 */
    public boolean mo7888requestFocus3ESFkO8(int i2) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return fetchFocusProperties$ui().getCanFocus() ? m7894assignFocus3ESFkO8(i2) : TwoDimensionalFocusSearchKt.m7926findChildCorrespondingToFocusEnterOMvw8(this, i2, new FocusTargetNode$requestFocus$1$1(i2));
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    /* renamed from: setFocusability-josRg5g */
    public void mo7889setFocusabilityjosRg5g(int i2) {
        if (Focusability.m7910equalsimpl0(this.focusability, i2)) {
            return;
        }
        this.focusability = i2;
        if (isAttached()) {
            FocusTargetNode focusTargetNode = this;
            if (this == DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode() && !Focusability.m7907canFocusimpl$ui(this.focusability, this) && FocusTransactionsKt.prepareToClearFocus(this, true, true)) {
                FocusTargetNode activeFocusTargetNode = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode();
                DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setActiveFocusTargetNode(null);
                if (activeFocusTargetNode != null) {
                    activeFocusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.Active, FocusStateImpl.Inactive);
                }
            }
        }
    }

    public final void setPreviouslyFocusedChildHash(Integer num) {
        this.previouslyFocusedChildHash = num;
    }

    /* compiled from: WazeSource */
    public final class FocusTargetElement extends ModifierNodeElement<FocusTargetNode> {
        public static final int $stable = 0;
        public static final FocusTargetElement INSTANCE = new FocusTargetElement();

        private FocusTargetElement() {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public FocusTargetNode create() {
            return new FocusTargetNode(0, false, null, null, 15, null);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return 1739042953;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("focusTarget");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public /* bridge */ /* synthetic */ void update(Modifier.Node node) {
        }

        public void update(FocusTargetNode focusTargetNode) {
        }
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public /* synthetic */ void mo2116onRemeasuredozmzZPI(long j2) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FocusTargetNode(int i2, boolean z, p<? super FocusState, ? super FocusState, ab> pVar, l<? super FocusTargetNode, ab> lVar) {
        this.isInteropViewHost = z;
        this.onFocusChange = pVar;
        this.onDispatchEventsCompleted = lVar;
        this.focusability = i2;
    }

    public /* synthetic */ FocusTargetNode(int i2, boolean z, p pVar, l lVar, o oVar) {
        this(i2, z, pVar, lVar);
    }
}
