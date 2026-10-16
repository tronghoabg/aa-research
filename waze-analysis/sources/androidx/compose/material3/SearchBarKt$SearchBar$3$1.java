package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class SearchBarKt$SearchBar$3$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animationProgress;
    final /* synthetic */ MutableState<BackEventCompat> $currentBackEvent;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ MutableFloatState $finalBackProgress;
    final /* synthetic */ MutableState<BackEventCompat> $firstBackEvent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBarKt$SearchBar$3$1(Animatable<Float, AnimationVector1D> animatable, boolean z, MutableFloatState mutableFloatState, MutableState<BackEventCompat> mutableState, MutableState<BackEventCompat> mutableState2, e<? super SearchBarKt$SearchBar$3$1> eVar) {
        super(2, eVar);
        this.$animationProgress = animatable;
        this.$expanded = z;
        this.$finalBackProgress = mutableFloatState;
        this.$firstBackEvent = mutableState;
        this.$currentBackEvent = mutableState2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new SearchBarKt$SearchBar$3$1(this.$animationProgress, this.$expanded, this.$finalBackProgress, this.$firstBackEvent, this.$currentBackEvent, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((SearchBarKt$SearchBar$3$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            FiniteAnimationSpec finiteAnimationSpec = (this.$animationProgress.getValue().floatValue() <= 0.0f || this.$animationProgress.getValue().floatValue() >= 1.0f) ? this.$expanded ? SearchBarKt.AnimationEnterFloatSpec : SearchBarKt.AnimationExitFloatSpec : SearchBarKt.AnimationPredictiveBackExitFloatSpec;
            float f2 = true == this.$expanded ? 1.0f : 0.0f;
            if (this.$animationProgress.getValue().floatValue() != f2) {
                this.label = 1;
                if (Animatable.animateTo$default(this.$animationProgress, new Float(f2), finiteAnimationSpec, null, null, this, 12, null) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        if (!this.$expanded) {
            this.$finalBackProgress.setFloatValue(Float.NaN);
            this.$firstBackEvent.setValue(null);
            this.$currentBackEvent.setValue(null);
        }
        return ab.f48028a;
    }
}
