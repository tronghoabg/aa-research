package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.ui.focus.Focusability;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Velocity;
import androidx.media3.muxer.MuxerUtil;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.a;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ScrollableNode extends DragGestureNode implements KeyInputModifierNode, SemanticsModifierNode, OnScrollChangedDispatcher {
    public static final int $stable = 8;
    private final ContentInViewNode contentInViewNode;
    private final ScrollableDefaultFlingBehavior defaultFlingBehavior;
    private FlingBehavior flingBehavior;
    private final FocusTargetModifierNode focusTargetModifierNode;
    private MouseWheelScrollingLogic mouseWheelScrollingLogic;
    private final ScrollableNestedScrollConnection nestedScrollConnection;
    private final NestedScrollDispatcher nestedScrollDispatcher;
    private OverscrollEffect overscrollEffect;
    private p<? super Float, ? super Float, Boolean> scrollByAction;
    private p<? super Offset, ? super e<? super Offset>, ? extends Object> scrollByOffsetAction;
    private final ScrollingLogic scrollingLogic;
    private final boolean shouldAutoInvalidate;
    private TrackpadScrollingLogic trackpadScrollingLogic;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$ensureMouseWheelScrollingLogicInitialized$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends a implements p<Velocity, e<? super ab>, Object> {
        AnonymousClass1(Object obj) {
            super(2, obj, ScrollableNode.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Object invoke(Velocity velocity, e<? super ab> eVar) {
            return m2303invokesFctU(velocity.m11415unboximpl(), eVar);
        }

        /* renamed from: invoke-sF-c-tU, reason: not valid java name */
        public final Object m2303invokesFctU(long j2, e<? super ab> eVar) {
            return ScrollableNode.ensureMouseWheelScrollingLogicInitialized$onWheelScrollStopped((ScrollableNode) this.receiver, j2, eVar);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$ensureTrackpadScrollingLogicInitialized$1, reason: invalid class name and case insensitive filesystem */
    final /* synthetic */ class C02481 extends a implements p<Velocity, e<? super ab>, Object> {
        C02481(Object obj) {
            super(2, obj, ScrollableNode.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Object invoke(Velocity velocity, e<? super ab> eVar) {
            return m2304invokesFctU(velocity.m11415unboximpl(), eVar);
        }

        /* renamed from: invoke-sF-c-tU, reason: not valid java name */
        public final Object m2304invokesFctU(long j2, e<? super ab> eVar) {
            return ScrollableNode.ensureTrackpadScrollingLogicInitialized$onTrackpadScrollStopped((ScrollableNode) this.receiver, j2, eVar);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$onDragStopped$1, reason: invalid class name and case insensitive filesystem */
    final class C02491 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ DragEvent.DragStopped $event;
        int label;
        final /* synthetic */ ScrollableNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02491(DragEvent.DragStopped dragStopped, ScrollableNode scrollableNode, e<? super C02491> eVar) {
            super(2, eVar);
            this.$event = dragStopped;
            this.this$0 = scrollableNode;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new C02491(this.$event, this.this$0, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C02491) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                float f2 = true != this.$event.isIndirectPointerEvent() ? 1.0f : -1.0f;
                ScrollableNode scrollableNode = this.this$0;
                DragEvent.DragStopped dragStopped = this.$event;
                this.label = 1;
                if (scrollableNode.scrollingLogic.m2315onScrollStoppedBMRW4eQ(Velocity.m11412timesadjELrA(dragStopped.m2182getVelocity9UxMQ8M(), f2), false, this) == aVar) {
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
    /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<Offset, e<? super Offset>, Object> {
        /* synthetic */ long J$0;
        int label;

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = ScrollableNode.this.new AnonymousClass2(eVar);
            anonymousClass2.J$0 = ((Offset) obj).m7990unboximpl();
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Object invoke(Offset offset, e<? super Offset> eVar) {
            return m2305invoke3MmeM6k(offset.m7990unboximpl(), eVar);
        }

        /* renamed from: invoke-3MmeM6k, reason: not valid java name */
        public final Object m2305invoke3MmeM6k(long j2, e<? super Offset> eVar) {
            return ((AnonymousClass2) create(Offset.m7969boximpl(j2), eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
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
            Object objM2296semanticsScrollByd4ec7I = ScrollableKt.m2296semanticsScrollByd4ec7I(ScrollableNode.this.scrollingLogic, j2, this);
            return objM2296semanticsScrollByd4ec7I == aVar ? aVar : objM2296semanticsScrollByd4ec7I;
        }
    }

    public ScrollableNode(ScrollableState scrollableState, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, Orientation orientation, boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec) {
        super(ScrollableKt.getCanDragCalculation(), z, mutableInteractionSource, orientation);
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        ScrollableDefaultFlingBehavior scrollableDefaultFlingBehaviorPlatformScrollableDefaultFlingBehavior = Scrollable_androidKt.platformScrollableDefaultFlingBehavior();
        this.defaultFlingBehavior = scrollableDefaultFlingBehaviorPlatformScrollableDefaultFlingBehavior;
        OverscrollEffect overscrollEffect2 = this.overscrollEffect;
        ScrollableDefaultFlingBehavior scrollableDefaultFlingBehavior = this.flingBehavior;
        ScrollingLogic scrollingLogic = new ScrollingLogic(scrollableState, overscrollEffect2, scrollableDefaultFlingBehavior == null ? scrollableDefaultFlingBehaviorPlatformScrollableDefaultFlingBehavior : scrollableDefaultFlingBehavior, orientation, z2, nestedScrollDispatcher, this, new h.g.a.a() { // from class: androidx.compose.foundation.gestures.ScrollableNode$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(this.f$0.isAttached());
            }
        });
        this.scrollingLogic = scrollingLogic;
        ScrollableNestedScrollConnection scrollableNestedScrollConnection = new ScrollableNestedScrollConnection(scrollingLogic, z);
        this.nestedScrollConnection = scrollableNestedScrollConnection;
        FocusTargetModifierNode focusTargetModifierNodeM7892FocusTargetModifierNodePYyLHbc$default = FocusTargetModifierNodeKt.m7892FocusTargetModifierNodePYyLHbc$default(Focusability.Companion.m7915getNeverLCbbffg(), null, 2, null);
        delegate(focusTargetModifierNodeM7892FocusTargetModifierNodePYyLHbc$default);
        this.focusTargetModifierNode = focusTargetModifierNodeM7892FocusTargetModifierNodePYyLHbc$default;
        ContentInViewNode contentInViewNode = new ContentInViewNode(orientation, scrollingLogic, z2, bringIntoViewSpec, new h.g.a.a() { // from class: androidx.compose.foundation.gestures.ScrollableNode$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return FocusTargetModifierNodeKt.getFocusedRect(this.f$0.focusTargetModifierNode);
            }
        });
        delegate(contentInViewNode);
        ContentInViewNode contentInViewNode2 = contentInViewNode;
        this.contentInViewNode = contentInViewNode2;
        delegate(NestedScrollNodeKt.nestedScrollModifierNode(scrollableNestedScrollConnection, nestedScrollDispatcher));
        delegate(new BringIntoViewResponderNode(contentInViewNode2));
    }

    private final void clearScrollSemanticsActions() {
        this.scrollByAction = null;
        this.scrollByOffsetAction = null;
    }

    private final void ensureMouseWheelScrollingLogicInitialized() {
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
        if (mouseWheelScrollingLogic == null) {
            MouseWheelScrollingLogic mouseWheelScrollingLogic2 = new MouseWheelScrollingLogic(this.scrollingLogic, AndroidScrollable_androidKt.platformScrollConfig(this), new AnonymousClass1(this), DelegatableNodeKt.requireDensity(this));
            this.mouseWheelScrollingLogic = mouseWheelScrollingLogic2;
            mouseWheelScrollingLogic = mouseWheelScrollingLogic2;
        }
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.startReceivingEvents(getCoroutineScope());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object ensureMouseWheelScrollingLogicInitialized$onWheelScrollStopped(ScrollableNode scrollableNode, long j2, e eVar) {
        scrollableNode.m2302onWheelScrollStoppedTH1AsA0(j2);
        return ab.f48028a;
    }

    private final void ensureTrackpadScrollingLogicInitialized() {
        TrackpadScrollingLogic trackpadScrollingLogic = this.trackpadScrollingLogic;
        if (trackpadScrollingLogic == null) {
            TrackpadScrollingLogic trackpadScrollingLogic2 = new TrackpadScrollingLogic(this.scrollingLogic, new C02481(this), DelegatableNodeKt.requireDensity(this));
            this.trackpadScrollingLogic = trackpadScrollingLogic2;
            trackpadScrollingLogic = trackpadScrollingLogic2;
        }
        if (trackpadScrollingLogic != null) {
            trackpadScrollingLogic.startReceivingEvents(getCoroutineScope());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object ensureTrackpadScrollingLogicInitialized$onTrackpadScrollStopped(ScrollableNode scrollableNode, long j2, e eVar) {
        scrollableNode.m2301onTrackpadScrollStoppedTH1AsA0(j2);
        return ab.f48028a;
    }

    /* renamed from: onTrackpadScrollStopped-TH1AsA0, reason: not valid java name */
    private final void m2301onTrackpadScrollStoppedTH1AsA0(long j2) {
        aj.z(this.nestedScrollDispatcher.getCoroutineScope(), null, null, new ScrollableNode$onTrackpadScrollStopped$1(this, j2, null), 3);
    }

    /* renamed from: onWheelScrollStopped-TH1AsA0, reason: not valid java name */
    private final void m2302onWheelScrollStoppedTH1AsA0(long j2) {
        aj.z(this.nestedScrollDispatcher.getCoroutineScope(), null, null, new ScrollableNode$onWheelScrollStopped$1(this, j2, null), 3);
    }

    private final void setScrollSemanticsActions() {
        this.scrollByAction = new p() { // from class: androidx.compose.foundation.gestures.ScrollableNode$$ExternalSyntheticLambda2
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                ScrollableNode.setScrollSemanticsActions$lambda$0(this.f$0, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                return true;
            }
        };
        this.scrollByOffsetAction = new AnonymousClass2(null);
    }

    static final boolean setScrollSemanticsActions$lambda$0(ScrollableNode scrollableNode, float f2, float f3) {
        aj.z(scrollableNode.getCoroutineScope(), null, null, new ScrollableNode$setScrollSemanticsActions$1$1(scrollableNode, f2, f3, null), 3);
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

    @Override // androidx.compose.foundation.gestures.OnScrollChangedDispatcher
    /* renamed from: dispatchScrollDeltaInfo-k-4lQ0M */
    public void mo2258dispatchScrollDeltaInfok4lQ0M(long j2) {
        if (isAttached()) {
            DelegatableNodeKt.m9918dispatchOnScrollChangedUv8p0NA(this, j2);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public Object drag(p<? super l<? super DragEvent.DragDelta, ab>, ? super e<? super ab>, ? extends Object> pVar, e<? super ab> eVar) {
        ScrollingLogic scrollingLogic = this.scrollingLogic;
        Object objScroll = scrollingLogic.scroll(MutatePriority.UserInput, new ScrollableNode$drag$2$1(pVar, scrollingLogic, null), eVar);
        return objScroll == h.c.a.a.f48038a ? objScroll : ab.f48028a;
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
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.updateDensity(DelegatableNodeKt.requireDensity(this));
        }
        TrackpadScrollingLogic trackpadScrollingLogic = this.trackpadScrollingLogic;
        if (trackpadScrollingLogic != null) {
            trackpadScrollingLogic.updateDensity(DelegatableNodeKt.requireDensity(this));
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.ui.Modifier.Node, androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        onCancelPointerInput();
        updateDefaultFlingBehavior();
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.updateDensity(DelegatableNodeKt.requireDensity(this));
        }
        TrackpadScrollingLogic trackpadScrollingLogic = this.trackpadScrollingLogic;
        if (trackpadScrollingLogic != null) {
            trackpadScrollingLogic.updateDensity(DelegatableNodeKt.requireDensity(this));
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public void onDragStopped(DragEvent.DragStopped dragStopped) {
        if (!ComposeFoundationFlags.isClearNestedScrollCoroutineScopeFixEnabled || isAttached()) {
            aj.z(this.nestedScrollDispatcher.getCoroutineScope(), null, null, new C02491(dragStopped, this, null), 3);
        }
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo1939onKeyEventZmokQxo(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        long j2;
        if (!getEnabled() || ((!Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9314getPageDownEK5gGoQ()) && !Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9315getPageUpEK5gGoQ())) || !KeyEventType.m9428equalsimpl0(KeyEvent_androidKt.m9436getTypeZmokQxo(keyEvent), KeyEventType.Companion.m9432getKeyDownCS__XNY()) || KeyEvent_androidKt.m9439isCtrlPressedZmokQxo(keyEvent))) {
            return false;
        }
        boolean zIsVertical = this.scrollingLogic.isVertical();
        ContentInViewNode contentInViewNode = this.contentInViewNode;
        if (zIsVertical) {
            float fM2163getViewportSizeOrZeroYbymL2g$foundation = (int) (contentInViewNode.m2163getViewportSizeOrZeroYbymL2g$foundation() & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            if (!Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9315getPageUpEK5gGoQ())) {
                fM2163getViewportSizeOrZeroYbymL2g$foundation = -fM2163getViewportSizeOrZeroYbymL2g$foundation;
            }
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fM2163getViewportSizeOrZeroYbymL2g$foundation);
            j2 = jFloatToRawIntBits2 << 32;
        } else {
            float fM2163getViewportSizeOrZeroYbymL2g$foundation2 = (int) (contentInViewNode.m2163getViewportSizeOrZeroYbymL2g$foundation() >> 32);
            if (!Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9315getPageUpEK5gGoQ())) {
                fM2163getViewportSizeOrZeroYbymL2g$foundation2 = -fM2163getViewportSizeOrZeroYbymL2g$foundation2;
            }
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fM2163getViewportSizeOrZeroYbymL2g$foundation2);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j2 = jFloatToRawIntBits3 << 32;
        }
        aj.z(getCoroutineScope(), null, null, new ScrollableNode$onKeyEvent$1(this, j2 | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & jFloatToRawIntBits), null), 3);
        return true;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo1940onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (getCanDrag().invoke(PointerType.m9679boximpl(changes.get(i2).m9611getTypeT8wyACA())).booleanValue()) {
                super.mo1940onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j2);
                break;
            }
            i2++;
        }
        if (getEnabled()) {
            initializePointerInputGestureCoordination();
            if (pointerEventPass == PointerEventPass.Initial && PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9563getScroll7fucELk())) {
                ensureMouseWheelScrollingLogicInitialized();
            }
            MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
            if (mouseWheelScrollingLogic != null) {
                mouseWheelScrollingLogic.mo2250onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j2);
            }
            if (pointerEventPass == PointerEventPass.Initial && (PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9557getPanStart7fucELk()) || PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9556getPanMove7fucELk()) || PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9555getPanEnd7fucELk()))) {
                ensureTrackpadScrollingLogicInitialized();
            }
            TrackpadScrollingLogic trackpadScrollingLogic = this.trackpadScrollingLogic;
            if (trackpadScrollingLogic != null) {
                trackpadScrollingLogic.mo2250onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j2);
            }
        }
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo1941onPreKeyEventZmokQxo(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        return this.scrollingLogic.shouldScrollImmediately();
    }

    public final void update(ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec) {
        boolean z3;
        if (getEnabled() != z) {
            this.nestedScrollConnection.setEnabled(z);
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z4 = z3;
        boolean zUpdate = this.scrollingLogic.update(scrollableState, orientation, overscrollEffect, z2, flingBehavior == null ? this.defaultFlingBehavior : flingBehavior, this.nestedScrollDispatcher);
        this.contentInViewNode.update(orientation, z2, bringIntoViewSpec);
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        update(ScrollableKt.getCanDragCalculation(), z, mutableInteractionSource, this.scrollingLogic.isVertical() ? Orientation.Vertical : Orientation.Horizontal, zUpdate);
        if (z4) {
            clearScrollSemanticsActions();
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public void mo2145onDragStartedk4lQ0M(long j2) {
    }
}
