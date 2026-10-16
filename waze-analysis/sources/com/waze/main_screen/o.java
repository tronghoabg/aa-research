package com.waze.main_screen;

import android.content.res.Configuration;
import android.os.Bundle;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import com.waze.R;
import com.waze.car_lib.r.cr;
import com.waze.ui.l.cg;
import com.waze.uid.c.bn;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class o implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f26679a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f26680b;

    public /* synthetic */ o(int i2) {
        this.f26680b = i2;
        this.f26679a = "CUSTOM_ITEM_";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v45, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = 19;
        int i3 = 16;
        int i4 = 14;
        int i5 = 2;
        switch (this.f26680b) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(976028303, iIntValue, -1, "com.waze.main_screen.WazeMainScreen.<anonymous> (MainScreenLayout.kt:55)");
                    }
                    NavHostController navHostControllerRememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], composer, 0);
                    org.a.d.k.b bVarA = org.a.c.a.a(composer);
                    org.a.b.b.d.f(composer);
                    boolean zChanged = composer.changed((Object) null) | composer.changed(bVarA);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        int i6 = h.g.b.ar.f48106a;
                        objRememberedValue = bVarA.a(new h.g.b.m(com.waze.map.b.ai.class), null, null);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    com.waze.map.b.ai aiVar = (com.waze.map.b.ai) objRememberedValue;
                    org.a.d.k.b bVarA2 = org.a.c.a.a(composer);
                    org.a.b.b.d.f(composer);
                    boolean zChanged2 = composer.changed((Object) null) | composer.changed(bVarA2);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        int i7 = h.g.b.ar.f48106a;
                        objRememberedValue2 = bVarA2.a(new h.g.b.m(com.waze.map.main.ab.class), null, null);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    com.waze.map.main.ab abVar = (com.waze.map.main.ab) objRememberedValue2;
                    h.g.b.x.f(aiVar, "mainMapController");
                    h.g.b.x.f(abVar, "mainMapGeometryController");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350707080, 0, -1, "com.waze.ui.map.rememberMainMapState (MainMapState.kt:17)");
                    }
                    boolean zChanged3 = composer.changed(aiVar) | composer.changed(abVar);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new com.waze.ui.p.g(aiVar, abVar);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    com.waze.ui.p.g gVar = (com.waze.ui.p.g) objRememberedValue3;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Object obj3 = this.f26679a;
                    be beVar = (be) obj3;
                    cg cgVarA = com.waze.an.c.q.a(beVar.d(), composer);
                    h.ab abVar2 = h.ab.f48028a;
                    boolean zChanged4 = composer.changed(obj3) | composer.changed(gVar);
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (zChanged4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = (h.g.a.p) new p(gVar, beVar, null);
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    EffectsKt.LaunchedEffect(abVar2, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) objRememberedValue4, composer, 6);
                    com.waze.main_screen.ac.m.c(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), ComposableLambdaKt.rememberComposableLambda(998108897, true, new com.waze.ab.c(beVar, navHostControllerRememberNavController, gVar, cgVarA, 5), composer, 54), composer, 54, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-562422250, iIntValue2, -1, "com.waze.ui.qr_login.InitialScreen.<anonymous> (QrLogin.kt:123)");
                    }
                    Object[] objArr = ((Configuration) composer2.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 1;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m2756paddingVpY3zN4(Modifier.Companion, 16.0f, objArr != false ? 48.0f : 10.0f), 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                    int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
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
                    Updater.m7351setimpl(composer2, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composer2, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextKt.m4276TextIbK3jfQ((AnnotatedString) this.f26679a, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, TextStyle.m10559copyp1EtxEg$default(TextStyle.Companion.getDefault(), com.waze.bz.a.d(composer2, 0).G(), objArr != false ? TextUnitKt.getSp(14) : TextUnitKt.getSp(12), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.Companion.m11011getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744444, null), composer2, 48, 0, 131068);
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.QR_LOGIN_BOTTOM_TEXT, composer2, 0), SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), com.waze.bz.a.d(composer2, 0).q(), objArr != false ? TextUnitKt.getSp(14) : TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, TextStyle.m10559copyp1EtxEg$default(TextStyle.Companion.getDefault(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.Companion.m11011getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composer2, 48, 0, 65520);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-119052846, iIntValue3, -1, "com.waze.ui.qr_login.Header.<anonymous> (QrLogin.kt:62)");
                    }
                    com.waze.z.a.be.h(com.waze.ui.r.a.c.c.b(R.string.QR_LOGIN_TITLE, composer3, 0), null, this.f26679a, null, null, com.waze.design_components.b.d.n, composer3, 196608, 26);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (composer4.shouldExecute((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1246886330, iIntValue4, -1, "com.waze.ui.shared_drive.DriverListItem.<anonymous> (LiveShareParticipantListItem.kt:182)");
                    }
                    TextKt.m4275Text4IGK_g(((com.waze.ui.z.al) this.f26679a).c(), com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.dK, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer4).m(), composer4, 48, 0, 65532);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                break;
            case 4:
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (composer5.shouldExecute((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-898868998, iIntValue5, -1, "com.waze.ui.toll_info_dialog.TollInfoDialog.<anonymous> (TollInfoDialog.kt:88)");
                    }
                    TextKt.m4276TextIbK3jfQ((AnnotatedString) this.f26679a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, com.waze.bz.a.h(composer5).a(), composer5, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                break;
            case 5:
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (composer6.shouldExecute((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1662424208, iIntValue6, -1, "com.waze.ui.trip_overview.PreferredRoutePopup.<anonymous> (PreferredRoutePopup.kt:63)");
                    }
                    TextKt.m4275Text4IGK_g((String) this.f26679a, com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.cp, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer6).a(), composer6, 48, 0, 65532);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                break;
            case 6:
                Composer composer7 = (Composer) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (composer7.shouldExecute((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1697811505, iIntValue7, -1, "com.waze.ui.venue_freshness.UpdateVenueLocationPopupDialog.<anonymous> (VenueFreshnessPopupDialogUI.kt:60)");
                    }
                    TextKt.m4275Text4IGK_g((String) this.f26679a, com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.ec, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer7).a(), composer7, 48, 0, 65532);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                break;
            case 7:
                Composer composer8 = (Composer) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i8 = iIntValue8 & 3;
                int i9 = iIntValue8 & 1;
                int i10 = com.waze.ui.af.ap.f41852a;
                if (composer8.shouldExecute(i8 != 2, i9)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1380503864, iIntValue8, -1, "com.waze.ui.voices.VoiceSettingsScreen.<anonymous> (VoiceSettingsScreen.kt:230)");
                    }
                    Object obj4 = this.f26679a;
                    String strB = com.waze.ui.r.a.c.c.b(R.string.VOICE_DIRECTIONS, composer8, 0);
                    boolean zChanged5 = composer8.changed(obj4);
                    Object objRememberedValue5 = composer8.rememberedValue();
                    if (zChanged5 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = new com.waze.speech.l(obj4, i5);
                        composer8.updateRememberedValue(objRememberedValue5);
                    }
                    com.waze.z.a.be.h(strB, null, (h.g.a.a) objRememberedValue5, null, ComposableLambdaKt.rememberComposableLambda(-1899005421, true, new com.waze.main_screen.c.d.a(obj4, i3), composer8, 54), null, composer8, 24576, 42);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                break;
            case 8:
                int iIntValue9 = ((Integer) obj).intValue();
                int i11 = com.waze.ui.af.ap.f41852a;
                h.g.b.x.f((com.waze.ui.af.q) obj2, "<unused var>");
                break;
            case 9:
                int iIntValue10 = ((Integer) obj).intValue();
                com.waze.ui.af.y yVar = (com.waze.ui.af.y) obj2;
                int i12 = com.waze.ui.af.ap.f41852a;
                h.g.b.x.f(yVar, "voice");
                break;
            case 10:
                Composer composer9 = (Composer) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (composer9.shouldExecute((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(710780829, iIntValue11, -1, "com.waze.uid.fragments.AddHomeAndWorkFragment.onCreateView.<anonymous>.<anonymous> (AddHomeAndWorkFragment.kt:39)");
                    }
                    Object obj5 = this.f26679a;
                    com.waze.uid.f.b bVar = ((com.waze.uid.c.b) obj5).f44239a;
                    if (bVar == null) {
                        h.g.b.x.j("viewModel");
                        bVar = null;
                    }
                    cr.d(false, null, null, null, ComposableLambdaKt.rememberComposableLambda(408304540, true, new com.waze.parking.f(obj5, SnapshotStateKt.collectAsState(bVar.a(), null, composer9, 0, 1), i2), composer9, 54), composer9, 24576);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                break;
            case 11:
                break;
            case 12:
                Composer composer10 = (Composer) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (composer10.shouldExecute((iIntValue12 & 3) != 2, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1968833629, iIntValue12, -1, "com.waze.uid.fragments.CheckPinCodeComposeFragment.onCreateView.<anonymous>.<anonymous> (CheckPinCodeFragmentCompose.kt:63)");
                    }
                    cr.d(false, null, null, null, ComposableLambdaKt.rememberComposableLambda(84991202, true, new o(this.f26679a, 11), composer10, 54), composer10, 24576);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                break;
            case 13:
                Composer composer11 = (Composer) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (composer11.shouldExecute((iIntValue13 & 3) != 2, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1937746795, iIntValue13, -1, "com.waze.uid.fragments.ChooseVehicleTypeFragment.onCreateView.<anonymous>.<anonymous> (ChooseVehicleTypeFragment.kt:65)");
                    }
                    Object obj6 = this.f26679a;
                    cr.d(false, null, null, null, ComposableLambdaKt.rememberComposableLambda(97758548, true, new com.waze.parking.f(obj6, SnapshotStateKt.collectAsState(((com.waze.uid.c.x) obj6).a().a(), null, composer11, 0, 1), 20), composer11, 54), composer11, 24576);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                break;
            case 14:
                Composer composer12 = (Composer) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (composer12.shouldExecute((iIntValue14 & 3) != 2, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-288426224, iIntValue14, -1, "com.waze.uid.fragments.CreateAccountFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (CreateAccountFragment.kt:32)");
                    }
                    Object obj7 = this.f26679a;
                    boolean zChangedInstance = composer12.changedInstance(obj7);
                    Object objRememberedValue6 = composer12.rememberedValue();
                    if (zChangedInstance || objRememberedValue6 == Composer.Companion.getEmpty()) {
                        objRememberedValue6 = new com.waze.speech.l(obj7, i4);
                        composer12.updateRememberedValue(objRememberedValue6);
                    }
                    h.g.a.a aVar = (h.g.a.a) objRememberedValue6;
                    boolean zChangedInstance2 = composer12.changedInstance(obj7);
                    Object objRememberedValue7 = composer12.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                        objRememberedValue7 = new com.waze.speech.l(obj7, 15);
                        composer12.updateRememberedValue(objRememberedValue7);
                    }
                    h.g.a.a aVar2 = (h.g.a.a) objRememberedValue7;
                    boolean zChangedInstance3 = composer12.changedInstance(obj7);
                    Object objRememberedValue8 = composer12.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue8 == Composer.Companion.getEmpty()) {
                        objRememberedValue8 = new com.waze.speech.l(obj7, i3);
                        composer12.updateRememberedValue(objRememberedValue8);
                    }
                    com.waze.ui.s.c.g(aVar, aVar2, (h.g.a.a) objRememberedValue8, composer12, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                break;
            case 15:
                Composer composer13 = (Composer) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (composer13.shouldExecute((iIntValue15 & 3) != 2, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1075015505, iIntValue15, -1, "com.waze.uid.fragments.CreateAccountFragment.onCreateView.<anonymous>.<anonymous> (CreateAccountFragment.kt:31)");
                    }
                    cr.d(false, null, null, null, ComposableLambdaKt.rememberComposableLambda(-288426224, true, new o(this.f26679a, i4), composer13, 54), composer13, 24576);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                break;
            case 16:
                break;
            case 17:
                Composer composer14 = (Composer) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (composer14.shouldExecute((iIntValue16 & 3) != 2, iIntValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(553749031, iIntValue16, -1, "com.waze.uid.fragments.EmailErrorComposeFragment.onCreateView.<anonymous>.<anonymous> (EmailErrorComposeFragment.kt:33)");
                    }
                    cr.d(false, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1705712922, true, new o(this.f26679a, i3), composer14, 54), composer14, 24576);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                break;
            case 18:
                Composer composer15 = (Composer) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (composer15.shouldExecute((iIntValue17 & 3) != 2, iIntValue17 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2035306965, iIntValue17, -1, "com.waze.uid.fragments.LoginAccountNotFoundComposeFragment.onCreateView.<anonymous>.<anonymous> (LoginAccountNotFoundFragmentCompose.kt:41)");
                    }
                    cr.d(false, null, null, null, ComposableLambdaKt.rememberComposableLambda(94819604, true, new o(this.f26679a, i2), composer15, 54), composer15, 24576);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                break;
            case 19:
                Composer composer16 = (Composer) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (composer16.shouldExecute((iIntValue18 & 3) != 2, iIntValue18 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(94819604, iIntValue18, -1, "com.waze.uid.fragments.LoginAccountNotFoundComposeFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (LoginAccountNotFoundFragmentCompose.kt:42)");
                    }
                    Object obj8 = this.f26679a;
                    boolean zChangedInstance4 = composer16.changedInstance(obj8);
                    Object objRememberedValue9 = composer16.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue9 == Composer.Companion.getEmpty()) {
                        objRememberedValue9 = new com.waze.speech.l(obj8, 18);
                        composer16.updateRememberedValue(objRememberedValue9);
                    }
                    com.waze.ui.u.g.i((h.g.a.a) objRememberedValue9, composer16, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                break;
            default:
                Composer composer17 = (Composer) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (composer17.shouldExecute((iIntValue19 & 3) != 2, iIntValue19 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2063370272, iIntValue19, -1, "com.waze.uid.fragments.LoginEmailUsernameFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (LoginEmailUsernameFragmentCompose.kt:28)");
                    }
                    Object obj9 = this.f26679a;
                    android.support.v4.app.ar arVar = (android.support.v4.app.ar) obj9;
                    Bundle arguments = arVar.getArguments();
                    String string = arguments != null ? arguments.getString("ARG_USERNAME") : null;
                    Bundle arguments2 = arVar.getArguments();
                    String string2 = arguments2 != null ? arguments2.getString("ARG_EMAIL") : null;
                    boolean zChangedInstance5 = composer17.changedInstance(obj9);
                    Object objRememberedValue10 = composer17.rememberedValue();
                    if (zChangedInstance5 || objRememberedValue10 == Composer.Companion.getEmpty()) {
                        objRememberedValue10 = new bn((com.waze.uid.c.be) obj9, z ? 1 : 0);
                        composer17.updateRememberedValue(objRememberedValue10);
                    }
                    h.g.a.p pVar = (h.g.a.p) objRememberedValue10;
                    boolean zChangedInstance6 = composer17.changedInstance(obj9);
                    Object objRememberedValue11 = composer17.rememberedValue();
                    if (zChangedInstance6 || objRememberedValue11 == Composer.Companion.getEmpty()) {
                        objRememberedValue11 = new com.waze.uid.c.a((com.waze.uid.c.be) obj9, 9);
                        composer17.updateRememberedValue(objRememberedValue11);
                    }
                    h.g.a.a aVar3 = (h.g.a.a) objRememberedValue11;
                    boolean zChangedInstance7 = composer17.changedInstance(obj9);
                    Object objRememberedValue12 = composer17.rememberedValue();
                    if (zChangedInstance7 || objRememberedValue12 == Composer.Companion.getEmpty()) {
                        objRememberedValue12 = new com.waze.uid.c.a((com.waze.uid.c.be) obj9, 10);
                        composer17.updateRememberedValue(objRememberedValue12);
                    }
                    com.waze.ui.u.g.h(string, string2, pVar, aVar3, (h.g.a.a) objRememberedValue12, composer17, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer17.skipToGroupEnd();
                }
                break;
        }
        return h.ab.f48028a;
    }

    public /* synthetic */ o(Object obj, int i2) {
        this.f26680b = i2;
        this.f26679a = obj;
    }
}
