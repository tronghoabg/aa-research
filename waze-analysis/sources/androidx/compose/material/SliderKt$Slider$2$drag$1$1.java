package androidx.compose.material;

import androidx.compose.runtime.State;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.q;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SliderKt$Slider$2$drag$1$1 extends g implements q<af, Float, e<? super ab>, Object> {
    final /* synthetic */ State<l<Float, ab>> $gestureEndAction;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SliderKt$Slider$2$drag$1$1(State<? extends l<? super Float, ab>> state, e<? super SliderKt$Slider$2$drag$1$1> eVar) {
        super(3, eVar);
        this.$gestureEndAction = state;
    }

    public final Object invoke(af afVar, float f2, e<? super ab> eVar) {
        SliderKt$Slider$2$drag$1$1 sliderKt$Slider$2$drag$1$1 = new SliderKt$Slider$2$drag$1$1(this.$gestureEndAction, eVar);
        sliderKt$Slider$2$drag$1$1.F$0 = f2;
        return sliderKt$Slider$2$drag$1$1.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        this.$gestureEndAction.getValue().invoke(new Float(this.F$0));
        return ab.f48028a;
    }

    @Override // h.g.a.q
    public /* bridge */ /* synthetic */ Object invoke(af afVar, Float f2, e<? super ab> eVar) {
        return invoke(afVar, f2.floatValue(), eVar);
    }
}
