package androidx.constraintlayout.compose;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MotionDragState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long dragAmount;
    private final boolean isDragging;
    private final long velocity;

    private MotionDragState(boolean z, long j2, long j3) {
        this.isDragging = z;
        this.dragAmount = j2;
        this.velocity = j3;
    }

    /* renamed from: copy-dhPbTwU$default, reason: not valid java name */
    public static /* synthetic */ MotionDragState m11570copydhPbTwU$default(MotionDragState motionDragState, boolean z, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = motionDragState.isDragging;
        }
        if ((i2 & 2) != 0) {
            j2 = motionDragState.dragAmount;
        }
        if ((i2 & 4) != 0) {
            j3 = motionDragState.velocity;
        }
        return motionDragState.m11573copydhPbTwU(z, j2, j3);
    }

    public final boolean component1() {
        return this.isDragging;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m11571component2F1C5BW0() {
        return this.dragAmount;
    }

    /* renamed from: component3-9UxMQ8M, reason: not valid java name */
    public final long m11572component39UxMQ8M() {
        return this.velocity;
    }

    /* renamed from: copy-dhPbTwU, reason: not valid java name */
    public final MotionDragState m11573copydhPbTwU(boolean z, long j2, long j3) {
        return new MotionDragState(z, j2, j3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotionDragState)) {
            return false;
        }
        MotionDragState motionDragState = (MotionDragState) obj;
        return this.isDragging == motionDragState.isDragging && Offset.m7977equalsimpl0(this.dragAmount, motionDragState.dragAmount) && Velocity.m11405equalsimpl0(this.velocity, motionDragState.velocity);
    }

    /* renamed from: getDragAmount-F1C5BW0, reason: not valid java name */
    public final long m11574getDragAmountF1C5BW0() {
        return this.dragAmount;
    }

    /* renamed from: getVelocity-9UxMQ8M, reason: not valid java name */
    public final long m11575getVelocity9UxMQ8M() {
        return this.velocity;
    }

    public int hashCode() {
        return (((MotionDragState$$ExternalSyntheticBackport0.m(this.isDragging) * 31) + Offset.m7982hashCodeimpl(this.dragAmount)) * 31) + Velocity.m11408hashCodeimpl(this.velocity);
    }

    public final boolean isDragging() {
        return this.isDragging;
    }

    public String toString() {
        return "MotionDragState(isDragging=" + this.isDragging + ", dragAmount=" + ((Object) Offset.m7988toStringimpl(this.dragAmount)) + ", velocity=" + ((Object) Velocity.m11413toStringimpl(this.velocity)) + ')';
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: onDrag-k-4lQ0M, reason: not valid java name */
        public final MotionDragState m11576onDragk4lQ0M(long j2) {
            return new MotionDragState(true, j2, Velocity.Companion.m11417getZero9UxMQ8M(), null);
        }

        /* renamed from: onDragEnd-TH1AsA0, reason: not valid java name */
        public final MotionDragState m11577onDragEndTH1AsA0(long j2) {
            return new MotionDragState(false, Offset.Companion.m7995getUnspecifiedF1C5BW0(), j2, null);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ MotionDragState(boolean z, long j2, long j3, o oVar) {
        this(z, j2, j3);
    }
}
