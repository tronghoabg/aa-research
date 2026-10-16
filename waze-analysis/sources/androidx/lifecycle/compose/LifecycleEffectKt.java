package androidx.lifecycle.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.aq;
import h.g.b.x;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class LifecycleEffectKt {
    private static final String LifecycleResumeEffectNoParamError = "LifecycleResumeEffect must provide one or more 'key' parameters that define the identity of the LifecycleResumeEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";
    private static final String LifecycleStartEffectNoParamError = "LifecycleStartEffect must provide one or more 'key' parameters that define the identity of the LifecycleStartEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void LifecycleEventEffect(final Lifecycle.Event event, final LifecycleOwner lifecycleOwner, final a<ab> aVar, Composer composer, final int i2, final int i3) {
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-709389590);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changed(event.ordinal()) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            int i6 = 16;
            if ((i3 & 2) == 0 && composerStartRestartGroup.changedInstance(lifecycleOwner)) {
                i6 = 32;
            }
            i4 |= i6;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            int i7 = i3 & 2;
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if (i7 != 0) {
                    i4 &= -113;
                }
            } else if (i7 != 0) {
                i4 &= -113;
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-709389590, i4, -1, "androidx.lifecycle.compose.LifecycleEventEffect (LifecycleEffect.kt:55)");
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                throw new IllegalArgumentException("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
            }
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(aVar, composerStartRestartGroup, (i4 >> 6) & 14);
            boolean zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState) | ((i4 & 14) == 4) | composerStartRestartGroup.changedInstance(lifecycleOwner);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda14
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return LifecycleEffectKt.LifecycleEventEffect$lambda$1$0(lifecycleOwner, event, stateRememberUpdatedState, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(lifecycleOwner, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, (i4 >> 3) & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda15
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return LifecycleEffectKt.LifecycleEventEffect$lambda$2(event, lifecycleOwner2, aVar, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final a<ab> LifecycleEventEffect$lambda$0(State<? extends a<ab>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult LifecycleEventEffect$lambda$1$0(final LifecycleOwner lifecycleOwner, final Lifecycle.Event event, final State state, DisposableEffectScope disposableEffectScope) {
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda11
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event2) {
                LifecycleEffectKt.LifecycleEventEffect$lambda$1$0$0(event, state, lifecycleOwner2, event2);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleEventEffect$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LifecycleEventEffect$lambda$1$0$0(Lifecycle.Event event, State state, LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
        if (event2 == event) {
            LifecycleEventEffect$lambda$0(state).invoke();
        }
    }

    static final ab LifecycleEventEffect$lambda$2(Lifecycle.Event event, LifecycleOwner lifecycleOwner, a aVar, int i2, int i3, Composer composer, int i4) {
        LifecycleEventEffect(event, lifecycleOwner, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    public static final void LifecycleResumeEffect(final Object[] objArr, LifecycleOwner lifecycleOwner, final l<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> lVar, Composer composer, final int i2, final int i3) {
        int i4;
        int i5 = i2 & 48;
        Composer composerStartRestartGroup = composer.startRestartGroup(-781756895);
        if (i5 == 0) {
            int i6 = 16;
            if ((i3 & 2) == 0 && composerStartRestartGroup.changedInstance(lifecycleOwner)) {
                i6 = 32;
            }
            i4 = i2 | i6;
        } else {
            i4 = i2;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        int length = objArr.length;
        composerStartRestartGroup.startMovableGroup(350901714, Integer.valueOf(length));
        int i7 = i4 | (true != composerStartRestartGroup.changed(length) ? 0 : 4);
        for (Object obj : objArr) {
            i7 |= true != composerStartRestartGroup.changedInstance(obj) ? 0 : 4;
        }
        composerStartRestartGroup.endMovableGroup();
        if ((i7 & 14) == 0) {
            i7 |= 2;
        }
        if (composerStartRestartGroup.shouldExecute((i7 & 147) != 146, i7 & 1)) {
            int i8 = i3 & 2;
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if (i8 != 0) {
                    i7 &= -113;
                }
            } else if (i8 != 0) {
                i7 &= -113;
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-781756895, i7, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:629)");
            }
            ArrayList arrayList = new ArrayList(2);
            x.q(objArr, arrayList);
            arrayList.add(lifecycleOwner);
            boolean zChanged = false;
            for (Object obj2 : arrayList.toArray(new Object[arrayList.size()])) {
                zChanged |= composerStartRestartGroup.changed(obj2);
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new LifecycleResumePauseEffectScope(lifecycleOwner.getLifecycle());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LifecycleResumeEffectImpl(lifecycleOwner, (LifecycleResumePauseEffectScope) objRememberedValue, lVar, composerStartRestartGroup, (i7 & DisplayStrings.DS_TAP_TO_VERIFY) | ((i7 >> 3) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda16
                @Override // h.g.a.p
                public final Object invoke(Object obj3, Object obj4) {
                    return LifecycleEffectKt.LifecycleResumeEffect$lambda$7(objArr, lifecycleOwner2, lVar, i2, i3, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    static final ab LifecycleResumeEffect$lambda$1(Object obj, LifecycleOwner lifecycleOwner, l lVar, int i2, int i3, Composer composer, int i4) {
        LifecycleResumeEffect(obj, lifecycleOwner, (l<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab LifecycleResumeEffect$lambda$3(Object obj, Object obj2, LifecycleOwner lifecycleOwner, l lVar, int i2, int i3, Composer composer, int i4) {
        LifecycleResumeEffect(obj, obj2, lifecycleOwner, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab LifecycleResumeEffect$lambda$5(Object obj, Object obj2, Object obj3, LifecycleOwner lifecycleOwner, l lVar, int i2, int i3, Composer composer, int i4) {
        LifecycleResumeEffect(obj, obj2, obj3, lifecycleOwner, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab LifecycleResumeEffect$lambda$7(Object[] objArr, LifecycleOwner lifecycleOwner, l lVar, int i2, int i3, Composer composer, int i4) {
        LifecycleResumeEffect(objArr, lifecycleOwner, (l<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab LifecycleResumeEffect$lambda$8(LifecycleOwner lifecycleOwner, l lVar, int i2, int i3, Composer composer, int i4) {
        LifecycleResumeEffect(lifecycleOwner, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    private static final void LifecycleResumeEffectImpl(final LifecycleOwner lifecycleOwner, final LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, final l<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> lVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(912823238);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(lifecycleOwner) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lifecycleResumePauseEffectScope) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(912823238, i3, -1, "androidx.lifecycle.compose.LifecycleResumeEffectImpl (LifecycleEffect.kt:663)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(lifecycleResumePauseEffectScope) | ((i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256) | composerStartRestartGroup.changedInstance(lifecycleOwner);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda9
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return LifecycleEffectKt.LifecycleResumeEffectImpl$lambda$0$0(lifecycleOwner, lifecycleResumePauseEffectScope, lVar, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(lifecycleOwner, lifecycleResumePauseEffectScope, (l) objRememberedValue, composerStartRestartGroup, i3 & 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda10
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return LifecycleEffectKt.LifecycleResumeEffectImpl$lambda$1(lifecycleOwner, lifecycleResumePauseEffectScope, lVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult LifecycleResumeEffectImpl$lambda$0$0(final LifecycleOwner lifecycleOwner, final LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, final l lVar, DisposableEffectScope disposableEffectScope) {
        final aq aqVar = new aq();
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda4
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                LifecycleEffectKt.LifecycleResumeEffectImpl$lambda$0$0$0(lifecycleResumePauseEffectScope, aqVar, lVar, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffectImpl$lambda$0$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResult = (LifecyclePauseOrDisposeEffectResult) aqVar.f48105a;
                if (lifecyclePauseOrDisposeEffectResult != null) {
                    lifecyclePauseOrDisposeEffectResult.runPauseOrOnDisposeEffect();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LifecycleResumeEffectImpl$lambda$0$0$0(LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, aq aqVar, l lVar, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Lifecycle.Event.Companion companion = Lifecycle.Event.Companion;
        int iOrdinal = event.ordinal();
        if (iOrdinal == 2) {
            aqVar.f48105a = lVar.invoke(lifecycleResumePauseEffectScope);
        } else {
            if (iOrdinal != 3) {
                return;
            }
            LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResult = (LifecyclePauseOrDisposeEffectResult) aqVar.f48105a;
            if (lifecyclePauseOrDisposeEffectResult != null) {
                lifecyclePauseOrDisposeEffectResult.runPauseOrOnDisposeEffect();
            }
            aqVar.f48105a = null;
        }
    }

    static final ab LifecycleResumeEffectImpl$lambda$1(LifecycleOwner lifecycleOwner, LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, l lVar, int i2, Composer composer, int i3) {
        LifecycleResumeEffectImpl(lifecycleOwner, lifecycleResumePauseEffectScope, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final void LifecycleStartEffect(final Object[] objArr, LifecycleOwner lifecycleOwner, final l<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> lVar, Composer composer, final int i2, final int i3) {
        int i4;
        int i5 = i2 & 48;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1510305724);
        if (i5 == 0) {
            int i6 = 16;
            if ((i3 & 2) == 0 && composerStartRestartGroup.changedInstance(lifecycleOwner)) {
                i6 = 32;
            }
            i4 = i2 | i6;
        } else {
            i4 = i2;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        int length = objArr.length;
        composerStartRestartGroup.startMovableGroup(295146261, Integer.valueOf(length));
        int i7 = i4 | (true != composerStartRestartGroup.changed(length) ? 0 : 4);
        for (Object obj : objArr) {
            i7 |= true != composerStartRestartGroup.changedInstance(obj) ? 0 : 4;
        }
        composerStartRestartGroup.endMovableGroup();
        if ((i7 & 14) == 0) {
            i7 |= 2;
        }
        if (composerStartRestartGroup.shouldExecute((i7 & 147) != 146, i7 & 1)) {
            int i8 = i3 & 2;
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if (i8 != 0) {
                    i7 &= -113;
                }
            } else if (i8 != 0) {
                i7 &= -113;
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1510305724, i7, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:308)");
            }
            ArrayList arrayList = new ArrayList(2);
            x.q(objArr, arrayList);
            arrayList.add(lifecycleOwner);
            boolean zChanged = false;
            for (Object obj2 : arrayList.toArray(new Object[arrayList.size()])) {
                zChanged |= composerStartRestartGroup.changed(obj2);
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new LifecycleStartStopEffectScope(lifecycleOwner.getLifecycle());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LifecycleStartEffectImpl(lifecycleOwner, (LifecycleStartStopEffectScope) objRememberedValue, lVar, composerStartRestartGroup, (i7 & DisplayStrings.DS_TAP_TO_VERIFY) | ((i7 >> 3) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda8
                @Override // h.g.a.p
                public final Object invoke(Object obj3, Object obj4) {
                    return LifecycleEffectKt.LifecycleStartEffect$lambda$7(objArr, lifecycleOwner2, lVar, i2, i3, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    static final ab LifecycleStartEffect$lambda$1(Object obj, LifecycleOwner lifecycleOwner, l lVar, int i2, int i3, Composer composer, int i4) {
        LifecycleStartEffect(obj, lifecycleOwner, (l<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult>) lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab LifecycleStartEffect$lambda$3(Object obj, Object obj2, LifecycleOwner lifecycleOwner, l lVar, int i2, int i3, Composer composer, int i4) {
        LifecycleStartEffect(obj, obj2, lifecycleOwner, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab LifecycleStartEffect$lambda$5(Object obj, Object obj2, Object obj3, LifecycleOwner lifecycleOwner, l lVar, int i2, int i3, Composer composer, int i4) {
        LifecycleStartEffect(obj, obj2, obj3, lifecycleOwner, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab LifecycleStartEffect$lambda$7(Object[] objArr, LifecycleOwner lifecycleOwner, l lVar, int i2, int i3, Composer composer, int i4) {
        LifecycleStartEffect(objArr, lifecycleOwner, (l<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult>) lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab LifecycleStartEffect$lambda$8(LifecycleOwner lifecycleOwner, l lVar, int i2, int i3, Composer composer, int i4) {
        LifecycleStartEffect(lifecycleOwner, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    private static final void LifecycleStartEffectImpl(final LifecycleOwner lifecycleOwner, final LifecycleStartStopEffectScope lifecycleStartStopEffectScope, final l<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> lVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(228371534);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(lifecycleOwner) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lifecycleStartStopEffectScope) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(228371534, i3, -1, "androidx.lifecycle.compose.LifecycleStartEffectImpl (LifecycleEffect.kt:340)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(lifecycleStartStopEffectScope) | ((i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256) | composerStartRestartGroup.changedInstance(lifecycleOwner);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda17
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return LifecycleEffectKt.LifecycleStartEffectImpl$lambda$0$0(lifecycleOwner, lifecycleStartStopEffectScope, lVar, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(lifecycleOwner, lifecycleStartStopEffectScope, (l) objRememberedValue, composerStartRestartGroup, i3 & 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda18
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return LifecycleEffectKt.LifecycleStartEffectImpl$lambda$1(lifecycleOwner, lifecycleStartStopEffectScope, lVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult LifecycleStartEffectImpl$lambda$0$0(final LifecycleOwner lifecycleOwner, final LifecycleStartStopEffectScope lifecycleStartStopEffectScope, final l lVar, DisposableEffectScope disposableEffectScope) {
        final aq aqVar = new aq();
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda3
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                LifecycleEffectKt.LifecycleStartEffectImpl$lambda$0$0$0(lifecycleStartStopEffectScope, aqVar, lVar, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffectImpl$lambda$0$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) aqVar.f48105a;
                if (lifecycleStopOrDisposeEffectResult != null) {
                    lifecycleStopOrDisposeEffectResult.runStopOrDisposeEffect();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LifecycleStartEffectImpl$lambda$0$0$0(LifecycleStartStopEffectScope lifecycleStartStopEffectScope, aq aqVar, l lVar, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Lifecycle.Event.Companion companion = Lifecycle.Event.Companion;
        int iOrdinal = event.ordinal();
        if (iOrdinal == 1) {
            aqVar.f48105a = lVar.invoke(lifecycleStartStopEffectScope);
        } else {
            if (iOrdinal != 4) {
                return;
            }
            LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) aqVar.f48105a;
            if (lifecycleStopOrDisposeEffectResult != null) {
                lifecycleStopOrDisposeEffectResult.runStopOrDisposeEffect();
            }
            aqVar.f48105a = null;
        }
    }

    static final ab LifecycleStartEffectImpl$lambda$1(LifecycleOwner lifecycleOwner, LifecycleStartStopEffectScope lifecycleStartStopEffectScope, l lVar, int i2, Composer composer, int i3) {
        LifecycleStartEffectImpl(lifecycleOwner, lifecycleStartStopEffectScope, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final void LifecycleResumeEffect(final Object obj, LifecycleOwner lifecycleOwner, final l<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> lVar, Composer composer, final int i2, final int i3) {
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1220373486);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changedInstance(obj) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            int i6 = 16;
            if ((i3 & 2) == 0 && composerStartRestartGroup.changedInstance(lifecycleOwner)) {
                i6 = 32;
            }
            i4 |= i6;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            int i7 = i3 & 2;
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if (i7 != 0) {
                    i4 &= -113;
                }
            } else if (i7 != 0) {
                i4 &= -113;
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1220373486, i4, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:447)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj) | composerStartRestartGroup.changed(lifecycleOwner);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new LifecycleResumePauseEffectScope(lifecycleOwner.getLifecycle());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LifecycleResumeEffectImpl(lifecycleOwner, (LifecycleResumePauseEffectScope) objRememberedValue, lVar, composerStartRestartGroup, (i4 & DisplayStrings.DS_TAP_TO_VERIFY) | ((i4 >> 3) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda13
                @Override // h.g.a.p
                public final Object invoke(Object obj2, Object obj3) {
                    return LifecycleEffectKt.LifecycleResumeEffect$lambda$1(obj, lifecycleOwner2, lVar, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public static final void LifecycleStartEffect(final Object obj, LifecycleOwner lifecycleOwner, final l<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> lVar, Composer composer, final int i2, final int i3) {
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1408314671);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changedInstance(obj) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            int i6 = 16;
            if ((i3 & 2) == 0 && composerStartRestartGroup.changedInstance(lifecycleOwner)) {
                i6 = 32;
            }
            i4 |= i6;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            int i7 = i3 & 2;
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if (i7 != 0) {
                    i4 &= -113;
                }
            } else if (i7 != 0) {
                i4 &= -113;
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1408314671, i4, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:129)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj) | composerStartRestartGroup.changed(lifecycleOwner);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new LifecycleStartStopEffectScope(lifecycleOwner.getLifecycle());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LifecycleStartEffectImpl(lifecycleOwner, (LifecycleStartStopEffectScope) objRememberedValue, lVar, composerStartRestartGroup, (i4 & DisplayStrings.DS_TAP_TO_VERIFY) | ((i4 >> 3) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj2, Object obj3) {
                    return LifecycleEffectKt.LifecycleStartEffect$lambda$1(obj, lifecycleOwner2, lVar, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public static final void LifecycleResumeEffect(final Object obj, final Object obj2, LifecycleOwner lifecycleOwner, final l<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> lVar, Composer composer, final int i2, final int i3) {
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(752680142);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changedInstance(obj) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(obj2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            int i6 = 128;
            if ((i3 & 4) == 0 && composerStartRestartGroup.changedInstance(lifecycleOwner)) {
                i6 = 256;
            }
            i4 |= i6;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i4 & 1)) {
            int i7 = i3 & 4;
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if (i7 != 0) {
                    i4 &= -897;
                }
            } else if (i7 != 0) {
                i4 &= -897;
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(752680142, i4, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:506)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj) | composerStartRestartGroup.changed(obj2) | composerStartRestartGroup.changed(lifecycleOwner);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new LifecycleResumePauseEffectScope(lifecycleOwner.getLifecycle());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope = (LifecycleResumePauseEffectScope) objRememberedValue;
            LifecycleResumeEffectImpl(lifecycleOwner, lifecycleResumePauseEffectScope, lVar, composerStartRestartGroup, ((i4 >> 3) & DisplayStrings.DS_TAP_TO_VERIFY) | ((i4 >> 6) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda5
                @Override // h.g.a.p
                public final Object invoke(Object obj3, Object obj4) {
                    return LifecycleEffectKt.LifecycleResumeEffect$lambda$3(obj, obj2, lifecycleOwner2, lVar, i2, i3, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    public static final void LifecycleStartEffect(final Object obj, final Object obj2, LifecycleOwner lifecycleOwner, final l<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> lVar, Composer composer, final int i2, final int i3) {
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(696924721);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changedInstance(obj) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(obj2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            int i6 = 128;
            if ((i3 & 4) == 0 && composerStartRestartGroup.changedInstance(lifecycleOwner)) {
                i6 = 256;
            }
            i4 |= i6;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i4 & 1)) {
            int i7 = i3 & 4;
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if (i7 != 0) {
                    i4 &= -897;
                }
            } else if (i7 != 0) {
                i4 &= -897;
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(696924721, i4, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:187)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj) | composerStartRestartGroup.changed(obj2) | composerStartRestartGroup.changed(lifecycleOwner);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new LifecycleStartStopEffectScope(lifecycleOwner.getLifecycle());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LifecycleStartStopEffectScope lifecycleStartStopEffectScope = (LifecycleStartStopEffectScope) objRememberedValue;
            LifecycleStartEffectImpl(lifecycleOwner, lifecycleStartStopEffectScope, lVar, composerStartRestartGroup, ((i4 >> 3) & DisplayStrings.DS_TAP_TO_VERIFY) | ((i4 >> 6) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj3, Object obj4) {
                    return LifecycleEffectKt.LifecycleStartEffect$lambda$3(obj, obj2, lifecycleOwner2, lVar, i2, i3, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    public static final void LifecycleResumeEffect(final Object obj, final Object obj2, final Object obj3, LifecycleOwner lifecycleOwner, final l<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> lVar, Composer composer, final int i2, final int i3) {
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-485941842);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changedInstance(obj) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(obj2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(obj3) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            int i6 = 1024;
            if ((i3 & 8) == 0 && composerStartRestartGroup.changedInstance(lifecycleOwner)) {
                i6 = 2048;
            }
            i4 |= i6;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            int i7 = i3 & 8;
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if (i7 != 0) {
                    i4 &= -7169;
                }
            } else if (i7 != 0) {
                i4 &= -7169;
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-485941842, i4, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:570)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj) | composerStartRestartGroup.changed(obj2) | composerStartRestartGroup.changed(obj3) | composerStartRestartGroup.changed(lifecycleOwner);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new LifecycleResumePauseEffectScope(lifecycleOwner.getLifecycle());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope = (LifecycleResumePauseEffectScope) objRememberedValue;
            LifecycleResumeEffectImpl(lifecycleOwner, lifecycleResumePauseEffectScope, lVar, composerStartRestartGroup, ((i4 >> 6) & DisplayStrings.DS_TAP_TO_VERIFY) | ((i4 >> 9) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj4, Object obj5) {
                    return LifecycleEffectKt.LifecycleResumeEffect$lambda$5(obj, obj2, obj3, lifecycleOwner2, lVar, i2, i3, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    public static final void LifecycleStartEffect(final Object obj, final Object obj2, final Object obj3, LifecycleOwner lifecycleOwner, final l<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> lVar, Composer composer, final int i2, final int i3) {
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(574812561);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changedInstance(obj) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(obj2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(obj3) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            int i6 = 1024;
            if ((i3 & 8) == 0 && composerStartRestartGroup.changedInstance(lifecycleOwner)) {
                i6 = 2048;
            }
            i4 |= i6;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            int i7 = i3 & 8;
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if (i7 != 0) {
                    i4 &= -7169;
                }
            } else if (i7 != 0) {
                i4 &= -7169;
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(574812561, i4, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:250)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj) | composerStartRestartGroup.changed(obj2) | composerStartRestartGroup.changed(obj3) | composerStartRestartGroup.changed(lifecycleOwner);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new LifecycleStartStopEffectScope(lifecycleOwner.getLifecycle());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LifecycleStartStopEffectScope lifecycleStartStopEffectScope = (LifecycleStartStopEffectScope) objRememberedValue;
            LifecycleStartEffectImpl(lifecycleOwner, lifecycleStartStopEffectScope, lVar, composerStartRestartGroup, ((i4 >> 6) & DisplayStrings.DS_TAP_TO_VERIFY) | ((i4 >> 9) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda7
                @Override // h.g.a.p
                public final Object invoke(Object obj4, Object obj5) {
                    return LifecycleEffectKt.LifecycleStartEffect$lambda$5(obj, obj2, obj3, lifecycleOwner2, lVar, i2, i3, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    public static final void LifecycleResumeEffect(final LifecycleOwner lifecycleOwner, final l<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> lVar, Composer composer, final int i2, final int i3) {
        int i4 = i2 & 1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-747476210);
        if (composerStartRestartGroup.shouldExecute(1 == i4, i4)) {
            int i5 = i3 & 1;
            composerStartRestartGroup.startDefaults();
            if (i4 != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if (i5 != 0) {
                    i2 &= -15;
                }
            } else if (i5 != 0) {
                i2 &= -15;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-747476210, i2, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:656)");
            }
            throw new IllegalStateException(LifecycleResumeEffectNoParamError);
        }
        composerStartRestartGroup.skipToGroupEnd();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda6
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return LifecycleEffectKt.LifecycleResumeEffect$lambda$8(lifecycleOwner, lVar, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void LifecycleStartEffect(final LifecycleOwner lifecycleOwner, final l<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> lVar, Composer composer, final int i2, final int i3) {
        int i4 = i2 & 1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-50807951);
        if (composerStartRestartGroup.shouldExecute(1 == i4, i4)) {
            int i5 = i3 & 1;
            composerStartRestartGroup.startDefaults();
            if (i4 != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if (i5 != 0) {
                    i2 &= -15;
                }
            } else if (i5 != 0) {
                i2 &= -15;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-50807951, i2, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:333)");
            }
            throw new IllegalStateException(LifecycleStartEffectNoParamError);
        }
        composerStartRestartGroup.skipToGroupEnd();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda12
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return LifecycleEffectKt.LifecycleStartEffect$lambda$8(lifecycleOwner, lVar, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
