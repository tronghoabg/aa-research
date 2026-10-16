package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class NonTouchScrollingLogic$userScroll$2 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ p<NestedScrollScope, e<? super ab>, Object> $block;
    int label;
    final /* synthetic */ NonTouchScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NonTouchScrollingLogic$userScroll$2(NonTouchScrollingLogic nonTouchScrollingLogic, p<? super NestedScrollScope, ? super e<? super ab>, ? extends Object> pVar, e<? super NonTouchScrollingLogic$userScroll$2> eVar) {
        super(2, eVar);
        this.this$0 = nonTouchScrollingLogic;
        this.$block = pVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new NonTouchScrollingLogic$userScroll$2(this.this$0, this.$block, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((NonTouchScrollingLogic$userScroll$2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            NonTouchScrollingLogic nonTouchScrollingLogic = this.this$0;
            p<NestedScrollScope, e<? super ab>, Object> pVar = this.$block;
            this.label = 1;
            if (nonTouchScrollingLogic.getScrollingLogic().scroll(MutatePriority.UserInput, pVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        return ab.f48028a;
    }
}
