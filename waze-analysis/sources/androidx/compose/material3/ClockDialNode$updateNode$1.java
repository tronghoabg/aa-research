package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ClockDialNode$updateNode$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ AnalogTimePickerState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClockDialNode$updateNode$1(AnalogTimePickerState analogTimePickerState, AnimationSpec<Float> animationSpec, e<? super ClockDialNode$updateNode$1> eVar) {
        super(2, eVar);
        this.$state = analogTimePickerState;
        this.$animationSpec = animationSpec;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new ClockDialNode$updateNode$1(this.$state, this.$animationSpec, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((ClockDialNode$updateNode$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            this.label = 1;
            if (this.$state.animateToCurrent(this.$animationSpec, this) == aVar) {
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
