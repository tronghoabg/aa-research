package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.DialogNavigator;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DialogHostKt {
    public static final void DialogHost(final DialogNavigator dialogNavigator, Composer composer, final int i2) {
        int i3 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(294589392);
        int i4 = i3 == 0 ? (true != composerStartRestartGroup.changedInstance(dialogNavigator) ? 2 : 4) | i2 : i2;
        if (composerStartRestartGroup.shouldExecute((i4 & 3) != 2, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(294589392, i4, -1, "androidx.navigation.compose.DialogHost (DialogHost.kt:40)");
            }
            final SaveableStateHolder saveableStateHolderRememberSaveableStateHolder = SaveableStateHolderKt.rememberSaveableStateHolder(composerStartRestartGroup, 0);
            State stateCollectAsState = SnapshotStateKt.collectAsState(dialogNavigator.getBackStack$navigation_compose(), null, composerStartRestartGroup, 0, 1);
            SnapshotStateList<NavBackStackEntry> snapshotStateListRememberVisibleList = rememberVisibleList(DialogHost$lambda$0(stateCollectAsState), composerStartRestartGroup, 0);
            PopulateVisibleList(snapshotStateListRememberVisibleList, DialogHost$lambda$0(stateCollectAsState), composerStartRestartGroup, 0);
            State stateCollectAsState2 = SnapshotStateKt.collectAsState(dialogNavigator.getTransitionInProgress$navigation_compose(), null, composerStartRestartGroup, 0, 1);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
            composerStartRestartGroup.startReplaceGroup(-367419233);
            for (final NavBackStackEntry navBackStackEntry : snapshotStateListRememberVisibleList) {
                NavDestination destination = navBackStackEntry.getDestination();
                x.d(destination, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                final DialogNavigator.Destination destination2 = (DialogNavigator.Destination) destination;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(dialogNavigator) | composerStartRestartGroup.changedInstance(navBackStackEntry);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new a() { // from class: androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda4
                        @Override // h.g.a.a
                        public final Object invoke() {
                            return DialogHostKt.DialogHost$lambda$3$0$0(dialogNavigator, navBackStackEntry);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                AndroidDialog_androidKt.Dialog((a) objRememberedValue2, destination2.getDialogProperties$navigation_compose(), ComposableLambdaKt.rememberComposableLambda(1129586364, true, new p() { // from class: androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda5
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return DialogHostKt.DialogHost$lambda$3$1(navBackStackEntry, dialogNavigator, saveableStateHolderRememberSaveableStateHolder, snapshotStateList, destination2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            Set<NavBackStackEntry> setDialogHost$lambda$1 = DialogHost$lambda$1(stateCollectAsState2);
            boolean zChanged = composerStartRestartGroup.changed(stateCollectAsState2) | composerStartRestartGroup.changedInstance(dialogNavigator);
            DialogHostKt$DialogHost$2$1 dialogHostKt$DialogHost$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || dialogHostKt$DialogHost$2$1RememberedValue == Composer.Companion.getEmpty()) {
                dialogHostKt$DialogHost$2$1RememberedValue = new DialogHostKt$DialogHost$2$1(stateCollectAsState2, dialogNavigator, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(dialogHostKt$DialogHost$2$1RememberedValue);
            }
            EffectsKt.LaunchedEffect(setDialogHost$lambda$1, snapshotStateList, (p) dialogHostKt$DialogHost$2$1RememberedValue, composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda6
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DialogHostKt.DialogHost$lambda$5(dialogNavigator, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final List<NavBackStackEntry> DialogHost$lambda$0(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set<NavBackStackEntry> DialogHost$lambda$1(State<? extends Set<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DialogHost$lambda$3$0$0(DialogNavigator dialogNavigator, NavBackStackEntry navBackStackEntry) {
        dialogNavigator.dismiss$navigation_compose(navBackStackEntry);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DialogHost$lambda$3$1(final NavBackStackEntry navBackStackEntry, final DialogNavigator dialogNavigator, SaveableStateHolder saveableStateHolder, final SnapshotStateList snapshotStateList, final DialogNavigator.Destination destination, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1129586364, i2, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous> (DialogHost.kt:55)");
            }
            boolean zChangedInstance = composer.changedInstance(navBackStackEntry) | composer.changedInstance(dialogNavigator);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda2
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DialogHostKt.DialogHost$lambda$3$1$0$0(snapshotStateList, navBackStackEntry, dialogNavigator, (DisposableEffectScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(navBackStackEntry, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer, 0);
            NavBackStackEntryProviderKt.LocalOwnersProvider(navBackStackEntry, saveableStateHolder, ComposableLambdaKt.rememberComposableLambda(-497631156, true, new p() { // from class: androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda3
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DialogHostKt.DialogHost$lambda$3$1$1(destination, navBackStackEntry, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult DialogHost$lambda$3$1$0$0(final SnapshotStateList snapshotStateList, final NavBackStackEntry navBackStackEntry, final DialogNavigator dialogNavigator, DisposableEffectScope disposableEffectScope) {
        snapshotStateList.add(navBackStackEntry);
        return new DisposableEffectResult() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$lambda$3$1$0$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                dialogNavigator.onTransitionComplete$navigation_compose(navBackStackEntry);
                snapshotStateList.remove(navBackStackEntry);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DialogHost$lambda$3$1$1(DialogNavigator.Destination destination, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-497631156, i2, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous>.<anonymous> (DialogHost.kt:66)");
            }
            destination.getContent$navigation_compose().invoke(navBackStackEntry, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab DialogHost$lambda$5(DialogNavigator dialogNavigator, int i2, Composer composer, int i3) {
        DialogHost(dialogNavigator, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final void PopulateVisibleList(final List<NavBackStackEntry> list, final Collection<NavBackStackEntry> collection, Composer composer, final int i2) {
        int i3 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1537894851);
        int i4 = i3 == 0 ? (true != composerStartRestartGroup.changedInstance(list) ? 2 : 4) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(collection) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1537894851, i4, -1, "androidx.navigation.compose.PopulateVisibleList (DialogHost.kt:88)");
            }
            final boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue();
            for (final NavBackStackEntry navBackStackEntry : collection) {
                Lifecycle lifecycle = navBackStackEntry.getLifecycle();
                boolean zChanged = composerStartRestartGroup.changed(zBooleanValue) | composerStartRestartGroup.changedInstance(list) | composerStartRestartGroup.changedInstance(navBackStackEntry);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new l() { // from class: androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0
                        @Override // h.g.a.l
                        public final Object invoke(Object obj) {
                            return DialogHostKt.PopulateVisibleList$lambda$0$0$0(navBackStackEntry, zBooleanValue, list, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                EffectsKt.DisposableEffect(lifecycle, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DialogHostKt.PopulateVisibleList$lambda$1(list, collection, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult PopulateVisibleList$lambda$0$0$0(final NavBackStackEntry navBackStackEntry, final boolean z, final List list, DisposableEffectScope disposableEffectScope) {
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda7
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                DialogHostKt.PopulateVisibleList$lambda$0$0$0$0(z, list, navBackStackEntry, lifecycleOwner, event);
            }
        };
        navBackStackEntry.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: androidx.navigation.compose.DialogHostKt$PopulateVisibleList$lambda$0$0$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                navBackStackEntry.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PopulateVisibleList$lambda$0$0$0$0(boolean z, List list, NavBackStackEntry navBackStackEntry, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (z && !list.contains(navBackStackEntry)) {
            list.add(navBackStackEntry);
        }
        if (event == Lifecycle.Event.ON_START && !list.contains(navBackStackEntry)) {
            list.add(navBackStackEntry);
        }
        if (event == Lifecycle.Event.ON_STOP) {
            list.remove(navBackStackEntry);
        }
    }

    static final ab PopulateVisibleList$lambda$1(List list, Collection collection, int i2, Composer composer, int i3) {
        PopulateVisibleList(list, collection, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.runtime.snapshots.SnapshotStateList<androidx.navigation.NavBackStackEntry> rememberVisibleList(java.util.Collection<androidx.navigation.NavBackStackEntry> r5, androidx.compose.runtime.Composer r6, int r7) {
        /*
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto Lf
            r0 = -1
            java.lang.String r1 = "androidx.navigation.compose.rememberVisibleList (DialogHost.kt:119)"
            r2 = 467378629(0x1bdba1c5, float:3.6335052E-22)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r7, r0, r1)
        Lf:
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.ui.platform.InspectionModeKt.getLocalInspectionMode()
            androidx.compose.runtime.CompositionLocal r7 = (androidx.compose.runtime.CompositionLocal) r7
            java.lang.Object r7 = r6.consume(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            boolean r0 = r6.changed(r5)
            java.lang.Object r1 = r6.rememberedValue()
            if (r0 != 0) goto L31
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L71
        L31:
            androidx.compose.runtime.snapshots.SnapshotStateList r1 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r5 = r5.iterator()
        L42:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L67
            java.lang.Object r2 = r5.next()
            r3 = r2
            androidx.navigation.NavBackStackEntry r3 = (androidx.navigation.NavBackStackEntry) r3
            if (r7 == 0) goto L53
            r3 = 1
            goto L61
        L53:
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            androidx.lifecycle.Lifecycle$State r3 = r3.getCurrentState()
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r3 = r3.isAtLeast(r4)
        L61:
            if (r3 == 0) goto L42
            r0.add(r2)
            goto L42
        L67:
            java.util.List r0 = (java.util.List) r0
            java.util.Collection r0 = (java.util.Collection) r0
            r1.addAll(r0)
            r6.updateRememberedValue(r1)
        L71:
            androidx.compose.runtime.snapshots.SnapshotStateList r1 = (androidx.compose.runtime.snapshots.SnapshotStateList) r1
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L7c
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.DialogHostKt.rememberVisibleList(java.util.Collection, androidx.compose.runtime.Composer, int):androidx.compose.runtime.snapshots.SnapshotStateList");
    }
}
