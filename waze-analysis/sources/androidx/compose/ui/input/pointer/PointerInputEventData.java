package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PointerInputEventData {
    public static final int $stable = 8;
    private final boolean activeHover;
    private final boolean down;
    private final List<HistoricalChange> historical;
    private final long id;
    private final long originalEventPosition;
    private final long panGestureOffset;
    private final long position;
    private final long positionOnScreen;
    private final float pressure;
    private final float scaleGestureFactor;
    private final long scrollDelta;
    private final int type;
    private final long uptime;

    public /* synthetic */ PointerInputEventData(long j2, long j3, long j4, long j5, boolean z, float f2, int i2, boolean z2, List list, long j6, float f3, long j7, long j8, int i3, o oVar) {
        this(j2, j3, j4, j5, z, f2, i2, ((i3 & 128) == 0) & z2, (i3 & 256) != 0 ? new ArrayList() : list, (i3 & 512) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : j6, f3, j7, (i3 & 4096) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : j8, null);
    }

    /* renamed from: copy-hf9UmOk$default, reason: not valid java name */
    public static /* synthetic */ PointerInputEventData m9614copyhf9UmOk$default(PointerInputEventData pointerInputEventData, long j2, long j3, long j4, long j5, boolean z, float f2, int i2, boolean z2, List list, long j6, float f3, long j7, long j8, int i3, Object obj) {
        long j9;
        long j10;
        long j11;
        long j12;
        long j13 = (i3 & 1) != 0 ? pointerInputEventData.id : j2;
        long j14 = (i3 & 2) != 0 ? pointerInputEventData.uptime : j3;
        long j15 = (i3 & 4) != 0 ? pointerInputEventData.positionOnScreen : j4;
        long j16 = (i3 & 8) != 0 ? pointerInputEventData.position : j5;
        boolean z3 = (i3 & 16) != 0 ? pointerInputEventData.down : z;
        float f4 = (i3 & 32) != 0 ? pointerInputEventData.pressure : f2;
        int i4 = (i3 & 64) != 0 ? pointerInputEventData.type : i2;
        boolean z4 = (i3 & 128) != 0 ? pointerInputEventData.activeHover : z2;
        List list2 = (i3 & 256) != 0 ? pointerInputEventData.historical : list;
        if ((i3 & 512) != 0) {
            j9 = j13;
            j10 = pointerInputEventData.scrollDelta;
        } else {
            j9 = j13;
            j10 = j6;
        }
        long j17 = j10;
        float f5 = (i3 & 1024) != 0 ? pointerInputEventData.scaleGestureFactor : f3;
        long j18 = (i3 & 2048) != 0 ? pointerInputEventData.panGestureOffset : j7;
        if ((i3 & 4096) != 0) {
            j12 = j18;
            j11 = pointerInputEventData.originalEventPosition;
        } else {
            j11 = j8;
            j12 = j18;
        }
        return pointerInputEventData.m9622copyhf9UmOk(j9, j14, j15, j16, z3, f4, i4, z4, list2, j17, f5, j12, j11);
    }

    /* renamed from: component1-J3iCeTQ, reason: not valid java name */
    public final long m9615component1J3iCeTQ() {
        return this.id;
    }

    /* renamed from: component10-F1C5BW0, reason: not valid java name */
    public final long m9616component10F1C5BW0() {
        return this.scrollDelta;
    }

    public final float component11() {
        return this.scaleGestureFactor;
    }

    /* renamed from: component12-F1C5BW0, reason: not valid java name */
    public final long m9617component12F1C5BW0() {
        return this.panGestureOffset;
    }

    /* renamed from: component13-F1C5BW0, reason: not valid java name */
    public final long m9618component13F1C5BW0() {
        return this.originalEventPosition;
    }

    public final long component2() {
        return this.uptime;
    }

    /* renamed from: component3-F1C5BW0, reason: not valid java name */
    public final long m9619component3F1C5BW0() {
        return this.positionOnScreen;
    }

    /* renamed from: component4-F1C5BW0, reason: not valid java name */
    public final long m9620component4F1C5BW0() {
        return this.position;
    }

    public final boolean component5() {
        return this.down;
    }

    public final float component6() {
        return this.pressure;
    }

    /* renamed from: component7-T8wyACA, reason: not valid java name */
    public final int m9621component7T8wyACA() {
        return this.type;
    }

    public final boolean component8() {
        return this.activeHover;
    }

    public final List<HistoricalChange> component9() {
        return this.historical;
    }

    /* renamed from: copy-hf9UmOk, reason: not valid java name */
    public final PointerInputEventData m9622copyhf9UmOk(long j2, long j3, long j4, long j5, boolean z, float f2, int i2, boolean z2, List<HistoricalChange> list, long j6, float f3, long j7, long j8) {
        return new PointerInputEventData(j2, j3, j4, j5, z, f2, i2, z2, list, j6, f3, j7, j8, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
        return PointerId.m9587equalsimpl0(this.id, pointerInputEventData.id) && this.uptime == pointerInputEventData.uptime && Offset.m7977equalsimpl0(this.positionOnScreen, pointerInputEventData.positionOnScreen) && Offset.m7977equalsimpl0(this.position, pointerInputEventData.position) && this.down == pointerInputEventData.down && Float.compare(this.pressure, pointerInputEventData.pressure) == 0 && PointerType.m9682equalsimpl0(this.type, pointerInputEventData.type) && this.activeHover == pointerInputEventData.activeHover && x.n(this.historical, pointerInputEventData.historical) && Offset.m7977equalsimpl0(this.scrollDelta, pointerInputEventData.scrollDelta) && Float.compare(this.scaleGestureFactor, pointerInputEventData.scaleGestureFactor) == 0 && Offset.m7977equalsimpl0(this.panGestureOffset, pointerInputEventData.panGestureOffset) && Offset.m7977equalsimpl0(this.originalEventPosition, pointerInputEventData.originalEventPosition);
    }

    public final boolean getActiveHover() {
        return this.activeHover;
    }

    public final boolean getDown() {
        return this.down;
    }

    public final List<HistoricalChange> getHistorical() {
        return this.historical;
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m9623getIdJ3iCeTQ() {
        return this.id;
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0, reason: not valid java name */
    public final long m9624getOriginalEventPositionF1C5BW0() {
        return this.originalEventPosition;
    }

    /* renamed from: getPanGestureOffset-F1C5BW0, reason: not valid java name */
    public final long m9625getPanGestureOffsetF1C5BW0() {
        return this.panGestureOffset;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m9626getPositionF1C5BW0() {
        return this.position;
    }

    /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
    public final long m9627getPositionOnScreenF1C5BW0() {
        return this.positionOnScreen;
    }

    public final float getPressure() {
        return this.pressure;
    }

    public final float getScaleGestureFactor() {
        return this.scaleGestureFactor;
    }

    /* renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m9628getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m9629getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptime() {
        return this.uptime;
    }

    public int hashCode() {
        int iM9588hashCodeimpl = PointerId.m9588hashCodeimpl(this.id);
        float f2 = this.pressure;
        boolean z = this.down;
        long j2 = this.position;
        int iM = (((((((((iM9588hashCodeimpl * 31) + PointerInputEventData$$ExternalSyntheticBackport0.m(this.uptime)) * 31) + Offset.m7982hashCodeimpl(this.positionOnScreen)) * 31) + Offset.m7982hashCodeimpl(j2)) * 31) + PointerInputEventData$$ExternalSyntheticBackport1.m(z)) * 31) + Float.floatToIntBits(f2);
        List<HistoricalChange> list = this.historical;
        return (((((((((((((iM * 31) + this.type) * 31) + PointerInputEventData$$ExternalSyntheticBackport1.m(this.activeHover)) * 31) + list.hashCode()) * 31) + Offset.m7982hashCodeimpl(this.scrollDelta)) * 31) + Float.floatToIntBits(this.scaleGestureFactor)) * 31) + Offset.m7982hashCodeimpl(this.panGestureOffset)) * 31) + Offset.m7982hashCodeimpl(this.originalEventPosition);
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) PointerId.m9589toStringimpl(this.id)) + ", uptime=" + this.uptime + ", positionOnScreen=" + ((Object) Offset.m7988toStringimpl(this.positionOnScreen)) + ", position=" + ((Object) Offset.m7988toStringimpl(this.position)) + ", down=" + this.down + ", pressure=" + this.pressure + ", type=" + ((Object) PointerType.m9684toStringimpl(this.type)) + ", activeHover=" + this.activeHover + ", historical=" + this.historical + ", scrollDelta=" + ((Object) Offset.m7988toStringimpl(this.scrollDelta)) + ", scaleGestureFactor=" + this.scaleGestureFactor + ", panGestureOffset=" + ((Object) Offset.m7988toStringimpl(this.panGestureOffset)) + ", originalEventPosition=" + ((Object) Offset.m7988toStringimpl(this.originalEventPosition)) + ')';
    }

    public /* synthetic */ PointerInputEventData(long j2, long j3, long j4, long j5, boolean z, float f2, int i2, boolean z2, List list, long j6, float f3, long j7, long j8, o oVar) {
        this(j2, j3, j4, j5, z, f2, i2, z2, list, j6, f3, j7, j8);
    }

    private PointerInputEventData(long j2, long j3, long j4, long j5, boolean z, float f2, int i2, boolean z2, List<HistoricalChange> list, long j6, float f3, long j7, long j8) {
        this.id = j2;
        this.uptime = j3;
        this.positionOnScreen = j4;
        this.position = j5;
        this.down = z;
        this.pressure = f2;
        this.type = i2;
        this.activeHover = z2;
        this.historical = list;
        this.scrollDelta = j6;
        this.scaleGestureFactor = f3;
        this.panGestureOffset = j7;
        this.originalEventPosition = j8;
    }
}
