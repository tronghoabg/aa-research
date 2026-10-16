package com.waze.ui;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.SnackbarData;
import androidx.compose.material.SnackbarKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.waze.R;
import com.waze.strings.DisplayStrings;
import com.waze.trip_overview.cl;
import com.waze.ui.af.ap;
import com.waze.ui.f.aj;
import com.waze.ui.f.al;
import com.waze.ui.f.am;
import com.waze.ui.w.b.bj;
import com.waze.z.a.be;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f42316a;

    public /* synthetic */ g(int i2) {
        this.f42316a = i2;
    }

    @Override // h.g.a.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strB;
        String strB2;
        String strB3;
        switch (this.f42316a) {
            case 0:
                return h.c((Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                com.waze.ui.f.ag agVar = (com.waze.ui.f.ag) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                h.g.b.x.f(agVar, "it");
                composer.startReplaceGroup(-78356890);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-78356890, iIntValue, -1, "com.waze.ui.reports.agent.reportAgentUiProviders.<anonymous> (ReportAgentComposable.kt:135)");
                }
                al alVarH = com.waze.tide.s.h(agVar, composer, iIntValue & 14);
                com.waze.ui.f.z zVarA = agVar.a();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-456388227, 0, -1, "com.waze.ui.reports.agent.toWazeString (ReportAgentComposable.kt:160)");
                }
                if (h.g.b.x.n(zVarA, com.waze.ui.f.w.f42314a)) {
                    composer.startReplaceGroup(-502417838);
                    strB = com.waze.ui.r.a.c.c.b(R.string.REPORTING_AGENT_LOST_AUDIO_FOCUS, composer, 0);
                    composer.endReplaceGroup();
                } else if (h.g.b.x.n(zVarA, com.waze.ui.f.y.f42315a)) {
                    composer.startReplaceGroup(-502414372);
                    strB = com.waze.ui.r.a.c.c.b(R.string.CONVERSATIONAL_REPORTING_START_OVER_BUTTON, composer, 0);
                    composer.endReplaceGroup();
                } else {
                    if (!(zVarA instanceof com.waze.ui.f.x)) {
                        composer.startReplaceGroup(-502419801);
                        composer.endReplaceGroup();
                        throw new h.i();
                    }
                    composer.startReplaceGroup(1605135841);
                    composer.endReplaceGroup();
                    strB = "";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                al alVarC = al.c(alVarH, strB);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return alVarC;
            case 2:
                com.waze.ui.f.ad adVar = (com.waze.ui.f.ad) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                h.g.b.x.f(adVar, "it");
                composer2.startReplaceGroup(1002061780);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1002061780, iIntValue2, -1, "com.waze.ui.reports.agent.reportAgentUiProviders.<anonymous> (ReportAgentComposable.kt:117)");
                }
                al alVarC2 = al.c(com.waze.tide.s.e(adVar, composer2, iIntValue2 & 14), com.waze.ui.r.a.c.c.b(R.string.CONVERSATIONAL_REPORTING_IDLE_GENERIC_BUTTON, composer2, 0));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                return alVarC2;
            case 3:
                com.waze.ui.f.ae aeVar = (com.waze.ui.f.ae) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                h.g.b.x.f(aeVar, "it");
                composer3.startReplaceGroup(-589181474);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-589181474, iIntValue3, -1, "com.waze.ui.reports.agent.reportAgentUiProviders.<anonymous> (ReportAgentComposable.kt:121)");
                }
                am amVarD = am.d(com.waze.tide.s.f(aeVar, composer3, iIntValue3 & 14), com.waze.ui.r.a.c.c.b(R.string.CONVERSATIONAL_REPORTING_LISTENING_BUTTON, composer3, 0));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer3.endReplaceGroup();
                return amVarD;
            case 4:
                com.waze.ui.f.ah ahVar = (com.waze.ui.f.ah) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                h.g.b.x.f(ahVar, "it");
                composer4.startReplaceGroup(50092267);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(50092267, iIntValue4, -1, "com.waze.ui.reports.agent.reportAgentUiProviders.<anonymous> (ReportAgentComposable.kt:125)");
                }
                am amVarD2 = am.d(com.waze.tide.s.i(ahVar, composer4, iIntValue4 & 14), com.waze.ui.r.a.c.c.b(R.string.CONVERSATIONAL_REPORTING_PROCESSING_BUTTON, composer4, 0));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer4.endReplaceGroup();
                return amVarD2;
            case 5:
                com.waze.ui.f.ai aiVar = (com.waze.ui.f.ai) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                h.g.b.x.f(aiVar, "it");
                composer5.startReplaceGroup(-5605241);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-5605241, iIntValue5, -1, "com.waze.ui.reports.agent.reportAgentUiProviders.<anonymous> (ReportAgentComposable.kt:129)");
                }
                am amVarD3 = am.d(com.waze.tide.s.k(aiVar, composer5, iIntValue5 & 14), com.waze.ui.r.a.c.c.b(R.string.CONVERSATIONAL_REPORTING_SPEAKING_BUTTON, composer5, 0));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer5.endReplaceGroup();
                return amVarD3;
            case 6:
                aj ajVar = (aj) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                h.g.b.x.f(ajVar, "it");
                composer6.startReplaceGroup(295829441);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(295829441, iIntValue6, -1, "com.waze.ui.reports.agent.reportAgentUiProviders.<anonymous> (ReportAgentComposable.kt:133)");
                }
                am amVarL = com.waze.tide.s.l(ajVar, composer6, iIntValue6 & 14);
                bj bjVar = (bj) ajVar.a();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-286381797, 0, -1, "com.waze.ui.reports.agent.successfullyReported (ReportAgentComposable.kt:170)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2024721296, 0, -1, "com.waze.ui.reports.agent.toWazeString (ReportAgentComposable.kt:177)");
                }
                bj bjVar2 = bjVar;
                boolean zChanged = composer6.changed(bjVar2.ordinal());
                Object objRememberedValue = composer6.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new cl(bjVar, 18);
                    composer6.updateRememberedValue(objRememberedValue);
                }
                h.g.a.l lVar = (h.g.a.l) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(192461427, 0, -1, "com.waze.ui.reports.agent.toWazeString (ReportAgentComposable.kt:182)");
                }
                Integer num = (Integer) lVar.invoke(bjVar2);
                if (num == null) {
                    composer6.startReplaceGroup(-162873852);
                    composer6.endReplaceGroup();
                    strB2 = null;
                } else {
                    composer6.startReplaceGroup(-162873851);
                    strB2 = com.waze.ui.r.a.c.c.b(num.intValue(), composer6, 0);
                    composer6.endReplaceGroup();
                }
                if (strB2 == null) {
                    strB2 = bjVar2.name();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                String strD = com.waze.ui.r.a.c.c.d(R.string.REPORTING_AGENT_SUCCESSFUL_REPORT_PS, new Object[]{strB2}, composer6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                am amVarD4 = am.d(amVarL, strD);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer6.endReplaceGroup();
                return amVarD4;
            case 7:
                com.waze.ui.f.ab abVar = (com.waze.ui.f.ab) obj;
                Composer composer7 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                h.g.b.x.f(abVar, "it");
                composer7.startReplaceGroup(-1824493301);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1824493301, iIntValue7, -1, "com.waze.ui.reports.agent.reportAgentUiProviders.<anonymous> (ReportAgentComposable.kt:136)");
                }
                al alVarD = com.waze.tide.s.d(abVar, composer7, iIntValue7 & 14);
                com.waze.ui.f.r rVarA = abVar.a();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(140743255, 0, -1, "com.waze.ui.reports.agent.toWazeString (ReportAgentComposable.kt:142)");
                }
                if ((rVarA instanceof com.waze.ui.f.l) || h.g.b.x.n(rVarA, com.waze.ui.f.p.f42309a) || h.g.b.x.n(rVarA, com.waze.ui.f.j.f42304a) || h.g.b.x.n(rVarA, com.waze.ui.f.o.f42308a) || h.g.b.x.n(rVarA, com.waze.ui.f.n.f42307a) || h.g.b.x.n(rVarA, com.waze.ui.f.q.f42310a)) {
                    composer7.startReplaceGroup(2110291815);
                    strB3 = com.waze.ui.r.a.c.c.b(R.string.REPORTING_AGENT_ERROR_TITLE, composer7, 0);
                    composer7.endReplaceGroup();
                } else if (h.g.b.x.n(rVarA, com.waze.ui.f.m.f42306a)) {
                    composer7.startReplaceGroup(2110295855);
                    strB3 = com.waze.ui.r.a.c.c.b(R.string.REPORTING_AGENT_ERROR_NO_PERMISSION, composer7, 0);
                    composer7.endReplaceGroup();
                } else {
                    if (!h.g.b.x.n(rVarA, com.waze.ui.f.k.f42305a)) {
                        composer7.startReplaceGroup(2110284204);
                        composer7.endReplaceGroup();
                        throw new h.i();
                    }
                    composer7.startReplaceGroup(2110299328);
                    strB3 = com.waze.ui.r.a.c.c.b(R.string.REPORTING_AGENT_INITIATION_ERROR_TITLE_AUDIO_SESSION, composer7, 0);
                    composer7.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                al alVarC3 = al.c(alVarD, strB3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer7.endReplaceGroup();
                return alVarC3;
            case 8:
                com.waze.ui.f.af afVar = (com.waze.ui.f.af) obj;
                Composer composer8 = (Composer) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                h.g.b.x.f(afVar, "it");
                composer8.startReplaceGroup(755742102);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(755742102, iIntValue8, -1, "com.waze.ui.reports.bardinio.bardinioConversationUiProviders.<anonymous> (BardinioComposable.kt:132)");
                }
                al alVarC4 = al.c(com.waze.tide.s.g(afVar, composer8, iIntValue8 & 14), com.waze.ui.r.a.c.c.b(R.string.CONVERSATIONAL_REPORTING_BUTTON_MUTE_ERROR, composer8, 0));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer8.endReplaceGroup();
                return alVarC4;
            case 9:
                com.waze.ui.f.ae aeVar2 = (com.waze.ui.f.ae) obj;
                Composer composer9 = (Composer) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                h.g.b.x.f(aeVar2, "it");
                composer9.startReplaceGroup(-466745788);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-466745788, iIntValue9, -1, "com.waze.ui.reports.bardinio.bardinioConversationUiProviders.<anonymous> (BardinioComposable.kt:108)");
                }
                am amVarD5 = am.d(com.waze.tide.s.f(aeVar2, composer9, iIntValue9 & 14), com.waze.ui.r.a.c.c.b(R.string.CONVERSATIONAL_REPORTING_LISTENING_BUTTON, composer9, 0));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer9.endReplaceGroup();
                return amVarD5;
            case 10:
                com.waze.ui.f.ah ahVar2 = (com.waze.ui.f.ah) obj;
                Composer composer10 = (Composer) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                h.g.b.x.f(ahVar2, "it");
                composer10.startReplaceGroup(-1184322607);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1184322607, iIntValue10, -1, "com.waze.ui.reports.bardinio.bardinioConversationUiProviders.<anonymous> (BardinioComposable.kt:112)");
                }
                am amVarD6 = am.d(com.waze.tide.s.i(ahVar2, composer10, iIntValue10 & 14), com.waze.ui.r.a.c.c.b(R.string.CONVERSATIONAL_REPORTING_PROCESSING_BUTTON, composer10, 0));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer10.endReplaceGroup();
                return amVarD6;
            case 11:
                com.waze.ui.f.ai aiVar2 = (com.waze.ui.f.ai) obj;
                Composer composer11 = (Composer) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                h.g.b.x.f(aiVar2, "it");
                composer11.startReplaceGroup(-562984595);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-562984595, iIntValue11, -1, "com.waze.ui.reports.bardinio.bardinioConversationUiProviders.<anonymous> (BardinioComposable.kt:116)");
                }
                am amVarD7 = am.d(com.waze.tide.s.k(aiVar2, composer11, iIntValue11 & 14), com.waze.ui.r.a.c.c.b(R.string.CONVERSATIONAL_REPORTING_SPEAKING_BUTTON, composer11, 0));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer11.endReplaceGroup();
                return amVarD7;
            case 12:
                Composer composer12 = (Composer) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                int i2 = com.waze.ui.af.b.f41869a;
                h.g.b.x.f((AnimatedVisibilityScope) obj, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-811593468, iIntValue12, -1, "com.waze.ui.voices.ComposableSingletons$VoiceSettingsScreenKt.lambda$-811593468.<anonymous> (VoiceSettingsScreen.kt:258)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer12, 0));
                CompositionLocalMap currentCompositionLocalMap = composer12.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer12, modifierFillMaxWidth$default);
                h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                if (!(composer12.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer12.startReusableNode();
                if (composer12.getInserting()) {
                    composer12.createNode(constructor);
                } else {
                    composer12.useNode();
                }
                Updater.m7351setimpl(composer12, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composer12, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m7351setimpl(composer12, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composer12, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composer12, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                be.n(new com.waze.ui.ac.f(R.drawable.i_am_a_passenger_warning_sign), new com.waze.ui.ac.j(R.string.DONT_TYPE_WHILE_DRIVING_WARNING_TITLE), composer12, 0);
                composer12.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return h.ab.f48028a;
            case 13:
                Composer composer13 = (Composer) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                int i3 = com.waze.ui.af.b.f41869a;
                h.g.b.x.f((LazyItemScope) obj, "$this$item");
                if (composer13.shouldExecute((iIntValue13 & 17) != 16, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-844465022, iIntValue13, -1, "com.waze.ui.voices.ComposableSingletons$VoiceSettingsScreenKt.lambda$-844465022.<anonymous> (VoiceSettingsScreen.kt:316)");
                    }
                    ap.N(null, composer13, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 14:
                Composer composer14 = (Composer) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                int i4 = com.waze.ui.af.b.f41869a;
                h.g.b.x.f((LazyItemScope) obj, "$this$item");
                if (composer14.shouldExecute((iIntValue14 & 17) != 16, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-463881100, iIntValue14, -1, "com.waze.ui.voices.ComposableSingletons$VoiceSettingsScreenKt.lambda$-463881100.<anonymous> (VoiceSettingsScreen.kt:377)");
                    }
                    ap.I(com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.f43322i, null), com.waze.ui.r.a.c.c.b(R.string.VOICE_SETTINGS_SECTION_TITLE_CURRENT_VOICE, composer14, 0), composer14, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 15:
                Composer composer15 = (Composer) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                int i5 = com.waze.ui.af.b.f41869a;
                h.g.b.x.f((LazyItemScope) obj, "$this$item");
                if (composer15.shouldExecute((iIntValue15 & 17) != 16, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(987376740, iIntValue15, -1, "com.waze.ui.voices.ComposableSingletons$VoiceSettingsScreenKt.lambda$987376740.<anonymous> (VoiceSettingsScreen.kt:402)");
                    }
                    ap.I(com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.f43323j, null), com.waze.ui.r.a.c.c.b(R.string.VOICE_SETTINGS_SECTION_TITLE_CUSTOM_VOICES, composer15, 0), composer15, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 16:
                Composer composer16 = (Composer) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                int i6 = com.waze.ui.af.b.f41869a;
                h.g.b.x.f((ColumnScope) obj, "$this$ActionCellBase");
                if (composer16.shouldExecute((iIntValue16 & 17) != 16, iIntValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2007970241, iIntValue16, -1, "com.waze.ui.voices.ComposableSingletons$VoiceSettingsScreenKt.lambda$-2007970241.<anonymous> (VoiceSettingsScreen.kt:416)");
                    }
                    ap.E(com.waze.ui.r.a.c.c.b(R.string.VOICE_SETTINGS_CUSTOM_VOICE_DESCRIPTION, composer16, 0), composer16, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 17:
                Composer composer17 = (Composer) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                int i7 = com.waze.ui.af.b.f41869a;
                h.g.b.x.f((LazyItemScope) obj, "$this$item");
                if (composer17.shouldExecute((iIntValue17 & 17) != 16, iIntValue17 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1736860681, iIntValue17, -1, "com.waze.ui.voices.ComposableSingletons$VoiceSettingsScreenKt.lambda$-1736860681.<anonymous> (VoiceSettingsScreen.kt:445)");
                    }
                    ap.I(com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.f43325l, null), com.waze.ui.r.a.c.c.b(R.string.VOICE_SETTINGS_SECTION_TITLE_WAZE_VOICES, composer17, 0), composer17, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer17.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 18:
                SnackbarData snackbarData = (SnackbarData) obj;
                Composer composer18 = (Composer) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                int i8 = com.waze.ui.af.b.f41869a;
                h.g.b.x.f(snackbarData, "data");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1063139135, iIntValue18, -1, "com.waze.ui.voices.ComposableSingletons$VoiceSettingsScreenKt.lambda$1063139135.<anonymous> (VoiceSettingsScreen.kt:226)");
                }
                SnackbarKt.m4199SnackbarsPrSdHI(snackbarData, null, false, null, 0L, 0L, com.waze.bz.a.d(composer18, 0).l(), 0.0f, composer18, iIntValue18 & 14, DisplayStrings.DS_TRIP_OVERVIEW_REQUIRED_RESTRICTED_AREA_LABEL);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return h.ab.f48028a;
            case 19:
                Composer composer19 = (Composer) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                int i9 = com.waze.uid.c.aa.f44189a;
                h.g.b.x.f((RowScope) obj, "$this$Button");
                if (composer19.shouldExecute((iIntValue19 & 17) != 16, iIntValue19 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-134581795, iIntValue19, -1, "com.waze.uid.fragments.ComposableSingletons$WazeWelcomeScreenKt.lambda$-134581795.<anonymous> (WazeWelcomeScreen.kt:317)");
                    }
                    TextKt.m4275Text4IGK_g("Automation Login", (Modifier) null, com.waze.bz.a.d(composer19, 0).o(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, (TextStyle) null, composer19, 6, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer19.skipToGroupEnd();
                }
                return h.ab.f48028a;
            default:
                com.waze.uid.e.b bVar = (com.waze.uid.e.b) obj;
                com.waze.uid.e.h hVar = (com.waze.uid.e.h) obj2;
                com.waze.uid.b.m mVar = (com.waze.uid.b.m) obj3;
                h.g.b.x.f(bVar, "_trace");
                h.g.b.x.f(hVar, "_parent");
                h.g.b.x.f(mVar, "_controller");
                return new com.waze.uid.state_impl.email.c(bVar, hVar, mVar);
        }
    }
}
