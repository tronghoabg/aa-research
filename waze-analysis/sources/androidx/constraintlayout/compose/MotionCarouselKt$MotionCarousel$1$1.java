package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableState;
import androidx.constraintlayout.compose.carousel.CarouselSwipeableState;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class MotionCarouselKt$MotionCarousel$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ androidx.compose.runtime.State<MotionItemsProvider> $provider;
    final /* synthetic */ MutableState<CarouselState> $state$delegate;
    final /* synthetic */ String $swipeStateStart;
    final /* synthetic */ CarouselSwipeableState<String> $swipeableState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MotionCarouselKt$MotionCarousel$1$1(androidx.compose.runtime.State<? extends MotionItemsProvider> state, CarouselSwipeableState<String> carouselSwipeableState, String str, MutableState<CarouselState> mutableState, e<? super MotionCarouselKt$MotionCarousel$1$1> eVar) {
        super(2, eVar);
        this.$provider = state;
        this.$swipeableState = carouselSwipeableState;
        this.$swipeStateStart = str;
        this.$state$delegate = mutableState;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new MotionCarouselKt$MotionCarousel$1$1(this.$provider, this.$swipeableState, this.$swipeStateStart, this.$state$delegate, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((MotionCarouselKt$MotionCarousel$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            if (MotionCarouselKt.MotionCarousel$lambda$4(this.$state$delegate).getIndex() + 1 < this.$provider.getValue().count()) {
                CarouselState carouselStateMotionCarousel$lambda$4 = MotionCarouselKt.MotionCarousel$lambda$4(this.$state$delegate);
                carouselStateMotionCarousel$lambda$4.setIndex(carouselStateMotionCarousel$lambda$4.getIndex() + 1);
                this.label = 1;
                if (this.$swipeableState.snapTo(this.$swipeStateStart, this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        MotionCarouselKt.MotionCarousel$lambda$4(this.$state$delegate).setDirection(MotionCarouselDirection.FORWARD);
        return ab.f48028a;
    }
}
