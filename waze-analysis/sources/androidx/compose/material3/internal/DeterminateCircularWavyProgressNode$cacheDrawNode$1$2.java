package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.material3.WavyProgressIndicatorKt;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class DeterminateCircularWavyProgressNode$cacheDrawNode$1$2 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ float $targetAmplitude;
    int label;
    final /* synthetic */ DeterminateCircularWavyProgressNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeterminateCircularWavyProgressNode$cacheDrawNode$1$2(DeterminateCircularWavyProgressNode determinateCircularWavyProgressNode, float f2, e<? super DeterminateCircularWavyProgressNode$cacheDrawNode$1$2> eVar) {
        super(2, eVar);
        this.this$0 = determinateCircularWavyProgressNode;
        this.$targetAmplitude = f2;
    }

    static final ab invokeSuspend$lambda$0(DeterminateCircularWavyProgressNode determinateCircularWavyProgressNode, Animatable animatable) {
        determinateCircularWavyProgressNode.amplitudeState.setFloatValue(((Number) animatable.getValue()).floatValue());
        return ab.f48028a;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new DeterminateCircularWavyProgressNode$cacheDrawNode$1$2(this.this$0, this.$targetAmplitude, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((DeterminateCircularWavyProgressNode$cacheDrawNode$1$2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            Animatable animatable = this.this$0.amplitudeAnimatable;
            if (animatable != null) {
                Float f2 = new Float(this.$targetAmplitude);
                AnimationSpec<Float> increasingAmplitudeAnimationSpec = ((Number) animatable.getValue()).floatValue() < this.$targetAmplitude ? WavyProgressIndicatorKt.getIncreasingAmplitudeAnimationSpec() : WavyProgressIndicatorKt.getDecreasingAmplitudeAnimationSpec();
                final DeterminateCircularWavyProgressNode determinateCircularWavyProgressNode = this.this$0;
                this.label = 1;
                if (Animatable.animateTo$default(animatable, f2, increasingAmplitudeAnimationSpec, null, new l() { // from class: androidx.compose.material3.internal.DeterminateCircularWavyProgressNode$cacheDrawNode$1$2$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return DeterminateCircularWavyProgressNode$cacheDrawNode$1$2.invokeSuspend$lambda$0(determinateCircularWavyProgressNode, (Animatable) obj2);
                    }
                }, this, 4, null) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        if (this.$targetAmplitude == 0.0f) {
            this.this$0.stopOffsetAnimation();
        }
        return ab.f48028a;
    }
}
