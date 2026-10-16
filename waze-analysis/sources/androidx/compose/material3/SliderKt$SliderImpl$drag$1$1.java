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
final class SliderKt$SliderImpl$drag$1$1 extends g implements q<af, Float, e<? super ab>, Object> {
    final /* synthetic */ SliderState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SliderKt$SliderImpl$drag$1$1(SliderState sliderState, e<? super SliderKt$SliderImpl$drag$1$1> eVar) {
        super(3, eVar);
        this.$state = sliderState;
    }

    @Override // h.g.a.q
    public /* bridge */ /* synthetic */ Object invoke(af afVar, Float f2, e<? super ab> eVar) {
        return invoke(afVar, f2.floatValue(), eVar);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        this.$state.getGestureEndAction$material3().invoke();
        return ab.f48028a;
    }

    public final Object invoke(af afVar, float f2, e<? super ab> eVar) {
        return new SliderKt$SliderImpl$drag$1$1(this.$state, eVar).invokeSuspend(ab.f48028a);
    }
}
