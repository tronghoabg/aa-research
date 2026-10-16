package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.aq;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class FloatingActionButtonMenuKt$FloatingActionButtonMenuItemColumn$3$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ Animatable<Integer, AnimationVector1D> $it;
    final /* synthetic */ aq<FiniteAnimationSpec<Integer>> $staggerAnimSpec;
    final /* synthetic */ int $targetItemCount;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FloatingActionButtonMenuKt$FloatingActionButtonMenuItemColumn$3$1$1(Animatable<Integer, AnimationVector1D> animatable, int i2, aq<FiniteAnimationSpec<Integer>> aqVar, e<? super FloatingActionButtonMenuKt$FloatingActionButtonMenuItemColumn$3$1$1> eVar) {
        super(2, eVar);
        this.$it = animatable;
        this.$targetItemCount = i2;
        this.$staggerAnimSpec = aqVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new FloatingActionButtonMenuKt$FloatingActionButtonMenuItemColumn$3$1$1(this.$it, this.$targetItemCount, this.$staggerAnimSpec, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((FloatingActionButtonMenuKt$FloatingActionButtonMenuItemColumn$3$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            this.label = 1;
            if (Animatable.animateTo$default(this.$it, new Integer(this.$targetItemCount), (AnimationSpec) this.$staggerAnimSpec.f48105a, null, null, this, 12, null) == aVar) {
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
