package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphNavigator;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
@Navigator.Name("navigation")
/* loaded from: classes3.dex */
public final class ComposeNavGraphNavigator extends NavGraphNavigator {
    public static final int $stable = 8;

    /* compiled from: WazeSource */
    public final class ComposeNavGraph extends NavGraph {
        public static final int $stable = 8;
        private l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition;
        private l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition;
        private l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition;
        private l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition;
        private p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, EnterTransition> predictivePopEnterTransition;
        private p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, ExitTransition> predictivePopExitTransition;
        private l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> sizeTransform;

        public ComposeNavGraph(Navigator<? extends NavGraph> navigator) {
            super(navigator);
        }

        public final l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> getEnterTransition$navigation_compose() {
            return this.enterTransition;
        }

        public final l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> getExitTransition$navigation_compose() {
            return this.exitTransition;
        }

        public final l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> getPopEnterTransition$navigation_compose() {
            return this.popEnterTransition;
        }

        public final l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> getPopExitTransition$navigation_compose() {
            return this.popExitTransition;
        }

        public final p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, EnterTransition> getPredictivePopEnterTransition$navigation_compose() {
            return this.predictivePopEnterTransition;
        }

        public final p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, ExitTransition> getPredictivePopExitTransition$navigation_compose() {
            return this.predictivePopExitTransition;
        }

        public final l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> getSizeTransform$navigation_compose() {
            return this.sizeTransform;
        }

        public final void setEnterTransition$navigation_compose(l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar) {
            this.enterTransition = lVar;
        }

        public final void setExitTransition$navigation_compose(l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar) {
            this.exitTransition = lVar;
        }

        public final void setPopEnterTransition$navigation_compose(l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar) {
            this.popEnterTransition = lVar;
        }

        public final void setPopExitTransition$navigation_compose(l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar) {
            this.popExitTransition = lVar;
        }

        public final void setPredictivePopEnterTransition$navigation_compose(p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, EnterTransition> pVar) {
            this.predictivePopEnterTransition = pVar;
        }

        public final void setPredictivePopExitTransition$navigation_compose(p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, ExitTransition> pVar) {
            this.predictivePopExitTransition = pVar;
        }

        public final void setSizeTransform$navigation_compose(l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> lVar) {
            this.sizeTransform = lVar;
        }
    }

    public ComposeNavGraphNavigator(NavigatorProvider navigatorProvider) {
        super(navigatorProvider);
    }

    @Override // androidx.navigation.NavGraphNavigator, androidx.navigation.Navigator
    public NavGraph createDestination() {
        return new ComposeNavGraph(this);
    }

    @Override // androidx.navigation.NavGraphNavigator, androidx.navigation.Navigator
    public /* bridge */ /* synthetic */ NavDestination createDestination() {
        return createDestination();
    }
}
