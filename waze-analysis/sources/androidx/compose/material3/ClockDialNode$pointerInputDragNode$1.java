package androidx.compose.material3;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.a.p;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ClockDialNode$pointerInputDragNode$1 implements PointerInputEventHandler {
    final /* synthetic */ ClockDialNode this$0;

    ClockDialNode$pointerInputDragNode$1(ClockDialNode clockDialNode) {
        this.this$0 = clockDialNode;
    }

    static final ab invoke$lambda$0(ClockDialNode clockDialNode) {
        aj.z(clockDialNode.getCoroutineScope(), null, null, new ClockDialNode$pointerInputDragNode$1$1$1(clockDialNode, null), 3);
        return ab.f48028a;
    }

    static final ab invoke$lambda$1(ClockDialNode clockDialNode, PointerInputChange pointerInputChange, Offset offset) {
        aj.z(clockDialNode.getCoroutineScope(), null, null, new ClockDialNode$pointerInputDragNode$1$2$1(clockDialNode, offset, null), 3);
        return ab.f48028a;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
        final ClockDialNode clockDialNode = this.this$0;
        Object objDetectDragGestures$default = DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, null, new a() { // from class: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return ClockDialNode$pointerInputDragNode$1.invoke$lambda$0(clockDialNode);
            }
        }, null, new p() { // from class: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$$ExternalSyntheticLambda1
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return ClockDialNode$pointerInputDragNode$1.invoke$lambda$1(clockDialNode, (PointerInputChange) obj, (Offset) obj2);
            }
        }, eVar, 5, null);
        return objDetectDragGestures$default == h.c.a.a.f48038a ? objDetectDragGestures$default : ab.f48028a;
    }
}
