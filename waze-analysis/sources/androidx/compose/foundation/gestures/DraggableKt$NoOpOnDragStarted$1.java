package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.q;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DraggableKt$NoOpOnDragStarted$1 extends g implements q<af, Offset, e<? super ab>, Object> {
    int label;

    DraggableKt$NoOpOnDragStarted$1(e<? super DraggableKt$NoOpOnDragStarted$1> eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public /* bridge */ /* synthetic */ Object invoke(af afVar, Offset offset, e<? super ab> eVar) {
        return m2215invoked4ec7I(afVar, offset.m7990unboximpl(), eVar);
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m2215invoked4ec7I(af afVar, long j2, e<? super ab> eVar) {
        return new DraggableKt$NoOpOnDragStarted$1(eVar).invokeSuspend(ab.f48028a);
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
