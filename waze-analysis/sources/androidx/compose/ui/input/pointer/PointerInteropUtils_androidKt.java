package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PointerInteropUtils_androidKt {
    public static final void emptyCancelMotionEventScope(long j2, l<? super MotionEvent, ab> lVar) {
        MotionEvent motionEventObtain = MotionEvent.obtain(j2, j2, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setSource(0);
        lVar.invoke(motionEventObtain);
        motionEventObtain.recycle();
    }

    public static /* synthetic */ void emptyCancelMotionEventScope$default(long j2, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = SystemClock.uptimeMillis();
        }
        emptyCancelMotionEventScope(j2, lVar);
    }

    /* renamed from: toCancelMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m9669toCancelMotionEventScoped4ec7I(PointerEvent pointerEvent, long j2, l<? super MotionEvent, ab> lVar) {
        m9671toMotionEventScopeubNVwUQ(pointerEvent, j2, lVar, true);
    }

    /* renamed from: toMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m9670toMotionEventScoped4ec7I(PointerEvent pointerEvent, long j2, l<? super MotionEvent, ab> lVar) {
        m9671toMotionEventScopeubNVwUQ(pointerEvent, j2, lVar, false);
    }

    /* renamed from: toMotionEventScope-ubNVwUQ, reason: not valid java name */
    private static final void m9671toMotionEventScopeubNVwUQ(PointerEvent pointerEvent, long j2, l<? super MotionEvent, ab> lVar, boolean z) {
        MotionEvent motionEvent = pointerEvent.getMotionEvent();
        if (motionEvent == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEvent.getAction();
        if (z) {
            motionEvent.setAction(3);
        }
        int i2 = (int) (j2 >> 32);
        float f2 = -Float.intBitsToFloat(i2);
        int i3 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        motionEvent.offsetLocation(f2, -Float.intBitsToFloat(i3));
        lVar.invoke(motionEvent);
        motionEvent.offsetLocation(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
        motionEvent.setAction(action);
    }
}
