package androidx.compose.ui.platform;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent_androidKt;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class IndirectPointerNavigationGestureDetector {
    public static final int $stable = 8;
    private final GestureDetector gestureDetector;
    private boolean ignoreCurrentGestureStream;
    private final l<FocusDirection, ab> onMoveFocus;
    private int primaryDirectionalMotionAxis = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m9093getNonenZO2Niw();

    /* JADX WARN: Multi-variable type inference failed */
    public IndirectPointerNavigationGestureDetector(Context context, l<? super FocusDirection, ab> lVar) {
        this.onMoveFocus = lVar;
        this.gestureDetector = new GestureDetector(context, new GestureDetector.OnGestureListener() { // from class: androidx.compose.ui.platform.IndirectPointerNavigationGestureDetector$gestureDetector$1
            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                if (this.this$0.ignoreCurrentGestureStream) {
                    return true;
                }
                if (IndirectPointerEventPrimaryDirectionalMotionAxis.m9089equalsimpl0(this.this$0.m10250getPrimaryDirectionalMotionAxisnZO2Niw(), IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m9094getXnZO2Niw())) {
                    if (Math.abs(f2) <= Math.abs(f3)) {
                        return true;
                    }
                    this.this$0.onMoveFocus.invoke(FocusDirection.m7852boximpl(f2 > 0.0f ? FocusDirection.Companion.m7863getNextdhqQ8s() : FocusDirection.Companion.m7864getPreviousdhqQ8s()));
                    return true;
                }
                if (!IndirectPointerEventPrimaryDirectionalMotionAxis.m9089equalsimpl0(this.this$0.m10250getPrimaryDirectionalMotionAxisnZO2Niw(), IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m9095getYnZO2Niw()) || Math.abs(f3) <= Math.abs(f2)) {
                    return true;
                }
                this.this$0.onMoveFocus.invoke(FocusDirection.m7852boximpl(f3 > 0.0f ? FocusDirection.Companion.m7863getNextdhqQ8s() : FocusDirection.Companion.m7864getPreviousdhqQ8s()));
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                return true;
            }
        });
    }

    public final void cancelCurrentEventStream() {
        this.primaryDirectionalMotionAxis = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m9093getNonenZO2Niw();
        this.ignoreCurrentGestureStream = true;
    }

    /* renamed from: getPrimaryDirectionalMotionAxis-nZO2Niw, reason: not valid java name */
    public final int m10250getPrimaryDirectionalMotionAxisnZO2Niw() {
        return this.primaryDirectionalMotionAxis;
    }

    public final boolean onIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent, boolean z) {
        MotionEvent nativeEvent = AndroidIndirectPointerEvent_androidKt.getNativeEvent(indirectPointerEvent);
        int action = nativeEvent.getAction();
        if (action == 0) {
            this.primaryDirectionalMotionAxis = indirectPointerEvent.mo9081getPrimaryDirectionalMotionAxisnZO2Niw();
            this.ignoreCurrentGestureStream = false;
        } else if ((action == 1 || action == 2) && z) {
            cancelCurrentEventStream();
        }
        return this.gestureDetector.onTouchEvent(nativeEvent);
    }

    /* renamed from: setPrimaryDirectionalMotionAxis-WQKaTuc, reason: not valid java name */
    public final void m10251setPrimaryDirectionalMotionAxisWQKaTuc(int i2) {
        this.primaryDirectionalMotionAxis = i2;
    }
}
