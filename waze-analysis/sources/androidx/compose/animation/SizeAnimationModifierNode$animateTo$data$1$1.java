package androidx.compose.animation;

import androidx.compose.animation.SizeAnimationModifierNode;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationEndReason;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.ui.unit.IntSize;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SizeAnimationModifierNode$animateTo$data$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ long $targetSize;
    final /* synthetic */ SizeAnimationModifierNode.AnimData $this_apply;
    int label;
    final /* synthetic */ SizeAnimationModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SizeAnimationModifierNode$animateTo$data$1$1(SizeAnimationModifierNode.AnimData animData, long j2, SizeAnimationModifierNode sizeAnimationModifierNode, e<? super SizeAnimationModifierNode$animateTo$data$1$1> eVar) {
        super(2, eVar);
        this.$this_apply = animData;
        this.$targetSize = j2;
        this.this$0 = sizeAnimationModifierNode;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new SizeAnimationModifierNode$animateTo$data$1$1(this.$this_apply, this.$targetSize, this.this$0, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((SizeAnimationModifierNode$animateTo$data$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        p<IntSize, IntSize, ab> listener;
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            SizeAnimationModifierNode.AnimData animData = this.$this_apply;
            long j2 = this.$targetSize;
            SizeAnimationModifierNode sizeAnimationModifierNode = this.this$0;
            this.label = 1;
            obj = Animatable.animateTo$default(animData.getAnim(), IntSize.m11331boximpl(j2), sizeAnimationModifierNode.getAnimationSpec(), null, null, this, 12, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        AnimationResult animationResult = (AnimationResult) obj;
        if (animationResult.getEndReason() == AnimationEndReason.Finished && (listener = this.this$0.getListener()) != 0) {
            listener.invoke(IntSize.m11331boximpl(this.$this_apply.m1841getStartSizeYbymL2g()), animationResult.getEndState().getValue());
        }
        return ab.f48028a;
    }
}
