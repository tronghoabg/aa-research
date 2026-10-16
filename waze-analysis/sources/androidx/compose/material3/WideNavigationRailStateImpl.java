package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.material3.WideNavigationRailStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.q;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class WideNavigationRailStateImpl implements WideNavigationRailState {
    private static final float Collapsed = 0.0f;
    private static final float Expanded = 1.0f;
    private final State<WideNavigationRailValue> _currentVal;
    private final AnimationSpec<Float> animationSpec;
    private WideNavigationRailValue initialValue;
    private final Animatable<Float, AnimationVector1D> internalState;
    private final float internalValue;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public WideNavigationRailStateImpl(WideNavigationRailValue wideNavigationRailValue, AnimationSpec<Float> animationSpec) {
        this.initialValue = wideNavigationRailValue;
        this.animationSpec = animationSpec;
        float f2 = true != WideNavigationRailStateKt.isExpanded(wideNavigationRailValue) ? 0.0f : 1.0f;
        this.internalValue = f2;
        this.internalState = new Animatable<>(Float.valueOf(f2), VectorConvertersKt.getVectorConverter(q.f48127a), null, null, 12, null);
        this._currentVal = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.material3.WideNavigationRailStateImpl$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return WideNavigationRailStateImpl._currentVal$lambda$0(this.f$0);
            }
        });
    }

    static final WideNavigationRailValue _currentVal$lambda$0(WideNavigationRailStateImpl wideNavigationRailStateImpl) {
        return wideNavigationRailStateImpl.internalState.getValue().floatValue() == 1.0f ? WideNavigationRailValue.Expanded : WideNavigationRailValue.Collapsed;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public Object collapse(e<? super ab> eVar) {
        Object objAnimateTo$default = Animatable.animateTo$default(this.internalState, new Float(0.0f), this.animationSpec, null, null, eVar, 12, null);
        return objAnimateTo$default == h.c.a.a.f48038a ? objAnimateTo$default : ab.f48028a;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public Object expand(e<? super ab> eVar) {
        Object objAnimateTo$default = Animatable.animateTo$default(this.internalState, new Float(1.0f), this.animationSpec, null, null, eVar, 12, null);
        return objAnimateTo$default == h.c.a.a.f48038a ? objAnimateTo$default : ab.f48028a;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public WideNavigationRailValue getCurrentValue() {
        return this._currentVal.getValue();
    }

    public final WideNavigationRailValue getInitialValue() {
        return this.initialValue;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public WideNavigationRailValue getTargetValue() {
        return this.internalState.getTargetValue().floatValue() == 1.0f ? WideNavigationRailValue.Expanded : WideNavigationRailValue.Collapsed;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public boolean isAnimating() {
        return this.internalState.isRunning();
    }

    public final void setInitialValue(WideNavigationRailValue wideNavigationRailValue) {
        this.initialValue = wideNavigationRailValue;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public Object snapTo(WideNavigationRailValue wideNavigationRailValue, e<? super ab> eVar) {
        Object objSnapTo = this.internalState.snapTo(new Float(true != WideNavigationRailStateKt.isExpanded(wideNavigationRailValue) ? 0.0f : 1.0f), eVar);
        return objSnapTo == h.c.a.a.f48038a ? objSnapTo : ab.f48028a;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public Object toggle(e<? super ab> eVar) {
        Object objAnimateTo$default = Animatable.animateTo$default(this.internalState, new Float(true != WideNavigationRailStateKt.isExpanded(getTargetValue()) ? 1.0f : 0.0f), this.animationSpec, null, null, eVar, 12, null);
        return objAnimateTo$default == h.c.a.a.f48038a ? objAnimateTo$default : ab.f48028a;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final WideNavigationRailState Saver$lambda$1(AnimationSpec animationSpec, WideNavigationRailValue wideNavigationRailValue) {
            return new WideNavigationRailStateImpl(wideNavigationRailValue, animationSpec);
        }

        public final Saver<WideNavigationRailState, WideNavigationRailValue> Saver(final AnimationSpec<Float> animationSpec) {
            return SaverKt.Saver(new p() { // from class: androidx.compose.material3.WideNavigationRailStateImpl$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ((WideNavigationRailState) obj2).getTargetValue();
                }
            }, new l() { // from class: androidx.compose.material3.WideNavigationRailStateImpl$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return WideNavigationRailStateImpl.Companion.Saver$lambda$1(animationSpec, (WideNavigationRailValue) obj);
                }
            });
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
