package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.an;
import h.k.n;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SliderKt$RangeSlider$2$gestureEndAction$1$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ float $current;
    final /* synthetic */ boolean $isStart;
    final /* synthetic */ an $maxPx;
    final /* synthetic */ an $minPx;
    final /* synthetic */ a<ab> $onValueChangeFinished;
    final /* synthetic */ State<l<h.k.e<Float>, ab>> $onValueChangeState;
    final /* synthetic */ MutableFloatState $rawOffsetEnd;
    final /* synthetic */ MutableFloatState $rawOffsetStart;
    final /* synthetic */ float $target;
    final /* synthetic */ h.k.e<Float> $valueRange;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SliderKt$RangeSlider$2$gestureEndAction$1$1$1(float f2, float f3, a<ab> aVar, boolean z, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, State<? extends l<? super h.k.e<Float>, ab>> state, an anVar, an anVar2, h.k.e<Float> eVar, e<? super SliderKt$RangeSlider$2$gestureEndAction$1$1$1> eVar2) {
        super(2, eVar2);
        this.$current = f2;
        this.$target = f3;
        this.$onValueChangeFinished = aVar;
        this.$isStart = z;
        this.$rawOffsetStart = mutableFloatState;
        this.$rawOffsetEnd = mutableFloatState2;
        this.$onValueChangeState = state;
        this.$minPx = anVar;
        this.$maxPx = anVar2;
        this.$valueRange = eVar;
    }

    static final ab invokeSuspend$lambda$0(boolean z, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, State state, an anVar, an anVar2, h.k.e eVar, Animatable animatable) {
        (true != z ? mutableFloatState2 : mutableFloatState).setFloatValue(((Number) animatable.getValue()).floatValue());
        ((l) state.getValue()).invoke(SliderKt.RangeSlider$lambda$4$scaleToUserValue(anVar, anVar2, eVar, n.b(mutableFloatState.getFloatValue(), mutableFloatState2.getFloatValue())));
        return ab.f48028a;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new SliderKt$RangeSlider$2$gestureEndAction$1$1$1(this.$current, this.$target, this.$onValueChangeFinished, this.$isStart, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onValueChangeState, this.$minPx, this.$maxPx, this.$valueRange, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((SliderKt$RangeSlider$2$gestureEndAction$1$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            float f2 = this.$current;
            float f3 = this.$target;
            Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(f2, 0.0f, 2, null);
            Float f4 = new Float(f3);
            TweenSpec tweenSpec = SliderKt.SliderToTickAnimation;
            Float f5 = new Float(0.0f);
            final boolean z = this.$isStart;
            final MutableFloatState mutableFloatState = this.$rawOffsetStart;
            final MutableFloatState mutableFloatState2 = this.$rawOffsetEnd;
            final State<l<h.k.e<Float>, ab>> state = this.$onValueChangeState;
            final an anVar = this.$minPx;
            final an anVar2 = this.$maxPx;
            final h.k.e<Float> eVar = this.$valueRange;
            this.label = 1;
            if (animatableAnimatable$default.animateTo(f4, tweenSpec, f5, new l() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1$1$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return SliderKt$RangeSlider$2$gestureEndAction$1$1$1.invokeSuspend$lambda$0(z, mutableFloatState, mutableFloatState2, state, anVar, anVar2, eVar, (Animatable) obj2);
                }
            }, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        a<ab> aVar2 = this.$onValueChangeFinished;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return ab.f48028a;
    }
}
