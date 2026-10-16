package com.waze.search.e;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import com.waze.navigate.location_preview.ay;
import com.waze.navigate.location_preview.bo;
import com.waze.search.v2.fq;
import com.waze.search.v2.fr;
import com.waze.search.v2.ft;
import com.waze.settings.ai;
import com.waze.strings.DisplayStrings;
import com.waze.z.a.be;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g {
    static final h.ab a(p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1399611564, i2, -1, "com.waze.search.model.SearchDestinationCell.<anonymous> (SearchDestinationCell.kt:52)");
            }
            i(pVar.l(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    static final h.ab b(p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1807631061, i2, -1, "com.waze.search.model.SearchDestinationCell.<anonymous> (SearchDestinationCell.kt:58)");
            }
            j(pVar.k(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final com.waze.search.e.p r54, boolean r55, androidx.compose.ui.Modifier r56, androidx.compose.foundation.layout.PaddingValues r57, h.g.a.a r58, h.g.a.a r59, androidx.compose.runtime.Composer r60, int r61, int r62) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.e.g.c(com.waze.search.e.p, boolean, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.PaddingValues, h.g.a.a, h.g.a.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void d(String str, String str2) {
        h.g.b.x.f(str, "venueId");
        h.g.b.x.f(str2, "venueContext");
        com.waze.ads.c.e.g("ADS_HISTORY_LIST_INFO", 0, true, "", str, str2);
        com.waze.ads.c.e.f("ADS_POPUP_NAVIGATE");
    }

    static final h.ab e(ai aiVar, int i2, Composer composer) {
        i(aiVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab f(com.waze.settings.v vVar, int i2, Composer composer) {
        j(vVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static /* synthetic */ ay g(ft ftVar, com.waze.av.d.k kVar, com.waze.av.d.k kVar2, bo boVar, int i2, String str, boolean z, com.waze.ads.a.f fVar, String str2, boolean z2, int i3) {
        if ((i3 & 2) != 0) {
            kVar2 = null;
        }
        if ((i3 & 4) != 0) {
            boVar = null;
        }
        if ((i3 & 8) != 0) {
            i2 = 7;
        }
        if ((i3 & 16) != 0) {
            str = null;
        }
        boolean z3 = z | (!((i3 & 32) == 0));
        if ((i3 & 64) != 0) {
            fVar = null;
        }
        if ((i3 & 128) != 0) {
            str2 = null;
        }
        return ftVar.b(kVar, kVar2, boVar, i2, str, z3, fVar, str2, z2 & ((i3 & 256) == 0));
    }

    public static final fr h(boolean z, Context context, boolean z2, ScrollState scrollState, h.g.a.p pVar, h.g.a.q qVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(scrollState, "scrollState");
        h.g.b.x.f(pVar, "onDraggingOffsetChanged");
        h.g.b.x.f(qVar, "content");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1645678036, true, new fq(z2, scrollState, qVar, 2)));
        return new fr(z, context, composeView, new com.waze.main_screen.c.c.b(pVar, z, 5));
    }

    private static final void i(ai aiVar, Composer composer, int i2) {
        int i3;
        Color colorM8218boximpl;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-148322781);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(aiVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-148322781, i3, -1, "com.waze.search.model.LeadingSection (SearchDestinationCell.kt:80)");
            }
            if (aiVar instanceof t) {
                composerStartRestartGroup.startReplaceGroup(837534931);
                t tVar = (t) aiVar;
                com.waze.ui.ac.i iVarB = tVar.b();
                Modifier modifierM2808height3ABfNKs = SizeKt.m2808height3ABfNKs(SizeKt.m2827width3ABfNKs(Modifier.Companion, tVar.a().b()), tVar.a().a());
                if (tVar.a() != r.f35647a) {
                    composerStartRestartGroup.startReplaceGroup(837752922);
                    composerStartRestartGroup.endReplaceGroup();
                    colorM8218boximpl = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-804258511);
                    long jO = com.waze.bz.a.d(composerStartRestartGroup, 0).o();
                    composerStartRestartGroup.endReplaceGroup();
                    colorM8218boximpl = Color.m8218boximpl(jO);
                }
                com.waze.search.d.a.b.a(iVarB, modifierM2808height3ABfNKs, SizeKt.m2808height3ABfNKs(SizeKt.m2827width3ABfNKs(Modifier.Companion, r0.b()), r0.a()), colorM8218boximpl, Color.m8218boximpl(com.waze.bz.a.d(composerStartRestartGroup, 0).o()), composerStartRestartGroup, 384, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (aiVar instanceof s) {
                composerStartRestartGroup.startReplaceGroup(838130596);
                Alignment center = Alignment.Companion.getCenter();
                Modifier modifierM1971backgroundbw27NRU = BackgroundKt.m1971backgroundbw27NRU(SizeKt.m2822size3ABfNKs(Modifier.Companion, 40.0f), com.waze.bz.a.d(composerStartRestartGroup, 0).G(), RoundedCornerShapeKt.getCircleShape());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1971backgroundbw27NRU);
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
                Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                com.waze.search.d.a.b.a(((s) aiVar).a(), SizeKt.m2822size3ABfNKs(Modifier.Companion, 20.0f), null, Color.m8218boximpl(com.waze.bz.a.d(composerStartRestartGroup, 0).D()), Color.m8218boximpl(com.waze.bz.a.d(composerStartRestartGroup, 0).D()), composerStartRestartGroup, 48, 4);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(838544973);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new e(aiVar, i2, 0));
        }
    }

    private static final void j(com.waze.settings.v vVar, Composer composer, int i2) {
        int i3;
        com.waze.settings.v vVar2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-636085597);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(vVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-636085597, i3, -1, "com.waze.search.model.TrailingText (SearchDestinationCell.kt:117)");
            }
            Modifier modifierWrapContentWidth$default = SizeKt.wrapContentWidth$default(Modifier.Companion, null, false, 3, null);
            int i5 = b.f35617a;
            vVar2 = vVar;
            be.y(vVar2, modifierWrapContentWidth$default, null, b.a(), composerStartRestartGroup, (i3 & 14) | DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_DELETE_RECENT_DESTINATION_MESSAGE, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            vVar2 = vVar;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e(vVar2, i2, 1));
        }
    }
}
