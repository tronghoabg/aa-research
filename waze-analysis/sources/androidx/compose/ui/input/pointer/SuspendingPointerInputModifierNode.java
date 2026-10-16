package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.PointerInputModifierNode;
import h.ab;
import h.c.e;
import h.g.a.p;
import h.j;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface SuspendingPointerInputModifierNode extends PointerInputModifierNode {
    PointerInputEventHandler getPointerInputEventHandler();

    p<PointerInputScope, e<? super ab>, Object> getPointerInputHandler();

    void resetPointerInputHandler();

    void setPointerInputEventHandler(PointerInputEventHandler pointerInputEventHandler);

    void setPointerInputHandler(p<? super PointerInputScope, ? super e<? super ab>, ? extends Object> pVar);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode$-CC, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        public static PointerInputEventHandler $default$getPointerInputEventHandler(SuspendingPointerInputModifierNode suspendingPointerInputModifierNode) {
            throw new j("An operation is not implemented: pointerInputEventHandler must be implemented (get()).");
        }

        public static void $default$setPointerInputEventHandler(SuspendingPointerInputModifierNode suspendingPointerInputModifierNode, PointerInputEventHandler pointerInputEventHandler) {
            throw new j("An operation is not implemented: ".concat("pointerInputEventHandler must be implemented (set(" + pointerInputEventHandler + "))."));
        }

        public static /* synthetic */ void getPointerInputHandler$annotations() {
        }
    }
}
