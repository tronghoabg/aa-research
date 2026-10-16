package androidx.compose.foundation.gestures;

import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Scrollable2DNode extends DragGestureNode implements SemanticsModifierNode {
    public static final int $stable = 8;
    private final DefaultFlingBehavior defaultFlingBehavior;
    private FlingBehavior flingBehavior;
    private final ScrollableNestedScrollConnection nestedScrollConnection;
    private final NestedScrollDispatcher nestedScrollDispatcher;
    private OverscrollEffect overscrollEffect;
    private p<? super Float, ? super Float, Boolean> scrollByAction;
    private p<? super Offset, ? super e<? super Offset>, ? extends Object> scrollByOffsetAction;
    private final ScrollingLogic2D scrollingLogic;
    private final boolean shouldAutoInvalidate;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.Scrollable2DNode$onDragStopped$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ DragEvent.DragStopped $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DragEvent.DragStopped dragStopped, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$event = dragStopped;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return Scrollable2DNode.this.new AnonymousClass1(this.$event, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                Scrollable2DNode scrollable2DNode = Scrollable2DNode.this;
                DragEvent.DragStopped dragStopped = this.$event;
                this.label = 1;
                if (scrollable2DNode.scrollingLogic.m2326onScrollStoppedsFctU(dragStopped.m2182getVelocity9UxMQ8M(), this) == aVar) {
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

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.Scrollable2DNode$setScrollSemanticsActions$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<Offset, e<? super Offset>, Object> {
        /* synthetic */ long J$0;
        int label;

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = Scrollable2DNode.this.new AnonymousClass2(eVar);
            anonymousClass2.J$0 = ((Offset) obj).m7990unboximpl();
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Object invoke(Offset offset, e<? super Offset> eVar) {
            return m2294invoke3MmeM6k(offset.m7990unboximpl(), eVar);
        }

        /* renamed from: invoke-3MmeM6k, reason: not valid java name */
        public final Object m2294invoke3MmeM6k(long j2, e<? super Offset> eVar) {
            return ((AnonymousClass2) create(Offset.m7969boximpl(j2), eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
                return obj;
            }
            c.b(obj);
            long j2 = this.J$0;
            this.label = 1;
            Object objM2293semanticsScrollByd4ec7I = Scrollable2DKt.m2293semanticsScrollByd4ec7I(Scrollable2DNode.this.scrollingLogic, j2, this);
            return objM2293semanticsScrollByd4ec7I == aVar ? aVar : objM2293semanticsScrollByd4ec7I;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Scrollable2DNode(Scrollable2DState scrollable2DState, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, boolean z, MutableInteractionSource mutableInteractionSource) {
        super(ScrollableKt.getCanDragCalculation(), z, mutableInteractionSource, null);
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        DefaultFlingBehavior defaultFlingBehavior = new DefaultFlingBehavior(SplineBasedDecayKt.splineBasedDecay(ScrollableKt.getUnityDensity()), null, 2, 0 == true ? 1 : 0);
        this.defaultFlingBehavior = defaultFlingBehavior;
        OverscrollEffect overscrollEffect2 = this.overscrollEffect;
        DefaultFlingBehavior defaultFlingBehavior2 = this.flingBehavior;
        ScrollingLogic2D scrollingLogic2D = new ScrollingLogic2D(scrollable2DState, overscrollEffect2, defaultFlingBehavior2 == null ? defaultFlingBehavior : defaultFlingBehavior2, nestedScrollDispatcher, new h.g.a.a() { // from class: androidx.compose.foundation.gestures.Scrollable2DNode$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(this.f$0.isAttached());
            }
        });
        this.scrollingLogic = scrollingLogic2D;
        ScrollableNestedScrollConnection scrollableNestedScrollConnection = new ScrollableNestedScrollConnection(scrollingLogic2D, z);
        this.nestedScrollConnection = scrollableNestedScrollConnection;
        delegate(NestedScrollNodeKt.nestedScrollModifierNode(scrollableNestedScrollConnection, nestedScrollDispatcher));
    }

    private final void clearScrollSemanticsActions() {
        this.scrollByAction = null;
        this.scrollByOffsetAction = null;
    }

    private final void setScrollSemanticsActions() {
        this.scrollByAction = new p() { // from class: androidx.compose.foundation.gestures.Scrollable2DNode$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                Scrollable2DNode.setScrollSemanticsActions$lambda$0(this.f$0, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                return true;
            }
        };
        this.scrollByOffsetAction = new AnonymousClass2(null);
    }

    static final boolean setScrollSemanticsActions$lambda$0(Scrollable2DNode scrollable2DNode, float f2, float f3) {
        aj.z(scrollable2DNode.getCoroutineScope(), null, null, new Scrollable2DNode$setScrollSemanticsActions$1$1(scrollable2DNode, f2, f3, null), 3);
        return true;
    }

    private final void updateDefaultFlingBehavior() {
        if (isAttached()) {
            this.defaultFlingBehavior.updateDensity(DelegatableNodeKt.requireDensity(this));
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (getEnabled() && (this.scrollByAction == null || this.scrollByOffsetAction == null)) {
            setScrollSemanticsActions();
        }
        p<? super Float, ? super Float, Boolean> pVar = this.scrollByAction;
        if (pVar != null) {
            SemanticsPropertiesKt.scrollBy$default(semanticsPropertyReceiver, null, pVar, 1, null);
        }
        p<? super Offset, ? super e<? super Offset>, ? extends Object> pVar2 = this.scrollByOffsetAction;
        if (pVar2 != null) {
            SemanticsPropertiesKt.scrollByOffset(semanticsPropertyReceiver, pVar2);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public Object drag(p<? super l<? super DragEvent.DragDelta, ab>, ? super e<? super ab>, ? extends Object> pVar, e<? super ab> eVar) {
        Object objScroll = this.scrollingLogic.scroll(MutatePriority.UserInput, new Scrollable2DNode$drag$2$1(pVar, null), eVar);
        return objScroll == a.f48038a ? objScroll : ab.f48028a;
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

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean isImportantForBounds() {
        return true;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDefaultFlingBehavior();
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.ui.Modifier.Node, androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        onCancelPointerInput();
        updateDefaultFlingBehavior();
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public void onDragStopped(DragEvent.DragStopped dragStopped) {
        if (!ComposeFoundationFlags.isClearNestedScrollCoroutineScopeFixEnabled || isAttached()) {
            aj.z(this.nestedScrollDispatcher.getCoroutineScope(), null, null, new AnonymousClass1(dragStopped, null), 3);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo1940onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (getCanDrag().invoke(PointerType.m9679boximpl(changes.get(i2).m9611getTypeT8wyACA())).booleanValue()) {
                super.mo1940onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j2);
                return;
            }
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        return this.scrollingLogic.shouldScrollImmediately();
    }

    public final void update(Scrollable2DState scrollable2DState, OverscrollEffect overscrollEffect, boolean z, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource) {
        boolean z2;
        if (getEnabled() != z) {
            this.nestedScrollConnection.setEnabled(z);
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = z2;
        boolean zUpdate = this.scrollingLogic.update(scrollable2DState, overscrollEffect, flingBehavior == null ? this.defaultFlingBehavior : flingBehavior, this.nestedScrollDispatcher);
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        DragGestureNode.update$default(this, ScrollableKt.getCanDragCalculation(), z, mutableInteractionSource, null, zUpdate, 8, null);
        if (z3) {
            clearScrollSemanticsActions();
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public void mo2145onDragStartedk4lQ0M(long j2) {
    }
}
