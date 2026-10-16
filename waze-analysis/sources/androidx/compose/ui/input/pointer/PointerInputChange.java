package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import com.waze.strings.DisplayStrings;
import h.a.ac;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PointerInputChange {
    public static final int $stable = 0;
    private ConsumedData _consumed;
    private List<HistoricalChange> _historical;
    private PointerInputChange consumedDelegate;
    private boolean downChange;
    private final long id;
    private long originalEventPosition;
    private final long panOffset;
    private final long position;
    private boolean positionChange;
    private final boolean pressed;
    private final float pressure;
    private final long previousPosition;
    private final boolean previousPressed;
    private final long previousUptimeMillis;
    private final float scaleFactor;
    private final long scrollDelta;
    private final int type;
    private final long uptimeMillis;

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z, float f2, long j5, long j6, boolean z2, boolean z3, int i2, long j7, float f3, long j8, int i3, o oVar) {
        this(j2, j3, j4, z, f2, j5, j6, z2, z3, (i3 & 512) != 0 ? PointerType.Companion.m9689getTouchT8wyACA() : i2, (i3 & 1024) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : j7, (i3 & 2048) != 0 ? 1.0f : f3, (i3 & 4096) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : j8, (o) null);
    }

    /* renamed from: copy-0GkPj7c$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m9591copy0GkPj7c$default(PointerInputChange pointerInputChange, long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, ConsumedData consumedData, int i2, long j7, int i3, Object obj) {
        long j8;
        long j9 = (i3 & 1) != 0 ? pointerInputChange.id : j2;
        long j10 = (i3 & 2) != 0 ? pointerInputChange.uptimeMillis : j3;
        long j11 = (i3 & 4) != 0 ? pointerInputChange.position : j4;
        boolean z3 = (i3 & 8) != 0 ? pointerInputChange.pressed : z;
        long j12 = (i3 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j5;
        long j13 = (i3 & 32) != 0 ? pointerInputChange.previousPosition : j6;
        boolean z4 = (i3 & 64) != 0 ? pointerInputChange.previousPressed : z2;
        int i4 = (i3 & 256) != 0 ? pointerInputChange.type : i2;
        if ((i3 & 512) != 0) {
            j8 = pointerInputChange.scrollDelta;
            j9 = j9;
        } else {
            j8 = j7;
        }
        return pointerInputChange.m9598copy0GkPj7c(j9, j10, j11, z3, j12, j13, z4, consumedData, i4, j8);
    }

    /* renamed from: copy-JKmWfYY$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m9593copyJKmWfYY$default(PointerInputChange pointerInputChange, long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, int i2, long j7, int i3, Object obj) {
        long j8;
        long j9;
        long j10 = (i3 & 1) != 0 ? pointerInputChange.id : j2;
        long j11 = (i3 & 2) != 0 ? pointerInputChange.uptimeMillis : j3;
        long j12 = (i3 & 4) != 0 ? pointerInputChange.position : j4;
        boolean z3 = (i3 & 8) != 0 ? pointerInputChange.pressed : z;
        long j13 = (i3 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j5;
        long j14 = (i3 & 32) != 0 ? pointerInputChange.previousPosition : j6;
        boolean z4 = (i3 & 64) != 0 ? pointerInputChange.previousPressed : z2;
        int i4 = (i3 & 128) != 0 ? pointerInputChange.type : i2;
        if ((i3 & 256) != 0) {
            j8 = pointerInputChange.scrollDelta;
            j9 = j10;
        } else {
            j8 = j7;
            j9 = j10;
        }
        return pointerInputChange.m9600copyJKmWfYY(j9, j11, j12, z3, j13, j14, z4, i4, j8);
    }

    /* renamed from: copy-OHpmEuE$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m9594copyOHpmEuE$default(PointerInputChange pointerInputChange, long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, int i2, List list, long j7, int i3, Object obj) {
        long j8;
        long j9 = (i3 & 1) != 0 ? pointerInputChange.id : j2;
        long j10 = (i3 & 2) != 0 ? pointerInputChange.uptimeMillis : j3;
        long j11 = (i3 & 4) != 0 ? pointerInputChange.position : j4;
        boolean z3 = (i3 & 8) != 0 ? pointerInputChange.pressed : z;
        long j12 = (i3 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j5;
        long j13 = (i3 & 32) != 0 ? pointerInputChange.previousPosition : j6;
        boolean z4 = (i3 & 64) != 0 ? pointerInputChange.previousPressed : z2;
        int i4 = (i3 & 128) != 0 ? pointerInputChange.type : i2;
        if ((i3 & 512) != 0) {
            j8 = pointerInputChange.scrollDelta;
            j9 = j9;
        } else {
            j8 = j7;
        }
        return pointerInputChange.m9601copyOHpmEuE(j9, j10, j11, z3, j12, j13, z4, i4, list, j8);
    }

    /* renamed from: copy-Tn9QgHE$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m9595copyTn9QgHE$default(PointerInputChange pointerInputChange, long j2, long j3, long j4, boolean z, float f2, long j5, long j6, boolean z2, int i2, long j7, int i3, Object obj) {
        long j8;
        long j9;
        long j10 = (i3 & 1) != 0 ? pointerInputChange.id : j2;
        long j11 = (i3 & 2) != 0 ? pointerInputChange.uptimeMillis : j3;
        long j12 = (i3 & 4) != 0 ? pointerInputChange.position : j4;
        boolean z3 = (i3 & 8) != 0 ? pointerInputChange.pressed : z;
        float f3 = (i3 & 16) != 0 ? pointerInputChange.pressure : f2;
        long j13 = (i3 & 32) != 0 ? pointerInputChange.previousUptimeMillis : j5;
        long j14 = (i3 & 64) != 0 ? pointerInputChange.previousPosition : j6;
        boolean z4 = (i3 & 128) != 0 ? pointerInputChange.previousPressed : z2;
        int i4 = (i3 & 256) != 0 ? pointerInputChange.type : i2;
        if ((i3 & 512) != 0) {
            j8 = pointerInputChange.scrollDelta;
            j9 = j10;
        } else {
            j8 = j7;
            j9 = j10;
        }
        return pointerInputChange.m9602copyTn9QgHE(j9, j11, j12, z3, f3, j13, j14, z4, i4, j8);
    }

    /* renamed from: copy-lGhnTh8$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m9596copylGhnTh8$default(PointerInputChange pointerInputChange, long j2, long j3, long j4, boolean z, float f2, long j5, long j6, boolean z2, int i2, List list, long j7, float f3, long j8, int i3, Object obj) {
        List list2;
        long j9;
        long j10;
        float f4;
        long j11 = (i3 & 1) != 0 ? pointerInputChange.id : j2;
        long j12 = (i3 & 2) != 0 ? pointerInputChange.uptimeMillis : j3;
        long j13 = (i3 & 4) != 0 ? pointerInputChange.position : j4;
        boolean z3 = (i3 & 8) != 0 ? pointerInputChange.pressed : z;
        float f5 = (i3 & 16) != 0 ? pointerInputChange.pressure : f2;
        long j14 = (i3 & 32) != 0 ? pointerInputChange.previousUptimeMillis : j5;
        long j15 = (i3 & 64) != 0 ? pointerInputChange.previousPosition : j6;
        boolean z4 = (i3 & 128) != 0 ? pointerInputChange.previousPressed : z2;
        int i4 = (i3 & 256) != 0 ? pointerInputChange.type : i2;
        long j16 = j11;
        List historical = (i3 & 512) != 0 ? pointerInputChange.getHistorical() : list;
        if ((i3 & 1024) != 0) {
            list2 = historical;
            j9 = pointerInputChange.scrollDelta;
        } else {
            list2 = historical;
            j9 = j7;
        }
        long j17 = j9;
        float f6 = (i3 & 2048) != 0 ? pointerInputChange.scaleFactor : f3;
        if ((i3 & 4096) != 0) {
            f4 = f6;
            j10 = pointerInputChange.panOffset;
        } else {
            j10 = j8;
            f4 = f6;
        }
        return pointerInputChange.m9603copylGhnTh8(j16, j12, j13, z3, f5, j14, j15, z4, i4, list2, j17, f4, j10);
    }

    /* renamed from: copy-wbzehF4$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m9597copywbzehF4$default(PointerInputChange pointerInputChange, long j2, long j3, long j4, boolean z, float f2, long j5, long j6, boolean z2, int i2, List list, long j7, int i3, Object obj) {
        long j8;
        List list2;
        long j9 = (i3 & 1) != 0 ? pointerInputChange.id : j2;
        long j10 = (i3 & 2) != 0 ? pointerInputChange.uptimeMillis : j3;
        long j11 = (i3 & 4) != 0 ? pointerInputChange.position : j4;
        boolean z3 = (i3 & 8) != 0 ? pointerInputChange.pressed : z;
        float f3 = (i3 & 16) != 0 ? pointerInputChange.pressure : f2;
        long j12 = (i3 & 32) != 0 ? pointerInputChange.previousUptimeMillis : j5;
        long j13 = (i3 & 64) != 0 ? pointerInputChange.previousPosition : j6;
        boolean z4 = (i3 & 128) != 0 ? pointerInputChange.previousPressed : z2;
        int i4 = (i3 & 256) != 0 ? pointerInputChange.type : i2;
        long j14 = j9;
        List historical = (i3 & 512) != 0 ? pointerInputChange.getHistorical() : list;
        if ((i3 & 1024) != 0) {
            list2 = historical;
            j8 = pointerInputChange.scrollDelta;
        } else {
            j8 = j7;
            list2 = historical;
        }
        return pointerInputChange.m9604copywbzehF4(j14, j10, j11, z3, f3, j12, j13, z4, i4, list2, j8);
    }

    public final void consume() {
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange != null) {
            pointerInputChange.consume();
        } else {
            this.downChange = true;
            this.positionChange = true;
        }
    }

    /* renamed from: copy-0GkPj7c, reason: not valid java name */
    public final PointerInputChange m9598copy0GkPj7c(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, ConsumedData consumedData, int i2, long j7) {
        boolean z3 = true;
        if (!consumedData.getDownChange() && !consumedData.getPositionChange()) {
            z3 = false;
        }
        PointerInputChange pointerInputChange = new PointerInputChange(j2, j3, j4, z, this.pressure, j5, j6, z2, z3, i2, getHistorical(), j7, this.scaleFactor, this.panOffset, this.originalEventPosition, null);
        pointerInputChange.positionChange = this.positionChange;
        pointerInputChange.downChange = this.downChange;
        return pointerInputChange;
    }

    /* renamed from: copy-Ezr-O64, reason: not valid java name */
    public final /* synthetic */ PointerInputChange m9599copyEzrO64(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, ConsumedData consumedData, int i2) {
        boolean z3 = true;
        if (!consumedData.getDownChange() && !consumedData.getPositionChange()) {
            z3 = false;
        }
        PointerInputChange pointerInputChange = new PointerInputChange(j2, j3, j4, z, this.pressure, j5, j6, z2, z3, i2, getHistorical(), this.scrollDelta, this.scaleFactor, this.panOffset, this.originalEventPosition, null);
        pointerInputChange.positionChange = this.positionChange;
        pointerInputChange.downChange = this.downChange;
        return pointerInputChange;
    }

    /* renamed from: copy-JKmWfYY, reason: not valid java name */
    public final PointerInputChange m9600copyJKmWfYY(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, int i2, long j7) {
        PointerInputChange pointerInputChange = this;
        PointerInputChange pointerInputChangeM9604copywbzehF4 = pointerInputChange.m9604copywbzehF4(j2, j3, j4, z, pointerInputChange.pressure, j5, j6, z2, i2, pointerInputChange.getHistorical(), j7);
        PointerInputChange pointerInputChange2 = pointerInputChange.consumedDelegate;
        if (pointerInputChange2 != null) {
            pointerInputChange = pointerInputChange2;
        }
        pointerInputChangeM9604copywbzehF4.consumedDelegate = pointerInputChange;
        return pointerInputChangeM9604copywbzehF4;
    }

    /* renamed from: copy-OHpmEuE, reason: not valid java name */
    public final PointerInputChange m9601copyOHpmEuE(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, int i2, List<HistoricalChange> list, long j7) {
        PointerInputChange pointerInputChange = this;
        PointerInputChange pointerInputChangeM9604copywbzehF4 = pointerInputChange.m9604copywbzehF4(j2, j3, j4, z, pointerInputChange.pressure, j5, j6, z2, i2, list, j7);
        PointerInputChange pointerInputChange2 = pointerInputChange.consumedDelegate;
        if (pointerInputChange2 != null) {
            pointerInputChange = pointerInputChange2;
        }
        pointerInputChangeM9604copywbzehF4.consumedDelegate = pointerInputChange;
        return pointerInputChangeM9604copywbzehF4;
    }

    /* renamed from: copy-Tn9QgHE, reason: not valid java name */
    public final PointerInputChange m9602copyTn9QgHE(long j2, long j3, long j4, boolean z, float f2, long j5, long j6, boolean z2, int i2, long j7) {
        PointerInputChange pointerInputChange = this;
        PointerInputChange pointerInputChange2 = new PointerInputChange(j2, j3, j4, z, f2, j5, j6, z2, false, i2, pointerInputChange.getHistorical(), j7, pointerInputChange.scaleFactor, pointerInputChange.panOffset, pointerInputChange.originalEventPosition, null);
        PointerInputChange pointerInputChange3 = pointerInputChange.consumedDelegate;
        if (pointerInputChange3 != null) {
            pointerInputChange = pointerInputChange3;
        }
        pointerInputChange2.consumedDelegate = pointerInputChange;
        return pointerInputChange2;
    }

    /* renamed from: copy-lGhnTh8, reason: not valid java name */
    public final PointerInputChange m9603copylGhnTh8(long j2, long j3, long j4, boolean z, float f2, long j5, long j6, boolean z2, int i2, List<HistoricalChange> list, long j7, float f3, long j8) {
        PointerInputChange pointerInputChange = this;
        PointerInputChange pointerInputChange2 = new PointerInputChange(j2, j3, j4, z, f2, j5, j6, z2, false, i2, list, j7, f3, j8, pointerInputChange.originalEventPosition, null);
        PointerInputChange pointerInputChange3 = pointerInputChange.consumedDelegate;
        if (pointerInputChange3 != null) {
            pointerInputChange = pointerInputChange3;
        }
        pointerInputChange2.consumedDelegate = pointerInputChange;
        return pointerInputChange2;
    }

    /* renamed from: copy-wbzehF4, reason: not valid java name */
    public final PointerInputChange m9604copywbzehF4(long j2, long j3, long j4, boolean z, float f2, long j5, long j6, boolean z2, int i2, List<HistoricalChange> list, long j7) {
        PointerInputChange pointerInputChange = this;
        PointerInputChange pointerInputChange2 = new PointerInputChange(j2, j3, j4, z, f2, j5, j6, z2, false, i2, list, j7, pointerInputChange.scaleFactor, pointerInputChange.panOffset, pointerInputChange.originalEventPosition, null);
        PointerInputChange pointerInputChange3 = pointerInputChange.consumedDelegate;
        if (pointerInputChange3 != null) {
            pointerInputChange = pointerInputChange3;
        }
        pointerInputChange2.consumedDelegate = pointerInputChange;
        return pointerInputChange2;
    }

    public final ConsumedData getConsumed() {
        ConsumedData consumedData = this._consumed;
        if (consumedData == null) {
            consumedData = new ConsumedData(this);
            this._consumed = consumedData;
        }
        if (consumedData == null) {
            x.g();
        }
        return consumedData;
    }

    public final PointerInputChange getConsumedDelegate$ui() {
        return this.consumedDelegate;
    }

    public final boolean getDownChange$ui() {
        return this.downChange;
    }

    public final List<HistoricalChange> getHistorical() {
        List<HistoricalChange> list = this._historical;
        return list == null ? ac.f47967a : list;
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m9605getIdJ3iCeTQ() {
        return this.id;
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0$ui, reason: not valid java name */
    public final long m9606getOriginalEventPositionF1C5BW0$ui() {
        return this.originalEventPosition;
    }

    /* renamed from: getPanOffset-F1C5BW0, reason: not valid java name */
    public final long m9607getPanOffsetF1C5BW0() {
        return this.panOffset;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m9608getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getPositionChange$ui() {
        return this.positionChange;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: getPreviousPosition-F1C5BW0, reason: not valid java name */
    public final long m9609getPreviousPositionF1C5BW0() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public final long getPreviousUptimeMillis() {
        return this.previousUptimeMillis;
    }

    public final float getScaleFactor() {
        return this.scaleFactor;
    }

    /* renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m9610getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m9611getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final boolean isConsumed() {
        PointerInputChange pointerInputChange = this.consumedDelegate;
        return pointerInputChange != null ? pointerInputChange.isConsumed() : this.downChange || this.positionChange;
    }

    public final void setConsumedDelegate$ui(PointerInputChange pointerInputChange) {
        this.consumedDelegate = pointerInputChange;
    }

    public final void setDownChange$ui(boolean z) {
        this.downChange = z;
    }

    /* renamed from: setOriginalEventPosition-k-4lQ0M$ui, reason: not valid java name */
    public final void m9612setOriginalEventPositionk4lQ0M$ui(long j2) {
        this.originalEventPosition = j2;
    }

    public final void setPositionChange$ui(boolean z) {
        this.positionChange = z;
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) PointerId.m9589toStringimpl(this.id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m7988toStringimpl(this.position)) + ", pressed=" + this.pressed + ", pressure=" + this.pressure + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) Offset.m7988toStringimpl(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + isConsumed() + ", type=" + ((Object) PointerType.m9684toStringimpl(this.type)) + ", historical=" + getHistorical() + ", scrollDelta=" + ((Object) Offset.m7988toStringimpl(this.scrollDelta)) + ", scaleFactor=" + this.scaleFactor + ", panOffset=" + ((Object) Offset.m7988toStringimpl(this.panOffset)) + ')';
    }

    public static /* synthetic */ void getConsumed$annotations() {
    }

    private static /* synthetic */ void get_consumed$annotations() {
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z, float f2, long j5, long j6, boolean z2, boolean z3, int i2, long j7, o oVar) {
        this(j2, j3, j4, z, f2, j5, j6, z2, z3, i2, j7);
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z, float f2, long j5, long j6, boolean z2, boolean z3, int i2, List list, long j7, float f3, long j8, long j9, o oVar) {
        this(j2, j3, j4, z, f2, j5, j6, z2, z3, i2, (List<HistoricalChange>) list, j7, f3, j8, j9);
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, ConsumedData consumedData, int i2, o oVar) {
        this(j2, j3, j4, z, j5, j6, z2, consumedData, i2);
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, boolean z3, int i2, long j7, float f2, long j8, o oVar) {
        this(j2, j3, j4, z, j5, j6, z2, z3, i2, j7, f2, j8);
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, boolean z3, int i2, long j7, o oVar) {
        this(j2, j3, j4, z, j5, j6, z2, z3, i2, j7);
    }

    private PointerInputChange(long j2, long j3, long j4, boolean z, float f2, long j5, long j6, boolean z2, boolean z3, int i2, long j7) {
        this(j2, j3, j4, z, f2, j5, j6, z2, z3, i2, j7, 0.0f, 0L, 6144, (o) null);
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z, float f2, long j5, long j6, boolean z2, boolean z3, int i2, long j7, int i3, o oVar) {
        this(j2, j3, j4, z, f2, j5, j6, z2, z3, (i3 & 512) != 0 ? PointerType.Companion.m9689getTouchT8wyACA() : i2, (i3 & 1024) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : j7, (o) null);
    }

    private PointerInputChange(long j2, long j3, long j4, boolean z, float f2, long j5, long j6, boolean z2, boolean z3, int i2, List<HistoricalChange> list, long j7, float f3, long j8, long j9) {
        this(j2, j3, j4, z, f2, j5, j6, z2, z3, i2, j7, f3, j8, (o) null);
        this._historical = list;
        this.originalEventPosition = j9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private PointerInputChange(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, ConsumedData consumedData, int i2) {
        boolean z3 = true;
        if (!consumedData.getDownChange() && !consumedData.getPositionChange()) {
            z3 = false;
        }
        this(j2, j3, j4, z, 1.0f, j5, j6, z2, z3, i2, Offset.Companion.m7996getZeroF1C5BW0(), 0.0f, 0L, 6144, (o) null);
    }

    private PointerInputChange(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, boolean z3, int i2, long j7) {
        this(j2, j3, j4, z, j5, j6, z2, z3, i2, j7, 0.0f, 0L, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, (o) null);
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, boolean z3, int i2, long j7, int i3, o oVar) {
        this(j2, j3, j4, z, j5, j6, z2, z3, (i3 & 256) != 0 ? PointerType.Companion.m9689getTouchT8wyACA() : i2, (i3 & 512) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : j7, (o) null);
    }

    private PointerInputChange(long j2, long j3, long j4, boolean z, float f2, long j5, long j6, boolean z2, boolean z3, int i2, long j7, float f3, long j8) {
        this.id = j2;
        this.uptimeMillis = j3;
        this.position = j4;
        this.pressed = z;
        this.pressure = f2;
        this.previousUptimeMillis = j5;
        this.previousPosition = j6;
        this.previousPressed = z2;
        this.type = i2;
        this.scrollDelta = j7;
        this.scaleFactor = f3;
        this.panOffset = j8;
        this.originalEventPosition = Offset.Companion.m7996getZeroF1C5BW0();
        this.downChange = z3;
        this.positionChange = z3;
    }

    private PointerInputChange(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, boolean z3, int i2, long j7, float f2, long j8) {
        this(j2, j3, j4, z, 1.0f, j5, j6, z2, z3, i2, j7, f2, j8, (o) null);
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z, float f2, long j5, long j6, boolean z2, boolean z3, int i2, long j7, float f3, long j8, o oVar) {
        this(j2, j3, j4, z, f2, j5, j6, z2, z3, i2, j7, f3, j8);
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, boolean z3, int i2, long j7, float f2, long j8, int i3, o oVar) {
        this(j2, j3, j4, z, j5, j6, z2, z3, (i3 & 256) != 0 ? PointerType.Companion.m9689getTouchT8wyACA() : i2, (i3 & 512) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : j7, (i3 & 1024) != 0 ? 1.0f : f2, (i3 & 2048) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : j8, (o) null);
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, ConsumedData consumedData, int i2, int i3, o oVar) {
        this(j2, j3, j4, z, j5, j6, z2, consumedData, (i3 & 256) != 0 ? PointerType.Companion.m9689getTouchT8wyACA() : i2, (o) null);
    }
}
