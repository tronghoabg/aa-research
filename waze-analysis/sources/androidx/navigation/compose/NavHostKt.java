package androidx.navigation.compose;

import androidx.collection.MutableObjectFloatMap;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavType;
import androidx.navigation.compose.ComposeNavGraphNavigator;
import androidx.navigation.compose.ComposeNavigator;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import h.l.c;
import h.l.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class NavHostKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:331:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavHost(final androidx.navigation.NavHostController r36, final androidx.navigation.NavGraph r37, androidx.compose.ui.Modifier r38, androidx.compose.ui.Alignment r39, h.g.a.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.EnterTransition> r40, h.g.a.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.ExitTransition> r41, h.g.a.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.EnterTransition> r42, h.g.a.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.ExitTransition> r43, h.g.a.p<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, java.lang.Integer, androidx.compose.animation.EnterTransition> r44, h.g.a.p<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, java.lang.Integer, androidx.compose.animation.ExitTransition> r45, h.g.a.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.SizeTransform> r46, androidx.compose.runtime.Composer r47, final int r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 1834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, androidx.navigation.NavGraph, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, h.g.a.l, h.g.a.l, h.g.a.l, h.g.a.l, h.g.a.p, h.g.a.p, h.g.a.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static final ab NavHost$lambda$1(NavHostController navHostController, String str, Modifier modifier, String str2, l lVar, int i2, int i3, Composer composer, int i4) {
        NavHost(navHostController, str, modifier, str2, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab NavHost$lambda$10(NavHostController navHostController, Object obj, Modifier modifier, Alignment alignment, c cVar, Map map, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6, int i2, int i3, int i4, Composer composer, int i5) {
        NavHost(navHostController, obj, modifier, alignment, cVar, map, lVar, lVar2, lVar3, lVar4, lVar5, lVar6, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab NavHost$lambda$12(NavHostController navHostController, Object obj, Modifier modifier, Alignment alignment, c cVar, Map map, l lVar, l lVar2, l lVar3, l lVar4, p pVar, p pVar2, l lVar5, l lVar6, int i2, int i3, int i4, Composer composer, int i5) {
        NavHost(navHostController, obj, modifier, alignment, (c<?>) cVar, (Map<s, NavType<?>>) map, (l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) lVar, (l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) lVar2, (l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) lVar3, (l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) lVar4, (p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, EnterTransition>) pVar, (p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, ExitTransition>) pVar2, (l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) lVar5, (l<? super NavGraphBuilder, ab>) lVar6, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab NavHost$lambda$13(NavHostController navHostController, NavGraph navGraph, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        NavHost(navHostController, navGraph, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab NavHost$lambda$14(NavHostController navHostController, NavGraph navGraph, Modifier modifier, Alignment alignment, l lVar, l lVar2, l lVar3, l lVar4, int i2, int i3, Composer composer, int i4) {
        NavHost(navHostController, navGraph, modifier, alignment, lVar, lVar2, lVar3, lVar4, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab NavHost$lambda$15(NavHostController navHostController, NavGraph navGraph, Modifier modifier, Alignment alignment, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, int i2, int i3, Composer composer, int i4) {
        NavHost(navHostController, navGraph, modifier, alignment, lVar, lVar2, lVar3, lVar4, lVar5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab NavHost$lambda$17(NavHostController navHostController, NavGraph navGraph, Modifier modifier, Alignment alignment, l lVar, l lVar2, l lVar3, l lVar4, p pVar, p pVar2, l lVar5, int i2, int i3, int i4, Composer composer, int i5) {
        NavHost(navHostController, navGraph, modifier, alignment, (l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) lVar, (l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) lVar2, (l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) lVar3, (l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) lVar4, (p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, EnterTransition>) pVar, (p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, ExitTransition>) pVar2, (l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) lVar5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NavBackStackEntry> NavHost$lambda$18(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float NavHost$lambda$20(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    private static final boolean NavHost$lambda$23(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NavHost$lambda$24(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final int NavHost$lambda$26(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult NavHost$lambda$29$0(NavHostController navHostController, LifecycleOwner lifecycleOwner, DisposableEffectScope disposableEffectScope) {
        navHostController.setLifecycleOwner(lifecycleOwner);
        return new DisposableEffectResult() { // from class: androidx.navigation.compose.NavHostKt$NavHost$lambda$29$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
            }
        };
    }

    static final ab NavHost$lambda$3(NavHostController navHostController, String str, Modifier modifier, Alignment alignment, String str2, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, int i2, int i3, Composer composer, int i4) {
        NavHost(navHostController, str, modifier, alignment, str2, lVar, lVar2, lVar3, lVar4, lVar5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    private static final List<NavBackStackEntry> NavHost$lambda$30(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List NavHost$lambda$31$0(State state) {
        List<NavBackStackEntry> listNavHost$lambda$30 = NavHost$lambda$30(state);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listNavHost$lambda$30) {
            if (x.n(((NavBackStackEntry) obj).getDestination().getNavigatorName(), ComposeNavigator.NAME)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NavBackStackEntry> NavHost$lambda$32(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final EnterTransition NavHost$lambda$34$0(p pVar, ComposeNavigator composeNavigator, l lVar, l lVar2, MutableState mutableState, MutableIntState mutableIntState, AnimatedContentTransitionScope animatedContentTransitionScope) {
        NavDestination destination = ((NavBackStackEntry) animatedContentTransitionScope.getTargetState()).getDestination();
        x.d(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
        ComposeNavigator.Destination destination2 = (ComposeNavigator.Destination) destination;
        EnterTransition enterTransition = null;
        if (NavHost$lambda$23(mutableState)) {
            Iterator<NavDestination> it = NavDestination.Companion.getHierarchy(destination2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                EnterTransition enterTransitionCreatePredictivePopEnterTransition = createPredictivePopEnterTransition(it.next(), animatedContentTransitionScope, NavHost$lambda$26(mutableIntState));
                if (enterTransitionCreatePredictivePopEnterTransition != null) {
                    enterTransition = enterTransitionCreatePredictivePopEnterTransition;
                    break;
                }
            }
            return enterTransition == null ? (EnterTransition) pVar.invoke(animatedContentTransitionScope, Integer.valueOf(NavHost$lambda$26(mutableIntState))) : enterTransition;
        }
        if (composeNavigator.isPop$navigation_compose().getValue().booleanValue()) {
            Iterator<NavDestination> it2 = NavDestination.Companion.getHierarchy(destination2).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                EnterTransition enterTransitionCreatePopEnterTransition = createPopEnterTransition(it2.next(), animatedContentTransitionScope);
                if (enterTransitionCreatePopEnterTransition != null) {
                    enterTransition = enterTransitionCreatePopEnterTransition;
                    break;
                }
            }
            return enterTransition == null ? (EnterTransition) lVar.invoke(animatedContentTransitionScope) : enterTransition;
        }
        Iterator<NavDestination> it3 = NavDestination.Companion.getHierarchy(destination2).iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            EnterTransition enterTransitionCreateEnterTransition = createEnterTransition(it3.next(), animatedContentTransitionScope);
            if (enterTransitionCreateEnterTransition != null) {
                enterTransition = enterTransitionCreateEnterTransition;
                break;
            }
        }
        return enterTransition == null ? (EnterTransition) lVar2.invoke(animatedContentTransitionScope) : enterTransition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ExitTransition NavHost$lambda$35$0(p pVar, ComposeNavigator composeNavigator, l lVar, l lVar2, MutableState mutableState, MutableIntState mutableIntState, AnimatedContentTransitionScope animatedContentTransitionScope) {
        NavDestination destination = ((NavBackStackEntry) animatedContentTransitionScope.getInitialState()).getDestination();
        x.d(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
        ComposeNavigator.Destination destination2 = (ComposeNavigator.Destination) destination;
        ExitTransition exitTransition = null;
        if (NavHost$lambda$23(mutableState)) {
            Iterator<NavDestination> it = NavDestination.Companion.getHierarchy(destination2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ExitTransition exitTransitionCreatePredictivePopExitTransition = createPredictivePopExitTransition(it.next(), animatedContentTransitionScope, NavHost$lambda$26(mutableIntState));
                if (exitTransitionCreatePredictivePopExitTransition != null) {
                    exitTransition = exitTransitionCreatePredictivePopExitTransition;
                    break;
                }
            }
            return exitTransition == null ? (ExitTransition) pVar.invoke(animatedContentTransitionScope, Integer.valueOf(NavHost$lambda$26(mutableIntState))) : exitTransition;
        }
        if (composeNavigator.isPop$navigation_compose().getValue().booleanValue()) {
            Iterator<NavDestination> it2 = NavDestination.Companion.getHierarchy(destination2).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ExitTransition exitTransitionCreatePopExitTransition = createPopExitTransition(it2.next(), animatedContentTransitionScope);
                if (exitTransitionCreatePopExitTransition != null) {
                    exitTransition = exitTransitionCreatePopExitTransition;
                    break;
                }
            }
            return exitTransition == null ? (ExitTransition) lVar.invoke(animatedContentTransitionScope) : exitTransition;
        }
        Iterator<NavDestination> it3 = NavDestination.Companion.getHierarchy(destination2).iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            ExitTransition exitTransitionCreateExitTransition = createExitTransition(it3.next(), animatedContentTransitionScope);
            if (exitTransitionCreateExitTransition != null) {
                exitTransition = exitTransitionCreateExitTransition;
                break;
            }
        }
        return exitTransition == null ? (ExitTransition) lVar2.invoke(animatedContentTransitionScope) : exitTransition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final SizeTransform NavHost$lambda$36$0(l lVar, AnimatedContentTransitionScope animatedContentTransitionScope) {
        SizeTransform sizeTransformCreateSizeTransform;
        NavDestination destination = ((NavBackStackEntry) animatedContentTransitionScope.getTargetState()).getDestination();
        x.d(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
        Iterator<NavDestination> it = NavDestination.Companion.getHierarchy((ComposeNavigator.Destination) destination).iterator();
        while (true) {
            if (!it.hasNext()) {
                sizeTransformCreateSizeTransform = null;
                break;
            }
            sizeTransformCreateSizeTransform = createSizeTransform(it.next(), animatedContentTransitionScope);
            if (sizeTransformCreateSizeTransform != null) {
                break;
            }
        }
        if (sizeTransformCreateSizeTransform != null) {
            return sizeTransformCreateSizeTransform;
        }
        if (lVar == null) {
            return null;
        }
        return (SizeTransform) lVar.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult NavHost$lambda$37$0(final State state, final ComposeNavigator composeNavigator, DisposableEffectScope disposableEffectScope) {
        return new DisposableEffectResult() { // from class: androidx.navigation.compose.NavHostKt$NavHost$lambda$37$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Iterator it = NavHostKt.NavHost$lambda$32(state).iterator();
                while (it.hasNext()) {
                    composeNavigator.onTransitionComplete((NavBackStackEntry) it.next());
                }
            }
        };
    }

    static final ab NavHost$lambda$4(NavHostController navHostController, String str, Modifier modifier, Alignment alignment, String str2, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6, int i2, int i3, int i4, Composer composer, int i5) {
        NavHost(navHostController, str, modifier, alignment, str2, lVar, lVar2, lVar3, lVar4, lVar5, lVar6, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ContentTransform NavHost$lambda$41$0(MutableObjectFloatMap mutableObjectFloatMap, ComposeNavigator composeNavigator, l lVar, l lVar2, l lVar3, State state, MutableState mutableState, AnimatedContentTransitionScope animatedContentTransitionScope) {
        float f2;
        if (!NavHost$lambda$32(state).contains(animatedContentTransitionScope.getInitialState())) {
            return AnimatedContentKt.togetherWith(EnterTransition.Companion.getNone(), ExitTransition.Companion.getNone());
        }
        String id = ((NavBackStackEntry) animatedContentTransitionScope.getInitialState()).getId();
        int iFindKeyIndex = mutableObjectFloatMap.findKeyIndex(id);
        if (iFindKeyIndex >= 0) {
            f2 = mutableObjectFloatMap.values[iFindKeyIndex];
        } else {
            mutableObjectFloatMap.set(id, 0.0f);
            f2 = 0.0f;
        }
        if (!x.n(((NavBackStackEntry) animatedContentTransitionScope.getTargetState()).getId(), ((NavBackStackEntry) animatedContentTransitionScope.getInitialState()).getId())) {
            f2 += (composeNavigator.isPop$navigation_compose().getValue().booleanValue() || NavHost$lambda$23(mutableState)) ? -1.0f : 1.0f;
        }
        mutableObjectFloatMap.set(((NavBackStackEntry) animatedContentTransitionScope.getTargetState()).getId(), f2);
        return new ContentTransform((EnterTransition) lVar.invoke(animatedContentTransitionScope), (ExitTransition) lVar2.invoke(animatedContentTransitionScope), f2, (SizeTransform) lVar3.invoke(animatedContentTransitionScope));
    }

    static final ab NavHost$lambda$43(SeekableTransitionState seekableTransitionState, NavBackStackEntry navBackStackEntry, SaveableStateHolder saveableStateHolder, MutableState mutableState, State state, final AnimatedContentScope animatedContentScope, final NavBackStackEntry navBackStackEntry2, Composer composer, int i2) {
        NavBackStackEntry navBackStackEntryPrevious;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2066070464, i2, -1, "androidx.navigation.compose.NavHost.<anonymous> (NavHost.kt:1026)");
        }
        boolean zN = x.n(seekableTransitionState.getCurrentState(), navBackStackEntry);
        if (!NavHost$lambda$23(mutableState) && !zN) {
            List<NavBackStackEntry> listNavHost$lambda$32 = NavHost$lambda$32(state);
            ListIterator<NavBackStackEntry> listIterator = listNavHost$lambda$32.listIterator(listNavHost$lambda$32.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    navBackStackEntryPrevious = null;
                    break;
                }
                navBackStackEntryPrevious = listIterator.previous();
                if (x.n(navBackStackEntry2, navBackStackEntryPrevious)) {
                    break;
                }
            }
            navBackStackEntry2 = navBackStackEntryPrevious;
        }
        if (navBackStackEntry2 == null) {
            composer.startReplaceGroup(872360807);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1218785318);
            NavBackStackEntryProviderKt.LocalOwnersProvider(navBackStackEntry2, saveableStateHolder, ComposableLambdaKt.rememberComposableLambda(-1138044367, true, new p() { // from class: androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda3
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return NavHostKt.NavHost$lambda$43$1(navBackStackEntry2, animatedContentScope, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 384);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab NavHost$lambda$43$1(NavBackStackEntry navBackStackEntry, AnimatedContentScope animatedContentScope, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1138044367, i2, -1, "androidx.navigation.compose.NavHost.<anonymous>.<anonymous> (NavHost.kt:1040)");
            }
            NavDestination destination = navBackStackEntry.getDestination();
            x.d(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
            ((ComposeNavigator.Destination) destination).getContent$navigation_compose().invoke(animatedContentScope, navBackStackEntry, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab NavHost$lambda$45(NavHostController navHostController, NavGraph navGraph, Modifier modifier, Alignment alignment, l lVar, l lVar2, l lVar3, l lVar4, p pVar, p pVar2, l lVar5, int i2, int i3, int i4, Composer composer, int i5) {
        NavHost(navHostController, navGraph, modifier, alignment, (l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) lVar, (l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) lVar2, (l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) lVar3, (l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) lVar4, (p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, EnterTransition>) pVar, (p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, ExitTransition>) pVar2, (l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) lVar5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab NavHost$lambda$46(NavHostController navHostController, NavGraph navGraph, Modifier modifier, Alignment alignment, l lVar, l lVar2, l lVar3, l lVar4, p pVar, p pVar2, l lVar5, int i2, int i3, int i4, Composer composer, int i5) {
        NavHost(navHostController, navGraph, modifier, alignment, (l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) lVar, (l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) lVar2, (l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) lVar3, (l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) lVar4, (p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, EnterTransition>) pVar, (p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, ExitTransition>) pVar2, (l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) lVar5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab NavHost$lambda$6(NavHostController navHostController, String str, Modifier modifier, Alignment alignment, String str2, l lVar, l lVar2, l lVar3, l lVar4, p pVar, p pVar2, l lVar5, l lVar6, int i2, int i3, int i4, Composer composer, int i5) {
        NavHost(navHostController, str, modifier, alignment, str2, lVar, lVar2, lVar3, lVar4, pVar, pVar2, lVar5, lVar6, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab NavHost$lambda$7(NavHostController navHostController, c cVar, Modifier modifier, Alignment alignment, c cVar2, Map map, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6, int i2, int i3, int i4, Composer composer, int i5) {
        NavHost(navHostController, cVar, modifier, alignment, cVar2, map, lVar, lVar2, lVar3, lVar4, lVar5, lVar6, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab NavHost$lambda$9(NavHostController navHostController, c cVar, Modifier modifier, Alignment alignment, c cVar2, Map map, l lVar, l lVar2, l lVar3, l lVar4, p pVar, p pVar2, l lVar5, l lVar6, int i2, int i3, int i4, Composer composer, int i5) {
        NavHost(navHostController, (c<?>) cVar, modifier, alignment, (c<?>) cVar2, (Map<s, NavType<?>>) map, (l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) lVar, (l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) lVar2, (l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) lVar3, (l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) lVar4, (p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, EnterTransition>) pVar, (p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, ExitTransition>) pVar2, (l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) lVar5, (l<? super NavGraphBuilder, ab>) lVar6, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    private static final EnterTransition createEnterTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition$navigation_compose;
        if (navDestination instanceof ComposeNavigator.Destination) {
            l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition$navigation_compose2 = ((ComposeNavigator.Destination) navDestination).getEnterTransition$navigation_compose();
            if (enterTransition$navigation_compose2 != null) {
                return enterTransition$navigation_compose2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (enterTransition$navigation_compose = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getEnterTransition$navigation_compose()) == null) {
            return null;
        }
        return enterTransition$navigation_compose.invoke(animatedContentTransitionScope);
    }

    private static final ExitTransition createExitTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition$navigation_compose;
        if (navDestination instanceof ComposeNavigator.Destination) {
            l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition$navigation_compose2 = ((ComposeNavigator.Destination) navDestination).getExitTransition$navigation_compose();
            if (exitTransition$navigation_compose2 != null) {
                return exitTransition$navigation_compose2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (exitTransition$navigation_compose = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getExitTransition$navigation_compose()) == null) {
            return null;
        }
        return exitTransition$navigation_compose.invoke(animatedContentTransitionScope);
    }

    private static final EnterTransition createPopEnterTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition$navigation_compose;
        if (navDestination instanceof ComposeNavigator.Destination) {
            l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition$navigation_compose2 = ((ComposeNavigator.Destination) navDestination).getPopEnterTransition$navigation_compose();
            if (popEnterTransition$navigation_compose2 != null) {
                return popEnterTransition$navigation_compose2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popEnterTransition$navigation_compose = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopEnterTransition$navigation_compose()) == null) {
            return null;
        }
        return popEnterTransition$navigation_compose.invoke(animatedContentTransitionScope);
    }

    private static final ExitTransition createPopExitTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition$navigation_compose;
        if (navDestination instanceof ComposeNavigator.Destination) {
            l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition$navigation_compose2 = ((ComposeNavigator.Destination) navDestination).getPopExitTransition$navigation_compose();
            if (popExitTransition$navigation_compose2 != null) {
                return popExitTransition$navigation_compose2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popExitTransition$navigation_compose = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopExitTransition$navigation_compose()) == null) {
            return null;
        }
        return popExitTransition$navigation_compose.invoke(animatedContentTransitionScope);
    }

    private static final EnterTransition createPredictivePopEnterTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope, int i2) {
        p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, EnterTransition> predictivePopEnterTransition$navigation_compose;
        if (navDestination instanceof ComposeNavigator.Destination) {
            p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, EnterTransition> predictivePopEnterTransition$navigation_compose2 = ((ComposeNavigator.Destination) navDestination).getPredictivePopEnterTransition$navigation_compose();
            if (predictivePopEnterTransition$navigation_compose2 != null) {
                return predictivePopEnterTransition$navigation_compose2.invoke(animatedContentTransitionScope, Integer.valueOf(i2));
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (predictivePopEnterTransition$navigation_compose = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPredictivePopEnterTransition$navigation_compose()) == null) {
            return null;
        }
        return predictivePopEnterTransition$navigation_compose.invoke(animatedContentTransitionScope, Integer.valueOf(i2));
    }

    private static final ExitTransition createPredictivePopExitTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope, int i2) {
        p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, ExitTransition> predictivePopExitTransition$navigation_compose;
        if (navDestination instanceof ComposeNavigator.Destination) {
            p<AnimatedContentTransitionScope<NavBackStackEntry>, Integer, ExitTransition> predictivePopExitTransition$navigation_compose2 = ((ComposeNavigator.Destination) navDestination).getPredictivePopExitTransition$navigation_compose();
            if (predictivePopExitTransition$navigation_compose2 != null) {
                return predictivePopExitTransition$navigation_compose2.invoke(animatedContentTransitionScope, Integer.valueOf(i2));
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (predictivePopExitTransition$navigation_compose = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPredictivePopExitTransition$navigation_compose()) == null) {
            return null;
        }
        return predictivePopExitTransition$navigation_compose.invoke(animatedContentTransitionScope, Integer.valueOf(i2));
    }

    private static final SizeTransform createSizeTransform(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> sizeTransform$navigation_compose;
        if (navDestination instanceof ComposeNavigator.Destination) {
            l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> sizeTransform$navigation_compose2 = ((ComposeNavigator.Destination) navDestination).getSizeTransform$navigation_compose();
            if (sizeTransform$navigation_compose2 != null) {
                return sizeTransform$navigation_compose2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (sizeTransform$navigation_compose = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getSizeTransform$navigation_compose()) == null) {
            return null;
        }
        return sizeTransform$navigation_compose.invoke(animatedContentTransitionScope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void NavHost(final androidx.navigation.NavHostController r26, final androidx.navigation.NavGraph r27, androidx.compose.ui.Modifier r28, androidx.compose.ui.Alignment r29, h.g.a.l r30, h.g.a.l r31, h.g.a.l r32, h.g.a.l r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, androidx.navigation.NavGraph, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, h.g.a.l, h.g.a.l, h.g.a.l, h.g.a.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void NavHost(final androidx.navigation.NavHostController r27, final androidx.navigation.NavGraph r28, androidx.compose.ui.Modifier r29, androidx.compose.ui.Alignment r30, h.g.a.l r31, h.g.a.l r32, h.g.a.l r33, h.g.a.l r34, h.g.a.l r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, androidx.navigation.NavGraph, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, h.g.a.l, h.g.a.l, h.g.a.l, h.g.a.l, h.g.a.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void NavHost(final androidx.navigation.NavHostController r20, final androidx.navigation.NavGraph r21, androidx.compose.ui.Modifier r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            r4 = r24
            r0 = r4 & 6
            r1 = -957014592(0xffffffffc6f51dc0, float:-31374.875)
            r2 = r23
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r1)
            r3 = 1
            r5 = r20
            if (r0 != 0) goto L1d
            boolean r0 = r2.changedInstance(r5)
            if (r3 == r0) goto L1a
            r0 = 2
            goto L1b
        L1a:
            r0 = 4
        L1b:
            r0 = r0 | r4
            goto L1e
        L1d:
            r0 = r4
        L1e:
            r6 = r4 & 48
            if (r6 != 0) goto L31
            r6 = r21
            boolean r7 = r2.changedInstance(r6)
            if (r3 == r7) goto L2d
            r7 = 16
            goto L2f
        L2d:
            r7 = 32
        L2f:
            r0 = r0 | r7
            goto L33
        L31:
            r6 = r21
        L33:
            r7 = r25 & 4
            if (r7 == 0) goto L3a
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L4d
        L3a:
            r8 = r4 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L4d
            r8 = r22
            boolean r9 = r2.changed(r8)
            if (r3 == r9) goto L49
            r9 = 128(0x80, float:1.8E-43)
            goto L4b
        L49:
            r9 = 256(0x100, float:3.59E-43)
        L4b:
            r0 = r0 | r9
            goto L4f
        L4d:
            r8 = r22
        L4f:
            r9 = r0 & 147(0x93, float:2.06E-43)
            r10 = 146(0x92, float:2.05E-43)
            if (r9 == r10) goto L56
            goto L57
        L56:
            r3 = 0
        L57:
            r9 = r0 & 1
            boolean r3 = r2.shouldExecute(r3, r9)
            if (r3 == 0) goto L94
            if (r7 == 0) goto L67
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            r7 = r3
            goto L68
        L67:
            r7 = r8
        L68:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L74
            r3 = -1
            java.lang.String r8 = "androidx.navigation.compose.NavHost (NavHost.kt:641)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r0, r3, r8)
        L74:
            r0 = r0 & 1022(0x3fe, float:1.432E-42)
            r18 = 0
            r19 = 2040(0x7f8, float:2.859E-42)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = r0
            r16 = r2
            NavHost(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L92
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L92:
            r3 = r7
            goto L9a
        L94:
            r16 = r2
            r16.skipToGroupEnd()
            r3 = r8
        L9a:
            androidx.compose.runtime.ScopeUpdateScope r6 = r16.endRestartGroup()
            if (r6 == 0) goto Lae
            androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda9 r0 = new androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda9
            r1 = r20
            r2 = r21
            r5 = r25
            r0.<init>()
            r6.updateScope(r0)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, androidx.navigation.NavGraph, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void NavHost(final androidx.navigation.NavHostController r35, final java.lang.Object r36, androidx.compose.ui.Modifier r37, androidx.compose.ui.Alignment r38, h.l.c r39, java.util.Map r40, h.g.a.l r41, h.g.a.l r42, h.g.a.l r43, h.g.a.l r44, h.g.a.l r45, final h.g.a.l r46, androidx.compose.runtime.Composer r47, final int r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, java.lang.Object, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, h.l.c, java.util.Map, h.g.a.l, h.g.a.l, h.g.a.l, h.g.a.l, h.g.a.l, h.g.a.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavHost(final androidx.navigation.NavHostController r26, final java.lang.Object r27, androidx.compose.ui.Modifier r28, androidx.compose.ui.Alignment r29, h.l.c<?> r30, java.util.Map<h.l.s, androidx.navigation.NavType<?>> r31, h.g.a.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.EnterTransition> r32, h.g.a.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.ExitTransition> r33, h.g.a.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.EnterTransition> r34, h.g.a.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.ExitTransition> r35, h.g.a.p<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, java.lang.Integer, androidx.compose.animation.EnterTransition> r36, h.g.a.p<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, java.lang.Integer, androidx.compose.animation.ExitTransition> r37, h.g.a.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.SizeTransform> r38, final h.g.a.l<? super androidx.navigation.NavGraphBuilder, h.ab> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, java.lang.Object, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, h.l.c, java.util.Map, h.g.a.l, h.g.a.l, h.g.a.l, h.g.a.l, h.g.a.p, h.g.a.p, h.g.a.l, h.g.a.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void NavHost(final androidx.navigation.NavHostController r25, final java.lang.String r26, androidx.compose.ui.Modifier r27, androidx.compose.ui.Alignment r28, java.lang.String r29, h.g.a.l r30, h.g.a.l r31, h.g.a.l r32, h.g.a.l r33, final h.g.a.l r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, java.lang.String, h.g.a.l, h.g.a.l, h.g.a.l, h.g.a.l, h.g.a.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void NavHost(final androidx.navigation.NavHostController r32, final java.lang.String r33, androidx.compose.ui.Modifier r34, androidx.compose.ui.Alignment r35, java.lang.String r36, h.g.a.l r37, h.g.a.l r38, h.g.a.l r39, h.g.a.l r40, h.g.a.l r41, final h.g.a.l r42, androidx.compose.runtime.Composer r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, java.lang.String, h.g.a.l, h.g.a.l, h.g.a.l, h.g.a.l, h.g.a.l, h.g.a.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavHost(final androidx.navigation.NavHostController r24, final java.lang.String r25, androidx.compose.ui.Modifier r26, androidx.compose.ui.Alignment r27, java.lang.String r28, h.g.a.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.EnterTransition> r29, h.g.a.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.ExitTransition> r30, h.g.a.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.EnterTransition> r31, h.g.a.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.ExitTransition> r32, h.g.a.p<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, java.lang.Integer, androidx.compose.animation.EnterTransition> r33, h.g.a.p<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, java.lang.Integer, androidx.compose.animation.ExitTransition> r34, h.g.a.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.SizeTransform> r35, final h.g.a.l<? super androidx.navigation.NavGraphBuilder, h.ab> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, java.lang.String, h.g.a.l, h.g.a.l, h.g.a.l, h.g.a.l, h.g.a.p, h.g.a.p, h.g.a.l, h.g.a.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void NavHost(final androidx.navigation.NavHostController r17, final java.lang.String r18, androidx.compose.ui.Modifier r19, java.lang.String r20, final h.g.a.l r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, java.lang.String, androidx.compose.ui.Modifier, java.lang.String, h.g.a.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void NavHost(final androidx.navigation.NavHostController r35, final h.l.c r36, androidx.compose.ui.Modifier r37, androidx.compose.ui.Alignment r38, h.l.c r39, java.util.Map r40, h.g.a.l r41, h.g.a.l r42, h.g.a.l r43, h.g.a.l r44, h.g.a.l r45, final h.g.a.l r46, androidx.compose.runtime.Composer r47, final int r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, h.l.c, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, h.l.c, java.util.Map, h.g.a.l, h.g.a.l, h.g.a.l, h.g.a.l, h.g.a.l, h.g.a.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavHost(final androidx.navigation.NavHostController r26, final h.l.c<?> r27, androidx.compose.ui.Modifier r28, androidx.compose.ui.Alignment r29, h.l.c<?> r30, java.util.Map<h.l.s, androidx.navigation.NavType<?>> r31, h.g.a.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.EnterTransition> r32, h.g.a.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.ExitTransition> r33, h.g.a.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.EnterTransition> r34, h.g.a.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.ExitTransition> r35, h.g.a.p<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, java.lang.Integer, androidx.compose.animation.EnterTransition> r36, h.g.a.p<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, java.lang.Integer, androidx.compose.animation.ExitTransition> r37, h.g.a.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.SizeTransform> r38, final h.g.a.l<? super androidx.navigation.NavGraphBuilder, h.ab> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, h.l.c, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, h.l.c, java.util.Map, h.g.a.l, h.g.a.l, h.g.a.l, h.g.a.l, h.g.a.p, h.g.a.p, h.g.a.l, h.g.a.l, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
