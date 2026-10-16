package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.activity.FullyDrawnReporterOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ReportDrawnKt {
    public static /* synthetic */ boolean $r8$lambda$XEPgOM60FcttXLEQnmibtGAxavE() {
        return true;
    }

    public static final void ReportDrawn(Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1357012904);
        if (composerStartRestartGroup.shouldExecute(i2 != 0, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1357012904, i2, -1, "androidx.activity.compose.ReportDrawn (ReportDrawn.kt:135)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: androidx.activity.compose.ReportDrawnKt$$ExternalSyntheticLambda3
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return true;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ReportDrawnWhen((a) objRememberedValue, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.activity.compose.ReportDrawnKt$$ExternalSyntheticLambda4
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ReportDrawnKt.ReportDrawn$lambda$1(i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean ReportDrawn$lambda$0$0() {
        return true;
    }

    static final ab ReportDrawn$lambda$1(int i2, Composer composer, int i3) {
        ReportDrawn(composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final void ReportDrawnAfter(final l<? super e<? super ab>, ? extends Object> lVar, Composer composer, final int i2) {
        int i3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        p<? super Composer, ? super Integer, ab> pVar;
        FullyDrawnReporter fullyDrawnReporter;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(945311272);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(lVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(945311272, i3, -1, "androidx.activity.compose.ReportDrawnAfter (ReportDrawn.kt:148)");
            }
            FullyDrawnReporterOwner current = LocalFullyDrawnReporterOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null || (fullyDrawnReporter = current.getFullyDrawnReporter()) == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    pVar = new p() { // from class: androidx.activity.compose.ReportDrawnKt$$ExternalSyntheticLambda5
                        @Override // h.g.a.p
                        public final Object invoke(Object obj, Object obj2) {
                            return ReportDrawnKt.ReportDrawnAfter$lambda$0(lVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                    scopeUpdateScopeEndRestartGroup.updateScope(pVar);
                }
                return;
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(fullyDrawnReporter) | composerStartRestartGroup.changedInstance(lVar);
            ReportDrawnKt$ReportDrawnAfter$1$1 reportDrawnKt$ReportDrawnAfter$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || reportDrawnKt$ReportDrawnAfter$1$1RememberedValue == Composer.Companion.getEmpty()) {
                reportDrawnKt$ReportDrawnAfter$1$1RememberedValue = new ReportDrawnKt$ReportDrawnAfter$1$1(fullyDrawnReporter, lVar, null);
                composerStartRestartGroup.updateRememberedValue(reportDrawnKt$ReportDrawnAfter$1$1RememberedValue);
            }
            EffectsKt.LaunchedEffect(lVar, fullyDrawnReporter, (p) reportDrawnKt$ReportDrawnAfter$1$1RememberedValue, composerStartRestartGroup, i3 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            pVar = new p() { // from class: androidx.activity.compose.ReportDrawnKt$$ExternalSyntheticLambda6
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ReportDrawnKt.ReportDrawnAfter$lambda$2(lVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(pVar);
        }
    }

    static final ab ReportDrawnAfter$lambda$0(l lVar, int i2, Composer composer, int i3) {
        ReportDrawnAfter(lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab ReportDrawnAfter$lambda$2(l lVar, int i2, Composer composer, int i3) {
        ReportDrawnAfter(lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final void ReportDrawnWhen(final a<Boolean> aVar, Composer composer, final int i2) {
        int i3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        p<? super Composer, ? super Integer, ab> pVar;
        final FullyDrawnReporter fullyDrawnReporter;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2047119994);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2047119994, i3, -1, "androidx.activity.compose.ReportDrawnWhen (ReportDrawn.kt:116)");
            }
            FullyDrawnReporterOwner current = LocalFullyDrawnReporterOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null || (fullyDrawnReporter = current.getFullyDrawnReporter()) == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    pVar = new p() { // from class: androidx.activity.compose.ReportDrawnKt$$ExternalSyntheticLambda0
                        @Override // h.g.a.p
                        public final Object invoke(Object obj, Object obj2) {
                            return ReportDrawnKt.ReportDrawnWhen$lambda$0(aVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                    scopeUpdateScopeEndRestartGroup.updateScope(pVar);
                }
                return;
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(fullyDrawnReporter) | ((i3 & 14) == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.activity.compose.ReportDrawnKt$$ExternalSyntheticLambda1
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return ReportDrawnKt.ReportDrawnWhen$lambda$1$0(fullyDrawnReporter, aVar, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(fullyDrawnReporter, aVar, (l) objRememberedValue, composerStartRestartGroup, (i3 << 3) & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            pVar = new p() { // from class: androidx.activity.compose.ReportDrawnKt$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ReportDrawnKt.ReportDrawnWhen$lambda$2(aVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(pVar);
        }
    }

    static final ab ReportDrawnWhen$lambda$0(a aVar, int i2, Composer composer, int i3) {
        ReportDrawnWhen(aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult ReportDrawnWhen$lambda$1$0(FullyDrawnReporter fullyDrawnReporter, a aVar, DisposableEffectScope disposableEffectScope) {
        if (fullyDrawnReporter.isFullyDrawnReported()) {
            return new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$lambda$1$0$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                }
            };
        }
        final ReportDrawnComposition reportDrawnComposition = new ReportDrawnComposition(fullyDrawnReporter, aVar);
        return new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$lambda$1$0$$inlined$onDispose$2
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                reportDrawnComposition.removeReporter();
            }
        };
    }

    static final ab ReportDrawnWhen$lambda$2(a aVar, int i2, Composer composer, int i3) {
        ReportDrawnWhen(aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }
}
