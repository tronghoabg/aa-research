package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.compose.ComposeNavigator;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.a.r;
import h.g.b.o;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
@Navigator.Name(ComposeNavigator.NAME)
/* loaded from: classes3.dex */
public final class ComposeNavigator extends Navigator<Destination> {
    public static final String NAME = "composable";
    private final MutableState<Boolean> isPop;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public ComposeNavigator() {
        super(NAME);
        this.isPop = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    @Override // androidx.navigation.Navigator
    public Destination createDestination() {
        return new Destination(this, ComposableSingletons$ComposeNavigatorKt.INSTANCE.getLambda$127448943$navigation_compose());
    }

    public final ch<List<NavBackStackEntry>> getBackStack() {
        return getState().getBackStack();
    }

    public final ch<Set<NavBackStackEntry>> getTransitionsInProgress$navigation_compose() {
        return getState().getTransitionsInProgress();
    }

    public final MutableState<Boolean> isPop$navigation_compose() {
        return this.isPop;
    }

    @Override // androidx.navigation.Navigator
    public void navigate(List<NavBackStackEntry> list, NavOptions navOptions, Navigator.Extras extras) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            getState().pushWithTransition((NavBackStackEntry) it.next());
        }
        this.isPop.setValue(false);
    }

    public final void onTransitionComplete(NavBackStackEntry navBackStackEntry) {
        getState().markTransitionComplete(navBackStackEntry);
    }

    @Override // androidx.navigation.Navigator
    public void popBackStack(NavBackStackEntry navBackStackEntry, boolean z) {
        getState().popWithTransition(navBackStackEntry, z);
        this.isPop.setValue(true);
    }

    public final void prepareForTransition(NavBackStackEntry navBackStackEntry) {
        getState().prepareForTransition(navBackStackEntry);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    public final class Destination extends NavDestination {
        public static final int $stable = 8;
        private final r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, ab> content;
        private l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition;
        private l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition;
        private l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition;
        private l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition;
        private p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, EnterTransition> predictivePopEnterTransition;
        private p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, ExitTransition> predictivePopExitTransition;
        private l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> sizeTransform;

        public /* synthetic */ Destination(ComposeNavigator composeNavigator, final q qVar) {
            this(composeNavigator, (r<? super AnimatedContentScope, NavBackStackEntry, ? super Composer, ? super Integer, ab>) ComposableLambdaKt.composableLambdaInstance(1587956030, true, new r() { // from class: androidx.navigation.compose.ComposeNavigator$Destination$$ExternalSyntheticLambda0
                @Override // h.g.a.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return ComposeNavigator.Destination._init_$lambda$0(qVar, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }));
        }

        static final ab _init_$lambda$0(q qVar, AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1587956030, i2, -1, "androidx.navigation.compose.ComposeNavigator.Destination.<init>.<anonymous> (ComposeNavigator.kt:109)");
            }
            qVar.invoke(navBackStackEntry, composer, Integer.valueOf((i2 >> 3) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return ab.f48028a;
        }

        public final r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, ab> getContent$navigation_compose() {
            return this.content;
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

        /* JADX WARN: Multi-variable type inference failed */
        public Destination(ComposeNavigator composeNavigator, r<? super AnimatedContentScope, NavBackStackEntry, ? super Composer, ? super Integer, ab> rVar) {
            super(composeNavigator);
            this.content = rVar;
        }
    }
}
