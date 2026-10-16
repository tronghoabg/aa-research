package com.waze.app_nav.hub;

import android.app.Application;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.waze.R;
import com.waze.iw;
import com.waze.mo;
import h.g.b.ar;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class c implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f15290a;

    public /* synthetic */ c(int i2) {
        this.f15290a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) throws org.a.a.a.a {
        int i2 = 13;
        int i3 = 2;
        int i4 = 0;
        switch (this.f15290a) {
            case 0:
                org.a.d.k.b bVar = (org.a.d.k.b) obj;
                int i5 = d.f15338a;
                h.g.b.x.f(bVar, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                break;
            case 1:
                org.a.d.k.b bVar2 = (org.a.d.k.b) obj;
                int i6 = d.f15338a;
                h.g.b.x.f(bVar2, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                break;
            case 2:
                break;
            case 3:
                int i7 = com.waze.asks.ac.f15487a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                break;
            case 4:
                int i8 = com.waze.asks.ac.f15487a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                break;
            case 5:
                org.a.d.k.b bVar3 = (org.a.d.k.b) obj;
                int i9 = com.waze.asks.ac.f15487a;
                h.g.b.x.f(bVar3, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i10 = ar.f48106a;
                break;
            case 6:
                org.a.d.k.b bVar4 = (org.a.d.k.b) obj;
                int i11 = com.waze.asks.ac.f15487a;
                h.g.b.x.f(bVar4, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i12 = ar.f48106a;
                break;
            case 7:
                org.a.d.k.b bVar5 = (org.a.d.k.b) obj;
                int i13 = com.waze.asks.ac.f15487a;
                h.g.b.x.f(bVar5, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i14 = ar.f48106a;
                break;
            case 8:
                org.a.d.k.b bVar6 = (org.a.d.k.b) obj;
                int i15 = com.waze.asks.ac.f15487a;
                h.g.b.x.f(bVar6, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i16 = ar.f48106a;
                com.waze.ap.b.n nVar = (com.waze.ap.b.n) bVar6.a(new h.g.b.m(com.waze.ap.b.n.class), null, null);
                kotlinx.coroutines.ab abVarB = av.b();
                com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("WazeAsksGrpcApi");
                h.g.b.x.e(eVarD, "create(...)");
                break;
            case 9:
                org.a.d.k.b bVar7 = (org.a.d.k.b) obj;
                int i17 = com.waze.asks.ac.f15487a;
                h.g.b.x.f(bVar7, "$this$viewModel");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i18 = ar.f48106a;
                break;
            case 10:
                org.a.d.k.b bVar8 = (org.a.d.k.b) obj;
                int i19 = com.waze.asks.ac.f15487a;
                h.g.b.x.f(bVar8, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i20 = ar.f48106a;
                break;
            case 11:
                int i21 = com.waze.beacons.v.f16288a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                break;
            case 12:
                org.a.d.k.b bVar9 = (org.a.d.k.b) obj;
                int i22 = com.waze.beacons.v.f16288a;
                h.g.b.x.f(bVar9, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i23 = ar.f48106a;
                break;
            case 13:
                org.a.d.k.b bVar10 = (org.a.d.k.b) obj;
                int i24 = com.waze.beacons.v.f16288a;
                h.g.b.x.f(bVar10, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i25 = ar.f48106a;
                break;
            case 14:
                org.a.d.k.b bVar11 = (org.a.d.k.b) obj;
                int i26 = com.waze.beacons.v.f16288a;
                h.g.b.x.f(bVar11, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                Application applicationG = k.a.k.g(bVar11);
                int i27 = ar.f48106a;
                break;
            case 15:
                int i28 = com.waze.l.a.f25079a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                break;
            case 16:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i29 = iIntValue & 3;
                int i30 = iIntValue & 1;
                int i31 = com.waze.l.s.f25119a;
                if (composer.shouldExecute(i29 != 2, i30)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2085181324, iIntValue, -1, "com.waze.bluetooth.ComposableSingletons$BluetoothPermissionDialogKt.lambda$2085181324.<anonymous> (BluetoothPermissionDialog.kt:421)");
                    }
                    Modifier modifierM1972backgroundbw27NRU$default = BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Color.Companion.m8258getGray0d7_KjU(), null, 2, null);
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
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new mo(i2);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    h.g.a.l lVar = (h.g.a.l) objRememberedValue;
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new iw(5);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    h.g.a.a aVar = (h.g.a.a) objRememberedValue2;
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new iw(6);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    h.g.a.a aVar2 = (h.g.a.a) objRememberedValue3;
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = new iw(7);
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    com.waze.l.m.o(false, lVar, aVar, aVar2, (h.g.a.a) objRememberedValue4, composer, 28086);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 17:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i32 = iIntValue2 & 3;
                int i33 = iIntValue2 & 1;
                int i34 = com.waze.l.s.f25119a;
                if (composer2.shouldExecute(i32 != 2, i33)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1055709622, iIntValue2, -1, "com.waze.bluetooth.ComposableSingletons$BluetoothPermissionDialogKt.lambda$1055709622.<anonymous> (BluetoothPermissionDialog.kt:237)");
                    }
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.BEACONS_BLUETOOTH_PERMISSIONS_RATIONALE_TEXT, composer2, 0), (Modifier) null, com.waze.bz.a.d(composer2, 0).p(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer2).a(), composer2, 0, 0, 65530);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            case 18:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i35 = iIntValue3 & 3;
                int i36 = iIntValue3 & 1;
                int i37 = com.waze.l.s.f25119a;
                if (composer3.shouldExecute(i35 != 2, i36)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-789759116, iIntValue3, -1, "com.waze.bluetooth.ComposableSingletons$BluetoothPermissionDialogKt.lambda$-789759116.<anonymous> (BluetoothPermissionDialog.kt:290)");
                    }
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.BEACONS_TURN_ON_BLUETOOTH_TEXT, composer3, 0), (Modifier) null, com.waze.bz.a.d(composer3, 0).p(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer3).a(), composer3, 0, 0, 65530);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
            case 19:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i38 = iIntValue4 & 3;
                int i39 = iIntValue4 & 1;
                int i40 = com.waze.l.s.f25119a;
                if (composer4.shouldExecute(i38 != 2, i39)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-550665995, iIntValue4, -1, "com.waze.bluetooth.ComposableSingletons$BluetoothPermissionDialogKt.lambda$-550665995.<anonymous> (BluetoothPermissionDialog.kt:343)");
                    }
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.BEACONS_GO_TO_SETTINGS_FOR_PERMISSIONS_TEXT, composer4, 0), (Modifier) null, com.waze.bz.a.d(composer4, 0).p(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer4).a(), composer4, 0, 0, 65530);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                break;
            default:
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i41 = iIntValue5 & 3;
                int i42 = iIntValue5 & 1;
                int i43 = com.waze.l.s.f25119a;
                if (composer5.shouldExecute(i41 != 2, i42)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(89591957, iIntValue5, -1, "com.waze.bluetooth.ComposableSingletons$BluetoothPermissionDialogKt.lambda$89591957.<anonymous> (BluetoothPermissionDialog.kt:389)");
                    }
                    Modifier modifierM1972backgroundbw27NRU$default2 = BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Color.Companion.m8258getGray0d7_KjU(), null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer5, modifierM1972backgroundbw27NRU$default2);
                    h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                    if (!(composer5.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor2);
                    } else {
                        composer5.useNode();
                    }
                    Updater.m7351setimpl(composer5, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composer5, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composer5, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composer5, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composer5, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Object objRememberedValue5 = composer5.rememberedValue();
                    if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = new mo(15);
                        composer5.updateRememberedValue(objRememberedValue5);
                    }
                    h.g.a.l lVar2 = (h.g.a.l) objRememberedValue5;
                    Object objRememberedValue6 = composer5.rememberedValue();
                    if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                        objRememberedValue6 = new iw(11);
                        composer5.updateRememberedValue(objRememberedValue6);
                    }
                    h.g.a.a aVar3 = (h.g.a.a) objRememberedValue6;
                    Object objRememberedValue7 = composer5.rememberedValue();
                    if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                        objRememberedValue7 = new iw(12);
                        composer5.updateRememberedValue(objRememberedValue7);
                    }
                    h.g.a.a aVar4 = (h.g.a.a) objRememberedValue7;
                    Object objRememberedValue8 = composer5.rememberedValue();
                    if (objRememberedValue8 == Composer.Companion.getEmpty()) {
                        objRememberedValue8 = new iw(13);
                        composer5.updateRememberedValue(objRememberedValue8);
                    }
                    com.waze.l.m.n(false, lVar2, aVar3, aVar4, (h.g.a.a) objRememberedValue8, composer5, 28086);
                    composer5.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                break;
        }
        return h.ab.f48028a;
    }
}
