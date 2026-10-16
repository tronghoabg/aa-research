package androidx.compose.material;

import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SliderKt$Slider$2$gestureEndAction$1$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ float $current;
    final /* synthetic */ SliderDraggableState $draggableState;
    final /* synthetic */ a<ab> $onValueChangeFinished;
    final /* synthetic */ float $target;
    final /* synthetic */ float $velocity;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SliderKt$Slider$2$gestureEndAction$1$1$1(SliderDraggableState sliderDraggableState, float f2, float f3, float f4, a<ab> aVar, e<? super SliderKt$Slider$2$gestureEndAction$1$1$1> eVar) {
        super(2, eVar);
        this.$draggableState = sliderDraggableState;
        this.$current = f2;
        this.$target = f3;
        this.$velocity = f4;
        this.$onValueChangeFinished = aVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new SliderKt$Slider$2$gestureEndAction$1$1$1(this.$draggableState, this.$current, this.$target, this.$velocity, this.$onValueChangeFinished, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((SliderKt$Slider$2$gestureEndAction$1$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            SliderDraggableState sliderDraggableState = this.$draggableState;
            this.label = 1;
            if (SliderKt.animateToTarget(sliderDraggableState, this.$current, this.$target, this.$velocity, this) == aVar) {
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
