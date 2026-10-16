package androidx.compose.ui.input.indirect;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerId;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class IndirectPointerInputChange {
    public static final int $stable = 8;
    private final long id;
    private boolean isConsumed;
    private final long position;
    private final boolean pressed;
    private final float pressure;
    private final long previousPosition;
    private final boolean previousPressed;
    private final long previousUptimeMillis;
    private final long uptimeMillis;

    private IndirectPointerInputChange(long j2, long j3, long j4, boolean z, float f2, long j5, long j6, boolean z2) {
        this.id = j2;
        this.uptimeMillis = j3;
        this.position = j4;
        this.pressed = z;
        this.pressure = f2;
        this.previousUptimeMillis = j5;
        this.previousPosition = j6;
        this.previousPressed = z2;
    }

    public final void consume() {
        this.isConsumed = true;
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m9107getIdJ3iCeTQ() {
        return this.id;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m9108getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: getPreviousPosition-F1C5BW0, reason: not valid java name */
    public final long m9109getPreviousPositionF1C5BW0() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public final long getPreviousUptimeMillis() {
        return this.previousUptimeMillis;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final boolean isConsumed() {
        return this.isConsumed;
    }

    public String toString() {
        return "IndirectPointerInputChange(id=" + ((Object) PointerId.m9589toStringimpl(this.id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m7988toStringimpl(this.position)) + ", pressed=" + this.pressed + ", pressure=" + this.pressure + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) Offset.m7988toStringimpl(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + this.isConsumed + ')';
    }

    public /* synthetic */ IndirectPointerInputChange(long j2, long j3, long j4, boolean z, float f2, long j5, long j6, boolean z2, o oVar) {
        this(j2, j3, j4, z, f2, j5, j6, z2);
    }
}
