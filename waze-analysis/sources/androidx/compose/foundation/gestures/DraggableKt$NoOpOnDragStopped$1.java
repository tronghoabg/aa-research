package androidx.compose.foundation.gestures;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.q;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DraggableKt$NoOpOnDragStopped$1 extends g implements q<af, Float, e<? super ab>, Object> {
    int label;

    DraggableKt$NoOpOnDragStopped$1(e<? super DraggableKt$NoOpOnDragStopped$1> eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public /* bridge */ /* synthetic */ Object invoke(af afVar, Float f2, e<? super ab> eVar) {
        return invoke(afVar, f2.floatValue(), eVar);
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

    public final Object invoke(af afVar, float f2, e<? super ab> eVar) {
        return new DraggableKt$NoOpOnDragStopped$1(eVar).invokeSuspend(ab.f48028a);
    }
}
