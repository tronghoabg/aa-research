package androidx.compose.foundation.gestures;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DragGestureDetectorKt$awaitVerticalDragOrCancellation$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    DragGestureDetectorKt$awaitVerticalDragOrCancellation$1(e<? super DragGestureDetectorKt$awaitVerticalDragOrCancellation$1> eVar) {
        super(eVar);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m2194awaitVerticalDragOrCancellationrnUCldI(null, 0L, this);
    }
}
