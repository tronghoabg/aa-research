package androidx.compose.foundation.layout;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class WindowInsetsNestedScrollConnection$fling$1 extends c {
    float F$0;
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowInsetsNestedScrollConnection$fling$1(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, e<? super WindowInsetsNestedScrollConnection$fling$1> eVar) {
        super(eVar);
        this.this$0 = windowInsetsNestedScrollConnection;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m2852flinghuYlsQE(0L, 0.0f, false, this);
    }
}
