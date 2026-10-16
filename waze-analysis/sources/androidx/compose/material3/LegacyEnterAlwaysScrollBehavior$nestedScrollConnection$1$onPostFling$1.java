package androidx.compose.material3;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class LegacyEnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 extends c {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LegacyEnterAlwaysScrollBehavior$nestedScrollConnection$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyEnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1(LegacyEnterAlwaysScrollBehavior$nestedScrollConnection$1 legacyEnterAlwaysScrollBehavior$nestedScrollConnection$1, e<? super LegacyEnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1> eVar) {
        super(eVar);
        this.this$0 = legacyEnterAlwaysScrollBehavior$nestedScrollConnection$1;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo2297onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
