package androidx.compose.ui.input.pointer;

import h.c;
import h.c.e;
import h.g.a.p;
import h.g.b.r;
import h.g.b.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final /* synthetic */ class SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0 implements PointerInputEventHandler, r {
    private final /* synthetic */ p function;

    SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(p pVar) {
        this.function = pVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof PointerInputEventHandler) && (obj instanceof r)) {
            return x.n(getFunctionDelegate(), ((r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final c<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(PointerInputScope pointerInputScope, e eVar) {
        return this.function.invoke(pointerInputScope, eVar);
    }
}
