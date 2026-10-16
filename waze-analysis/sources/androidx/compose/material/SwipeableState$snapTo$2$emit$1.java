package androidx.compose.material;

import androidx.compose.material.SwipeableState;
import h.ab;
import h.c.b.a.c;
import h.c.e;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SwipeableState$snapTo$2$emit$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwipeableState.C03352<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SwipeableState$snapTo$2$emit$1(SwipeableState.C03352<? super T> c03352, e<? super SwipeableState$snapTo$2$emit$1> eVar) {
        super(eVar);
        this.this$0 = c03352;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Map) null, (e<? super ab>) this);
    }
}
