package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import h.d.a;
import h.d.b;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
abstract class DragDetectionState {
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
        public final long m2178getPointerIdJ3iCeTQ() {
            return this.pointerId;
        }

        /* renamed from: setPointerId-0FcD4WY, reason: not valid java name */
        public final void m2179setPointerId0FcD4WY(long j2) {
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
        private PointerInputChange initialDown;
        private long pointerId;
        private TouchSlopDetector touchSlopDetector;

        public /* synthetic */ AwaitGesturePickup(PointerInputChange pointerInputChange, long j2, TouchSlopDetector touchSlopDetector, int i2, o oVar) {
            this(1 == (i2 & 1) ? null : pointerInputChange, (i2 & 2) != 0 ? Long.MAX_VALUE : j2, (i2 & 4) != 0 ? null : touchSlopDetector, null);
        }

        public final PointerInputChange getInitialDown() {
            return this.initialDown;
        }

        /* renamed from: getPointerId-J3iCeTQ, reason: not valid java name */
        public final long m2174getPointerIdJ3iCeTQ() {
            return this.pointerId;
        }

        public final TouchSlopDetector getTouchSlopDetector() {
            return this.touchSlopDetector;
        }

        public final void setInitialDown(PointerInputChange pointerInputChange) {
            this.initialDown = pointerInputChange;
        }

        /* renamed from: setPointerId-0FcD4WY, reason: not valid java name */
        public final void m2175setPointerId0FcD4WY(long j2) {
            this.pointerId = j2;
        }

        public final void setTouchSlopDetector(TouchSlopDetector touchSlopDetector) {
            this.touchSlopDetector = touchSlopDetector;
        }

        public /* synthetic */ AwaitGesturePickup(PointerInputChange pointerInputChange, long j2, TouchSlopDetector touchSlopDetector, o oVar) {
            this(pointerInputChange, j2, touchSlopDetector);
        }

        private AwaitGesturePickup(PointerInputChange pointerInputChange, long j2, TouchSlopDetector touchSlopDetector) {
            super(null);
            this.initialDown = pointerInputChange;
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
        private PointerInputChange initialDown;
        private long pointerId;
        private boolean verifyConsumptionInFinalPass;

        public /* synthetic */ AwaitTouchSlop(PointerInputChange pointerInputChange, long j2, boolean z, int i2, o oVar) {
            this(1 == (i2 & 1) ? null : pointerInputChange, (i2 & 2) != 0 ? Long.MAX_VALUE : j2, z & ((i2 & 4) == 0), null);
        }

        public final PointerInputChange getInitialDown() {
            return this.initialDown;
        }

        /* renamed from: getPointerId-J3iCeTQ, reason: not valid java name */
        public final long m2176getPointerIdJ3iCeTQ() {
            return this.pointerId;
        }

        public final boolean getVerifyConsumptionInFinalPass() {
            return this.verifyConsumptionInFinalPass;
        }

        public final void setInitialDown(PointerInputChange pointerInputChange) {
            this.initialDown = pointerInputChange;
        }

        /* renamed from: setPointerId-0FcD4WY, reason: not valid java name */
        public final void m2177setPointerId0FcD4WY(long j2) {
            this.pointerId = j2;
        }

        public final void setVerifyConsumptionInFinalPass(boolean z) {
            this.verifyConsumptionInFinalPass = z;
        }

        public /* synthetic */ AwaitTouchSlop(PointerInputChange pointerInputChange, long j2, boolean z, o oVar) {
            this(pointerInputChange, j2, z);
        }

        private AwaitTouchSlop(PointerInputChange pointerInputChange, long j2, boolean z) {
            super(null);
            this.initialDown = pointerInputChange;
            this.pointerId = j2;
            this.verifyConsumptionInFinalPass = z;
        }
    }
}
