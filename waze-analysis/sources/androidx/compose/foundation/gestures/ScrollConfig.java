package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.unit.Density;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ScrollConfig {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.ScrollConfig$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$isPreciseWheelScroll(ScrollConfig scrollConfig, PointerEvent pointerEvent) {
            return false;
        }

        public static boolean $default$isSmoothScrollingEnabled(ScrollConfig scrollConfig) {
            return true;
        }
    }

    /* renamed from: calculateMouseWheelScroll-8xgXZGE */
    long mo2148calculateMouseWheelScroll8xgXZGE(Density density, PointerEvent pointerEvent, long j2);

    boolean isPreciseWheelScroll(PointerEvent pointerEvent);

    boolean isSmoothScrollingEnabled();
}
