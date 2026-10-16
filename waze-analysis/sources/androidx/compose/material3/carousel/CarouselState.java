package androidx.compose.material3.carousel;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ScrollIndicatorState;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import h.a.i;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import h.k.n;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CarouselState implements ScrollableState {
    private CarouselPagerState pagerState;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Saver<CarouselState, ?> Saver = ListSaverKt.listSaver(new p() { // from class: androidx.compose.material3.carousel.CarouselState$$ExternalSyntheticLambda1
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            CarouselState carouselState = (CarouselState) obj2;
            return i.i(Integer.valueOf(carouselState.pagerState.getCurrentPage()), Float.valueOf(carouselState.pagerState.getCurrentPageOffsetFraction()), Integer.valueOf(carouselState.pagerState.getPageCount()));
        }
    }, new l() { // from class: androidx.compose.material3.carousel.CarouselState$$ExternalSyntheticLambda2
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return CarouselState.Saver$lambda$1((List) obj);
        }
    });

    public /* synthetic */ CarouselState(int i2, float f2, a aVar, int i3, o oVar) {
        this(1 == (i3 & 1) ? 0 : i2, (i3 & 2) != 0 ? 0.0f : f2, aVar);
    }

    static final CarouselState Saver$lambda$1(final List list) {
        Object obj = list.get(0);
        x.d(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = list.get(1);
        x.d(obj2, "null cannot be cast to non-null type kotlin.Float");
        return new CarouselState(iIntValue, ((Float) obj2).floatValue(), new a() { // from class: androidx.compose.material3.carousel.CarouselState$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return Integer.valueOf(CarouselState.Saver$lambda$1$0(list));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Saver$lambda$1$0(List list) {
        Object obj = list.get(2);
        x.d(obj, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) obj).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollToItem$default(CarouselState carouselState, int i2, AnimationSpec animationSpec, e eVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return carouselState.animateScrollToItem(i2, animationSpec, eVar);
    }

    public final Object animateScrollToItem(int i2, AnimationSpec<Float> animationSpec, e<? super ab> eVar) {
        CarouselPagerState carouselPagerState = this.pagerState;
        if ((i2 != carouselPagerState.getCurrentPage() || carouselPagerState.getCurrentPageOffsetFraction() != 0.0f) && carouselPagerState.getPageCount() != 0) {
            Object objScroll$default = ScrollableState.CC.scroll$default(carouselPagerState, null, new CarouselState$animateScrollToItem$2$1(carouselPagerState, carouselPagerState.getPageCount() > 0 ? n.j(i2, 0, carouselPagerState.getPageCount() - 1) : 0, animationSpec, null), eVar, 1, null);
            if (objScroll$default == h.c.a.a.f48038a) {
                return objScroll$default;
            }
        }
        return ab.f48028a;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f2) {
        return this.pagerState.dispatchRawDelta(f2);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public /* synthetic */ boolean getCanScrollBackward() {
        return true;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public /* synthetic */ boolean getCanScrollForward() {
        return true;
    }

    public final int getCurrentItem() {
        return this.pagerState.getCurrentPage();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public /* synthetic */ boolean getLastScrolledBackward() {
        return false;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public /* synthetic */ boolean getLastScrolledForward() {
        return false;
    }

    public final CarouselPagerState getPagerState$material3() {
        return this.pagerState;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public /* synthetic */ ScrollIndicatorState getScrollIndicatorState() {
        return null;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.pagerState.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, p<? super ScrollScope, ? super e<? super ab>, ? extends Object> pVar, e<? super ab> eVar) {
        Object objScroll = this.pagerState.scroll(mutatePriority, pVar, eVar);
        return objScroll == h.c.a.a.f48038a ? objScroll : ab.f48028a;
    }

    public final Object scrollToItem(int i2, e<? super ab> eVar) {
        Object objScrollToPage = this.pagerState.scrollToPage(i2, 0.0f, eVar);
        return objScrollToPage == h.c.a.a.f48038a ? objScrollToPage : ab.f48028a;
    }

    public final void setPagerState$material3(CarouselPagerState carouselPagerState) {
        this.pagerState = carouselPagerState;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Saver<CarouselState, ?> getSaver() {
            return CarouselState.Saver;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public CarouselState(int i2, float f2, a<Integer> aVar) {
        this.pagerState = new CarouselPagerState(i2, f2, aVar);
    }
}
