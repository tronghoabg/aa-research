package androidx.compose.foundation.lazy.layout;

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
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyLayoutKt {
    private static final int MaxItemsToRetainForReuse = 7;

    public static final void LazyLayout(final a<? extends LazyLayoutItemProvider> aVar, final Modifier modifier, final LazyLayoutPrefetchState lazyLayoutPrefetchState, final LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy, Composer composer, final int i2, final int i3) {
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1055276397);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changed(lazyLayoutPrefetchState) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != ((i2 & 4096) == 0 ? composerStartRestartGroup.changed(lazyLayoutMeasurePolicy) : composerStartRestartGroup.changedInstance(lazyLayoutMeasurePolicy)) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i4 & 1)) {
            if (i6 != 0) {
                modifier = Modifier.Companion;
            }
            if (i7 != 0) {
                lazyLayoutPrefetchState = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1055276397, i4, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:111)");
            }
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(aVar, composerStartRestartGroup, i4 & 14);
            LazySaveableStateHolderKt.LazySaveableStateHolderProvider(ComposableLambdaKt.rememberComposableLambda(-933153643, true, new q() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$$ExternalSyntheticLambda1
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return LazyLayoutKt.LazyLayout$lambda$1(lazyLayoutPrefetchState, modifier, lazyLayoutMeasurePolicy, stateRememberUpdatedState, (SaveableStateHolder) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final LazyLayoutPrefetchState lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return LazyLayoutKt.LazyLayout$lambda$2(aVar, modifier2, lazyLayoutPrefetchState2, lazyLayoutMeasurePolicy, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab LazyLayout$lambda$0(a aVar, Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState, p pVar, int i2, int i3, Composer composer, int i4) {
        LazyLayout(aVar, modifier, lazyLayoutPrefetchState, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab LazyLayout$lambda$1(final LazyLayoutPrefetchState lazyLayoutPrefetchState, Modifier modifier, final LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy, final State state, SaveableStateHolder saveableStateHolder, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-933153643, i2, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:115)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new LazyLayoutItemContentFactory(saveableStateHolder, new a() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$$ExternalSyntheticLambda3
                @Override // h.g.a.a
                public final Object invoke() {
                    return LazyLayoutKt.LazyLayout$lambda$1$0$0(state);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new SubcomposeLayoutState(new LazyLayoutItemReusePolicy(lazyLayoutItemContentFactory));
            composer.updateRememberedValue(objRememberedValue2);
        }
        final SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objRememberedValue2;
        if (lazyLayoutPrefetchState != null) {
            composer.startReplaceGroup(1743490539);
            final PrefetchScheduler prefetchScheduler$foundation = lazyLayoutPrefetchState.getPrefetchScheduler$foundation();
            if (prefetchScheduler$foundation == null) {
                composer.startReplaceGroup(887527095);
                prefetchScheduler$foundation = PrefetchScheduler_androidKt.rememberDefaultPrefetchScheduler(composer, 0);
            } else {
                composer.startReplaceGroup(887526010);
            }
            composer.endReplaceGroup();
            Object[] objArr = {lazyLayoutPrefetchState, lazyLayoutItemContentFactory, subcomposeLayoutState, prefetchScheduler$foundation};
            boolean zChanged = composer.changed(lazyLayoutPrefetchState) | composer.changedInstance(lazyLayoutItemContentFactory) | composer.changedInstance(subcomposeLayoutState) | composer.changedInstance(prefetchScheduler$foundation);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new l() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$$ExternalSyntheticLambda4
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return LazyLayoutKt.LazyLayout$lambda$1$2$0(lazyLayoutPrefetchState, lazyLayoutItemContentFactory, subcomposeLayoutState, prefetchScheduler$foundation, (DisposableEffectScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.DisposableEffect(objArr, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1744076749);
            composer.endReplaceGroup();
        }
        Modifier modifierTraversablePrefetchState = LazyLayoutPrefetchStateKt.traversablePrefetchState(modifier, lazyLayoutPrefetchState);
        boolean zChanged2 = composer.changed(lazyLayoutItemContentFactory) | composer.changed(lazyLayoutMeasurePolicy);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
            objRememberedValue4 = new p() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$$ExternalSyntheticLambda5
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return LazyLayoutKt.LazyLayout$lambda$1$3$0(lazyLayoutItemContentFactory, lazyLayoutMeasurePolicy, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, modifierTraversablePrefetchState, (p) objRememberedValue4, composer, SubcomposeLayoutState.$stable, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyLayoutItemProvider LazyLayout$lambda$1$0$0(State state) {
        return (LazyLayoutItemProvider) ((a) state.getValue()).invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult LazyLayout$lambda$1$2$0(final LazyLayoutPrefetchState lazyLayoutPrefetchState, LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeLayoutState subcomposeLayoutState, PrefetchScheduler prefetchScheduler, DisposableEffectScope disposableEffectScope) {
        lazyLayoutPrefetchState.setPrefetchHandleProvider$foundation(new PrefetchHandleProvider(lazyLayoutItemContentFactory, subcomposeLayoutState, prefetchScheduler));
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$lambda$1$2$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                PrefetchHandleProvider prefetchHandleProvider$foundation = lazyLayoutPrefetchState.getPrefetchHandleProvider$foundation();
                if (prefetchHandleProvider$foundation != null) {
                    prefetchHandleProvider$foundation.onDisposed();
                }
                lazyLayoutPrefetchState.setPrefetchHandleProvider$foundation(null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult LazyLayout$lambda$1$3$0(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy, SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return lazyLayoutMeasurePolicy.mo2877measure0kLqBqw(new LazyLayoutMeasureScopeImpl(lazyLayoutItemContentFactory, subcomposeMeasureScope), constraints.m11113unboximpl());
    }

    static final ab LazyLayout$lambda$2(a aVar, Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState, LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy, int i2, int i3, Composer composer, int i4) {
        LazyLayout((a<? extends LazyLayoutItemProvider>) aVar, modifier, lazyLayoutPrefetchState, lazyLayoutMeasurePolicy, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    public static final /* synthetic */ void LazyLayout(final a aVar, Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState, final p pVar, Composer composer, final int i2, final int i3) {
        int i4;
        final Modifier modifier2;
        final LazyLayoutPrefetchState lazyLayoutPrefetchState2;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(2002163445);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changed(lazyLayoutPrefetchState) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i4 & 1)) {
            if (i6 != 0) {
                modifier = Modifier.Companion;
            }
            Modifier modifier3 = modifier;
            if (i7 != 0) {
                lazyLayoutPrefetchState = null;
            }
            LazyLayoutPrefetchState lazyLayoutPrefetchState3 = lazyLayoutPrefetchState;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2002163445, i4, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:68)");
            }
            LazyLayout((a<? extends LazyLayoutItemProvider>) aVar, modifier3, lazyLayoutPrefetchState3, new LazyLayoutKt$sam$androidx_compose_foundation_lazy_layout_LazyLayoutMeasurePolicy$0(pVar), composerStartRestartGroup, i4 & 1022, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            lazyLayoutPrefetchState2 = lazyLayoutPrefetchState3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return LazyLayoutKt.LazyLayout$lambda$0(aVar, modifier2, lazyLayoutPrefetchState2, pVar, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
