package androidx.compose.foundation.gestures;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DragGestureDetectorKt$awaitLongPressOrCancellation$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    DragGestureDetectorKt$awaitLongPressOrCancellation$1(e<? super DragGestureDetectorKt$awaitLongPressOrCancellation$1> eVar) {
        super(eVar);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m2189awaitLongPressOrCancellationrnUCldI(null, 0L, this);
    }
}
