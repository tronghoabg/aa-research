package com.waze.main_screen.ab.a;

import android.os.Bundle;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.fragment.compose.AndroidFragmentKt;
import androidx.fragment.compose.FragmentStateKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import com.waze.NativeManager;
import com.waze.iu;
import com.waze.kj;
import com.waze.sdk.ae;
import com.waze.z.a.be;
import h.ab;
import h.g.b.x;
import java.util.LinkedHashSet;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f {
    public static final void a(final m mVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        x.f(mVar, "popupsStateHolder");
        x.f(modifier, "modifier");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-44071660);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(mVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i5 = 16;
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-44071660, i3, -1, "com.waze.main_screen.top_popups.presentation.TakeoversPopups (PopupsFragmentCompose.kt:35)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(mVar.f(), null, composerStartRestartGroup, 0, 1);
            boolean zBooleanValue = ((Boolean) stateCollectAsState.getValue()).booleanValue();
            int i6 = i3 & 14;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i6 == 4 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.car_lib.b.m(mVar, 13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.BackHandler(zBooleanValue, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 0, 0);
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Integer.valueOf(h.h.a.b(be.H(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getNavigationBars(WindowInsets.Companion, composerStartRestartGroup, 6), composerStartRestartGroup, 0).mo2704calculateBottomPaddingD9Ej5fM(), composerStartRestartGroup, 0))), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(596829562);
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, false, 3, null);
            boolean zChanged = composerStartRestartGroup.changed(stateCollectAsState);
            boolean z = i6 == 4;
            boolean z2 = zChanged | z;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.car_lib.e.d(mVar, stateCollectAsState, 10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierA = com.waze.main_screen.ac.b.a(modifierWrapContentHeight$default, (h.g.a.a) objRememberedValue2);
            if (((Boolean) stateCollectAsState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(1379837059);
                composerStartRestartGroup.endReplaceGroup();
                com.waze.ui.r.a.d.d.a(modifierA, com.waze.ui.r.a.d.c.db, null);
            } else {
                composerStartRestartGroup.startReplaceGroup(1379909878);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new com.waze.main_screen.s.a(i5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                SemanticsModifierKt.clearAndSetSemantics(modifierA, (h.g.a.l) objRememberedValue3);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endReplaceGroup();
            boolean zChanged2 = composerStartRestartGroup.changed(stateRememberUpdatedState) | z;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new h.g.a.l() { // from class: com.waze.main_screen.ab.a.a
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        kj kjVar = (kj) obj;
                        x.f(kjVar, "fragment");
                        m mVar2 = mVar;
                        kjVar.v(new ae(kjVar.getContext(), new e(kjVar, mVar2)));
                        kjVar.I(new e(mVar2, kjVar));
                        kjVar.q();
                        kjVar.x(false);
                        kotlinx.coroutines.b.k kVarK = ai.K(ai.y(SnapshotStateKt.snapshotFlow(new com.waze.car_lib.b.m(stateRememberUpdatedState, 12))), new b(kjVar, null));
                        Lifecycle lifecycle = kjVar.getLifecycle();
                        x.e(lifecycle, "<get-lifecycle>(...)");
                        ai.m(kVarK, LifecycleKt.getCoroutineScope(lifecycle));
                        kotlinx.coroutines.b.k kVarK2 = ai.K(mVar2.e(), new c(kjVar, mVar2, null));
                        Lifecycle lifecycle2 = kjVar.getLifecycle();
                        x.e(lifecycle2, "<get-lifecycle>(...)");
                        ai.m(kVarK2, LifecycleKt.getCoroutineScope(lifecycle2));
                        kotlinx.coroutines.b.k kVarK3 = ai.K(mVar2.g(), new d(new LinkedHashSet(), kjVar, mVar2, null));
                        Lifecycle lifecycle3 = kjVar.getLifecycle();
                        x.e(lifecycle3, "<get-lifecycle>(...)");
                        ai.m(kVarK3, LifecycleKt.getCoroutineScope(lifecycle3));
                        return ab.f48028a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.startReplaceableGroup(1765406104);
            AndroidFragmentKt.AndroidFragment(kj.class, modifierA, FragmentStateKt.rememberFragmentState(composerStartRestartGroup, 0), Bundle.EMPTY, (h.g.a.l) objRememberedValue4, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.t.c.g(mVar, modifier, i2, 6, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(kj kjVar, int i2, int i3, int i4) {
        NativeManager nativeManager = NativeManager.getInstance();
        if (kjVar.e() >= 0) {
            kjVar.o(1, kjVar.e(), i4, i3);
            kjVar.F();
        }
        x.c(nativeManager);
        iu.CloseAllPopups$default(nativeManager, i2, null, 2, null);
        kjVar.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(kj kjVar, int i2) {
        f(kjVar, i2, 2, kjVar.f());
    }
}
