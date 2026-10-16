package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.GestureState;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.VelocityKt;
import h.a.i;
import h.d.a;
import h.d.b;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class IndirectPointerInputDragCycleDetector implements DraggableGestureConnection {
    public static final int $stable = 8;
    private DragDetectionState.AwaitDown _awaitDownState;
    private DragDetectionState.AwaitGesturePickup _awaitGesturePickupState;
    private DragDetectionState.AwaitTouchSlop _awaitTouchSlopState;
    private DragDetectionState.Dragging _draggingState;
    private DragDetectionState currentDragState;
    private final DragGestureNode node;
    private TouchSlopDetector touchSlopDetector;
    private VelocityTracker velocityTracker;
    private String gestureState = GestureState.Companion.m2033getIdle7meUWtM();
    private long previousPositionOnScreen = Offset.Companion.m7995getUnspecifiedF1C5BW0();
    private final IndirectPointerInputEventSmoother touchSmooth = new IndirectPointerInputEventSmoother();
    private final OffsetSmoother offsetSmoother = new OffsetSmoother();
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

    public IndirectPointerInputDragCycleDetector(DragGestureNode dragGestureNode) {
        this.node = dragGestureNode;
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
        DragDetectionState.AwaitDown awaitDownState = getAwaitDownState();
        awaitDownState.setAwaitTouchSlop(DragDetectionState.AwaitDown.AwaitTouchSlop.NotInitialized);
        awaitDownState.setConsumedOnInitial(false);
        awaitDownState.setHasSeenInitialEvent(false);
        this.currentDragState = awaitDownState;
    }

    /* renamed from: moveToAwaitGesturePickupState-rnUCldI, reason: not valid java name */
    private final void m2220moveToAwaitGesturePickupStaternUCldI(IndirectPointerInputChange indirectPointerInputChange, long j2, TouchSlopDetector touchSlopDetector) {
        DragDetectionState.AwaitGesturePickup awaitGesturePickupState = getAwaitGesturePickupState();
        awaitGesturePickupState.setInitialDown(indirectPointerInputChange);
        awaitGesturePickupState.m2228setPointerId0FcD4WY(j2);
        TouchSlopDetector.m2333resetk4lQ0M$default(touchSlopDetector, 0L, 1, null);
        awaitGesturePickupState.setTouchSlopDetector(touchSlopDetector);
        this.currentDragState = awaitGesturePickupState;
    }

    /* renamed from: moveToAwaitTouchSlopState-aWI9W7U, reason: not valid java name */
    private final void m2221moveToAwaitTouchSlopStateaWI9W7U(IndirectPointerInputChange indirectPointerInputChange, long j2, long j3, boolean z) {
        DragDetectionState.AwaitTouchSlop awaitTouchSlopState = getAwaitTouchSlopState();
        awaitTouchSlopState.setInitialDown(indirectPointerInputChange);
        awaitTouchSlopState.m2230setPointerId0FcD4WY(j2);
        TouchSlopDetector touchSlopDetector = this.touchSlopDetector;
        DragGestureNode dragGestureNode = this.node;
        if (touchSlopDetector == null) {
            this.touchSlopDetector = new TouchSlopDetector(dragGestureNode.getOrientation(), 0L, 2, null);
        } else {
            touchSlopDetector.setOrientation(dragGestureNode.getOrientation());
            TouchSlopDetector touchSlopDetector2 = this.touchSlopDetector;
            if (touchSlopDetector2 != null) {
                touchSlopDetector2.m2338resetk4lQ0M(j3);
            }
        }
        awaitTouchSlopState.setVerifyConsumptionInFinalPass(z);
        this.currentDragState = awaitTouchSlopState;
    }

    /* renamed from: moveToAwaitTouchSlopState-aWI9W7U$default, reason: not valid java name */
    static /* synthetic */ void m2222moveToAwaitTouchSlopStateaWI9W7U$default(IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector, IndirectPointerInputChange indirectPointerInputChange, long j2, long j3, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j3 = Offset.Companion.m7996getZeroF1C5BW0();
        }
        indirectPointerInputDragCycleDetector.m2221moveToAwaitTouchSlopStateaWI9W7U(indirectPointerInputChange, j2, j3, ((i2 & 8) == 0) & z);
    }

    /* renamed from: moveToDraggingState-0FcD4WY, reason: not valid java name */
    private final void m2223moveToDraggingState0FcD4WY(long j2) {
        DragDetectionState.Dragging draggingState = getDraggingState();
        draggingState.m2232setPointerId0FcD4WY(j2);
        this.currentDragState = draggingState;
    }

    private final void processAwaitGesturePickup(IndirectPointerEvent indirectPointerEvent, PointerEventPass pointerEventPass, DragDetectionState.AwaitGesturePickup awaitGesturePickup) {
        boolean z;
        if (pointerEventPass != PointerEventPass.Final) {
            return;
        }
        List<IndirectPointerInputChange> changes = indirectPointerEvent.getChanges();
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
        List<IndirectPointerInputChange> changes2 = indirectPointerEvent.getChanges();
        int size2 = changes2.size();
        while (true) {
            if (i2 >= size2) {
                break;
            }
            if (!changes2.get(i2).getPressed()) {
                i2++;
            } else if (!indirectPointerEvent.getChanges().isEmpty()) {
                if (z) {
                    long jM2244primaryAxisPosition_bfSUIo = IndirectPointerInputDragCycleDetectorKt.m2244primaryAxisPosition_bfSUIo((IndirectPointerInputChange) i.P(indirectPointerEvent.getChanges()), this.node.getOrientation(), IndirectPointerEventPrimaryDirectionalMotionAxis.m9086boximpl(indirectPointerEvent.mo9081getPrimaryDirectionalMotionAxisnZO2Niw()));
                    IndirectPointerInputChange initialDown = awaitGesturePickup.getInitialDown();
                    if (initialDown == null) {
                        x.g();
                    }
                    long jM7984minusMKHz9U = Offset.m7984minusMKHz9U(jM2244primaryAxisPosition_bfSUIo, IndirectPointerInputDragCycleDetectorKt.m2244primaryAxisPosition_bfSUIo(initialDown, this.node.getOrientation(), IndirectPointerEventPrimaryDirectionalMotionAxis.m9086boximpl(indirectPointerEvent.mo9081getPrimaryDirectionalMotionAxisnZO2Niw())));
                    IndirectPointerInputChange initialDown2 = awaitGesturePickup.getInitialDown();
                    if (initialDown2 == null) {
                        throw new IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.");
                    }
                    m2222moveToAwaitTouchSlopStateaWI9W7U$default(this, initialDown2, awaitGesturePickup.m2227getPointerIdJ3iCeTQ(), jM7984minusMKHz9U, false, 8, null);
                    return;
                }
                return;
            }
        }
        moveToAwaitDownState();
    }

    private final void processAwaitTouchSlop(IndirectPointerEvent indirectPointerEvent, PointerEventPass pointerEventPass, DragDetectionState.AwaitTouchSlop awaitTouchSlop) {
        IndirectPointerInputChange indirectPointerInputChange;
        IndirectPointerInputChange indirectPointerInputChange2;
        IndirectPointerInputChange indirectPointerInputChange3;
        if (pointerEventPass == PointerEventPass.Initial) {
            return;
        }
        List<IndirectPointerInputChange> changes = indirectPointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        while (true) {
            indirectPointerInputChange = null;
            if (i2 >= size) {
                indirectPointerInputChange2 = null;
                break;
            }
            indirectPointerInputChange2 = changes.get(i2);
            if (PointerId.m9587equalsimpl0(indirectPointerInputChange2.m9107getIdJ3iCeTQ(), awaitTouchSlop.m2229getPointerIdJ3iCeTQ())) {
                break;
            } else {
                i2++;
            }
        }
        IndirectPointerInputChange indirectPointerInputChange4 = indirectPointerInputChange2;
        if (indirectPointerInputChange4 == null) {
            List<IndirectPointerInputChange> changes2 = indirectPointerEvent.getChanges();
            int size2 = changes2.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    indirectPointerInputChange3 = null;
                    break;
                }
                indirectPointerInputChange3 = changes2.get(i3);
                if (indirectPointerInputChange3.getPressed()) {
                    break;
                } else {
                    i3++;
                }
            }
            indirectPointerInputChange4 = indirectPointerInputChange3;
            if (indirectPointerInputChange4 == null) {
                moveToAwaitDownState();
                return;
            }
            awaitTouchSlop.m2230setPointerId0FcD4WY(indirectPointerInputChange4.m9107getIdJ3iCeTQ());
        }
        IndirectPointerInputChange indirectPointerInputChange5 = indirectPointerInputChange4;
        if (pointerEventPass == PointerEventPass.Main) {
            if (indirectPointerInputChange5.isConsumed()) {
                IndirectPointerInputChange initialDown = awaitTouchSlop.getInitialDown();
                if (initialDown == null) {
                    throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                }
                long jM2229getPointerIdJ3iCeTQ = awaitTouchSlop.m2229getPointerIdJ3iCeTQ();
                TouchSlopDetector touchSlopDetector = this.touchSlopDetector;
                if (touchSlopDetector == null) {
                    throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
                m2220moveToAwaitGesturePickupStaternUCldI(initialDown, jM2229getPointerIdJ3iCeTQ, touchSlopDetector);
            } else if (IndirectPointerInputDragCycleDetectorKt.changedToUpIgnoreConsumed(indirectPointerInputChange5)) {
                List<IndirectPointerInputChange> changes3 = indirectPointerEvent.getChanges();
                int size3 = changes3.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        break;
                    }
                    IndirectPointerInputChange indirectPointerInputChange6 = changes3.get(i4);
                    if (indirectPointerInputChange6.getPressed()) {
                        indirectPointerInputChange = indirectPointerInputChange6;
                        break;
                    }
                    i4++;
                }
                IndirectPointerInputChange indirectPointerInputChange7 = indirectPointerInputChange;
                if (indirectPointerInputChange7 == null) {
                    moveToAwaitDownState();
                } else {
                    awaitTouchSlop.m2230setPointerId0FcD4WY(indirectPointerInputChange7.m9107getIdJ3iCeTQ());
                }
            } else {
                long jM2335getPostSlopOffsetqto3Fdw = requireTouchSlopDetector().m2335getPostSlopOffsetqto3Fdw(IndirectPointerInputDragCycleDetectorKt.m2241positionChangeIgnoreConsumed_bfSUIo(indirectPointerInputChange5, this.node.getOrientation(), IndirectPointerEventPrimaryDirectionalMotionAxis.m9086boximpl(indirectPointerEvent.mo9081getPrimaryDirectionalMotionAxisnZO2Niw())), DragGestureDetectorKt.m2202pointerSlopE8SPZFQ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.node, CompositionLocalsKt.getLocalViewConfiguration()), PointerType.Companion.m9689getTouchT8wyACA()), false | (!((4 & 4) == 0)));
                if ((9223372034707292159L & jM2335getPostSlopOffsetqto3Fdw) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                    indirectPointerInputChange5.consume();
                    IndirectPointerInputChange initialDown2 = awaitTouchSlop.getInitialDown();
                    if (initialDown2 == null) {
                        x.g();
                    }
                    m2225sendDragStart3f7A7Is(initialDown2, indirectPointerInputChange5, IndirectPointerEventPrimaryDirectionalMotionAxis.m9086boximpl(indirectPointerEvent.mo9081getPrimaryDirectionalMotionAxisnZO2Niw()), jM2335getPostSlopOffsetqto3Fdw);
                    m2224sendDragEventEu1f8Dk(indirectPointerInputChange5, IndirectPointerEventPrimaryDirectionalMotionAxis.m9086boximpl(indirectPointerEvent.mo9081getPrimaryDirectionalMotionAxisnZO2Niw()), jM2335getPostSlopOffsetqto3Fdw);
                    m2223moveToDraggingState0FcD4WY(indirectPointerInputChange5.m9107getIdJ3iCeTQ());
                } else {
                    awaitTouchSlop.setVerifyConsumptionInFinalPass(true);
                }
            }
        }
        if (pointerEventPass == PointerEventPass.Final && awaitTouchSlop.getVerifyConsumptionInFinalPass()) {
            if (!indirectPointerInputChange5.isConsumed()) {
                awaitTouchSlop.setVerifyConsumptionInFinalPass(false);
                return;
            }
            IndirectPointerInputChange initialDown3 = awaitTouchSlop.getInitialDown();
            if (initialDown3 == null) {
                throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
            }
            long jM2229getPointerIdJ3iCeTQ2 = awaitTouchSlop.m2229getPointerIdJ3iCeTQ();
            TouchSlopDetector touchSlopDetector2 = this.touchSlopDetector;
            if (touchSlopDetector2 == null) {
                throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
            }
            m2220moveToAwaitGesturePickupStaternUCldI(initialDown3, jM2229getPointerIdJ3iCeTQ2, touchSlopDetector2);
        }
    }

    private final void processDraggingState(IndirectPointerEvent indirectPointerEvent, PointerEventPass pointerEventPass, DragDetectionState.Dragging dragging) {
        IndirectPointerInputChange indirectPointerInputChange;
        IndirectPointerInputChange indirectPointerInputChange2;
        if (pointerEventPass != PointerEventPass.Main) {
            return;
        }
        long jM2231getPointerIdJ3iCeTQ = dragging.m2231getPointerIdJ3iCeTQ();
        List<IndirectPointerInputChange> changes = indirectPointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            indirectPointerInputChange = null;
            if (i3 >= size) {
                indirectPointerInputChange2 = null;
                break;
            }
            indirectPointerInputChange2 = changes.get(i3);
            if (PointerId.m9587equalsimpl0(indirectPointerInputChange2.m9107getIdJ3iCeTQ(), jM2231getPointerIdJ3iCeTQ)) {
                break;
            } else {
                i3++;
            }
        }
        IndirectPointerInputChange indirectPointerInputChange3 = indirectPointerInputChange2;
        if (indirectPointerInputChange3 != null) {
            if (!IndirectPointerInputDragCycleDetectorKt.changedToUpIgnoreConsumed(indirectPointerInputChange3)) {
                if (indirectPointerInputChange3.isConsumed()) {
                    sendDragCancelled();
                    return;
                } else {
                    if (Offset.m7978getDistanceimpl(IndirectPointerInputDragCycleDetectorKt.m2241positionChangeIgnoreConsumed_bfSUIo(indirectPointerInputChange3, this.node.getOrientation(), IndirectPointerEventPrimaryDirectionalMotionAxis.m9086boximpl(indirectPointerEvent.mo9081getPrimaryDirectionalMotionAxisnZO2Niw()))) != 0.0f) {
                        m2224sendDragEventEu1f8Dk(indirectPointerInputChange3, IndirectPointerEventPrimaryDirectionalMotionAxis.m9086boximpl(indirectPointerEvent.mo9081getPrimaryDirectionalMotionAxisnZO2Niw()), IndirectPointerInputDragCycleDetectorKt.m2240positionChange_bfSUIo(indirectPointerInputChange3, this.node.getOrientation(), IndirectPointerEventPrimaryDirectionalMotionAxis.m9086boximpl(indirectPointerEvent.mo9081getPrimaryDirectionalMotionAxisnZO2Niw())));
                        indirectPointerInputChange3.consume();
                        return;
                    }
                    return;
                }
            }
            List<IndirectPointerInputChange> changes2 = indirectPointerEvent.getChanges();
            int size2 = changes2.size();
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                IndirectPointerInputChange indirectPointerInputChange4 = changes2.get(i2);
                if (indirectPointerInputChange4.getPressed()) {
                    indirectPointerInputChange = indirectPointerInputChange4;
                    break;
                }
                i2++;
            }
            IndirectPointerInputChange indirectPointerInputChange5 = indirectPointerInputChange;
            if (indirectPointerInputChange5 != null) {
                dragging.m2232setPointerId0FcD4WY(indirectPointerInputChange5.m9107getIdJ3iCeTQ());
                return;
            }
            if (indirectPointerInputChange3.isConsumed() || !IndirectPointerInputDragCycleDetectorKt.changedToUpIgnoreConsumed(indirectPointerInputChange3)) {
                sendDragCancelled();
            } else {
                m2226sendDragStoppedk92h6UU(indirectPointerInputChange3, IndirectPointerEventPrimaryDirectionalMotionAxis.m9086boximpl(indirectPointerEvent.mo9081getPrimaryDirectionalMotionAxisnZO2Niw()));
            }
            moveToAwaitDownState();
        }
    }

    private final void processInitialDownState(IndirectPointerEvent indirectPointerEvent, PointerEventPass pointerEventPass, DragDetectionState.AwaitDown awaitDown) {
        if (indirectPointerEvent.getChanges().isEmpty()) {
            return;
        }
        List<IndirectPointerInputChange> changes = indirectPointerEvent.getChanges();
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!IndirectPointerInputDragCycleDetectorKt.changedToDownIgnoreConsumed(changes.get(i2))) {
                return;
            }
        }
        IndirectPointerInputChange indirectPointerInputChange = (IndirectPointerInputChange) i.P(indirectPointerEvent.getChanges());
        DragDetectionState.AwaitDown.AwaitTouchSlop awaitTouchSlop = awaitDown.getAwaitTouchSlop();
        DragDetectionState.AwaitDown.AwaitTouchSlop awaitTouchSlop2 = DragDetectionState.AwaitDown.AwaitTouchSlop.Yes;
        DragDetectionState.AwaitDown.AwaitTouchSlop awaitTouchSlop3 = awaitTouchSlop.ordinal() != 2 ? awaitDown.getAwaitTouchSlop() : !this.node.startDragImmediately() ? DragDetectionState.AwaitDown.AwaitTouchSlop.Yes : DragDetectionState.AwaitDown.AwaitTouchSlop.No;
        awaitDown.setAwaitTouchSlop(awaitTouchSlop3);
        if (pointerEventPass == PointerEventPass.Initial) {
            if (awaitTouchSlop3 == DragDetectionState.AwaitDown.AwaitTouchSlop.No) {
                indirectPointerInputChange.consume();
                awaitDown.setConsumedOnInitial(true);
            }
            awaitDown.setHasSeenInitialEvent(true);
        }
        if (pointerEventPass == PointerEventPass.Main) {
            if (awaitTouchSlop3 == DragDetectionState.AwaitDown.AwaitTouchSlop.Yes) {
                m2222moveToAwaitTouchSlopStateaWI9W7U$default(this, indirectPointerInputChange, indirectPointerInputChange.m9107getIdJ3iCeTQ(), 0L, false, 12, null);
            } else if (awaitDown.getConsumedOnInitial()) {
                m2225sendDragStart3f7A7Is(indirectPointerInputChange, indirectPointerInputChange, IndirectPointerEventPrimaryDirectionalMotionAxis.m9086boximpl(indirectPointerEvent.mo9081getPrimaryDirectionalMotionAxisnZO2Niw()), Offset.Companion.m7996getZeroF1C5BW0());
                m2224sendDragEventEu1f8Dk(indirectPointerInputChange, IndirectPointerEventPrimaryDirectionalMotionAxis.m9086boximpl(indirectPointerEvent.mo9081getPrimaryDirectionalMotionAxisnZO2Niw()), Offset.Companion.m7996getZeroF1C5BW0());
                m2223moveToDraggingState0FcD4WY(indirectPointerInputChange.m9107getIdJ3iCeTQ());
            }
        }
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

    private final void sendDragCancelled() {
        this.node.onDragEvent(DragEvent.DragCancelled.INSTANCE);
    }

    /* renamed from: sendDragEvent-Eu1f8Dk, reason: not valid java name */
    private final void m2224sendDragEventEu1f8Dk(IndirectPointerInputChange indirectPointerInputChange, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, long j2) {
        if (!ComposeFoundationFlags.isDragNodeOffsetDoubleCountingFixEnabled) {
            long jPositionOnScreen = LayoutCoordinatesKt.positionOnScreen(DelegatableNodeKt.requireLayoutCoordinates(this.node));
            if (!Offset.m7977equalsimpl0(this.previousPositionOnScreen, Offset.Companion.m7995getUnspecifiedF1C5BW0())) {
                long j3 = this.previousPositionOnScreen;
                if (!Offset.m7977equalsimpl0(jPositionOnScreen, j3)) {
                    this.nodeOffset = Offset.m7985plusMKHz9U(this.nodeOffset, Offset.m7984minusMKHz9U(jPositionOnScreen, j3));
                }
            }
            this.previousPositionOnScreen = jPositionOnScreen;
        }
        Orientation orientation = this.node.getOrientation();
        if (orientation == null) {
            x.g();
        }
        if (Math.abs(DraggableKt.m2212toFloat3MmeM6k(j2, orientation)) > 2.0f) {
            if (ComposeFoundationFlags.isDragNodeOffsetDoubleCountingFixEnabled) {
                VelocityTracker velocityTrackerRequireVelocityTracker = requireVelocityTracker();
                DragGestureNode dragGestureNode = this.node;
                IndirectPointerInputDragCycleDetectorKt.m2239addIndirectPointerInputChangejUCIxP8(velocityTrackerRequireVelocityTracker, indirectPointerInputChange, dragGestureNode.getOrientation(), indirectPointerEventPrimaryDirectionalMotionAxis, this.touchSmooth);
            } else {
                VelocityTracker velocityTrackerRequireVelocityTracker2 = requireVelocityTracker();
                DragGestureNode dragGestureNode2 = this.node;
                IndirectPointerInputDragCycleDetectorKt.m2238addIndirectPointerInputChangeQf4Zb88(velocityTrackerRequireVelocityTracker2, indirectPointerInputChange, dragGestureNode2.getOrientation(), indirectPointerEventPrimaryDirectionalMotionAxis, this.touchSmooth, this.nodeOffset);
            }
            this.node.onDragEvent(new DragEvent.DragDelta(this.offsetSmoother.m2257smoothEventPositionMKHz9U(j2), true, null));
        }
    }

    /* renamed from: sendDragStart-3f7A7Is, reason: not valid java name */
    private final void m2225sendDragStart3f7A7Is(IndirectPointerInputChange indirectPointerInputChange, IndirectPointerInputChange indirectPointerInputChange2, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, long j2) {
        IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis2;
        if (this.velocityTracker == null) {
            this.velocityTracker = new VelocityTracker();
        }
        if (!ComposeFoundationFlags.isDragNodeOffsetDoubleCountingFixEnabled) {
            this.nodeOffset = Offset.Companion.m7996getZeroF1C5BW0();
        }
        if (ComposeFoundationFlags.isDragNodeOffsetDoubleCountingFixEnabled) {
            indirectPointerEventPrimaryDirectionalMotionAxis2 = indirectPointerEventPrimaryDirectionalMotionAxis;
            VelocityTracker velocityTrackerRequireVelocityTracker = requireVelocityTracker();
            DragGestureNode dragGestureNode = this.node;
            IndirectPointerInputDragCycleDetectorKt.m2239addIndirectPointerInputChangejUCIxP8(velocityTrackerRequireVelocityTracker, indirectPointerInputChange, dragGestureNode.getOrientation(), indirectPointerEventPrimaryDirectionalMotionAxis2, this.touchSmooth);
        } else {
            VelocityTracker velocityTrackerRequireVelocityTracker2 = requireVelocityTracker();
            DragGestureNode dragGestureNode2 = this.node;
            indirectPointerEventPrimaryDirectionalMotionAxis2 = indirectPointerEventPrimaryDirectionalMotionAxis;
            IndirectPointerInputDragCycleDetectorKt.m2238addIndirectPointerInputChangeQf4Zb88(velocityTrackerRequireVelocityTracker2, indirectPointerInputChange, dragGestureNode2.getOrientation(), indirectPointerEventPrimaryDirectionalMotionAxis2, this.touchSmooth, this.nodeOffset);
        }
        long jM7984minusMKHz9U = Offset.m7984minusMKHz9U(IndirectPointerInputDragCycleDetectorKt.m2244primaryAxisPosition_bfSUIo(indirectPointerInputChange2, this.node.getOrientation(), indirectPointerEventPrimaryDirectionalMotionAxis2), j2);
        if (this.node.getCanDrag().invoke(PointerType.m9679boximpl(PointerType.Companion.m9689getTouchT8wyACA())).booleanValue()) {
            if (!ComposeFoundationFlags.isDragNodeOffsetDoubleCountingFixEnabled) {
                this.previousPositionOnScreen = LayoutCoordinatesKt.positionOnScreen(DelegatableNodeKt.requireLayoutCoordinates(this.node));
            }
            this.node.onDragEvent(new DragEvent.DragStarted(jM7984minusMKHz9U, null));
        }
        this.offsetSmoother.reset();
    }

    /* renamed from: sendDragStopped-k92h6UU, reason: not valid java name */
    private final void m2226sendDragStoppedk92h6UU(IndirectPointerInputChange indirectPointerInputChange, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        if (ComposeFoundationFlags.isDragNodeOffsetDoubleCountingFixEnabled) {
            VelocityTracker velocityTrackerRequireVelocityTracker = requireVelocityTracker();
            DragGestureNode dragGestureNode = this.node;
            IndirectPointerInputDragCycleDetectorKt.m2239addIndirectPointerInputChangejUCIxP8(velocityTrackerRequireVelocityTracker, indirectPointerInputChange, dragGestureNode.getOrientation(), indirectPointerEventPrimaryDirectionalMotionAxis, this.touchSmooth);
        } else {
            VelocityTracker velocityTrackerRequireVelocityTracker2 = requireVelocityTracker();
            DragGestureNode dragGestureNode2 = this.node;
            IndirectPointerInputDragCycleDetectorKt.m2238addIndirectPointerInputChangeQf4Zb88(velocityTrackerRequireVelocityTracker2, indirectPointerInputChange, dragGestureNode2.getOrientation(), indirectPointerEventPrimaryDirectionalMotionAxis, this.touchSmooth, this.nodeOffset);
        }
        float maximumFlingVelocity = ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.node, CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
        long jM9715calculateVelocityAH228Gc = requireVelocityTracker().m9715calculateVelocityAH228Gc(VelocityKt.Velocity(maximumFlingVelocity, maximumFlingVelocity));
        requireVelocityTracker().resetTracking();
        this.node.onDragEvent(new DragEvent.DragStopped(DraggableKt.m2214toValidVelocityTH1AsA0(jM9715calculateVelocityAH228Gc), true, null));
    }

    @Override // androidx.compose.foundation.GestureConnection
    /* renamed from: getGestureState-7meUWtM */
    public String mo1934getGestureState7meUWtM() {
        DragDetectionState dragDetectionState = this.currentDragState;
        return dragDetectionState instanceof DragDetectionState.AwaitDown ? ((DragDetectionState.AwaitDown) dragDetectionState).getHasSeenInitialEvent() ? GestureState.Companion.m2035getWaiting7meUWtM() : GestureState.Companion.m2033getIdle7meUWtM() : dragDetectionState instanceof DragDetectionState.AwaitTouchSlop ? GestureState.Companion.m2035getWaiting7meUWtM() : dragDetectionState instanceof DragDetectionState.AwaitGesturePickup ? GestureState.Companion.m2035getWaiting7meUWtM() : dragDetectionState instanceof DragDetectionState.Dragging ? GestureState.Companion.m2034getRecognized7meUWtM() : GestureState.Companion.m2033getIdle7meUWtM();
    }

    public final DragGestureNode getNode() {
        return this.node;
    }

    @Override // androidx.compose.foundation.gestures.DraggableGestureConnection
    public Orientation getOrientation() {
        return this.node.getOrientation();
    }

    public final void processIndirectPointerInputEvent(IndirectPointerEvent indirectPointerEvent, PointerEventPass pointerEventPass) {
        DragDetectionState awaitDownState = this.currentDragState;
        if (awaitDownState == null) {
            awaitDownState = getAwaitDownState();
            this.currentDragState = awaitDownState;
        }
        if (awaitDownState == null) {
            throw new IllegalArgumentException("currentDragState should not be null");
        }
        if (awaitDownState instanceof DragDetectionState.AwaitDown) {
            processInitialDownState(indirectPointerEvent, pointerEventPass, (DragDetectionState.AwaitDown) awaitDownState);
            return;
        }
        if (awaitDownState instanceof DragDetectionState.AwaitTouchSlop) {
            processAwaitTouchSlop(indirectPointerEvent, pointerEventPass, (DragDetectionState.AwaitTouchSlop) awaitDownState);
        } else if (awaitDownState instanceof DragDetectionState.AwaitGesturePickup) {
            processAwaitGesturePickup(indirectPointerEvent, pointerEventPass, (DragDetectionState.AwaitGesturePickup) awaitDownState);
        } else {
            if (!(awaitDownState instanceof DragDetectionState.Dragging)) {
                throw new h.i();
            }
            processDraggingState(indirectPointerEvent, pointerEventPass, (DragDetectionState.Dragging) awaitDownState);
        }
    }

    public final void resetDragDetectionState() {
        moveToAwaitDownState();
        if (this.node.isListeningForEvents$foundation()) {
            sendDragCancelled();
        }
        this.velocityTracker = null;
        this.offsetSmoother.reset();
    }

    /* compiled from: WazeSource */
    public abstract class DragDetectionState {
        public static final int $stable = 0;

        private DragDetectionState() {
        }

        public /* synthetic */ DragDetectionState(o oVar) {
            this();
        }

        /* compiled from: WazeSource */
        public final class Dragging extends DragDetectionState {
            public static final int $stable = 8;
            private long pointerId;

            public /* synthetic */ Dragging(long j2, int i2, o oVar) {
                this(1 == (i2 & 1) ? Long.MAX_VALUE : j2, null);
            }

            /* renamed from: getPointerId-J3iCeTQ, reason: not valid java name */
            public final long m2231getPointerIdJ3iCeTQ() {
                return this.pointerId;
            }

            /* renamed from: setPointerId-0FcD4WY, reason: not valid java name */
            public final void m2232setPointerId0FcD4WY(long j2) {
                this.pointerId = j2;
            }

            public /* synthetic */ Dragging(long j2, o oVar) {
                this(j2);
            }

            private Dragging(long j2) {
                super(null);
                this.pointerId = j2;
            }
        }

        /* compiled from: WazeSource */
        public final class AwaitGesturePickup extends DragDetectionState {
            public static final int $stable = 8;
            private IndirectPointerInputChange initialDown;
            private long pointerId;
            private TouchSlopDetector touchSlopDetector;

            public /* synthetic */ AwaitGesturePickup(IndirectPointerInputChange indirectPointerInputChange, long j2, TouchSlopDetector touchSlopDetector, int i2, o oVar) {
                this(1 == (i2 & 1) ? null : indirectPointerInputChange, (i2 & 2) != 0 ? Long.MAX_VALUE : j2, (i2 & 4) != 0 ? null : touchSlopDetector, null);
            }

            public final IndirectPointerInputChange getInitialDown() {
                return this.initialDown;
            }

            /* renamed from: getPointerId-J3iCeTQ, reason: not valid java name */
            public final long m2227getPointerIdJ3iCeTQ() {
                return this.pointerId;
            }

            public final TouchSlopDetector getTouchSlopDetector() {
                return this.touchSlopDetector;
            }

            public final void setInitialDown(IndirectPointerInputChange indirectPointerInputChange) {
                this.initialDown = indirectPointerInputChange;
            }

            /* renamed from: setPointerId-0FcD4WY, reason: not valid java name */
            public final void m2228setPointerId0FcD4WY(long j2) {
                this.pointerId = j2;
            }

            public final void setTouchSlopDetector(TouchSlopDetector touchSlopDetector) {
                this.touchSlopDetector = touchSlopDetector;
            }

            public /* synthetic */ AwaitGesturePickup(IndirectPointerInputChange indirectPointerInputChange, long j2, TouchSlopDetector touchSlopDetector, o oVar) {
                this(indirectPointerInputChange, j2, touchSlopDetector);
            }

            private AwaitGesturePickup(IndirectPointerInputChange indirectPointerInputChange, long j2, TouchSlopDetector touchSlopDetector) {
                super(null);
                this.initialDown = indirectPointerInputChange;
                this.pointerId = j2;
                this.touchSlopDetector = touchSlopDetector;
            }
        }

        /* compiled from: WazeSource */
        public final class AwaitDown extends DragDetectionState {
            public static final int $stable = 8;
            private AwaitTouchSlop awaitTouchSlop;
            private boolean consumedOnInitial;
            private boolean hasSeenInitialEvent;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: WazeSource */
            public final class AwaitTouchSlop {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ AwaitTouchSlop[] $VALUES;
                public static final AwaitTouchSlop Yes = new AwaitTouchSlop("Yes", 0);
                public static final AwaitTouchSlop No = new AwaitTouchSlop("No", 1);
                public static final AwaitTouchSlop NotInitialized = new AwaitTouchSlop("NotInitialized", 2);

                private static final /* synthetic */ AwaitTouchSlop[] $values() {
                    return new AwaitTouchSlop[]{Yes, No, NotInitialized};
                }

                static {
                    AwaitTouchSlop[] awaitTouchSlopArr$values = $values();
                    $VALUES = awaitTouchSlopArr$values;
                    $ENTRIES = b.a(awaitTouchSlopArr$values);
                }

                private AwaitTouchSlop(String str, int i2) {
                }

                public static a<AwaitTouchSlop> getEntries() {
                    return $ENTRIES;
                }

                public static AwaitTouchSlop valueOf(String str) {
                    return (AwaitTouchSlop) Enum.valueOf(AwaitTouchSlop.class, str);
                }

                public static AwaitTouchSlop[] values() {
                    return (AwaitTouchSlop[]) $VALUES.clone();
                }
            }

            public /* synthetic */ AwaitDown(AwaitTouchSlop awaitTouchSlop, boolean z, boolean z2, int i2, o oVar) {
                this((i2 & 1) != 0 ? AwaitTouchSlop.NotInitialized : awaitTouchSlop, z & ((i2 & 2) == 0), z2 & ((i2 & 4) == 0));
            }

            public final AwaitTouchSlop getAwaitTouchSlop() {
                return this.awaitTouchSlop;
            }

            public final boolean getConsumedOnInitial() {
                return this.consumedOnInitial;
            }

            public final boolean getHasSeenInitialEvent() {
                return this.hasSeenInitialEvent;
            }

            public final void setAwaitTouchSlop(AwaitTouchSlop awaitTouchSlop) {
                this.awaitTouchSlop = awaitTouchSlop;
            }

            public final void setConsumedOnInitial(boolean z) {
                this.consumedOnInitial = z;
            }

            public final void setHasSeenInitialEvent(boolean z) {
                this.hasSeenInitialEvent = z;
            }

            public AwaitDown(AwaitTouchSlop awaitTouchSlop, boolean z, boolean z2) {
                super(null);
                this.awaitTouchSlop = awaitTouchSlop;
                this.consumedOnInitial = z;
                this.hasSeenInitialEvent = z2;
            }

            public AwaitDown() {
                this(null, false, false, 7, null);
            }
        }

        /* compiled from: WazeSource */
        public final class AwaitTouchSlop extends DragDetectionState {
            public static final int $stable = 8;
            private IndirectPointerInputChange initialDown;
            private long pointerId;
            private boolean verifyConsumptionInFinalPass;

            public /* synthetic */ AwaitTouchSlop(IndirectPointerInputChange indirectPointerInputChange, long j2, boolean z, int i2, o oVar) {
                this(1 == (i2 & 1) ? null : indirectPointerInputChange, (i2 & 2) != 0 ? Long.MAX_VALUE : j2, z & ((i2 & 4) == 0), null);
            }

            public final IndirectPointerInputChange getInitialDown() {
                return this.initialDown;
            }

            /* renamed from: getPointerId-J3iCeTQ, reason: not valid java name */
            public final long m2229getPointerIdJ3iCeTQ() {
                return this.pointerId;
            }

            public final boolean getVerifyConsumptionInFinalPass() {
                return this.verifyConsumptionInFinalPass;
            }

            public final void setInitialDown(IndirectPointerInputChange indirectPointerInputChange) {
                this.initialDown = indirectPointerInputChange;
            }

            /* renamed from: setPointerId-0FcD4WY, reason: not valid java name */
            public final void m2230setPointerId0FcD4WY(long j2) {
                this.pointerId = j2;
            }

            public final void setVerifyConsumptionInFinalPass(boolean z) {
                this.verifyConsumptionInFinalPass = z;
            }

            public /* synthetic */ AwaitTouchSlop(IndirectPointerInputChange indirectPointerInputChange, long j2, boolean z, o oVar) {
                this(indirectPointerInputChange, j2, z);
            }

            private AwaitTouchSlop(IndirectPointerInputChange indirectPointerInputChange, long j2, boolean z) {
                super(null);
                this.initialDown = indirectPointerInputChange;
                this.pointerId = j2;
                this.verifyConsumptionInFinalPass = z;
            }
        }
    }
}
