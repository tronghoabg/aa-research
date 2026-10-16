package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.compose.runtime.Composer;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.NavType;
import androidx.navigation.compose.ComposeNavigator;
import h.ab;
import h.g.a.l;
import h.g.a.r;
import h.l.c;
import h.l.s;
import java.util.Map;

/* compiled from: WazeSource */
@NavDestinationDsl
/* loaded from: classes3.dex */
public final class ComposeNavigatorDestinationBuilder extends NavDestinationBuilder<ComposeNavigator.Destination> {
    public static final int $stable = 8;
    private final ComposeNavigator composeNavigator;
    private final r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, ab> content;
    private l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition;
    private l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition;
    private l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition;
    private l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition;
    private l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> sizeTransform;

    /* JADX WARN: Multi-variable type inference failed */
    public ComposeNavigatorDestinationBuilder(ComposeNavigator composeNavigator, String str, r<? super AnimatedContentScope, ? super NavBackStackEntry, ? super Composer, ? super Integer, ab> rVar) {
        super(composeNavigator, str);
        this.composeNavigator = composeNavigator;
        this.content = rVar;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    public ComposeNavigator.Destination build() {
        ComposeNavigator.Destination destination = (ComposeNavigator.Destination) super.build();
        destination.setEnterTransition$navigation_compose(this.enterTransition);
        destination.setExitTransition$navigation_compose(this.exitTransition);
        destination.setPopEnterTransition$navigation_compose(this.popEnterTransition);
        destination.setPopExitTransition$navigation_compose(this.popExitTransition);
        destination.setSizeTransform$navigation_compose(this.sizeTransform);
        return destination;
    }

    public final l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> getEnterTransition() {
        return this.enterTransition;
    }

    public final l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> getExitTransition() {
        return this.exitTransition;
    }

    public final l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> getPopEnterTransition() {
        return this.popEnterTransition;
    }

    public final l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> getPopExitTransition() {
        return this.popExitTransition;
    }

    public final l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> getSizeTransform() {
        return this.sizeTransform;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.navigation.NavDestinationBuilder
    public ComposeNavigator.Destination instantiateDestination() {
        return new ComposeNavigator.Destination(this.composeNavigator, this.content);
    }

    public final void setEnterTransition(l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar) {
        this.enterTransition = lVar;
    }

    public final void setExitTransition(l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar) {
        this.exitTransition = lVar;
    }

    public final void setPopEnterTransition(l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar) {
        this.popEnterTransition = lVar;
    }

    public final void setPopExitTransition(l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar) {
        this.popExitTransition = lVar;
    }

    public final void setSizeTransform(l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> lVar) {
        this.sizeTransform = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComposeNavigatorDestinationBuilder(ComposeNavigator composeNavigator, c<?> cVar, Map<s, NavType<?>> map, r<? super AnimatedContentScope, ? super NavBackStackEntry, ? super Composer, ? super Integer, ab> rVar) {
        super(composeNavigator, cVar, map);
        this.composeNavigator = composeNavigator;
        this.content = rVar;
    }
}
