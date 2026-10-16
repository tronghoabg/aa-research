package com.waze.n;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.waze.stats.ax;
import com.waze.strings.DisplayStrings;
import com.waze.t.b.bl;
import com.waze.t.b.bn;
import com.waze.z.a.b.n;
import com.waze.z.a.be;
import e.a.cn;
import e.a.cp;
import e.a.cq;
import h.ab;
import h.g.b.x;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class aq {

    /* renamed from: a, reason: collision with root package name */
    private static volatile cq f30646a;

    private aq() {
    }

    public static ap c(e.a.i iVar) {
        return (ap) ap.newStub(new ao(0), iVar);
    }

    public static cq d() {
        cq cqVarA;
        cq cqVar = f30646a;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (aq.class) {
            cqVarA = f30646a;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46544a);
                cnVarA.b(cq.e("com.waze.clientevent.WazeAppUnauthenticatedEventService", "reportUnauthenticatedEvents"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(as.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(au.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f30646a = cqVarA;
            }
        }
        return cqVarA;
    }

    public static void e(Modifier modifier, com.waze.closure.c.i iVar, com.waze.reports_v2.presentation.a.at atVar, h.g.a.a aVar, h.g.a.l lVar, Composer composer, int i2) {
        Modifier modifier2;
        int i3;
        h.g.b.x.f(iVar, "stateHolder");
        h.g.b.x.f(aVar, "onClose");
        h.g.b.x.f(lVar, "onLaterReport");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-302089797);
        if (i4 == 0) {
            modifier2 = modifier;
            i3 = (true != composerStartRestartGroup.changed(modifier2) ? 2 : 4) | i2;
        } else {
            modifier2 = modifier;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(iVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(atVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-302089797, i3, -1, "com.waze.closure.ui.ClosureScreen (ClosureScreen.kt:15)");
            }
            com.waze.closure.c.a aVar2 = (com.waze.closure.c.a) FlowExtKt.collectAsStateWithLifecycle(iVar.c(), (LifecycleOwner) null, (Lifecycle.State) null, (h.c.j) null, composerStartRestartGroup, 0, 7).getValue();
            com.waze.closure.c.a aVar3 = com.waze.closure.c.a.f22452a;
            int iOrdinal = aVar2.ordinal();
            if (iOrdinal == 0) {
                composerStartRestartGroup.startReplaceGroup(1749493215);
                composerStartRestartGroup.endReplaceGroup();
            } else if (iOrdinal == 1) {
                int i5 = i3 >> 3;
                int i6 = i5 & DisplayStrings.DS_TAP_TO_VERIFY;
                composerStartRestartGroup.startReplaceGroup(1749497115);
                ac.n(modifier2, atVar, aVar, lVar, composerStartRestartGroup, (i5 & 112) | (i3 & 14) | i6 | (i5 & 7168));
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (iOrdinal != 2) {
                    composerStartRestartGroup.startReplaceGroup(1749491200);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new h.i();
                }
                int i7 = i3 >> 3;
                int i8 = i7 & DisplayStrings.DS_TAP_TO_VERIFY;
                composerStartRestartGroup.startReplaceGroup(1749501209);
                com.waze.closure.d.e.b(iVar, aVar, aVar, lVar, composerStartRestartGroup, (i7 & 7168) | ((i3 >> 6) & 112) | (i7 & 14) | i8);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.z.a.a.b(modifier, iVar, atVar, aVar, lVar, i2, 1));
        }
    }

    public static bn f(org.a.d.k.b bVar, bl blVar) {
        h.g.b.x.f(bVar, "<this>");
        h.g.b.x.f(blVar, "serviceName");
        int i2 = h.g.b.ar.f48106a;
        return new bn(blVar, new com.waze.copilot.a.z((ax) bVar.a(new h.g.b.m(ax.class), null, null)));
    }

    public static void g(final com.waze.q.j jVar, final h.g.a.a aVar, final h.g.a.l lVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(jVar, "state");
        h.g.b.x.f(aVar, "onAccept");
        h.g.b.x.f(lVar, "onLinkClicked");
        h.g.b.x.f(aVar2, "onBack");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1543888799);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(jVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i5 = 16;
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1543888799, i3, -1, "com.waze.consent_bump.ConsentBumpScreen (ConsentBumpScreen.kt:39)");
            }
            int i6 = i3 & 7168;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i6 == 2048 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.asks.ad(aVar2, i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.BackHandler(false, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 0, 1);
            com.waze.car_lib.r.cq.k(false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(837487901, true, new h.g.a.p() { // from class: com.waze.q.f
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i7 = 1;
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(837487901, iIntValue, -1, "com.waze.consent_bump.ConsentBumpScreen.<anonymous> (ConsentBumpScreen.kt:42)");
                        }
                        Modifier modifierWindowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), com.waze.bz.a.d(composer2, 0).h(), null, 2, null), WindowInsetsKt.union(WindowInsetsKt.union(WindowInsets_androidKt.getSystemBars(WindowInsets.Companion, composer2, 6), WindowInsets_androidKt.getDisplayCutout(WindowInsets.Companion, composer2, 6)), WindowInsetsKt.m2849WindowInsetsa9UjIt4$default(0.0f, 24.0f, 0.0f, 16.0f, 5, null)));
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                        int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierWindowInsetsPadding);
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
                        j jVar2 = jVar;
                        Updater.m7351setimpl(composer2, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m7351setimpl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Updater.m7351setimpl(composer2, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                        Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                        Updater.m7351setimpl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        int iM8282toArgb8_81llA = ColorKt.m8282toArgb8_81llA(com.waze.bz.a.d(composer2, 0).o()) & ViewCompat.MEASURED_SIZE_MASK;
                        h.m.k.y(16);
                        String string = Integer.toString(iM8282toArgb8_81llA, 16);
                        x.e(string, "toString(...)");
                        String strValueOf = String.valueOf(o.w(string, 6, '0'));
                        boolean zChanged = composer2.changed(jVar2.b());
                        String strConcat = "#".concat(strValueOf);
                        boolean zChanged2 = zChanged | composer2.changed(strConcat);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                            objRememberedValue2 = o.ac(o.ac(jVar2.b(), "#4C4C4C", strConcat), "#717171", strConcat);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        h.g.a.l lVar2 = lVar;
                        String str = (String) objRememberedValue2;
                        long jH = com.waze.bz.a.d(composer2, 0).h();
                        Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(ColumnScope.CC.weight$default(columnScopeInstance, Modifier.Companion, 1.0f, false, 2, null), 0.0f, 0.0f, 0.0f, 16.0f, 7, null);
                        boolean zChanged3 = composer2.changed(lVar2);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                            objRememberedValue3 = new com.waze.c.e.a.a(lVar2, 15);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        h.g.a.l lVar3 = (h.g.a.l) objRememberedValue3;
                        boolean zChanged4 = composer2.changed(str) | composer2.changed(jH);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                            objRememberedValue4 = new com.waze.stats.storage.d(str, jH, i7);
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        h.g.a.a aVar3 = aVar;
                        AndroidView_androidKt.AndroidView(lVar3, modifierM2759paddingqDBjuR0$default, (h.g.a.l) objRememberedValue4, composer2, 0, 0);
                        be.o(aVar3, PaddingKt.m2757paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 16.0f, 0.0f, 2, null), jVar2.a(), null, n.e(null, com.waze.design_components.button.f.f23355c, null, 5), null, false, false, composer2, 48, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_2W_4);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return ab.f48028a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 196608);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.closure.d.b(jVar, aVar, lVar, aVar2, i2, 3));
        }
    }

    public com.waze.car_lib.r.cq h() {
        throw null;
    }

    public /* synthetic */ aq(byte[] bArr, byte[] bArr2) {
    }
}
