package androidx.compose.foundation.text.selection;

import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.core.view.InputDeviceCompat;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SelectionGestures_androidKt {
    private static final SelectionAdjustment FirstLongPressSelectionAdjustment = SelectionAdjustment.Companion.getWord();

    public static final SelectionAdjustment getFirstLongPressSelectionAdjustment() {
        return FirstLongPressSelectionAdjustment;
    }

    public static final boolean isMouseOrTouchPad(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!PointerType.m9682equalsimpl0(changes.get(i2).m9611getTypeT8wyACA(), PointerType.Companion.m9687getMouseT8wyACA())) {
                MotionEvent motionEvent = pointerEvent.getMotionEvent();
                if (motionEvent != null && motionEvent.isFromSource(InputDeviceCompat.SOURCE_MOUSE)) {
                    return true;
                }
                MotionEvent motionEvent2 = pointerEvent.getMotionEvent();
                return motionEvent2 != null && motionEvent2.isFromSource(InputDeviceCompat.SOURCE_TOUCHPAD);
            }
        }
        return true;
    }
}
