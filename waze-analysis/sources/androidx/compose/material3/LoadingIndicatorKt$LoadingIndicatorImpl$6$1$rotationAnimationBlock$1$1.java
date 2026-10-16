package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.RepeatMode;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class LoadingIndicatorKt$LoadingIndicatorImpl$6$1$rotationAnimationBlock$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $globalRotation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoadingIndicatorKt$LoadingIndicatorImpl$6$1$rotationAnimationBlock$1$1(Animatable<Float, AnimationVector1D> animatable, e<? super LoadingIndicatorKt$LoadingIndicatorImpl$6$1$rotationAnimationBlock$1$1> eVar) {
        super(2, eVar);
        this.$globalRotation = animatable;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new LoadingIndicatorKt$LoadingIndicatorImpl$6$1$rotationAnimationBlock$1$1(this.$globalRotation, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((LoadingIndicatorKt$LoadingIndicatorImpl$6$1$rotationAnimationBlock$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            this.label = 1;
            if (Animatable.animateTo$default(this.$globalRotation, new Float(360.0f), AnimationSpecKt.m1878infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(4666, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), null, null, this, 12, null) == aVar) {
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
