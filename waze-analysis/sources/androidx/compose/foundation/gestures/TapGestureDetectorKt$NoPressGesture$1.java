package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TapGestureDetectorKt$NoPressGesture$1 extends g implements q<PressGestureScope, Offset, e<? super ab>, Object> {
    int label;

    TapGestureDetectorKt$NoPressGesture$1(e<? super TapGestureDetectorKt$NoPressGesture$1> eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, e<? super ab> eVar) {
        return m2330invoked4ec7I(pressGestureScope, offset.m7990unboximpl(), eVar);
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m2330invoked4ec7I(PressGestureScope pressGestureScope, long j2, e<? super ab> eVar) {
        return new TapGestureDetectorKt$NoPressGesture$1(eVar).invokeSuspend(ab.f48028a);
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
