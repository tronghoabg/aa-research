package com.waze.main_screen.a.b;

import android.content.res.Configuration;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.waze.ab.z;
import com.waze.c.e.t;
import com.waze.main_screen.bottom_bars.scrollable_eta.q;
import com.waze.search.h.bx;
import h.ab;
import h.g.a.p;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h {
    public static /* synthetic */ ab a(com.waze.main_screen.a.b.a.g gVar, RowScope rowScope, Composer composer, int i2) {
        x.f(rowScope, "$this$SearchEmptyStateScreen");
        int i3 = 16;
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(248707546, i2, -1, "com.waze.main_screen.aap.pre_drive.AapPreDriveScreen.<anonymous>.<anonymous> (AapPreDriveScreen.kt:55)");
            }
            com.waze.ui.j.j jVarC = gVar.c();
            boolean zChanged = composer.changed(gVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.beacons.a.a(gVar, i3);
                composer.updateRememberedValue(objRememberedValue);
            }
            e(jVarC, (h.g.a.a) objRememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static final void b(com.waze.main_screen.a.b.a.g gVar, h.g.a.a aVar, Composer composer, int i2) {
        int i3;
        Modifier.Companion companionPadding;
        x.f(gVar, "aapPreDriveScreenViewModel");
        x.f(aVar, "onNavigationStarted");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-926694847);
        if (i4 == 0) {
            i3 = i2 | (true != composerStartRestartGroup.changed(gVar) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-926694847, i3, -1, "com.waze.main_screen.aap.pre_drive.AapPreDriveScreen (AapPreDriveScreen.kt:31)");
            }
            Modifier modifierM1972backgroundbw27NRU$default = BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), com.waze.bz.a.d(composerStartRestartGroup, 0).h(), null, 2, null);
            if (((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 2) {
                composerStartRestartGroup.startReplaceGroup(-1495509047);
                companionPadding = PaddingKt.padding(Modifier.Companion, com.waze.main_screen.x.b(composerStartRestartGroup));
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1495507607);
                composerStartRestartGroup.endReplaceGroup();
                companionPadding = Modifier.Companion;
            }
            Modifier modifierThen = modifierM1972backgroundbw27NRU$default.then(companionPadding);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(aVar, composerStartRestartGroup, (i3 >> 3) & 14);
            int i5 = i3 & 14;
            boolean zChangedInstance = (i5 == 4) | composerStartRestartGroup.changedInstance(lifecycleOwner) | composerStartRestartGroup.changed(stateRememberUpdatedState);
            f fVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || fVarRememberedValue == Composer.Companion.getEmpty()) {
                fVarRememberedValue = new f(gVar, lifecycleOwner, stateRememberUpdatedState, null);
                composerStartRestartGroup.updateRememberedValue(fVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(gVar, lifecycleOwner, (p) fVarRememberedValue, composerStartRestartGroup, i5);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            com.waze.main_screen.aa.c.b(Color.m8218boximpl(com.waze.bz.a.d(composerStartRestartGroup, 0).h()), composerStartRestartGroup, 0);
            bx bxVarB = gVar.b();
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new z(10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            com.waze.search.f.x.b(bxVarB, modifierThen, (h.g.a.a) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(248707546, true, new com.waze.ads.c.a(gVar, 17), composerStartRestartGroup, 54), composerStartRestartGroup, 24960, 8);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new t(gVar, aVar, i2, 17, null));
        }
    }

    static final ab c(com.waze.ui.j.j jVar, h.g.a.a aVar, int i2, Composer composer) {
        e(jVar, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static q d() {
        org.a.d.k.b bVarC;
        m mVar;
        org.a.d.a.a aVar = q.f26004a;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = ar.f48106a;
            mVar = new m(q.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new m(q.class);
        }
        return (q) bVarC.a(mVar, null, null);
    }

    private static final void e(com.waze.ui.j.j jVar, h.g.a.a aVar, Composer composer, int i2) {
        int i3;
        com.waze.ui.j.j jVar2;
        h.g.a.a aVar2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1833349078);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(jVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        int i5 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1833349078, i3, -1, "com.waze.main_screen.aap.pre_drive.HamburgerButton (AapPreDriveScreen.kt:68)");
            }
            jVar2 = jVar;
            aVar2 = aVar;
            com.waze.ui.j.h.b(null, jVar2, aVar2, composerStartRestartGroup, (i3 << 3) & 1008, 1);
            int i6 = i3 & 14;
            ab abVar = ab.f48028a;
            g gVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i6 == 4 || gVarRememberedValue == Composer.Companion.getEmpty()) {
                gVarRememberedValue = new g(jVar2, null);
                composerStartRestartGroup.updateRememberedValue(gVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(abVar, (p<? super af, ? super h.c.e<? super ab>, ? extends Object>) gVarRememberedValue, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            jVar2 = jVar;
            aVar2 = aVar;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a(jVar2, aVar2, i2, i5));
        }
    }
}
