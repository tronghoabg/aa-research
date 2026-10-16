package androidx.constraintlayout.compose.carousel;

import androidx.compose.ui.unit.Density;
import e.b.c;
import h.a.r;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import java.util.Map;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class CarouselSwipeableKt$carouselSwipeable$3$3$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ Map $anchors;
    final /* synthetic */ Density $density;
    final /* synthetic */ ResistanceConfig $resistance;
    final /* synthetic */ CarouselSwipeableState $state;
    final /* synthetic */ p $thresholds;
    final /* synthetic */ float $velocityThreshold;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselSwipeableKt$carouselSwipeable$3$3$1(CarouselSwipeableState carouselSwipeableState, Map map, ResistanceConfig resistanceConfig, Density density, p pVar, float f2, e<? super CarouselSwipeableKt$carouselSwipeable$3$3$1> eVar) {
        super(2, eVar);
        this.$state = carouselSwipeableState;
        this.$anchors = map;
        this.$resistance = resistanceConfig;
        this.$density = density;
        this.$thresholds = pVar;
        this.$velocityThreshold = f2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new CarouselSwipeableKt$carouselSwipeable$3$3$1(this.$state, this.$anchors, this.$resistance, this.$density, this.$thresholds, this.$velocityThreshold, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((CarouselSwipeableKt$carouselSwipeable$3$3$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            CarouselSwipeableState carouselSwipeableState = this.$state;
            Map map = this.$anchors;
            Map anchors$constraintlayout_compose = carouselSwipeableState.getAnchors$constraintlayout_compose();
            carouselSwipeableState.setAnchors$constraintlayout_compose(map);
            this.$state.setResistance$constraintlayout_compose(this.$resistance);
            CarouselSwipeableState carouselSwipeableState2 = this.$state;
            final Map map2 = this.$anchors;
            final p pVar = this.$thresholds;
            final Density density = this.$density;
            carouselSwipeableState2.setThresholds$constraintlayout_compose(new p() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$3$1$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj2, Object obj3) {
                    Map map3 = map2;
                    p pVar2 = pVar;
                    Density density2 = density;
                    float fFloatValue = ((Float) obj2).floatValue();
                    float fFloatValue2 = ((Float) obj3).floatValue();
                    return Float.valueOf(((ThresholdConfig) pVar2.invoke(r.h(map3, Float.valueOf(fFloatValue)), r.h(map3, Float.valueOf(fFloatValue2)))).computeThreshold(density2, fFloatValue, fFloatValue2));
                }
            });
            this.$state.setVelocityThreshold$constraintlayout_compose(this.$density.mo2127toPx0680j_4(this.$velocityThreshold));
            this.label = 1;
            if (this.$state.processNewAnchors$constraintlayout_compose(anchors$constraintlayout_compose, this.$anchors, this) == aVar) {
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
