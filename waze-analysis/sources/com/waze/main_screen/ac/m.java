package com.waze.main_screen.ac;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import h.ab;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f25686a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final l f25687b = new l();

    /* renamed from: c, reason: collision with root package name */
    private static final ProvidableCompositionLocal f25688c = CompositionLocalKt.compositionLocalOf$default(null, new k(0), 1, null);

    public static final ProvidableCompositionLocal a() {
        return f25688c;
    }

    static final i b() {
        return f25687b;
    }

    public static final void c(final Modifier modifier, final p pVar, Composer composer, int i2, int i3) {
        int i4;
        x.f(pVar, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1877809557);
        if (i3 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (i3 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1877809557, i4, -1, "com.waze.main_screen.touch.TouchEventsBroadcasterLayout (TouchEventsBroadcasterLayout.kt:27)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new h();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final h hVar = (h) objRememberedValue;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>) f25688c.provides(hVar), ComposableLambdaKt.rememberComposableLambda(728082859, true, new p() { // from class: com.waze.main_screen.ac.j
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i5 = iIntValue & 3;
                    int i6 = iIntValue & 1;
                    int i7 = m.f25686a;
                    if (composer2.shouldExecute(i5 != 2, i6)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(728082859, iIntValue, -1, "com.waze.main_screen.touch.TouchEventsBroadcasterLayout.<anonymous> (TouchEventsBroadcasterLayout.kt:30)");
                        }
                        Modifier modifierThen = modifier.then(new f(hVar));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierThen);
                        h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        p pVar2 = pVar;
                        Updater.m7351setimpl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m7351setimpl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Updater.m7351setimpl(composer2, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                        Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                        Updater.m7351setimpl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        pVar2.invoke(composer2, 0);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return ab.f48028a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.z.a.f.d(modifier2, pVar, i2, i3, 2));
        }
    }
}
