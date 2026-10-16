package com.waze.search;

import android.view.MotionEvent;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
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
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.input.pointer.RequestDisallowInterceptTouchEvent;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.media3.common.C;
import com.waze.navigate.dc;
import com.waze.strings.DisplayStrings;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class ai {
    public /* synthetic */ ai() {
    }

    public static /* synthetic */ DisposableEffectResult b(int i2, State state, DisposableEffectScope disposableEffectScope) {
        h.g.b.x.f(disposableEffectScope, "$this$DisposableEffect");
        p(state).invoke(com.waze.z.a.ae.f45620b, Integer.valueOf(i2));
        return new af(i2, state);
    }

    public static /* synthetic */ h.ab c(int i2, com.waze.search.e.p pVar, State state, com.waze.z.a.ad adVar) {
        h.g.b.x.f(adVar, "it");
        p(state).invoke(com.waze.z.a.ae.f45619a, Integer.valueOf(i2));
        pVar.i(adVar);
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab e(com.waze.search.e.z zVar, int i2, boolean z, Modifier modifier, List list, int i3, h.g.a.l lVar, LazyItemScope lazyItemScope, Composer composer, int i4) {
        int i5;
        h.g.b.x.f(lazyItemScope, "$this$item");
        int i6 = 2;
        if ((i4 & 6) == 0) {
            i5 = i4 | (true != composer.changed(lazyItemScope) ? 2 : 4);
        } else {
            i5 = i4;
        }
        if (composer.shouldExecute((i5 & 19) != 18, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1183050617, i5, -1, "com.waze.search.SearchList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchList.kt:111)");
            }
            if (zVar instanceof com.waze.search.e.h) {
                composer.startReplaceGroup(-240620040);
                com.waze.search.d.a.b.c(PaddingKt.m2759paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, 16.0f, 7, null), ((com.waze.search.e.h) zVar).b(), composer, DisplayStrings.DS_CRISIS_RESPONSE_INFO);
                composer.endReplaceGroup();
            } else if (zVar instanceof com.waze.search.e.w) {
                composer.startReplaceGroup(-1254675335);
                i(com.waze.search.d.a.b.d(((com.waze.search.e.w) zVar).b(), composer, 0), PaddingKt.m2758paddingqDBjuR0(Modifier.Companion, 16.0f, (i2 == 0 || !z) ? 0.0f : 16.0f, 16.0f, 0.0f).then(modifier), null, composer, 0);
                composer.endReplaceGroup();
            } else {
                if (zVar instanceof com.waze.search.e.x) {
                    composer.startReplaceGroup(-1254657915);
                    throw null;
                }
                if (zVar instanceof com.waze.search.e.q) {
                    composer.startReplaceGroup(-1254637195);
                    b.a(PaddingKt.m2751PaddingValuesa9UjIt4(16.0f, 4.0f, 16.0f, 4.0f), composer, 0);
                    composer.endReplaceGroup();
                } else if (zVar instanceof com.waze.search.e.p) {
                    composer.startReplaceGroup(-238597135);
                    com.waze.search.e.p pVar = (com.waze.search.e.p) zVar;
                    if (pVar.b().a().isEmpty()) {
                        composer.startReplaceGroup(-1254602039);
                        r(pVar, i2 == h.a.i.e(list), composer, 0);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-1254620171);
                        boolean z2 = i2 == h.a.i.e(list);
                        boolean zChanged = composer.changed(lVar) | composer.changed(i2) | composer.changed(i3);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = new com.waze.z.a.b.i(lVar, i2, i3, i6);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        s(pVar, z2, i2, i3, (h.g.a.p) objRememberedValue, composer, 0);
                        composer.endReplaceGroup();
                    }
                    composer.endReplaceGroup();
                } else if (zVar instanceof com.waze.search.e.v) {
                    composer.startReplaceGroup(-237718440);
                    Modifier.Companion companion = Modifier.Companion;
                    com.waze.search.e.v vVar = (com.waze.search.e.v) zVar;
                    boolean zChangedInstance = composer.changedInstance(vVar);
                    j jVarRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || jVarRememberedValue == Composer.Companion.getEmpty()) {
                        jVarRememberedValue = new j(vVar, 6, (float[]) null);
                        composer.updateRememberedValue(jVarRememberedValue);
                    }
                    ButtonKt.Button((h.g.a.a) ((h.l.f) jVarRememberedValue), companion, false, null, ButtonDefaults.INSTANCE.m3990elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer, (ButtonDefaults.$stable << 15) | 54, 28), RectangleShapeKt.getRectangleShape(), null, ButtonDefaults.INSTANCE.m3989buttonColorsro_MJ88(Color.Companion.m8263getTransparent0d7_KjU(), 0L, 0L, 0L, composer, 6 | (ButtonDefaults.$stable << 12), 14), null, ComposableLambdaKt.rememberComposableLambda(-1680227386, true, new com.waze.main_screen.c.b.a(zVar, 3), composer, 54), composer, 805503024, DisplayStrings.DS_CARPLAY_TRIP_OVERVIEW_GO_BUTTON);
                    composer.endReplaceGroup();
                } else {
                    if (!(zVar instanceof com.waze.search.e.y)) {
                        composer.startReplaceGroup(-1254685936);
                        composer.endReplaceGroup();
                        throw new h.i();
                    }
                    composer.startReplaceGroup(-236662177);
                    composer.startReplaceGroup(-236690574);
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-236662178);
                    composer.endReplaceGroup();
                    composer.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    static h.ab f(boolean z, h.g.a.q qVar, int i2, Composer composer) {
        q(z, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab g(com.waze.search.e.p pVar, boolean z, int i2, Composer composer) {
        r(pVar, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab h(com.waze.search.e.p pVar, boolean z, int i2, int i3, h.g.a.p pVar2, int i4, Composer composer) {
        s(pVar, z, i2, i3, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
        return h.ab.f48028a;
    }

    public static void i(String str, Modifier modifier, h.g.a.a aVar, Composer composer, int i2) {
        int i3;
        Composer composer2;
        h.g.a.a aVar2;
        h.g.b.x.f(str, "text");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1502782582);
        if (i4 == 0) {
            i3 = i2 | (true != composerStartRestartGroup.changed(str) ? 2 : 4);
        } else {
            i3 = i2;
        }
        int i5 = 16;
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        int i6 = i3 | DisplayStrings.DS_CATEGORY_SEARCH_AMENITIES_FILTER_CHARGING_STATION;
        if (composerStartRestartGroup.shouldExecute((i6 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i6 & 1)) {
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new dc(i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            h.g.a.a aVar3 = (h.g.a.a) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1502782582, i6, -1, "com.waze.search.ListTextSection (SearchList.kt:351)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 48);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m4275Text4IGK_g(str, (Modifier) null, com.waze.bz.a.d(composerStartRestartGroup, 0).q(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composerStartRestartGroup).b(), composerStartRestartGroup, i6 & 14, 0, 65530);
            composer2 = composerStartRestartGroup;
            composer2.startReplaceGroup(-1654587126);
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            aVar2 = aVar3;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            aVar2 = aVar;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.c.e.w(str, modifier, aVar2, i2, 15));
        }
    }

    public static void j(Modifier modifier, Modifier modifier2, LazyListState lazyListState, final List list, boolean z, boolean z2, final int i2, h.g.a.l lVar, Composer composer, int i3) {
        int i4;
        h.g.a.l lVar2;
        Modifier modifier3;
        boolean z3;
        boolean z4;
        Modifier modifierM2808height3ABfNKs;
        final boolean z5;
        boolean z6;
        boolean z7;
        Modifier modifier4;
        h.g.b.x.f(list, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1950521594);
        if ((i3 & 6) == 0) {
            i4 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        int i5 = i4 | 48;
        if ((i3 & 384) == 0) {
            i5 |= true != composerStartRestartGroup.changed(lazyListState) ? 128 : 256;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(list) ? 1024 : 2048;
        }
        int i6 = i5 | 221184;
        if ((1572864 & i3) == 0) {
            i6 |= true != composerStartRestartGroup.changed(i2) ? 524288 : 1048576;
        }
        if ((12582912 & i3) == 0) {
            lVar2 = lVar;
            i6 |= true != composerStartRestartGroup.changedInstance(lVar2) ? 4194304 : 8388608;
        } else {
            lVar2 = lVar;
        }
        if ((100663296 & i3) == 0) {
            i6 |= true != composerStartRestartGroup.changedInstance(null) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        int i7 = i6;
        if (composerStartRestartGroup.shouldExecute((38347923 & i7) != 38347922, i7 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifierM2808height3ABfNKs = SizeKt.m2808height3ABfNKs(Modifier.Companion, 48.0f);
                z5 = true;
                z6 = true;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifierM2808height3ABfNKs = modifier2;
                z6 = z;
                z5 = z2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1950521594, i7, -1, "com.waze.search.SearchList (SearchList.kt:100)");
            }
            boolean z8 = (((i7 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) > 256 && composerStartRestartGroup.changed(lazyListState)) || (i7 & 384) == 256;
            ab abVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z8 || abVarRememberedValue == Composer.Companion.getEmpty()) {
                abVarRememberedValue = new ab(lazyListState, null);
                composerStartRestartGroup.updateRememberedValue(abVarRememberedValue);
            }
            int i8 = i7 & 112;
            EffectsKt.LaunchedEffect(list, modifierM2808height3ABfNKs, (h.g.a.p) abVarRememberedValue, composerStartRestartGroup, ((i7 >> 9) & 14) | i8);
            PaddingValues paddingValuesAsPaddingValues = WindowInsetsKt.asPaddingValues(WindowInsetsKt.m2850onlybOOhFvg(WindowInsets_androidKt.getNavigationBars(WindowInsets.Companion, composerStartRestartGroup, 6), WindowInsetsSides.Companion.m2868getBottomJoeWqyM()), composerStartRestartGroup, 0);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list) | ((458752 & i7) == 131072);
            boolean z9 = i8 == 32;
            boolean z10 = (3670016 & i7) == 1048576;
            boolean z11 = (i7 & 29360128) == 8388608;
            boolean z12 = (234881024 & i7) == 67108864;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (((zChangedInstance | z9 | z10 | z11) || z12) || objRememberedValue == Composer.Companion.getEmpty()) {
                final Modifier modifier5 = modifierM2808height3ABfNKs;
                final h.g.a.l lVar3 = lVar2;
                h.g.a.l lVar4 = new h.g.a.l() { // from class: com.waze.search.aa
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        LazyListScope lazyListScope = (LazyListScope) obj;
                        h.g.b.x.f(lazyListScope, "$this$LazyColumn");
                        final List list2 = list;
                        final int i9 = 0;
                        for (Object obj2 : list2) {
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                h.a.i.p();
                            }
                            final h.g.a.l lVar5 = lVar3;
                            final int i11 = i2;
                            final Modifier modifier6 = modifier5;
                            final boolean z13 = z5;
                            final com.waze.search.e.z zVar = (com.waze.search.e.z) obj2;
                            LazyListScope.CC.item$default(lazyListScope, zVar.a(), null, ComposableLambdaKt.composableLambdaInstance(1183050617, true, new h.g.a.q() { // from class: com.waze.search.v
                                @Override // h.g.a.q
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    int iIntValue = ((Integer) obj5).intValue();
                                    return ai.e(zVar, i9, z13, modifier6, list2, i11, lVar5, (LazyItemScope) obj3, (Composer) obj4, iIntValue);
                                }
                            }), 2, null);
                            i9 = i10;
                        }
                        return h.ab.f48028a;
                    }
                };
                z7 = z5;
                modifier4 = modifier5;
                composerStartRestartGroup.updateRememberedValue(lVar4);
                objRememberedValue = lVar4;
            } else {
                modifier4 = modifierM2808height3ABfNKs;
                z7 = z5;
            }
            boolean z13 = z6;
            LazyDslKt.LazyColumn(modifier, lazyListState, paddingValuesAsPaddingValues, false, null, null, null, z13, null, (h.g.a.l) objRememberedValue, composerStartRestartGroup, (i7 & 14) | ((i7 >> 3) & 112) | ((i7 << 9) & 29360128), DisplayStrings.DS_WANNA_PICK_A_NEW_MOODQ);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z3 = z13;
            modifier3 = modifier4;
            z4 = z7;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            z3 = z;
            z4 = z2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u(modifier, modifier3, lazyListState, list, z3, z4, i2, lVar, i3, 0));
        }
    }

    public static /* synthetic */ h.ab k(MutableIntState mutableIntState, int i2) {
        t(mutableIntState, i2);
        return h.ab.f48028a;
    }

    public static /* synthetic */ void l(FocusManager focusManager, MutableIntState mutableIntState, MotionEvent motionEvent) {
        h.g.b.x.f(motionEvent, "it");
        if (motionEvent.getAction() == 0) {
            t(mutableIntState, -1);
            focusManager.clearFocus(true);
        }
    }

    static h.ab m(int i2, Composer composer) {
        u(composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab n(int i2, Composer composer) {
        v(composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.compose.runtime.Composer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38, types: [int] */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r40v0, types: [com.waze.settings.v, java.lang.Object] */
    public static void o(final Modifier modifier, final com.waze.settings.v vVar, final com.waze.z.a.d.an anVar, final boolean z, com.waze.ui.ac.n nVar, final h.g.a.l lVar, final h.g.a.a aVar, final h.g.a.a aVar2, final h.g.a.a aVar3, h.g.a.a aVar4, final h.g.a.p pVar, boolean z2, final h.g.a.q qVar, final h.g.a.p pVar2, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        h.g.a.q qVar2;
        int i7;
        boolean z5;
        h.g.a.p pVar3;
        final boolean z6;
        com.waze.ui.ac.n nVar2;
        Composer composer2;
        final h.g.a.a aVar5;
        boolean z7;
        int i8;
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent;
        LazyListState lazyListState;
        h.g.a.a aVar6;
        boolean z8;
        int i9;
        h.g.a.p pVar4;
        ?? r1;
        int i10;
        h.g.b.x.f(vVar, "state");
        h.g.b.x.f(anVar, "searchFieldState");
        h.g.b.x.f(nVar, "placeholder");
        h.g.b.x.f(lVar, "onSearchTermChanged");
        h.g.b.x.f(aVar, "onVoiceSearchClicked");
        h.g.b.x.f(aVar2, "onVoiceSearchClickedOutside");
        h.g.b.x.f(aVar3, "onImeSearchClicked");
        ?? StartRestartGroup = composer.startRestartGroup(-870478757);
        if ((i2 & 6) == 0) {
            i4 = (true != StartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 = i4 | (true != StartRestartGroup.changed(vVar) ? 16 : 32);
        } else {
            i5 = i4;
        }
        if ((i2 & 384) == 0) {
            i5 |= true != StartRestartGroup.changed(anVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i5 |= true != StartRestartGroup.changed(z) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i5 |= true != ((32768 & i2) == 0 ? StartRestartGroup.changed(nVar) : StartRestartGroup.changedInstance(nVar)) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i5 |= true != StartRestartGroup.changedInstance(lVar) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            z3 = true;
            i5 |= true != StartRestartGroup.changedInstance(aVar) ? 524288 : 1048576;
        } else {
            z3 = true;
        }
        if ((12582912 & i2) == 0) {
            i5 |= z3 != StartRestartGroup.changedInstance(aVar2) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i5 |= true != StartRestartGroup.changedInstance(aVar3) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((i3 & 6) == 0) {
            z4 = true;
            i6 = i3 | (true != StartRestartGroup.changedInstance(pVar) ? 2 : 4);
        } else {
            z4 = true;
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= z4 == StartRestartGroup.changed(z2) ? 32 : 16;
        }
        int i11 = i6 | 384;
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            qVar2 = qVar;
            z5 = true;
            i7 = i11 | (true != StartRestartGroup.changedInstance(qVar2) ? 1024 : 2048);
        } else {
            qVar2 = qVar;
            i7 = i11;
            z5 = true;
        }
        if ((i3 & 24576) == 0) {
            pVar3 = pVar2;
            i7 |= z5 != StartRestartGroup.changedInstance(pVar3) ? 8192 : 16384;
        } else {
            pVar3 = pVar2;
        }
        int i12 = i7;
        int i13 = i5 | 805306368;
        if (StartRestartGroup.shouldExecute(((i13 & 306783379) == 306783378 && (i12 & 9363) == 9362) ? false : true, i13 & 1)) {
            Object objRememberedValue = StartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new dc(15);
                StartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            h.g.a.a aVar7 = (h.g.a.a) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                z7 = false;
                ComposerKt.traceEventStart(-870478757, i13, i12, "com.waze.search.SearchEmptyStateContent (SearchEmptyStateContent.kt:97)");
            } else {
                z7 = false;
            }
            Object objRememberedValue2 = StartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new FocusRequester();
                StartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue2;
            Object objRememberedValue3 = StartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotIntStateKt.mutableIntStateOf(-1);
                StartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableIntState mutableIntState = (MutableIntState) objRememberedValue3;
            Object objRememberedValue4 = StartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z7), null, 2, null);
                StartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState = (MutableState) objRememberedValue4;
            FocusManager focusManager = (FocusManager) StartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) StartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            boolean z9 = (i13 & DisplayStrings.DS_TAP_TO_VERIFY) == 256 ? true : z7;
            boolean zChanged = StartRestartGroup.changed(softwareKeyboardController) | z9;
            boolean z10 = z9;
            q qVarRememberedValue = StartRestartGroup.rememberedValue();
            if (zChanged || qVarRememberedValue == Composer.Companion.getEmpty()) {
                i8 = 1;
                qVarRememberedValue = new q(anVar, softwareKeyboardController, (h.c.e) null, 1);
                StartRestartGroup.updateRememberedValue(qVarRememberedValue);
            } else {
                i8 = 1;
            }
            int i14 = (i13 >> 6) & 14;
            EffectsKt.LaunchedEffect(anVar, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) qVarRememberedValue, (Composer) StartRestartGroup, i14);
            Modifier modifierM1972backgroundbw27NRU$default = BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier, 0.0f, i8, null), com.waze.bz.a.d(StartRestartGroup, z7 ? 1 : 0).h(), null, 2, null);
            boolean zChangedInstance = StartRestartGroup.changedInstance(focusManager);
            Object objRememberedValue5 = StartRestartGroup.rememberedValue();
            int i15 = 10;
            if (zChangedInstance || objRememberedValue5 == Composer.Companion.getEmpty()) {
                requestDisallowInterceptTouchEvent = null;
                objRememberedValue5 = new com.waze.authentication.as(focusManager, mutableIntState, i15, 0 == true ? 1 : 0);
                StartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                requestDisallowInterceptTouchEvent = null;
            }
            Modifier modifierPointerInteropFilter$default = PointerInteropFilter_androidKt.pointerInteropFilter$default(modifierM1972backgroundbw27NRU$default, requestDisallowInterceptTouchEvent, (h.g.a.l) objRememberedValue5, 1, requestDisallowInterceptTouchEvent);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), StartRestartGroup, 54);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(StartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = StartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(StartRestartGroup, modifierPointerInteropFilter$default);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(StartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            StartRestartGroup.startReusableNode();
            if (StartRestartGroup.getInserting()) {
                StartRestartGroup.createNode(constructor);
            } else {
                StartRestartGroup.useNode();
            }
            Updater.m7351setimpl((Composer) StartRestartGroup, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl((Composer) StartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl((Composer) StartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(StartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl((Composer) StartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            AnimatedVisibilityKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, z && ((Boolean) mutableState.getValue()).booleanValue(), PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 16.0f, 0.0f, 0.0f, 13, null), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-121527767, true, new com.waze.main_screen.c.b.a(pVar, 2), StartRestartGroup, 54), (Composer) StartRestartGroup, 1573254, 28);
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, StartRestartGroup, 0, 3);
            boolean z11 = vVar instanceof com.waze.search.e.ag;
            if (z11 || (vVar instanceof com.waze.search.e.af)) {
                nVar2 = nVar;
                z6 = z2;
                composer2 = StartRestartGroup;
                lazyListState = lazyListStateRememberLazyListState;
                aVar6 = aVar7;
                z8 = z11;
                i9 = 0;
                composer2.startReplaceGroup(-32801359);
                composer2.endReplaceGroup();
            } else {
                StartRestartGroup.startReplaceGroup(-34867509);
                h.g.b.x.f(lazyListStateRememberLazyListState, "lazyListState");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-502421043, 0, -1, "com.waze.search.animateSearchFieldElevation (SearchEmptyStateContent.kt:220)");
                }
                Object objRememberedValue6 = StartRestartGroup.rememberedValue();
                if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt.derivedStateOf(new com.waze.planned_drive.ae(lazyListStateRememberLazyListState, 14));
                    StartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                State<Integer> stateAnimateIntAsState = AnimateAsStateKt.animateIntAsState(true != ((Boolean) ((State) objRememberedValue6).getValue()).booleanValue() ? 0 : 8, null, "", null, StartRestartGroup, 384, 10);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                Modifier modifierM2757paddingVpY3zN4$default = PaddingKt.m2757paddingVpY3zN4$default(PaddingKt.m2759paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(BackgroundKt.m1972backgroundbw27NRU$default(ShadowKt.m7823shadows4CzXII$default(Modifier.Companion, stateAnimateIntAsState.getValue().intValue(), null, false, 0L, 0L, 30, null), com.waze.bz.a.d(StartRestartGroup, 0).h(), null, 2, null), 0.0f, 1, null), 0.0f, 16.0f, 0.0f, 16.0f, 5, null), 16.0f, 0.0f, 2, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), StartRestartGroup, 48);
                int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(StartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2 = StartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(StartRestartGroup, modifierM2757paddingVpY3zN4$default);
                h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                if (!(StartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                StartRestartGroup.startReusableNode();
                if (StartRestartGroup.getInserting()) {
                    StartRestartGroup.createNode(constructor2);
                } else {
                    StartRestartGroup.useNode();
                }
                Updater.m7351setimpl((Composer) StartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl((Composer) StartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m7351setimpl((Composer) StartRestartGroup, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(StartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl((Composer) StartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                if (qVar2 == null) {
                    StartRestartGroup.startReplaceGroup(-2085871291);
                } else {
                    StartRestartGroup.startReplaceGroup(-1452759492);
                    qVar2.invoke(rowScopeInstance, StartRestartGroup, Integer.valueOf(((i12 >> 6) & 112) | 6));
                }
                StartRestartGroup.endReplaceGroup();
                boolean z12 = (i13 & 3670016) == 1048576;
                boolean z13 = (i13 & 29360128) == 8388608;
                boolean z14 = (i13 & 234881024) == 67108864;
                boolean z15 = (i13 & 458752) == 131072;
                Object objRememberedValue7 = StartRestartGroup.rememberedValue();
                if (((z12 | z13 | z14) || z15) || objRememberedValue7 == Composer.Companion.getEmpty()) {
                    pVar4 = pVar3;
                    z8 = z11;
                    r1 = 1;
                    i10 = 54;
                    com.waze.car_lib.screens.az azVar = new com.waze.car_lib.screens.az(aVar, aVar2, aVar3, lVar, mutableState, 5);
                    StartRestartGroup.updateRememberedValue(azVar);
                    objRememberedValue7 = azVar;
                } else {
                    pVar4 = pVar3;
                    z8 = z11;
                    r1 = 1;
                    i10 = 54;
                }
                h.g.a.l lVar2 = (h.g.a.l) objRememberedValue7;
                Modifier modifierM2808height3ABfNKs = SizeKt.m2808height3ABfNKs(FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.U, null), 0.0f, r1, null), focusRequester), 56.0f);
                boolean z16 = (i13 & C.ENCODING_PCM_DOUBLE) == 536870912 ? r1 : false;
                Object objRememberedValue8 = StartRestartGroup.rememberedValue();
                if ((z10 | z16) || objRememberedValue8 == Composer.Companion.getEmpty()) {
                    objRememberedValue8 = new com.waze.car_lib.i.b.d(anVar, aVar7, 10);
                    StartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                nVar2 = nVar;
                aVar6 = aVar7;
                lazyListState = lazyListStateRememberLazyListState;
                i9 = 0;
                z6 = z2;
                com.waze.z.a.d.ai.h(anVar, lVar2, com.waze.main_screen.ac.b.a(modifierM2808height3ABfNKs, (h.g.a.a) objRememberedValue8), com.waze.ui.a.l.o(nVar2, StartRestartGroup, (i13 >> 12) & 14), ComposableLambdaKt.rememberComposableLambda(-1941064237, true, new com.waze.v.b(pVar4, 3), StartRestartGroup, i10), StartRestartGroup, i14 | 24576);
                composer2 = StartRestartGroup;
                int i16 = i12 & 112;
                o oVarRememberedValue = composer2.rememberedValue();
                if (i16 == 32 || oVarRememberedValue == Composer.Companion.getEmpty()) {
                    oVarRememberedValue = new o(z6, focusRequester, null);
                    composer2.updateRememberedValue(oVarRememberedValue);
                }
                EffectsKt.LaunchedEffect(focusRequester, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) oVarRememberedValue, composer2, 6);
                composer2.endNode();
                composer2.endReplaceGroup();
            }
            if (vVar instanceof com.waze.search.e.ad) {
                composer2.startReplaceGroup(-32728292);
                if ((vVar instanceof com.waze.search.e.ac) && (((com.waze.search.e.ac) vVar).b() instanceof com.waze.search.e.aa)) {
                    composer2.startReplaceGroup(-32592884);
                    v(composer2, i9);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-32528001);
                    Modifier modifierA = com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.W, null);
                    List listA = ((com.waze.search.e.ad) vVar).a();
                    int intValue = mutableIntState.getIntValue();
                    Object objRememberedValue9 = composer2.rememberedValue();
                    if (objRememberedValue9 == Composer.Companion.getEmpty()) {
                        objRememberedValue9 = new com.waze.car_lib.o.ab(mutableIntState, 10);
                        composer2.updateRememberedValue(objRememberedValue9);
                    }
                    j(modifierA, null, lazyListState, listA, false, false, intValue, (h.g.a.l) objRememberedValue9, composer2, ((i12 << 18) & 234881024) | 12582918);
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
            } else if (vVar instanceof com.waze.search.e.af) {
                composer2.startReplaceGroup(1522984414);
                u(composer2, i9);
                composer2.endReplaceGroup();
            } else {
                if (!z8) {
                    composer2.startReplaceGroup(1522963481);
                    composer2.endReplaceGroup();
                    throw new h.i();
                }
                composer2.startReplaceGroup(1522985888);
                v(composer2, i9);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            aVar5 = aVar6;
        } else {
            z6 = z2;
            nVar2 = nVar;
            composer2 = StartRestartGroup;
            composer2.skipToGroupEnd();
            aVar5 = aVar4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final com.waze.ui.ac.n nVar3 = nVar2;
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.search.m
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    Modifier modifier2 = modifier;
                    com.waze.settings.v vVar2 = vVar;
                    com.waze.z.a.d.an anVar2 = anVar;
                    boolean z17 = z;
                    com.waze.ui.ac.n nVar4 = nVar3;
                    h.g.a.l lVar3 = lVar;
                    h.g.a.a aVar8 = aVar;
                    h.g.a.a aVar9 = aVar2;
                    h.g.a.a aVar10 = aVar3;
                    h.g.a.a aVar11 = aVar5;
                    h.g.a.p pVar5 = pVar;
                    boolean z18 = z6;
                    h.g.a.q qVar3 = qVar;
                    int i17 = i2;
                    ai.o(modifier2, vVar2, anVar2, z17, nVar4, lVar3, aVar8, aVar9, aVar10, aVar11, pVar5, z18, qVar3, pVar2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i17 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
                    return h.ab.f48028a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h.g.a.p p(State state) {
        return (h.g.a.p) state.getValue();
    }

    private static void q(boolean z, h.g.a.q qVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-482950239);
        int i5 = 1;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(z) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(qVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-482950239, i3, -1, "com.waze.search.CellWithDivider (SearchList.kt:217)");
            }
            Modifier modifierM2810heightInVpY3zN4$default = SizeKt.m2810heightInVpY3zN4$default(SizeKt.wrapContentHeight$default(Modifier.Companion, null, false, 3, null), 75.0f, 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2810heightInVpY3zN4$default);
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
            SpacerKt.Spacer(columnScopeInstance.weight(Modifier.Companion, 1.0f, true), composerStartRestartGroup, 0);
            qVar.invoke(columnScopeInstance, composerStartRestartGroup, Integer.valueOf((i3 & 112) | 6));
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1200244085);
                SpacerKt.Spacer(columnScopeInstance.weight(Modifier.Companion, 1.0f, true), composerStartRestartGroup, 0);
                DividerKt.m4060DivideroMI9zvI(null, com.waze.bz.a.d(composerStartRestartGroup, 0).K(), 1.0f, 16.0f, composerStartRestartGroup, DisplayStrings.DS_CATEGORY_SEARCH_AMENITIES_FILTER_CHARGING_STATION, 1);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1199967317);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new y(z, qVar, i2, i5));
        }
    }

    private static void r(com.waze.search.e.p pVar, boolean z, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1772385355);
        int i5 = 1;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(pVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        int i6 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1772385355, i3, -1, "com.waze.search.DestinationCellListItem (SearchList.kt:245)");
            }
            q(!z, ComposableLambdaKt.rememberComposableLambda(-94160310, true, new z(pVar, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new y(pVar, z, i2, i6));
        }
    }

    private static void s(final com.waze.search.e.p pVar, final boolean z, int i2, final int i3, final h.g.a.p pVar2, Composer composer, final int i4) {
        int i5;
        int i6;
        ad adVar;
        final int i7 = i2;
        int i8 = i4 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-418549071);
        if (i8 == 0) {
            i5 = (true != composerStartRestartGroup.changedInstance(pVar) ? 2 : 4) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if ((i4 & 384) == 0) {
            i5 |= true != composerStartRestartGroup.changed(i7) ? 128 : 256;
        }
        if ((i4 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i5 |= true != composerStartRestartGroup.changed(i3) ? 1024 : 2048;
        }
        if ((i4 & 24576) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 8192 : 16384;
        }
        int i9 = i5;
        if (composerStartRestartGroup.shouldExecute((i9 & 9363) != 9362, i9 & 1)) {
            int i10 = i9 & DisplayStrings.DS_TAP_TO_VERIFY;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-418549071, i9, -1, "com.waze.search.SwipeableDestinationCellListItem (SearchList.kt:269)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(h.c.k.f48060a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) objRememberedValue;
            final com.waze.z.a.al alVarE = com.waze.z.a.aj.e(composerStartRestartGroup);
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(pVar2, composerStartRestartGroup, (i9 >> 12) & 14);
            if (alVarE.b() == com.waze.z.a.ae.f45620b) {
                composerStartRestartGroup.startReplaceGroup(-704813965);
                h.ab abVar = h.ab.f48028a;
                boolean zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState) | (i10 == 256);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new com.waze.main_screen.p.m(i7, stateRememberUpdatedState, 5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                EffectsKt.DisposableEffect(abVar, (h.g.a.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-704631375);
                composerStartRestartGroup.endReplaceGroup();
            }
            Integer numValueOf = Integer.valueOf(i3);
            Integer numValueOf2 = Integer.valueOf(i7);
            boolean z2 = ((i9 & 7168) == 2048) | (i10 == 256);
            boolean zChangedInstance = z2 | composerStartRestartGroup.changedInstance(alVarE) | composerStartRestartGroup.changedInstance(afVar);
            ae aeVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || aeVarRememberedValue == Composer.Companion.getEmpty()) {
                aeVarRememberedValue = new ae(i3, i7, alVarE, afVar, null);
                composerStartRestartGroup.updateRememberedValue(aeVarRememberedValue);
            }
            int i11 = ((i9 >> 9) & 14) | ((i9 >> 3) & 112);
            EffectsKt.LaunchedEffect(numValueOf, numValueOf2, (h.g.a.p) aeVarRememberedValue, composerStartRestartGroup, i11);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(alVarE) | z2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                i7 = i2;
                i6 = i11;
                adVar = new ad(i3, i7, alVarE, (h.c.e) null, 2, (char[]) null);
                composerStartRestartGroup.updateRememberedValue(adVar);
            } else {
                i6 = i11;
                adVar = objRememberedValue3;
                i7 = i2;
            }
            EffectsKt.LaunchedEffect(numValueOf, numValueOf2, (h.g.a.p) adVar, composerStartRestartGroup, i6);
            q(!z, ComposableLambdaKt.rememberComposableLambda(1934774012, true, new h.g.a.q() { // from class: com.waze.search.w
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    h.g.b.x.f((ColumnScope) obj, "$this$CellWithDivider");
                    int i12 = 0;
                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1934774012, iIntValue, -1, "com.waze.search.SwipeableDestinationCellListItem.<anonymous> (SearchList.kt:320)");
                        }
                        int i13 = i7;
                        State state = stateRememberUpdatedState;
                        com.waze.search.e.p pVar3 = pVar;
                        Modifier modifierClipToBounds = ClipKt.clipToBounds(Modifier.Companion);
                        com.waze.z.a.ak akVarB = pVar3.b();
                        boolean zChanged2 = composer2.changed(state) | composer2.changed(i13) | composer2.changedInstance(pVar3);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                            objRememberedValue4 = new com.waze.bl.d.a.h(i13, pVar3, state, 2);
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        com.waze.z.a.aj.b(akVarB, modifierClipToBounds, alVarE, (h.g.a.l) objRememberedValue4, ComposableLambdaKt.rememberComposableLambda(-1344085682, true, new z(pVar3, i12), composer2, 54), composer2, 24624, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return h.ab.f48028a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i12 = i7;
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.search.x
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return ai.h(pVar, z, i12, i3, pVar2, i4, (Composer) obj);
                }
            });
        }
    }

    private static void t(MutableIntState mutableIntState, int i2) {
        mutableIntState.setIntValue(i2);
    }

    private static void u(Composer composer, int i2) {
        Composer composer2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-168182809);
        if (composerStartRestartGroup.shouldExecute(i2 != 0, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-168182809, i2, -1, "com.waze.search.SearchError (SearchEmptyStateContent.kt:231)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            composer2 = composerStartRestartGroup;
            i3 = 1;
            TextKt.m4275Text4IGK_g("Error", BoxScopeInstance.INSTANCE.align(Modifier.Companion, Alignment.Companion.getCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, (TextStyle) null, composer2, 6, 0, 131068);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            i3 = 1;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new n(i2, i3));
        }
    }

    private static void v(Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(474937243);
        int i3 = 0;
        if (composerStartRestartGroup.shouldExecute(i2 != 0, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(474937243, i2, -1, "com.waze.search.SearchLoading (SearchEmptyStateContent.kt:238)");
            }
            Modifier modifierFillMaxHeight = SizeKt.fillMaxHeight(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.33333334f);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight);
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
            ProgressIndicatorKt.m4151CircularProgressIndicatorLxG7B9w(com.waze.ui.r.a.d.d.a(BoxScopeInstance.INSTANCE.align(Modifier.Companion, Alignment.Companion.getCenter()), com.waze.ui.r.a.d.c.V, null), com.waze.bz.a.d(composerStartRestartGroup, 0).E(), 0.0f, 0L, 0, composerStartRestartGroup, 0, 28);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new n(i2, i3));
        }
    }

    public final synchronized SearchNativeManager a() {
        SearchNativeManager searchNativeManager;
        if (SearchNativeManager.sInstance == null) {
            SearchNativeManager.sInstance = new SearchNativeManager(null);
        }
        searchNativeManager = SearchNativeManager.sInstance;
        h.g.b.x.d(searchNativeManager, "null cannot be cast to non-null type com.waze.search.SearchNativeManager");
        return searchNativeManager;
    }

    public /* synthetic */ ai(byte[] bArr, byte[] bArr2) {
    }
}
