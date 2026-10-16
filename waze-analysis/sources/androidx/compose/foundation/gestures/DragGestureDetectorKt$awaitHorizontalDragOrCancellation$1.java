package androidx.compose.foundation.gestures;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1(e<? super DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1> eVar) {
        super(eVar);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m2186awaitHorizontalDragOrCancellationrnUCldI(null, 0L, this);
    }
}
