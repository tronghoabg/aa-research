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
final class AppBarKt$BottomAppBarLayout$appBarDragModifier$2$1 extends g implements q<af, Float, e<? super ab>, Object> {
    final /* synthetic */ BottomAppBarScrollBehavior $activeScrollBehavior;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppBarKt$BottomAppBarLayout$appBarDragModifier$2$1(BottomAppBarScrollBehavior bottomAppBarScrollBehavior, e<? super AppBarKt$BottomAppBarLayout$appBarDragModifier$2$1> eVar) {
        super(3, eVar);
        this.$activeScrollBehavior = bottomAppBarScrollBehavior;
    }

    public final Object invoke(af afVar, float f2, e<? super ab> eVar) {
        AppBarKt$BottomAppBarLayout$appBarDragModifier$2$1 appBarKt$BottomAppBarLayout$appBarDragModifier$2$1 = new AppBarKt$BottomAppBarLayout$appBarDragModifier$2$1(this.$activeScrollBehavior, eVar);
        appBarKt$BottomAppBarLayout$appBarDragModifier$2$1.F$0 = f2;
        return appBarKt$BottomAppBarLayout$appBarDragModifier$2$1.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            float f2 = this.F$0;
            BottomAppBarScrollBehavior bottomAppBarScrollBehavior = this.$activeScrollBehavior;
            this.label = 1;
            if (AppBarKt.settleAppBarBottom(bottomAppBarScrollBehavior.getState(), f2, bottomAppBarScrollBehavior.getFlingAnimationSpec(), bottomAppBarScrollBehavior.getSnapAnimationSpec(), this) == aVar) {
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
