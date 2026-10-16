package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.q;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class InfiniteTransitionKt {
    public static final State<Float> animateFloat(InfiniteTransition infiniteTransition, float f2, float f3, InfiniteRepeatableSpec<Float> infiniteRepeatableSpec, String str, Composer composer, int i2, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-644770905, i2, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:296)");
        }
        if ((i3 & 8) != 0) {
            str = "FloatAnimation";
        }
        int i4 = i2 << 3;
        State<Float> stateAnimateValue = animateValue(infiniteTransition, Float.valueOf(f2), Float.valueOf(f3), VectorConvertersKt.getVectorConverter(q.f48127a), infiniteRepeatableSpec, str, composer, (i2 & 1022) | (57344 & i4) | (i4 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValue;
    }

    public static final <T, V extends AnimationVector> State<T> animateValue(InfiniteTransition infiniteTransition, T t, T t2, TwoWayConverter<T, V> twoWayConverter, final InfiniteRepeatableSpec<T> infiniteRepeatableSpec, String str, Composer composer, int i2, int i3) {
        final InfiniteTransition infiniteTransition2;
        final Object obj;
        final Object obj2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1062847727, i2, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:245)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            if ((i3 & 16) != 0) {
                str = "ValueAnimation";
            }
            infiniteTransition2 = infiniteTransition;
            obj = t;
            obj2 = t2;
            objRememberedValue = infiniteTransition2.new TransitionAnimationState(obj, obj2, twoWayConverter, infiniteRepeatableSpec, str);
            composer.updateRememberedValue(objRememberedValue);
        } else {
            infiniteTransition2 = infiniteTransition;
            obj = t;
            obj2 = t2;
        }
        final InfiniteTransition.TransitionAnimationState transitionAnimationState = (InfiniteTransition.TransitionAnimationState) objRememberedValue;
        boolean z = true;
        boolean z2 = ((((i2 & 112) ^ 48) > 32 && composer.changedInstance(obj)) || (i2 & 48) == 32) | ((((i2 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) > 256 && composer.changedInstance(obj2)) || (i2 & 384) == 256);
        if ((((57344 & i2) ^ 24576) <= 16384 || !composer.changedInstance(infiniteRepeatableSpec)) && (i2 & 24576) != 16384) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objRememberedValue2 = composer.rememberedValue();
        if (z3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new a() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return InfiniteTransitionKt.animateValue$lambda$1$0(obj, transitionAnimationState, obj2, infiniteRepeatableSpec);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.SideEffect((a) objRememberedValue2, composer, 0);
        boolean zChangedInstance = composer.changedInstance(infiniteTransition2);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new l() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj3) {
                    return InfiniteTransitionKt.animateValue$lambda$2$0(infiniteTransition2, transitionAnimationState, (DisposableEffectScope) obj3);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        EffectsKt.DisposableEffect(transitionAnimationState, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transitionAnimationState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab animateValue$lambda$1$0(Object obj, InfiniteTransition.TransitionAnimationState transitionAnimationState, Object obj2, InfiniteRepeatableSpec infiniteRepeatableSpec) {
        if (!x.n(obj, transitionAnimationState.getInitialValue$animation_core()) || !x.n(obj2, transitionAnimationState.getTargetValue$animation_core())) {
            transitionAnimationState.updateValues$animation_core(obj, obj2, infiniteRepeatableSpec);
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult animateValue$lambda$2$0(final InfiniteTransition infiniteTransition, final InfiniteTransition.TransitionAnimationState transitionAnimationState, DisposableEffectScope disposableEffectScope) {
        infiniteTransition.addAnimation$animation_core(transitionAnimationState);
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$lambda$2$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                infiniteTransition.removeAnimation$animation_core(transitionAnimationState);
            }
        };
    }

    public static final InfiniteTransition rememberInfiniteTransition(String str, Composer composer, int i2, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1013651573, i2, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            if (1 == (i3 & 1)) {
                str = "InfiniteTransition";
            }
            objRememberedValue = new InfiniteTransition(str);
            composer.updateRememberedValue(objRememberedValue);
        }
        InfiniteTransition infiniteTransition = (InfiniteTransition) objRememberedValue;
        infiniteTransition.run$animation_core(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return infiniteTransition;
    }

    public static final /* synthetic */ InfiniteTransition rememberInfiniteTransition(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-840193660, i2, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:303)");
        }
        InfiniteTransition infiniteTransitionRememberInfiniteTransition = rememberInfiniteTransition("InfiniteTransition", composer, 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return infiniteTransitionRememberInfiniteTransition;
    }

    public static final /* synthetic */ State animateFloat(InfiniteTransition infiniteTransition, float f2, float f3, InfiniteRepeatableSpec infiniteRepeatableSpec, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(469472752, i2, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:336)");
        }
        int i3 = i2 & DisplayStrings.DS_TAP_TO_VERIFY;
        State<Float> stateAnimateFloat = animateFloat(infiniteTransition, f2, f3, infiniteRepeatableSpec, "FloatAnimation", composer, (i2 & 14) | 24576 | (i2 & 112) | i3 | (i2 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateFloat;
    }

    public static final /* synthetic */ State animateValue(InfiniteTransition infiniteTransition, Object obj, Object obj2, TwoWayConverter twoWayConverter, InfiniteRepeatableSpec infiniteRepeatableSpec, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1695411770, i2, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:317)");
        }
        int i3 = (i2 >> 3) & 8;
        State stateAnimateValue = animateValue(infiniteTransition, obj, obj2, twoWayConverter, infiniteRepeatableSpec, "ValueAnimation", composer, (i2 & 14) | 196608 | (i3 << 3) | (i2 & 112) | (i3 << 6) | (i2 & DisplayStrings.DS_TAP_TO_VERIFY) | (i2 & 7168) | (i2 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValue;
    }
}
