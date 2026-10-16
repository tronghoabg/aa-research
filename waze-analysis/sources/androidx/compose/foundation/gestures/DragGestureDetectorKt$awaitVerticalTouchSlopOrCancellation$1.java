package androidx.compose.foundation.gestures;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 extends c {
    float F$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1(e<? super DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1> eVar) {
        super(eVar);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m2196awaitVerticalTouchSlopOrCancellationjO51t88(null, 0L, null, this);
    }
}
