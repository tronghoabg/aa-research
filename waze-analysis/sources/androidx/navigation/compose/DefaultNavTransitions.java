package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.navigation.NavBackStackEntry;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DefaultNavTransitions {
    public static final int $stable = 0;
    public static final DefaultNavTransitions INSTANCE = new DefaultNavTransitions();
    private static final l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition = new l() { // from class: androidx.navigation.compose.DefaultNavTransitions$$ExternalSyntheticLambda0
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
        }
    };
    private static final l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition = new l() { // from class: androidx.navigation.compose.DefaultNavTransitions$$ExternalSyntheticLambda1
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
        }
    };
    private static final p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, EnterTransition> predictivePopEnterTransition = new p() { // from class: androidx.navigation.compose.DefaultNavTransitions$$ExternalSyntheticLambda2
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            ((Integer) obj2).intValue();
            return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.spring$default(1.0f, 1600.0f, null, 4, null), 0.0f, 2, null);
        }
    };
    private static final p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, ExitTransition> predictivePopExitTransition = new p() { // from class: androidx.navigation.compose.DefaultNavTransitions$$ExternalSyntheticLambda3
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            ((Integer) obj2).intValue();
            return EnterExitTransitionKt.m1754scaleOutL8ZKhE$default(null, 0.7f, 0L, 5, null);
        }
    };
    private static final l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> sizeTransform = null;

    private DefaultNavTransitions() {
    }

    public final l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> getEnterTransition() {
        return enterTransition;
    }

    public final l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> getExitTransition() {
        return exitTransition;
    }

    public final p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, EnterTransition> getPredictivePopEnterTransition() {
        return predictivePopEnterTransition;
    }

    public final p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, ExitTransition> getPredictivePopExitTransition() {
        return predictivePopExitTransition;
    }

    public final l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> getSizeTransform() {
        return sizeTransform;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition(l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> lVar) {
        return lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition(l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> lVar) {
        return lVar;
    }
}
