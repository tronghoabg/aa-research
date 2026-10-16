package androidx.compose.ui.input.pointer.util;

import android.os.Build;
import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.media3.muxer.MuxerUtil;
import h.a.i;
import h.g.b.x;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FrameworkVelocityTracker implements PlatformVelocityTracker {
    public static final int $stable = 8;
    private long lastEventTimeMillis;
    private android.view.VelocityTracker velocityTracker;

    /* renamed from: addMovement-0AR0LA0$ui, reason: not valid java name */
    public final void m9703addMovement0AR0LA0$ui(long j2, int i2, long j3) {
        consumeMotionEvent$ui(m9707obtainMotionEvent0AR0LA0$ui(j2, i2, j3));
    }

    @Override // androidx.compose.ui.input.pointer.util.PlatformVelocityTracker
    /* renamed from: addPointerInputChange-Uv8p0NA, reason: not valid java name */
    public void mo9704addPointerInputChangeUv8p0NA(PointerInputChange pointerInputChange, long j2) {
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            m9703addMovement0AR0LA0$ui(pointerInputChange.getUptimeMillis(), 0, Offset.m7985plusMKHz9U(pointerInputChange.m9606getOriginalEventPositionF1C5BW0$ui(), j2));
            return;
        }
        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                m9703addMovement0AR0LA0$ui(pointerInputChange.getUptimeMillis(), 1, Offset.m7985plusMKHz9U(pointerInputChange.m9606getOriginalEventPositionF1C5BW0$ui(), j2));
                return;
            }
            return;
        }
        if (pointerInputChange.getHistorical().isEmpty()) {
            m9703addMovement0AR0LA0$ui(pointerInputChange.getUptimeMillis(), 2, Offset.m7985plusMKHz9U(pointerInputChange.m9606getOriginalEventPositionF1C5BW0$ui(), j2));
            return;
        }
        HistoricalChange historicalChange = (HistoricalChange) i.P(pointerInputChange.getHistorical());
        MotionEvent motionEventM9707obtainMotionEvent0AR0LA0$ui = m9707obtainMotionEvent0AR0LA0$ui(historicalChange.getUptimeMillis(), 2, Offset.m7985plusMKHz9U(historicalChange.m9507getOriginalEventPositionF1C5BW0$ui(), j2));
        int iE = i.e(pointerInputChange.getHistorical());
        if (iE > 0) {
            int i2 = 1;
            while (true) {
                long jM7985plusMKHz9U = Offset.m7985plusMKHz9U(pointerInputChange.getHistorical().get(i2).m9507getOriginalEventPositionF1C5BW0$ui(), j2);
                motionEventM9707obtainMotionEvent0AR0LA0$ui.addBatch(pointerInputChange.getHistorical().get(i2).getUptimeMillis(), Float.intBitsToFloat((int) (jM7985plusMKHz9U >> 32)), Float.intBitsToFloat((int) (jM7985plusMKHz9U & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), 0.0f, 0.0f, 0);
                if (i2 == iE) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        Offset.m7985plusMKHz9U(pointerInputChange.m9606getOriginalEventPositionF1C5BW0$ui(), j2);
        motionEventM9707obtainMotionEvent0AR0LA0$ui.addBatch(pointerInputChange.getUptimeMillis(), Float.intBitsToFloat((int) (pointerInputChange.m9606getOriginalEventPositionF1C5BW0$ui() >> 32)) + Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (pointerInputChange.m9606getOriginalEventPositionF1C5BW0$ui() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), 0.0f, 0.0f, 0);
        consumeMotionEvent$ui(motionEventM9707obtainMotionEvent0AR0LA0$ui);
    }

    @Override // androidx.compose.ui.input.pointer.util.PlatformVelocityTracker
    /* renamed from: addPosition-Uv8p0NA, reason: not valid java name */
    public void mo9705addPositionUv8p0NA(long j2, long j3) {
        m9703addMovement0AR0LA0$ui(j2, 2, j3);
    }

    @Override // androidx.compose.ui.input.pointer.util.PlatformVelocityTracker
    /* renamed from: calculateVelocity-AH228Gc, reason: not valid java name */
    public long mo9706calculateVelocityAH228Gc(long j2) {
        if (Velocity.m11406getXimpl(j2) <= 0.0f || Velocity.m11407getYimpl(j2) <= 0.0f) {
            String strM11413toStringimpl = Velocity.m11413toStringimpl(j2);
            Objects.toString(strM11413toStringimpl);
            InlineClassHelperKt.throwIllegalStateException("maximumVelocity should be a positive value. You specified=".concat(strM11413toStringimpl));
        }
        android.view.VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return Velocity.Companion.m11417getZero9UxMQ8M();
        }
        velocityTracker.computeCurrentVelocity(1000);
        android.view.VelocityTracker velocityTracker2 = this.velocityTracker;
        android.view.VelocityTracker velocityTracker3 = null;
        if (velocityTracker2 == null) {
            x.j("velocityTracker");
            velocityTracker2 = null;
        }
        float fM = FrameworkVelocityTracker$$ExternalSyntheticBackport0.m(velocityTracker2.getXVelocity(), -Velocity.m11406getXimpl(j2), Velocity.m11406getXimpl(j2));
        android.view.VelocityTracker velocityTracker4 = this.velocityTracker;
        if (velocityTracker4 == null) {
            x.j("velocityTracker");
        } else {
            velocityTracker3 = velocityTracker4;
        }
        return VelocityKt.Velocity(fM, FrameworkVelocityTracker$$ExternalSyntheticBackport0.m(velocityTracker3.getYVelocity(), -Velocity.m11407getYimpl(j2), Velocity.m11407getYimpl(j2)));
    }

    public final void consumeMotionEvent$ui(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT <= 33) {
            if (motionEvent.getEventTime() - this.lastEventTimeMillis > 40) {
                resetTracking();
            }
            this.lastEventTimeMillis = motionEvent.getEventTime();
        }
        android.view.VelocityTracker velocityTrackerObtain = this.velocityTracker;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = android.view.VelocityTracker.obtain();
            this.velocityTracker = velocityTrackerObtain;
        }
        if (velocityTrackerObtain == null) {
            x.j("velocityTracker");
            velocityTrackerObtain = null;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        motionEvent.recycle();
    }

    /* renamed from: obtainMotionEvent-0AR0LA0$ui, reason: not valid java name */
    public final MotionEvent m9707obtainMotionEvent0AR0LA0$ui(long j2, int i2, long j3) {
        return MotionEvent.obtain(0L, j2, i2, Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j3)), 0);
    }

    @Override // androidx.compose.ui.input.pointer.util.PlatformVelocityTracker
    public void resetTracking() {
        android.view.VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
    }
}
