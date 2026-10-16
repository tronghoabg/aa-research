package com.waze.main_screen.c.d;

import android.content.res.Configuration;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnPlacedModifierKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.media3.muxer.MuxerUtil;
import com.waze.authentication.at;
import com.waze.l.h;
import com.waze.map.b.ah;
import com.waze.map.isolated.k;
import com.waze.nav_connect.a.l;
import com.waze.nav_connect.b.j;
import com.waze.strings.DisplayStrings;
import com.waze.ui.d.s;
import com.waze.ui.e.p;
import com.waze.ui.e.q;
import com.waze.ui.e.v;
import com.waze.ui.e.w;
import com.waze.ui.e.y;
import com.waze.z.a.aa;
import com.waze.z.a.be;
import h.ab;
import h.g.b.x;
import h.l.f;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e {
    static final ab b(State state, BoxScope boxScope, Composer composer, int i2) {
        x.f(boxScope, "$this$ButtonPackButton");
        if ((i2 & 6) == 0) {
            i2 |= true != composer.changed(boxScope) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(389612594, i2, -1, "com.waze.main_screen.button_pack.nav_connect_button.NavConnectButton.<anonymous> (NavConnectButton.kt:111)");
            }
            if (g(state).e() instanceof l) {
                composer.startReplaceGroup(1947219412);
                h(boxScope.align(Modifier.Companion, Alignment.Companion.getTopEnd()), composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1947307824);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab c(State state, BoxScope boxScope, Composer composer, int i2) {
        int i3;
        x.f(boxScope, "$this$ButtonPackItem");
        if ((i2 & 6) == 0) {
            i3 = (true != composer.changed(boxScope) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-145785382, i3, -1, "com.waze.main_screen.button_pack.nav_connect_button.NavConnectButton.<anonymous> (NavConnectButton.kt:122)");
            }
            ImageBitmap imageBitmapB = g(state).b();
            if (imageBitmapB != null) {
                composer.startReplaceGroup(-880294801);
                ImageKt.m2038Image5hnEew(imageBitmapB, g(state).c(), boxScope.align(SizeKt.m2822size3ABfNKs(Modifier.Companion, 32.0f), Alignment.Companion.getCenter()), null, null, 0.0f, null, 0, composer, 0, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_1);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-880103903);
                ImageKt.Image(PainterResources_androidKt.painterResource(com.waze.design_components.b.d.cg.b(), composer, 0), g(state).c(), boxScope.align(SizeKt.m2822size3ABfNKs(Modifier.Companion, 32.0f), Alignment.Companion.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, Painter.$stable, 120);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v18 */
    public static final void d(Modifier modifier, j jVar, h.g.a.a aVar, boolean z, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        int i4;
        String str;
        Object obj;
        ?? r5;
        x.f(jVar, "navConnectButtonStateHolder");
        x.f(aVar, "canExpand");
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1169520464);
        if (i5 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(jVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1169520464, i3, -1, "com.waze.main_screen.button_pack.nav_connect_button.NavConnectButton (NavConnectButton.kt:64)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(jVar.b(), null, composerStartRestartGroup, 0, 1);
            int i6 = i3 & 112;
            boolean z2 = i6 == 32;
            boolean z3 = (i3 & 57344) == 16384;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z3 | z2) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.car_lib.e.d(jVar, aVar2, 1, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            h.g.a.a aVar3 = (h.g.a.a) objRememberedValue;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-408981674);
                v vVarB = w.b(composerStartRestartGroup);
                boolean z4 = ((Boolean) aVar.invoke()).booleanValue() && g(stateCollectAsState).d();
                ImageBitmap imageBitmapB = g(stateCollectAsState).b();
                q pVar = imageBitmapB != null ? new p(imageBitmapB) : new q(com.waze.design_components.b.d.cg.b());
                k kVarE = g(stateCollectAsState).e();
                Boolean boolValueOf = Boolean.valueOf(z4);
                boolean zChanged = composerStartRestartGroup.changed(z4) | composerStartRestartGroup.changed(vVarB) | composerStartRestartGroup.changed(stateCollectAsState);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    str = null;
                    obj = (h.g.a.p) new c(z4, vVarB, stateCollectAsState, null);
                    composerStartRestartGroup.updateRememberedValue(obj);
                } else {
                    obj = objRememberedValue2;
                    str = null;
                }
                EffectsKt.LaunchedEffect(kVarE, boolValueOf, (h.g.a.p) obj, composerStartRestartGroup, 0);
                y yVar = new y(pVar, str, 14);
                Modifier modifierA = com.waze.ui.r.a.d.d.a(modifier, com.waze.ui.r.a.d.c.dh, null);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (i6 == 32 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    r5 = 1;
                    objRememberedValue3 = (f) new d(jVar, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    r5 = 1;
                }
                w.f(yVar, modifierA, vVarB, 0L, aVar3, (h.g.a.a) ((f) objRememberedValue3), ComposableLambdaKt.rememberComposableLambda(389612594, r5, new a(stateCollectAsState, r5), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 8);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-407508089);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (i6 == 32 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                    i4 = 0;
                    objRememberedValue4 = (f) new d(jVar, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    i4 = 0;
                }
                s.j(aVar3, modifier, 0L, (h.g.a.a) ((f) objRememberedValue4), ComposableLambdaKt.rememberComposableLambda(-145785382, true, new a(stateCollectAsState, i4), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 << 3) & 112) | 24576, 4);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new h(modifier, jVar, aVar, z, aVar2, i2, 4));
        }
    }

    static final ab e(Modifier modifier, int i2, Composer composer) {
        h(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final void f(com.waze.main_screen.d.a.d dVar, Modifier modifier, boolean z, int i2, Composer composer, int i3) {
        int i4;
        int i5;
        int i6;
        long jM11307getZeronOccac;
        x.f(dVar, "stateHolder");
        int i7 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(966700799);
        if (i7 == 0) {
            i4 = (true != composerStartRestartGroup.changed(dVar) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z) ? 128 : 256;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i5 = i2;
            i4 |= true != composerStartRestartGroup.changed(i5) ? 1024 : 2048;
        } else {
            i5 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(966700799, i4, -1, "com.waze.main_screen.button_pack.compass.CompassV1 (CompassV1.kt:49)");
            }
            boolean z2 = ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 2;
            boolean zV = com.waze.bz.a.d(composerStartRestartGroup, 0).V();
            ah ahVar = (ah) SnapshotStateKt.collectAsState(dVar.a(), null, composerStartRestartGroup, 0, 1).getValue();
            if (ahVar == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.main_screen.c.c.a(dVar, modifier, z, i5, i3, 2));
                    return;
                }
                return;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableIntState mutableIntState = (MutableIntState) objRememberedValue2;
            Offset offset = (Offset) mutableState.getValue();
            int iIntBitsToFloat = (offset != null ? (int) Float.intBitsToFloat((int) (offset.m7990unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) : 0) + mutableIntState.getIntValue() + ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo2121roundToPx0680j_4(22.0f);
            Offset offset2 = (Offset) mutableState.getValue();
            if (offset2 != null) {
                Float.intBitsToFloat((int) (offset2.m7990unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
            }
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1228683199);
                composerStartRestartGroup.endReplaceGroup();
                jM11307getZeronOccac = IntOffset.Companion.m11307getZeronOccac();
            } else {
                composerStartRestartGroup.startReplaceGroup(1228737914);
                if (z2) {
                    composerStartRestartGroup.startReplaceGroup(1228885472);
                    composerStartRestartGroup.endReplaceGroup();
                    i6 = 0;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1286568765);
                    int intValue = mutableIntState.getIntValue() + ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo2121roundToPx0680j_4(22.0f);
                    composerStartRestartGroup.endReplaceGroup();
                    i6 = -intValue;
                }
                long j2 = (z2 ? -iIntBitsToFloat : 0) & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
                composerStartRestartGroup.endReplaceGroup();
                jM11307getZeronOccac = (i6 << 32) | j2;
            }
            State<IntOffset> stateM1870animateIntOffsetAsStateHyPO7BM = AnimateAsStateKt.m1870animateIntOffsetAsStateHyPO7BM(jM11307getZeronOccac, z ? aa.d(com.waze.z.a.x.f46210a) : aa.c(com.waze.z.a.x.f46210a), "CompassV1", null, composerStartRestartGroup, 384, 8);
            boolean zChanged = composerStartRestartGroup.changed(stateM1870animateIntOffsetAsStateHyPO7BM);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new at(stateM1870animateIntOffsetAsStateHyPO7BM, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierM2822size3ABfNKs = SizeKt.m2822size3ABfNKs(OffsetKt.offset(modifier, (h.g.a.l) objRememberedValue3), 56.0f);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new at(mutableIntState, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierM2822size3ABfNKs, (h.g.a.l) objRememberedValue4);
            int i8 = i4 & DisplayStrings.DS_TAP_TO_VERIFY;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (i8 == 256 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new com.waze.main_screen.c.c.b(z, mutableState, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Modifier modifierM1972backgroundbw27NRU$default = BackgroundKt.m1972backgroundbw27NRU$default(ClipKt.clip(com.waze.design_components.d.b.k(OnPlacedModifierKt.onPlaced(modifierOnSizeChanged, (h.g.a.l) objRememberedValue5), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape()), com.waze.bz.a.d(composerStartRestartGroup, 0).j(), null, 2, null);
            int i9 = i4 & 14;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (i9 == 4 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = new com.waze.beacons.a.a(dVar, 19);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            Modifier modifierJ = be.J(modifierM1972backgroundbw27NRU$default, false, null, (h.g.a.a) objRememberedValue6, composerStartRestartGroup, 0, 15);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierJ);
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
            Modifier modifierAlign = BoxScopeInstance.INSTANCE.align(com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.cO, null), Alignment.Companion.getCenter());
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                objRememberedValue7 = new com.waze.location.aa(11);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            h.g.a.l lVar = (h.g.a.l) objRememberedValue7;
            boolean zChanged2 = composerStartRestartGroup.changed(zV) | composerStartRestartGroup.changedInstance(ahVar);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue8 == Composer.Companion.getEmpty()) {
                objRememberedValue8 = new at(ahVar, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            AndroidView_androidKt.AndroidView(lVar, modifierAlign, (h.g.a.l) objRememberedValue8, composerStartRestartGroup, 6, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new com.waze.main_screen.c.c.a(dVar, modifier, z, i2, i3, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.waze.nav_connect.b.h g(State state) {
        return (com.waze.nav_connect.b.h) state.getValue();
    }

    private static final void h(final Modifier modifier, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1191568029);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1191568029, i3, -1, "com.waze.main_screen.button_pack.nav_connect_button.NavConnectStatusIndicator (NavConnectButton.kt:141)");
            }
            BoxKt.Box(com.waze.ui.r.a.d.d.a(BackgroundKt.m1971backgroundbw27NRU(PaddingKt.m2755padding3ABfNKs(BackgroundKt.m1971backgroundbw27NRU(SizeKt.m2822size3ABfNKs(ZIndexModifierKt.zIndex(OffsetKt.m2714offsetVpY3zN4(modifier, 4.0f, -4.0f), 1.0f), 12.0f), com.waze.bz.a.d(composerStartRestartGroup, 0).h(), RoundedCornerShapeKt.getCircleShape()), 2.0f), com.waze.bz.a.d(composerStartRestartGroup, 0).I(), RoundedCornerShapeKt.getCircleShape()), com.waze.ui.r.a.d.c.dk, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.main_screen.c.d.b
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return e.e(modifier, i2, (Composer) obj);
                }
            });
        }
    }
}
