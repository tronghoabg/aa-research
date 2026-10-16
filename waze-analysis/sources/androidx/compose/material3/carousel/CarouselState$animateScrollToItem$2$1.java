package androidx.compose.material3.carousel;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.pager.PagerScrollScopeKt;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CarouselState$animateScrollToItem$2$1 extends g implements p<ScrollScope, e<? super ab>, Object> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ int $targetPage;
    final /* synthetic */ CarouselPagerState $this_with;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselState$animateScrollToItem$2$1(CarouselPagerState carouselPagerState, int i2, AnimationSpec<Float> animationSpec, e<? super CarouselState$animateScrollToItem$2$1> eVar) {
        super(2, eVar);
        this.$this_with = carouselPagerState;
        this.$targetPage = i2;
        this.$animationSpec = animationSpec;
    }

    static final ab invokeSuspend$lambda$0(CarouselPagerState carouselPagerState, ScrollScope scrollScope, int i2) {
        carouselPagerState.updateTargetPage(scrollScope, i2);
        return ab.f48028a;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        CarouselState$animateScrollToItem$2$1 carouselState$animateScrollToItem$2$1 = new CarouselState$animateScrollToItem$2$1(this.$this_with, this.$targetPage, this.$animationSpec, eVar);
        carouselState$animateScrollToItem$2$1.L$0 = obj;
        return carouselState$animateScrollToItem$2$1;
    }

    @Override // h.g.a.p
    public final Object invoke(ScrollScope scrollScope, e<? super ab> eVar) {
        return ((CarouselState$animateScrollToItem$2$1) create(scrollScope, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            LazyLayoutScrollScope LazyLayoutScrollScope = PagerScrollScopeKt.LazyLayoutScrollScope(this.$this_with, (ScrollScope) this.L$0);
            final CarouselPagerState carouselPagerState = this.$this_with;
            CarouselPagerState carouselPagerState2 = carouselPagerState;
            this.label = 1;
            if (CarouselStateKt.animateScrollToPage(LazyLayoutScrollScope, carouselPagerState2, this.$targetPage, 0.0f, this.$animationSpec, new p() { // from class: androidx.compose.material3.carousel.CarouselState$animateScrollToItem$2$1$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj2, Object obj3) {
                    return CarouselState$animateScrollToItem$2$1.invokeSuspend$lambda$0(carouselPagerState, (ScrollScope) obj2, ((Integer) obj3).intValue());
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
        return ab.f48028a;
    }
}
