package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Lsq2VelocityTracker implements PlatformVelocityTracker {
    public static final int $stable = 8;
    private long lastMoveEventTimeStamp;
    private final VelocityTracker1D.Strategy strategy;
    private final VelocityTracker1D xVelocityTracker;
    private final VelocityTracker1D yVelocityTracker;

    public Lsq2VelocityTracker() {
        VelocityTracker1D.Strategy strategy = VelocityTracker1D.Strategy.Lsq2;
        this.strategy = strategy;
        boolean z = false;
        int i2 = 1;
        o oVar = null;
        this.xVelocityTracker = new VelocityTracker1D(z, strategy, i2, oVar);
        this.yVelocityTracker = new VelocityTracker1D(z, strategy, i2, oVar);
    }

    @Override // androidx.compose.ui.input.pointer.util.PlatformVelocityTracker
    /* renamed from: addPointerInputChange-Uv8p0NA */
    public void mo9704addPointerInputChangeUv8p0NA(PointerInputChange pointerInputChange, long j2) {
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            resetTracking();
        }
        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            List<HistoricalChange> historical = pointerInputChange.getHistorical();
            int size = historical.size();
            for (int i2 = 0; i2 < size; i2++) {
                HistoricalChange historicalChange = historical.get(i2);
                mo9705addPositionUv8p0NA(historicalChange.getUptimeMillis(), Offset.m7985plusMKHz9U(historicalChange.m9507getOriginalEventPositionF1C5BW0$ui(), j2));
            }
            mo9705addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), Offset.m7985plusMKHz9U(pointerInputChange.m9606getOriginalEventPositionF1C5BW0$ui(), j2));
        }
        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange) && pointerInputChange.getUptimeMillis() - this.lastMoveEventTimeStamp > 40) {
            resetTracking();
        }
        this.lastMoveEventTimeStamp = pointerInputChange.getUptimeMillis();
    }

    @Override // androidx.compose.ui.input.pointer.util.PlatformVelocityTracker
    /* renamed from: addPosition-Uv8p0NA */
    public void mo9705addPositionUv8p0NA(long j2, long j3) {
        this.xVelocityTracker.addDataPoint(j2, Float.intBitsToFloat((int) (j3 >> 32)));
        this.yVelocityTracker.addDataPoint(j2, Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
    }

    @Override // androidx.compose.ui.input.pointer.util.PlatformVelocityTracker
    /* renamed from: calculateVelocity-AH228Gc */
    public long mo9706calculateVelocityAH228Gc(long j2) {
        if (Velocity.m11406getXimpl(j2) <= 0.0f || Velocity.m11407getYimpl(j2) <= 0.0f) {
            String strM11413toStringimpl = Velocity.m11413toStringimpl(j2);
            Objects.toString(strM11413toStringimpl);
            InlineClassHelperKt.throwIllegalStateException("maximumVelocity should be a positive value. You specified=".concat(strM11413toStringimpl));
        }
        return VelocityKt.Velocity(this.xVelocityTracker.calculateVelocity(Velocity.m11406getXimpl(j2)), this.yVelocityTracker.calculateVelocity(Velocity.m11407getYimpl(j2)));
    }

    public final long getLastMoveEventTimeStamp$ui() {
        return this.lastMoveEventTimeStamp;
    }

    @Override // androidx.compose.ui.input.pointer.util.PlatformVelocityTracker
    public void resetTracking() {
        this.xVelocityTracker.resetTracking();
        this.yVelocityTracker.resetTracking();
        this.lastMoveEventTimeStamp = 0L;
    }

    public final void setLastMoveEventTimeStamp$ui(long j2) {
        this.lastMoveEventTimeStamp = j2;
    }
}
