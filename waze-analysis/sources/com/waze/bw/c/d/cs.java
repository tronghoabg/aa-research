package com.waze.bw.c.d;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.DividerKt;
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
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cs implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f18058a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f18059b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f18060c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f18061d;

    cs(Object obj, int i2, h.g.a.l lVar, int i3) {
        this.f18061d = i3;
        this.f18060c = obj;
        this.f18058a = i2;
        this.f18059b = lVar;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.f18061d != 0) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(321548985, iIntValue, -1, "com.waze.startstate.mobile.ui.recentSection.<anonymous>.<anonymous> (StartStateSheetContent.kt:477)");
                }
                Object obj3 = this.f18060c;
                int i2 = this.f18058a;
                h.g.a.l lVar = this.f18059b;
                Modifier.Companion companion = Modifier.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
                int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
                h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Updater.m7351setimpl(composer, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m7351setimpl(composer, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifierA = com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.ai, Integer.valueOf(i2));
                boolean zChanged = composer.changed(lVar) | composer.changed(i2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = (h.g.a.a) new cp(lVar, i2, 1);
                    composer.updateRememberedValue(objRememberedValue);
                }
                h.g.a.a aVar = (h.g.a.a) objRememberedValue;
                boolean zChanged2 = composer.changed(lVar) | composer.changed(i2);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = (h.g.a.a) new cp(lVar, i2, 0);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                v.x((cv) obj3, modifierA, aVar, (h.g.a.a) objRememberedValue2, composer, 0, 0);
                DividerKt.m4060DivideroMI9zvI(PaddingKt.m2757paddingVpY3zN4$default(Modifier.Companion, 16.0f, 0.0f, 2, null), com.waze.bz.a.d(composer, 0).K(), 1.0f, 0.0f, composer, DisplayStrings.DS_DICTATION_BOTTOM_SHEET_SPEECH_TIMEOUT, 8);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return h.ab.f48028a;
        }
        Composer composer2 = (Composer) obj;
        int iIntValue2 = ((Number) obj2).intValue();
        if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(647404572, iIntValue2, -1, "com.waze.startstate.mobile.ui.upcomingSection.<anonymous>.<anonymous> (StartStateSheetContent.kt:421)");
            }
            Object obj4 = this.f18060c;
            int i3 = this.f18058a;
            h.g.a.l lVar2 = this.f18059b;
            Modifier.Companion companion2 = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion2);
            h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Updater.m7351setimpl(composer2, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer2, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            Modifier modifierA2 = com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.af, Integer.valueOf(i3));
            boolean zChanged3 = composer2.changed(lVar2) | composer2.changed(i3);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = (h.g.a.a) new cp(lVar2, i3, 2);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            h.g.a.a aVar2 = (h.g.a.a) objRememberedValue3;
            boolean zChanged4 = composer2.changed(lVar2) | composer2.changed(i3);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = (h.g.a.a) new cp(lVar2, i3, 3);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            com.waze.sharedui.api.c.f((cw) obj4, modifierA2, aVar2, (h.g.a.a) objRememberedValue4, composer2, 0);
            DividerKt.m4060DivideroMI9zvI(PaddingKt.m2757paddingVpY3zN4$default(Modifier.Companion, 16.0f, 0.0f, 2, null), com.waze.bz.a.d(composer2, 0).K(), 1.0f, 0.0f, composer2, DisplayStrings.DS_DICTATION_BOTTOM_SHEET_SPEECH_TIMEOUT, 8);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }
}
