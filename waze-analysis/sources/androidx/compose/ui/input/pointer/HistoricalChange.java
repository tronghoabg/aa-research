package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class HistoricalChange {
    public static final int $stable = 0;
    private long originalEventPosition;
    private final long panOffset;
    private final long position;
    private final float scaleFactor;
    private final long uptimeMillis;

    public /* synthetic */ HistoricalChange(long j2, long j3, float f2, long j4, int i2, o oVar) {
        this(j2, j3, (i2 & 4) != 0 ? 1.0f : f2, (i2 & 8) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : j4, (o) null);
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0$ui, reason: not valid java name */
    public final long m9507getOriginalEventPositionF1C5BW0$ui() {
        return this.originalEventPosition;
    }

    /* renamed from: getPanOffset-F1C5BW0, reason: not valid java name */
    public final long m9508getPanOffsetF1C5BW0() {
        return this.panOffset;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m9509getPositionF1C5BW0() {
        return this.position;
    }

    public final float getScaleFactor() {
        return this.scaleFactor;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m7988toStringimpl(this.position)) + ", scaleFactor=" + this.scaleFactor + ", panOffset=" + ((Object) Offset.m7988toStringimpl(this.panOffset)) + ')';
    }

    public /* synthetic */ HistoricalChange(long j2, long j3, float f2, long j4, o oVar) {
        this(j2, j3, f2, j4);
    }

    public /* synthetic */ HistoricalChange(long j2, long j3, o oVar) {
        this(j2, j3);
    }

    private HistoricalChange(long j2, long j3) {
        this(j2, j3, 1.0f, Offset.Companion.m7996getZeroF1C5BW0(), (o) null);
    }

    private HistoricalChange(long j2, long j3, float f2, long j4) {
        this.uptimeMillis = j2;
        this.position = j3;
        this.scaleFactor = f2;
        this.panOffset = j4;
        this.originalEventPosition = Offset.Companion.m7996getZeroF1C5BW0();
    }

    public /* synthetic */ HistoricalChange(long j2, long j3, float f2, long j4, long j5, o oVar) {
        this(j2, j3, f2, j4, j5);
    }

    private HistoricalChange(long j2, long j3, float f2, long j4, long j5) {
        this(j2, j3, f2, j4, (o) null);
        this.originalEventPosition = j5;
    }
}
