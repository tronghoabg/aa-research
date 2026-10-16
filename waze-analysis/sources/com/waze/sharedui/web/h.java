package com.waze.sharedui.web;

import android.content.res.Configuration;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.SnackbarData;
import androidx.compose.material.SnackbarHostState;
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
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import com.waze.R;
import com.waze.strings.DisplayStrings;
import com.waze.trip_overview.cl;
import com.waze.z.a.be;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class h implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f39353a;

    public /* synthetic */ h(int i2) {
        this.f39353a = i2;
    }

    @Override // h.g.a.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f39353a) {
            case 0:
                return i.a((SnackbarHostState) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                Modifier modifier = (Modifier) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                h.g.b.x.f(modifier, "$this$composed");
                composer.startReplaceGroup(377911648);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(377911648, iIntValue, -1, "com.waze.ui.conversation.cancelledConversationBackground.<anonymous> (ConversationLayout.kt:155)");
                }
                final long jM = com.waze.bz.a.d(composer, 0).M();
                final long jT = com.waze.bz.a.d(composer, 0).t();
                boolean zChanged = composer.changed(jM) | composer.changed(jT);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new h.g.a.l() { // from class: com.waze.ui.f.f
                        @Override // h.g.a.l
                        public final Object invoke(Object obj4) {
                            CacheDrawScope cacheDrawScope = (CacheDrawScope) obj4;
                            h.g.b.x.f(cacheDrawScope, "$this$drawWithCache");
                            return cacheDrawScope.onDrawBehind(new cl(Brush.Companion.m8175horizontalGradient8A3gB4$default(Brush.Companion, h.a.i.i(Color.m8218boximpl(jM), Color.m8218boximpl(jT)), 0.0f, 0.0f, 0, 14, (Object) null), 2));
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierDrawWithCache = DrawModifierKt.drawWithCache(modifier, (h.g.a.l) objRememberedValue);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierDrawWithCache;
            case 2:
                com.waze.ui.f.ad adVar = (com.waze.ui.f.ad) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                h.g.b.x.f(adVar, "it");
                composer2.startReplaceGroup(-1316328483);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1316328483, iIntValue2, -1, "com.waze.ui.conversation.ConversationUiDefaults.providers.<anonymous> (ConversationUiProviders.kt:57)");
                }
                com.waze.ui.f.al alVarE = com.waze.tide.s.e(adVar, composer2, (iIntValue2 & 14) | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                return alVarE;
            case 3:
                com.waze.ui.f.ae aeVar = (com.waze.ui.f.ae) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                h.g.b.x.f(aeVar, "it");
                composer3.startReplaceGroup(-1315652055);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1315652055, iIntValue3, -1, "com.waze.ui.conversation.ConversationUiDefaults.providers.<anonymous> (ConversationUiProviders.kt:59)");
                }
                com.waze.ui.f.am amVarF = com.waze.tide.s.f(aeVar, composer3, (iIntValue3 & 14) | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer3.endReplaceGroup();
                return amVarF;
            case 4:
                com.waze.ui.f.ah ahVar = (com.waze.ui.f.ah) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                h.g.b.x.f(ahVar, "it");
                composer4.startReplaceGroup(-613878027);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-613878027, iIntValue4, -1, "com.waze.ui.conversation.ConversationUiDefaults.providers.<anonymous> (ConversationUiProviders.kt:62)");
                }
                com.waze.ui.f.am amVarI = com.waze.tide.s.i(ahVar, composer4, (iIntValue4 & 14) | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer4.endReplaceGroup();
                return amVarI;
            case 5:
                com.waze.ui.f.ai aiVar = (com.waze.ui.f.ai) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                h.g.b.x.f(aiVar, "it");
                composer5.startReplaceGroup(520234735);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(520234735, iIntValue5, -1, "com.waze.ui.conversation.ConversationUiDefaults.providers.<anonymous> (ConversationUiProviders.kt:64)");
                }
                com.waze.ui.f.am amVarK = com.waze.tide.s.k(aiVar, composer5, (iIntValue5 & 14) | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer5.endReplaceGroup();
                return amVarK;
            case 6:
                com.waze.ui.f.ac acVar = (com.waze.ui.f.ac) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                h.g.b.x.f(acVar, "it");
                composer6.startReplaceGroup(554996937);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(554996937, iIntValue6, -1, "com.waze.ui.conversation.ConversationUiDefaults.providers.<anonymous> (ConversationUiProviders.kt:65)");
                }
                int i2 = iIntValue6 & 14;
                h.g.b.x.f(acVar, "state");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(257196152, i2 | 48, -1, "com.waze.ui.conversation.ConversationUiDefaults.fteHint (ConversationUiProviders.kt:132)");
                }
                com.waze.ui.f.am amVar = new com.waze.ui.f.am(acVar.a(), a.a.G(com.airbnb.lottie.b.an.d(com.airbnb.lottie.b.ab.b(R.raw.conversation_speaking_loop), composer6)));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer6.endReplaceGroup();
                return amVar;
            case 7:
                com.waze.ui.f.af afVar = (com.waze.ui.f.af) obj;
                Composer composer7 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                h.g.b.x.f(afVar, "it");
                composer7.startReplaceGroup(665111107);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(665111107, iIntValue7, -1, "com.waze.ui.conversation.ConversationUiDefaults.providers.<anonymous> (ConversationUiProviders.kt:66)");
                }
                com.waze.ui.f.al alVarG = com.waze.tide.s.g(afVar, composer7, (iIntValue7 & 14) | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer7.endReplaceGroup();
                return alVarG;
            case 8:
                com.waze.ui.f.aj ajVar = (com.waze.ui.f.aj) obj;
                Composer composer8 = (Composer) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                h.g.b.x.f(ajVar, "it");
                composer8.startReplaceGroup(1407248169);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1407248169, iIntValue8, -1, "com.waze.ui.conversation.ConversationUiDefaults.providers.<anonymous> (ConversationUiProviders.kt:68)");
                }
                com.waze.ui.f.am amVarL = com.waze.tide.s.l(ajVar, composer8, (iIntValue8 & 14) | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer8.endReplaceGroup();
                return amVarL;
            case 9:
                com.waze.ui.f.ab abVar = (com.waze.ui.f.ab) obj;
                Composer composer9 = (Composer) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                h.g.b.x.f(abVar, "it");
                composer9.startReplaceGroup(-750920925);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-750920925, iIntValue9, -1, "com.waze.ui.conversation.ConversationUiDefaults.providers.<anonymous> (ConversationUiProviders.kt:70)");
                }
                com.waze.ui.f.al alVarD = com.waze.tide.s.d(abVar, composer9, (iIntValue9 & 14) | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer9.endReplaceGroup();
                return alVarD;
            case 10:
                com.waze.ui.f.ag agVar = (com.waze.ui.f.ag) obj;
                Composer composer10 = (Composer) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                h.g.b.x.f(agVar, "it");
                composer10.startReplaceGroup(2098321873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2098321873, iIntValue10, -1, "com.waze.ui.conversation.ConversationUiDefaults.providers.<anonymous> (ConversationUiProviders.kt:72)");
                }
                com.waze.ui.f.al alVarH = com.waze.tide.s.h(agVar, composer10, (iIntValue10 & 14) | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer10.endReplaceGroup();
                return alVarH;
            case 11:
                SnackbarData snackbarData = (SnackbarData) obj;
                Composer composer11 = (Composer) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                int i3 = com.waze.ui.g.o.f42352a;
                h.g.b.x.f(snackbarData, "data");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-431733890, iIntValue11, -1, "com.waze.ui.copilot.ComposableSingletons$CarsSettingsScreenKt.lambda$-431733890.<anonymous> (CarsSettingsScreen.kt:112)");
                }
                SnackbarKt.m4199SnackbarsPrSdHI(snackbarData, null, false, null, 0L, 0L, com.waze.bz.a.d(composer11, 0).l(), 0.0f, composer11, iIntValue11 & 14, DisplayStrings.DS_TRIP_OVERVIEW_REQUIRED_RESTRICTED_AREA_LABEL);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return h.ab.f48028a;
            case 12:
                Composer composer12 = (Composer) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                int i4 = com.waze.ui.j.b.f42402a;
                h.g.b.x.f((AnimatedVisibilityScope) obj, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-739002202, iIntValue12, -1, "com.waze.ui.hamburger_button.ComposableSingletons$HamburgerButtonKt.lambda$-739002202.<anonymous> (HamburgerButton.kt:188)");
                }
                com.waze.ui.j.h.m(composer12, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return h.ab.f48028a;
            case 13:
                com.waze.ui.m.g gVar = (com.waze.ui.m.g) obj;
                Composer composer13 = (Composer) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                int i5 = com.waze.ui.m.n.f43020a;
                h.g.b.x.f(gVar, "it");
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= true != composer13.changed(gVar) ? 2 : 4;
                }
                if (composer13.shouldExecute((iIntValue13 & 19) != 18, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-565487983, iIntValue13, -1, "com.waze.ui.location_preview.ComposableSingletons$LocationPreviewHeaderKt.lambda$-565487983.<anonymous> (LocationPreviewHeader.kt:194)");
                    }
                    if (h.g.b.x.n(gVar, com.waze.ui.m.d.f42941a)) {
                        composer13.startReplaceGroup(2026896960);
                        be.x(SizeKt.m2808height3ABfNKs(SizeKt.fillMaxWidth(Modifier.Companion, 0.5f), 24.0f), composer13, 6);
                        composer13.endReplaceGroup();
                    } else if (gVar instanceof com.waze.ui.m.f) {
                        composer13.startReplaceGroup(-1590589598);
                        com.waze.design_components.g.b.g(((com.waze.ui.m.f) gVar).a(), composer13, 0, 2);
                        composer13.endReplaceGroup();
                    } else {
                        if (!h.g.b.x.n(gVar, com.waze.ui.m.e.f43008a)) {
                            composer13.startReplaceGroup(2026895383);
                            composer13.endReplaceGroup();
                            throw new h.i();
                        }
                        composer13.startReplaceGroup(-1590508657);
                        composer13.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 14:
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer14 = (Composer) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                int i6 = com.waze.ui.n.a.f43068a;
                h.g.b.x.f(paddingValues, "it");
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= true == composer14.changed(paddingValues) ? 4 : 2;
                }
                if (composer14.shouldExecute((iIntValue14 & 19) != 18, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1834319452, iIntValue14, -1, "com.waze.ui.login_error.ComposableSingletons$LoginErrorKt.lambda$-1834319452.<anonymous> (LoginError.kt:149)");
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(BackgroundKt.m1972backgroundbw27NRU$default(PaddingKt.padding(Modifier.Companion, paddingValues), com.waze.bz.a.d(composer14, 0).h(), null, 2, null), 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterHorizontally(), composer14, 54);
                    int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer14, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer14.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer14, modifierFillMaxSize$default);
                    h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    if (!(composer14.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer14.startReusableNode();
                    if (composer14.getInserting()) {
                        composer14.createNode(constructor);
                    } else {
                        composer14.useNode();
                    }
                    Updater.m7351setimpl(composer14, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composer14, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composer14, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composer14, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composer14, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.launch_icon_64px, composer14, 0), (String) null, SizeKt.m2822size3ABfNKs(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 18.0f, 0.0f, 18.0f, 5, null), 80.0f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer14, Painter.$stable | DisplayStrings.DS_DIRT_ROADS, 120);
                    SpacerKt.Spacer(SizeKt.m2808height3ABfNKs(Modifier.Companion, 50.0f), composer14, 6);
                    ProgressIndicatorKt.m4151CircularProgressIndicatorLxG7B9w(null, com.waze.bz.a.d(composer14, 0).E(), 0.0f, 0L, 0, composer14, 0, 29);
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.PLEASE_WAIT___, composer14, 0), PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 60.0f, 0.0f, 60.0f, 32.0f, 2, null), com.waze.bz.a.d(composer14, 0).o(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m11004boximpl(TextAlign.Companion.m11011getCentere0LSkKk()), 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, (TextStyle) null, composer14, 199728, 0, 130512);
                    composer14.endNode();
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
                int i7 = com.waze.ui.p.a.f43180a;
                h.g.b.x.f((AnimatedVisibilityScope) obj, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1160094449, iIntValue15, -1, "com.waze.ui.map.ComposableSingletons$WazeMapKt.lambda$-1160094449.<anonymous> (WazeMap.kt:171)");
                }
                com.waze.ui.p.t.m(composer15, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return h.ab.f48028a;
            case 16:
                Composer composer16 = (Composer) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                int i8 = com.waze.ui.v.a.f43484a;
                h.g.b.x.f((ColumnScope) obj, "$this$Header");
                if (composer16.shouldExecute((iIntValue16 & 17) != 16, iIntValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1076993524, iIntValue16, -1, "com.waze.ui.qr_login.ComposableSingletons$QrLoginKt.lambda$-1076993524.<anonymous> (QrLogin.kt:189)");
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.launch_icon_64px, composer16, 0), (String) null, SizeKt.m2822size3ABfNKs(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 35.0f, 0.0f, 18.0f, 5, null), 80.0f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer16, Painter.$stable | DisplayStrings.DS_DIRT_ROADS, 120);
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.QR_LOGIN_USER_REFUSED_SUBTITLE, composer16, 0), PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 60.0f, 0.0f, 60.0f, ((Configuration) composer16.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 1 ? 27.0f : 6.0f, 2, null), com.waze.bz.a.d(composer16, 0).o(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m11004boximpl(TextAlign.Companion.m11011getCentere0LSkKk()), 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, (TextStyle) null, composer16, 199680, 0, 130512);
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.QR_LOGIN_USER_REFUSED_TEXT, composer16, 0), PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 60.0f, 0.0f, 60.0f, 0.0f, 10, null), com.waze.bz.a.d(composer16, 0).q(), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m11004boximpl(TextAlign.Companion.m11011getCentere0LSkKk()), 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, (TextStyle) null, composer16, DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_DELETE_RECENT_DESTINATION_MESSAGE, 0, 130544);
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
                int i9 = com.waze.ui.v.a.f43484a;
                h.g.b.x.f((ColumnScope) obj, "$this$Header");
                if (composer17.shouldExecute((iIntValue17 & 17) != 16, iIntValue17 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1617319811, iIntValue17, -1, "com.waze.ui.qr_login.ComposableSingletons$QrLoginKt.lambda$1617319811.<anonymous> (QrLogin.kt:252)");
                    }
                    SpacerKt.Spacer(SizeKt.m2808height3ABfNKs(Modifier.Companion, 100.0f), composer17, 6);
                    ProgressIndicatorKt.m4151CircularProgressIndicatorLxG7B9w(null, com.waze.bz.a.d(composer17, 0).E(), 0.0f, 0L, 0, composer17, 0, 29);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer17.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 18:
                Composer composer18 = (Composer) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                int i10 = com.waze.ui.v.a.f43484a;
                h.g.b.x.f((ColumnScope) obj, "$this$Header");
                if (composer18.shouldExecute((iIntValue18 & 17) != 16, iIntValue18 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1658190838, iIntValue18, -1, "com.waze.ui.qr_login.ComposableSingletons$QrLoginKt.lambda$-1658190838.<anonymous> (QrLogin.kt:266)");
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ui_icon_outline_checkmark_with_bg_36px, composer18, 0), (String) null, SizeKt.m2822size3ABfNKs(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 35.0f, 0.0f, 18.0f, 5, null), 80.0f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer18, Painter.$stable | DisplayStrings.DS_DIRT_ROADS, 120);
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.QR_LOGIN_SUCCESS_SUBTITLE, composer18, 0), PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 60.0f, 0.0f, 60.0f, 27.0f, 2, null), com.waze.bz.a.d(composer18, 0).o(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m11004boximpl(TextAlign.Companion.m11011getCentere0LSkKk()), 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, (TextStyle) null, composer18, 199728, 0, 130512);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer18.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 19:
                Composer composer19 = (Composer) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                int i11 = com.waze.ui.w.a.f43517a;
                h.g.b.x.f((AnimatedVisibilityScope) obj, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1386483354, iIntValue19, -1, "com.waze.ui.reports.ComposableSingletons$ReportsMenuLayoutKt.lambda$1386483354.<anonymous> (ReportsMenuLayout.kt:366)");
                }
                TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.REPORTING_DISCLAIMER, composer19, 0), com.waze.ui.r.a.d.d.a(PaddingKt.m2756paddingVpY3zN4(BorderKt.m1983borderxT4_qwU(PaddingKt.m2758paddingqDBjuR0(Modifier.Companion, 16.0f, 12.0f, 16.0f, 20.0f), 1.0f, com.waze.bz.a.d(composer19, 0).K(), RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(16.0f)), 16.0f, 8.0f), com.waze.ui.r.a.d.c.bO, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer19).n(), composer19, 0, 0, 65532);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return h.ab.f48028a;
            default:
                Composer composer20 = (Composer) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                int i12 = com.waze.ui.w.a.f43517a;
                h.g.b.x.f((AnimatedVisibilityScope) obj, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-828322671, iIntValue20, -1, "com.waze.ui.reports.ComposableSingletons$ReportsMenuLayoutKt.lambda$-828322671.<anonymous> (ReportsMenuLayout.kt:381)");
                }
                com.waze.ui.w.ai.B(0.0f, composer20, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return h.ab.f48028a;
        }
    }
}
