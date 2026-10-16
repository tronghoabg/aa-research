package androidx.compose.material3;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.q;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarDragModifier$2$1 extends g implements q<af, Float, e<? super ab>, Object> {
    final /* synthetic */ TwoRowsTopAppBarOverrideScope $this_TwoRowsTopAppBar;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarDragModifier$2$1(TwoRowsTopAppBarOverrideScope twoRowsTopAppBarOverrideScope, e<? super DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarDragModifier$2$1> eVar) {
        super(3, eVar);
        this.$this_TwoRowsTopAppBar = twoRowsTopAppBarOverrideScope;
    }

    public final Object invoke(af afVar, float f2, e<? super ab> eVar) {
        DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarDragModifier$2$1 defaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarDragModifier$2$1 = new DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarDragModifier$2$1(this.$this_TwoRowsTopAppBar, eVar);
        defaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarDragModifier$2$1.F$0 = f2;
        return defaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarDragModifier$2$1.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            float f2 = this.F$0;
            this.label = 1;
            if (AppBarKt.settleAppBar(this.$this_TwoRowsTopAppBar.getScrollBehavior().getState(), f2, this.$this_TwoRowsTopAppBar.getScrollBehavior().getFlingAnimationSpec(), this.$this_TwoRowsTopAppBar.getScrollBehavior().getSnapAnimationSpec(), this) == aVar) {
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

    @Override // h.g.a.q
    public /* bridge */ /* synthetic */ Object invoke(af afVar, Float f2, e<? super ab> eVar) {
        return invoke(afVar, f2.floatValue(), eVar);
    }
}
