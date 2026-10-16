package com.waze.main_screen.p.a.b.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.waze.R;
import com.waze.asks.ak;
import com.waze.jni.protos.navigate.NavigationLane;
import com.waze.jni.protos.navigate.NavigationLaneAngle;
import com.waze.main_screen.p.a.b.b.ae;
import com.waze.main_screen.p.a.b.b.al;
import com.waze.main_screen.p.a.b.b.am;
import com.waze.navigate.bx;
import com.waze.strings.DisplayStrings;
import com.waze.z.a.b.ad;
import com.waze.z.a.be;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ab {
    public static /* synthetic */ com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.i a(h.g.a.a aVar, h.g.a.a aVar2, Ref ref, boolean z, State state, Context context) {
        h.g.b.x.f(context, "context");
        aa aaVar = new aa(aVar, aVar2);
        com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.i iVar = new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.i(context);
        ref.setValue(iVar);
        iVar.e(aaVar);
        iVar.a();
        iVar.f(r(state), z);
        return iVar;
    }

    public static /* synthetic */ h.ab b(boolean z, State state, com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.i iVar) {
        h.g.b.x.f(iVar, "etaScrollView");
        iVar.f(r(state), z);
        return h.ab.f48028a;
    }

    public static final void c(Modifier modifier, am amVar, boolean z, h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        State state;
        boolean z2;
        h.g.b.x.f(modifier, "modifier");
        h.g.b.x.f(amVar, "etaMidSectionStateHolder");
        h.g.b.x.f(aVar, "onComponentClicked");
        h.g.b.x.f(aVar2, "onAlternateRoutesClicked");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1349476984);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(amVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1349476984, i3, -1, "com.waze.main_screen.mid_drive.eta_drawer.presentation.compose.EtaMidSection (EtaMidSection.kt:26)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(amVar.a(), null, composerStartRestartGroup, 0, 1);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Ref();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Ref ref = (Ref) objRememberedValue;
            Boolean boolValueOf = Boolean.valueOf(com.waze.bz.a.d(composerStartRestartGroup, 0).V());
            Integer numValueOf = Integer.valueOf(((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).uiMode);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(ref);
            n nVarRememberedValue = composerStartRestartGroup.rememberedValue();
            int i5 = 3;
            if (zChangedInstance || nVarRememberedValue == Composer.Companion.getEmpty()) {
                nVarRememberedValue = new n(ref, (h.c.e) null, 3, (char[]) null);
                composerStartRestartGroup.updateRememberedValue(nVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(boolValueOf, numValueOf, (h.g.a.p) nVarRememberedValue, composerStartRestartGroup, 0);
            Modifier modifierThen = modifier.then(BackgroundKt.m1972backgroundbw27NRU$default(Modifier.Companion, com.waze.bz.a.d(composerStartRestartGroup, 0).e(), null, 2, null));
            boolean zChangedInstance2 = ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | composerStartRestartGroup.changedInstance(ref) | composerStartRestartGroup.changed(stateCollectAsState);
            boolean z3 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance2 || z3) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                state = stateCollectAsState;
                z2 = z;
                z zVar = new z(aVar, aVar2, ref, z2, state, 0);
                composerStartRestartGroup.updateRememberedValue(zVar);
                objRememberedValue2 = zVar;
            } else {
                state = stateCollectAsState;
                z2 = z;
            }
            h.g.a.l lVar = (h.g.a.l) objRememberedValue2;
            boolean zChanged = composerStartRestartGroup.changed(state) | z3;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new com.waze.main_screen.c.c.b(z2, state, i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            AndroidView_androidKt.AndroidView(lVar, modifierThen, (h.g.a.l) objRememberedValue3, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.l.h(modifier, amVar, z, aVar, aVar2, i2, 5));
        }
    }

    public static final List d(List list) {
        h.g.b.x.f(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(h.a.i.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            List<NavigationLaneAngle> angleList = ((NavigationLane) it.next()).getAngleList();
            h.g.b.x.e(angleList, "getAngleList(...)");
            List<NavigationLaneAngle> list3 = angleList;
            ArrayList arrayList2 = new ArrayList(h.a.i.q(list3, 10));
            for (NavigationLaneAngle navigationLaneAngle : list3) {
                arrayList2.add(new com.waze.ui.navbar.b(navigationLaneAngle.getAngle(), navigationLaneAngle.getIsSelected()));
            }
            arrayList.add(new com.waze.ui.navbar.c(arrayList2));
        }
        return arrayList;
    }

    public static /* synthetic */ x e(Ref ref, com.waze.ui.r.a.e.b.a aVar, boolean z, State state, Context context) {
        h.g.b.x.f(context, "viewContext");
        x xVar = new x(context);
        ref.setValue(xVar);
        xVar.f();
        xVar.h(aVar);
        xVar.i(s(state), z);
        return xVar;
    }

    public static /* synthetic */ h.ab f(com.waze.ui.r.a.e.b.a aVar, boolean z, com.waze.main_screen.p.a.b.b.c cVar, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.a aVar4, h.g.a.a aVar5, State state, x xVar) {
        h.g.b.x.f(xVar, "etaMainBar");
        xVar.g(new y(cVar, aVar2, aVar3, aVar4, aVar5));
        xVar.h(aVar);
        xVar.i(s(state), z);
        return h.ab.f48028a;
    }

    public static final void g(final Modifier modifier, final com.waze.main_screen.p.a.b.b.c cVar, final boolean z, final h.g.a.a aVar, final h.g.a.a aVar2, final h.g.a.a aVar3, final h.g.a.a aVar4, final h.g.a.a aVar5, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Ref ref;
        State state;
        int i4;
        boolean z2;
        Composer composer3;
        h.g.b.x.f(modifier, "modifier");
        h.g.b.x.f(cVar, "etaBarStateHolder");
        h.g.b.x.f(aVar, "onMainBarClicked");
        h.g.b.x.f(aVar2, "onAlternativeRoutesClicked");
        h.g.b.x.f(aVar3, "onSoundSettingsClicked");
        h.g.b.x.f(aVar4, "onSettingsClicked");
        h.g.b.x.f(aVar5, "onStopNavigationClicked");
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(189896750);
        if (i5 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(cVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar3) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar4) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar5) ? 4194304 : 8388608;
        }
        int i6 = i3;
        if (composerStartRestartGroup.shouldExecute((4793491 & i6) != 4793490, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(189896750, i6, -1, "com.waze.main_screen.mid_drive.eta_drawer.presentation.compose.EtaMainBar (EtaMainBar.kt:34)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(cVar.a(), null, composerStartRestartGroup, 0, 1);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Ref();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Ref ref2 = (Ref) objRememberedValue;
            Boolean boolValueOf = Boolean.valueOf(com.waze.bz.a.i(composerStartRestartGroup));
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(ref2);
            n nVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || nVarRememberedValue == Composer.Companion.getEmpty()) {
                nVarRememberedValue = new n(ref2, (h.c.e) null, 2, (byte[]) null);
                composerStartRestartGroup.updateRememberedValue(nVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(boolValueOf, (h.g.a.p<? super af, ? super h.c.e<? super h.ab>, ? extends Object>) nVarRememberedValue, composerStartRestartGroup, 0);
            final com.waze.ui.r.a.e.b.a aVarF = com.waze.bz.a.f(composerStartRestartGroup);
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final String strB = com.waze.ui.r.a.c.c.b(R.string.LOCK_SCREEN_NAVIGATION_DIRECTIONS_ETA_EXPAND_MESSAGE, composerStartRestartGroup, 0);
            final boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue();
            com.waze.ui.r.a.e.b.a aVar6 = aVarF;
            boolean zChanged = composerStartRestartGroup.changed(aVar6.ordinal());
            boolean z3 = (i6 & 112) == 32;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(context) | zChanged | z3 | ((i6 & 7168) == 2048) | composerStartRestartGroup.changed(zBooleanValue) | composerStartRestartGroup.changed(strB);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                ref = ref2;
                state = stateCollectAsState;
                i4 = 1048576;
                z2 = true;
                h.g.a.a aVar7 = new h.g.a.a() { // from class: com.waze.main_screen.p.a.b.a.u
                    @Override // h.g.a.a
                    public final Object invoke() {
                        if (aVarF != com.waze.ui.r.a.e.b.a.f43359a) {
                            h.g.a.a aVar8 = aVar;
                            cVar.d();
                            aVar8.invoke();
                        } else {
                            Context context2 = context;
                            if ((context2 instanceof Activity) && !zBooleanValue) {
                                com.waze.design_components.d.a((Activity) context2, strB, null);
                            }
                        }
                        return h.ab.f48028a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(aVar7);
                objRememberedValue2 = aVar7;
            } else {
                ref = ref2;
                state = stateCollectAsState;
                i4 = 1048576;
                z2 = true;
            }
            Ref ref3 = ref;
            int i7 = i4;
            Modifier modifierJ = be.J(modifier, false, null, (h.g.a.a) objRememberedValue2, composerStartRestartGroup, (i6 & 14) | 48, 14);
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
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(ref3) | composerStartRestartGroup.changed(aVar6.ordinal()) | composerStartRestartGroup.changed(state);
            boolean z4 = (i6 & DisplayStrings.DS_TAP_TO_VERIFY) == 256 ? z2 : false;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance3 | z4) || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new com.waze.car_lib.r.a.a(ref3, aVarF, z, state, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            boolean z5 = (3670016 & i6) == i7 ? z2 : false;
            boolean z6 = (57344 & i6) == 16384 ? z2 : false;
            boolean z7 = (458752 & i6) == 131072 ? z2 : false;
            if ((29360128 & i6) != 8388608) {
                z2 = false;
            }
            h.g.a.l lVar = (h.g.a.l) objRememberedValue3;
            boolean zChanged2 = z3 | z5 | z6 | z7 | z2 | composerStartRestartGroup.changed(aVar6.ordinal()) | composerStartRestartGroup.changed(state);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if ((zChanged2 || z4) || objRememberedValue4 == Composer.Companion.getEmpty()) {
                composer3 = composerStartRestartGroup;
                final State state2 = state;
                h.g.a.l lVar2 = new h.g.a.l() { // from class: com.waze.main_screen.p.a.b.a.v
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return ab.f(aVarF, z, cVar, aVar4, aVar2, aVar3, aVar5, state2, (x) obj);
                    }
                };
                composer3.updateRememberedValue(lVar2);
                objRememberedValue4 = lVar2;
            } else {
                composer3 = composerStartRestartGroup;
            }
            composer2 = composer3;
            AndroidView_androidKt.AndroidView(lVar, null, (h.g.a.l) objRememberedValue4, composer2, 0, 2);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.main_screen.p.a.b.a.w
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    Modifier modifier2 = modifier;
                    com.waze.main_screen.p.a.b.b.c cVar2 = cVar;
                    boolean z8 = z;
                    h.g.a.a aVar8 = aVar;
                    h.g.a.a aVar9 = aVar2;
                    h.g.a.a aVar10 = aVar3;
                    h.g.a.a aVar11 = aVar4;
                    ab.g(modifier2, cVar2, z8, aVar8, aVar9, aVar10, aVar11, aVar5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                    return h.ab.f48028a;
                }
            });
        }
    }

    public static /* synthetic */ h.ab h(t tVar, af afVar, State state, State state2, State state3, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i2) {
        h.g.b.x.f(animatedVisibilityScope, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-629700252, i2, -1, "com.waze.main_screen.mid_drive.eta_drawer.presentation.compose.EtaDrawerBottomSheet.<anonymous>.<anonymous> (EtaDrawerBottomSheet.kt:241)");
        }
        int i3 = 3;
        Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(WindowInsetsPadding_androidKt.navigationBarsPadding(com.waze.design_components.d.b.j(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), RectangleShapeKt.getRectangleShape())), null, false, 3, null);
        com.waze.main_screen.p.a.b.b.t tVarI = tVar.i();
        boolean z = tVar.e().i() != ad.f45734b;
        com.waze.main_screen.bottom_bars.scrollable_eta.i iVarA = t(state3).a();
        boolean z2 = iVarA != null && iVarA.b();
        boolean zChangedInstance = composer.changedInstance(afVar) | composer.changed(tVar);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new f(afVar, tVar, i3);
            composer.updateRememberedValue(objRememberedValue);
        }
        h.g.a.a aVar = (h.g.a.a) objRememberedValue;
        boolean zChanged = composer.changed(tVar);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new com.waze.car_lib.a.a(tVar, 9);
            composer.updateRememberedValue(objRememberedValue2);
        }
        h.g.a.a aVar2 = (h.g.a.a) objRememberedValue2;
        boolean zChangedInstance2 = composer.changedInstance(afVar) | composer.changed(state) | composer.changed(tVar);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new g(afVar, tVar, state, 2);
            composer.updateRememberedValue(objRememberedValue3);
        }
        h.g.a.a aVar3 = (h.g.a.a) objRememberedValue3;
        boolean zChangedInstance3 = composer.changedInstance(afVar) | composer.changed(tVar);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
            objRememberedValue4 = new f(afVar, tVar, 4);
            composer.updateRememberedValue(objRememberedValue4);
        }
        h.g.a.a aVar4 = (h.g.a.a) objRememberedValue4;
        boolean zChangedInstance4 = composer.changedInstance(afVar) | composer.changed(tVar) | composer.changed(state2);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance4 || objRememberedValue5 == Composer.Companion.getEmpty()) {
            objRememberedValue5 = new g(afVar, tVar, state2, i3);
            composer.updateRememberedValue(objRememberedValue5);
        }
        n(modifierWrapContentHeight$default, tVarI, z, z2, aVar, aVar2, aVar3, aVar4, (h.g.a.a) objRememberedValue5, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h.ab i(Modifier modifier, com.waze.z.a.b.x xVar, t tVar, af afVar, State state, State state2, boolean z, State state3, State state4, State state5, Composer composer, int i2) {
        int i3;
        int i4 = 1;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(278709420, i2, -1, "com.waze.main_screen.mid_drive.eta_drawer.presentation.compose.EtaDrawerBottomSheet.<anonymous>.<anonymous> (EtaDrawerBottomSheet.kt:134)");
            }
            Modifier modifierJ = com.waze.design_components.d.b.j(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), RectangleShapeKt.getRectangleShape());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierJ);
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
            Modifier modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), xVar, null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierNestedScroll$default);
            h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            com.waze.main_screen.p.a.b.b.c cVarH = tVar.h();
            boolean zBooleanValue = ((Boolean) state3.getValue()).booleanValue();
            boolean zChangedInstance = composer.changedInstance(afVar) | composer.changed(tVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new f(afVar, tVar, 10);
                composer.updateRememberedValue(objRememberedValue);
            }
            h.g.a.a aVar = (h.g.a.a) objRememberedValue;
            boolean zChangedInstance2 = composer.changedInstance(afVar) | composer.changed(state) | composer.changed(tVar);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new g(afVar, tVar, state, 7);
                composer.updateRememberedValue(objRememberedValue2);
            }
            h.g.a.a aVar2 = (h.g.a.a) objRememberedValue2;
            boolean zChangedInstance3 = composer.changedInstance(afVar) | composer.changed(tVar) | composer.changed(state2);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new g(afVar, tVar, state2, i4);
                composer.updateRememberedValue(objRememberedValue3);
            }
            h.g.a.a aVar3 = (h.g.a.a) objRememberedValue3;
            boolean zChangedInstance4 = composer.changedInstance(afVar) | composer.changed(tVar);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new f(afVar, tVar, i4);
                composer.updateRememberedValue(objRememberedValue4);
            }
            h.g.a.a aVar4 = (h.g.a.a) objRememberedValue4;
            boolean zChangedInstance5 = composer.changedInstance(afVar) | composer.changed(tVar);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new f(afVar, tVar, 0);
                composer.updateRememberedValue(objRememberedValue5);
            }
            g(modifierFillMaxWidth$default, cVarH, zBooleanValue, aVar, aVar2, aVar3, aVar4, (h.g.a.a) objRememberedValue5, composer, 6);
            if (z) {
                composer.startReplaceGroup(-622705705);
                Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null));
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer, 0);
                int iB3 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierNavigationBarsPadding);
                h.g.a.a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor3);
                } else {
                    composer.useNode();
                }
                Updater.m7351setimpl(composer, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composer, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m7351setimpl(composer, Integer.valueOf(iB3), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composer, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(RowScope.CC.weight$default(rowScopeInstance, SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null), 0.6f, false, 2, null), tVar.c(), false, null, false, 14, null);
                am amVarJ = tVar.j();
                boolean zBooleanValue2 = ((Boolean) state3.getValue()).booleanValue();
                boolean zChangedInstance6 = composer.changedInstance(afVar) | composer.changed(tVar);
                Object objRememberedValue6 = composer.rememberedValue();
                if (zChangedInstance6 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                    objRememberedValue6 = new f(afVar, tVar, 2);
                    composer.updateRememberedValue(objRememberedValue6);
                }
                h.g.a.a aVar5 = (h.g.a.a) objRememberedValue6;
                boolean zChangedInstance7 = composer.changedInstance(afVar) | composer.changed(state) | composer.changed(tVar);
                Object objRememberedValue7 = composer.rememberedValue();
                if (zChangedInstance7 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                    i3 = 0;
                    objRememberedValue7 = new g(afVar, tVar, state, i3);
                    composer.updateRememberedValue(objRememberedValue7);
                } else {
                    i3 = 0;
                }
                c(modifierVerticalScroll$default, amVarJ, zBooleanValue2, aVar5, (h.g.a.a) objRememberedValue7, composer, 0);
                Modifier modifierWeight$default = RowScope.CC.weight$default(rowScopeInstance, SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null), 0.4f, false, 2, null);
                com.waze.main_screen.p.a.b.b.t tVarI = tVar.i();
                boolean zBooleanValue3 = ((Boolean) state3.getValue()).booleanValue();
                com.waze.main_screen.bottom_bars.scrollable_eta.i iVarA = t(state5).a();
                int i5 = (iVarA == null || !iVarA.b()) ? i3 : 1;
                boolean zChangedInstance8 = composer.changedInstance(afVar) | composer.changed(tVar);
                Object objRememberedValue8 = composer.rememberedValue();
                int i6 = 5;
                if (zChangedInstance8 || objRememberedValue8 == Composer.Companion.getEmpty()) {
                    objRememberedValue8 = new f(afVar, tVar, i6);
                    composer.updateRememberedValue(objRememberedValue8);
                }
                h.g.a.a aVar6 = (h.g.a.a) objRememberedValue8;
                boolean zChanged = composer.changed(tVar);
                Object objRememberedValue9 = composer.rememberedValue();
                if (zChanged || objRememberedValue9 == Composer.Companion.getEmpty()) {
                    objRememberedValue9 = new com.waze.car_lib.a.a(tVar, 13);
                    composer.updateRememberedValue(objRememberedValue9);
                }
                h.g.a.a aVar7 = (h.g.a.a) objRememberedValue9;
                boolean zChangedInstance9 = composer.changedInstance(afVar) | composer.changed(state) | composer.changed(tVar);
                Object objRememberedValue10 = composer.rememberedValue();
                if (zChangedInstance9 || objRememberedValue10 == Composer.Companion.getEmpty()) {
                    objRememberedValue10 = new g(afVar, tVar, state, 4);
                    composer.updateRememberedValue(objRememberedValue10);
                }
                h.g.a.a aVar8 = (h.g.a.a) objRememberedValue10;
                boolean zChangedInstance10 = composer.changedInstance(afVar) | composer.changed(tVar);
                Object objRememberedValue11 = composer.rememberedValue();
                if (zChangedInstance10 || objRememberedValue11 == Composer.Companion.getEmpty()) {
                    objRememberedValue11 = new f(afVar, tVar, 8);
                    composer.updateRememberedValue(objRememberedValue11);
                }
                h.g.a.a aVar9 = (h.g.a.a) objRememberedValue11;
                boolean zChangedInstance11 = composer.changedInstance(afVar) | composer.changed(tVar) | composer.changed(state4);
                Object objRememberedValue12 = composer.rememberedValue();
                if (zChangedInstance11 || objRememberedValue12 == Composer.Companion.getEmpty()) {
                    objRememberedValue12 = new g(afVar, tVar, state4, i6);
                    composer.updateRememberedValue(objRememberedValue12);
                }
                n(modifierWeight$default, tVarI, zBooleanValue3, i5, aVar6, aVar7, aVar8, aVar9, (h.g.a.a) objRememberedValue12, composer, 0);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-620726975);
                Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.m2759paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, tVar.e().i() != ad.f45734b ? 160.0f : 0.0f, 7, null)), tVar.c(), false, null, false, 14, null);
                am amVarJ2 = tVar.j();
                boolean zBooleanValue4 = ((Boolean) state3.getValue()).booleanValue();
                boolean zChangedInstance12 = composer.changedInstance(afVar) | composer.changed(tVar);
                Object objRememberedValue13 = composer.rememberedValue();
                if (zChangedInstance12 || objRememberedValue13 == Composer.Companion.getEmpty()) {
                    objRememberedValue13 = new f(afVar, tVar, 9);
                    composer.updateRememberedValue(objRememberedValue13);
                }
                h.g.a.a aVar10 = (h.g.a.a) objRememberedValue13;
                boolean zChangedInstance13 = composer.changedInstance(afVar) | composer.changed(state) | composer.changed(tVar);
                Object objRememberedValue14 = composer.rememberedValue();
                if (zChangedInstance13 || objRememberedValue14 == Composer.Companion.getEmpty()) {
                    objRememberedValue14 = new g(afVar, tVar, state, 6);
                    composer.updateRememberedValue(objRememberedValue14);
                }
                c(modifierVerticalScroll$default2, amVarJ2, zBooleanValue4, aVar10, (h.g.a.a) objRememberedValue14, composer, 0);
                composer.endReplaceGroup();
            }
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final androidx.compose.ui.Modifier r33, final com.waze.main_screen.p.a.b.a.t r34, h.g.a.a r35, h.g.a.a r36, h.g.a.a r37, androidx.compose.foundation.layout.PaddingValues r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.p.a.b.a.ab.j(androidx.compose.ui.Modifier, com.waze.main_screen.p.a.b.a.t, h.g.a.a, h.g.a.a, h.g.a.a, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int):void");
    }

    static final h.ab k(Modifier modifier, h.g.a.a aVar, int i2, Composer composer) {
        u(modifier, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static /* synthetic */ com.waze.main_screen.bottom_bars.scrollable_eta.d l(Ref ref, boolean z, State state, Context context) throws Resources.NotFoundException {
        h.g.b.x.f(context, "context");
        com.waze.main_screen.bottom_bars.scrollable_eta.d dVar = new com.waze.main_screen.bottom_bars.scrollable_eta.d(context);
        ref.setValue(dVar);
        dVar.h();
        dVar.e();
        if (!v(state).f26992d) {
            dVar.g();
            v(state).f26992d = true;
        }
        dVar.j(v(state), z);
        return dVar;
    }

    public static /* synthetic */ h.ab m(boolean z, State state, boolean z2, State state2, State state3, State state4, State state5, State state6, com.waze.main_screen.bottom_bars.scrollable_eta.d dVar) throws Resources.NotFoundException {
        h.g.b.x.f(dVar, "etaControlPanel");
        dVar.i(new e(state, z2, state2, state3, state4, state5));
        dVar.j(v(state6), z);
        return h.ab.f48028a;
    }

    public static final void n(final Modifier modifier, final com.waze.main_screen.p.a.b.b.t tVar, final boolean z, final boolean z2, final h.g.a.a aVar, final h.g.a.a aVar2, final h.g.a.a aVar3, final h.g.a.a aVar4, final h.g.a.a aVar5, Composer composer, final int i2) {
        int i3;
        boolean z3;
        Composer composer2;
        int i4;
        Object obj;
        int i5;
        h.g.b.x.f(modifier, "modifier");
        h.g.b.x.f(tVar, "stateHolder");
        h.g.b.x.f(aVar, "toggleExpandState");
        h.g.b.x.f(aVar2, "onStopClicked");
        h.g.b.x.f(aVar3, "onAlternateRoutesClicked");
        h.g.b.x.f(aVar4, "onCreateShareDriveClicked");
        h.g.b.x.f(aVar5, "onLiveDriveButtonClicked");
        int i6 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-444646562);
        if (i6 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(tVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            z3 = z2;
            i3 |= true != composerStartRestartGroup.changed(z3) ? 1024 : 2048;
        } else {
            z3 = z2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar3) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar4) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar5) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if (composerStartRestartGroup.shouldExecute((38347923 & i3) != 38347922, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-444646562, i3, -1, "com.waze.main_screen.mid_drive.eta_drawer.presentation.compose.EtaControlPanel (EtaControlPanel.kt:32)");
            }
            final State stateCollectAsState = SnapshotStateKt.collectAsState(tVar.a(), null, composerStartRestartGroup, 0, 1);
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(aVar5, composerStartRestartGroup, (i3 >> 24) & 14);
            final State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(aVar4, composerStartRestartGroup, (i3 >> 21) & 14);
            final State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(aVar3, composerStartRestartGroup, (i3 >> 18) & 14);
            final State stateRememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(aVar, composerStartRestartGroup, (i3 >> 12) & 14);
            final State stateRememberUpdatedState5 = SnapshotStateKt.rememberUpdatedState(aVar2, composerStartRestartGroup, (i3 >> 15) & 14);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Ref();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Ref ref = (Ref) objRememberedValue;
            Boolean boolValueOf = Boolean.valueOf(com.waze.bz.a.d(composerStartRestartGroup, 0).V());
            Integer numValueOf = Integer.valueOf(((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).uiMode);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(ref);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (h.g.a.p) new n(ref, (h.c.e) null, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(boolValueOf, numValueOf, (h.g.a.p) objRememberedValue2, composerStartRestartGroup, 0);
            int i7 = (composerStartRestartGroup.changedInstance(ref) ? 1 : 0) | (composerStartRestartGroup.changed(stateCollectAsState) ? 1 : 0);
            int i8 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256 ? 1 : 0;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if ((i7 | i8) != 0 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                i4 = 1;
                objRememberedValue3 = new com.waze.main_screen.q.b.a(ref, z, stateCollectAsState, i4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                i4 = 1;
            }
            h.g.a.l lVar = (h.g.a.l) objRememberedValue3;
            boolean zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState4);
            if ((i3 & 7168) != 2048) {
                i4 = 0;
            }
            int i9 = (zChanged ? 1 : 0) | i4 | (composerStartRestartGroup.changed(stateRememberUpdatedState3) ? 1 : 0) | (composerStartRestartGroup.changed(stateRememberUpdatedState2) ? 1 : 0) | (composerStartRestartGroup.changed(stateRememberUpdatedState) ? 1 : 0) | (composerStartRestartGroup.changed(stateRememberUpdatedState5) ? 1 : 0) | (composerStartRestartGroup.changed(stateCollectAsState) ? 1 : 0);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if ((i9 | i8) != 0 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                final boolean z4 = z3;
                composer2 = composerStartRestartGroup;
                i5 = i3;
                obj = new h.g.a.l() { // from class: com.waze.main_screen.p.a.b.a.c
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return ab.m(z, stateRememberUpdatedState4, z4, stateRememberUpdatedState3, stateRememberUpdatedState2, stateRememberUpdatedState, stateRememberUpdatedState5, stateCollectAsState, (com.waze.main_screen.bottom_bars.scrollable_eta.d) obj2);
                    }
                };
                composer2.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue4;
                i5 = i3;
                composer2 = composerStartRestartGroup;
            }
            AndroidView_androidKt.AndroidView(lVar, modifier, (h.g.a.l) obj, composer2, (i5 << 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.main_screen.p.a.b.a.d
                @Override // h.g.a.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    Modifier modifier2 = modifier;
                    com.waze.main_screen.p.a.b.b.t tVar2 = tVar;
                    boolean z5 = z;
                    boolean z6 = z2;
                    h.g.a.a aVar6 = aVar;
                    h.g.a.a aVar7 = aVar2;
                    h.g.a.a aVar8 = aVar3;
                    h.g.a.a aVar9 = aVar4;
                    ab.n(modifier2, tVar2, z5, z6, aVar6, aVar7, aVar8, aVar9, aVar5, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                    return h.ab.f48028a;
                }
            });
        }
    }

    public static /* synthetic */ com.waze.main_screen.bottom_bars.a.b o(Ref ref, h.g.a.a aVar, State state, Context context) {
        h.g.b.x.f(context, "context");
        com.waze.main_screen.bottom_bars.a.b bVar = new com.waze.main_screen.bottom_bars.a.b(context);
        ref.setValue(bVar);
        bx bxVar = w(state).f26947c;
        if (bxVar != null) {
            bVar.h(bxVar);
        }
        bVar.e(aVar != null);
        bVar.c();
        return bVar;
    }

    public static /* synthetic */ h.ab p(State state, h.g.a.a aVar, com.waze.main_screen.bottom_bars.a.b bVar) {
        h.g.b.x.f(bVar, "view");
        bx bxVar = w(state).f26947c;
        if (bxVar != null) {
            bVar.h(bxVar);
        }
        bVar.a(new b(aVar));
        return h.ab.f48028a;
    }

    public static final void q(t tVar, h.g.a.a aVar, Modifier modifier, int i2, Composer composer, int i3) {
        int i4;
        h.g.a.a aVar2;
        int i5;
        int iH;
        char c2;
        int i6;
        h.g.b.x.f(tVar, "etaDrawerSheetState");
        int i7 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1850580666);
        if (i7 == 0) {
            i4 = (true != composerStartRestartGroup.changed(tVar) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changed(modifier) ? 128 : 256;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i4 & 1)) {
            int i8 = i4 & (-7169);
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                iH = (int) be.H(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getNavigationBars(WindowInsets.Companion, composerStartRestartGroup, 6), composerStartRestartGroup, 0).mo2704calculateBottomPaddingD9Ej5fM(), composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                iH = i2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                c2 = 2;
                ComposerKt.traceEventStart(1850580666, i8, -1, "com.waze.main_screen.mid_drive.eta_drawer.presentation.compose.CompactEtaBar (CompactEtaBar.kt:39)");
            } else {
                c2 = 2;
            }
            Object objCollectAsState = SnapshotStateKt.collectAsState(tVar.h().a(), null, composerStartRestartGroup, 0, 1);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Ref();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Ref ref = (Ref) objRememberedValue;
            int iB = h.h.a.b(iH + be.H(48.0f, composerStartRestartGroup, 6));
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Integer numValueOf = Integer.valueOf(((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).uiMode);
            Boolean boolValueOf = Boolean.valueOf(com.waze.bz.a.d(composerStartRestartGroup, 0).V());
            Integer numValueOf2 = Integer.valueOf(iB);
            Integer numValueOf3 = Integer.valueOf(iH);
            Object[] objArr = new Object[6];
            objArr[0] = numValueOf;
            objArr[1] = boolValueOf;
            objArr[c2] = tVar;
            objArr[3] = numValueOf2;
            objArr[4] = numValueOf3;
            objArr[5] = density;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(ref) | composerStartRestartGroup.changed(iB) | composerStartRestartGroup.changed(iH) | composerStartRestartGroup.changed(density);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                i5 = iH;
                i6 = iB;
                objRememberedValue2 = (h.g.a.p) new a(ref, iB, i5, density, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                i6 = iB;
                i5 = iH;
            }
            EffectsKt.LaunchedEffect(objArr, (h.g.a.p<? super af, ? super h.c.e<? super h.ab>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            Modifier modifierM2808height3ABfNKs = SizeKt.m2808height3ABfNKs(modifier, be.G(i6, composerStartRestartGroup, 0));
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(ref) | composerStartRestartGroup.changed(objCollectAsState);
            boolean z = (i4 & 112) == 32;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance2 || z) || objRememberedValue3 == Composer.Companion.getEmpty()) {
                aVar2 = aVar;
                Object cVar = new com.waze.ads.c((Object) ref, (Object) aVar2, objCollectAsState, 8, (short[]) null);
                composerStartRestartGroup.updateRememberedValue(cVar);
                objRememberedValue3 = cVar;
            } else {
                aVar2 = aVar;
            }
            h.g.a.l lVar = (h.g.a.l) objRememberedValue3;
            boolean zChanged = composerStartRestartGroup.changed(objCollectAsState) | z;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new ak(objCollectAsState, aVar2, 19);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            AndroidView_androidKt.AndroidView(lVar, modifierM2808height3ABfNKs, (h.g.a.l) objRememberedValue4, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            aVar2 = aVar;
            composerStartRestartGroup.skipToGroupEnd();
            i5 = i2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.navigate.location_preview.k(tVar, aVar2, modifier, i5, i3, 1));
        }
    }

    private static final al r(State state) {
        return (al) state.getValue();
    }

    private static final com.waze.main_screen.p.a.b.b.b s(State state) {
        return (com.waze.main_screen.p.a.b.b.b) state.getValue();
    }

    private static final ae t(State state) {
        return (ae) state.getValue();
    }

    private static final void u(final Modifier modifier, final h.g.a.a aVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1147371107);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        int i5 = i3;
        if (composerStartRestartGroup.shouldExecute((i5 & 19) != 18, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1147371107, i5, -1, "com.waze.main_screen.mid_drive.eta_drawer.presentation.compose.Scrim (EtaDrawerBottomSheet.kt:272)");
            }
            Modifier modifierM1972backgroundbw27NRU$default = BackgroundKt.m1972backgroundbw27NRU$default(modifier, Color.m8227copywmQWz5c$default(com.waze.bz.a.d(composerStartRestartGroup, 0).c(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            int i6 = i5 & 112;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i6 == 32 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.car_lib.a.a(aVar, 10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BoxKt.Box(be.J(modifierM1972backgroundbw27NRU$default, false, null, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 48, 14), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.main_screen.p.a.b.a.h
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return ab.k(modifier, aVar, i2, (Composer) obj);
                }
            });
        }
    }

    private static final com.waze.main_screen.p.a.b.b.s v(State state) {
        return (com.waze.main_screen.p.a.b.b.s) state.getValue();
    }

    private static final com.waze.main_screen.p.a.b.b.b w(State state) {
        return (com.waze.main_screen.p.a.b.b.b) state.getValue();
    }
}
