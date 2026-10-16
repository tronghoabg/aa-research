package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.collection.LongSparseArray;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PointerEvent {
    public static final int $stable = 8;
    private final int buttons;
    private final List<PointerInputChange> changes;
    private final int classification;
    private final InternalPointerEvent internalPointerEvent;
    private final int keyboardModifiers;
    private int type;

    public PointerEvent(List<PointerInputChange> list, InternalPointerEvent internalPointerEvent) {
        this.changes = list;
        this.internalPointerEvent = internalPointerEvent;
        MotionEvent motionEvent = getMotionEvent();
        this.classification = motionEvent != null ? motionEvent.getClassification() : 0;
        MotionEvent motionEvent2 = getMotionEvent();
        this.buttons = motionEvent2 != null ? motionEvent2.getButtonState() : 0;
        MotionEvent motionEvent3 = getMotionEvent();
        this.keyboardModifiers = motionEvent3 != null ? motionEvent3.getMetaState() : 0;
        this.type = m9538calculatePointerEventType7fucELk();
    }

    /* renamed from: calculatePointerEventType-7fucELk, reason: not valid java name */
    private final int m9538calculatePointerEventType7fucELk() {
        MotionEvent motionEvent = getMotionEvent();
        if (motionEvent == null) {
            List<PointerInputChange> list = this.changes;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                PointerInputChange pointerInputChange = list.get(i2);
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    return PointerEventType.Companion.m9559getRelease7fucELk();
                }
                if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
                    return PointerEventType.Companion.m9558getPress7fucELk();
                }
            }
            return PointerEventType.Companion.m9554getMove7fucELk();
        }
        int classification = motionEvent.getClassification();
        int classification2 = motionEvent.getClassification();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            return classification == 3 ? PointerEventType.Companion.m9557getPanStart7fucELk() : classification2 == 5 ? PointerEventType.Companion.m9562getScaleStart7fucELk() : PointerEventType.Companion.m9558getPress7fucELk();
        }
        if (actionMasked == 1) {
            return classification == 3 ? PointerEventType.Companion.m9555getPanEnd7fucELk() : classification2 == 5 ? PointerEventType.Companion.m9561getScaleEnd7fucELk() : PointerEventType.Companion.m9559getRelease7fucELk();
        }
        if (actionMasked != 2) {
            switch (actionMasked) {
                case 5:
                    return classification == 3 ? PointerEventType.Companion.m9557getPanStart7fucELk() : classification2 == 5 ? PointerEventType.Companion.m9560getScaleChange7fucELk() : PointerEventType.Companion.m9558getPress7fucELk();
                case 6:
                    return classification == 3 ? PointerEventType.Companion.m9555getPanEnd7fucELk() : classification2 == 5 ? PointerEventType.Companion.m9560getScaleChange7fucELk() : PointerEventType.Companion.m9559getRelease7fucELk();
                case 7:
                    break;
                case 8:
                    return PointerEventType.Companion.m9563getScroll7fucELk();
                case 9:
                    return PointerEventType.Companion.m9552getEnter7fucELk();
                case 10:
                    return PointerEventType.Companion.m9553getExit7fucELk();
                default:
                    return PointerEventType.Companion.m9564getUnknown7fucELk();
            }
        }
        return classification == 3 ? PointerEventType.Companion.m9556getPanMove7fucELk() : classification2 == 5 ? PointerEventType.Companion.m9560getScaleChange7fucELk() : PointerEventType.Companion.m9554getMove7fucELk();
    }

    public final List<PointerInputChange> component1() {
        return this.changes;
    }

    public final PointerEvent copy(List<PointerInputChange> list, MotionEvent motionEvent) {
        ArrayList arrayList;
        int i2;
        if (motionEvent == null) {
            return new PointerEvent(list, null);
        }
        if (x.n(motionEvent, getMotionEvent())) {
            return new PointerEvent(list, this.internalPointerEvent);
        }
        LongSparseArray longSparseArray = new LongSparseArray(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        int i3 = 0;
        for (int size = list.size(); i3 < size; size = i2) {
            PointerInputChange pointerInputChange = list.get(i3);
            longSparseArray.put(pointerInputChange.m9605getIdJ3iCeTQ(), pointerInputChange);
            ArrayList arrayList3 = arrayList2;
            long jM9605getIdJ3iCeTQ = pointerInputChange.m9605getIdJ3iCeTQ();
            long uptimeMillis = pointerInputChange.getUptimeMillis();
            long jM9608getPositionF1C5BW0 = pointerInputChange.m9608getPositionF1C5BW0();
            long jM9608getPositionF1C5BW02 = pointerInputChange.m9608getPositionF1C5BW0();
            boolean pressed = pointerInputChange.getPressed();
            float pressure = pointerInputChange.getPressure();
            int iM9611getTypeT8wyACA = pointerInputChange.m9611getTypeT8wyACA();
            InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
            if (internalPointerEvent != null) {
                arrayList = arrayList2;
                i2 = size;
                boolean z = internalPointerEvent.m9513activeHoverEvent0FcD4WY(pointerInputChange.m9605getIdJ3iCeTQ());
                arrayList3.add(new PointerInputEventData(jM9605getIdJ3iCeTQ, uptimeMillis, jM9608getPositionF1C5BW0, jM9608getPositionF1C5BW02, pressed, pressure, iM9611getTypeT8wyACA, z, null, 0L, pointerInputChange.getScaleFactor(), pointerInputChange.m9607getPanOffsetF1C5BW0(), 0L, 4864, null));
                i3++;
                arrayList2 = arrayList;
            } else {
                arrayList = arrayList2;
                i2 = size;
            }
            arrayList3.add(new PointerInputEventData(jM9605getIdJ3iCeTQ, uptimeMillis, jM9608getPositionF1C5BW0, jM9608getPositionF1C5BW02, pressed, pressure, iM9611getTypeT8wyACA, z, null, 0L, pointerInputChange.getScaleFactor(), pointerInputChange.m9607getPanOffsetF1C5BW0(), 0L, 4864, null));
            i3++;
            arrayList2 = arrayList;
        }
        return new PointerEvent(list, new InternalPointerEvent(longSparseArray, new PointerInputEvent(motionEvent.getEventTime(), arrayList2, motionEvent)));
    }

    /* renamed from: getButtons-ry648PA, reason: not valid java name */
    public final int m9539getButtonsry648PA() {
        return this.buttons;
    }

    public final List<PointerInputChange> getChanges() {
        return this.changes;
    }

    public final int getClassification() {
        return this.classification;
    }

    public final InternalPointerEvent getInternalPointerEvent$ui() {
        return this.internalPointerEvent;
    }

    /* renamed from: getKeyboardModifiers-k7X9c1A, reason: not valid java name */
    public final int m9540getKeyboardModifiersk7X9c1A() {
        return this.keyboardModifiers;
    }

    public final MotionEvent getMotionEvent() {
        InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
        if (internalPointerEvent != null) {
            return internalPointerEvent.getMotionEvent();
        }
        return null;
    }

    /* renamed from: getType-7fucELk, reason: not valid java name */
    public final int m9541getType7fucELk() {
        return this.type;
    }

    /* renamed from: setType-EhbLWgg$ui, reason: not valid java name */
    public final void m9542setTypeEhbLWgg$ui(int i2) {
        this.type = i2;
    }

    public PointerEvent(List<PointerInputChange> list) {
        this(list, null);
    }
}
