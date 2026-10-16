package androidx.compose.material;

import androidx.compose.material.BackdropScaffoldKt;
import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1 extends c {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BackdropScaffoldKt.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1(BackdropScaffoldKt.AnonymousClass1 anonymousClass1, e<? super BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1> eVar) {
        super(eVar);
        this.this$0 = anonymousClass1;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo2299onPreFlingQWom1Mo(0L, this);
    }
}
