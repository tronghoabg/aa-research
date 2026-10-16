package com.waze.main_screen.t;

import android.content.Context;
import android.content.res.Configuration;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.OnPlacedModifierKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.media3.muxer.MuxerUtil;
import com.waze.R;
import com.waze.fa;
import com.waze.map.canvas.bj;
import com.waze.map.el;
import com.waze.sharedrive.e.cc;
import com.waze.sharedrive.g.bf;
import com.waze.strings.DisplayStrings;
import com.waze.ui.l.bh;
import com.waze.ui.l.cg;
import com.waze.z.a.be;
import java.util.Collection;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class al {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f27484a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final h.k.e f27485b = h.k.n.a(0.5d, 0.75d);

    /* renamed from: c, reason: collision with root package name */
    private static final h.k.e f27486c = h.k.n.a(0.4d, 0.6d);

    private static final as A(State state) {
        return (as) state.getValue();
    }

    private static final as B(State state) {
        return (as) state.getValue();
    }

    private static final bj C(State state) {
        return (bj) state.getValue();
    }

    private static final com.waze.br.c.n D(State state) {
        return (com.waze.br.c.n) state.getValue();
    }

    private static final com.waze.br.c.n E(State state) {
        return (com.waze.br.c.n) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.waze.ui.u.t F(State state) {
        return (com.waze.ui.u.t) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h.ab G(com.waze.main_screen.m.p pVar, int i2, Rect rect) {
        pVar.d(new com.waze.main_screen.m.g(rect != null ? i2 - h.h.a.b(rect.getTop()) : 0));
        return h.ab.f48028a;
    }

    private static final void H(am amVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-369337888);
        int i5 = 2;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(amVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-369337888, i3, -1, "com.waze.main_screen.pre_drive.CollapseStartStateSheetOnMapTouch (PreDriveScreen.kt:962)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(h.c.k.f48060a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) objRememberedValue;
            com.waze.ui.p.g gVarS = amVar.s();
            com.waze.main_screen.ab abVarA = amVar.a();
            boolean zChangedInstance = ((i3 & 14) == 4) | composerStartRestartGroup.changedInstance(afVar);
            t tVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || tVarRememberedValue == Composer.Companion.getEmpty()) {
                tVarRememberedValue = new t(amVar, afVar, (h.c.e) null, 1);
                composerStartRestartGroup.updateRememberedValue(tVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(gVarS, abVarA, (h.g.a.p) tVarRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new f(amVar, i2, i5));
        }
    }

    private static final void I(am amVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-946124464);
        int i5 = 1;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(amVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-946124464, i3, -1, "com.waze.main_screen.pre_drive.CollapseStartStateWhenOpeningReportMenu (PreDriveScreen.kt:1016)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(h.c.k.f48060a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) objRememberedValue;
            Boolean boolValueOf = Boolean.valueOf(amVar.m().m());
            boolean zChangedInstance = ((i3 & 14) == 4) | composerStartRestartGroup.changedInstance(afVar);
            ae aeVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || aeVarRememberedValue == Composer.Companion.getEmpty()) {
                aeVarRememberedValue = new ae(amVar, afVar, (h.c.e) null, 1);
                composerStartRestartGroup.updateRememberedValue(aeVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(boolValueOf, afVar, (h.g.a.p) aeVarRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new f(amVar, i2, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void J(final com.waze.main_screen.t.am r17, androidx.compose.ui.Modifier r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.t.al.J(com.waze.main_screen.t.am, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final void K(final am amVar, final boolean z, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1412515349);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(amVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        int i5 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1412515349, i3, -1, "com.waze.main_screen.pre_drive.HandleBackPress (PreDriveScreen.kt:320)");
            }
            final boolean zD = amVar.r().j().d();
            boolean z2 = zD || !z;
            boolean zChanged = ((i3 & 14) == 4) | composerStartRestartGroup.changed(zD);
            boolean z3 = (i3 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChanged | z3) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new h.g.a.a() { // from class: com.waze.main_screen.t.k
                    @Override // h.g.a.a
                    public final Object invoke() {
                        int i6 = al.f27484a;
                        boolean z4 = zD;
                        am amVar2 = amVar;
                        if (z4) {
                            amVar2.r().s();
                        } else if (!z) {
                            amVar2.s().g();
                        }
                        return h.ab.f48028a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.BackHandler(z2, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p(amVar, z, i2, i5));
        }
    }

    private static final void L(am amVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1973311415);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(amVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1973311415, i3, -1, "com.waze.main_screen.pre_drive.HandleGoogleAssistantActions (PreDriveScreen.kt:292)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context) | ((i3 & 14) == 4);
            t tVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || tVarRememberedValue == Composer.Companion.getEmpty()) {
                tVarRememberedValue = new t(amVar, context, (h.c.e) null, 0);
                composerStartRestartGroup.updateRememberedValue(tVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(context, amVar, (h.g.a.p) tVarRememberedValue, composerStartRestartGroup, (i3 << 3) & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new f(amVar, i2, 5));
        }
    }

    private static final void M(Modifier modifier, am amVar, as asVar, boolean z, h.g.a.a aVar, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        Dp dpM11162boximpl;
        int i4;
        float f2;
        int i5;
        float f3;
        boolean z2;
        int i6 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(420729365);
        if (i6 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(amVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(asVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 65536 : 131072;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(420729365, i3, -1, "com.waze.main_screen.pre_drive.LandscapeMainContent (PreDriveScreen.kt:513)");
            }
            Float fH = amVar.a().h(com.waze.z.a.b.ad.f45734b);
            if (fH == null) {
                composerStartRestartGroup.startReplaceGroup(1234301348);
                composerStartRestartGroup.endReplaceGroup();
                dpM11162boximpl = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(594005501);
                float fI = be.I(fH.floatValue(), composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
                dpM11162boximpl = Dp.m11162boximpl(fI);
            }
            float fM11178unboximpl = dpM11162boximpl != null ? ((Dp) h.k.n.o(dpM11162boximpl, Dp.m11162boximpl(0.0f))).m11178unboximpl() : 0.0f;
            int i7 = (i3 >> 3) & 14;
            boolean zW = W(amVar, (bj) SnapshotStateKt.collectAsState(amVar.s().d(), bj.f28601c, null, composerStartRestartGroup, 48, 2).getValue(), composerStartRestartGroup, i7);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i8 = i3;
            bh.c(amVar.r(), zW, ap.a(amVar), boxScopeInstance.align(com.waze.ui.r.a.d.d.a(SizeKt.fillMaxWidth$default(PaddingKt.m2759paddingqDBjuR0$default(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, fM11178unboximpl, 7, null), 0.0f, 0.0f, 0.0f, 16.0f, 7, null), 0.0f, 1, null), com.waze.ui.r.a.d.c.dg, null), Alignment.Companion.getBottomCenter()), composerStartRestartGroup, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            com.waze.main_screen.u.b.a aVarF = amVar.f();
            int i9 = i8 & 458752;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i9 == 131072 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.beacons.a.b(lVar, 12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            com.waze.main_screen.u.b.f.c(aVarF, (h.g.a.l) objRememberedValue, SizeKt.fillMaxWidth$default(boxScopeInstance.align(PaddingKt.m2759paddingqDBjuR0$default(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, fM11178unboximpl, 7, null), 0.0f, 0.0f, 0.0f, 16.0f, 7, null), Alignment.Companion.getBottomStart()), 0.0f, 1, null), composerStartRestartGroup, 0);
            com.waze.main_screen.x.a(amVar.a(), SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), composerStartRestartGroup, 48);
            com.waze.sound.e.j jVarO = amVar.o();
            if (jVarO == null) {
                composerStartRestartGroup.startReplaceGroup(-206158385);
                composerStartRestartGroup.endReplaceGroup();
                i4 = 1;
                f2 = 0.0f;
            } else {
                composerStartRestartGroup.startReplaceGroup(-206158384);
                i4 = 1;
                f2 = 0.0f;
                com.waze.sound.e.h.i(jVarO, ZIndexModifierKt.zIndex(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), 1.0f), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierAlign = boxScopeInstance.align(SizeKt.fillMaxWidth$default(Modifier.Companion, f2, i4, null), Alignment.Companion.getBottomCenter());
            com.waze.main_screen.af.b.i iVarL = amVar.l();
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            int i10 = 9;
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.main_screen.s.a(i10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            com.waze.main_screen.af.b.h.a(iVarL, (h.g.a.l) objRememberedValue2, modifierAlign, composerStartRestartGroup, 48);
            com.waze.reports_v2.presentation.a.an.a(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getCenterStart()), amVar.m(), composerStartRestartGroup, 0);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            com.waze.main_screen.q.b.i iVarC = asVar.c();
            if (iVarC == null) {
                composerStartRestartGroup.startReplaceGroup(1482031732);
                composerStartRestartGroup.endReplaceGroup();
                i5 = 1;
                f3 = 0.0f;
            } else {
                composerStartRestartGroup.startReplaceGroup(1482031733);
                i5 = 1;
                f3 = 0.0f;
                com.waze.main_screen.q.b.b.b(iVarC, z || asVar.d() != null, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), composerStartRestartGroup, 384);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.Companion, f3, i5, null), null, false, 3, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB3 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWrapContentHeight$default);
            h.g.a.a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB3), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            J(amVar, null, composerStartRestartGroup, i7, 2);
            com.waze.notifications.b.a aVarD = asVar.d();
            if (aVarD == null) {
                composerStartRestartGroup.startReplaceGroup(86026582);
                composerStartRestartGroup.endReplaceGroup();
                z2 = false;
            } else {
                composerStartRestartGroup.startReplaceGroup(86026583);
                z2 = false;
                com.waze.notifications.c.k.o(aVarD, null, null, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            com.waze.main_screen.ab.a.f.a(amVar.i(), SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, z2, 3, null), composerStartRestartGroup, 48);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            cc ccVarN = amVar.n();
            if (ccVarN == null) {
                composerStartRestartGroup.startReplaceGroup(-204895600);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-204895599);
                bf.g(ccVarN, aVar, composerStartRestartGroup, (i8 >> 9) & 112);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new m(modifier, amVar, asVar, z, aVar, lVar, i2, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [char[], java.lang.Object, short[]] */
    /* JADX WARN: Type inference failed for: r3v8 */
    private static final void N(final Modifier modifier, final am amVar, final float f2, final float f3, final as asVar, final h.g.a.a aVar, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        boolean z;
        v vVar;
        boolean z2;
        int i4;
        int i5;
        int i6;
        ?? r3;
        ?? r1;
        int i7 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1159659330);
        if (i7 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(amVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(f2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(f3) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changed(asVar) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 65536 : 131072;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            int i8 = i3 & 112;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1159659330, i3, -1, "com.waze.main_screen.pre_drive.LandscapeMapSideContent (PreDriveScreen.kt:452)");
            }
            final int iAbs = Math.abs(WindowInsets_androidKt.getNavigationBars(WindowInsets.Companion, composerStartRestartGroup, 6).getBottom((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())) - WindowInsets_androidKt.getNavigationBars(WindowInsets.Companion, composerStartRestartGroup, 6).getTop((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity()))) + h.h.a.b(be.H(32.0f, composerStartRestartGroup, 6));
            Composer composer3 = composerStartRestartGroup;
            State stateCollectAsState = SnapshotStateKt.collectAsState(amVar.s().d(), bj.f28601c, null, composer3, 48, 2);
            int i9 = i3 >> 6;
            final int iH = (int) be.H(f2, composer3, i9 & 14);
            int iH2 = (int) be.H(f3, composer3, (i3 >> 9) & 14);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifier);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor);
            } else {
                composer3.useNode();
            }
            Updater.m7351setimpl(composer3, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer3, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer3, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer3, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer3, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            com.waze.main_screen.c.an anVarB = amVar.b();
            if (anVarB == null) {
                composer3.startReplaceGroup(995043697);
                composer3.endReplaceGroup();
                i6 = i9;
                i4 = iH2;
                r3 = 0;
                i5 = i8;
                r1 = 1;
                z2 = false;
            } else {
                composer3.startReplaceGroup(995043698);
                com.waze.main_screen.ab abVarA = amVar.a();
                Modifier modifierAlign = boxScopeInstance.align(SizeKt.wrapContentSize$default(Modifier.Companion, null, false, 3, null), Alignment.Companion.getTopEnd());
                Object objRememberedValue = composer3.rememberedValue();
                if (i8 == 32 || objRememberedValue == Composer.Companion.getEmpty()) {
                    z = false;
                    vVar = new v(amVar, 0);
                    composer3.updateRememberedValue(vVar);
                } else {
                    vVar = objRememberedValue;
                    z = false;
                }
                z2 = z;
                i4 = iH2;
                i5 = i8;
                i6 = i9;
                r3 = 0;
                r1 = 1;
                Y(anVarB, abVarA, modifierAlign, iH, (h.g.a.a) vVar, aVar, composer3, i3 & 458752);
                iH = iH;
                composer3 = composer3;
                composer3.endReplaceGroup();
            }
            Modifier modifierAlign2 = boxScopeInstance.align(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, r1, r3), Alignment.Companion.getCenterEnd());
            final int i10 = i4;
            boolean zChanged = composer3.changed(i10) | (i5 == 32 ? r1 : z2) | composer3.changed(iH) | composer3.changed(iAbs);
            Object objRememberedValue2 = composer3.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new h.g.a.l() { // from class: com.waze.main_screen.t.n
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                        int i11 = al.f27484a;
                        h.g.b.x.f(layoutCoordinates, "position");
                        Rect rectBoundsInRoot = LayoutCoordinatesKt.boundsInRoot(layoutCoordinates);
                        com.waze.ui.p.g gVarS = amVar.s();
                        int left = (int) rectBoundsInRoot.getLeft();
                        int right = (int) rectBoundsInRoot.getRight();
                        int i12 = iH;
                        int i13 = iAbs;
                        int i14 = i10;
                        gVarS.b(new com.waze.map.main.aa(i12, i14, 0, left, i14 - right, 0, i13));
                        return h.ab.f48028a;
                    }
                };
                composer3.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierAlign2, (h.g.a.l) objRememberedValue2);
            boolean zX = X(amVar, composer3, (i3 >> 3) & 14);
            v vVarRememberedValue = composer3.rememberedValue();
            if (i5 == 32 || vVarRememberedValue == Composer.Companion.getEmpty()) {
                vVarRememberedValue = new v(amVar, 2, (char[]) r3);
                composer3.updateRememberedValue(vVarRememberedValue);
            }
            h.l.f fVar = (h.l.f) vVarRememberedValue;
            v vVarRememberedValue2 = composer3.rememberedValue();
            if (i5 == 32 || vVarRememberedValue2 == Composer.Companion.getEmpty()) {
                vVarRememberedValue2 = new v(amVar, 3, (short[]) r3);
                composer3.updateRememberedValue(vVarRememberedValue2);
            }
            Composer composer4 = composer3;
            S(modifierOnGloballyPositioned, (bj) stateCollectAsState.getValue(), asVar, amVar, zX, amVar.f().e(), (h.g.a.a) fVar, (h.g.a.a) ((h.l.f) vVarRememberedValue2), null, iH, composer4, (i6 & DisplayStrings.DS_TAP_TO_VERIFY) | ((i3 << 6) & 7168), 256);
            composer2 = composer4;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.main_screen.t.o
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return al.p(modifier, amVar, f2, f3, asVar, aVar, i2, (Composer) obj);
                }
            });
        }
    }

    private static final void O(final am amVar, final h.g.a.a aVar, final h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-288561462);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(amVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-288561462, i3, -1, "com.waze.main_screen.pre_drive.LandscapePreDrive (PreDriveScreen.kt:338)");
            }
            BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.rememberComposableLambda(2058002228, true, new h.g.a.q() { // from class: com.waze.main_screen.t.c
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return al.e(amVar, aVar, lVar, (BoxWithConstraintsScope) obj, (Composer) obj2, iIntValue);
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new g(amVar, aVar, lVar, i2, 0));
        }
    }

    private static final void P(am amVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1574778044);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(amVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i5 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1574778044, i3, -1, "com.waze.main_screen.pre_drive.NotifyInsightAboutMapTap (PreDriveScreen.kt:972)");
            }
            com.waze.ui.p.g gVarS = amVar.s();
            cg cgVarR = amVar.r();
            int i6 = i3 & 14;
            q qVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i6 == 4 || qVarRememberedValue == Composer.Companion.getEmpty()) {
                qVarRememberedValue = new q(amVar, (h.c.e) null, 2, (char[]) null);
                composerStartRestartGroup.updateRememberedValue(qVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(gVarS, cgVarR, (h.g.a.p) qVarRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new f(amVar, i2, i5));
        }
    }

    private static final void Q(am amVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(2088791618);
        int i5 = 4;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(amVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2088791618, i3, -1, "com.waze.main_screen.pre_drive.NotifyStartStateExpandedOverPredictionCardLaunchedEffect (PreDriveScreen.kt:979)");
            }
            com.waze.main_screen.u.b.a aVarF = amVar.f();
            com.waze.main_screen.ab abVarA = amVar.a();
            int i6 = i3 & 14;
            q qVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i6 == 4 || qVarRememberedValue == Composer.Companion.getEmpty()) {
                qVarRememberedValue = new q(amVar, (h.c.e) null, 3, (short[]) null);
                composerStartRestartGroup.updateRememberedValue(qVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(aVarF, abVarA, (h.g.a.p) qVarRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new f(amVar, i2, i5));
        }
    }

    private static final void R(am amVar, final h.g.a.a aVar, final h.g.a.l lVar, Composer composer, int i2) {
        am amVar2;
        int i3;
        ch chVarA;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(2000559566);
        if (i4 == 0) {
            amVar2 = amVar;
            i3 = (true != composerStartRestartGroup.changed(amVar2) ? 2 : 4) | i2;
        } else {
            amVar2 = amVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2000559566, i3, -1, "com.waze.main_screen.pre_drive.PortraitPreDrive (PreDriveScreen.kt:621)");
            }
            final State stateCollectAsState = SnapshotStateKt.collectAsState(amVar2.w(), null, composerStartRestartGroup, 0, 1);
            com.waze.br.c.o oVarF = B(stateCollectAsState).f();
            boolean zChanged = composerStartRestartGroup.changed(oVarF);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (oVarF == null || (chVarA = oVarF.a()) == null) ? kotlinx.coroutines.b.ai.G(null) : chVarA;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final State stateCollectAsState2 = SnapshotStateKt.collectAsState((kotlinx.coroutines.b.k) objRememberedValue, null, null, composerStartRestartGroup, 48, 2);
            final boolean z = (E(stateCollectAsState2) == null || (E(stateCollectAsState2) instanceof com.waze.br.c.i)) ? false : true;
            final State stateCollectAsState3 = SnapshotStateKt.collectAsState(amVar2.s().d(), bj.f28601c, null, composerStartRestartGroup, 48, 2);
            final com.waze.main_screen.m.p pVarD = com.waze.main_screen.l.b.c.d(composerStartRestartGroup);
            com.waze.main_screen.n.c.a(pVarD, amVar2.s(), composerStartRestartGroup, 0);
            final am amVar3 = amVar2;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(1106423844, true, new h.g.a.q() { // from class: com.waze.main_screen.t.e
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return al.f(amVar3, pVarD, lVar, stateCollectAsState, stateCollectAsState2, z, aVar, stateCollectAsState3, (BoxWithConstraintsScope) obj, (Composer) obj2, iIntValue);
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, DisplayStrings.DS_AAOS_SOUND_OFF, 6);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new g(amVar, aVar, lVar, i2, 1));
        }
    }

    private static final void S(Modifier modifier, bj bjVar, final as asVar, am amVar, final boolean z, boolean z2, final h.g.a.a aVar, final h.g.a.a aVar2, h.g.a.l lVar, final int i2, Composer composer, final int i3, final int i4) {
        Modifier.Companion companion;
        int i5;
        int i6;
        Composer composer2;
        bj bjVar2;
        final h.g.a.l lVar2;
        final boolean z3;
        int i7;
        Modifier modifier2;
        int i8;
        boolean z4;
        boolean z5;
        boolean z6;
        h.g.a.l lVar3;
        int i9;
        boolean z7;
        Modifier modifier3;
        final am amVar2 = amVar;
        Composer composerStartRestartGroup = composer.startRestartGroup(1830960480);
        int i10 = i4 & 1;
        if (i10 != 0) {
            i5 = i3 | 6;
            companion = modifier;
        } else if ((i3 & 6) == 0) {
            companion = modifier;
            i5 = (true != composerStartRestartGroup.changed(companion) ? 2 : 4) | i3;
        } else {
            companion = modifier;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != composerStartRestartGroup.changed(bjVar.ordinal()) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i5 |= true != composerStartRestartGroup.changed(asVar) ? 128 : 256;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i5 |= true != composerStartRestartGroup.changed(amVar2) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i5 |= true != composerStartRestartGroup.changed(z) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i5 |= true != composerStartRestartGroup.changed(z2) ? 65536 : 131072;
        }
        if ((1572864 & i3) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(aVar) ? 524288 : 1048576;
        }
        if ((12582912 & i3) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 4194304 : 8388608;
        }
        int i11 = i4 & 256;
        if (i11 != 0) {
            i5 |= 100663296;
        } else if ((i3 & 100663296) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(lVar) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((805306368 & i3) == 0) {
            i6 = i10;
            i5 |= true != composerStartRestartGroup.changed(i2) ? 268435456 : 536870912;
        } else {
            i6 = i10;
        }
        int i12 = i5;
        if (composerStartRestartGroup.shouldExecute((306783379 & i12) != 306783378, i12 & 1)) {
            int i13 = 234881024 & i12;
            int i14 = i12 & 7168;
            if (i6 != 0) {
                companion = Modifier.Companion;
            }
            h.g.a.l lVar4 = i11 != 0 ? null : lVar;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1830960480, i12, -1, "com.waze.main_screen.pre_drive.PreDriveOverMapComponents (PreDriveScreen.kt:1037)");
            }
            h.g.a.l lVar5 = lVar4;
            com.waze.reports_v2.presentation.a.ab abVarB = amVar2.B();
            boolean z8 = ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 2;
            composerStartRestartGroup.startReplaceGroup(-1383553002);
            int iMo2121roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo2121roundToPx0680j_4(((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenWidthDp);
            composerStartRestartGroup.endReplaceGroup();
            State stateCollectAsState = SnapshotStateKt.collectAsState(amVar2.i().f(), null, composerStartRestartGroup, 0, 1);
            g(asVar, composerStartRestartGroup, (i12 >> 6) & 14);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            Modifier modifierAlign = boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getTopEnd());
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m2442spacedByD5KLDUw(8.0f, Alignment.Companion.getCenterVertically()), Alignment.Companion.getEnd(), composerStartRestartGroup, 54);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            com.waze.main_screen.b.a.f fVarA = asVar.a();
            if (fVarA == null) {
                composerStartRestartGroup.startReplaceGroup(848492670);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(848492671);
                com.waze.main_screen.a.a.f.f(fVarA, Modifier.Companion, el.d(bjVar) && !((Boolean) stateCollectAsState.getValue()).booleanValue(), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceGroup();
            }
            com.waze.main_screen.d.a.d dVarB = asVar.b();
            if (dVarB == null || amVar2.b() != null) {
                dVarB = null;
            }
            if (dVarB == null) {
                composerStartRestartGroup.startReplaceGroup(848762959);
            } else {
                composerStartRestartGroup.startReplaceGroup(848762960);
                com.waze.ac.e.e(dVarB, Modifier.Companion, composerStartRestartGroup, 48);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            Modifier modifierM2715offsetVpY3zN4$default = OffsetKt.m2715offsetVpY3zN4$default(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getBottomStart()), 0.0f, 40.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m2442spacedByD5KLDUw(4.0f, Alignment.Companion.getCenterVertically()), Alignment.Companion.getStart(), composerStartRestartGroup, 54);
            int iB3 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2715offsetVpY3zN4$default);
            h.g.a.a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB3), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i15 = 8;
            if (z8) {
                i7 = i13;
                modifier2 = companion;
                i8 = 1;
                composerStartRestartGroup.startReplaceGroup(1972064271);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1971489593);
                if (!asVar.i() || z2) {
                    composerStartRestartGroup.startReplaceGroup(1971639695);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1971547439);
                    Z(aVar, Modifier.Companion, composerStartRestartGroup, ((i12 >> 18) & 14) | 48);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (asVar.l() == null) {
                    composerStartRestartGroup.startReplaceGroup(1971697881);
                    composerStartRestartGroup.endReplaceGroup();
                    i7 = i13;
                    modifier2 = companion;
                    i8 = 1;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1971697882);
                    if (z2) {
                        i7 = i13;
                        modifier2 = companion;
                        i8 = 1;
                        composerStartRestartGroup.startReplaceGroup(1545005253);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1544694850);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (i14 == 2048 || objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = new com.waze.car_lib.a.a(amVar2, 15);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        h.g.a.a aVar3 = (h.g.a.a) objRememberedValue;
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (i14 == 2048 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                            objRememberedValue2 = new com.waze.car_lib.a.a(amVar2, 16);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        h.g.a.a aVar4 = (h.g.a.a) objRememberedValue2;
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (i14 != 2048) {
                            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                            }
                            i7 = i13;
                            modifier2 = companion;
                            i8 = 1;
                            com.waze.ad.c.b.d(aVar3, aVar4, (h.g.a.l) objRememberedValue3, SizeKt.m2808height3ABfNKs(Modifier.Companion, 90.0f), composerStartRestartGroup, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS);
                            composerStartRestartGroup.endReplaceGroup();
                            i14 = i14;
                        } else {
                            i14 = 2048;
                        }
                        objRememberedValue3 = new com.waze.beacons.a.b(amVar2, i15);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        i7 = i13;
                        modifier2 = companion;
                        i8 = 1;
                        com.waze.ad.c.b.d(aVar3, aVar4, (h.g.a.l) objRememberedValue3, SizeKt.m2808height3ABfNKs(Modifier.Companion, 90.0f), composerStartRestartGroup, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS);
                        composerStartRestartGroup.endReplaceGroup();
                        i14 = i14;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            int i16 = i14;
            Modifier modifierM2808height3ABfNKs = SizeKt.m2808height3ABfNKs(Modifier.Companion, 110.0f);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB4 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2808height3ABfNKs);
            h.g.a.a<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
            int i17 = i8;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB4), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            Modifier modifierAlign2 = boxScopeInstance2.align(Modifier.Companion, Alignment.Companion.getTopStart());
            boolean z9 = !el.d(bjVar);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            int i18 = 7;
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new com.waze.main_screen.s.a(i18);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EnterTransition enterTransitionSlideInHorizontally$default = EnterExitTransitionKt.slideInHorizontally$default(null, (h.g.a.l) objRememberedValue4, i17, null);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new com.waze.main_screen.s.a(8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            AnimatedVisibilityKt.AnimatedVisibility(z9, modifierAlign2, enterTransitionSlideInHorizontally$default, EnterExitTransitionKt.slideOutHorizontally$default(null, (h.g.a.l) objRememberedValue5, 1, null), (String) null, ComposableLambdaKt.rememberComposableLambda(779941233, true, new com.waze.o.d.b.b.b(boxScopeInstance2, amVar2, 7, null), composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 16);
            com.waze.bv.s sVarG = asVar.g();
            if (sVarG == null) {
                composerStartRestartGroup.startReplaceGroup(917872826);
                composerStartRestartGroup.endReplaceGroup();
                z4 = z2;
            } else {
                composerStartRestartGroup.startReplaceGroup(917872827);
                Modifier modifierAlign3 = boxScopeInstance2.align(Modifier.Companion, Alignment.Companion.getTopStart());
                if (el.d(bjVar)) {
                    if (!z2) {
                        z4 = false;
                    } else if (z8) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    z5 = true;
                    com.waze.main_screen.i.a.d.e(modifierAlign3, sVarG, z5, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    z4 = z2;
                }
                z5 = false;
                com.waze.main_screen.i.a.d.e(modifierAlign3, sVarG, z5, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            com.waze.main_screen.d.a.d dVarB2 = asVar.b();
            com.waze.main_screen.d.a.d dVar = (dVarB2 == null || amVar2.b() == null || !z8) ? null : dVarB2;
            if (dVar == null) {
                composerStartRestartGroup.startReplaceGroup(676670461);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                int i19 = i12 >> 18;
                composerStartRestartGroup.startReplaceGroup(676670462);
                Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getTopStart()), 16.0f, 0.0f, 0.0f, 0.0f, 14, null);
                com.waze.main_screen.c.an anVarB = amVar2.b();
                com.waze.main_screen.c.d.e.f(dVar, modifierM2759paddingqDBjuR0$default, (anVarB != null ? anVarB.b() : null) != com.waze.main_screen.c.am.f26117c, i2, composerStartRestartGroup, i19 & 7168);
                composerStartRestartGroup.endReplaceGroup();
            }
            Object value = SnapshotStateKt.collectAsState(amVar2.m().h(), null, composerStartRestartGroup, 0, 1).getValue();
            h.o.c cVar = h.o.a.f48264a;
            h.o.d dVar2 = h.o.d.f48272c;
            FiniteAnimationSpec finiteAnimationSpecTween = AnimationSpecKt.tween(DisplayStrings.DS_NIGHT, (int) h.o.a.m(h.o.c.i(DisplayStrings.DS_ROUTE_SETTINGS_AVOID_FERRIES_OPTION_TITLE, dVar2)), new CubicBezierEasing(0.2f, 0.7f, -0.17f, 1.02f));
            boolean zChanged = composerStartRestartGroup.changed(iMo2121roundToPx0680j_4);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = new com.waze.c.e.u(iMo2121roundToPx0680j_4, 6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            EnterTransition enterTransitionSlideInHorizontally = EnterExitTransitionKt.slideInHorizontally(finiteAnimationSpecTween, (h.g.a.l) objRememberedValue6);
            FiniteAnimationSpec finiteAnimationSpecTween2 = AnimationSpecKt.tween(300, (int) h.o.a.m(h.o.c.i(DisplayStrings.DS_ROUTE_SETTINGS_AVOID_FERRIES_OPTION_TITLE, dVar2)), new CubicBezierEasing(0.4f, 0.0f, 1.0f, 0.2f));
            boolean zChanged2 = composerStartRestartGroup.changed(iMo2121roundToPx0680j_4);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                objRememberedValue7 = new com.waze.c.e.u(iMo2121roundToPx0680j_4, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            ExitTransition exitTransitionSlideOutHorizontally = EnterExitTransitionKt.slideOutHorizontally(finiteAnimationSpecTween2, (h.g.a.l) objRememberedValue7);
            Modifier.Companion companion2 = Modifier.Companion;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == Composer.Companion.getEmpty()) {
                objRememberedValue8 = new Ref();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            Ref ref = (Ref) objRememberedValue8;
            ref.setValue(value == null ? ref.getValue() : value);
            AnimatedVisibilityKt.AnimatedVisibility(value != null, companion2, enterTransitionSlideInHorizontally, exitTransitionSlideOutHorizontally, (String) null, ComposableLambdaKt.rememberComposableLambda(-559889238, true, new aa(ref, boxScopeInstance, amVar2), composerStartRestartGroup, 54), composerStartRestartGroup, 196608, 16);
            composer2 = composerStartRestartGroup;
            com.waze.reports_v2.presentation.a.m mVarE = asVar.e();
            if (mVarE == null) {
                composer2.startReplaceGroup(677783082);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(677783083);
                com.waze.reports_v2.presentation.a.k kVarI = com.waze.reports_v2.presentation.a.an.i(mVarE, composer2);
                com.waze.reports_v2.presentation.a.an.h(kVarI, boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getBottomEnd()), composer2, 0);
                h.ab abVar = h.ab.f48028a;
                boolean zChanged3 = composer2.changed(abVarB) | composer2.changed(kVarI);
                t tVarRememberedValue = composer2.rememberedValue();
                if (zChanged3 || tVarRememberedValue == Composer.Companion.getEmpty()) {
                    tVarRememberedValue = new t(abVarB, kVarI, (h.c.e) null, 3);
                    composer2.updateRememberedValue(tVarRememberedValue);
                }
                EffectsKt.LaunchedEffect(abVar, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) tVarRememberedValue, composer2, 6);
                composer2.endReplaceGroup();
            }
            Object[] objArr = {bjVar, Boolean.valueOf(amVar2.m().m()), Boolean.valueOf(z2), Boolean.valueOf(z8)};
            int i20 = i12 & 112;
            boolean zChanged4 = (i20 == 32) | (i16 == 2048) | ((i12 & 458752) == 131072) | composer2.changed(z8) | composer2.changed(abVarB);
            z zVarRememberedValue = composer2.rememberedValue();
            if (zChanged4 || zVarRememberedValue == Composer.Companion.getEmpty()) {
                boolean z10 = z8;
                bjVar2 = bjVar;
                z6 = z2;
                lVar3 = lVar5;
                i9 = 0;
                z zVar = new z(bjVar2, amVar, z6, z10, abVarB, null);
                z7 = z10;
                amVar2 = amVar;
                zVarRememberedValue = zVar;
                composer2.updateRememberedValue(zVarRememberedValue);
            } else {
                bjVar2 = bjVar;
                z6 = z2;
                lVar3 = lVar5;
                z7 = z8;
                i9 = 0;
            }
            EffectsKt.LaunchedEffect(objArr, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) zVarRememberedValue, composer2, i9);
            int i21 = i12 >> 9;
            int i22 = i21 & 14;
            T(amVar2, bjVar2, z6, composer2, (i21 & DisplayStrings.DS_TAP_TO_VERIFY) | i22 | i20);
            if (z) {
                composer2.startReplaceGroup(678728924);
                Modifier modifierAlign4 = boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getBottomCenter());
                Object objRememberedValue9 = composer2.rememberedValue();
                if (i7 == 67108864 || objRememberedValue9 == Composer.Companion.getEmpty()) {
                    objRememberedValue9 = new com.waze.beacons.a.b(lVar3, 7);
                    composer2.updateRememberedValue(objRememberedValue9);
                }
                com.waze.main_screen.af.b.h.b(aVar2, OnPlacedModifierKt.onPlaced(modifierAlign4, (h.g.a.l) objRememberedValue9), composer2, (i12 >> 21) & 14);
                composer2.endReplaceGroup();
                modifier3 = null;
            } else {
                composer2.startReplaceGroup(678959719);
                u uVarRememberedValue = composer2.rememberedValue();
                if (i7 == 67108864 || uVarRememberedValue == Composer.Companion.getEmpty()) {
                    modifier3 = null;
                    uVarRememberedValue = new u(lVar3, (h.c.e) null, 2);
                    composer2.updateRememberedValue(uVarRememberedValue);
                } else {
                    modifier3 = null;
                }
                EffectsKt.LaunchedEffect(lVar3, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) uVarRememberedValue, composer2, (i12 >> 24) & 14);
                composer2.endReplaceGroup();
            }
            if (!z6 || z7) {
                composer2.startReplaceGroup(679121198);
                com.waze.main_screen.i.a.d.c(amVar2.c(), PaddingKt.m2759paddingqDBjuR0$default(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getBottomCenter()), 0.0f, 0.0f, 0.0f, 8.0f, 7, null), composer2, i9);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(679288412);
                composer2.endReplaceGroup();
            }
            Modifier modifierAlign5 = boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getBottomEnd());
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getEnd(), composer2, 48);
            int iB5 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, i9));
            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierAlign5);
            h.g.a.a<ComposeUiNode> constructor5 = ComposeUiNode.Companion.getConstructor();
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor5);
            } else {
                composer2.useNode();
            }
            Updater.m7351setimpl(composer2, measurePolicyColumnMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer2, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer2, Integer.valueOf(iB5), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer2, modifierMaterializeModifier5, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            com.waze.main_screen.ae.a.d dVarK = amVar2.k();
            if (dVarK == null) {
                composer2.startReplaceGroup(-1371635263);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1371635262);
                com.waze.main_screen.ad.a.a.b(modifier3, dVarK, composer2, i9);
                composer2.endReplaceGroup();
            }
            if (abVarB == null) {
                composer2.startReplaceGroup(-1371529708);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1371529707);
                Object objRememberedValue10 = composer2.rememberedValue();
                if (objRememberedValue10 == Composer.Companion.getEmpty()) {
                    objRememberedValue10 = new com.waze.main_screen.c.g.a(13);
                    composer2.updateRememberedValue(objRememberedValue10);
                }
                com.waze.reports_v2.presentation.a.an.g(modifier3, abVarB, (h.g.a.a) objRememberedValue10, composer2, 384);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            composer2.endNode();
            K(amVar2, el.d(bjVar2), composer2, i22);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z3 = z4;
            lVar2 = lVar3;
            companion = modifier2;
        } else {
            composer2 = composerStartRestartGroup;
            bjVar2 = bjVar;
            composer2.skipToGroupEnd();
            lVar2 = lVar;
            z3 = z2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final bj bjVar3 = bjVar2;
            final Modifier modifier4 = companion;
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.main_screen.t.i
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return al.v(modifier4, bjVar3, asVar, amVar2, z, z3, aVar, aVar2, lVar2, i2, i3, i4, (Composer) obj);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void T(final com.waze.main_screen.t.am r17, com.waze.map.canvas.bj r18, final boolean r19, androidx.compose.runtime.Composer r20, final int r21) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.t.al.T(com.waze.main_screen.t.am, com.waze.map.canvas.bj, boolean, androidx.compose.runtime.Composer, int):void");
    }

    private static final void U(am amVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1850046807);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(amVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1850046807, i3, -1, "com.waze.main_screen.pre_drive.ToggleSheetOnPredictionCardCloseLaunchedEffect (PreDriveScreen.kt:1000)");
            }
            boolean zF = ((com.waze.bw.c.d.l) SnapshotStateKt.collectAsState(amVar.a().k(), null, composerStartRestartGroup, 0, 1).getValue()).f();
            State stateCollectAsState = SnapshotStateKt.collectAsState(amVar.f().a(), null, composerStartRestartGroup, 0, 1);
            Boolean boolValueOf = Boolean.valueOf(zF);
            com.waze.ui.u.t tVarF = F(stateCollectAsState);
            boolean zChanged = composerStartRestartGroup.changed(stateCollectAsState) | composerStartRestartGroup.changed(zF);
            boolean z = (i3 & 14) == 4;
            ak akVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChanged | z) || akVarRememberedValue == Composer.Companion.getEmpty()) {
                akVarRememberedValue = new ak(zF, amVar, stateCollectAsState, null);
                composerStartRestartGroup.updateRememberedValue(akVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(boolValueOf, tVarF, (h.g.a.p) akVarRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new f(amVar, i2, 3));
        }
    }

    private static final void V(com.waze.main_screen.ab abVar, com.waze.main_screen.m.p pVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1342652797);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(abVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(pVar) ? 16 : 32;
        }
        int i5 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1342652797, i3, -1, "com.waze.main_screen.pre_drive.UpdateSTSTSheetTopPx (PreDriveScreen.kt:602)");
            }
            boolean z = (i3 & 14) == 4;
            boolean z2 = (i3 & 112) == 32;
            t tVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2) || tVarRememberedValue == Composer.Companion.getEmpty()) {
                tVarRememberedValue = new t(abVar, pVar, (h.c.e) null, 4);
                composerStartRestartGroup.updateRememberedValue(tVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(abVar, pVar, (h.g.a.p) tVarRememberedValue, composerStartRestartGroup, i3 & 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new l(abVar, pVar, i2, i5));
        }
    }

    private static final boolean W(am amVar, bj bjVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1688132966, i2, -1, "com.waze.main_screen.pre_drive.rememberInsightVisibility (PreDriveScreen.kt:1342)");
        }
        com.waze.main_screen.u.b.a aVarF = amVar.f();
        com.waze.main_screen.i.a.e eVarC = amVar.c();
        boolean zChanged = composer.changed(aVarF) | composer.changed(bjVar.ordinal()) | composer.changed(eVarC);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            boolean z = false;
            if (el.d(bjVar) && !amVar.f().e() && !amVar.c().d()) {
                z = true;
            }
            objRememberedValue = Boolean.valueOf(z);
            composer.updateRememberedValue(objRememberedValue);
        }
        boolean zBooleanValue = ((Boolean) objRememberedValue).booleanValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return zBooleanValue;
    }

    private static final boolean X(am amVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(514732547, i2, -1, "com.waze.main_screen.pre_drive.rememberVehicleTypePillVisibility (PreDriveScreen.kt:1347)");
        }
        boolean z = false;
        String str = (String) SnapshotStateKt.collectAsState(amVar.v(), null, composer, 0, 1).getValue();
        boolean zE = amVar.f().e();
        boolean z2 = ((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 2;
        boolean zD = amVar.c().d();
        boolean z3 = amVar.r().z();
        boolean zChanged = composer.changed(str) | composer.changed(zE) | composer.changed(z2) | composer.changed(zD) | composer.changed(z3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            if (str == null && ((!zE || z2) && !zD && !z3)) {
                z = true;
            }
            objRememberedValue = Boolean.valueOf(z);
            composer.updateRememberedValue(objRememberedValue);
        }
        boolean zBooleanValue = ((Boolean) objRememberedValue).booleanValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return zBooleanValue;
    }

    private static final void Y(final com.waze.main_screen.c.an anVar, final com.waze.main_screen.ab abVar, final Modifier modifier, final int i2, final h.g.a.a aVar, final h.g.a.a aVar2, Composer composer, final int i3) {
        com.waze.main_screen.c.an anVar2;
        int i4;
        com.waze.main_screen.ab abVar2;
        int i5;
        MutableIntState mutableIntState;
        int i6 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(823570468);
        if (i6 == 0) {
            anVar2 = anVar;
            i4 = (true != composerStartRestartGroup.changed(anVar2) ? 2 : 4) | i3;
        } else {
            anVar2 = anVar;
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            abVar2 = abVar;
            i4 |= true != composerStartRestartGroup.changed(abVar2) ? 16 : 32;
        } else {
            abVar2 = abVar;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changed(modifier) ? 128 : 256;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i5 = i2;
            i4 |= true != composerStartRestartGroup.changed(i5) ? 1024 : 2048;
        } else {
            i5 = i2;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(aVar) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 65536 : 131072;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i4) != 74898, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(823570468, i4, -1, "com.waze.main_screen.pre_drive.ButtonPackWrapper (PreDriveScreen.kt:1254)");
            }
            final boolean z = ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 2;
            final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableIntState mutableIntState2 = (MutableIntState) objRememberedValue;
            boolean zChanged = composerStartRestartGroup.changed(mutableIntState2.getIntValue()) | ((i4 & 112) == 32) | ((i4 & 7168) == 2048) | composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(z) | composerStartRestartGroup.changed(anVar2.a().ordinal());
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                final com.waze.main_screen.c.an anVar3 = anVar2;
                final com.waze.main_screen.ab abVar3 = abVar2;
                final int i7 = i5;
                mutableIntState = mutableIntState2;
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new h.g.a.a() { // from class: com.waze.main_screen.t.b
                    @Override // h.g.a.a
                    public final Object invoke() {
                        int i8 = al.f27484a;
                        int intValue = 0;
                        if (!z) {
                            com.waze.main_screen.c.j jVarA = anVar3.a();
                            com.waze.z.a.b.ad adVar = com.waze.z.a.b.ad.f45733a;
                            com.waze.main_screen.c.j jVar = com.waze.main_screen.c.j.f26251a;
                            int iOrdinal = jVarA.ordinal();
                            if (iOrdinal == 0) {
                                MutableIntState mutableIntState3 = mutableIntState2;
                                com.waze.main_screen.ab abVar4 = abVar3;
                                int iOrdinal2 = abVar4.d().ordinal();
                                if (iOrdinal2 == 0) {
                                    intValue = (i7 - mutableIntState3.getIntValue()) / 2;
                                } else if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                                    intValue = (int) h.k.n.e((abVar4.a() - mutableIntState3.getIntValue()) / 2.0f, density.getDensity() * 56.0f);
                                } else {
                                    if (iOrdinal2 != 3) {
                                        throw new h.i();
                                    }
                                    intValue = (i7 - mutableIntState3.getIntValue()) / 2;
                                }
                            } else if (iOrdinal != 1) {
                                throw new h.i();
                            }
                        }
                        return Integer.valueOf(intValue);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                mutableIntState = mutableIntState2;
            }
            State state = (State) objRememberedValue2;
            boolean zChanged2 = composerStartRestartGroup.changed(z(state)) | composerStartRestartGroup.changed(z);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            int i8 = 5;
            if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = z ? (Modifier) Modifier.Companion : OffsetKt.offset(OnRemeasuredModifierKt.onSizeChanged(Modifier.Companion, new com.waze.beacons.a.b(mutableIntState, i8)), new com.waze.beacons.a.b(state, 6));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierThen = modifier.then((Modifier) objRememberedValue3);
            boolean z2 = (57344 & i4) == 16384;
            boolean z3 = (458752 & i4) == 131072;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if ((z2 | z3) || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new com.waze.asks.ak(aVar, aVar2, 20);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            h.g.a.l lVar = (h.g.a.l) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new com.waze.main_screen.s.a(4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            h.g.a.l lVar2 = (h.g.a.l) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = new com.waze.main_screen.s.a(i8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            com.waze.main_screen.c.as.b(anVar, modifierThen, lVar, lVar2, (h.g.a.l) objRememberedValue6, composerStartRestartGroup, (i4 & 14) | 27648);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.main_screen.t.d
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return al.i(anVar, abVar, modifier, i2, aVar, aVar2, i3, (Composer) obj);
                }
            });
        }
    }

    private static final void Z(h.g.a.a aVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(438568);
        int i5 = 1;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(438568, i3, -1, "com.waze.main_screen.pre_drive.MapQuickSettings (PreDriveScreen.kt:1324)");
            }
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.map_control_display, composerStartRestartGroup, 0);
            Modifier modifierM2822size3ABfNKs = SizeKt.m2822size3ABfNKs(com.waze.ui.r.a.d.d.a(modifier, com.waze.ui.r.a.d.c.cP, null), 49.0f);
            int i6 = i3 & 14;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i6 == 4 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.car_lib.a.a(aVar, 17);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ImageKt.Image(painterPainterResource, (String) null, be.J(modifierM2822size3ABfNKs, false, null, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 48, 14), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new l(aVar, modifier, i2, i5));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ float a(am amVar, boolean z) {
        if (amVar.m().m() || amVar.m().c() != null) {
            return 0.0f;
        }
        float fB = 1.0f - amVar.a().b();
        h.k.e eVar = z ? f27486c : f27485b;
        double dDoubleValue = ((Number) eVar.getStart()).doubleValue();
        double dDoubleValue2 = ((Number) eVar.getEndInclusive()).doubleValue();
        double d2 = fB;
        if (d2 < dDoubleValue) {
            return 1.0f;
        }
        if (d2 >= dDoubleValue2) {
            return 0.0f;
        }
        return 1.0f - ((float) ((d2 - dDoubleValue) / (dDoubleValue2 - dDoubleValue)));
    }

    public static /* synthetic */ IntOffset b(State state, Density density) {
        h.g.b.x.f(density, "$this$offset");
        return IntOffset.m11287boximpl(z(state) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    static final h.ab e(am amVar, h.g.a.a aVar, h.g.a.l lVar, BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i2) {
        int i3;
        Object objA;
        h.g.b.x.f(boxWithConstraintsScope, "$this$BoxWithConstraints");
        if ((i2 & 6) == 0) {
            i3 = i2 | (true != composer.changed(boxWithConstraintsScope) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2058002228, i3, -1, "com.waze.main_screen.pre_drive.LandscapePreDrive.<anonymous> (PreDriveScreen.kt:341)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(amVar.w(), null, composer, 0, 1);
            com.waze.br.c.o oVarF = A(stateCollectAsState).f();
            boolean zChanged = composer.changed(oVarF);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (oVarF == null || (objA = oVarF.a()) == null) ? kotlinx.coroutines.b.ai.G(null) : (kotlinx.coroutines.b.k) objA;
                composer.updateRememberedValue(objRememberedValue);
            }
            State stateCollectAsState2 = SnapshotStateKt.collectAsState((kotlinx.coroutines.b.k) objRememberedValue, null, null, composer, 48, 2);
            boolean z = (D(stateCollectAsState2) == null || (D(stateCollectAsState2) instanceof com.waze.br.c.i)) ? false : true;
            boolean z2 = !((Collection) SnapshotStateKt.collectAsState(amVar.i().g(), null, composer, 0, 1).getValue()).isEmpty();
            com.waze.sound.e.j jVarG = com.waze.main_screen.r.a.b.g(amVar.e(), composer, 0);
            com.waze.br.c.n nVarD = D(stateCollectAsState2);
            if (true != z) {
                nVarD = null;
            }
            Modifier modifierAlign = boxWithConstraintsScope.align(Modifier.Companion, Alignment.Companion.getBottomCenter());
            Object objRememberedValue2 = composer.rememberedValue();
            int i4 = 6;
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.main_screen.s.a(i4);
                composer.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierAlign, (h.g.a.l) objRememberedValue2);
            EnterTransition enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
            ExitTransition exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new Ref();
                composer.updateRememberedValue(objRememberedValue3);
            }
            Ref ref = (Ref) objRememberedValue3;
            ref.setValue(nVarD == null ? ref.getValue() : nVarD);
            AnimatedVisibilityKt.AnimatedVisibility(nVarD != null, modifierGraphicsLayer, enterTransitionPlus, exitTransitionPlus, (String) null, ComposableLambdaKt.rememberComposableLambda(-559889238, true, new x(ref, 1), composer, 54), composer, 196608, 16);
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
            Color colorM8218boximpl = Color.m8218boximpl(com.waze.bz.a.d(composer, 0).c());
            if (true != jVarG.m()) {
                colorM8218boximpl = null;
            }
            com.waze.main_screen.aa.c.b(colorM8218boximpl, composer, 0);
            com.waze.main_screen.r.a.b.h(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), jVarG, composer, 6);
            float fCalculateStartPadding = PaddingKt.calculateStartPadding(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getSafeContent(WindowInsets.Companion, composer, 6), composer, 0), (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection()));
            float fCalculateEndPadding = PaddingKt.calculateEndPadding(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getSafeContent(WindowInsets.Companion, composer, 6), composer, 0), (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection()));
            float fMo2704calculateBottomPaddingD9Ej5fM = WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getSafeContent(WindowInsets.Companion, composer, 6), composer, 0).mo2704calculateBottomPaddingD9Ej5fM();
            float fCalculateStartPadding2 = PaddingKt.calculateStartPadding(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getNavigationBars(WindowInsets.Companion, composer, 6), composer, 0), (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection()));
            float fCalculateEndPadding2 = PaddingKt.calculateEndPadding(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getNavigationBars(WindowInsets.Companion, composer, 6), composer, 0), (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection()));
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m2440spacedBy0680j_4(16.0f), Alignment.Companion.getTop(), composer, 6);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
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
            Updater.m7351setimpl(composer, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            M(PaddingKt.m2759paddingqDBjuR0$default(ZIndexModifierKt.zIndex(RowScope.CC.weight$default(rowScopeInstance, SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), 1.0f, false, 2, null), 1.0f), (Dp.m11163compareTo0680j_4(fCalculateStartPadding2, 0.0f) > 0 ? 16.0f : 0.0f) + fCalculateStartPadding, 0.0f, 0.0f, 0.0f, 14, null), amVar, A(stateCollectAsState), z2, aVar, lVar, composer, 0);
            N(PaddingKt.m2759paddingqDBjuR0$default(ZIndexModifierKt.zIndex(RowScope.CC.weight$default(rowScopeInstance, SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), 1.0f, false, 2, null), 0.0f), 0.0f, 0.0f, (Dp.m11163compareTo0680j_4(fCalculateEndPadding2, 0.0f) > 0 ? 16.0f : 0.0f) + fCalculateEndPadding, Math.max(fMo2704calculateBottomPaddingD9Ej5fM, 16.0f), 3, null), amVar, boxWithConstraintsScope.mo2468getMaxHeightD9Ej5fM(), boxWithConstraintsScope.mo2469getMaxWidthD9Ej5fM(), A(stateCollectAsState), aVar, composer, 0);
            composer.endNode();
            composer.endNode();
            com.waze.view.popups.b.b.a(amVar.t(), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x08df  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x08f3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0375  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final h.ab f(com.waze.main_screen.t.am r39, final com.waze.main_screen.m.p r40, h.g.a.l r41, androidx.compose.runtime.State r42, androidx.compose.runtime.State r43, boolean r44, h.g.a.a r45, androidx.compose.runtime.State r46, androidx.compose.foundation.layout.BoxWithConstraintsScope r47, androidx.compose.runtime.Composer r48, int r49) {
        /*
            Method dump skipped, instructions count: 2302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.t.al.f(com.waze.main_screen.t.am, com.waze.main_screen.m.p, h.g.a.l, androidx.compose.runtime.State, androidx.compose.runtime.State, boolean, h.g.a.a, androidx.compose.runtime.State, androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):h.ab");
    }

    public static final void g(as asVar, Composer composer, int i2) {
        int i3;
        State stateCollectAsState;
        h.g.b.x.f(asVar, "screenState");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(944914241);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(asVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(944914241, i3, -1, "com.waze.main_screen.pre_drive.InsightFeedbackEndOfDriveDialog (PreDriveScreen.kt:246)");
            }
            com.waze.ao.b.f fVarK = asVar.k();
            byte[] bArr = null;
            ch chVarA = fVarK != null ? fVarK.a() : null;
            if (chVarA == null) {
                composerStartRestartGroup.startReplaceGroup(724698512);
                composerStartRestartGroup.endReplaceGroup();
                stateCollectAsState = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(1824492689);
                stateCollectAsState = SnapshotStateKt.collectAsState(chVarA, null, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.endReplaceGroup();
            }
            com.waze.ao.b.b bVar = stateCollectAsState != null ? (com.waze.ao.b.b) stateCollectAsState.getValue() : null;
            if (bVar == null) {
                composerStartRestartGroup.startReplaceGroup(724799944);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(724799945);
                boolean zChanged = composerStartRestartGroup.changed(fVarK);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = (h.g.a.p) new u(fVarK, (h.c.e) null, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                EffectsKt.LaunchedEffect(bVar, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
                String strD = com.waze.ui.r.a.c.c.d(R.string.INSIGHT_FEEDBACK_GOTO_SETTINGS_TITLE_PS, new Object[]{com.waze.ui.r.a.c.c.b(bVar.b(), composerStartRestartGroup, 0)}, composerStartRestartGroup);
                com.waze.z.a.c.h hVar = new com.waze.z.a.c.h(new com.waze.ui.ac.f(bVar.a()), ContentScale.Companion.getCrop(), null, 28);
                String strB = com.waze.ui.r.a.c.c.b(R.string.INSIGHT_FEEDBACK_GOTO_SETTINGS_GO_BUTTON, composerStartRestartGroup, 0);
                com.waze.design_components.button.g gVar = com.waze.design_components.button.g.f23359b;
                com.waze.z.a.c.a aVar = new com.waze.z.a.c.a(new com.waze.z.a.c.d(strB, com.waze.z.a.b.n.e(gVar, null, null, 6), false, null, 12), new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.INSIGHT_FEEDBACK_GOTO_SETTINGS_NO_BUTTON, composerStartRestartGroup, 0), com.waze.z.a.b.n.e(gVar, null, null, 6), false, null, 12));
                boolean zChanged2 = composerStartRestartGroup.changed(fVarK) | composerStartRestartGroup.changed(bVar);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new com.waze.l.g(fVarK, bVar, 5, bArr);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                com.waze.z.a.c.g gVar2 = (com.waze.z.a.c.g) objRememberedValue2;
                com.waze.z.a.c.a aVar2 = aVar;
                boolean zChanged3 = composerStartRestartGroup.changed(fVarK);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new com.waze.car_lib.a.a(fVarK, 20);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                com.waze.z.a.c.q.c(strD, aVar2, gVar2, (h.g.a.a) objRememberedValue3, hVar, null, composerStartRestartGroup, 0, 32);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fa(asVar, i2, 11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [int] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [char[][], h.c.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14 */
    public static final void h(am amVar, h.g.a.l lVar, h.g.a.l lVar2, h.g.a.a aVar, h.g.a.l lVar3, Composer composer, int i2) {
        int i3;
        Composer composer2;
        com.waze.br.c.o oVar;
        State state;
        boolean z;
        int i4;
        ?? r14;
        LifecycleOwner lifecycleOwner;
        State state2;
        ad adVar;
        ?? r5;
        ae aeVar;
        boolean z2;
        h.g.b.x.f(amVar, "preDriveState");
        h.g.b.x.f(lVar, "openLegacyReportMenu");
        h.g.b.x.f(lVar2, "onNavigationStarted");
        h.g.b.x.f(aVar, "onOpenLiveShareDrive");
        h.g.b.x.f(lVar3, "onSearchMateAction");
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(888357443);
        if (i5 == 0) {
            i3 = (true != composerStartRestartGroup.changed(amVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar3) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(888357443, i3, -1, "com.waze.main_screen.pre_drive.PreDriveScreen (PreDriveScreen.kt:167)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(amVar.v(), null, composerStartRestartGroup, 0, 1);
            int i6 = i3 >> 6;
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar2, composerStartRestartGroup, i6 & 14);
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            com.waze.br.c.o oVarF = ((as) SnapshotStateKt.collectAsState(amVar.w(), null, composerStartRestartGroup, 0, 1).getValue()).f();
            boolean zChanged = composerStartRestartGroup.changed(oVarF) | composerStartRestartGroup.changedInstance(lifecycleOwner2);
            boolean z3 = (i3 & 57344) == 16384;
            ad adVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChanged || z3) || adVarRememberedValue == Composer.Companion.getEmpty()) {
                oVar = oVarF;
                state = stateRememberUpdatedState;
                z = true;
                adVarRememberedValue = new ad(oVar, lifecycleOwner2, lVar3, (h.c.e) null, 1);
                composerStartRestartGroup.updateRememberedValue(adVarRememberedValue);
            } else {
                oVar = oVarF;
                state = stateRememberUpdatedState;
                z = true;
            }
            int i7 = i6 & 112;
            EffectsKt.LaunchedEffect(oVar, lifecycleOwner2, (h.g.a.p) adVarRememberedValue, composerStartRestartGroup, 0);
            int i8 = i3 & 14;
            boolean z4 = i8 == 4 ? z : false;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(lifecycleOwner2) | z4 | composerStartRestartGroup.changed(state);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                i4 = i3;
                r14 = 0;
                lifecycleOwner = lifecycleOwner2;
                composer2 = composerStartRestartGroup;
                state2 = state;
                adVar = new ad(amVar, lifecycleOwner, state2, (h.c.e) null, 0);
                composer2.updateRememberedValue(adVar);
            } else {
                i4 = i3;
                lifecycleOwner = lifecycleOwner2;
                adVar = objRememberedValue;
                composer2 = composerStartRestartGroup;
                r14 = 0;
                state2 = state;
            }
            EffectsKt.LaunchedEffect(amVar, lifecycleOwner, (h.g.a.p) adVar, composer2, i8);
            com.waze.reports_v2.presentation.a.au auVarC = amVar.m().c();
            boolean z5 = (i4 & 112) == 32 ? true : r14;
            Object objRememberedValue2 = composer2.rememberedValue();
            if ((z5 || z4) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                r5 = 0;
                aeVar = new ae(amVar, lVar, (h.c.e) null, (int) r14);
                composer2.updateRememberedValue(aeVar);
            } else {
                aeVar = objRememberedValue2;
                r5 = 0;
            }
            int i9 = i7 | i8;
            EffectsKt.LaunchedEffect(auVarC, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) aeVar, composer2, (int) r14);
            if (((Configuration) composer2.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 2) {
                composer2.startReplaceGroup(-530346482);
                boolean zChanged2 = composer2.changed(state2);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new com.waze.beacons.a.b(state2, 10);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                O(amVar, aVar, (h.g.a.l) objRememberedValue3, composer2, i9);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-530133233);
                boolean zChanged3 = composer2.changed(state2);
                Object objRememberedValue4 = composer2.rememberedValue();
                if (zChanged3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = new com.waze.beacons.a.b(state2, 11);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                R(amVar, aVar, (h.g.a.l) objRememberedValue4, composer2, i9);
                composer2.endReplaceGroup();
            }
            H(amVar, composer2, i8);
            P(amVar, composer2, i8);
            com.waze.sharedui.views.ap.o(amVar.p(), composer2, r14);
            I(amVar, composer2, i8);
            U(amVar, composer2, i8);
            Q(amVar, composer2, i8);
            String str = (String) stateCollectAsState.getValue();
            if (str == null) {
                composer2.startReplaceGroup(-529488558);
                composer2.endReplaceGroup();
                z2 = r14;
            } else {
                composer2.startReplaceGroup(-529488557);
                z2 = r14;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, r5);
                v vVarRememberedValue = composer2.rememberedValue();
                if (i8 == 4 || vVarRememberedValue == Composer.Companion.getEmpty()) {
                    vVarRememberedValue = new v(amVar, 8, (char[][]) r5);
                    composer2.updateRememberedValue(vVarRememberedValue);
                }
                com.waze.settings.h.c.a(modifierFillMaxSize$default, str, (h.g.a.a) vVarRememberedValue, composer2, 6);
                composer2.endReplaceGroup();
            }
            L(amVar, composer2, i8);
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zChangedInstance2 = composer2.changedInstance(lifecycleOwner) | z4;
            ai aiVarRememberedValue = composer2.rememberedValue();
            if (zChangedInstance2 || aiVarRememberedValue == Composer.Companion.getEmpty()) {
                aiVarRememberedValue = new ai(amVar, lifecycleOwner, r5);
                composer2.updateRememberedValue(aiVarRememberedValue);
            }
            if (((Boolean) SnapshotStateKt.produceState(boolValueOf, lifecycleOwner, amVar, (h.g.a.p) aiVarRememberedValue, composer2, ((i4 << 6) & DisplayStrings.DS_TAP_TO_VERIFY) | 6).getValue()).booleanValue()) {
                composer2.startReplaceGroup(-528936509);
                com.waze.parking.q.g(0L, amVar.u(), composer2, z2 ? 1 : 0);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-528848097);
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.z.a.a.b(amVar, lVar, lVar2, aVar, lVar3, i2, 6));
        }
    }

    static final h.ab i(com.waze.main_screen.c.an anVar, com.waze.main_screen.ab abVar, Modifier modifier, int i2, h.g.a.a aVar, h.g.a.a aVar2, int i3, Composer composer) {
        Y(anVar, abVar, modifier, i2, aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return h.ab.f48028a;
    }

    static final h.ab j(am amVar, int i2, Composer composer) {
        H(amVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab k(am amVar, int i2, Composer composer) {
        I(amVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab l(am amVar, Modifier modifier, int i2, int i3, Composer composer) {
        J(amVar, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return h.ab.f48028a;
    }

    static final h.ab m(am amVar, boolean z, int i2, Composer composer) {
        K(amVar, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab n(am amVar, int i2, Composer composer) {
        L(amVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab o(Modifier modifier, am amVar, as asVar, boolean z, h.g.a.a aVar, h.g.a.l lVar, int i2, Composer composer) {
        M(modifier, amVar, asVar, z, aVar, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab p(Modifier modifier, am amVar, float f2, float f3, as asVar, h.g.a.a aVar, int i2, Composer composer) {
        N(modifier, amVar, f2, f3, asVar, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab q(am amVar, h.g.a.a aVar, h.g.a.l lVar, int i2, Composer composer) {
        O(amVar, aVar, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab r(h.g.a.a aVar, Modifier modifier, int i2, Composer composer) {
        Z(aVar, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab s(am amVar, int i2, Composer composer) {
        P(amVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab t(am amVar, int i2, Composer composer) {
        Q(amVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab u(am amVar, h.g.a.a aVar, h.g.a.l lVar, int i2, Composer composer) {
        R(amVar, aVar, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab v(Modifier modifier, bj bjVar, as asVar, am amVar, boolean z, boolean z2, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.l lVar, int i2, int i3, int i4, Composer composer) {
        S(modifier, bjVar, asVar, amVar, z, z2, aVar, aVar2, lVar, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return h.ab.f48028a;
    }

    static final h.ab w(am amVar, bj bjVar, boolean z, int i2, Composer composer) {
        T(amVar, bjVar, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab x(am amVar, int i2, Composer composer) {
        U(amVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab y(com.waze.main_screen.ab abVar, com.waze.main_screen.m.p pVar, int i2, Composer composer) {
        V(abVar, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    private static final int z(State state) {
        return ((Number) state.getValue()).intValue();
    }
}
