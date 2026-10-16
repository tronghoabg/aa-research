package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.platform.InfiniteAnimationPolicy;
import androidx.graphics.shapes.Morph;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class LoadingIndicatorKt$LoadingIndicatorImpl$6$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ MutableIntState $currentMorphIndex$delegate;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $globalRotation;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $morphProgress;
    final /* synthetic */ MutableFloatState $morphRotationTargetAngle$delegate;
    final /* synthetic */ List<Morph> $morphSequence;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.LoadingIndicatorKt$LoadingIndicatorImpl$6$1$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements l<e<? super ab>, Object> {
        final /* synthetic */ a<br> $morphAnimationBlock;
        final /* synthetic */ a<br> $rotationAnimationBlock;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(a<? extends br> aVar, a<? extends br> aVar2, e<? super AnonymousClass1> eVar) {
            super(1, eVar);
            this.$morphAnimationBlock = aVar;
            this.$rotationAnimationBlock = aVar2;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new AnonymousClass1(this.$morphAnimationBlock, this.$rotationAnimationBlock, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super ab> eVar) {
            return ((AnonymousClass1) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            this.$morphAnimationBlock.invoke();
            this.$rotationAnimationBlock.invoke();
            return ab.f48028a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoadingIndicatorKt$LoadingIndicatorImpl$6$1(Animatable<Float, AnimationVector1D> animatable, List<Morph> list, MutableIntState mutableIntState, MutableFloatState mutableFloatState, Animatable<Float, AnimationVector1D> animatable2, e<? super LoadingIndicatorKt$LoadingIndicatorImpl$6$1> eVar) {
        super(2, eVar);
        this.$morphProgress = animatable;
        this.$morphSequence = list;
        this.$currentMorphIndex$delegate = mutableIntState;
        this.$morphRotationTargetAngle$delegate = mutableFloatState;
        this.$globalRotation = animatable2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        LoadingIndicatorKt$LoadingIndicatorImpl$6$1 loadingIndicatorKt$LoadingIndicatorImpl$6$1 = new LoadingIndicatorKt$LoadingIndicatorImpl$6$1(this.$morphProgress, this.$morphSequence, this.$currentMorphIndex$delegate, this.$morphRotationTargetAngle$delegate, this.$globalRotation, eVar);
        loadingIndicatorKt$LoadingIndicatorImpl$6$1.L$0 = obj;
        return loadingIndicatorKt$LoadingIndicatorImpl$6$1;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((LoadingIndicatorKt$LoadingIndicatorImpl$6$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            final af afVar = (af) this.L$0;
            final Animatable<Float, AnimationVector1D> animatable = this.$morphProgress;
            final List<Morph> list = this.$morphSequence;
            final MutableIntState mutableIntState = this.$currentMorphIndex$delegate;
            final MutableFloatState mutableFloatState = this.$morphRotationTargetAngle$delegate;
            a aVar2 = new a() { // from class: androidx.compose.material3.LoadingIndicatorKt$LoadingIndicatorImpl$6$1$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return aj.z(afVar, null, null, new LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1(animatable, list, mutableIntState, mutableFloatState, null), 3);
                }
            };
            final Animatable<Float, AnimationVector1D> animatable2 = this.$globalRotation;
            a aVar3 = new a() { // from class: androidx.compose.material3.LoadingIndicatorKt$LoadingIndicatorImpl$6$1$$ExternalSyntheticLambda1
                @Override // h.g.a.a
                public final Object invoke() {
                    return aj.z(afVar, null, null, new LoadingIndicatorKt$LoadingIndicatorImpl$6$1$rotationAnimationBlock$1$1(animatable2, null), 3);
                }
            };
            InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) afVar.getCoroutineContext().get(InfiniteAnimationPolicy.Key);
            if (infiniteAnimationPolicy == null) {
                aVar2.invoke();
                aVar3.invoke();
            } else {
                this.label = 1;
                if (infiniteAnimationPolicy.onInfiniteOperation(new AnonymousClass1(aVar2, aVar3, null), this) == aVar) {
                    return aVar;
                }
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
