package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class PointerInteropFilter$pointerInputFilter$1$stopDispatching$1 extends y implements l<MotionEvent, ab> {
    final /* synthetic */ PointerInteropFilter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PointerInteropFilter$pointerInputFilter$1$stopDispatching$1(PointerInteropFilter pointerInteropFilter) {
        super(1);
        this.this$0 = pointerInteropFilter;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MotionEvent motionEvent) {
        this.this$0.getOnTouchEvent().invoke(motionEvent);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(MotionEvent motionEvent) {
        invoke2(motionEvent);
        return ab.f48028a;
    }
}
