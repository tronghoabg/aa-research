package androidx.constraintlayout.compose.carousel;

import androidx.constraintlayout.compose.carousel.CarouselSwipeableState;
import h.ab;
import h.c.b.a.c;
import h.c.e;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class CarouselSwipeableState$snapTo$2$emit$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CarouselSwipeableState.C04052<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CarouselSwipeableState$snapTo$2$emit$1(CarouselSwipeableState.C04052<? super T> c04052, e<? super CarouselSwipeableState$snapTo$2$emit$1> eVar) {
        super(eVar);
        this.this$0 = c04052;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Map) null, (e<? super ab>) this);
    }
}
