package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class PointerInputChangeEventProducer {
    private final LongSparseArray<PointerInputData> previousPointerInputData = new LongSparseArray<>(0, 1, null);

    public final void clear() {
        this.previousPointerInputData.clear();
    }

    public final InternalPointerEvent produce(PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator) {
        long uptime;
        boolean down;
        long jMo9692screenToLocalMKHz9U;
        LongSparseArray longSparseArray = new LongSparseArray(pointerInputEvent.getPointers().size());
        List<PointerInputEventData> pointers = pointerInputEvent.getPointers();
        int size = pointers.size();
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputEventData pointerInputEventData = pointers.get(i2);
            PointerInputData pointerInputData = this.previousPointerInputData.get(pointerInputEventData.m9623getIdJ3iCeTQ());
            if (pointerInputData == null) {
                down = false;
                uptime = pointerInputEventData.getUptime();
                jMo9692screenToLocalMKHz9U = pointerInputEventData.m9626getPositionF1C5BW0();
            } else {
                uptime = pointerInputData.getUptime();
                down = pointerInputData.getDown();
                jMo9692screenToLocalMKHz9U = positionCalculator.mo9692screenToLocalMKHz9U(pointerInputData.m9613getPositionOnScreenF1C5BW0());
            }
            longSparseArray.put(pointerInputEventData.m9623getIdJ3iCeTQ(), new PointerInputChange(pointerInputEventData.m9623getIdJ3iCeTQ(), pointerInputEventData.getUptime(), pointerInputEventData.m9626getPositionF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.getPressure(), uptime, jMo9692screenToLocalMKHz9U, down, false, pointerInputEventData.m9629getTypeT8wyACA(), pointerInputEventData.getHistorical(), pointerInputEventData.m9628getScrollDeltaF1C5BW0(), pointerInputEventData.getScaleGestureFactor(), pointerInputEventData.m9625getPanGestureOffsetF1C5BW0(), pointerInputEventData.m9624getOriginalEventPositionF1C5BW0(), null));
            boolean down2 = pointerInputEventData.getDown();
            LongSparseArray<PointerInputData> longSparseArray2 = this.previousPointerInputData;
            if (down2) {
                longSparseArray2.put(pointerInputEventData.m9623getIdJ3iCeTQ(), new PointerInputData(pointerInputEventData.getUptime(), pointerInputEventData.m9627getPositionOnScreenF1C5BW0(), pointerInputEventData.getDown(), null));
            } else {
                longSparseArray2.remove(pointerInputEventData.m9623getIdJ3iCeTQ());
            }
        }
        return new InternalPointerEvent(longSparseArray, pointerInputEvent);
    }

    /* compiled from: WazeSource */
    final class PointerInputData {
        private final boolean down;
        private final long positionOnScreen;
        private final long uptime;

        private PointerInputData(long j2, long j3, boolean z) {
            this.uptime = j2;
            this.positionOnScreen = j3;
            this.down = z;
        }

        public final boolean getDown() {
            return this.down;
        }

        /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
        public final long m9613getPositionOnScreenF1C5BW0() {
            return this.positionOnScreen;
        }

        public final long getUptime() {
            return this.uptime;
        }

        public /* synthetic */ PointerInputData(long j2, long j3, boolean z, o oVar) {
            this(j2, j3, z);
        }
    }
}
