package androidx.compose.material;

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
/* loaded from: classes.dex */
final class SwipeableKt$swipeable$3$3$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ Map $anchors;
    final /* synthetic */ Density $density;
    final /* synthetic */ ResistanceConfig $resistance;
    final /* synthetic */ SwipeableState $state;
    final /* synthetic */ p $thresholds;
    final /* synthetic */ float $velocityThreshold;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableKt$swipeable$3$3$1(SwipeableState swipeableState, Map map, ResistanceConfig resistanceConfig, Density density, p pVar, float f2, e<? super SwipeableKt$swipeable$3$3$1> eVar) {
        super(2, eVar);
        this.$state = swipeableState;
        this.$anchors = map;
        this.$resistance = resistanceConfig;
        this.$density = density;
        this.$thresholds = pVar;
        this.$velocityThreshold = f2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new SwipeableKt$swipeable$3$3$1(this.$state, this.$anchors, this.$resistance, this.$density, this.$thresholds, this.$velocityThreshold, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((SwipeableKt$swipeable$3$3$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            SwipeableState swipeableState = this.$state;
            Map map = this.$anchors;
            Map anchors$material = swipeableState.getAnchors$material();
            swipeableState.setAnchors$material(map);
            this.$state.setResistance$material(this.$resistance);
            SwipeableState swipeableState2 = this.$state;
            final Map map2 = this.$anchors;
            final p pVar = this.$thresholds;
            final Density density = this.$density;
            swipeableState2.setThresholds$material(new p() { // from class: androidx.compose.material.SwipeableKt$swipeable$3$3$1$$ExternalSyntheticLambda0
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
            this.$state.setVelocityThreshold$material(this.$density.mo2127toPx0680j_4(this.$velocityThreshold));
            this.label = 1;
            if (this.$state.processNewAnchors$material(anchors$material, this.$anchors, this) == aVar) {
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
