package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.GestureNodeKt;
import androidx.compose.foundation.GestureState;
import androidx.compose.foundation.gestures.DragDetectionState;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.TouchBoundsExpansion;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.VelocityKt;
import androidx.media3.muxer.MuxerUtil;
import h.a.i;
import h.ab;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.am;
import h.g.b.aq;
import h.g.b.w;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.a.o;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class DragGestureNode extends DelegatingNode implements PointerInputModifierNode, IndirectPointerInputModifierNode, CompositionLocalConsumerModifierNode, DraggableGestureConnection {
    public static final int $stable = 8;
    private DragDetectionState.AwaitDown _awaitDownState;
    private DragDetectionState.AwaitGesturePickup _awaitGesturePickupState;
    private DragDetectionState.AwaitTouchSlop _awaitTouchSlopState;
    private DragDetectionState.Dragging _draggingState;
    private l<? super PointerType, Boolean> canDrag;
    private o<DragEvent> channel;
    private DragDetectionState currentDragState;
    private DragInteraction.Start dragInteraction;
    private boolean enabled;
    private IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector;
    private DelegatableNode indirectTouchGestureNode;
    private MutableInteractionSource interactionSource;
    private boolean isListeningForEvents;
    private boolean isListeningForPointerInputEvents;
    private Orientation orientation;
    private DelegatableNode pointerInputGestureNode;
    private TouchSlopDetector touchSlopDetector;
    private VelocityTracker velocityTracker;
    private final l<PointerType, Boolean> _canDrag = new l() { // from class: androidx.compose.foundation.gestures.DragGestureNode$$ExternalSyntheticLambda1
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return Boolean.valueOf(this.f$0.canDrag.invoke((PointerType) obj).booleanValue());
        }
    };
    private long dragAccumulator = Offset.Companion.m7996getZeroF1C5BW0();
    private long previousPositionOnScreen = Offset.Companion.m7995getUnspecifiedF1C5BW0();
    private long nodeOffset = Offset.Companion.m7996getZeroF1C5BW0();

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DragDetectionState.AwaitDown.AwaitTouchSlop.values().length];
            try {
                iArr[DragDetectionState.AwaitDown.AwaitTouchSlop.NotInitialized.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragGestureNode.this.processDragCancel(this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1, reason: invalid class name and case insensitive filesystem */
    final class C02351 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C02351(e<? super C02351> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragGestureNode.this.processDragStart(null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1, reason: invalid class name and case insensitive filesystem */
    final class C02361 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C02361(e<? super C02361> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragGestureNode.this.processDragStop(null, this);
        }
    }

    public DragGestureNode(l<? super PointerType, Boolean> lVar, boolean z, MutableInteractionSource mutableInteractionSource, Orientation orientation) {
        this.orientation = orientation;
        this.canDrag = lVar;
        this.enabled = z;
        this.interactionSource = mutableInteractionSource;
    }

    private final DragDetectionState.AwaitDown getAwaitDownState() {
        DragDetectionState.AwaitDown awaitDown = this._awaitDownState;
        if (awaitDown != null) {
            return awaitDown;
        }
        DragDetectionState.AwaitDown awaitDown2 = new DragDetectionState.AwaitDown(null, false, false, 7, null);
        this._awaitDownState = awaitDown2;
        return awaitDown2;
    }

    private final DragDetectionState.AwaitGesturePickup getAwaitGesturePickupState() {
        DragDetectionState.AwaitGesturePickup awaitGesturePickup = this._awaitGesturePickupState;
        if (awaitGesturePickup != null) {
            return awaitGesturePickup;
        }
        DragDetectionState.AwaitGesturePickup awaitGesturePickup2 = new DragDetectionState.AwaitGesturePickup(null, 0L, null, 7, null);
        this._awaitGesturePickupState = awaitGesturePickup2;
        return awaitGesturePickup2;
    }

    private final DragDetectionState.AwaitTouchSlop getAwaitTouchSlopState() {
        DragDetectionState.AwaitTouchSlop awaitTouchSlop = this._awaitTouchSlopState;
        if (awaitTouchSlop != null) {
            return awaitTouchSlop;
        }
        DragDetectionState.AwaitTouchSlop awaitTouchSlop2 = new DragDetectionState.AwaitTouchSlop(null, 0L, false, 7, null);
        this._awaitTouchSlopState = awaitTouchSlop2;
        return awaitTouchSlop2;
    }

    private final DragDetectionState.Dragging getDraggingState() {
        DragDetectionState.Dragging dragging = this._draggingState;
        if (dragging != null) {
            return dragging;
        }
        DragDetectionState.Dragging dragging2 = new DragDetectionState.Dragging(0L, 1, null);
        this._draggingState = dragging2;
        return dragging2;
    }

    private final void moveToAwaitDownState() {
        this.dragAccumulator = Offset.Companion.m7996getZeroF1C5BW0();
        DragDetectionState.AwaitDown awaitDownState = getAwaitDownState();
        awaitDownState.setAwaitTouchSlop(DragDetectionState.AwaitDown.AwaitTouchSlop.NotInitialized);
        awaitDownState.setConsumedOnInitial(false);
        awaitDownState.setHasSeenInitialEvent(false);
        this.currentDragState = awaitDownState;
    }

    /* renamed from: moveToAwaitGesturePickupState-rnUCldI, reason: not valid java name */
    private final void m2204moveToAwaitGesturePickupStaternUCldI(PointerInputChange pointerInputChange, long j2, TouchSlopDetector touchSlopDetector) {
        DragDetectionState.AwaitGesturePickup awaitGesturePickupState = getAwaitGesturePickupState();
        awaitGesturePickupState.setInitialDown(pointerInputChange);
        awaitGesturePickupState.m2175setPointerId0FcD4WY(j2);
        TouchSlopDetector.m2333resetk4lQ0M$default(touchSlopDetector, 0L, 1, null);
        awaitGesturePickupState.setTouchSlopDetector(touchSlopDetector);
        this.currentDragState = awaitGesturePickupState;
    }

    /* renamed from: moveToAwaitTouchSlopState-aWI9W7U, reason: not valid java name */
    private final void m2205moveToAwaitTouchSlopStateaWI9W7U(PointerInputChange pointerInputChange, long j2, long j3, boolean z) {
        DragDetectionState.AwaitTouchSlop awaitTouchSlopState = getAwaitTouchSlopState();
        awaitTouchSlopState.setInitialDown(pointerInputChange);
        awaitTouchSlopState.m2177setPointerId0FcD4WY(j2);
        TouchSlopDetector touchSlopDetector = this.touchSlopDetector;
        if (touchSlopDetector == null) {
            this.touchSlopDetector = new TouchSlopDetector(getOrientation(), 0L, 2, null);
        } else {
            touchSlopDetector.setOrientation(getOrientation());
            TouchSlopDetector touchSlopDetector2 = this.touchSlopDetector;
            if (touchSlopDetector2 != null) {
                touchSlopDetector2.m2338resetk4lQ0M(j3);
            }
        }
        awaitTouchSlopState.setVerifyConsumptionInFinalPass(z);
        this.currentDragState = awaitTouchSlopState;
    }

    /* renamed from: moveToAwaitTouchSlopState-aWI9W7U$default, reason: not valid java name */
    static /* synthetic */ void m2206moveToAwaitTouchSlopStateaWI9W7U$default(DragGestureNode dragGestureNode, PointerInputChange pointerInputChange, long j2, long j3, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: moveToAwaitTouchSlopState-aWI9W7U");
        }
        if ((i2 & 4) != 0) {
            j3 = Offset.Companion.m7996getZeroF1C5BW0();
        }
        dragGestureNode.m2205moveToAwaitTouchSlopStateaWI9W7U(pointerInputChange, j2, j3, ((i2 & 8) == 0) & z);
    }

    /* renamed from: moveToDraggingState-0FcD4WY, reason: not valid java name */
    private final void m2207moveToDraggingState0FcD4WY(long j2) {
        DragDetectionState.Dragging draggingState = getDraggingState();
        draggingState.m2179setPointerId0FcD4WY(j2);
        this.currentDragState = draggingState;
    }

    private final void processAwaitGesturePickup(PointerEvent pointerEvent, PointerEventPass pointerEventPass, DragDetectionState.AwaitGesturePickup awaitGesturePickup) {
        boolean z;
        if (pointerEventPass != PointerEventPass.Final) {
            return;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                z = true;
                break;
            } else {
                if (changes.get(i3).isConsumed()) {
                    z = false;
                    break;
                }
                i3++;
            }
        }
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        while (true) {
            if (i2 >= size2) {
                break;
            }
            if (!changes2.get(i2).getPressed()) {
                i2++;
            } else if (!pointerEvent.getChanges().isEmpty()) {
                if (z) {
                    long jM9608getPositionF1C5BW0 = ((PointerInputChange) i.P(pointerEvent.getChanges())).m9608getPositionF1C5BW0();
                    PointerInputChange initialDown = awaitGesturePickup.getInitialDown();
                    if (initialDown == null) {
                        x.g();
                    }
                    long jM7984minusMKHz9U = Offset.m7984minusMKHz9U(jM9608getPositionF1C5BW0, initialDown.m9608getPositionF1C5BW0());
                    PointerInputChange initialDown2 = awaitGesturePickup.getInitialDown();
                    if (initialDown2 == null) {
                        throw new IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.");
                    }
                    m2206moveToAwaitTouchSlopStateaWI9W7U$default(this, initialDown2, awaitGesturePickup.m2174getPointerIdJ3iCeTQ(), jM7984minusMKHz9U, false, 8, null);
                    return;
                }
                return;
            }
        }
        moveToAwaitDownState();
    }

    private final void processAwaitTouchSlop(PointerEvent pointerEvent, PointerEventPass pointerEventPass, DragDetectionState.AwaitTouchSlop awaitTouchSlop) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        boolean zIsDragAngleAlignedWithOrientation;
        PointerInputChange pointerInputChange3;
        if (pointerEventPass == PointerEventPass.Initial) {
            return;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        while (true) {
            pointerInputChange = null;
            if (i2 >= size) {
                pointerInputChange2 = null;
                break;
            }
            pointerInputChange2 = changes.get(i2);
            if (PointerId.m9587equalsimpl0(pointerInputChange2.m9605getIdJ3iCeTQ(), awaitTouchSlop.m2176getPointerIdJ3iCeTQ())) {
                break;
            } else {
                i2++;
            }
        }
        PointerInputChange pointerInputChange4 = pointerInputChange2;
        if (pointerInputChange4 == null) {
            List<PointerInputChange> changes2 = pointerEvent.getChanges();
            int size2 = changes2.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    pointerInputChange3 = null;
                    break;
                }
                pointerInputChange3 = changes2.get(i3);
                if (pointerInputChange3.getPressed()) {
                    break;
                } else {
                    i3++;
                }
            }
            pointerInputChange4 = pointerInputChange3;
            if (pointerInputChange4 == null) {
                moveToAwaitDownState();
                return;
            }
            awaitTouchSlop.m2177setPointerId0FcD4WY(pointerInputChange4.m9605getIdJ3iCeTQ());
        }
        if (pointerEventPass == PointerEventPass.Main) {
            if (pointerInputChange4.isConsumed()) {
                PointerInputChange initialDown = awaitTouchSlop.getInitialDown();
                if (initialDown == null) {
                    throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                }
                long jM2176getPointerIdJ3iCeTQ = awaitTouchSlop.m2176getPointerIdJ3iCeTQ();
                TouchSlopDetector touchSlopDetector = this.touchSlopDetector;
                if (touchSlopDetector == null) {
                    throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
                m2204moveToAwaitGesturePickupStaternUCldI(initialDown, jM2176getPointerIdJ3iCeTQ, touchSlopDetector);
            } else if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                List<PointerInputChange> changes3 = pointerEvent.getChanges();
                int size3 = changes3.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        break;
                    }
                    PointerInputChange pointerInputChange5 = changes3.get(i4);
                    if (pointerInputChange5.getPressed()) {
                        pointerInputChange = pointerInputChange5;
                        break;
                    }
                    i4++;
                }
                PointerInputChange pointerInputChange6 = pointerInputChange;
                if (pointerInputChange6 == null) {
                    moveToAwaitDownState();
                } else {
                    awaitTouchSlop.m2177setPointerId0FcD4WY(pointerInputChange6.m9605getIdJ3iCeTQ());
                }
            } else {
                long jM2335getPostSlopOffsetqto3Fdw = requireTouchSlopDetector().m2335getPostSlopOffsetqto3Fdw(PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange4), DragGestureDetectorKt.m2202pointerSlopE8SPZFQ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalViewConfiguration()), pointerInputChange4.m9611getTypeT8wyACA()), false | (!((4 & 4) == 0)));
                if ((9223372034707292159L & jM2335getPostSlopOffsetqto3Fdw) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                    this.dragAccumulator = Offset.m7985plusMKHz9U(this.dragAccumulator, PointerEventKt.positionChange(pointerInputChange4));
                    final float fAtan2 = ((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (this.dragAccumulator & MuxerUtil.UNSIGNED_INT_MAX_VALUE))), Math.abs(Float.intBitsToFloat((int) (r11 >> 32))))) * 57.29578f;
                    if (getOrientation() == null) {
                        zIsDragAngleAlignedWithOrientation = true;
                    } else {
                        Orientation orientation = getOrientation();
                        if (orientation == null) {
                            x.g();
                        }
                        zIsDragAngleAlignedWithOrientation = DraggableKt.isDragAngleAlignedWithOrientation(orientation, fAtan2);
                    }
                    final am amVar = new am();
                    DraggableKt.traverseParentDraggableGestures(this, new l() { // from class: androidx.compose.foundation.gestures.DragGestureNode$$ExternalSyntheticLambda0
                        @Override // h.g.a.l
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(DragGestureNode.processAwaitTouchSlop$lambda$3(fAtan2, amVar, (DraggableGestureConnection) obj));
                        }
                    });
                    if (zIsDragAngleAlignedWithOrientation || !amVar.f48101a) {
                        pointerInputChange4.consume();
                        PointerInputChange initialDown2 = awaitTouchSlop.getInitialDown();
                        if (initialDown2 == null) {
                            x.g();
                        }
                        m2209sendDragStart0AR0LA0(initialDown2, pointerInputChange4, jM2335getPostSlopOffsetqto3Fdw);
                        m2208sendDragEventUv8p0NA(pointerInputChange4, jM2335getPostSlopOffsetqto3Fdw);
                        m2207moveToDraggingState0FcD4WY(pointerInputChange4.m9605getIdJ3iCeTQ());
                    } else {
                        awaitTouchSlop.setVerifyConsumptionInFinalPass(true);
                    }
                } else {
                    awaitTouchSlop.setVerifyConsumptionInFinalPass(true);
                    this.dragAccumulator = Offset.m7985plusMKHz9U(this.dragAccumulator, PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange4));
                }
            }
        }
        if (pointerEventPass == PointerEventPass.Final && awaitTouchSlop.getVerifyConsumptionInFinalPass()) {
            if (!pointerInputChange4.isConsumed()) {
                awaitTouchSlop.setVerifyConsumptionInFinalPass(false);
                return;
            }
            PointerInputChange initialDown3 = awaitTouchSlop.getInitialDown();
            if (initialDown3 == null) {
                throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
            }
            long jM2176getPointerIdJ3iCeTQ2 = awaitTouchSlop.m2176getPointerIdJ3iCeTQ();
            TouchSlopDetector touchSlopDetector2 = this.touchSlopDetector;
            if (touchSlopDetector2 == null) {
                throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
            }
            m2204moveToAwaitGesturePickupStaternUCldI(initialDown3, jM2176getPointerIdJ3iCeTQ2, touchSlopDetector2);
        }
    }

    static final boolean processAwaitTouchSlop$lambda$3(float f2, am amVar, DraggableGestureConnection draggableGestureConnection) {
        boolean zIsDragAngleAlignedWithOrientation;
        boolean zM2029equalsimpl0 = GestureState.m2029equalsimpl0(draggableGestureConnection.mo1934getGestureState7meUWtM(), GestureState.Companion.m2035getWaiting7meUWtM());
        if (draggableGestureConnection.getOrientation() == null) {
            zIsDragAngleAlignedWithOrientation = false;
        } else {
            Orientation orientation = draggableGestureConnection.getOrientation();
            if (orientation == null) {
                x.g();
            }
            zIsDragAngleAlignedWithOrientation = DraggableKt.isDragAngleAlignedWithOrientation(orientation, f2);
        }
        boolean z = amVar.f48101a || (zM2029equalsimpl0 && zIsDragAngleAlignedWithOrientation);
        amVar.f48101a = z;
        return !z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processDragCancel(h.c.e<? super h.ab> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.DragGestureNode.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            e.b.c.b(r7)
            goto L4c
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            e.b.c.b(r7)
            androidx.compose.foundation.interaction.DragInteraction$Start r7 = r6.dragInteraction
            if (r7 == 0) goto L4e
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r6.interactionSource
            if (r2 == 0) goto L4c
            androidx.compose.foundation.interaction.DragInteraction$Cancel r5 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r5.<init>(r7)
            androidx.compose.foundation.interaction.Interaction r5 = (androidx.compose.foundation.interaction.Interaction) r5
            r0.label = r4
            java.lang.Object r7 = r2.emit(r5, r0)
            if (r7 == r1) goto L4b
            goto L4c
        L4b:
            return r1
        L4c:
            r6.dragInteraction = r3
        L4e:
            androidx.compose.foundation.gestures.DragEvent$DragStopped r7 = new androidx.compose.foundation.gestures.DragEvent$DragStopped
            androidx.compose.ui.unit.Velocity$Companion r0 = androidx.compose.ui.unit.Velocity.Companion
            long r0 = r0.m11417getZero9UxMQ8M()
            r2 = 0
            r7.<init>(r0, r2, r3)
            r6.onDragStopped(r7)
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.processDragCancel(h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r2.emit(r8, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processDragStart(androidx.compose.foundation.gestures.DragEvent.DragStarted r7, h.c.e<? super h.ab> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureNode.C02351
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode.C02351) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.L$1
            androidx.compose.foundation.interaction.DragInteraction$Start r7 = (androidx.compose.foundation.interaction.DragInteraction.Start) r7
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.DragEvent$DragStarted r0 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) r0
            e.b.c.b(r8)
            goto L7a
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.Object r7 = r0.L$0
            androidx.compose.foundation.gestures.DragEvent$DragStarted r7 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) r7
            e.b.c.b(r8)
            goto L5e
        L42:
            e.b.c.b(r8)
            androidx.compose.foundation.interaction.DragInteraction$Start r8 = r6.dragInteraction
            if (r8 == 0) goto L5e
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r6.interactionSource
            if (r2 == 0) goto L5e
            androidx.compose.foundation.interaction.DragInteraction$Cancel r5 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r5.<init>(r8)
            androidx.compose.foundation.interaction.Interaction r5 = (androidx.compose.foundation.interaction.Interaction) r5
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r2.emit(r5, r0)
            if (r8 == r1) goto L77
        L5e:
            androidx.compose.foundation.interaction.DragInteraction$Start r8 = new androidx.compose.foundation.interaction.DragInteraction$Start
            r8.<init>()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r6.interactionSource
            if (r2 == 0) goto L78
            r4 = r8
            androidx.compose.foundation.interaction.Interaction r4 = (androidx.compose.foundation.interaction.Interaction) r4
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r0 = r2.emit(r4, r0)
            if (r0 == r1) goto L77
            goto L78
        L77:
            return r1
        L78:
            r0 = r7
            r7 = r8
        L7a:
            r6.dragInteraction = r7
            long r7 = r0.m2181getStartPointF1C5BW0()
            r6.mo2145onDragStartedk4lQ0M(r7)
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.processDragStart(androidx.compose.foundation.gestures.DragEvent$DragStarted, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processDragStop(androidx.compose.foundation.gestures.DragEvent.DragStopped r6, h.c.e<? super h.ab> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.DragGestureNode.C02361
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode.C02361) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.L$0
            androidx.compose.foundation.gestures.DragEvent$DragStopped r6 = (androidx.compose.foundation.gestures.DragEvent.DragStopped) r6
            e.b.c.b(r7)
            goto L51
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            e.b.c.b(r7)
            androidx.compose.foundation.interaction.DragInteraction$Start r7 = r5.dragInteraction
            if (r7 == 0) goto L54
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r5.interactionSource
            if (r2 == 0) goto L51
            androidx.compose.foundation.interaction.DragInteraction$Stop r4 = new androidx.compose.foundation.interaction.DragInteraction$Stop
            r4.<init>(r7)
            androidx.compose.foundation.interaction.Interaction r4 = (androidx.compose.foundation.interaction.Interaction) r4
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r2.emit(r4, r0)
            if (r7 == r1) goto L50
            goto L51
        L50:
            return r1
        L51:
            r7 = 0
            r5.dragInteraction = r7
        L54:
            r5.onDragStopped(r6)
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.processDragStop(androidx.compose.foundation.gestures.DragEvent$DragStopped, h.c.e):java.lang.Object");
    }

    private final void processDraggingState(PointerEvent pointerEvent, PointerEventPass pointerEventPass, DragDetectionState.Dragging dragging) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (pointerEventPass != PointerEventPass.Main) {
            return;
        }
        long jM2178getPointerIdJ3iCeTQ = dragging.m2178getPointerIdJ3iCeTQ();
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            pointerInputChange = null;
            if (i3 >= size) {
                pointerInputChange2 = null;
                break;
            }
            pointerInputChange2 = changes.get(i3);
            if (PointerId.m9587equalsimpl0(pointerInputChange2.m9605getIdJ3iCeTQ(), jM2178getPointerIdJ3iCeTQ)) {
                break;
            } else {
                i3++;
            }
        }
        PointerInputChange pointerInputChange3 = pointerInputChange2;
        if (pointerInputChange3 != null) {
            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                if (pointerInputChange3.isConsumed()) {
                    sendDragCancelled();
                    return;
                } else {
                    if (Offset.m7978getDistanceimpl(PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange3)) != 0.0f) {
                        m2208sendDragEventUv8p0NA(pointerInputChange3, PointerEventKt.positionChange(pointerInputChange3));
                        pointerInputChange3.consume();
                        return;
                    }
                    return;
                }
            }
            List<PointerInputChange> changes2 = pointerEvent.getChanges();
            int size2 = changes2.size();
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                PointerInputChange pointerInputChange4 = changes2.get(i2);
                if (pointerInputChange4.getPressed()) {
                    pointerInputChange = pointerInputChange4;
                    break;
                }
                i2++;
            }
            PointerInputChange pointerInputChange5 = pointerInputChange;
            if (pointerInputChange5 != null) {
                dragging.m2179setPointerId0FcD4WY(pointerInputChange5.m9605getIdJ3iCeTQ());
                return;
            }
            if (pointerInputChange3.isConsumed() || !PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                sendDragCancelled();
            } else {
                sendDragStopped(pointerInputChange3);
            }
            moveToAwaitDownState();
        }
    }

    private final void processInitialDownState(PointerEvent pointerEvent, PointerEventPass pointerEventPass, DragDetectionState.AwaitDown awaitDown) {
        if (!pointerEvent.getChanges().isEmpty() && TapGestureDetectorKt.isChangedToDown$default(pointerEvent, false, false, 2, null)) {
            PointerInputChange pointerInputChange = (PointerInputChange) i.P(pointerEvent.getChanges());
            DragDetectionState.AwaitDown.AwaitTouchSlop awaitTouchSlop = awaitDown.getAwaitTouchSlop();
            DragDetectionState.AwaitDown.AwaitTouchSlop awaitTouchSlop2 = DragDetectionState.AwaitDown.AwaitTouchSlop.Yes;
            DragDetectionState.AwaitDown.AwaitTouchSlop awaitTouchSlop3 = awaitTouchSlop.ordinal() != 2 ? awaitDown.getAwaitTouchSlop() : !startDragImmediately() ? DragDetectionState.AwaitDown.AwaitTouchSlop.Yes : DragDetectionState.AwaitDown.AwaitTouchSlop.No;
            awaitDown.setAwaitTouchSlop(awaitTouchSlop3);
            if (pointerEventPass == PointerEventPass.Initial) {
                if (awaitTouchSlop3 == DragDetectionState.AwaitDown.AwaitTouchSlop.No) {
                    pointerInputChange.consume();
                    awaitDown.setConsumedOnInitial(true);
                }
                awaitDown.setHasSeenInitialEvent(true);
            }
            if (pointerEventPass == PointerEventPass.Main) {
                if (awaitTouchSlop3 == DragDetectionState.AwaitDown.AwaitTouchSlop.Yes) {
                    m2206moveToAwaitTouchSlopStateaWI9W7U$default(this, pointerInputChange, pointerInputChange.m9605getIdJ3iCeTQ(), 0L, false, 12, null);
                } else if (awaitDown.getConsumedOnInitial()) {
                    m2209sendDragStart0AR0LA0(pointerInputChange, pointerInputChange, Offset.Companion.m7996getZeroF1C5BW0());
                    m2208sendDragEventUv8p0NA(pointerInputChange, Offset.Companion.m7996getZeroF1C5BW0());
                    m2207moveToDraggingState0FcD4WY(pointerInputChange.m9605getIdJ3iCeTQ());
                }
            }
        }
    }

    private final void processRawPointerEvent(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
        DragDetectionState dragDetectionState = this.currentDragState;
        if (dragDetectionState == null) {
            throw new IllegalArgumentException("currentDragState should not be null");
        }
        if (dragDetectionState instanceof DragDetectionState.AwaitDown) {
            processInitialDownState(pointerEvent, pointerEventPass, (DragDetectionState.AwaitDown) dragDetectionState);
            return;
        }
        if (dragDetectionState instanceof DragDetectionState.AwaitTouchSlop) {
            processAwaitTouchSlop(pointerEvent, pointerEventPass, (DragDetectionState.AwaitTouchSlop) dragDetectionState);
        } else if (dragDetectionState instanceof DragDetectionState.AwaitGesturePickup) {
            processAwaitGesturePickup(pointerEvent, pointerEventPass, (DragDetectionState.AwaitGesturePickup) dragDetectionState);
        } else {
            if (!(dragDetectionState instanceof DragDetectionState.Dragging)) {
                throw new h.i();
            }
            processDraggingState(pointerEvent, pointerEventPass, (DragDetectionState.Dragging) dragDetectionState);
        }
    }

    private final o<DragEvent> requireChannel() {
        o<DragEvent> oVar = this.channel;
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalArgumentException("Events channel not initialized.");
    }

    private final TouchSlopDetector requireTouchSlopDetector() {
        TouchSlopDetector touchSlopDetector = this.touchSlopDetector;
        if (touchSlopDetector != null) {
            return touchSlopDetector;
        }
        throw new IllegalArgumentException("Touch slop detector not initialized.");
    }

    private final VelocityTracker requireVelocityTracker() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            return velocityTracker;
        }
        throw new IllegalArgumentException("Velocity Tracker not initialized.");
    }

    private final void resetDragDetectionState() {
        moveToAwaitDownState();
        if (this.isListeningForEvents) {
            sendDragCancelled();
        }
        this.velocityTracker = null;
    }

    private final void resetGestureNodes() {
        DelegatableNode delegatableNode = this.indirectTouchGestureNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        DelegatableNode delegatableNode2 = this.pointerInputGestureNode;
        if (delegatableNode2 != null) {
            undelegate(delegatableNode2);
        }
        this.indirectTouchGestureNode = null;
        this.pointerInputGestureNode = null;
    }

    private final void sendDragCancelled() {
        requireChannel().i(DragEvent.DragCancelled.INSTANCE);
    }

    /* renamed from: sendDragEvent-Uv8p0NA, reason: not valid java name */
    private final void m2208sendDragEventUv8p0NA(PointerInputChange pointerInputChange, long j2) {
        this.dragAccumulator = Offset.m7985plusMKHz9U(this.dragAccumulator, j2);
        if (ComposeFoundationFlags.isDragNodeOffsetDoubleCountingFixEnabled) {
            VelocityTrackerKt.addPointerInputChange(requireVelocityTracker(), pointerInputChange);
        } else {
            long jPositionOnScreen = LayoutCoordinatesKt.positionOnScreen(DelegatableNodeKt.requireLayoutCoordinates(getNode()));
            if (!Offset.m7977equalsimpl0(this.previousPositionOnScreen, Offset.Companion.m7995getUnspecifiedF1C5BW0())) {
                long j3 = this.previousPositionOnScreen;
                if (!Offset.m7977equalsimpl0(jPositionOnScreen, j3)) {
                    this.nodeOffset = Offset.m7985plusMKHz9U(this.nodeOffset, Offset.m7984minusMKHz9U(jPositionOnScreen, j3));
                }
            }
            this.previousPositionOnScreen = jPositionOnScreen;
            VelocityTrackerKt.m9716addPointerInputChange0AR0LA0(requireVelocityTracker(), pointerInputChange, this.nodeOffset);
        }
        requireChannel().i(new DragEvent.DragDelta(j2, false, null));
    }

    /* renamed from: sendDragStart-0AR0LA0, reason: not valid java name */
    private final void m2209sendDragStart0AR0LA0(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j2) {
        if (this.velocityTracker == null) {
            this.velocityTracker = new VelocityTracker();
        }
        VelocityTrackerKt.addPointerInputChange(requireVelocityTracker(), pointerInputChange);
        long jM7984minusMKHz9U = Offset.m7984minusMKHz9U(pointerInputChange2.m9608getPositionF1C5BW0(), j2);
        if (!ComposeFoundationFlags.isDragNodeOffsetDoubleCountingFixEnabled) {
            this.nodeOffset = Offset.Companion.m7996getZeroF1C5BW0();
        }
        if (this.canDrag.invoke(PointerType.m9679boximpl(pointerInputChange.m9611getTypeT8wyACA())).booleanValue()) {
            if (!this.isListeningForEvents) {
                if (this.channel == null) {
                    this.channel = w.c(Integer.MAX_VALUE, null, null, 6);
                }
                startListeningForEvents();
            }
            if (!ComposeFoundationFlags.isDragNodeOffsetDoubleCountingFixEnabled) {
                this.previousPositionOnScreen = LayoutCoordinatesKt.positionOnScreen(DelegatableNodeKt.requireLayoutCoordinates(this));
            }
            requireChannel().i(new DragEvent.DragStarted(jM7984minusMKHz9U, null));
        }
    }

    private final void sendDragStopped(PointerInputChange pointerInputChange) {
        VelocityTrackerKt.addPointerInputChange(requireVelocityTracker(), pointerInputChange);
        float maximumFlingVelocity = ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
        long jM9715calculateVelocityAH228Gc = requireVelocityTracker().m9715calculateVelocityAH228Gc(VelocityKt.Velocity(maximumFlingVelocity, maximumFlingVelocity));
        requireVelocityTracker().resetTracking();
        requireChannel().i(new DragEvent.DragStopped(DraggableKt.m2214toValidVelocityTH1AsA0(jM9715calculateVelocityAH228Gc), false, null));
        this.isListeningForPointerInputEvents = false;
    }

    private final void startListeningForEvents() {
        this.isListeningForEvents = true;
        if (this.channel == null) {
            this.channel = w.c(Integer.MAX_VALUE, null, null, 6);
        }
        aj.z(getCoroutineScope(), null, null, new C02371(null), 3);
    }

    public static /* synthetic */ void update$default(DragGestureNode dragGestureNode, l lVar, boolean z, MutableInteractionSource mutableInteractionSource, Orientation orientation, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i2 & 1) != 0) {
            lVar = dragGestureNode.canDrag;
        }
        if ((i2 & 2) != 0) {
            z = dragGestureNode.enabled;
        }
        if ((i2 & 4) != 0) {
            mutableInteractionSource = dragGestureNode.interactionSource;
        }
        if ((i2 & 8) != 0) {
            orientation = dragGestureNode.getOrientation();
        }
        dragGestureNode.update(lVar, z, mutableInteractionSource, orientation, ((i2 & 16) == 0) & z2);
    }

    public final void disposeInteractionSource() {
        DragInteraction.Start start = this.dragInteraction;
        if (start != null) {
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                mutableInteractionSource.tryEmit(new DragInteraction.Cancel(start));
            }
            this.dragInteraction = null;
        }
    }

    public abstract Object drag(p<? super l<? super DragEvent.DragDelta, ab>, ? super e<? super ab>, ? extends Object> pVar, e<? super ab> eVar);

    public final l<PointerType, Boolean> getCanDrag() {
        return this.canDrag;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // androidx.compose.foundation.GestureConnection
    /* renamed from: getGestureState-7meUWtM */
    public String mo1934getGestureState7meUWtM() {
        if (!this.enabled) {
            return GestureState.Companion.m2033getIdle7meUWtM();
        }
        DragDetectionState dragDetectionState = this.currentDragState;
        return dragDetectionState instanceof DragDetectionState.AwaitDown ? ((DragDetectionState.AwaitDown) dragDetectionState).getHasSeenInitialEvent() ? GestureState.Companion.m2035getWaiting7meUWtM() : GestureState.Companion.m2033getIdle7meUWtM() : dragDetectionState instanceof DragDetectionState.AwaitTouchSlop ? GestureState.Companion.m2035getWaiting7meUWtM() : dragDetectionState instanceof DragDetectionState.AwaitGesturePickup ? GestureState.Companion.m2035getWaiting7meUWtM() : dragDetectionState instanceof DragDetectionState.Dragging ? GestureState.Companion.m2034getRecognized7meUWtM() : GestureState.Companion.m2033getIdle7meUWtM();
    }

    protected final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    @Override // androidx.compose.foundation.gestures.DraggableGestureConnection
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public /* synthetic */ long mo1935getTouchBoundsExpansionRZrCHBk() {
        return TouchBoundsExpansion.Companion.m10170getNoneRZrCHBk();
    }

    protected final void initializeIndirectTouchGestureCoordination() {
        if (this.indirectTouchGestureNode == null) {
            IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector = this.indirectPointerInputDragCycleDetector;
            x.d(indirectPointerInputDragCycleDetector, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DraggableGestureConnection");
            DelegatableNode delegatableNodeGestureNode = GestureNodeKt.gestureNode(indirectPointerInputDragCycleDetector);
            delegate(delegatableNodeGestureNode);
            this.indirectTouchGestureNode = delegatableNodeGestureNode;
        }
    }

    protected final void initializePointerInputGestureCoordination() {
        if (this.pointerInputGestureNode == null) {
            DelegatableNode delegatableNodeGestureNode = GestureNodeKt.gestureNode(this);
            delegate(delegatableNodeGestureNode);
            this.pointerInputGestureNode = delegatableNodeGestureNode;
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    public final boolean isListeningForEvents$foundation() {
        return this.isListeningForEvents;
    }

    public final boolean isListeningForPointerInputEvents$foundation() {
        return this.isListeningForPointerInputEvents;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public void onCancelIndirectPointerInput() {
        IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector = this.indirectPointerInputDragCycleDetector;
        if (indirectPointerInputDragCycleDetector != null) {
            indirectPointerInputDragCycleDetector.resetDragDetectionState();
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        if (this.isListeningForPointerInputEvents) {
            resetDragDetectionState();
        }
        this.isListeningForPointerInputEvents = false;
    }

    @Override // androidx.compose.ui.Modifier.Node, androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onDensityChange() {
        onCancelPointerInput();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.isListeningForEvents = false;
        disposeInteractionSource();
        if (!ComposeFoundationFlags.isDragNodeOffsetDoubleCountingFixEnabled) {
            this.nodeOffset = Offset.Companion.m7996getZeroF1C5BW0();
        }
        resetGestureNodes();
    }

    public final void onDragEvent(DragEvent dragEvent) {
        if ((dragEvent instanceof DragEvent.DragStarted) && !this.isListeningForEvents) {
            this.isListeningForEvents = true;
            startListeningForEvents();
        }
        requireChannel().i(dragEvent);
    }

    /* renamed from: onDragStarted-k-4lQ0M */
    public abstract void mo2145onDragStartedk4lQ0M(long j2);

    public abstract void onDragStopped(DragEvent.DragStopped dragStopped);

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public void onIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent, PointerEventPass pointerEventPass) {
        if (this.enabled) {
            if (this.indirectPointerInputDragCycleDetector == null) {
                this.indirectPointerInputDragCycleDetector = new IndirectPointerInputDragCycleDetector(this);
            }
            initializeIndirectTouchGestureCoordination();
            IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector = this.indirectPointerInputDragCycleDetector;
            if (indirectPointerInputDragCycleDetector != null) {
                indirectPointerInputDragCycleDetector.processIndirectPointerInputEvent(indirectPointerEvent, pointerEventPass);
            }
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo1940onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        this.isListeningForPointerInputEvents = true;
        if (this.enabled) {
            initializePointerInputGestureCoordination();
            if (this.currentDragState == null) {
                this.currentDragState = getAwaitDownState();
            }
            processRawPointerEvent(pointerEvent, pointerEventPass);
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onViewConfigurationChange() {
        onCancelPointerInput();
    }

    public final void setListeningForEvents$foundation(boolean z) {
        this.isListeningForEvents = z;
    }

    public final void setListeningForPointerInputEvents$foundation(boolean z) {
        this.isListeningForPointerInputEvents = z;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean sharePointerInputWithSiblings() {
        return false;
    }

    public abstract boolean startDragImmediately();

    public final void update(l<? super PointerType, Boolean> lVar, boolean z, MutableInteractionSource mutableInteractionSource, Orientation orientation, boolean z2) {
        this.canDrag = lVar;
        if (this.enabled != z) {
            this.enabled = z;
            z2 = true;
            if (!z) {
                resetGestureNodes();
                disposeInteractionSource();
                this.indirectPointerInputDragCycleDetector = null;
            }
        }
        if (!x.n(this.interactionSource, mutableInteractionSource)) {
            disposeInteractionSource();
            this.interactionSource = mutableInteractionSource;
        }
        if (getOrientation() != orientation) {
            setOrientation(orientation);
        } else if (!z2) {
            return;
        }
        if (this.isListeningForPointerInputEvents) {
            resetDragDetectionState();
        }
        IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector = this.indirectPointerInputDragCycleDetector;
        if (indirectPointerInputDragCycleDetector != null) {
            indirectPointerInputDragCycleDetector.resetDragDetectionState();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1, reason: invalid class name and case insensitive filesystem */
    final class C02371 extends g implements p<af, e<? super ab>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        C02371(e<? super C02371> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C02371 c02371 = DragGestureNode.this.new C02371(eVar);
            c02371.L$0 = obj;
            return c02371;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C02371) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x00f1, code lost:
        
            if (r8.this$0.processDragCancel(r8) == r0) goto L46;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0052 A[PHI: r1
  0x0052: PHI (r1v27 kotlinx.coroutines.af) = 
  (r1v2 kotlinx.coroutines.af)
  (r1v10 kotlinx.coroutines.af)
  (r1v11 kotlinx.coroutines.af)
  (r1v17 kotlinx.coroutines.af)
  (r1v22 kotlinx.coroutines.af)
  (r1v31 kotlinx.coroutines.af)
 binds: [B:15:0x004a, B:8:0x001c, B:45:0x0108, B:42:0x00f4, B:47:0x010b, B:6:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00bd A[Catch: CancellationException -> 0x00f7, PHI: r1 r3
  0x00bd: PHI (r1v13 h.g.b.aq) = (r1v8 h.g.b.aq), (r1v19 h.g.b.aq) binds: [B:11:0x0028, B:31:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x00bd: PHI (r3v9 kotlinx.coroutines.af) = (r3v5 kotlinx.coroutines.af), (r3v10 kotlinx.coroutines.af) binds: [B:11:0x0028, B:31:0x00bb] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {CancellationException -> 0x00f7, blocks: (B:30:0x00a4, B:32:0x00bd, B:34:0x00c3, B:37:0x00dd, B:39:0x00e1, B:11:0x0028), top: B:51:0x0028 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c3 A[Catch: CancellationException -> 0x00f7, TryCatch #0 {CancellationException -> 0x00f7, blocks: (B:30:0x00a4, B:32:0x00bd, B:34:0x00c3, B:37:0x00dd, B:39:0x00e1, B:11:0x0028), top: B:51:0x0028 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00dd A[Catch: CancellationException -> 0x00f7, TryCatch #0 {CancellationException -> 0x00f7, blocks: (B:30:0x00a4, B:32:0x00bd, B:34:0x00c3, B:37:0x00dd, B:39:0x00e1, B:11:0x0028), top: B:51:0x0028 }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x010e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00f4 -> B:16:0x0052). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0108 -> B:16:0x0052). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x010b -> B:16:0x0052). Please report as a decompilation issue!!! */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 292
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.C02371.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1, reason: invalid class name and collision with other inner class name */
        final class C00321 extends g implements p<l<? super DragEvent.DragDelta, ? extends ab>, e<? super ab>, Object> {
            final /* synthetic */ aq<DragEvent> $event;
            /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ DragGestureNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00321(aq<DragEvent> aqVar, DragGestureNode dragGestureNode, e<? super C00321> eVar) {
                super(2, eVar);
                this.$event = aqVar;
                this.this$0 = dragGestureNode;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                C00321 c00321 = new C00321(this.$event, this.this$0, eVar);
                c00321.L$0 = obj;
                return c00321;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(l<? super DragEvent.DragDelta, ab> lVar, e<? super ab> eVar) {
                return ((C00321) create(lVar, eVar)).invokeSuspend(ab.f48028a);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0047 -> B:25:0x005c). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0056 -> B:24:0x0059). Please report as a decompilation issue!!! */
            @Override // h.c.b.a.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    h.c.a.a r0 = h.c.a.a.f48038a
                    int r1 = r5.label
                    r2 = 1
                    if (r1 == 0) goto L1d
                    if (r1 != r2) goto L15
                    java.lang.Object r1 = r5.L$1
                    h.g.b.aq r1 = (h.g.b.aq) r1
                    java.lang.Object r3 = r5.L$0
                    h.g.a.l r3 = (h.g.a.l) r3
                    e.b.c.b(r6)
                    goto L59
                L15:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L1d:
                    e.b.c.b(r6)
                    java.lang.Object r6 = r5.L$0
                    h.g.a.l r6 = (h.g.a.l) r6
                    r3 = r6
                L25:
                    h.g.b.aq<androidx.compose.foundation.gestures.DragEvent> r6 = r5.$event
                    java.lang.Object r6 = r6.f48105a
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped
                    if (r1 != 0) goto L5f
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.DragEvent.DragCancelled
                    if (r1 != 0) goto L5f
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.DragEvent.DragDelta
                    r4 = 0
                    if (r1 == 0) goto L39
                    androidx.compose.foundation.gestures.DragEvent$DragDelta r6 = (androidx.compose.foundation.gestures.DragEvent.DragDelta) r6
                    goto L3a
                L39:
                    r6 = r4
                L3a:
                    if (r6 == 0) goto L3f
                    r3.invoke(r6)
                L3f:
                    h.g.b.aq<androidx.compose.foundation.gestures.DragEvent> r1 = r5.$event
                    androidx.compose.foundation.gestures.DragGestureNode r6 = r5.this$0
                    kotlinx.coroutines.a.o r6 = androidx.compose.foundation.gestures.DragGestureNode.access$getChannel$p(r6)
                    if (r6 == 0) goto L5c
                    r4 = r5
                    h.c.e r4 = (h.c.e) r4
                    r5.L$0 = r3
                    r5.L$1 = r1
                    r5.label = r2
                    java.lang.Object r6 = r6.d(r4)
                    if (r6 != r0) goto L59
                    return r0
                L59:
                    r4 = r6
                    androidx.compose.foundation.gestures.DragEvent r4 = (androidx.compose.foundation.gestures.DragEvent) r4
                L5c:
                    r1.f48105a = r4
                    goto L25
                L5f:
                    h.ab r5 = h.ab.f48028a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.C02371.C00321.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // h.g.a.p
            public /* bridge */ /* synthetic */ Object invoke(l<? super DragEvent.DragDelta, ? extends ab> lVar, e<? super ab> eVar) {
                return invoke2((l<? super DragEvent.DragDelta, ab>) lVar, eVar);
            }
        }
    }
}
