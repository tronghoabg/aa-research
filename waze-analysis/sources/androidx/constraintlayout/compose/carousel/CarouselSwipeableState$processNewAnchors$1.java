package androidx.constraintlayout.compose.carousel;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class CarouselSwipeableState$processNewAnchors$1 extends c {
    float F$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CarouselSwipeableState<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselSwipeableState$processNewAnchors$1(CarouselSwipeableState<T> carouselSwipeableState, e<? super CarouselSwipeableState$processNewAnchors$1> eVar) {
        super(eVar);
        this.this$0 = carouselSwipeableState;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.processNewAnchors$constraintlayout_compose(null, null, this);
    }
}
