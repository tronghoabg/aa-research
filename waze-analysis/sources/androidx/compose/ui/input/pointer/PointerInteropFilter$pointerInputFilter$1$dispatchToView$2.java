package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class PointerInteropFilter$pointerInputFilter$1$dispatchToView$2 extends y implements l<MotionEvent, ab> {
    final /* synthetic */ PointerInteropFilter$pointerInputFilter$1 this$0;
    final /* synthetic */ PointerInteropFilter this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PointerInteropFilter$pointerInputFilter$1$dispatchToView$2(PointerInteropFilter$pointerInputFilter$1 pointerInteropFilter$pointerInputFilter$1, PointerInteropFilter pointerInteropFilter) {
        super(1);
        this.this$0 = pointerInteropFilter$pointerInputFilter$1;
        this.this$1 = pointerInteropFilter;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            this.this$1.getOnTouchEvent().invoke(motionEvent);
        } else {
            this.this$0.state = this.this$1.getOnTouchEvent().invoke(motionEvent).booleanValue() ? PointerInteropFilter.DispatchToViewState.Dispatching : PointerInteropFilter.DispatchToViewState.NotDispatching;
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(MotionEvent motionEvent) {
        invoke2(motionEvent);
        return ab.f48028a;
    }
}
