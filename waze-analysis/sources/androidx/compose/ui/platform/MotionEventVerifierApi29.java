package androidx.compose.ui.platform;

import android.view.MotionEvent;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class MotionEventVerifierApi29 {
    public static final MotionEventVerifierApi29 INSTANCE = new MotionEventVerifierApi29();

    private MotionEventVerifierApi29() {
    }

    public final boolean isValidMotionEvent(MotionEvent motionEvent, int i2) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i2)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i2)) & Integer.MAX_VALUE) < 2139095040;
    }
}
