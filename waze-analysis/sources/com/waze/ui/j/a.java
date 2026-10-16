package com.waze.ui.j;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.waze.MessageBoxNativeManager;
import com.waze.ao;
import com.waze.c.e.ce;
import com.waze.car_lib.b.br;
import com.waze.car_lib.f.ed;
import com.waze.car_lib.f.ej;
import com.waze.car_lib.f.v;
import com.waze.config.ConfigValues;
import com.waze.ct;
import com.waze.kb;
import com.waze.kd;
import com.waze.map.b.n;
import com.waze.navigate.db;
import com.waze.search.bn;
import com.waze.stats.ax;
import com.waze.strings.DisplayStrings;
import com.waze.ui.af.ap;
import com.waze.ui.af.r;
import com.waze.ui.af.t;
import com.waze.ui.af.w;
import com.waze.ui.af.y;
import com.waze.ui.o.ac;
import com.waze.uid.c.aa;
import com.waze.uid.d.k;
import com.waze.uid.d.o;
import com.waze.uid.d.q;
import com.waze.uid.d.s;
import com.waze.uid.m;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.ar;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f42401a;

    public /* synthetic */ a(int i2) {
        this.f42401a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f42401a) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = iIntValue & 3;
                int i3 = iIntValue & 1;
                int i4 = b.f42402a;
                if (composer.shouldExecute(i2 != 2, i3)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2080315055, iIntValue, -1, "com.waze.ui.hamburger_button.ComposableSingletons$HamburgerButtonKt.lambda$-2080315055.<anonymous> (HamburgerButton.kt:68)");
                    }
                    Modifier modifierM1972backgroundbw27NRU$default = BackgroundKt.m1972backgroundbw27NRU$default(Modifier.Companion, Color.Companion.m8265getWhite0d7_KjU(), null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1972backgroundbw27NRU$default);
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
                    Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composer, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    h.b(null, new g(), null, composer, 0, 5);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return ab.f48028a;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i5 = iIntValue2 & 3;
                int i6 = iIntValue2 & 1;
                int i7 = com.waze.ui.af.b.f41869a;
                if (composer2.shouldExecute(i5 != 2, i6)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1645808668, iIntValue2, -1, "com.waze.ui.voices.ComposableSingletons$VoiceSettingsScreenKt.lambda$-1645808668.<anonymous> (VoiceSettingsScreen.kt:942)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
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
                    Updater.m7351setimpl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composer2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composer2, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composer2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Object objRememberedValue = composer2.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new ac(12);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    h.g.a.a aVar = (h.g.a.a) objRememberedValue;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new ac(13);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    ap.F(aVar, (h.g.a.a) objRememberedValue2, composer2, 54);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return ab.f48028a;
            case 2:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i8 = iIntValue3 & 3;
                int i9 = iIntValue3 & 1;
                int i10 = com.waze.ui.af.b.f41869a;
                if (composer3.shouldExecute(i8 != 2, i9)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-564738880, iIntValue3, -1, "com.waze.ui.voices.ComposableSingletons$VoiceSettingsScreenKt.lambda$-564738880.<anonymous> (VoiceSettingsScreen.kt:389)");
                    }
                    ap.G(composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return ab.f48028a;
            case 3:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i11 = iIntValue4 & 3;
                int i12 = iIntValue4 & 1;
                int i13 = com.waze.ui.af.b.f41869a;
                if (composer4.shouldExecute(i11 != 2, i12)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1007803984, iIntValue4, -1, "com.waze.ui.voices.ComposableSingletons$VoiceSettingsScreenKt.lambda$-1007803984.<anonymous> (VoiceSettingsScreen.kt:419)");
                    }
                    IconKt.m4110Iconww6aTOc(PainterResources_androidKt.painterResource(com.waze.design_components.b.d.bC.c(com.waze.design_components.b.e.f23312a), composer4, 0), (String) null, SizeKt.m2822size3ABfNKs(Modifier.Companion, 24.0f), com.waze.bz.a.d(composer4, 0).o(), composer4, Painter.$stable | DisplayStrings.DS_DIRT_ROADS, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return ab.f48028a;
            case 4:
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i14 = iIntValue5 & 1;
                boolean z = (iIntValue5 & 3) != 2;
                int i15 = com.waze.ui.af.b.f41869a;
                if (composer5.shouldExecute(z, i14)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1396215139, iIntValue5, -1, "com.waze.ui.voices.ComposableSingletons$VoiceSettingsScreenKt.lambda$1396215139.<anonymous> (VoiceSettingsScreen.kt:749)");
                    }
                    int i16 = 5;
                    List listI = h.a.i.i(new w("TTS 1", "TTS 1", "TTS generated 1", "eng"), new r("Prompt 1", "Prompt 1 no description", "", "eng"), new r("Prompt 2", "Prompt 2", "Somewhat long description for this very popular voice", "eng"), new r("Prompt 3", "Prompt 1 no description with whitespace", " ", "eng"), new w("TTS 2", "TTS 2", "TTS generated 2", "eng"), new w("TTS 3", "TTS 3", "TTS generated 3", "eng"), new w("TTS 4", "TTS 4", "TTS generated 4", "eng"));
                    com.waze.ui.af.c cVar = com.waze.ui.af.c.f41880a;
                    t tVar = new t("Prompt 1", listI, h.a.i.i(new y("Custom VoiceOption 1", "Custom VoiceOption 1", com.waze.ui.af.c.f41881b, false, false), new y("Custom VoiceOption 2", "Custom VoiceOption 2", cVar, false, false), new y("Custom VoiceOption 3", "Custom VoiceOption 3", cVar, true, true), ap.d("Custom VoiceOption 4", "Custom VoiceOption 4")), false, null, true);
                    Object objRememberedValue3 = composer5.rememberedValue();
                    if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new com.waze.ui.x.a(i16);
                        composer5.updateRememberedValue(objRememberedValue3);
                    }
                    ap.o(tVar, (l) objRememberedValue3, composer5, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return ab.f48028a;
            case 5:
                org.a.d.k.b bVar = (org.a.d.k.b) obj;
                int i17 = m.f44536a;
                x.f(bVar, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i18 = ar.f48106a;
                return new com.waze.uid.d.f((com.waze.uid.d.j) bVar.a(new h.g.b.m(com.waze.uid.d.j.class), null, null));
            case 6:
                org.a.d.k.b bVar2 = (org.a.d.k.b) obj;
                int i19 = m.f44536a;
                x.f(bVar2, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i20 = ar.f48106a;
                return new k(new com.waze.shared_infra.b.c("com.google.android.apps.ridematch.utils.preferences", "email_parameters", (Context) bVar2.a(new h.g.b.m(Context.class), null, null)));
            case 7:
                org.a.d.k.b bVar3 = (org.a.d.k.b) obj;
                int i21 = m.f44536a;
                x.f(bVar3, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i22 = ar.f48106a;
                return new com.waze.uid.stats.t((ax) bVar3.a(new h.g.b.m(ax.class), null, null));
            case 8:
                org.a.d.k.b bVar4 = (org.a.d.k.b) obj;
                int i23 = m.f44536a;
                x.f(bVar4, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i24 = ar.f48106a;
                return new q((com.waze.uid.d.c) bVar4.a(new h.g.b.m(com.waze.uid.d.c.class), null, null), (com.waze.uid.d.j) bVar4.a(new h.g.b.m(com.waze.uid.d.j.class), null, null), (s) bVar4.a(new h.g.b.m(s.class), null, null), (com.waze.uid.d.i) bVar4.a(new h.g.b.m(com.waze.uid.d.i.class), null, null), (com.waze.bf.a) bVar4.a(new h.g.b.m(com.waze.bf.a.class), null, null), (com.waze.shared_infra.d.a) bVar4.a(new h.g.b.m(com.waze.shared_infra.d.a.class), null, null), (com.waze.r.a) bVar4.a(new h.g.b.m(com.waze.r.a.class), null, null), (com.waze.uid.d.h) bVar4.a(new h.g.b.m(com.waze.uid.d.h.class), null, null), (com.waze.uid.stats.s) bVar4.a(new h.g.b.m(com.waze.uid.stats.s.class), null, null), aj.f(), (o) bVar4.a(new h.g.b.m(o.class), null, null));
            case 9:
                int i25 = m.f44536a;
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.sharedui.api.e(h.o.g.f48282a);
            case 10:
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i26 = iIntValue6 & 3;
                int i27 = iIntValue6 & 1;
                int i28 = aa.f44189a;
                if (composer6.shouldExecute(i26 != 2, i27)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1240031097, iIntValue6, -1, "com.waze.uid.fragments.ComposableSingletons$WazeWelcomeScreenKt.lambda$-1240031097.<anonymous> (WazeWelcomeScreen.kt:279)");
                    }
                    TextKt.m4275Text4IGK_g("Username", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, (TextStyle) null, composer6, 6, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return ab.f48028a;
            case 11:
                Composer composer7 = (Composer) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i29 = iIntValue7 & 3;
                int i30 = iIntValue7 & 1;
                int i31 = aa.f44189a;
                if (composer7.shouldExecute(i29 != 2, i30)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-896932994, iIntValue7, -1, "com.waze.uid.fragments.ComposableSingletons$WazeWelcomeScreenKt.lambda$-896932994.<anonymous> (WazeWelcomeScreen.kt:295)");
                    }
                    TextKt.m4275Text4IGK_g("Password", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, (TextStyle) null, composer7, 6, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return ab.f48028a;
            case 12:
                org.a.d.k.b bVar5 = (org.a.d.k.b) obj;
                int i32 = com.waze.cf.i.f22243a;
                x.f(bVar5, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i33 = ar.f48106a;
                return new com.waze.car_lib.f.w((com.waze.car_lib.f.x) bVar5.a(new h.g.b.m(com.waze.car_lib.f.x.class), null, null), (com.waze.app_nav.w) bVar5.a(new h.g.b.m(com.waze.app_nav.w.class), null, null));
            case 13:
                org.a.d.k.b bVar6 = (org.a.d.k.b) obj;
                int i34 = com.waze.cf.i.f22243a;
                x.f(bVar6, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i35 = ar.f48106a;
                return new com.waze.car_lib.f.x((af) bVar6.a(new h.g.b.m(af.class), null, null), (com.waze.location.q) bVar6.a(new h.g.b.m(com.waze.location.q.class), null, null), (com.waze.location.b) bVar6.a(new h.g.b.m(com.waze.location.b.class), null, null));
            case 14:
                org.a.d.k.b bVar7 = (org.a.d.k.b) obj;
                int i36 = com.waze.cf.i.f22243a;
                x.f(bVar7, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i37 = ar.f48106a;
                return new com.waze.car_lib.f.t((af) bVar7.a(new h.g.b.m(af.class), null, null));
            case 15:
                org.a.d.k.b bVar8 = (org.a.d.k.b) obj;
                int i38 = com.waze.cf.i.f22243a;
                x.f(bVar8, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i39 = ar.f48106a;
                return new com.waze.car_lib.f.s((com.waze.car_lib.f.t) bVar8.a(new h.g.b.m(com.waze.car_lib.f.t.class), null, null));
            case 16:
                org.a.d.k.b bVar9 = (org.a.d.k.b) obj;
                int i40 = com.waze.cf.i.f22243a;
                x.f(bVar9, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i41 = ar.f48106a;
                br brVar = (br) bVar9.a(new h.g.b.m(br.class), null, null);
                db dbVar = (db) bVar9.a(new h.g.b.m(db.class), null, null);
                com.waze.car_lib.c.d dVar = (com.waze.car_lib.c.d) bVar9.a(new h.g.b.m(com.waze.car_lib.c.d.class), null, null);
                com.waze.car_lib.j.x xVar = (com.waze.car_lib.j.x) bVar9.a(new h.g.b.m(com.waze.car_lib.j.x.class), null, null);
                af afVar = (af) bVar9.a(new h.g.b.m(af.class), null, null);
                bn bnVar = (bn) bVar9.a(new h.g.b.m(bn.class), null, null);
                com.waze.navigate.b bVar10 = (com.waze.navigate.b) bVar9.a(new h.g.b.m(com.waze.navigate.b.class), null, null);
                com.waze.car_lib.d.b bVar11 = (com.waze.car_lib.d.b) bVar9.a(new h.g.b.m(com.waze.car_lib.d.b.class), null, null);
                com.waze.config.b bVar12 = ConfigValues.CONFIG_VALUE_BEACONS_POPUP_OPTOUT;
                x.e(bVar12, "CONFIG_VALUE_BEACONS_POPUP_OPTOUT");
                com.waze.config.b bVar13 = ConfigValues.CONFIG_VALUE_REPORTING_WAZE_ASKS_IN_CAR_ENABLED;
                x.e(bVar13, "CONFIG_VALUE_REPORTING_WAZE_ASKS_IN_CAR_ENABLED");
                return new v(brVar, dbVar, dVar, xVar, bnVar, afVar, bVar10, bVar11, bVar12, bVar13, (com.waze.car_lib.c.i) bVar9.a(new h.g.b.m(com.waze.car_lib.c.i.class), null, null), (com.waze.main_screen.af.a.i) bVar9.a(new h.g.b.m(com.waze.main_screen.af.a.i.class), null, null), (com.waze.car_lib.b.ap) bVar9.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null), (ce) bVar9.a(new h.g.b.m(ce.class), null, null), (com.waze.navigate.a.f) bVar9.a(new h.g.b.m(com.waze.navigate.a.f.class), null, null), (ct) bVar9.a(new h.g.b.m(ct.class), null, null), (n) bVar9.a(new h.g.b.m(n.class), null, null));
            case 17:
                org.a.d.k.b bVar14 = (org.a.d.k.b) obj;
                int i42 = com.waze.cf.i.f22243a;
                x.f(bVar14, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i43 = ar.f48106a;
                return new ed((ej) bVar14.a(new h.g.b.m(v.class), null, null), (db) bVar14.a(new h.g.b.m(db.class), null, null), (com.waze.car_lib.d.b) bVar14.a(new h.g.b.m(com.waze.car_lib.d.b.class), null, null), (com.waze.shared_infra.i.b) bVar14.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null));
            case 18:
                org.a.d.k.b bVar15 = (org.a.d.k.b) obj;
                int i44 = com.waze.cf.k.f22246a;
                x.f(bVar15, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i45 = ar.f48106a;
                return new com.waze.cf.c.l((MessageBoxNativeManager) bVar15.a(new h.g.b.m(MessageBoxNativeManager.class), null, null), (com.waze.shared_infra.o.a) bVar15.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (com.waze.app_nav.hub.b.c) bVar15.a(new h.g.b.m(com.waze.app_nav.hub.b.c.class), null, null), (kd) bVar15.a(new h.g.b.m(kd.class), null, null), (com.waze.ac.r) bVar15.a(new h.g.b.m(com.waze.ac.r.class), null, null), (com.waze.ac.b.e) bVar15.a(new h.g.b.m(com.waze.ac.b.e.class), null, null), (com.waze.ac.b.b) bVar15.a(new h.g.b.m(com.waze.ac.b.b.class), null, null), (kb) bVar15.a(new h.g.b.m(kb.class), null, null), (com.waze.sharedrive.d.a) bVar15.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null), com.waze.settings.tree.c.f.g(bVar15, "DisconnectedCarPopupListener"));
            case 19:
                org.a.d.k.b bVar16 = (org.a.d.k.b) obj;
                int i46 = com.waze.cf.k.f22246a;
                x.f(bVar16, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i47 = ar.f48106a;
                return new com.waze.cf.d.c((bn) bVar16.a(new h.g.b.m(bn.class), null, null));
            default:
                org.a.d.k.b bVar17 = (org.a.d.k.b) obj;
                int i48 = com.waze.cf.k.f22246a;
                x.f(bVar17, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i49 = ar.f48106a;
                ao aoVar = (ao) bVar17.a(new h.g.b.m(ao.class), null, null);
                com.waze.cf.c.l lVar = (com.waze.cf.c.l) bVar17.a(new h.g.b.m(com.waze.cf.c.l.class), null, null);
                com.waze.cf.d.c cVar2 = (com.waze.cf.d.c) bVar17.a(new h.g.b.m(com.waze.cf.d.c.class), null, null);
                int i50 = av.f51370a;
                return new com.waze.cf.h(aoVar, lVar, cVar2, aj.e(kotlinx.coroutines.e.ac.f51860a.c()));
        }
    }
}
