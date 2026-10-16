package androidx.compose.ui.input.pointer;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1 extends g implements p<PointerInputScope, e<? super ab>, Object> {
    int label;

    SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1(e<? super SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1> eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1(eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
        return ((SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1) create(pointerInputScope, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        return ab.f48028a;
    }
}
