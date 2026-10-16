package com.waze.ui.s;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Html_androidKt;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.media3.common.util.WavUtil;
import com.waze.R;
import com.waze.bw.c.d.a.cg;
import com.waze.design_components.button.g;
import com.waze.location.af;
import com.waze.parking.f;
import com.waze.strings.DisplayStrings;
import com.waze.trip_overview.cl;
import com.waze.ui.ac.i;
import com.waze.z.a.ag;
import com.waze.z.a.am;
import com.waze.z.a.b.n;
import com.waze.z.a.be;
import com.waze.z.a.c.h;
import com.waze.z.a.c.q;
import com.waze.z.a.o;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {
    static final ab a(d dVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(883392253, i2, -1, "com.waze.ui.nav_connect.NavConnectConsentDialogLayout.<anonymous> (NavConnectConsentDialog.kt:61)");
            }
            h(dVar, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static final void b(final d dVar, Composer composer, int i2) {
        int i3;
        x.f(dVar, "state");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(294308552);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(dVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(294308552, i3, -1, "com.waze.ui.nav_connect.NavConnectConsentDialogLayout (NavConnectConsentDialog.kt:42)");
            }
            byte[] bArr = null;
            com.waze.z.a.c.d dVar2 = new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.NAV_CONNECT_CONSENT_ALLOW_BUTTON, composerStartRestartGroup, 0), n.e(null, null, null, 7), false, null, 12);
            com.waze.z.a.c.d dVar3 = new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.NAV_CONNECT_CONSENT_DONT_ALLOW_BUTTON, composerStartRestartGroup, 0), n.e(g.f23359b, null, null, 6), false, null, 12);
            x.f(dVar2, "allowAction");
            x.f(dVar3, "disallowAction");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1636815115, 0, -1, "com.waze.ui.nav_connect.buildDialogActions (NavConnectConsentDialog.kt:67)");
            }
            com.waze.z.a.c.a aVar = new com.waze.z.a.c.a(dVar2, dVar3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            com.waze.z.a.c.a aVar2 = aVar;
            String strD = com.waze.ui.r.a.c.c.d(R.string.NAV_CONNECT_CONSENT_TITLE_PS, new Object[]{dVar.b()}, composerStartRestartGroup);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(dVar2) | ((i3 & 14) == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new f(dVar2, dVar, 17, bArr);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            q.f(strD, aVar2, null, null, null, (p) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(883392253, true, new p() { // from class: com.waze.ui.s.a
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return c.a(dVar, (Composer) obj, iIntValue);
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new o(dVar, i2, 6));
        }
    }

    static final ab c(d dVar, int i2, Composer composer) {
        h(dVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static /* synthetic */ ab d(com.waze.z.a.c.d dVar, l lVar, com.waze.z.a.c.d dVar2, l lVar2, h.g.a.a aVar, MutableState mutableState, com.waze.z.a.c.c cVar, com.waze.z.a.c.d dVar3) {
        x.f(cVar, "<unused var>");
        x.f(dVar3, "cta");
        if (x.n(dVar3, dVar)) {
            lVar.invoke(i(mutableState));
        } else if (x.n(dVar3, dVar2)) {
            lVar2.invoke(i(mutableState));
        }
        aVar.invoke();
        return ab.f48028a;
    }

    public static final void e(com.waze.ui.t.b bVar, h.g.a.a aVar, l lVar, l lVar2, Composer composer, int i2) {
        int i3;
        x.f(bVar, "routingPopup");
        x.f(aVar, "dismiss");
        x.f(lVar, "onPrimaryAction");
        x.f(lVar2, "onSecondaryAction");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1591363099);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(bVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar2) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1591363099, i3, -1, "com.waze.ui.nav_popup.RoutingPopupDialog (RoutingPopupDialogUi.kt:40)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            com.waze.z.a.c.f fVar = null;
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            com.waze.z.a.c.d dVar = new com.waze.z.a.c.d(bVar.c(), n.e(null, null, null, 7), false, null, 12);
            String strD = bVar.d();
            String str = strD.length() <= 0 ? null : strD;
            com.waze.z.a.c.d dVar2 = str != null ? new com.waze.z.a.c.d(str, n.e(g.f23359b, null, null, 6), false, null, 12) : null;
            String strB = bVar.b();
            if (strB == null) {
                composerStartRestartGroup.startReplaceGroup(-448369390);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-448369389);
                Boolean boolI = i(mutableState);
                boolean zBooleanValue = boolI != null ? boolI.booleanValue() : false;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new cl(mutableState, 17);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                com.waze.z.a.c.f fVar2 = new com.waze.z.a.c.f(strB, zBooleanValue, (l) objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                fVar = fVar2;
            }
            i iVarA = bVar.a();
            h hVar = iVarA != null ? new h(iVarA, ContentScale.Companion.getCrop(), com.waze.z.a.c.i.f45845c, 12) : null;
            String strF = bVar.f();
            com.waze.z.a.c.c aVar2 = dVar2 != null ? new com.waze.z.a.c.a(dVar, dVar2) : new com.waze.z.a.c.b(dVar);
            boolean zChangedInstance = ((i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256) | composerStartRestartGroup.changedInstance(dVar) | composerStartRestartGroup.changedInstance(dVar2);
            boolean z = (i3 & 7168) == 2048;
            boolean z2 = (i3 & 112) == 32;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance | z | z2) || objRememberedValue3 == Composer.Companion.getEmpty()) {
                com.waze.ui.t.a aVar3 = new com.waze.ui.t.a(dVar, lVar, dVar2, lVar2, aVar, mutableState, 0);
                composerStartRestartGroup.updateRememberedValue(aVar3);
                objRememberedValue3 = aVar3;
            }
            q.f(strF, aVar2, null, hVar, fVar, (p) objRememberedValue3, ComposableLambdaKt.rememberComposableLambda(-1435198064, true, new af(bVar, 20), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.closure.d.b(bVar, aVar, lVar, lVar2, i2, 20));
        }
    }

    public static final void f(String str, h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        Composer composer2;
        x.f(str, HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS);
        x.f(aVar, "onResendEmailClick");
        x.f(aVar2, "onContactSupportClick");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(234908854);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(str) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(234908854, i3, -1, "com.waze.uid.fragments.EmailErrorScreen (EmailErrorScreen.kt:29)");
            }
            Modifier modifierM2757paddingVpY3zN4$default = PaddingKt.m2757paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), 24.0f, 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 48);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2757paddingVpY3zN4$default);
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
            SpacerKt.Spacer(SizeKt.m2808height3ABfNKs(Modifier.Companion, 64.0f), composerStartRestartGroup, 6);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.no_account_ill, composerStartRestartGroup, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 124);
            SpacerKt.Spacer(SizeKt.m2808height3ABfNKs(Modifier.Companion, 32.0f), composerStartRestartGroup, 6);
            TextKt.m4275Text4IGK_g(StringResources_androidKt.stringResource(R.string.VERIFY_EMAIL_ERROR_TITLE, new Object[]{str}, composerStartRestartGroup, 0), (Modifier) null, com.waze.bz.a.d(composerStartRestartGroup, 0).o(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composerStartRestartGroup).e(), composerStartRestartGroup, 0, 0, 65530);
            TextKt.m4275Text4IGK_g(StringResources_androidKt.stringResource(R.string.VERIFY_EMAIL_ERROR_SUBTITLE, composerStartRestartGroup, 0), (Modifier) null, com.waze.bz.a.d(composerStartRestartGroup, 0).o(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composerStartRestartGroup).a(), composerStartRestartGroup, 0, 0, 65530);
            SpacerKt.Spacer(ColumnScope.CC.weight$default(columnScopeInstance, Modifier.Companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m2808height3ABfNKs(Modifier.Companion, 32.0f), composerStartRestartGroup, 6);
            be.o(aVar, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), StringResources_androidKt.stringResource(R.string.VERIFY_EMAIL_ERROR_RETRY, composerStartRestartGroup, 0), null, null, null, false, false, composerStartRestartGroup, 48 | ((i3 >> 3) & 14), DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_1);
            composer2 = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m2808height3ABfNKs(Modifier.Companion, 16.0f), composer2, 6);
            String strStringResource = StringResources_androidKt.stringResource(R.string.VERIFY_EMAIL_ERROR_SUPPORT, composer2, 0);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            int i5 = i3 & DisplayStrings.DS_TAP_TO_VERIFY;
            Object objRememberedValue = composer2.rememberedValue();
            if (i5 == 256 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.speech.l(aVar2, 17);
                composer2.updateRememberedValue(objRememberedValue);
            }
            TextKt.m4275Text4IGK_g(strStringResource, be.J(modifierFillMaxWidth$default, false, null, (h.g.a.a) objRememberedValue, composer2, 6, 15), com.waze.bz.a.d(composer2, 0).G(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m11004boximpl(TextAlign.Companion.m11011getCentere0LSkKk()), 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composer2).c(), composer2, 0, 0, 65016);
            SpacerKt.Spacer(SizeKt.m2808height3ABfNKs(Modifier.Companion, 24.0f), composer2, 6);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ag(str, aVar, aVar2, i2, 17));
        }
    }

    public static final void g(h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, Composer composer, int i2) {
        int i3;
        x.f(aVar, "onGoogleSignUpClicked");
        x.f(aVar2, "onEmailSignUpClicked");
        x.f(aVar3, "onGuestClicked");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(135877359);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar3) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(135877359, i3, -1, "com.waze.uid.fragments.CreateAccountScreen (CreateAccountScreen.kt:33)");
            }
            Modifier modifierM2757paddingVpY3zN4$default = PaddingKt.m2757paddingVpY3zN4$default(WindowInsetsPadding_androidKt.systemBarsPadding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null)), 24.0f, 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composerStartRestartGroup, 48);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2757paddingVpY3zN4$default);
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
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.waze_logo, composerStartRestartGroup, 0), (String) null, PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 32.0f, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | DisplayStrings.DS_DIRT_ROADS, 120);
            TextKt.m4275Text4IGK_g(StringResources_androidKt.stringResource(R.string.SIGNUP_LOGIN_MENU_TITLE, composerStartRestartGroup, 0), PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 32.0f, 7, null), com.waze.bz.a.d(composerStartRestartGroup, 0).o(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composerStartRestartGroup).e(), composerStartRestartGroup, 48, 0, 65528);
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, 24.0f, 7, null);
            String strStringResource = StringResources_androidKt.stringResource(R.string.SIGNUP_MENU_GOOGLE, composerStartRestartGroup, 0);
            am amVarD = n.d(com.waze.design_components.b.d.w, 2);
            g gVar = g.f23359b;
            int i5 = i3;
            be.o(aVar, modifierM2759paddingqDBjuR0$default, strStringResource, amVarD, n.e(gVar, null, null, 6), null, false, false, composerStartRestartGroup, (i3 & 14) | 48, 224);
            be.o(aVar2, PaddingKt.m2759paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, 16.0f, 7, null), StringResources_androidKt.stringResource(R.string.SIGNUP_MENU_EMAIL, composerStartRestartGroup, 0), null, n.e(gVar, null, null, 6), null, false, false, composerStartRestartGroup, ((i5 >> 3) & 14) | 48, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_2W_4);
            Modifier modifierM2759paddingqDBjuR0$default2 = PaddingKt.m2759paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, 16.0f, 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m2440spacedBy0680j_4(8.0f), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 54);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2759paddingqDBjuR0$default2);
            h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            DividerKt.m4060DivideroMI9zvI(RowScope.CC.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), com.waze.bz.a.d(composerStartRestartGroup, 0).y(), 0.0f, 0.0f, composerStartRestartGroup, 0, 12);
            TextKt.m4275Text4IGK_g(StringResources_androidKt.stringResource(R.string.LOGIN_MAIN_SEP_LABEL, composerStartRestartGroup, 0), (Modifier) null, com.waze.bz.a.d(composerStartRestartGroup, 0).q(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composerStartRestartGroup).c(), composerStartRestartGroup, 0, 0, 65530);
            DividerKt.m4060DivideroMI9zvI(RowScope.CC.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), com.waze.bz.a.d(composerStartRestartGroup, 0).y(), 0.0f, 0.0f, composerStartRestartGroup, 0, 12);
            composerStartRestartGroup.endNode();
            be.o(aVar3, PaddingKt.m2759paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, 24.0f, 7, null), com.waze.ui.r.a.c.c.b(R.string.SIGNUP_MENU_SKIP, composerStartRestartGroup, 0), null, n.e(gVar, null, null, 6), null, false, false, composerStartRestartGroup, ((i5 >> 6) & 14) | 48, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_2W_4);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ag(aVar, aVar2, aVar3, i2, 16));
        }
    }

    private static final void h(final d dVar, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        String strD;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1654607446);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(dVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1654607446, i3, -1, "com.waze.ui.nav_connect.ConsentText (NavConnectConsentDialog.kt:72)");
            }
            int i5 = i3 & 14;
            AnnotatedString.Companion companion = AnnotatedString.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-360850964, i5, -1, "com.waze.ui.nav_connect.getConsentFullText (NavConnectConsentDialog.kt:95)");
            }
            if (dVar.a() == null) {
                composerStartRestartGroup.startReplaceGroup(192190484);
                strD = com.waze.ui.r.a.c.c.d(R.string.NAV_CONNECT_CONSENT_HTML_PS_PS_PS_PS_PS_PS, new Object[]{dVar.b(), dVar.b(), dVar.b(), "https://www.waze.com/privacyPolicyUrl/placeholder/", dVar.b(), "https://www.waze.com/learnMoreUrl/placeholder/"}, composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(192487774);
                strD = com.waze.ui.r.a.c.c.d(R.string.NAV_CONNECT_CONSENT_WITH_ISV_HTML_PS_PS_PS_PS_PS_PS_PS_PS_PS, new Object[]{dVar.b(), dVar.a(), dVar.b(), dVar.b(), "https://www.waze.com/privacyPolicyUrl/placeholder/", dVar.b(), "https://www.waze.com/privacyPolicyUrl/placeholder/isv/", dVar.a(), "https://www.waze.com/learnMoreUrl/placeholder/"}, composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            TextLinkStyles textLinkStyles = new TextLinkStyles(new SpanStyle(com.waze.bz.a.d(composerStartRestartGroup, 0).G(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (h.g.b.o) null), null, null, null, 14, null);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i5 == 4 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new cg(dVar, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            TextKt.m4276TextIbK3jfQ(Html_androidKt.fromHtml(companion, strD, textLinkStyles, (LinkInteractionListener) objRememberedValue), null, com.waze.bz.a.d(composerStartRestartGroup, 0).p(), 0L, null, null, null, 0L, null, TextAlign.m11004boximpl(TextAlign.Companion.m11014getLefte0LSkKk()), 0L, 0, false, 0, 0, null, null, com.waze.bz.a.h(composerStartRestartGroup).m(), composer2, 0, 0, 130554);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: com.waze.ui.s.b
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return c.c(dVar, i2, (Composer) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Boolean i(MutableState mutableState) {
        return (Boolean) mutableState.getValue();
    }
}
