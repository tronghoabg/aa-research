package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.ui.unit.Dp;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class TabIndicatorOffsetNode$measure$3 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ float $indicatorOffset;
    final /* synthetic */ Animatable<Dp, AnimationVector1D> $offsetAnim;
    int label;
    final /* synthetic */ TabIndicatorOffsetNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabIndicatorOffsetNode$measure$3(Animatable<Dp, AnimationVector1D> animatable, float f2, TabIndicatorOffsetNode tabIndicatorOffsetNode, e<? super TabIndicatorOffsetNode$measure$3> eVar) {
        super(2, eVar);
        this.$offsetAnim = animatable;
        this.$indicatorOffset = f2;
        this.this$0 = tabIndicatorOffsetNode;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new TabIndicatorOffsetNode$measure$3(this.$offsetAnim, this.$indicatorOffset, this.this$0, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((TabIndicatorOffsetNode$measure$3) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            Animatable<Dp, AnimationVector1D> animatable = this.$offsetAnim;
            float f2 = this.$indicatorOffset;
            TabIndicatorOffsetNode tabIndicatorOffsetNode = this.this$0;
            this.label = 1;
            if (Animatable.animateTo$default(animatable, Dp.m11162boximpl(f2), tabIndicatorOffsetNode.getAnimationSpec(), null, null, this, 12, null) == aVar) {
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
