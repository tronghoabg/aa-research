package androidx.compose.material3.carousel;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.c.a.a;
import h.c.e;
import h.g.a.p;
import h.g.b.an;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CarouselStateKt {
    public static final float MaxPageOffset = 0.5f;
    private static final int MaxPagesForAnimateScroll = 3;
    public static final float MinPageOffset = -0.5f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateScrollToPage(final LazyLayoutScrollScope lazyLayoutScrollScope, PagerState pagerState, int i2, float f2, AnimationSpec<Float> animationSpec, p<? super ScrollScope, ? super Integer, ab> pVar, e<? super ab> eVar) {
        pVar.invoke(lazyLayoutScrollScope, new Integer(i2));
        int firstVisibleItemIndex = lazyLayoutScrollScope.getFirstVisibleItemIndex();
        int lastVisibleItemIndex = lazyLayoutScrollScope.getLastVisibleItemIndex() - lazyLayoutScrollScope.getFirstVisibleItemIndex();
        boolean z = i2 > firstVisibleItemIndex;
        if (((z && i2 > lazyLayoutScrollScope.getLastVisibleItemIndex()) || (!z && i2 < lazyLayoutScrollScope.getFirstVisibleItemIndex())) && Math.abs(i2 - lazyLayoutScrollScope.getFirstVisibleItemIndex()) >= 3) {
            int i3 = lastVisibleItemIndex + 1;
            lazyLayoutScrollScope.snapToItem(z ? n.h(i2 - i3, lazyLayoutScrollScope.getFirstVisibleItemIndex()) : n.i(i3 + i2, lazyLayoutScrollScope.getFirstVisibleItemIndex()), 0);
        }
        float fCalculateScrollDistanceTo = calculateScrollDistanceTo(pagerState, pagerState.getCurrentPage(), i2) + f2;
        final an anVar = new an();
        Object objAnimate$default = SuspendAnimationKt.animate$default(0.0f, fCalculateScrollDistanceTo, 0.0f, animationSpec, new p() { // from class: androidx.compose.material3.carousel.CarouselStateKt$$ExternalSyntheticLambda1
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return CarouselStateKt.animateScrollToPage$lambda$0(anVar, lazyLayoutScrollScope, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            }
        }, eVar, 4, null);
        return objAnimate$default == a.f48038a ? objAnimate$default : ab.f48028a;
    }

    static final ab animateScrollToPage$lambda$0(an anVar, LazyLayoutScrollScope lazyLayoutScrollScope, float f2, float f3) {
        anVar.f48102a += lazyLayoutScrollScope.scrollBy(f2 - anVar.f48102a);
        return ab.f48028a;
    }

    private static final float calculateScrollDistanceTo(PagerState pagerState, int i2, int i3) {
        int iMo3036getViewportSizeYbymL2g = (int) (pagerState.getLayoutInfo().getOrientation() == Orientation.Horizontal ? pagerState.getLayoutInfo().mo3036getViewportSizeYbymL2g() >> 32 : pagerState.getLayoutInfo().mo3036getViewportSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        return ((i3 - i2) * (pagerState.getLayoutInfo().getPageSize() + pagerState.getLayoutInfo().getPageSpacing())) + (pagerState.getLayoutInfo().getSnapPosition().position(iMo3036getViewportSizeYbymL2g, pagerState.getLayoutInfo().getPageSize(), pagerState.getLayoutInfo().getBeforeContentPadding(), pagerState.getLayoutInfo().getAfterContentPadding(), i2, pagerState.getPageCount()) - pagerState.getLayoutInfo().getSnapPosition().position(iMo3036getViewportSizeYbymL2g, pagerState.getLayoutInfo().getPageSize(), pagerState.getLayoutInfo().getBeforeContentPadding(), pagerState.getLayoutInfo().getAfterContentPadding(), i3, pagerState.getPageCount()));
    }

    public static final CarouselState rememberCarouselState(final int i2, final h.g.a.a<Integer> aVar, Composer composer, int i3, int i4) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-217285684, i3, -1, "androidx.compose.material3.carousel.rememberCarouselState (CarouselState.kt:147)");
        }
        boolean z = true;
        if (1 == (i4 & 1)) {
            i2 = 0;
        }
        Object[] objArr = new Object[0];
        Saver<CarouselState, ?> saver = CarouselState.Companion.getSaver();
        boolean z2 = (((i3 & 14) ^ 6) > 4 && composer.changed(i2)) || (i3 & 6) == 4;
        if ((((i3 & 112) ^ 48) <= 32 || !composer.changed(aVar)) && (i3 & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objRememberedValue = composer.rememberedValue();
        if (z3 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new h.g.a.a() { // from class: androidx.compose.material3.carousel.CarouselStateKt$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return CarouselStateKt.rememberCarouselState$lambda$0$0(i2, aVar);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        CarouselState carouselState = (CarouselState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) saver, (h.g.a.a) objRememberedValue, composer, 0);
        carouselState.getPagerState$material3().getPageCountState().setValue(aVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return carouselState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CarouselState rememberCarouselState$lambda$0$0(int i2, h.g.a.a aVar) {
        return new CarouselState(i2, 0.0f, aVar);
    }
}
