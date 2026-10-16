package androidx.compose.material3;

import androidx.compose.foundation.gestures.AnchoredDraggableDefaults;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.Density;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SwipeToDismissBoxState {
    private final AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableState;
    public l<? super Float, Float> positionalThreshold;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public SwipeToDismissBoxState(SwipeToDismissBoxValue swipeToDismissBoxValue, final Density density, l<? super SwipeToDismissBoxValue, Boolean> lVar, l<? super Float, Float> lVar2) {
        this.anchoredDraggableState = AnchoredDraggableKt.AnchoredDraggableState(swipeToDismissBoxValue, lVar2, new a() { // from class: androidx.compose.material3.SwipeToDismissBoxState$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return Float.valueOf(density.mo2127toPx0680j_4(SwipeToDismissBoxKt.DismissVelocityThreshold));
            }
        }, AnchoredDraggableDefaults.INSTANCE.getSnapAnimationSpec(), AnchoredDraggableDefaults.INSTANCE.getDecayAnimationSpec(), lVar);
    }

    static final boolean _init_$lambda$0(SwipeToDismissBoxValue swipeToDismissBoxValue) {
        return true;
    }

    public final Object dismiss(SwipeToDismissBoxValue swipeToDismissBoxValue, e<? super ab> eVar) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, swipeToDismissBoxValue, null, eVar, 2, null);
        return objAnimateTo$default == h.c.a.a.f48038a ? objAnimateTo$default : ab.f48028a;
    }

    public final AnchoredDraggableState<SwipeToDismissBoxValue> getAnchoredDraggableState$material3() {
        return this.anchoredDraggableState;
    }

    public final SwipeToDismissBoxValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final SwipeToDismissBoxValue getDismissDirection() {
        return (getOffset$material3() == 0.0f || Float.isNaN(getOffset$material3())) ? SwipeToDismissBoxValue.Settled : getOffset$material3() > 0.0f ? SwipeToDismissBoxValue.StartToEnd : SwipeToDismissBoxValue.EndToStart;
    }

    public final float getOffset$material3() {
        return this.anchoredDraggableState.getOffset();
    }

    public final l<Float, Float> getPositionalThreshold$material3() {
        l lVar = this.positionalThreshold;
        if (lVar != null) {
            return lVar;
        }
        x.j("positionalThreshold");
        return null;
    }

    public final float getProgress() {
        return this.anchoredDraggableState.getProgress();
    }

    public final SwipeToDismissBoxValue getSettledValue() {
        return this.anchoredDraggableState.getSettledValue();
    }

    public final SwipeToDismissBoxValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean getUseFlingBehavior$material3() {
        return this.positionalThreshold != null;
    }

    public final float requireOffset() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final Object reset(e<? super ab> eVar) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, SwipeToDismissBoxValue.Settled, null, eVar, 2, null);
        return objAnimateTo$default == h.c.a.a.f48038a ? objAnimateTo$default : ab.f48028a;
    }

    public final void setPositionalThreshold$material3(l<? super Float, Float> lVar) {
        this.positionalThreshold = lVar;
    }

    public final Object snapTo(SwipeToDismissBoxValue swipeToDismissBoxValue, e<? super ab> eVar) {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, swipeToDismissBoxValue, eVar);
        return objSnapTo == h.c.a.a.f48038a ? objSnapTo : ab.f48028a;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final SwipeToDismissBoxState Saver$lambda$1(Density density, l lVar, l lVar2, SwipeToDismissBoxValue swipeToDismissBoxValue) {
            return new SwipeToDismissBoxState(swipeToDismissBoxValue, density, lVar, lVar2);
        }

        static final SwipeToDismissBoxState Saver$lambda$3(l lVar, SwipeToDismissBoxValue swipeToDismissBoxValue) {
            return new SwipeToDismissBoxState(swipeToDismissBoxValue, lVar);
        }

        public final Saver<SwipeToDismissBoxState, SwipeToDismissBoxValue> Saver(final l<? super Float, Float> lVar) {
            return SaverKt.Saver(new p() { // from class: androidx.compose.material3.SwipeToDismissBoxState$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ((SwipeToDismissBoxState) obj2).getCurrentValue();
                }
            }, new l() { // from class: androidx.compose.material3.SwipeToDismissBoxState$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return SwipeToDismissBoxState.Companion.Saver$lambda$3(lVar, (SwipeToDismissBoxValue) obj);
                }
            });
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final Saver<SwipeToDismissBoxState, SwipeToDismissBoxValue> Saver(final l<? super SwipeToDismissBoxValue, Boolean> lVar, final l<? super Float, Float> lVar2, final Density density) {
            return SaverKt.Saver(new p() { // from class: androidx.compose.material3.SwipeToDismissBoxState$Companion$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ((SwipeToDismissBoxState) obj2).getCurrentValue();
                }
            }, new l() { // from class: androidx.compose.material3.SwipeToDismissBoxState$Companion$$ExternalSyntheticLambda3
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return SwipeToDismissBoxState.Companion.Saver$lambda$1(density, lVar, lVar2, (SwipeToDismissBoxValue) obj);
                }
            });
        }
    }

    public static /* synthetic */ void getProgress$annotations() {
    }

    public /* synthetic */ SwipeToDismissBoxState(SwipeToDismissBoxValue swipeToDismissBoxValue, Density density, l lVar, l lVar2, int i2, o oVar) {
        this(swipeToDismissBoxValue, density, (i2 & 4) != 0 ? new l() { // from class: androidx.compose.material3.SwipeToDismissBoxState$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return true;
            }
        } : lVar, lVar2);
    }

    public SwipeToDismissBoxState(SwipeToDismissBoxValue swipeToDismissBoxValue, l<? super Float, Float> lVar) {
        this.anchoredDraggableState = new AnchoredDraggableState<>(swipeToDismissBoxValue);
        setPositionalThreshold$material3(lVar);
    }
}
