package androidx.compose.material3;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class SheetState$anchoredDrag$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SheetState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SheetState$anchoredDrag$1(SheetState sheetState, e<? super SheetState$anchoredDrag$1> eVar) {
        super(eVar);
        this.this$0 = sheetState;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.anchoredDrag$material3(null, 0.0f, this);
    }
}
