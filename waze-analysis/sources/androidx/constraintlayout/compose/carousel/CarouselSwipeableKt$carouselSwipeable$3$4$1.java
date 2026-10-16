package androidx.constraintlayout.compose.carousel;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.a.q;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class CarouselSwipeableKt$carouselSwipeable$3$4$1 extends g implements q<af, Float, e<? super ab>, Object> {
    final /* synthetic */ CarouselSwipeableState $state;
    /* synthetic */ float F$0;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: WazeSource */
    /* renamed from: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$4$1$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ CarouselSwipeableState $state;
        final /* synthetic */ float $velocity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CarouselSwipeableState carouselSwipeableState, float f2, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$state = carouselSwipeableState;
            this.$velocity = f2;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.$state, this.$velocity, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (this.$state.performFling(this.$velocity, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselSwipeableKt$carouselSwipeable$3$4$1(CarouselSwipeableState carouselSwipeableState, e<? super CarouselSwipeableKt$carouselSwipeable$3$4$1> eVar) {
        super(3, eVar);
        this.$state = carouselSwipeableState;
    }

    public final Object invoke(af afVar, float f2, e<? super ab> eVar) {
        CarouselSwipeableKt$carouselSwipeable$3$4$1 carouselSwipeableKt$carouselSwipeable$3$4$1 = new CarouselSwipeableKt$carouselSwipeable$3$4$1(this.$state, eVar);
        carouselSwipeableKt$carouselSwipeable$3$4$1.L$0 = afVar;
        carouselSwipeableKt$carouselSwipeable$3$4$1.F$0 = f2;
        return carouselSwipeableKt$carouselSwipeable$3$4$1.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        aj.z((af) this.L$0, null, null, new AnonymousClass1(this.$state, this.F$0, null), 3);
        return ab.f48028a;
    }

    @Override // h.g.a.q
    public /* bridge */ /* synthetic */ Object invoke(af afVar, Float f2, e<? super ab> eVar) {
        return invoke(afVar, f2.floatValue(), eVar);
    }
}
