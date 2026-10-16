package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class MotionEventHelper {
    public static final MotionEventHelper INSTANCE = new MotionEventHelper();

    private MotionEventHelper() {
    }

    /* renamed from: toRawOffset-dBAh8RU, reason: not valid java name */
    public final long m9530toRawOffsetdBAh8RU(MotionEvent motionEvent, int i2) {
        float rawX = motionEvent.getRawX(i2);
        float rawY = motionEvent.getRawY(i2);
        return (Float.floatToRawIntBits(rawY) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(rawX) << 32);
    }
}
