package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.ui.focus.Focusability;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.relocation.BringIntoViewModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.aq;
import h.g.b.o;
import h.g.b.u;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.ax;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FocusableNode extends DelegatingNode implements SemanticsModifierNode, GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode, ObserverModifierNode, TraversableNode {
    private final FocusTargetModifierNode focusTargetNode;
    private FocusInteraction.Focus focusedInteraction;
    private LayoutCoordinates globalLayoutCoordinates;
    private MutableInteractionSource interactionSource;
    private final l<Boolean, ab> onFocusChange;
    private PinnableContainer.PinnedHandle pinnedHandle;
    private final boolean shouldAutoInvalidate;
    private static final TraverseKey TraverseKey = new TraverseKey(null);
    public static final int $stable = 8;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.FocusableNode$applySemantics$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends u implements a<Boolean> {
        AnonymousClass1(Object obj) {
            super(0, obj, FocusableNode.class, "requestFocus", "requestFocus()Z", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final Boolean invoke() {
            return Boolean.valueOf(((FocusableNode) this.receiver).requestFocus());
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.FocusableNode$emitWithFallback$1, reason: invalid class name and case insensitive filesystem */
    final class C02221 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ ax $handler;
        final /* synthetic */ Interaction $interaction;
        final /* synthetic */ MutableInteractionSource $this_emitWithFallback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02221(MutableInteractionSource mutableInteractionSource, Interaction interaction, ax axVar, e<? super C02221> eVar) {
            super(2, eVar);
            this.$this_emitWithFallback = mutableInteractionSource;
            this.$interaction = interaction;
            this.$handler = axVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new C02221(this.$this_emitWithFallback, this.$interaction, this.$handler, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C02221) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (this.$this_emitWithFallback.emit(this.$interaction, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            ax axVar = this.$handler;
            if (axVar != null) {
                axVar.dispose();
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.FocusableNode$onFocusStateChange$1, reason: invalid class name and case insensitive filesystem */
    final class C02231 extends g implements p<af, e<? super ab>, Object> {
        int label;

        C02231(e<? super C02231> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return FocusableNode.this.new C02231(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C02231) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (BringIntoViewModifierNodeKt.bringIntoView$default(FocusableNode.this, null, this, 1, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FocusableNode(MutableInteractionSource mutableInteractionSource, int i2, l<? super Boolean, ab> lVar) {
        this.interactionSource = mutableInteractionSource;
        this.onFocusChange = lVar;
        FocusTargetModifierNode focusTargetModifierNodeM7891FocusTargetModifierNodePYyLHbc = FocusTargetModifierNodeKt.m7891FocusTargetModifierNodePYyLHbc(i2, new FocusableNode$focusTargetNode$1(this));
        delegate(focusTargetModifierNodeM7891FocusTargetModifierNodePYyLHbc);
        this.focusTargetNode = focusTargetModifierNodeM7891FocusTargetModifierNodePYyLHbc;
    }

    private final void disposeInteractionSource() {
        FocusInteraction.Focus focus;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null && (focus = this.focusedInteraction) != null) {
            mutableInteractionSource.tryEmit(new FocusInteraction.Unfocus(focus));
        }
        this.focusedInteraction = null;
    }

    private final void emitInteraction(boolean z) {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            FocusInteraction.Focus focus = this.focusedInteraction;
            if (!z) {
                if (focus != null) {
                    emitWithFallback(mutableInteractionSource, new FocusInteraction.Unfocus(focus));
                    this.focusedInteraction = null;
                    return;
                }
                return;
            }
            if (focus != null) {
                emitWithFallback(mutableInteractionSource, new FocusInteraction.Unfocus(focus));
                this.focusedInteraction = null;
            }
            FocusInteraction.Focus focus2 = new FocusInteraction.Focus();
            emitWithFallback(mutableInteractionSource, focus2);
            this.focusedInteraction = focus2;
        }
    }

    private final void emitWithFallback(final MutableInteractionSource mutableInteractionSource, final Interaction interaction) {
        if (!isAttached()) {
            mutableInteractionSource.tryEmit(interaction);
        } else {
            br brVar = (br) getCoroutineScope().getCoroutineContext().get(br.f51766a);
            aj.z(getCoroutineScope(), null, null, new C02221(mutableInteractionSource, interaction, brVar != null ? brVar.bY(new l() { // from class: androidx.compose.foundation.FocusableNode$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return FocusableNode.emitWithFallback$lambda$0(mutableInteractionSource, interaction, (Throwable) obj);
                }
            }) : null, null), 3);
        }
    }

    static final ab emitWithFallback$lambda$0(MutableInteractionSource mutableInteractionSource, Interaction interaction, Throwable th) {
        mutableInteractionSource.tryEmit(interaction);
        return ab.f48028a;
    }

    private final FocusedBoundsObserverNode getFocusedBoundsObserver() {
        if (!isAttached()) {
            return null;
        }
        TraversableNode traversableNodeFindNearestAncestor = TraversableNodeKt.findNearestAncestor(this, FocusedBoundsObserverNode.TraverseKey);
        if (traversableNodeFindNearestAncestor instanceof FocusedBoundsObserverNode) {
            return (FocusedBoundsObserverNode) traversableNodeFindNearestAncestor;
        }
        return null;
    }

    private final void notifyObserverWhenAttached() {
        FocusedBoundsObserverNode focusedBoundsObserver;
        LayoutCoordinates layoutCoordinates = this.globalLayoutCoordinates;
        if (layoutCoordinates == null || !layoutCoordinates.isAttached() || (focusedBoundsObserver = getFocusedBoundsObserver()) == null) {
            return;
        }
        focusedBoundsObserver.onFocusBoundsChanged(this.globalLayoutCoordinates);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusStateChange(FocusState focusState, FocusState focusState2) {
        boolean zIsFocused;
        if (isAttached() && (zIsFocused = focusState2.isFocused()) != focusState.isFocused()) {
            l<Boolean, ab> lVar = this.onFocusChange;
            if (lVar != null) {
                lVar.invoke(Boolean.valueOf(zIsFocused));
            }
            if (zIsFocused) {
                aj.z(getCoroutineScope(), null, null, new C02231(null), 3);
                PinnableContainer pinnableContainerRetrievePinnableContainer = retrievePinnableContainer();
                this.pinnedHandle = pinnableContainerRetrievePinnableContainer != null ? pinnableContainerRetrievePinnableContainer.pin() : null;
                notifyObserverWhenAttached();
            } else {
                PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
                if (pinnedHandle != null) {
                    pinnedHandle.release();
                }
                this.pinnedHandle = null;
                FocusedBoundsObserverNode focusedBoundsObserver = getFocusedBoundsObserver();
                if (focusedBoundsObserver != null) {
                    focusedBoundsObserver.onFocusBoundsChanged(null);
                }
            }
            SemanticsModifierNodeKt.invalidateSemantics(this);
            emitInteraction(zIsFocused);
        }
    }

    private final PinnableContainer retrievePinnableContainer() {
        final aq aqVar = new aq();
        ObserverModifierNodeKt.observeReads(this, new a() { // from class: androidx.compose.foundation.FocusableNode$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return FocusableNode.retrievePinnableContainer$lambda$0(aqVar, this);
            }
        });
        return (PinnableContainer) aqVar.f48105a;
    }

    static final ab retrievePinnableContainer$lambda$0(aq aqVar, FocusableNode focusableNode) {
        aqVar.f48105a = CompositionLocalConsumerModifierNodeKt.currentValueOf(focusableNode, PinnableContainerKt.getLocalPinnableContainer());
        return ab.f48028a;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setFocused(semanticsPropertyReceiver, this.focusTargetNode.getFocusState().isFocused());
        SemanticsPropertiesKt.requestFocus$default(semanticsPropertyReceiver, null, new AnonymousClass1(this), 1, null);
    }

    public final FocusState getFocusState() {
        return this.focusTargetNode.getFocusState();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return false;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return TraverseKey;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean isImportantForBounds() {
        return true;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.globalLayoutCoordinates = layoutCoordinates;
        if (this.focusTargetNode.getFocusState().isFocused()) {
            if (layoutCoordinates.isAttached()) {
                notifyObserverWhenAttached();
                return;
            }
            FocusedBoundsObserverNode focusedBoundsObserver = getFocusedBoundsObserver();
            if (focusedBoundsObserver != null) {
                focusedBoundsObserver.onFocusBoundsChanged(null);
            }
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        FocusTargetModifierNode focusTargetModifierNode = this.focusTargetNode;
        PinnableContainer pinnableContainerRetrievePinnableContainer = retrievePinnableContainer();
        if (focusTargetModifierNode.getFocusState().isFocused()) {
            PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.pinnedHandle = pinnableContainerRetrievePinnableContainer != null ? pinnableContainerRetrievePinnableContainer.pin() : null;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
        if (pinnedHandle != null) {
            pinnedHandle.release();
        }
        this.pinnedHandle = null;
    }

    public final boolean requestFocus() {
        return FocusTargetModifierNode.CC.m7890requestFocus3ESFkO8$default(this.focusTargetNode, 0, 1, null);
    }

    public final void update(MutableInteractionSource mutableInteractionSource) {
        if (x.n(this.interactionSource, mutableInteractionSource)) {
            return;
        }
        disposeInteractionSource();
        this.interactionSource = mutableInteractionSource;
    }

    /* compiled from: WazeSource */
    final class TraverseKey {
        private TraverseKey() {
        }

        public /* synthetic */ TraverseKey(o oVar) {
            this();
        }
    }

    public /* synthetic */ FocusableNode(MutableInteractionSource mutableInteractionSource, int i2, l lVar, o oVar) {
        this(mutableInteractionSource, i2, lVar);
    }

    public /* synthetic */ FocusableNode(MutableInteractionSource mutableInteractionSource, int i2, l lVar, int i3, o oVar) {
        this(mutableInteractionSource, (i3 & 2) != 0 ? Focusability.Companion.m7914getAlwaysLCbbffg() : i2, (i3 & 4) != 0 ? null : lVar, null);
    }
}
